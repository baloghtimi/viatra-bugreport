/**
 */
package WTSpec4M.impl;

import WTSpec4M.ControlUnit;
import WTSpec4M.WTCFault;
import WTSpec4M.WTCInput;
import WTSpec4M.WTCOutput;
import WTSpec4M.WTCParam;
import WTSpec4M.WTCTimer;
import WTSpec4M.WTSpec4MPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WTSpec4M.impl.ControlUnitImpl#getCycle <em>Cycle</em>}</li>
 *   <li>{@link WTSpec4M.impl.ControlUnitImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link WTSpec4M.impl.ControlUnitImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link WTSpec4M.impl.ControlUnitImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link WTSpec4M.impl.ControlUnitImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link WTSpec4M.impl.ControlUnitImpl#getParams <em>Params</em>}</li>
 *   <li>{@link WTSpec4M.impl.ControlUnitImpl#getFault <em>Fault</em>}</li>
 *   <li>{@link WTSpec4M.impl.ControlUnitImpl#getTimers <em>Timers</em>}</li>
 *   <li>{@link WTSpec4M.impl.ControlUnitImpl#getBhvParams <em>Bhv Params</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlUnitImpl extends MinimalEObjectImpl.Container implements ControlUnit {
	/**
     * The default value of the '{@link #getCycle() <em>Cycle</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCycle()
     * @generated
     * @ordered
     */
	protected static final short CYCLE_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getCycle() <em>Cycle</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCycle()
     * @generated
     * @ordered
     */
	protected short cycle = CYCLE_EDEFAULT;

	/**
     * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPriority()
     * @generated
     * @ordered
     */
	protected static final short PRIORITY_EDEFAULT = 0;

	/**
     * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPriority()
     * @generated
     * @ordered
     */
	protected short priority = PRIORITY_EDEFAULT;

	/**
     * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isEnabled()
     * @generated
     * @ordered
     */
	protected static final boolean ENABLED_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isEnabled()
     * @generated
     * @ordered
     */
	protected boolean enabled = ENABLED_EDEFAULT;

	/**
     * The cached value of the '{@link #getInputs() <em>Inputs</em>}' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getInputs()
     * @generated
     * @ordered
     */
	protected EList<WTCInput> inputs;

	/**
     * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOutputs()
     * @generated
     * @ordered
     */
	protected EList<WTCOutput> outputs;

	/**
     * The cached value of the '{@link #getParams() <em>Params</em>}' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getParams()
     * @generated
     * @ordered
     */
	protected EList<WTCParam> params;

	/**
     * The cached value of the '{@link #getFault() <em>Fault</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFault()
     * @generated
     * @ordered
     */
	protected WTCFault fault;

	/**
     * The cached value of the '{@link #getTimers() <em>Timers</em>}' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTimers()
     * @generated
     * @ordered
     */
	protected EList<WTCTimer> timers;

	/**
     * The cached value of the '{@link #getBhvParams() <em>Bhv Params</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBhvParams()
     * @generated
     * @ordered
     */
	protected EList<String> bhvParams;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ControlUnitImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return WTSpec4MPackage.Literals.CONTROL_UNIT;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public short getCycle() {
        return cycle;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCycle(short newCycle) {
        short oldCycle = cycle;
        cycle = newCycle;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.CONTROL_UNIT__CYCLE, oldCycle, cycle));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public short getPriority() {
        return priority;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPriority(short newPriority) {
        short oldPriority = priority;
        priority = newPriority;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.CONTROL_UNIT__PRIORITY, oldPriority, priority));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isEnabled() {
        return enabled;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setEnabled(boolean newEnabled) {
        boolean oldEnabled = enabled;
        enabled = newEnabled;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.CONTROL_UNIT__ENABLED, oldEnabled, enabled));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<WTCInput> getInputs() {
        if (inputs == null) {
            inputs = new EObjectResolvingEList<WTCInput>(WTCInput.class, this, WTSpec4MPackage.CONTROL_UNIT__INPUTS);
        }
        return inputs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<WTCOutput> getOutputs() {
        if (outputs == null) {
            outputs = new EObjectResolvingEList<WTCOutput>(WTCOutput.class, this, WTSpec4MPackage.CONTROL_UNIT__OUTPUTS);
        }
        return outputs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<WTCParam> getParams() {
        if (params == null) {
            params = new EObjectResolvingEList<WTCParam>(WTCParam.class, this, WTSpec4MPackage.CONTROL_UNIT__PARAMS);
        }
        return params;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public WTCFault getFault() {
        if (fault != null && fault.eIsProxy()) {
            InternalEObject oldFault = (InternalEObject)fault;
            fault = (WTCFault)eResolveProxy(oldFault);
            if (fault != oldFault) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, WTSpec4MPackage.CONTROL_UNIT__FAULT, oldFault, fault));
            }
        }
        return fault;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public WTCFault basicGetFault() {
        return fault;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setFault(WTCFault newFault) {
        WTCFault oldFault = fault;
        fault = newFault;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.CONTROL_UNIT__FAULT, oldFault, fault));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<WTCTimer> getTimers() {
        if (timers == null) {
            timers = new EObjectResolvingEList<WTCTimer>(WTCTimer.class, this, WTSpec4MPackage.CONTROL_UNIT__TIMERS);
        }
        return timers;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<String> getBhvParams() {
        if (bhvParams == null) {
            bhvParams = new EDataTypeUniqueEList<String>(String.class, this, WTSpec4MPackage.CONTROL_UNIT__BHV_PARAMS);
        }
        return bhvParams;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case WTSpec4MPackage.CONTROL_UNIT__CYCLE:
                return getCycle();
            case WTSpec4MPackage.CONTROL_UNIT__PRIORITY:
                return getPriority();
            case WTSpec4MPackage.CONTROL_UNIT__ENABLED:
                return isEnabled();
            case WTSpec4MPackage.CONTROL_UNIT__INPUTS:
                return getInputs();
            case WTSpec4MPackage.CONTROL_UNIT__OUTPUTS:
                return getOutputs();
            case WTSpec4MPackage.CONTROL_UNIT__PARAMS:
                return getParams();
            case WTSpec4MPackage.CONTROL_UNIT__FAULT:
                if (resolve) return getFault();
                return basicGetFault();
            case WTSpec4MPackage.CONTROL_UNIT__TIMERS:
                return getTimers();
            case WTSpec4MPackage.CONTROL_UNIT__BHV_PARAMS:
                return getBhvParams();
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
            case WTSpec4MPackage.CONTROL_UNIT__CYCLE:
                setCycle((Short)newValue);
                return;
            case WTSpec4MPackage.CONTROL_UNIT__PRIORITY:
                setPriority((Short)newValue);
                return;
            case WTSpec4MPackage.CONTROL_UNIT__ENABLED:
                setEnabled((Boolean)newValue);
                return;
            case WTSpec4MPackage.CONTROL_UNIT__INPUTS:
                getInputs().clear();
                getInputs().addAll((Collection<? extends WTCInput>)newValue);
                return;
            case WTSpec4MPackage.CONTROL_UNIT__OUTPUTS:
                getOutputs().clear();
                getOutputs().addAll((Collection<? extends WTCOutput>)newValue);
                return;
            case WTSpec4MPackage.CONTROL_UNIT__PARAMS:
                getParams().clear();
                getParams().addAll((Collection<? extends WTCParam>)newValue);
                return;
            case WTSpec4MPackage.CONTROL_UNIT__FAULT:
                setFault((WTCFault)newValue);
                return;
            case WTSpec4MPackage.CONTROL_UNIT__TIMERS:
                getTimers().clear();
                getTimers().addAll((Collection<? extends WTCTimer>)newValue);
                return;
            case WTSpec4MPackage.CONTROL_UNIT__BHV_PARAMS:
                getBhvParams().clear();
                getBhvParams().addAll((Collection<? extends String>)newValue);
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
            case WTSpec4MPackage.CONTROL_UNIT__CYCLE:
                setCycle(CYCLE_EDEFAULT);
                return;
            case WTSpec4MPackage.CONTROL_UNIT__PRIORITY:
                setPriority(PRIORITY_EDEFAULT);
                return;
            case WTSpec4MPackage.CONTROL_UNIT__ENABLED:
                setEnabled(ENABLED_EDEFAULT);
                return;
            case WTSpec4MPackage.CONTROL_UNIT__INPUTS:
                getInputs().clear();
                return;
            case WTSpec4MPackage.CONTROL_UNIT__OUTPUTS:
                getOutputs().clear();
                return;
            case WTSpec4MPackage.CONTROL_UNIT__PARAMS:
                getParams().clear();
                return;
            case WTSpec4MPackage.CONTROL_UNIT__FAULT:
                setFault((WTCFault)null);
                return;
            case WTSpec4MPackage.CONTROL_UNIT__TIMERS:
                getTimers().clear();
                return;
            case WTSpec4MPackage.CONTROL_UNIT__BHV_PARAMS:
                getBhvParams().clear();
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
            case WTSpec4MPackage.CONTROL_UNIT__CYCLE:
                return cycle != CYCLE_EDEFAULT;
            case WTSpec4MPackage.CONTROL_UNIT__PRIORITY:
                return priority != PRIORITY_EDEFAULT;
            case WTSpec4MPackage.CONTROL_UNIT__ENABLED:
                return enabled != ENABLED_EDEFAULT;
            case WTSpec4MPackage.CONTROL_UNIT__INPUTS:
                return inputs != null && !inputs.isEmpty();
            case WTSpec4MPackage.CONTROL_UNIT__OUTPUTS:
                return outputs != null && !outputs.isEmpty();
            case WTSpec4MPackage.CONTROL_UNIT__PARAMS:
                return params != null && !params.isEmpty();
            case WTSpec4MPackage.CONTROL_UNIT__FAULT:
                return fault != null;
            case WTSpec4MPackage.CONTROL_UNIT__TIMERS:
                return timers != null && !timers.isEmpty();
            case WTSpec4MPackage.CONTROL_UNIT__BHV_PARAMS:
                return bhvParams != null && !bhvParams.isEmpty();
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
        result.append(" (cycle: ");
        result.append(cycle);
        result.append(", priority: ");
        result.append(priority);
        result.append(", enabled: ");
        result.append(enabled);
        result.append(", BhvParams: ");
        result.append(bhvParams);
        result.append(')');
        return result.toString();
    }

} //ControlUnitImpl
