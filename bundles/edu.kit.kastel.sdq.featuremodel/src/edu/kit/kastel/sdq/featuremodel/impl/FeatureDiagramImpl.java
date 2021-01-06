/**
 */
package edu.kit.kastel.sdq.featuremodel.impl;

import edu.kit.kastel.sdq.featuremodel.ChildRelation;
import edu.kit.kastel.sdq.featuremodel.Constraint;
import edu.kit.kastel.sdq.featuremodel.Feature;
import edu.kit.kastel.sdq.featuremodel.FeatureDiagram;
import edu.kit.kastel.sdq.featuremodel.FeaturemodelPackage;

import edu.kit.kastel.sdq.featuremodel.RootFeature;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.featuremodel.impl.FeatureDiagramImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.featuremodel.impl.FeatureDiagramImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.featuremodel.impl.FeatureDiagramImpl#getRootFeature <em>Root Feature</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.featuremodel.impl.FeatureDiagramImpl#getChildRelations <em>Child Relations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureDiagramImpl extends NamedElementImpl implements FeatureDiagram {
	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> constraints;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;

	/**
	 * The cached value of the '{@link #getRootFeature() <em>Root Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootFeature()
	 * @generated
	 * @ordered
	 */
	protected RootFeature rootFeature;

	/**
	 * The cached value of the '{@link #getChildRelations() <em>Child Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<ChildRelation> childRelations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturemodelPackage.Literals.FEATURE_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this,
					FeaturemodelPackage.FEATURE_DIAGRAM__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<Feature>(Feature.class, this,
					FeaturemodelPackage.FEATURE_DIAGRAM__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RootFeature getRootFeature() {
		return rootFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootFeature(RootFeature newRootFeature, NotificationChain msgs) {
		RootFeature oldRootFeature = rootFeature;
		rootFeature = newRootFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FeaturemodelPackage.FEATURE_DIAGRAM__ROOT_FEATURE, oldRootFeature, newRootFeature);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRootFeature(RootFeature newRootFeature) {
		if (newRootFeature != rootFeature) {
			NotificationChain msgs = null;
			if (rootFeature != null)
				msgs = ((InternalEObject) rootFeature).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FeaturemodelPackage.FEATURE_DIAGRAM__ROOT_FEATURE, null, msgs);
			if (newRootFeature != null)
				msgs = ((InternalEObject) newRootFeature).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FeaturemodelPackage.FEATURE_DIAGRAM__ROOT_FEATURE, null, msgs);
			msgs = basicSetRootFeature(newRootFeature, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturemodelPackage.FEATURE_DIAGRAM__ROOT_FEATURE,
					newRootFeature, newRootFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChildRelation> getChildRelations() {
		if (childRelations == null) {
			childRelations = new EObjectContainmentEList<ChildRelation>(ChildRelation.class, this,
					FeaturemodelPackage.FEATURE_DIAGRAM__CHILD_RELATIONS);
		}
		return childRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FeaturemodelPackage.FEATURE_DIAGRAM__CONSTRAINTS:
			return ((InternalEList<?>) getConstraints()).basicRemove(otherEnd, msgs);
		case FeaturemodelPackage.FEATURE_DIAGRAM__FEATURES:
			return ((InternalEList<?>) getFeatures()).basicRemove(otherEnd, msgs);
		case FeaturemodelPackage.FEATURE_DIAGRAM__ROOT_FEATURE:
			return basicSetRootFeature(null, msgs);
		case FeaturemodelPackage.FEATURE_DIAGRAM__CHILD_RELATIONS:
			return ((InternalEList<?>) getChildRelations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FeaturemodelPackage.FEATURE_DIAGRAM__CONSTRAINTS:
			return getConstraints();
		case FeaturemodelPackage.FEATURE_DIAGRAM__FEATURES:
			return getFeatures();
		case FeaturemodelPackage.FEATURE_DIAGRAM__ROOT_FEATURE:
			return getRootFeature();
		case FeaturemodelPackage.FEATURE_DIAGRAM__CHILD_RELATIONS:
			return getChildRelations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FeaturemodelPackage.FEATURE_DIAGRAM__CONSTRAINTS:
			getConstraints().clear();
			getConstraints().addAll((Collection<? extends Constraint>) newValue);
			return;
		case FeaturemodelPackage.FEATURE_DIAGRAM__FEATURES:
			getFeatures().clear();
			getFeatures().addAll((Collection<? extends Feature>) newValue);
			return;
		case FeaturemodelPackage.FEATURE_DIAGRAM__ROOT_FEATURE:
			setRootFeature((RootFeature) newValue);
			return;
		case FeaturemodelPackage.FEATURE_DIAGRAM__CHILD_RELATIONS:
			getChildRelations().clear();
			getChildRelations().addAll((Collection<? extends ChildRelation>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case FeaturemodelPackage.FEATURE_DIAGRAM__CONSTRAINTS:
			getConstraints().clear();
			return;
		case FeaturemodelPackage.FEATURE_DIAGRAM__FEATURES:
			getFeatures().clear();
			return;
		case FeaturemodelPackage.FEATURE_DIAGRAM__ROOT_FEATURE:
			setRootFeature((RootFeature) null);
			return;
		case FeaturemodelPackage.FEATURE_DIAGRAM__CHILD_RELATIONS:
			getChildRelations().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case FeaturemodelPackage.FEATURE_DIAGRAM__CONSTRAINTS:
			return constraints != null && !constraints.isEmpty();
		case FeaturemodelPackage.FEATURE_DIAGRAM__FEATURES:
			return features != null && !features.isEmpty();
		case FeaturemodelPackage.FEATURE_DIAGRAM__ROOT_FEATURE:
			return rootFeature != null;
		case FeaturemodelPackage.FEATURE_DIAGRAM__CHILD_RELATIONS:
			return childRelations != null && !childRelations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FeatureDiagramImpl
