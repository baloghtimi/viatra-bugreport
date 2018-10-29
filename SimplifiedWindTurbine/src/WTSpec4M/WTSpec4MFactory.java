/**
 */
package WTSpec4M;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see WTSpec4M.WTSpec4MPackage
 * @generated
 */
public interface WTSpec4MFactory extends EFactory {
	/**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	WTSpec4MFactory eINSTANCE = WTSpec4M.impl.WTSpec4MFactoryImpl.init();

	/**
     * Returns a new object of class '<em>WT</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>WT</em>'.
     * @generated
     */
	WT createWT();

	/**
     * Returns a new object of class '<em>System Input</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>System Input</em>'.
     * @generated
     */
	SystemInput createSystemInput();

	/**
     * Returns a new object of class '<em>System Output</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>System Output</em>'.
     * @generated
     */
	SystemOutput createSystemOutput();

	/**
     * Returns a new object of class '<em>System Fault</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>System Fault</em>'.
     * @generated
     */
	SystemFault createSystemFault();

	/**
     * Returns a new object of class '<em>System Param</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>System Param</em>'.
     * @generated
     */
	SystemParam createSystemParam();

	/**
     * Returns a new object of class '<em>System Timer</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>System Timer</em>'.
     * @generated
     */
	SystemTimer createSystemTimer();

	/**
     * Returns a new object of class '<em>System Variable</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>System Variable</em>'.
     * @generated
     */
	SystemVariable createSystemVariable();

	/**
     * Returns a new object of class '<em>Subsystem</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Subsystem</em>'.
     * @generated
     */
	Subsystem createSubsystem();

	/**
     * Returns a new object of class '<em>Control Unit</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Control Unit</em>'.
     * @generated
     */
	ControlUnit createControlUnit();

	/**
     * Returns a new object of class '<em>Main Subsystem</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Main Subsystem</em>'.
     * @generated
     */
	MainSubsystem createMainSubsystem();

	/**
     * Returns a new object of class '<em>Authorized System</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Authorized System</em>'.
     * @generated
     */
    AuthorizedSystem createAuthorizedSystem();

    /**
     * Returns a new object of class '<em>Ownership</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Ownership</em>'.
     * @generated
     */
    Ownership createOwnership();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
	WTSpec4MPackage getWTSpec4MPackage();

} //WTSpec4MFactory
