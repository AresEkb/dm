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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.example.rdm.EnumLiteral;
import org.example.rdm.RdmPackage;
import org.example.rdm.Schema;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.rdm.impl.EnumImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.example.rdm.impl.EnumImpl#getLiterals <em>Literals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumImpl extends NamedElementImpl implements org.example.rdm.Enum {

    /**
     * The cached value of the '{@link #getLiterals() <em>Literals</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLiterals()
     * @generated
     * @ordered
     */
    protected EList<EnumLiteral> literals;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EnumImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RdmPackage.Literals.ENUM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Schema getSchema() {
        if (eContainerFeatureID() != RdmPackage.ENUM__SCHEMA)
            return null;
        return (Schema) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSchema(Schema newSchema, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newSchema, RdmPackage.ENUM__SCHEMA, msgs);
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
                || (eContainerFeatureID() != RdmPackage.ENUM__SCHEMA && newSchema != null)) {
            if (EcoreUtil.isAncestor(this, newSchema))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newSchema != null)
                msgs = ((InternalEObject) newSchema).eInverseAdd(this, RdmPackage.SCHEMA__TYPES, Schema.class, msgs);
            msgs = basicSetSchema(newSchema, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, RdmPackage.ENUM__SCHEMA, newSchema, newSchema));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<EnumLiteral> getLiterals() {
        if (literals == null) {
            literals = new EObjectContainmentWithInverseEList<EnumLiteral>(EnumLiteral.class, this,
                    RdmPackage.ENUM__LITERALS, RdmPackage.ENUM_LITERAL__ENUM);
        }
        return literals;
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
        case RdmPackage.ENUM__SCHEMA:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetSchema((Schema) otherEnd, msgs);
        case RdmPackage.ENUM__LITERALS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) getLiterals()).basicAdd(otherEnd, msgs);
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
        case RdmPackage.ENUM__SCHEMA:
            return basicSetSchema(null, msgs);
        case RdmPackage.ENUM__LITERALS:
            return ((InternalEList<?>) getLiterals()).basicRemove(otherEnd, msgs);
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
        case RdmPackage.ENUM__SCHEMA:
            return eInternalContainer().eInverseRemove(this, RdmPackage.SCHEMA__TYPES, Schema.class, msgs);
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
        case RdmPackage.ENUM__SCHEMA:
            return getSchema();
        case RdmPackage.ENUM__LITERALS:
            return getLiterals();
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
        case RdmPackage.ENUM__SCHEMA:
            setSchema((Schema) newValue);
            return;
        case RdmPackage.ENUM__LITERALS:
            getLiterals().clear();
            getLiterals().addAll((Collection<? extends EnumLiteral>) newValue);
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
        case RdmPackage.ENUM__SCHEMA:
            setSchema((Schema) null);
            return;
        case RdmPackage.ENUM__LITERALS:
            getLiterals().clear();
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
        case RdmPackage.ENUM__SCHEMA:
            return getSchema() != null;
        case RdmPackage.ENUM__LITERALS:
            return literals != null && !literals.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //EnumImpl
