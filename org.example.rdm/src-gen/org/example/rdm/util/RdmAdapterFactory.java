/**
 */
package org.example.rdm.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.example.rdm.AlternateKey;
import org.example.rdm.CandidateKey;
import org.example.rdm.Column;
import org.example.rdm.Constraint;
import org.example.rdm.Database;
import org.example.rdm.DeleteRule;
import org.example.rdm.EnumLiteral;
import org.example.rdm.ForeignKey;
import org.example.rdm.Index;
import org.example.rdm.Key;
import org.example.rdm.NamedElement;
import org.example.rdm.PrimaryKey;
import org.example.rdm.RdmPackage;
import org.example.rdm.Rule;
import org.example.rdm.Schema;
import org.example.rdm.Table;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.example.rdm.RdmPackage
 * @generated
 */
public class RdmAdapterFactory extends AdapterFactoryImpl {

    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static RdmPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RdmAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = RdmPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RdmSwitch<Adapter> modelSwitch = new RdmSwitch<Adapter>() {

        @Override
        public Adapter caseNamedElement(NamedElement object) {
            return createNamedElementAdapter();
        }

        @Override
        public Adapter caseDatabase(Database object) {
            return createDatabaseAdapter();
        }

        @Override
        public Adapter caseSchema(Schema object) {
            return createSchemaAdapter();
        }

        @Override
        public Adapter caseTable(Table object) {
            return createTableAdapter();
        }

        @Override
        public Adapter caseColumn(Column object) {
            return createColumnAdapter();
        }

        @Override
        public Adapter caseKey(Key object) {
            return createKeyAdapter();
        }

        @Override
        public Adapter caseCandidateKey(CandidateKey object) {
            return createCandidateKeyAdapter();
        }

        @Override
        public Adapter casePrimaryKey(PrimaryKey object) {
            return createPrimaryKeyAdapter();
        }

        @Override
        public Adapter caseAlternateKey(AlternateKey object) {
            return createAlternateKeyAdapter();
        }

        @Override
        public Adapter caseForeignKey(ForeignKey object) {
            return createForeignKeyAdapter();
        }

        @Override
        public Adapter caseConstraint(Constraint object) {
            return createConstraintAdapter();
        }

        @Override
        public Adapter caseIndex(Index object) {
            return createIndexAdapter();
        }

        @Override
        public Adapter caseRule(Rule object) {
            return createRuleAdapter();
        }

        @Override
        public Adapter caseDeleteRule(DeleteRule object) {
            return createDeleteRuleAdapter();
        }

        @Override
        public Adapter caseEnum(org.example.rdm.Enum object) {
            return createEnumAdapter();
        }

        @Override
        public Adapter caseEnumLiteral(EnumLiteral object) {
            return createEnumLiteralAdapter();
        }

        @Override
        public Adapter defaultCase(EObject object) {
            return createEObjectAdapter();
        }

    };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '{@link org.example.rdm.NamedElement <em>Named Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.example.rdm.NamedElement
     * @generated
     */
    public Adapter createNamedElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.example.rdm.Database <em>Database</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.example.rdm.Database
     * @generated
     */
    public Adapter createDatabaseAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.example.rdm.Schema <em>Schema</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.example.rdm.Schema
     * @generated
     */
    public Adapter createSchemaAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.example.rdm.Table <em>Table</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.example.rdm.Table
     * @generated
     */
    public Adapter createTableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.example.rdm.Column <em>Column</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.example.rdm.Column
     * @generated
     */
    public Adapter createColumnAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.example.rdm.Key <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.example.rdm.Key
     * @generated
     */
    public Adapter createKeyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.example.rdm.CandidateKey <em>Candidate Key</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.example.rdm.CandidateKey
     * @generated
     */
    public Adapter createCandidateKeyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.example.rdm.PrimaryKey <em>Primary Key</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.example.rdm.PrimaryKey
     * @generated
     */
    public Adapter createPrimaryKeyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.example.rdm.AlternateKey <em>Alternate Key</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.example.rdm.AlternateKey
     * @generated
     */
    public Adapter createAlternateKeyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.example.rdm.ForeignKey <em>Foreign Key</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.example.rdm.ForeignKey
     * @generated
     */
    public Adapter createForeignKeyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.example.rdm.Constraint <em>Constraint</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.example.rdm.Constraint
     * @generated
     */
    public Adapter createConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.example.rdm.Index <em>Index</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.example.rdm.Index
     * @generated
     */
    public Adapter createIndexAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.example.rdm.Rule <em>Rule</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.example.rdm.Rule
     * @generated
     */
    public Adapter createRuleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.example.rdm.DeleteRule <em>Delete Rule</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.example.rdm.DeleteRule
     * @generated
     */
    public Adapter createDeleteRuleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.example.rdm.Enum <em>Enum</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.example.rdm.Enum
     * @generated
     */
    public Adapter createEnumAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.example.rdm.EnumLiteral <em>Enum Literal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.example.rdm.EnumLiteral
     * @generated
     */
    public Adapter createEnumLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //RdmAdapterFactory
