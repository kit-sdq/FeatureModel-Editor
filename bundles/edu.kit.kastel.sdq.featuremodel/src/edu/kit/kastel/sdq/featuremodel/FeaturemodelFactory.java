/**
 */
package edu.kit.kastel.sdq.featuremodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.sdq.featuremodel.FeaturemodelPackage
 * @generated
 */
public interface FeaturemodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeaturemodelFactory eINSTANCE = edu.kit.kastel.sdq.featuremodel.impl.FeaturemodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Feature Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Diagram</em>'.
	 * @generated
	 */
	FeatureDiagram createFeatureDiagram();

	/**
	 * Returns a new object of class '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature</em>'.
	 * @generated
	 */
	Feature createFeature();

	/**
	 * Returns a new object of class '<em>Requires Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requires Constraint</em>'.
	 * @generated
	 */
	RequiresConstraint createRequiresConstraint();

	/**
	 * Returns a new object of class '<em>Excludes Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Excludes Constraint</em>'.
	 * @generated
	 */
	ExcludesConstraint createExcludesConstraint();

	/**
	 * Returns a new object of class '<em>Mandatory Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mandatory Relation</em>'.
	 * @generated
	 */
	MandatoryRelation createMandatoryRelation();

	/**
	 * Returns a new object of class '<em>Optional Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Optional Relation</em>'.
	 * @generated
	 */
	OptionalRelation createOptionalRelation();

	/**
	 * Returns a new object of class '<em>Or Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Relation</em>'.
	 * @generated
	 */
	OrRelation createOrRelation();

	/**
	 * Returns a new object of class '<em>Alternative Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alternative Relation</em>'.
	 * @generated
	 */
	AlternativeRelation createAlternativeRelation();

	/**
	 * Returns a new object of class '<em>Metamodel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metamodel</em>'.
	 * @generated
	 */
	Metamodel createMetamodel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FeaturemodelPackage getFeaturemodelPackage();

} //FeaturemodelFactory
