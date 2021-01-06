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

public class RemainingEcoreFileProvider implements IStructuredContentProvider {
	
	private FeatureDiagram fd;

	public RemainingEcoreFileProvider(FeatureDiagram fd) {
		this.fd = fd;
	}
	
	@Override
	public Object[] getElements(Object inputElement) {
		IProject[] allProjects = ((IWorkspace) inputElement).getRoot().getProjects();

		ArrayList<IFile> ecoreFiles = new ArrayList<IFile>();
		for (IProject project : allProjects) {
			if (project.isOpen()) {
				addEcoreFilesToList(ecoreFiles, project);
			}
		}

		ArrayList<IFile> remainingEcoreFiles = new ArrayList<IFile>();
		for(IFile ecoreFile : ecoreFiles) {
			EPackage mainPackage = FMUtil.getMainPackageByURI(FileUtils.getFileURI(ecoreFile), TransactionUtil.getEditingDomain(fd));
			if(!FMUtil.metamodelAlreadyExists(mainPackage, fd)) {
				remainingEcoreFiles.add(ecoreFile);
			}
		}
		return remainingEcoreFiles.toArray();

	}

	private void addEcoreFilesToList(List<IFile> ecoreFiles, IContainer container) {
		try {
			for (IResource member : container.members()) {
				if (member instanceof IContainer)
					addEcoreFilesToList(ecoreFiles, (IContainer) member);
				if (member instanceof IFile && member.getFileExtension().equals("ecore")) {
					ecoreFiles.add((IFile) member);
				}	
			}
		} catch (CoreException e) {
			System.out.println("Failed to read " + container.getFullPath().toString() + ".");
			//Ignore this project
		}
	}
}
