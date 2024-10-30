/**
 */
package org.example.dm;

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
 * @see org.example.dm.DmFactory
 * @model kind="package"
 * @generated
 */
public interface DmPackage extends EPackage {

    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "dm";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.example.org/dm";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "dm";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    DmPackage eINSTANCE = org.example.dm.impl.DmPackageImpl.init();

    /**
     * The meta object id for the '{@link org.example.dm.impl.NamedElementImpl <em>Named Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.dm.impl.NamedElementImpl
     * @see org.example.dm.impl.DmPackageImpl#getNamedElement()
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
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT__DESCRIPTION = 1;

    /**
     * The feature id for the '<em><b>Localizations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT__LOCALIZATIONS = 2;

    /**
     * The number of structural features of the '<em>Named Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Named Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.example.dm.impl.LocalizationImpl <em>Localization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.dm.impl.LocalizationImpl
     * @see org.example.dm.impl.DmPackageImpl#getLocalization()
     * @generated
     */
    int LOCALIZATION = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCALIZATION__NAME = NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCALIZATION__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Localizations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCALIZATION__LOCALIZATIONS = NAMED_ELEMENT__LOCALIZATIONS;

    /**
     * The feature id for the '<em><b>Locale</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCALIZATION__LOCALE = NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCALIZATION__ELEMENT = NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Localization</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCALIZATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Localization</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCALIZATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.example.dm.impl.DataModelImpl <em>Data Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.dm.impl.DataModelImpl
     * @see org.example.dm.impl.DmPackageImpl#getDataModel()
     * @generated
     */
    int DATA_MODEL = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_MODEL__NAME = NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_MODEL__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Localizations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_MODEL__LOCALIZATIONS = NAMED_ELEMENT__LOCALIZATIONS;

    /**
     * The feature id for the '<em><b>Locales</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_MODEL__LOCALES = NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Entities</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_MODEL__ENTITIES = NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_MODEL__RELATIONSHIPS = NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Data Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_MODEL__DATA_TYPES = NAMED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Data Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Data Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_MODEL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.example.dm.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.dm.impl.EntityImpl
     * @see org.example.dm.impl.DmPackageImpl#getEntity()
     * @generated
     */
    int ENTITY = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__NAME = NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Localizations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__LOCALIZATIONS = NAMED_ELEMENT__LOCALIZATIONS;

    /**
     * The feature id for the '<em><b>Data Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__DATA_MODEL = NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Generals</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__GENERALS = NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__KIND = NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY__ATTRIBUTES = NAMED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Entity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Entity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.example.dm.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.dm.impl.AttributeImpl
     * @see org.example.dm.impl.DmPackageImpl#getAttribute()
     * @generated
     */
    int ATTRIBUTE = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__NAME = NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Localizations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__LOCALIZATIONS = NAMED_ELEMENT__LOCALIZATIONS;

    /**
     * The feature id for the '<em><b>Identity</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__IDENTITY = NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__DATA_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Lower</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__LOWER = NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Upper</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__UPPER = NAMED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__DEFAULT_VALUE = NAMED_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.example.dm.impl.RelationshipImpl <em>Relationship</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.dm.impl.RelationshipImpl
     * @see org.example.dm.impl.DmPackageImpl#getRelationship()
     * @generated
     */
    int RELATIONSHIP = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__NAME = NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Localizations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__LOCALIZATIONS = NAMED_ELEMENT__LOCALIZATIONS;

    /**
     * The feature id for the '<em><b>Data Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__DATA_MODEL = NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__KIND = NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Ends</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP__ENDS = NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Relationship</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Relationship</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.example.dm.impl.RelationshipEndImpl <em>Relationship End</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.dm.impl.RelationshipEndImpl
     * @see org.example.dm.impl.DmPackageImpl#getRelationshipEnd()
     * @generated
     */
    int RELATIONSHIP_END = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__NAME = NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Localizations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__LOCALIZATIONS = NAMED_ELEMENT__LOCALIZATIONS;

    /**
     * The feature id for the '<em><b>Relationship</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__RELATIONSHIP = NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Entity</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__ENTITY = NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Lower</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__LOWER = NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Upper</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END__UPPER = NAMED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Relationship End</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Relationship End</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIONSHIP_END_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.example.dm.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.dm.impl.DataTypeImpl
     * @see org.example.dm.impl.DmPackageImpl#getDataType()
     * @generated
     */
    int DATA_TYPE = 7;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE__NAME = NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE__DESCRIPTION = NAMED_ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Localizations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE__LOCALIZATIONS = NAMED_ELEMENT__LOCALIZATIONS;

    /**
     * The feature id for the '<em><b>Data Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE__DATA_MODEL = NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Data Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Data Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.example.dm.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.dm.impl.BooleanTypeImpl
     * @see org.example.dm.impl.DmPackageImpl#getBooleanType()
     * @generated
     */
    int BOOLEAN_TYPE = 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_TYPE__NAME = DATA_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_TYPE__DESCRIPTION = DATA_TYPE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Localizations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_TYPE__LOCALIZATIONS = DATA_TYPE__LOCALIZATIONS;

    /**
     * The feature id for the '<em><b>Data Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_TYPE__DATA_MODEL = DATA_TYPE__DATA_MODEL;

    /**
     * The number of structural features of the '<em>Boolean Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Boolean Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.example.dm.impl.StringTypeImpl <em>String Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.dm.impl.StringTypeImpl
     * @see org.example.dm.impl.DmPackageImpl#getStringType()
     * @generated
     */
    int STRING_TYPE = 9;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_TYPE__NAME = DATA_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_TYPE__DESCRIPTION = DATA_TYPE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Localizations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_TYPE__LOCALIZATIONS = DATA_TYPE__LOCALIZATIONS;

    /**
     * The feature id for the '<em><b>Data Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_TYPE__DATA_MODEL = DATA_TYPE__DATA_MODEL;

    /**
     * The feature id for the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_TYPE__LENGTH = DATA_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Min Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_TYPE__MIN_LENGTH = DATA_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Max Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_TYPE__MAX_LENGTH = DATA_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Pattern</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_TYPE__PATTERN = DATA_TYPE_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>String Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>String Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.example.dm.impl.NumericTypeImpl <em>Numeric Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.dm.impl.NumericTypeImpl
     * @see org.example.dm.impl.DmPackageImpl#getNumericType()
     * @generated
     */
    int NUMERIC_TYPE = 10;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_TYPE__NAME = DATA_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_TYPE__DESCRIPTION = DATA_TYPE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Localizations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_TYPE__LOCALIZATIONS = DATA_TYPE__LOCALIZATIONS;

    /**
     * The feature id for the '<em><b>Data Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_TYPE__DATA_MODEL = DATA_TYPE__DATA_MODEL;

    /**
     * The feature id for the '<em><b>Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_TYPE__SIZE = DATA_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Total Digits</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_TYPE__TOTAL_DIGITS = DATA_TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Fraction Digits</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_TYPE__FRACTION_DIGITS = DATA_TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Min Inclusive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_TYPE__MIN_INCLUSIVE = DATA_TYPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Min Exclusive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_TYPE__MIN_EXCLUSIVE = DATA_TYPE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Max Inclusive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_TYPE__MAX_INCLUSIVE = DATA_TYPE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Max Exclusive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_TYPE__MAX_EXCLUSIVE = DATA_TYPE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Measurement Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_TYPE__MEASUREMENT_UNIT = DATA_TYPE_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Numeric Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 8;

    /**
     * The number of operations of the '<em>Numeric Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.example.dm.impl.DateTypeImpl <em>Date Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.dm.impl.DateTypeImpl
     * @see org.example.dm.impl.DmPackageImpl#getDateType()
     * @generated
     */
    int DATE_TYPE = 11;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_TYPE__NAME = DATA_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_TYPE__DESCRIPTION = DATA_TYPE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Localizations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_TYPE__LOCALIZATIONS = DATA_TYPE__LOCALIZATIONS;

    /**
     * The feature id for the '<em><b>Data Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_TYPE__DATA_MODEL = DATA_TYPE__DATA_MODEL;

    /**
     * The number of structural features of the '<em>Date Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Date Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.example.dm.impl.DateTimeTypeImpl <em>Date Time Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.dm.impl.DateTimeTypeImpl
     * @see org.example.dm.impl.DmPackageImpl#getDateTimeType()
     * @generated
     */
    int DATE_TIME_TYPE = 12;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_TIME_TYPE__NAME = DATA_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_TIME_TYPE__DESCRIPTION = DATA_TYPE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Localizations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_TIME_TYPE__LOCALIZATIONS = DATA_TYPE__LOCALIZATIONS;

    /**
     * The feature id for the '<em><b>Data Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_TIME_TYPE__DATA_MODEL = DATA_TYPE__DATA_MODEL;

    /**
     * The number of structural features of the '<em>Date Time Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_TIME_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Date Time Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_TIME_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.example.dm.impl.UuidTypeImpl <em>Uuid Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.dm.impl.UuidTypeImpl
     * @see org.example.dm.impl.DmPackageImpl#getUuidType()
     * @generated
     */
    int UUID_TYPE = 13;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UUID_TYPE__NAME = DATA_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UUID_TYPE__DESCRIPTION = DATA_TYPE__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Localizations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UUID_TYPE__LOCALIZATIONS = DATA_TYPE__LOCALIZATIONS;

    /**
     * The feature id for the '<em><b>Data Model</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UUID_TYPE__DATA_MODEL = DATA_TYPE__DATA_MODEL;

    /**
     * The number of structural features of the '<em>Uuid Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UUID_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Uuid Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UUID_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.example.dm.EntityKind <em>Entity Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.dm.EntityKind
     * @see org.example.dm.impl.DmPackageImpl#getEntityKind()
     * @generated
     */
    int ENTITY_KIND = 14;

    /**
     * The meta object id for the '{@link org.example.dm.RelationshipKind <em>Relationship Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.example.dm.RelationshipKind
     * @see org.example.dm.impl.DmPackageImpl#getRelationshipKind()
     * @generated
     */
    int RELATIONSHIP_KIND = 15;

    /**
     * Returns the meta object for class '{@link org.example.dm.NamedElement <em>Named Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Named Element</em>'.
     * @see org.example.dm.NamedElement
     * @generated
     */
    EClass getNamedElement();

    /**
     * Returns the meta object for the attribute '{@link org.example.dm.NamedElement#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.example.dm.NamedElement#getName()
     * @see #getNamedElement()
     * @generated
     */
    EAttribute getNamedElement_Name();

    /**
     * Returns the meta object for the attribute '{@link org.example.dm.NamedElement#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see org.example.dm.NamedElement#getDescription()
     * @see #getNamedElement()
     * @generated
     */
    EAttribute getNamedElement_Description();

    /**
     * Returns the meta object for the containment reference list '{@link org.example.dm.NamedElement#getLocalizations <em>Localizations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Localizations</em>'.
     * @see org.example.dm.NamedElement#getLocalizations()
     * @see #getNamedElement()
     * @generated
     */
    EReference getNamedElement_Localizations();

    /**
     * Returns the meta object for class '{@link org.example.dm.Localization <em>Localization</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Localization</em>'.
     * @see org.example.dm.Localization
     * @generated
     */
    EClass getLocalization();

    /**
     * Returns the meta object for the attribute '{@link org.example.dm.Localization#getLocale <em>Locale</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Locale</em>'.
     * @see org.example.dm.Localization#getLocale()
     * @see #getLocalization()
     * @generated
     */
    EAttribute getLocalization_Locale();

    /**
     * Returns the meta object for the container reference '{@link org.example.dm.Localization#getElement <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Element</em>'.
     * @see org.example.dm.Localization#getElement()
     * @see #getLocalization()
     * @generated
     */
    EReference getLocalization_Element();

    /**
     * Returns the meta object for class '{@link org.example.dm.DataModel <em>Data Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Model</em>'.
     * @see org.example.dm.DataModel
     * @generated
     */
    EClass getDataModel();

    /**
     * Returns the meta object for the attribute list '{@link org.example.dm.DataModel#getLocales <em>Locales</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Locales</em>'.
     * @see org.example.dm.DataModel#getLocales()
     * @see #getDataModel()
     * @generated
     */
    EAttribute getDataModel_Locales();

    /**
     * Returns the meta object for the containment reference list '{@link org.example.dm.DataModel#getEntities <em>Entities</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Entities</em>'.
     * @see org.example.dm.DataModel#getEntities()
     * @see #getDataModel()
     * @generated
     */
    EReference getDataModel_Entities();

    /**
     * Returns the meta object for the containment reference list '{@link org.example.dm.DataModel#getRelationships <em>Relationships</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Relationships</em>'.
     * @see org.example.dm.DataModel#getRelationships()
     * @see #getDataModel()
     * @generated
     */
    EReference getDataModel_Relationships();

    /**
     * Returns the meta object for the containment reference list '{@link org.example.dm.DataModel#getDataTypes <em>Data Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Data Types</em>'.
     * @see org.example.dm.DataModel#getDataTypes()
     * @see #getDataModel()
     * @generated
     */
    EReference getDataModel_DataTypes();

    /**
     * Returns the meta object for class '{@link org.example.dm.Entity <em>Entity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entity</em>'.
     * @see org.example.dm.Entity
     * @generated
     */
    EClass getEntity();

    /**
     * Returns the meta object for the containment reference list '{@link org.example.dm.Entity#getAttributes <em>Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attributes</em>'.
     * @see org.example.dm.Entity#getAttributes()
     * @see #getEntity()
     * @generated
     */
    EReference getEntity_Attributes();

    /**
     * Returns the meta object for the reference list '{@link org.example.dm.Entity#getGenerals <em>Generals</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Generals</em>'.
     * @see org.example.dm.Entity#getGenerals()
     * @see #getEntity()
     * @generated
     */
    EReference getEntity_Generals();

    /**
     * Returns the meta object for the container reference '{@link org.example.dm.Entity#getDataModel <em>Data Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Data Model</em>'.
     * @see org.example.dm.Entity#getDataModel()
     * @see #getEntity()
     * @generated
     */
    EReference getEntity_DataModel();

    /**
     * Returns the meta object for the attribute '{@link org.example.dm.Entity#getKind <em>Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kind</em>'.
     * @see org.example.dm.Entity#getKind()
     * @see #getEntity()
     * @generated
     */
    EAttribute getEntity_Kind();

    /**
     * Returns the meta object for class '{@link org.example.dm.Attribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute</em>'.
     * @see org.example.dm.Attribute
     * @generated
     */
    EClass getAttribute();

    /**
     * Returns the meta object for the attribute '{@link org.example.dm.Attribute#isIdentity <em>Identity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Identity</em>'.
     * @see org.example.dm.Attribute#isIdentity()
     * @see #getAttribute()
     * @generated
     */
    EAttribute getAttribute_Identity();

    /**
     * Returns the meta object for the reference '{@link org.example.dm.Attribute#getDataType <em>Data Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Data Type</em>'.
     * @see org.example.dm.Attribute#getDataType()
     * @see #getAttribute()
     * @generated
     */
    EReference getAttribute_DataType();

    /**
     * Returns the meta object for the attribute '{@link org.example.dm.Attribute#getDefaultValue <em>Default Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Default Value</em>'.
     * @see org.example.dm.Attribute#getDefaultValue()
     * @see #getAttribute()
     * @generated
     */
    EAttribute getAttribute_DefaultValue();

    /**
     * Returns the meta object for the attribute '{@link org.example.dm.Attribute#getUpper <em>Upper</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Upper</em>'.
     * @see org.example.dm.Attribute#getUpper()
     * @see #getAttribute()
     * @generated
     */
    EAttribute getAttribute_Upper();

    /**
     * Returns the meta object for the attribute '{@link org.example.dm.Attribute#getLower <em>Lower</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lower</em>'.
     * @see org.example.dm.Attribute#getLower()
     * @see #getAttribute()
     * @generated
     */
    EAttribute getAttribute_Lower();

    /**
     * Returns the meta object for class '{@link org.example.dm.Relationship <em>Relationship</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Relationship</em>'.
     * @see org.example.dm.Relationship
     * @generated
     */
    EClass getRelationship();

    /**
     * Returns the meta object for the containment reference list '{@link org.example.dm.Relationship#getEnds <em>Ends</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Ends</em>'.
     * @see org.example.dm.Relationship#getEnds()
     * @see #getRelationship()
     * @generated
     */
    EReference getRelationship_Ends();

    /**
     * Returns the meta object for the container reference '{@link org.example.dm.Relationship#getDataModel <em>Data Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Data Model</em>'.
     * @see org.example.dm.Relationship#getDataModel()
     * @see #getRelationship()
     * @generated
     */
    EReference getRelationship_DataModel();

    /**
     * Returns the meta object for the attribute '{@link org.example.dm.Relationship#getKind <em>Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kind</em>'.
     * @see org.example.dm.Relationship#getKind()
     * @see #getRelationship()
     * @generated
     */
    EAttribute getRelationship_Kind();

    /**
     * Returns the meta object for class '{@link org.example.dm.RelationshipEnd <em>Relationship End</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Relationship End</em>'.
     * @see org.example.dm.RelationshipEnd
     * @generated
     */
    EClass getRelationshipEnd();

    /**
     * Returns the meta object for the reference '{@link org.example.dm.RelationshipEnd#getEntity <em>Entity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Entity</em>'.
     * @see org.example.dm.RelationshipEnd#getEntity()
     * @see #getRelationshipEnd()
     * @generated
     */
    EReference getRelationshipEnd_Entity();

    /**
     * Returns the meta object for the attribute '{@link org.example.dm.RelationshipEnd#getLower <em>Lower</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lower</em>'.
     * @see org.example.dm.RelationshipEnd#getLower()
     * @see #getRelationshipEnd()
     * @generated
     */
    EAttribute getRelationshipEnd_Lower();

    /**
     * Returns the meta object for the attribute '{@link org.example.dm.RelationshipEnd#getUpper <em>Upper</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Upper</em>'.
     * @see org.example.dm.RelationshipEnd#getUpper()
     * @see #getRelationshipEnd()
     * @generated
     */
    EAttribute getRelationshipEnd_Upper();

    /**
     * Returns the meta object for the container reference '{@link org.example.dm.RelationshipEnd#getRelationship <em>Relationship</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Relationship</em>'.
     * @see org.example.dm.RelationshipEnd#getRelationship()
     * @see #getRelationshipEnd()
     * @generated
     */
    EReference getRelationshipEnd_Relationship();

    /**
     * Returns the meta object for class '{@link org.example.dm.DataType <em>Data Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Data Type</em>'.
     * @see org.example.dm.DataType
     * @generated
     */
    EClass getDataType();

    /**
     * Returns the meta object for the container reference '{@link org.example.dm.DataType#getDataModel <em>Data Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Data Model</em>'.
     * @see org.example.dm.DataType#getDataModel()
     * @see #getDataType()
     * @generated
     */
    EReference getDataType_DataModel();

    /**
     * Returns the meta object for class '{@link org.example.dm.BooleanType <em>Boolean Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Boolean Type</em>'.
     * @see org.example.dm.BooleanType
     * @generated
     */
    EClass getBooleanType();

    /**
     * Returns the meta object for class '{@link org.example.dm.StringType <em>String Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>String Type</em>'.
     * @see org.example.dm.StringType
     * @generated
     */
    EClass getStringType();

    /**
     * Returns the meta object for the attribute '{@link org.example.dm.StringType#getLength <em>Length</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Length</em>'.
     * @see org.example.dm.StringType#getLength()
     * @see #getStringType()
     * @generated
     */
    EAttribute getStringType_Length();

    /**
     * Returns the meta object for the attribute '{@link org.example.dm.StringType#getMinLength <em>Min Length</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Length</em>'.
     * @see org.example.dm.StringType#getMinLength()
     * @see #getStringType()
     * @generated
     */
    EAttribute getStringType_MinLength();

    /**
     * Returns the meta object for the attribute '{@link org.example.dm.StringType#getMaxLength <em>Max Length</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Length</em>'.
     * @see org.example.dm.StringType#getMaxLength()
     * @see #getStringType()
     * @generated
     */
    EAttribute getStringType_MaxLength();

    /**
     * Returns the meta object for the attribute '{@link org.example.dm.StringType#getPattern <em>Pattern</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pattern</em>'.
     * @see org.example.dm.StringType#getPattern()
     * @see #getStringType()
     * @generated
     */
    EAttribute getStringType_Pattern();

    /**
     * Returns the meta object for class '{@link org.example.dm.NumericType <em>Numeric Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Numeric Type</em>'.
     * @see org.example.dm.NumericType
     * @generated
     */
    EClass getNumericType();

    /**
     * Returns the meta object for the attribute '{@link org.example.dm.NumericType#getSize <em>Size</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Size</em>'.
     * @see org.example.dm.NumericType#getSize()
     * @see #getNumericType()
     * @generated
     */
    EAttribute getNumericType_Size();

    /**
     * Returns the meta object for the attribute '{@link org.example.dm.NumericType#getMinInclusive <em>Min Inclusive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Inclusive</em>'.
     * @see org.example.dm.NumericType#getMinInclusive()
     * @see #getNumericType()
     * @generated
     */
    EAttribute getNumericType_MinInclusive();

    /**
     * Returns the meta object for the attribute '{@link org.example.dm.NumericType#getMinExclusive <em>Min Exclusive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Min Exclusive</em>'.
     * @see org.example.dm.NumericType#getMinExclusive()
     * @see #getNumericType()
     * @generated
     */
    EAttribute getNumericType_MinExclusive();

    /**
     * Returns the meta object for the attribute '{@link org.example.dm.NumericType#getMaxInclusive <em>Max Inclusive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Inclusive</em>'.
     * @see org.example.dm.NumericType#getMaxInclusive()
     * @see #getNumericType()
     * @generated
     */
    EAttribute getNumericType_MaxInclusive();

    /**
     * Returns the meta object for the attribute '{@link org.example.dm.NumericType#getMaxExclusive <em>Max Exclusive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Exclusive</em>'.
     * @see org.example.dm.NumericType#getMaxExclusive()
     * @see #getNumericType()
     * @generated
     */
    EAttribute getNumericType_MaxExclusive();

    /**
     * Returns the meta object for the attribute '{@link org.example.dm.NumericType#getTotalDigits <em>Total Digits</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Total Digits</em>'.
     * @see org.example.dm.NumericType#getTotalDigits()
     * @see #getNumericType()
     * @generated
     */
    EAttribute getNumericType_TotalDigits();

    /**
     * Returns the meta object for the attribute '{@link org.example.dm.NumericType#getFractionDigits <em>Fraction Digits</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fraction Digits</em>'.
     * @see org.example.dm.NumericType#getFractionDigits()
     * @see #getNumericType()
     * @generated
     */
    EAttribute getNumericType_FractionDigits();

    /**
     * Returns the meta object for the attribute '{@link org.example.dm.NumericType#getMeasurementUnit <em>Measurement Unit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Measurement Unit</em>'.
     * @see org.example.dm.NumericType#getMeasurementUnit()
     * @see #getNumericType()
     * @generated
     */
    EAttribute getNumericType_MeasurementUnit();

    /**
     * Returns the meta object for class '{@link org.example.dm.DateType <em>Date Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Date Type</em>'.
     * @see org.example.dm.DateType
     * @generated
     */
    EClass getDateType();

    /**
     * Returns the meta object for class '{@link org.example.dm.DateTimeType <em>Date Time Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Date Time Type</em>'.
     * @see org.example.dm.DateTimeType
     * @generated
     */
    EClass getDateTimeType();

    /**
     * Returns the meta object for class '{@link org.example.dm.UuidType <em>Uuid Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Uuid Type</em>'.
     * @see org.example.dm.UuidType
     * @generated
     */
    EClass getUuidType();

    /**
     * Returns the meta object for enum '{@link org.example.dm.EntityKind <em>Entity Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Entity Kind</em>'.
     * @see org.example.dm.EntityKind
     * @generated
     */
    EEnum getEntityKind();

    /**
     * Returns the meta object for enum '{@link org.example.dm.RelationshipKind <em>Relationship Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Relationship Kind</em>'.
     * @see org.example.dm.RelationshipKind
     * @generated
     */
    EEnum getRelationshipKind();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    DmFactory getDmFactory();

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
         * The meta object literal for the '{@link org.example.dm.impl.NamedElementImpl <em>Named Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.example.dm.impl.NamedElementImpl
         * @see org.example.dm.impl.DmPackageImpl#getNamedElement()
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
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NAMED_ELEMENT__DESCRIPTION = eINSTANCE.getNamedElement_Description();

        /**
         * The meta object literal for the '<em><b>Localizations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NAMED_ELEMENT__LOCALIZATIONS = eINSTANCE.getNamedElement_Localizations();

        /**
         * The meta object literal for the '{@link org.example.dm.impl.LocalizationImpl <em>Localization</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.example.dm.impl.LocalizationImpl
         * @see org.example.dm.impl.DmPackageImpl#getLocalization()
         * @generated
         */
        EClass LOCALIZATION = eINSTANCE.getLocalization();

        /**
         * The meta object literal for the '<em><b>Locale</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LOCALIZATION__LOCALE = eINSTANCE.getLocalization_Locale();

        /**
         * The meta object literal for the '<em><b>Element</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LOCALIZATION__ELEMENT = eINSTANCE.getLocalization_Element();

        /**
         * The meta object literal for the '{@link org.example.dm.impl.DataModelImpl <em>Data Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.example.dm.impl.DataModelImpl
         * @see org.example.dm.impl.DmPackageImpl#getDataModel()
         * @generated
         */
        EClass DATA_MODEL = eINSTANCE.getDataModel();

        /**
         * The meta object literal for the '<em><b>Locales</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DATA_MODEL__LOCALES = eINSTANCE.getDataModel_Locales();

        /**
         * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_MODEL__ENTITIES = eINSTANCE.getDataModel_Entities();

        /**
         * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_MODEL__RELATIONSHIPS = eINSTANCE.getDataModel_Relationships();

        /**
         * The meta object literal for the '<em><b>Data Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_MODEL__DATA_TYPES = eINSTANCE.getDataModel_DataTypes();

        /**
         * The meta object literal for the '{@link org.example.dm.impl.EntityImpl <em>Entity</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.example.dm.impl.EntityImpl
         * @see org.example.dm.impl.DmPackageImpl#getEntity()
         * @generated
         */
        EClass ENTITY = eINSTANCE.getEntity();

        /**
         * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

        /**
         * The meta object literal for the '<em><b>Generals</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY__GENERALS = eINSTANCE.getEntity_Generals();

        /**
         * The meta object literal for the '<em><b>Data Model</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY__DATA_MODEL = eINSTANCE.getEntity_DataModel();

        /**
         * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ENTITY__KIND = eINSTANCE.getEntity_Kind();

        /**
         * The meta object literal for the '{@link org.example.dm.impl.AttributeImpl <em>Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.example.dm.impl.AttributeImpl
         * @see org.example.dm.impl.DmPackageImpl#getAttribute()
         * @generated
         */
        EClass ATTRIBUTE = eINSTANCE.getAttribute();

        /**
         * The meta object literal for the '<em><b>Identity</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE__IDENTITY = eINSTANCE.getAttribute_Identity();

        /**
         * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTRIBUTE__DATA_TYPE = eINSTANCE.getAttribute_DataType();

        /**
         * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getAttribute_DefaultValue();

        /**
         * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE__UPPER = eINSTANCE.getAttribute_Upper();

        /**
         * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE__LOWER = eINSTANCE.getAttribute_Lower();

        /**
         * The meta object literal for the '{@link org.example.dm.impl.RelationshipImpl <em>Relationship</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.example.dm.impl.RelationshipImpl
         * @see org.example.dm.impl.DmPackageImpl#getRelationship()
         * @generated
         */
        EClass RELATIONSHIP = eINSTANCE.getRelationship();

        /**
         * The meta object literal for the '<em><b>Ends</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RELATIONSHIP__ENDS = eINSTANCE.getRelationship_Ends();

        /**
         * The meta object literal for the '<em><b>Data Model</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RELATIONSHIP__DATA_MODEL = eINSTANCE.getRelationship_DataModel();

        /**
         * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RELATIONSHIP__KIND = eINSTANCE.getRelationship_Kind();

        /**
         * The meta object literal for the '{@link org.example.dm.impl.RelationshipEndImpl <em>Relationship End</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.example.dm.impl.RelationshipEndImpl
         * @see org.example.dm.impl.DmPackageImpl#getRelationshipEnd()
         * @generated
         */
        EClass RELATIONSHIP_END = eINSTANCE.getRelationshipEnd();

        /**
         * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RELATIONSHIP_END__ENTITY = eINSTANCE.getRelationshipEnd_Entity();

        /**
         * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RELATIONSHIP_END__LOWER = eINSTANCE.getRelationshipEnd_Lower();

        /**
         * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RELATIONSHIP_END__UPPER = eINSTANCE.getRelationshipEnd_Upper();

        /**
         * The meta object literal for the '<em><b>Relationship</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RELATIONSHIP_END__RELATIONSHIP = eINSTANCE.getRelationshipEnd_Relationship();

        /**
         * The meta object literal for the '{@link org.example.dm.impl.DataTypeImpl <em>Data Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.example.dm.impl.DataTypeImpl
         * @see org.example.dm.impl.DmPackageImpl#getDataType()
         * @generated
         */
        EClass DATA_TYPE = eINSTANCE.getDataType();

        /**
         * The meta object literal for the '<em><b>Data Model</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DATA_TYPE__DATA_MODEL = eINSTANCE.getDataType_DataModel();

        /**
         * The meta object literal for the '{@link org.example.dm.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.example.dm.impl.BooleanTypeImpl
         * @see org.example.dm.impl.DmPackageImpl#getBooleanType()
         * @generated
         */
        EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

        /**
         * The meta object literal for the '{@link org.example.dm.impl.StringTypeImpl <em>String Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.example.dm.impl.StringTypeImpl
         * @see org.example.dm.impl.DmPackageImpl#getStringType()
         * @generated
         */
        EClass STRING_TYPE = eINSTANCE.getStringType();

        /**
         * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STRING_TYPE__LENGTH = eINSTANCE.getStringType_Length();

        /**
         * The meta object literal for the '<em><b>Min Length</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STRING_TYPE__MIN_LENGTH = eINSTANCE.getStringType_MinLength();

        /**
         * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STRING_TYPE__MAX_LENGTH = eINSTANCE.getStringType_MaxLength();

        /**
         * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STRING_TYPE__PATTERN = eINSTANCE.getStringType_Pattern();

        /**
         * The meta object literal for the '{@link org.example.dm.impl.NumericTypeImpl <em>Numeric Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.example.dm.impl.NumericTypeImpl
         * @see org.example.dm.impl.DmPackageImpl#getNumericType()
         * @generated
         */
        EClass NUMERIC_TYPE = eINSTANCE.getNumericType();

        /**
         * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NUMERIC_TYPE__SIZE = eINSTANCE.getNumericType_Size();

        /**
         * The meta object literal for the '<em><b>Min Inclusive</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NUMERIC_TYPE__MIN_INCLUSIVE = eINSTANCE.getNumericType_MinInclusive();

        /**
         * The meta object literal for the '<em><b>Min Exclusive</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NUMERIC_TYPE__MIN_EXCLUSIVE = eINSTANCE.getNumericType_MinExclusive();

        /**
         * The meta object literal for the '<em><b>Max Inclusive</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NUMERIC_TYPE__MAX_INCLUSIVE = eINSTANCE.getNumericType_MaxInclusive();

        /**
         * The meta object literal for the '<em><b>Max Exclusive</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NUMERIC_TYPE__MAX_EXCLUSIVE = eINSTANCE.getNumericType_MaxExclusive();

        /**
         * The meta object literal for the '<em><b>Total Digits</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NUMERIC_TYPE__TOTAL_DIGITS = eINSTANCE.getNumericType_TotalDigits();

        /**
         * The meta object literal for the '<em><b>Fraction Digits</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NUMERIC_TYPE__FRACTION_DIGITS = eINSTANCE.getNumericType_FractionDigits();

        /**
         * The meta object literal for the '<em><b>Measurement Unit</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NUMERIC_TYPE__MEASUREMENT_UNIT = eINSTANCE.getNumericType_MeasurementUnit();

        /**
         * The meta object literal for the '{@link org.example.dm.impl.DateTypeImpl <em>Date Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.example.dm.impl.DateTypeImpl
         * @see org.example.dm.impl.DmPackageImpl#getDateType()
         * @generated
         */
        EClass DATE_TYPE = eINSTANCE.getDateType();

        /**
         * The meta object literal for the '{@link org.example.dm.impl.DateTimeTypeImpl <em>Date Time Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.example.dm.impl.DateTimeTypeImpl
         * @see org.example.dm.impl.DmPackageImpl#getDateTimeType()
         * @generated
         */
        EClass DATE_TIME_TYPE = eINSTANCE.getDateTimeType();

        /**
         * The meta object literal for the '{@link org.example.dm.impl.UuidTypeImpl <em>Uuid Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.example.dm.impl.UuidTypeImpl
         * @see org.example.dm.impl.DmPackageImpl#getUuidType()
         * @generated
         */
        EClass UUID_TYPE = eINSTANCE.getUuidType();

        /**
         * The meta object literal for the '{@link org.example.dm.EntityKind <em>Entity Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.example.dm.EntityKind
         * @see org.example.dm.impl.DmPackageImpl#getEntityKind()
         * @generated
         */
        EEnum ENTITY_KIND = eINSTANCE.getEntityKind();

        /**
         * The meta object literal for the '{@link org.example.dm.RelationshipKind <em>Relationship Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.example.dm.RelationshipKind
         * @see org.example.dm.impl.DmPackageImpl#getRelationshipKind()
         * @generated
         */
        EEnum RELATIONSHIP_KIND = eINSTANCE.getRelationshipKind();

    }

} //DmPackage
