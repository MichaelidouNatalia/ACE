/**
 */
package AuthorizationLayerPSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authorization Subject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerPSM.AuthorizationSubject#getIsAuthorizationSubject <em>Is Authorization Subject</em>}</li>
 * </ul>
 *
 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getAuthorizationSubject()
 * @model
 * @generated
 */
public interface AuthorizationSubject extends Annotation {
	/**
	 * Returns the value of the '<em><b>Is Authorization Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Authorization Subject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Authorization Subject</em>' reference.
	 * @see #setIsAuthorizationSubject(AnnJavaResourceModel)
	 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getAuthorizationSubject_IsAuthorizationSubject()
	 * @model required="true"
	 * @generated
	 */
	AnnJavaResourceModel getIsAuthorizationSubject();

	/**
	 * Sets the value of the '{@link AuthorizationLayerPSM.AuthorizationSubject#getIsAuthorizationSubject <em>Is Authorization Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Authorization Subject</em>' reference.
	 * @see #getIsAuthorizationSubject()
	 * @generated
	 */
	void setIsAuthorizationSubject(AnnJavaResourceModel value);

} // AuthorizationSubject
