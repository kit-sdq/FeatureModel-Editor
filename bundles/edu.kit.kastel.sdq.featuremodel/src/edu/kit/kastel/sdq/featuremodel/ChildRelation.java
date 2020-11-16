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
	 * @see #setParent(Feature)
	 * @see edu.kit.kastel.sdq.featuremodel.FeaturemodelPackage#getChildRelation_Parent()
	 * @model required="true"
	 * @generated
	 */
	Feature getParent();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.featuremodel.ChildRelation#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Feature value);

} // ChildRelation
