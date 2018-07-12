/**
 */
package featuremodel.impl;

import featuremodel.*;

import org.eclipse.emf.ecore.EClass;
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
		case FeaturemodelPackage.FEATURE:
			return createFeature();
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
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureDiagram createFeatureDiagram() {
		FeatureDiagramImpl featureDiagram = new FeatureDiagramImpl();
		return featureDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiresConstraint createRequiresConstraint() {
		RequiresConstraintImpl requiresConstraint = new RequiresConstraintImpl();
		return requiresConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcludesConstraint createExcludesConstraint() {
		ExcludesConstraintImpl excludesConstraint = new ExcludesConstraintImpl();
		return excludesConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandatoryRelation createMandatoryRelation() {
		MandatoryRelationImpl mandatoryRelation = new MandatoryRelationImpl();
		return mandatoryRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionalRelation createOptionalRelation() {
		OptionalRelationImpl optionalRelation = new OptionalRelationImpl();
		return optionalRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrRelation createOrRelation() {
		OrRelationImpl orRelation = new OrRelationImpl();
		return orRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlternativeRelation createAlternativeRelation() {
		AlternativeRelationImpl alternativeRelation = new AlternativeRelationImpl();
		return alternativeRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
