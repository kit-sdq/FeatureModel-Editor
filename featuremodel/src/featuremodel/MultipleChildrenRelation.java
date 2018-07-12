/**
 */
package featuremodel;

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
 *   <li>{@link featuremodel.MultipleChildrenRelation#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see featuremodel.FeaturemodelPackage#getMultipleChildrenRelation()
 * @model abstract="true"
 * @generated
 */
public interface MultipleChildrenRelation extends ChildRelation {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link featuremodel.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see featuremodel.FeaturemodelPackage#getMultipleChildrenRelation_Children()
	 * @model required="true"
	 * @generated
	 */
	EList<Feature> getChildren();

} // MultipleChildrenRelation
