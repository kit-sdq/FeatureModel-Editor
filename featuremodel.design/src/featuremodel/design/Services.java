package featuremodel.design;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;

import featuremodel.ChildRelation;
import featuremodel.ExcludesConstraint;
import featuremodel.Feature;
import featuremodel.FeatureDiagram;
import featuremodel.MultipleChildrenRelation;
import featuremodel.RequiresConstraint;
import featuremodel.SingleChildRelation;

/**
 * The services class used by VSM.
 */
public class Services {

	public boolean featuresAreNotMutuallyConstrained(Feature preSource, Feature preTarget) {
		FeatureDiagram featureDiagram = (FeatureDiagram) preSource.eContainer();

		boolean constraintExists = featureDiagram.getConstraints().stream()
				.anyMatch(c -> (c.getTarget().equals(preSource) && c.getSource().equals(preTarget))
						|| (c.getSource().equals(preSource) && c.getTarget().equals(preTarget)));
		return !constraintExists;
	}

	public Collection<SingleChildRelation> singleChildRelations(FeatureDiagram featureDiagram) {
		return featureDiagram.getChildRelations().stream().filter(r -> r instanceof SingleChildRelation)
				.map(r -> (SingleChildRelation) r).collect(Collectors.toList());
	}

	public Collection<MultipleChildrenRelation> multipleChildrenRelations(FeatureDiagram featureDiagram) {
		return featureDiagram.getChildRelations().stream().filter(r -> r instanceof MultipleChildrenRelation)
				.map(r -> (MultipleChildrenRelation) r).collect(Collectors.toList());
	}

	public Collection<ExcludesConstraint> excludesConstraints(FeatureDiagram featureDiagram) {
		return featureDiagram.getConstraints().stream().filter(c -> c instanceof ExcludesConstraint)
				.map(c -> (ExcludesConstraint) c).collect(Collectors.toList());
	}

	public Collection<RequiresConstraint> requiresConstraints(FeatureDiagram featureDiagram) {
		return featureDiagram.getConstraints().stream().filter(c -> c instanceof RequiresConstraint)
				.map(c -> (RequiresConstraint) c).collect(Collectors.toList());
	}

	public void removeFeatureFromMultipleChildrenRelation(DEdge edge) {
		MultipleChildrenRelation multipleChildrenRelation = (MultipleChildrenRelation) ((DSemanticDecorator) edge
				.getSourceNode()).getTarget();
		Feature feature = (Feature) ((DSemanticDecorator) edge.getTargetNode()).getTarget();
		multipleChildrenRelation.getChildren().remove(feature);
	}

	public boolean featureIsChildOf(Feature child, Feature parent) {
		FeatureDiagram featureDiagram = (FeatureDiagram) parent.eContainer();
		Collection<ChildRelation> childRelationsOfParent = featureDiagram.getChildRelations().stream()
				.filter(c -> c.getParent() == parent).collect(Collectors.toList());

		Collection<Feature> directChildren = new ArrayList<Feature>();
		for (ChildRelation childRelation : childRelationsOfParent) {
			if (childRelation instanceof SingleChildRelation)
				directChildren.add(((SingleChildRelation) childRelation).getChild());
			else if (childRelation instanceof MultipleChildrenRelation)
				directChildren.addAll(((MultipleChildrenRelation) childRelation).getChildren());
		}

		if (directChildren.contains(child))
			return true;
		else {
			for (Feature directChild : directChildren) {
				if (featureIsChildOf(child, directChild))
					return true;
			}
		}
		return false;
	}

	public boolean featuresHaveSharedAncestor(Feature firstFeature, Feature secondFeature) {
		Collection<Feature> firstFeaturesAncestors = featureAncestors(firstFeature);
		Collection<Feature> secondFeaturesAncestors = featureAncestors(secondFeature);

		firstFeaturesAncestors.add(firstFeature);
		secondFeaturesAncestors.add(secondFeature);

		return firstFeaturesAncestors.stream().anyMatch(f -> secondFeaturesAncestors.contains(f));
	}

	public Collection<Feature> featureParents(Feature feature) {
		Collection<Feature> parents = new ArrayList<Feature>();
		FeatureDiagram featureDiagram = (FeatureDiagram) feature.eContainer();
		Collection<SingleChildRelation> singleChildRelations = singleChildRelations(featureDiagram);
		Collection<MultipleChildrenRelation> multipleChildrenRelations = multipleChildrenRelations(featureDiagram);

		parents.addAll(singleChildRelations.stream().filter(r -> r.getChild() == feature).map(r -> r.getParent())
				.collect(Collectors.toList()));
		parents.addAll(multipleChildrenRelations.stream().filter(r -> r.getChildren().contains(feature))
				.map(r -> r.getParent()).collect(Collectors.toList()));

		return parents;
	}

	public Collection<Feature> featureAncestors(Feature feature) {
		Collection<Feature> ancestors = new ArrayList<Feature>();
		Collection<Feature> parents = featureParents(feature);

		ancestors.addAll(parents);

		for (Feature parent : parents) {
			ancestors.addAll(featureAncestors(parent));
		}

		return ancestors;
	}

	public Collection<Feature> getFeaturesDirectChildren(Feature feature) {
		FeatureDiagram featureDiagram = (FeatureDiagram) feature.eContainer();
		Collection<ChildRelation> childRelationsOfParent = featureDiagram.getChildRelations().stream()
				.filter(c -> c.getParent() == feature).collect(Collectors.toList());

		Collection<Feature> directChildren = new ArrayList<Feature>();
		for (ChildRelation childRelation : childRelationsOfParent) {
			if (childRelation instanceof SingleChildRelation)
				directChildren.add(((SingleChildRelation) childRelation).getChild());
			else if (childRelation instanceof MultipleChildrenRelation)
				directChildren.addAll(((MultipleChildrenRelation) childRelation).getChildren());
		}

		return directChildren;
	}

	public Collection<Feature> getAllFeaturesChildren(Feature feature) {
		Collection<Feature> result = new ArrayList<Feature>();
		Collection<Feature> children = getFeaturesDirectChildren(feature);

		result.addAll(children);
		for (Feature child : children) {
			result.addAll(getAllFeaturesChildren(child));
		}
		return result;
	}

	public boolean requiresConstraintIsPreventedByExcludesConstraint(Feature preSource, Feature preTarget) {
		Collection<Feature> sourceHierarchy = featureAncestors(preSource);
		Collection<Feature> targetHierarchy = featureAncestors(preTarget);

		sourceHierarchy.add(preSource);
		targetHierarchy.add(preTarget);

		Collection<Feature> allFeaturesChildren = getAllFeaturesChildren(preSource);
		sourceHierarchy.addAll(allFeaturesChildren);

		FeatureDiagram featureDiagram = (FeatureDiagram) preSource.eContainer();
		Collection<ExcludesConstraint> excludesConstraints = excludesConstraints(featureDiagram);

		if (excludesConstraints.isEmpty())
			return false;
		else
			return excludesConstraints.stream()
					.anyMatch(c -> (sourceHierarchy.contains(c.getSource()) && targetHierarchy.contains(c.getTarget()))
							|| (sourceHierarchy.contains(c.getTarget()) && targetHierarchy.contains(c.getSource())));

	}

	public boolean excludesConstraintIsPreventedByRequiresConstraint(Feature preSource, Feature preTarget) {
		Collection<Feature> sourceAncestors = featureAncestors(preSource);
		Collection<Feature> targetAncestors = featureAncestors(preTarget);

		Collection<Feature> sourceChildren = getAllFeaturesChildren(preSource);
		Collection<Feature> targetChildren = getAllFeaturesChildren(preTarget);

		Collection<Feature> sourceHierarchy = new ArrayList<Feature>();
		Collection<Feature> targetHierarchy = new ArrayList<Feature>();

		sourceHierarchy.addAll(sourceAncestors);
		targetHierarchy.addAll(targetAncestors);

		sourceHierarchy.add(preSource);
		targetHierarchy.add(preTarget);

		sourceHierarchy.addAll(sourceChildren);
		targetHierarchy.addAll(targetChildren);

		FeatureDiagram featureDiagram = (FeatureDiagram) preSource.eContainer();
		Collection<RequiresConstraint> requiresConstraints = requiresConstraints(featureDiagram);

		return requiresConstraints.stream()
				.anyMatch(c -> (((sourceHierarchy.contains(c.getSource()))
						&& (targetChildren.contains(c.getTarget()) || c.getTarget().equals(preTarget)))) 
						|| (((targetHierarchy.contains(c.getSource()))
								&& (sourceChildren.contains(c.getTarget()) || c.getTarget().equals(preSource)))));

	}

	public EObject print(EObject o) {
		System.out.println(o);
		return o;
	}
}
