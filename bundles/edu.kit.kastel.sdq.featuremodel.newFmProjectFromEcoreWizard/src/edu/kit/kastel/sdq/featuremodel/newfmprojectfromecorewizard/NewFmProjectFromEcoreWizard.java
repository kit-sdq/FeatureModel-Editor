package edu.kit.kastel.sdq.featuremodel.newfmprojectfromecorewizard;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

import edu.kit.kastel.sdq.case4lang.common.SelectEcoreFilesPage;
import edu.kit.kastel.sdq.featuremodel.Feature;
import edu.kit.kastel.sdq.featuremodel.FeatureDiagram;
import edu.kit.kastel.sdq.featuremodel.FeaturemodelFactory;
import edu.kit.kastel.sdq.featuremodel.FeaturemodelPackage;
import edu.kit.kastel.sdq.featuremodel.Metamodel;
import edu.kit.kastel.sdq.featuremodel.RootFeature;
import edu.kit.kastel.sdq.featuremodel.custom.util.FMUtil;
import edu.kit.kastel.sdq.featuremodel.newfmprojectwizard.NewFMProjectWizard;

public class NewFmProjectFromEcoreWizard extends NewFMProjectWizard implements INewWizard {

	protected SelectEcoreFilesPage selectEcoreFilesPage;
	
	public NewFmProjectFromEcoreWizard() {
		super();
	}

	@Override
	protected void setRootObject() {
		EClass eClassFm = FeaturemodelPackage.eINSTANCE.getFeatureDiagram();
		EClass eClassFeature = FeaturemodelPackage.eINSTANCE.getFeature();
		EClass eClassRootFeature = FeaturemodelPackage.eINSTANCE.getRootFeature();

		rootObject = FeaturemodelFactory.eINSTANCE.create(eClassFm);
		EObject eObjectRootFeature = FeaturemodelFactory.eINSTANCE.create(eClassRootFeature);
		
		FeatureDiagram fm = (FeatureDiagram) rootObject;
		RootFeature rootFeature = (RootFeature) eObjectRootFeature;
		
		fm.setRootFeature(rootFeature);
		rootFeature.setName("Root Feature");
		fm.setRootFeature(rootFeature);
		
		IStructuredSelection selectedModels = selectEcoreFilesPage.getSelection();
		for(Object object : selectedModels) {
			IFile file = (IFile) object;
			URI uri = URI.createPlatformResourceURI(file.getFullPath().makeAbsolute().toString(), true);
			
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore",
		                new EcoreResourceFactoryImpl());
	        Resource metamodelResource = resourceSet.getResource(uri, true);
	        
	        if (metamodelResource != null && metamodelResource.getContents().size() == 1) {
	        	EObject eObjectFeature = FeaturemodelFactory.eINSTANCE.create(eClassFeature);
				Feature feature = (Feature) eObjectFeature;
				feature.setName("Feature " + file.getName());
				FMUtil.createMetamodel(FMUtil.getMainPackageByURI(uri, TransactionUtil.getEditingDomain(rootObject)), feature);
	        	fm.getFeatures().add(feature);
	        }
		}
	}
	
	@Override
	public void addPages() {
		selectEcoreFilesPage = new SelectEcoreFilesPage("selectEcoreFilesPage");
		addPage(selectEcoreFilesPage);
		newProjectCreationPage = new WizardNewProjectCreationPage("newProjectCreationPage");
		addPage(newProjectCreationPage);
	}

}
