/**
 */
package org.example.rdm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.rdm.Schema#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.example.rdm.Schema#getTables <em>Tables</em>}</li>
 *   <li>{@link org.example.rdm.Schema#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see org.example.rdm.RdmPackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends NamedElement {

    /**
     * Returns the value of the '<em><b>Database</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.example.rdm.Database#getSchemas <em>Schemas</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Database</em>' container reference.
     * @see #setDatabase(Database)
     * @see org.example.rdm.RdmPackage#getSchema_Database()
     * @see org.example.rdm.Database#getSchemas
     * @model opposite="schemas" required="true" transient="false"
     * @generated
     */
    Database getDatabase();

    /**
     * Sets the value of the '{@link org.example.rdm.Schema#getDatabase <em>Database</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Database</em>' container reference.
     * @see #getDatabase()
     * @generated
     */
    void setDatabase(Database value);

    /**
     * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
     * The list contents are of type {@link org.example.rdm.Table}.
     * It is bidirectional and its opposite is '{@link org.example.rdm.Table#getSchema <em>Schema</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tables</em>' containment reference list.
     * @see org.example.rdm.RdmPackage#getSchema_Tables()
     * @see org.example.rdm.Table#getSchema
     * @model opposite="schema" containment="true"
     * @generated
     */
    EList<Table> getTables();

    /**
     * Returns the value of the '<em><b>Types</b></em>' containment reference list.
     * The list contents are of type {@link org.example.rdm.Enum}.
     * It is bidirectional and its opposite is '{@link org.example.rdm.Enum#getSchema <em>Schema</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Types</em>' containment reference list.
     * @see org.example.rdm.RdmPackage#getSchema_Types()
     * @see org.example.rdm.Enum#getSchema
     * @model opposite="schema" containment="true"
     * @generated
     */
    EList<org.example.rdm.Enum> getTypes();

} // Schema
