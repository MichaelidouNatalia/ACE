/**
 */
package AuthorizationLayerCIM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authorizable Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerCIM.AuthorizableResource#getHasResourceAccessPolicySet <em>Has Resource Access Policy Set</em>}</li>
 *   <li>{@link AuthorizationLayerCIM.AuthorizableResource#getIsAuthorizableResource <em>Is Authorizable Resource</em>}</li>
 *   <li>{@link AuthorizationLayerCIM.AuthorizableResource#isBTrackOwnership <em>BTrack Ownership</em>}</li>
 * </ul>
 *
 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getAuthorizableResource()
 * @model
 * @generated
 */
public interface AuthorizableResource extends Annotation {
	/**
	 * Returns the value of the '<em><b>Has Resource Access Policy Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Resource Access Policy Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Resource Access Policy Set</em>' containment reference.
	 * @see #setHasResourceAccessPolicySet(ResourceAccessPolicySet)
	 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getAuthorizableResource_HasResourceAccessPolicySet()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ResourceAccessPolicySet getHasResourceAccessPolicySet();

	/**
	 * Sets the value of the '{@link AuthorizationLayerCIM.AuthorizableResource#getHasResourceAccessPolicySet <em>Has Resource Access Policy Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Resource Access Policy Set</em>' containment reference.
	 * @see #getHasResourceAccessPolicySet()
	 * @generated
	 */
	void setHasResourceAccessPolicySet(ResourceAccessPolicySet value);

	/**
	 * Returns the value of the '<em><b>Is Authorizable Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Authorizable Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Authorizable Resource</em>' reference.
	 * @see #setIsAuthorizableResource(AnnResource)
	 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getAuthorizableResource_IsAuthorizableResource()
	 * @model required="true"
	 * @generated
	 */
	AnnResource getIsAuthorizableResource();

	/**
	 * Sets the value of the '{@link AuthorizationLayerCIM.AuthorizableResource#getIsAuthorizableResource <em>Is Authorizable Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Authorizable Resource</em>' reference.
	 * @see #getIsAuthorizableResource()
	 * @generated
	 */
	void setIsAuthorizableResource(AnnResource value);

	/**
	 * Returns the value of the '<em><b>BTrack Ownership</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BTrack Ownership</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BTrack Ownership</em>' attribute.
	 * @see #setBTrackOwnership(boolean)
	 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getAuthorizableResource_BTrackOwnership()
	 * @model required="true"
	 * @generated
	 */
	boolean isBTrackOwnership();

	/**
	 * Sets the value of the '{@link AuthorizationLayerCIM.AuthorizableResource#isBTrackOwnership <em>BTrack Ownership</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BTrack Ownership</em>' attribute.
	 * @see #isBTrackOwnership()
	 * @generated
	 */
	void setBTrackOwnership(boolean value);

} // AuthorizableResource
