/**
 */
package org.example.dm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.example.dm.DataModel;
import org.example.dm.DataType;
import org.example.dm.DmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.dm.impl.DataTypeImpl#getDataModel <em>Data Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DataTypeImpl extends NamedElementImpl implements DataType {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DmPackage.Literals.DATA_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DataModel getDataModel() {
        if (eContainerFeatureID() != DmPackage.DATA_TYPE__DATA_MODEL)
            return null;
        return (DataModel) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDataModel(DataModel newDataModel, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newDataModel, DmPackage.DATA_TYPE__DATA_MODEL, msgs);
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
                || (eContainerFeatureID() != DmPackage.DATA_TYPE__DATA_MODEL && newDataModel != null)) {
            if (EcoreUtil.isAncestor(this, newDataModel))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newDataModel != null)
                msgs = ((InternalEObject) newDataModel).eInverseAdd(this, DmPackage.DATA_MODEL__DATA_TYPES,
                        DataModel.class, msgs);
            msgs = basicSetDataModel(newDataModel, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.DATA_TYPE__DATA_MODEL, newDataModel,
                    newDataModel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DmPackage.DATA_TYPE__DATA_MODEL:
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
        case DmPackage.DATA_TYPE__DATA_MODEL:
            return basicSetDataModel(null, msgs);
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
        case DmPackage.DATA_TYPE__DATA_MODEL:
            return eInternalContainer().eInverseRemove(this, DmPackage.DATA_MODEL__DATA_TYPES, DataModel.class, msgs);
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
        case DmPackage.DATA_TYPE__DATA_MODEL:
            return getDataModel();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case DmPackage.DATA_TYPE__DATA_MODEL:
            setDataModel((DataModel) newValue);
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
        case DmPackage.DATA_TYPE__DATA_MODEL:
            setDataModel((DataModel) null);
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
        case DmPackage.DATA_TYPE__DATA_MODEL:
            return getDataModel() != null;
        }
        return super.eIsSet(featureID);
    }

} //DataTypeImpl
