/**
 */
package RESTfulServicePSM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Resource Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RESTfulServicePSM.JavaResourceController#getJavaRControllerHasJAXRSAnnotation <em>Java RController Has JAXRS Annotation</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaResourceController#getJavaRControllerHasHTTPActivity <em>Java RController Has HTTP Activity</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaResourceController#getHasAssociatedJavaRModel <em>Has Associated Java RModel</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaResourceController#getName <em>Name</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaResourceController#getControllerURI <em>Controller URI</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaResourceController#getParentName <em>Parent Name</em>}</li>
 * </ul>
 *
 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaResourceController()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='controllerURIPathAnnotation RControllerNotAllowedVerb RControllerHasMinimumActivity RControllerActivitiesHaveJAXRSAnnotations rControllerGetActivityAddsGetHypermediaLinkToSelf rControllerPutActivityAddsPutHypermediaLinkToSelf rControllerGetActivityAddsPutHypermediaLinkToSelf rControllerGetActivityAddsDeleteHypermediaLinkToSelf rControllerPutActivityAddsGetHypermediaLinkToSelf rControllerPutActivityAddsDeleteHypermediaLinkToSelf'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot controllerURIPathAnnotation='self.JavaRControllerHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@Path(\"\' + self.controllerURI + \'\")\')' RControllerNotAllowedVerb='self.JavaRControllerHasHTTPActivity->select(HTTPVerb = 0)->isEmpty()' RControllerHasMinimumActivity='self.JavaRControllerHasHTTPActivity->exists(HTTPVerb <> 0)' RControllerActivitiesHaveJAXRSAnnotations='self.JavaRControllerHasHTTPActivity->select(HTTPVerb = 1 or HTTPVerb = 2 or HTTPVerb = 3)->forAll(HTTPActivity | \n\t\t\t(\n\t\t\t\tHTTPActivity.ActivityHTTPVerb = 2 implies HTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@PUT\')\n\t\t\t\tand\n\t\t\t\tHTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@PUT\') implies HTTPActivity.ActivityHTTPVerb = 2 \n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tHTTPActivity.ActivityHTTPVerb = 1 implies HTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@GET\')\n\t\t\t\tand\n\t\t\t\tHTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@GET\') implies HTTPActivity.ActivityHTTPVerb = 1 \t\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tHTTPActivity.ActivityHTTPVerb = 3 implies HTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@DELETE\')\n\t\t\t\tand\n\t\t\t\tHTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@DELETE\') implies HTTPActivity.ActivityHTTPVerb = 3\n\t\t\t)\n\t\t\tand HTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@Path(\"\' + HTTPActivity.HTTPActivityURI + \'\")\')\n\t\t)' rControllerGetActivityAddsGetHypermediaLinkToSelf='\n\t\t(\n\t\t\t(\n\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 1)\n\t\t\t\timplies\n\t\t\t\tself.JavaRControllerHasHTTPActivity.hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Sibling\' and hasTargetJavaRController = self)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tself.JavaRControllerHasHTTPActivity.hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Sibling\' and hasTargetJavaRController = self)\n\t\t\t\timplies\n\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 1)\n\t\t\t)\n\t\t)' rControllerPutActivityAddsPutHypermediaLinkToSelf='\n\t\t(\n\t\t\t(\n\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 2)\n\t\t\t\timplies\n\t\t\t\tself.JavaRControllerHasHTTPActivity.hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = \'Sibling\' and hasTargetJavaRController = self)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tself.JavaRControllerHasHTTPActivity.hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = \'Sibling\' and hasTargetJavaRController = self)\n\t\t\t\timplies\n\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 2)\n\t\t\t)\n\t\t)' rControllerGetActivityAddsPutHypermediaLinkToSelf='\n\t\t(\n\t\t\t(\n\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 2) and self.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 1)\n\t\t\t\timplies\n\t\t\t\tself.JavaRControllerHasHTTPActivity->select(HTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = \'Sibling\' and hasTargetJavaRController = self)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tself.JavaRControllerHasHTTPActivity->select(HTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = \'Sibling\' and hasTargetJavaRController = self)\n\t\t\t\timplies\n\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 2) and self.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 1)\n\t\t\t)\n\t\t)' rControllerGetActivityAddsDeleteHypermediaLinkToSelf='\n\t\t(\n\t\t\t(\n\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 3) and self.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 1)\n\t\t\t\timplies\n\t\t\t\tself.JavaRControllerHasHTTPActivity->select(HTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = \'Sibling\' and hasTargetJavaRController = self)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tself.JavaRControllerHasHTTPActivity->select(HTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = \'Sibling\' and hasTargetJavaRController = self)\n\t\t\t\timplies\n\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 3) and self.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 1)\n\t\t\t)\n\t\t)' rControllerPutActivityAddsGetHypermediaLinkToSelf='\n\t\t(\n\t\t\t(\n\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 1) and self.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 2)\n\t\t\t\timplies\n\t\t\t\tself.JavaRControllerHasHTTPActivity->select(HTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Sibling\' and hasTargetJavaRController = self)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tself.JavaRControllerHasHTTPActivity->select(HTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Sibling\' and hasTargetJavaRController = self)\n\t\t\t\timplies\n\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 1) and self.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 2)\n\t\t\t)\n\t\t)' rControllerPutActivityAddsDeleteHypermediaLinkToSelf='\n\t\t(\n\t\t\t(\n\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 3) and self.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 2)\n\t\t\t\timplies\n\t\t\t\tself.JavaRControllerHasHTTPActivity->select(HTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = \'Sibling\' and hasTargetJavaRController = self)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tself.JavaRControllerHasHTTPActivity->select(HTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = \'Sibling\' and hasTargetJavaRController = self)\n\t\t\t\timplies\n\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 3) and self.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 2)\n\t\t\t)\n\t\t)'"
 * @generated
 */
public interface JavaResourceController extends EObject {
	/**
	 * Returns the value of the '<em><b>Java RController Has JAXRS Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java RController Has JAXRS Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java RController Has JAXRS Annotation</em>' containment reference.
	 * @see #setJavaRControllerHasJAXRSAnnotation(JAXRSAnnotation)
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaResourceController_JavaRControllerHasJAXRSAnnotation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JAXRSAnnotation getJavaRControllerHasJAXRSAnnotation();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.JavaResourceController#getJavaRControllerHasJAXRSAnnotation <em>Java RController Has JAXRS Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java RController Has JAXRS Annotation</em>' containment reference.
	 * @see #getJavaRControllerHasJAXRSAnnotation()
	 * @generated
	 */
	void setJavaRControllerHasJAXRSAnnotation(JAXRSAnnotation value);

	/**
	 * Returns the value of the '<em><b>Java RController Has HTTP Activity</b></em>' containment reference list.
	 * The list contents are of type {@link RESTfulServicePSM.HTTPActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java RController Has HTTP Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java RController Has HTTP Activity</em>' containment reference list.
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaResourceController_JavaRControllerHasHTTPActivity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<HTTPActivity> getJavaRControllerHasHTTPActivity();

	/**
	 * Returns the value of the '<em><b>Has Associated Java RModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Associated Java RModel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Associated Java RModel</em>' reference.
	 * @see #setHasAssociatedJavaRModel(JavaResourceModel)
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaResourceController_HasAssociatedJavaRModel()
	 * @model required="true"
	 * @generated
	 */
	JavaResourceModel getHasAssociatedJavaRModel();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.JavaResourceController#getHasAssociatedJavaRModel <em>Has Associated Java RModel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Associated Java RModel</em>' reference.
	 * @see #getHasAssociatedJavaRModel()
	 * @generated
	 */
	void setHasAssociatedJavaRModel(JavaResourceModel value);

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
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaResourceController_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.JavaResourceController#getName <em>Name</em>}' attribute.
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
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaResourceController_ControllerURI()
	 * @model required="true"
	 * @generated
	 */
	String getControllerURI();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.JavaResourceController#getControllerURI <em>Controller URI</em>}' attribute.
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
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaResourceController_ParentName()
	 * @model required="true"
	 * @generated
	 */
	String getParentName();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.JavaResourceController#getParentName <em>Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Name</em>' attribute.
	 * @see #getParentName()
	 * @generated
	 */
	void setParentName(String value);

} // JavaResourceController
