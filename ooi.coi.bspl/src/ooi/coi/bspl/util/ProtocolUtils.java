package ooi.coi.bspl.util;

import java.util.List;

import ooi.coi.bspl.bSPL.Message;
import ooi.coi.bspl.bSPL.ParamRef;
import ooi.coi.bspl.bSPL.Parameter;
import ooi.coi.bspl.bSPL.kAdornment;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.ektimisi.precedence.solver.LexicalConstants;

public class ProtocolUtils {

  // Will later extend this to deal with other References besides Messages
  public static boolean usesParam(EObject aRef, Parameter param, kAdornment adornment) {
    Message aMsg = (Message) aRef;
    EList<ParamRef> paramRefs = aMsg.getParams();
    for (ParamRef paramRef : paramRefs) {
      if ((paramRef.getParam() == param) && (paramRef.getAdornment() == adornment)) return true;
    }
    return false;
  }

  public static EList<Parameter> keyListOfParaminRef(EObject aRef) {
    Message aMsg = (Message) aRef;
    EList<Parameter> keyRefs = new BasicEList<Parameter>();

    EList<ParamRef> paramRefs = aMsg.getParams();
    for (int i = 0; i<paramRefs.size(); i++) {
      ParamRef paramRef = paramRefs.get(i); 
      if (paramRef.isIsKey()) keyRefs.add(paramRef.getParam());
    }
    return keyRefs;
  }

  public static EList<Parameter> selectParametersInRef(EObject aRef, kAdornment adornment) {
    Message aMsg = (Message) aRef;
    EList<Parameter> selectedParameters = new BasicEList<Parameter>();

    EList<ParamRef> paramRefs = aMsg.getParams();
    for (int i = 0; i<paramRefs.size(); i++) {
      ParamRef paramRef = paramRefs.get(i); 
      if (paramRef.getAdornment() == adornment) selectedParameters.add(paramRef.getParam());
    }
    return selectedParameters;
  }

  public static String stringify(List<Object> l) {
    return stringify(l, LexicalConstants.LEFT, LexicalConstants.OR, LexicalConstants.RIGHT);
  }

  public static String stringify(List<Object> l, String lparen, String sep, String rparen) {
    StringBuffer sb = new StringBuffer();
    sb.append(lparen);
    sb.append(l.get(0));
    for (int i=1; i<l.size(); i++)
      sb.append(sep).append(stringify(l.get(i)));
    sb.append(rparen);
    return sb.toString();
  }

  public static String stringify(Object m) {
    if (m instanceof Message)
      return ((Message)m).getName();
    return m.toString();
  }

}
