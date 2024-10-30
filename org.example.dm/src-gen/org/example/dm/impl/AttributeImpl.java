/**
 */
package org.example.dm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.example.dm.Attribute;
import org.example.dm.DataType;
import org.example.dm.DmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.dm.impl.AttributeImpl#isIdentity <em>Identity</em>}</li>
 *   <li>{@link org.example.dm.impl.AttributeImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.example.dm.impl.AttributeImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.example.dm.impl.AttributeImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.example.dm.impl.AttributeImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends NamedElementImpl implements Attribute {

    /**
     * The default value of the '{@link #isIdentity() <em>Identity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIdentity()
     * @generated
     * @ordered
     */
    protected static final boolean IDENTITY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIdentity() <em>Identity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIdentity()
     * @generated
     * @ordered
     */
    protected boolean identity = IDENTITY_EDEFAULT;

    /**
     * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDataType()
     * @generated
     * @ordered
     */
    protected DataType dataType;

    /**
     * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLower()
     * @generated
     * @ordered
     */
    protected static final int LOWER_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLower()
     * @generated
     * @ordered
     */
    protected int lower = LOWER_EDEFAULT;

    /**
     * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpper()
     * @generated
     * @ordered
     */
    protected static final int UPPER_EDEFAULT = 1;

    /**
     * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpper()
     * @generated
     * @ordered
     */
    protected int upper = UPPER_EDEFAULT;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttributeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DmPackage.Literals.ATTRIBUTE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isIdentity() {
        return identity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIdentity(boolean newIdentity) {
        boolean oldIdentity = identity;
        identity = newIdentity;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.ATTRIBUTE__IDENTITY, oldIdentity,
                    identity));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DataType getDataType() {
        if (dataType != null && dataType.eIsProxy()) {
            InternalEObject oldDataType = (InternalEObject) dataType;
            dataType = (DataType) eResolveProxy(oldDataType);
            if (dataType != oldDataType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DmPackage.ATTRIBUTE__DATA_TYPE,
                            oldDataType, dataType));
            }
        }
        return dataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataType basicGetDataType() {
        return dataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDataType(DataType newDataType) {
        DataType oldDataType = dataType;
        dataType = newDataType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.ATTRIBUTE__DATA_TYPE, oldDataType,
                    dataType));
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
            eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.ATTRIBUTE__DEFAULT_VALUE, oldDefaultValue,
                    defaultValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getUpper() {
        return upper;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUpper(int newUpper) {
        int oldUpper = upper;
        upper = newUpper;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.ATTRIBUTE__UPPER, oldUpper, upper));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getLower() {
        return lower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLower(int newLower) {
        int oldLower = lower;
        lower = newLower;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.ATTRIBUTE__LOWER, oldLower, lower));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case DmPackage.ATTRIBUTE__IDENTITY:
            return isIdentity();
        case DmPackage.ATTRIBUTE__DATA_TYPE:
            if (resolve)
                return getDataType();
            return basicGetDataType();
        case DmPackage.ATTRIBUTE__LOWER:
            return getLower();
        case DmPackage.ATTRIBUTE__UPPER:
            return getUpper();
        case DmPackage.ATTRIBUTE__DEFAULT_VALUE:
            return getDefaultValue();
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
        case DmPackage.ATTRIBUTE__IDENTITY:
            setIdentity((Boolean) newValue);
            return;
        case DmPackage.ATTRIBUTE__DATA_TYPE:
            setDataType((DataType) newValue);
            return;
        case DmPackage.ATTRIBUTE__LOWER:
            setLower((Integer) newValue);
            return;
        case DmPackage.ATTRIBUTE__UPPER:
            setUpper((Integer) newValue);
            return;
        case DmPackage.ATTRIBUTE__DEFAULT_VALUE:
            setDefaultValue((String) newValue);
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
        case DmPackage.ATTRIBUTE__IDENTITY:
            setIdentity(IDENTITY_EDEFAULT);
            return;
        case DmPackage.ATTRIBUTE__DATA_TYPE:
            setDataType((DataType) null);
            return;
        case DmPackage.ATTRIBUTE__LOWER:
            setLower(LOWER_EDEFAULT);
            return;
        case DmPackage.ATTRIBUTE__UPPER:
            setUpper(UPPER_EDEFAULT);
            return;
        case DmPackage.ATTRIBUTE__DEFAULT_VALUE:
            setDefaultValue(DEFAULT_VALUE_EDEFAULT);
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
        case DmPackage.ATTRIBUTE__IDENTITY:
            return identity != IDENTITY_EDEFAULT;
        case DmPackage.ATTRIBUTE__DATA_TYPE:
            return dataType != null;
        case DmPackage.ATTRIBUTE__LOWER:
            return lower != LOWER_EDEFAULT;
        case DmPackage.ATTRIBUTE__UPPER:
            return upper != UPPER_EDEFAULT;
        case DmPackage.ATTRIBUTE__DEFAULT_VALUE:
            return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
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
        result.append(" (identity: ");
        result.append(identity);
        result.append(", lower: ");
        result.append(lower);
        result.append(", upper: ");
        result.append(upper);
        result.append(", defaultValue: ");
        result.append(defaultValue);
        result.append(')');
        return result.toString();
    }

} //AttributeImpl
