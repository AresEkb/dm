/**
 */
package org.example.dm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.dm.RelationshipEnd#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.example.dm.RelationshipEnd#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.example.dm.RelationshipEnd#getLower <em>Lower</em>}</li>
 *   <li>{@link org.example.dm.RelationshipEnd#getUpper <em>Upper</em>}</li>
 * </ul>
 *
 * @see org.example.dm.DmPackage#getRelationshipEnd()
 * @model
 * @generated
 */
public interface RelationshipEnd extends NamedElement {

    /**
     * Returns the value of the '<em><b>Entity</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entity</em>' reference.
     * @see #setEntity(Entity)
     * @see org.example.dm.DmPackage#getRelationshipEnd_Entity()
     * @model required="true"
     * @generated
     */
    Entity getEntity();

    /**
     * Sets the value of the '{@link org.example.dm.RelationshipEnd#getEntity <em>Entity</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Entity</em>' reference.
     * @see #getEntity()
     * @generated
     */
    void setEntity(Entity value);

    /**
     * Returns the value of the '<em><b>Lower</b></em>' attribute.
     * The default value is <code>"0"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lower</em>' attribute.
     * @see #setLower(int)
     * @see org.example.dm.DmPackage#getRelationshipEnd_Lower()
     * @model default="0" required="true"
     * @generated
     */
    int getLower();

    /**
     * Sets the value of the '{@link org.example.dm.RelationshipEnd#getLower <em>Lower</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lower</em>' attribute.
     * @see #getLower()
     * @generated
     */
    void setLower(int value);

    /**
     * Returns the value of the '<em><b>Upper</b></em>' attribute.
     * The default value is <code>"1"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Upper</em>' attribute.
     * @see #setUpper(int)
     * @see org.example.dm.DmPackage#getRelationshipEnd_Upper()
     * @model default="1" required="true"
     * @generated
     */
    int getUpper();

    /**
     * Sets the value of the '{@link org.example.dm.RelationshipEnd#getUpper <em>Upper</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Upper</em>' attribute.
     * @see #getUpper()
     * @generated
     */
    void setUpper(int value);

    /**
     * Returns the value of the '<em><b>Relationship</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.example.dm.Relationship#getEnds <em>Ends</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Relationship</em>' container reference.
     * @see #setRelationship(Relationship)
     * @see org.example.dm.DmPackage#getRelationshipEnd_Relationship()
     * @see org.example.dm.Relationship#getEnds
     * @model opposite="ends" required="true" transient="false"
     * @generated
     */
    Relationship getRelationship();

    /**
     * Sets the value of the '{@link org.example.dm.RelationshipEnd#getRelationship <em>Relationship</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Relationship</em>' container reference.
     * @see #getRelationship()
     * @generated
     */
    void setRelationship(Relationship value);

} // RelationshipEnd
