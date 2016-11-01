/**
 */
package AuthenticationLayerPSM;

import RESTfulServicePSM.HTTPActivity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ann HTTP Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AuthenticationLayerPSM.AnnHTTPActivity#getAnnotatesHTTPActivity <em>Annotates HTTP Activity</em>}</li>
 * </ul>
 *
 * @see AuthenticationLayerPSM.AuthenticationLayerPSMPackage#getAnnHTTPActivity()
 * @model
 * @generated
 */
public interface AnnHTTPActivity extends AnnotatedElement {
	/**
	 * Returns the value of the '<em><b>Annotates HTTP Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotates HTTP Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotates HTTP Activity</em>' reference.
	 * @see #setAnnotatesHTTPActivity(HTTPActivity)
	 * @see AuthenticationLayerPSM.AuthenticationLayerPSMPackage#getAnnHTTPActivity_AnnotatesHTTPActivity()
	 * @model required="true"
	 * @generated
	 */
	HTTPActivity getAnnotatesHTTPActivity();

	/**
	 * Sets the value of the '{@link AuthenticationLayerPSM.AnnHTTPActivity#getAnnotatesHTTPActivity <em>Annotates HTTP Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotates HTTP Activity</em>' reference.
	 * @see #getAnnotatesHTTPActivity()
	 * @generated
	 */
	void setAnnotatesHTTPActivity(HTTPActivity value);

} // AnnHTTPActivity
