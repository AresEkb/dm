/**
 */
package org.example.rdm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.example.rdm.EnumLiteral;
import org.example.rdm.RdmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.rdm.impl.EnumLiteralImpl#getEnum <em>Enum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumLiteralImpl extends NamedElementImpl implements EnumLiteral {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EnumLiteralImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RdmPackage.Literals.ENUM_LITERAL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public org.example.rdm.Enum getEnum() {
        if (eContainerFeatureID() != RdmPackage.ENUM_LITERAL__ENUM)
            return null;
        return (org.example.rdm.Enum) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEnum(org.example.rdm.Enum newEnum, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newEnum, RdmPackage.ENUM_LITERAL__ENUM, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEnum(org.example.rdm.Enum newEnum) {
        if (newEnum != eInternalContainer()
                || (eContainerFeatureID() != RdmPackage.ENUM_LITERAL__ENUM && newEnum != null)) {
            if (EcoreUtil.isAncestor(this, newEnum))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newEnum != null)
                msgs = ((InternalEObject) newEnum).eInverseAdd(this, RdmPackage.ENUM__LITERALS,
                        org.example.rdm.Enum.class, msgs);
            msgs = basicSetEnum(newEnum, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RdmPackage.ENUM_LITERAL__ENUM, newEnum, newEnum));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case RdmPackage.ENUM_LITERAL__ENUM:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetEnum((org.example.rdm.Enum) otherEnd, msgs);
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
        case RdmPackage.ENUM_LITERAL__ENUM:
            return basicSetEnum(null, msgs);
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
        case RdmPackage.ENUM_LITERAL__ENUM:
            return eInternalContainer().eInverseRemove(this, RdmPackage.ENUM__LITERALS, org.example.rdm.Enum.class,
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
        case RdmPackage.ENUM_LITERAL__ENUM:
            return getEnum();
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
        case RdmPackage.ENUM_LITERAL__ENUM:
            setEnum((org.example.rdm.Enum) newValue);
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
        case RdmPackage.ENUM_LITERAL__ENUM:
            setEnum((org.example.rdm.Enum) null);
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
        case RdmPackage.ENUM_LITERAL__ENUM:
            return getEnum() != null;
        }
        return super.eIsSet(featureID);
    }

} //EnumLiteralImpl
