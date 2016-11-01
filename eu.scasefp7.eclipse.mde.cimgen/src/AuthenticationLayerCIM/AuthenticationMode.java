/**
 */
package AuthenticationLayerCIM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authentication Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AuthenticationLayerCIM.AuthenticationMode#getCRUDActivityAuthenticationMode <em>CRUD Activity Authentication Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see AuthenticationLayerCIM.AuthenticationLayerCIMPackage#getAuthenticationMode()
 * @model
 * @generated
 */
public interface AuthenticationMode extends Annotation {
	/**
	 * Returns the value of the '<em><b>CRUD Activity Authentication Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CRUD Activity Authentication Mode</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CRUD Activity Authentication Mode</em>' reference.
	 * @see #setCRUDActivityAuthenticationMode(AnnCRUDActivity)
	 * @see AuthenticationLayerCIM.AuthenticationLayerCIMPackage#getAuthenticationMode_CRUDActivityAuthenticationMode()
	 * @model required="true"
	 * @generated
	 */
	AnnCRUDActivity getCRUDActivityAuthenticationMode();

	/**
	 * Sets the value of the '{@link AuthenticationLayerCIM.AuthenticationMode#getCRUDActivityAuthenticationMode <em>CRUD Activity Authentication Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CRUD Activity Authentication Mode</em>' reference.
	 * @see #getCRUDActivityAuthenticationMode()
	 * @generated
	 */
	void setCRUDActivityAuthenticationMode(AnnCRUDActivity value);

} // AuthenticationMode
