/**
 */
package org.example.dm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Relationship Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.example.dm.DmPackage#getRelationshipKind()
 * @model
 * @generated
 */
public enum RelationshipKind implements Enumerator {

    /**
     * The '<em><b>ASSOCIATION</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ASSOCIATION_VALUE
     * @generated
     * @ordered
     */
    ASSOCIATION(0, "ASSOCIATION", "ASSOCIATION"),

    /**
     * The '<em><b>COMPOSITION</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #COMPOSITION_VALUE
     * @generated
     * @ordered
     */
    COMPOSITION(1, "COMPOSITION", "COMPOSITION"),

    /**
     * The '<em><b>AGGREGATION</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AGGREGATION_VALUE
     * @generated
     * @ordered
     */
    AGGREGATION(2, "AGGREGATION", "AGGREGATION");

    /**
     * The '<em><b>ASSOCIATION</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ASSOCIATION
     * @model annotation="http://www.example.org/annotation name='\u0430\u0441\u0441\u043e\u0446\u0438\u0430\u0446\u0438\u044f'"
     * @generated
     * @ordered
     */
    public static final int ASSOCIATION_VALUE = 0;

    /**
     * The '<em><b>COMPOSITION</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #COMPOSITION
     * @model annotation="http://www.example.org/annotation name='\u043a\u043e\u043c\u043f\u043e\u0437\u0438\u0446\u0438\u044f'"
     * @generated
     * @ordered
     */
    public static final int COMPOSITION_VALUE = 1;

    /**
     * The '<em><b>AGGREGATION</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AGGREGATION
     * @model annotation="http://www.example.org/annotation name='\u0430\u0433\u0440\u0435\u0433\u0430\u0446\u0438\u044f'"
     * @generated
     * @ordered
     */
    public static final int AGGREGATION_VALUE = 2;

    /**
     * An array of all the '<em><b>Relationship Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final RelationshipKind[] VALUES_ARRAY = new RelationshipKind[] {
            ASSOCIATION,
            COMPOSITION,
            AGGREGATION,
    };

    /**
     * A public read-only list of all the '<em><b>Relationship Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<RelationshipKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Relationship Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static RelationshipKind get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            RelationshipKind result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Relationship Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static RelationshipKind getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            RelationshipKind result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Relationship Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static RelationshipKind get(int value) {
        switch (value) {
        case ASSOCIATION_VALUE:
            return ASSOCIATION;
        case COMPOSITION_VALUE:
            return COMPOSITION;
        case AGGREGATION_VALUE:
            return AGGREGATION;
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
    private RelationshipKind(int value, String name, String literal) {
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

} //RelationshipKind
