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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.example.rdm.AlternateKey;
import org.example.rdm.Column;
import org.example.rdm.Constraint;
import org.example.rdm.ForeignKey;
import org.example.rdm.Index;
import org.example.rdm.PrimaryKey;
import org.example.rdm.RdmPackage;
import org.example.rdm.Rule;
import org.example.rdm.Schema;
import org.example.rdm.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.rdm.impl.TableImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.example.rdm.impl.TableImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.example.rdm.impl.TableImpl#getPrimaryKey <em>Primary Key</em>}</li>
 *   <li>{@link org.example.rdm.impl.TableImpl#getAlternateKeys <em>Alternate Keys</em>}</li>
 *   <li>{@link org.example.rdm.impl.TableImpl#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link org.example.rdm.impl.TableImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.example.rdm.impl.TableImpl#getIndices <em>Indices</em>}</li>
 *   <li>{@link org.example.rdm.impl.TableImpl#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends NamedElementImpl implements Table {

    /**
     * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColumns()
     * @generated
     * @ordered
     */
    protected EList<Column> columns;

    /**
     * The cached value of the '{@link #getPrimaryKey() <em>Primary Key</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrimaryKey()
     * @generated
     * @ordered
     */
    protected PrimaryKey primaryKey;

    /**
     * The cached value of the '{@link #getAlternateKeys() <em>Alternate Keys</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAlternateKeys()
     * @generated
     * @ordered
     */
    protected EList<AlternateKey> alternateKeys;

    /**
     * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getForeignKeys()
     * @generated
     * @ordered
     */
    protected EList<ForeignKey> foreignKeys;

    /**
     * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConstraints()
     * @generated
     * @ordered
     */
    protected EList<Constraint> constraints;

    /**
     * The cached value of the '{@link #getIndices() <em>Indices</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIndices()
     * @generated
     * @ordered
     */
    protected EList<Index> indices;

    /**
     * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRules()
     * @generated
     * @ordered
     */
    protected EList<Rule> rules;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RdmPackage.Literals.TABLE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Schema getSchema() {
        if (eContainerFeatureID() != RdmPackage.TABLE__SCHEMA)
            return null;
        return (Schema) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSchema(Schema newSchema, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newSchema, RdmPackage.TABLE__SCHEMA, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSchema(Schema newSchema) {
        if (newSchema != eInternalContainer()
                || (eContainerFeatureID() != RdmPackage.TABLE__SCHEMA && newSchema != null)) {
            if (EcoreUtil.isAncestor(this, newSchema))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newSchema != null)
                msgs = ((InternalEObject) newSchema).eInverseAdd(this, RdmPackage.SCHEMA__TABLES, Schema.class, msgs);
            msgs = basicSetSchema(newSchema, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RdmPackage.TABLE__SCHEMA, newSchema, newSchema));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Column> getColumns() {
        if (columns == null) {
            columns = new EObjectContainmentWithInverseEList<Column>(Column.class, this, RdmPackage.TABLE__COLUMNS,
                    RdmPackage.COLUMN__TABLE);
        }
        return columns;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PrimaryKey getPrimaryKey() {
        return primaryKey;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPrimaryKey(PrimaryKey newPrimaryKey, NotificationChain msgs) {
        PrimaryKey oldPrimaryKey = primaryKey;
        primaryKey = newPrimaryKey;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    RdmPackage.TABLE__PRIMARY_KEY, oldPrimaryKey, newPrimaryKey);
            if (msgs == null)
                msgs = notification;
            else
                msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPrimaryKey(PrimaryKey newPrimaryKey) {
        if (newPrimaryKey != primaryKey) {
            NotificationChain msgs = null;
            if (primaryKey != null)
                msgs = ((InternalEObject) primaryKey).eInverseRemove(this,
                        EOPPOSITE_FEATURE_BASE - RdmPackage.TABLE__PRIMARY_KEY, null, msgs);
            if (newPrimaryKey != null)
                msgs = ((InternalEObject) newPrimaryKey).eInverseAdd(this,
                        EOPPOSITE_FEATURE_BASE - RdmPackage.TABLE__PRIMARY_KEY, null, msgs);
            msgs = basicSetPrimaryKey(newPrimaryKey, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RdmPackage.TABLE__PRIMARY_KEY, newPrimaryKey,
                    newPrimaryKey));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<AlternateKey> getAlternateKeys() {
        if (alternateKeys == null) {
            alternateKeys = new EObjectContainmentEList<AlternateKey>(AlternateKey.class, this,
                    RdmPackage.TABLE__ALTERNATE_KEYS);
        }
        return alternateKeys;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<ForeignKey> getForeignKeys() {
        if (foreignKeys == null) {
            foreignKeys = new EObjectContainmentWithInverseEList<ForeignKey>(ForeignKey.class, this,
                    RdmPackage.TABLE__FOREIGN_KEYS, RdmPackage.FOREIGN_KEY__TABLE);
        }
        return foreignKeys;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Constraint> getConstraints() {
        if (constraints == null) {
            constraints = new EObjectContainmentWithInverseEList<Constraint>(Constraint.class, this,
                    RdmPackage.TABLE__CONSTRAINTS, RdmPackage.CONSTRAINT__TABLE);
        }
        return constraints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Index> getIndices() {
        if (indices == null) {
            indices = new EObjectContainmentWithInverseEList<Index>(Index.class, this, RdmPackage.TABLE__INDICES,
                    RdmPackage.INDEX__TABLE);
        }
        return indices;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Rule> getRules() {
        if (rules == null) {
            rules = new EObjectContainmentWithInverseEList<Rule>(Rule.class, this, RdmPackage.TABLE__RULES,
                    RdmPackage.RULE__TABLE);
        }
        return rules;
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
        case RdmPackage.TABLE__SCHEMA:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetSchema((Schema) otherEnd, msgs);
        case RdmPackage.TABLE__COLUMNS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getColumns()).basicAdd(otherEnd, msgs);
        case RdmPackage.TABLE__FOREIGN_KEYS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getForeignKeys()).basicAdd(otherEnd, msgs);
        case RdmPackage.TABLE__CONSTRAINTS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getConstraints()).basicAdd(otherEnd, msgs);
        case RdmPackage.TABLE__INDICES:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getIndices()).basicAdd(otherEnd, msgs);
        case RdmPackage.TABLE__RULES:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getRules()).basicAdd(otherEnd, msgs);
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
        case RdmPackage.TABLE__SCHEMA:
            return basicSetSchema(null, msgs);
        case RdmPackage.TABLE__COLUMNS:
            return ((InternalEList<?>) getColumns()).basicRemove(otherEnd, msgs);
        case RdmPackage.TABLE__PRIMARY_KEY:
            return basicSetPrimaryKey(null, msgs);
        case RdmPackage.TABLE__ALTERNATE_KEYS:
            return ((InternalEList<?>) getAlternateKeys()).basicRemove(otherEnd, msgs);
        case RdmPackage.TABLE__FOREIGN_KEYS:
            return ((InternalEList<?>) getForeignKeys()).basicRemove(otherEnd, msgs);
        case RdmPackage.TABLE__CONSTRAINTS:
            return ((InternalEList<?>) getConstraints()).basicRemove(otherEnd, msgs);
        case RdmPackage.TABLE__INDICES:
            return ((InternalEList<?>) getIndices()).basicRemove(otherEnd, msgs);
        case RdmPackage.TABLE__RULES:
            return ((InternalEList<?>) getRules()).basicRemove(otherEnd, msgs);
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
        case RdmPackage.TABLE__SCHEMA:
            return eInternalContainer().eInverseRemove(this, RdmPackage.SCHEMA__TABLES, Schema.class, msgs);
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
        case RdmPackage.TABLE__SCHEMA:
            return getSchema();
        case RdmPackage.TABLE__COLUMNS:
            return getColumns();
        case RdmPackage.TABLE__PRIMARY_KEY:
            return getPrimaryKey();
        case RdmPackage.TABLE__ALTERNATE_KEYS:
            return getAlternateKeys();
        case RdmPackage.TABLE__FOREIGN_KEYS:
            return getForeignKeys();
        case RdmPackage.TABLE__CONSTRAINTS:
            return getConstraints();
        case RdmPackage.TABLE__INDICES:
            return getIndices();
        case RdmPackage.TABLE__RULES:
            return getRules();
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
        case RdmPackage.TABLE__SCHEMA:
            setSchema((Schema) newValue);
            return;
        case RdmPackage.TABLE__COLUMNS:
            getColumns().clear();
            getColumns().addAll((Collection<? extends Column>) newValue);
            return;
        case RdmPackage.TABLE__PRIMARY_KEY:
            setPrimaryKey((PrimaryKey) newValue);
            return;
        case RdmPackage.TABLE__ALTERNATE_KEYS:
            getAlternateKeys().clear();
            getAlternateKeys().addAll((Collection<? extends AlternateKey>) newValue);
            return;
        case RdmPackage.TABLE__FOREIGN_KEYS:
            getForeignKeys().clear();
            getForeignKeys().addAll((Collection<? extends ForeignKey>) newValue);
            return;
        case RdmPackage.TABLE__CONSTRAINTS:
            getConstraints().clear();
            getConstraints().addAll((Collection<? extends Constraint>) newValue);
            return;
        case RdmPackage.TABLE__INDICES:
            getIndices().clear();
            getIndices().addAll((Collection<? extends Index>) newValue);
            return;
        case RdmPackage.TABLE__RULES:
            getRules().clear();
            getRules().addAll((Collection<? extends Rule>) newValue);
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
        case RdmPackage.TABLE__SCHEMA:
            setSchema((Schema) null);
            return;
        case RdmPackage.TABLE__COLUMNS:
            getColumns().clear();
            return;
        case RdmPackage.TABLE__PRIMARY_KEY:
            setPrimaryKey((PrimaryKey) null);
            return;
        case RdmPackage.TABLE__ALTERNATE_KEYS:
            getAlternateKeys().clear();
            return;
        case RdmPackage.TABLE__FOREIGN_KEYS:
            getForeignKeys().clear();
            return;
        case RdmPackage.TABLE__CONSTRAINTS:
            getConstraints().clear();
            return;
        case RdmPackage.TABLE__INDICES:
            getIndices().clear();
            return;
        case RdmPackage.TABLE__RULES:
            getRules().clear();
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
        case RdmPackage.TABLE__SCHEMA:
            return getSchema() != null;
        case RdmPackage.TABLE__COLUMNS:
            return columns != null && !columns.isEmpty();
        case RdmPackage.TABLE__PRIMARY_KEY:
            return primaryKey != null;
        case RdmPackage.TABLE__ALTERNATE_KEYS:
            return alternateKeys != null && !alternateKeys.isEmpty();
        case RdmPackage.TABLE__FOREIGN_KEYS:
            return foreignKeys != null && !foreignKeys.isEmpty();
        case RdmPackage.TABLE__CONSTRAINTS:
            return constraints != null && !constraints.isEmpty();
        case RdmPackage.TABLE__INDICES:
            return indices != null && !indices.isEmpty();
        case RdmPackage.TABLE__RULES:
            return rules != null && !rules.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //TableImpl
