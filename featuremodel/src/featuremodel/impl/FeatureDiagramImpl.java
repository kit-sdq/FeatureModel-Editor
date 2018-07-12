/**
 */
package featuremodel.impl;

import featuremodel.ChildRelation;
import featuremodel.Constraint;
import featuremodel.Feature;
import featuremodel.FeatureDiagram;
import featuremodel.FeaturemodelPackage;

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
 *   <li>{@link featuremodel.impl.FeatureDiagramImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link featuremodel.impl.FeatureDiagramImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link featuremodel.impl.FeatureDiagramImpl#getRootFeature <em>Root Feature</em>}</li>
 *   <li>{@link featuremodel.impl.FeatureDiagramImpl#getChildRelations <em>Child Relations</em>}</li>
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
	 * The cached value of the '{@link #getRootFeature() <em>Root Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature rootFeature;

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
	public Feature getRootFeature() {
		if (rootFeature != null && rootFeature.eIsProxy()) {
			InternalEObject oldRootFeature = (InternalEObject) rootFeature;
			rootFeature = (Feature) eResolveProxy(oldRootFeature);
			if (rootFeature != oldRootFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FeaturemodelPackage.FEATURE_DIAGRAM__ROOT_FEATURE, oldRootFeature, rootFeature));
			}
		}
		return rootFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetRootFeature() {
		return rootFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootFeature(Feature newRootFeature) {
		Feature oldRootFeature = rootFeature;
		rootFeature = newRootFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturemodelPackage.FEATURE_DIAGRAM__ROOT_FEATURE,
					oldRootFeature, rootFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			if (resolve)
				return getRootFeature();
			return basicGetRootFeature();
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
			setRootFeature((Feature) newValue);
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
			setRootFeature((Feature) null);
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
