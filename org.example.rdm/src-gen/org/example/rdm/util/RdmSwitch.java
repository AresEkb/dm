/**
 */
package org.example.rdm.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.example.rdm.RdmPackage
 * @generated
 */
public class RdmSwitch<T> extends Switch<T> {

    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static RdmPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RdmSwitch() {
        if (modelPackage == null) {
            modelPackage = RdmPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
        case RdmPackage.NAMED_ELEMENT: {
            NamedElement namedElement = (NamedElement) theEObject;
            T result = caseNamedElement(namedElement);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case RdmPackage.DATABASE: {
            Database database = (Database) theEObject;
            T result = caseDatabase(database);
            if (result == null)
                result = caseNamedElement(database);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case RdmPackage.SCHEMA: {
            Schema schema = (Schema) theEObject;
            T result = caseSchema(schema);
            if (result == null)
                result = caseNamedElement(schema);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case RdmPackage.TABLE: {
            Table table = (Table) theEObject;
            T result = caseTable(table);
            if (result == null)
                result = caseNamedElement(table);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case RdmPackage.COLUMN: {
            Column column = (Column) theEObject;
            T result = caseColumn(column);
            if (result == null)
                result = caseNamedElement(column);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case RdmPackage.KEY: {
            Key key = (Key) theEObject;
            T result = caseKey(key);
            if (result == null)
                result = caseNamedElement(key);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case RdmPackage.CANDIDATE_KEY: {
            CandidateKey candidateKey = (CandidateKey) theEObject;
            T result = caseCandidateKey(candidateKey);
            if (result == null)
                result = caseKey(candidateKey);
            if (result == null)
                result = caseNamedElement(candidateKey);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case RdmPackage.PRIMARY_KEY: {
            PrimaryKey primaryKey = (PrimaryKey) theEObject;
            T result = casePrimaryKey(primaryKey);
            if (result == null)
                result = caseCandidateKey(primaryKey);
            if (result == null)
                result = caseKey(primaryKey);
            if (result == null)
                result = caseNamedElement(primaryKey);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case RdmPackage.ALTERNATE_KEY: {
            AlternateKey alternateKey = (AlternateKey) theEObject;
            T result = caseAlternateKey(alternateKey);
            if (result == null)
                result = caseCandidateKey(alternateKey);
            if (result == null)
                result = caseKey(alternateKey);
            if (result == null)
                result = caseNamedElement(alternateKey);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case RdmPackage.FOREIGN_KEY: {
            ForeignKey foreignKey = (ForeignKey) theEObject;
            T result = caseForeignKey(foreignKey);
            if (result == null)
                result = caseKey(foreignKey);
            if (result == null)
                result = caseNamedElement(foreignKey);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case RdmPackage.CONSTRAINT: {
            Constraint constraint = (Constraint) theEObject;
            T result = caseConstraint(constraint);
            if (result == null)
                result = caseNamedElement(constraint);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case RdmPackage.INDEX: {
            Index index = (Index) theEObject;
            T result = caseIndex(index);
            if (result == null)
                result = caseNamedElement(index);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case RdmPackage.RULE: {
            Rule rule = (Rule) theEObject;
            T result = caseRule(rule);
            if (result == null)
                result = caseNamedElement(rule);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case RdmPackage.DELETE_RULE: {
            DeleteRule deleteRule = (DeleteRule) theEObject;
            T result = caseDeleteRule(deleteRule);
            if (result == null)
                result = caseRule(deleteRule);
            if (result == null)
                result = caseNamedElement(deleteRule);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case RdmPackage.ENUM: {
            org.example.rdm.Enum enum_ = (org.example.rdm.Enum) theEObject;
            T result = caseEnum(enum_);
            if (result == null)
                result = caseNamedElement(enum_);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case RdmPackage.ENUM_LITERAL: {
            EnumLiteral enumLiteral = (EnumLiteral) theEObject;
            T result = caseEnumLiteral(enumLiteral);
            if (result == null)
                result = caseNamedElement(enumLiteral);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        default:
            return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamedElement(NamedElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Database</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Database</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDatabase(Database object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Schema</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Schema</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSchema(Schema object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Table</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTable(Table object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Column</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Column</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseColumn(Column object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Key</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Key</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseKey(Key object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Candidate Key</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Candidate Key</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCandidateKey(CandidateKey object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Primary Key</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Primary Key</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePrimaryKey(PrimaryKey object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Alternate Key</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Alternate Key</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAlternateKey(AlternateKey object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Foreign Key</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Foreign Key</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseForeignKey(ForeignKey object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConstraint(Constraint object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Index</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Index</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIndex(Index object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRule(Rule object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Delete Rule</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Delete Rule</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDeleteRule(DeleteRule object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Enum</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Enum</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEnum(org.example.rdm.Enum object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Enum Literal</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Enum Literal</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEnumLiteral(EnumLiteral object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //RdmSwitch
