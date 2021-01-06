/**
 */
package edu.kit.kastel.sdq.featuremodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.featuremodel.FeatureDiagram#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.featuremodel.FeatureDiagram#getFeatures <em>Features</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.featuremodel.FeatureDiagram#getRootFeature <em>Root Feature</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.featuremodel.FeatureDiagram#getChildRelations <em>Child Relations</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.featuremodel.FeaturemodelPackage#getFeatureDiagram()
 * @model
 * @generated
 */
public interface FeatureDiagram extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.featuremodel.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.featuremodel.FeaturemodelPackage#getFeatureDiagram_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.featuremodel.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.featuremodel.FeaturemodelPackage#getFeatureDiagram_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Root Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Feature</em>' containment reference.
	 * @see #setRootFeature(RootFeature)
	 * @see edu.kit.kastel.sdq.featuremodel.FeaturemodelPackage#getFeatureDiagram_RootFeature()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RootFeature getRootFeature();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.featuremodel.FeatureDiagram#getRootFeature <em>Root Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Feature</em>' containment reference.
	 * @see #getRootFeature()
	 * @generated
	 */
	void setRootFeature(RootFeature value);

	/**
	 * Returns the value of the '<em><b>Child Relations</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.featuremodel.ChildRelation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Relations</em>' containment reference list.
	 * @see edu.kit.kastel.sdq.featuremodel.FeaturemodelPackage#getFeatureDiagram_ChildRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChildRelation> getChildRelations();

} // FeatureDiagram
