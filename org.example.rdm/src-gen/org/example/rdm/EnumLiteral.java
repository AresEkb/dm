/**
 */
package org.example.rdm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.rdm.EnumLiteral#getEnum <em>Enum</em>}</li>
 * </ul>
 *
 * @see org.example.rdm.RdmPackage#getEnumLiteral()
 * @model
 * @generated
 */
public interface EnumLiteral extends NamedElement {

    /**
     * Returns the value of the '<em><b>Enum</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.example.rdm.Enum#getLiterals <em>Literals</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Enum</em>' container reference.
     * @see #setEnum(org.example.rdm.Enum)
     * @see org.example.rdm.RdmPackage#getEnumLiteral_Enum()
     * @see org.example.rdm.Enum#getLiterals
     * @model opposite="literals" required="true" transient="false"
     * @generated
     */
    org.example.rdm.Enum getEnum();

    /**
     * Sets the value of the '{@link org.example.rdm.EnumLiteral#getEnum <em>Enum</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Enum</em>' container reference.
     * @see #getEnum()
     * @generated
     */
    void setEnum(org.example.rdm.Enum value);

} // EnumLiteral
