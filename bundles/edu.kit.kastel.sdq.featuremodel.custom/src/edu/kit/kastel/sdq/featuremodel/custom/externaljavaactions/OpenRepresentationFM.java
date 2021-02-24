package edu.kit.kastel.sdq.featuremodel.custom.externaljavaactions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.business.internal.session.danalysis.DAnalysisSessionImpl;
import org.eclipse.sirius.business.internal.session.danalysis.LocalResourceCollectorCrossReferencer;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import edu.kit.kastel.sdq.case4lang.common.FileUtils;
import edu.kit.kastel.sdq.featuremodel.Metamodel;
import edu.kit.kastel.sdq.featuremodel.custom.util.SiriusCustomUtil;
import edu.kit.kastel.sdq.featuremodel.custom.util.SiriusCustomUtil.IResourceType;

public class OpenRepresentationFM implements IExternalJavaAction {

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		IProgressMonitor monitor = new NullProgressMonitor();

		Metamodel metamodel = (Metamodel) parameters.get("element");
		EPackage ePackage = metamodel.getMainPackage();//SiriusCustomUtil.getEPackageEcoreFileByEPackageFeatureModel(metamodel.getMainPackage());
		Session session = SessionManager.INSTANCE.getSession(FileUtils.getFileURI((IFile) SiriusCustomUtil.getIResourceByEPackage(ePackage, IResourceType.AIRDFILE)), monitor);
		
		Optional<Adapter> firstSession = ePackage.eAdapters().stream().filter(LocalResourceCollectorCrossReferencer.class::isInstance).findFirst();
		if(firstSession.isPresent() && !((LocalResourceCollectorCrossReferencer) firstSession.get()).getSession().equals(session)) {
			//Add the adapter pointing to the ecore aird session at the first position
			ePackage.eAdapters().add(0, new LocalResourceCollectorCrossReferencer((DAnalysisSessionImpl) session));
		}


		String viewpointName = (String) parameters.get("Viewpoint");
		String representationDescriptionName = (String) parameters.get("RepresentationDescription");
		String diagramName = (String) parameters.get("Diagram name");

		// Select viewpoint
		List<String> selectedViewpoints = new ArrayList<String>();
		selectedViewpoints.add(viewpointName);
		SiriusCustomUtil.selectViewpoints(session, selectedViewpoints, false, new NullProgressMonitor());

		// Getting selected viewpoint and representation
		Viewpoint viewpoint = SiriusCustomUtil.getSelectedViewpointByName(session, viewpointName);
		RepresentationDescription representationDescription = SiriusCustomUtil.findDescription(viewpoint, representationDescriptionName);
		
		DRepresentation representationOfEPackage = getRepresentationOfEPackage(DialectManager.INSTANCE.getRepresentations(representationDescription, session), ePackage);
		
		// create a new representation if none exists and open it
		if (representationOfEPackage == null) { 
			String representationName = null;
			if (diagramName != null && !diagramName.isEmpty()) {
				representationName = diagramName;
			}
			else {
				representationName = ((representationDescription.getLabel() == null) ? representationDescription.getName() : representationDescription.getLabel());
			}

			representationOfEPackage = SiriusCustomUtil.createRepresentation(session, representationName, representationDescription, ePackage, monitor);

			DialectUIManager.INSTANCE.openEditor(session, representationOfEPackage, new NullProgressMonitor());
		} else {
			DialectUIManager.INSTANCE.openEditor(session, representationOfEPackage, new NullProgressMonitor());
		}

	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}
	
	private DRepresentation getRepresentationOfEPackage(Collection<DRepresentation> representations, EPackage ePackage) {
		for(DRepresentation representation : representations) {
			Optional<EObject> firstEPackageOptional = representation.eCrossReferences().stream().filter(EPackageImpl.class::isInstance).findFirst();
			if(firstEPackageOptional.isPresent()) {
				EPackage firstEPackage = (EPackage) firstEPackageOptional.get();
				/*
				if(firstEPackage.equals(ePackage)) {
					return representation;
				}
				*/
				if(firstEPackage.getName().equals(ePackage.getName()) && firstEPackage.getNsPrefix().equals(ePackage.getNsPrefix()) && firstEPackage.getNsURI().equals(ePackage.getNsURI())) {
					return representation;
				}
				
			}
		}
		return null;
	}
}
