/**
 */
package org.example.rdm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.example.rdm.RdmFactory
 * @model kind="package"
 * @generated
 */
public interface RdmPackage extends EPackage {

    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "rdm";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.example.org/rdm";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "rdm";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    RdmPackage eINSTANCE = org.example.rdm.impl.RdmPackageImpl.init();

    /**
     * The meta object id for the '{@link org.example.rdm.impl.NamedElementImpl <em>Named Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.rdm.impl.NamedElementImpl
     * @see org.example.rdm.impl.RdmPackageImpl#getNamedElement()
     * @generated
     */
    int NAMED_ELEMENT = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT__NAME = 0;

    /**
     * The number of structural features of the '<em>Named Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Named Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.example.rdm.impl.DatabaseImpl <em>Database</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.rdm.impl.DatabaseImpl
     * @see org.example.rdm.impl.RdmPackageImpl#getDatabase()
     * @generated
     */
    int DATABASE = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__NAME = NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Schemas</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE__SCHEMAS = NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Database</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Database</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATABASE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.example.rdm.impl.SchemaImpl <em>Schema</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.rdm.impl.SchemaImpl
     * @see org.example.rdm.impl.RdmPackageImpl#getSchema()
     * @generated
     */
    int SCHEMA = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA__NAME = NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Database</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA__DATABASE = NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Tables</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA__TABLES = NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA__TYPES = NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Schema</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Schema</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCHEMA_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.example.rdm.impl.TableImpl <em>Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.rdm.impl.TableImpl
     * @see org.example.rdm.impl.RdmPackageImpl#getTable()
     * @generated
     */
    int TABLE = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE__NAME = NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Schema</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE__SCHEMA = NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Columns</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE__COLUMNS = NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Primary Key</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE__PRIMARY_KEY = NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Alternate Keys</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE__ALTERNATE_KEYS = NAMED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE__FOREIGN_KEYS = NAMED_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE__CONSTRAINTS = NAMED_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Indices</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE__INDICES = NAMED_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Rules</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE__RULES = NAMED_ELEMENT_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Table</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 8;

    /**
     * The number of operations of the '<em>Table</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TABLE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.example.rdm.impl.ColumnImpl <em>Column</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.rdm.impl.ColumnImpl
     * @see org.example.rdm.impl.RdmPackageImpl#getColumn()
     * @generated
     */
    int COLUMN = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN__NAME = NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Table</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN__TABLE = NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN__DATA_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Collation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN__COLLATION = NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Nullable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN__NULLABLE = NAMED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN__DEFAULT_VALUE = NAMED_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Stored Generated Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN__STORED_GENERATED_VALUE = NAMED_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Column</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The number of operations of the '<em>Column</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COLUMN_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.example.rdm.impl.KeyImpl <em>Key</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.rdm.impl.KeyImpl
     * @see org.example.rdm.impl.RdmPackageImpl#getKey()
     * @generated
     */
    int KEY = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY__NAME = NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY__COLUMNS = NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Key</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Key</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KEY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.example.rdm.impl.CandidateKeyImpl <em>Candidate Key</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.rdm.impl.CandidateKeyImpl
     * @see org.example.rdm.impl.RdmPackageImpl#getCandidateKey()
     * @generated
     */
    int CANDIDATE_KEY = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CANDIDATE_KEY__NAME = KEY__NAME;

    /**
     * The feature id for the '<em><b>Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CANDIDATE_KEY__COLUMNS = KEY__COLUMNS;

    /**
     * The number of structural features of the '<em>Candidate Key</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CANDIDATE_KEY_FEATURE_COUNT = KEY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Candidate Key</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CANDIDATE_KEY_OPERATION_COUNT = KEY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.example.rdm.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.rdm.impl.PrimaryKeyImpl
     * @see org.example.rdm.impl.RdmPackageImpl#getPrimaryKey()
     * @generated
     */
    int PRIMARY_KEY = 7;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_KEY__NAME = CANDIDATE_KEY__NAME;

    /**
     * The feature id for the '<em><b>Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_KEY__COLUMNS = CANDIDATE_KEY__COLUMNS;

    /**
     * The number of structural features of the '<em>Primary Key</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_KEY_FEATURE_COUNT = CANDIDATE_KEY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Primary Key</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMARY_KEY_OPERATION_COUNT = CANDIDATE_KEY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.example.rdm.impl.AlternateKeyImpl <em>Alternate Key</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.rdm.impl.AlternateKeyImpl
     * @see org.example.rdm.impl.RdmPackageImpl#getAlternateKey()
     * @generated
     */
    int ALTERNATE_KEY = 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALTERNATE_KEY__NAME = CANDIDATE_KEY__NAME;

    /**
     * The feature id for the '<em><b>Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALTERNATE_KEY__COLUMNS = CANDIDATE_KEY__COLUMNS;

    /**
     * The number of structural features of the '<em>Alternate Key</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALTERNATE_KEY_FEATURE_COUNT = CANDIDATE_KEY_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Alternate Key</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALTERNATE_KEY_OPERATION_COUNT = CANDIDATE_KEY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.example.rdm.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.rdm.impl.ForeignKeyImpl
     * @see org.example.rdm.impl.RdmPackageImpl#getForeignKey()
     * @generated
     */
    int FOREIGN_KEY = 9;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOREIGN_KEY__NAME = KEY__NAME;

    /**
     * The feature id for the '<em><b>Columns</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOREIGN_KEY__COLUMNS = KEY__COLUMNS;

    /**
     * The feature id for the '<em><b>Table</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOREIGN_KEY__TABLE = KEY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Referenced Key</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOREIGN_KEY__REFERENCED_KEY = KEY_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Delete Action</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOREIGN_KEY__DELETE_ACTION = KEY_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Foreign Key</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOREIGN_KEY_FEATURE_COUNT = KEY_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Foreign Key</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FOREIGN_KEY_OPERATION_COUNT = KEY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.example.rdm.impl.ConstraintImpl <em>Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.rdm.impl.ConstraintImpl
     * @see org.example.rdm.impl.RdmPackageImpl#getConstraint()
     * @generated
     */
    int CONSTRAINT = 10;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRAINT__NAME = NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Table</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRAINT__TABLE = NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Expression</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRAINT__EXPRESSION = NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRAINT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRAINT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.example.rdm.impl.IndexImpl <em>Index</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.rdm.impl.IndexImpl
     * @see org.example.rdm.impl.RdmPackageImpl#getIndex()
     * @generated
     */
    int INDEX = 11;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDEX__NAME = NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Table</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDEX__TABLE = NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Unique</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDEX__UNIQUE = NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDEX__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Expressions</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDEX__EXPRESSIONS = NAMED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Index</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDEX_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Index</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INDEX_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.example.rdm.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.rdm.impl.RuleImpl
     * @see org.example.rdm.impl.RdmPackageImpl#getRule()
     * @generated
     */
    int RULE = 12;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE__NAME = NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Table</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE__TABLE = NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Statement</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE__STATEMENT = NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Rule</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Rule</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RULE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.example.rdm.impl.DeleteRuleImpl <em>Delete Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.rdm.impl.DeleteRuleImpl
     * @see org.example.rdm.impl.RdmPackageImpl#getDeleteRule()
     * @generated
     */
    int DELETE_RULE = 13;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELETE_RULE__NAME = RULE__NAME;

    /**
     * The feature id for the '<em><b>Table</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELETE_RULE__TABLE = RULE__TABLE;

    /**
     * The feature id for the '<em><b>Statement</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELETE_RULE__STATEMENT = RULE__STATEMENT;

    /**
     * The number of structural features of the '<em>Delete Rule</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELETE_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Delete Rule</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELETE_RULE_OPERATION_COUNT = RULE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.example.rdm.impl.EnumImpl <em>Enum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.rdm.impl.EnumImpl
     * @see org.example.rdm.impl.RdmPackageImpl#getEnum()
     * @generated
     */
    int ENUM = 14;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM__NAME = NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Schema</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM__SCHEMA = NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Literals</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM__LITERALS = NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Enum</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Enum</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.example.rdm.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.rdm.impl.EnumLiteralImpl
     * @see org.example.rdm.impl.RdmPackageImpl#getEnumLiteral()
     * @generated
     */
    int ENUM_LITERAL = 15;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_LITERAL__NAME = NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Enum</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_LITERAL__ENUM = NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Enum Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_LITERAL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Enum Literal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUM_LITERAL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.example.rdm.DeleteAction <em>Delete Action</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.rdm.DeleteAction
     * @see org.example.rdm.impl.RdmPackageImpl#getDeleteAction()
     * @generated
     */
    int DELETE_ACTION = 16;

    /**
     * Returns the meta object for class '{@link org.example.rdm.NamedElement <em>Named Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Named Element</em>'.
     * @see org.example.rdm.NamedElement
     * @generated
     */
    EClass getNamedElement();

    /**
     * Returns the meta object for the attribute '{@link org.example.rdm.NamedElement#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.example.rdm.NamedElement#getName()
     * @see #getNamedElement()
     * @generated
     */
    EAttribute getNamedElement_Name();

    /**
     * Returns the meta object for class '{@link org.example.rdm.Database <em>Database</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Database</em>'.
     * @see org.example.rdm.Database
     * @generated
     */
    EClass getDatabase();

    /**
     * Returns the meta object for the containment reference list '{@link org.example.rdm.Database#getSchemas <em>Schemas</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Schemas</em>'.
     * @see org.example.rdm.Database#getSchemas()
     * @see #getDatabase()
     * @generated
     */
    EReference getDatabase_Schemas();

    /**
     * Returns the meta object for class '{@link org.example.rdm.Schema <em>Schema</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Schema</em>'.
     * @see org.example.rdm.Schema
     * @generated
     */
    EClass getSchema();

    /**
     * Returns the meta object for the container reference '{@link org.example.rdm.Schema#getDatabase <em>Database</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Database</em>'.
     * @see org.example.rdm.Schema#getDatabase()
     * @see #getSchema()
     * @generated
     */
    EReference getSchema_Database();

    /**
     * Returns the meta object for the containment reference list '{@link org.example.rdm.Schema#getTables <em>Tables</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Tables</em>'.
     * @see org.example.rdm.Schema#getTables()
     * @see #getSchema()
     * @generated
     */
    EReference getSchema_Tables();

    /**
     * Returns the meta object for the containment reference list '{@link org.example.rdm.Schema#getTypes <em>Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Types</em>'.
     * @see org.example.rdm.Schema#getTypes()
     * @see #getSchema()
     * @generated
     */
    EReference getSchema_Types();

    /**
     * Returns the meta object for class '{@link org.example.rdm.Table <em>Table</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Table</em>'.
     * @see org.example.rdm.Table
     * @generated
     */
    EClass getTable();

    /**
     * Returns the meta object for the container reference '{@link org.example.rdm.Table#getSchema <em>Schema</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Schema</em>'.
     * @see org.example.rdm.Table#getSchema()
     * @see #getTable()
     * @generated
     */
    EReference getTable_Schema();

    /**
     * Returns the meta object for the containment reference list '{@link org.example.rdm.Table#getColumns <em>Columns</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Columns</em>'.
     * @see org.example.rdm.Table#getColumns()
     * @see #getTable()
     * @generated
     */
    EReference getTable_Columns();

    /**
     * Returns the meta object for the containment reference '{@link org.example.rdm.Table#getPrimaryKey <em>Primary Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Primary Key</em>'.
     * @see org.example.rdm.Table#getPrimaryKey()
     * @see #getTable()
     * @generated
     */
    EReference getTable_PrimaryKey();

    /**
     * Returns the meta object for the containment reference list '{@link org.example.rdm.Table#getAlternateKeys <em>Alternate Keys</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Alternate Keys</em>'.
     * @see org.example.rdm.Table#getAlternateKeys()
     * @see #getTable()
     * @generated
     */
    EReference getTable_AlternateKeys();

    /**
     * Returns the meta object for the containment reference list '{@link org.example.rdm.Table#getForeignKeys <em>Foreign Keys</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Foreign Keys</em>'.
     * @see org.example.rdm.Table#getForeignKeys()
     * @see #getTable()
     * @generated
     */
    EReference getTable_ForeignKeys();

    /**
     * Returns the meta object for the containment reference list '{@link org.example.rdm.Table#getConstraints <em>Constraints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Constraints</em>'.
     * @see org.example.rdm.Table#getConstraints()
     * @see #getTable()
     * @generated
     */
    EReference getTable_Constraints();

    /**
     * Returns the meta object for the containment reference list '{@link org.example.rdm.Table#getIndices <em>Indices</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Indices</em>'.
     * @see org.example.rdm.Table#getIndices()
     * @see #getTable()
     * @generated
     */
    EReference getTable_Indices();

    /**
     * Returns the meta object for the containment reference list '{@link org.example.rdm.Table#getRules <em>Rules</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Rules</em>'.
     * @see org.example.rdm.Table#getRules()
     * @see #getTable()
     * @generated
     */
    EReference getTable_Rules();

    /**
     * Returns the meta object for class '{@link org.example.rdm.Column <em>Column</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Column</em>'.
     * @see org.example.rdm.Column
     * @generated
     */
    EClass getColumn();

    /**
     * Returns the meta object for the container reference '{@link org.example.rdm.Column#getTable <em>Table</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Table</em>'.
     * @see org.example.rdm.Column#getTable()
     * @see #getColumn()
     * @generated
     */
    EReference getColumn_Table();

    /**
     * Returns the meta object for the attribute '{@link org.example.rdm.Column#getDataType <em>Data Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Data Type</em>'.
     * @see org.example.rdm.Column#getDataType()
     * @see #getColumn()
     * @generated
     */
    EAttribute getColumn_DataType();

    /**
     * Returns the meta object for the attribute '{@link org.example.rdm.Column#getCollation <em>Collation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Collation</em>'.
     * @see org.example.rdm.Column#getCollation()
     * @see #getColumn()
     * @generated
     */
    EAttribute getColumn_Collation();

    /**
     * Returns the meta object for the attribute '{@link org.example.rdm.Column#isNullable <em>Nullable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Nullable</em>'.
     * @see org.example.rdm.Column#isNullable()
     * @see #getColumn()
     * @generated
     */
    EAttribute getColumn_Nullable();

    /**
     * Returns the meta object for the attribute '{@link org.example.rdm.Column#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see org.example.rdm.Column#getDefaultValue()
     * @see #getColumn()
     * @generated
     */
    EAttribute getColumn_DefaultValue();

    /**
     * Returns the meta object for the attribute '{@link org.example.rdm.Column#getStoredGeneratedValue <em>Stored Generated Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Stored Generated Value</em>'.
     * @see org.example.rdm.Column#getStoredGeneratedValue()
     * @see #getColumn()
     * @generated
     */
    EAttribute getColumn_StoredGeneratedValue();

    /**
     * Returns the meta object for class '{@link org.example.rdm.Key <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Key</em>'.
     * @see org.example.rdm.Key
     * @generated
     */
    EClass getKey();

    /**
     * Returns the meta object for the reference list '{@link org.example.rdm.Key#getColumns <em>Columns</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Columns</em>'.
     * @see org.example.rdm.Key#getColumns()
     * @see #getKey()
     * @generated
     */
    EReference getKey_Columns();

    /**
     * Returns the meta object for class '{@link org.example.rdm.CandidateKey <em>Candidate Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Candidate Key</em>'.
     * @see org.example.rdm.CandidateKey
     * @generated
     */
    EClass getCandidateKey();

    /**
     * Returns the meta object for class '{@link org.example.rdm.PrimaryKey <em>Primary Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Primary Key</em>'.
     * @see org.example.rdm.PrimaryKey
     * @generated
     */
    EClass getPrimaryKey();

    /**
     * Returns the meta object for class '{@link org.example.rdm.AlternateKey <em>Alternate Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Alternate Key</em>'.
     * @see org.example.rdm.AlternateKey
     * @generated
     */
    EClass getAlternateKey();

    /**
     * Returns the meta object for class '{@link org.example.rdm.ForeignKey <em>Foreign Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Foreign Key</em>'.
     * @see org.example.rdm.ForeignKey
     * @generated
     */
    EClass getForeignKey();

    /**
     * Returns the meta object for the container reference '{@link org.example.rdm.ForeignKey#getTable <em>Table</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Table</em>'.
     * @see org.example.rdm.ForeignKey#getTable()
     * @see #getForeignKey()
     * @generated
     */
    EReference getForeignKey_Table();

    /**
     * Returns the meta object for the reference '{@link org.example.rdm.ForeignKey#getReferencedKey <em>Referenced Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Referenced Key</em>'.
     * @see org.example.rdm.ForeignKey#getReferencedKey()
     * @see #getForeignKey()
     * @generated
     */
    EReference getForeignKey_ReferencedKey();

    /**
     * Returns the meta object for the attribute '{@link org.example.rdm.ForeignKey#getDeleteAction <em>Delete Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Delete Action</em>'.
     * @see org.example.rdm.ForeignKey#getDeleteAction()
     * @see #getForeignKey()
     * @generated
     */
    EAttribute getForeignKey_DeleteAction();

    /**
     * Returns the meta object for class '{@link org.example.rdm.Constraint <em>Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Constraint</em>'.
     * @see org.example.rdm.Constraint
     * @generated
     */
    EClass getConstraint();

    /**
     * Returns the meta object for the container reference '{@link org.example.rdm.Constraint#getTable <em>Table</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Table</em>'.
     * @see org.example.rdm.Constraint#getTable()
     * @see #getConstraint()
     * @generated
     */
    EReference getConstraint_Table();

    /**
     * Returns the meta object for the attribute '{@link org.example.rdm.Constraint#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Expression</em>'.
     * @see org.example.rdm.Constraint#getExpression()
     * @see #getConstraint()
     * @generated
     */
    EAttribute getConstraint_Expression();

    /**
     * Returns the meta object for class '{@link org.example.rdm.Index <em>Index</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Index</em>'.
     * @see org.example.rdm.Index
     * @generated
     */
    EClass getIndex();

    /**
     * Returns the meta object for the container reference '{@link org.example.rdm.Index#getTable <em>Table</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Table</em>'.
     * @see org.example.rdm.Index#getTable()
     * @see #getIndex()
     * @generated
     */
    EReference getIndex_Table();

    /**
     * Returns the meta object for the attribute '{@link org.example.rdm.Index#isUnique <em>Unique</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Unique</em>'.
     * @see org.example.rdm.Index#isUnique()
     * @see #getIndex()
     * @generated
     */
    EAttribute getIndex_Unique();

    /**
     * Returns the meta object for the attribute '{@link org.example.rdm.Index#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.example.rdm.Index#getType()
     * @see #getIndex()
     * @generated
     */
    EAttribute getIndex_Type();

    /**
     * Returns the meta object for the attribute list '{@link org.example.rdm.Index#getExpressions <em>Expressions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Expressions</em>'.
     * @see org.example.rdm.Index#getExpressions()
     * @see #getIndex()
     * @generated
     */
    EAttribute getIndex_Expressions();

    /**
     * Returns the meta object for class '{@link org.example.rdm.Rule <em>Rule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Rule</em>'.
     * @see org.example.rdm.Rule
     * @generated
     */
    EClass getRule();

    /**
     * Returns the meta object for the container reference '{@link org.example.rdm.Rule#getTable <em>Table</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Table</em>'.
     * @see org.example.rdm.Rule#getTable()
     * @see #getRule()
     * @generated
     */
    EReference getRule_Table();

    /**
     * Returns the meta object for the attribute '{@link org.example.rdm.Rule#getStatement <em>Statement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Statement</em>'.
     * @see org.example.rdm.Rule#getStatement()
     * @see #getRule()
     * @generated
     */
    EAttribute getRule_Statement();

    /**
     * Returns the meta object for class '{@link org.example.rdm.DeleteRule <em>Delete Rule</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Delete Rule</em>'.
     * @see org.example.rdm.DeleteRule
     * @generated
     */
    EClass getDeleteRule();

    /**
     * Returns the meta object for class '{@link org.example.rdm.Enum <em>Enum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Enum</em>'.
     * @see org.example.rdm.Enum
     * @generated
     */
    EClass getEnum();

    /**
     * Returns the meta object for the container reference '{@link org.example.rdm.Enum#getSchema <em>Schema</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Schema</em>'.
     * @see org.example.rdm.Enum#getSchema()
     * @see #getEnum()
     * @generated
     */
    EReference getEnum_Schema();

    /**
     * Returns the meta object for the containment reference list '{@link org.example.rdm.Enum#getLiterals <em>Literals</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Literals</em>'.
     * @see org.example.rdm.Enum#getLiterals()
     * @see #getEnum()
     * @generated
     */
    EReference getEnum_Literals();

    /**
     * Returns the meta object for class '{@link org.example.rdm.EnumLiteral <em>Enum Literal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Enum Literal</em>'.
     * @see org.example.rdm.EnumLiteral
     * @generated
     */
    EClass getEnumLiteral();

    /**
     * Returns the meta object for the container reference '{@link org.example.rdm.EnumLiteral#getEnum <em>Enum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Enum</em>'.
     * @see org.example.rdm.EnumLiteral#getEnum()
     * @see #getEnumLiteral()
     * @generated
     */
    EReference getEnumLiteral_Enum();

    /**
     * Returns the meta object for enum '{@link org.example.rdm.DeleteAction <em>Delete Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Delete Action</em>'.
     * @see org.example.rdm.DeleteAction
     * @generated
     */
    EEnum getDeleteAction();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    RdmFactory getRdmFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {

        /**
         * The meta object literal for the '{@link org.example.rdm.impl.NamedElementImpl <em>Named Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.example.rdm.impl.NamedElementImpl
         * @see org.example.rdm.impl.RdmPackageImpl#getNamedElement()
         * @generated
         */
        EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

        /**
         * The meta object literal for the '{@link org.example.rdm.impl.DatabaseImpl <em>Database</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.example.rdm.impl.DatabaseImpl
         * @see org.example.rdm.impl.RdmPackageImpl#getDatabase()
         * @generated
         */
        EClass DATABASE = eINSTANCE.getDatabase();

        /**
         * The meta object literal for the '<em><b>Schemas</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATABASE__SCHEMAS = eINSTANCE.getDatabase_Schemas();

        /**
         * The meta object literal for the '{@link org.example.rdm.impl.SchemaImpl <em>Schema</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.example.rdm.impl.SchemaImpl
         * @see org.example.rdm.impl.RdmPackageImpl#getSchema()
         * @generated
         */
        EClass SCHEMA = eINSTANCE.getSchema();

        /**
         * The meta object literal for the '<em><b>Database</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCHEMA__DATABASE = eINSTANCE.getSchema_Database();

        /**
         * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCHEMA__TABLES = eINSTANCE.getSchema_Tables();

        /**
         * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCHEMA__TYPES = eINSTANCE.getSchema_Types();

        /**
         * The meta object literal for the '{@link org.example.rdm.impl.TableImpl <em>Table</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.example.rdm.impl.TableImpl
         * @see org.example.rdm.impl.RdmPackageImpl#getTable()
         * @generated
         */
        EClass TABLE = eINSTANCE.getTable();

        /**
         * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TABLE__SCHEMA = eINSTANCE.getTable_Schema();

        /**
         * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

        /**
         * The meta object literal for the '<em><b>Primary Key</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TABLE__PRIMARY_KEY = eINSTANCE.getTable_PrimaryKey();

        /**
         * The meta object literal for the '<em><b>Alternate Keys</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TABLE__ALTERNATE_KEYS = eINSTANCE.getTable_AlternateKeys();

        /**
         * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TABLE__FOREIGN_KEYS = eINSTANCE.getTable_ForeignKeys();

        /**
         * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TABLE__CONSTRAINTS = eINSTANCE.getTable_Constraints();

        /**
         * The meta object literal for the '<em><b>Indices</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TABLE__INDICES = eINSTANCE.getTable_Indices();

        /**
         * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TABLE__RULES = eINSTANCE.getTable_Rules();

        /**
         * The meta object literal for the '{@link org.example.rdm.impl.ColumnImpl <em>Column</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.example.rdm.impl.ColumnImpl
         * @see org.example.rdm.impl.RdmPackageImpl#getColumn()
         * @generated
         */
        EClass COLUMN = eINSTANCE.getColumn();

        /**
         * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COLUMN__TABLE = eINSTANCE.getColumn_Table();

        /**
         * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLUMN__DATA_TYPE = eINSTANCE.getColumn_DataType();

        /**
         * The meta object literal for the '<em><b>Collation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLUMN__COLLATION = eINSTANCE.getColumn_Collation();

        /**
         * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLUMN__NULLABLE = eINSTANCE.getColumn_Nullable();

        /**
         * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLUMN__DEFAULT_VALUE = eINSTANCE.getColumn_DefaultValue();

        /**
         * The meta object literal for the '<em><b>Stored Generated Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COLUMN__STORED_GENERATED_VALUE = eINSTANCE.getColumn_StoredGeneratedValue();

        /**
         * The meta object literal for the '{@link org.example.rdm.impl.KeyImpl <em>Key</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.example.rdm.impl.KeyImpl
         * @see org.example.rdm.impl.RdmPackageImpl#getKey()
         * @generated
         */
        EClass KEY = eINSTANCE.getKey();

        /**
         * The meta object literal for the '<em><b>Columns</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KEY__COLUMNS = eINSTANCE.getKey_Columns();

        /**
         * The meta object literal for the '{@link org.example.rdm.impl.CandidateKeyImpl <em>Candidate Key</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.example.rdm.impl.CandidateKeyImpl
         * @see org.example.rdm.impl.RdmPackageImpl#getCandidateKey()
         * @generated
         */
        EClass CANDIDATE_KEY = eINSTANCE.getCandidateKey();

        /**
         * The meta object literal for the '{@link org.example.rdm.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.example.rdm.impl.PrimaryKeyImpl
         * @see org.example.rdm.impl.RdmPackageImpl#getPrimaryKey()
         * @generated
         */
        EClass PRIMARY_KEY = eINSTANCE.getPrimaryKey();

        /**
         * The meta object literal for the '{@link org.example.rdm.impl.AlternateKeyImpl <em>Alternate Key</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.example.rdm.impl.AlternateKeyImpl
         * @see org.example.rdm.impl.RdmPackageImpl#getAlternateKey()
         * @generated
         */
        EClass ALTERNATE_KEY = eINSTANCE.getAlternateKey();

        /**
         * The meta object literal for the '{@link org.example.rdm.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.example.rdm.impl.ForeignKeyImpl
         * @see org.example.rdm.impl.RdmPackageImpl#getForeignKey()
         * @generated
         */
        EClass FOREIGN_KEY = eINSTANCE.getForeignKey();

        /**
         * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FOREIGN_KEY__TABLE = eINSTANCE.getForeignKey_Table();

        /**
         * The meta object literal for the '<em><b>Referenced Key</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FOREIGN_KEY__REFERENCED_KEY = eINSTANCE.getForeignKey_ReferencedKey();

        /**
         * The meta object literal for the '<em><b>Delete Action</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FOREIGN_KEY__DELETE_ACTION = eINSTANCE.getForeignKey_DeleteAction();

        /**
         * The meta object literal for the '{@link org.example.rdm.impl.ConstraintImpl <em>Constraint</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.example.rdm.impl.ConstraintImpl
         * @see org.example.rdm.impl.RdmPackageImpl#getConstraint()
         * @generated
         */
        EClass CONSTRAINT = eINSTANCE.getConstraint();

        /**
         * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONSTRAINT__TABLE = eINSTANCE.getConstraint_Table();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONSTRAINT__EXPRESSION = eINSTANCE.getConstraint_Expression();

        /**
         * The meta object literal for the '{@link org.example.rdm.impl.IndexImpl <em>Index</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.example.rdm.impl.IndexImpl
         * @see org.example.rdm.impl.RdmPackageImpl#getIndex()
         * @generated
         */
        EClass INDEX = eINSTANCE.getIndex();

        /**
         * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference INDEX__TABLE = eINSTANCE.getIndex_Table();

        /**
         * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INDEX__UNIQUE = eINSTANCE.getIndex_Unique();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INDEX__TYPE = eINSTANCE.getIndex_Type();

        /**
         * The meta object literal for the '<em><b>Expressions</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute INDEX__EXPRESSIONS = eINSTANCE.getIndex_Expressions();

        /**
         * The meta object literal for the '{@link org.example.rdm.impl.RuleImpl <em>Rule</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.example.rdm.impl.RuleImpl
         * @see org.example.rdm.impl.RdmPackageImpl#getRule()
         * @generated
         */
        EClass RULE = eINSTANCE.getRule();

        /**
         * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RULE__TABLE = eINSTANCE.getRule_Table();

        /**
         * The meta object literal for the '<em><b>Statement</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RULE__STATEMENT = eINSTANCE.getRule_Statement();

        /**
         * The meta object literal for the '{@link org.example.rdm.impl.DeleteRuleImpl <em>Delete Rule</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.example.rdm.impl.DeleteRuleImpl
         * @see org.example.rdm.impl.RdmPackageImpl#getDeleteRule()
         * @generated
         */
        EClass DELETE_RULE = eINSTANCE.getDeleteRule();

        /**
         * The meta object literal for the '{@link org.example.rdm.impl.EnumImpl <em>Enum</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.example.rdm.impl.EnumImpl
         * @see org.example.rdm.impl.RdmPackageImpl#getEnum()
         * @generated
         */
        EClass ENUM = eINSTANCE.getEnum();

        /**
         * The meta object literal for the '<em><b>Schema</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENUM__SCHEMA = eINSTANCE.getEnum_Schema();

        /**
         * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENUM__LITERALS = eINSTANCE.getEnum_Literals();

        /**
         * The meta object literal for the '{@link org.example.rdm.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.example.rdm.impl.EnumLiteralImpl
         * @see org.example.rdm.impl.RdmPackageImpl#getEnumLiteral()
         * @generated
         */
        EClass ENUM_LITERAL = eINSTANCE.getEnumLiteral();

        /**
         * The meta object literal for the '<em><b>Enum</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENUM_LITERAL__ENUM = eINSTANCE.getEnumLiteral_Enum();

        /**
         * The meta object literal for the '{@link org.example.rdm.DeleteAction <em>Delete Action</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.example.rdm.DeleteAction
         * @see org.example.rdm.impl.RdmPackageImpl#getDeleteAction()
         * @generated
         */
        EEnum DELETE_ACTION = eINSTANCE.getDeleteAction();

    }

} //RdmPackage
