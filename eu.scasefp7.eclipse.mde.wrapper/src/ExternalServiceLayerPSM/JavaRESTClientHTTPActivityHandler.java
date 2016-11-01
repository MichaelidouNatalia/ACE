/**
 */
package ExternalServiceLayerPSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java REST Client HTTP Activity Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ExternalServiceLayerPSM.JavaRESTClientHTTPActivityHandler#getIsJavaRESTClientHTTPActivityHandler <em>Is Java REST Client HTTP Activity Handler</em>}</li>
 *   <li>{@link ExternalServiceLayerPSM.JavaRESTClientHTTPActivityHandler#getTargetServiceURL <em>Target Service URL</em>}</li>
 *   <li>{@link ExternalServiceLayerPSM.JavaRESTClientHTTPActivityHandler#getHTTPVerb <em>HTTP Verb</em>}</li>
 * </ul>
 *
 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getJavaRESTClientHTTPActivityHandler()
 * @model
 * @generated
 */
public interface JavaRESTClientHTTPActivityHandler extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Java REST Client HTTP Activity Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Java REST Client HTTP Activity Handler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Java REST Client HTTP Activity Handler</em>' reference.
	 * @see #setIsJavaRESTClientHTTPActivityHandler(AnnHTTPActivityHandler)
	 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getJavaRESTClientHTTPActivityHandler_IsJavaRESTClientHTTPActivityHandler()
	 * @model required="true"
	 * @generated
	 */
	AnnHTTPActivityHandler getIsJavaRESTClientHTTPActivityHandler();

	/**
	 * Sets the value of the '{@link ExternalServiceLayerPSM.JavaRESTClientHTTPActivityHandler#getIsJavaRESTClientHTTPActivityHandler <em>Is Java REST Client HTTP Activity Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Java REST Client HTTP Activity Handler</em>' reference.
	 * @see #getIsJavaRESTClientHTTPActivityHandler()
	 * @generated
	 */
	void setIsJavaRESTClientHTTPActivityHandler(AnnHTTPActivityHandler value);

	/**
	 * Returns the value of the '<em><b>Target Service URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Service URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Service URL</em>' attribute.
	 * @see #setTargetServiceURL(String)
	 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getJavaRESTClientHTTPActivityHandler_TargetServiceURL()
	 * @model required="true"
	 * @generated
	 */
	String getTargetServiceURL();

	/**
	 * Sets the value of the '{@link ExternalServiceLayerPSM.JavaRESTClientHTTPActivityHandler#getTargetServiceURL <em>Target Service URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Service URL</em>' attribute.
	 * @see #getTargetServiceURL()
	 * @generated
	 */
	void setTargetServiceURL(String value);

	/**
	 * Returns the value of the '<em><b>HTTP Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HTTP Verb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HTTP Verb</em>' attribute.
	 * @see #setHTTPVerb(String)
	 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getJavaRESTClientHTTPActivityHandler_HTTPVerb()
	 * @model required="true"
	 * @generated
	 */
	String getHTTPVerb();

	/**
	 * Sets the value of the '{@link ExternalServiceLayerPSM.JavaRESTClientHTTPActivityHandler#getHTTPVerb <em>HTTP Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HTTP Verb</em>' attribute.
	 * @see #getHTTPVerb()
	 * @generated
	 */
	void setHTTPVerb(String value);

} // JavaRESTClientHTTPActivityHandler
