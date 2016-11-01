/**
 */
package AuthenticationLayerPSM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authentication Performer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AuthenticationLayerPSM.AuthenticationPerformer#getHasAuthenticationToken <em>Has Authentication Token</em>}</li>
 *   <li>{@link AuthenticationLayerPSM.AuthenticationPerformer#getIsSystemAuthenticationPerformer <em>Is System Authentication Performer</em>}</li>
 *   <li>{@link AuthenticationLayerPSM.AuthenticationPerformer#getAuthenticationModelName <em>Authentication Model Name</em>}</li>
 *   <li>{@link AuthenticationLayerPSM.AuthenticationPerformer#getAuthenticationModelParentName <em>Authentication Model Parent Name</em>}</li>
 * </ul>
 *
 * @see AuthenticationLayerPSM.AuthenticationLayerPSMPackage#getAuthenticationPerformer()
 * @model
 * @generated
 */
public interface AuthenticationPerformer extends Annotation {
	/**
	 * Returns the value of the '<em><b>Has Authentication Token</b></em>' containment reference list.
	 * The list contents are of type {@link AuthenticationLayerPSM.AuthenticationToken}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Authentication Token</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Authentication Token</em>' containment reference list.
	 * @see AuthenticationLayerPSM.AuthenticationLayerPSMPackage#getAuthenticationPerformer_HasAuthenticationToken()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<AuthenticationToken> getHasAuthenticationToken();

	/**
	 * Returns the value of the '<em><b>Is System Authentication Performer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is System Authentication Performer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is System Authentication Performer</em>' reference.
	 * @see #setIsSystemAuthenticationPerformer(AnnJPAController)
	 * @see AuthenticationLayerPSM.AuthenticationLayerPSMPackage#getAuthenticationPerformer_IsSystemAuthenticationPerformer()
	 * @model required="true"
	 * @generated
	 */
	AnnJPAController getIsSystemAuthenticationPerformer();

	/**
	 * Sets the value of the '{@link AuthenticationLayerPSM.AuthenticationPerformer#getIsSystemAuthenticationPerformer <em>Is System Authentication Performer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is System Authentication Performer</em>' reference.
	 * @see #getIsSystemAuthenticationPerformer()
	 * @generated
	 */
	void setIsSystemAuthenticationPerformer(AnnJPAController value);

	/**
	 * Returns the value of the '<em><b>Authentication Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authentication Model Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication Model Name</em>' attribute.
	 * @see #setAuthenticationModelName(String)
	 * @see AuthenticationLayerPSM.AuthenticationLayerPSMPackage#getAuthenticationPerformer_AuthenticationModelName()
	 * @model required="true"
	 * @generated
	 */
	String getAuthenticationModelName();

	/**
	 * Sets the value of the '{@link AuthenticationLayerPSM.AuthenticationPerformer#getAuthenticationModelName <em>Authentication Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Model Name</em>' attribute.
	 * @see #getAuthenticationModelName()
	 * @generated
	 */
	void setAuthenticationModelName(String value);

	/**
	 * Returns the value of the '<em><b>Authentication Model Parent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authentication Model Parent Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authentication Model Parent Name</em>' attribute.
	 * @see #setAuthenticationModelParentName(String)
	 * @see AuthenticationLayerPSM.AuthenticationLayerPSMPackage#getAuthenticationPerformer_AuthenticationModelParentName()
	 * @model required="true"
	 * @generated
	 */
	String getAuthenticationModelParentName();

	/**
	 * Sets the value of the '{@link AuthenticationLayerPSM.AuthenticationPerformer#getAuthenticationModelParentName <em>Authentication Model Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authentication Model Parent Name</em>' attribute.
	 * @see #getAuthenticationModelParentName()
	 * @generated
	 */
	void setAuthenticationModelParentName(String value);

} // AuthenticationPerformer
