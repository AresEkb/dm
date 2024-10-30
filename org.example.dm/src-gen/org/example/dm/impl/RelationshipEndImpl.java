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
import org.example.dm.Entity;
import org.example.dm.Relationship;
import org.example.dm.RelationshipEnd;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.dm.impl.RelationshipEndImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.example.dm.impl.RelationshipEndImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link org.example.dm.impl.RelationshipEndImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.example.dm.impl.RelationshipEndImpl#getUpper <em>Upper</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipEndImpl extends NamedElementImpl implements RelationshipEnd {

    /**
     * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntity()
     * @generated
     * @ordered
     */
    protected Entity entity;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RelationshipEndImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DmPackage.Literals.RELATIONSHIP_END;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Entity getEntity() {
        if (entity != null && entity.eIsProxy()) {
            InternalEObject oldEntity = (InternalEObject) entity;
            entity = (Entity) eResolveProxy(oldEntity);
            if (entity != oldEntity) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DmPackage.RELATIONSHIP_END__ENTITY,
                            oldEntity, entity));
            }
        }
        return entity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Entity basicGetEntity() {
        return entity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEntity(Entity newEntity) {
        Entity oldEntity = entity;
        entity = newEntity;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.RELATIONSHIP_END__ENTITY, oldEntity,
                    entity));
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
            eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.RELATIONSHIP_END__LOWER, oldLower, lower));
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
            eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.RELATIONSHIP_END__UPPER, oldUpper, upper));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Relationship getRelationship() {
        if (eContainerFeatureID() != DmPackage.RELATIONSHIP_END__RELATIONSHIP)
            return null;
        return (Relationship) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRelationship(Relationship newRelationship, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newRelationship, DmPackage.RELATIONSHIP_END__RELATIONSHIP, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRelationship(Relationship newRelationship) {
        if (newRelationship != eInternalContainer()
                || (eContainerFeatureID() != DmPackage.RELATIONSHIP_END__RELATIONSHIP && newRelationship != null)) {
            if (EcoreUtil.isAncestor(this, newRelationship))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newRelationship != null)
                msgs = ((InternalEObject) newRelationship).eInverseAdd(this, DmPackage.RELATIONSHIP__ENDS,
                        Relationship.class, msgs);
            msgs = basicSetRelationship(newRelationship, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DmPackage.RELATIONSHIP_END__RELATIONSHIP,
                    newRelationship, newRelationship));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case DmPackage.RELATIONSHIP_END__RELATIONSHIP:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetRelationship((Relationship) otherEnd, msgs);
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
        case DmPackage.RELATIONSHIP_END__RELATIONSHIP:
            return basicSetRelationship(null, msgs);
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
        case DmPackage.RELATIONSHIP_END__RELATIONSHIP:
            return eInternalContainer().eInverseRemove(this, DmPackage.RELATIONSHIP__ENDS, Relationship.class, msgs);
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
        case DmPackage.RELATIONSHIP_END__RELATIONSHIP:
            return getRelationship();
        case DmPackage.RELATIONSHIP_END__ENTITY:
            if (resolve)
                return getEntity();
            return basicGetEntity();
        case DmPackage.RELATIONSHIP_END__LOWER:
            return getLower();
        case DmPackage.RELATIONSHIP_END__UPPER:
            return getUpper();
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
        case DmPackage.RELATIONSHIP_END__RELATIONSHIP:
            setRelationship((Relationship) newValue);
            return;
        case DmPackage.RELATIONSHIP_END__ENTITY:
            setEntity((Entity) newValue);
            return;
        case DmPackage.RELATIONSHIP_END__LOWER:
            setLower((Integer) newValue);
            return;
        case DmPackage.RELATIONSHIP_END__UPPER:
            setUpper((Integer) newValue);
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
        case DmPackage.RELATIONSHIP_END__RELATIONSHIP:
            setRelationship((Relationship) null);
            return;
        case DmPackage.RELATIONSHIP_END__ENTITY:
            setEntity((Entity) null);
            return;
        case DmPackage.RELATIONSHIP_END__LOWER:
            setLower(LOWER_EDEFAULT);
            return;
        case DmPackage.RELATIONSHIP_END__UPPER:
            setUpper(UPPER_EDEFAULT);
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
        case DmPackage.RELATIONSHIP_END__RELATIONSHIP:
            return getRelationship() != null;
        case DmPackage.RELATIONSHIP_END__ENTITY:
            return entity != null;
        case DmPackage.RELATIONSHIP_END__LOWER:
            return lower != LOWER_EDEFAULT;
        case DmPackage.RELATIONSHIP_END__UPPER:
            return upper != UPPER_EDEFAULT;
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
        result.append(" (lower: ");
        result.append(lower);
        result.append(", upper: ");
        result.append(upper);
        result.append(')');
        return result.toString();
    }

} //RelationshipEndImpl
