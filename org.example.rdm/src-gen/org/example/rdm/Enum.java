/**
 */
package org.example.rdm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.rdm.Enum#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.example.rdm.Enum#getLiterals <em>Literals</em>}</li>
 * </ul>
 *
 * @see org.example.rdm.RdmPackage#getEnum()
 * @model
 * @generated
 */
public interface Enum extends NamedElement {

    /**
     * Returns the value of the '<em><b>Schema</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.example.rdm.Schema#getTypes <em>Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Schema</em>' container reference.
     * @see #setSchema(Schema)
     * @see org.example.rdm.RdmPackage#getEnum_Schema()
     * @see org.example.rdm.Schema#getTypes
     * @model opposite="types" required="true" transient="false"
     * @generated
     */
    Schema getSchema();

    /**
     * Sets the value of the '{@link org.example.rdm.Enum#getSchema <em>Schema</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Schema</em>' container reference.
     * @see #getSchema()
     * @generated
     */
    void setSchema(Schema value);

    /**
     * Returns the value of the '<em><b>Literals</b></em>' containment reference list.
     * The list contents are of type {@link org.example.rdm.EnumLiteral}.
     * It is bidirectional and its opposite is '{@link org.example.rdm.EnumLiteral#getEnum <em>Enum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Literals</em>' containment reference list.
     * @see org.example.rdm.RdmPackage#getEnum_Literals()
     * @see org.example.rdm.EnumLiteral#getEnum
     * @model opposite="enum" containment="true"
     * @generated
     */
    EList<EnumLiteral> getLiterals();

} // Enum
