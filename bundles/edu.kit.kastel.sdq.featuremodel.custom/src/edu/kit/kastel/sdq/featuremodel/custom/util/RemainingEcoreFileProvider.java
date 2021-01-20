package edu.kit.kastel.sdq.featuremodel.custom.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.IStructuredContentProvider;

import edu.kit.kastel.sdq.case4lang.common.FileUtils;
import edu.kit.kastel.sdq.featuremodel.FeatureDiagram;
import edu.kit.kastel.sdq.featuremodel.custom.util.SiriusCustomUtil.IResourceType;

public class RemainingEcoreFileProvider implements IStructuredContentProvider {
	
	private FeatureDiagram fd;

	public RemainingEcoreFileProvider(FeatureDiagram fd) {
		this.fd = fd;
	}
	
	@Override
	public Object[] getElements(Object inputElement) {
		IProject[] allProjects = ((IWorkspace) inputElement).getRoot().getProjects();

		ArrayList<IResource> ecoreFiles = new ArrayList<IResource>();
		for (IProject project : allProjects) {
			if (project.isOpen()) {
				SiriusCustomUtil.addIResourcesToList(ecoreFiles, project, IResourceType.ECOREFILE);
			}
		}

		ArrayList<IFile> remainingEcoreFiles = new ArrayList<IFile>();
		for(IResource ecoreFile : ecoreFiles) {
			EPackage mainPackage = FMUtil.getMainPackageByURI(FileUtils.getFileURI((IFile) ecoreFile), TransactionUtil.getEditingDomain(fd));
			if(!FMUtil.metamodelAlreadyExists(mainPackage, fd)) {
				remainingEcoreFiles.add((IFile) ecoreFile);
			}
		}
		return remainingEcoreFiles.toArray();

	}

}
