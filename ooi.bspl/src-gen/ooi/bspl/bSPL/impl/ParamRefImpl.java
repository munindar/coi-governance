/**
 * <copyright>
 * </copyright>
 *

 */
package ooi.bspl.bSPL.impl;

import ooi.bspl.bSPL.BSPLPackage;
import ooi.bspl.bSPL.ParamRef;
import ooi.bspl.bSPL.Parameter;
import ooi.bspl.bSPL.kAdornment;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Param Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ooi.bspl.bSPL.impl.ParamRefImpl#getAdornment <em>Adornment</em>}</li>
 *   <li>{@link ooi.bspl.bSPL.impl.ParamRefImpl#getParam <em>Param</em>}</li>
 *   <li>{@link ooi.bspl.bSPL.impl.ParamRefImpl#isIsKey <em>Is Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParamRefImpl extends MinimalEObjectImpl.Container implements ParamRef
{
  /**
   * The default value of the '{@link #getAdornment() <em>Adornment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdornment()
   * @generated
   * @ordered
   */
  protected static final kAdornment ADORNMENT_EDEFAULT = kAdornment.IN;

  /**
   * The cached value of the '{@link #getAdornment() <em>Adornment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdornment()
   * @generated
   * @ordered
   */
  protected kAdornment adornment = ADORNMENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getParam() <em>Param</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParam()
   * @generated
   * @ordered
   */
  protected Parameter param;

  /**
   * The default value of the '{@link #isIsKey() <em>Is Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsKey()
   * @generated
   * @ordered
   */
  protected static final boolean IS_KEY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsKey() <em>Is Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsKey()
   * @generated
   * @ordered
   */
  protected boolean isKey = IS_KEY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParamRefImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BSPLPackage.Literals.PARAM_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public kAdornment getAdornment()
  {
    return adornment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAdornment(kAdornment newAdornment)
  {
    kAdornment oldAdornment = adornment;
    adornment = newAdornment == null ? ADORNMENT_EDEFAULT : newAdornment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BSPLPackage.PARAM_REF__ADORNMENT, oldAdornment, adornment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter getParam()
  {
    if (param != null && param.eIsProxy())
    {
      InternalEObject oldParam = (InternalEObject)param;
      param = (Parameter)eResolveProxy(oldParam);
      if (param != oldParam)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BSPLPackage.PARAM_REF__PARAM, oldParam, param));
      }
    }
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter basicGetParam()
  {
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParam(Parameter newParam)
  {
    Parameter oldParam = param;
    param = newParam;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BSPLPackage.PARAM_REF__PARAM, oldParam, param));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsKey()
  {
    return isKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsKey(boolean newIsKey)
  {
    boolean oldIsKey = isKey;
    isKey = newIsKey;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BSPLPackage.PARAM_REF__IS_KEY, oldIsKey, isKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BSPLPackage.PARAM_REF__ADORNMENT:
        return getAdornment();
      case BSPLPackage.PARAM_REF__PARAM:
        if (resolve) return getParam();
        return basicGetParam();
      case BSPLPackage.PARAM_REF__IS_KEY:
        return isIsKey();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BSPLPackage.PARAM_REF__ADORNMENT:
        setAdornment((kAdornment)newValue);
        return;
      case BSPLPackage.PARAM_REF__PARAM:
        setParam((Parameter)newValue);
        return;
      case BSPLPackage.PARAM_REF__IS_KEY:
        setIsKey((Boolean)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BSPLPackage.PARAM_REF__ADORNMENT:
        setAdornment(ADORNMENT_EDEFAULT);
        return;
      case BSPLPackage.PARAM_REF__PARAM:
        setParam((Parameter)null);
        return;
      case BSPLPackage.PARAM_REF__IS_KEY:
        setIsKey(IS_KEY_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BSPLPackage.PARAM_REF__ADORNMENT:
        return adornment != ADORNMENT_EDEFAULT;
      case BSPLPackage.PARAM_REF__PARAM:
        return param != null;
      case BSPLPackage.PARAM_REF__IS_KEY:
        return isKey != IS_KEY_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (adornment: ");
    result.append(adornment);
    result.append(", isKey: ");
    result.append(isKey);
    result.append(')');
    return result.toString();
  }

} //ParamRefImpl
