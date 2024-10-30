/**
 */
package org.example.rdm.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.example.rdm.RdmFactory;
import org.example.rdm.RdmPackage;
import org.example.rdm.Table;

/**
 * This is the item provider adapter for a {@link org.example.rdm.Table} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TableItemProvider extends NamedElementItemProvider {

    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TableItemProvider(AdapterFactory adapterFactory) {
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

        }
        return itemPropertyDescriptors;
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
            childrenFeatures.add(RdmPackage.Literals.TABLE__COLUMNS);
            childrenFeatures.add(RdmPackage.Literals.TABLE__PRIMARY_KEY);
            childrenFeatures.add(RdmPackage.Literals.TABLE__ALTERNATE_KEYS);
            childrenFeatures.add(RdmPackage.Literals.TABLE__FOREIGN_KEYS);
            childrenFeatures.add(RdmPackage.Literals.TABLE__CONSTRAINTS);
            childrenFeatures.add(RdmPackage.Literals.TABLE__INDICES);
            childrenFeatures.add(RdmPackage.Literals.TABLE__RULES);
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
     * This returns Table.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/Table"));
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
        String label = ((Table) object).getName();
        return label == null || label.length() == 0 ? getString("_UI_Table_type")
                : getString("_UI_Table_type") + " " + label;
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

        switch (notification.getFeatureID(Table.class)) {
        case RdmPackage.TABLE__COLUMNS:
        case RdmPackage.TABLE__PRIMARY_KEY:
        case RdmPackage.TABLE__ALTERNATE_KEYS:
        case RdmPackage.TABLE__FOREIGN_KEYS:
        case RdmPackage.TABLE__CONSTRAINTS:
        case RdmPackage.TABLE__INDICES:
        case RdmPackage.TABLE__RULES:
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

        newChildDescriptors.add(createChildParameter(RdmPackage.Literals.TABLE__COLUMNS,
                RdmFactory.eINSTANCE.createColumn()));

        newChildDescriptors.add(createChildParameter(RdmPackage.Literals.TABLE__PRIMARY_KEY,
                RdmFactory.eINSTANCE.createPrimaryKey()));

        newChildDescriptors.add(createChildParameter(RdmPackage.Literals.TABLE__ALTERNATE_KEYS,
                RdmFactory.eINSTANCE.createAlternateKey()));

        newChildDescriptors.add(createChildParameter(RdmPackage.Literals.TABLE__FOREIGN_KEYS,
                RdmFactory.eINSTANCE.createForeignKey()));

        newChildDescriptors.add(createChildParameter(RdmPackage.Literals.TABLE__CONSTRAINTS,
                RdmFactory.eINSTANCE.createConstraint()));

        newChildDescriptors.add(createChildParameter(RdmPackage.Literals.TABLE__INDICES,
                RdmFactory.eINSTANCE.createIndex()));

        newChildDescriptors.add(createChildParameter(RdmPackage.Literals.TABLE__RULES,
                RdmFactory.eINSTANCE.createDeleteRule()));
    }

}
