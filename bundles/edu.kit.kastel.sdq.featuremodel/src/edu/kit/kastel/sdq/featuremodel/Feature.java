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
 *   <li>{@link edu.kit.kastel.sdq.featuremodel.Feature#getSimulatorcomponent <em>Simulatorcomponent</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.featuremodel.Feature#getState <em>State</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.featuremodel.FeaturemodelPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends AbstractFeature {

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

	/**
	 * Returns the value of the '<em><b>Simulatorcomponent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulatorcomponent</em>' containment reference.
	 * @see #setSimulatorcomponent(SimulatorComponent)
	 * @see edu.kit.kastel.sdq.featuremodel.FeaturemodelPackage#getFeature_Simulatorcomponent()
	 * @model containment="true"
	 * @generated
	 */
	SimulatorComponent getSimulatorcomponent();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.featuremodel.Feature#getSimulatorcomponent <em>Simulatorcomponent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulatorcomponent</em>' containment reference.
	 * @see #getSimulatorcomponent()
	 * @generated
	 */
	void setSimulatorcomponent(SimulatorComponent value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link edu.kit.kastel.sdq.featuremodel.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see edu.kit.kastel.sdq.featuremodel.State
	 * @see #setState(State)
	 * @see edu.kit.kastel.sdq.featuremodel.FeaturemodelPackage#getFeature_State()
	 * @model default="" required="true"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.featuremodel.Feature#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see edu.kit.kastel.sdq.featuremodel.State
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);
} // Feature
