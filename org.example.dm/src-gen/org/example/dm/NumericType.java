/**
 */
package org.example.dm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.dm.NumericType#getSize <em>Size</em>}</li>
 *   <li>{@link org.example.dm.NumericType#getTotalDigits <em>Total Digits</em>}</li>
 *   <li>{@link org.example.dm.NumericType#getFractionDigits <em>Fraction Digits</em>}</li>
 *   <li>{@link org.example.dm.NumericType#getMinInclusive <em>Min Inclusive</em>}</li>
 *   <li>{@link org.example.dm.NumericType#getMinExclusive <em>Min Exclusive</em>}</li>
 *   <li>{@link org.example.dm.NumericType#getMaxInclusive <em>Max Inclusive</em>}</li>
 *   <li>{@link org.example.dm.NumericType#getMaxExclusive <em>Max Exclusive</em>}</li>
 *   <li>{@link org.example.dm.NumericType#getMeasurementUnit <em>Measurement Unit</em>}</li>
 * </ul>
 *
 * @see org.example.dm.DmPackage#getNumericType()
 * @model
 * @generated
 */
public interface NumericType extends DataType {

    /**
     * Returns the value of the '<em><b>Size</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Size</em>' attribute.
     * @see #setSize(Short)
     * @see org.example.dm.DmPackage#getNumericType_Size()
     * @model
     * @generated
     */
    Short getSize();

    /**
     * Sets the value of the '{@link org.example.dm.NumericType#getSize <em>Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Size</em>' attribute.
     * @see #getSize()
     * @generated
     */
    void setSize(Short value);

    /**
     * Returns the value of the '<em><b>Min Inclusive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Inclusive</em>' attribute.
     * @see #setMinInclusive(Double)
     * @see org.example.dm.DmPackage#getNumericType_MinInclusive()
     * @model
     * @generated
     */
    Double getMinInclusive();

    /**
     * Sets the value of the '{@link org.example.dm.NumericType#getMinInclusive <em>Min Inclusive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Inclusive</em>' attribute.
     * @see #getMinInclusive()
     * @generated
     */
    void setMinInclusive(Double value);

    /**
     * Returns the value of the '<em><b>Min Exclusive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Exclusive</em>' attribute.
     * @see #setMinExclusive(Double)
     * @see org.example.dm.DmPackage#getNumericType_MinExclusive()
     * @model
     * @generated
     */
    Double getMinExclusive();

    /**
     * Sets the value of the '{@link org.example.dm.NumericType#getMinExclusive <em>Min Exclusive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Exclusive</em>' attribute.
     * @see #getMinExclusive()
     * @generated
     */
    void setMinExclusive(Double value);

    /**
     * Returns the value of the '<em><b>Max Inclusive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Inclusive</em>' attribute.
     * @see #setMaxInclusive(Double)
     * @see org.example.dm.DmPackage#getNumericType_MaxInclusive()
     * @model
     * @generated
     */
    Double getMaxInclusive();

    /**
     * Sets the value of the '{@link org.example.dm.NumericType#getMaxInclusive <em>Max Inclusive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Inclusive</em>' attribute.
     * @see #getMaxInclusive()
     * @generated
     */
    void setMaxInclusive(Double value);

    /**
     * Returns the value of the '<em><b>Max Exclusive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Exclusive</em>' attribute.
     * @see #setMaxExclusive(Double)
     * @see org.example.dm.DmPackage#getNumericType_MaxExclusive()
     * @model
     * @generated
     */
    Double getMaxExclusive();

    /**
     * Sets the value of the '{@link org.example.dm.NumericType#getMaxExclusive <em>Max Exclusive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Exclusive</em>' attribute.
     * @see #getMaxExclusive()
     * @generated
     */
    void setMaxExclusive(Double value);

    /**
     * Returns the value of the '<em><b>Total Digits</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Total Digits</em>' attribute.
     * @see #setTotalDigits(Short)
     * @see org.example.dm.DmPackage#getNumericType_TotalDigits()
     * @model
     * @generated
     */
    Short getTotalDigits();

    /**
     * Sets the value of the '{@link org.example.dm.NumericType#getTotalDigits <em>Total Digits</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Total Digits</em>' attribute.
     * @see #getTotalDigits()
     * @generated
     */
    void setTotalDigits(Short value);

    /**
     * Returns the value of the '<em><b>Fraction Digits</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fraction Digits</em>' attribute.
     * @see #setFractionDigits(Short)
     * @see org.example.dm.DmPackage#getNumericType_FractionDigits()
     * @model
     * @generated
     */
    Short getFractionDigits();

    /**
     * Sets the value of the '{@link org.example.dm.NumericType#getFractionDigits <em>Fraction Digits</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fraction Digits</em>' attribute.
     * @see #getFractionDigits()
     * @generated
     */
    void setFractionDigits(Short value);

    /**
     * Returns the value of the '<em><b>Measurement Unit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Measurement Unit</em>' attribute.
     * @see #setMeasurementUnit(String)
     * @see org.example.dm.DmPackage#getNumericType_MeasurementUnit()
     * @model
     * @generated
     */
    String getMeasurementUnit();

    /**
     * Sets the value of the '{@link org.example.dm.NumericType#getMeasurementUnit <em>Measurement Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Measurement Unit</em>' attribute.
     * @see #getMeasurementUnit()
     * @generated
     */
    void setMeasurementUnit(String value);

} // NumericType
