/**
 */
package WTSpec4M;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see WTSpec4M.WTSpec4MFactory
 * @model kind="package"
 * @generated
 */
public interface WTSpec4MPackage extends EPackage {
	/**
     * The package name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNAME = "WTSpec4M";

	/**
     * The package namespace URI.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_URI = "http://WTSpec4M/5.0";

	/**
     * The package namespace name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_PREFIX = "wtc";

	/**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	WTSpec4MPackage eINSTANCE = WTSpec4M.impl.WTSpec4MPackageImpl.init();

	/**
     * The meta object id for the '{@link WTSpec4M.impl.WTImpl <em>WT</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see WTSpec4M.impl.WTImpl
     * @see WTSpec4M.impl.WTSpec4MPackageImpl#getWT()
     * @generated
     */
	int WT = 0;

	/**
     * The feature id for the '<em><b>Subsystems</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WT__SUBSYSTEMS = 0;

	/**
     * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WT__INPUTS = 1;

	/**
     * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WT__OUTPUTS = 2;

	/**
     * The feature id for the '<em><b>Params</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WT__PARAMS = 3;

	/**
     * The feature id for the '<em><b>Timers</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WT__TIMERS = 4;

    /**
     * The feature id for the '<em><b>Faults</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WT__FAULTS = 5;

    /**
     * The feature id for the '<em><b>Variables</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WT__VARIABLES = 6;

	/**
     * The feature id for the '<em><b>Model</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WT__MODEL = 7;

    /**
     * The number of structural features of the '<em>WT</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WT_FEATURE_COUNT = 8;

	/**
     * The number of operations of the '<em>WT</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WT_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link WTSpec4M.impl.WTCInputImpl <em>WTC Input</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see WTSpec4M.impl.WTCInputImpl
     * @see WTSpec4M.impl.WTSpec4MPackageImpl#getWTCInput()
     * @generated
     */
	int WTC_INPUT = 7;

	/**
     * The number of structural features of the '<em>WTC Input</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WTC_INPUT_FEATURE_COUNT = 0;

	/**
     * The number of operations of the '<em>WTC Input</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WTC_INPUT_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link WTSpec4M.impl.SystemInputImpl <em>System Input</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see WTSpec4M.impl.SystemInputImpl
     * @see WTSpec4M.impl.WTSpec4MPackageImpl#getSystemInput()
     * @generated
     */
	int SYSTEM_INPUT = 1;

	/**
     * The number of structural features of the '<em>System Input</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYSTEM_INPUT_FEATURE_COUNT = WTC_INPUT_FEATURE_COUNT + 0;

	/**
     * The number of operations of the '<em>System Input</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYSTEM_INPUT_OPERATION_COUNT = WTC_INPUT_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link WTSpec4M.impl.WTCOutputImpl <em>WTC Output</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see WTSpec4M.impl.WTCOutputImpl
     * @see WTSpec4M.impl.WTSpec4MPackageImpl#getWTCOutput()
     * @generated
     */
	int WTC_OUTPUT = 8;

	/**
     * The number of structural features of the '<em>WTC Output</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WTC_OUTPUT_FEATURE_COUNT = 0;

	/**
     * The number of operations of the '<em>WTC Output</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WTC_OUTPUT_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link WTSpec4M.impl.SystemOutputImpl <em>System Output</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see WTSpec4M.impl.SystemOutputImpl
     * @see WTSpec4M.impl.WTSpec4MPackageImpl#getSystemOutput()
     * @generated
     */
	int SYSTEM_OUTPUT = 2;

	/**
     * The number of structural features of the '<em>System Output</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYSTEM_OUTPUT_FEATURE_COUNT = WTC_OUTPUT_FEATURE_COUNT + 0;

	/**
     * The number of operations of the '<em>System Output</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYSTEM_OUTPUT_OPERATION_COUNT = WTC_OUTPUT_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link WTSpec4M.impl.WTCFaultImpl <em>WTC Fault</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see WTSpec4M.impl.WTCFaultImpl
     * @see WTSpec4M.impl.WTSpec4MPackageImpl#getWTCFault()
     * @generated
     */
	int WTC_FAULT = 11;

	/**
     * The number of structural features of the '<em>WTC Fault</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WTC_FAULT_FEATURE_COUNT = 0;

	/**
     * The number of operations of the '<em>WTC Fault</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WTC_FAULT_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link WTSpec4M.impl.SystemFaultImpl <em>System Fault</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see WTSpec4M.impl.SystemFaultImpl
     * @see WTSpec4M.impl.WTSpec4MPackageImpl#getSystemFault()
     * @generated
     */
	int SYSTEM_FAULT = 3;

	/**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYSTEM_FAULT__VALUE = WTC_FAULT_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>System Fault</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYSTEM_FAULT_FEATURE_COUNT = WTC_FAULT_FEATURE_COUNT + 1;

	/**
     * The number of operations of the '<em>System Fault</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYSTEM_FAULT_OPERATION_COUNT = WTC_FAULT_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link WTSpec4M.impl.WTCParamImpl <em>WTC Param</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see WTSpec4M.impl.WTCParamImpl
     * @see WTSpec4M.impl.WTSpec4MPackageImpl#getWTCParam()
     * @generated
     */
	int WTC_PARAM = 9;

	/**
     * The number of structural features of the '<em>WTC Param</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WTC_PARAM_FEATURE_COUNT = 0;

	/**
     * The number of operations of the '<em>WTC Param</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WTC_PARAM_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link WTSpec4M.impl.SystemParamImpl <em>System Param</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see WTSpec4M.impl.SystemParamImpl
     * @see WTSpec4M.impl.WTSpec4MPackageImpl#getSystemParam()
     * @generated
     */
	int SYSTEM_PARAM = 4;

	/**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYSTEM_PARAM__VALUE = WTC_PARAM_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Settable</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYSTEM_PARAM__SETTABLE = WTC_PARAM_FEATURE_COUNT + 1;

	/**
     * The number of structural features of the '<em>System Param</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYSTEM_PARAM_FEATURE_COUNT = WTC_PARAM_FEATURE_COUNT + 2;

	/**
     * The number of operations of the '<em>System Param</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYSTEM_PARAM_OPERATION_COUNT = WTC_PARAM_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link WTSpec4M.impl.WTCTimerImpl <em>WTC Timer</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see WTSpec4M.impl.WTCTimerImpl
     * @see WTSpec4M.impl.WTSpec4MPackageImpl#getWTCTimer()
     * @generated
     */
	int WTC_TIMER = 10;

	/**
     * The number of structural features of the '<em>WTC Timer</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WTC_TIMER_FEATURE_COUNT = 0;

	/**
     * The number of operations of the '<em>WTC Timer</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int WTC_TIMER_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link WTSpec4M.impl.SystemTimerImpl <em>System Timer</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see WTSpec4M.impl.SystemTimerImpl
     * @see WTSpec4M.impl.WTSpec4MPackageImpl#getSystemTimer()
     * @generated
     */
	int SYSTEM_TIMER = 5;

	/**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYSTEM_TIMER__VALUE = WTC_TIMER_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>System Timer</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYSTEM_TIMER_FEATURE_COUNT = WTC_TIMER_FEATURE_COUNT + 1;

	/**
     * The number of operations of the '<em>System Timer</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYSTEM_TIMER_OPERATION_COUNT = WTC_TIMER_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link WTSpec4M.impl.SystemVariableImpl <em>System Variable</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see WTSpec4M.impl.SystemVariableImpl
     * @see WTSpec4M.impl.WTSpec4MPackageImpl#getSystemVariable()
     * @generated
     */
	int SYSTEM_VARIABLE = 6;

	/**
     * The number of structural features of the '<em>System Variable</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYSTEM_VARIABLE_FEATURE_COUNT = WTC_INPUT_FEATURE_COUNT + 0;

	/**
     * The number of operations of the '<em>System Variable</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SYSTEM_VARIABLE_OPERATION_COUNT = WTC_INPUT_OPERATION_COUNT + 0;

	/**
     * The meta object id for the '{@link WTSpec4M.impl.SubsystemImpl <em>Subsystem</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see WTSpec4M.impl.SubsystemImpl
     * @see WTSpec4M.impl.WTSpec4MPackageImpl#getSubsystem()
     * @generated
     */
	int SUBSYSTEM = 12;

	/**
     * The feature id for the '<em><b>Control Units</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SUBSYSTEM__CONTROL_UNITS = 0;

	/**
     * The feature id for the '<em><b>Subsystems</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SUBSYSTEM__SUBSYSTEMS = 1;

	/**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUBSYSTEM__DESCRIPTION = 2;

    /**
     * The number of structural features of the '<em>Subsystem</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SUBSYSTEM_FEATURE_COUNT = 3;

	/**
     * The number of operations of the '<em>Subsystem</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SUBSYSTEM_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link WTSpec4M.impl.ControlUnitImpl <em>Control Unit</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see WTSpec4M.impl.ControlUnitImpl
     * @see WTSpec4M.impl.WTSpec4MPackageImpl#getControlUnit()
     * @generated
     */
	int CONTROL_UNIT = 13;

	/**
     * The feature id for the '<em><b>Cycle</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTROL_UNIT__CYCLE = 0;

	/**
     * The feature id for the '<em><b>Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTROL_UNIT__PRIORITY = 1;

	/**
     * The feature id for the '<em><b>Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTROL_UNIT__ENABLED = 2;

	/**
     * The feature id for the '<em><b>Inputs</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTROL_UNIT__INPUTS = 3;

	/**
     * The feature id for the '<em><b>Outputs</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTROL_UNIT__OUTPUTS = 4;

	/**
     * The feature id for the '<em><b>Params</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTROL_UNIT__PARAMS = 5;

	/**
     * The feature id for the '<em><b>Fault</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTROL_UNIT__FAULT = 6;

	/**
     * The feature id for the '<em><b>Timers</b></em>' reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTROL_UNIT__TIMERS = 7;

	/**
     * The feature id for the '<em><b>Bhv Params</b></em>' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTROL_UNIT__BHV_PARAMS = 8;

	/**
     * The number of structural features of the '<em>Control Unit</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTROL_UNIT_FEATURE_COUNT = 9;

	/**
     * The number of operations of the '<em>Control Unit</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int CONTROL_UNIT_OPERATION_COUNT = 0;

	/**
     * The meta object id for the '{@link WTSpec4M.impl.MainSubsystemImpl <em>Main Subsystem</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see WTSpec4M.impl.MainSubsystemImpl
     * @see WTSpec4M.impl.WTSpec4MPackageImpl#getMainSubsystem()
     * @generated
     */
	int MAIN_SUBSYSTEM = 14;

	/**
     * The feature id for the '<em><b>Control Units</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAIN_SUBSYSTEM__CONTROL_UNITS = SUBSYSTEM__CONTROL_UNITS;

	/**
     * The feature id for the '<em><b>Subsystems</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAIN_SUBSYSTEM__SUBSYSTEMS = SUBSYSTEM__SUBSYSTEMS;

	/**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MAIN_SUBSYSTEM__DESCRIPTION = SUBSYSTEM__DESCRIPTION;

    /**
     * The number of structural features of the '<em>Main Subsystem</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAIN_SUBSYSTEM_FEATURE_COUNT = SUBSYSTEM_FEATURE_COUNT + 0;

	/**
     * The number of operations of the '<em>Main Subsystem</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MAIN_SUBSYSTEM_OPERATION_COUNT = SUBSYSTEM_OPERATION_COUNT + 0;


	/**
     * The meta object id for the '{@link WTSpec4M.impl.AuthorizedSystemImpl <em>Authorized System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see WTSpec4M.impl.AuthorizedSystemImpl
     * @see WTSpec4M.impl.WTSpec4MPackageImpl#getAuthorizedSystem()
     * @generated
     */
    int AUTHORIZED_SYSTEM = 15;

    /**
     * The feature id for the '<em><b>Wt System</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHORIZED_SYSTEM__WT_SYSTEM = 0;

    /**
     * The feature id for the '<em><b>Protected</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHORIZED_SYSTEM__PROTECTED = 1;

    /**
     * The feature id for the '<em><b>Ownerships</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHORIZED_SYSTEM__OWNERSHIPS = 2;

    /**
     * The number of structural features of the '<em>Authorized System</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHORIZED_SYSTEM_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Authorized System</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHORIZED_SYSTEM_OPERATION_COUNT = 0;


    /**
     * The meta object id for the '{@link WTSpec4M.impl.OwnershipImpl <em>Ownership</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see WTSpec4M.impl.OwnershipImpl
     * @see WTSpec4M.impl.WTSpec4MPackageImpl#getOwnership()
     * @generated
     */
    int OWNERSHIP = 16;

    /**
     * The feature id for the '<em><b>Owned</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNERSHIP__OWNED = 0;

    /**
     * The feature id for the '<em><b>Owner</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNERSHIP__OWNER = 1;

    /**
     * The number of structural features of the '<em>Ownership</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNERSHIP_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Ownership</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OWNERSHIP_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link WTSpec4M.SpecialistKind <em>Specialist Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see WTSpec4M.SpecialistKind
     * @see WTSpec4M.impl.WTSpec4MPackageImpl#getSpecialistKind()
     * @generated
     */
    int SPECIALIST_KIND = 17;


    /**
     * Returns the meta object for class '{@link WTSpec4M.WT <em>WT</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>WT</em>'.
     * @see WTSpec4M.WT
     * @generated
     */
	EClass getWT();

	/**
     * Returns the meta object for the containment reference list '{@link WTSpec4M.WT#getSubsystems <em>Subsystems</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Subsystems</em>'.
     * @see WTSpec4M.WT#getSubsystems()
     * @see #getWT()
     * @generated
     */
	EReference getWT_Subsystems();

	/**
     * Returns the meta object for the containment reference list '{@link WTSpec4M.WT#getInputs <em>Inputs</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Inputs</em>'.
     * @see WTSpec4M.WT#getInputs()
     * @see #getWT()
     * @generated
     */
	EReference getWT_Inputs();

	/**
     * Returns the meta object for the containment reference list '{@link WTSpec4M.WT#getOutputs <em>Outputs</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Outputs</em>'.
     * @see WTSpec4M.WT#getOutputs()
     * @see #getWT()
     * @generated
     */
	EReference getWT_Outputs();

	/**
     * Returns the meta object for the containment reference list '{@link WTSpec4M.WT#getParams <em>Params</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Params</em>'.
     * @see WTSpec4M.WT#getParams()
     * @see #getWT()
     * @generated
     */
	EReference getWT_Params();

	/**
     * Returns the meta object for the containment reference list '{@link WTSpec4M.WT#getTimers <em>Timers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Timers</em>'.
     * @see WTSpec4M.WT#getTimers()
     * @see #getWT()
     * @generated
     */
    EReference getWT_Timers();

    /**
     * Returns the meta object for the containment reference list '{@link WTSpec4M.WT#getFaults <em>Faults</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Faults</em>'.
     * @see WTSpec4M.WT#getFaults()
     * @see #getWT()
     * @generated
     */
    EReference getWT_Faults();

    /**
     * Returns the meta object for the containment reference list '{@link WTSpec4M.WT#getVariables <em>Variables</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Variables</em>'.
     * @see WTSpec4M.WT#getVariables()
     * @see #getWT()
     * @generated
     */
	EReference getWT_Variables();

	/**
     * Returns the meta object for the attribute '{@link WTSpec4M.WT#getModel <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Model</em>'.
     * @see WTSpec4M.WT#getModel()
     * @see #getWT()
     * @generated
     */
    EAttribute getWT_Model();

    /**
     * Returns the meta object for class '{@link WTSpec4M.SystemInput <em>System Input</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>System Input</em>'.
     * @see WTSpec4M.SystemInput
     * @generated
     */
	EClass getSystemInput();

	/**
     * Returns the meta object for class '{@link WTSpec4M.SystemOutput <em>System Output</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>System Output</em>'.
     * @see WTSpec4M.SystemOutput
     * @generated
     */
	EClass getSystemOutput();

	/**
     * Returns the meta object for class '{@link WTSpec4M.SystemFault <em>System Fault</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>System Fault</em>'.
     * @see WTSpec4M.SystemFault
     * @generated
     */
	EClass getSystemFault();

	/**
     * Returns the meta object for the attribute '{@link WTSpec4M.SystemFault#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see WTSpec4M.SystemFault#getValue()
     * @see #getSystemFault()
     * @generated
     */
	EAttribute getSystemFault_Value();

	/**
     * Returns the meta object for class '{@link WTSpec4M.SystemParam <em>System Param</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>System Param</em>'.
     * @see WTSpec4M.SystemParam
     * @generated
     */
	EClass getSystemParam();

	/**
     * Returns the meta object for the attribute '{@link WTSpec4M.SystemParam#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see WTSpec4M.SystemParam#getValue()
     * @see #getSystemParam()
     * @generated
     */
	EAttribute getSystemParam_Value();

	/**
     * Returns the meta object for the attribute '{@link WTSpec4M.SystemParam#isSettable <em>Settable</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Settable</em>'.
     * @see WTSpec4M.SystemParam#isSettable()
     * @see #getSystemParam()
     * @generated
     */
	EAttribute getSystemParam_Settable();

	/**
     * Returns the meta object for class '{@link WTSpec4M.SystemTimer <em>System Timer</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>System Timer</em>'.
     * @see WTSpec4M.SystemTimer
     * @generated
     */
	EClass getSystemTimer();

	/**
     * Returns the meta object for the attribute '{@link WTSpec4M.SystemTimer#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see WTSpec4M.SystemTimer#getValue()
     * @see #getSystemTimer()
     * @generated
     */
	EAttribute getSystemTimer_Value();

	/**
     * Returns the meta object for class '{@link WTSpec4M.SystemVariable <em>System Variable</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>System Variable</em>'.
     * @see WTSpec4M.SystemVariable
     * @generated
     */
	EClass getSystemVariable();

	/**
     * Returns the meta object for class '{@link WTSpec4M.WTCInput <em>WTC Input</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>WTC Input</em>'.
     * @see WTSpec4M.WTCInput
     * @generated
     */
	EClass getWTCInput();

	/**
     * Returns the meta object for class '{@link WTSpec4M.WTCOutput <em>WTC Output</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>WTC Output</em>'.
     * @see WTSpec4M.WTCOutput
     * @generated
     */
	EClass getWTCOutput();

	/**
     * Returns the meta object for class '{@link WTSpec4M.WTCParam <em>WTC Param</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>WTC Param</em>'.
     * @see WTSpec4M.WTCParam
     * @generated
     */
	EClass getWTCParam();

	/**
     * Returns the meta object for class '{@link WTSpec4M.WTCTimer <em>WTC Timer</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>WTC Timer</em>'.
     * @see WTSpec4M.WTCTimer
     * @generated
     */
	EClass getWTCTimer();

	/**
     * Returns the meta object for class '{@link WTSpec4M.WTCFault <em>WTC Fault</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>WTC Fault</em>'.
     * @see WTSpec4M.WTCFault
     * @generated
     */
	EClass getWTCFault();

	/**
     * Returns the meta object for class '{@link WTSpec4M.Subsystem <em>Subsystem</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Subsystem</em>'.
     * @see WTSpec4M.Subsystem
     * @generated
     */
	EClass getSubsystem();

	/**
     * Returns the meta object for the containment reference list '{@link WTSpec4M.Subsystem#getControlUnits <em>Control Units</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Control Units</em>'.
     * @see WTSpec4M.Subsystem#getControlUnits()
     * @see #getSubsystem()
     * @generated
     */
	EReference getSubsystem_ControlUnits();

	/**
     * Returns the meta object for the containment reference list '{@link WTSpec4M.Subsystem#getSubsystems <em>Subsystems</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Subsystems</em>'.
     * @see WTSpec4M.Subsystem#getSubsystems()
     * @see #getSubsystem()
     * @generated
     */
	EReference getSubsystem_Subsystems();

	/**
     * Returns the meta object for the attribute '{@link WTSpec4M.Subsystem#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see WTSpec4M.Subsystem#getDescription()
     * @see #getSubsystem()
     * @generated
     */
    EAttribute getSubsystem_Description();

    /**
     * Returns the meta object for class '{@link WTSpec4M.ControlUnit <em>Control Unit</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Control Unit</em>'.
     * @see WTSpec4M.ControlUnit
     * @generated
     */
	EClass getControlUnit();

	/**
     * Returns the meta object for the attribute '{@link WTSpec4M.ControlUnit#getCycle <em>Cycle</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cycle</em>'.
     * @see WTSpec4M.ControlUnit#getCycle()
     * @see #getControlUnit()
     * @generated
     */
	EAttribute getControlUnit_Cycle();

	/**
     * Returns the meta object for the attribute '{@link WTSpec4M.ControlUnit#getPriority <em>Priority</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Priority</em>'.
     * @see WTSpec4M.ControlUnit#getPriority()
     * @see #getControlUnit()
     * @generated
     */
	EAttribute getControlUnit_Priority();

	/**
     * Returns the meta object for the attribute '{@link WTSpec4M.ControlUnit#isEnabled <em>Enabled</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Enabled</em>'.
     * @see WTSpec4M.ControlUnit#isEnabled()
     * @see #getControlUnit()
     * @generated
     */
	EAttribute getControlUnit_Enabled();

	/**
     * Returns the meta object for the reference list '{@link WTSpec4M.ControlUnit#getInputs <em>Inputs</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Inputs</em>'.
     * @see WTSpec4M.ControlUnit#getInputs()
     * @see #getControlUnit()
     * @generated
     */
	EReference getControlUnit_Inputs();

	/**
     * Returns the meta object for the reference list '{@link WTSpec4M.ControlUnit#getOutputs <em>Outputs</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Outputs</em>'.
     * @see WTSpec4M.ControlUnit#getOutputs()
     * @see #getControlUnit()
     * @generated
     */
	EReference getControlUnit_Outputs();

	/**
     * Returns the meta object for the reference list '{@link WTSpec4M.ControlUnit#getParams <em>Params</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Params</em>'.
     * @see WTSpec4M.ControlUnit#getParams()
     * @see #getControlUnit()
     * @generated
     */
	EReference getControlUnit_Params();

	/**
     * Returns the meta object for the reference '{@link WTSpec4M.ControlUnit#getFault <em>Fault</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Fault</em>'.
     * @see WTSpec4M.ControlUnit#getFault()
     * @see #getControlUnit()
     * @generated
     */
	EReference getControlUnit_Fault();

	/**
     * Returns the meta object for the reference list '{@link WTSpec4M.ControlUnit#getTimers <em>Timers</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Timers</em>'.
     * @see WTSpec4M.ControlUnit#getTimers()
     * @see #getControlUnit()
     * @generated
     */
	EReference getControlUnit_Timers();

	/**
     * Returns the meta object for the attribute list '{@link WTSpec4M.ControlUnit#getBhvParams <em>Bhv Params</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Bhv Params</em>'.
     * @see WTSpec4M.ControlUnit#getBhvParams()
     * @see #getControlUnit()
     * @generated
     */
	EAttribute getControlUnit_BhvParams();

	/**
     * Returns the meta object for class '{@link WTSpec4M.MainSubsystem <em>Main Subsystem</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Main Subsystem</em>'.
     * @see WTSpec4M.MainSubsystem
     * @generated
     */
	EClass getMainSubsystem();

	/**
     * Returns the meta object for class '{@link WTSpec4M.AuthorizedSystem <em>Authorized System</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Authorized System</em>'.
     * @see WTSpec4M.AuthorizedSystem
     * @generated
     */
    EClass getAuthorizedSystem();

    /**
     * Returns the meta object for the containment reference '{@link WTSpec4M.AuthorizedSystem#getWtSystem <em>Wt System</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Wt System</em>'.
     * @see WTSpec4M.AuthorizedSystem#getWtSystem()
     * @see #getAuthorizedSystem()
     * @generated
     */
    EReference getAuthorizedSystem_WtSystem();

    /**
     * Returns the meta object for the reference list '{@link WTSpec4M.AuthorizedSystem#getProtected <em>Protected</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Protected</em>'.
     * @see WTSpec4M.AuthorizedSystem#getProtected()
     * @see #getAuthorizedSystem()
     * @generated
     */
    EReference getAuthorizedSystem_Protected();

    /**
     * Returns the meta object for the containment reference list '{@link WTSpec4M.AuthorizedSystem#getOwnerships <em>Ownerships</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Ownerships</em>'.
     * @see WTSpec4M.AuthorizedSystem#getOwnerships()
     * @see #getAuthorizedSystem()
     * @generated
     */
    EReference getAuthorizedSystem_Ownerships();

    /**
     * Returns the meta object for class '{@link WTSpec4M.Ownership <em>Ownership</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Ownership</em>'.
     * @see WTSpec4M.Ownership
     * @generated
     */
    EClass getOwnership();

    /**
     * Returns the meta object for the reference '{@link WTSpec4M.Ownership#getOwned <em>Owned</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Owned</em>'.
     * @see WTSpec4M.Ownership#getOwned()
     * @see #getOwnership()
     * @generated
     */
    EReference getOwnership_Owned();

    /**
     * Returns the meta object for the attribute '{@link WTSpec4M.Ownership#getOwner <em>Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Owner</em>'.
     * @see WTSpec4M.Ownership#getOwner()
     * @see #getOwnership()
     * @generated
     */
    EAttribute getOwnership_Owner();

    /**
     * Returns the meta object for enum '{@link WTSpec4M.SpecialistKind <em>Specialist Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Specialist Kind</em>'.
     * @see WTSpec4M.SpecialistKind
     * @generated
     */
    EEnum getSpecialistKind();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
	WTSpec4MFactory getWTSpec4MFactory();

	/**
     * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
     * @generated
     */
	interface Literals {
		/**
         * The meta object literal for the '{@link WTSpec4M.impl.WTImpl <em>WT</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see WTSpec4M.impl.WTImpl
         * @see WTSpec4M.impl.WTSpec4MPackageImpl#getWT()
         * @generated
         */
		EClass WT = eINSTANCE.getWT();

		/**
         * The meta object literal for the '<em><b>Subsystems</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference WT__SUBSYSTEMS = eINSTANCE.getWT_Subsystems();

		/**
         * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference WT__INPUTS = eINSTANCE.getWT_Inputs();

		/**
         * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference WT__OUTPUTS = eINSTANCE.getWT_Outputs();

		/**
         * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference WT__PARAMS = eINSTANCE.getWT_Params();

		/**
         * The meta object literal for the '<em><b>Timers</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WT__TIMERS = eINSTANCE.getWT_Timers();

        /**
         * The meta object literal for the '<em><b>Faults</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WT__FAULTS = eINSTANCE.getWT_Faults();

        /**
         * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference WT__VARIABLES = eINSTANCE.getWT_Variables();

		/**
         * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WT__MODEL = eINSTANCE.getWT_Model();

        /**
         * The meta object literal for the '{@link WTSpec4M.impl.SystemInputImpl <em>System Input</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see WTSpec4M.impl.SystemInputImpl
         * @see WTSpec4M.impl.WTSpec4MPackageImpl#getSystemInput()
         * @generated
         */
		EClass SYSTEM_INPUT = eINSTANCE.getSystemInput();

		/**
         * The meta object literal for the '{@link WTSpec4M.impl.SystemOutputImpl <em>System Output</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see WTSpec4M.impl.SystemOutputImpl
         * @see WTSpec4M.impl.WTSpec4MPackageImpl#getSystemOutput()
         * @generated
         */
		EClass SYSTEM_OUTPUT = eINSTANCE.getSystemOutput();

		/**
         * The meta object literal for the '{@link WTSpec4M.impl.SystemFaultImpl <em>System Fault</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see WTSpec4M.impl.SystemFaultImpl
         * @see WTSpec4M.impl.WTSpec4MPackageImpl#getSystemFault()
         * @generated
         */
		EClass SYSTEM_FAULT = eINSTANCE.getSystemFault();

		/**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SYSTEM_FAULT__VALUE = eINSTANCE.getSystemFault_Value();

		/**
         * The meta object literal for the '{@link WTSpec4M.impl.SystemParamImpl <em>System Param</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see WTSpec4M.impl.SystemParamImpl
         * @see WTSpec4M.impl.WTSpec4MPackageImpl#getSystemParam()
         * @generated
         */
		EClass SYSTEM_PARAM = eINSTANCE.getSystemParam();

		/**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SYSTEM_PARAM__VALUE = eINSTANCE.getSystemParam_Value();

		/**
         * The meta object literal for the '<em><b>Settable</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SYSTEM_PARAM__SETTABLE = eINSTANCE.getSystemParam_Settable();

		/**
         * The meta object literal for the '{@link WTSpec4M.impl.SystemTimerImpl <em>System Timer</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see WTSpec4M.impl.SystemTimerImpl
         * @see WTSpec4M.impl.WTSpec4MPackageImpl#getSystemTimer()
         * @generated
         */
		EClass SYSTEM_TIMER = eINSTANCE.getSystemTimer();

		/**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SYSTEM_TIMER__VALUE = eINSTANCE.getSystemTimer_Value();

		/**
         * The meta object literal for the '{@link WTSpec4M.impl.SystemVariableImpl <em>System Variable</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see WTSpec4M.impl.SystemVariableImpl
         * @see WTSpec4M.impl.WTSpec4MPackageImpl#getSystemVariable()
         * @generated
         */
		EClass SYSTEM_VARIABLE = eINSTANCE.getSystemVariable();

		/**
         * The meta object literal for the '{@link WTSpec4M.impl.WTCInputImpl <em>WTC Input</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see WTSpec4M.impl.WTCInputImpl
         * @see WTSpec4M.impl.WTSpec4MPackageImpl#getWTCInput()
         * @generated
         */
		EClass WTC_INPUT = eINSTANCE.getWTCInput();

		/**
         * The meta object literal for the '{@link WTSpec4M.impl.WTCOutputImpl <em>WTC Output</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see WTSpec4M.impl.WTCOutputImpl
         * @see WTSpec4M.impl.WTSpec4MPackageImpl#getWTCOutput()
         * @generated
         */
		EClass WTC_OUTPUT = eINSTANCE.getWTCOutput();

		/**
         * The meta object literal for the '{@link WTSpec4M.impl.WTCParamImpl <em>WTC Param</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see WTSpec4M.impl.WTCParamImpl
         * @see WTSpec4M.impl.WTSpec4MPackageImpl#getWTCParam()
         * @generated
         */
		EClass WTC_PARAM = eINSTANCE.getWTCParam();

		/**
         * The meta object literal for the '{@link WTSpec4M.impl.WTCTimerImpl <em>WTC Timer</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see WTSpec4M.impl.WTCTimerImpl
         * @see WTSpec4M.impl.WTSpec4MPackageImpl#getWTCTimer()
         * @generated
         */
		EClass WTC_TIMER = eINSTANCE.getWTCTimer();

		/**
         * The meta object literal for the '{@link WTSpec4M.impl.WTCFaultImpl <em>WTC Fault</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see WTSpec4M.impl.WTCFaultImpl
         * @see WTSpec4M.impl.WTSpec4MPackageImpl#getWTCFault()
         * @generated
         */
		EClass WTC_FAULT = eINSTANCE.getWTCFault();

		/**
         * The meta object literal for the '{@link WTSpec4M.impl.SubsystemImpl <em>Subsystem</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see WTSpec4M.impl.SubsystemImpl
         * @see WTSpec4M.impl.WTSpec4MPackageImpl#getSubsystem()
         * @generated
         */
		EClass SUBSYSTEM = eINSTANCE.getSubsystem();

		/**
         * The meta object literal for the '<em><b>Control Units</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SUBSYSTEM__CONTROL_UNITS = eINSTANCE.getSubsystem_ControlUnits();

		/**
         * The meta object literal for the '<em><b>Subsystems</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SUBSYSTEM__SUBSYSTEMS = eINSTANCE.getSubsystem_Subsystems();

		/**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUBSYSTEM__DESCRIPTION = eINSTANCE.getSubsystem_Description();

        /**
         * The meta object literal for the '{@link WTSpec4M.impl.ControlUnitImpl <em>Control Unit</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see WTSpec4M.impl.ControlUnitImpl
         * @see WTSpec4M.impl.WTSpec4MPackageImpl#getControlUnit()
         * @generated
         */
		EClass CONTROL_UNIT = eINSTANCE.getControlUnit();

		/**
         * The meta object literal for the '<em><b>Cycle</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute CONTROL_UNIT__CYCLE = eINSTANCE.getControlUnit_Cycle();

		/**
         * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute CONTROL_UNIT__PRIORITY = eINSTANCE.getControlUnit_Priority();

		/**
         * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute CONTROL_UNIT__ENABLED = eINSTANCE.getControlUnit_Enabled();

		/**
         * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference CONTROL_UNIT__INPUTS = eINSTANCE.getControlUnit_Inputs();

		/**
         * The meta object literal for the '<em><b>Outputs</b></em>' reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference CONTROL_UNIT__OUTPUTS = eINSTANCE.getControlUnit_Outputs();

		/**
         * The meta object literal for the '<em><b>Params</b></em>' reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference CONTROL_UNIT__PARAMS = eINSTANCE.getControlUnit_Params();

		/**
         * The meta object literal for the '<em><b>Fault</b></em>' reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference CONTROL_UNIT__FAULT = eINSTANCE.getControlUnit_Fault();

		/**
         * The meta object literal for the '<em><b>Timers</b></em>' reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference CONTROL_UNIT__TIMERS = eINSTANCE.getControlUnit_Timers();

		/**
         * The meta object literal for the '<em><b>Bhv Params</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute CONTROL_UNIT__BHV_PARAMS = eINSTANCE.getControlUnit_BhvParams();

		/**
         * The meta object literal for the '{@link WTSpec4M.impl.MainSubsystemImpl <em>Main Subsystem</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see WTSpec4M.impl.MainSubsystemImpl
         * @see WTSpec4M.impl.WTSpec4MPackageImpl#getMainSubsystem()
         * @generated
         */
		EClass MAIN_SUBSYSTEM = eINSTANCE.getMainSubsystem();

        /**
         * The meta object literal for the '{@link WTSpec4M.impl.AuthorizedSystemImpl <em>Authorized System</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see WTSpec4M.impl.AuthorizedSystemImpl
         * @see WTSpec4M.impl.WTSpec4MPackageImpl#getAuthorizedSystem()
         * @generated
         */
        EClass AUTHORIZED_SYSTEM = eINSTANCE.getAuthorizedSystem();

        /**
         * The meta object literal for the '<em><b>Wt System</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference AUTHORIZED_SYSTEM__WT_SYSTEM = eINSTANCE.getAuthorizedSystem_WtSystem();

        /**
         * The meta object literal for the '<em><b>Protected</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference AUTHORIZED_SYSTEM__PROTECTED = eINSTANCE.getAuthorizedSystem_Protected();

        /**
         * The meta object literal for the '<em><b>Ownerships</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference AUTHORIZED_SYSTEM__OWNERSHIPS = eINSTANCE.getAuthorizedSystem_Ownerships();

        /**
         * The meta object literal for the '{@link WTSpec4M.impl.OwnershipImpl <em>Ownership</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see WTSpec4M.impl.OwnershipImpl
         * @see WTSpec4M.impl.WTSpec4MPackageImpl#getOwnership()
         * @generated
         */
        EClass OWNERSHIP = eINSTANCE.getOwnership();

        /**
         * The meta object literal for the '<em><b>Owned</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OWNERSHIP__OWNED = eINSTANCE.getOwnership_Owned();

        /**
         * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OWNERSHIP__OWNER = eINSTANCE.getOwnership_Owner();

        /**
         * The meta object literal for the '{@link WTSpec4M.SpecialistKind <em>Specialist Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see WTSpec4M.SpecialistKind
         * @see WTSpec4M.impl.WTSpec4MPackageImpl#getSpecialistKind()
         * @generated
         */
        EEnum SPECIALIST_KIND = eINSTANCE.getSpecialistKind();

	}

} //WTSpec4MPackage
