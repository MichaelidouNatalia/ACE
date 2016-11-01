/**
 */
package ExternalServiceLayerPSM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Input Data Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ExternalServiceLayerPSM.JavaInputDataModel#getHasInputProperty <em>Has Input Property</em>}</li>
 *   <li>{@link ExternalServiceLayerPSM.JavaInputDataModel#getHasInputRepresentation <em>Has Input Representation</em>}</li>
 * </ul>
 *
 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getJavaInputDataModel()
 * @model
 * @generated
 */
public interface JavaInputDataModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Input Property</b></em>' containment reference list.
	 * The list contents are of type {@link ExternalServiceLayerPSM.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Input Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Input Property</em>' containment reference list.
	 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getJavaInputDataModel_HasInputProperty()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Property> getHasInputProperty();

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
	 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getJavaInputDataModel_HasInputRepresentation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Representation getHasInputRepresentation();

	/**
	 * Sets the value of the '{@link ExternalServiceLayerPSM.JavaInputDataModel#getHasInputRepresentation <em>Has Input Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Input Representation</em>' containment reference.
	 * @see #getHasInputRepresentation()
	 * @generated
	 */
	void setHasInputRepresentation(Representation value);

} // JavaInputDataModel
