package edu.kit.kastel.sdq.featuremodel.newfmprojectfromecorewizard;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

import edu.kit.kastel.sdq.case4lang.newprojectwizard.FileUtils;
import edu.kit.kastel.sdq.case4lang.newprojectwizard.SelectProjectsPage;
import edu.kit.kastel.sdq.featuremodel.Feature;
import edu.kit.kastel.sdq.featuremodel.FeatureDiagram;
import edu.kit.kastel.sdq.featuremodel.FeaturemodelFactory;
import edu.kit.kastel.sdq.featuremodel.FeaturemodelPackage;
import edu.kit.kastel.sdq.featuremodel.Metamodel;
import edu.kit.kastel.sdq.featuremodel.newfmprojectwizard.NewFMProjectWizard;

public class NewFmProjectFromEcoreWizard extends NewFMProjectWizard implements INewWizard {

	protected SelectProjectsPage selectProjectsPage;
	
	public NewFmProjectFromEcoreWizard() {
		super();
	}

	@Override
	protected void setRootObject() {
		EClass eClassFm = FeaturemodelPackage.eINSTANCE.getFeatureDiagram();
		EClass eClassFeature = FeaturemodelPackage.eINSTANCE.getFeature();
		EClass eClassMetamodel = FeaturemodelPackage.eINSTANCE.getMetamodel();

		rootObject = FeaturemodelFactory.eINSTANCE.create(eClassFm);
		EObject eObjectRootFeature = FeaturemodelFactory.eINSTANCE.create(eClassFeature);
		
		FeatureDiagram fm = (FeatureDiagram) rootObject;
		Feature rootFeature = (Feature) eObjectRootFeature;
		
		fm.getFeatures().add(rootFeature);
		rootFeature.setName("Root Feature");
		fm.setRootFeature(rootFeature);
		
		IStructuredSelection selectedModels = selectProjectsPage.getSelection();
		int index = 0;
		for(Object object : selectedModels) {
			try {
				IProject project = (IProject) object;
				IFolder folder = project.getFolder("model");
				folder.getFile("*.ecore");
				
				ResourceSet resourceSet = new ResourceSetImpl();
				resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore",
			                new EcoreResourceFactoryImpl());

				for(IResource fileResource : folder.members()) {
					if(fileResource.getFileExtension().equals("ecore")) {
				        URI uri = URI.createPlatformResourceURI(fileResource.getFullPath().makeAbsolute().toString(), true);
				        Resource metamodelResource = resourceSet.getResource(uri, true);
				        if (metamodelResource != null && metamodelResource.getContents().size() == 1) {
				        	EObject eObjectFeature = FeaturemodelFactory.eINSTANCE.create(eClassFeature);
							Feature feature = (Feature) eObjectFeature;
							feature.setName("Feature " + index);
							index++;
							EObject eObjectMetamodel = FeaturemodelFactory.eINSTANCE.create(eClassMetamodel);
							Metamodel metamodel = (Metamodel) eObjectMetamodel;
							metamodel.setName(fileResource.getName());
							feature.setMetamodel(metamodel);
				        	fm.getFeatures().add(feature);
				        }
					}
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void addPages() {
		selectProjectsPage = new SelectProjectsPage("selectProjectsPage");
		addPage(selectProjectsPage);
		newProjectCreationPage = new WizardNewProjectCreationPage("newProjectCreationPage");
		addPage(newProjectCreationPage);
	}

}
