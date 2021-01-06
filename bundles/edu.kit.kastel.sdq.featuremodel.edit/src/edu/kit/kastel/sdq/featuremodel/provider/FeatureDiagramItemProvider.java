/**
 */
package edu.kit.kastel.sdq.featuremodel.provider;

import edu.kit.kastel.sdq.featuremodel.FeatureDiagram;
import edu.kit.kastel.sdq.featuremodel.FeaturemodelFactory;
import edu.kit.kastel.sdq.featuremodel.FeaturemodelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.kastel.sdq.featuremodel.FeatureDiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureDiagramItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureDiagramItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addRootFeaturePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Root Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRootFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FeatureDiagram_rootFeature_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FeatureDiagram_rootFeature_feature",
								"_UI_FeatureDiagram_type"),
						FeaturemodelPackage.Literals.FEATURE_DIAGRAM__ROOT_FEATURE, true, false, true, null, null,
						null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(FeaturemodelPackage.Literals.FEATURE_DIAGRAM__CONSTRAINTS);
			childrenFeatures.add(FeaturemodelPackage.Literals.FEATURE_DIAGRAM__FEATURES);
			childrenFeatures.add(FeaturemodelPackage.Literals.FEATURE_DIAGRAM__ROOT_FEATURE);
			childrenFeatures.add(FeaturemodelPackage.Literals.FEATURE_DIAGRAM__CHILD_RELATIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns FeatureDiagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FeatureDiagram"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FeatureDiagram) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_FeatureDiagram_type")
				: getString("_UI_FeatureDiagram_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(FeatureDiagram.class)) {
		case FeaturemodelPackage.FEATURE_DIAGRAM__CONSTRAINTS:
		case FeaturemodelPackage.FEATURE_DIAGRAM__FEATURES:
		case FeaturemodelPackage.FEATURE_DIAGRAM__ROOT_FEATURE:
		case FeaturemodelPackage.FEATURE_DIAGRAM__CHILD_RELATIONS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(FeaturemodelPackage.Literals.FEATURE_DIAGRAM__CONSTRAINTS,
				FeaturemodelFactory.eINSTANCE.createRequiresConstraint()));

		newChildDescriptors.add(createChildParameter(FeaturemodelPackage.Literals.FEATURE_DIAGRAM__CONSTRAINTS,
				FeaturemodelFactory.eINSTANCE.createExcludesConstraint()));

		newChildDescriptors.add(createChildParameter(FeaturemodelPackage.Literals.FEATURE_DIAGRAM__FEATURES,
				FeaturemodelFactory.eINSTANCE.createFeature()));

		newChildDescriptors.add(createChildParameter(FeaturemodelPackage.Literals.FEATURE_DIAGRAM__ROOT_FEATURE,
				FeaturemodelFactory.eINSTANCE.createRootFeature()));

		newChildDescriptors.add(createChildParameter(FeaturemodelPackage.Literals.FEATURE_DIAGRAM__CHILD_RELATIONS,
				FeaturemodelFactory.eINSTANCE.createMandatoryRelation()));

		newChildDescriptors.add(createChildParameter(FeaturemodelPackage.Literals.FEATURE_DIAGRAM__CHILD_RELATIONS,
				FeaturemodelFactory.eINSTANCE.createOptionalRelation()));

		newChildDescriptors.add(createChildParameter(FeaturemodelPackage.Literals.FEATURE_DIAGRAM__CHILD_RELATIONS,
				FeaturemodelFactory.eINSTANCE.createOrRelation()));

		newChildDescriptors.add(createChildParameter(FeaturemodelPackage.Literals.FEATURE_DIAGRAM__CHILD_RELATIONS,
				FeaturemodelFactory.eINSTANCE.createAlternativeRelation()));
	}

}
