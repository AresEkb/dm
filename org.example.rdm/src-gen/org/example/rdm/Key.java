/**
 */
package org.example.rdm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.rdm.Key#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see org.example.rdm.RdmPackage#getKey()
 * @model abstract="true"
 * @generated
 */
public interface Key extends NamedElement {

    /**
     * Returns the value of the '<em><b>Columns</b></em>' reference list.
     * The list contents are of type {@link org.example.rdm.Column}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Columns</em>' reference list.
     * @see org.example.rdm.RdmPackage#getKey_Columns()
     * @model
     * @generated
     */
    EList<Column> getColumns();

} // Key
