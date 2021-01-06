package edu.kit.kastel.sdq.featuremodel.custom.externaljavaactions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import edu.kit.kastel.sdq.featuremodel.Feature;
import edu.kit.kastel.sdq.featuremodel.FeatureDiagram;
import edu.kit.kastel.sdq.featuremodel.custom.util.FMUtil;
import edu.kit.kastel.sdq.featuremodel.custom.util.RemainingProjectProvider;

public class LoadSimulatorComponentFM implements IExternalJavaAction {

	public static final Shell SHELL = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	
	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		Feature feature = (Feature) selections.iterator().next();
		
		FeatureDiagram fd = (FeatureDiagram) feature.eContainer();
		
		List<IProject> projects = getProjects(FMUtil.openLoadResourceFromWorkspaceDialog(SHELL, fd, new RemainingProjectProvider(fd)));
		if (projects == null || projects.isEmpty()) //e.g. on cancel
			return;
		
		for(IProject project : projects) {
			if (!FMUtil.simulatorComponentAlreadyExists(project, (FeatureDiagram) feature.eContainer())) {
				FMUtil.createSimulatorComponent(project, feature);
				break;
			}			
		}
		
	}
	
	
	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}
	
	private List<IProject> getProjects(Object[] objects){
		List<IProject> files = new ArrayList<IProject>();
		for(Object object : objects) {
			files.add((IProject) object);
		}
		return files;
	}
	
	

}
