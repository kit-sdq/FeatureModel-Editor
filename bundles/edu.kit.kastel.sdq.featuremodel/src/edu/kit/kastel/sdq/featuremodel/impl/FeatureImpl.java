/**
 */
package edu.kit.kastel.sdq.featuremodel.impl;

import edu.kit.kastel.sdq.featuremodel.Feature;
import edu.kit.kastel.sdq.featuremodel.FeaturemodelPackage;

import edu.kit.kastel.sdq.featuremodel.Metamodel;
import edu.kit.kastel.sdq.featuremodel.SimulatorComponent;
import edu.kit.kastel.sdq.featuremodel.State;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.featuremodel.impl.FeatureImpl#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.featuremodel.impl.FeatureImpl#getSimulatorcomponent <em>Simulatorcomponent</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.featuremodel.impl.FeatureImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureImpl extends AbstractFeatureImpl implements Feature {
	/**
	 * The cached value of the '{@link #getMetamodel() <em>Metamodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodel()
	 * @generated
	 * @ordered
	 */
	protected Metamodel metamodel;

	/**
	 * The cached value of the '{@link #getSimulatorcomponent() <em>Simulatorcomponent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulatorcomponent()
	 * @generated
	 * @ordered
	 */
	protected SimulatorComponent simulatorcomponent;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final State STATE_EDEFAULT = State.IN;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected State state = STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturemodelPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Metamodel getMetamodel() {
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetamodel(Metamodel newMetamodel, NotificationChain msgs) {
		Metamodel oldMetamodel = metamodel;
		metamodel = newMetamodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FeaturemodelPackage.FEATURE__METAMODEL, oldMetamodel, newMetamodel);
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
	public void setMetamodel(Metamodel newMetamodel) {
		if (newMetamodel != metamodel) {
			NotificationChain msgs = null;
			if (metamodel != null)
				msgs = ((InternalEObject) metamodel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FeaturemodelPackage.FEATURE__METAMODEL, null, msgs);
			if (newMetamodel != null)
				msgs = ((InternalEObject) newMetamodel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FeaturemodelPackage.FEATURE__METAMODEL, null, msgs);
			msgs = basicSetMetamodel(newMetamodel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturemodelPackage.FEATURE__METAMODEL, newMetamodel,
					newMetamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimulatorComponent getSimulatorcomponent() {
		return simulatorcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimulatorcomponent(SimulatorComponent newSimulatorcomponent,
			NotificationChain msgs) {
		SimulatorComponent oldSimulatorcomponent = simulatorcomponent;
		simulatorcomponent = newSimulatorcomponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FeaturemodelPackage.FEATURE__SIMULATORCOMPONENT, oldSimulatorcomponent, newSimulatorcomponent);
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
	public void setSimulatorcomponent(SimulatorComponent newSimulatorcomponent) {
		if (newSimulatorcomponent != simulatorcomponent) {
			NotificationChain msgs = null;
			if (simulatorcomponent != null)
				msgs = ((InternalEObject) simulatorcomponent).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FeaturemodelPackage.FEATURE__SIMULATORCOMPONENT, null, msgs);
			if (newSimulatorcomponent != null)
				msgs = ((InternalEObject) newSimulatorcomponent).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FeaturemodelPackage.FEATURE__SIMULATORCOMPONENT, null, msgs);
			msgs = basicSetSimulatorcomponent(newSimulatorcomponent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturemodelPackage.FEATURE__SIMULATORCOMPONENT,
					newSimulatorcomponent, newSimulatorcomponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(State newState) {
		State oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeaturemodelPackage.FEATURE__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FeaturemodelPackage.FEATURE__METAMODEL:
			return basicSetMetamodel(null, msgs);
		case FeaturemodelPackage.FEATURE__SIMULATORCOMPONENT:
			return basicSetSimulatorcomponent(null, msgs);
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
		case FeaturemodelPackage.FEATURE__METAMODEL:
			return getMetamodel();
		case FeaturemodelPackage.FEATURE__SIMULATORCOMPONENT:
			return getSimulatorcomponent();
		case FeaturemodelPackage.FEATURE__STATE:
			return getState();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FeaturemodelPackage.FEATURE__METAMODEL:
			setMetamodel((Metamodel) newValue);
			return;
		case FeaturemodelPackage.FEATURE__SIMULATORCOMPONENT:
			setSimulatorcomponent((SimulatorComponent) newValue);
			return;
		case FeaturemodelPackage.FEATURE__STATE:
			setState((State) newValue);
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
		case FeaturemodelPackage.FEATURE__METAMODEL:
			setMetamodel((Metamodel) null);
			return;
		case FeaturemodelPackage.FEATURE__SIMULATORCOMPONENT:
			setSimulatorcomponent((SimulatorComponent) null);
			return;
		case FeaturemodelPackage.FEATURE__STATE:
			setState(STATE_EDEFAULT);
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
		case FeaturemodelPackage.FEATURE__METAMODEL:
			return metamodel != null;
		case FeaturemodelPackage.FEATURE__SIMULATORCOMPONENT:
			return simulatorcomponent != null;
		case FeaturemodelPackage.FEATURE__STATE:
			return state != STATE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (state: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

} //FeatureImpl
