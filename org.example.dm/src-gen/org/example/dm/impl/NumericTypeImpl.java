/**
 */
package org.example.dm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.example.dm.DmPackage;
import org.example.dm.NumericType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numeric Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.dm.impl.NumericTypeImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.example.dm.impl.NumericTypeImpl#getTotalDigits <em>Total Digits</em>}</li>
 *   <li>{@link org.example.dm.impl.NumericTypeImpl#getFractionDigits <em>Fraction Digits</em>}</li>
 *   <li>{@link org.example.dm.impl.NumericTypeImpl#getMinInclusive <em>Min Inclusive</em>}</li>
 *   <li>{@link org.example.dm.impl.NumericTypeImpl#getMinExclusive <em>Min Exclusive</em>}</li>
 *   <li>{@link org.example.dm.impl.NumericTypeImpl#getMaxInclusive <em>Max Inclusive</em>}</li>
 *   <li>{@link org.example.dm.impl.NumericTypeImpl#getMaxExclusive <em>Max Exclusive</em>}</li>
 *   <li>{@link org.example.dm.impl.NumericTypeImpl#getMeasurementUnit <em>Measurement Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumericTypeImpl extends DataTypeImpl implements NumericType {

    /**
     * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSize()
     * @generated
     * @ordered
     */
    protected static final Short SIZE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSize()
     * @generated
     * @ordered
     */
    protected Short size = SIZE_EDEFAULT;

    /**
     * The default value of the '{@link #getTotalDigits() <em>Total Digits</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTotalDigits()
     * @generated
     * @ordered
     */
    protected static final Short TOTAL_DIGITS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTotalDigits() <em>Total Digits</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTotalDigits()
     * @generated
     * @ordered
     */
    protected Short totalDigits = TOTAL_DIGITS_EDEFAULT;

    /**
     * The default value of the '{@link #getFractionDigits() <em>Fraction Digits</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFractionDigits()
     * @generated
     * @ordered
     */
    protected static final Short FRACTION_DIGITS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFractionDigits() <em>Fraction Digits</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFractionDigits()
     * @generated
     * @ordered
     */
    protected Short fractionDigits = FRACTION_DIGITS_EDEFAULT;

    /**
     * The default value of the '{@link #getMinInclusive() <em>Min Inclusive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinInclusive()
     * @generated
     * @ordered
     */
    protected static final Double MIN_INCLUSIVE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinInclusive() <em>Min Inclusive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinInclusive()
     * @generated
     * @ordered
     */
    protected Double minInclusive = MIN_INCLUSIVE_EDEFAULT;

    /**
     * The default value of the '{@link #getMinExclusive() <em>Min Exclusive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinExclusive()
     * @generated
     * @ordered
     */
    protected static final Double MIN_EXCLUSIVE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinExclusive() <em>Min Exclusive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinExclusive()
     * @generated
     * @ordered
     */
    protected Double minExclusive = MIN_EXCLUSIVE_EDEFAULT;

    /**
     * The default value of the '{@link #getMaxInclusive() <em>Max Inclusive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxInclusive()
     * @generated
     * @ordered
     */
    protected static final Double MAX_INCLUSIVE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxInclusive() <em>Max Inclusive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxInclusive()
     * @generated
     * @ordered
     */
    protected Double maxInclusive = MAX_INCLUSIVE_EDEFAULT;

    /**
     * The default value of the '{@link #getMaxExclusive() <em>Max Exclusive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxExclusive()
     * @generated
     * @ordered
     */
    protected static final Double MAX_EXCLUSIVE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxExclusive() <em>Max Exclusive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxExclusive()
     * @generated
     * @ordered
     */
    protected Double maxExclusive = MAX_EXCLUSIVE_EDEFAULT;

    /**
     * The default value of the '{@link #getMeasurementUnit() <em>Measurement Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasurementUnit()
     * @generated
     * @ordered
     */
    protected static final String MEASUREMENT_UNIT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMeasurementUnit() <em>Measurement Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasurementUnit()
     * @generated
     * @ordered
     */
    protected String measurementUnit = MEASUREMENT_UNIT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NumericTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DmPackage.Literals.NUMERIC_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Short getSize() {
        return size;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSize(Short newSize) {
        Short oldSize = size;
        size = newSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.NUMERIC_TYPE__SIZE, oldSize, size));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getMinInclusive() {
        return minInclusive;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinInclusive(Double newMinInclusive) {
        Double oldMinInclusive = minInclusive;
        minInclusive = newMinInclusive;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.NUMERIC_TYPE__MIN_INCLUSIVE,
                    oldMinInclusive, minInclusive));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getMinExclusive() {
        return minExclusive;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinExclusive(Double newMinExclusive) {
        Double oldMinExclusive = minExclusive;
        minExclusive = newMinExclusive;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.NUMERIC_TYPE__MIN_EXCLUSIVE,
                    oldMinExclusive, minExclusive));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getMaxInclusive() {
        return maxInclusive;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxInclusive(Double newMaxInclusive) {
        Double oldMaxInclusive = maxInclusive;
        maxInclusive = newMaxInclusive;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.NUMERIC_TYPE__MAX_INCLUSIVE,
                    oldMaxInclusive, maxInclusive));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getMaxExclusive() {
        return maxExclusive;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxExclusive(Double newMaxExclusive) {
        Double oldMaxExclusive = maxExclusive;
        maxExclusive = newMaxExclusive;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.NUMERIC_TYPE__MAX_EXCLUSIVE,
                    oldMaxExclusive, maxExclusive));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Short getTotalDigits() {
        return totalDigits;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTotalDigits(Short newTotalDigits) {
        Short oldTotalDigits = totalDigits;
        totalDigits = newTotalDigits;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.NUMERIC_TYPE__TOTAL_DIGITS, oldTotalDigits,
                    totalDigits));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Short getFractionDigits() {
        return fractionDigits;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFractionDigits(Short newFractionDigits) {
        Short oldFractionDigits = fractionDigits;
        fractionDigits = newFractionDigits;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.NUMERIC_TYPE__FRACTION_DIGITS,
                    oldFractionDigits, fractionDigits));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getMeasurementUnit() {
        return measurementUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMeasurementUnit(String newMeasurementUnit) {
        String oldMeasurementUnit = measurementUnit;
        measurementUnit = newMeasurementUnit;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.NUMERIC_TYPE__MEASUREMENT_UNIT,
                    oldMeasurementUnit, measurementUnit));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case DmPackage.NUMERIC_TYPE__SIZE:
            return getSize();
        case DmPackage.NUMERIC_TYPE__TOTAL_DIGITS:
            return getTotalDigits();
        case DmPackage.NUMERIC_TYPE__FRACTION_DIGITS:
            return getFractionDigits();
        case DmPackage.NUMERIC_TYPE__MIN_INCLUSIVE:
            return getMinInclusive();
        case DmPackage.NUMERIC_TYPE__MIN_EXCLUSIVE:
            return getMinExclusive();
        case DmPackage.NUMERIC_TYPE__MAX_INCLUSIVE:
            return getMaxInclusive();
        case DmPackage.NUMERIC_TYPE__MAX_EXCLUSIVE:
            return getMaxExclusive();
        case DmPackage.NUMERIC_TYPE__MEASUREMENT_UNIT:
            return getMeasurementUnit();
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
        case DmPackage.NUMERIC_TYPE__SIZE:
            setSize((Short) newValue);
            return;
        case DmPackage.NUMERIC_TYPE__TOTAL_DIGITS:
            setTotalDigits((Short) newValue);
            return;
        case DmPackage.NUMERIC_TYPE__FRACTION_DIGITS:
            setFractionDigits((Short) newValue);
            return;
        case DmPackage.NUMERIC_TYPE__MIN_INCLUSIVE:
            setMinInclusive((Double) newValue);
            return;
        case DmPackage.NUMERIC_TYPE__MIN_EXCLUSIVE:
            setMinExclusive((Double) newValue);
            return;
        case DmPackage.NUMERIC_TYPE__MAX_INCLUSIVE:
            setMaxInclusive((Double) newValue);
            return;
        case DmPackage.NUMERIC_TYPE__MAX_EXCLUSIVE:
            setMaxExclusive((Double) newValue);
            return;
        case DmPackage.NUMERIC_TYPE__MEASUREMENT_UNIT:
            setMeasurementUnit((String) newValue);
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
        case DmPackage.NUMERIC_TYPE__SIZE:
            setSize(SIZE_EDEFAULT);
            return;
        case DmPackage.NUMERIC_TYPE__TOTAL_DIGITS:
            setTotalDigits(TOTAL_DIGITS_EDEFAULT);
            return;
        case DmPackage.NUMERIC_TYPE__FRACTION_DIGITS:
            setFractionDigits(FRACTION_DIGITS_EDEFAULT);
            return;
        case DmPackage.NUMERIC_TYPE__MIN_INCLUSIVE:
            setMinInclusive(MIN_INCLUSIVE_EDEFAULT);
            return;
        case DmPackage.NUMERIC_TYPE__MIN_EXCLUSIVE:
            setMinExclusive(MIN_EXCLUSIVE_EDEFAULT);
            return;
        case DmPackage.NUMERIC_TYPE__MAX_INCLUSIVE:
            setMaxInclusive(MAX_INCLUSIVE_EDEFAULT);
            return;
        case DmPackage.NUMERIC_TYPE__MAX_EXCLUSIVE:
            setMaxExclusive(MAX_EXCLUSIVE_EDEFAULT);
            return;
        case DmPackage.NUMERIC_TYPE__MEASUREMENT_UNIT:
            setMeasurementUnit(MEASUREMENT_UNIT_EDEFAULT);
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
        case DmPackage.NUMERIC_TYPE__SIZE:
            return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
        case DmPackage.NUMERIC_TYPE__TOTAL_DIGITS:
            return TOTAL_DIGITS_EDEFAULT == null ? totalDigits != null : !TOTAL_DIGITS_EDEFAULT.equals(totalDigits);
        case DmPackage.NUMERIC_TYPE__FRACTION_DIGITS:
            return FRACTION_DIGITS_EDEFAULT == null ? fractionDigits != null
                    : !FRACTION_DIGITS_EDEFAULT.equals(fractionDigits);
        case DmPackage.NUMERIC_TYPE__MIN_INCLUSIVE:
            return MIN_INCLUSIVE_EDEFAULT == null ? minInclusive != null : !MIN_INCLUSIVE_EDEFAULT.equals(minInclusive);
        case DmPackage.NUMERIC_TYPE__MIN_EXCLUSIVE:
            return MIN_EXCLUSIVE_EDEFAULT == null ? minExclusive != null : !MIN_EXCLUSIVE_EDEFAULT.equals(minExclusive);
        case DmPackage.NUMERIC_TYPE__MAX_INCLUSIVE:
            return MAX_INCLUSIVE_EDEFAULT == null ? maxInclusive != null : !MAX_INCLUSIVE_EDEFAULT.equals(maxInclusive);
        case DmPackage.NUMERIC_TYPE__MAX_EXCLUSIVE:
            return MAX_EXCLUSIVE_EDEFAULT == null ? maxExclusive != null : !MAX_EXCLUSIVE_EDEFAULT.equals(maxExclusive);
        case DmPackage.NUMERIC_TYPE__MEASUREMENT_UNIT:
            return MEASUREMENT_UNIT_EDEFAULT == null ? measurementUnit != null
                    : !MEASUREMENT_UNIT_EDEFAULT.equals(measurementUnit);
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
        result.append(" (size: ");
        result.append(size);
        result.append(", totalDigits: ");
        result.append(totalDigits);
        result.append(", fractionDigits: ");
        result.append(fractionDigits);
        result.append(", minInclusive: ");
        result.append(minInclusive);
        result.append(", minExclusive: ");
        result.append(minExclusive);
        result.append(", maxInclusive: ");
        result.append(maxInclusive);
        result.append(", maxExclusive: ");
        result.append(maxExclusive);
        result.append(", measurementUnit: ");
        result.append(measurementUnit);
        result.append(')');
        return result.toString();
    }

} //NumericTypeImpl
