/**
 */
package edu.kit.kastel.sdq.featuremodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiple Children Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.featuremodel.MultipleChildrenRelation#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.featuremodel.FeaturemodelPackage#getMultipleChildrenRelation()
 * @model abstract="true"
 * @generated
 */
public interface MultipleChildrenRelation extends ChildRelation {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.kastel.sdq.featuremodel.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see edu.kit.kastel.sdq.featuremodel.FeaturemodelPackage#getMultipleChildrenRelation_Children()
	 * @model required="true"
	 * @generated
	 */
	EList<Feature> getChildren();

} // MultipleChildrenRelation
