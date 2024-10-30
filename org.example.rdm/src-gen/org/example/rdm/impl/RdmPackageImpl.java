/**
 */
package org.example.rdm.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.example.rdm.AlternateKey;
import org.example.rdm.CandidateKey;
import org.example.rdm.Column;
import org.example.rdm.Constraint;
import org.example.rdm.Database;
import org.example.rdm.DeleteAction;
import org.example.rdm.DeleteRule;
import org.example.rdm.EnumLiteral;
import org.example.rdm.ForeignKey;
import org.example.rdm.Index;
import org.example.rdm.Key;
import org.example.rdm.NamedElement;
import org.example.rdm.PrimaryKey;
import org.example.rdm.RdmFactory;
import org.example.rdm.RdmPackage;
import org.example.rdm.Rule;
import org.example.rdm.Schema;
import org.example.rdm.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RdmPackageImpl extends EPackageImpl implements RdmPackage {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass namedElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass databaseEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass schemaEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass tableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass columnEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass keyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass candidateKeyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass primaryKeyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass alternateKeyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass foreignKeyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass constraintEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass indexEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ruleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass deleteRuleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass enumEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass enumLiteralEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum deleteActionEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.example.rdm.RdmPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private RdmPackageImpl() {
        super(eNS_URI, RdmFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     *
     * <p>This method is used to initialize {@link RdmPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static RdmPackage init() {
        if (isInited)
            return (RdmPackage) EPackage.Registry.INSTANCE.getEPackage(RdmPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredRdmPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        RdmPackageImpl theRdmPackage = registeredRdmPackage instanceof RdmPackageImpl
                ? (RdmPackageImpl) registeredRdmPackage
                : new RdmPackageImpl();

        isInited = true;

        // Create package meta-data objects
        theRdmPackage.createPackageContents();

        // Initialize created meta-data
        theRdmPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theRdmPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(RdmPackage.eNS_URI, theRdmPackage);
        return theRdmPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNamedElement() {
        return namedElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNamedElement_Name() {
        return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDatabase() {
        return databaseEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDatabase_Schemas() {
        return (EReference) databaseEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSchema() {
        return schemaEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSchema_Database() {
        return (EReference) schemaEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSchema_Tables() {
        return (EReference) schemaEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSchema_Types() {
        return (EReference) schemaEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTable() {
        return tableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTable_Schema() {
        return (EReference) tableEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTable_Columns() {
        return (EReference) tableEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTable_PrimaryKey() {
        return (EReference) tableEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTable_AlternateKeys() {
        return (EReference) tableEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTable_ForeignKeys() {
        return (EReference) tableEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTable_Constraints() {
        return (EReference) tableEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTable_Indices() {
        return (EReference) tableEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTable_Rules() {
        return (EReference) tableEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getColumn() {
        return columnEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getColumn_Table() {
        return (EReference) columnEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getColumn_DataType() {
        return (EAttribute) columnEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getColumn_Collation() {
        return (EAttribute) columnEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getColumn_Nullable() {
        return (EAttribute) columnEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getColumn_DefaultValue() {
        return (EAttribute) columnEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getColumn_StoredGeneratedValue() {
        return (EAttribute) columnEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getKey() {
        return keyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getKey_Columns() {
        return (EReference) keyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getCandidateKey() {
        return candidateKeyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getPrimaryKey() {
        return primaryKeyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAlternateKey() {
        return alternateKeyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getForeignKey() {
        return foreignKeyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getForeignKey_Table() {
        return (EReference) foreignKeyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getForeignKey_ReferencedKey() {
        return (EReference) foreignKeyEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getForeignKey_DeleteAction() {
        return (EAttribute) foreignKeyEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getConstraint() {
        return constraintEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getConstraint_Table() {
        return (EReference) constraintEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getConstraint_Expression() {
        return (EAttribute) constraintEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getIndex() {
        return indexEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getIndex_Table() {
        return (EReference) indexEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIndex_Unique() {
        return (EAttribute) indexEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIndex_Type() {
        return (EAttribute) indexEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getIndex_Expressions() {
        return (EAttribute) indexEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRule() {
        return ruleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRule_Table() {
        return (EReference) ruleEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getRule_Statement() {
        return (EAttribute) ruleEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDeleteRule() {
        return deleteRuleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEnum() {
        return enumEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEnum_Schema() {
        return (EReference) enumEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEnum_Literals() {
        return (EReference) enumEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEnumLiteral() {
        return enumLiteralEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEnumLiteral_Enum() {
        return (EReference) enumLiteralEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getDeleteAction() {
        return deleteActionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RdmFactory getRdmFactory() {
        return (RdmFactory) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated)
            return;
        isCreated = true;

        // Create classes and their features
        namedElementEClass = createEClass(NAMED_ELEMENT);
        createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

        databaseEClass = createEClass(DATABASE);
        createEReference(databaseEClass, DATABASE__SCHEMAS);

        schemaEClass = createEClass(SCHEMA);
        createEReference(schemaEClass, SCHEMA__DATABASE);
        createEReference(schemaEClass, SCHEMA__TABLES);
        createEReference(schemaEClass, SCHEMA__TYPES);

        tableEClass = createEClass(TABLE);
        createEReference(tableEClass, TABLE__SCHEMA);
        createEReference(tableEClass, TABLE__COLUMNS);
        createEReference(tableEClass, TABLE__PRIMARY_KEY);
        createEReference(tableEClass, TABLE__ALTERNATE_KEYS);
        createEReference(tableEClass, TABLE__FOREIGN_KEYS);
        createEReference(tableEClass, TABLE__CONSTRAINTS);
        createEReference(tableEClass, TABLE__INDICES);
        createEReference(tableEClass, TABLE__RULES);

        columnEClass = createEClass(COLUMN);
        createEReference(columnEClass, COLUMN__TABLE);
        createEAttribute(columnEClass, COLUMN__DATA_TYPE);
        createEAttribute(columnEClass, COLUMN__COLLATION);
        createEAttribute(columnEClass, COLUMN__NULLABLE);
        createEAttribute(columnEClass, COLUMN__DEFAULT_VALUE);
        createEAttribute(columnEClass, COLUMN__STORED_GENERATED_VALUE);

        keyEClass = createEClass(KEY);
        createEReference(keyEClass, KEY__COLUMNS);

        candidateKeyEClass = createEClass(CANDIDATE_KEY);

        primaryKeyEClass = createEClass(PRIMARY_KEY);

        alternateKeyEClass = createEClass(ALTERNATE_KEY);

        foreignKeyEClass = createEClass(FOREIGN_KEY);
        createEReference(foreignKeyEClass, FOREIGN_KEY__TABLE);
        createEReference(foreignKeyEClass, FOREIGN_KEY__REFERENCED_KEY);
        createEAttribute(foreignKeyEClass, FOREIGN_KEY__DELETE_ACTION);

        constraintEClass = createEClass(CONSTRAINT);
        createEReference(constraintEClass, CONSTRAINT__TABLE);
        createEAttribute(constraintEClass, CONSTRAINT__EXPRESSION);

        indexEClass = createEClass(INDEX);
        createEReference(indexEClass, INDEX__TABLE);
        createEAttribute(indexEClass, INDEX__UNIQUE);
        createEAttribute(indexEClass, INDEX__TYPE);
        createEAttribute(indexEClass, INDEX__EXPRESSIONS);

        ruleEClass = createEClass(RULE);
        createEReference(ruleEClass, RULE__TABLE);
        createEAttribute(ruleEClass, RULE__STATEMENT);

        deleteRuleEClass = createEClass(DELETE_RULE);

        enumEClass = createEClass(ENUM);
        createEReference(enumEClass, ENUM__SCHEMA);
        createEReference(enumEClass, ENUM__LITERALS);

        enumLiteralEClass = createEClass(ENUM_LITERAL);
        createEReference(enumLiteralEClass, ENUM_LITERAL__ENUM);

        // Create enums
        deleteActionEEnum = createEEnum(DELETE_ACTION);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized)
            return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        databaseEClass.getESuperTypes().add(this.getNamedElement());
        schemaEClass.getESuperTypes().add(this.getNamedElement());
        tableEClass.getESuperTypes().add(this.getNamedElement());
        columnEClass.getESuperTypes().add(this.getNamedElement());
        keyEClass.getESuperTypes().add(this.getNamedElement());
        candidateKeyEClass.getESuperTypes().add(this.getKey());
        primaryKeyEClass.getESuperTypes().add(this.getCandidateKey());
        alternateKeyEClass.getESuperTypes().add(this.getCandidateKey());
        foreignKeyEClass.getESuperTypes().add(this.getKey());
        constraintEClass.getESuperTypes().add(this.getNamedElement());
        indexEClass.getESuperTypes().add(this.getNamedElement());
        ruleEClass.getESuperTypes().add(this.getNamedElement());
        deleteRuleEClass.getESuperTypes().add(this.getRule());
        enumEClass.getESuperTypes().add(this.getNamedElement());
        enumLiteralEClass.getESuperTypes().add(this.getNamedElement());

        // Initialize classes, features, and operations; add parameters
        initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(databaseEClass, Database.class, "Database", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDatabase_Schemas(), this.getSchema(), this.getSchema_Database(), "schemas", null, 0, -1,
                Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(schemaEClass, Schema.class, "Schema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSchema_Database(), this.getDatabase(), this.getDatabase_Schemas(), "database", null, 1, 1,
                Schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSchema_Tables(), this.getTable(), this.getTable_Schema(), "tables", null, 0, -1, Schema.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSchema_Types(), this.getEnum(), this.getEnum_Schema(), "types", null, 0, -1, Schema.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTable_Schema(), this.getSchema(), this.getSchema_Tables(), "schema", null, 1, 1, Table.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTable_Columns(), this.getColumn(), this.getColumn_Table(), "columns", null, 0, -1,
                Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTable_PrimaryKey(), this.getPrimaryKey(), null, "primaryKey", null, 0, 1, Table.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTable_AlternateKeys(), this.getAlternateKey(), null, "alternateKeys", null, 0, -1,
                Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTable_ForeignKeys(), this.getForeignKey(), this.getForeignKey_Table(), "foreignKeys", null, 0,
                -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTable_Constraints(), this.getConstraint(), this.getConstraint_Table(), "constraints", null, 0,
                -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTable_Indices(), this.getIndex(), this.getIndex_Table(), "indices", null, 0, -1, Table.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTable_Rules(), this.getRule(), this.getRule_Table(), "rules", null, 0, -1, Table.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getColumn_Table(), this.getTable(), this.getTable_Columns(), "table", null, 1, 1, Column.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getColumn_DataType(), ecorePackage.getEString(), "dataType", null, 1, 1, Column.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getColumn_Collation(), ecorePackage.getEString(), "collation", null, 0, 1, Column.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getColumn_Nullable(), ecorePackage.getEBoolean(), "nullable", null, 1, 1, Column.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getColumn_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1, Column.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getColumn_StoredGeneratedValue(), ecorePackage.getEString(), "storedGeneratedValue", null, 0, 1,
                Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(keyEClass, Key.class, "Key", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getKey_Columns(), this.getColumn(), null, "columns", null, 0, -1, Key.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                IS_ORDERED);

        initEClass(candidateKeyEClass, CandidateKey.class, "CandidateKey", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(primaryKeyEClass, PrimaryKey.class, "PrimaryKey", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(alternateKeyEClass, AlternateKey.class, "AlternateKey", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(foreignKeyEClass, ForeignKey.class, "ForeignKey", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getForeignKey_Table(), this.getTable(), this.getTable_ForeignKeys(), "table", null, 1, 1,
                ForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getForeignKey_ReferencedKey(), this.getCandidateKey(), null, "referencedKey", null, 1, 1,
                ForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getForeignKey_DeleteAction(), this.getDeleteAction(), "deleteAction", null, 1, 1,
                ForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getConstraint_Table(), this.getTable(), this.getTable_Constraints(), "table", null, 1, 1,
                Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getConstraint_Expression(), ecorePackage.getEString(), "expression", null, 1, 1,
                Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(indexEClass, Index.class, "Index", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getIndex_Table(), this.getTable(), this.getTable_Indices(), "table", null, 1, 1, Index.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIndex_Unique(), ecorePackage.getEBoolean(), "unique", null, 1, 1, Index.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIndex_Type(), ecorePackage.getEString(), "type", null, 1, 1, Index.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getIndex_Expressions(), ecorePackage.getEString(), "expressions", null, 1, -1, Index.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(ruleEClass, Rule.class, "Rule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRule_Table(), this.getTable(), this.getTable_Rules(), "table", null, 1, 1, Rule.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRule_Statement(), ecorePackage.getEString(), "statement", null, 0, 1, Rule.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(deleteRuleEClass, DeleteRule.class, "DeleteRule", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(enumEClass, org.example.rdm.Enum.class, "Enum", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEnum_Schema(), this.getSchema(), this.getSchema_Types(), "schema", null, 1, 1,
                org.example.rdm.Enum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEnum_Literals(), this.getEnumLiteral(), this.getEnumLiteral_Enum(), "literals", null, 0, -1,
                org.example.rdm.Enum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(enumLiteralEClass, EnumLiteral.class, "EnumLiteral", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEnumLiteral_Enum(), this.getEnum(), this.getEnum_Literals(), "enum", null, 1, 1,
                EnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(deleteActionEEnum, DeleteAction.class, "DeleteAction");
        addEEnumLiteral(deleteActionEEnum, DeleteAction.NO_ACTION);
        addEEnumLiteral(deleteActionEEnum, DeleteAction.CASCADE);
        addEEnumLiteral(deleteActionEEnum, DeleteAction.RESTRICT);
        addEEnumLiteral(deleteActionEEnum, DeleteAction.SET_NULL);
        addEEnumLiteral(deleteActionEEnum, DeleteAction.SET_DEFAULT);

        // Create resource
        createResource(eNS_URI);
    }

} //RdmPackageImpl
