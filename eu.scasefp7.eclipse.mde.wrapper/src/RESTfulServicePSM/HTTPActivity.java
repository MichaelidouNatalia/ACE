/**
 */
package RESTfulServicePSM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTTP Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RESTfulServicePSM.HTTPActivity#getIsMappedToHibernateActivity <em>Is Mapped To Hibernate Activity</em>}</li>
 *   <li>{@link RESTfulServicePSM.HTTPActivity#getHasHTTPActivityParameter <em>Has HTTP Activity Parameter</em>}</li>
 *   <li>{@link RESTfulServicePSM.HTTPActivity#getActivityHTTPVerb <em>Activity HTTP Verb</em>}</li>
 *   <li>{@link RESTfulServicePSM.HTTPActivity#getName <em>Name</em>}</li>
 *   <li>{@link RESTfulServicePSM.HTTPActivity#getHTTPActivityURI <em>HTTP Activity URI</em>}</li>
 *   <li>{@link RESTfulServicePSM.HTTPActivity#getHasHTTPActivityHandler <em>Has HTTP Activity Handler</em>}</li>
 *   <li>{@link RESTfulServicePSM.HTTPActivity#getHTTPActivityHasJAXRSAnnotation <em>HTTP Activity Has JAXRS Annotation</em>}</li>
 * </ul>
 *
 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getHTTPActivity()
 * @model
 * @generated
 */
public interface HTTPActivity extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Mapped To Hibernate Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Mapped To Hibernate Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Mapped To Hibernate Activity</em>' reference.
	 * @see #setIsMappedToHibernateActivity(HibernateActivity)
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getHTTPActivity_IsMappedToHibernateActivity()
	 * @model required="true"
	 * @generated
	 */
	HibernateActivity getIsMappedToHibernateActivity();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.HTTPActivity#getIsMappedToHibernateActivity <em>Is Mapped To Hibernate Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Mapped To Hibernate Activity</em>' reference.
	 * @see #getIsMappedToHibernateActivity()
	 * @generated
	 */
	void setIsMappedToHibernateActivity(HibernateActivity value);

	/**
	 * Returns the value of the '<em><b>Has HTTP Activity Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link RESTfulServicePSM.HTTPActivityFunctionParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has HTTP Activity Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has HTTP Activity Parameter</em>' containment reference list.
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getHTTPActivity_HasHTTPActivityParameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<HTTPActivityFunctionParameter> getHasHTTPActivityParameter();

	/**
	 * Returns the value of the '<em><b>Activity HTTP Verb</b></em>' attribute.
	 * The literals are from the enumeration {@link RESTfulServicePSM.HTTPVerb}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity HTTP Verb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity HTTP Verb</em>' attribute.
	 * @see RESTfulServicePSM.HTTPVerb
	 * @see #setActivityHTTPVerb(HTTPVerb)
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getHTTPActivity_ActivityHTTPVerb()
	 * @model required="true"
	 * @generated
	 */
	HTTPVerb getActivityHTTPVerb();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.HTTPActivity#getActivityHTTPVerb <em>Activity HTTP Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity HTTP Verb</em>' attribute.
	 * @see RESTfulServicePSM.HTTPVerb
	 * @see #getActivityHTTPVerb()
	 * @generated
	 */
	void setActivityHTTPVerb(HTTPVerb value);

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
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getHTTPActivity_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.HTTPActivity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>HTTP Activity URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HTTP Activity URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HTTP Activity URI</em>' attribute.
	 * @see #setHTTPActivityURI(String)
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getHTTPActivity_HTTPActivityURI()
	 * @model required="true"
	 * @generated
	 */
	String getHTTPActivityURI();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.HTTPActivity#getHTTPActivityURI <em>HTTP Activity URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HTTP Activity URI</em>' attribute.
	 * @see #getHTTPActivityURI()
	 * @generated
	 */
	void setHTTPActivityURI(String value);

	/**
	 * Returns the value of the '<em><b>Has HTTP Activity Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has HTTP Activity Handler</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has HTTP Activity Handler</em>' containment reference.
	 * @see #setHasHTTPActivityHandler(HTTPActivityHandler)
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getHTTPActivity_HasHTTPActivityHandler()
	 * @model containment="true" required="true"
	 * @generated
	 */
	HTTPActivityHandler getHasHTTPActivityHandler();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.HTTPActivity#getHasHTTPActivityHandler <em>Has HTTP Activity Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has HTTP Activity Handler</em>' containment reference.
	 * @see #getHasHTTPActivityHandler()
	 * @generated
	 */
	void setHasHTTPActivityHandler(HTTPActivityHandler value);

	/**
	 * Returns the value of the '<em><b>HTTP Activity Has JAXRS Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link RESTfulServicePSM.JAXRSAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HTTP Activity Has JAXRS Annotation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HTTP Activity Has JAXRS Annotation</em>' containment reference list.
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getHTTPActivity_HTTPActivityHasJAXRSAnnotation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<JAXRSAnnotation> getHTTPActivityHasJAXRSAnnotation();

} // HTTPActivity
