/**
 */
package ExternalServiceLayerCIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Data Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ExternalServiceLayerCIM.InputDataModel#getHasInputRepresentation <em>Has Input Representation</em>}</li>
 *   <li>{@link ExternalServiceLayerCIM.InputDataModel#getHasInputProperties <em>Has Input Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage#getInputDataModel()
 * @model
 * @generated
 */
public interface InputDataModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Input Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Input Representation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Input Representation</em>' containment reference.
	 * @see #setHasInputRepresentation(Representation)
	 * @see ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage#getInputDataModel_HasInputRepresentation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Representation getHasInputRepresentation();

	/**
	 * Sets the value of the '{@link ExternalServiceLayerCIM.InputDataModel#getHasInputRepresentation <em>Has Input Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Input Representation</em>' containment reference.
	 * @see #getHasInputRepresentation()
	 * @generated
	 */
	void setHasInputRepresentation(Representation value);

	/**
	 * Returns the value of the '<em><b>Has Input Properties</b></em>' containment reference list.
	 * The list contents are of type {@link ExternalServiceLayerCIM.ModelProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Input Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Input Properties</em>' containment reference list.
	 * @see ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage#getInputDataModel_HasInputProperties()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ModelProperty> getHasInputProperties();

} // InputDataModel
