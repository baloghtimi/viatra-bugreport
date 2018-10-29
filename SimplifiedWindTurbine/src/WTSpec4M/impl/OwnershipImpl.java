/**
 */
package WTSpec4M.impl;

import WTSpec4M.Ownership;
import WTSpec4M.SpecialistKind;
import WTSpec4M.Subsystem;
import WTSpec4M.WTSpec4MPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ownership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WTSpec4M.impl.OwnershipImpl#getOwned <em>Owned</em>}</li>
 *   <li>{@link WTSpec4M.impl.OwnershipImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OwnershipImpl extends MinimalEObjectImpl.Container implements Ownership {
    /**
     * The cached value of the '{@link #getOwned() <em>Owned</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwned()
     * @generated
     * @ordered
     */
    protected Subsystem owned;

    /**
     * The default value of the '{@link #getOwner() <em>Owner</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwner()
     * @generated
     * @ordered
     */
    protected static final SpecialistKind OWNER_EDEFAULT = SpecialistKind.PUMP;

    /**
     * The cached value of the '{@link #getOwner() <em>Owner</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwner()
     * @generated
     * @ordered
     */
    protected SpecialistKind owner = OWNER_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OwnershipImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return WTSpec4MPackage.Literals.OWNERSHIP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Subsystem getOwned() {
        if (owned != null && owned.eIsProxy()) {
            InternalEObject oldOwned = (InternalEObject)owned;
            owned = (Subsystem)eResolveProxy(oldOwned);
            if (owned != oldOwned) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4MPackage.OWNERSHIP__OWNED, oldOwned, owned));
            }
        }
        return owned;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Subsystem basicGetOwned() {
        return owned;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwned(Subsystem newOwned) {
        Subsystem oldOwned = owned;
        owned = newOwned;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.OWNERSHIP__OWNED, oldOwned, owned));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecialistKind getOwner() {
        return owner;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwner(SpecialistKind newOwner) {
        SpecialistKind oldOwner = owner;
        owner = newOwner == null ? OWNER_EDEFAULT : newOwner;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.OWNERSHIP__OWNER, oldOwner, owner));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case WTSpec4MPackage.OWNERSHIP__OWNED:
                if (resolve) return getOwned();
                return basicGetOwned();
            case WTSpec4MPackage.OWNERSHIP__OWNER:
                return getOwner();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case WTSpec4MPackage.OWNERSHIP__OWNED:
                setOwned((Subsystem)newValue);
                return;
            case WTSpec4MPackage.OWNERSHIP__OWNER:
                setOwner((SpecialistKind)newValue);
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
            case WTSpec4MPackage.OWNERSHIP__OWNED:
                setOwned((Subsystem)null);
                return;
            case WTSpec4MPackage.OWNERSHIP__OWNER:
                setOwner(OWNER_EDEFAULT);
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
            case WTSpec4MPackage.OWNERSHIP__OWNED:
                return owned != null;
            case WTSpec4MPackage.OWNERSHIP__OWNER:
                return owner != OWNER_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (owner: ");
        result.append(owner);
        result.append(')');
        return result.toString();
    }

} //OwnershipImpl
