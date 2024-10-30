/**
 */
package org.example.rdm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.example.rdm.AlternateKey;
import org.example.rdm.Column;
import org.example.rdm.Constraint;
import org.example.rdm.Database;
import org.example.rdm.DeleteAction;
import org.example.rdm.DeleteRule;
import org.example.rdm.EnumLiteral;
import org.example.rdm.ForeignKey;
import org.example.rdm.Index;
import org.example.rdm.PrimaryKey;
import org.example.rdm.RdmFactory;
import org.example.rdm.RdmPackage;
import org.example.rdm.Schema;
import org.example.rdm.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RdmFactoryImpl extends EFactoryImpl implements RdmFactory {

    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static RdmFactory init() {
        try {
            RdmFactory theRdmFactory = (RdmFactory) EPackage.Registry.INSTANCE.getEFactory(RdmPackage.eNS_URI);
            if (theRdmFactory != null) {
                return theRdmFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new RdmFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RdmFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case RdmPackage.DATABASE:
            return createDatabase();
        case RdmPackage.SCHEMA:
            return createSchema();
        case RdmPackage.TABLE:
            return createTable();
        case RdmPackage.COLUMN:
            return createColumn();
        case RdmPackage.PRIMARY_KEY:
            return createPrimaryKey();
        case RdmPackage.ALTERNATE_KEY:
            return createAlternateKey();
        case RdmPackage.FOREIGN_KEY:
            return createForeignKey();
        case RdmPackage.CONSTRAINT:
            return createConstraint();
        case RdmPackage.INDEX:
            return createIndex();
        case RdmPackage.DELETE_RULE:
            return createDeleteRule();
        case RdmPackage.ENUM:
            return createEnum();
        case RdmPackage.ENUM_LITERAL:
            return createEnumLiteral();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
        case RdmPackage.DELETE_ACTION:
            return createDeleteActionFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
        case RdmPackage.DELETE_ACTION:
            return convertDeleteActionToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Database createDatabase() {
        DatabaseImpl database = new DatabaseImpl();
        return database;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Schema createSchema() {
        SchemaImpl schema = new SchemaImpl();
        return schema;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Table createTable() {
        TableImpl table = new TableImpl();
        return table;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Column createColumn() {
        ColumnImpl column = new ColumnImpl();
        return column;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PrimaryKey createPrimaryKey() {
        PrimaryKeyImpl primaryKey = new PrimaryKeyImpl();
        return primaryKey;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AlternateKey createAlternateKey() {
        AlternateKeyImpl alternateKey = new AlternateKeyImpl();
        return alternateKey;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ForeignKey createForeignKey() {
        ForeignKeyImpl foreignKey = new ForeignKeyImpl();
        return foreignKey;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Constraint createConstraint() {
        ConstraintImpl constraint = new ConstraintImpl();
        return constraint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Index createIndex() {
        IndexImpl index = new IndexImpl();
        return index;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DeleteRule createDeleteRule() {
        DeleteRuleImpl deleteRule = new DeleteRuleImpl();
        return deleteRule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public org.example.rdm.Enum createEnum() {
        EnumImpl enum_ = new EnumImpl();
        return enum_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EnumLiteral createEnumLiteral() {
        EnumLiteralImpl enumLiteral = new EnumLiteralImpl();
        return enumLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeleteAction createDeleteActionFromString(EDataType eDataType, String initialValue) {
        DeleteAction result = DeleteAction.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDeleteActionToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RdmPackage getRdmPackage() {
        return (RdmPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static RdmPackage getPackage() {
        return RdmPackage.eINSTANCE;
    }

} //RdmFactoryImpl
