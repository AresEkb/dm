/**
 */
package org.example.rdm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.rdm.Table#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.example.rdm.Table#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.example.rdm.Table#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link org.example.rdm.Table#getAlternateKeys <em>Alternate Keys</em>}</li>
 *   <li>{@link org.example.rdm.Table#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link org.example.rdm.Table#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.example.rdm.Table#getIndices <em>Indices</em>}</li>
 *   <li>{@link org.example.rdm.Table#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see org.example.rdm.RdmPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends NamedElement {

    /**
     * Returns the value of the '<em><b>Schema</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.example.rdm.Schema#getTables <em>Tables</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Schema</em>' container reference.
     * @see #setSchema(Schema)
     * @see org.example.rdm.RdmPackage#getTable_Schema()
     * @see org.example.rdm.Schema#getTables
     * @model opposite="tables" required="true" transient="false"
     * @generated
     */
    Schema getSchema();

    /**
     * Sets the value of the '{@link org.example.rdm.Table#getSchema <em>Schema</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Schema</em>' container reference.
     * @see #getSchema()
     * @generated
     */
    void setSchema(Schema value);

    /**
     * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
     * The list contents are of type {@link org.example.rdm.Column}.
     * It is bidirectional and its opposite is '{@link org.example.rdm.Column#getTable <em>Table</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Columns</em>' containment reference list.
     * @see org.example.rdm.RdmPackage#getTable_Columns()
     * @see org.example.rdm.Column#getTable
     * @model opposite="table" containment="true"
     * @generated
     */
    EList<Column> getColumns();

    /**
     * Returns the value of the '<em><b>Primary Key</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Primary Key</em>' containment reference.
     * @see #setPrimaryKey(PrimaryKey)
     * @see org.example.rdm.RdmPackage#getTable_PrimaryKey()
     * @model containment="true"
     * @generated
     */
    PrimaryKey getPrimaryKey();

    /**
     * Sets the value of the '{@link org.example.rdm.Table#getPrimaryKey <em>Primary Key</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Primary Key</em>' containment reference.
     * @see #getPrimaryKey()
     * @generated
     */
    void setPrimaryKey(PrimaryKey value);

    /**
     * Returns the value of the '<em><b>Alternate Keys</b></em>' containment reference list.
     * The list contents are of type {@link org.example.rdm.AlternateKey}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Alternate Keys</em>' containment reference list.
     * @see org.example.rdm.RdmPackage#getTable_AlternateKeys()
     * @model containment="true"
     * @generated
     */
    EList<AlternateKey> getAlternateKeys();

    /**
     * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference list.
     * The list contents are of type {@link org.example.rdm.ForeignKey}.
     * It is bidirectional and its opposite is '{@link org.example.rdm.ForeignKey#getTable <em>Table</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Foreign Keys</em>' containment reference list.
     * @see org.example.rdm.RdmPackage#getTable_ForeignKeys()
     * @see org.example.rdm.ForeignKey#getTable
     * @model opposite="table" containment="true"
     * @generated
     */
    EList<ForeignKey> getForeignKeys();

    /**
     * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
     * The list contents are of type {@link org.example.rdm.Constraint}.
     * It is bidirectional and its opposite is '{@link org.example.rdm.Constraint#getTable <em>Table</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Constraints</em>' containment reference list.
     * @see org.example.rdm.RdmPackage#getTable_Constraints()
     * @see org.example.rdm.Constraint#getTable
     * @model opposite="table" containment="true"
     * @generated
     */
    EList<Constraint> getConstraints();

    /**
     * Returns the value of the '<em><b>Indices</b></em>' containment reference list.
     * The list contents are of type {@link org.example.rdm.Index}.
     * It is bidirectional and its opposite is '{@link org.example.rdm.Index#getTable <em>Table</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Indices</em>' containment reference list.
     * @see org.example.rdm.RdmPackage#getTable_Indices()
     * @see org.example.rdm.Index#getTable
     * @model opposite="table" containment="true"
     * @generated
     */
    EList<Index> getIndices();

    /**
     * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
     * The list contents are of type {@link org.example.rdm.Rule}.
     * It is bidirectional and its opposite is '{@link org.example.rdm.Rule#getTable <em>Table</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rules</em>' containment reference list.
     * @see org.example.rdm.RdmPackage#getTable_Rules()
     * @see org.example.rdm.Rule#getTable
     * @model opposite="table" containment="true"
     * @generated
     */
    EList<Rule> getRules();

} // Table
