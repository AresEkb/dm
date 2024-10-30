/**
 */
package org.example.dm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.example.dm.DataModel;
import org.example.dm.DataType;
import org.example.dm.DmPackage;
import org.example.dm.Entity;
import org.example.dm.Relationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.dm.impl.DataModelImpl#getLocales <em>Locales</em>}</li>
 *   <li>{@link org.example.dm.impl.DataModelImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link org.example.dm.impl.DataModelImpl#getRelationships <em>Relationships</em>}</li>
 *   <li>{@link org.example.dm.impl.DataModelImpl#getDataTypes <em>Data Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataModelImpl extends NamedElementImpl implements DataModel {

    /**
     * The cached value of the '{@link #getLocales() <em>Locales</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocales()
     * @generated
     * @ordered
     */
    protected EList<String> locales;

    /**
     * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntities()
     * @generated
     * @ordered
     */
    protected EList<Entity> entities;

    /**
     * The cached value of the '{@link #getRelationships() <em>Relationships</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRelationships()
     * @generated
     * @ordered
     */
    protected EList<Relationship> relationships;

    /**
     * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataTypes()
     * @generated
     * @ordered
     */
    protected EList<DataType> dataTypes;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DmPackage.Literals.DATA_MODEL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<String> getLocales() {
        if (locales == null) {
            locales = new EDataTypeUniqueEList<String>(String.class, this, DmPackage.DATA_MODEL__LOCALES);
        }
        return locales;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Entity> getEntities() {
        if (entities == null) {
            entities = new EObjectContainmentWithInverseEList<Entity>(Entity.class, this,
                    DmPackage.DATA_MODEL__ENTITIES, DmPackage.ENTITY__DATA_MODEL);
        }
        return entities;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Relationship> getRelationships() {
        if (relationships == null) {
            relationships = new EObjectContainmentWithInverseEList<Relationship>(Relationship.class, this,
                    DmPackage.DATA_MODEL__RELATIONSHIPS, DmPackage.RELATIONSHIP__DATA_MODEL);
        }
        return relationships;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<DataType> getDataTypes() {
        if (dataTypes == null) {
            dataTypes = new EObjectContainmentWithInverseEList<DataType>(DataType.class, this,
                    DmPackage.DATA_MODEL__DATA_TYPES, DmPackage.DATA_TYPE__DATA_MODEL);
        }
        return dataTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DmPackage.DATA_MODEL__ENTITIES:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getEntities()).basicAdd(otherEnd, msgs);
        case DmPackage.DATA_MODEL__RELATIONSHIPS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getRelationships()).basicAdd(otherEnd, msgs);
        case DmPackage.DATA_MODEL__DATA_TYPES:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getDataTypes()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DmPackage.DATA_MODEL__ENTITIES:
            return ((InternalEList<?>) getEntities()).basicRemove(otherEnd, msgs);
        case DmPackage.DATA_MODEL__RELATIONSHIPS:
            return ((InternalEList<?>) getRelationships()).basicRemove(otherEnd, msgs);
        case DmPackage.DATA_MODEL__DATA_TYPES:
            return ((InternalEList<?>) getDataTypes()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case DmPackage.DATA_MODEL__LOCALES:
            return getLocales();
        case DmPackage.DATA_MODEL__ENTITIES:
            return getEntities();
        case DmPackage.DATA_MODEL__RELATIONSHIPS:
            return getRelationships();
        case DmPackage.DATA_MODEL__DATA_TYPES:
            return getDataTypes();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case DmPackage.DATA_MODEL__LOCALES:
            getLocales().clear();
            getLocales().addAll((Collection<? extends String>) newValue);
            return;
        case DmPackage.DATA_MODEL__ENTITIES:
            getEntities().clear();
            getEntities().addAll((Collection<? extends Entity>) newValue);
            return;
        case DmPackage.DATA_MODEL__RELATIONSHIPS:
            getRelationships().clear();
            getRelationships().addAll((Collection<? extends Relationship>) newValue);
            return;
        case DmPackage.DATA_MODEL__DATA_TYPES:
            getDataTypes().clear();
            getDataTypes().addAll((Collection<? extends DataType>) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case DmPackage.DATA_MODEL__LOCALES:
            getLocales().clear();
            return;
        case DmPackage.DATA_MODEL__ENTITIES:
            getEntities().clear();
            return;
        case DmPackage.DATA_MODEL__RELATIONSHIPS:
            getRelationships().clear();
            return;
        case DmPackage.DATA_MODEL__DATA_TYPES:
            getDataTypes().clear();
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case DmPackage.DATA_MODEL__LOCALES:
            return locales != null && !locales.isEmpty();
        case DmPackage.DATA_MODEL__ENTITIES:
            return entities != null && !entities.isEmpty();
        case DmPackage.DATA_MODEL__RELATIONSHIPS:
            return relationships != null && !relationships.isEmpty();
        case DmPackage.DATA_MODEL__DATA_TYPES:
            return dataTypes != null && !dataTypes.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (locales: ");
        result.append(locales);
        result.append(')');
        return result.toString();
    }

} //DataModelImpl
