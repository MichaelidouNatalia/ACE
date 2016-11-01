/**
 */
package ServiceCIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RES Tful Service CIM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServiceCIM.RESTfulServiceCIM#getName <em>Name</em>}</li>
 *   <li>{@link ServiceCIM.RESTfulServiceCIM#getHasResources <em>Has Resources</em>}</li>
 *   <li>{@link ServiceCIM.RESTfulServiceCIM#getServiceOutputPath <em>Service Output Path</em>}</li>
 *   <li>{@link ServiceCIM.RESTfulServiceCIM#getServiceDatabaseIP <em>Service Database IP</em>}</li>
 *   <li>{@link ServiceCIM.RESTfulServiceCIM#getServiceDatabasePort <em>Service Database Port</em>}</li>
 *   <li>{@link ServiceCIM.RESTfulServiceCIM#getServiceDatabaseUsername <em>Service Database Username</em>}</li>
 *   <li>{@link ServiceCIM.RESTfulServiceCIM#getServiceDatabasePassword <em>Service Database Password</em>}</li>
 *   <li>{@link ServiceCIM.RESTfulServiceCIM#getServiceDatabaseType <em>Service Database Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServiceCIM.ServiceCIMPackage#getRESTfulServiceCIM()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueResourceNames'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot UniqueResourceNames='self.hasResources->isUnique(name)'"
 * @generated
 */
public interface RESTfulServiceCIM extends EObject {
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
	 * @see ServiceCIM.ServiceCIMPackage#getRESTfulServiceCIM_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ServiceCIM.RESTfulServiceCIM#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Resources</b></em>' containment reference list.
	 * The list contents are of type {@link ServiceCIM.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Resources</em>' containment reference list.
	 * @see ServiceCIM.ServiceCIMPackage#getRESTfulServiceCIM_HasResources()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Resource> getHasResources();

	/**
	 * Returns the value of the '<em><b>Service Output Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Output Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Output Path</em>' attribute.
	 * @see #setServiceOutputPath(String)
	 * @see ServiceCIM.ServiceCIMPackage#getRESTfulServiceCIM_ServiceOutputPath()
	 * @model required="true"
	 * @generated
	 */
	String getServiceOutputPath();

	/**
	 * Sets the value of the '{@link ServiceCIM.RESTfulServiceCIM#getServiceOutputPath <em>Service Output Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Output Path</em>' attribute.
	 * @see #getServiceOutputPath()
	 * @generated
	 */
	void setServiceOutputPath(String value);

	/**
	 * Returns the value of the '<em><b>Service Database IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Database IP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Database IP</em>' attribute.
	 * @see #setServiceDatabaseIP(String)
	 * @see ServiceCIM.ServiceCIMPackage#getRESTfulServiceCIM_ServiceDatabaseIP()
	 * @model required="true"
	 * @generated
	 */
	String getServiceDatabaseIP();

	/**
	 * Sets the value of the '{@link ServiceCIM.RESTfulServiceCIM#getServiceDatabaseIP <em>Service Database IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Database IP</em>' attribute.
	 * @see #getServiceDatabaseIP()
	 * @generated
	 */
	void setServiceDatabaseIP(String value);

	/**
	 * Returns the value of the '<em><b>Service Database Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Database Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Database Port</em>' attribute.
	 * @see #setServiceDatabasePort(String)
	 * @see ServiceCIM.ServiceCIMPackage#getRESTfulServiceCIM_ServiceDatabasePort()
	 * @model required="true"
	 * @generated
	 */
	String getServiceDatabasePort();

	/**
	 * Sets the value of the '{@link ServiceCIM.RESTfulServiceCIM#getServiceDatabasePort <em>Service Database Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Database Port</em>' attribute.
	 * @see #getServiceDatabasePort()
	 * @generated
	 */
	void setServiceDatabasePort(String value);

	/**
	 * Returns the value of the '<em><b>Service Database Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Database Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Database Username</em>' attribute.
	 * @see #setServiceDatabaseUsername(String)
	 * @see ServiceCIM.ServiceCIMPackage#getRESTfulServiceCIM_ServiceDatabaseUsername()
	 * @model required="true"
	 * @generated
	 */
	String getServiceDatabaseUsername();

	/**
	 * Sets the value of the '{@link ServiceCIM.RESTfulServiceCIM#getServiceDatabaseUsername <em>Service Database Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Database Username</em>' attribute.
	 * @see #getServiceDatabaseUsername()
	 * @generated
	 */
	void setServiceDatabaseUsername(String value);

	/**
	 * Returns the value of the '<em><b>Service Database Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Database Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Database Password</em>' attribute.
	 * @see #setServiceDatabasePassword(String)
	 * @see ServiceCIM.ServiceCIMPackage#getRESTfulServiceCIM_ServiceDatabasePassword()
	 * @model required="true"
	 * @generated
	 */
	String getServiceDatabasePassword();

	/**
	 * Sets the value of the '{@link ServiceCIM.RESTfulServiceCIM#getServiceDatabasePassword <em>Service Database Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Database Password</em>' attribute.
	 * @see #getServiceDatabasePassword()
	 * @generated
	 */
	void setServiceDatabasePassword(String value);

	/**
	 * Returns the value of the '<em><b>Service Database Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Database Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Database Type</em>' attribute.
	 * @see #setServiceDatabaseType(String)
	 * @see ServiceCIM.ServiceCIMPackage#getRESTfulServiceCIM_ServiceDatabaseType()
	 * @model required="true"
	 * @generated
	 */
	String getServiceDatabaseType();

	/**
	 * Sets the value of the '{@link ServiceCIM.RESTfulServiceCIM#getServiceDatabaseType <em>Service Database Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Database Type</em>' attribute.
	 * @see #getServiceDatabaseType()
	 * @generated
	 */
	void setServiceDatabaseType(String value);

} // RESTfulServiceCIM
