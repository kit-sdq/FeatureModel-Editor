package edu.kit.kastel.sdq.featuremodel.newfmprojectwizard;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.INewWizard;

import edu.kit.kastel.sdq.case4lang.newprojectwizard.NewProjectWizard;
import edu.kit.kastel.sdq.featuremodel.Feature;
import edu.kit.kastel.sdq.featuremodel.FeatureDiagram;
import edu.kit.kastel.sdq.featuremodel.FeaturemodelFactory;
import edu.kit.kastel.sdq.featuremodel.FeaturemodelPackage;
import edu.kit.kastel.sdq.featuremodel.presentation.FeaturemodelEditorPlugin;

public class NewFMProjectWizard extends NewProjectWizard implements INewWizard {

	public NewFMProjectWizard() {
		super();
	}

	@Override
	protected String getDefaultRepresentationName() {
		return "FeatureModel Diagram";
	}

	@Override
	protected void setRootObject() {
		EClass eClassFeatureDiagram = FeaturemodelPackage.eINSTANCE.getFeatureDiagram();
		EClass eClassRootFeature = FeaturemodelPackage.eINSTANCE.getFeature();
		rootObject = FeaturemodelFactory.eINSTANCE.create(eClassFeatureDiagram);
		EObject eObjectRootFeature = FeaturemodelFactory.eINSTANCE.create(eClassRootFeature);
		
		FeatureDiagram featureDiagram = (FeatureDiagram) rootObject;
		Feature rootFeature = (Feature) eObjectRootFeature;
		
		featureDiagram.setRootFeature(rootFeature);
		rootFeature.setName("Root Feature");
		featureDiagram.getFeatures().add(rootFeature);
		

	}

	@Override
	protected String getDefaultModelFileNameWithExtension() {
		return "My.featuremodel";
	}

	@Override
	protected String getDefaultRepresentationsFileNameWithExtension() {
		return "My.aird";
	}

	@Override
	protected String getEncoding() {
		return "UTF-8";
	}

	@Override
	protected EMFPlugin getEditorPlugin() {
		return FeaturemodelEditorPlugin.INSTANCE;
	}

	@Override
	protected String getRepresentationViewpoint() {
		return "featuremodel.viewpoint";
	}

	@Override
	protected String getDefaultPageImageDescriptorName() {
		return "NewFeaturemodel";
	}

}
