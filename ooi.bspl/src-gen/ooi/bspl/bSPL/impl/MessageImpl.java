/**
 * <copyright>
 * </copyright>
 *

 */
package ooi.bspl.bSPL.impl;

import java.util.Collection;

import ooi.bspl.bSPL.BSPLPackage;
import ooi.bspl.bSPL.Message;
import ooi.bspl.bSPL.ParamRef;
import ooi.bspl.bSPL.Role;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ooi.bspl.bSPL.impl.MessageImpl#getSender <em>Sender</em>}</li>
 *   <li>{@link ooi.bspl.bSPL.impl.MessageImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link ooi.bspl.bSPL.impl.MessageImpl#getName <em>Name</em>}</li>
 *   <li>{@link ooi.bspl.bSPL.impl.MessageImpl#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageImpl extends MinimalEObjectImpl.Container implements Message
{
  /**
   * The cached value of the '{@link #getSender() <em>Sender</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSender()
   * @generated
   * @ordered
   */
  protected Role sender;

  /**
   * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReceiver()
   * @generated
   * @ordered
   */
  protected Role receiver;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<ParamRef> params;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MessageImpl()
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
    return BSPLPackage.Literals.MESSAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role getSender()
  {
    if (sender != null && sender.eIsProxy())
    {
      InternalEObject oldSender = (InternalEObject)sender;
      sender = (Role)eResolveProxy(oldSender);
      if (sender != oldSender)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BSPLPackage.MESSAGE__SENDER, oldSender, sender));
      }
    }
    return sender;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role basicGetSender()
  {
    return sender;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSender(Role newSender)
  {
    Role oldSender = sender;
    sender = newSender;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BSPLPackage.MESSAGE__SENDER, oldSender, sender));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role getReceiver()
  {
    if (receiver != null && receiver.eIsProxy())
    {
      InternalEObject oldReceiver = (InternalEObject)receiver;
      receiver = (Role)eResolveProxy(oldReceiver);
      if (receiver != oldReceiver)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BSPLPackage.MESSAGE__RECEIVER, oldReceiver, receiver));
      }
    }
    return receiver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Role basicGetReceiver()
  {
    return receiver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReceiver(Role newReceiver)
  {
    Role oldReceiver = receiver;
    receiver = newReceiver;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BSPLPackage.MESSAGE__RECEIVER, oldReceiver, receiver));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BSPLPackage.MESSAGE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ParamRef> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<ParamRef>(ParamRef.class, this, BSPLPackage.MESSAGE__PARAMS);
    }
    return params;
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
      case BSPLPackage.MESSAGE__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
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
      case BSPLPackage.MESSAGE__SENDER:
        if (resolve) return getSender();
        return basicGetSender();
      case BSPLPackage.MESSAGE__RECEIVER:
        if (resolve) return getReceiver();
        return basicGetReceiver();
      case BSPLPackage.MESSAGE__NAME:
        return getName();
      case BSPLPackage.MESSAGE__PARAMS:
        return getParams();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BSPLPackage.MESSAGE__SENDER:
        setSender((Role)newValue);
        return;
      case BSPLPackage.MESSAGE__RECEIVER:
        setReceiver((Role)newValue);
        return;
      case BSPLPackage.MESSAGE__NAME:
        setName((String)newValue);
        return;
      case BSPLPackage.MESSAGE__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends ParamRef>)newValue);
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
      case BSPLPackage.MESSAGE__SENDER:
        setSender((Role)null);
        return;
      case BSPLPackage.MESSAGE__RECEIVER:
        setReceiver((Role)null);
        return;
      case BSPLPackage.MESSAGE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BSPLPackage.MESSAGE__PARAMS:
        getParams().clear();
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
      case BSPLPackage.MESSAGE__SENDER:
        return sender != null;
      case BSPLPackage.MESSAGE__RECEIVER:
        return receiver != null;
      case BSPLPackage.MESSAGE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BSPLPackage.MESSAGE__PARAMS:
        return params != null && !params.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //MessageImpl
