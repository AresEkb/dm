/**
 */
package org.example.dm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.dm.Entity#getDataModel <em>Data Model</em>}</li>
 *   <li>{@link org.example.dm.Entity#getGenerals <em>Generals</em>}</li>
 *   <li>{@link org.example.dm.Entity#getKind <em>Kind</em>}</li>
 *   <li>{@link org.example.dm.Entity#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see org.example.dm.DmPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends NamedElement {

    /**
     * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
     * The list contents are of type {@link org.example.dm.Attribute}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attributes</em>' containment reference list.
     * @see org.example.dm.DmPackage#getEntity_Attributes()
     * @model containment="true"
     * @generated
     */
    EList<Attribute> getAttributes();

    /**
     * Returns the value of the '<em><b>Generals</b></em>' reference list.
     * The list contents are of type {@link org.example.dm.Entity}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Generals</em>' reference list.
     * @see org.example.dm.DmPackage#getEntity_Generals()
     * @model
     * @generated
     */
    EList<Entity> getGenerals();

    /**
     * Returns the value of the '<em><b>Data Model</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.example.dm.DataModel#getEntities <em>Entities</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Model</em>' container reference.
     * @see #setDataModel(DataModel)
     * @see org.example.dm.DmPackage#getEntity_DataModel()
     * @see org.example.dm.DataModel#getEntities
     * @model opposite="entities" resolveProxies="false" required="true" transient="false"
     * @generated
     */
    DataModel getDataModel();

    /**
     * Sets the value of the '{@link org.example.dm.Entity#getDataModel <em>Data Model</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Model</em>' container reference.
     * @see #getDataModel()
     * @generated
     */
    void setDataModel(DataModel value);

    /**
     * Returns the value of the '<em><b>Kind</b></em>' attribute.
     * The literals are from the enumeration {@link org.example.dm.EntityKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kind</em>' attribute.
     * @see org.example.dm.EntityKind
     * @see #setKind(EntityKind)
     * @see org.example.dm.DmPackage#getEntity_Kind()
     * @model required="true"
     * @generated
     */
    EntityKind getKind();

    /**
     * Sets the value of the '{@link org.example.dm.Entity#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kind</em>' attribute.
     * @see org.example.dm.EntityKind
     * @see #getKind()
     * @generated
     */
    void setKind(EntityKind value);

} // Entity
