/**
 * <copyright>
 * </copyright>
 *

 */
package ooi.bspl.bSPL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ooi.bspl.bSPL.BSPLFactory
 * @model kind="package"
 * @generated
 */
public interface BSPLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "bSPL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bspl.ooi.org/BSPL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "bSPL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BSPLPackage eINSTANCE = ooi.bspl.bSPL.impl.BSPLPackageImpl.init();

  /**
   * The meta object id for the '{@link ooi.bspl.bSPL.impl.BSPLImpl <em>BSPL</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ooi.bspl.bSPL.impl.BSPLImpl
   * @see ooi.bspl.bSPL.impl.BSPLPackageImpl#getBSPL()
   * @generated
   */
  int BSPL = 0;

  /**
   * The feature id for the '<em><b>Junk Protocol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BSPL__JUNK_PROTOCOL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BSPL__NAME = 1;

  /**
   * The feature id for the '<em><b>Junk Role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BSPL__JUNK_ROLE = 2;

  /**
   * The feature id for the '<em><b>Roles</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BSPL__ROLES = 3;

  /**
   * The feature id for the '<em><b>Junk Pub</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BSPL__JUNK_PUB = 4;

  /**
   * The feature id for the '<em><b>Public Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BSPL__PUBLIC_PARAMS = 5;

  /**
   * The feature id for the '<em><b>Junk Priv</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BSPL__JUNK_PRIV = 6;

  /**
   * The feature id for the '<em><b>Private Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BSPL__PRIVATE_PARAMS = 7;

  /**
   * The feature id for the '<em><b>References</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BSPL__REFERENCES = 8;

  /**
   * The number of structural features of the '<em>BSPL</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BSPL_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link ooi.bspl.bSPL.impl.RoleImpl <em>Role</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ooi.bspl.bSPL.impl.RoleImpl
   * @see ooi.bspl.bSPL.impl.BSPLPackageImpl#getRole()
   * @generated
   */
  int ROLE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE__NAME = 0;

  /**
   * The number of structural features of the '<em>Role</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ooi.bspl.bSPL.impl.ParamDeclImpl <em>Param Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ooi.bspl.bSPL.impl.ParamDeclImpl
   * @see ooi.bspl.bSPL.impl.BSPLPackageImpl#getParamDecl()
   * @generated
   */
  int PARAM_DECL = 2;

  /**
   * The feature id for the '<em><b>Adornment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_DECL__ADORNMENT = 0;

  /**
   * The feature id for the '<em><b>Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_DECL__PARAM = 1;

  /**
   * The feature id for the '<em><b>Is Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_DECL__IS_KEY = 2;

  /**
   * The number of structural features of the '<em>Param Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_DECL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link ooi.bspl.bSPL.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ooi.bspl.bSPL.impl.ParameterImpl
   * @see ooi.bspl.bSPL.impl.BSPLPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 0;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link ooi.bspl.bSPL.impl.ParamRefImpl <em>Param Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ooi.bspl.bSPL.impl.ParamRefImpl
   * @see ooi.bspl.bSPL.impl.BSPLPackageImpl#getParamRef()
   * @generated
   */
  int PARAM_REF = 4;

  /**
   * The feature id for the '<em><b>Adornment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_REF__ADORNMENT = 0;

  /**
   * The feature id for the '<em><b>Param</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_REF__PARAM = 1;

  /**
   * The feature id for the '<em><b>Is Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_REF__IS_KEY = 2;

  /**
   * The number of structural features of the '<em>Param Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_REF_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link ooi.bspl.bSPL.impl.MessageImpl <em>Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ooi.bspl.bSPL.impl.MessageImpl
   * @see ooi.bspl.bSPL.impl.BSPLPackageImpl#getMessage()
   * @generated
   */
  int MESSAGE = 5;

  /**
   * The feature id for the '<em><b>Sender</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE__SENDER = 0;

  /**
   * The feature id for the '<em><b>Receiver</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE__RECEIVER = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE__NAME = 2;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE__PARAMS = 3;

  /**
   * The number of structural features of the '<em>Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link ooi.bspl.bSPL.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ooi.bspl.bSPL.impl.ReferenceImpl
   * @see ooi.bspl.bSPL.impl.BSPLPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 6;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__REF = 0;

  /**
   * The feature id for the '<em><b>Roles</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__ROLES = 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__PARAMS = 2;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link ooi.bspl.bSPL.kAdornment <em>kAdornment</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ooi.bspl.bSPL.kAdornment
   * @see ooi.bspl.bSPL.impl.BSPLPackageImpl#getkAdornment()
   * @generated
   */
  int KADORNMENT = 7;

  /**
   * The meta object id for the '{@link ooi.bspl.bSPL.kPROTOCOL <em>kPROTOCOL</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ooi.bspl.bSPL.kPROTOCOL
   * @see ooi.bspl.bSPL.impl.BSPLPackageImpl#getkPROTOCOL()
   * @generated
   */
  int KPROTOCOL = 8;

  /**
   * The meta object id for the '{@link ooi.bspl.bSPL.kROLE <em>kROLE</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ooi.bspl.bSPL.kROLE
   * @see ooi.bspl.bSPL.impl.BSPLPackageImpl#getkROLE()
   * @generated
   */
  int KROLE = 9;

  /**
   * The meta object id for the '{@link ooi.bspl.bSPL.kPARAMETER <em>kPARAMETER</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ooi.bspl.bSPL.kPARAMETER
   * @see ooi.bspl.bSPL.impl.BSPLPackageImpl#getkPARAMETER()
   * @generated
   */
  int KPARAMETER = 10;

  /**
   * The meta object id for the '{@link ooi.bspl.bSPL.kPRIVATE <em>kPRIVATE</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ooi.bspl.bSPL.kPRIVATE
   * @see ooi.bspl.bSPL.impl.BSPLPackageImpl#getkPRIVATE()
   * @generated
   */
  int KPRIVATE = 11;

  /**
   * The meta object id for the '{@link ooi.bspl.bSPL.kKEY <em>kKEY</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see ooi.bspl.bSPL.kKEY
   * @see ooi.bspl.bSPL.impl.BSPLPackageImpl#getkKEY()
   * @generated
   */
  int KKEY = 12;


  /**
   * Returns the meta object for class '{@link ooi.bspl.bSPL.BSPL <em>BSPL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BSPL</em>'.
   * @see ooi.bspl.bSPL.BSPL
   * @generated
   */
  EClass getBSPL();

  /**
   * Returns the meta object for the attribute '{@link ooi.bspl.bSPL.BSPL#isJunkProtocol <em>Junk Protocol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Junk Protocol</em>'.
   * @see ooi.bspl.bSPL.BSPL#isJunkProtocol()
   * @see #getBSPL()
   * @generated
   */
  EAttribute getBSPL_JunkProtocol();

  /**
   * Returns the meta object for the attribute '{@link ooi.bspl.bSPL.BSPL#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ooi.bspl.bSPL.BSPL#getName()
   * @see #getBSPL()
   * @generated
   */
  EAttribute getBSPL_Name();

  /**
   * Returns the meta object for the attribute '{@link ooi.bspl.bSPL.BSPL#isJunkRole <em>Junk Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Junk Role</em>'.
   * @see ooi.bspl.bSPL.BSPL#isJunkRole()
   * @see #getBSPL()
   * @generated
   */
  EAttribute getBSPL_JunkRole();

  /**
   * Returns the meta object for the containment reference list '{@link ooi.bspl.bSPL.BSPL#getRoles <em>Roles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Roles</em>'.
   * @see ooi.bspl.bSPL.BSPL#getRoles()
   * @see #getBSPL()
   * @generated
   */
  EReference getBSPL_Roles();

  /**
   * Returns the meta object for the attribute '{@link ooi.bspl.bSPL.BSPL#isJunkPub <em>Junk Pub</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Junk Pub</em>'.
   * @see ooi.bspl.bSPL.BSPL#isJunkPub()
   * @see #getBSPL()
   * @generated
   */
  EAttribute getBSPL_JunkPub();

  /**
   * Returns the meta object for the containment reference list '{@link ooi.bspl.bSPL.BSPL#getPublicParams <em>Public Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Public Params</em>'.
   * @see ooi.bspl.bSPL.BSPL#getPublicParams()
   * @see #getBSPL()
   * @generated
   */
  EReference getBSPL_PublicParams();

  /**
   * Returns the meta object for the attribute '{@link ooi.bspl.bSPL.BSPL#isJunkPriv <em>Junk Priv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Junk Priv</em>'.
   * @see ooi.bspl.bSPL.BSPL#isJunkPriv()
   * @see #getBSPL()
   * @generated
   */
  EAttribute getBSPL_JunkPriv();

  /**
   * Returns the meta object for the containment reference list '{@link ooi.bspl.bSPL.BSPL#getPrivateParams <em>Private Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Private Params</em>'.
   * @see ooi.bspl.bSPL.BSPL#getPrivateParams()
   * @see #getBSPL()
   * @generated
   */
  EReference getBSPL_PrivateParams();

  /**
   * Returns the meta object for the containment reference list '{@link ooi.bspl.bSPL.BSPL#getReferences <em>References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>References</em>'.
   * @see ooi.bspl.bSPL.BSPL#getReferences()
   * @see #getBSPL()
   * @generated
   */
  EReference getBSPL_References();

  /**
   * Returns the meta object for class '{@link ooi.bspl.bSPL.Role <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Role</em>'.
   * @see ooi.bspl.bSPL.Role
   * @generated
   */
  EClass getRole();

  /**
   * Returns the meta object for the attribute '{@link ooi.bspl.bSPL.Role#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ooi.bspl.bSPL.Role#getName()
   * @see #getRole()
   * @generated
   */
  EAttribute getRole_Name();

  /**
   * Returns the meta object for class '{@link ooi.bspl.bSPL.ParamDecl <em>Param Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param Decl</em>'.
   * @see ooi.bspl.bSPL.ParamDecl
   * @generated
   */
  EClass getParamDecl();

  /**
   * Returns the meta object for the attribute '{@link ooi.bspl.bSPL.ParamDecl#getAdornment <em>Adornment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Adornment</em>'.
   * @see ooi.bspl.bSPL.ParamDecl#getAdornment()
   * @see #getParamDecl()
   * @generated
   */
  EAttribute getParamDecl_Adornment();

  /**
   * Returns the meta object for the containment reference '{@link ooi.bspl.bSPL.ParamDecl#getParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Param</em>'.
   * @see ooi.bspl.bSPL.ParamDecl#getParam()
   * @see #getParamDecl()
   * @generated
   */
  EReference getParamDecl_Param();

  /**
   * Returns the meta object for the attribute '{@link ooi.bspl.bSPL.ParamDecl#isIsKey <em>Is Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Key</em>'.
   * @see ooi.bspl.bSPL.ParamDecl#isIsKey()
   * @see #getParamDecl()
   * @generated
   */
  EAttribute getParamDecl_IsKey();

  /**
   * Returns the meta object for class '{@link ooi.bspl.bSPL.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see ooi.bspl.bSPL.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the attribute '{@link ooi.bspl.bSPL.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ooi.bspl.bSPL.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for class '{@link ooi.bspl.bSPL.ParamRef <em>Param Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Param Ref</em>'.
   * @see ooi.bspl.bSPL.ParamRef
   * @generated
   */
  EClass getParamRef();

  /**
   * Returns the meta object for the attribute '{@link ooi.bspl.bSPL.ParamRef#getAdornment <em>Adornment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Adornment</em>'.
   * @see ooi.bspl.bSPL.ParamRef#getAdornment()
   * @see #getParamRef()
   * @generated
   */
  EAttribute getParamRef_Adornment();

  /**
   * Returns the meta object for the reference '{@link ooi.bspl.bSPL.ParamRef#getParam <em>Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Param</em>'.
   * @see ooi.bspl.bSPL.ParamRef#getParam()
   * @see #getParamRef()
   * @generated
   */
  EReference getParamRef_Param();

  /**
   * Returns the meta object for the attribute '{@link ooi.bspl.bSPL.ParamRef#isIsKey <em>Is Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Key</em>'.
   * @see ooi.bspl.bSPL.ParamRef#isIsKey()
   * @see #getParamRef()
   * @generated
   */
  EAttribute getParamRef_IsKey();

  /**
   * Returns the meta object for class '{@link ooi.bspl.bSPL.Message <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message</em>'.
   * @see ooi.bspl.bSPL.Message
   * @generated
   */
  EClass getMessage();

  /**
   * Returns the meta object for the reference '{@link ooi.bspl.bSPL.Message#getSender <em>Sender</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Sender</em>'.
   * @see ooi.bspl.bSPL.Message#getSender()
   * @see #getMessage()
   * @generated
   */
  EReference getMessage_Sender();

  /**
   * Returns the meta object for the reference '{@link ooi.bspl.bSPL.Message#getReceiver <em>Receiver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Receiver</em>'.
   * @see ooi.bspl.bSPL.Message#getReceiver()
   * @see #getMessage()
   * @generated
   */
  EReference getMessage_Receiver();

  /**
   * Returns the meta object for the attribute '{@link ooi.bspl.bSPL.Message#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see ooi.bspl.bSPL.Message#getName()
   * @see #getMessage()
   * @generated
   */
  EAttribute getMessage_Name();

  /**
   * Returns the meta object for the containment reference list '{@link ooi.bspl.bSPL.Message#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see ooi.bspl.bSPL.Message#getParams()
   * @see #getMessage()
   * @generated
   */
  EReference getMessage_Params();

  /**
   * Returns the meta object for class '{@link ooi.bspl.bSPL.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see ooi.bspl.bSPL.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for the reference '{@link ooi.bspl.bSPL.Reference#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see ooi.bspl.bSPL.Reference#getRef()
   * @see #getReference()
   * @generated
   */
  EReference getReference_Ref();

  /**
   * Returns the meta object for the reference list '{@link ooi.bspl.bSPL.Reference#getRoles <em>Roles</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Roles</em>'.
   * @see ooi.bspl.bSPL.Reference#getRoles()
   * @see #getReference()
   * @generated
   */
  EReference getReference_Roles();

  /**
   * Returns the meta object for the containment reference list '{@link ooi.bspl.bSPL.Reference#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see ooi.bspl.bSPL.Reference#getParams()
   * @see #getReference()
   * @generated
   */
  EReference getReference_Params();

  /**
   * Returns the meta object for enum '{@link ooi.bspl.bSPL.kAdornment <em>kAdornment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>kAdornment</em>'.
   * @see ooi.bspl.bSPL.kAdornment
   * @generated
   */
  EEnum getkAdornment();

  /**
   * Returns the meta object for enum '{@link ooi.bspl.bSPL.kPROTOCOL <em>kPROTOCOL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>kPROTOCOL</em>'.
   * @see ooi.bspl.bSPL.kPROTOCOL
   * @generated
   */
  EEnum getkPROTOCOL();

  /**
   * Returns the meta object for enum '{@link ooi.bspl.bSPL.kROLE <em>kROLE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>kROLE</em>'.
   * @see ooi.bspl.bSPL.kROLE
   * @generated
   */
  EEnum getkROLE();

  /**
   * Returns the meta object for enum '{@link ooi.bspl.bSPL.kPARAMETER <em>kPARAMETER</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>kPARAMETER</em>'.
   * @see ooi.bspl.bSPL.kPARAMETER
   * @generated
   */
  EEnum getkPARAMETER();

  /**
   * Returns the meta object for enum '{@link ooi.bspl.bSPL.kPRIVATE <em>kPRIVATE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>kPRIVATE</em>'.
   * @see ooi.bspl.bSPL.kPRIVATE
   * @generated
   */
  EEnum getkPRIVATE();

  /**
   * Returns the meta object for enum '{@link ooi.bspl.bSPL.kKEY <em>kKEY</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>kKEY</em>'.
   * @see ooi.bspl.bSPL.kKEY
   * @generated
   */
  EEnum getkKEY();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BSPLFactory getBSPLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link ooi.bspl.bSPL.impl.BSPLImpl <em>BSPL</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ooi.bspl.bSPL.impl.BSPLImpl
     * @see ooi.bspl.bSPL.impl.BSPLPackageImpl#getBSPL()
     * @generated
     */
    EClass BSPL = eINSTANCE.getBSPL();

    /**
     * The meta object literal for the '<em><b>Junk Protocol</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BSPL__JUNK_PROTOCOL = eINSTANCE.getBSPL_JunkProtocol();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BSPL__NAME = eINSTANCE.getBSPL_Name();

    /**
     * The meta object literal for the '<em><b>Junk Role</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BSPL__JUNK_ROLE = eINSTANCE.getBSPL_JunkRole();

    /**
     * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BSPL__ROLES = eINSTANCE.getBSPL_Roles();

    /**
     * The meta object literal for the '<em><b>Junk Pub</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BSPL__JUNK_PUB = eINSTANCE.getBSPL_JunkPub();

    /**
     * The meta object literal for the '<em><b>Public Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BSPL__PUBLIC_PARAMS = eINSTANCE.getBSPL_PublicParams();

    /**
     * The meta object literal for the '<em><b>Junk Priv</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BSPL__JUNK_PRIV = eINSTANCE.getBSPL_JunkPriv();

    /**
     * The meta object literal for the '<em><b>Private Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BSPL__PRIVATE_PARAMS = eINSTANCE.getBSPL_PrivateParams();

    /**
     * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BSPL__REFERENCES = eINSTANCE.getBSPL_References();

    /**
     * The meta object literal for the '{@link ooi.bspl.bSPL.impl.RoleImpl <em>Role</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ooi.bspl.bSPL.impl.RoleImpl
     * @see ooi.bspl.bSPL.impl.BSPLPackageImpl#getRole()
     * @generated
     */
    EClass ROLE = eINSTANCE.getRole();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

    /**
     * The meta object literal for the '{@link ooi.bspl.bSPL.impl.ParamDeclImpl <em>Param Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ooi.bspl.bSPL.impl.ParamDeclImpl
     * @see ooi.bspl.bSPL.impl.BSPLPackageImpl#getParamDecl()
     * @generated
     */
    EClass PARAM_DECL = eINSTANCE.getParamDecl();

    /**
     * The meta object literal for the '<em><b>Adornment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM_DECL__ADORNMENT = eINSTANCE.getParamDecl_Adornment();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAM_DECL__PARAM = eINSTANCE.getParamDecl_Param();

    /**
     * The meta object literal for the '<em><b>Is Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM_DECL__IS_KEY = eINSTANCE.getParamDecl_IsKey();

    /**
     * The meta object literal for the '{@link ooi.bspl.bSPL.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ooi.bspl.bSPL.impl.ParameterImpl
     * @see ooi.bspl.bSPL.impl.BSPLPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '{@link ooi.bspl.bSPL.impl.ParamRefImpl <em>Param Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ooi.bspl.bSPL.impl.ParamRefImpl
     * @see ooi.bspl.bSPL.impl.BSPLPackageImpl#getParamRef()
     * @generated
     */
    EClass PARAM_REF = eINSTANCE.getParamRef();

    /**
     * The meta object literal for the '<em><b>Adornment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM_REF__ADORNMENT = eINSTANCE.getParamRef_Adornment();

    /**
     * The meta object literal for the '<em><b>Param</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAM_REF__PARAM = eINSTANCE.getParamRef_Param();

    /**
     * The meta object literal for the '<em><b>Is Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM_REF__IS_KEY = eINSTANCE.getParamRef_IsKey();

    /**
     * The meta object literal for the '{@link ooi.bspl.bSPL.impl.MessageImpl <em>Message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ooi.bspl.bSPL.impl.MessageImpl
     * @see ooi.bspl.bSPL.impl.BSPLPackageImpl#getMessage()
     * @generated
     */
    EClass MESSAGE = eINSTANCE.getMessage();

    /**
     * The meta object literal for the '<em><b>Sender</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE__SENDER = eINSTANCE.getMessage_Sender();

    /**
     * The meta object literal for the '<em><b>Receiver</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE__RECEIVER = eINSTANCE.getMessage_Receiver();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MESSAGE__NAME = eINSTANCE.getMessage_Name();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE__PARAMS = eINSTANCE.getMessage_Params();

    /**
     * The meta object literal for the '{@link ooi.bspl.bSPL.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ooi.bspl.bSPL.impl.ReferenceImpl
     * @see ooi.bspl.bSPL.impl.BSPLPackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__REF = eINSTANCE.getReference_Ref();

    /**
     * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__ROLES = eINSTANCE.getReference_Roles();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__PARAMS = eINSTANCE.getReference_Params();

    /**
     * The meta object literal for the '{@link ooi.bspl.bSPL.kAdornment <em>kAdornment</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ooi.bspl.bSPL.kAdornment
     * @see ooi.bspl.bSPL.impl.BSPLPackageImpl#getkAdornment()
     * @generated
     */
    EEnum KADORNMENT = eINSTANCE.getkAdornment();

    /**
     * The meta object literal for the '{@link ooi.bspl.bSPL.kPROTOCOL <em>kPROTOCOL</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ooi.bspl.bSPL.kPROTOCOL
     * @see ooi.bspl.bSPL.impl.BSPLPackageImpl#getkPROTOCOL()
     * @generated
     */
    EEnum KPROTOCOL = eINSTANCE.getkPROTOCOL();

    /**
     * The meta object literal for the '{@link ooi.bspl.bSPL.kROLE <em>kROLE</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ooi.bspl.bSPL.kROLE
     * @see ooi.bspl.bSPL.impl.BSPLPackageImpl#getkROLE()
     * @generated
     */
    EEnum KROLE = eINSTANCE.getkROLE();

    /**
     * The meta object literal for the '{@link ooi.bspl.bSPL.kPARAMETER <em>kPARAMETER</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ooi.bspl.bSPL.kPARAMETER
     * @see ooi.bspl.bSPL.impl.BSPLPackageImpl#getkPARAMETER()
     * @generated
     */
    EEnum KPARAMETER = eINSTANCE.getkPARAMETER();

    /**
     * The meta object literal for the '{@link ooi.bspl.bSPL.kPRIVATE <em>kPRIVATE</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ooi.bspl.bSPL.kPRIVATE
     * @see ooi.bspl.bSPL.impl.BSPLPackageImpl#getkPRIVATE()
     * @generated
     */
    EEnum KPRIVATE = eINSTANCE.getkPRIVATE();

    /**
     * The meta object literal for the '{@link ooi.bspl.bSPL.kKEY <em>kKEY</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see ooi.bspl.bSPL.kKEY
     * @see ooi.bspl.bSPL.impl.BSPLPackageImpl#getkKEY()
     * @generated
     */
    EEnum KKEY = eINSTANCE.getkKEY();

  }

} //BSPLPackage
