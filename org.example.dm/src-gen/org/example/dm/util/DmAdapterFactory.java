/**
 */
package org.example.dm.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.example.dm.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.example.dm.DmPackage
 * @generated
 */
public class DmAdapterFactory extends AdapterFactoryImpl {

    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static DmPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DmAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = DmPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DmSwitch<Adapter> modelSwitch = new DmSwitch<Adapter>() {

        @Override
        public Adapter caseNamedElement(NamedElement object) {
            return createNamedElementAdapter();
        }

        @Override
        public Adapter caseLocalization(Localization object) {
            return createLocalizationAdapter();
        }

        @Override
        public Adapter caseDataModel(DataModel object) {
            return createDataModelAdapter();
        }

        @Override
        public Adapter caseEntity(Entity object) {
            return createEntityAdapter();
        }

        @Override
        public Adapter caseAttribute(Attribute object) {
            return createAttributeAdapter();
        }

        @Override
        public Adapter caseRelationship(Relationship object) {
            return createRelationshipAdapter();
        }

        @Override
        public Adapter caseRelationshipEnd(RelationshipEnd object) {
            return createRelationshipEndAdapter();
        }

        @Override
        public Adapter caseDataType(DataType object) {
            return createDataTypeAdapter();
        }

        @Override
        public Adapter caseBooleanType(BooleanType object) {
            return createBooleanTypeAdapter();
        }

        @Override
        public Adapter caseStringType(StringType object) {
            return createStringTypeAdapter();
        }

        @Override
        public Adapter caseNumericType(NumericType object) {
            return createNumericTypeAdapter();
        }

        @Override
        public Adapter caseDateType(DateType object) {
            return createDateTypeAdapter();
        }

        @Override
        public Adapter caseDateTimeType(DateTimeType object) {
            return createDateTimeTypeAdapter();
        }

        @Override
        public Adapter caseUuidType(UuidType object) {
            return createUuidTypeAdapter();
        }

        @Override
        public Adapter defaultCase(EObject object) {
            return createEObjectAdapter();
        }

    };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '{@link org.example.dm.NamedElement <em>Named Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.example.dm.NamedElement
     * @generated
     */
    public Adapter createNamedElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.example.dm.Localization <em>Localization</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.example.dm.Localization
     * @generated
     */
    public Adapter createLocalizationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.example.dm.DataModel <em>Data Model</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.example.dm.DataModel
     * @generated
     */
    public Adapter createDataModelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.example.dm.Entity <em>Entity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.example.dm.Entity
     * @generated
     */
    public Adapter createEntityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.example.dm.Attribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.example.dm.Attribute
     * @generated
     */
    public Adapter createAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.example.dm.Relationship <em>Relationship</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.example.dm.Relationship
     * @generated
     */
    public Adapter createRelationshipAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.example.dm.RelationshipEnd <em>Relationship End</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.example.dm.RelationshipEnd
     * @generated
     */
    public Adapter createRelationshipEndAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.example.dm.DataType <em>Data Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.example.dm.DataType
     * @generated
     */
    public Adapter createDataTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.example.dm.BooleanType <em>Boolean Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.example.dm.BooleanType
     * @generated
     */
    public Adapter createBooleanTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.example.dm.StringType <em>String Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.example.dm.StringType
     * @generated
     */
    public Adapter createStringTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.example.dm.NumericType <em>Numeric Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.example.dm.NumericType
     * @generated
     */
    public Adapter createNumericTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.example.dm.DateType <em>Date Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.example.dm.DateType
     * @generated
     */
    public Adapter createDateTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.example.dm.DateTimeType <em>Date Time Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.example.dm.DateTimeType
     * @generated
     */
    public Adapter createDateTimeTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.example.dm.UuidType <em>Uuid Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.example.dm.UuidType
     * @generated
     */
    public Adapter createUuidTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //DmAdapterFactory
