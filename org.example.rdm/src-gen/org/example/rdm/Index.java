/**
 */
package org.example.rdm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.rdm.Index#getTable <em>Table</em>}</li>
 *   <li>{@link org.example.rdm.Index#isUnique <em>Unique</em>}</li>
 *   <li>{@link org.example.rdm.Index#getType <em>Type</em>}</li>
 *   <li>{@link org.example.rdm.Index#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @see org.example.rdm.RdmPackage#getIndex()
 * @model
 * @generated
 */
public interface Index extends NamedElement {

    /**
     * Returns the value of the '<em><b>Table</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.example.rdm.Table#getIndices <em>Indices</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Table</em>' container reference.
     * @see #setTable(Table)
     * @see org.example.rdm.RdmPackage#getIndex_Table()
     * @see org.example.rdm.Table#getIndices
     * @model opposite="indices" required="true" transient="false"
     * @generated
     */
    Table getTable();

    /**
     * Sets the value of the '{@link org.example.rdm.Index#getTable <em>Table</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Table</em>' container reference.
     * @see #getTable()
     * @generated
     */
    void setTable(Table value);

    /**
     * Returns the value of the '<em><b>Unique</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Unique</em>' attribute.
     * @see #setUnique(boolean)
     * @see org.example.rdm.RdmPackage#getIndex_Unique()
     * @model required="true"
     * @generated
     */
    boolean isUnique();

    /**
     * Sets the value of the '{@link org.example.rdm.Index#isUnique <em>Unique</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unique</em>' attribute.
     * @see #isUnique()
     * @generated
     */
    void setUnique(boolean value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see org.example.rdm.RdmPackage#getIndex_Type()
     * @model required="true"
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link org.example.rdm.Index#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

    /**
     * Returns the value of the '<em><b>Expressions</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expressions</em>' attribute list.
     * @see org.example.rdm.RdmPackage#getIndex_Expressions()
     * @model required="true"
     * @generated
     */
    EList<String> getExpressions();

} // Index
