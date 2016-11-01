/**
 */
package RESTfulServicePSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTTP Activity Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RESTfulServicePSM.HTTPActivityHandler#getHasHypermediaFunction <em>Has Hypermedia Function</em>}</li>
 *   <li>{@link RESTfulServicePSM.HTTPActivityHandler#getName <em>Name</em>}</li>
 *   <li>{@link RESTfulServicePSM.HTTPActivityHandler#getHandlerHTTPVerb <em>Handler HTTP Verb</em>}</li>
 * </ul>
 *
 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getHTTPActivityHandler()
 * @model
 * @generated
 */
public interface HTTPActivityHandler extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Hypermedia Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Hypermedia Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Hypermedia Function</em>' containment reference.
	 * @see #setHasHypermediaFunction(JavaHypermediaFunction)
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getHTTPActivityHandler_HasHypermediaFunction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JavaHypermediaFunction getHasHypermediaFunction();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.HTTPActivityHandler#getHasHypermediaFunction <em>Has Hypermedia Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Hypermedia Function</em>' containment reference.
	 * @see #getHasHypermediaFunction()
	 * @generated
	 */
	void setHasHypermediaFunction(JavaHypermediaFunction value);

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
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getHTTPActivityHandler_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.HTTPActivityHandler#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Handler HTTP Verb</b></em>' attribute.
	 * The literals are from the enumeration {@link RESTfulServicePSM.HTTPVerb}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handler HTTP Verb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler HTTP Verb</em>' attribute.
	 * @see RESTfulServicePSM.HTTPVerb
	 * @see #setHandlerHTTPVerb(HTTPVerb)
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getHTTPActivityHandler_HandlerHTTPVerb()
	 * @model required="true"
	 * @generated
	 */
	HTTPVerb getHandlerHTTPVerb();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.HTTPActivityHandler#getHandlerHTTPVerb <em>Handler HTTP Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler HTTP Verb</em>' attribute.
	 * @see RESTfulServicePSM.HTTPVerb
	 * @see #getHandlerHTTPVerb()
	 * @generated
	 */
	void setHandlerHTTPVerb(HTTPVerb value);

} // HTTPActivityHandler
