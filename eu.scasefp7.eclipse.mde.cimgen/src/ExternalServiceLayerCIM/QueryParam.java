/**
 */
package ExternalServiceLayerCIM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ExternalServiceLayerCIM.QueryParam#getName <em>Name</em>}</li>
 *   <li>{@link ExternalServiceLayerCIM.QueryParam#getType <em>Type</em>}</li>
 *   <li>{@link ExternalServiceLayerCIM.QueryParam#isIsAuthToken <em>Is Auth Token</em>}</li>
 *   <li>{@link ExternalServiceLayerCIM.QueryParam#getAuthTokenToURL <em>Auth Token To URL</em>}</li>
 * </ul>
 * </p>
 *
 * @see ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage#getQueryParam()
 * @model
 * @generated
 */
public interface QueryParam extends EObject {
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
	 * @see ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage#getQueryParam_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ExternalServiceLayerCIM.QueryParam#getName <em>Name</em>}' attribute.
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
	 * @see ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage#getQueryParam_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link ExternalServiceLayerCIM.QueryParam#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Is Auth Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Auth Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Auth Token</em>' attribute.
	 * @see #setIsAuthToken(boolean)
	 * @see ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage#getQueryParam_IsAuthToken()
	 * @model
	 * @generated
	 */
	boolean isIsAuthToken();

	/**
	 * Sets the value of the '{@link ExternalServiceLayerCIM.QueryParam#isIsAuthToken <em>Is Auth Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Auth Token</em>' attribute.
	 * @see #isIsAuthToken()
	 * @generated
	 */
	void setIsAuthToken(boolean value);

	/**
	 * Returns the value of the '<em><b>Auth Token To URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auth Token To URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auth Token To URL</em>' attribute.
	 * @see #setAuthTokenToURL(String)
	 * @see ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage#getQueryParam_AuthTokenToURL()
	 * @model
	 * @generated
	 */
	String getAuthTokenToURL();

	/**
	 * Sets the value of the '{@link ExternalServiceLayerCIM.QueryParam#getAuthTokenToURL <em>Auth Token To URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auth Token To URL</em>' attribute.
	 * @see #getAuthTokenToURL()
	 * @generated
	 */
	void setAuthTokenToURL(String value);

} // QueryParam
