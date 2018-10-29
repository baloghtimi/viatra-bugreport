/**
 */
package WTSpec4M;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authorized System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WTSpec4M.AuthorizedSystem#getWtSystem <em>Wt System</em>}</li>
 *   <li>{@link WTSpec4M.AuthorizedSystem#getProtected <em>Protected</em>}</li>
 *   <li>{@link WTSpec4M.AuthorizedSystem#getOwnerships <em>Ownerships</em>}</li>
 * </ul>
 *
 * @see WTSpec4M.WTSpec4MPackage#getAuthorizedSystem()
 * @model
 * @generated
 */
public interface AuthorizedSystem extends EObject {
    /**
     * Returns the value of the '<em><b>Wt System</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wt System</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wt System</em>' containment reference.
     * @see #setWtSystem(WT)
     * @see WTSpec4M.WTSpec4MPackage#getAuthorizedSystem_WtSystem()
     * @model containment="true" required="true"
     * @generated
     */
    WT getWtSystem();

    /**
     * Sets the value of the '{@link WTSpec4M.AuthorizedSystem#getWtSystem <em>Wt System</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wt System</em>' containment reference.
     * @see #getWtSystem()
     * @generated
     */
    void setWtSystem(WT value);

    /**
     * Returns the value of the '<em><b>Protected</b></em>' reference list.
     * The list contents are of type {@link WTSpec4M.Subsystem}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Protected</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Protected</em>' reference list.
     * @see WTSpec4M.WTSpec4MPackage#getAuthorizedSystem_Protected()
     * @model
     * @generated
     */
    EList<Subsystem> getProtected();

    /**
     * Returns the value of the '<em><b>Ownerships</b></em>' containment reference list.
     * The list contents are of type {@link WTSpec4M.Ownership}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ownerships</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ownerships</em>' containment reference list.
     * @see WTSpec4M.WTSpec4MPackage#getAuthorizedSystem_Ownerships()
     * @model containment="true"
     * @generated
     */
    EList<Ownership> getOwnerships();

} // AuthorizedSystem
