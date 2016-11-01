/**
 */
package ExternalServiceLayerPSM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java REST Client HTTP Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ExternalServiceLayerPSM.JavaRESTClientHTTPActivity#getHasJavaRESTClientHTTPActivityHandler <em>Has Java REST Client HTTP Activity Handler</em>}</li>
 *   <li>{@link ExternalServiceLayerPSM.JavaRESTClientHTTPActivity#getHasQueryParam <em>Has Query Param</em>}</li>
 *   <li>{@link ExternalServiceLayerPSM.JavaRESTClientHTTPActivity#getIsJavaRESTClientHTTPActivity <em>Is Java REST Client HTTP Activity</em>}</li>
 * </ul>
 *
 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getJavaRESTClientHTTPActivity()
 * @model
 * @generated
 */
public interface JavaRESTClientHTTPActivity extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Java REST Client HTTP Activity Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Java REST Client HTTP Activity Handler</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Java REST Client HTTP Activity Handler</em>' containment reference.
	 * @see #setHasJavaRESTClientHTTPActivityHandler(JavaRESTClientHTTPActivityHandler)
	 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getJavaRESTClientHTTPActivity_HasJavaRESTClientHTTPActivityHandler()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JavaRESTClientHTTPActivityHandler getHasJavaRESTClientHTTPActivityHandler();

	/**
	 * Sets the value of the '{@link ExternalServiceLayerPSM.JavaRESTClientHTTPActivity#getHasJavaRESTClientHTTPActivityHandler <em>Has Java REST Client HTTP Activity Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Java REST Client HTTP Activity Handler</em>' containment reference.
	 * @see #getHasJavaRESTClientHTTPActivityHandler()
	 * @generated
	 */
	void setHasJavaRESTClientHTTPActivityHandler(JavaRESTClientHTTPActivityHandler value);

	/**
	 * Returns the value of the '<em><b>Has Query Param</b></em>' containment reference list.
	 * The list contents are of type {@link ExternalServiceLayerPSM.QueryParam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Query Param</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Query Param</em>' containment reference list.
	 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getJavaRESTClientHTTPActivity_HasQueryParam()
	 * @model containment="true"
	 * @generated
	 */
	EList<QueryParam> getHasQueryParam();

	/**
	 * Returns the value of the '<em><b>Is Java REST Client HTTP Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Java REST Client HTTP Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Java REST Client HTTP Activity</em>' reference.
	 * @see #setIsJavaRESTClientHTTPActivity(AnnHTTPActivity)
	 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getJavaRESTClientHTTPActivity_IsJavaRESTClientHTTPActivity()
	 * @model required="true"
	 * @generated
	 */
	AnnHTTPActivity getIsJavaRESTClientHTTPActivity();

	/**
	 * Sets the value of the '{@link ExternalServiceLayerPSM.JavaRESTClientHTTPActivity#getIsJavaRESTClientHTTPActivity <em>Is Java REST Client HTTP Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Java REST Client HTTP Activity</em>' reference.
	 * @see #getIsJavaRESTClientHTTPActivity()
	 * @generated
	 */
	void setIsJavaRESTClientHTTPActivity(AnnHTTPActivity value);

} // JavaRESTClientHTTPActivity
