/**
 */
package org.example.rdm.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.example.rdm.Column;
import org.example.rdm.Key;
import org.example.rdm.RdmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.rdm.impl.KeyImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class KeyImpl extends NamedElementImpl implements Key {

    /**
     * The cached value of the '{@link #getColumns() <em>Columns</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColumns()
     * @generated
     * @ordered
     */
    protected EList<Column> columns;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected KeyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RdmPackage.Literals.KEY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Column> getColumns() {
        if (columns == null) {
            columns = new EObjectResolvingEList<Column>(Column.class, this, RdmPackage.KEY__COLUMNS);
        }
        return columns;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case RdmPackage.KEY__COLUMNS:
            return getColumns();
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
        case RdmPackage.KEY__COLUMNS:
            getColumns().clear();
            getColumns().addAll((Collection<? extends Column>) newValue);
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
        case RdmPackage.KEY__COLUMNS:
            getColumns().clear();
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
        case RdmPackage.KEY__COLUMNS:
            return columns != null && !columns.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //KeyImpl
