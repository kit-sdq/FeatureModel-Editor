/**
 */
package edu.kit.kastel.sdq.featuremodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.sdq.featuremodel.FeaturemodelFactory
 * @model kind="package"
 * @generated
 */
public interface FeaturemodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "featuremodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/featuremodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "featuremodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeaturemodelPackage eINSTANCE = edu.kit.kastel.sdq.featuremodel.impl.FeaturemodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.featuremodel.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.featuremodel.impl.NamedElementImpl
	 * @see edu.kit.kastel.sdq.featuremodel.impl.FeaturemodelPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.featuremodel.impl.FeatureDiagramImpl <em>Feature Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.featuremodel.impl.FeatureDiagramImpl
	 * @see edu.kit.kastel.sdq.featuremodel.impl.FeaturemodelPackageImpl#getFeatureDiagram()
	 * @generated
	 */
	int FEATURE_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DIAGRAM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DIAGRAM__CONSTRAINTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DIAGRAM__FEATURES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Root Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DIAGRAM__ROOT_FEATURE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Child Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DIAGRAM__CHILD_RELATIONS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Feature Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DIAGRAM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.featuremodel.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.featuremodel.impl.FeatureImpl
	 * @see edu.kit.kastel.sdq.featuremodel.impl.FeaturemodelPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__METAMODEL = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.featuremodel.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.featuremodel.impl.ConstraintImpl
	 * @see edu.kit.kastel.sdq.featuremodel.impl.FeaturemodelPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.featuremodel.impl.ChildRelationImpl <em>Child Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.featuremodel.impl.ChildRelationImpl
	 * @see edu.kit.kastel.sdq.featuremodel.impl.FeaturemodelPackageImpl#getChildRelation()
	 * @generated
	 */
	int CHILD_RELATION = 3;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATION__PARENT = 0;

	/**
	 * The number of structural features of the '<em>Child Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHILD_RELATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.featuremodel.impl.SingleChildRelationImpl <em>Single Child Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.featuremodel.impl.SingleChildRelationImpl
	 * @see edu.kit.kastel.sdq.featuremodel.impl.FeaturemodelPackageImpl#getSingleChildRelation()
	 * @generated
	 */
	int SINGLE_CHILD_RELATION = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHILD_RELATION__PARENT = CHILD_RELATION__PARENT;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHILD_RELATION__CHILD = CHILD_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single Child Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHILD_RELATION_FEATURE_COUNT = CHILD_RELATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.featuremodel.impl.MultipleChildrenRelationImpl <em>Multiple Children Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.featuremodel.impl.MultipleChildrenRelationImpl
	 * @see edu.kit.kastel.sdq.featuremodel.impl.FeaturemodelPackageImpl#getMultipleChildrenRelation()
	 * @generated
	 */
	int MULTIPLE_CHILDREN_RELATION = 5;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHILDREN_RELATION__PARENT = CHILD_RELATION__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHILDREN_RELATION__CHILDREN = CHILD_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiple Children Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHILDREN_RELATION_FEATURE_COUNT = CHILD_RELATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.featuremodel.impl.RequiresConstraintImpl <em>Requires Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.featuremodel.impl.RequiresConstraintImpl
	 * @see edu.kit.kastel.sdq.featuremodel.impl.FeaturemodelPackageImpl#getRequiresConstraint()
	 * @generated
	 */
	int REQUIRES_CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_CONSTRAINT__SOURCE = CONSTRAINT__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_CONSTRAINT__TARGET = CONSTRAINT__TARGET;

	/**
	 * The number of structural features of the '<em>Requires Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.featuremodel.impl.ExcludesConstraintImpl <em>Excludes Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.featuremodel.impl.ExcludesConstraintImpl
	 * @see edu.kit.kastel.sdq.featuremodel.impl.FeaturemodelPackageImpl#getExcludesConstraint()
	 * @generated
	 */
	int EXCLUDES_CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDES_CONSTRAINT__SOURCE = CONSTRAINT__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDES_CONSTRAINT__TARGET = CONSTRAINT__TARGET;

	/**
	 * The number of structural features of the '<em>Excludes Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDES_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.featuremodel.impl.MandatoryRelationImpl <em>Mandatory Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.featuremodel.impl.MandatoryRelationImpl
	 * @see edu.kit.kastel.sdq.featuremodel.impl.FeaturemodelPackageImpl#getMandatoryRelation()
	 * @generated
	 */
	int MANDATORY_RELATION = 8;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_RELATION__PARENT = SINGLE_CHILD_RELATION__PARENT;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_RELATION__CHILD = SINGLE_CHILD_RELATION__CHILD;

	/**
	 * The number of structural features of the '<em>Mandatory Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_RELATION_FEATURE_COUNT = SINGLE_CHILD_RELATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.featuremodel.impl.OptionalRelationImpl <em>Optional Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.featuremodel.impl.OptionalRelationImpl
	 * @see edu.kit.kastel.sdq.featuremodel.impl.FeaturemodelPackageImpl#getOptionalRelation()
	 * @generated
	 */
	int OPTIONAL_RELATION = 9;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_RELATION__PARENT = SINGLE_CHILD_RELATION__PARENT;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_RELATION__CHILD = SINGLE_CHILD_RELATION__CHILD;

	/**
	 * The number of structural features of the '<em>Optional Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_RELATION_FEATURE_COUNT = SINGLE_CHILD_RELATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.featuremodel.impl.OrRelationImpl <em>Or Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.featuremodel.impl.OrRelationImpl
	 * @see edu.kit.kastel.sdq.featuremodel.impl.FeaturemodelPackageImpl#getOrRelation()
	 * @generated
	 */
	int OR_RELATION = 10;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_RELATION__PARENT = MULTIPLE_CHILDREN_RELATION__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_RELATION__CHILDREN = MULTIPLE_CHILDREN_RELATION__CHILDREN;

	/**
	 * The number of structural features of the '<em>Or Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_RELATION_FEATURE_COUNT = MULTIPLE_CHILDREN_RELATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.featuremodel.impl.AlternativeRelationImpl <em>Alternative Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.featuremodel.impl.AlternativeRelationImpl
	 * @see edu.kit.kastel.sdq.featuremodel.impl.FeaturemodelPackageImpl#getAlternativeRelation()
	 * @generated
	 */
	int ALTERNATIVE_RELATION = 11;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_RELATION__PARENT = MULTIPLE_CHILDREN_RELATION__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_RELATION__CHILDREN = MULTIPLE_CHILDREN_RELATION__CHILDREN;

	/**
	 * The number of structural features of the '<em>Alternative Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_RELATION_FEATURE_COUNT = MULTIPLE_CHILDREN_RELATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.sdq.featuremodel.impl.MetamodelImpl <em>Metamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.sdq.featuremodel.impl.MetamodelImpl
	 * @see edu.kit.kastel.sdq.featuremodel.impl.FeaturemodelPackageImpl#getMetamodel()
	 * @generated
	 */
	int METAMODEL = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_FEATURE_COUNT = 1;

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.featuremodel.FeatureDiagram <em>Feature Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Diagram</em>'.
	 * @see edu.kit.kastel.sdq.featuremodel.FeatureDiagram
	 * @generated
	 */
	EClass getFeatureDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.featuremodel.FeatureDiagram#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see edu.kit.kastel.sdq.featuremodel.FeatureDiagram#getConstraints()
	 * @see #getFeatureDiagram()
	 * @generated
	 */
	EReference getFeatureDiagram_Constraints();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.featuremodel.FeatureDiagram#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see edu.kit.kastel.sdq.featuremodel.FeatureDiagram#getFeatures()
	 * @see #getFeatureDiagram()
	 * @generated
	 */
	EReference getFeatureDiagram_Features();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.featuremodel.FeatureDiagram#getRootFeature <em>Root Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Feature</em>'.
	 * @see edu.kit.kastel.sdq.featuremodel.FeatureDiagram#getRootFeature()
	 * @see #getFeatureDiagram()
	 * @generated
	 */
	EReference getFeatureDiagram_RootFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.sdq.featuremodel.FeatureDiagram#getChildRelations <em>Child Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Relations</em>'.
	 * @see edu.kit.kastel.sdq.featuremodel.FeatureDiagram#getChildRelations()
	 * @see #getFeatureDiagram()
	 * @generated
	 */
	EReference getFeatureDiagram_ChildRelations();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.featuremodel.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see edu.kit.kastel.sdq.featuremodel.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.kastel.sdq.featuremodel.Feature#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metamodel</em>'.
	 * @see edu.kit.kastel.sdq.featuremodel.Feature#getMetamodel()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Metamodel();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.featuremodel.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see edu.kit.kastel.sdq.featuremodel.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.featuremodel.Constraint#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see edu.kit.kastel.sdq.featuremodel.Constraint#getSource()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Source();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.featuremodel.Constraint#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see edu.kit.kastel.sdq.featuremodel.Constraint#getTarget()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Target();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.featuremodel.ChildRelation <em>Child Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Child Relation</em>'.
	 * @see edu.kit.kastel.sdq.featuremodel.ChildRelation
	 * @generated
	 */
	EClass getChildRelation();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.featuremodel.ChildRelation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see edu.kit.kastel.sdq.featuremodel.ChildRelation#getParent()
	 * @see #getChildRelation()
	 * @generated
	 */
	EReference getChildRelation_Parent();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.featuremodel.SingleChildRelation <em>Single Child Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Child Relation</em>'.
	 * @see edu.kit.kastel.sdq.featuremodel.SingleChildRelation
	 * @generated
	 */
	EClass getSingleChildRelation();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.sdq.featuremodel.SingleChildRelation#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Child</em>'.
	 * @see edu.kit.kastel.sdq.featuremodel.SingleChildRelation#getChild()
	 * @see #getSingleChildRelation()
	 * @generated
	 */
	EReference getSingleChildRelation_Child();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.featuremodel.MultipleChildrenRelation <em>Multiple Children Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Children Relation</em>'.
	 * @see edu.kit.kastel.sdq.featuremodel.MultipleChildrenRelation
	 * @generated
	 */
	EClass getMultipleChildrenRelation();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.sdq.featuremodel.MultipleChildrenRelation#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see edu.kit.kastel.sdq.featuremodel.MultipleChildrenRelation#getChildren()
	 * @see #getMultipleChildrenRelation()
	 * @generated
	 */
	EReference getMultipleChildrenRelation_Children();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.featuremodel.RequiresConstraint <em>Requires Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requires Constraint</em>'.
	 * @see edu.kit.kastel.sdq.featuremodel.RequiresConstraint
	 * @generated
	 */
	EClass getRequiresConstraint();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.featuremodel.ExcludesConstraint <em>Excludes Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Excludes Constraint</em>'.
	 * @see edu.kit.kastel.sdq.featuremodel.ExcludesConstraint
	 * @generated
	 */
	EClass getExcludesConstraint();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.featuremodel.MandatoryRelation <em>Mandatory Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mandatory Relation</em>'.
	 * @see edu.kit.kastel.sdq.featuremodel.MandatoryRelation
	 * @generated
	 */
	EClass getMandatoryRelation();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.featuremodel.OptionalRelation <em>Optional Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optional Relation</em>'.
	 * @see edu.kit.kastel.sdq.featuremodel.OptionalRelation
	 * @generated
	 */
	EClass getOptionalRelation();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.featuremodel.OrRelation <em>Or Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Relation</em>'.
	 * @see edu.kit.kastel.sdq.featuremodel.OrRelation
	 * @generated
	 */
	EClass getOrRelation();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.featuremodel.AlternativeRelation <em>Alternative Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative Relation</em>'.
	 * @see edu.kit.kastel.sdq.featuremodel.AlternativeRelation
	 * @generated
	 */
	EClass getAlternativeRelation();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.featuremodel.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see edu.kit.kastel.sdq.featuremodel.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.featuremodel.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.kastel.sdq.featuremodel.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.sdq.featuremodel.Metamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel</em>'.
	 * @see edu.kit.kastel.sdq.featuremodel.Metamodel
	 * @generated
	 */
	EClass getMetamodel();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.sdq.featuremodel.Metamodel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.kastel.sdq.featuremodel.Metamodel#getName()
	 * @see #getMetamodel()
	 * @generated
	 */
	EAttribute getMetamodel_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FeaturemodelFactory getFeaturemodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.featuremodel.impl.FeatureDiagramImpl <em>Feature Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.featuremodel.impl.FeatureDiagramImpl
		 * @see edu.kit.kastel.sdq.featuremodel.impl.FeaturemodelPackageImpl#getFeatureDiagram()
		 * @generated
		 */
		EClass FEATURE_DIAGRAM = eINSTANCE.getFeatureDiagram();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_DIAGRAM__CONSTRAINTS = eINSTANCE.getFeatureDiagram_Constraints();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_DIAGRAM__FEATURES = eINSTANCE.getFeatureDiagram_Features();

		/**
		 * The meta object literal for the '<em><b>Root Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_DIAGRAM__ROOT_FEATURE = eINSTANCE.getFeatureDiagram_RootFeature();

		/**
		 * The meta object literal for the '<em><b>Child Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_DIAGRAM__CHILD_RELATIONS = eINSTANCE.getFeatureDiagram_ChildRelations();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.featuremodel.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.featuremodel.impl.FeatureImpl
		 * @see edu.kit.kastel.sdq.featuremodel.impl.FeaturemodelPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Metamodel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__METAMODEL = eINSTANCE.getFeature_Metamodel();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.featuremodel.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.featuremodel.impl.ConstraintImpl
		 * @see edu.kit.kastel.sdq.featuremodel.impl.FeaturemodelPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__SOURCE = eINSTANCE.getConstraint_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__TARGET = eINSTANCE.getConstraint_Target();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.featuremodel.impl.ChildRelationImpl <em>Child Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.featuremodel.impl.ChildRelationImpl
		 * @see edu.kit.kastel.sdq.featuremodel.impl.FeaturemodelPackageImpl#getChildRelation()
		 * @generated
		 */
		EClass CHILD_RELATION = eINSTANCE.getChildRelation();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHILD_RELATION__PARENT = eINSTANCE.getChildRelation_Parent();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.featuremodel.impl.SingleChildRelationImpl <em>Single Child Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.featuremodel.impl.SingleChildRelationImpl
		 * @see edu.kit.kastel.sdq.featuremodel.impl.FeaturemodelPackageImpl#getSingleChildRelation()
		 * @generated
		 */
		EClass SINGLE_CHILD_RELATION = eINSTANCE.getSingleChildRelation();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_CHILD_RELATION__CHILD = eINSTANCE.getSingleChildRelation_Child();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.featuremodel.impl.MultipleChildrenRelationImpl <em>Multiple Children Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.featuremodel.impl.MultipleChildrenRelationImpl
		 * @see edu.kit.kastel.sdq.featuremodel.impl.FeaturemodelPackageImpl#getMultipleChildrenRelation()
		 * @generated
		 */
		EClass MULTIPLE_CHILDREN_RELATION = eINSTANCE.getMultipleChildrenRelation();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLE_CHILDREN_RELATION__CHILDREN = eINSTANCE.getMultipleChildrenRelation_Children();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.featuremodel.impl.RequiresConstraintImpl <em>Requires Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.featuremodel.impl.RequiresConstraintImpl
		 * @see edu.kit.kastel.sdq.featuremodel.impl.FeaturemodelPackageImpl#getRequiresConstraint()
		 * @generated
		 */
		EClass REQUIRES_CONSTRAINT = eINSTANCE.getRequiresConstraint();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.featuremodel.impl.ExcludesConstraintImpl <em>Excludes Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.featuremodel.impl.ExcludesConstraintImpl
		 * @see edu.kit.kastel.sdq.featuremodel.impl.FeaturemodelPackageImpl#getExcludesConstraint()
		 * @generated
		 */
		EClass EXCLUDES_CONSTRAINT = eINSTANCE.getExcludesConstraint();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.featuremodel.impl.MandatoryRelationImpl <em>Mandatory Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.featuremodel.impl.MandatoryRelationImpl
		 * @see edu.kit.kastel.sdq.featuremodel.impl.FeaturemodelPackageImpl#getMandatoryRelation()
		 * @generated
		 */
		EClass MANDATORY_RELATION = eINSTANCE.getMandatoryRelation();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.featuremodel.impl.OptionalRelationImpl <em>Optional Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.featuremodel.impl.OptionalRelationImpl
		 * @see edu.kit.kastel.sdq.featuremodel.impl.FeaturemodelPackageImpl#getOptionalRelation()
		 * @generated
		 */
		EClass OPTIONAL_RELATION = eINSTANCE.getOptionalRelation();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.featuremodel.impl.OrRelationImpl <em>Or Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.featuremodel.impl.OrRelationImpl
		 * @see edu.kit.kastel.sdq.featuremodel.impl.FeaturemodelPackageImpl#getOrRelation()
		 * @generated
		 */
		EClass OR_RELATION = eINSTANCE.getOrRelation();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.featuremodel.impl.AlternativeRelationImpl <em>Alternative Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.featuremodel.impl.AlternativeRelationImpl
		 * @see edu.kit.kastel.sdq.featuremodel.impl.FeaturemodelPackageImpl#getAlternativeRelation()
		 * @generated
		 */
		EClass ALTERNATIVE_RELATION = eINSTANCE.getAlternativeRelation();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.featuremodel.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.featuremodel.impl.NamedElementImpl
		 * @see edu.kit.kastel.sdq.featuremodel.impl.FeaturemodelPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.sdq.featuremodel.impl.MetamodelImpl <em>Metamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.sdq.featuremodel.impl.MetamodelImpl
		 * @see edu.kit.kastel.sdq.featuremodel.impl.FeaturemodelPackageImpl#getMetamodel()
		 * @generated
		 */
		EClass METAMODEL = eINSTANCE.getMetamodel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METAMODEL__NAME = eINSTANCE.getMetamodel_Name();

	}

} //FeaturemodelPackage
