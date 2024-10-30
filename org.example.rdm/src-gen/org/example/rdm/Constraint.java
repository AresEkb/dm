/**
 */
package org.example.rdm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.rdm.Constraint#getTable <em>Table</em>}</li>
 *   <li>{@link org.example.rdm.Constraint#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.example.rdm.RdmPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends NamedElement {

    /**
     * Returns the value of the '<em><b>Table</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.example.rdm.Table#getConstraints <em>Constraints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Table</em>' container reference.
     * @see #setTable(Table)
     * @see org.example.rdm.RdmPackage#getConstraint_Table()
     * @see org.example.rdm.Table#getConstraints
     * @model opposite="constraints" required="true" transient="false"
     * @generated
     */
    Table getTable();

    /**
     * Sets the value of the '{@link org.example.rdm.Constraint#getTable <em>Table</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Table</em>' container reference.
     * @see #getTable()
     * @generated
     */
    void setTable(Table value);

    /**
     * Returns the value of the '<em><b>Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expression</em>' attribute.
     * @see #setExpression(String)
     * @see org.example.rdm.RdmPackage#getConstraint_Expression()
     * @model required="true"
     * @generated
     */
    String getExpression();

    /**
     * Sets the value of the '{@link org.example.rdm.Constraint#getExpression <em>Expression</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression</em>' attribute.
     * @see #getExpression()
     * @generated
     */
    void setExpression(String value);

} // Constraint
