/**
 */
package org.example.rdm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.rdm.ForeignKey#getTable <em>Table</em>}</li>
 *   <li>{@link org.example.rdm.ForeignKey#getReferencedKey <em>Referenced Key</em>}</li>
 *   <li>{@link org.example.rdm.ForeignKey#getDeleteAction <em>Delete Action</em>}</li>
 * </ul>
 *
 * @see org.example.rdm.RdmPackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends Key {

    /**
     * Returns the value of the '<em><b>Table</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.example.rdm.Table#getForeignKeys <em>Foreign Keys</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Table</em>' container reference.
     * @see #setTable(Table)
     * @see org.example.rdm.RdmPackage#getForeignKey_Table()
     * @see org.example.rdm.Table#getForeignKeys
     * @model opposite="foreignKeys" required="true" transient="false"
     * @generated
     */
    Table getTable();

    /**
     * Sets the value of the '{@link org.example.rdm.ForeignKey#getTable <em>Table</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Table</em>' container reference.
     * @see #getTable()
     * @generated
     */
    void setTable(Table value);

    /**
     * Returns the value of the '<em><b>Referenced Key</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referenced Key</em>' reference.
     * @see #setReferencedKey(CandidateKey)
     * @see org.example.rdm.RdmPackage#getForeignKey_ReferencedKey()
     * @model required="true"
     * @generated
     */
    CandidateKey getReferencedKey();

    /**
     * Sets the value of the '{@link org.example.rdm.ForeignKey#getReferencedKey <em>Referenced Key</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Referenced Key</em>' reference.
     * @see #getReferencedKey()
     * @generated
     */
    void setReferencedKey(CandidateKey value);

    /**
     * Returns the value of the '<em><b>Delete Action</b></em>' attribute.
     * The literals are from the enumeration {@link org.example.rdm.DeleteAction}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Delete Action</em>' attribute.
     * @see org.example.rdm.DeleteAction
     * @see #setDeleteAction(DeleteAction)
     * @see org.example.rdm.RdmPackage#getForeignKey_DeleteAction()
     * @model required="true"
     * @generated
     */
    DeleteAction getDeleteAction();

    /**
     * Sets the value of the '{@link org.example.rdm.ForeignKey#getDeleteAction <em>Delete Action</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delete Action</em>' attribute.
     * @see org.example.rdm.DeleteAction
     * @see #getDeleteAction()
     * @generated
     */
    void setDeleteAction(DeleteAction value);

} // ForeignKey
