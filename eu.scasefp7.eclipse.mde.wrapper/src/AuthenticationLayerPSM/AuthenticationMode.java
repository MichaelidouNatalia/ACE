/**
 */
package AuthenticationLayerPSM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authentication Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AuthenticationLayerPSM.AuthenticationMode#getHTTPActivityHandlerHasAuthenticationMode <em>HTTP Activity Handler Has Authentication Mode</em>}</li>
 *   <li>{@link AuthenticationLayerPSM.AuthenticationMode#getHTTPActivityHasAuthenticationMode <em>HTTP Activity Has Authentication Mode</em>}</li>
 * </ul>
 *
 * @see AuthenticationLayerPSM.AuthenticationLayerPSMPackage#getAuthenticationMode()
 * @model
 * @generated
 */
public interface AuthenticationMode extends Annotation {
	/**
	 * Returns the value of the '<em><b>HTTP Activity Handler Has Authentication Mode</b></em>' reference list.
	 * The list contents are of type {@link AuthenticationLayerPSM.AnnHTTPActivityHandler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HTTP Activity Handler Has Authentication Mode</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HTTP Activity Handler Has Authentication Mode</em>' reference list.
	 * @see AuthenticationLayerPSM.AuthenticationLayerPSMPackage#getAuthenticationMode_HTTPActivityHandlerHasAuthenticationMode()
	 * @model required="true"
	 * @generated
	 */
	EList<AnnHTTPActivityHandler> getHTTPActivityHandlerHasAuthenticationMode();

	/**
	 * Returns the value of the '<em><b>HTTP Activity Has Authentication Mode</b></em>' reference list.
	 * The list contents are of type {@link AuthenticationLayerPSM.AnnHTTPActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HTTP Activity Has Authentication Mode</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HTTP Activity Has Authentication Mode</em>' reference list.
	 * @see AuthenticationLayerPSM.AuthenticationLayerPSMPackage#getAuthenticationMode_HTTPActivityHasAuthenticationMode()
	 * @model required="true"
	 * @generated
	 */
	EList<AnnHTTPActivity> getHTTPActivityHasAuthenticationMode();

} // AuthenticationMode
