/**
 */
package org.example.rdm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.example.rdm.Index;
import org.example.rdm.RdmPackage;
import org.example.rdm.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.rdm.impl.IndexImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.example.rdm.impl.IndexImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link org.example.rdm.impl.IndexImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.example.rdm.impl.IndexImpl#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndexImpl extends NamedElementImpl implements Index {

    /**
     * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isUnique()
     * @generated
     * @ordered
     */
    protected static final boolean UNIQUE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isUnique()
     * @generated
     * @ordered
     */
    protected boolean unique = UNIQUE_EDEFAULT;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExpressions()
     * @generated
     * @ordered
     */
    protected EList<String> expressions;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IndexImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RdmPackage.Literals.INDEX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Table getTable() {
        if (eContainerFeatureID() != RdmPackage.INDEX__TABLE)
            return null;
        return (Table) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTable(Table newTable, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newTable, RdmPackage.INDEX__TABLE, msgs);
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
                || (eContainerFeatureID() != RdmPackage.INDEX__TABLE && newTable != null)) {
            if (EcoreUtil.isAncestor(this, newTable))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newTable != null)
                msgs = ((InternalEObject) newTable).eInverseAdd(this, RdmPackage.TABLE__INDICES, Table.class, msgs);
            msgs = basicSetTable(newTable, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RdmPackage.INDEX__TABLE, newTable, newTable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isUnique() {
        return unique;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUnique(boolean newUnique) {
        boolean oldUnique = unique;
        unique = newUnique;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RdmPackage.INDEX__UNIQUE, oldUnique, unique));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType(String newType) {
        String oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RdmPackage.INDEX__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<String> getExpressions() {
        if (expressions == null) {
            expressions = new EDataTypeUniqueEList<String>(String.class, this, RdmPackage.INDEX__EXPRESSIONS);
        }
        return expressions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case RdmPackage.INDEX__TABLE:
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
        case RdmPackage.INDEX__TABLE:
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
        case RdmPackage.INDEX__TABLE:
            return eInternalContainer().eInverseRemove(this, RdmPackage.TABLE__INDICES, Table.class, msgs);
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
        case RdmPackage.INDEX__TABLE:
            return getTable();
        case RdmPackage.INDEX__UNIQUE:
            return isUnique();
        case RdmPackage.INDEX__TYPE:
            return getType();
        case RdmPackage.INDEX__EXPRESSIONS:
            return getExpressions();
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
        case RdmPackage.INDEX__TABLE:
            setTable((Table) newValue);
            return;
        case RdmPackage.INDEX__UNIQUE:
            setUnique((Boolean) newValue);
            return;
        case RdmPackage.INDEX__TYPE:
            setType((String) newValue);
            return;
        case RdmPackage.INDEX__EXPRESSIONS:
            getExpressions().clear();
            getExpressions().addAll((Collection<? extends String>) newValue);
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
        case RdmPackage.INDEX__TABLE:
            setTable((Table) null);
            return;
        case RdmPackage.INDEX__UNIQUE:
            setUnique(UNIQUE_EDEFAULT);
            return;
        case RdmPackage.INDEX__TYPE:
            setType(TYPE_EDEFAULT);
            return;
        case RdmPackage.INDEX__EXPRESSIONS:
            getExpressions().clear();
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
        case RdmPackage.INDEX__TABLE:
            return getTable() != null;
        case RdmPackage.INDEX__UNIQUE:
            return unique != UNIQUE_EDEFAULT;
        case RdmPackage.INDEX__TYPE:
            return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
        case RdmPackage.INDEX__EXPRESSIONS:
            return expressions != null && !expressions.isEmpty();
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
        result.append(" (unique: ");
        result.append(unique);
        result.append(", type: ");
        result.append(type);
        result.append(", expressions: ");
        result.append(expressions);
        result.append(')');
        return result.toString();
    }

} //IndexImpl
