/**
 */
package WTSpec4M;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WTSpec4M.ControlUnit#getCycle <em>Cycle</em>}</li>
 *   <li>{@link WTSpec4M.ControlUnit#getPriority <em>Priority</em>}</li>
 *   <li>{@link WTSpec4M.ControlUnit#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link WTSpec4M.ControlUnit#getInputs <em>Inputs</em>}</li>
 *   <li>{@link WTSpec4M.ControlUnit#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link WTSpec4M.ControlUnit#getParams <em>Params</em>}</li>
 *   <li>{@link WTSpec4M.ControlUnit#getFault <em>Fault</em>}</li>
 *   <li>{@link WTSpec4M.ControlUnit#getTimers <em>Timers</em>}</li>
 *   <li>{@link WTSpec4M.ControlUnit#getBhvParams <em>Bhv Params</em>}</li>
 * </ul>
 *
 * @see WTSpec4M.WTSpec4MPackage#getControlUnit()
 * @model
 * @generated
 */
public interface ControlUnit extends EObject {
	/**
     * Returns the value of the '<em><b>Cycle</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cycle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Cycle</em>' attribute.
     * @see #setCycle(short)
     * @see WTSpec4M.WTSpec4MPackage#getControlUnit_Cycle()
     * @model
     * @generated
     */
	short getCycle();

	/**
     * Sets the value of the '{@link WTSpec4M.ControlUnit#getCycle <em>Cycle</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cycle</em>' attribute.
     * @see #getCycle()
     * @generated
     */
	void setCycle(short value);

	/**
     * Returns the value of the '<em><b>Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Priority</em>' attribute.
     * @see #setPriority(short)
     * @see WTSpec4M.WTSpec4MPackage#getControlUnit_Priority()
     * @model
     * @generated
     */
	short getPriority();

	/**
     * Sets the value of the '{@link WTSpec4M.ControlUnit#getPriority <em>Priority</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Priority</em>' attribute.
     * @see #getPriority()
     * @generated
     */
	void setPriority(short value);

	/**
     * Returns the value of the '<em><b>Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Enabled</em>' attribute.
     * @see #setEnabled(boolean)
     * @see WTSpec4M.WTSpec4MPackage#getControlUnit_Enabled()
     * @model
     * @generated
     */
	boolean isEnabled();

	/**
     * Sets the value of the '{@link WTSpec4M.ControlUnit#isEnabled <em>Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Enabled</em>' attribute.
     * @see #isEnabled()
     * @generated
     */
	void setEnabled(boolean value);

	/**
     * Returns the value of the '<em><b>Inputs</b></em>' reference list.
     * The list contents are of type {@link WTSpec4M.WTCInput}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Inputs</em>' reference list.
     * @see WTSpec4M.WTSpec4MPackage#getControlUnit_Inputs()
     * @model
     * @generated
     */
	EList<WTCInput> getInputs();

	/**
     * Returns the value of the '<em><b>Outputs</b></em>' reference list.
     * The list contents are of type {@link WTSpec4M.WTCOutput}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Outputs</em>' reference list.
     * @see WTSpec4M.WTSpec4MPackage#getControlUnit_Outputs()
     * @model
     * @generated
     */
	EList<WTCOutput> getOutputs();

	/**
     * Returns the value of the '<em><b>Params</b></em>' reference list.
     * The list contents are of type {@link WTSpec4M.WTCParam}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Params</em>' reference list.
     * @see WTSpec4M.WTSpec4MPackage#getControlUnit_Params()
     * @model
     * @generated
     */
	EList<WTCParam> getParams();

	/**
     * Returns the value of the '<em><b>Fault</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fault</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Fault</em>' reference.
     * @see #setFault(WTCFault)
     * @see WTSpec4M.WTSpec4MPackage#getControlUnit_Fault()
     * @model
     * @generated
     */
	WTCFault getFault();

	/**
     * Sets the value of the '{@link WTSpec4M.ControlUnit#getFault <em>Fault</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fault</em>' reference.
     * @see #getFault()
     * @generated
     */
	void setFault(WTCFault value);

	/**
     * Returns the value of the '<em><b>Timers</b></em>' reference list.
     * The list contents are of type {@link WTSpec4M.WTCTimer}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Timers</em>' reference list.
     * @see WTSpec4M.WTSpec4MPackage#getControlUnit_Timers()
     * @model
     * @generated
     */
	EList<WTCTimer> getTimers();

	/**
     * Returns the value of the '<em><b>Bhv Params</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bhv Params</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Bhv Params</em>' attribute list.
     * @see WTSpec4M.WTSpec4MPackage#getControlUnit_BhvParams()
     * @model upper="2"
     * @generated
     */
	EList<String> getBhvParams();

} // ControlUnit
