/**
 */
package RESTfulServicePSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hibernate Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RESTfulServicePSM.HibernateActivity#getName <em>Name</em>}</li>
 *   <li>{@link RESTfulServicePSM.HibernateActivity#getHibernateActivityHTTPVerb <em>Hibernate Activity HTTP Verb</em>}</li>
 * </ul>
 *
 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getHibernateActivity()
 * @model
 * @generated
 */
public interface HibernateActivity extends EObject {
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
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getHibernateActivity_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.HibernateActivity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Hibernate Activity HTTP Verb</b></em>' attribute.
	 * The literals are from the enumeration {@link RESTfulServicePSM.HTTPVerb}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hibernate Activity HTTP Verb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hibernate Activity HTTP Verb</em>' attribute.
	 * @see RESTfulServicePSM.HTTPVerb
	 * @see #setHibernateActivityHTTPVerb(HTTPVerb)
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getHibernateActivity_HibernateActivityHTTPVerb()
	 * @model required="true"
	 * @generated
	 */
	HTTPVerb getHibernateActivityHTTPVerb();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.HibernateActivity#getHibernateActivityHTTPVerb <em>Hibernate Activity HTTP Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hibernate Activity HTTP Verb</em>' attribute.
	 * @see RESTfulServicePSM.HTTPVerb
	 * @see #getHibernateActivityHTTPVerb()
	 * @generated
	 */
	void setHibernateActivityHTTPVerb(HTTPVerb value);

} // HibernateActivity
