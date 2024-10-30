/**
 */
package org.example.dm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Localization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.dm.Localization#getLocale <em>Locale</em>}</li>
 *   <li>{@link org.example.dm.Localization#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see org.example.dm.DmPackage#getLocalization()
 * @model
 * @generated
 */
public interface Localization extends NamedElement {

    /**
     * Returns the value of the '<em><b>Locale</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Locale</em>' attribute.
     * @see #setLocale(String)
     * @see org.example.dm.DmPackage#getLocalization_Locale()
     * @model required="true"
     * @generated
     */
    String getLocale();

    /**
     * Sets the value of the '{@link org.example.dm.Localization#getLocale <em>Locale</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Locale</em>' attribute.
     * @see #getLocale()
     * @generated
     */
    void setLocale(String value);

    /**
     * Returns the value of the '<em><b>Element</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.example.dm.NamedElement#getLocalizations <em>Localizations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Element</em>' container reference.
     * @see #setElement(NamedElement)
     * @see org.example.dm.DmPackage#getLocalization_Element()
     * @see org.example.dm.NamedElement#getLocalizations
     * @model opposite="localizations" resolveProxies="false" required="true" transient="false"
     * @generated
     */
    NamedElement getElement();

    /**
     * Sets the value of the '{@link org.example.dm.Localization#getElement <em>Element</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Element</em>' container reference.
     * @see #getElement()
     * @generated
     */
    void setElement(NamedElement value);

} // Localization
