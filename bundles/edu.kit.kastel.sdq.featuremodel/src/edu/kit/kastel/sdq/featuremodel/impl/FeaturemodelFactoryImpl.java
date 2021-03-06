/**
 */
package edu.kit.kastel.sdq.featuremodel.impl;

import edu.kit.kastel.sdq.featuremodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeaturemodelFactoryImpl extends EFactoryImpl implements FeaturemodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FeaturemodelFactory init() {
		try {
			FeaturemodelFactory theFeaturemodelFactory = (FeaturemodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(FeaturemodelPackage.eNS_URI);
			if (theFeaturemodelFactory != null) {
				return theFeaturemodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FeaturemodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturemodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case FeaturemodelPackage.FEATURE_DIAGRAM:
			return createFeatureDiagram();
		case FeaturemodelPackage.REQUIRES_CONSTRAINT:
			return createRequiresConstraint();
		case FeaturemodelPackage.EXCLUDES_CONSTRAINT:
			return createExcludesConstraint();
		case FeaturemodelPackage.MANDATORY_RELATION:
			return createMandatoryRelation();
		case FeaturemodelPackage.OPTIONAL_RELATION:
			return createOptionalRelation();
		case FeaturemodelPackage.OR_RELATION:
			return createOrRelation();
		case FeaturemodelPackage.ALTERNATIVE_RELATION:
			return createAlternativeRelation();
		case FeaturemodelPackage.METAMODEL:
			return createMetamodel();
		case FeaturemodelPackage.ROOT_FEATURE:
			return createRootFeature();
		case FeaturemodelPackage.FEATURE:
			return createFeature();
		case FeaturemodelPackage.SIMULATOR_COMPONENT:
			return createSimulatorComponent();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case FeaturemodelPackage.STATE:
			return createStateFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case FeaturemodelPackage.STATE:
			return convertStateToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureDiagram createFeatureDiagram() {
		FeatureDiagramImpl featureDiagram = new FeatureDiagramImpl();
		return featureDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimulatorComponent createSimulatorComponent() {
		SimulatorComponentImpl simulatorComponent = new SimulatorComponentImpl();
		return simulatorComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createStateFromString(EDataType eDataType, String initialValue) {
		State result = State.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequiresConstraint createRequiresConstraint() {
		RequiresConstraintImpl requiresConstraint = new RequiresConstraintImpl();
		return requiresConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExcludesConstraint createExcludesConstraint() {
		ExcludesConstraintImpl excludesConstraint = new ExcludesConstraintImpl();
		return excludesConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MandatoryRelation createMandatoryRelation() {
		MandatoryRelationImpl mandatoryRelation = new MandatoryRelationImpl();
		return mandatoryRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OptionalRelation createOptionalRelation() {
		OptionalRelationImpl optionalRelation = new OptionalRelationImpl();
		return optionalRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrRelation createOrRelation() {
		OrRelationImpl orRelation = new OrRelationImpl();
		return orRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlternativeRelation createAlternativeRelation() {
		AlternativeRelationImpl alternativeRelation = new AlternativeRelationImpl();
		return alternativeRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Metamodel createMetamodel() {
		MetamodelImpl metamodel = new MetamodelImpl();
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RootFeature createRootFeature() {
		RootFeatureImpl rootFeature = new RootFeatureImpl();
		return rootFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeaturemodelPackage getFeaturemodelPackage() {
		return (FeaturemodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FeaturemodelPackage getPackage() {
		return FeaturemodelPackage.eINSTANCE;
	}

} //FeaturemodelFactoryImpl
