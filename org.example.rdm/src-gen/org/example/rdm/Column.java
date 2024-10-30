/**
 */
package org.example.rdm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.rdm.Column#getTable <em>Table</em>}</li>
 *   <li>{@link org.example.rdm.Column#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.example.rdm.Column#getCollation <em>Collation</em>}</li>
 *   <li>{@link org.example.rdm.Column#isNullable <em>Nullable</em>}</li>
 *   <li>{@link org.example.rdm.Column#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.example.rdm.Column#getStoredGeneratedValue <em>Stored Generated Value</em>}</li>
 * </ul>
 *
 * @see org.example.rdm.RdmPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends NamedElement {

    /**
     * Returns the value of the '<em><b>Table</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.example.rdm.Table#getColumns <em>Columns</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Table</em>' container reference.
     * @see #setTable(Table)
     * @see org.example.rdm.RdmPackage#getColumn_Table()
     * @see org.example.rdm.Table#getColumns
     * @model opposite="columns" required="true" transient="false"
     * @generated
     */
    Table getTable();

    /**
     * Sets the value of the '{@link org.example.rdm.Column#getTable <em>Table</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Table</em>' container reference.
     * @see #getTable()
     * @generated
     */
    void setTable(Table value);

    /**
     * Returns the value of the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Type</em>' attribute.
     * @see #setDataType(String)
     * @see org.example.rdm.RdmPackage#getColumn_DataType()
     * @model required="true"
     * @generated
     */
    String getDataType();

    /**
     * Sets the value of the '{@link org.example.rdm.Column#getDataType <em>Data Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Type</em>' attribute.
     * @see #getDataType()
     * @generated
     */
    void setDataType(String value);

    /**
     * Returns the value of the '<em><b>Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Collation</em>' attribute.
     * @see #setCollation(String)
     * @see org.example.rdm.RdmPackage#getColumn_Collation()
     * @model
     * @generated
     */
    String getCollation();

    /**
     * Sets the value of the '{@link org.example.rdm.Column#getCollation <em>Collation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Collation</em>' attribute.
     * @see #getCollation()
     * @generated
     */
    void setCollation(String value);

    /**
     * Returns the value of the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nullable</em>' attribute.
     * @see #setNullable(boolean)
     * @see org.example.rdm.RdmPackage#getColumn_Nullable()
     * @model required="true"
     * @generated
     */
    boolean isNullable();

    /**
     * Sets the value of the '{@link org.example.rdm.Column#isNullable <em>Nullable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nullable</em>' attribute.
     * @see #isNullable()
     * @generated
     */
    void setNullable(boolean value);

    /**
     * Returns the value of the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Value</em>' attribute.
     * @see #setDefaultValue(String)
     * @see org.example.rdm.RdmPackage#getColumn_DefaultValue()
     * @model
     * @generated
     */
    String getDefaultValue();

    /**
     * Sets the value of the '{@link org.example.rdm.Column#getDefaultValue <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Value</em>' attribute.
     * @see #getDefaultValue()
     * @generated
     */
    void setDefaultValue(String value);

    /**
     * Returns the value of the '<em><b>Stored Generated Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Stored Generated Value</em>' attribute.
     * @see #setStoredGeneratedValue(String)
     * @see org.example.rdm.RdmPackage#getColumn_StoredGeneratedValue()
     * @model
     * @generated
     */
    String getStoredGeneratedValue();

    /**
     * Sets the value of the '{@link org.example.rdm.Column#getStoredGeneratedValue <em>Stored Generated Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Stored Generated Value</em>' attribute.
     * @see #getStoredGeneratedValue()
     * @generated
     */
    void setStoredGeneratedValue(String value);

} // Column
