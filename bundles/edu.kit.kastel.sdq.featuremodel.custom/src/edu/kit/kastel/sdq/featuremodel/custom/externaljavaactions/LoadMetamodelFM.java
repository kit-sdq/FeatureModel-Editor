package edu.kit.kastel.sdq.featuremodel.custom.externaljavaactions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import edu.kit.kastel.sdq.case4lang.common.FileUtils;
import edu.kit.kastel.sdq.featuremodel.Feature;
import edu.kit.kastel.sdq.featuremodel.FeatureDiagram;
import edu.kit.kastel.sdq.featuremodel.custom.util.FMUtil;
import edu.kit.kastel.sdq.featuremodel.custom.util.RemainingEcoreFileProvider;

public class LoadMetamodelFM implements IExternalJavaAction {

	public static final Shell SHELL = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	
	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		Feature feature = (Feature) selections.iterator().next();
		
		FeatureDiagram fd = (FeatureDiagram) feature.eContainer();
		
		List<URI> uris = getURIs(FMUtil.openLoadResourceFromWorkspaceDialog(SHELL, fd, new RemainingEcoreFileProvider(fd)));
		if (uris == null || uris.isEmpty()) //e.g. on cancel
			return;

		TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(feature);
		
		for(URI uri : uris) {
			EPackage mainPackage = FMUtil.getMainPackageByURI(uri, editingDomain);
        
	        // if the main EPackage was retrieved successfully and there still isn't a metamodel with this mainPackage in the FM
			if (mainPackage != null && !FMUtil.metamodelAlreadyExists(mainPackage, (FeatureDiagram) feature.eContainer())) {
				FMUtil.createMetamodel(mainPackage, feature);
				break;
			}			
		}
		
	}
	
	
	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}
	
	private List<URI> getURIs(Object[] objects){
		List<URI> files = new ArrayList<URI>();
		for(Object object : objects) {
			files.add(FileUtils.getFileURI((IFile) object));
		}
		return files;
	}
	
	

}
