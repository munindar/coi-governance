/**
 * <copyright>
 * </copyright>
 *

 */
package ooi.bspl.bSPL.impl;

import java.util.Collection;

import ooi.bspl.bSPL.BSPL;
import ooi.bspl.bSPL.BSPLPackage;
import ooi.bspl.bSPL.ParamDecl;
import ooi.bspl.bSPL.Parameter;
import ooi.bspl.bSPL.Role;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BSPL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ooi.bspl.bSPL.impl.BSPLImpl#isJunkProtocol <em>Junk Protocol</em>}</li>
 *   <li>{@link ooi.bspl.bSPL.impl.BSPLImpl#getName <em>Name</em>}</li>
 *   <li>{@link ooi.bspl.bSPL.impl.BSPLImpl#isJunkRole <em>Junk Role</em>}</li>
 *   <li>{@link ooi.bspl.bSPL.impl.BSPLImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link ooi.bspl.bSPL.impl.BSPLImpl#isJunkPub <em>Junk Pub</em>}</li>
 *   <li>{@link ooi.bspl.bSPL.impl.BSPLImpl#getPublicParams <em>Public Params</em>}</li>
 *   <li>{@link ooi.bspl.bSPL.impl.BSPLImpl#isJunkPriv <em>Junk Priv</em>}</li>
 *   <li>{@link ooi.bspl.bSPL.impl.BSPLImpl#getPrivateParams <em>Private Params</em>}</li>
 *   <li>{@link ooi.bspl.bSPL.impl.BSPLImpl#getReferences <em>References</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BSPLImpl extends MinimalEObjectImpl.Container implements BSPL
{
  /**
   * The default value of the '{@link #isJunkProtocol() <em>Junk Protocol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isJunkProtocol()
   * @generated
   * @ordered
   */
  protected static final boolean JUNK_PROTOCOL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isJunkProtocol() <em>Junk Protocol</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isJunkProtocol()
   * @generated
   * @ordered
   */
  protected boolean junkProtocol = JUNK_PROTOCOL_EDEFAULT;

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
   * The default value of the '{@link #isJunkRole() <em>Junk Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isJunkRole()
   * @generated
   * @ordered
   */
  protected static final boolean JUNK_ROLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isJunkRole() <em>Junk Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isJunkRole()
   * @generated
   * @ordered
   */
  protected boolean junkRole = JUNK_ROLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRoles()
   * @generated
   * @ordered
   */
  protected EList<Role> roles;

  /**
   * The default value of the '{@link #isJunkPub() <em>Junk Pub</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isJunkPub()
   * @generated
   * @ordered
   */
  protected static final boolean JUNK_PUB_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isJunkPub() <em>Junk Pub</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isJunkPub()
   * @generated
   * @ordered
   */
  protected boolean junkPub = JUNK_PUB_EDEFAULT;

  /**
   * The cached value of the '{@link #getPublicParams() <em>Public Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPublicParams()
   * @generated
   * @ordered
   */
  protected EList<ParamDecl> publicParams;

  /**
   * The default value of the '{@link #isJunkPriv() <em>Junk Priv</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isJunkPriv()
   * @generated
   * @ordered
   */
  protected static final boolean JUNK_PRIV_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isJunkPriv() <em>Junk Priv</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isJunkPriv()
   * @generated
   * @ordered
   */
  protected boolean junkPriv = JUNK_PRIV_EDEFAULT;

  /**
   * The cached value of the '{@link #getPrivateParams() <em>Private Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrivateParams()
   * @generated
   * @ordered
   */
  protected EList<Parameter> privateParams;

  /**
   * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferences()
   * @generated
   * @ordered
   */
  protected EList<EObject> references;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BSPLImpl()
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
    return BSPLPackage.Literals.BSPL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isJunkProtocol()
  {
    return junkProtocol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJunkProtocol(boolean newJunkProtocol)
  {
    boolean oldJunkProtocol = junkProtocol;
    junkProtocol = newJunkProtocol;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BSPLPackage.BSPL__JUNK_PROTOCOL, oldJunkProtocol, junkProtocol));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BSPLPackage.BSPL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isJunkRole()
  {
    return junkRole;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJunkRole(boolean newJunkRole)
  {
    boolean oldJunkRole = junkRole;
    junkRole = newJunkRole;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BSPLPackage.BSPL__JUNK_ROLE, oldJunkRole, junkRole));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Role> getRoles()
  {
    if (roles == null)
    {
      roles = new EObjectContainmentEList<Role>(Role.class, this, BSPLPackage.BSPL__ROLES);
    }
    return roles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isJunkPub()
  {
    return junkPub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJunkPub(boolean newJunkPub)
  {
    boolean oldJunkPub = junkPub;
    junkPub = newJunkPub;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BSPLPackage.BSPL__JUNK_PUB, oldJunkPub, junkPub));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ParamDecl> getPublicParams()
  {
    if (publicParams == null)
    {
      publicParams = new EObjectContainmentEList<ParamDecl>(ParamDecl.class, this, BSPLPackage.BSPL__PUBLIC_PARAMS);
    }
    return publicParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isJunkPriv()
  {
    return junkPriv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJunkPriv(boolean newJunkPriv)
  {
    boolean oldJunkPriv = junkPriv;
    junkPriv = newJunkPriv;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BSPLPackage.BSPL__JUNK_PRIV, oldJunkPriv, junkPriv));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getPrivateParams()
  {
    if (privateParams == null)
    {
      privateParams = new EObjectContainmentEList<Parameter>(Parameter.class, this, BSPLPackage.BSPL__PRIVATE_PARAMS);
    }
    return privateParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getReferences()
  {
    if (references == null)
    {
      references = new EObjectContainmentEList<EObject>(EObject.class, this, BSPLPackage.BSPL__REFERENCES);
    }
    return references;
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
      case BSPLPackage.BSPL__ROLES:
        return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
      case BSPLPackage.BSPL__PUBLIC_PARAMS:
        return ((InternalEList<?>)getPublicParams()).basicRemove(otherEnd, msgs);
      case BSPLPackage.BSPL__PRIVATE_PARAMS:
        return ((InternalEList<?>)getPrivateParams()).basicRemove(otherEnd, msgs);
      case BSPLPackage.BSPL__REFERENCES:
        return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
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
      case BSPLPackage.BSPL__JUNK_PROTOCOL:
        return isJunkProtocol();
      case BSPLPackage.BSPL__NAME:
        return getName();
      case BSPLPackage.BSPL__JUNK_ROLE:
        return isJunkRole();
      case BSPLPackage.BSPL__ROLES:
        return getRoles();
      case BSPLPackage.BSPL__JUNK_PUB:
        return isJunkPub();
      case BSPLPackage.BSPL__PUBLIC_PARAMS:
        return getPublicParams();
      case BSPLPackage.BSPL__JUNK_PRIV:
        return isJunkPriv();
      case BSPLPackage.BSPL__PRIVATE_PARAMS:
        return getPrivateParams();
      case BSPLPackage.BSPL__REFERENCES:
        return getReferences();
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
      case BSPLPackage.BSPL__JUNK_PROTOCOL:
        setJunkProtocol((Boolean)newValue);
        return;
      case BSPLPackage.BSPL__NAME:
        setName((String)newValue);
        return;
      case BSPLPackage.BSPL__JUNK_ROLE:
        setJunkRole((Boolean)newValue);
        return;
      case BSPLPackage.BSPL__ROLES:
        getRoles().clear();
        getRoles().addAll((Collection<? extends Role>)newValue);
        return;
      case BSPLPackage.BSPL__JUNK_PUB:
        setJunkPub((Boolean)newValue);
        return;
      case BSPLPackage.BSPL__PUBLIC_PARAMS:
        getPublicParams().clear();
        getPublicParams().addAll((Collection<? extends ParamDecl>)newValue);
        return;
      case BSPLPackage.BSPL__JUNK_PRIV:
        setJunkPriv((Boolean)newValue);
        return;
      case BSPLPackage.BSPL__PRIVATE_PARAMS:
        getPrivateParams().clear();
        getPrivateParams().addAll((Collection<? extends Parameter>)newValue);
        return;
      case BSPLPackage.BSPL__REFERENCES:
        getReferences().clear();
        getReferences().addAll((Collection<? extends EObject>)newValue);
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
      case BSPLPackage.BSPL__JUNK_PROTOCOL:
        setJunkProtocol(JUNK_PROTOCOL_EDEFAULT);
        return;
      case BSPLPackage.BSPL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BSPLPackage.BSPL__JUNK_ROLE:
        setJunkRole(JUNK_ROLE_EDEFAULT);
        return;
      case BSPLPackage.BSPL__ROLES:
        getRoles().clear();
        return;
      case BSPLPackage.BSPL__JUNK_PUB:
        setJunkPub(JUNK_PUB_EDEFAULT);
        return;
      case BSPLPackage.BSPL__PUBLIC_PARAMS:
        getPublicParams().clear();
        return;
      case BSPLPackage.BSPL__JUNK_PRIV:
        setJunkPriv(JUNK_PRIV_EDEFAULT);
        return;
      case BSPLPackage.BSPL__PRIVATE_PARAMS:
        getPrivateParams().clear();
        return;
      case BSPLPackage.BSPL__REFERENCES:
        getReferences().clear();
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
      case BSPLPackage.BSPL__JUNK_PROTOCOL:
        return junkProtocol != JUNK_PROTOCOL_EDEFAULT;
      case BSPLPackage.BSPL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BSPLPackage.BSPL__JUNK_ROLE:
        return junkRole != JUNK_ROLE_EDEFAULT;
      case BSPLPackage.BSPL__ROLES:
        return roles != null && !roles.isEmpty();
      case BSPLPackage.BSPL__JUNK_PUB:
        return junkPub != JUNK_PUB_EDEFAULT;
      case BSPLPackage.BSPL__PUBLIC_PARAMS:
        return publicParams != null && !publicParams.isEmpty();
      case BSPLPackage.BSPL__JUNK_PRIV:
        return junkPriv != JUNK_PRIV_EDEFAULT;
      case BSPLPackage.BSPL__PRIVATE_PARAMS:
        return privateParams != null && !privateParams.isEmpty();
      case BSPLPackage.BSPL__REFERENCES:
        return references != null && !references.isEmpty();
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
    result.append(" (junkProtocol: ");
    result.append(junkProtocol);
    result.append(", name: ");
    result.append(name);
    result.append(", junkRole: ");
    result.append(junkRole);
    result.append(", junkPub: ");
    result.append(junkPub);
    result.append(", junkPriv: ");
    result.append(junkPriv);
    result.append(')');
    return result.toString();
  }

} //BSPLImpl
