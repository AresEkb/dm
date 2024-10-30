/**
 */
package org.example.rdm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.example.rdm.Column;
import org.example.rdm.RdmPackage;
import org.example.rdm.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.rdm.impl.ColumnImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.example.rdm.impl.ColumnImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.example.rdm.impl.ColumnImpl#getCollation <em>Collation</em>}</li>
 *   <li>{@link org.example.rdm.impl.ColumnImpl#isNullable <em>Nullable</em>}</li>
 *   <li>{@link org.example.rdm.impl.ColumnImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.example.rdm.impl.ColumnImpl#getStoredGeneratedValue <em>Stored Generated Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnImpl extends NamedElementImpl implements Column {

    /**
     * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataType()
     * @generated
     * @ordered
     */
    protected static final String DATA_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataType()
     * @generated
     * @ordered
     */
    protected String dataType = DATA_TYPE_EDEFAULT;

    /**
     * The default value of the '{@link #getCollation() <em>Collation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCollation()
     * @generated
     * @ordered
     */
    protected static final String COLLATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCollation() <em>Collation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCollation()
     * @generated
     * @ordered
     */
    protected String collation = COLLATION_EDEFAULT;

    /**
     * The default value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isNullable()
     * @generated
     * @ordered
     */
    protected static final boolean NULLABLE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isNullable() <em>Nullable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isNullable()
     * @generated
     * @ordered
     */
    protected boolean nullable = NULLABLE_EDEFAULT;

    /**
     * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultValue()
     * @generated
     * @ordered
     */
    protected static final String DEFAULT_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultValue()
     * @generated
     * @ordered
     */
    protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #getStoredGeneratedValue() <em>Stored Generated Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStoredGeneratedValue()
     * @generated
     * @ordered
     */
    protected static final String STORED_GENERATED_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStoredGeneratedValue() <em>Stored Generated Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStoredGeneratedValue()
     * @generated
     * @ordered
     */
    protected String storedGeneratedValue = STORED_GENERATED_VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ColumnImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RdmPackage.Literals.COLUMN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Table getTable() {
        if (eContainerFeatureID() != RdmPackage.COLUMN__TABLE)
            return null;
        return (Table) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTable(Table newTable, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newTable, RdmPackage.COLUMN__TABLE, msgs);
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
                || (eContainerFeatureID() != RdmPackage.COLUMN__TABLE && newTable != null)) {
            if (EcoreUtil.isAncestor(this, newTable))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newTable != null)
                msgs = ((InternalEObject) newTable).eInverseAdd(this, RdmPackage.TABLE__COLUMNS, Table.class, msgs);
            msgs = basicSetTable(newTable, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RdmPackage.COLUMN__TABLE, newTable, newTable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDataType() {
        return dataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDataType(String newDataType) {
        String oldDataType = dataType;
        dataType = newDataType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RdmPackage.COLUMN__DATA_TYPE, oldDataType, dataType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCollation() {
        return collation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCollation(String newCollation) {
        String oldCollation = collation;
        collation = newCollation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RdmPackage.COLUMN__COLLATION, oldCollation,
                    collation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isNullable() {
        return nullable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNullable(boolean newNullable) {
        boolean oldNullable = nullable;
        nullable = newNullable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RdmPackage.COLUMN__NULLABLE, oldNullable, nullable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDefaultValue(String newDefaultValue) {
        String oldDefaultValue = defaultValue;
        defaultValue = newDefaultValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RdmPackage.COLUMN__DEFAULT_VALUE, oldDefaultValue,
                    defaultValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getStoredGeneratedValue() {
        return storedGeneratedValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStoredGeneratedValue(String newStoredGeneratedValue) {
        String oldStoredGeneratedValue = storedGeneratedValue;
        storedGeneratedValue = newStoredGeneratedValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RdmPackage.COLUMN__STORED_GENERATED_VALUE,
                    oldStoredGeneratedValue, storedGeneratedValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case RdmPackage.COLUMN__TABLE:
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
        case RdmPackage.COLUMN__TABLE:
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
        case RdmPackage.COLUMN__TABLE:
            return eInternalContainer().eInverseRemove(this, RdmPackage.TABLE__COLUMNS, Table.class, msgs);
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
        case RdmPackage.COLUMN__TABLE:
            return getTable();
        case RdmPackage.COLUMN__DATA_TYPE:
            return getDataType();
        case RdmPackage.COLUMN__COLLATION:
            return getCollation();
        case RdmPackage.COLUMN__NULLABLE:
            return isNullable();
        case RdmPackage.COLUMN__DEFAULT_VALUE:
            return getDefaultValue();
        case RdmPackage.COLUMN__STORED_GENERATED_VALUE:
            return getStoredGeneratedValue();
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
        case RdmPackage.COLUMN__TABLE:
            setTable((Table) newValue);
            return;
        case RdmPackage.COLUMN__DATA_TYPE:
            setDataType((String) newValue);
            return;
        case RdmPackage.COLUMN__COLLATION:
            setCollation((String) newValue);
            return;
        case RdmPackage.COLUMN__NULLABLE:
            setNullable((Boolean) newValue);
            return;
        case RdmPackage.COLUMN__DEFAULT_VALUE:
            setDefaultValue((String) newValue);
            return;
        case RdmPackage.COLUMN__STORED_GENERATED_VALUE:
            setStoredGeneratedValue((String) newValue);
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
        case RdmPackage.COLUMN__TABLE:
            setTable((Table) null);
            return;
        case RdmPackage.COLUMN__DATA_TYPE:
            setDataType(DATA_TYPE_EDEFAULT);
            return;
        case RdmPackage.COLUMN__COLLATION:
            setCollation(COLLATION_EDEFAULT);
            return;
        case RdmPackage.COLUMN__NULLABLE:
            setNullable(NULLABLE_EDEFAULT);
            return;
        case RdmPackage.COLUMN__DEFAULT_VALUE:
            setDefaultValue(DEFAULT_VALUE_EDEFAULT);
            return;
        case RdmPackage.COLUMN__STORED_GENERATED_VALUE:
            setStoredGeneratedValue(STORED_GENERATED_VALUE_EDEFAULT);
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
        case RdmPackage.COLUMN__TABLE:
            return getTable() != null;
        case RdmPackage.COLUMN__DATA_TYPE:
            return DATA_TYPE_EDEFAULT == null ? dataType != null : !DATA_TYPE_EDEFAULT.equals(dataType);
        case RdmPackage.COLUMN__COLLATION:
            return COLLATION_EDEFAULT == null ? collation != null : !COLLATION_EDEFAULT.equals(collation);
        case RdmPackage.COLUMN__NULLABLE:
            return nullable != NULLABLE_EDEFAULT;
        case RdmPackage.COLUMN__DEFAULT_VALUE:
            return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
        case RdmPackage.COLUMN__STORED_GENERATED_VALUE:
            return STORED_GENERATED_VALUE_EDEFAULT == null ? storedGeneratedValue != null
                    : !STORED_GENERATED_VALUE_EDEFAULT.equals(storedGeneratedValue);
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
        result.append(" (dataType: ");
        result.append(dataType);
        result.append(", collation: ");
        result.append(collation);
        result.append(", nullable: ");
        result.append(nullable);
        result.append(", defaultValue: ");
        result.append(defaultValue);
        result.append(", storedGeneratedValue: ");
        result.append(storedGeneratedValue);
        result.append(')');
        return result.toString();
    }

} //ColumnImpl
