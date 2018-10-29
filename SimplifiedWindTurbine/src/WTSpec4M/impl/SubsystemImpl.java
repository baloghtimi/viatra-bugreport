/**
 */
package WTSpec4M.impl;

import WTSpec4M.ControlUnit;
import WTSpec4M.Subsystem;
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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subsystem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WTSpec4M.impl.SubsystemImpl#getControlUnits <em>Control Units</em>}</li>
 *   <li>{@link WTSpec4M.impl.SubsystemImpl#getSubsystems <em>Subsystems</em>}</li>
 *   <li>{@link WTSpec4M.impl.SubsystemImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubsystemImpl extends MinimalEObjectImpl.Container implements Subsystem {
	/**
     * The cached value of the '{@link #getControlUnits() <em>Control Units</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getControlUnits()
     * @generated
     * @ordered
     */
	protected EList<ControlUnit> controlUnits;

	/**
     * The cached value of the '{@link #getSubsystems() <em>Subsystems</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSubsystems()
     * @generated
     * @ordered
     */
	protected EList<Subsystem> subsystems;

	/**
     * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected static final String DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
    protected String description = DESCRIPTION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SubsystemImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return WTSpec4MPackage.Literals.SUBSYSTEM;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<ControlUnit> getControlUnits() {
        if (controlUnits == null) {
            controlUnits = new EObjectContainmentEList<ControlUnit>(ControlUnit.class, this, WTSpec4MPackage.SUBSYSTEM__CONTROL_UNITS);
        }
        return controlUnits;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Subsystem> getSubsystems() {
        if (subsystems == null) {
            subsystems = new EObjectContainmentEList<Subsystem>(Subsystem.class, this, WTSpec4MPackage.SUBSYSTEM__SUBSYSTEMS);
        }
        return subsystems;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDescription(String newDescription) {
        String oldDescription = description;
        description = newDescription;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.SUBSYSTEM__DESCRIPTION, oldDescription, description));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case WTSpec4MPackage.SUBSYSTEM__CONTROL_UNITS:
                return ((InternalEList<?>)getControlUnits()).basicRemove(otherEnd, msgs);
            case WTSpec4MPackage.SUBSYSTEM__SUBSYSTEMS:
                return ((InternalEList<?>)getSubsystems()).basicRemove(otherEnd, msgs);
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
            case WTSpec4MPackage.SUBSYSTEM__CONTROL_UNITS:
                return getControlUnits();
            case WTSpec4MPackage.SUBSYSTEM__SUBSYSTEMS:
                return getSubsystems();
            case WTSpec4MPackage.SUBSYSTEM__DESCRIPTION:
                return getDescription();
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
            case WTSpec4MPackage.SUBSYSTEM__CONTROL_UNITS:
                getControlUnits().clear();
                getControlUnits().addAll((Collection<? extends ControlUnit>)newValue);
                return;
            case WTSpec4MPackage.SUBSYSTEM__SUBSYSTEMS:
                getSubsystems().clear();
                getSubsystems().addAll((Collection<? extends Subsystem>)newValue);
                return;
            case WTSpec4MPackage.SUBSYSTEM__DESCRIPTION:
                setDescription((String)newValue);
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
            case WTSpec4MPackage.SUBSYSTEM__CONTROL_UNITS:
                getControlUnits().clear();
                return;
            case WTSpec4MPackage.SUBSYSTEM__SUBSYSTEMS:
                getSubsystems().clear();
                return;
            case WTSpec4MPackage.SUBSYSTEM__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
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
            case WTSpec4MPackage.SUBSYSTEM__CONTROL_UNITS:
                return controlUnits != null && !controlUnits.isEmpty();
            case WTSpec4MPackage.SUBSYSTEM__SUBSYSTEMS:
                return subsystems != null && !subsystems.isEmpty();
            case WTSpec4MPackage.SUBSYSTEM__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
        result.append(" (description: ");
        result.append(description);
        result.append(')');
        return result.toString();
    }

} //SubsystemImpl
