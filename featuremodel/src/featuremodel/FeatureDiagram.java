/**
 */
package featuremodel;

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
 *   <li>{@link featuremodel.FeatureDiagram#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link featuremodel.FeatureDiagram#getFeatures <em>Features</em>}</li>
 *   <li>{@link featuremodel.FeatureDiagram#getRootFeature <em>Root Feature</em>}</li>
 *   <li>{@link featuremodel.FeatureDiagram#getChildRelations <em>Child Relations</em>}</li>
 * </ul>
 *
 * @see featuremodel.FeaturemodelPackage#getFeatureDiagram()
 * @model
 * @generated
 */
public interface FeatureDiagram extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link featuremodel.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see featuremodel.FeaturemodelPackage#getFeatureDiagram_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link featuremodel.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see featuremodel.FeaturemodelPackage#getFeatureDiagram_Features()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Root Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Feature</em>' reference.
	 * @see #setRootFeature(Feature)
	 * @see featuremodel.FeaturemodelPackage#getFeatureDiagram_RootFeature()
	 * @model required="true"
	 * @generated
	 */
	Feature getRootFeature();

	/**
	 * Sets the value of the '{@link featuremodel.FeatureDiagram#getRootFeature <em>Root Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Feature</em>' reference.
	 * @see #getRootFeature()
	 * @generated
	 */
	void setRootFeature(Feature value);

	/**
	 * Returns the value of the '<em><b>Child Relations</b></em>' containment reference list.
	 * The list contents are of type {@link featuremodel.ChildRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Relations</em>' containment reference list.
	 * @see featuremodel.FeaturemodelPackage#getFeatureDiagram_ChildRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChildRelation> getChildRelations();

} // FeatureDiagram
