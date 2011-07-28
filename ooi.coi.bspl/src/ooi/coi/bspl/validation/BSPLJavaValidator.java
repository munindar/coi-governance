package ooi.coi.bspl.validation;

import ooi.coi.bspl.bSPL.BSPL;
import ooi.coi.bspl.bSPL.BSPLPackage;
import ooi.coi.bspl.bSPL.Message;
import ooi.coi.bspl.bSPL.ParamDecl;
import ooi.coi.bspl.bSPL.ParamRef;
import ooi.coi.bspl.bSPL.Parameter;
import ooi.coi.bspl.bSPL.Role;
import ooi.coi.bspl.bSPL.kAdornment;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.validation.ComposedChecks;

// Inserting the @ComposedChecks below to override the definition in AbstractBSPLJavaValidator 
@ComposedChecks(validators = { org.eclipse.xtext.validation.ImportUriValidator.class,
// COMMENTING NEXT LINE
//    org.eclipse.xtext.validation.NamesAreUniqueValidator.class
    })
public class BSPLJavaValidator extends AbstractBSPLJavaValidator {

  private static Logger logger = Logger.getLogger(BSPLJavaValidator.class);
  static {
    logger.setLevel(Level.INFO); // ALL < DEBUG < INFO < WARN < ERROR < FATAL < OFF
  }
  
  public static final String INVALID_ROLE_NAME = "ooi.bspl.BSPL.InvalidRoleName";
  public static final String INVALID_PARAMETER_NAME = "ooi.bspl.BSPL.InvalidParameterName";
  public static final String INVALID_PARAMDECL_OUT = "ooi.bspl.BSPL.InvalidParamDeclOut";
  public static final String INVALID_PARAMDECL_IN = "ooi.bspl.BSPL.InvalidParamDeclIn";
  public static final String OUT_OUT_RISK = "ooi.bspl.BSPL.OutOutParamConflict";
  public static final String OUT_IN_KEY_ANOMALY = "ooi.bspl.BSPL.OutInKeyAnomaly";
  
  private static final String MSG_ROLE_NAME_LEXICAL = "Role name should begin with an uppercase letter";
  private static final String MSG_PARAMETER_NAME_LEXICAL = "Parameter name should begin with a lowercase letter or end with an uppercase letter";
  private static final String MSG_OUT_REFERENCE = "An OUT parameter must match at least one reference with OUT in it";
  private static final String MSG_IN_REFERENCE = "An IN parameter must be IN throughout";
  private static final String MSG_OUT_OUT_CONFLICT = "An OUT parameter occurs in two or more references (legal but check)";
  private static final String MSG_OUT_IN_KEY_CONFLICT = "An IN parameter occurs with a smaller key than in its OUT occurrence";


  @Check(CheckType.FAST)
  public void checkRoleName(Role role) {
    String rName = role.getName();
    if (!Character.isUpperCase(rName.charAt(0))) {
      this.error("["+rName+"] "+BSPLJavaValidator.MSG_ROLE_NAME_LEXICAL, BSPLPackage.Literals.ROLE__NAME,
          BSPLJavaValidator.INVALID_ROLE_NAME, role.getName());
    }
  }


  @Check(CheckType.FAST)
  public void checkParameterName(Parameter parameter) {
    String pName = parameter.getName();
    if (!Character.isLowerCase(pName.charAt(0)) && !Character.isUpperCase(pName.charAt(pName.length() - 1))) {
      this.error("["+pName+"] "+BSPLJavaValidator.MSG_PARAMETER_NAME_LEXICAL,
          BSPLPackage.Literals.PARAMETER__NAME, BSPLJavaValidator.INVALID_PARAMETER_NAME, parameter.getName());
    }
  }


  @Check(CheckType.FAST)
  public void checkParamDeclOut(ParamDecl pDecl) {
    if (pDecl.getAdornment() == kAdornment.OUT) {
      BSPL theProtocol = (BSPL) pDecl.eContainer();
      EList<EObject> allRefs = theProtocol.getReferences();
      for (EObject aRef : allRefs) {
        if (this.usesParam(aRef, pDecl.getParam(), kAdornment.OUT)) return;
      }
      this.error("["+pDecl.getParam().getName()+"] "+ BSPLJavaValidator.MSG_OUT_REFERENCE,
          BSPLPackage.Literals.PARAM_DECL__PARAM, BSPLJavaValidator.INVALID_PARAMDECL_OUT, pDecl.getParam().getName());
    }
  }


  @Check(CheckType.FAST)
  public void checkParamDeclIn(ParamDecl pDecl) {
    if (pDecl.getAdornment() == kAdornment.IN) {
      BSPL theProtocol = (BSPL) pDecl.eContainer();
      EList<EObject> allRefs = theProtocol.getReferences();
      for (EObject aRef : allRefs) {
        if (this.usesParam(aRef, pDecl.getParam(), kAdornment.OUT)
            || this.usesParam(aRef, pDecl.getParam(), kAdornment.NIL)) {
          this.error("["+pDecl.getParam().getName()+"] "+ BSPLJavaValidator.MSG_IN_REFERENCE, BSPLPackage.Literals.PARAM_DECL__PARAM,
              BSPLJavaValidator.INVALID_PARAMDECL_OUT, pDecl.getParam().getName());
        }
        //return;
      }
    }
  }

  // Will later extend this to deal with other References besides Messages
  private boolean usesParam(EObject aRef, Parameter param, kAdornment adornment) {
    Message aMsg = (Message) aRef;
    EList<ParamRef> paramRefs = aMsg.getParams();
    for (ParamRef paramRef : paramRefs) {
      if ((paramRef.getParam() == param) && (paramRef.getAdornment() == adornment)) return true;
    }
    return false;
  }

  private EList<Parameter> keyListOfParaminRef(EObject aRef) {
    Message aMsg = (Message) aRef;
    EList<Parameter> keyRefs = new BasicEList<Parameter>();

    EList<ParamRef> paramRefs = aMsg.getParams();
    for (int i = 0; i<paramRefs.size(); i++) {
      ParamRef paramRef = paramRefs.get(i); 
      if (paramRef.isIsKey()) keyRefs.add(paramRef.getParam());
    }
    return keyRefs;
  }
  
/* To handle the key constraints on parameter */
  @Check(CheckType.FAST)
  public void checkParamKeys(ParamDecl pDecl) {
    BSPL theProtocol = (BSPL) pDecl.eContainer();
    EList<EObject> allRefs = theProtocol.getReferences();
    EList<ParamDecl> allParams = theProtocol.getPublicParams();
    BSPLJavaValidator.logger.debug("allRefs= " + stringify(allRefs) + " allParams= " + allParams);
    
    if ((pDecl.getAdornment() == kAdornment.OUT) && (!pDecl.isIsKey())) {
      Parameter param = pDecl.getParam();
      for (EObject outRef : allRefs) {
        BSPLJavaValidator.logger.debug("param= " + param + "; outRef= " + stringify((Message)outRef));
        if (this.usesParam(outRef, param, kAdornment.OUT)) {
          EList<Parameter> outRefKeyList = keyListOfParaminRef(outRef);
          
          for (EObject aRef : allRefs) {
            if (aRef != outRef) {
              if (this.usesParam(aRef, param, kAdornment.OUT)) {
                BSPLJavaValidator.logger.info("Found OUT. " + "aRef= " + stringify((Message)aRef) + "; outRef= " + stringify((Message)outRef));
                this.info("["+param.getName()+"] "+ BSPLJavaValidator.MSG_OUT_OUT_CONFLICT, BSPLPackage.Literals.PARAM_DECL__PARAM,
                    BSPLJavaValidator.OUT_OUT_RISK, param.getName());
              }
              else if (this.usesParam(aRef, param, kAdornment.IN)) {
                EList<Parameter> aRefKeyList = keyListOfParaminRef(aRef);
                if (!aRefKeyList.containsAll(outRefKeyList)) {
                  BSPLJavaValidator.logger.info("Found aRefKeyList.size()=" + aRefKeyList.size() + "; outRefKeyList.size()= " + outRefKeyList.size());
                  BSPLJavaValidator.logger.info("Found aRefKeyList.get(0)=" + aRefKeyList.get(0) + "; outRefKeyList.get(0)= " + outRefKeyList.get(0));
                  this.error("["+param.getName()+"] "+ BSPLJavaValidator.MSG_OUT_IN_KEY_CONFLICT, BSPLPackage.Literals.PARAM_DECL__PARAM,
                      BSPLJavaValidator.OUT_IN_KEY_ANOMALY, param.getName());
                }
              }
            }
          }
        }
      }
    }
  }

  private String stringify(EList<EObject> l) {
    StringBuffer sb = new StringBuffer();
    sb.append("[[");
    sb.append(l.get(0));
    for (int i=1; i<l.size(); i++)
      sb.append(", ").append(stringify(l.get(i)));
    sb.append("]]");
    return sb.toString();
  }

  private String stringify(EObject m) {
    if (m instanceof Message)
      return ((Message)m).getName();
    return m.toString();
  }


}
