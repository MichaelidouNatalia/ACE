/**
 */
package ExternalServiceLayerCIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Data Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ExternalServiceLayerCIM.OutputDataModel#getHasOutputRepresentation <em>Has Output Representation</em>}</li>
 *   <li>{@link ExternalServiceLayerCIM.OutputDataModel#getHasOutputProperties <em>Has Output Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage#getOutputDataModel()
 * @model
 * @generated
 */
public interface OutputDataModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Output Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Output Representation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Output Representation</em>' containment reference.
	 * @see #setHasOutputRepresentation(Representation)
	 * @see ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage#getOutputDataModel_HasOutputRepresentation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Representation getHasOutputRepresentation();

	/**
	 * Sets the value of the '{@link ExternalServiceLayerCIM.OutputDataModel#getHasOutputRepresentation <em>Has Output Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Output Representation</em>' containment reference.
	 * @see #getHasOutputRepresentation()
	 * @generated
	 */
	void setHasOutputRepresentation(Representation value);

	/**
	 * Returns the value of the '<em><b>Has Output Properties</b></em>' containment reference list.
	 * The list contents are of type {@link ExternalServiceLayerCIM.ModelProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Output Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Output Properties</em>' containment reference list.
	 * @see ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage#getOutputDataModel_HasOutputProperties()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ModelProperty> getHasOutputProperties();

} // OutputDataModel
