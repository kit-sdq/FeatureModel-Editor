/**
 */
package edu.kit.kastel.sdq.featuremodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.featuremodel.Constraint#getSource <em>Source</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.featuremodel.Constraint#getTarget <em>Target</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.featuremodel.Constraint#getState <em>State</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.featuremodel.FeaturemodelPackage#getConstraint()
 * @model abstract="true"
 * @generated
 */
public interface Constraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(AbstractFeature)
	 * @see edu.kit.kastel.sdq.featuremodel.FeaturemodelPackage#getConstraint_Source()
	 * @model required="true"
	 * @generated
	 */
	AbstractFeature getSource();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.featuremodel.Constraint#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(AbstractFeature value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(AbstractFeature)
	 * @see edu.kit.kastel.sdq.featuremodel.FeaturemodelPackage#getConstraint_Target()
	 * @model required="true"
	 * @generated
	 */
	AbstractFeature getTarget();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.featuremodel.Constraint#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(AbstractFeature value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link edu.kit.kastel.sdq.featuremodel.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see edu.kit.kastel.sdq.featuremodel.State
	 * @see #setState(State)
	 * @see edu.kit.kastel.sdq.featuremodel.FeaturemodelPackage#getConstraint_State()
	 * @model default="" required="true"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.featuremodel.Constraint#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see edu.kit.kastel.sdq.featuremodel.State
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

} // Constraint
