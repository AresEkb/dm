/**
 */
package org.example.dm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.example.dm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DmFactoryImpl extends EFactoryImpl implements DmFactory {

    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DmFactory init() {
        try {
            DmFactory theDmFactory = (DmFactory) EPackage.Registry.INSTANCE.getEFactory(DmPackage.eNS_URI);
            if (theDmFactory != null) {
                return theDmFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new DmFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DmFactoryImpl() {
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
        case DmPackage.LOCALIZATION:
            return createLocalization();
        case DmPackage.DATA_MODEL:
            return createDataModel();
        case DmPackage.ENTITY:
            return createEntity();
        case DmPackage.ATTRIBUTE:
            return createAttribute();
        case DmPackage.RELATIONSHIP:
            return createRelationship();
        case DmPackage.RELATIONSHIP_END:
            return createRelationshipEnd();
        case DmPackage.BOOLEAN_TYPE:
            return createBooleanType();
        case DmPackage.STRING_TYPE:
            return createStringType();
        case DmPackage.NUMERIC_TYPE:
            return createNumericType();
        case DmPackage.DATE_TYPE:
            return createDateType();
        case DmPackage.DATE_TIME_TYPE:
            return createDateTimeType();
        case DmPackage.UUID_TYPE:
            return createUuidType();
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
        case DmPackage.ENTITY_KIND:
            return createEntityKindFromString(eDataType, initialValue);
        case DmPackage.RELATIONSHIP_KIND:
            return createRelationshipKindFromString(eDataType, initialValue);
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
        case DmPackage.ENTITY_KIND:
            return convertEntityKindToString(eDataType, instanceValue);
        case DmPackage.RELATIONSHIP_KIND:
            return convertRelationshipKindToString(eDataType, instanceValue);
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
    public Localization createLocalization() {
        LocalizationImpl localization = new LocalizationImpl();
        return localization;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DataModel createDataModel() {
        DataModelImpl dataModel = new DataModelImpl();
        return dataModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Entity createEntity() {
        EntityImpl entity = new EntityImpl();
        return entity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Attribute createAttribute() {
        AttributeImpl attribute = new AttributeImpl();
        return attribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Relationship createRelationship() {
        RelationshipImpl relationship = new RelationshipImpl();
        return relationship;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RelationshipEnd createRelationshipEnd() {
        RelationshipEndImpl relationshipEnd = new RelationshipEndImpl();
        return relationshipEnd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BooleanType createBooleanType() {
        BooleanTypeImpl booleanType = new BooleanTypeImpl();
        return booleanType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StringType createStringType() {
        StringTypeImpl stringType = new StringTypeImpl();
        return stringType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NumericType createNumericType() {
        NumericTypeImpl numericType = new NumericTypeImpl();
        return numericType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DateType createDateType() {
        DateTypeImpl dateType = new DateTypeImpl();
        return dateType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DateTimeType createDateTimeType() {
        DateTimeTypeImpl dateTimeType = new DateTimeTypeImpl();
        return dateTimeType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UuidType createUuidType() {
        UuidTypeImpl uuidType = new UuidTypeImpl();
        return uuidType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityKind createEntityKindFromString(EDataType eDataType, String initialValue) {
        EntityKind result = EntityKind.get(initialValue);
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
    public String convertEntityKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RelationshipKind createRelationshipKindFromString(EDataType eDataType, String initialValue) {
        RelationshipKind result = RelationshipKind.get(initialValue);
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
    public String convertRelationshipKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DmPackage getDmPackage() {
        return (DmPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static DmPackage getPackage() {
        return DmPackage.eINSTANCE;
    }

} //DmFactoryImpl
