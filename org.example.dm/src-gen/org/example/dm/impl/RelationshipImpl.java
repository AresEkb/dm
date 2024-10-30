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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.example.dm.DataModel;
import org.example.dm.DmPackage;
import org.example.dm.Relationship;
import org.example.dm.RelationshipEnd;
import org.example.dm.RelationshipKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.dm.impl.RelationshipImpl#getDataModel <em>Data Model</em>}</li>
 *   <li>{@link org.example.dm.impl.RelationshipImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.example.dm.impl.RelationshipImpl#getEnds <em>Ends</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipImpl extends NamedElementImpl implements Relationship {

    /**
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected static final RelationshipKind KIND_EDEFAULT = RelationshipKind.ASSOCIATION;

    /**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected RelationshipKind kind = KIND_EDEFAULT;

    /**
     * The cached value of the '{@link #getEnds() <em>Ends</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnds()
     * @generated
     * @ordered
     */
    protected EList<RelationshipEnd> ends;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RelationshipImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DmPackage.Literals.RELATIONSHIP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<RelationshipEnd> getEnds() {
        if (ends == null) {
            ends = new EObjectContainmentWithInverseEList<RelationshipEnd>(RelationshipEnd.class, this,
                    DmPackage.RELATIONSHIP__ENDS, DmPackage.RELATIONSHIP_END__RELATIONSHIP);
        }
        return ends;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DataModel getDataModel() {
        if (eContainerFeatureID() != DmPackage.RELATIONSHIP__DATA_MODEL)
            return null;
        return (DataModel) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDataModel(DataModel newDataModel, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newDataModel, DmPackage.RELATIONSHIP__DATA_MODEL, msgs);
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
                || (eContainerFeatureID() != DmPackage.RELATIONSHIP__DATA_MODEL && newDataModel != null)) {
            if (EcoreUtil.isAncestor(this, newDataModel))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newDataModel != null)
                msgs = ((InternalEObject) newDataModel).eInverseAdd(this, DmPackage.DATA_MODEL__RELATIONSHIPS,
                        DataModel.class, msgs);
            msgs = basicSetDataModel(newDataModel, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.RELATIONSHIP__DATA_MODEL, newDataModel,
                    newDataModel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RelationshipKind getKind() {
        return kind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKind(RelationshipKind newKind) {
        RelationshipKind oldKind = kind;
        kind = newKind == null ? KIND_EDEFAULT : newKind;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.RELATIONSHIP__KIND, oldKind, kind));
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
        case DmPackage.RELATIONSHIP__DATA_MODEL:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetDataModel((DataModel) otherEnd, msgs);
        case DmPackage.RELATIONSHIP__ENDS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getEnds()).basicAdd(otherEnd, msgs);
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
        case DmPackage.RELATIONSHIP__DATA_MODEL:
            return basicSetDataModel(null, msgs);
        case DmPackage.RELATIONSHIP__ENDS:
            return ((InternalEList<?>) getEnds()).basicRemove(otherEnd, msgs);
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
        case DmPackage.RELATIONSHIP__DATA_MODEL:
            return eInternalContainer().eInverseRemove(this, DmPackage.DATA_MODEL__RELATIONSHIPS, DataModel.class,
                    msgs);
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
        case DmPackage.RELATIONSHIP__DATA_MODEL:
            return getDataModel();
        case DmPackage.RELATIONSHIP__KIND:
            return getKind();
        case DmPackage.RELATIONSHIP__ENDS:
            return getEnds();
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
        case DmPackage.RELATIONSHIP__DATA_MODEL:
            setDataModel((DataModel) newValue);
            return;
        case DmPackage.RELATIONSHIP__KIND:
            setKind((RelationshipKind) newValue);
            return;
        case DmPackage.RELATIONSHIP__ENDS:
            getEnds().clear();
            getEnds().addAll((Collection<? extends RelationshipEnd>) newValue);
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
        case DmPackage.RELATIONSHIP__DATA_MODEL:
            setDataModel((DataModel) null);
            return;
        case DmPackage.RELATIONSHIP__KIND:
            setKind(KIND_EDEFAULT);
            return;
        case DmPackage.RELATIONSHIP__ENDS:
            getEnds().clear();
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
        case DmPackage.RELATIONSHIP__DATA_MODEL:
            return getDataModel() != null;
        case DmPackage.RELATIONSHIP__KIND:
            return kind != KIND_EDEFAULT;
        case DmPackage.RELATIONSHIP__ENDS:
            return ends != null && !ends.isEmpty();
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

} //RelationshipImpl
