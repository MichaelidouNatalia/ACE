/**
 */
package AuthorizationLayerPSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authorizable Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerPSM.AuthorizableResource#getIsAuthorizableAlgoModel <em>Is Authorizable Algo Model</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.AuthorizableResource#getIsAuthorizableResourceModel <em>Is Authorizable Resource Model</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.AuthorizableResource#getIsAuthorizableModelManager <em>Is Authorizable Model Manager</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.AuthorizableResource#getHasAuthorizationPerformer <em>Has Authorization Performer</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.AuthorizableResource#getHasResourceAccessPolicySet <em>Has Resource Access Policy Set</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.AuthorizableResource#isBTrackOwnership <em>BTrack Ownership</em>}</li>
 * </ul>
 *
 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getAuthorizableResource()
 * @model
 * @generated
 */
public interface AuthorizableResource extends Annotation {
	/**
	 * Returns the value of the '<em><b>Is Authorizable Algo Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Authorizable Algo Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Authorizable Algo Model</em>' reference.
	 * @see #setIsAuthorizableAlgoModel(AnnJavaAlgoResourceModel)
	 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getAuthorizableResource_IsAuthorizableAlgoModel()
	 * @model
	 * @generated
	 */
	AnnJavaAlgoResourceModel getIsAuthorizableAlgoModel();

	/**
	 * Sets the value of the '{@link AuthorizationLayerPSM.AuthorizableResource#getIsAuthorizableAlgoModel <em>Is Authorizable Algo Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Authorizable Algo Model</em>' reference.
	 * @see #getIsAuthorizableAlgoModel()
	 * @generated
	 */
	void setIsAuthorizableAlgoModel(AnnJavaAlgoResourceModel value);

	/**
	 * Returns the value of the '<em><b>Is Authorizable Resource Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Authorizable Resource Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Authorizable Resource Model</em>' reference.
	 * @see #setIsAuthorizableResourceModel(AnnJavaResourceModel)
	 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getAuthorizableResource_IsAuthorizableResourceModel()
	 * @model
	 * @generated
	 */
	AnnJavaResourceModel getIsAuthorizableResourceModel();

	/**
	 * Sets the value of the '{@link AuthorizationLayerPSM.AuthorizableResource#getIsAuthorizableResourceModel <em>Is Authorizable Resource Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Authorizable Resource Model</em>' reference.
	 * @see #getIsAuthorizableResourceModel()
	 * @generated
	 */
	void setIsAuthorizableResourceModel(AnnJavaResourceModel value);

	/**
	 * Returns the value of the '<em><b>Is Authorizable Model Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Authorizable Model Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Authorizable Model Manager</em>' reference.
	 * @see #setIsAuthorizableModelManager(AnnJavaResourceModelManager)
	 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getAuthorizableResource_IsAuthorizableModelManager()
	 * @model
	 * @generated
	 */
	AnnJavaResourceModelManager getIsAuthorizableModelManager();

	/**
	 * Sets the value of the '{@link AuthorizationLayerPSM.AuthorizableResource#getIsAuthorizableModelManager <em>Is Authorizable Model Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Authorizable Model Manager</em>' reference.
	 * @see #getIsAuthorizableModelManager()
	 * @generated
	 */
	void setIsAuthorizableModelManager(AnnJavaResourceModelManager value);

	/**
	 * Returns the value of the '<em><b>Has Authorization Performer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Authorization Performer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Authorization Performer</em>' reference.
	 * @see #setHasAuthorizationPerformer(AuthorizationPerformer)
	 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getAuthorizableResource_HasAuthorizationPerformer()
	 * @model required="true"
	 * @generated
	 */
	AuthorizationPerformer getHasAuthorizationPerformer();

	/**
	 * Sets the value of the '{@link AuthorizationLayerPSM.AuthorizableResource#getHasAuthorizationPerformer <em>Has Authorization Performer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Authorization Performer</em>' reference.
	 * @see #getHasAuthorizationPerformer()
	 * @generated
	 */
	void setHasAuthorizationPerformer(AuthorizationPerformer value);

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
	 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getAuthorizableResource_HasResourceAccessPolicySet()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ResourceAccessPolicySet getHasResourceAccessPolicySet();

	/**
	 * Sets the value of the '{@link AuthorizationLayerPSM.AuthorizableResource#getHasResourceAccessPolicySet <em>Has Resource Access Policy Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Resource Access Policy Set</em>' containment reference.
	 * @see #getHasResourceAccessPolicySet()
	 * @generated
	 */
	void setHasResourceAccessPolicySet(ResourceAccessPolicySet value);

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
	 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getAuthorizableResource_BTrackOwnership()
	 * @model required="true"
	 * @generated
	 */
	boolean isBTrackOwnership();

	/**
	 * Sets the value of the '{@link AuthorizationLayerPSM.AuthorizableResource#isBTrackOwnership <em>BTrack Ownership</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BTrack Ownership</em>' attribute.
	 * @see #isBTrackOwnership()
	 * @generated
	 */
	void setBTrackOwnership(boolean value);

} // AuthorizableResource
