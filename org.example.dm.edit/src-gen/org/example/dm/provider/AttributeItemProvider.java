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

import org.example.dm.Attribute;
import org.example.dm.DmPackage;

/**
 * This is the item provider adapter for a {@link org.example.dm.Attribute} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeItemProvider extends NamedElementItemProvider {

    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeItemProvider(AdapterFactory adapterFactory) {
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

            addIdentityPropertyDescriptor(object);
            addDataTypePropertyDescriptor(object);
            addLowerPropertyDescriptor(object);
            addUpperPropertyDescriptor(object);
            addDefaultValuePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Identity feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIdentityPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_Attribute_identity_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_Attribute_identity_feature",
                                "_UI_Attribute_type"),
                        DmPackage.Literals.ATTRIBUTE__IDENTITY,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                        null,
                        null));
    }

    /**
     * This adds a property descriptor for the Data Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDataTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_Attribute_dataType_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_Attribute_dataType_feature",
                                "_UI_Attribute_type"),
                        DmPackage.Literals.ATTRIBUTE__DATA_TYPE,
                        true,
                        false,
                        true,
                        null,
                        null,
                        null));
    }

    /**
     * This adds a property descriptor for the Default Value feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addDefaultValuePropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_Attribute_defaultValue_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_Attribute_defaultValue_feature",
                                "_UI_Attribute_type"),
                        DmPackage.Literals.ATTRIBUTE__DEFAULT_VALUE,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
                        getString("_UI_Attribute_upper_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_Attribute_upper_feature",
                                "_UI_Attribute_type"),
                        DmPackage.Literals.ATTRIBUTE__UPPER,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
                        getString("_UI_Attribute_lower_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_Attribute_lower_feature",
                                "_UI_Attribute_type"),
                        DmPackage.Literals.ATTRIBUTE__LOWER,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
                        null,
                        null));
    }

    /**
     * This returns Attribute.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/Attribute"));
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
        String label = ((Attribute) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_Attribute_type")
                : getString("_UI_Attribute_type") + " " + label;
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

        switch (notification.getFeatureID(Attribute.class)) {
        case DmPackage.ATTRIBUTE__IDENTITY:
        case DmPackage.ATTRIBUTE__LOWER:
        case DmPackage.ATTRIBUTE__UPPER:
        case DmPackage.ATTRIBUTE__DEFAULT_VALUE:
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
