/**
 */
package org.example.dm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.dm.DataType#getDataModel <em>Data Model</em>}</li>
 * </ul>
 *
 * @see org.example.dm.DmPackage#getDataType()
 * @model abstract="true"
 * @generated
 */
public interface DataType extends NamedElement {

    /**
     * Returns the value of the '<em><b>Data Model</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.example.dm.DataModel#getDataTypes <em>Data Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Model</em>' container reference.
     * @see #setDataModel(DataModel)
     * @see org.example.dm.DmPackage#getDataType_DataModel()
     * @see org.example.dm.DataModel#getDataTypes
     * @model opposite="dataTypes" required="true" transient="false"
     * @generated
     */
    DataModel getDataModel();

    /**
     * Sets the value of the '{@link org.example.dm.DataType#getDataModel <em>Data Model</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Model</em>' container reference.
     * @see #getDataModel()
     * @generated
     */
    void setDataModel(DataModel value);

} // DataType
