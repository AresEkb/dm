/**
 */
package org.example.dm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.example.dm.Attribute;
import org.example.dm.DataModel;
import org.example.dm.DmPackage;
import org.example.dm.Entity;
import org.example.dm.EntityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.dm.impl.EntityImpl#getDataModel <em>Data Model</em>}</li>
 *   <li>{@link org.example.dm.impl.EntityImpl#getGenerals <em>Generals</em>}</li>
 *   <li>{@link org.example.dm.impl.EntityImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.example.dm.impl.EntityImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends NamedElementImpl implements Entity {

    /**
     * The cached value of the '{@link #getGenerals() <em>Generals</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGenerals()
     * @generated
     * @ordered
     */
    protected EList<Entity> generals;

    /**
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected static final EntityKind KIND_EDEFAULT = EntityKind.MASTER_DATA;

    /**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected EntityKind kind = KIND_EDEFAULT;

    /**
     * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributes()
     * @generated
     * @ordered
     */
    protected EList<Attribute> attributes;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EntityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DmPackage.Literals.ENTITY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Attribute> getAttributes() {
        if (attributes == null) {
            attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, DmPackage.ENTITY__ATTRIBUTES);
        }
        return attributes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Entity> getGenerals() {
        if (generals == null) {
            generals = new EObjectResolvingEList<Entity>(Entity.class, this, DmPackage.ENTITY__GENERALS);
        }
        return generals;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DataModel getDataModel() {
        if (eContainerFeatureID() != DmPackage.ENTITY__DATA_MODEL)
            return null;
        return (DataModel) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDataModel(DataModel newDataModel, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newDataModel, DmPackage.ENTITY__DATA_MODEL, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDataModel(DataModel newDataModel) {
        if (newDataModel != eInternalContainer()
                || (eContainerFeatureID() != DmPackage.ENTITY__DATA_MODEL && newDataModel != null)) {
            if (EcoreUtil.isAncestor(this, newDataModel))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newDataModel != null)
                msgs = ((InternalEObject) newDataModel).eInverseAdd(this, DmPackage.DATA_MODEL__ENTITIES,
                        DataModel.class, msgs);
            msgs = basicSetDataModel(newDataModel, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.ENTITY__DATA_MODEL, newDataModel,
                    newDataModel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EntityKind getKind() {
        return kind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKind(EntityKind newKind) {
        EntityKind oldKind = kind;
        kind = newKind == null ? KIND_EDEFAULT : newKind;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.ENTITY__KIND, oldKind, kind));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DmPackage.ENTITY__DATA_MODEL:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetDataModel((DataModel) otherEnd, msgs);
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
        case DmPackage.ENTITY__DATA_MODEL:
            return basicSetDataModel(null, msgs);
        case DmPackage.ENTITY__ATTRIBUTES:
            return ((InternalEList<?>) getAttributes()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
        case DmPackage.ENTITY__DATA_MODEL:
            return eInternalContainer().eInverseRemove(this, DmPackage.DATA_MODEL__ENTITIES, DataModel.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case DmPackage.ENTITY__DATA_MODEL:
            return getDataModel();
        case DmPackage.ENTITY__GENERALS:
            return getGenerals();
        case DmPackage.ENTITY__KIND:
            return getKind();
        case DmPackage.ENTITY__ATTRIBUTES:
            return getAttributes();
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
        case DmPackage.ENTITY__DATA_MODEL:
            setDataModel((DataModel) newValue);
            return;
        case DmPackage.ENTITY__GENERALS:
            getGenerals().clear();
            getGenerals().addAll((Collection<? extends Entity>) newValue);
            return;
        case DmPackage.ENTITY__KIND:
            setKind((EntityKind) newValue);
            return;
        case DmPackage.ENTITY__ATTRIBUTES:
            getAttributes().clear();
            getAttributes().addAll((Collection<? extends Attribute>) newValue);
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
        case DmPackage.ENTITY__DATA_MODEL:
            setDataModel((DataModel) null);
            return;
        case DmPackage.ENTITY__GENERALS:
            getGenerals().clear();
            return;
        case DmPackage.ENTITY__KIND:
            setKind(KIND_EDEFAULT);
            return;
        case DmPackage.ENTITY__ATTRIBUTES:
            getAttributes().clear();
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
        case DmPackage.ENTITY__DATA_MODEL:
            return getDataModel() != null;
        case DmPackage.ENTITY__GENERALS:
            return generals != null && !generals.isEmpty();
        case DmPackage.ENTITY__KIND:
            return kind != KIND_EDEFAULT;
        case DmPackage.ENTITY__ATTRIBUTES:
            return attributes != null && !attributes.isEmpty();
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
        result.append(" (kind: ");
        result.append(kind);
        result.append(')');
        return result.toString();
    }

} //EntityImpl
