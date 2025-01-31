/**
 */
package org.example.dm.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.example.dm.DataModel;
import org.example.dm.DmFactory;
import org.example.dm.DmPackage;

/**
 * This is the item provider adapter for a {@link org.example.dm.DataModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataModelItemProvider extends NamedElementItemProvider {

    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataModelItemProvider(AdapterFactory adapterFactory) {
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

            addLocalesPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Locales feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLocalesPropertyDescriptor(Object object) {
        itemPropertyDescriptors
                .add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString("_UI_DataModel_locales_feature"),
                        getString("_UI_PropertyDescriptor_description", "_UI_DataModel_locales_feature",
                                "_UI_DataModel_type"),
                        DmPackage.Literals.DATA_MODEL__LOCALES,
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null));
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(DmPackage.Literals.DATA_MODEL__ENTITIES);
            childrenFeatures.add(DmPackage.Literals.DATA_MODEL__RELATIONSHIPS);
            childrenFeatures.add(DmPackage.Literals.DATA_MODEL__DATA_TYPES);
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns DataModel.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/DataModel"));
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
        String label = ((DataModel) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_DataModel_type")
                : getString("_UI_DataModel_type") + " " + label;
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

        switch (notification.getFeatureID(DataModel.class)) {
        case DmPackage.DATA_MODEL__LOCALES:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        case DmPackage.DATA_MODEL__ENTITIES:
        case DmPackage.DATA_MODEL__RELATIONSHIPS:
        case DmPackage.DATA_MODEL__DATA_TYPES:
            fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

        newChildDescriptors.add(createChildParameter(DmPackage.Literals.DATA_MODEL__ENTITIES,
                DmFactory.eINSTANCE.createEntity()));

        newChildDescriptors.add(createChildParameter(DmPackage.Literals.DATA_MODEL__RELATIONSHIPS,
                DmFactory.eINSTANCE.createRelationship()));

        newChildDescriptors.add(createChildParameter(DmPackage.Literals.DATA_MODEL__DATA_TYPES,
                DmFactory.eINSTANCE.createBooleanType()));

        newChildDescriptors.add(createChildParameter(DmPackage.Literals.DATA_MODEL__DATA_TYPES,
                DmFactory.eINSTANCE.createStringType()));

        newChildDescriptors.add(createChildParameter(DmPackage.Literals.DATA_MODEL__DATA_TYPES,
                DmFactory.eINSTANCE.createNumericType()));

        newChildDescriptors.add(createChildParameter(DmPackage.Literals.DATA_MODEL__DATA_TYPES,
                DmFactory.eINSTANCE.createDateType()));

        newChildDescriptors.add(createChildParameter(DmPackage.Literals.DATA_MODEL__DATA_TYPES,
                DmFactory.eINSTANCE.createDateTimeType()));

        newChildDescriptors.add(createChildParameter(DmPackage.Literals.DATA_MODEL__DATA_TYPES,
                DmFactory.eINSTANCE.createUuidType()));
    }

}
