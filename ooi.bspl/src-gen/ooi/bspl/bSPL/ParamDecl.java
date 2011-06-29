/**
 * <copyright>
 * </copyright>
 *

 */
package ooi.bspl.bSPL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ooi.bspl.bSPL.ParamDecl#getAdornment <em>Adornment</em>}</li>
 *   <li>{@link ooi.bspl.bSPL.ParamDecl#getParam <em>Param</em>}</li>
 *   <li>{@link ooi.bspl.bSPL.ParamDecl#isIsKey <em>Is Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see ooi.bspl.bSPL.BSPLPackage#getParamDecl()
 * @model
 * @generated
 */
public interface ParamDecl extends EObject
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
   * @see ooi.bspl.bSPL.BSPLPackage#getParamDecl_Adornment()
   * @model
   * @generated
   */
  kAdornment getAdornment();

  /**
   * Sets the value of the '{@link ooi.bspl.bSPL.ParamDecl#getAdornment <em>Adornment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Adornment</em>' attribute.
   * @see ooi.bspl.bSPL.kAdornment
   * @see #getAdornment()
   * @generated
   */
  void setAdornment(kAdornment value);

  /**
   * Returns the value of the '<em><b>Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' containment reference.
   * @see #setParam(Parameter)
   * @see ooi.bspl.bSPL.BSPLPackage#getParamDecl_Param()
   * @model containment="true"
   * @generated
   */
  Parameter getParam();

  /**
   * Sets the value of the '{@link ooi.bspl.bSPL.ParamDecl#getParam <em>Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param</em>' containment reference.
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
   * @see ooi.bspl.bSPL.BSPLPackage#getParamDecl_IsKey()
   * @model
   * @generated
   */
  boolean isIsKey();

  /**
   * Sets the value of the '{@link ooi.bspl.bSPL.ParamDecl#isIsKey <em>Is Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Key</em>' attribute.
   * @see #isIsKey()
   * @generated
   */
  void setIsKey(boolean value);

} // ParamDecl
