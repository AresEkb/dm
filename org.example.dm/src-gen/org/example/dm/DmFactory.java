/**
 */
package org.example.dm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.example.dm.DmPackage
 * @generated
 */
public interface DmFactory extends EFactory {

    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    DmFactory eINSTANCE = org.example.dm.impl.DmFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Localization</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Localization</em>'.
     * @generated
     */
    Localization createLocalization();

    /**
     * Returns a new object of class '<em>Data Model</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Model</em>'.
     * @generated
     */
    DataModel createDataModel();

    /**
     * Returns a new object of class '<em>Entity</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Entity</em>'.
     * @generated
     */
    Entity createEntity();

    /**
     * Returns a new object of class '<em>Attribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Attribute</em>'.
     * @generated
     */
    Attribute createAttribute();

    /**
     * Returns a new object of class '<em>Relationship</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Relationship</em>'.
     * @generated
     */
    Relationship createRelationship();

    /**
     * Returns a new object of class '<em>Relationship End</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Relationship End</em>'.
     * @generated
     */
    RelationshipEnd createRelationshipEnd();

    /**
     * Returns a new object of class '<em>Boolean Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Boolean Type</em>'.
     * @generated
     */
    BooleanType createBooleanType();

    /**
     * Returns a new object of class '<em>String Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>String Type</em>'.
     * @generated
     */
    StringType createStringType();

    /**
     * Returns a new object of class '<em>Numeric Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Numeric Type</em>'.
     * @generated
     */
    NumericType createNumericType();

    /**
     * Returns a new object of class '<em>Date Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Date Type</em>'.
     * @generated
     */
    DateType createDateType();

    /**
     * Returns a new object of class '<em>Date Time Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Date Time Type</em>'.
     * @generated
     */
    DateTimeType createDateTimeType();

    /**
     * Returns a new object of class '<em>Uuid Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Uuid Type</em>'.
     * @generated
     */
    UuidType createUuidType();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    DmPackage getDmPackage();

} //DmFactory
