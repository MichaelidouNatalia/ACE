/**
 */
package AuthorizationLayerPSM;

import RESTfulServicePSM.PSMComponentProperty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ann PSM Component Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerPSM.AnnPSMComponentProperty#getAnnotatesPSMComponentProperty <em>Annotates PSM Component Property</em>}</li>
 * </ul>
 *
 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getAnnPSMComponentProperty()
 * @model
 * @generated
 */
public interface AnnPSMComponentProperty extends AnnotatedElement {
	/**
	 * Returns the value of the '<em><b>Annotates PSM Component Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotates PSM Component Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotates PSM Component Property</em>' reference.
	 * @see #setAnnotatesPSMComponentProperty(PSMComponentProperty)
	 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getAnnPSMComponentProperty_AnnotatesPSMComponentProperty()
	 * @model
	 * @generated
	 */
	PSMComponentProperty getAnnotatesPSMComponentProperty();

	/**
	 * Sets the value of the '{@link AuthorizationLayerPSM.AnnPSMComponentProperty#getAnnotatesPSMComponentProperty <em>Annotates PSM Component Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotates PSM Component Property</em>' reference.
	 * @see #getAnnotatesPSMComponentProperty()
	 * @generated
	 */
	void setAnnotatesPSMComponentProperty(PSMComponentProperty value);

} // AnnPSMComponentProperty
