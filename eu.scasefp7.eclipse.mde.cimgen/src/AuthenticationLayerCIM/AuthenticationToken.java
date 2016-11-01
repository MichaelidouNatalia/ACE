/**
 */
package AuthenticationLayerCIM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authentication Token</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AuthenticationLayerCIM.AuthenticationToken#getName <em>Name</em>}</li>
 *   <li>{@link AuthenticationLayerCIM.AuthenticationToken#getType <em>Type</em>}</li>
 *   <li>{@link AuthenticationLayerCIM.AuthenticationToken#isBIsUnique <em>BIs Unique</em>}</li>
 *   <li>{@link AuthenticationLayerCIM.AuthenticationToken#getPropertyAuthenticationToken <em>Property Authentication Token</em>}</li>
 * </ul>
 * </p>
 *
 * @see AuthenticationLayerCIM.AuthenticationLayerCIMPackage#getAuthenticationToken()
 * @model
 * @generated
 */
public interface AuthenticationToken extends Annotation {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see AuthenticationLayerCIM.AuthenticationLayerCIMPackage#getAuthenticationToken_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link AuthenticationLayerCIM.AuthenticationToken#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see AuthenticationLayerCIM.AuthenticationLayerCIMPackage#getAuthenticationToken_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link AuthenticationLayerCIM.AuthenticationToken#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>BIs Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BIs Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BIs Unique</em>' attribute.
	 * @see #setBIsUnique(boolean)
	 * @see AuthenticationLayerCIM.AuthenticationLayerCIMPackage#getAuthenticationToken_BIsUnique()
	 * @model required="true"
	 * @generated
	 */
	boolean isBIsUnique();

	/**
	 * Sets the value of the '{@link AuthenticationLayerCIM.AuthenticationToken#isBIsUnique <em>BIs Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BIs Unique</em>' attribute.
	 * @see #isBIsUnique()
	 * @generated
	 */
	void setBIsUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Property Authentication Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Authentication Token</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Authentication Token</em>' reference.
	 * @see #setPropertyAuthenticationToken(AnnProperty)
	 * @see AuthenticationLayerCIM.AuthenticationLayerCIMPackage#getAuthenticationToken_PropertyAuthenticationToken()
	 * @model required="true"
	 * @generated
	 */
	AnnProperty getPropertyAuthenticationToken();

	/**
	 * Sets the value of the '{@link AuthenticationLayerCIM.AuthenticationToken#getPropertyAuthenticationToken <em>Property Authentication Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Authentication Token</em>' reference.
	 * @see #getPropertyAuthenticationToken()
	 * @generated
	 */
	void setPropertyAuthenticationToken(AnnProperty value);

} // AuthenticationToken
