package ooi.bspl.validation;

import java.util.Iterator;

import ooi.bspl.bSPL.BSPL;
import ooi.bspl.bSPL.BSPLPackage;
import ooi.bspl.bSPL.Message;
import ooi.bspl.bSPL.ParamDecl;
import ooi.bspl.bSPL.ParamRef;
import ooi.bspl.bSPL.Parameter;
import ooi.bspl.bSPL.Reference;
import ooi.bspl.bSPL.Role;
import ooi.bspl.bSPL.kAdornment;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;

//@Check(CheckType.EXPENSIVE)
//@Check(CheckType.NORMAL)

public class BSPLJavaValidator extends AbstractBSPLJavaValidator {

    public static final String INVALID_ROLE_NAME = "ooi.bspl.BSPL.InvalidRoleName";
    @Check(CheckType.FAST)
    public void checkRoleName(Role type) {
        if (!Character.isUpperCase(type.getName().charAt(0))) {
            warning("Role name should begin with an uppercase letter", 
            		BSPLPackage.ROLE__NAME, 
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
            		BSPLPackage.PARAMETER__NAME, 
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
            		BSPLPackage.PARAM_DECL, 
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
    	            		BSPLPackage.PARAM_DECL, 
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
