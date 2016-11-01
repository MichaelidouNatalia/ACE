/**
 */
package RESTfulServicePSM.impl;

import RESTfulServicePSM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RESTfulServicePSMFactoryImpl extends EFactoryImpl implements RESTfulServicePSMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RESTfulServicePSMFactory init() {
		try {
			RESTfulServicePSMFactory theRESTfulServicePSMFactory = (RESTfulServicePSMFactory)EPackage.Registry.INSTANCE.getEFactory(RESTfulServicePSMPackage.eNS_URI);
			if (theRESTfulServicePSMFactory != null) {
				return theRESTfulServicePSMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RESTfulServicePSMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESTfulServicePSMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RESTfulServicePSMPackage.HIBERNATE_ACTIVITY: return createHibernateActivity();
			case RESTfulServicePSMPackage.HIBERNATE_ANNOTATION: return createHibernateAnnotation();
			case RESTfulServicePSMPackage.HIBERNATE_CONTROLLER: return createHibernateController();
			case RESTfulServicePSMPackage.HTTP_ACTIVITY: return createHTTPActivity();
			case RESTfulServicePSMPackage.HTTP_ACTIVITY_FUNCTION_PARAMETER: return createHTTPActivityFunctionParameter();
			case RESTfulServicePSMPackage.HTTP_ACTIVITY_HANDLER: return createHTTPActivityHandler();
			case RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER: return createJavaAlgoResourceController();
			case RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL: return createJavaAlgoResourceModel();
			case RESTfulServicePSMPackage.JAVA_FUNCTION: return createJavaFunction();
			case RESTfulServicePSMPackage.JAVA_GETTER_FUNCTION: return createJavaGetterFunction();
			case RESTfulServicePSMPackage.JAVA_HYPERMEDIA_FUNCTION: return createJavaHypermediaFunction();
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER: return createJavaResourceController();
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER: return createJavaResourceControllerManager();
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL: return createJavaResourceModel();
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER: return createJavaResourceModelManager();
			case RESTfulServicePSMPackage.PSM_COMPONENT_PROPERTY: return createPSMComponentProperty();
			case RESTfulServicePSMPackage.JAVA_SETTER_FUNCTION: return createJavaSetterFunction();
			case RESTfulServicePSMPackage.JAXB_ANNOTATION: return createJAXBAnnotation();
			case RESTfulServicePSMPackage.JAXRS_ANNOTATION: return createJAXRSAnnotation();
			case RESTfulServicePSMPackage.PSM_HYPERMEDIA_LINK: return createPSMHypermediaLink();
			case RESTfulServicePSMPackage.SERVICE_PSM: return createServicePSM();
			case RESTfulServicePSMPackage.FUNCTION_PARAMETER: return createFunctionParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RESTfulServicePSMPackage.HTTP_VERB:
				return createHTTPVerbFromString(eDataType, initialValue);
			case RESTfulServicePSMPackage.MEDIA_TYPE:
				return createMediaTypeFromString(eDataType, initialValue);
			case RESTfulServicePSMPackage.LINK_TYPE:
				return createLinkTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RESTfulServicePSMPackage.HTTP_VERB:
				return convertHTTPVerbToString(eDataType, instanceValue);
			case RESTfulServicePSMPackage.MEDIA_TYPE:
				return convertMediaTypeToString(eDataType, instanceValue);
			case RESTfulServicePSMPackage.LINK_TYPE:
				return convertLinkTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HibernateActivity createHibernateActivity() {
		HibernateActivityImpl hibernateActivity = new HibernateActivityImpl();
		return hibernateActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HibernateAnnotation createHibernateAnnotation() {
		HibernateAnnotationImpl hibernateAnnotation = new HibernateAnnotationImpl();
		return hibernateAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HibernateController createHibernateController() {
		HibernateControllerImpl hibernateController = new HibernateControllerImpl();
		return hibernateController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPActivity createHTTPActivity() {
		HTTPActivityImpl httpActivity = new HTTPActivityImpl();
		return httpActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPActivityFunctionParameter createHTTPActivityFunctionParameter() {
		HTTPActivityFunctionParameterImpl httpActivityFunctionParameter = new HTTPActivityFunctionParameterImpl();
		return httpActivityFunctionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPActivityHandler createHTTPActivityHandler() {
		HTTPActivityHandlerImpl httpActivityHandler = new HTTPActivityHandlerImpl();
		return httpActivityHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaAlgoResourceController createJavaAlgoResourceController() {
		JavaAlgoResourceControllerImpl javaAlgoResourceController = new JavaAlgoResourceControllerImpl();
		return javaAlgoResourceController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaAlgoResourceModel createJavaAlgoResourceModel() {
		JavaAlgoResourceModelImpl javaAlgoResourceModel = new JavaAlgoResourceModelImpl();
		return javaAlgoResourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaFunction createJavaFunction() {
		JavaFunctionImpl javaFunction = new JavaFunctionImpl();
		return javaFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaGetterFunction createJavaGetterFunction() {
		JavaGetterFunctionImpl javaGetterFunction = new JavaGetterFunctionImpl();
		return javaGetterFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaHypermediaFunction createJavaHypermediaFunction() {
		JavaHypermediaFunctionImpl javaHypermediaFunction = new JavaHypermediaFunctionImpl();
		return javaHypermediaFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaResourceController createJavaResourceController() {
		JavaResourceControllerImpl javaResourceController = new JavaResourceControllerImpl();
		return javaResourceController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaResourceControllerManager createJavaResourceControllerManager() {
		JavaResourceControllerManagerImpl javaResourceControllerManager = new JavaResourceControllerManagerImpl();
		return javaResourceControllerManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaResourceModel createJavaResourceModel() {
		JavaResourceModelImpl javaResourceModel = new JavaResourceModelImpl();
		return javaResourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaResourceModelManager createJavaResourceModelManager() {
		JavaResourceModelManagerImpl javaResourceModelManager = new JavaResourceModelManagerImpl();
		return javaResourceModelManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSMComponentProperty createPSMComponentProperty() {
		PSMComponentPropertyImpl psmComponentProperty = new PSMComponentPropertyImpl();
		return psmComponentProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaSetterFunction createJavaSetterFunction() {
		JavaSetterFunctionImpl javaSetterFunction = new JavaSetterFunctionImpl();
		return javaSetterFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JAXBAnnotation createJAXBAnnotation() {
		JAXBAnnotationImpl jaxbAnnotation = new JAXBAnnotationImpl();
		return jaxbAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JAXRSAnnotation createJAXRSAnnotation() {
		JAXRSAnnotationImpl jaxrsAnnotation = new JAXRSAnnotationImpl();
		return jaxrsAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSMHypermediaLink createPSMHypermediaLink() {
		PSMHypermediaLinkImpl psmHypermediaLink = new PSMHypermediaLinkImpl();
		return psmHypermediaLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicePSM createServicePSM() {
		ServicePSMImpl servicePSM = new ServicePSMImpl();
		return servicePSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionParameter createFunctionParameter() {
		FunctionParameterImpl functionParameter = new FunctionParameterImpl();
		return functionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPVerb createHTTPVerbFromString(EDataType eDataType, String initialValue) {
		HTTPVerb result = HTTPVerb.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHTTPVerbToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaType createMediaTypeFromString(EDataType eDataType, String initialValue) {
		MediaType result = MediaType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMediaTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkType createLinkTypeFromString(EDataType eDataType, String initialValue) {
		LinkType result = LinkType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESTfulServicePSMPackage getRESTfulServicePSMPackage() {
		return (RESTfulServicePSMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RESTfulServicePSMPackage getPackage() {
		return RESTfulServicePSMPackage.eINSTANCE;
	}

} //RESTfulServicePSMFactoryImpl
