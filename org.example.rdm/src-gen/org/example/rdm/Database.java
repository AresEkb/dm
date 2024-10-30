/**
 */
package org.example.rdm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.rdm.Database#getSchemas <em>Schemas</em>}</li>
 * </ul>
 *
 * @see org.example.rdm.RdmPackage#getDatabase()
 * @model
 * @generated
 */
public interface Database extends NamedElement {

    /**
     * Returns the value of the '<em><b>Schemas</b></em>' containment reference list.
     * The list contents are of type {@link org.example.rdm.Schema}.
     * It is bidirectional and its opposite is '{@link org.example.rdm.Schema#getDatabase <em>Database</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Schemas</em>' containment reference list.
     * @see org.example.rdm.RdmPackage#getDatabase_Schemas()
     * @see org.example.rdm.Schema#getDatabase
     * @model opposite="database" containment="true"
     * @generated
     */
    EList<Schema> getSchemas();

} // Database
