/**
 */
package org.example.rdm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.example.rdm.RdmPackage
 * @generated
 */
public interface RdmFactory extends EFactory {

    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    RdmFactory eINSTANCE = org.example.rdm.impl.RdmFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Database</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Database</em>'.
     * @generated
     */
    Database createDatabase();

    /**
     * Returns a new object of class '<em>Schema</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Schema</em>'.
     * @generated
     */
    Schema createSchema();

    /**
     * Returns a new object of class '<em>Table</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Table</em>'.
     * @generated
     */
    Table createTable();

    /**
     * Returns a new object of class '<em>Column</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Column</em>'.
     * @generated
     */
    Column createColumn();

    /**
     * Returns a new object of class '<em>Primary Key</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Primary Key</em>'.
     * @generated
     */
    PrimaryKey createPrimaryKey();

    /**
     * Returns a new object of class '<em>Alternate Key</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Alternate Key</em>'.
     * @generated
     */
    AlternateKey createAlternateKey();

    /**
     * Returns a new object of class '<em>Foreign Key</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Foreign Key</em>'.
     * @generated
     */
    ForeignKey createForeignKey();

    /**
     * Returns a new object of class '<em>Constraint</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Constraint</em>'.
     * @generated
     */
    Constraint createConstraint();

    /**
     * Returns a new object of class '<em>Index</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Index</em>'.
     * @generated
     */
    Index createIndex();

    /**
     * Returns a new object of class '<em>Delete Rule</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Delete Rule</em>'.
     * @generated
     */
    DeleteRule createDeleteRule();

    /**
     * Returns a new object of class '<em>Enum</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Enum</em>'.
     * @generated
     */
    Enum createEnum();

    /**
     * Returns a new object of class '<em>Enum Literal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Enum Literal</em>'.
     * @generated
     */
    EnumLiteral createEnumLiteral();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    RdmPackage getRdmPackage();

} //RdmFactory
