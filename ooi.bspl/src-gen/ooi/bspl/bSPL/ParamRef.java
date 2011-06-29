/**
 * <copyright>
 * </copyright>
 *

 */
package ooi.bspl.bSPL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ooi.bspl.bSPL.ParamRef#getAdornment <em>Adornment</em>}</li>
 *   <li>{@link ooi.bspl.bSPL.ParamRef#getParam <em>Param</em>}</li>
 *   <li>{@link ooi.bspl.bSPL.ParamRef#isIsKey <em>Is Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see ooi.bspl.bSPL.BSPLPackage#getParamRef()
 * @model
 * @generated
 */
public interface ParamRef extends EObject
{
  /**
   * Returns the value of the '<em><b>Adornment</b></em>' attribute.
   * The literals are from the enumeration {@link ooi.bspl.bSPL.kAdornment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Adornment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Adornment</em>' attribute.
   * @see ooi.bspl.bSPL.kAdornment
   * @see #setAdornment(kAdornment)
   * @see ooi.bspl.bSPL.BSPLPackage#getParamRef_Adornment()
   * @model
   * @generated
   */
  kAdornment getAdornment();

  /**
   * Sets the value of the '{@link ooi.bspl.bSPL.ParamRef#getAdornment <em>Adornment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Adornment</em>' attribute.
   * @see ooi.bspl.bSPL.kAdornment
   * @see #getAdornment()
   * @generated
   */
  void setAdornment(kAdornment value);

  /**
   * Returns the value of the '<em><b>Param</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' reference.
   * @see #setParam(Parameter)
   * @see ooi.bspl.bSPL.BSPLPackage#getParamRef_Param()
   * @model
   * @generated
   */
  Parameter getParam();

  /**
   * Sets the value of the '{@link ooi.bspl.bSPL.ParamRef#getParam <em>Param</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param</em>' reference.
   * @see #getParam()
   * @generated
   */
  void setParam(Parameter value);

  /**
   * Returns the value of the '<em><b>Is Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Key</em>' attribute.
   * @see #setIsKey(boolean)
   * @see ooi.bspl.bSPL.BSPLPackage#getParamRef_IsKey()
   * @model
   * @generated
   */
  boolean isIsKey();

  /**
   * Sets the value of the '{@link ooi.bspl.bSPL.ParamRef#isIsKey <em>Is Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Key</em>' attribute.
   * @see #isIsKey()
   * @generated
   */
  void setIsKey(boolean value);

} // ParamRef
