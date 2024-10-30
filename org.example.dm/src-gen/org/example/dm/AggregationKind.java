/**
 */
package org.example.dm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Aggregation Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.example.dm.DmPackage#getAggregationKind()
 * @model
 * @generated
 */
public enum AggregationKind implements Enumerator {

    /**
     * The '<em><b>NONE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NONE_VALUE
     * @generated
     * @ordered
     */
    NONE(0, "NONE", "NONE"),

    /**
     * The '<em><b>SHARED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SHARED_VALUE
     * @generated
     * @ordered
     */
    SHARED(1, "SHARED", "SHARED"),

    /**
     * The '<em><b>COMPOSITE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #COMPOSITE_VALUE
     * @generated
     * @ordered
     */
    COMPOSITE(2, "COMPOSITE", "COMPOSITE");

    /**
     * The '<em><b>NONE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NONE
     * @model annotation="http://www.example.org/annotation name='\u043d\u0435\u0442'"
     * @generated
     * @ordered
     */
    public static final int NONE_VALUE = 0;

    /**
     * The '<em><b>SHARED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SHARED
     * @model annotation="http://www.example.org/annotation name='\u0430\u0433\u0440\u0435\u0433\u0430\u0446\u0438\u044f'"
     * @generated
     * @ordered
     */
    public static final int SHARED_VALUE = 1;

    /**
     * The '<em><b>COMPOSITE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #COMPOSITE
     * @model annotation="http://www.example.org/annotation name='\u043a\u043e\u043c\u043f\u043e\u0437\u0438\u0446\u0438\u044f'"
     * @generated
     * @ordered
     */
    public static final int COMPOSITE_VALUE = 2;

    /**
     * An array of all the '<em><b>Aggregation Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final AggregationKind[] VALUES_ARRAY = new AggregationKind[] {
            NONE,
            SHARED,
            COMPOSITE,
    };

    /**
     * A public read-only list of all the '<em><b>Aggregation Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<AggregationKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Aggregation Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AggregationKind get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AggregationKind result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Aggregation Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AggregationKind getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            AggregationKind result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Aggregation Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static AggregationKind get(int value) {
        switch (value) {
        case NONE_VALUE:
            return NONE;
        case SHARED_VALUE:
            return SHARED;
        case COMPOSITE_VALUE:
            return COMPOSITE;
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
    private AggregationKind(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
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

} //AggregationKind
