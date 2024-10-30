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
import org.example.dm.NumericType;

/**
 * This is the item provider adapter for a {@link org.example.dm.NumericType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NumericTypeItemProvider extends DataTypeItemProvider {

    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NumericTypeItemProvider(AdapterFactory adapterFactory) {
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

            addSizePropertyDescriptor(object);
            addTotalDigitsPropertyDescriptor(object);
            addFractionDigitsPropertyDescriptor(object);
            addMinInclusivePropertyDescriptor(object);
            addMinExclusivePropertyDescriptor(object);
            addMaxInclusivePropertyDescriptor(object);
            addMaxExclusivePropertyDescriptor(object);
            addMeasurementUnitPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Size feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSizePropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_NumericType_size_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_NumericType_size_feature",
                                "_UI_NumericType_type"),
                        DmPackage.Literals.NUMERIC_TYPE__SIZE,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null));
    }

    /**
     * This adds a property descriptor for the Min Inclusive feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinInclusivePropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_NumericType_minInclusive_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_NumericType_minInclusive_feature",
                                "_UI_NumericType_type"),
                        DmPackage.Literals.NUMERIC_TYPE__MIN_INCLUSIVE,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null));
    }

    /**
     * This adds a property descriptor for the Min Exclusive feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinExclusivePropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_NumericType_minExclusive_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_NumericType_minExclusive_feature",
                                "_UI_NumericType_type"),
                        DmPackage.Literals.NUMERIC_TYPE__MIN_EXCLUSIVE,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null));
    }

    /**
     * This adds a property descriptor for the Max Inclusive feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxInclusivePropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_NumericType_maxInclusive_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_NumericType_maxInclusive_feature",
                                "_UI_NumericType_type"),
                        DmPackage.Literals.NUMERIC_TYPE__MAX_INCLUSIVE,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null));
    }

    /**
     * This adds a property descriptor for the Max Exclusive feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxExclusivePropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_NumericType_maxExclusive_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_NumericType_maxExclusive_feature",
                                "_UI_NumericType_type"),
                        DmPackage.Literals.NUMERIC_TYPE__MAX_EXCLUSIVE,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null));
    }

    /**
     * This adds a property descriptor for the Total Digits feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTotalDigitsPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_NumericType_totalDigits_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_NumericType_totalDigits_feature",
                                "_UI_NumericType_type"),
                        DmPackage.Literals.NUMERIC_TYPE__TOTAL_DIGITS,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null));
    }

    /**
     * This adds a property descriptor for the Fraction Digits feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addFractionDigitsPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_NumericType_fractionDigits_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_NumericType_fractionDigits_feature",
                                "_UI_NumericType_type"),
                        DmPackage.Literals.NUMERIC_TYPE__FRACTION_DIGITS,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null));
    }

    /**
     * This adds a property descriptor for the Measurement Unit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMeasurementUnitPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_NumericType_measurementUnit_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_NumericType_measurementUnit_feature",
                                "_UI_NumericType_type"),
                        DmPackage.Literals.NUMERIC_TYPE__MEASUREMENT_UNIT,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null));
    }

    /**
     * This returns NumericType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/NumericType"));
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
        String label = ((NumericType) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_NumericType_type")
                : getString("_UI_NumericType_type") + " " + label;
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

        switch (notification.getFeatureID(NumericType.class)) {
        case DmPackage.NUMERIC_TYPE__SIZE:
        case DmPackage.NUMERIC_TYPE__TOTAL_DIGITS:
        case DmPackage.NUMERIC_TYPE__FRACTION_DIGITS:
        case DmPackage.NUMERIC_TYPE__MIN_INCLUSIVE:
        case DmPackage.NUMERIC_TYPE__MIN_EXCLUSIVE:
        case DmPackage.NUMERIC_TYPE__MAX_INCLUSIVE:
        case DmPackage.NUMERIC_TYPE__MAX_EXCLUSIVE:
        case DmPackage.NUMERIC_TYPE__MEASUREMENT_UNIT:
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
