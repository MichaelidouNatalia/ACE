/**
 */
package ExternalServiceLayerPSM.impl;

import ExternalServiceLayerPSM.*;

import org.eclipse.emf.ecore.EClass;
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
public class ExternalServiceLayerPSMFactoryImpl extends EFactoryImpl implements ExternalServiceLayerPSMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExternalServiceLayerPSMFactory init() {
		try {
			ExternalServiceLayerPSMFactory theExternalServiceLayerPSMFactory = (ExternalServiceLayerPSMFactory)EPackage.Registry.INSTANCE.getEFactory(ExternalServiceLayerPSMPackage.eNS_URI);
			if (theExternalServiceLayerPSMFactory != null) {
				return theExternalServiceLayerPSMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExternalServiceLayerPSMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalServiceLayerPSMFactoryImpl() {
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
			case ExternalServiceLayerPSMPackage.ANNOTATION_MODEL: return createAnnotationModel();
			case ExternalServiceLayerPSMPackage.ANNOTATED_ELEMENT: return createAnnotatedElement();
			case ExternalServiceLayerPSMPackage.ANNOTATION: return createAnnotation();
			case ExternalServiceLayerPSMPackage.ANN_JAVA_ALGO_MODEL: return createAnnJavaAlgoModel();
			case ExternalServiceLayerPSMPackage.ANN_JAVA_ALGO_CONTROLLER: return createAnnJavaAlgoController();
			case ExternalServiceLayerPSMPackage.ANN_HTTP_ACTIVITY: return createAnnHTTPActivity();
			case ExternalServiceLayerPSMPackage.ANN_HTTP_ACTIVITY_HANDLER: return createAnnHTTPActivityHandler();
			case ExternalServiceLayerPSMPackage.ANN_JAVA_RESOURCE_MODEL: return createAnnJavaResourceModel();
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_CONTROLLER: return createJavaRESTClientController();
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY: return createJavaRESTClientHTTPActivity();
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER: return createJavaRESTClientHTTPActivityHandler();
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_MODEL: return createJavaRESTClientModel();
			case ExternalServiceLayerPSMPackage.QUERY_PARAM: return createQueryParam();
			case ExternalServiceLayerPSMPackage.JAVA_INPUT_DATA_MODEL: return createJavaInputDataModel();
			case ExternalServiceLayerPSMPackage.JAVA_OUTPUT_DATA_MODEL: return createJavaOutputDataModel();
			case ExternalServiceLayerPSMPackage.REPRESENTATION: return createRepresentation();
			case ExternalServiceLayerPSMPackage.PROPERTY: return createProperty();
			case ExternalServiceLayerPSMPackage.NON_PERSISTENT_OUTPUT: return createNonPersistentOutput();
			case ExternalServiceLayerPSMPackage.AUTO_PERSISTENT_OUTPUT: return createAutoPersistentOutput();
			case ExternalServiceLayerPSMPackage.EXISTENT_JAVA_MODEL_PERSISTENT_OUTPUT: return createExistentJavaModelPersistentOutput();
			case ExternalServiceLayerPSMPackage.COMPLEX_TYPE: return createComplexType();
			case ExternalServiceLayerPSMPackage.COMPLEX_TYPE_PROPERTY: return createComplexTypeProperty();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationModel createAnnotationModel() {
		AnnotationModelImpl annotationModel = new AnnotationModelImpl();
		return annotationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotatedElement createAnnotatedElement() {
		AnnotatedElementImpl annotatedElement = new AnnotatedElementImpl();
		return annotatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnJavaAlgoModel createAnnJavaAlgoModel() {
		AnnJavaAlgoModelImpl annJavaAlgoModel = new AnnJavaAlgoModelImpl();
		return annJavaAlgoModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnJavaAlgoController createAnnJavaAlgoController() {
		AnnJavaAlgoControllerImpl annJavaAlgoController = new AnnJavaAlgoControllerImpl();
		return annJavaAlgoController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnHTTPActivity createAnnHTTPActivity() {
		AnnHTTPActivityImpl annHTTPActivity = new AnnHTTPActivityImpl();
		return annHTTPActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnHTTPActivityHandler createAnnHTTPActivityHandler() {
		AnnHTTPActivityHandlerImpl annHTTPActivityHandler = new AnnHTTPActivityHandlerImpl();
		return annHTTPActivityHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnJavaResourceModel createAnnJavaResourceModel() {
		AnnJavaResourceModelImpl annJavaResourceModel = new AnnJavaResourceModelImpl();
		return annJavaResourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaRESTClientController createJavaRESTClientController() {
		JavaRESTClientControllerImpl javaRESTClientController = new JavaRESTClientControllerImpl();
		return javaRESTClientController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaRESTClientHTTPActivity createJavaRESTClientHTTPActivity() {
		JavaRESTClientHTTPActivityImpl javaRESTClientHTTPActivity = new JavaRESTClientHTTPActivityImpl();
		return javaRESTClientHTTPActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaRESTClientHTTPActivityHandler createJavaRESTClientHTTPActivityHandler() {
		JavaRESTClientHTTPActivityHandlerImpl javaRESTClientHTTPActivityHandler = new JavaRESTClientHTTPActivityHandlerImpl();
		return javaRESTClientHTTPActivityHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaRESTClientModel createJavaRESTClientModel() {
		JavaRESTClientModelImpl javaRESTClientModel = new JavaRESTClientModelImpl();
		return javaRESTClientModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryParam createQueryParam() {
		QueryParamImpl queryParam = new QueryParamImpl();
		return queryParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaInputDataModel createJavaInputDataModel() {
		JavaInputDataModelImpl javaInputDataModel = new JavaInputDataModelImpl();
		return javaInputDataModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaOutputDataModel createJavaOutputDataModel() {
		JavaOutputDataModelImpl javaOutputDataModel = new JavaOutputDataModelImpl();
		return javaOutputDataModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Representation createRepresentation() {
		RepresentationImpl representation = new RepresentationImpl();
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonPersistentOutput createNonPersistentOutput() {
		NonPersistentOutputImpl nonPersistentOutput = new NonPersistentOutputImpl();
		return nonPersistentOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoPersistentOutput createAutoPersistentOutput() {
		AutoPersistentOutputImpl autoPersistentOutput = new AutoPersistentOutputImpl();
		return autoPersistentOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistentJavaModelPersistentOutput createExistentJavaModelPersistentOutput() {
		ExistentJavaModelPersistentOutputImpl existentJavaModelPersistentOutput = new ExistentJavaModelPersistentOutputImpl();
		return existentJavaModelPersistentOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexType createComplexType() {
		ComplexTypeImpl complexType = new ComplexTypeImpl();
		return complexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexTypeProperty createComplexTypeProperty() {
		ComplexTypePropertyImpl complexTypeProperty = new ComplexTypePropertyImpl();
		return complexTypeProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalServiceLayerPSMPackage getExternalServiceLayerPSMPackage() {
		return (ExternalServiceLayerPSMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExternalServiceLayerPSMPackage getPackage() {
		return ExternalServiceLayerPSMPackage.eINSTANCE;
	}

} //ExternalServiceLayerPSMFactoryImpl
