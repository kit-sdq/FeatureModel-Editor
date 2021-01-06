package edu.kit.kastel.sdq.featuremodel.custom.externaljavaactions;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import edu.kit.kastel.sdq.featuremodel.Feature;
import edu.kit.kastel.sdq.featuremodel.FeatureDiagram;
import edu.kit.kastel.sdq.featuremodel.MultipleChildrenRelation;
import edu.kit.kastel.sdq.featuremodel.SingleChildRelation;
import edu.kit.kastel.sdq.featuremodel.State;

public class ChangeVisibilityFM implements IExternalJavaAction {

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		Object element = parameters.get("element");
		if(element instanceof Feature) {
			Feature feature = (Feature) element;
			FeatureDiagram featureDiagram = (FeatureDiagram) feature.eContainer();
			switch(feature.getState()) {
			case IN:
				executeFeatureRulesOUT(feature, featureDiagram);
				break;
			case OUT:
				executeFeatureRulesIN(feature, featureDiagram);
				break;
			}
		} else if (element instanceof SingleChildRelation) {
			SingleChildRelation childRelation = (SingleChildRelation) element;
			FeatureDiagram featureDiagram = (FeatureDiagram) childRelation.eContainer();
			switch(childRelation.getState()) {
			case IN:
				executeSingleChildRelationRulesOUT(childRelation, featureDiagram);
				break;
			case OUT:
				executeSingleChildRelationRulesIN(childRelation, featureDiagram);
				break;
			}
		} else if (element instanceof MultipleChildrenRelation) {
			MultipleChildrenRelation childRelation = (MultipleChildrenRelation) element;
			FeatureDiagram featureDiagram = (FeatureDiagram) childRelation.eContainer();
			switch(childRelation.getState()) {
			case IN:
				executeMultipleChildRelationRulesOUT(childRelation, featureDiagram);
				break;
			case OUT:
				executeMultipleChildRelationRulesIN(childRelation, featureDiagram);
				break;
			}
		}
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}
	
	private void executeMultipleChildRelationRulesOUT(MultipleChildrenRelation c, FeatureDiagram fd) {
		c.setState(State.OUT);
		c.getChildren().forEach(x -> executeFeatureRulesOUT(x, fd));
	}
	
	private void executeSingleChildRelationRulesOUT(SingleChildRelation c, FeatureDiagram fd) {
		c.setState(State.OUT);
		executeFeatureRulesOUT(c.getChild(), fd);
	}
	
	private void executeFeatureRulesOUT(Feature f, FeatureDiagram fd) {
		f.setState(State.OUT);
		fd.getChildRelations().stream().
		filter(x -> x instanceof SingleChildRelation).
		filter(x -> x.getParent().equals(f)).
		forEach(x -> executeSingleChildRelationRulesOUT((SingleChildRelation) x, fd));
		fd.getChildRelations().stream().
		filter(x -> x instanceof MultipleChildrenRelation).
		filter(x -> x.getParent().equals(f)).
		forEach(x -> executeMultipleChildRelationRulesOUT((MultipleChildrenRelation) x, fd));
	}
	
	
	private void executeMultipleChildRelationRulesIN(MultipleChildrenRelation c, FeatureDiagram fd) {
		c.setState(State.IN);
		if(c.getParent() instanceof Feature) {
			executeFeatureRulesIN((Feature) c.getParent(), fd);
		}
	}
	
	private void executeSingleChildRelationRulesIN(SingleChildRelation c, FeatureDiagram fd) {
		c.setState(State.IN);
		c.getChild().setState(State.IN);
		if(c.getParent() instanceof Feature) {
			executeFeatureRulesIN((Feature) c.getParent(), fd);
		}
	}
	
	private void executeFeatureRulesIN(Feature f, FeatureDiagram fd) {
		f.setState(State.IN);
		fd.getChildRelations().stream().
		filter(x -> x instanceof SingleChildRelation).
		filter(x -> ((SingleChildRelation) x).getChild().equals(f)).
		forEach(x -> executeSingleChildRelationRulesIN((SingleChildRelation) x, fd));
		fd.getChildRelations().stream().
		filter(x -> x instanceof MultipleChildrenRelation).
		filter(x -> ((MultipleChildrenRelation) x).getChildren().contains(f)).
		forEach(x -> executeMultipleChildRelationRulesIN((MultipleChildrenRelation) x, fd));
	}

	
}
