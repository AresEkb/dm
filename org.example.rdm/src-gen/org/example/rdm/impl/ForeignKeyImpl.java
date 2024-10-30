/**
 */
package org.example.rdm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.example.rdm.CandidateKey;
import org.example.rdm.DeleteAction;
import org.example.rdm.ForeignKey;
import org.example.rdm.RdmPackage;
import org.example.rdm.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.rdm.impl.ForeignKeyImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.example.rdm.impl.ForeignKeyImpl#getReferencedKey <em>Referenced Key</em>}</li>
 *   <li>{@link org.example.rdm.impl.ForeignKeyImpl#getDeleteAction <em>Delete Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForeignKeyImpl extends KeyImpl implements ForeignKey {

    /**
     * The cached value of the '{@link #getReferencedKey() <em>Referenced Key</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferencedKey()
     * @generated
     * @ordered
     */
    protected CandidateKey referencedKey;

    /**
     * The default value of the '{@link #getDeleteAction() <em>Delete Action</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeleteAction()
     * @generated
     * @ordered
     */
    protected static final DeleteAction DELETE_ACTION_EDEFAULT = DeleteAction.NO_ACTION;

    /**
     * The cached value of the '{@link #getDeleteAction() <em>Delete Action</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeleteAction()
     * @generated
     * @ordered
     */
    protected DeleteAction deleteAction = DELETE_ACTION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ForeignKeyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RdmPackage.Literals.FOREIGN_KEY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Table getTable() {
        if (eContainerFeatureID() != RdmPackage.FOREIGN_KEY__TABLE)
            return null;
        return (Table) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTable(Table newTable, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newTable, RdmPackage.FOREIGN_KEY__TABLE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTable(Table newTable) {
        if (newTable != eInternalContainer()
                || (eContainerFeatureID() != RdmPackage.FOREIGN_KEY__TABLE && newTable != null)) {
            if (EcoreUtil.isAncestor(this, newTable))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newTable != null)
                msgs = ((InternalEObject) newTable).eInverseAdd(this, RdmPackage.TABLE__FOREIGN_KEYS, Table.class,
                        msgs);
            msgs = basicSetTable(newTable, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RdmPackage.FOREIGN_KEY__TABLE, newTable, newTable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CandidateKey getReferencedKey() {
        if (referencedKey != null && referencedKey.eIsProxy()) {
            InternalEObject oldReferencedKey = (InternalEObject) referencedKey;
            referencedKey = (CandidateKey) eResolveProxy(oldReferencedKey);
            if (referencedKey != oldReferencedKey) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdmPackage.FOREIGN_KEY__REFERENCED_KEY,
                            oldReferencedKey, referencedKey));
            }
        }
        return referencedKey;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CandidateKey basicGetReferencedKey() {
        return referencedKey;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReferencedKey(CandidateKey newReferencedKey) {
        CandidateKey oldReferencedKey = referencedKey;
        referencedKey = newReferencedKey;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RdmPackage.FOREIGN_KEY__REFERENCED_KEY,
                    oldReferencedKey, referencedKey));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DeleteAction getDeleteAction() {
        return deleteAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDeleteAction(DeleteAction newDeleteAction) {
        DeleteAction oldDeleteAction = deleteAction;
        deleteAction = newDeleteAction == null ? DELETE_ACTION_EDEFAULT : newDeleteAction;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RdmPackage.FOREIGN_KEY__DELETE_ACTION,
                    oldDeleteAction, deleteAction));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case RdmPackage.FOREIGN_KEY__TABLE:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetTable((Table) otherEnd, msgs);
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
        case RdmPackage.FOREIGN_KEY__TABLE:
            return basicSetTable(null, msgs);
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
        case RdmPackage.FOREIGN_KEY__TABLE:
            return eInternalContainer().eInverseRemove(this, RdmPackage.TABLE__FOREIGN_KEYS, Table.class, msgs);
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
        case RdmPackage.FOREIGN_KEY__TABLE:
            return getTable();
        case RdmPackage.FOREIGN_KEY__REFERENCED_KEY:
            if (resolve)
                return getReferencedKey();
            return basicGetReferencedKey();
        case RdmPackage.FOREIGN_KEY__DELETE_ACTION:
            return getDeleteAction();
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
        case RdmPackage.FOREIGN_KEY__TABLE:
            setTable((Table) newValue);
            return;
        case RdmPackage.FOREIGN_KEY__REFERENCED_KEY:
            setReferencedKey((CandidateKey) newValue);
            return;
        case RdmPackage.FOREIGN_KEY__DELETE_ACTION:
            setDeleteAction((DeleteAction) newValue);
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
        case RdmPackage.FOREIGN_KEY__TABLE:
            setTable((Table) null);
            return;
        case RdmPackage.FOREIGN_KEY__REFERENCED_KEY:
            setReferencedKey((CandidateKey) null);
            return;
        case RdmPackage.FOREIGN_KEY__DELETE_ACTION:
            setDeleteAction(DELETE_ACTION_EDEFAULT);
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
        case RdmPackage.FOREIGN_KEY__TABLE:
            return getTable() != null;
        case RdmPackage.FOREIGN_KEY__REFERENCED_KEY:
            return referencedKey != null;
        case RdmPackage.FOREIGN_KEY__DELETE_ACTION:
            return deleteAction != DELETE_ACTION_EDEFAULT;
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
        result.append(" (deleteAction: ");
        result.append(deleteAction);
        result.append(')');
        return result.toString();
    }

} //ForeignKeyImpl
