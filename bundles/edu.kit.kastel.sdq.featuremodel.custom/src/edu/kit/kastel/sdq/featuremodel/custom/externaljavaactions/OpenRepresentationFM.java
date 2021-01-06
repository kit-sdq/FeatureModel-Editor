package edu.kit.kastel.sdq.featuremodel.custom.externaljavaactions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;

import edu.kit.kastel.sdq.featuremodel.Metamodel;
import edu.kit.kastel.sdq.featuremodel.custom.util.SiriusCustomUtil;


public class OpenRepresentationFM implements IExternalJavaAction {

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		Metamodel metamodel = (Metamodel) parameters.get("element");
		EPackage epackage = metamodel.getMainPackage();
		Session session = SessionManager.INSTANCE.getSession(epackage);

		String viewpointName = (String) parameters.get("Viewpoint");
		String representationDescriptionName = (String) parameters.get("RepresentationDescription");
		String diagramName = (String) parameters.get("Diagram name");
		// Select viewpoint
		List<String> selectedViewpoints = new ArrayList<String>();
		selectedViewpoints.add(viewpointName);
		SiriusCustomUtil.selectViewpoints(session, selectedViewpoints, false, new NullProgressMonitor());
		
		// Getting selected viewpoint and representation
		Viewpoint viewpoint = SiriusCustomUtil.getSelectedViewpointByName(session, viewpointName);
		RepresentationDescription description = SiriusCustomUtil.findDescription(viewpoint, representationDescriptionName);
		
		// Find representations
		Collection<DRepresentation> representations = DialectManager.INSTANCE.getRepresentations(epackage, session);
		// create a new representation if none exists and open it
		if (representations.isEmpty()) { 
			String representationName = null;
			if (diagramName != null && !diagramName.isEmpty()) {
				representationName = diagramName;
			}
			else {
				representationName = ((description.getLabel() == null) ? description.getName() : description.getLabel());
			}
			DRepresentation representation = SiriusCustomUtil.createRepresentation(session, representationName,
					description, epackage, new NullProgressMonitor());
			DialectUIManager.INSTANCE.openEditor(session, representation, new NullProgressMonitor());
		} else { // open available representations
			for (DRepresentation representation : representations) {
				DialectUIManager.INSTANCE.openEditor(session, representation, new NullProgressMonitor());
			}
		}

	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
