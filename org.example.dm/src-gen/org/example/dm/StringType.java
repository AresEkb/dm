/**
 */
package org.example.dm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.dm.StringType#getLength <em>Length</em>}</li>
 *   <li>{@link org.example.dm.StringType#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link org.example.dm.StringType#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.example.dm.StringType#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @see org.example.dm.DmPackage#getStringType()
 * @model
 * @generated
 */
public interface StringType extends DataType {

    /**
     * Returns the value of the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Length</em>' attribute.
     * @see #setLength(Integer)
     * @see org.example.dm.DmPackage#getStringType_Length()
     * @model
     * @generated
     */
    Integer getLength();

    /**
     * Sets the value of the '{@link org.example.dm.StringType#getLength <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Length</em>' attribute.
     * @see #getLength()
     * @generated
     */
    void setLength(Integer value);

    /**
     * Returns the value of the '<em><b>Min Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Length</em>' attribute.
     * @see #setMinLength(Integer)
     * @see org.example.dm.DmPackage#getStringType_MinLength()
     * @model
     * @generated
     */
    Integer getMinLength();

    /**
     * Sets the value of the '{@link org.example.dm.StringType#getMinLength <em>Min Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Length</em>' attribute.
     * @see #getMinLength()
     * @generated
     */
    void setMinLength(Integer value);

    /**
     * Returns the value of the '<em><b>Max Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Length</em>' attribute.
     * @see #setMaxLength(Integer)
     * @see org.example.dm.DmPackage#getStringType_MaxLength()
     * @model
     * @generated
     */
    Integer getMaxLength();

    /**
     * Sets the value of the '{@link org.example.dm.StringType#getMaxLength <em>Max Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Length</em>' attribute.
     * @see #getMaxLength()
     * @generated
     */
    void setMaxLength(Integer value);

    /**
     * Returns the value of the '<em><b>Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pattern</em>' attribute.
     * @see #setPattern(String)
     * @see org.example.dm.DmPackage#getStringType_Pattern()
     * @model
     * @generated
     */
    String getPattern();

    /**
     * Sets the value of the '{@link org.example.dm.StringType#getPattern <em>Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pattern</em>' attribute.
     * @see #getPattern()
     * @generated
     */
    void setPattern(String value);

} // StringType
