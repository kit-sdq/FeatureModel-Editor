/**
 */
package edu.kit.kastel.sdq.featuremodel.util;

import edu.kit.kastel.sdq.featuremodel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see edu.kit.kastel.sdq.featuremodel.FeaturemodelPackage
 * @generated
 */
public class FeaturemodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FeaturemodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturemodelSwitch() {
		if (modelPackage == null) {
			modelPackage = FeaturemodelPackage.eINSTANCE;
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
		case FeaturemodelPackage.FEATURE_DIAGRAM: {
			FeatureDiagram featureDiagram = (FeatureDiagram) theEObject;
			T result = caseFeatureDiagram(featureDiagram);
			if (result == null)
				result = caseNamedElement(featureDiagram);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FeaturemodelPackage.FEATURE: {
			Feature feature = (Feature) theEObject;
			T result = caseFeature(feature);
			if (result == null)
				result = caseNamedElement(feature);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FeaturemodelPackage.CONSTRAINT: {
			Constraint constraint = (Constraint) theEObject;
			T result = caseConstraint(constraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FeaturemodelPackage.CHILD_RELATION: {
			ChildRelation childRelation = (ChildRelation) theEObject;
			T result = caseChildRelation(childRelation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FeaturemodelPackage.SINGLE_CHILD_RELATION: {
			SingleChildRelation singleChildRelation = (SingleChildRelation) theEObject;
			T result = caseSingleChildRelation(singleChildRelation);
			if (result == null)
				result = caseChildRelation(singleChildRelation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FeaturemodelPackage.MULTIPLE_CHILDREN_RELATION: {
			MultipleChildrenRelation multipleChildrenRelation = (MultipleChildrenRelation) theEObject;
			T result = caseMultipleChildrenRelation(multipleChildrenRelation);
			if (result == null)
				result = caseChildRelation(multipleChildrenRelation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FeaturemodelPackage.REQUIRES_CONSTRAINT: {
			RequiresConstraint requiresConstraint = (RequiresConstraint) theEObject;
			T result = caseRequiresConstraint(requiresConstraint);
			if (result == null)
				result = caseConstraint(requiresConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FeaturemodelPackage.EXCLUDES_CONSTRAINT: {
			ExcludesConstraint excludesConstraint = (ExcludesConstraint) theEObject;
			T result = caseExcludesConstraint(excludesConstraint);
			if (result == null)
				result = caseConstraint(excludesConstraint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FeaturemodelPackage.MANDATORY_RELATION: {
			MandatoryRelation mandatoryRelation = (MandatoryRelation) theEObject;
			T result = caseMandatoryRelation(mandatoryRelation);
			if (result == null)
				result = caseSingleChildRelation(mandatoryRelation);
			if (result == null)
				result = caseChildRelation(mandatoryRelation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FeaturemodelPackage.OPTIONAL_RELATION: {
			OptionalRelation optionalRelation = (OptionalRelation) theEObject;
			T result = caseOptionalRelation(optionalRelation);
			if (result == null)
				result = caseSingleChildRelation(optionalRelation);
			if (result == null)
				result = caseChildRelation(optionalRelation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FeaturemodelPackage.OR_RELATION: {
			OrRelation orRelation = (OrRelation) theEObject;
			T result = caseOrRelation(orRelation);
			if (result == null)
				result = caseMultipleChildrenRelation(orRelation);
			if (result == null)
				result = caseChildRelation(orRelation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FeaturemodelPackage.ALTERNATIVE_RELATION: {
			AlternativeRelation alternativeRelation = (AlternativeRelation) theEObject;
			T result = caseAlternativeRelation(alternativeRelation);
			if (result == null)
				result = caseMultipleChildrenRelation(alternativeRelation);
			if (result == null)
				result = caseChildRelation(alternativeRelation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FeaturemodelPackage.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureDiagram(FeatureDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Child Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Child Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChildRelation(ChildRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Child Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Child Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleChildRelation(SingleChildRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiple Children Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiple Children Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultipleChildrenRelation(MultipleChildrenRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requires Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requires Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequiresConstraint(RequiresConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Excludes Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Excludes Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExcludesConstraint(ExcludesConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mandatory Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mandatory Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMandatoryRelation(MandatoryRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Optional Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optional Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionalRelation(OptionalRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrRelation(OrRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternative Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternative Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlternativeRelation(AlternativeRelation object) {
		return null;
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

} //FeaturemodelSwitch
