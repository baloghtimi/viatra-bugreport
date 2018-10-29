/**
 */
package WTSpec4M;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WTSpec4M.SystemParam#getValue <em>Value</em>}</li>
 *   <li>{@link WTSpec4M.SystemParam#isSettable <em>Settable</em>}</li>
 * </ul>
 *
 * @see WTSpec4M.WTSpec4MPackage#getSystemParam()
 * @model
 * @generated
 */
public interface SystemParam extends WTCParam {
	/**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(int)
     * @see WTSpec4M.WTSpec4MPackage#getSystemParam_Value()
     * @model
     * @generated
     */
	int getValue();

	/**
     * Sets the value of the '{@link WTSpec4M.SystemParam#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
	void setValue(int value);

	/**
     * Returns the value of the '<em><b>Settable</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Settable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Settable</em>' attribute.
     * @see #setSettable(boolean)
     * @see WTSpec4M.WTSpec4MPackage#getSystemParam_Settable()
     * @model
     * @generated
     */
	boolean isSettable();

	/**
     * Sets the value of the '{@link WTSpec4M.SystemParam#isSettable <em>Settable</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Settable</em>' attribute.
     * @see #isSettable()
     * @generated
     */
	void setSettable(boolean value);

} // SystemParam
