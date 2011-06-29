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
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ooi.bspl.bSPL.Message#getSender <em>Sender</em>}</li>
 *   <li>{@link ooi.bspl.bSPL.Message#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link ooi.bspl.bSPL.Message#getName <em>Name</em>}</li>
 *   <li>{@link ooi.bspl.bSPL.Message#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see ooi.bspl.bSPL.BSPLPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends EObject
{
  /**
   * Returns the value of the '<em><b>Sender</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sender</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sender</em>' reference.
   * @see #setSender(Role)
   * @see ooi.bspl.bSPL.BSPLPackage#getMessage_Sender()
   * @model
   * @generated
   */
  Role getSender();

  /**
   * Sets the value of the '{@link ooi.bspl.bSPL.Message#getSender <em>Sender</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sender</em>' reference.
   * @see #getSender()
   * @generated
   */
  void setSender(Role value);

  /**
   * Returns the value of the '<em><b>Receiver</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Receiver</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Receiver</em>' reference.
   * @see #setReceiver(Role)
   * @see ooi.bspl.bSPL.BSPLPackage#getMessage_Receiver()
   * @model
   * @generated
   */
  Role getReceiver();

  /**
   * Sets the value of the '{@link ooi.bspl.bSPL.Message#getReceiver <em>Receiver</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Receiver</em>' reference.
   * @see #getReceiver()
   * @generated
   */
  void setReceiver(Role value);

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
   * @see ooi.bspl.bSPL.BSPLPackage#getMessage_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ooi.bspl.bSPL.Message#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see ooi.bspl.bSPL.BSPLPackage#getMessage_Params()
   * @model containment="true"
   * @generated
   */
  EList<ParamRef> getParams();

} // Message
