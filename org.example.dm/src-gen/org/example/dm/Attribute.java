/**
 */
package org.example.dm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.dm.Attribute#isIdentity <em>Identity</em>}</li>
 *   <li>{@link org.example.dm.Attribute#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.example.dm.Attribute#getLower <em>Lower</em>}</li>
 *   <li>{@link org.example.dm.Attribute#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.example.dm.Attribute#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see org.example.dm.DmPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends NamedElement {

    /**
     * Returns the value of the '<em><b>Identity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Identity</em>' attribute.
     * @see #setIdentity(boolean)
     * @see org.example.dm.DmPackage#getAttribute_Identity()
     * @model required="true"
     * @generated
     */
    boolean isIdentity();

    /**
     * Sets the value of the '{@link org.example.dm.Attribute#isIdentity <em>Identity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Identity</em>' attribute.
     * @see #isIdentity()
     * @generated
     */
    void setIdentity(boolean value);

    /**
     * Returns the value of the '<em><b>Data Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Type</em>' reference.
     * @see #setDataType(DataType)
     * @see org.example.dm.DmPackage#getAttribute_DataType()
     * @model required="true"
     * @generated
     */
    DataType getDataType();

    /**
     * Sets the value of the '{@link org.example.dm.Attribute#getDataType <em>Data Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Type</em>' reference.
     * @see #getDataType()
     * @generated
     */
    void setDataType(DataType value);

    /**
     * Returns the value of the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Value</em>' attribute.
     * @see #setDefaultValue(String)
     * @see org.example.dm.DmPackage#getAttribute_DefaultValue()
     * @model
     * @generated
     */
    String getDefaultValue();

    /**
     * Sets the value of the '{@link org.example.dm.Attribute#getDefaultValue <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Value</em>' attribute.
     * @see #getDefaultValue()
     * @generated
     */
    void setDefaultValue(String value);

    /**
     * Returns the value of the '<em><b>Upper</b></em>' attribute.
     * The default value is <code>"1"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Upper</em>' attribute.
     * @see #setUpper(int)
     * @see org.example.dm.DmPackage#getAttribute_Upper()
     * @model default="1" required="true"
     * @generated
     */
    int getUpper();

    /**
     * Sets the value of the '{@link org.example.dm.Attribute#getUpper <em>Upper</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Upper</em>' attribute.
     * @see #getUpper()
     * @generated
     */
    void setUpper(int value);

    /**
     * Returns the value of the '<em><b>Lower</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lower</em>' attribute.
     * @see #setLower(int)
     * @see org.example.dm.DmPackage#getAttribute_Lower()
     * @model default="0" required="true"
     * @generated
     */
    int getLower();

    /**
     * Sets the value of the '{@link org.example.dm.Attribute#getLower <em>Lower</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lower</em>' attribute.
     * @see #getLower()
     * @generated
     */
    void setLower(int value);

} // Attribute
