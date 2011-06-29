/**
 * <copyright>
 * </copyright>
 *

 */
package ooi.bspl.bSPL.impl;

import ooi.bspl.bSPL.BSPLPackage;
import ooi.bspl.bSPL.ParamDecl;
import ooi.bspl.bSPL.Parameter;
import ooi.bspl.bSPL.kAdornment;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Param Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ooi.bspl.bSPL.impl.ParamDeclImpl#getAdornment <em>Adornment</em>}</li>
 *   <li>{@link ooi.bspl.bSPL.impl.ParamDeclImpl#getParam <em>Param</em>}</li>
 *   <li>{@link ooi.bspl.bSPL.impl.ParamDeclImpl#isIsKey <em>Is Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParamDeclImpl extends MinimalEObjectImpl.Container implements ParamDecl
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
   * The cached value of the '{@link #getParam() <em>Param</em>}' containment reference.
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
  protected ParamDeclImpl()
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
    return BSPLPackage.Literals.PARAM_DECL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, BSPLPackage.PARAM_DECL__ADORNMENT, oldAdornment, adornment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter getParam()
  {
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParam(Parameter newParam, NotificationChain msgs)
  {
    Parameter oldParam = param;
    param = newParam;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BSPLPackage.PARAM_DECL__PARAM, oldParam, newParam);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParam(Parameter newParam)
  {
    if (newParam != param)
    {
      NotificationChain msgs = null;
      if (param != null)
        msgs = ((InternalEObject)param).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BSPLPackage.PARAM_DECL__PARAM, null, msgs);
      if (newParam != null)
        msgs = ((InternalEObject)newParam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BSPLPackage.PARAM_DECL__PARAM, null, msgs);
      msgs = basicSetParam(newParam, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BSPLPackage.PARAM_DECL__PARAM, newParam, newParam));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BSPLPackage.PARAM_DECL__IS_KEY, oldIsKey, isKey));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BSPLPackage.PARAM_DECL__PARAM:
        return basicSetParam(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case BSPLPackage.PARAM_DECL__ADORNMENT:
        return getAdornment();
      case BSPLPackage.PARAM_DECL__PARAM:
        return getParam();
      case BSPLPackage.PARAM_DECL__IS_KEY:
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
      case BSPLPackage.PARAM_DECL__ADORNMENT:
        setAdornment((kAdornment)newValue);
        return;
      case BSPLPackage.PARAM_DECL__PARAM:
        setParam((Parameter)newValue);
        return;
      case BSPLPackage.PARAM_DECL__IS_KEY:
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
      case BSPLPackage.PARAM_DECL__ADORNMENT:
        setAdornment(ADORNMENT_EDEFAULT);
        return;
      case BSPLPackage.PARAM_DECL__PARAM:
        setParam((Parameter)null);
        return;
      case BSPLPackage.PARAM_DECL__IS_KEY:
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
      case BSPLPackage.PARAM_DECL__ADORNMENT:
        return adornment != ADORNMENT_EDEFAULT;
      case BSPLPackage.PARAM_DECL__PARAM:
        return param != null;
      case BSPLPackage.PARAM_DECL__IS_KEY:
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

} //ParamDeclImpl
