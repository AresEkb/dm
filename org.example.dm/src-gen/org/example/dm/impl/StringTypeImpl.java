/**
 */
package org.example.dm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.example.dm.DmPackage;
import org.example.dm.StringType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.dm.impl.StringTypeImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.example.dm.impl.StringTypeImpl#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link org.example.dm.impl.StringTypeImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.example.dm.impl.StringTypeImpl#getPattern <em>Pattern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringTypeImpl extends DataTypeImpl implements StringType {

    /**
     * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLength()
     * @generated
     * @ordered
     */
    protected static final Integer LENGTH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLength()
     * @generated
     * @ordered
     */
    protected Integer length = LENGTH_EDEFAULT;

    /**
     * The default value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinLength()
     * @generated
     * @ordered
     */
    protected static final Integer MIN_LENGTH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinLength()
     * @generated
     * @ordered
     */
    protected Integer minLength = MIN_LENGTH_EDEFAULT;

    /**
     * The default value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxLength()
     * @generated
     * @ordered
     */
    protected static final Integer MAX_LENGTH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxLength()
     * @generated
     * @ordered
     */
    protected Integer maxLength = MAX_LENGTH_EDEFAULT;

    /**
     * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPattern()
     * @generated
     * @ordered
     */
    protected static final String PATTERN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPattern()
     * @generated
     * @ordered
     */
    protected String pattern = PATTERN_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StringTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DmPackage.Literals.STRING_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getLength() {
        return length;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLength(Integer newLength) {
        Integer oldLength = length;
        length = newLength;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.STRING_TYPE__LENGTH, oldLength, length));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getMinLength() {
        return minLength;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinLength(Integer newMinLength) {
        Integer oldMinLength = minLength;
        minLength = newMinLength;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.STRING_TYPE__MIN_LENGTH, oldMinLength,
                    minLength));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getMaxLength() {
        return maxLength;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxLength(Integer newMaxLength) {
        Integer oldMaxLength = maxLength;
        maxLength = newMaxLength;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.STRING_TYPE__MAX_LENGTH, oldMaxLength,
                    maxLength));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getPattern() {
        return pattern;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPattern(String newPattern) {
        String oldPattern = pattern;
        pattern = newPattern;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.STRING_TYPE__PATTERN, oldPattern, pattern));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case DmPackage.STRING_TYPE__LENGTH:
            return getLength();
        case DmPackage.STRING_TYPE__MIN_LENGTH:
            return getMinLength();
        case DmPackage.STRING_TYPE__MAX_LENGTH:
            return getMaxLength();
        case DmPackage.STRING_TYPE__PATTERN:
            return getPattern();
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
        case DmPackage.STRING_TYPE__LENGTH:
            setLength((Integer) newValue);
            return;
        case DmPackage.STRING_TYPE__MIN_LENGTH:
            setMinLength((Integer) newValue);
            return;
        case DmPackage.STRING_TYPE__MAX_LENGTH:
            setMaxLength((Integer) newValue);
            return;
        case DmPackage.STRING_TYPE__PATTERN:
            setPattern((String) newValue);
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
        case DmPackage.STRING_TYPE__LENGTH:
            setLength(LENGTH_EDEFAULT);
            return;
        case DmPackage.STRING_TYPE__MIN_LENGTH:
            setMinLength(MIN_LENGTH_EDEFAULT);
            return;
        case DmPackage.STRING_TYPE__MAX_LENGTH:
            setMaxLength(MAX_LENGTH_EDEFAULT);
            return;
        case DmPackage.STRING_TYPE__PATTERN:
            setPattern(PATTERN_EDEFAULT);
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
        case DmPackage.STRING_TYPE__LENGTH:
            return LENGTH_EDEFAULT == null ? length != null : !LENGTH_EDEFAULT.equals(length);
        case DmPackage.STRING_TYPE__MIN_LENGTH:
            return MIN_LENGTH_EDEFAULT == null ? minLength != null : !MIN_LENGTH_EDEFAULT.equals(minLength);
        case DmPackage.STRING_TYPE__MAX_LENGTH:
            return MAX_LENGTH_EDEFAULT == null ? maxLength != null : !MAX_LENGTH_EDEFAULT.equals(maxLength);
        case DmPackage.STRING_TYPE__PATTERN:
            return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
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
        result.append(" (length: ");
        result.append(length);
        result.append(", minLength: ");
        result.append(minLength);
        result.append(", maxLength: ");
        result.append(maxLength);
        result.append(", pattern: ");
        result.append(pattern);
        result.append(')');
        return result.toString();
    }

} //StringTypeImpl
