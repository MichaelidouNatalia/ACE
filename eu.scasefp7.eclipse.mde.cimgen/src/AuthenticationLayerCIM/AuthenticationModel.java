/**
 */
package AuthenticationLayerCIM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authentication Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AuthenticationLayerCIM.AuthenticationModel#getHasAuthenticationToken <em>Has Authentication Token</em>}</li>
 *   <li>{@link AuthenticationLayerCIM.AuthenticationModel#getResourceAuthenticationModel <em>Resource Authentication Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see AuthenticationLayerCIM.AuthenticationLayerCIMPackage#getAuthenticationModel()
 * @model
 * @generated
 */
public interface AuthenticationModel extends Annotation {
	/**
	 * Returns the value of the '<em><b>Has Authentication Token</b></em>' containment reference list.
	 * The list contents are of type {@link AuthenticationLayerCIM.AuthenticationToken}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Authentication Token</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Authentication Token</em>' containment reference list.
	 * @see AuthenticationLayerCIM.AuthenticationLayerCIMPackage#getAuthenticationModel_HasAuthenticationToken()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<AuthenticationToken> getHasAuthenticationToken();

	/**
	 * Returns the value of the '<em><b>Resource Authentication Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Authentication Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Authentication Model</em>' reference.
	 * @see #setResourceAuthenticationModel(AnnResource)
	 * @see AuthenticationLayerCIM.AuthenticationLayerCIMPackage#getAuthenticationModel_ResourceAuthenticationModel()
	 * @model required="true"
	 * @generated
	 */
	AnnResource getResourceAuthenticationModel();

	/**
	 * Sets the value of the '{@link AuthenticationLayerCIM.AuthenticationModel#getResourceAuthenticationModel <em>Resource Authentication Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Authentication Model</em>' reference.
	 * @see #getResourceAuthenticationModel()
	 * @generated
	 */
	void setResourceAuthenticationModel(AnnResource value);

} // AuthenticationModel
