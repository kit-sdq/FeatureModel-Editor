/**
 */
package edu.kit.kastel.sdq.featuremodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulator Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.featuremodel.SimulatorComponent#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.featuremodel.FeaturemodelPackage#getSimulatorComponent()
 * @model
 * @generated
 */
public interface SimulatorComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see edu.kit.kastel.sdq.featuremodel.FeaturemodelPackage#getSimulatorComponent_Path()
	 * @model required="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.featuremodel.SimulatorComponent#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

} // SimulatorComponent
