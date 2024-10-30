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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.example.rdm.Database;
import org.example.rdm.RdmPackage;
import org.example.rdm.Schema;
import org.example.rdm.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.rdm.impl.SchemaImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.example.rdm.impl.SchemaImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link org.example.rdm.impl.SchemaImpl#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaImpl extends NamedElementImpl implements Schema {

    /**
     * The cached value of the '{@link #getTables() <em>Tables</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTables()
     * @generated
     * @ordered
     */
    protected EList<Table> tables;

    /**
     * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTypes()
     * @generated
     * @ordered
     */
    protected EList<org.example.rdm.Enum> types;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SchemaImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RdmPackage.Literals.SCHEMA;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Database getDatabase() {
        if (eContainerFeatureID() != RdmPackage.SCHEMA__DATABASE)
            return null;
        return (Database) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDatabase(Database newDatabase, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newDatabase, RdmPackage.SCHEMA__DATABASE, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDatabase(Database newDatabase) {
        if (newDatabase != eInternalContainer()
                || (eContainerFeatureID() != RdmPackage.SCHEMA__DATABASE && newDatabase != null)) {
            if (EcoreUtil.isAncestor(this, newDatabase))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newDatabase != null)
                msgs = ((InternalEObject) newDatabase).eInverseAdd(this, RdmPackage.DATABASE__SCHEMAS, Database.class,
                        msgs);
            msgs = basicSetDatabase(newDatabase, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RdmPackage.SCHEMA__DATABASE, newDatabase,
                    newDatabase));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Table> getTables() {
        if (tables == null) {
            tables = new EObjectContainmentWithInverseEList<Table>(Table.class, this, RdmPackage.SCHEMA__TABLES,
                    RdmPackage.TABLE__SCHEMA);
        }
        return tables;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<org.example.rdm.Enum> getTypes() {
        if (types == null) {
            types = new EObjectContainmentWithInverseEList<org.example.rdm.Enum>(org.example.rdm.Enum.class, this,
                    RdmPackage.SCHEMA__TYPES, RdmPackage.ENUM__SCHEMA);
        }
        return types;
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
        case RdmPackage.SCHEMA__DATABASE:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetDatabase((Database) otherEnd, msgs);
        case RdmPackage.SCHEMA__TABLES:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getTables()).basicAdd(otherEnd, msgs);
        case RdmPackage.SCHEMA__TYPES:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getTypes()).basicAdd(otherEnd, msgs);
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
        case RdmPackage.SCHEMA__DATABASE:
            return basicSetDatabase(null, msgs);
        case RdmPackage.SCHEMA__TABLES:
            return ((InternalEList<?>) getTables()).basicRemove(otherEnd, msgs);
        case RdmPackage.SCHEMA__TYPES:
            return ((InternalEList<?>) getTypes()).basicRemove(otherEnd, msgs);
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
        case RdmPackage.SCHEMA__DATABASE:
            return eInternalContainer().eInverseRemove(this, RdmPackage.DATABASE__SCHEMAS, Database.class, msgs);
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
        case RdmPackage.SCHEMA__DATABASE:
            return getDatabase();
        case RdmPackage.SCHEMA__TABLES:
            return getTables();
        case RdmPackage.SCHEMA__TYPES:
            return getTypes();
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
        case RdmPackage.SCHEMA__DATABASE:
            setDatabase((Database) newValue);
            return;
        case RdmPackage.SCHEMA__TABLES:
            getTables().clear();
            getTables().addAll((Collection<? extends Table>) newValue);
            return;
        case RdmPackage.SCHEMA__TYPES:
            getTypes().clear();
            getTypes().addAll((Collection<? extends org.example.rdm.Enum>) newValue);
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
        case RdmPackage.SCHEMA__DATABASE:
            setDatabase((Database) null);
            return;
        case RdmPackage.SCHEMA__TABLES:
            getTables().clear();
            return;
        case RdmPackage.SCHEMA__TYPES:
            getTypes().clear();
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
        case RdmPackage.SCHEMA__DATABASE:
            return getDatabase() != null;
        case RdmPackage.SCHEMA__TABLES:
            return tables != null && !tables.isEmpty();
        case RdmPackage.SCHEMA__TYPES:
            return types != null && !types.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //SchemaImpl
