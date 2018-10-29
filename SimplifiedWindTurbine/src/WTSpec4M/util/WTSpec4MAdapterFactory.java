/**
 */
package WTSpec4M.util;

import WTSpec4M.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see WTSpec4M.WTSpec4MPackage
 * @generated
 */
public class WTSpec4MAdapterFactory extends AdapterFactoryImpl {
	/**
     * The cached model package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static WTSpec4MPackage modelPackage;

	/**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public WTSpec4MAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = WTSpec4MPackage.eINSTANCE;
        }
    }

	/**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
	@Override
	public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

	/**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected WTSpec4MSwitch<Adapter> modelSwitch =
		new WTSpec4MSwitch<Adapter>() {
            @Override
            public Adapter caseWT(WT object) {
                return createWTAdapter();
            }
            @Override
            public Adapter caseSystemInput(SystemInput object) {
                return createSystemInputAdapter();
            }
            @Override
            public Adapter caseSystemOutput(SystemOutput object) {
                return createSystemOutputAdapter();
            }
            @Override
            public Adapter caseSystemFault(SystemFault object) {
                return createSystemFaultAdapter();
            }
            @Override
            public Adapter caseSystemParam(SystemParam object) {
                return createSystemParamAdapter();
            }
            @Override
            public Adapter caseSystemTimer(SystemTimer object) {
                return createSystemTimerAdapter();
            }
            @Override
            public Adapter caseSystemVariable(SystemVariable object) {
                return createSystemVariableAdapter();
            }
            @Override
            public Adapter caseWTCInput(WTCInput object) {
                return createWTCInputAdapter();
            }
            @Override
            public Adapter caseWTCOutput(WTCOutput object) {
                return createWTCOutputAdapter();
            }
            @Override
            public Adapter caseWTCParam(WTCParam object) {
                return createWTCParamAdapter();
            }
            @Override
            public Adapter caseWTCTimer(WTCTimer object) {
                return createWTCTimerAdapter();
            }
            @Override
            public Adapter caseWTCFault(WTCFault object) {
                return createWTCFaultAdapter();
            }
            @Override
            public Adapter caseSubsystem(Subsystem object) {
                return createSubsystemAdapter();
            }
            @Override
            public Adapter caseControlUnit(ControlUnit object) {
                return createControlUnitAdapter();
            }
            @Override
            public Adapter caseMainSubsystem(MainSubsystem object) {
                return createMainSubsystemAdapter();
            }
            @Override
            public Adapter caseAuthorizedSystem(AuthorizedSystem object) {
                return createAuthorizedSystemAdapter();
            }
            @Override
            public Adapter caseOwnership(Ownership object) {
                return createOwnershipAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

	/**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
	@Override
	public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


	/**
     * Creates a new adapter for an object of class '{@link WTSpec4M.WT <em>WT</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see WTSpec4M.WT
     * @generated
     */
	public Adapter createWTAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link WTSpec4M.SystemInput <em>System Input</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see WTSpec4M.SystemInput
     * @generated
     */
	public Adapter createSystemInputAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link WTSpec4M.SystemOutput <em>System Output</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see WTSpec4M.SystemOutput
     * @generated
     */
	public Adapter createSystemOutputAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link WTSpec4M.SystemFault <em>System Fault</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see WTSpec4M.SystemFault
     * @generated
     */
	public Adapter createSystemFaultAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link WTSpec4M.SystemParam <em>System Param</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see WTSpec4M.SystemParam
     * @generated
     */
	public Adapter createSystemParamAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link WTSpec4M.SystemTimer <em>System Timer</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see WTSpec4M.SystemTimer
     * @generated
     */
	public Adapter createSystemTimerAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link WTSpec4M.SystemVariable <em>System Variable</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see WTSpec4M.SystemVariable
     * @generated
     */
	public Adapter createSystemVariableAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link WTSpec4M.WTCInput <em>WTC Input</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see WTSpec4M.WTCInput
     * @generated
     */
	public Adapter createWTCInputAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link WTSpec4M.WTCOutput <em>WTC Output</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see WTSpec4M.WTCOutput
     * @generated
     */
	public Adapter createWTCOutputAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link WTSpec4M.WTCParam <em>WTC Param</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see WTSpec4M.WTCParam
     * @generated
     */
	public Adapter createWTCParamAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link WTSpec4M.WTCTimer <em>WTC Timer</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see WTSpec4M.WTCTimer
     * @generated
     */
	public Adapter createWTCTimerAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link WTSpec4M.WTCFault <em>WTC Fault</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see WTSpec4M.WTCFault
     * @generated
     */
	public Adapter createWTCFaultAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link WTSpec4M.Subsystem <em>Subsystem</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see WTSpec4M.Subsystem
     * @generated
     */
	public Adapter createSubsystemAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link WTSpec4M.ControlUnit <em>Control Unit</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see WTSpec4M.ControlUnit
     * @generated
     */
	public Adapter createControlUnitAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link WTSpec4M.MainSubsystem <em>Main Subsystem</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see WTSpec4M.MainSubsystem
     * @generated
     */
	public Adapter createMainSubsystemAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link WTSpec4M.AuthorizedSystem <em>Authorized System</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see WTSpec4M.AuthorizedSystem
     * @generated
     */
    public Adapter createAuthorizedSystemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link WTSpec4M.Ownership <em>Ownership</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see WTSpec4M.Ownership
     * @generated
     */
    public Adapter createOwnershipAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
	public Adapter createEObjectAdapter() {
        return null;
    }

} //WTSpec4MAdapterFactory
