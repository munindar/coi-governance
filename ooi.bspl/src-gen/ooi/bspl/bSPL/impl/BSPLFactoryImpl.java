/**
 * <copyright>
 * </copyright>
 *

 */
package ooi.bspl.bSPL.impl;

import ooi.bspl.bSPL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BSPLFactoryImpl extends EFactoryImpl implements BSPLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BSPLFactory init()
  {
    try
    {
      BSPLFactory theBSPLFactory = (BSPLFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.bspl.ooi.org/BSPL"); 
      if (theBSPLFactory != null)
      {
        return theBSPLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BSPLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSPLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BSPLPackage.BSPL: return createBSPL();
      case BSPLPackage.ROLE: return createRole();
      case BSPLPackage.PARAM_DECL: return createParamDecl();
      case BSPLPackage.PARAMETER: return createParameter();
      case BSPLPackage.PARAM_REF: return createParamRef();
      case BSPLPackage.MESSAGE: return createMessage();
      case BSPLPackage.REFERENCE: return createReference();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case BSPLPackage.KADORNMENT:
        return createkAdornmentFromString(eDataType, initialValue);
      case BSPLPackage.KPROTOCOL:
        return createkPROTOCOLFromString(eDataType, initialValue);
      case BSPLPackage.KROLE:
        return createkROLEFromString(eDataType, initialValue);
      case BSPLPackage.KPARAMETER:
        return createkPARAMETERFromString(eDataType, initialValue);
      case BSPLPackage.KPRIVATE:
        return createkPRIVATEFromString(eDataType, initialValue);
      case BSPLPackage.KKEY:
        return createkKEYFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case BSPLPackage.KADORNMENT:
        return convertkAdornmentToString(eDataType, instanceValue);
      case BSPLPackage.KPROTOCOL:
        return convertkPROTOCOLToString(eDataType, instanceValue);
      case BSPLPackage.KROLE:
        return convertkROLEToString(eDataType, instanceValue);
      case BSPLPackage.KPARAMETER:
        return convertkPARAMETERToString(eDataType, instanceValue);
      case BSPLPackage.KPRIVATE:
        return convertkPRIVATEToString(eDataType, instanceValue);
      case BSPLPackage.KKEY:
        return convertkKEYToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSPL createBSPL()
  {
    BSPLImpl bspl = new BSPLImpl();
    return bspl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role createRole()
  {
    RoleImpl role = new RoleImpl();
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParamDecl createParamDecl()
  {
    ParamDeclImpl paramDecl = new ParamDeclImpl();
    return paramDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParamRef createParamRef()
  {
    ParamRefImpl paramRef = new ParamRefImpl();
    return paramRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Message createMessage()
  {
    MessageImpl message = new MessageImpl();
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference createReference()
  {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public kAdornment createkAdornmentFromString(EDataType eDataType, String initialValue)
  {
    kAdornment result = kAdornment.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertkAdornmentToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public kPROTOCOL createkPROTOCOLFromString(EDataType eDataType, String initialValue)
  {
    kPROTOCOL result = kPROTOCOL.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertkPROTOCOLToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public kROLE createkROLEFromString(EDataType eDataType, String initialValue)
  {
    kROLE result = kROLE.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertkROLEToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public kPARAMETER createkPARAMETERFromString(EDataType eDataType, String initialValue)
  {
    kPARAMETER result = kPARAMETER.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertkPARAMETERToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public kPRIVATE createkPRIVATEFromString(EDataType eDataType, String initialValue)
  {
    kPRIVATE result = kPRIVATE.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertkPRIVATEToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public kKEY createkKEYFromString(EDataType eDataType, String initialValue)
  {
    kKEY result = kKEY.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertkKEYToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSPLPackage getBSPLPackage()
  {
    return (BSPLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BSPLPackage getPackage()
  {
    return BSPLPackage.eINSTANCE;
  }

} //BSPLFactoryImpl
