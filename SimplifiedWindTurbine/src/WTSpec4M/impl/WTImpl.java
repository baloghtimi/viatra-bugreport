/**
 */
package WTSpec4M.impl;

import WTSpec4M.MainSubsystem;
import WTSpec4M.SystemFault;
import WTSpec4M.SystemInput;
import WTSpec4M.SystemOutput;
import WTSpec4M.SystemParam;
import WTSpec4M.SystemTimer;
import WTSpec4M.SystemVariable;
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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WTSpec4M.impl.WTImpl#getSubsystems <em>Subsystems</em>}</li>
 *   <li>{@link WTSpec4M.impl.WTImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link WTSpec4M.impl.WTImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link WTSpec4M.impl.WTImpl#getParams <em>Params</em>}</li>
 *   <li>{@link WTSpec4M.impl.WTImpl#getTimers <em>Timers</em>}</li>
 *   <li>{@link WTSpec4M.impl.WTImpl#getFaults <em>Faults</em>}</li>
 *   <li>{@link WTSpec4M.impl.WTImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link WTSpec4M.impl.WTImpl#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WTImpl extends MinimalEObjectImpl.Container implements WT {
	/**
     * The cached value of the '{@link #getSubsystems() <em>Subsystems</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSubsystems()
     * @generated
     * @ordered
     */
	protected EList<MainSubsystem> subsystems;

	/**
     * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getInputs()
     * @generated
     * @ordered
     */
	protected EList<SystemInput> inputs;

	/**
     * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getOutputs()
     * @generated
     * @ordered
     */
	protected EList<SystemOutput> outputs;

	/**
     * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getParams()
     * @generated
     * @ordered
     */
	protected EList<SystemParam> params;

	/**
     * The cached value of the '{@link #getTimers() <em>Timers</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimers()
     * @generated
     * @ordered
     */
    protected EList<SystemTimer> timers;

    /**
     * The cached value of the '{@link #getFaults() <em>Faults</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFaults()
     * @generated
     * @ordered
     */
    protected EList<SystemFault> faults;

    /**
     * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getVariables()
     * @generated
     * @ordered
     */
	protected EList<SystemVariable> variables;

	/**
     * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModel()
     * @generated
     * @ordered
     */
    protected static final String MODEL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModel()
     * @generated
     * @ordered
     */
    protected String model = MODEL_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected WTImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return WTSpec4MPackage.Literals.WT;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<MainSubsystem> getSubsystems() {
        if (subsystems == null) {
            subsystems = new EObjectContainmentEList<MainSubsystem>(MainSubsystem.class, this, WTSpec4MPackage.WT__SUBSYSTEMS);
        }
        return subsystems;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SystemInput> getInputs() {
        if (inputs == null) {
            inputs = new EObjectContainmentEList<SystemInput>(SystemInput.class, this, WTSpec4MPackage.WT__INPUTS);
        }
        return inputs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SystemOutput> getOutputs() {
        if (outputs == null) {
            outputs = new EObjectContainmentEList<SystemOutput>(SystemOutput.class, this, WTSpec4MPackage.WT__OUTPUTS);
        }
        return outputs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SystemParam> getParams() {
        if (params == null) {
            params = new EObjectContainmentEList<SystemParam>(SystemParam.class, this, WTSpec4MPackage.WT__PARAMS);
        }
        return params;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SystemTimer> getTimers() {
        if (timers == null) {
            timers = new EObjectContainmentEList<SystemTimer>(SystemTimer.class, this, WTSpec4MPackage.WT__TIMERS);
        }
        return timers;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SystemFault> getFaults() {
        if (faults == null) {
            faults = new EObjectContainmentEList<SystemFault>(SystemFault.class, this, WTSpec4MPackage.WT__FAULTS);
        }
        return faults;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<SystemVariable> getVariables() {
        if (variables == null) {
            variables = new EObjectContainmentEList<SystemVariable>(SystemVariable.class, this, WTSpec4MPackage.WT__VARIABLES);
        }
        return variables;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getModel() {
        return model;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModel(String newModel) {
        String oldModel = model;
        model = newModel;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, WTSpec4MPackage.WT__MODEL, oldModel, model));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case WTSpec4MPackage.WT__SUBSYSTEMS:
                return ((InternalEList<?>)getSubsystems()).basicRemove(otherEnd, msgs);
            case WTSpec4MPackage.WT__INPUTS:
                return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
            case WTSpec4MPackage.WT__OUTPUTS:
                return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
            case WTSpec4MPackage.WT__PARAMS:
                return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
            case WTSpec4MPackage.WT__TIMERS:
                return ((InternalEList<?>)getTimers()).basicRemove(otherEnd, msgs);
            case WTSpec4MPackage.WT__FAULTS:
                return ((InternalEList<?>)getFaults()).basicRemove(otherEnd, msgs);
            case WTSpec4MPackage.WT__VARIABLES:
                return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
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
            case WTSpec4MPackage.WT__SUBSYSTEMS:
                return getSubsystems();
            case WTSpec4MPackage.WT__INPUTS:
                return getInputs();
            case WTSpec4MPackage.WT__OUTPUTS:
                return getOutputs();
            case WTSpec4MPackage.WT__PARAMS:
                return getParams();
            case WTSpec4MPackage.WT__TIMERS:
                return getTimers();
            case WTSpec4MPackage.WT__FAULTS:
                return getFaults();
            case WTSpec4MPackage.WT__VARIABLES:
                return getVariables();
            case WTSpec4MPackage.WT__MODEL:
                return getModel();
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
            case WTSpec4MPackage.WT__SUBSYSTEMS:
                getSubsystems().clear();
                getSubsystems().addAll((Collection<? extends MainSubsystem>)newValue);
                return;
            case WTSpec4MPackage.WT__INPUTS:
                getInputs().clear();
                getInputs().addAll((Collection<? extends SystemInput>)newValue);
                return;
            case WTSpec4MPackage.WT__OUTPUTS:
                getOutputs().clear();
                getOutputs().addAll((Collection<? extends SystemOutput>)newValue);
                return;
            case WTSpec4MPackage.WT__PARAMS:
                getParams().clear();
                getParams().addAll((Collection<? extends SystemParam>)newValue);
                return;
            case WTSpec4MPackage.WT__TIMERS:
                getTimers().clear();
                getTimers().addAll((Collection<? extends SystemTimer>)newValue);
                return;
            case WTSpec4MPackage.WT__FAULTS:
                getFaults().clear();
                getFaults().addAll((Collection<? extends SystemFault>)newValue);
                return;
            case WTSpec4MPackage.WT__VARIABLES:
                getVariables().clear();
                getVariables().addAll((Collection<? extends SystemVariable>)newValue);
                return;
            case WTSpec4MPackage.WT__MODEL:
                setModel((String)newValue);
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
            case WTSpec4MPackage.WT__SUBSYSTEMS:
                getSubsystems().clear();
                return;
            case WTSpec4MPackage.WT__INPUTS:
                getInputs().clear();
                return;
            case WTSpec4MPackage.WT__OUTPUTS:
                getOutputs().clear();
                return;
            case WTSpec4MPackage.WT__PARAMS:
                getParams().clear();
                return;
            case WTSpec4MPackage.WT__TIMERS:
                getTimers().clear();
                return;
            case WTSpec4MPackage.WT__FAULTS:
                getFaults().clear();
                return;
            case WTSpec4MPackage.WT__VARIABLES:
                getVariables().clear();
                return;
            case WTSpec4MPackage.WT__MODEL:
                setModel(MODEL_EDEFAULT);
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
            case WTSpec4MPackage.WT__SUBSYSTEMS:
                return subsystems != null && !subsystems.isEmpty();
            case WTSpec4MPackage.WT__INPUTS:
                return inputs != null && !inputs.isEmpty();
            case WTSpec4MPackage.WT__OUTPUTS:
                return outputs != null && !outputs.isEmpty();
            case WTSpec4MPackage.WT__PARAMS:
                return params != null && !params.isEmpty();
            case WTSpec4MPackage.WT__TIMERS:
                return timers != null && !timers.isEmpty();
            case WTSpec4MPackage.WT__FAULTS:
                return faults != null && !faults.isEmpty();
            case WTSpec4MPackage.WT__VARIABLES:
                return variables != null && !variables.isEmpty();
            case WTSpec4MPackage.WT__MODEL:
                return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
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
        result.append(" (model: ");
        result.append(model);
        result.append(')');
        return result.toString();
    }

} //WTImpl
