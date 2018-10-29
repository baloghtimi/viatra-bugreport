/**
 */
package WTSpec4M;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WTSpec4M.WT#getSubsystems <em>Subsystems</em>}</li>
 *   <li>{@link WTSpec4M.WT#getInputs <em>Inputs</em>}</li>
 *   <li>{@link WTSpec4M.WT#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link WTSpec4M.WT#getParams <em>Params</em>}</li>
 *   <li>{@link WTSpec4M.WT#getTimers <em>Timers</em>}</li>
 *   <li>{@link WTSpec4M.WT#getFaults <em>Faults</em>}</li>
 *   <li>{@link WTSpec4M.WT#getVariables <em>Variables</em>}</li>
 *   <li>{@link WTSpec4M.WT#getModel <em>Model</em>}</li>
 * </ul>
 *
 * @see WTSpec4M.WTSpec4MPackage#getWT()
 * @model
 * @generated
 */
public interface WT extends EObject {
	/**
     * Returns the value of the '<em><b>Subsystems</b></em>' containment reference list.
     * The list contents are of type {@link WTSpec4M.MainSubsystem}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsystems</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Subsystems</em>' containment reference list.
     * @see WTSpec4M.WTSpec4MPackage#getWT_Subsystems()
     * @model containment="true"
     * @generated
     */
	EList<MainSubsystem> getSubsystems();

	/**
     * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
     * The list contents are of type {@link WTSpec4M.SystemInput}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Inputs</em>' containment reference list.
     * @see WTSpec4M.WTSpec4MPackage#getWT_Inputs()
     * @model containment="true"
     * @generated
     */
	EList<SystemInput> getInputs();

	/**
     * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
     * The list contents are of type {@link WTSpec4M.SystemOutput}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Outputs</em>' containment reference list.
     * @see WTSpec4M.WTSpec4MPackage#getWT_Outputs()
     * @model containment="true"
     * @generated
     */
	EList<SystemOutput> getOutputs();

	/**
     * Returns the value of the '<em><b>Params</b></em>' containment reference list.
     * The list contents are of type {@link WTSpec4M.SystemParam}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Params</em>' containment reference list.
     * @see WTSpec4M.WTSpec4MPackage#getWT_Params()
     * @model containment="true"
     * @generated
     */
	EList<SystemParam> getParams();

	/**
     * Returns the value of the '<em><b>Timers</b></em>' containment reference list.
     * The list contents are of type {@link WTSpec4M.SystemTimer}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Timers</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Timers</em>' containment reference list.
     * @see WTSpec4M.WTSpec4MPackage#getWT_Timers()
     * @model containment="true"
     * @generated
     */
    EList<SystemTimer> getTimers();

    /**
     * Returns the value of the '<em><b>Faults</b></em>' containment reference list.
     * The list contents are of type {@link WTSpec4M.SystemFault}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Faults</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Faults</em>' containment reference list.
     * @see WTSpec4M.WTSpec4MPackage#getWT_Faults()
     * @model containment="true"
     * @generated
     */
    EList<SystemFault> getFaults();

    /**
     * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
     * The list contents are of type {@link WTSpec4M.SystemVariable}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Variables</em>' containment reference list.
     * @see WTSpec4M.WTSpec4MPackage#getWT_Variables()
     * @model containment="true"
     * @generated
     */
	EList<SystemVariable> getVariables();

    /**
     * Returns the value of the '<em><b>Model</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model</em>' attribute.
     * @see #setModel(String)
     * @see WTSpec4M.WTSpec4MPackage#getWT_Model()
     * @model
     * @generated
     */
    String getModel();

    /**
     * Sets the value of the '{@link WTSpec4M.WT#getModel <em>Model</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' attribute.
     * @see #getModel()
     * @generated
     */
    void setModel(String value);

} // WT
