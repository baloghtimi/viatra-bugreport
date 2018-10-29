/**
 */
package WTSpec4M;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ownership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WTSpec4M.Ownership#getOwned <em>Owned</em>}</li>
 *   <li>{@link WTSpec4M.Ownership#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see WTSpec4M.WTSpec4MPackage#getOwnership()
 * @model
 * @generated
 */
public interface Ownership extends EObject {
    /**
     * Returns the value of the '<em><b>Owned</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owned</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owned</em>' reference.
     * @see #setOwned(Subsystem)
     * @see WTSpec4M.WTSpec4MPackage#getOwnership_Owned()
     * @model required="true"
     * @generated
     */
    Subsystem getOwned();

    /**
     * Sets the value of the '{@link WTSpec4M.Ownership#getOwned <em>Owned</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Owned</em>' reference.
     * @see #getOwned()
     * @generated
     */
    void setOwned(Subsystem value);

    /**
     * Returns the value of the '<em><b>Owner</b></em>' attribute.
     * The literals are from the enumeration {@link WTSpec4M.SpecialistKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owner</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owner</em>' attribute.
     * @see WTSpec4M.SpecialistKind
     * @see #setOwner(SpecialistKind)
     * @see WTSpec4M.WTSpec4MPackage#getOwnership_Owner()
     * @model required="true"
     * @generated
     */
    SpecialistKind getOwner();

    /**
     * Sets the value of the '{@link WTSpec4M.Ownership#getOwner <em>Owner</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Owner</em>' attribute.
     * @see WTSpec4M.SpecialistKind
     * @see #getOwner()
     * @generated
     */
    void setOwner(SpecialistKind value);

} // Ownership
