/**
 */
package org.example.dm.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.example.dm.*;

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
 * @see org.example.dm.DmPackage
 * @generated
 */
public class DmSwitch<T> extends Switch<T> {

    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static DmPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DmSwitch() {
        if (modelPackage == null) {
            modelPackage = DmPackage.eINSTANCE;
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
        case DmPackage.NAMED_ELEMENT: {
            NamedElement namedElement = (NamedElement) theEObject;
            T result = caseNamedElement(namedElement);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DmPackage.LOCALIZATION: {
            Localization localization = (Localization) theEObject;
            T result = caseLocalization(localization);
            if (result == null)
                result = caseNamedElement(localization);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DmPackage.DATA_MODEL: {
            DataModel dataModel = (DataModel) theEObject;
            T result = caseDataModel(dataModel);
            if (result == null)
                result = caseNamedElement(dataModel);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DmPackage.ENTITY: {
            Entity entity = (Entity) theEObject;
            T result = caseEntity(entity);
            if (result == null)
                result = caseNamedElement(entity);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DmPackage.ATTRIBUTE: {
            Attribute attribute = (Attribute) theEObject;
            T result = caseAttribute(attribute);
            if (result == null)
                result = caseNamedElement(attribute);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DmPackage.RELATIONSHIP: {
            Relationship relationship = (Relationship) theEObject;
            T result = caseRelationship(relationship);
            if (result == null)
                result = caseNamedElement(relationship);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DmPackage.RELATIONSHIP_END: {
            RelationshipEnd relationshipEnd = (RelationshipEnd) theEObject;
            T result = caseRelationshipEnd(relationshipEnd);
            if (result == null)
                result = caseNamedElement(relationshipEnd);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DmPackage.DATA_TYPE: {
            DataType dataType = (DataType) theEObject;
            T result = caseDataType(dataType);
            if (result == null)
                result = caseNamedElement(dataType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DmPackage.BOOLEAN_TYPE: {
            BooleanType booleanType = (BooleanType) theEObject;
            T result = caseBooleanType(booleanType);
            if (result == null)
                result = caseDataType(booleanType);
            if (result == null)
                result = caseNamedElement(booleanType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DmPackage.STRING_TYPE: {
            StringType stringType = (StringType) theEObject;
            T result = caseStringType(stringType);
            if (result == null)
                result = caseDataType(stringType);
            if (result == null)
                result = caseNamedElement(stringType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DmPackage.NUMERIC_TYPE: {
            NumericType numericType = (NumericType) theEObject;
            T result = caseNumericType(numericType);
            if (result == null)
                result = caseDataType(numericType);
            if (result == null)
                result = caseNamedElement(numericType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DmPackage.DATE_TYPE: {
            DateType dateType = (DateType) theEObject;
            T result = caseDateType(dateType);
            if (result == null)
                result = caseDataType(dateType);
            if (result == null)
                result = caseNamedElement(dateType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DmPackage.DATE_TIME_TYPE: {
            DateTimeType dateTimeType = (DateTimeType) theEObject;
            T result = caseDateTimeType(dateTimeType);
            if (result == null)
                result = caseDataType(dateTimeType);
            if (result == null)
                result = caseNamedElement(dateTimeType);
            if (result == null)
                result = defaultCase(theEObject);
            return result;
        }
        case DmPackage.UUID_TYPE: {
            UuidType uuidType = (UuidType) theEObject;
            T result = caseUuidType(uuidType);
            if (result == null)
                result = caseDataType(uuidType);
            if (result == null)
                result = caseNamedElement(uuidType);
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
     * Returns the result of interpreting the object as an instance of '<em>Localization</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Localization</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLocalization(Localization object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Model</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Model</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataModel(DataModel object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntity(Entity object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAttribute(Attribute object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRelationship(Relationship object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Relationship End</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Relationship End</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRelationshipEnd(RelationshipEnd object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDataType(DataType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBooleanType(BooleanType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>String Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>String Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStringType(StringType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Numeric Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Numeric Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNumericType(NumericType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Date Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Date Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDateType(DateType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Date Time Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Date Time Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDateTimeType(DateTimeType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Uuid Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Uuid Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUuidType(UuidType object) {
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

} //DmSwitch
