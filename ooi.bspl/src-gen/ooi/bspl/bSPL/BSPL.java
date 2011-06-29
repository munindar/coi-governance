/**
 * <copyright>
 * </copyright>
 *

 */
package ooi.bspl.bSPL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BSPL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ooi.bspl.bSPL.BSPL#isJunkProtocol <em>Junk Protocol</em>}</li>
 *   <li>{@link ooi.bspl.bSPL.BSPL#getName <em>Name</em>}</li>
 *   <li>{@link ooi.bspl.bSPL.BSPL#isJunkRole <em>Junk Role</em>}</li>
 *   <li>{@link ooi.bspl.bSPL.BSPL#getRoles <em>Roles</em>}</li>
 *   <li>{@link ooi.bspl.bSPL.BSPL#isJunkPub <em>Junk Pub</em>}</li>
 *   <li>{@link ooi.bspl.bSPL.BSPL#getPublicParams <em>Public Params</em>}</li>
 *   <li>{@link ooi.bspl.bSPL.BSPL#isJunkPriv <em>Junk Priv</em>}</li>
 *   <li>{@link ooi.bspl.bSPL.BSPL#getPrivateParams <em>Private Params</em>}</li>
 *   <li>{@link ooi.bspl.bSPL.BSPL#getReferences <em>References</em>}</li>
 * </ul>
 * </p>
 *
 * @see ooi.bspl.bSPL.BSPLPackage#getBSPL()
 * @model
 * @generated
 */
public interface BSPL extends EObject
{
  /**
   * Returns the value of the '<em><b>Junk Protocol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Junk Protocol</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Junk Protocol</em>' attribute.
   * @see #setJunkProtocol(boolean)
   * @see ooi.bspl.bSPL.BSPLPackage#getBSPL_JunkProtocol()
   * @model
   * @generated
   */
  boolean isJunkProtocol();

  /**
   * Sets the value of the '{@link ooi.bspl.bSPL.BSPL#isJunkProtocol <em>Junk Protocol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Junk Protocol</em>' attribute.
   * @see #isJunkProtocol()
   * @generated
   */
  void setJunkProtocol(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ooi.bspl.bSPL.BSPLPackage#getBSPL_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ooi.bspl.bSPL.BSPL#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Junk Role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Junk Role</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Junk Role</em>' attribute.
   * @see #setJunkRole(boolean)
   * @see ooi.bspl.bSPL.BSPLPackage#getBSPL_JunkRole()
   * @model
   * @generated
   */
  boolean isJunkRole();

  /**
   * Sets the value of the '{@link ooi.bspl.bSPL.BSPL#isJunkRole <em>Junk Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Junk Role</em>' attribute.
   * @see #isJunkRole()
   * @generated
   */
  void setJunkRole(boolean value);

  /**
   * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
   * The list contents are of type {@link ooi.bspl.bSPL.Role}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Roles</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Roles</em>' containment reference list.
   * @see ooi.bspl.bSPL.BSPLPackage#getBSPL_Roles()
   * @model containment="true"
   * @generated
   */
  EList<Role> getRoles();

  /**
   * Returns the value of the '<em><b>Junk Pub</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Junk Pub</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Junk Pub</em>' attribute.
   * @see #setJunkPub(boolean)
   * @see ooi.bspl.bSPL.BSPLPackage#getBSPL_JunkPub()
   * @model
   * @generated
   */
  boolean isJunkPub();

  /**
   * Sets the value of the '{@link ooi.bspl.bSPL.BSPL#isJunkPub <em>Junk Pub</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Junk Pub</em>' attribute.
   * @see #isJunkPub()
   * @generated
   */
  void setJunkPub(boolean value);

  /**
   * Returns the value of the '<em><b>Public Params</b></em>' containment reference list.
   * The list contents are of type {@link ooi.bspl.bSPL.ParamDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Public Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Public Params</em>' containment reference list.
   * @see ooi.bspl.bSPL.BSPLPackage#getBSPL_PublicParams()
   * @model containment="true"
   * @generated
   */
  EList<ParamDecl> getPublicParams();

  /**
   * Returns the value of the '<em><b>Junk Priv</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Junk Priv</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Junk Priv</em>' attribute.
   * @see #setJunkPriv(boolean)
   * @see ooi.bspl.bSPL.BSPLPackage#getBSPL_JunkPriv()
   * @model
   * @generated
   */
  boolean isJunkPriv();

  /**
   * Sets the value of the '{@link ooi.bspl.bSPL.BSPL#isJunkPriv <em>Junk Priv</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Junk Priv</em>' attribute.
   * @see #isJunkPriv()
   * @generated
   */
  void setJunkPriv(boolean value);

  /**
   * Returns the value of the '<em><b>Private Params</b></em>' containment reference list.
   * The list contents are of type {@link ooi.bspl.bSPL.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Private Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Private Params</em>' containment reference list.
   * @see ooi.bspl.bSPL.BSPLPackage#getBSPL_PrivateParams()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getPrivateParams();

  /**
   * Returns the value of the '<em><b>References</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>References</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>References</em>' containment reference list.
   * @see ooi.bspl.bSPL.BSPLPackage#getBSPL_References()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getReferences();

} // BSPL
