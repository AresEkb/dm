/**
 */
package org.example.dm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.example.dm.DmPackage;
import org.example.dm.Localization;
import org.example.dm.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Localization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.dm.impl.LocalizationImpl#getLocale <em>Locale</em>}</li>
 *   <li>{@link org.example.dm.impl.LocalizationImpl#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocalizationImpl extends NamedElementImpl implements Localization {

    /**
     * The default value of the '{@link #getLocale() <em>Locale</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocale()
     * @generated
     * @ordered
     */
    protected static final String LOCALE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLocale() <em>Locale</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocale()
     * @generated
     * @ordered
     */
    protected String locale = LOCALE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LocalizationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DmPackage.Literals.LOCALIZATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLocale() {
        return locale;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLocale(String newLocale) {
        String oldLocale = locale;
        locale = newLocale;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.LOCALIZATION__LOCALE, oldLocale, locale));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NamedElement getElement() {
        if (eContainerFeatureID() != DmPackage.LOCALIZATION__ELEMENT)
            return null;
        return (NamedElement) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetElement(NamedElement newElement, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newElement, DmPackage.LOCALIZATION__ELEMENT, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setElement(NamedElement newElement) {
        if (newElement != eInternalContainer()
                || (eContainerFeatureID() != DmPackage.LOCALIZATION__ELEMENT && newElement != null)) {
            if (EcoreUtil.isAncestor(this, newElement))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newElement != null)
                msgs = ((InternalEObject) newElement).eInverseAdd(this, DmPackage.NAMED_ELEMENT__LOCALIZATIONS,
                        NamedElement.class, msgs);
            msgs = basicSetElement(newElement, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.LOCALIZATION__ELEMENT, newElement,
                    newElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DmPackage.LOCALIZATION__ELEMENT:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetElement((NamedElement) otherEnd, msgs);
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
        case DmPackage.LOCALIZATION__ELEMENT:
            return basicSetElement(null, msgs);
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
        case DmPackage.LOCALIZATION__ELEMENT:
            return eInternalContainer().eInverseRemove(this, DmPackage.NAMED_ELEMENT__LOCALIZATIONS, NamedElement.class,
                    msgs);
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
        case DmPackage.LOCALIZATION__LOCALE:
            return getLocale();
        case DmPackage.LOCALIZATION__ELEMENT:
            return getElement();
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
        case DmPackage.LOCALIZATION__LOCALE:
            setLocale((String) newValue);
            return;
        case DmPackage.LOCALIZATION__ELEMENT:
            setElement((NamedElement) newValue);
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
        case DmPackage.LOCALIZATION__LOCALE:
            setLocale(LOCALE_EDEFAULT);
            return;
        case DmPackage.LOCALIZATION__ELEMENT:
            setElement((NamedElement) null);
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
        case DmPackage.LOCALIZATION__LOCALE:
            return LOCALE_EDEFAULT == null ? locale != null : !LOCALE_EDEFAULT.equals(locale);
        case DmPackage.LOCALIZATION__ELEMENT:
            return getElement() != null;
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
        result.append(" (locale: ");
        result.append(locale);
        result.append(')');
        return result.toString();
    }

} //LocalizationImpl
