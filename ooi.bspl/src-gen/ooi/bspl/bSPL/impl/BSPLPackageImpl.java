/**
 * <copyright>
 * </copyright>
 *

 */
package ooi.bspl.bSPL.impl;

import ooi.bspl.bSPL.BSPLFactory;
import ooi.bspl.bSPL.BSPLPackage;
import ooi.bspl.bSPL.Message;
import ooi.bspl.bSPL.ParamDecl;
import ooi.bspl.bSPL.ParamRef;
import ooi.bspl.bSPL.Parameter;
import ooi.bspl.bSPL.Reference;
import ooi.bspl.bSPL.Role;
import ooi.bspl.bSPL.kAdornment;
import ooi.bspl.bSPL.kKEY;
import ooi.bspl.bSPL.kPARAMETER;
import ooi.bspl.bSPL.kPRIVATE;
import ooi.bspl.bSPL.kPROTOCOL;
import ooi.bspl.bSPL.kROLE;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BSPLPackageImpl extends EPackageImpl implements BSPLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bsplEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass roleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paramDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass paramRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass messageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum kAdornmentEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum kPROTOCOLEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum kROLEEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum kPARAMETEREEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum kPRIVATEEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum kKEYEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see ooi.bspl.bSPL.BSPLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private BSPLPackageImpl()
  {
    super(eNS_URI, BSPLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link BSPLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static BSPLPackage init()
  {
    if (isInited) return (BSPLPackage)EPackage.Registry.INSTANCE.getEPackage(BSPLPackage.eNS_URI);

    // Obtain or create and register package
    BSPLPackageImpl theBSPLPackage = (BSPLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BSPLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BSPLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theBSPLPackage.createPackageContents();

    // Initialize created meta-data
    theBSPLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theBSPLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(BSPLPackage.eNS_URI, theBSPLPackage);
    return theBSPLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBSPL()
  {
    return bsplEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBSPL_JunkProtocol()
  {
    return (EAttribute)bsplEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBSPL_Name()
  {
    return (EAttribute)bsplEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBSPL_JunkRole()
  {
    return (EAttribute)bsplEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSPL_Roles()
  {
    return (EReference)bsplEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBSPL_JunkPub()
  {
    return (EAttribute)bsplEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSPL_PublicParams()
  {
    return (EReference)bsplEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBSPL_JunkPriv()
  {
    return (EAttribute)bsplEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSPL_PrivateParams()
  {
    return (EReference)bsplEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBSPL_References()
  {
    return (EReference)bsplEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRole()
  {
    return roleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRole_Name()
  {
    return (EAttribute)roleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParamDecl()
  {
    return paramDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParamDecl_Adornment()
  {
    return (EAttribute)paramDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParamDecl_Param()
  {
    return (EReference)paramDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParamDecl_IsKey()
  {
    return (EAttribute)paramDeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Name()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParamRef()
  {
    return paramRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParamRef_Adornment()
  {
    return (EAttribute)paramRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParamRef_Param()
  {
    return (EReference)paramRefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParamRef_IsKey()
  {
    return (EAttribute)paramRefEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMessage()
  {
    return messageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMessage_Sender()
  {
    return (EReference)messageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMessage_Receiver()
  {
    return (EReference)messageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMessage_Name()
  {
    return (EAttribute)messageEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMessage_Params()
  {
    return (EReference)messageEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReference()
  {
    return referenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReference_Ref()
  {
    return (EReference)referenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReference_Roles()
  {
    return (EReference)referenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReference_Params()
  {
    return (EReference)referenceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getkAdornment()
  {
    return kAdornmentEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getkPROTOCOL()
  {
    return kPROTOCOLEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getkROLE()
  {
    return kROLEEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getkPARAMETER()
  {
    return kPARAMETEREEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getkPRIVATE()
  {
    return kPRIVATEEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getkKEY()
  {
    return kKEYEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BSPLFactory getBSPLFactory()
  {
    return (BSPLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    bsplEClass = createEClass(BSPL);
    createEAttribute(bsplEClass, BSPL__JUNK_PROTOCOL);
    createEAttribute(bsplEClass, BSPL__NAME);
    createEAttribute(bsplEClass, BSPL__JUNK_ROLE);
    createEReference(bsplEClass, BSPL__ROLES);
    createEAttribute(bsplEClass, BSPL__JUNK_PUB);
    createEReference(bsplEClass, BSPL__PUBLIC_PARAMS);
    createEAttribute(bsplEClass, BSPL__JUNK_PRIV);
    createEReference(bsplEClass, BSPL__PRIVATE_PARAMS);
    createEReference(bsplEClass, BSPL__REFERENCES);

    roleEClass = createEClass(ROLE);
    createEAttribute(roleEClass, ROLE__NAME);

    paramDeclEClass = createEClass(PARAM_DECL);
    createEAttribute(paramDeclEClass, PARAM_DECL__ADORNMENT);
    createEReference(paramDeclEClass, PARAM_DECL__PARAM);
    createEAttribute(paramDeclEClass, PARAM_DECL__IS_KEY);

    parameterEClass = createEClass(PARAMETER);
    createEAttribute(parameterEClass, PARAMETER__NAME);

    paramRefEClass = createEClass(PARAM_REF);
    createEAttribute(paramRefEClass, PARAM_REF__ADORNMENT);
    createEReference(paramRefEClass, PARAM_REF__PARAM);
    createEAttribute(paramRefEClass, PARAM_REF__IS_KEY);

    messageEClass = createEClass(MESSAGE);
    createEReference(messageEClass, MESSAGE__SENDER);
    createEReference(messageEClass, MESSAGE__RECEIVER);
    createEAttribute(messageEClass, MESSAGE__NAME);
    createEReference(messageEClass, MESSAGE__PARAMS);

    referenceEClass = createEClass(REFERENCE);
    createEReference(referenceEClass, REFERENCE__REF);
    createEReference(referenceEClass, REFERENCE__ROLES);
    createEReference(referenceEClass, REFERENCE__PARAMS);

    // Create enums
    kAdornmentEEnum = createEEnum(KADORNMENT);
    kPROTOCOLEEnum = createEEnum(KPROTOCOL);
    kROLEEEnum = createEEnum(KROLE);
    kPARAMETEREEnum = createEEnum(KPARAMETER);
    kPRIVATEEEnum = createEEnum(KPRIVATE);
    kKEYEEnum = createEEnum(KKEY);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(bsplEClass, ooi.bspl.bSPL.BSPL.class, "BSPL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBSPL_JunkProtocol(), ecorePackage.getEBoolean(), "junkProtocol", null, 0, 1, ooi.bspl.bSPL.BSPL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBSPL_Name(), ecorePackage.getEString(), "name", null, 0, 1, ooi.bspl.bSPL.BSPL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBSPL_JunkRole(), ecorePackage.getEBoolean(), "junkRole", null, 0, 1, ooi.bspl.bSPL.BSPL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSPL_Roles(), this.getRole(), null, "roles", null, 0, -1, ooi.bspl.bSPL.BSPL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBSPL_JunkPub(), ecorePackage.getEBoolean(), "junkPub", null, 0, 1, ooi.bspl.bSPL.BSPL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSPL_PublicParams(), this.getParamDecl(), null, "publicParams", null, 0, -1, ooi.bspl.bSPL.BSPL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBSPL_JunkPriv(), ecorePackage.getEBoolean(), "junkPriv", null, 0, 1, ooi.bspl.bSPL.BSPL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSPL_PrivateParams(), this.getParameter(), null, "privateParams", null, 0, -1, ooi.bspl.bSPL.BSPL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBSPL_References(), ecorePackage.getEObject(), null, "references", null, 0, -1, ooi.bspl.bSPL.BSPL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRole_Name(), ecorePackage.getEString(), "name", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paramDeclEClass, ParamDecl.class, "ParamDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParamDecl_Adornment(), this.getkAdornment(), "adornment", null, 0, 1, ParamDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParamDecl_Param(), this.getParameter(), null, "param", null, 0, 1, ParamDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParamDecl_IsKey(), ecorePackage.getEBoolean(), "isKey", null, 0, 1, ParamDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(paramRefEClass, ParamRef.class, "ParamRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParamRef_Adornment(), this.getkAdornment(), "adornment", null, 0, 1, ParamRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParamRef_Param(), this.getParameter(), null, "param", null, 0, 1, ParamRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParamRef_IsKey(), ecorePackage.getEBoolean(), "isKey", null, 0, 1, ParamRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMessage_Sender(), this.getRole(), null, "sender", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMessage_Receiver(), this.getRole(), null, "receiver", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMessage_Name(), ecorePackage.getEString(), "name", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMessage_Params(), this.getParamRef(), null, "params", null, 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReference_Ref(), this.getBSPL(), null, "ref", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReference_Roles(), this.getRole(), null, "roles", null, 0, -1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getReference_Params(), this.getParamRef(), null, "params", null, 0, -1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(kAdornmentEEnum, kAdornment.class, "kAdornment");
    addEEnumLiteral(kAdornmentEEnum, kAdornment.IN);
    addEEnumLiteral(kAdornmentEEnum, kAdornment.OUT);
    addEEnumLiteral(kAdornmentEEnum, kAdornment.IO);
    addEEnumLiteral(kAdornmentEEnum, kAdornment.NIL);

    initEEnum(kPROTOCOLEEnum, kPROTOCOL.class, "kPROTOCOL");
    addEEnumLiteral(kPROTOCOLEEnum, kPROTOCOL.PROTOCOL);

    initEEnum(kROLEEEnum, kROLE.class, "kROLE");
    addEEnumLiteral(kROLEEEnum, kROLE.ROLE);

    initEEnum(kPARAMETEREEnum, kPARAMETER.class, "kPARAMETER");
    addEEnumLiteral(kPARAMETEREEnum, kPARAMETER.PARAMETER);

    initEEnum(kPRIVATEEEnum, kPRIVATE.class, "kPRIVATE");
    addEEnumLiteral(kPRIVATEEEnum, kPRIVATE.PRIVATE);

    initEEnum(kKEYEEnum, kKEY.class, "kKEY");
    addEEnumLiteral(kKEYEEnum, kKEY.KEY);

    // Create resource
    createResource(eNS_URI);
  }

} //BSPLPackageImpl
