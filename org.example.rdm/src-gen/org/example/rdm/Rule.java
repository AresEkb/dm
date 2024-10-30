/**
 */
package org.example.rdm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.rdm.Rule#getTable <em>Table</em>}</li>
 *   <li>{@link org.example.rdm.Rule#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see org.example.rdm.RdmPackage#getRule()
 * @model abstract="true"
 * @generated
 */
public interface Rule extends NamedElement {

    /**
     * Returns the value of the '<em><b>Table</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.example.rdm.Table#getRules <em>Rules</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Table</em>' container reference.
     * @see #setTable(Table)
     * @see org.example.rdm.RdmPackage#getRule_Table()
     * @see org.example.rdm.Table#getRules
     * @model opposite="rules" required="true" transient="false"
     * @generated
     */
    Table getTable();

    /**
     * Sets the value of the '{@link org.example.rdm.Rule#getTable <em>Table</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Table</em>' container reference.
     * @see #getTable()
     * @generated
     */
    void setTable(Table value);

    /**
     * Returns the value of the '<em><b>Statement</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Statement</em>' attribute.
     * @see #setStatement(String)
     * @see org.example.rdm.RdmPackage#getRule_Statement()
     * @model
     * @generated
     */
    String getStatement();

    /**
     * Sets the value of the '{@link org.example.rdm.Rule#getStatement <em>Statement</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Statement</em>' attribute.
     * @see #getStatement()
     * @generated
     */
    void setStatement(String value);

} // Rule
