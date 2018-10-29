/**
 */
package WTSpec4M.util;

import WTSpec4M.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see WTSpec4M.WTSpec4MPackage
 * @generated
 */
public class WTSpec4MSwitch<T> extends Switch<T> {
	/**
     * The cached model package
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static WTSpec4MPackage modelPackage;

	/**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public WTSpec4MSwitch() {
        if (modelPackage == null) {
            modelPackage = WTSpec4MPackage.eINSTANCE;
        }
    }

	/**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

	/**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case WTSpec4MPackage.WT: {
                WT wt = (WT)theEObject;
                T result = caseWT(wt);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WTSpec4MPackage.SYSTEM_INPUT: {
                SystemInput systemInput = (SystemInput)theEObject;
                T result = caseSystemInput(systemInput);
                if (result == null) result = caseWTCInput(systemInput);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WTSpec4MPackage.SYSTEM_OUTPUT: {
                SystemOutput systemOutput = (SystemOutput)theEObject;
                T result = caseSystemOutput(systemOutput);
                if (result == null) result = caseWTCOutput(systemOutput);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WTSpec4MPackage.SYSTEM_FAULT: {
                SystemFault systemFault = (SystemFault)theEObject;
                T result = caseSystemFault(systemFault);
                if (result == null) result = caseWTCFault(systemFault);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WTSpec4MPackage.SYSTEM_PARAM: {
                SystemParam systemParam = (SystemParam)theEObject;
                T result = caseSystemParam(systemParam);
                if (result == null) result = caseWTCParam(systemParam);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WTSpec4MPackage.SYSTEM_TIMER: {
                SystemTimer systemTimer = (SystemTimer)theEObject;
                T result = caseSystemTimer(systemTimer);
                if (result == null) result = caseWTCTimer(systemTimer);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WTSpec4MPackage.SYSTEM_VARIABLE: {
                SystemVariable systemVariable = (SystemVariable)theEObject;
                T result = caseSystemVariable(systemVariable);
                if (result == null) result = caseWTCInput(systemVariable);
                if (result == null) result = caseWTCOutput(systemVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WTSpec4MPackage.WTC_INPUT: {
                WTCInput wtcInput = (WTCInput)theEObject;
                T result = caseWTCInput(wtcInput);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WTSpec4MPackage.WTC_OUTPUT: {
                WTCOutput wtcOutput = (WTCOutput)theEObject;
                T result = caseWTCOutput(wtcOutput);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WTSpec4MPackage.WTC_PARAM: {
                WTCParam wtcParam = (WTCParam)theEObject;
                T result = caseWTCParam(wtcParam);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WTSpec4MPackage.WTC_TIMER: {
                WTCTimer wtcTimer = (WTCTimer)theEObject;
                T result = caseWTCTimer(wtcTimer);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WTSpec4MPackage.WTC_FAULT: {
                WTCFault wtcFault = (WTCFault)theEObject;
                T result = caseWTCFault(wtcFault);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WTSpec4MPackage.SUBSYSTEM: {
                Subsystem subsystem = (Subsystem)theEObject;
                T result = caseSubsystem(subsystem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WTSpec4MPackage.CONTROL_UNIT: {
                ControlUnit controlUnit = (ControlUnit)theEObject;
                T result = caseControlUnit(controlUnit);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WTSpec4MPackage.MAIN_SUBSYSTEM: {
                MainSubsystem mainSubsystem = (MainSubsystem)theEObject;
                T result = caseMainSubsystem(mainSubsystem);
                if (result == null) result = caseSubsystem(mainSubsystem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WTSpec4MPackage.AUTHORIZED_SYSTEM: {
                AuthorizedSystem authorizedSystem = (AuthorizedSystem)theEObject;
                T result = caseAuthorizedSystem(authorizedSystem);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case WTSpec4MPackage.OWNERSHIP: {
                Ownership ownership = (Ownership)theEObject;
                T result = caseOwnership(ownership);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>WT</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>WT</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseWT(WT object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>System Input</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>System Input</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSystemInput(SystemInput object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>System Output</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>System Output</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSystemOutput(SystemOutput object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>System Fault</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>System Fault</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSystemFault(SystemFault object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>System Param</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>System Param</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSystemParam(SystemParam object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>System Timer</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>System Timer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSystemTimer(SystemTimer object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>System Variable</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>System Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSystemVariable(SystemVariable object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>WTC Input</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>WTC Input</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseWTCInput(WTCInput object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>WTC Output</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>WTC Output</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseWTCOutput(WTCOutput object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>WTC Param</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>WTC Param</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseWTCParam(WTCParam object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>WTC Timer</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>WTC Timer</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseWTCTimer(WTCTimer object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>WTC Fault</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>WTC Fault</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseWTCFault(WTCFault object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Subsystem</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Subsystem</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseSubsystem(Subsystem object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Control Unit</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Control Unit</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseControlUnit(ControlUnit object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Main Subsystem</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Main Subsystem</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseMainSubsystem(MainSubsystem object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Authorized System</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Authorized System</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAuthorizedSystem(AuthorizedSystem object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Ownership</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Ownership</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseOwnership(Ownership object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
	@Override
	public T defaultCase(EObject object) {
        return null;
    }

} //WTSpec4MSwitch
