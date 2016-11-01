/**
 */
package AuthorizationLayerPSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authorization Data Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerPSM.AuthorizationDataHandler#getIsAuthorizationDataHandler <em>Is Authorization Data Handler</em>}</li>
 * </ul>
 *
 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getAuthorizationDataHandler()
 * @model
 * @generated
 */
public interface AuthorizationDataHandler extends Annotation {
	/**
	 * Returns the value of the '<em><b>Is Authorization Data Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Authorization Data Handler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Authorization Data Handler</em>' reference.
	 * @see #setIsAuthorizationDataHandler(AnnJPAController)
	 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getAuthorizationDataHandler_IsAuthorizationDataHandler()
	 * @model required="true"
	 * @generated
	 */
	AnnJPAController getIsAuthorizationDataHandler();

	/**
	 * Sets the value of the '{@link AuthorizationLayerPSM.AuthorizationDataHandler#getIsAuthorizationDataHandler <em>Is Authorization Data Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Authorization Data Handler</em>' reference.
	 * @see #getIsAuthorizationDataHandler()
	 * @generated
	 */
	void setIsAuthorizationDataHandler(AnnJPAController value);

} // AuthorizationDataHandler
