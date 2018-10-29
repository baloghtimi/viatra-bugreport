/**
 */
package WTSpec4M.impl;

import WTSpec4M.SystemParam;
import WTSpec4M.WTSpec4MPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WTSpec4M.impl.SystemParamImpl#getValue <em>Value</em>}</li>
 *   <li>{@link WTSpec4M.impl.SystemParamImpl#isSettable <em>Settable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemParamImpl extends WTCParamImpl implements SystemParam {
	/**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
	protected static final int VALUE_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
	protected int value = VALUE_EDEFAULT;

	/**
     * The default value of the '{@link #isSettable() <em>Settable</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSettable()
     * @generated
     * @ordered
     */
	protected static final boolean SETTABLE_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isSettable() <em>Settable</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isSettable()
     * @generated
     * @ordered
     */
	protected boolean settable = SETTABLE_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SystemParamImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return WTSpec4MPackage.Literals.SYSTEM_PARAM;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getValue() {
        return value;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setValue(int newValue) {
        int oldValue = value;
        value = newValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.SYSTEM_PARAM__VALUE, oldValue, value));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isSettable() {
        return settable;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSettable(boolean newSettable) {
        boolean oldSettable = settable;
        settable = newSettable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.SYSTEM_PARAM__SETTABLE, oldSettable, settable));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case WTSpec4MPackage.SYSTEM_PARAM__VALUE:
                return getValue();
            case WTSpec4MPackage.SYSTEM_PARAM__SETTABLE:
                return isSettable();
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
            case WTSpec4MPackage.SYSTEM_PARAM__VALUE:
                setValue((Integer)newValue);
                return;
            case WTSpec4MPackage.SYSTEM_PARAM__SETTABLE:
                setSettable((Boolean)newValue);
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
            case WTSpec4MPackage.SYSTEM_PARAM__VALUE:
                setValue(VALUE_EDEFAULT);
                return;
            case WTSpec4MPackage.SYSTEM_PARAM__SETTABLE:
                setSettable(SETTABLE_EDEFAULT);
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
            case WTSpec4MPackage.SYSTEM_PARAM__VALUE:
                return value != VALUE_EDEFAULT;
            case WTSpec4MPackage.SYSTEM_PARAM__SETTABLE:
                return settable != SETTABLE_EDEFAULT;
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
        result.append(" (value: ");
        result.append(value);
        result.append(", settable: ");
        result.append(settable);
        result.append(')');
        return result.toString();
    }

} //SystemParamImpl
