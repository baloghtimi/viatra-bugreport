/**
 */
package WTSpec4M;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subsystem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WTSpec4M.Subsystem#getControlUnits <em>Control Units</em>}</li>
 *   <li>{@link WTSpec4M.Subsystem#getSubsystems <em>Subsystems</em>}</li>
 *   <li>{@link WTSpec4M.Subsystem#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see WTSpec4M.WTSpec4MPackage#getSubsystem()
 * @model
 * @generated
 */
public interface Subsystem extends EObject {
	/**
     * Returns the value of the '<em><b>Control Units</b></em>' containment reference list.
     * The list contents are of type {@link WTSpec4M.ControlUnit}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Control Units</em>' containment reference list.
     * @see WTSpec4M.WTSpec4MPackage#getSubsystem_ControlUnits()
     * @model containment="true"
     * @generated
     */
	EList<ControlUnit> getControlUnits();

	/**
     * Returns the value of the '<em><b>Subsystems</b></em>' containment reference list.
     * The list contents are of type {@link WTSpec4M.Subsystem}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsystems</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Subsystems</em>' containment reference list.
     * @see WTSpec4M.WTSpec4MPackage#getSubsystem_Subsystems()
     * @model containment="true"
     * @generated
     */
	EList<Subsystem> getSubsystems();

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see WTSpec4M.WTSpec4MPackage#getSubsystem_Description()
     * @model
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link WTSpec4M.Subsystem#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

} // Subsystem
