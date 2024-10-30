/**
 */
package org.example.dm.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.example.dm.DmPackage;
import org.example.dm.RelationshipEnd;

/**
 * This is the item provider adapter for a {@link org.example.dm.RelationshipEnd} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RelationshipEndItemProvider extends NamedElementItemProvider {

    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RelationshipEndItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addRelationshipPropertyDescriptor(object);
            addEntityPropertyDescriptor(object);
            addLowerPropertyDescriptor(object);
            addUpperPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Entity feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEntityPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_RelationshipEnd_entity_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_RelationshipEnd_entity_feature",
                                "_UI_RelationshipEnd_type"),
                        DmPackage.Literals.RELATIONSHIP_END__ENTITY,
                        true,
                        false,
                        true,
                        null,
                        null,
                        null));
    }

    /**
     * This adds a property descriptor for the Lower feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLowerPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_RelationshipEnd_lower_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_RelationshipEnd_lower_feature",
                                "_UI_RelationshipEnd_type"),
                        DmPackage.Literals.RELATIONSHIP_END__LOWER,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                        null,
                        null));
    }

    /**
     * This adds a property descriptor for the Upper feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addUpperPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_RelationshipEnd_upper_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_RelationshipEnd_upper_feature",
                                "_UI_RelationshipEnd_type"),
                        DmPackage.Literals.RELATIONSHIP_END__UPPER,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                        null,
                        null));
    }

    /**
     * This adds a property descriptor for the Relationship feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRelationshipPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_RelationshipEnd_relationship_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_RelationshipEnd_relationship_feature",
                                "_UI_RelationshipEnd_type"),
                        DmPackage.Literals.RELATIONSHIP_END__RELATIONSHIP,
                        true,
                        false,
                        true,
                        null,
                        null,
                        null));
    }

    /**
     * This returns RelationshipEnd.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/RelationshipEnd"));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected boolean shouldComposeCreationImage() {
        return true;
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((RelationshipEnd) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_RelationshipEnd_type")
                : getString("_UI_RelationshipEnd_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(RelationshipEnd.class)) {
        case DmPackage.RELATIONSHIP_END__LOWER:
        case DmPackage.RELATIONSHIP_END__UPPER:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

}
