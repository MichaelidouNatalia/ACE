/**
 */
package RESTfulServicePSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Algo Resource Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RESTfulServicePSM.JavaAlgoResourceController#getHasAssociatedAlgoModel <em>Has Associated Algo Model</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaAlgoResourceController#getJavaAlgoRControllerHasHTTPActivity <em>Java Algo RController Has HTTP Activity</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaAlgoResourceController#getName <em>Name</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaAlgoResourceController#getControllerURI <em>Controller URI</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaAlgoResourceController#getParentName <em>Parent Name</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaAlgoResourceController#getAlgoControllerHasJAXRSAnnotation <em>Algo Controller Has JAXRS Annotation</em>}</li>
 * </ul>
 *
 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaAlgoResourceController()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='controllerURIPathAnnotation AlgoControllerHasUniqueProperHTTPActivity AlgoControllerActivitiesHaveJAXRSAnnotations algoControllerActivityAddsHypermediaLinkToSelf'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot controllerURIPathAnnotation='self.AlgoControllerHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@Path(\"\' + self.controllerURI + \'\")\')' AlgoControllerHasUniqueProperHTTPActivity='\n\t\t(\n\t\t\tself.JavaAlgoRControllerHasHTTPActivity->select(HTTPVerb = 3 or HTTPVerb = 2)->isEmpty() \n\t\t\tand\n\t\t\tself.JavaAlgoRControllerHasHTTPActivity->select(HTTPVerb = 0 or HTTPVerb = 1)->size() = 1\n\t\t)' AlgoControllerActivitiesHaveJAXRSAnnotations='self.JavaAlgoRControllerHasHTTPActivity->select(HTTPVerb = 0 or HTTPVerb = 1)->forAll(HTTPActivity | \n\t\t\t(\n\t\t\t\tHTTPActivity.ActivityHTTPVerb = 0 implies HTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@POST\')\n\t\t\t\tand\n\t\t\t\tHTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@POST\') implies HTTPActivity.ActivityHTTPVerb = 0 \n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tHTTPActivity.ActivityHTTPVerb = 1 implies HTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@GET\')\n\t\t\t\tand\n\t\t\t\tHTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@GET\') implies HTTPActivity.ActivityHTTPVerb = 1 \t\n\t\t\t)\n\t\t\tand HTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@Path(\"\' + HTTPActivity.HTTPActivityURI + \'\")\')\n\t\t)' algoControllerActivityAddsHypermediaLinkToSelf='\n\t\t(\n\t\t\t(\n\t\t\t\tself.JavaAlgoRControllerHasHTTPActivity->exists(HTTPVerb = 0)\n\t\t\t\timplies\n\t\t\t\tself.JavaAlgoRControllerHasHTTPActivity->select(HTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = \'Sibling\' and hasTargetJavaAlgoController = self)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tself.JavaAlgoRControllerHasHTTPActivity->select(HTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = \'Sibling\' and hasTargetJavaAlgoController = self)\n\t\t\t\timplies\t\t\n\t\t\t\tself.JavaAlgoRControllerHasHTTPActivity->exists(HTTPVerb = 0)\t\t\n\t\t\t)\n\t\t)\n\t\tor\n\t\t(\n\t\t\t(\n\t\t\t\tself.JavaAlgoRControllerHasHTTPActivity->exists(HTTPVerb = 1)\n\t\t\t\timplies\n\t\t\t\tself.JavaAlgoRControllerHasHTTPActivity->select(HTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Sibling\' and hasTargetJavaAlgoController = self)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tself.JavaAlgoRControllerHasHTTPActivity->select(HTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Sibling\' and hasTargetJavaAlgoController = self)\n\t\t\t\timplies\t\t\n\t\t\t\tself.JavaAlgoRControllerHasHTTPActivity->exists(HTTPVerb = 1)\t\t\n\t\t\t)\n\t\t)'"
 * @generated
 */
public interface JavaAlgoResourceController extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Associated Algo Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Associated Algo Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Associated Algo Model</em>' reference.
	 * @see #setHasAssociatedAlgoModel(JavaAlgoResourceModel)
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaAlgoResourceController_HasAssociatedAlgoModel()
	 * @model required="true"
	 * @generated
	 */
	JavaAlgoResourceModel getHasAssociatedAlgoModel();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.JavaAlgoResourceController#getHasAssociatedAlgoModel <em>Has Associated Algo Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Associated Algo Model</em>' reference.
	 * @see #getHasAssociatedAlgoModel()
	 * @generated
	 */
	void setHasAssociatedAlgoModel(JavaAlgoResourceModel value);

	/**
	 * Returns the value of the '<em><b>Java Algo RController Has HTTP Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Algo RController Has HTTP Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Algo RController Has HTTP Activity</em>' containment reference.
	 * @see #setJavaAlgoRControllerHasHTTPActivity(HTTPActivity)
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaAlgoResourceController_JavaAlgoRControllerHasHTTPActivity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	HTTPActivity getJavaAlgoRControllerHasHTTPActivity();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.JavaAlgoResourceController#getJavaAlgoRControllerHasHTTPActivity <em>Java Algo RController Has HTTP Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Algo RController Has HTTP Activity</em>' containment reference.
	 * @see #getJavaAlgoRControllerHasHTTPActivity()
	 * @generated
	 */
	void setJavaAlgoRControllerHasHTTPActivity(HTTPActivity value);

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
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaAlgoResourceController_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.JavaAlgoResourceController#getName <em>Name</em>}' attribute.
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
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaAlgoResourceController_ControllerURI()
	 * @model required="true"
	 * @generated
	 */
	String getControllerURI();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.JavaAlgoResourceController#getControllerURI <em>Controller URI</em>}' attribute.
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
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaAlgoResourceController_ParentName()
	 * @model required="true"
	 * @generated
	 */
	String getParentName();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.JavaAlgoResourceController#getParentName <em>Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Name</em>' attribute.
	 * @see #getParentName()
	 * @generated
	 */
	void setParentName(String value);

	/**
	 * Returns the value of the '<em><b>Algo Controller Has JAXRS Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algo Controller Has JAXRS Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algo Controller Has JAXRS Annotation</em>' containment reference.
	 * @see #setAlgoControllerHasJAXRSAnnotation(JAXRSAnnotation)
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaAlgoResourceController_AlgoControllerHasJAXRSAnnotation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JAXRSAnnotation getAlgoControllerHasJAXRSAnnotation();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.JavaAlgoResourceController#getAlgoControllerHasJAXRSAnnotation <em>Algo Controller Has JAXRS Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algo Controller Has JAXRS Annotation</em>' containment reference.
	 * @see #getAlgoControllerHasJAXRSAnnotation()
	 * @generated
	 */
	void setAlgoControllerHasJAXRSAnnotation(JAXRSAnnotation value);

} // JavaAlgoResourceController
