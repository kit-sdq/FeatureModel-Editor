package edu.kit.kastel.sdq.featuremodel.custom.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;

import edu.kit.kastel.sdq.case4lang.common.FileUtils;
import edu.kit.kastel.sdq.featuremodel.Feature;
import edu.kit.kastel.sdq.featuremodel.FeatureDiagram;
import edu.kit.kastel.sdq.featuremodel.FeaturemodelFactory;
import edu.kit.kastel.sdq.featuremodel.Metamodel;
import edu.kit.kastel.sdq.featuremodel.SimulatorComponent;

public class FMUtil {

	/**
	 * Returns the main {@link EPackage} at the specified {@link URI} and loads it in the {@link ResourceSet} of the
	 * {@link TransactionalEditingDomain} if is not already loaded
	 * 
	 * @param uri the uri where the resource can be found
	 * @param editingDomain the current transactional editing domain, in which the resource should be loaded
	 * @return the main EPackage of the metamodel at the URI
	 */
	public static EPackage getMainPackageByURI(URI uri, TransactionalEditingDomain editingDomain) {
		ResourceSet resourceSet;
		if(editingDomain != null) {
			resourceSet = editingDomain.getResourceSet();
		} else {
			resourceSet = new ResourceSetImpl();
		}
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore",
				new EcoreResourceFactoryImpl());

		Resource metamodelResource = resourceSet.getResource(uri, true);

		if (metamodelResource == null || metamodelResource.getContents().size() != 1) {
			System.out.println("Could not load resource with URI " + uri.toString());
			return null;
		}
		else {
			return (EPackage) metamodelResource.getContents().get(0);
		}
	}

	/**
	 * Creates a {@link Metamodel} in the given layer and with the given main package 
	 * @param mainPackage the main package of the metamodel
	 * @param layer the layer of the metamodel inside the {@link ModularReferenceStructure}
	 * @return the just created metamodel
	 */
	public static Metamodel createMetamodel(EPackage mainPackage, Feature feature) {
		Metamodel metamodel = FeaturemodelFactory.eINSTANCE.createMetamodel();
		metamodel.setMainPackage(mainPackage);
		metamodel.setName(mainPackage.getName());
		feature.setMetamodel(metamodel);
		return metamodel;

	}
	
	public static SimulatorComponent createSimulatorComponent(IProject project, Feature feature) {
		SimulatorComponent simulatorComponent = FeaturemodelFactory.eINSTANCE.createSimulatorComponent();
		simulatorComponent.setPath(project.getFullPath().toString());
		feature.setSimulatorcomponent(simulatorComponent);
		return simulatorComponent;
	}

	public static Object[] openLoadResourceFromWorkspaceDialog(Shell shell, FeatureDiagram fd, IContentProvider cp) {
		LoadResourceFromWorkspaceDialog dialog = new LoadResourceFromWorkspaceDialog(shell, fd, cp);
		dialog.setBlockOnOpen(true);
		dialog.open();
		return dialog.getSelection().toArray();
	}

	/**
	 * Returns the first {@link Metamodel}  found in the metamodels collection, whose main package is mainPackage
	 * @param mainPackage the main package
	 * @param metamodels the collection of metamodels to be looked into
	 * @return the metamodel if found, null if not
	 */
	public static Metamodel getCorrespondingMetamodel(EPackage mainPackage, Collection<Metamodel> metamodels) {
		for (Metamodel m : metamodels) {
			if (m.getMainPackage() == mainPackage)
				return m;
		}
		return null;
	}

	public static boolean metamodelAlreadyExists(EPackage mainPackage, FeatureDiagram fd) {
		for (Feature feature : fd.getFeatures()) {
			if (feature.getMetamodel() != null && mainPackage.equals(feature.getMetamodel().getMainPackage()))
				return true;
		}
		return false;
	}
	
	public static boolean simulatorComponentAlreadyExists(IProject project, FeatureDiagram fd) {
		for (Feature feature : fd.getFeatures()) {
			if (feature.getSimulatorcomponent() != null && project.getFullPath().toString().equals(feature.getSimulatorcomponent().getPath()))
				return true;
		}
		return false;
	}

	public static Collection<Metamodel> getAllMetamodels(FeatureDiagram fd) {
		Collection<Metamodel> result = new ArrayList<Metamodel>();
		for (Feature feature : fd.getFeatures()) {
			result.add(feature.getMetamodel());
		}
		return result;
	}

	public static EPackage getTopMostPackage(EPackage ePackage) {
		if (ePackage.getESuperPackage() == null)
			return ePackage;
		else
			return getTopMostPackage(ePackage.getESuperPackage());
	}

}
