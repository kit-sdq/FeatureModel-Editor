/**
 */
package edu.kit.kastel.sdq.featuremodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Child Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.featuremodel.ChildRelation#getParent <em>Parent</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.featuremodel.ChildRelation#getState <em>State</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.featuremodel.FeaturemodelPackage#getChildRelation()
 * @model abstract="true"
 * @generated
 */
public interface ChildRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(AbstractFeature)
	 * @see edu.kit.kastel.sdq.featuremodel.FeaturemodelPackage#getChildRelation_Parent()
	 * @model required="true"
	 * @generated
	 */
	AbstractFeature getParent();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.featuremodel.ChildRelation#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(AbstractFeature value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link edu.kit.kastel.sdq.featuremodel.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see edu.kit.kastel.sdq.featuremodel.State
	 * @see #setState(State)
	 * @see edu.kit.kastel.sdq.featuremodel.FeaturemodelPackage#getChildRelation_State()
	 * @model default="" required="true"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.featuremodel.ChildRelation#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see edu.kit.kastel.sdq.featuremodel.State
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

} // ChildRelation
