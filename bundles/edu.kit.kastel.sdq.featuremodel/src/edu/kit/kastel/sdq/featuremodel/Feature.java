/**
 */
package edu.kit.kastel.sdq.featuremodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.featuremodel.Feature#getMetamodel <em>Metamodel</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.featuremodel.FeaturemodelPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Metamodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel</em>' containment reference.
	 * @see #setMetamodel(Metamodel)
	 * @see edu.kit.kastel.sdq.featuremodel.FeaturemodelPackage#getFeature_Metamodel()
	 * @model containment="true"
	 * @generated
	 */
	Metamodel getMetamodel();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.featuremodel.Feature#getMetamodel <em>Metamodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel</em>' containment reference.
	 * @see #getMetamodel()
	 * @generated
	 */
	void setMetamodel(Metamodel value);
} // Feature
