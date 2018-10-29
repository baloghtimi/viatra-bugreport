/**
 */
package WTSpec4M.impl;

import WTSpec4M.AuthorizedSystem;
import WTSpec4M.ControlUnit;
import WTSpec4M.MainSubsystem;
import WTSpec4M.Ownership;
import WTSpec4M.SpecialistKind;
import WTSpec4M.Subsystem;
import WTSpec4M.SystemFault;
import WTSpec4M.SystemInput;
import WTSpec4M.SystemOutput;
import WTSpec4M.SystemParam;
import WTSpec4M.SystemTimer;
import WTSpec4M.SystemVariable;
import WTSpec4M.WTCFault;
import WTSpec4M.WTCInput;
import WTSpec4M.WTCOutput;
import WTSpec4M.WTCParam;
import WTSpec4M.WTCTimer;
import WTSpec4M.WTSpec4MFactory;
import WTSpec4M.WTSpec4MPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WTSpec4MPackageImpl extends EPackageImpl implements WTSpec4MPackage {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass wtEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass systemInputEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass systemOutputEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass systemFaultEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass systemParamEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass systemTimerEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass systemVariableEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass wtcInputEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass wtcOutputEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass wtcParamEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass wtcTimerEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass wtcFaultEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass subsystemEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass controlUnitEClass = null;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private EClass mainSubsystemEClass = null;

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass authorizedSystemEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ownershipEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum specialistKindEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see WTSpec4M.WTSpec4MPackage#eNS_URI
     * @see #init()
     * @generated
     */
	private WTSpec4MPackageImpl() {
        super(eNS_URI, WTSpec4MFactory.eINSTANCE);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static boolean isInited = false;

	/**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     *
     * <p>This method is used to initialize {@link WTSpec4MPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
	public static WTSpec4MPackage init() {
        if (isInited) return (WTSpec4MPackage)EPackage.Registry.INSTANCE.getEPackage(WTSpec4MPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredWTSpec4MPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        WTSpec4MPackageImpl theWTSpec4MPackage = registeredWTSpec4MPackage instanceof WTSpec4MPackageImpl ? (WTSpec4MPackageImpl)registeredWTSpec4MPackage : new WTSpec4MPackageImpl();

        isInited = true;

        // Create package meta-data objects
        theWTSpec4MPackage.createPackageContents();

        // Initialize created meta-data
        theWTSpec4MPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theWTSpec4MPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(WTSpec4MPackage.eNS_URI, theWTSpec4MPackage);
        return theWTSpec4MPackage;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getWT() {
        return wtEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getWT_Subsystems() {
        return (EReference)wtEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getWT_Inputs() {
        return (EReference)wtEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getWT_Outputs() {
        return (EReference)wtEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getWT_Params() {
        return (EReference)wtEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getWT_Timers() {
        return (EReference)wtEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getWT_Faults() {
        return (EReference)wtEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getWT_Variables() {
        return (EReference)wtEClass.getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWT_Model() {
        return (EAttribute)wtEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSystemInput() {
        return systemInputEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSystemOutput() {
        return systemOutputEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSystemFault() {
        return systemFaultEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSystemFault_Value() {
        return (EAttribute)systemFaultEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSystemParam() {
        return systemParamEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSystemParam_Value() {
        return (EAttribute)systemParamEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSystemParam_Settable() {
        return (EAttribute)systemParamEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSystemTimer() {
        return systemTimerEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getSystemTimer_Value() {
        return (EAttribute)systemTimerEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSystemVariable() {
        return systemVariableEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getWTCInput() {
        return wtcInputEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getWTCOutput() {
        return wtcOutputEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getWTCParam() {
        return wtcParamEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getWTCTimer() {
        return wtcTimerEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getWTCFault() {
        return wtcFaultEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getSubsystem() {
        return subsystemEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSubsystem_ControlUnits() {
        return (EReference)subsystemEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getSubsystem_Subsystems() {
        return (EReference)subsystemEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubsystem_Description() {
        return (EAttribute)subsystemEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getControlUnit() {
        return controlUnitEClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getControlUnit_Cycle() {
        return (EAttribute)controlUnitEClass.getEStructuralFeatures().get(0);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getControlUnit_Priority() {
        return (EAttribute)controlUnitEClass.getEStructuralFeatures().get(1);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getControlUnit_Enabled() {
        return (EAttribute)controlUnitEClass.getEStructuralFeatures().get(2);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getControlUnit_Inputs() {
        return (EReference)controlUnitEClass.getEStructuralFeatures().get(3);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getControlUnit_Outputs() {
        return (EReference)controlUnitEClass.getEStructuralFeatures().get(4);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getControlUnit_Params() {
        return (EReference)controlUnitEClass.getEStructuralFeatures().get(5);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getControlUnit_Fault() {
        return (EReference)controlUnitEClass.getEStructuralFeatures().get(6);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EReference getControlUnit_Timers() {
        return (EReference)controlUnitEClass.getEStructuralFeatures().get(7);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EAttribute getControlUnit_BhvParams() {
        return (EAttribute)controlUnitEClass.getEStructuralFeatures().get(8);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EClass getMainSubsystem() {
        return mainSubsystemEClass;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAuthorizedSystem() {
        return authorizedSystemEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAuthorizedSystem_WtSystem() {
        return (EReference)authorizedSystemEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAuthorizedSystem_Protected() {
        return (EReference)authorizedSystemEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAuthorizedSystem_Ownerships() {
        return (EReference)authorizedSystemEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOwnership() {
        return ownershipEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOwnership_Owned() {
        return (EReference)ownershipEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOwnership_Owner() {
        return (EAttribute)ownershipEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getSpecialistKind() {
        return specialistKindEEnum;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public WTSpec4MFactory getWTSpec4MFactory() {
        return (WTSpec4MFactory)getEFactoryInstance();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private boolean isCreated = false;

	/**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        wtEClass = createEClass(WT);
        createEReference(wtEClass, WT__SUBSYSTEMS);
        createEReference(wtEClass, WT__INPUTS);
        createEReference(wtEClass, WT__OUTPUTS);
        createEReference(wtEClass, WT__PARAMS);
        createEReference(wtEClass, WT__TIMERS);
        createEReference(wtEClass, WT__FAULTS);
        createEReference(wtEClass, WT__VARIABLES);
        createEAttribute(wtEClass, WT__MODEL);

        systemInputEClass = createEClass(SYSTEM_INPUT);

        systemOutputEClass = createEClass(SYSTEM_OUTPUT);

        systemFaultEClass = createEClass(SYSTEM_FAULT);
        createEAttribute(systemFaultEClass, SYSTEM_FAULT__VALUE);

        systemParamEClass = createEClass(SYSTEM_PARAM);
        createEAttribute(systemParamEClass, SYSTEM_PARAM__VALUE);
        createEAttribute(systemParamEClass, SYSTEM_PARAM__SETTABLE);

        systemTimerEClass = createEClass(SYSTEM_TIMER);
        createEAttribute(systemTimerEClass, SYSTEM_TIMER__VALUE);

        systemVariableEClass = createEClass(SYSTEM_VARIABLE);

        wtcInputEClass = createEClass(WTC_INPUT);

        wtcOutputEClass = createEClass(WTC_OUTPUT);

        wtcParamEClass = createEClass(WTC_PARAM);

        wtcTimerEClass = createEClass(WTC_TIMER);

        wtcFaultEClass = createEClass(WTC_FAULT);

        subsystemEClass = createEClass(SUBSYSTEM);
        createEReference(subsystemEClass, SUBSYSTEM__CONTROL_UNITS);
        createEReference(subsystemEClass, SUBSYSTEM__SUBSYSTEMS);
        createEAttribute(subsystemEClass, SUBSYSTEM__DESCRIPTION);

        controlUnitEClass = createEClass(CONTROL_UNIT);
        createEAttribute(controlUnitEClass, CONTROL_UNIT__CYCLE);
        createEAttribute(controlUnitEClass, CONTROL_UNIT__PRIORITY);
        createEAttribute(controlUnitEClass, CONTROL_UNIT__ENABLED);
        createEReference(controlUnitEClass, CONTROL_UNIT__INPUTS);
        createEReference(controlUnitEClass, CONTROL_UNIT__OUTPUTS);
        createEReference(controlUnitEClass, CONTROL_UNIT__PARAMS);
        createEReference(controlUnitEClass, CONTROL_UNIT__FAULT);
        createEReference(controlUnitEClass, CONTROL_UNIT__TIMERS);
        createEAttribute(controlUnitEClass, CONTROL_UNIT__BHV_PARAMS);

        mainSubsystemEClass = createEClass(MAIN_SUBSYSTEM);

        authorizedSystemEClass = createEClass(AUTHORIZED_SYSTEM);
        createEReference(authorizedSystemEClass, AUTHORIZED_SYSTEM__WT_SYSTEM);
        createEReference(authorizedSystemEClass, AUTHORIZED_SYSTEM__PROTECTED);
        createEReference(authorizedSystemEClass, AUTHORIZED_SYSTEM__OWNERSHIPS);

        ownershipEClass = createEClass(OWNERSHIP);
        createEReference(ownershipEClass, OWNERSHIP__OWNED);
        createEAttribute(ownershipEClass, OWNERSHIP__OWNER);

        // Create enums
        specialistKindEEnum = createEEnum(SPECIALIST_KIND);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private boolean isInitialized = false;

	/**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        systemInputEClass.getESuperTypes().add(this.getWTCInput());
        systemOutputEClass.getESuperTypes().add(this.getWTCOutput());
        systemFaultEClass.getESuperTypes().add(this.getWTCFault());
        systemParamEClass.getESuperTypes().add(this.getWTCParam());
        systemTimerEClass.getESuperTypes().add(this.getWTCTimer());
        systemVariableEClass.getESuperTypes().add(this.getWTCInput());
        systemVariableEClass.getESuperTypes().add(this.getWTCOutput());
        mainSubsystemEClass.getESuperTypes().add(this.getSubsystem());

        // Initialize classes, features, and operations; add parameters
        initEClass(wtEClass, WTSpec4M.WT.class, "WT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getWT_Subsystems(), this.getMainSubsystem(), null, "subsystems", null, 0, -1, WTSpec4M.WT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getWT_Inputs(), this.getSystemInput(), null, "inputs", null, 0, -1, WTSpec4M.WT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getWT_Outputs(), this.getSystemOutput(), null, "outputs", null, 0, -1, WTSpec4M.WT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getWT_Params(), this.getSystemParam(), null, "params", null, 0, -1, WTSpec4M.WT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getWT_Timers(), this.getSystemTimer(), null, "timers", null, 0, -1, WTSpec4M.WT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getWT_Faults(), this.getSystemFault(), null, "faults", null, 0, -1, WTSpec4M.WT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getWT_Variables(), this.getSystemVariable(), null, "variables", null, 0, -1, WTSpec4M.WT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getWT_Model(), ecorePackage.getEString(), "model", null, 0, 1, WTSpec4M.WT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(systemInputEClass, SystemInput.class, "SystemInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(systemOutputEClass, SystemOutput.class, "SystemOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(systemFaultEClass, SystemFault.class, "SystemFault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSystemFault_Value(), ecorePackage.getEInt(), "value", null, 0, 1, SystemFault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(systemParamEClass, SystemParam.class, "SystemParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSystemParam_Value(), ecorePackage.getEInt(), "value", null, 0, 1, SystemParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSystemParam_Settable(), ecorePackage.getEBoolean(), "settable", null, 0, 1, SystemParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(systemTimerEClass, SystemTimer.class, "SystemTimer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSystemTimer_Value(), ecorePackage.getEInt(), "value", null, 0, 1, SystemTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(systemVariableEClass, SystemVariable.class, "SystemVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(wtcInputEClass, WTCInput.class, "WTCInput", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(wtcOutputEClass, WTCOutput.class, "WTCOutput", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(wtcParamEClass, WTCParam.class, "WTCParam", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(wtcTimerEClass, WTCTimer.class, "WTCTimer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(wtcFaultEClass, WTCFault.class, "WTCFault", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(subsystemEClass, Subsystem.class, "Subsystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSubsystem_ControlUnits(), this.getControlUnit(), null, "controlUnits", null, 0, -1, Subsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSubsystem_Subsystems(), this.getSubsystem(), null, "subsystems", null, 0, -1, Subsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSubsystem_Description(), ecorePackage.getEString(), "description", null, 0, 1, Subsystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(controlUnitEClass, ControlUnit.class, "ControlUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getControlUnit_Cycle(), ecorePackage.getEShort(), "cycle", null, 0, 1, ControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getControlUnit_Priority(), ecorePackage.getEShort(), "priority", null, 0, 1, ControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getControlUnit_Enabled(), ecorePackage.getEBoolean(), "enabled", null, 0, 1, ControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getControlUnit_Inputs(), this.getWTCInput(), null, "inputs", null, 0, -1, ControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getControlUnit_Outputs(), this.getWTCOutput(), null, "outputs", null, 0, -1, ControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getControlUnit_Params(), this.getWTCParam(), null, "params", null, 0, -1, ControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getControlUnit_Fault(), this.getWTCFault(), null, "fault", null, 0, 1, ControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getControlUnit_Timers(), this.getWTCTimer(), null, "timers", null, 0, -1, ControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getControlUnit_BhvParams(), ecorePackage.getEString(), "BhvParams", null, 0, 2, ControlUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(mainSubsystemEClass, MainSubsystem.class, "MainSubsystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(authorizedSystemEClass, AuthorizedSystem.class, "AuthorizedSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAuthorizedSystem_WtSystem(), this.getWT(), null, "wtSystem", null, 1, 1, AuthorizedSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAuthorizedSystem_Protected(), this.getSubsystem(), null, "protected", null, 0, -1, AuthorizedSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAuthorizedSystem_Ownerships(), this.getOwnership(), null, "ownerships", null, 0, -1, AuthorizedSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(ownershipEClass, Ownership.class, "Ownership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getOwnership_Owned(), this.getSubsystem(), null, "owned", null, 1, 1, Ownership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOwnership_Owner(), this.getSpecialistKind(), "owner", null, 1, 1, Ownership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(specialistKindEEnum, SpecialistKind.class, "SpecialistKind");
        addEEnumLiteral(specialistKindEEnum, SpecialistKind.PUMP);
        addEEnumLiteral(specialistKindEEnum, SpecialistKind.HEATER);
        addEEnumLiteral(specialistKindEEnum, SpecialistKind.FAN);

        // Create resource
        createResource(eNS_URI);
    }

} //WTSpec4MPackageImpl
