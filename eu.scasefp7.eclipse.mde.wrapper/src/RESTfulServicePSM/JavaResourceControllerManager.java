/**
 */
package RESTfulServicePSM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Resource Controller Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RESTfulServicePSM.JavaResourceControllerManager#getJavaRCManagerHasJAXRSAnnotation <em>Java RC Manager Has JAXRS Annotation</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaResourceControllerManager#getJavaRCManagerHasHTTPActivity <em>Java RC Manager Has HTTP Activity</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaResourceControllerManager#getHasAssociatedRMManager <em>Has Associated RM Manager</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaResourceControllerManager#getName <em>Name</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaResourceControllerManager#getControllerURI <em>Controller URI</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaResourceControllerManager#getParentName <em>Parent Name</em>}</li>
 * </ul>
 *
 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaResourceControllerManager()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='controllerURIPathAnnotation RCManagerNotAllowedHTTPActivityVerbs RCManagerActivitiesHaveJAXRSAnnotations JRCManagerPostActivityAddsPostHypermediaLinkToSelf JRCManagerGetActivityAddsPostHypermediaLinkToSelf JRCManagerPostActivityAddsGetHypermediaLinkToSelf'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot controllerURIPathAnnotation='self.JavaRCManagerHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@Path(\"\' + self.controllerURI + \'\")\')' RCManagerNotAllowedHTTPActivityVerbs='self.JavaRCManagerHasHTTPActivity->select(HTTPVerb = 2 or HTTPVerb = 3)->isEmpty()' RCManagerActivitiesHaveJAXRSAnnotations='self.JavaRCManagerHasHTTPActivity->select(HTTPVerb = 0 or HTTPVerb = 1)->forAll(HTTPActivity | \n\t\t\t(\n\t\t\t\tHTTPActivity.ActivityHTTPVerb = 0 implies HTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@POST\')\n\t\t\t\tand\n\t\t\t\tHTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@POST\') implies HTTPActivity.ActivityHTTPVerb = 0 \n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tHTTPActivity.ActivityHTTPVerb = 1 implies HTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@GET\')\n\t\t\t\tand\n\t\t\t\tHTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@GET\') implies HTTPActivity.ActivityHTTPVerb = 1 \t\n\t\t\t)\n\t\t\tand HTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@Path(\"\' + HTTPActivity.HTTPActivityURI + \'\")\')\n\t\t)' JRCManagerPostActivityAddsPostHypermediaLinkToSelf='self.JavaRCManagerHasHTTPActivity->select(HTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and hasTargetRCManager = self and LinkType = \'Sibling\')' JRCManagerGetActivityAddsPostHypermediaLinkToSelf='self.JavaRCManagerHasHTTPActivity->select(HTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and hasTargetRCManager = self and LinkType = \'Sibling\')' JRCManagerPostActivityAddsGetHypermediaLinkToSelf='self.JavaRCManagerHasHTTPActivity->select(HTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and hasTargetRCManager = self and LinkType = \'Sibling\')'"
 * @generated
 */
public interface JavaResourceControllerManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Java RC Manager Has JAXRS Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java RC Manager Has JAXRS Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java RC Manager Has JAXRS Annotation</em>' containment reference.
	 * @see #setJavaRCManagerHasJAXRSAnnotation(JAXRSAnnotation)
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaResourceControllerManager_JavaRCManagerHasJAXRSAnnotation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JAXRSAnnotation getJavaRCManagerHasJAXRSAnnotation();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.JavaResourceControllerManager#getJavaRCManagerHasJAXRSAnnotation <em>Java RC Manager Has JAXRS Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java RC Manager Has JAXRS Annotation</em>' containment reference.
	 * @see #getJavaRCManagerHasJAXRSAnnotation()
	 * @generated
	 */
	void setJavaRCManagerHasJAXRSAnnotation(JAXRSAnnotation value);

	/**
	 * Returns the value of the '<em><b>Java RC Manager Has HTTP Activity</b></em>' containment reference list.
	 * The list contents are of type {@link RESTfulServicePSM.HTTPActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java RC Manager Has HTTP Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java RC Manager Has HTTP Activity</em>' containment reference list.
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaResourceControllerManager_JavaRCManagerHasHTTPActivity()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<HTTPActivity> getJavaRCManagerHasHTTPActivity();

	/**
	 * Returns the value of the '<em><b>Has Associated RM Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Associated RM Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Associated RM Manager</em>' reference.
	 * @see #setHasAssociatedRMManager(JavaResourceModelManager)
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaResourceControllerManager_HasAssociatedRMManager()
	 * @model required="true"
	 * @generated
	 */
	JavaResourceModelManager getHasAssociatedRMManager();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.JavaResourceControllerManager#getHasAssociatedRMManager <em>Has Associated RM Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Associated RM Manager</em>' reference.
	 * @see #getHasAssociatedRMManager()
	 * @generated
	 */
	void setHasAssociatedRMManager(JavaResourceModelManager value);

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
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaResourceControllerManager_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.JavaResourceControllerManager#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Controller URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller URI</em>' attribute.
	 * @see #setControllerURI(String)
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaResourceControllerManager_ControllerURI()
	 * @model required="true"
	 * @generated
	 */
	String getControllerURI();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.JavaResourceControllerManager#getControllerURI <em>Controller URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller URI</em>' attribute.
	 * @see #getControllerURI()
	 * @generated
	 */
	void setControllerURI(String value);

	/**
	 * Returns the value of the '<em><b>Parent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Name</em>' attribute.
	 * @see #setParentName(String)
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaResourceControllerManager_ParentName()
	 * @model required="true"
	 * @generated
	 */
	String getParentName();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.JavaResourceControllerManager#getParentName <em>Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Name</em>' attribute.
	 * @see #getParentName()
	 * @generated
	 */
	void setParentName(String value);

} // JavaResourceControllerManager
