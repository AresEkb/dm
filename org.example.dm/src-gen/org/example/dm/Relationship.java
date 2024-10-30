/**
 */
package org.example.dm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.dm.Relationship#getDataModel <em>Data Model</em>}</li>
 *   <li>{@link org.example.dm.Relationship#getKind <em>Kind</em>}</li>
 *   <li>{@link org.example.dm.Relationship#getEnds <em>Ends</em>}</li>
 * </ul>
 *
 * @see org.example.dm.DmPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends NamedElement {

    /**
     * Returns the value of the '<em><b>Ends</b></em>' containment reference list.
     * The list contents are of type {@link org.example.dm.RelationshipEnd}.
     * It is bidirectional and its opposite is '{@link org.example.dm.RelationshipEnd#getRelationship <em>Relationship</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ends</em>' containment reference list.
     * @see org.example.dm.DmPackage#getRelationship_Ends()
     * @see org.example.dm.RelationshipEnd#getRelationship
     * @model opposite="relationship" containment="true" lower="2"
     * @generated
     */
    EList<RelationshipEnd> getEnds();

    /**
     * Returns the value of the '<em><b>Data Model</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.example.dm.DataModel#getRelationships <em>Relationships</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Data Model</em>' container reference.
     * @see #setDataModel(DataModel)
     * @see org.example.dm.DmPackage#getRelationship_DataModel()
     * @see org.example.dm.DataModel#getRelationships
     * @model opposite="relationships" resolveProxies="false" required="true" transient="false"
     * @generated
     */
    DataModel getDataModel();

    /**
     * Sets the value of the '{@link org.example.dm.Relationship#getDataModel <em>Data Model</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Model</em>' container reference.
     * @see #getDataModel()
     * @generated
     */
    void setDataModel(DataModel value);

    /**
     * Returns the value of the '<em><b>Kind</b></em>' attribute.
     * The literals are from the enumeration {@link org.example.dm.RelationshipKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kind</em>' attribute.
     * @see org.example.dm.RelationshipKind
     * @see #setKind(RelationshipKind)
     * @see org.example.dm.DmPackage#getRelationship_Kind()
     * @model required="true"
     * @generated
     */
    RelationshipKind getKind();

    /**
     * Sets the value of the '{@link org.example.dm.Relationship#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kind</em>' attribute.
     * @see org.example.dm.RelationshipKind
     * @see #getKind()
     * @generated
     */
    void setKind(RelationshipKind value);

} // Relationship
