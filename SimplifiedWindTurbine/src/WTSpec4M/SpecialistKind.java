/**
 */
package WTSpec4M;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Specialist Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see WTSpec4M.WTSpec4MPackage#getSpecialistKind()
 * @model
 * @generated
 */
public enum SpecialistKind implements Enumerator {
    /**
     * The '<em><b>PUMP</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PUMP_VALUE
     * @generated
     * @ordered
     */
    PUMP(0, "PUMP", "PUMP"),

    /**
     * The '<em><b>HEATER</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HEATER_VALUE
     * @generated
     * @ordered
     */
    HEATER(1, "HEATER", "HEATER"),

    /**
     * The '<em><b>FAN</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FAN_VALUE
     * @generated
     * @ordered
     */
    FAN(2, "FAN", "FAN");

    /**
     * The '<em><b>PUMP</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>PUMP</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PUMP
     * @model
     * @generated
     * @ordered
     */
    public static final int PUMP_VALUE = 0;

    /**
     * The '<em><b>HEATER</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>HEATER</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #HEATER
     * @model
     * @generated
     * @ordered
     */
    public static final int HEATER_VALUE = 1;

    /**
     * The '<em><b>FAN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>FAN</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FAN
     * @model
     * @generated
     * @ordered
     */
    public static final int FAN_VALUE = 2;

    /**
     * An array of all the '<em><b>Specialist Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final SpecialistKind[] VALUES_ARRAY =
        new SpecialistKind[] {
            PUMP,
            HEATER,
            FAN,
        };

    /**
     * A public read-only list of all the '<em><b>Specialist Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<SpecialistKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Specialist Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static SpecialistKind get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SpecialistKind result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Specialist Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static SpecialistKind getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            SpecialistKind result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Specialist Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static SpecialistKind get(int value) {
        switch (value) {
            case PUMP_VALUE: return PUMP;
            case HEATER_VALUE: return HEATER;
            case FAN_VALUE: return FAN;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private SpecialistKind(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getValue() {
      return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
      return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLiteral() {
      return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }
    
} //SpecialistKind
