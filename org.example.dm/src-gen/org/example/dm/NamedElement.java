/**
 */
package org.example.dm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.dm.NamedElement#getName <em>Name</em>}</li>
 *   <li>{@link org.example.dm.NamedElement#getDescription <em>Description</em>}</li>
 *   <li>{@link org.example.dm.NamedElement#getLocalizations <em>Localizations</em>}</li>
 * </ul>
 *
 * @see org.example.dm.DmPackage#getNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface NamedElement extends EObject {

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.example.dm.DmPackage#getNamedElement_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.example.dm.NamedElement#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see org.example.dm.DmPackage#getNamedElement_Description()
     * @model
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link org.example.dm.NamedElement#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

    /**
     * Returns the value of the '<em><b>Localizations</b></em>' containment reference list.
     * The list contents are of type {@link org.example.dm.Localization}.
     * It is bidirectional and its opposite is '{@link org.example.dm.Localization#getElement <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Localizations</em>' containment reference list.
     * @see org.example.dm.DmPackage#getNamedElement_Localizations()
     * @see org.example.dm.Localization#getElement
     * @model opposite="element" containment="true"
     * @generated
     */
    EList<Localization> getLocalizations();

} // NamedElement
