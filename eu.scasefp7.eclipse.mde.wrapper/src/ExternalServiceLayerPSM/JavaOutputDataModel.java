/**
 */
package ExternalServiceLayerPSM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Output Data Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ExternalServiceLayerPSM.JavaOutputDataModel#getHasOutputProperty <em>Has Output Property</em>}</li>
 *   <li>{@link ExternalServiceLayerPSM.JavaOutputDataModel#getHasOutputRepresentation <em>Has Output Representation</em>}</li>
 * </ul>
 *
 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getJavaOutputDataModel()
 * @model
 * @generated
 */
public interface JavaOutputDataModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Output Property</b></em>' containment reference list.
	 * The list contents are of type {@link ExternalServiceLayerPSM.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Output Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Output Property</em>' containment reference list.
	 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getJavaOutputDataModel_HasOutputProperty()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getHasOutputProperty();

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
	 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getJavaOutputDataModel_HasOutputRepresentation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Representation getHasOutputRepresentation();

	/**
	 * Sets the value of the '{@link ExternalServiceLayerPSM.JavaOutputDataModel#getHasOutputRepresentation <em>Has Output Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Output Representation</em>' containment reference.
	 * @see #getHasOutputRepresentation()
	 * @generated
	 */
	void setHasOutputRepresentation(Representation value);

} // JavaOutputDataModel
