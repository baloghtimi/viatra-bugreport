/**
 */
package WTSpec4M.impl;

import WTSpec4M.AuthorizedSystem;
import WTSpec4M.Ownership;
import WTSpec4M.Subsystem;
import WTSpec4M.WT;
import WTSpec4M.WTSpec4MPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authorized System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WTSpec4M.impl.AuthorizedSystemImpl#getWtSystem <em>Wt System</em>}</li>
 *   <li>{@link WTSpec4M.impl.AuthorizedSystemImpl#getProtected <em>Protected</em>}</li>
 *   <li>{@link WTSpec4M.impl.AuthorizedSystemImpl#getOwnerships <em>Ownerships</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthorizedSystemImpl extends MinimalEObjectImpl.Container implements AuthorizedSystem {
    /**
     * The cached value of the '{@link #getWtSystem() <em>Wt System</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWtSystem()
     * @generated
     * @ordered
     */
    protected WT wtSystem;

    /**
     * The cached value of the '{@link #getProtected() <em>Protected</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProtected()
     * @generated
     * @ordered
     */
    protected EList<Subsystem> protected_;

    /**
     * The cached value of the '{@link #getOwnerships() <em>Ownerships</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwnerships()
     * @generated
     * @ordered
     */
    protected EList<Ownership> ownerships;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AuthorizedSystemImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return WTSpec4MPackage.Literals.AUTHORIZED_SYSTEM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WT getWtSystem() {
        return wtSystem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWtSystem(WT newWtSystem, NotificationChain msgs) {
        WT oldWtSystem = wtSystem;
        wtSystem = newWtSystem;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.AUTHORIZED_SYSTEM__WT_SYSTEM, oldWtSystem, newWtSystem);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWtSystem(WT newWtSystem) {
        if (newWtSystem != wtSystem) {
            NotificationChain msgs = null;
            if (wtSystem != null)
                msgs = ((InternalEObject)wtSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WTSpec4MPackage.AUTHORIZED_SYSTEM__WT_SYSTEM, null, msgs);
            if (newWtSystem != null)
                msgs = ((InternalEObject)newWtSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WTSpec4MPackage.AUTHORIZED_SYSTEM__WT_SYSTEM, null, msgs);
            msgs = basicSetWtSystem(newWtSystem, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.AUTHORIZED_SYSTEM__WT_SYSTEM, newWtSystem, newWtSystem));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Subsystem> getProtected() {
        if (protected_ == null) {
            protected_ = new EObjectResolvingEList<Subsystem>(Subsystem.class, this, WTSpec4MPackage.AUTHORIZED_SYSTEM__PROTECTED);
        }
        return protected_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Ownership> getOwnerships() {
        if (ownerships == null) {
            ownerships = new EObjectContainmentEList<Ownership>(Ownership.class, this, WTSpec4MPackage.AUTHORIZED_SYSTEM__OWNERSHIPS);
        }
        return ownerships;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case WTSpec4MPackage.AUTHORIZED_SYSTEM__WT_SYSTEM:
                return basicSetWtSystem(null, msgs);
            case WTSpec4MPackage.AUTHORIZED_SYSTEM__OWNERSHIPS:
                return ((InternalEList<?>)getOwnerships()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case WTSpec4MPackage.AUTHORIZED_SYSTEM__WT_SYSTEM:
                return getWtSystem();
            case WTSpec4MPackage.AUTHORIZED_SYSTEM__PROTECTED:
                return getProtected();
            case WTSpec4MPackage.AUTHORIZED_SYSTEM__OWNERSHIPS:
                return getOwnerships();
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
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case WTSpec4MPackage.AUTHORIZED_SYSTEM__WT_SYSTEM:
                setWtSystem((WT)newValue);
                return;
            case WTSpec4MPackage.AUTHORIZED_SYSTEM__PROTECTED:
                getProtected().clear();
                getProtected().addAll((Collection<? extends Subsystem>)newValue);
                return;
            case WTSpec4MPackage.AUTHORIZED_SYSTEM__OWNERSHIPS:
                getOwnerships().clear();
                getOwnerships().addAll((Collection<? extends Ownership>)newValue);
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
    public void eUnset(int featureID) {
        switch (featureID) {
            case WTSpec4MPackage.AUTHORIZED_SYSTEM__WT_SYSTEM:
                setWtSystem((WT)null);
                return;
            case WTSpec4MPackage.AUTHORIZED_SYSTEM__PROTECTED:
                getProtected().clear();
                return;
            case WTSpec4MPackage.AUTHORIZED_SYSTEM__OWNERSHIPS:
                getOwnerships().clear();
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
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case WTSpec4MPackage.AUTHORIZED_SYSTEM__WT_SYSTEM:
                return wtSystem != null;
            case WTSpec4MPackage.AUTHORIZED_SYSTEM__PROTECTED:
                return protected_ != null && !protected_.isEmpty();
            case WTSpec4MPackage.AUTHORIZED_SYSTEM__OWNERSHIPS:
                return ownerships != null && !ownerships.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //AuthorizedSystemImpl
