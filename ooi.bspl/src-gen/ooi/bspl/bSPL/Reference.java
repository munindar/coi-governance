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
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ooi.bspl.bSPL.Reference#getRef <em>Ref</em>}</li>
 *   <li>{@link ooi.bspl.bSPL.Reference#getRoles <em>Roles</em>}</li>
 *   <li>{@link ooi.bspl.bSPL.Reference#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see ooi.bspl.bSPL.BSPLPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(BSPL)
   * @see ooi.bspl.bSPL.BSPLPackage#getReference_Ref()
   * @model
   * @generated
   */
  BSPL getRef();

  /**
   * Sets the value of the '{@link ooi.bspl.bSPL.Reference#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(BSPL value);

  /**
   * Returns the value of the '<em><b>Roles</b></em>' reference list.
   * The list contents are of type {@link ooi.bspl.bSPL.Role}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Roles</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Roles</em>' reference list.
   * @see ooi.bspl.bSPL.BSPLPackage#getReference_Roles()
   * @model
   * @generated
   */
  EList<Role> getRoles();

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link ooi.bspl.bSPL.ParamRef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see ooi.bspl.bSPL.BSPLPackage#getReference_Params()
   * @model containment="true"
   * @generated
   */
  EList<ParamRef> getParams();

} // Reference
