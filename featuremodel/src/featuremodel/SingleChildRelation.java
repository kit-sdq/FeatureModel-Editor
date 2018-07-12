/**
 */
package featuremodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Child Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link featuremodel.SingleChildRelation#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @see featuremodel.FeaturemodelPackage#getSingleChildRelation()
 * @model abstract="true"
 * @generated
 */
public interface SingleChildRelation extends ChildRelation {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference.
	 * @see #setChild(Feature)
	 * @see featuremodel.FeaturemodelPackage#getSingleChildRelation_Child()
	 * @model required="true"
	 * @generated
	 */
	Feature getChild();

	/**
	 * Sets the value of the '{@link featuremodel.SingleChildRelation#getChild <em>Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' reference.
	 * @see #getChild()
	 * @generated
	 */
	void setChild(Feature value);

} // SingleChildRelation
