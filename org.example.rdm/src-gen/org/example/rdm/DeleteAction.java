/**
 */
package org.example.rdm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Delete Action</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.example.rdm.RdmPackage#getDeleteAction()
 * @model
 * @generated
 */
public enum DeleteAction implements Enumerator {

    /**
     * The '<em><b>NO ACTION</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NO_ACTION_VALUE
     * @generated
     * @ordered
     */
    NO_ACTION(0, "NO_ACTION", "NO ACTION"),

    /**
     * The '<em><b>CASCADE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CASCADE_VALUE
     * @generated
     * @ordered
     */
    CASCADE(1, "CASCADE", "CASCADE"),

    /**
     * The '<em><b>RESTRICT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RESTRICT_VALUE
     * @generated
     * @ordered
     */
    RESTRICT(2, "RESTRICT", "RESTRICT"),

    /**
     * The '<em><b>SET NULL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SET_NULL_VALUE
     * @generated
     * @ordered
     */
    SET_NULL(3, "SET_NULL", "SET NULL"),

    /**
     * The '<em><b>SET DEFAULT</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SET_DEFAULT_VALUE
     * @generated
     * @ordered
     */
    SET_DEFAULT(4, "SET_DEFAULT", "SET DEFAULT");

    /**
     * The '<em><b>NO ACTION</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NO_ACTION
     * @model literal="NO ACTION"
     * @generated
     * @ordered
     */
    public static final int NO_ACTION_VALUE = 0;

    /**
     * The '<em><b>CASCADE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #CASCADE
     * @model
     * @generated
     * @ordered
     */
    public static final int CASCADE_VALUE = 1;

    /**
     * The '<em><b>RESTRICT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #RESTRICT
     * @model
     * @generated
     * @ordered
     */
    public static final int RESTRICT_VALUE = 2;

    /**
     * The '<em><b>SET NULL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SET_NULL
     * @model literal="SET NULL"
     * @generated
     * @ordered
     */
    public static final int SET_NULL_VALUE = 3;

    /**
     * The '<em><b>SET DEFAULT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SET_DEFAULT
     * @model literal="SET DEFAULT"
     * @generated
     * @ordered
     */
    public static final int SET_DEFAULT_VALUE = 4;

    /**
     * An array of all the '<em><b>Delete Action</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final DeleteAction[] VALUES_ARRAY = new DeleteAction[] {
            NO_ACTION,
            CASCADE,
            RESTRICT,
            SET_NULL,
            SET_DEFAULT,
    };

    /**
     * A public read-only list of all the '<em><b>Delete Action</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<DeleteAction> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Delete Action</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DeleteAction get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            DeleteAction result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Delete Action</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DeleteAction getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            DeleteAction result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Delete Action</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static DeleteAction get(int value) {
        switch (value) {
        case NO_ACTION_VALUE:
            return NO_ACTION;
        case CASCADE_VALUE:
            return CASCADE;
        case RESTRICT_VALUE:
            return RESTRICT;
        case SET_NULL_VALUE:
            return SET_NULL;
        case SET_DEFAULT_VALUE:
            return SET_DEFAULT;
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
    private DeleteAction(int value, String name, String literal) {
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

} //DeleteAction
