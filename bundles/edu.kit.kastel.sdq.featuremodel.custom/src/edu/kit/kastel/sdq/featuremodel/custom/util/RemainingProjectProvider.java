package edu.kit.kastel.sdq.featuremodel.custom.util;

import java.util.ArrayList;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.jface.viewers.IStructuredContentProvider;

import edu.kit.kastel.sdq.featuremodel.FeatureDiagram;

public class RemainingProjectProvider implements IStructuredContentProvider {
	
	private FeatureDiagram fd;

	public RemainingProjectProvider(FeatureDiagram fd) {
		this.fd = fd;
	}
	
	@Override
	public Object[] getElements(Object inputElement) {
		IProject[] allProjects = ((IWorkspace) inputElement).getRoot().getProjects();

		ArrayList<IProject> remainingProjects = new ArrayList<IProject>();
		
		for(IProject project : allProjects) {
			if(!FMUtil.simulatorComponentAlreadyExists(project, fd)) {
				remainingProjects.add(project);
			}
		}

		return remainingProjects.toArray();

	}
}