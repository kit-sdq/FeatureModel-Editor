package featuremodel.design;

import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;

import featuremodel.Feature;
import featuremodel.FeatureDiagram;
import featuremodel.MultipleChildrenRelation;
import featuremodel.SingleChildRelation;

/**
 * The services class used by VSM.
 */
public class Services {

	public boolean excludesConstraintIsAllowed(FeatureDiagram featureDiagram, Feature preSource, Feature preTarget) {

		boolean forbidden = featureDiagram.getConstraints().stream()
				.anyMatch(c -> (c.getTarget().equals(preSource) && c.getSource().equals(preTarget))
						|| (c.getSource().equals(preSource) && c.getTarget().equals(preTarget)));
		return !forbidden;
	}

	public Collection<SingleChildRelation> singleChildRelations(FeatureDiagram featureDiagram) {
		return featureDiagram.getChildRelations().stream().filter(r -> r instanceof SingleChildRelation)
				.map(r -> (SingleChildRelation) r).collect(Collectors.toList());
	}
	public Collection<MultipleChildrenRelation> multipleChildrenRelations(FeatureDiagram featureDiagram) {
		return featureDiagram.getChildRelations().stream().filter(r -> r instanceof MultipleChildrenRelation)
				.map(r -> (MultipleChildrenRelation) r).collect(Collectors.toList());
	}
	
	public void removeFeatureFromMultipleChildrenRelation(DEdge edge) {
		MultipleChildrenRelation multipleChildrenRelation = (MultipleChildrenRelation) ((DSemanticDecorator) edge.getSourceNode()).getTarget();
		Feature feature = (Feature) ((DSemanticDecorator) edge.getTargetNode()).getTarget();
		multipleChildrenRelation.getChildren().remove(feature);
	}
	public EObject print(EObject o) {
		System.out.println(o);
		return o;
	}
}
