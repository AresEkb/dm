/**
 */
package org.example.dm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.dm.DataModel#getLocales <em>Locales</em>}</li>
 *   <li>{@link org.example.dm.DataModel#getEntities <em>Entities</em>}</li>
 *   <li>{@link org.example.dm.DataModel#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link org.example.dm.DataModel#getDataTypes <em>Data Types</em>}</li>
 * </ul>
 *
 * @see org.example.dm.DmPackage#getDataModel()
 * @model
 * @generated
 */
public interface DataModel extends NamedElement {

    /**
     * Returns the value of the '<em><b>Locales</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Locales</em>' attribute list.
     * @see org.example.dm.DmPackage#getDataModel_Locales()
     * @model
     * @generated
     */
    EList<String> getLocales();

    /**
     * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
     * The list contents are of type {@link org.example.dm.Entity}.
     * It is bidirectional and its opposite is '{@link org.example.dm.Entity#getDataModel <em>Data Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entities</em>' containment reference list.
     * @see org.example.dm.DmPackage#getDataModel_Entities()
     * @see org.example.dm.Entity#getDataModel
     * @model opposite="dataModel" containment="true"
     * @generated
     */
    EList<Entity> getEntities();

    /**
     * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
     * The list contents are of type {@link org.example.dm.Relationship}.
     * It is bidirectional and its opposite is '{@link org.example.dm.Relationship#getDataModel <em>Data Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Relationships</em>' containment reference list.
     * @see org.example.dm.DmPackage#getDataModel_Relationships()
     * @see org.example.dm.Relationship#getDataModel
     * @model opposite="dataModel" containment="true"
     * @generated
     */
    EList<Relationship> getRelationships();

    /**
     * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
     * The list contents are of type {@link org.example.dm.DataType}.
     * It is bidirectional and its opposite is '{@link org.example.dm.DataType#getDataModel <em>Data Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Types</em>' containment reference list.
     * @see org.example.dm.DmPackage#getDataModel_DataTypes()
     * @see org.example.dm.DataType#getDataModel
     * @model opposite="dataModel" containment="true"
     * @generated
     */
    EList<DataType> getDataTypes();

} // DataModel
