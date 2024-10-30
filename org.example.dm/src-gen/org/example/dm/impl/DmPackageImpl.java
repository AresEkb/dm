/**
 */
package org.example.dm.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.example.dm.Attribute;
import org.example.dm.BooleanType;
import org.example.dm.DataModel;
import org.example.dm.DataType;
import org.example.dm.DateTimeType;
import org.example.dm.DateType;
import org.example.dm.DmFactory;
import org.example.dm.DmPackage;
import org.example.dm.Entity;
import org.example.dm.EntityKind;
import org.example.dm.Localization;
import org.example.dm.NamedElement;
import org.example.dm.NumericType;
import org.example.dm.Relationship;
import org.example.dm.RelationshipEnd;
import org.example.dm.RelationshipKind;
import org.example.dm.StringType;
import org.example.dm.UuidType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DmPackageImpl extends EPackageImpl implements DmPackage {

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
    private EClass localizationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataModelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass entityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass relationshipEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass relationshipEndEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass booleanTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass stringTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass numericTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dateTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dateTimeTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass uuidTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum entityKindEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum relationshipKindEEnum = null;

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
     * @see org.example.dm.DmPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private DmPackageImpl() {
        super(eNS_URI, DmFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link DmPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static DmPackage init() {
        if (isInited)
            return (DmPackage) EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredDmPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        DmPackageImpl theDmPackage = registeredDmPackage instanceof DmPackageImpl ? (DmPackageImpl) registeredDmPackage
                : new DmPackageImpl();

        isInited = true;

        // Create package meta-data objects
        theDmPackage.createPackageContents();

        // Initialize created meta-data
        theDmPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theDmPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(DmPackage.eNS_URI, theDmPackage);
        return theDmPackage;
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
    public EAttribute getNamedElement_Description() {
        return (EAttribute) namedElementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getNamedElement_Localizations() {
        return (EReference) namedElementEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getLocalization() {
        return localizationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getLocalization_Locale() {
        return (EAttribute) localizationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getLocalization_Element() {
        return (EReference) localizationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDataModel() {
        return dataModelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getDataModel_Locales() {
        return (EAttribute) dataModelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDataModel_Entities() {
        return (EReference) dataModelEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDataModel_Relationships() {
        return (EReference) dataModelEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDataModel_DataTypes() {
        return (EReference) dataModelEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEntity() {
        return entityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEntity_Attributes() {
        return (EReference) entityEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEntity_Generals() {
        return (EReference) entityEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEntity_DataModel() {
        return (EReference) entityEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEntity_Kind() {
        return (EAttribute) entityEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAttribute() {
        return attributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAttribute_Identity() {
        return (EAttribute) attributeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getAttribute_DataType() {
        return (EReference) attributeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAttribute_DefaultValue() {
        return (EAttribute) attributeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAttribute_Upper() {
        return (EAttribute) attributeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAttribute_Lower() {
        return (EAttribute) attributeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRelationship() {
        return relationshipEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRelationship_Ends() {
        return (EReference) relationshipEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRelationship_DataModel() {
        return (EReference) relationshipEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getRelationship_Kind() {
        return (EAttribute) relationshipEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRelationshipEnd() {
        return relationshipEndEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRelationshipEnd_Entity() {
        return (EReference) relationshipEndEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getRelationshipEnd_Lower() {
        return (EAttribute) relationshipEndEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getRelationshipEnd_Upper() {
        return (EAttribute) relationshipEndEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRelationshipEnd_Relationship() {
        return (EReference) relationshipEndEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDataType() {
        return dataTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getDataType_DataModel() {
        return (EReference) dataTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBooleanType() {
        return booleanTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getStringType() {
        return stringTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getStringType_Length() {
        return (EAttribute) stringTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getStringType_MinLength() {
        return (EAttribute) stringTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getStringType_MaxLength() {
        return (EAttribute) stringTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getStringType_Pattern() {
        return (EAttribute) stringTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNumericType() {
        return numericTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNumericType_Size() {
        return (EAttribute) numericTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNumericType_MinInclusive() {
        return (EAttribute) numericTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNumericType_MinExclusive() {
        return (EAttribute) numericTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNumericType_MaxInclusive() {
        return (EAttribute) numericTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNumericType_MaxExclusive() {
        return (EAttribute) numericTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNumericType_TotalDigits() {
        return (EAttribute) numericTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNumericType_FractionDigits() {
        return (EAttribute) numericTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNumericType_MeasurementUnit() {
        return (EAttribute) numericTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDateType() {
        return dateTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getDateTimeType() {
        return dateTimeTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getUuidType() {
        return uuidTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getEntityKind() {
        return entityKindEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getRelationshipKind() {
        return relationshipKindEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DmFactory getDmFactory() {
        return (DmFactory) getEFactoryInstance();
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
        createEAttribute(namedElementEClass, NAMED_ELEMENT__DESCRIPTION);
        createEReference(namedElementEClass, NAMED_ELEMENT__LOCALIZATIONS);

        localizationEClass = createEClass(LOCALIZATION);
        createEAttribute(localizationEClass, LOCALIZATION__LOCALE);
        createEReference(localizationEClass, LOCALIZATION__ELEMENT);

        dataModelEClass = createEClass(DATA_MODEL);
        createEAttribute(dataModelEClass, DATA_MODEL__LOCALES);
        createEReference(dataModelEClass, DATA_MODEL__ENTITIES);
        createEReference(dataModelEClass, DATA_MODEL__RELATIONSHIPS);
        createEReference(dataModelEClass, DATA_MODEL__DATA_TYPES);

        entityEClass = createEClass(ENTITY);
        createEReference(entityEClass, ENTITY__DATA_MODEL);
        createEReference(entityEClass, ENTITY__GENERALS);
        createEAttribute(entityEClass, ENTITY__KIND);
        createEReference(entityEClass, ENTITY__ATTRIBUTES);

        attributeEClass = createEClass(ATTRIBUTE);
        createEAttribute(attributeEClass, ATTRIBUTE__IDENTITY);
        createEReference(attributeEClass, ATTRIBUTE__DATA_TYPE);
        createEAttribute(attributeEClass, ATTRIBUTE__LOWER);
        createEAttribute(attributeEClass, ATTRIBUTE__UPPER);
        createEAttribute(attributeEClass, ATTRIBUTE__DEFAULT_VALUE);

        relationshipEClass = createEClass(RELATIONSHIP);
        createEReference(relationshipEClass, RELATIONSHIP__DATA_MODEL);
        createEAttribute(relationshipEClass, RELATIONSHIP__KIND);
        createEReference(relationshipEClass, RELATIONSHIP__ENDS);

        relationshipEndEClass = createEClass(RELATIONSHIP_END);
        createEReference(relationshipEndEClass, RELATIONSHIP_END__RELATIONSHIP);
        createEReference(relationshipEndEClass, RELATIONSHIP_END__ENTITY);
        createEAttribute(relationshipEndEClass, RELATIONSHIP_END__LOWER);
        createEAttribute(relationshipEndEClass, RELATIONSHIP_END__UPPER);

        dataTypeEClass = createEClass(DATA_TYPE);
        createEReference(dataTypeEClass, DATA_TYPE__DATA_MODEL);

        booleanTypeEClass = createEClass(BOOLEAN_TYPE);

        stringTypeEClass = createEClass(STRING_TYPE);
        createEAttribute(stringTypeEClass, STRING_TYPE__LENGTH);
        createEAttribute(stringTypeEClass, STRING_TYPE__MIN_LENGTH);
        createEAttribute(stringTypeEClass, STRING_TYPE__MAX_LENGTH);
        createEAttribute(stringTypeEClass, STRING_TYPE__PATTERN);

        numericTypeEClass = createEClass(NUMERIC_TYPE);
        createEAttribute(numericTypeEClass, NUMERIC_TYPE__SIZE);
        createEAttribute(numericTypeEClass, NUMERIC_TYPE__TOTAL_DIGITS);
        createEAttribute(numericTypeEClass, NUMERIC_TYPE__FRACTION_DIGITS);
        createEAttribute(numericTypeEClass, NUMERIC_TYPE__MIN_INCLUSIVE);
        createEAttribute(numericTypeEClass, NUMERIC_TYPE__MIN_EXCLUSIVE);
        createEAttribute(numericTypeEClass, NUMERIC_TYPE__MAX_INCLUSIVE);
        createEAttribute(numericTypeEClass, NUMERIC_TYPE__MAX_EXCLUSIVE);
        createEAttribute(numericTypeEClass, NUMERIC_TYPE__MEASUREMENT_UNIT);

        dateTypeEClass = createEClass(DATE_TYPE);

        dateTimeTypeEClass = createEClass(DATE_TIME_TYPE);

        uuidTypeEClass = createEClass(UUID_TYPE);

        // Create enums
        entityKindEEnum = createEEnum(ENTITY_KIND);
        relationshipKindEEnum = createEEnum(RELATIONSHIP_KIND);
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
        localizationEClass.getESuperTypes().add(this.getNamedElement());
        dataModelEClass.getESuperTypes().add(this.getNamedElement());
        entityEClass.getESuperTypes().add(this.getNamedElement());
        attributeEClass.getESuperTypes().add(this.getNamedElement());
        relationshipEClass.getESuperTypes().add(this.getNamedElement());
        relationshipEndEClass.getESuperTypes().add(this.getNamedElement());
        dataTypeEClass.getESuperTypes().add(this.getNamedElement());
        booleanTypeEClass.getESuperTypes().add(this.getDataType());
        stringTypeEClass.getESuperTypes().add(this.getDataType());
        numericTypeEClass.getESuperTypes().add(this.getDataType());
        dateTypeEClass.getESuperTypes().add(this.getDataType());
        dateTimeTypeEClass.getESuperTypes().add(this.getDataType());
        uuidTypeEClass.getESuperTypes().add(this.getDataType());

        // Initialize classes, features, and operations; add parameters
        initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNamedElement_Description(), ecorePackage.getEString(), "description", null, 0, 1,
                NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEReference(getNamedElement_Localizations(), this.getLocalization(), this.getLocalization_Element(),
                "localizations", null, 0, -1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(localizationEClass, Localization.class, "Localization", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getLocalization_Locale(), ecorePackage.getEString(), "locale", null, 1, 1, Localization.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getLocalization_Element(), this.getNamedElement(), this.getNamedElement_Localizations(),
                "element", null, 1, 1, Localization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dataModelEClass, DataModel.class, "DataModel", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDataModel_Locales(), ecorePackage.getEString(), "locales", null, 0, -1, DataModel.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDataModel_Entities(), this.getEntity(), this.getEntity_DataModel(), "entities", null, 0, -1,
                DataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDataModel_Relationships(), this.getRelationship(), this.getRelationship_DataModel(),
                "relationships", null, 0, -1, DataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDataModel_DataTypes(), this.getDataType(), this.getDataType_DataModel(), "dataTypes", null, 0,
                -1, DataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEntity_DataModel(), this.getDataModel(), this.getDataModel_Entities(), "dataModel", null, 1,
                1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEntity_Generals(), this.getEntity(), null, "generals", null, 0, -1, Entity.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEntity_Kind(), this.getEntityKind(), "kind", null, 1, 1, Entity.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEntity_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Entity.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAttribute_Identity(), ecorePackage.getEBoolean(), "identity", null, 1, 1, Attribute.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAttribute_DataType(), this.getDataType(), null, "dataType", null, 1, 1, Attribute.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAttribute_Lower(), ecorePackage.getEInt(), "lower", "0", 1, 1, Attribute.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAttribute_Upper(), ecorePackage.getEInt(), "upper", "1", 1, 1, Attribute.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAttribute_DefaultValue(), ecorePackage.getEString(), "defaultValue", null, 0, 1,
                Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRelationship_DataModel(), this.getDataModel(), this.getDataModel_Relationships(), "dataModel",
                null, 1, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRelationship_Kind(), this.getRelationshipKind(), "kind", null, 1, 1, Relationship.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRelationship_Ends(), this.getRelationshipEnd(), this.getRelationshipEnd_Relationship(),
                "ends", null, 2, -1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(relationshipEndEClass, RelationshipEnd.class, "RelationshipEnd", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRelationshipEnd_Relationship(), this.getRelationship(), this.getRelationship_Ends(),
                "relationship", null, 1, 1, RelationshipEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRelationshipEnd_Entity(), this.getEntity(), null, "entity", null, 1, 1, RelationshipEnd.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRelationshipEnd_Lower(), ecorePackage.getEInt(), "lower", "0", 1, 1, RelationshipEnd.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRelationshipEnd_Upper(), ecorePackage.getEInt(), "upper", "1", 1, 1, RelationshipEnd.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(dataTypeEClass, DataType.class, "DataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDataType_DataModel(), this.getDataModel(), this.getDataModel_DataTypes(), "dataModel", null,
                1, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(booleanTypeEClass, BooleanType.class, "BooleanType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(stringTypeEClass, StringType.class, "StringType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getStringType_Length(), ecorePackage.getEIntegerObject(), "length", null, 0, 1, StringType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getStringType_MinLength(), ecorePackage.getEIntegerObject(), "minLength", null, 0, 1,
                StringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEAttribute(getStringType_MaxLength(), ecorePackage.getEIntegerObject(), "maxLength", null, 0, 1,
                StringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEAttribute(getStringType_Pattern(), ecorePackage.getEString(), "pattern", null, 0, 1, StringType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(numericTypeEClass, NumericType.class, "NumericType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getNumericType_Size(), ecorePackage.getEShortObject(), "size", null, 0, 1, NumericType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNumericType_TotalDigits(), ecorePackage.getEShortObject(), "totalDigits", null, 0, 1,
                NumericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNumericType_FractionDigits(), ecorePackage.getEShortObject(), "fractionDigits", null, 0, 1,
                NumericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNumericType_MinInclusive(), ecorePackage.getEDoubleObject(), "minInclusive", null, 0, 1,
                NumericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNumericType_MinExclusive(), ecorePackage.getEDoubleObject(), "minExclusive", null, 0, 1,
                NumericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNumericType_MaxInclusive(), ecorePackage.getEDoubleObject(), "maxInclusive", null, 0, 1,
                NumericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNumericType_MaxExclusive(), ecorePackage.getEDoubleObject(), "maxExclusive", null, 0, 1,
                NumericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNumericType_MeasurementUnit(), ecorePackage.getEString(), "measurementUnit", null, 0, 1,
                NumericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(dateTypeEClass, DateType.class, "DateType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(dateTimeTypeEClass, DateTimeType.class, "DateTimeType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(uuidTypeEClass, UuidType.class, "UuidType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        // Initialize enums and add enum literals
        initEEnum(entityKindEEnum, EntityKind.class, "EntityKind");
        addEEnumLiteral(entityKindEEnum, EntityKind.MASTER_DATA);
        addEEnumLiteral(entityKindEEnum, EntityKind.REFERENCE_DATA);
        addEEnumLiteral(entityKindEEnum, EntityKind.ABSTRACT_ENTITY);
        addEEnumLiteral(entityKindEEnum, EntityKind.ATTRIBUTE_SET);

        initEEnum(relationshipKindEEnum, RelationshipKind.class, "RelationshipKind");
        addEEnumLiteral(relationshipKindEEnum, RelationshipKind.ASSOCIATION);
        addEEnumLiteral(relationshipKindEEnum, RelationshipKind.COMPOSITION);
        addEEnumLiteral(relationshipKindEEnum, RelationshipKind.AGGREGATION);

        // Create resource
        createResource(eNS_URI);

        // Create annotations
        // http://www.example.org/annotation
        createAnnotationAnnotations();
    }

    /**
     * Initializes the annotations for <b>http://www.example.org/annotation</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createAnnotationAnnotations() {
        String source = "http://www.example.org/annotation";
        addAnnotation(entityKindEEnum.getELiterals().get(0),
                source,
                new String[] {
                        "name", "\u043c\u0430\u0441\u0442\u0435\u0440-\u0434\u0430\u043d\u043d\u044b\u0435"
                });
        addAnnotation(entityKindEEnum.getELiterals().get(1),
                source,
                new String[] {
                        "name",
                        "\u0441\u043f\u0440\u0430\u0432\u043e\u0447\u043d\u044b\u0435 \u0434\u0430\u043d\u043d\u044b\u0435"
                });
        addAnnotation(entityKindEEnum.getELiterals().get(2),
                source,
                new String[] {
                        "name",
                        "\u0430\u0431\u0441\u0442\u0440\u0430\u043a\u0442\u043d\u0430\u044f \u0441\u0443\u0449\u043d\u043e\u0441\u0442\u044c"
                });
        addAnnotation(entityKindEEnum.getELiterals().get(3),
                source,
                new String[] {
                        "name", "\u043d\u0430\u0431\u043e\u0440 \u0430\u0442\u0440\u0438\u0431\u0443\u0442\u043e\u0432"
                });
        addAnnotation(relationshipKindEEnum.getELiterals().get(0),
                source,
                new String[] {
                        "name", "\u0430\u0441\u0441\u043e\u0446\u0438\u0430\u0446\u0438\u044f"
                });
        addAnnotation(relationshipKindEEnum.getELiterals().get(1),
                source,
                new String[] {
                        "name", "\u043a\u043e\u043c\u043f\u043e\u0437\u0438\u0446\u0438\u044f"
                });
        addAnnotation(relationshipKindEEnum.getELiterals().get(2),
                source,
                new String[] {
                        "name", "\u0430\u0433\u0440\u0435\u0433\u0430\u0446\u0438\u044f"
                });
    }

} //DmPackageImpl
