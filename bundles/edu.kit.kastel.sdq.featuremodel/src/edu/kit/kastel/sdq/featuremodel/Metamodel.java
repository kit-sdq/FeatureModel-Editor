/**
 */
package edu.kit.kastel.sdq.featuremodel;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metamodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.sdq.featuremodel.Metamodel#getName <em>Name</em>}</li>
 *   <li>{@link edu.kit.kastel.sdq.featuremodel.Metamodel#getMainPackage <em>Main Package</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.sdq.featuremodel.FeaturemodelPackage#getMetamodel()
 * @model
 * @generated
 */
public interface Metamodel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.kit.kastel.sdq.featuremodel.FeaturemodelPackage#getMetamodel_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.featuremodel.Metamodel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Main Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Package</em>' reference.
	 * @see #setMainPackage(EPackage)
	 * @see edu.kit.kastel.sdq.featuremodel.FeaturemodelPackage#getMetamodel_MainPackage()
	 * @model required="true"
	 * @generated
	 */
	EPackage getMainPackage();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.sdq.featuremodel.Metamodel#getMainPackage <em>Main Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Package</em>' reference.
	 * @see #getMainPackage()
	 * @generated
	 */
	void setMainPackage(EPackage value);

} // Metamodel
