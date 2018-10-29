/**
 */
package WTSpec4M.impl;

import WTSpec4M.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WTSpec4MFactoryImpl extends EFactoryImpl implements WTSpec4MFactory {
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static WTSpec4MFactory init() {
        try {
            WTSpec4MFactory theWTSpec4MFactory = (WTSpec4MFactory)EPackage.Registry.INSTANCE.getEFactory(WTSpec4MPackage.eNS_URI);
            if (theWTSpec4MFactory != null) {
                return theWTSpec4MFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new WTSpec4MFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public WTSpec4MFactoryImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case WTSpec4MPackage.WT: return createWT();
            case WTSpec4MPackage.SYSTEM_INPUT: return createSystemInput();
            case WTSpec4MPackage.SYSTEM_OUTPUT: return createSystemOutput();
            case WTSpec4MPackage.SYSTEM_FAULT: return createSystemFault();
            case WTSpec4MPackage.SYSTEM_PARAM: return createSystemParam();
            case WTSpec4MPackage.SYSTEM_TIMER: return createSystemTimer();
            case WTSpec4MPackage.SYSTEM_VARIABLE: return createSystemVariable();
            case WTSpec4MPackage.SUBSYSTEM: return createSubsystem();
            case WTSpec4MPackage.CONTROL_UNIT: return createControlUnit();
            case WTSpec4MPackage.MAIN_SUBSYSTEM: return createMainSubsystem();
            case WTSpec4MPackage.AUTHORIZED_SYSTEM: return createAuthorizedSystem();
            case WTSpec4MPackage.OWNERSHIP: return createOwnership();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case WTSpec4MPackage.SPECIALIST_KIND:
                return createSpecialistKindFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case WTSpec4MPackage.SPECIALIST_KIND:
                return convertSpecialistKindToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public WT createWT() {
        WTImpl wt = new WTImpl();
        return wt;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SystemInput createSystemInput() {
        SystemInputImpl systemInput = new SystemInputImpl();
        return systemInput;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SystemOutput createSystemOutput() {
        SystemOutputImpl systemOutput = new SystemOutputImpl();
        return systemOutput;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SystemFault createSystemFault() {
        SystemFaultImpl systemFault = new SystemFaultImpl();
        return systemFault;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SystemParam createSystemParam() {
        SystemParamImpl systemParam = new SystemParamImpl();
        return systemParam;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SystemTimer createSystemTimer() {
        SystemTimerImpl systemTimer = new SystemTimerImpl();
        return systemTimer;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SystemVariable createSystemVariable() {
        SystemVariableImpl systemVariable = new SystemVariableImpl();
        return systemVariable;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Subsystem createSubsystem() {
        SubsystemImpl subsystem = new SubsystemImpl();
        return subsystem;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ControlUnit createControlUnit() {
        ControlUnitImpl controlUnit = new ControlUnitImpl();
        return controlUnit;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MainSubsystem createMainSubsystem() {
        MainSubsystemImpl mainSubsystem = new MainSubsystemImpl();
        return mainSubsystem;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AuthorizedSystem createAuthorizedSystem() {
        AuthorizedSystemImpl authorizedSystem = new AuthorizedSystemImpl();
        return authorizedSystem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Ownership createOwnership() {
        OwnershipImpl ownership = new OwnershipImpl();
        return ownership;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecialistKind createSpecialistKindFromString(EDataType eDataType, String initialValue) {
        SpecialistKind result = SpecialistKind.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSpecialistKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public WTSpec4MPackage getWTSpec4MPackage() {
        return (WTSpec4MPackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static WTSpec4MPackage getPackage() {
        return WTSpec4MPackage.eINSTANCE;
    }

} //WTSpec4MFactoryImpl
