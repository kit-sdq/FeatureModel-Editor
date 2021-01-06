package edu.kit.kastel.sdq.featuremodel.design;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;

import edu.kit.kastel.sdq.featuremodel.AbstractFeature;
import edu.kit.kastel.sdq.featuremodel.ChildRelation;
import edu.kit.kastel.sdq.featuremodel.ExcludesConstraint;
import edu.kit.kastel.sdq.featuremodel.Feature;
import edu.kit.kastel.sdq.featuremodel.FeatureDiagram;
import edu.kit.kastel.sdq.featuremodel.MandatoryRelation;
import edu.kit.kastel.sdq.featuremodel.MultipleChildrenRelation;
import edu.kit.kastel.sdq.featuremodel.RequiresConstraint;
import edu.kit.kastel.sdq.featuremodel.SingleChildRelation;

/**
 * The services class used by VSM.
 */
public class FeatureModelServices {
	public static Collection<SingleChildRelation> singleChildRelations(FeatureDiagram featureDiagram) {
		return featureDiagram.getChildRelations().stream().filter(r -> r instanceof SingleChildRelation)
				.map(r -> (SingleChildRelation) r).collect(Collectors.toList());
	}

	public static Collection<MultipleChildrenRelation> multipleChildrenRelations(FeatureDiagram featureDiagram) {
		return featureDiagram.getChildRelations().stream().filter(r -> r instanceof MultipleChildrenRelation)
				.map(r -> (MultipleChildrenRelation) r).collect(Collectors.toList());
	}

	public static Collection<ExcludesConstraint> excludesConstraints(FeatureDiagram featureDiagram) {
		return featureDiagram.getConstraints().stream().filter(c -> c instanceof ExcludesConstraint)
				.map(c -> (ExcludesConstraint) c).collect(Collectors.toList());
	}

	public static Collection<RequiresConstraint> requiresConstraints(FeatureDiagram featureDiagram) {
		return featureDiagram.getConstraints().stream().filter(c -> c instanceof RequiresConstraint)
				.map(c -> (RequiresConstraint) c).collect(Collectors.toList());
	}

	public void removeFeatureFromMultipleChildrenRelation(DEdge edge) {
		MultipleChildrenRelation multipleChildrenRelation = (MultipleChildrenRelation) ((DSemanticDecorator) edge
				.getSourceNode()).getTarget();
		Feature feature = (Feature) ((DSemanticDecorator) edge.getTargetNode()).getTarget();
		multipleChildrenRelation.getChildren().remove(feature);
	}

	public static boolean featureIsDescendantOf(AbstractFeature descendant, AbstractFeature ancestor) {
		Collection<AbstractFeature> directChildren = getFeaturesDirectChildren(ancestor);

		if (directChildren.contains(descendant))
			return true;
		else {
			for (AbstractFeature directChild : directChildren) {
				if (featureIsDescendantOf(descendant, directChild))
					return true;
			}
		}
		return false;
	}

	public static boolean featuresHaveSharedAncestor(AbstractFeature firstFeature, AbstractFeature secondFeature) {
		Collection<AbstractFeature> firstFeaturesAncestors = getFeatureAncestors(firstFeature);
		Collection<AbstractFeature> secondFeaturesAncestors = getFeatureAncestors(secondFeature);

		firstFeaturesAncestors.add(firstFeature);
		secondFeaturesAncestors.add(secondFeature);

		return firstFeaturesAncestors.stream().anyMatch(f -> secondFeaturesAncestors.contains(f));
	}

	public static Collection<AbstractFeature> getFeatureParents(AbstractFeature feature) {
		Collection<AbstractFeature> parents = new ArrayList<AbstractFeature>();
		FeatureDiagram featureDiagram = (FeatureDiagram) feature.eContainer();
		Collection<SingleChildRelation> singleChildRelations = singleChildRelations(featureDiagram);
		Collection<MultipleChildrenRelation> multipleChildrenRelations = multipleChildrenRelations(featureDiagram);

		parents.addAll(singleChildRelations.stream().filter(r -> r.getChild() == feature).map(r -> r.getParent())
				.collect(Collectors.toList()));
		parents.addAll(multipleChildrenRelations.stream().filter(r -> r.getChildren().contains(feature))
				.map(r -> r.getParent()).collect(Collectors.toList()));

		return parents;
	}

	public static Collection<AbstractFeature> getFeatureAncestors(AbstractFeature feature) {
		Collection<AbstractFeature> ancestors = new ArrayList<AbstractFeature>();
		Collection<AbstractFeature> parents = getFeatureParents(feature);

		ancestors.addAll(parents);

		for (AbstractFeature parent : parents) {
			ancestors.addAll(getFeatureAncestors(parent));
		}

		return ancestors;
	}

	public static Collection<AbstractFeature> getFeaturesDirectChildren(AbstractFeature feature) {
		FeatureDiagram featureDiagram = (FeatureDiagram) feature.eContainer();
		Collection<ChildRelation> childRelationsOfParent = featureDiagram.getChildRelations().stream()
				.filter(c -> c.getParent() == feature).collect(Collectors.toList());

		Collection<AbstractFeature> directChildren = new ArrayList<AbstractFeature>();
		for (ChildRelation childRelation : childRelationsOfParent) {
			if (childRelation instanceof SingleChildRelation)
				directChildren.add(((SingleChildRelation) childRelation).getChild());
			else if (childRelation instanceof MultipleChildrenRelation)
				directChildren.addAll(((MultipleChildrenRelation) childRelation).getChildren());
		}

		return directChildren;
	}

	public static Collection<AbstractFeature> getAllFeatureDescendants(AbstractFeature feature) {
		Collection<AbstractFeature> result = new ArrayList<AbstractFeature>();
		Collection<AbstractFeature> children = getFeaturesDirectChildren(feature);

		result.addAll(children);
		for (AbstractFeature child : children) {
			result.addAll(getAllFeatureDescendants(child));
		}
		return result;
	}

	public static Collection<AbstractFeature> getDirectMandatoryChildren(AbstractFeature feature) {
		FeatureDiagram featureDiagram = (FeatureDiagram) feature.eContainer();
		Collection<AbstractFeature> directMandatoryChildren = featureDiagram.getChildRelations().stream().filter(r -> (r instanceof MandatoryRelation) && r.getParent() == feature).map(r -> (MandatoryRelation) r).map(r -> r.getChild()).collect(Collectors.toList());
		return directMandatoryChildren;
	}
	
	public static Collection<AbstractFeature> getAllMandatoryDescendants(AbstractFeature feature) {
		Collection<AbstractFeature> result = new ArrayList<AbstractFeature>();
		Collection<AbstractFeature> children = getDirectMandatoryChildren(feature);
		
		result.addAll(children);
		for (AbstractFeature child : children) {
			result.addAll(getAllMandatoryDescendants(child));
		}
		return result;
	}
	
	public static Collection<AbstractFeature> getDirectlyRequiredFeatures(AbstractFeature feature) {
		FeatureDiagram featureDiagram = (FeatureDiagram) feature.eContainer();
		Collection<AbstractFeature> directlyRequiredFeatures = featureDiagram.getConstraints().stream().filter(c -> (c instanceof RequiresConstraint) && c.getSource() == feature).map(c -> c.getTarget()).collect(Collectors.toList());
		return directlyRequiredFeatures;
	}
	
	public static Collection<AbstractFeature> getAllRequiredFeatures(AbstractFeature feature) {
		Collection<AbstractFeature> result = new ArrayList<AbstractFeature>();
		Collection<AbstractFeature> requiredFeatures = getDirectlyRequiredFeatures(feature);
		
		result.addAll(requiredFeatures);
		for (AbstractFeature child : requiredFeatures) {
			result.addAll(getAllRequiredFeatures(child));
		}
		return result;
	}

	public boolean featuresAreNotMutuallyConstrained(Feature preSource, Feature preTarget) {
		FeatureDiagram featureDiagram = (FeatureDiagram) preSource.eContainer();

		boolean constraintExists = featureDiagram.getConstraints().stream()
				.anyMatch(c -> (c.getTarget().equals(preSource) && c.getSource().equals(preTarget))
						|| (c.getSource().equals(preSource) && c.getTarget().equals(preTarget)));
		return !constraintExists;
	}

	public boolean requiresConstraintIsPreventedByExcludesConstraint(AbstractFeature preSource, AbstractFeature preTarget) {
		Collection<AbstractFeature> sourceHierarchy = getFeatureAncestors(preSource);
		Collection<AbstractFeature> targetHierarchy = getFeatureAncestors(preTarget);

		sourceHierarchy.add(preSource);
		targetHierarchy.add(preTarget);

		Collection<AbstractFeature> allFeaturesChildren = getAllFeatureDescendants(preSource);
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
		Collection<AbstractFeature> sourceAncestors = getFeatureAncestors(preSource);
		Collection<AbstractFeature> targetAncestors = getFeatureAncestors(preTarget);

		Collection<AbstractFeature> sourceChildren = getAllFeatureDescendants(preSource);
		Collection<AbstractFeature> targetChildren = getAllFeatureDescendants(preTarget);

		Collection<AbstractFeature> sourceHierarchy = new ArrayList<AbstractFeature>();
		Collection<AbstractFeature> targetHierarchy = new ArrayList<AbstractFeature>();

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
