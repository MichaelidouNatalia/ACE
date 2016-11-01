/**
 */
package RESTfulServicePSM.util;

import RESTfulServicePSM.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see RESTfulServicePSM.RESTfulServicePSMPackage
 * @generated
 */
public class RESTfulServicePSMValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RESTfulServicePSMValidator INSTANCE = new RESTfulServicePSMValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "RESTfulServicePSM";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESTfulServicePSMValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return RESTfulServicePSMPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case RESTfulServicePSMPackage.HIBERNATE_ACTIVITY:
				return validateHibernateActivity((HibernateActivity)value, diagnostics, context);
			case RESTfulServicePSMPackage.HIBERNATE_ANNOTATION:
				return validateHibernateAnnotation((HibernateAnnotation)value, diagnostics, context);
			case RESTfulServicePSMPackage.HIBERNATE_CONTROLLER:
				return validateHibernateController((HibernateController)value, diagnostics, context);
			case RESTfulServicePSMPackage.HTTP_ACTIVITY:
				return validateHTTPActivity((HTTPActivity)value, diagnostics, context);
			case RESTfulServicePSMPackage.HTTP_ACTIVITY_FUNCTION_PARAMETER:
				return validateHTTPActivityFunctionParameter((HTTPActivityFunctionParameter)value, diagnostics, context);
			case RESTfulServicePSMPackage.HTTP_ACTIVITY_HANDLER:
				return validateHTTPActivityHandler((HTTPActivityHandler)value, diagnostics, context);
			case RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER:
				return validateJavaAlgoResourceController((JavaAlgoResourceController)value, diagnostics, context);
			case RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL:
				return validateJavaAlgoResourceModel((JavaAlgoResourceModel)value, diagnostics, context);
			case RESTfulServicePSMPackage.JAVA_FUNCTION:
				return validateJavaFunction((JavaFunction)value, diagnostics, context);
			case RESTfulServicePSMPackage.JAVA_GETTER_FUNCTION:
				return validateJavaGetterFunction((JavaGetterFunction)value, diagnostics, context);
			case RESTfulServicePSMPackage.JAVA_HYPERMEDIA_FUNCTION:
				return validateJavaHypermediaFunction((JavaHypermediaFunction)value, diagnostics, context);
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER:
				return validateJavaResourceController((JavaResourceController)value, diagnostics, context);
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER:
				return validateJavaResourceControllerManager((JavaResourceControllerManager)value, diagnostics, context);
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL:
				return validateJavaResourceModel((JavaResourceModel)value, diagnostics, context);
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER:
				return validateJavaResourceModelManager((JavaResourceModelManager)value, diagnostics, context);
			case RESTfulServicePSMPackage.PSM_COMPONENT_PROPERTY:
				return validatePSMComponentProperty((PSMComponentProperty)value, diagnostics, context);
			case RESTfulServicePSMPackage.JAVA_SETTER_FUNCTION:
				return validateJavaSetterFunction((JavaSetterFunction)value, diagnostics, context);
			case RESTfulServicePSMPackage.JAXB_ANNOTATION:
				return validateJAXBAnnotation((JAXBAnnotation)value, diagnostics, context);
			case RESTfulServicePSMPackage.JAXRS_ANNOTATION:
				return validateJAXRSAnnotation((JAXRSAnnotation)value, diagnostics, context);
			case RESTfulServicePSMPackage.PSM_HYPERMEDIA_LINK:
				return validatePSMHypermediaLink((PSMHypermediaLink)value, diagnostics, context);
			case RESTfulServicePSMPackage.SERVICE_PSM:
				return validateServicePSM((ServicePSM)value, diagnostics, context);
			case RESTfulServicePSMPackage.FUNCTION_PARAMETER:
				return validateFunctionParameter((FunctionParameter)value, diagnostics, context);
			case RESTfulServicePSMPackage.HTTP_VERB:
				return validateHTTPVerb((HTTPVerb)value, diagnostics, context);
			case RESTfulServicePSMPackage.MEDIA_TYPE:
				return validateMediaType((MediaType)value, diagnostics, context);
			case RESTfulServicePSMPackage.LINK_TYPE:
				return validateLinkType((LinkType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHibernateActivity(HibernateActivity hibernateActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hibernateActivity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHibernateAnnotation(HibernateAnnotation hibernateAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hibernateAnnotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHibernateController(HibernateController hibernateController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hibernateController, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPActivity(HTTPActivity httpActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(httpActivity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPActivityFunctionParameter(HTTPActivityFunctionParameter httpActivityFunctionParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(httpActivityFunctionParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPActivityHandler(HTTPActivityHandler httpActivityHandler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(httpActivityHandler, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaAlgoResourceController(JavaAlgoResourceController javaAlgoResourceController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(javaAlgoResourceController, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(javaAlgoResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(javaAlgoResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(javaAlgoResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(javaAlgoResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(javaAlgoResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(javaAlgoResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(javaAlgoResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(javaAlgoResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaAlgoResourceController_controllerURIPathAnnotation(javaAlgoResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaAlgoResourceController_AlgoControllerHasUniqueProperHTTPActivity(javaAlgoResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaAlgoResourceController_AlgoControllerActivitiesHaveJAXRSAnnotations(javaAlgoResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaAlgoResourceController_algoControllerActivityAddsHypermediaLinkToSelf(javaAlgoResourceController, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the controllerURIPathAnnotation constraint of '<em>Java Algo Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_ALGO_RESOURCE_CONTROLLER__CONTROLLER_URI_PATH_ANNOTATION__EEXPRESSION = "self.AlgoControllerHasJAXRSAnnotation->one(JAXRSAnnotationText = '@Path(\"' + self.controllerURI + '\")')";

	/**
	 * Validates the controllerURIPathAnnotation constraint of '<em>Java Algo Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaAlgoResourceController_controllerURIPathAnnotation(JavaAlgoResourceController javaAlgoResourceController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_ALGO_RESOURCE_CONTROLLER,
				 javaAlgoResourceController,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "controllerURIPathAnnotation",
				 JAVA_ALGO_RESOURCE_CONTROLLER__CONTROLLER_URI_PATH_ANNOTATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AlgoControllerHasUniqueProperHTTPActivity constraint of '<em>Java Algo Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_HAS_UNIQUE_PROPER_HTTP_ACTIVITY__EEXPRESSION = "\n" +
		"\t\t(\n" +
		"\t\t\tself.JavaAlgoRControllerHasHTTPActivity->select(HTTPVerb = 3 or HTTPVerb = 2)->isEmpty() \n" +
		"\t\t\tand\n" +
		"\t\t\tself.JavaAlgoRControllerHasHTTPActivity->select(HTTPVerb = 0 or HTTPVerb = 1)->size() = 1\n" +
		"\t\t)";

	/**
	 * Validates the AlgoControllerHasUniqueProperHTTPActivity constraint of '<em>Java Algo Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaAlgoResourceController_AlgoControllerHasUniqueProperHTTPActivity(JavaAlgoResourceController javaAlgoResourceController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_ALGO_RESOURCE_CONTROLLER,
				 javaAlgoResourceController,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AlgoControllerHasUniqueProperHTTPActivity",
				 JAVA_ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_HAS_UNIQUE_PROPER_HTTP_ACTIVITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the AlgoControllerActivitiesHaveJAXRSAnnotations constraint of '<em>Java Algo Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_ACTIVITIES_HAVE_JAXRS_ANNOTATIONS__EEXPRESSION = "self.JavaAlgoRControllerHasHTTPActivity->select(HTTPVerb = 0 or HTTPVerb = 1)->forAll(HTTPActivity | \n" +
		"\t\t\t(\n" +
		"\t\t\t\tHTTPActivity.ActivityHTTPVerb = 0 implies HTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = '@POST')\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\tHTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = '@POST') implies HTTPActivity.ActivityHTTPVerb = 0 \n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tHTTPActivity.ActivityHTTPVerb = 1 implies HTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = '@GET')\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\tHTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = '@GET') implies HTTPActivity.ActivityHTTPVerb = 1 \t\n" +
		"\t\t\t)\n" +
		"\t\t\tand HTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = '@Path(\"' + HTTPActivity.HTTPActivityURI + '\")')\n" +
		"\t\t)";

	/**
	 * Validates the AlgoControllerActivitiesHaveJAXRSAnnotations constraint of '<em>Java Algo Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaAlgoResourceController_AlgoControllerActivitiesHaveJAXRSAnnotations(JavaAlgoResourceController javaAlgoResourceController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_ALGO_RESOURCE_CONTROLLER,
				 javaAlgoResourceController,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "AlgoControllerActivitiesHaveJAXRSAnnotations",
				 JAVA_ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_ACTIVITIES_HAVE_JAXRS_ANNOTATIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the algoControllerActivityAddsHypermediaLinkToSelf constraint of '<em>Java Algo Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_ACTIVITY_ADDS_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION = "\n" +
		"\t\t(\n" +
		"\t\t\t(\n" +
		"\t\t\t\tself.JavaAlgoRControllerHasHTTPActivity->exists(HTTPVerb = 0)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tself.JavaAlgoRControllerHasHTTPActivity->select(HTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = 'Sibling' and hasTargetJavaAlgoController = self)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tself.JavaAlgoRControllerHasHTTPActivity->select(HTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = 'Sibling' and hasTargetJavaAlgoController = self)\n" +
		"\t\t\t\timplies\t\t\n" +
		"\t\t\t\tself.JavaAlgoRControllerHasHTTPActivity->exists(HTTPVerb = 0)\t\t\n" +
		"\t\t\t)\n" +
		"\t\t)\n" +
		"\t\tor\n" +
		"\t\t(\n" +
		"\t\t\t(\n" +
		"\t\t\t\tself.JavaAlgoRControllerHasHTTPActivity->exists(HTTPVerb = 1)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tself.JavaAlgoRControllerHasHTTPActivity->select(HTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Sibling' and hasTargetJavaAlgoController = self)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tself.JavaAlgoRControllerHasHTTPActivity->select(HTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Sibling' and hasTargetJavaAlgoController = self)\n" +
		"\t\t\t\timplies\t\t\n" +
		"\t\t\t\tself.JavaAlgoRControllerHasHTTPActivity->exists(HTTPVerb = 1)\t\t\n" +
		"\t\t\t)\n" +
		"\t\t)";

	/**
	 * Validates the algoControllerActivityAddsHypermediaLinkToSelf constraint of '<em>Java Algo Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaAlgoResourceController_algoControllerActivityAddsHypermediaLinkToSelf(JavaAlgoResourceController javaAlgoResourceController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_ALGO_RESOURCE_CONTROLLER,
				 javaAlgoResourceController,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "algoControllerActivityAddsHypermediaLinkToSelf",
				 JAVA_ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_ACTIVITY_ADDS_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaAlgoResourceModel(JavaAlgoResourceModel javaAlgoResourceModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(javaAlgoResourceModel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(javaAlgoResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(javaAlgoResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(javaAlgoResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(javaAlgoResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(javaAlgoResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(javaAlgoResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(javaAlgoResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(javaAlgoResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaAlgoResourceModel_uniqueXMLRootElementAnnotation(javaAlgoResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaAlgoResourceModel_uniqueSetterForEveryProeprty(javaAlgoResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaAlgoResourceModel_uniqueGetterForEveryProeprty(javaAlgoResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaAlgoResourceModel_uniqueLinkListProperty(javaAlgoResourceModel, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the uniqueXMLRootElementAnnotation constraint of '<em>Java Algo Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_ALGO_RESOURCE_MODEL__UNIQUE_XML_ROOT_ELEMENT_ANNOTATION__EEXPRESSION = "self.JavaAlgoModelHasJAXBAnnotation->one(JAXBAnnotationText = '@XmlRootElement')";

	/**
	 * Validates the uniqueXMLRootElementAnnotation constraint of '<em>Java Algo Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaAlgoResourceModel_uniqueXMLRootElementAnnotation(JavaAlgoResourceModel javaAlgoResourceModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_ALGO_RESOURCE_MODEL,
				 javaAlgoResourceModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueXMLRootElementAnnotation",
				 JAVA_ALGO_RESOURCE_MODEL__UNIQUE_XML_ROOT_ELEMENT_ANNOTATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniqueSetterForEveryProeprty constraint of '<em>Java Algo Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_ALGO_RESOURCE_MODEL__UNIQUE_SETTER_FOR_EVERY_PROEPRTY__EEXPRESSION = "self.JavaAlgoModelHasProperty->forAll(Property | \n" +
		"\t\t\tself.JavaAlgoModelHasSetterFunction->one(name = 'set' + Property.name)\n" +
		"\t\t)";

	/**
	 * Validates the uniqueSetterForEveryProeprty constraint of '<em>Java Algo Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaAlgoResourceModel_uniqueSetterForEveryProeprty(JavaAlgoResourceModel javaAlgoResourceModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_ALGO_RESOURCE_MODEL,
				 javaAlgoResourceModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueSetterForEveryProeprty",
				 JAVA_ALGO_RESOURCE_MODEL__UNIQUE_SETTER_FOR_EVERY_PROEPRTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniqueGetterForEveryProeprty constraint of '<em>Java Algo Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_ALGO_RESOURCE_MODEL__UNIQUE_GETTER_FOR_EVERY_PROEPRTY__EEXPRESSION = "self.JavaAlgoModelHasProperty->forAll(Property | \n" +
		"\t\t\tself.JavaAlgoModelHasGetterFunction->one(name = 'get' + Property.name)\n" +
		"\t\t)";

	/**
	 * Validates the uniqueGetterForEveryProeprty constraint of '<em>Java Algo Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaAlgoResourceModel_uniqueGetterForEveryProeprty(JavaAlgoResourceModel javaAlgoResourceModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_ALGO_RESOURCE_MODEL,
				 javaAlgoResourceModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueGetterForEveryProeprty",
				 JAVA_ALGO_RESOURCE_MODEL__UNIQUE_GETTER_FOR_EVERY_PROEPRTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniqueLinkListProperty constraint of '<em>Java Algo Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_ALGO_RESOURCE_MODEL__UNIQUE_LINK_LIST_PROPERTY__EEXPRESSION = "self.JavaAlgoModelHasProperty->one(name = 'linklist') \n" +
		"\t\t\tand self.JavaAlgoModelHasProperty->select(name = 'linklist').PropertyHasHibernateAnnotation->one('@Transient')";

	/**
	 * Validates the uniqueLinkListProperty constraint of '<em>Java Algo Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaAlgoResourceModel_uniqueLinkListProperty(JavaAlgoResourceModel javaAlgoResourceModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_ALGO_RESOURCE_MODEL,
				 javaAlgoResourceModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueLinkListProperty",
				 JAVA_ALGO_RESOURCE_MODEL__UNIQUE_LINK_LIST_PROPERTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaFunction(JavaFunction javaFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(javaFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaGetterFunction(JavaGetterFunction javaGetterFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(javaGetterFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaHypermediaFunction(JavaHypermediaFunction javaHypermediaFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(javaHypermediaFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaResourceController(JavaResourceController javaResourceController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(javaResourceController, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(javaResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(javaResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(javaResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(javaResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(javaResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(javaResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(javaResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(javaResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaResourceController_controllerURIPathAnnotation(javaResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaResourceController_RControllerNotAllowedVerb(javaResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaResourceController_RControllerHasMinimumActivity(javaResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaResourceController_RControllerActivitiesHaveJAXRSAnnotations(javaResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaResourceController_rControllerGetActivityAddsGetHypermediaLinkToSelf(javaResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaResourceController_rControllerPutActivityAddsPutHypermediaLinkToSelf(javaResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaResourceController_rControllerGetActivityAddsPutHypermediaLinkToSelf(javaResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaResourceController_rControllerGetActivityAddsDeleteHypermediaLinkToSelf(javaResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaResourceController_rControllerPutActivityAddsGetHypermediaLinkToSelf(javaResourceController, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaResourceController_rControllerPutActivityAddsDeleteHypermediaLinkToSelf(javaResourceController, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the controllerURIPathAnnotation constraint of '<em>Java Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_RESOURCE_CONTROLLER__CONTROLLER_URI_PATH_ANNOTATION__EEXPRESSION = "self.JavaRControllerHasJAXRSAnnotation->one(JAXRSAnnotationText = '@Path(\"' + self.controllerURI + '\")')";

	/**
	 * Validates the controllerURIPathAnnotation constraint of '<em>Java Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaResourceController_controllerURIPathAnnotation(JavaResourceController javaResourceController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_RESOURCE_CONTROLLER,
				 javaResourceController,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "controllerURIPathAnnotation",
				 JAVA_RESOURCE_CONTROLLER__CONTROLLER_URI_PATH_ANNOTATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the RControllerNotAllowedVerb constraint of '<em>Java Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_RESOURCE_CONTROLLER__RCONTROLLER_NOT_ALLOWED_VERB__EEXPRESSION = "self.JavaRControllerHasHTTPActivity->select(HTTPVerb = 0)->isEmpty()";

	/**
	 * Validates the RControllerNotAllowedVerb constraint of '<em>Java Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaResourceController_RControllerNotAllowedVerb(JavaResourceController javaResourceController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_RESOURCE_CONTROLLER,
				 javaResourceController,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "RControllerNotAllowedVerb",
				 JAVA_RESOURCE_CONTROLLER__RCONTROLLER_NOT_ALLOWED_VERB__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the RControllerHasMinimumActivity constraint of '<em>Java Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_RESOURCE_CONTROLLER__RCONTROLLER_HAS_MINIMUM_ACTIVITY__EEXPRESSION = "self.JavaRControllerHasHTTPActivity->exists(HTTPVerb <> 0)";

	/**
	 * Validates the RControllerHasMinimumActivity constraint of '<em>Java Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaResourceController_RControllerHasMinimumActivity(JavaResourceController javaResourceController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_RESOURCE_CONTROLLER,
				 javaResourceController,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "RControllerHasMinimumActivity",
				 JAVA_RESOURCE_CONTROLLER__RCONTROLLER_HAS_MINIMUM_ACTIVITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the RControllerActivitiesHaveJAXRSAnnotations constraint of '<em>Java Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_RESOURCE_CONTROLLER__RCONTROLLER_ACTIVITIES_HAVE_JAXRS_ANNOTATIONS__EEXPRESSION = "self.JavaRControllerHasHTTPActivity->select(HTTPVerb = 1 or HTTPVerb = 2 or HTTPVerb = 3)->forAll(HTTPActivity | \n" +
		"\t\t\t(\n" +
		"\t\t\t\tHTTPActivity.ActivityHTTPVerb = 2 implies HTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = '@PUT')\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\tHTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = '@PUT') implies HTTPActivity.ActivityHTTPVerb = 2 \n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tHTTPActivity.ActivityHTTPVerb = 1 implies HTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = '@GET')\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\tHTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = '@GET') implies HTTPActivity.ActivityHTTPVerb = 1 \t\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tHTTPActivity.ActivityHTTPVerb = 3 implies HTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = '@DELETE')\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\tHTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = '@DELETE') implies HTTPActivity.ActivityHTTPVerb = 3\n" +
		"\t\t\t)\n" +
		"\t\t\tand HTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = '@Path(\"' + HTTPActivity.HTTPActivityURI + '\")')\n" +
		"\t\t)";

	/**
	 * Validates the RControllerActivitiesHaveJAXRSAnnotations constraint of '<em>Java Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaResourceController_RControllerActivitiesHaveJAXRSAnnotations(JavaResourceController javaResourceController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_RESOURCE_CONTROLLER,
				 javaResourceController,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "RControllerActivitiesHaveJAXRSAnnotations",
				 JAVA_RESOURCE_CONTROLLER__RCONTROLLER_ACTIVITIES_HAVE_JAXRS_ANNOTATIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerGetActivityAddsGetHypermediaLinkToSelf constraint of '<em>Java Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_RESOURCE_CONTROLLER__RCONTROLLER_GET_ACTIVITY_ADDS_GET_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION = "\n" +
		"\t\t(\n" +
		"\t\t\t(\n" +
		"\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 1)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tself.JavaRControllerHasHTTPActivity.hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Sibling' and hasTargetJavaRController = self)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tself.JavaRControllerHasHTTPActivity.hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Sibling' and hasTargetJavaRController = self)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 1)\n" +
		"\t\t\t)\n" +
		"\t\t)";

	/**
	 * Validates the rControllerGetActivityAddsGetHypermediaLinkToSelf constraint of '<em>Java Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaResourceController_rControllerGetActivityAddsGetHypermediaLinkToSelf(JavaResourceController javaResourceController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_RESOURCE_CONTROLLER,
				 javaResourceController,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerGetActivityAddsGetHypermediaLinkToSelf",
				 JAVA_RESOURCE_CONTROLLER__RCONTROLLER_GET_ACTIVITY_ADDS_GET_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerPutActivityAddsPutHypermediaLinkToSelf constraint of '<em>Java Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_RESOURCE_CONTROLLER__RCONTROLLER_PUT_ACTIVITY_ADDS_PUT_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION = "\n" +
		"\t\t(\n" +
		"\t\t\t(\n" +
		"\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 2)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tself.JavaRControllerHasHTTPActivity.hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = 'Sibling' and hasTargetJavaRController = self)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tself.JavaRControllerHasHTTPActivity.hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = 'Sibling' and hasTargetJavaRController = self)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 2)\n" +
		"\t\t\t)\n" +
		"\t\t)";

	/**
	 * Validates the rControllerPutActivityAddsPutHypermediaLinkToSelf constraint of '<em>Java Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaResourceController_rControllerPutActivityAddsPutHypermediaLinkToSelf(JavaResourceController javaResourceController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_RESOURCE_CONTROLLER,
				 javaResourceController,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerPutActivityAddsPutHypermediaLinkToSelf",
				 JAVA_RESOURCE_CONTROLLER__RCONTROLLER_PUT_ACTIVITY_ADDS_PUT_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerGetActivityAddsPutHypermediaLinkToSelf constraint of '<em>Java Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_RESOURCE_CONTROLLER__RCONTROLLER_GET_ACTIVITY_ADDS_PUT_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION = "\n" +
		"\t\t(\n" +
		"\t\t\t(\n" +
		"\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 2) and self.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 1)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tself.JavaRControllerHasHTTPActivity->select(HTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = 'Sibling' and hasTargetJavaRController = self)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tself.JavaRControllerHasHTTPActivity->select(HTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = 'Sibling' and hasTargetJavaRController = self)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 2) and self.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 1)\n" +
		"\t\t\t)\n" +
		"\t\t)";

	/**
	 * Validates the rControllerGetActivityAddsPutHypermediaLinkToSelf constraint of '<em>Java Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaResourceController_rControllerGetActivityAddsPutHypermediaLinkToSelf(JavaResourceController javaResourceController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_RESOURCE_CONTROLLER,
				 javaResourceController,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerGetActivityAddsPutHypermediaLinkToSelf",
				 JAVA_RESOURCE_CONTROLLER__RCONTROLLER_GET_ACTIVITY_ADDS_PUT_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerGetActivityAddsDeleteHypermediaLinkToSelf constraint of '<em>Java Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_RESOURCE_CONTROLLER__RCONTROLLER_GET_ACTIVITY_ADDS_DELETE_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION = "\n" +
		"\t\t(\n" +
		"\t\t\t(\n" +
		"\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 3) and self.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 1)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tself.JavaRControllerHasHTTPActivity->select(HTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = 'Sibling' and hasTargetJavaRController = self)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tself.JavaRControllerHasHTTPActivity->select(HTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = 'Sibling' and hasTargetJavaRController = self)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 3) and self.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 1)\n" +
		"\t\t\t)\n" +
		"\t\t)";

	/**
	 * Validates the rControllerGetActivityAddsDeleteHypermediaLinkToSelf constraint of '<em>Java Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaResourceController_rControllerGetActivityAddsDeleteHypermediaLinkToSelf(JavaResourceController javaResourceController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_RESOURCE_CONTROLLER,
				 javaResourceController,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerGetActivityAddsDeleteHypermediaLinkToSelf",
				 JAVA_RESOURCE_CONTROLLER__RCONTROLLER_GET_ACTIVITY_ADDS_DELETE_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerPutActivityAddsGetHypermediaLinkToSelf constraint of '<em>Java Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_RESOURCE_CONTROLLER__RCONTROLLER_PUT_ACTIVITY_ADDS_GET_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION = "\n" +
		"\t\t(\n" +
		"\t\t\t(\n" +
		"\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 1) and self.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 2)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tself.JavaRControllerHasHTTPActivity->select(HTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Sibling' and hasTargetJavaRController = self)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tself.JavaRControllerHasHTTPActivity->select(HTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Sibling' and hasTargetJavaRController = self)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 1) and self.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 2)\n" +
		"\t\t\t)\n" +
		"\t\t)";

	/**
	 * Validates the rControllerPutActivityAddsGetHypermediaLinkToSelf constraint of '<em>Java Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaResourceController_rControllerPutActivityAddsGetHypermediaLinkToSelf(JavaResourceController javaResourceController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_RESOURCE_CONTROLLER,
				 javaResourceController,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerPutActivityAddsGetHypermediaLinkToSelf",
				 JAVA_RESOURCE_CONTROLLER__RCONTROLLER_PUT_ACTIVITY_ADDS_GET_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerPutActivityAddsDeleteHypermediaLinkToSelf constraint of '<em>Java Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_RESOURCE_CONTROLLER__RCONTROLLER_PUT_ACTIVITY_ADDS_DELETE_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION = "\n" +
		"\t\t(\n" +
		"\t\t\t(\n" +
		"\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 3) and self.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 2)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tself.JavaRControllerHasHTTPActivity->select(HTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = 'Sibling' and hasTargetJavaRController = self)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tself.JavaRControllerHasHTTPActivity->select(HTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = 'Sibling' and hasTargetJavaRController = self)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 3) and self.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 2)\n" +
		"\t\t\t)\n" +
		"\t\t)";

	/**
	 * Validates the rControllerPutActivityAddsDeleteHypermediaLinkToSelf constraint of '<em>Java Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaResourceController_rControllerPutActivityAddsDeleteHypermediaLinkToSelf(JavaResourceController javaResourceController, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_RESOURCE_CONTROLLER,
				 javaResourceController,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerPutActivityAddsDeleteHypermediaLinkToSelf",
				 JAVA_RESOURCE_CONTROLLER__RCONTROLLER_PUT_ACTIVITY_ADDS_DELETE_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaResourceControllerManager(JavaResourceControllerManager javaResourceControllerManager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(javaResourceControllerManager, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(javaResourceControllerManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(javaResourceControllerManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(javaResourceControllerManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(javaResourceControllerManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(javaResourceControllerManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(javaResourceControllerManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(javaResourceControllerManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(javaResourceControllerManager, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaResourceControllerManager_controllerURIPathAnnotation(javaResourceControllerManager, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaResourceControllerManager_RCManagerNotAllowedHTTPActivityVerbs(javaResourceControllerManager, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaResourceControllerManager_RCManagerActivitiesHaveJAXRSAnnotations(javaResourceControllerManager, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaResourceControllerManager_JRCManagerPostActivityAddsPostHypermediaLinkToSelf(javaResourceControllerManager, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaResourceControllerManager_JRCManagerGetActivityAddsPostHypermediaLinkToSelf(javaResourceControllerManager, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaResourceControllerManager_JRCManagerPostActivityAddsGetHypermediaLinkToSelf(javaResourceControllerManager, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the controllerURIPathAnnotation constraint of '<em>Java Resource Controller Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_RESOURCE_CONTROLLER_MANAGER__CONTROLLER_URI_PATH_ANNOTATION__EEXPRESSION = "self.JavaRCManagerHasJAXRSAnnotation->one(JAXRSAnnotationText = '@Path(\"' + self.controllerURI + '\")')";

	/**
	 * Validates the controllerURIPathAnnotation constraint of '<em>Java Resource Controller Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaResourceControllerManager_controllerURIPathAnnotation(JavaResourceControllerManager javaResourceControllerManager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_RESOURCE_CONTROLLER_MANAGER,
				 javaResourceControllerManager,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "controllerURIPathAnnotation",
				 JAVA_RESOURCE_CONTROLLER_MANAGER__CONTROLLER_URI_PATH_ANNOTATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the RCManagerNotAllowedHTTPActivityVerbs constraint of '<em>Java Resource Controller Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_RESOURCE_CONTROLLER_MANAGER__RC_MANAGER_NOT_ALLOWED_HTTP_ACTIVITY_VERBS__EEXPRESSION = "self.JavaRCManagerHasHTTPActivity->select(HTTPVerb = 2 or HTTPVerb = 3)->isEmpty()";

	/**
	 * Validates the RCManagerNotAllowedHTTPActivityVerbs constraint of '<em>Java Resource Controller Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaResourceControllerManager_RCManagerNotAllowedHTTPActivityVerbs(JavaResourceControllerManager javaResourceControllerManager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_RESOURCE_CONTROLLER_MANAGER,
				 javaResourceControllerManager,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "RCManagerNotAllowedHTTPActivityVerbs",
				 JAVA_RESOURCE_CONTROLLER_MANAGER__RC_MANAGER_NOT_ALLOWED_HTTP_ACTIVITY_VERBS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the RCManagerActivitiesHaveJAXRSAnnotations constraint of '<em>Java Resource Controller Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_RESOURCE_CONTROLLER_MANAGER__RC_MANAGER_ACTIVITIES_HAVE_JAXRS_ANNOTATIONS__EEXPRESSION = "self.JavaRCManagerHasHTTPActivity->select(HTTPVerb = 0 or HTTPVerb = 1)->forAll(HTTPActivity | \n" +
		"\t\t\t(\n" +
		"\t\t\t\tHTTPActivity.ActivityHTTPVerb = 0 implies HTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = '@POST')\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\tHTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = '@POST') implies HTTPActivity.ActivityHTTPVerb = 0 \n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tHTTPActivity.ActivityHTTPVerb = 1 implies HTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = '@GET')\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\tHTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = '@GET') implies HTTPActivity.ActivityHTTPVerb = 1 \t\n" +
		"\t\t\t)\n" +
		"\t\t\tand HTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = '@Path(\"' + HTTPActivity.HTTPActivityURI + '\")')\n" +
		"\t\t)";

	/**
	 * Validates the RCManagerActivitiesHaveJAXRSAnnotations constraint of '<em>Java Resource Controller Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaResourceControllerManager_RCManagerActivitiesHaveJAXRSAnnotations(JavaResourceControllerManager javaResourceControllerManager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_RESOURCE_CONTROLLER_MANAGER,
				 javaResourceControllerManager,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "RCManagerActivitiesHaveJAXRSAnnotations",
				 JAVA_RESOURCE_CONTROLLER_MANAGER__RC_MANAGER_ACTIVITIES_HAVE_JAXRS_ANNOTATIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the JRCManagerPostActivityAddsPostHypermediaLinkToSelf constraint of '<em>Java Resource Controller Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_RESOURCE_CONTROLLER_MANAGER__JRC_MANAGER_POST_ACTIVITY_ADDS_POST_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION = "self.JavaRCManagerHasHTTPActivity->select(HTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and hasTargetRCManager = self and LinkType = 'Sibling')";

	/**
	 * Validates the JRCManagerPostActivityAddsPostHypermediaLinkToSelf constraint of '<em>Java Resource Controller Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaResourceControllerManager_JRCManagerPostActivityAddsPostHypermediaLinkToSelf(JavaResourceControllerManager javaResourceControllerManager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_RESOURCE_CONTROLLER_MANAGER,
				 javaResourceControllerManager,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "JRCManagerPostActivityAddsPostHypermediaLinkToSelf",
				 JAVA_RESOURCE_CONTROLLER_MANAGER__JRC_MANAGER_POST_ACTIVITY_ADDS_POST_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the JRCManagerGetActivityAddsPostHypermediaLinkToSelf constraint of '<em>Java Resource Controller Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_RESOURCE_CONTROLLER_MANAGER__JRC_MANAGER_GET_ACTIVITY_ADDS_POST_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION = "self.JavaRCManagerHasHTTPActivity->select(HTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and hasTargetRCManager = self and LinkType = 'Sibling')";

	/**
	 * Validates the JRCManagerGetActivityAddsPostHypermediaLinkToSelf constraint of '<em>Java Resource Controller Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaResourceControllerManager_JRCManagerGetActivityAddsPostHypermediaLinkToSelf(JavaResourceControllerManager javaResourceControllerManager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_RESOURCE_CONTROLLER_MANAGER,
				 javaResourceControllerManager,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "JRCManagerGetActivityAddsPostHypermediaLinkToSelf",
				 JAVA_RESOURCE_CONTROLLER_MANAGER__JRC_MANAGER_GET_ACTIVITY_ADDS_POST_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the JRCManagerPostActivityAddsGetHypermediaLinkToSelf constraint of '<em>Java Resource Controller Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_RESOURCE_CONTROLLER_MANAGER__JRC_MANAGER_POST_ACTIVITY_ADDS_GET_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION = "self.JavaRCManagerHasHTTPActivity->select(HTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and hasTargetRCManager = self and LinkType = 'Sibling')";

	/**
	 * Validates the JRCManagerPostActivityAddsGetHypermediaLinkToSelf constraint of '<em>Java Resource Controller Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaResourceControllerManager_JRCManagerPostActivityAddsGetHypermediaLinkToSelf(JavaResourceControllerManager javaResourceControllerManager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_RESOURCE_CONTROLLER_MANAGER,
				 javaResourceControllerManager,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "JRCManagerPostActivityAddsGetHypermediaLinkToSelf",
				 JAVA_RESOURCE_CONTROLLER_MANAGER__JRC_MANAGER_POST_ACTIVITY_ADDS_GET_HYPERMEDIA_LINK_TO_SELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaResourceModel(JavaResourceModel javaResourceModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(javaResourceModel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(javaResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(javaResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(javaResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(javaResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(javaResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(javaResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(javaResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(javaResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaResourceModel_uniqueXMLRootElementAnnotation(javaResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaResourceModel_uniqueNamingProperty(javaResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaResourceModel_neededRModelHibernateAnnotationsExist(javaResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaResourceModel_uniquePrimaryIdentifier(javaResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaResourceModel_uniqueSetterForEveryProeprty(javaResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaResourceModel_uniqueGetterForEveryProeprty(javaResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaResourceModel_uniqueLinkListProperty(javaResourceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaResourceModel_properCollectionHibernateAnnotations(javaResourceModel, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the uniqueXMLRootElementAnnotation constraint of '<em>Java Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_RESOURCE_MODEL__UNIQUE_XML_ROOT_ELEMENT_ANNOTATION__EEXPRESSION = "self.JavaRModelHasJAXBAnnotation->one(JAXBAnnotationText = '@XmlRootElement')";

	/**
	 * Validates the uniqueXMLRootElementAnnotation constraint of '<em>Java Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaResourceModel_uniqueXMLRootElementAnnotation(JavaResourceModel javaResourceModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_RESOURCE_MODEL,
				 javaResourceModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueXMLRootElementAnnotation",
				 JAVA_RESOURCE_MODEL__UNIQUE_XML_ROOT_ELEMENT_ANNOTATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniqueNamingProperty constraint of '<em>Java Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_RESOURCE_MODEL__UNIQUE_NAMING_PROPERTY__EEXPRESSION = "self.JavaRModelHasProperty->isUnique(bIsNamingProperty = true)";

	/**
	 * Validates the uniqueNamingProperty constraint of '<em>Java Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaResourceModel_uniqueNamingProperty(JavaResourceModel javaResourceModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_RESOURCE_MODEL,
				 javaResourceModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueNamingProperty",
				 JAVA_RESOURCE_MODEL__UNIQUE_NAMING_PROPERTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the neededRModelHibernateAnnotationsExist constraint of '<em>Java Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_RESOURCE_MODEL__NEEDED_RMODEL_HIBERNATE_ANNOTATIONS_EXIST__EEXPRESSION = "self.JavaRModelHasHibernateAnnotation->one('@Entity') and self.JavaRModelHasHibernateAnnotation->one('@Table(name=\"' + self.parentName + '\")')";

	/**
	 * Validates the neededRModelHibernateAnnotationsExist constraint of '<em>Java Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaResourceModel_neededRModelHibernateAnnotationsExist(JavaResourceModel javaResourceModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_RESOURCE_MODEL,
				 javaResourceModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "neededRModelHibernateAnnotationsExist",
				 JAVA_RESOURCE_MODEL__NEEDED_RMODEL_HIBERNATE_ANNOTATIONS_EXIST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniquePrimaryIdentifier constraint of '<em>Java Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_RESOURCE_MODEL__UNIQUE_PRIMARY_IDENTIFIER__EEXPRESSION = "self.JavaRModelHasProperty->isUnique(bIsPrimaryIdentifier = true)";

	/**
	 * Validates the uniquePrimaryIdentifier constraint of '<em>Java Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaResourceModel_uniquePrimaryIdentifier(JavaResourceModel javaResourceModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_RESOURCE_MODEL,
				 javaResourceModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniquePrimaryIdentifier",
				 JAVA_RESOURCE_MODEL__UNIQUE_PRIMARY_IDENTIFIER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniqueSetterForEveryProeprty constraint of '<em>Java Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_RESOURCE_MODEL__UNIQUE_SETTER_FOR_EVERY_PROEPRTY__EEXPRESSION = "self.JavaRModelHasProperty->forAll(Property | \n" +
		"\t\t\tself.JavaRModelHasSetter->one(name = 'set' + Property.name)\n" +
		"\t\t)";

	/**
	 * Validates the uniqueSetterForEveryProeprty constraint of '<em>Java Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaResourceModel_uniqueSetterForEveryProeprty(JavaResourceModel javaResourceModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_RESOURCE_MODEL,
				 javaResourceModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueSetterForEveryProeprty",
				 JAVA_RESOURCE_MODEL__UNIQUE_SETTER_FOR_EVERY_PROEPRTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniqueGetterForEveryProeprty constraint of '<em>Java Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_RESOURCE_MODEL__UNIQUE_GETTER_FOR_EVERY_PROEPRTY__EEXPRESSION = "self.JavaRModelHasProperty->forAll(Property | \n" +
		"\t\t\tself.JavaRModelHasGetter->one(name = 'get' + Property.name)\n" +
		"\t\t)";

	/**
	 * Validates the uniqueGetterForEveryProeprty constraint of '<em>Java Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaResourceModel_uniqueGetterForEveryProeprty(JavaResourceModel javaResourceModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_RESOURCE_MODEL,
				 javaResourceModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueGetterForEveryProeprty",
				 JAVA_RESOURCE_MODEL__UNIQUE_GETTER_FOR_EVERY_PROEPRTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniqueLinkListProperty constraint of '<em>Java Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_RESOURCE_MODEL__UNIQUE_LINK_LIST_PROPERTY__EEXPRESSION = "self.JavaRModelHasProperty->one(name = 'linklist') \n" +
		"\t\t\tand self.JavaRModelHasProperty->select(name = 'linklist').PropertyHasHibernateAnnotation->one('@Transient')";

	/**
	 * Validates the uniqueLinkListProperty constraint of '<em>Java Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaResourceModel_uniqueLinkListProperty(JavaResourceModel javaResourceModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_RESOURCE_MODEL,
				 javaResourceModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueLinkListProperty",
				 JAVA_RESOURCE_MODEL__UNIQUE_LINK_LIST_PROPERTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the properCollectionHibernateAnnotations constraint of '<em>Java Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_RESOURCE_MODEL__PROPER_COLLECTION_HIBERNATE_ANNOTATIONS__EEXPRESSION = "\n" +
		"\t\tlet JRRModels : Sequence(JavaResourceModel) = self.hasRelatedJavaRMManager.hasRelatedJavaRModel in\n" +
		"\t\t\tself.JavaRModelHasProperty->select((bIsUnique = false) and (name <> 'linklist'))->reject( Property | JRRModels->exists(JRRModel | 'SetOf' + JRRModel.name = Property.name))\n" +
		"\t\t\t\t->forAll(CollectionProperty | CollectionProperty.PropertyHasHibernateAnnotation->one('@ElementCollection(fetch = FetchType.EAGER)')\n" +
		"\t\t\t\t\tand\n" +
		"\t\t\t\t\tCollectionProperty.PropertyHasHibernateAnnotation->one('@CollectionTable(name=\"' + self.parentName + CollectionProperty.name +'\", joinColumns=@JoinColumn(name=\"' + self.JavaRModelHasProperty->select(bIsPrimaryIdentifier = true)->at(1).name + '\"))')\n" +
		"\t\t\t\t\tand\n" +
		"\t\t\t\t\tCollectionProperty.PropertyHasHibernateAnnotation->one('@ForeignKey(name = \"fk_' + self.parentName + '_' + CollectionProperty.name + '\")')\n" +
		"\t\t\t\t)";

	/**
	 * Validates the properCollectionHibernateAnnotations constraint of '<em>Java Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaResourceModel_properCollectionHibernateAnnotations(JavaResourceModel javaResourceModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_RESOURCE_MODEL,
				 javaResourceModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "properCollectionHibernateAnnotations",
				 JAVA_RESOURCE_MODEL__PROPER_COLLECTION_HIBERNATE_ANNOTATIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaResourceModelManager(JavaResourceModelManager javaResourceModelManager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(javaResourceModelManager, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(javaResourceModelManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(javaResourceModelManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(javaResourceModelManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(javaResourceModelManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(javaResourceModelManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(javaResourceModelManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(javaResourceModelManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(javaResourceModelManager, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaResourceModelManager_uniqueXMLRootElementAnnotation(javaResourceModelManager, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaResourceModelManager_uniqueSetterForEveryProeprty(javaResourceModelManager, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaResourceModelManager_uniqueGetterForEveryProeprty(javaResourceModelManager, diagnostics, context);
		if (result || diagnostics != null) result &= validateJavaResourceModelManager_uniqueLinkListProperty(javaResourceModelManager, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the uniqueXMLRootElementAnnotation constraint of '<em>Java Resource Model Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_RESOURCE_MODEL_MANAGER__UNIQUE_XML_ROOT_ELEMENT_ANNOTATION__EEXPRESSION = "self.JavaRMManagerHasJAXBAnnotation->one(JAXBAnnotationText = '@XmlRootElement')";

	/**
	 * Validates the uniqueXMLRootElementAnnotation constraint of '<em>Java Resource Model Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaResourceModelManager_uniqueXMLRootElementAnnotation(JavaResourceModelManager javaResourceModelManager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_RESOURCE_MODEL_MANAGER,
				 javaResourceModelManager,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueXMLRootElementAnnotation",
				 JAVA_RESOURCE_MODEL_MANAGER__UNIQUE_XML_ROOT_ELEMENT_ANNOTATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniqueSetterForEveryProeprty constraint of '<em>Java Resource Model Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_RESOURCE_MODEL_MANAGER__UNIQUE_SETTER_FOR_EVERY_PROEPRTY__EEXPRESSION = "self.JavaRMManagerHasProperty->forAll(Property | \n" +
		"\t\t\tself.JavaRMManagerHasSetter->one(name = 'set' + Property.name)\n" +
		"\t\t)";

	/**
	 * Validates the uniqueSetterForEveryProeprty constraint of '<em>Java Resource Model Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaResourceModelManager_uniqueSetterForEveryProeprty(JavaResourceModelManager javaResourceModelManager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_RESOURCE_MODEL_MANAGER,
				 javaResourceModelManager,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueSetterForEveryProeprty",
				 JAVA_RESOURCE_MODEL_MANAGER__UNIQUE_SETTER_FOR_EVERY_PROEPRTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniqueGetterForEveryProeprty constraint of '<em>Java Resource Model Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_RESOURCE_MODEL_MANAGER__UNIQUE_GETTER_FOR_EVERY_PROEPRTY__EEXPRESSION = "self.JavaRMManagerHasProperty->forAll(Property | \n" +
		"\t\t\tself.JavaRMManagerHasGetter->one(name = 'get' + Property.name)\n" +
		"\t\t)";

	/**
	 * Validates the uniqueGetterForEveryProeprty constraint of '<em>Java Resource Model Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaResourceModelManager_uniqueGetterForEveryProeprty(JavaResourceModelManager javaResourceModelManager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_RESOURCE_MODEL_MANAGER,
				 javaResourceModelManager,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueGetterForEveryProeprty",
				 JAVA_RESOURCE_MODEL_MANAGER__UNIQUE_GETTER_FOR_EVERY_PROEPRTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the uniqueLinkListProperty constraint of '<em>Java Resource Model Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String JAVA_RESOURCE_MODEL_MANAGER__UNIQUE_LINK_LIST_PROPERTY__EEXPRESSION = "self.JavaRMManagerHasProperty->one(name = 'linklist') \n" +
		"\t\t\tand self.JavaRMManagerHasProperty->select(name = 'linklist').PropertyHasHibernateAnnotation->one('@Transient')";

	/**
	 * Validates the uniqueLinkListProperty constraint of '<em>Java Resource Model Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaResourceModelManager_uniqueLinkListProperty(JavaResourceModelManager javaResourceModelManager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.JAVA_RESOURCE_MODEL_MANAGER,
				 javaResourceModelManager,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "uniqueLinkListProperty",
				 JAVA_RESOURCE_MODEL_MANAGER__UNIQUE_LINK_LIST_PROPERTY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePSMComponentProperty(PSMComponentProperty psmComponentProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(psmComponentProperty, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(psmComponentProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(psmComponentProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(psmComponentProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(psmComponentProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(psmComponentProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(psmComponentProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(psmComponentProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(psmComponentProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validatePSMComponentProperty_primaryIdentifierHasProperAnnotations(psmComponentProperty, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the primaryIdentifierHasProperAnnotations constraint of '<em>PSM Component Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PSM_COMPONENT_PROPERTY__PRIMARY_IDENTIFIER_HAS_PROPER_ANNOTATIONS__EEXPRESSION = "(\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t(\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tself.bIsPrimaryIdentifier \n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\timplies \n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t(\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t\tself.PropertyHasHibernateAnnotation->one('@Id')\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t\tand\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t\tself.PropertyHasHibernateAnnotation->one('@GeneratedValue')\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t)\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t)\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t \tand\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t(\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t(\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t\tself.PropertyHasHibernateAnnotation->one('@Id')\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t\tand\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t\tself.PropertyHasHibernateAnnotation->one('@GeneratedValue')\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t)\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\timplies\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\tself.bIsPrimaryIdentifier\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t)\n" +
		"\t\t\t\t\t\t\t\t\t\t\t\t\t\t )";

	/**
	 * Validates the primaryIdentifierHasProperAnnotations constraint of '<em>PSM Component Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePSMComponentProperty_primaryIdentifierHasProperAnnotations(PSMComponentProperty psmComponentProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.PSM_COMPONENT_PROPERTY,
				 psmComponentProperty,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "primaryIdentifierHasProperAnnotations",
				 PSM_COMPONENT_PROPERTY__PRIMARY_IDENTIFIER_HAS_PROPER_ANNOTATIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJavaSetterFunction(JavaSetterFunction javaSetterFunction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(javaSetterFunction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJAXBAnnotation(JAXBAnnotation jaxbAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jaxbAnnotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJAXRSAnnotation(JAXRSAnnotation jaxrsAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jaxrsAnnotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePSMHypermediaLink(PSMHypermediaLink psmHypermediaLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(psmHypermediaLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(servicePSM, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateServicePSM_allModelsHaveRResourcePropertiesWithProperHibernateAnnotations(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateServicePSM_allModelsHavePResourcePropertiesWithProperHibernateAnnotations(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateServicePSM_rMPropertiesSettersHaveProperXMLTransientAnnotation(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateServicePSM_rMPropertiesHaveColumnAnnotation(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateServicePSM_RControllerUniqueHTTPVerbsPerParent(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateServicePSM_RCManagerHasUniqueHTTPActivityVerbsPerParent(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateServicePSM_rCManagerPostActivityAddsGetHypermediaLinkToRRController(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateServicePSM_rCManagerPostActivityAddsPutHypermediaLinkToRRController(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateServicePSM_rCManagerPostActivityAddsDeleteHypermediaLinkToRRController(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateServicePSM_rCManagerGetActivityAddsGetHypermediaLinkToRRController(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateServicePSM_rCManagerGetActivityAddsPutHypermediaLinkToRRController(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateServicePSM_rCManagerGetActivityAddsDeleteHypermediaLinkToRRController(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateServicePSM_rCManagerPostActivityAddsGetHypermediaLinkToParentRController(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateServicePSM_rCManagerPostActivityAddsPutHypermediaLinkToParentRController(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateServicePSM_rCManagerPostActivityAddsDeleteHypermediaLinkToParentRController(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateServicePSM_rCManagerGetActivityAddsGetHypermediaLinkToParentRController(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateServicePSM_rCManagerGetActivityAddsPutHypermediaLinkToParentRController(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateServicePSM_rCManagerGetActivityAddsDeleteHypermediaLinkToParentRController(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateServicePSM_rControllerGetActivityAddsPostHypermediaLinkToRCManager(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateServicePSM_rControllerGetActivityAddsGetHypermediaLinkToRCManager(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateServicePSM_rControllerPutActivityAddsPostHypermediaLinkToRCManager(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateServicePSM_rControllerPutActivityAddsGetHypermediaLinkToRCManager(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateServicePSM_rControllerGetActivityAddsPostHypermediaLinkToParentRCManager(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateServicePSM_rControllerGetActivityAddsGetHypermediaLinkToParentRCManager(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateServicePSM_rControllerPutActivityAddsPostHypermediaLinkToParentRCManager(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateServicePSM_rControllerPutActivityAddsGetHypermediaLinkToParentRCManager(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateServicePSM_rControllerDeleteActivityAddsPostHypermediaLinkToParentRCManager(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateServicePSM_rControllerDeleteActivityAddsGetHypermediaLinkToParentRCManager(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateServicePSM_algoControllerActivityAddsHypermediaLinkToRAlgoController(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateServicePSM_algoControllerAddsHypermediaLinkToParentAlgoController(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateServicePSM_rControllerGetAddsHypermediaLinkToRAlgoController(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateServicePSM_rControllerPutAddsHypermediaLinkToRAlgoController(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateServicePSM_algoControllerAddsGetHypermediaLinkToParentRController(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateServicePSM_algoControllerAddsPutHypermediaLinkToParentRController(servicePSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateServicePSM_algoControllerAddsDeleteHypermediaLinkToParentRController(servicePSM, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the allModelsHaveRResourcePropertiesWithProperHibernateAnnotations constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_PSM__ALL_MODELS_HAVE_RRESOURCE_PROPERTIES_WITH_PROPER_HIBERNATE_ANNOTATIONS__EEXPRESSION = "\n" +
		"\t\tself.hasJavaRModel->forAll(JavaRModel | JavaRModel.hasRelatedJavaRMManager.hasRelatedJavaRModel->forAll(RelatedJavaRModel | \n" +
		"\t\t\tJavaRModel.JavaRModelHasProperty->one(name = 'SetOf' + RelatedJavaRModel.name)\n" +
		"\t\t\tand\n" +
		"\t\t\tJavaRModel.JavaRModelHasProperty->select(name = 'SetOf' + RelatedJavaRModel.name)->forAll(JRModelProperty | \n" +
		"\t\t\t\tJRModelProperty.PropertyHasHibernateAnnotation->one(HibernateAnnotationText = '@OneToMany(fetch = FetchType.EAGER, mappedBy=\"' + JavaRModel.parentName + '\",orphanRemoval=true)')\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\tJRModelProperty.PropertyHasHibernateAnnotation->one(HibernateAnnotationText = '@OnDelete(action=OnDeleteAction.CASCADE)')\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the allModelsHaveRResourcePropertiesWithProperHibernateAnnotations constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM_allModelsHaveRResourcePropertiesWithProperHibernateAnnotations(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.SERVICE_PSM,
				 servicePSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "allModelsHaveRResourcePropertiesWithProperHibernateAnnotations",
				 SERVICE_PSM__ALL_MODELS_HAVE_RRESOURCE_PROPERTIES_WITH_PROPER_HIBERNATE_ANNOTATIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the allModelsHavePResourcePropertiesWithProperHibernateAnnotations constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_PSM__ALL_MODELS_HAVE_PRESOURCE_PROPERTIES_WITH_PROPER_HIBERNATE_ANNOTATIONS__EEXPRESSION = "\n" +
		"\t\tself.hasJavaRModel->forAll(JavaRModel | \n" +
		"\t\t\tself.hasJavaRModel->select(ParentJRModel | ParentJRModel.hasRelatedJavaRMManager->exists(JRMManager | JRMManager.hasRelatedJavaRModel = JavaRModel))\n" +
		"\t\t\t->forAll(ParentJRModel | JavaRModel.JavaRModelHasProperty->one(name = ParentJRModel.parentName)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\tJavaRModel.JavaRModelHasProperty->forAll( Property |\n" +
		"\t\t\t\t\t\t(\n" +
		"\t\t\t\t\t\t\t(Property.name = ParentJRModel.parentName)\n" +
		"\t\t\t\t\t\t\timplies\n" +
		"\t\t\t\t\t\t\t(\n" +
		"\t\t\t\t\t\t\t\tProperty.PropertyHasHibernateAnnotation->one(HibernateAnnotationText = '@ManyToOne(fetch = FetchType.EAGER)')\n" +
		"\t\t\t\t\t\t\t\tand\n" +
		"\t\t\t\t\t\t\t\tProperty.PropertyHasHibernateAnnotation->one(HibernateAnnotationText = '@JoinColumn(name=\"' + if JavaRModel = ParentJRModel then 'sourse' else '' endif + ParentJRModel.JavaRModelHasProperty->select(bIsPrimaryIdentifier = true)->at(1).name + '\")')\n" +
		"\t\t\t\t\t\t\t\tand\n" +
		"\t\t\t\t\t\t\t\tProperty.PropertyHasHibernateAnnotation->one(HibernateAnnotationText = '@ForeignKey(name = \"fk_' + ParentJRModel.parentName + '_' + JavaRModel.parentName + '\")')\n" +
		"\t\t\t\t\t\t\t)\n" +
		"\t\t\t\t\t\t)\n" +
		"\t\t\t\t\t\tand\n" +
		"\t\t\t\t\t\t(\n" +
		"\t\t\t\t\t\t\t(\n" +
		"\t\t\t\t\t\t\t\tProperty.PropertyHasHibernateAnnotation->one(HibernateAnnotationText = '@ManyToOne(fetch = FetchType.EAGER)')\n" +
		"\t\t\t\t\t\t\t\tand\n" +
		"\t\t\t\t\t\t\t\tProperty.PropertyHasHibernateAnnotation->one(HibernateAnnotationText = '@JoinColumn(name=\"' + if JavaRModel = ParentJRModel then 'sourse' else '' endif + ParentJRModel.JavaRModelHasProperty->select(bIsPrimaryIdentifier = true)->at(1).name + '\")')\n" +
		"\t\t\t\t\t\t\t\tand\n" +
		"\t\t\t\t\t\t\t\tProperty.PropertyHasHibernateAnnotation->one(HibernateAnnotationText = '@ForeignKey(name = \"fk_' + ParentJRModel.parentName + '_' + JavaRModel.parentName + '\")')\n" +
		"\t\t\t\t\t\t\t)\n" +
		"\t\t\t\t\t\t\timplies\n" +
		"\t\t\t\t\t\t\t(Property.name = ParentJRModel.parentName)\n" +
		"\t\t\t\t\t\t)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t)";

	/**
	 * Validates the allModelsHavePResourcePropertiesWithProperHibernateAnnotations constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM_allModelsHavePResourcePropertiesWithProperHibernateAnnotations(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.SERVICE_PSM,
				 servicePSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "allModelsHavePResourcePropertiesWithProperHibernateAnnotations",
				 SERVICE_PSM__ALL_MODELS_HAVE_PRESOURCE_PROPERTIES_WITH_PROPER_HIBERNATE_ANNOTATIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rMPropertiesSettersHaveProperXMLTransientAnnotation constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_PSM__RM_PROPERTIES_SETTERS_HAVE_PROPER_XML_TRANSIENT_ANNOTATION__EEXPRESSION = "\n" +
		"\t\t\tlet AllResourceModels : Sequence(JavaResourceModel) = self.hasJavaRModel in\n" +
		"\t\t\tself.hasJavaRModel->forAll(JRModel | \n" +
		"\t\t\t\tJRModel.JavaRModelHasSetter->select(SetterFunction | \n" +
		"\t\t\t\t\t(\n" +
		"\t\t\t\t\t\tJRModel.hasRelatedJavaRMManager.hasRelatedJavaRModel->exists(JRRModel | SetterFunction.name = 'setSetOf' + JRRModel.name)\n" +
		"\t\t\t\t\t)\n" +
		"\t\t\t\t\tor\n" +
		"\t\t\t\t\t(\n" +
		"\t\t\t\t\t\tAllResourceModels->select(hasRelatedJavaRMManager->exists(hasRelatedJavaRModel = JRModel))\n" +
		"\t\t\t\t\t\t\t->exists(ParentJRModel | SetterFunction.name = 'set' + ParentJRModel.parentName)\n" +
		"\t\t\t\t\t)\t\n" +
		"\t\t\t\t)->forAll(SetterFunction | SetterFunction.SetterFunctionHasJAXBAnnotation->one('@XmlTransient'))\n" +
		"\t\t\t)";

	/**
	 * Validates the rMPropertiesSettersHaveProperXMLTransientAnnotation constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM_rMPropertiesSettersHaveProperXMLTransientAnnotation(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.SERVICE_PSM,
				 servicePSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rMPropertiesSettersHaveProperXMLTransientAnnotation",
				 SERVICE_PSM__RM_PROPERTIES_SETTERS_HAVE_PROPER_XML_TRANSIENT_ANNOTATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rMPropertiesHaveColumnAnnotation constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_PSM__RM_PROPERTIES_HAVE_COLUMN_ANNOTATION__EEXPRESSION = "\n" +
		"\t\t\tself.hasJavaRModel->forAll(JRModel |\n" +
		"\t\t\t\tJRModel.JavaRModelHasProperty->reject(Property |\n" +
		"\t\t\t\t\t(Property.name = 'linklist')\n" +
		"\t\t\t\t\tor\n" +
		"\t\t\t\t\t(JRModel.hasRelatedJavaRMManager->exists(JRRModel | Property.name = 'SetOf' + JRRModel.name))\n" +
		"\t\t\t\t\tor\n" +
		"\t\t\t\t\t(self.hasJavaRModel->select(JPRModel | JPRModel.hasRelatedJavaRMManager.hasRelatedJavaRModel->exists(JPRModel | JPRModel = JRModel))->exists(JPRModel | Property.name = JPRModel.parentName))\n" +
		"\t\t\t\t)->forAll(Property | Property.PropertyHasHibernateAnnotation->one(HibernateAnnotationText = '@Column(name = \"' + Property.name + '\")'))\n" +
		"\t\t\t)";

	/**
	 * Validates the rMPropertiesHaveColumnAnnotation constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM_rMPropertiesHaveColumnAnnotation(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.SERVICE_PSM,
				 servicePSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rMPropertiesHaveColumnAnnotation",
				 SERVICE_PSM__RM_PROPERTIES_HAVE_COLUMN_ANNOTATION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the RControllerUniqueHTTPVerbsPerParent constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_PSM__RCONTROLLER_UNIQUE_HTTP_VERBS_PER_PARENT__EEXPRESSION = "\n" +
		"\t\t\tlet AllResourceModels : Sequence(JavaResourceModel) = self.hasJavaRModel in\n" +
		"\t\t\tself.hasJavaRController->forAll(JRController | let numberOfParents : Integer = AllResourceModels->select(ParentRModel | \n" +
		"\t\t\t\tParentRModel.hasRelatedJavaRMManager->exists(JRMManager | JRController.hasAssociatedJavaRModel = JRMManager.hasRelatedJavaRModel))->size() in\n" +
		"\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(HTTPActivity | HTTPActivity.ActivityHTTPVerb = 1)->size() <= numberOfParents\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(HTTPActivity | HTTPActivity.ActivityHTTPVerb = 2)->size() <= numberOfParents\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(HTTPActivity | HTTPActivity.ActivityHTTPVerb = 3)->size() <= numberOfParents\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(HTTPActivity | HTTPActivity.ActivityHTTPVerb = 1)->isUnique(name)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(HTTPActivity | HTTPActivity.ActivityHTTPVerb = 1)->isUnique(name)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(HTTPActivity | HTTPActivity.ActivityHTTPVerb = 1)->isUnique(name)\n" +
		"\t\t\t\t)";

	/**
	 * Validates the RControllerUniqueHTTPVerbsPerParent constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM_RControllerUniqueHTTPVerbsPerParent(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.SERVICE_PSM,
				 servicePSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "RControllerUniqueHTTPVerbsPerParent",
				 SERVICE_PSM__RCONTROLLER_UNIQUE_HTTP_VERBS_PER_PARENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the RCManagerHasUniqueHTTPActivityVerbsPerParent constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_PSM__RC_MANAGER_HAS_UNIQUE_HTTP_ACTIVITY_VERBS_PER_PARENT__EEXPRESSION = "\n" +
		"\t\t\tlet AllResourceModels : Sequence(JavaResourceModel) = self.hasJavaRModel in\n" +
		"\t\t\tself.hasJavaRCManager->forAll(JRCManager | let numberOfParents : Integer = AllResourceModels->select(ParentRModel |\n" +
		"\t\t\t\tParentRModel->exists(hasRelatedJavaRMManager = JRCManager))->size() in\n" +
		"\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(HTTPActivity | HTTPActivity.ActivityHTTPVerb = 0)->size() = numberOfParents\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(HTTPActivity | HTTPActivity.ActivityHTTPVerb = 1)->size() = numberOfParents\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(HTTPActivity | HTTPActivity.ActivityHTTPVerb = 0)->isUnique(name)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(HTTPActivity | HTTPActivity.ActivityHTTPVerb = 1)->isUnique(name)\t\t\t\t\n" +
		"\t\t\t\t)";

	/**
	 * Validates the RCManagerHasUniqueHTTPActivityVerbsPerParent constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM_RCManagerHasUniqueHTTPActivityVerbsPerParent(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.SERVICE_PSM,
				 servicePSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "RCManagerHasUniqueHTTPActivityVerbsPerParent",
				 SERVICE_PSM__RC_MANAGER_HAS_UNIQUE_HTTP_ACTIVITY_VERBS_PER_PARENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rCManagerPostActivityAddsGetHypermediaLinkToRRController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_PSM__RC_MANAGER_POST_ACTIVITY_ADDS_GET_HYPERMEDIA_LINK_TO_RR_CONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasJavaRCManager->forAll(JRCManager | \n" +
		"\t\tself.hasJavaRController->forAll( JRController | \n" +
		"\t\t\t(\n" +
		"\t\t\t\t(JRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n" +
		"\t\t\t\timplies \n" +
		"\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Child' and  hasTargetJavaRController = JRController)\n" +
		"\t\t\t)\n" +
		"\t\t    and \n" +
		"\t\t\t(\n" +
		"\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Child' and  hasTargetJavaRController = JRController)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\t(JRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rCManagerPostActivityAddsGetHypermediaLinkToRRController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM_rCManagerPostActivityAddsGetHypermediaLinkToRRController(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.SERVICE_PSM,
				 servicePSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rCManagerPostActivityAddsGetHypermediaLinkToRRController",
				 SERVICE_PSM__RC_MANAGER_POST_ACTIVITY_ADDS_GET_HYPERMEDIA_LINK_TO_RR_CONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rCManagerPostActivityAddsPutHypermediaLinkToRRController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_PSM__RC_MANAGER_POST_ACTIVITY_ADDS_PUT_HYPERMEDIA_LINK_TO_RR_CONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasJavaRCManager->forAll(JRCManager | \n" +
		"\t\tself.hasJavaRController->forAll( JRController | \n" +
		"\t\t\t(\n" +
		"\t\t\t\t(JRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2)\n" +
		"\t\t\t\timplies \n" +
		"\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = 'Child' and  hasTargetJavaRController = JRController)\n" +
		"\t\t\t)\n" +
		"\t\t    and \n" +
		"\t\t\t(\n" +
		"\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = 'Child' and  hasTargetJavaRController = JRController)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\t(JRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rCManagerPostActivityAddsPutHypermediaLinkToRRController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM_rCManagerPostActivityAddsPutHypermediaLinkToRRController(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.SERVICE_PSM,
				 servicePSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rCManagerPostActivityAddsPutHypermediaLinkToRRController",
				 SERVICE_PSM__RC_MANAGER_POST_ACTIVITY_ADDS_PUT_HYPERMEDIA_LINK_TO_RR_CONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rCManagerPostActivityAddsDeleteHypermediaLinkToRRController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_PSM__RC_MANAGER_POST_ACTIVITY_ADDS_DELETE_HYPERMEDIA_LINK_TO_RR_CONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasJavaRCManager->forAll(JRCManager | \n" +
		"\t\tself.hasJavaRController->forAll( JRController | \n" +
		"\t\t\t(\n" +
		"\t\t\t\t(JRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 3)\n" +
		"\t\t\t\timplies \n" +
		"\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = 'Child' and  hasTargetJavaRController = JRController)\n" +
		"\t\t\t)\n" +
		"\t\t    and \n" +
		"\t\t\t(\n" +
		"\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = 'Child' and  hasTargetJavaRController = JRController)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\t(JRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 3)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rCManagerPostActivityAddsDeleteHypermediaLinkToRRController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM_rCManagerPostActivityAddsDeleteHypermediaLinkToRRController(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.SERVICE_PSM,
				 servicePSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rCManagerPostActivityAddsDeleteHypermediaLinkToRRController",
				 SERVICE_PSM__RC_MANAGER_POST_ACTIVITY_ADDS_DELETE_HYPERMEDIA_LINK_TO_RR_CONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rCManagerGetActivityAddsGetHypermediaLinkToRRController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_PSM__RC_MANAGER_GET_ACTIVITY_ADDS_GET_HYPERMEDIA_LINK_TO_RR_CONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasJavaRCManager->forAll(JRCManager | \n" +
		"\t\tself.hasJavaRController->forAll( JRController | \n" +
		"\t\t\t(\n" +
		"\t\t\t\t(JRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n" +
		"\t\t\t\timplies \n" +
		"\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Child' and  hasTargetJavaRController = JRController)\n" +
		"\t\t\t)\n" +
		"\t\t    and \n" +
		"\t\t\t(\n" +
		"\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Child' and  hasTargetJavaRController = JRController)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\t(JRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rCManagerGetActivityAddsGetHypermediaLinkToRRController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM_rCManagerGetActivityAddsGetHypermediaLinkToRRController(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.SERVICE_PSM,
				 servicePSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rCManagerGetActivityAddsGetHypermediaLinkToRRController",
				 SERVICE_PSM__RC_MANAGER_GET_ACTIVITY_ADDS_GET_HYPERMEDIA_LINK_TO_RR_CONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rCManagerGetActivityAddsPutHypermediaLinkToRRController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_PSM__RC_MANAGER_GET_ACTIVITY_ADDS_PUT_HYPERMEDIA_LINK_TO_RR_CONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasJavaRCManager->forAll(JRCManager | \n" +
		"\t\tself.hasJavaRController->forAll( JRController | \n" +
		"\t\t\t(\n" +
		"\t\t\t\t(JRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2)\n" +
		"\t\t\t\timplies \n" +
		"\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = 'Child' and  hasTargetJavaRController = JRController)\n" +
		"\t\t\t)\n" +
		"\t\t    and \n" +
		"\t\t\t(\n" +
		"\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = 'Child' and  hasTargetJavaRController = JRController)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\t(JRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rCManagerGetActivityAddsPutHypermediaLinkToRRController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM_rCManagerGetActivityAddsPutHypermediaLinkToRRController(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.SERVICE_PSM,
				 servicePSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rCManagerGetActivityAddsPutHypermediaLinkToRRController",
				 SERVICE_PSM__RC_MANAGER_GET_ACTIVITY_ADDS_PUT_HYPERMEDIA_LINK_TO_RR_CONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rCManagerGetActivityAddsDeleteHypermediaLinkToRRController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_PSM__RC_MANAGER_GET_ACTIVITY_ADDS_DELETE_HYPERMEDIA_LINK_TO_RR_CONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasJavaRCManager->forAll(JRCManager | \n" +
		"\t\tself.hasJavaRController->forAll( JRController | \n" +
		"\t\t\t(\n" +
		"\t\t\t\t(JRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 3)\n" +
		"\t\t\t\timplies \n" +
		"\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = 'Child' and  hasTargetJavaRController = JRController)\n" +
		"\t\t\t)\n" +
		"\t\t    and \n" +
		"\t\t\t(\n" +
		"\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = 'Child' and  hasTargetJavaRController = JRController)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\t(JRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 3)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rCManagerGetActivityAddsDeleteHypermediaLinkToRRController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM_rCManagerGetActivityAddsDeleteHypermediaLinkToRRController(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.SERVICE_PSM,
				 servicePSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rCManagerGetActivityAddsDeleteHypermediaLinkToRRController",
				 SERVICE_PSM__RC_MANAGER_GET_ACTIVITY_ADDS_DELETE_HYPERMEDIA_LINK_TO_RR_CONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rCManagerPostActivityAddsGetHypermediaLinkToParentRController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_PSM__RC_MANAGER_POST_ACTIVITY_ADDS_GET_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasJavaRCManager->forAll(JRCManager |\n" +
		"\t\tself.hasJavaRController->forAll(JRController |\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(JRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Parent' and hasTargetJavaRController = JRController)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Parent' and hasTargetJavaRController = JRController)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\t(JRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rCManagerPostActivityAddsGetHypermediaLinkToParentRController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM_rCManagerPostActivityAddsGetHypermediaLinkToParentRController(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.SERVICE_PSM,
				 servicePSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rCManagerPostActivityAddsGetHypermediaLinkToParentRController",
				 SERVICE_PSM__RC_MANAGER_POST_ACTIVITY_ADDS_GET_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rCManagerPostActivityAddsPutHypermediaLinkToParentRController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_PSM__RC_MANAGER_POST_ACTIVITY_ADDS_PUT_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasJavaRCManager->forAll(JRCManager |\n" +
		"\t\tself.hasJavaRController->forAll(JRController |\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(JRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = 'Parent' and hasTargetJavaRController = JRController)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = 'Parent' and hasTargetJavaRController = JRController)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\t(JRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rCManagerPostActivityAddsPutHypermediaLinkToParentRController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM_rCManagerPostActivityAddsPutHypermediaLinkToParentRController(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.SERVICE_PSM,
				 servicePSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rCManagerPostActivityAddsPutHypermediaLinkToParentRController",
				 SERVICE_PSM__RC_MANAGER_POST_ACTIVITY_ADDS_PUT_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rCManagerPostActivityAddsDeleteHypermediaLinkToParentRController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_PSM__RC_MANAGER_POST_ACTIVITY_ADDS_DELETE_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasJavaRCManager->forAll(JRCManager |\n" +
		"\t\tself.hasJavaRController->forAll(JRController |\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(JRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 3)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = 'Parent' and hasTargetJavaRController = JRController)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = 'Parent' and hasTargetJavaRController = JRController)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\t(JRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 3)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rCManagerPostActivityAddsDeleteHypermediaLinkToParentRController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM_rCManagerPostActivityAddsDeleteHypermediaLinkToParentRController(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.SERVICE_PSM,
				 servicePSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rCManagerPostActivityAddsDeleteHypermediaLinkToParentRController",
				 SERVICE_PSM__RC_MANAGER_POST_ACTIVITY_ADDS_DELETE_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rCManagerGetActivityAddsGetHypermediaLinkToParentRController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_PSM__RC_MANAGER_GET_ACTIVITY_ADDS_GET_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasJavaRCManager->forAll(JRCManager |\n" +
		"\t\tself.hasJavaRController->forAll(JRController |\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(JRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Parent' and hasTargetJavaRController = JRController)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Parent' and hasTargetJavaRController = JRController)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\t(JRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rCManagerGetActivityAddsGetHypermediaLinkToParentRController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM_rCManagerGetActivityAddsGetHypermediaLinkToParentRController(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.SERVICE_PSM,
				 servicePSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rCManagerGetActivityAddsGetHypermediaLinkToParentRController",
				 SERVICE_PSM__RC_MANAGER_GET_ACTIVITY_ADDS_GET_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rCManagerGetActivityAddsPutHypermediaLinkToParentRController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_PSM__RC_MANAGER_GET_ACTIVITY_ADDS_PUT_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasJavaRCManager->forAll(JRCManager |\n" +
		"\t\tself.hasJavaRController->forAll(JRController |\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(JRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = 'Parent' and hasTargetJavaRController = JRController)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = 'Parent' and hasTargetJavaRController = JRController)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\t(JRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rCManagerGetActivityAddsPutHypermediaLinkToParentRController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM_rCManagerGetActivityAddsPutHypermediaLinkToParentRController(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.SERVICE_PSM,
				 servicePSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rCManagerGetActivityAddsPutHypermediaLinkToParentRController",
				 SERVICE_PSM__RC_MANAGER_GET_ACTIVITY_ADDS_PUT_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rCManagerGetActivityAddsDeleteHypermediaLinkToParentRController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_PSM__RC_MANAGER_GET_ACTIVITY_ADDS_DELETE_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasJavaRCManager->forAll(JRCManager |\n" +
		"\t\tself.hasJavaRController->forAll(JRController |\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(JRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 3)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = 'Parent' and hasTargetJavaRController = JRController)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = 'Parent' and hasTargetJavaRController = JRController)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\t(JRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 3)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rCManagerGetActivityAddsDeleteHypermediaLinkToParentRController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM_rCManagerGetActivityAddsDeleteHypermediaLinkToParentRController(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.SERVICE_PSM,
				 servicePSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rCManagerGetActivityAddsDeleteHypermediaLinkToParentRController",
				 SERVICE_PSM__RC_MANAGER_GET_ACTIVITY_ADDS_DELETE_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerGetActivityAddsPostHypermediaLinkToRCManager constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_PSM__RCONTROLLER_GET_ACTIVITY_ADDS_POST_HYPERMEDIA_LINK_TO_RC_MANAGER__EEXPRESSION = "\n" +
		"\t\tself.hasJavaRController->forAll( JRController |\n" +
		"\t\tself.hasJavaRCManager->forAll( JRCManager |\n" +
		"\t\t\t(\n" +
		"\t\t\t\tJRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = 'Child' and hasTargetRCManager = JRCManager)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = 'Child' and hasTargetRCManager = JRCManager)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tJRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rControllerGetActivityAddsPostHypermediaLinkToRCManager constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM_rControllerGetActivityAddsPostHypermediaLinkToRCManager(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.SERVICE_PSM,
				 servicePSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerGetActivityAddsPostHypermediaLinkToRCManager",
				 SERVICE_PSM__RCONTROLLER_GET_ACTIVITY_ADDS_POST_HYPERMEDIA_LINK_TO_RC_MANAGER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerGetActivityAddsGetHypermediaLinkToRCManager constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_PSM__RCONTROLLER_GET_ACTIVITY_ADDS_GET_HYPERMEDIA_LINK_TO_RC_MANAGER__EEXPRESSION = "\n" +
		"\t\tself.hasJavaRController->forAll( JRController |\n" +
		"\t\tself.hasJavaRCManager->forAll( JRCManager |\n" +
		"\t\t\t(\n" +
		"\t\t\t\tJRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Child' and hasTargetRCManager = JRCManager)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Child' and hasTargetRCManager = JRCManager)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tJRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rControllerGetActivityAddsGetHypermediaLinkToRCManager constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM_rControllerGetActivityAddsGetHypermediaLinkToRCManager(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.SERVICE_PSM,
				 servicePSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerGetActivityAddsGetHypermediaLinkToRCManager",
				 SERVICE_PSM__RCONTROLLER_GET_ACTIVITY_ADDS_GET_HYPERMEDIA_LINK_TO_RC_MANAGER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerPutActivityAddsPostHypermediaLinkToRCManager constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_PSM__RCONTROLLER_PUT_ACTIVITY_ADDS_POST_HYPERMEDIA_LINK_TO_RC_MANAGER__EEXPRESSION = "\n" +
		"\t\tself.hasJavaRController->forAll( JRController |\n" +
		"\t\tself.hasJavaRCManager->forAll( JRCManager |\n" +
		"\t\t\t(\n" +
		"\t\t\t\tJRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = 'Child' and hasTargetRCManager = JRCManager)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = 'Child' and hasTargetRCManager = JRCManager)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tJRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rControllerPutActivityAddsPostHypermediaLinkToRCManager constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM_rControllerPutActivityAddsPostHypermediaLinkToRCManager(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.SERVICE_PSM,
				 servicePSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerPutActivityAddsPostHypermediaLinkToRCManager",
				 SERVICE_PSM__RCONTROLLER_PUT_ACTIVITY_ADDS_POST_HYPERMEDIA_LINK_TO_RC_MANAGER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerPutActivityAddsGetHypermediaLinkToRCManager constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_PSM__RCONTROLLER_PUT_ACTIVITY_ADDS_GET_HYPERMEDIA_LINK_TO_RC_MANAGER__EEXPRESSION = "\n" +
		"\t\tself.hasJavaRController->forAll( JRController |\n" +
		"\t\tself.hasJavaRCManager->forAll( JRCManager |\n" +
		"\t\t\t(\n" +
		"\t\t\t\tJRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Child' and hasTargetRCManager = JRCManager)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Child' and hasTargetRCManager = JRCManager)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tJRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rControllerPutActivityAddsGetHypermediaLinkToRCManager constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM_rControllerPutActivityAddsGetHypermediaLinkToRCManager(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.SERVICE_PSM,
				 servicePSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerPutActivityAddsGetHypermediaLinkToRCManager",
				 SERVICE_PSM__RCONTROLLER_PUT_ACTIVITY_ADDS_GET_HYPERMEDIA_LINK_TO_RC_MANAGER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerGetActivityAddsPostHypermediaLinkToParentRCManager constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_PSM__RCONTROLLER_GET_ACTIVITY_ADDS_POST_HYPERMEDIA_LINK_TO_PARENT_RC_MANAGER__EEXPRESSION = "\n" +
		"\t\tself.hasJavaRController->forAll( JRController |\n" +
		"\t\tself.hasJavaRCManager->forAll( JRCManager |\n" +
		"\t\t\t(\n" +
		"\t\t\t\tJRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = 'Parent' and hasTargetRCManager = JRCManager)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = 'Parent' and hasTargetRCManager = JRCManager)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tJRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\t\t\t\t\t\t\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rControllerGetActivityAddsPostHypermediaLinkToParentRCManager constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM_rControllerGetActivityAddsPostHypermediaLinkToParentRCManager(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.SERVICE_PSM,
				 servicePSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerGetActivityAddsPostHypermediaLinkToParentRCManager",
				 SERVICE_PSM__RCONTROLLER_GET_ACTIVITY_ADDS_POST_HYPERMEDIA_LINK_TO_PARENT_RC_MANAGER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerGetActivityAddsGetHypermediaLinkToParentRCManager constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_PSM__RCONTROLLER_GET_ACTIVITY_ADDS_GET_HYPERMEDIA_LINK_TO_PARENT_RC_MANAGER__EEXPRESSION = "\n" +
		"\t\tself.hasJavaRController->forAll( JRController |\n" +
		"\t\tself.hasJavaRCManager->forAll( JRCManager |\n" +
		"\t\t\t(\n" +
		"\t\t\t\tJRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Parent' and hasTargetRCManager = JRCManager)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Parent' and hasTargetRCManager = JRCManager)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tJRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\t\t\t\t\t\t\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rControllerGetActivityAddsGetHypermediaLinkToParentRCManager constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM_rControllerGetActivityAddsGetHypermediaLinkToParentRCManager(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.SERVICE_PSM,
				 servicePSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerGetActivityAddsGetHypermediaLinkToParentRCManager",
				 SERVICE_PSM__RCONTROLLER_GET_ACTIVITY_ADDS_GET_HYPERMEDIA_LINK_TO_PARENT_RC_MANAGER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerPutActivityAddsPostHypermediaLinkToParentRCManager constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_PSM__RCONTROLLER_PUT_ACTIVITY_ADDS_POST_HYPERMEDIA_LINK_TO_PARENT_RC_MANAGER__EEXPRESSION = "\n" +
		"\t\tself.hasJavaRController->forAll( JRController |\n" +
		"\t\tself.hasJavaRCManager->forAll( JRCManager |\n" +
		"\t\t\t(\n" +
		"\t\t\t\tJRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = 'Parent' and hasTargetRCManager = JRCManager)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = 'Parent' and hasTargetRCManager = JRCManager)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tJRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2)\t\t\t\t\t\t\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rControllerPutActivityAddsPostHypermediaLinkToParentRCManager constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM_rControllerPutActivityAddsPostHypermediaLinkToParentRCManager(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.SERVICE_PSM,
				 servicePSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerPutActivityAddsPostHypermediaLinkToParentRCManager",
				 SERVICE_PSM__RCONTROLLER_PUT_ACTIVITY_ADDS_POST_HYPERMEDIA_LINK_TO_PARENT_RC_MANAGER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerPutActivityAddsGetHypermediaLinkToParentRCManager constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_PSM__RCONTROLLER_PUT_ACTIVITY_ADDS_GET_HYPERMEDIA_LINK_TO_PARENT_RC_MANAGER__EEXPRESSION = "\n" +
		"\t\tself.hasJavaRController->forAll( JRController |\n" +
		"\t\tself.hasJavaRCManager->forAll( JRCManager |\n" +
		"\t\t\t(\n" +
		"\t\t\t\tJRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Parent' and hasTargetRCManager = JRCManager)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Parent' and hasTargetRCManager = JRCManager)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tJRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2)\t\t\t\t\t\t\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rControllerPutActivityAddsGetHypermediaLinkToParentRCManager constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM_rControllerPutActivityAddsGetHypermediaLinkToParentRCManager(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.SERVICE_PSM,
				 servicePSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerPutActivityAddsGetHypermediaLinkToParentRCManager",
				 SERVICE_PSM__RCONTROLLER_PUT_ACTIVITY_ADDS_GET_HYPERMEDIA_LINK_TO_PARENT_RC_MANAGER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerDeleteActivityAddsPostHypermediaLinkToParentRCManager constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_PSM__RCONTROLLER_DELETE_ACTIVITY_ADDS_POST_HYPERMEDIA_LINK_TO_PARENT_RC_MANAGER__EEXPRESSION = "\n" +
		"\t\tself.hasJavaRController->forAll( JRController |\n" +
		"\t\tself.hasJavaRCManager->forAll( JRCManager |\n" +
		"\t\t\t(\n" +
		"\t\t\t\tJRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 3)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 3).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = 'Parent' and hasTargetRCManager = JRCManager)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 3).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = 'Parent' and hasTargetRCManager = JRCManager)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tJRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 3)\t\t\t\t\t\t\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rControllerDeleteActivityAddsPostHypermediaLinkToParentRCManager constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM_rControllerDeleteActivityAddsPostHypermediaLinkToParentRCManager(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.SERVICE_PSM,
				 servicePSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerDeleteActivityAddsPostHypermediaLinkToParentRCManager",
				 SERVICE_PSM__RCONTROLLER_DELETE_ACTIVITY_ADDS_POST_HYPERMEDIA_LINK_TO_PARENT_RC_MANAGER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerDeleteActivityAddsGetHypermediaLinkToParentRCManager constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_PSM__RCONTROLLER_DELETE_ACTIVITY_ADDS_GET_HYPERMEDIA_LINK_TO_PARENT_RC_MANAGER__EEXPRESSION = "\n" +
		"\t\tself.hasJavaRController->forAll( JRController |\n" +
		"\t\tself.hasJavaRCManager->forAll( JRCManager |\n" +
		"\t\t\t(\n" +
		"\t\t\t\tJRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 3)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 3).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Parent' and hasTargetRCManager = JRCManager)\n" +
		"\t\t\t)\n" +
		"\t\t\tand\n" +
		"\t\t\t(\n" +
		"\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 3).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Parent' and hasTargetRCManager = JRCManager)\n" +
		"\t\t\t\timplies\n" +
		"\t\t\t\tJRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 3)\t\t\t\t\t\t\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rControllerDeleteActivityAddsGetHypermediaLinkToParentRCManager constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM_rControllerDeleteActivityAddsGetHypermediaLinkToParentRCManager(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.SERVICE_PSM,
				 servicePSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerDeleteActivityAddsGetHypermediaLinkToParentRCManager",
				 SERVICE_PSM__RCONTROLLER_DELETE_ACTIVITY_ADDS_GET_HYPERMEDIA_LINK_TO_PARENT_RC_MANAGER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the algoControllerActivityAddsHypermediaLinkToRAlgoController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_PSM__ALGO_CONTROLLER_ACTIVITY_ADDS_HYPERMEDIA_LINK_TO_RALGO_CONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasJavaAlgoController->forAll(algoControllerA, algoControllerB |\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.hasRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0) and algoControllerB.JavaAlgoRControllerHasHTTPActivity->exists( ActivityHTTPVerb = 0)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = 'Child' and hasTargetJavaAlgoController = algoControllerB)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = 'Child' and hasTargetJavaAlgoController = algoControllerB)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.hasRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0) and algoControllerB.JavaAlgoRControllerHasHTTPActivity->exists( ActivityHTTPVerb = 0)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t\tor\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.hasRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0) and algoControllerB.JavaAlgoRControllerHasHTTPActivity->exists( ActivityHTTPVerb = 1)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Child' and hasTargetJavaAlgoController = algoControllerB)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Child' and hasTargetJavaAlgoController = algoControllerB)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.hasRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0) and algoControllerB.JavaAlgoRControllerHasHTTPActivity->exists( ActivityHTTPVerb = 1)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t\tor\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.hasRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1) and algoControllerB.JavaAlgoRControllerHasHTTPActivity->exists( ActivityHTTPVerb = 0)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = 'Child' and hasTargetJavaAlgoController = algoControllerB)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = 'Child' and hasTargetJavaAlgoController = algoControllerB)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.hasRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1) and algoControllerB.JavaAlgoRControllerHasHTTPActivity->exists( ActivityHTTPVerb = 0)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t\tor\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.hasRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1) and algoControllerB.JavaAlgoRControllerHasHTTPActivity->exists( ActivityHTTPVerb = 1)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Child' and hasTargetJavaAlgoController = algoControllerB)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Child' and hasTargetJavaAlgoController = algoControllerB)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.hasRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1) and algoControllerB.JavaAlgoRControllerHasHTTPActivity->exists( ActivityHTTPVerb = 1)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t)";

	/**
	 * Validates the algoControllerActivityAddsHypermediaLinkToRAlgoController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM_algoControllerActivityAddsHypermediaLinkToRAlgoController(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.SERVICE_PSM,
				 servicePSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "algoControllerActivityAddsHypermediaLinkToRAlgoController",
				 SERVICE_PSM__ALGO_CONTROLLER_ACTIVITY_ADDS_HYPERMEDIA_LINK_TO_RALGO_CONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the algoControllerAddsHypermediaLinkToParentAlgoController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_PSM__ALGO_CONTROLLER_ADDS_HYPERMEDIA_LINK_TO_PARENT_ALGO_CONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasJavaAlgoController->forAll(algoControllerA, algoControllerB |\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.isRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0) and algoControllerB.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = 'Parent' and hasTargetJavaAlgoController = algoControllerB)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = 'Parent' and hasTargetJavaAlgoController = algoControllerB)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.isRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0) and algoControllerB.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t\tor\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.isRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0) and algoControllerB.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Parent' and hasTargetJavaAlgoController = algoControllerB)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Parent' and hasTargetJavaAlgoController = algoControllerB)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.isRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0) and algoControllerB.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t\tor\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.isRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1) and algoControllerB.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = 'Parent' and hasTargetJavaAlgoController = algoControllerB)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = 'Parent' and hasTargetJavaAlgoController = algoControllerB)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.isRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1) and algoControllerB.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t\tor\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.isRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1) and algoControllerB.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Parent' and hasTargetJavaAlgoController = algoControllerB)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Parent' and hasTargetJavaAlgoController = algoControllerB)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.isRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1) and algoControllerB.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t)";

	/**
	 * Validates the algoControllerAddsHypermediaLinkToParentAlgoController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM_algoControllerAddsHypermediaLinkToParentAlgoController(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.SERVICE_PSM,
				 servicePSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "algoControllerAddsHypermediaLinkToParentAlgoController",
				 SERVICE_PSM__ALGO_CONTROLLER_ADDS_HYPERMEDIA_LINK_TO_PARENT_ALGO_CONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerGetAddsHypermediaLinkToRAlgoController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_PSM__RCONTROLLER_GET_ADDS_HYPERMEDIA_LINK_TO_RALGO_CONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasJavaAlgoController->forAll(algoControllerA |\n" +
		"\t\tself.hasJavaRController->forAll(rControllerA |\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\trControllerA.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = 'Child' and hasTargetJavaAlgoController = algoControllerA)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\trControllerA.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = 'Child' and hasTargetJavaAlgoController = algoControllerA)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t\tor\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\trControllerA.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Child' and hasTargetJavaAlgoController = algoControllerA)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\trControllerA.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Child' and hasTargetJavaAlgoController = algoControllerA)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t\n" +
		"\t\t))";

	/**
	 * Validates the rControllerGetAddsHypermediaLinkToRAlgoController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM_rControllerGetAddsHypermediaLinkToRAlgoController(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.SERVICE_PSM,
				 servicePSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerGetAddsHypermediaLinkToRAlgoController",
				 SERVICE_PSM__RCONTROLLER_GET_ADDS_HYPERMEDIA_LINK_TO_RALGO_CONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the rControllerPutAddsHypermediaLinkToRAlgoController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_PSM__RCONTROLLER_PUT_ADDS_HYPERMEDIA_LINK_TO_RALGO_CONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasJavaAlgoController->forAll(algoControllerA |\n" +
		"\t\tself.hasJavaRController->forAll(rControllerA |\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\trControllerA.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = 'Child' and hasTargetJavaAlgoController = algoControllerA)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\trControllerA.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = 'Child' and hasTargetJavaAlgoController = algoControllerA)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t\tor\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\trControllerA.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Child' and hasTargetJavaAlgoController = algoControllerA)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\trControllerA.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Child' and hasTargetJavaAlgoController = algoControllerA)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the rControllerPutAddsHypermediaLinkToRAlgoController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM_rControllerPutAddsHypermediaLinkToRAlgoController(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.SERVICE_PSM,
				 servicePSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "rControllerPutAddsHypermediaLinkToRAlgoController",
				 SERVICE_PSM__RCONTROLLER_PUT_ADDS_HYPERMEDIA_LINK_TO_RALGO_CONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the algoControllerAddsGetHypermediaLinkToParentRController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_PSM__ALGO_CONTROLLER_ADDS_GET_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasJavaAlgoController->forAll(algoControllerA |\n" +
		"\t\tself.hasJavaRController->forAll(rControllerA |\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Parent' and hasTargetJavaRController = rControllerA)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Parent' and hasTargetJavaRController = rControllerA)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t\tor\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Parent' and hasTargetJavaRController = rControllerA)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = 'Parent' and hasTargetJavaRController = rControllerA)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the algoControllerAddsGetHypermediaLinkToParentRController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM_algoControllerAddsGetHypermediaLinkToParentRController(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.SERVICE_PSM,
				 servicePSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "algoControllerAddsGetHypermediaLinkToParentRController",
				 SERVICE_PSM__ALGO_CONTROLLER_ADDS_GET_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the algoControllerAddsPutHypermediaLinkToParentRController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_PSM__ALGO_CONTROLLER_ADDS_PUT_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasJavaAlgoController->forAll(algoControllerA |\n" +
		"\t\tself.hasJavaRController->forAll(rControllerA |\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = 'Parent' and hasTargetJavaRController = rControllerA)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = 'Parent' and hasTargetJavaRController = rControllerA)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t\tor\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = 'Parent' and hasTargetJavaRController = rControllerA)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = 'Parent' and hasTargetJavaRController = rControllerA)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the algoControllerAddsPutHypermediaLinkToParentRController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM_algoControllerAddsPutHypermediaLinkToParentRController(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.SERVICE_PSM,
				 servicePSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "algoControllerAddsPutHypermediaLinkToParentRController",
				 SERVICE_PSM__ALGO_CONTROLLER_ADDS_PUT_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the algoControllerAddsDeleteHypermediaLinkToParentRController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE_PSM__ALGO_CONTROLLER_ADDS_DELETE_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION = "\n" +
		"\t\tself.hasJavaAlgoController->forAll(algoControllerA |\n" +
		"\t\tself.hasJavaRController->forAll(rControllerA |\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 3) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = 'Parent' and hasTargetJavaRController = rControllerA)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = 'Parent' and hasTargetJavaRController = rControllerA)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 3) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t\tor\n" +
		"\t\t\t(\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 3) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = 'Parent' and hasTargetJavaRController = rControllerA)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t\tand\n" +
		"\t\t\t\t(\n" +
		"\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = 'Parent' and hasTargetJavaRController = rControllerA)\n" +
		"\t\t\t\t\timplies\n" +
		"\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 3) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n" +
		"\t\t\t\t)\n" +
		"\t\t\t)\n" +
		"\t\t))";

	/**
	 * Validates the algoControllerAddsDeleteHypermediaLinkToParentRController constraint of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicePSM_algoControllerAddsDeleteHypermediaLinkToParentRController(ServicePSM servicePSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(RESTfulServicePSMPackage.Literals.SERVICE_PSM,
				 servicePSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "algoControllerAddsDeleteHypermediaLinkToParentRController",
				 SERVICE_PSM__ALGO_CONTROLLER_ADDS_DELETE_HYPERMEDIA_LINK_TO_PARENT_RCONTROLLER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionParameter(FunctionParameter functionParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(functionParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHTTPVerb(HTTPVerb httpVerb, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMediaType(MediaType mediaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkType(LinkType linkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //RESTfulServicePSMValidator
