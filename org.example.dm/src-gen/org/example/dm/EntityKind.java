/**
 */
package org.example.dm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Entity Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.example.dm.DmPackage#getEntityKind()
 * @model
 * @generated
 */
public enum EntityKind implements Enumerator {

    /**
     * The '<em><b>MASTER DATA</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MASTER_DATA_VALUE
     * @generated
     * @ordered
     */
    MASTER_DATA(0, "MASTER_DATA", "MASTER_DATA"),

    /**
     * The '<em><b>REFERENCE DATA</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REFERENCE_DATA_VALUE
     * @generated
     * @ordered
     */
    REFERENCE_DATA(1, "REFERENCE_DATA", "REFERENCE_DATA"),

    /**
     * The '<em><b>ABSTRACT ENTITY</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ABSTRACT_ENTITY_VALUE
     * @generated
     * @ordered
     */
    ABSTRACT_ENTITY(2, "ABSTRACT_ENTITY", "ABSTRACT_ENTITY"),
    /**
     * The '<em><b>ATTRIBUTE SET</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * @see #ATTRIBUTE_SET_VALUE
     * @generated
     * @ordered
     */
    ATTRIBUTE_SET(3, "ATTRIBUTE_SET", "ATTRIBUTE_SET");

    /**
     * The '<em><b>MASTER DATA</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #MASTER_DATA
     * @model annotation="http://www.example.org/annotation name='\u043c\u0430\u0441\u0442\u0435\u0440-\u0434\u0430\u043d\u043d\u044b\u0435'"
     * @generated
     * @ordered
     */
    public static final int MASTER_DATA_VALUE = 0;

    /**
     * The '<em><b>REFERENCE DATA</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #REFERENCE_DATA
     * @model annotation="http://www.example.org/annotation name='\u0441\u043f\u0440\u0430\u0432\u043e\u0447\u043d\u044b\u0435 \u0434\u0430\u043d\u043d\u044b\u0435'"
     * @generated
     * @ordered
     */
    public static final int REFERENCE_DATA_VALUE = 1;

    /**
     * The '<em><b>ABSTRACT ENTITY</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ABSTRACT_ENTITY
     * @model annotation="http://www.example.org/annotation name='\u0430\u0431\u0441\u0442\u0440\u0430\u043a\u0442\u043d\u0430\u044f \u0441\u0443\u0449\u043d\u043e\u0441\u0442\u044c'"
     * @generated
     * @ordered
     */
    public static final int ABSTRACT_ENTITY_VALUE = 2;

    /**
     * The '<em><b>ATTRIBUTE SET</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ATTRIBUTE_SET
     * @model annotation="http://www.example.org/annotation name='\u043d\u0430\u0431\u043e\u0440 \u0430\u0442\u0440\u0438\u0431\u0443\u0442\u043e\u0432'"
     * @generated
     * @ordered
     */
    public static final int ATTRIBUTE_SET_VALUE = 3;

    /**
     * An array of all the '<em><b>Entity Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final EntityKind[] VALUES_ARRAY = new EntityKind[] {
            MASTER_DATA,
            REFERENCE_DATA,
            ABSTRACT_ENTITY,
            ATTRIBUTE_SET,
    };

    /**
     * A public read-only list of all the '<em><b>Entity Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<EntityKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Entity Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static EntityKind get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            EntityKind result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Entity Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static EntityKind getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            EntityKind result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Entity Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static EntityKind get(int value) {
        switch (value) {
        case MASTER_DATA_VALUE:
            return MASTER_DATA;
        case REFERENCE_DATA_VALUE:
            return REFERENCE_DATA;
        case ABSTRACT_ENTITY_VALUE:
            return ABSTRACT_ENTITY;
        case ATTRIBUTE_SET_VALUE:
            return ATTRIBUTE_SET;
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
    private EntityKind(int value, String name, String literal) {
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

} //EntityKind
