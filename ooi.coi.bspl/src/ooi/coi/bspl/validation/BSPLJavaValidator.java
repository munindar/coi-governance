package ooi.coi.bspl.validation;

import ooi.coi.bspl.bSPL.BSPL;
import ooi.coi.bspl.bSPL.BSPLPackage;
import ooi.coi.bspl.bSPL.Message;
import ooi.coi.bspl.bSPL.ParamDecl;
import ooi.coi.bspl.bSPL.ParamRef;
import ooi.coi.bspl.bSPL.Parameter;
import ooi.coi.bspl.bSPL.Role;
import ooi.coi.bspl.bSPL.kAdornment;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
 

public class BSPLJavaValidator extends AbstractBSPLJavaValidator {

//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.Literals.GREETING__NAME);
//		}
//	}

    public static final String INVALID_ROLE_NAME = "ooi.bspl.BSPL.InvalidRoleName";
    @Check(CheckType.FAST)
    public void checkRoleName(Role type) {
        if (!Character.isUpperCase(type.getName().charAt(0))) {
            warning("Role name should begin with an uppercase letter", 
            		BSPLPackage.Literals.ROLE__NAME, 
            		INVALID_ROLE_NAME, 
            		type.getName());
        }
    }

    public static final String INVALID_PARAMETER_NAME = "ooi.bspl.BSPL.InvalidParameterName";
    @Check(CheckType.FAST)
    public void checkParameterName(Parameter parameter) {
    	String pName = parameter.getName();
        if (!Character.isLowerCase(pName.charAt(0))
        		&& !Character.isUpperCase(pName.charAt(pName.length()-1))) {
            warning("Parameter name should begin with a lowercase letter or end with an uppercase letter", 
            		BSPLPackage.Literals.PARAMETER__NAME, 
            		INVALID_PARAMETER_NAME, parameter.getName());
        }
    }
    
    public static final String INVALID_PARAMDECL_OUT = "ooi.bspl.BSPL.InvalidParamDeclOut";
    @Check(CheckType.FAST)
    public void checkParameDeclOut(ParamDecl pDecl) {
    	if (pDecl.getAdornment() == kAdornment.OUT) {
    		BSPL theProtocol = (BSPL) pDecl.eContainer();
    		EList<EObject> allRefs = theProtocol.getReferences();
    		for (EObject aRef : allRefs) {
    			if (usesParam(aRef, pDecl.getParam(), kAdornment.OUT))
    				return;
    		}    		
    		warning("An OUT parameter must match with at least one reference with OUT in it", 
            		BSPLPackage.Literals.PARAM_DECL__PARAM, 
            		INVALID_PARAMDECL_OUT, pDecl.getParam().getName());
        }
    }
    
    public static final String INVALID_PARAMDECL_IN = "ooi.bspl.BSPL.InvalidParamDeclIn";
    @Check(CheckType.FAST)
    public void checkParameDeclIn(ParamDecl pDecl) {
    	if (pDecl.getAdornment() == kAdornment.IN) {
    		BSPL theProtocol = (BSPL) pDecl.eContainer();
    		EList<EObject> allRefs = theProtocol.getReferences();
    		for (EObject aRef : allRefs) {
    			if (usesParam(aRef, pDecl.getParam(), kAdornment.OUT) ||
    					usesParam(aRef, pDecl.getParam(), kAdornment.NIL))
    	    		warning("An IN parameter must be IN throughout", 
    	            		BSPLPackage.Literals.PARAM_DECL__PARAM, 
    	            		INVALID_PARAMDECL_OUT, pDecl.getParam().getName());
    				return;
    		} 	
        }
    }
    
    private boolean usesParam(EObject aRef, Parameter param, kAdornment adornment) {
    	Message aMsg = (Message) aRef;
    	EList<ParamRef> paramRefs = aMsg.getParams();
    	for (ParamRef paramRef : paramRefs) {
    		if ((paramRef.getParam() == param) && (paramRef.getAdornment() == adornment))
    			return true;
    	}
    	return false;
    }

}
