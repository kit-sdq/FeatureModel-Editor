/**
 */
package edu.kit.kastel.sdq.featuremodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Child Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.featuremodel.SingleChildRelation#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.featuremodel.FeaturemodelPackage#getSingleChildRelation()
 * @model abstract="true"
 * @generated
 */
public interface SingleChildRelation extends ChildRelation {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference.
	 * @see #setChild(Feature)
	 * @see edu.kit.kastel.sdq.featuremodel.FeaturemodelPackage#getSingleChildRelation_Child()
	 * @model required="true"
	 * @generated
	 */
	Feature getChild();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.featuremodel.SingleChildRelation#getChild <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(Feature value);

} // SingleChildRelation
