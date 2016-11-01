/**
 */
package ExternalServiceLayerCIM.impl;

import ExternalServiceLayerCIM.*;

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
public class ExternalServiceLayerCIMFactoryImpl extends EFactoryImpl implements ExternalServiceLayerCIMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExternalServiceLayerCIMFactory init() {
		try {
			ExternalServiceLayerCIMFactory theExternalServiceLayerCIMFactory = (ExternalServiceLayerCIMFactory)EPackage.Registry.INSTANCE.getEFactory(ExternalServiceLayerCIMPackage.eNS_URI);
			if (theExternalServiceLayerCIMFactory != null) {
				return theExternalServiceLayerCIMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExternalServiceLayerCIMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalServiceLayerCIMFactoryImpl() {
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
			case ExternalServiceLayerCIMPackage.ANNOTATION_MODEL: return createAnnotationModel();
			case ExternalServiceLayerCIMPackage.ANNOTATED_ELEMENT: return createAnnotatedElement();
			case ExternalServiceLayerCIMPackage.ANNOTATION: return createAnnotation();
			case ExternalServiceLayerCIMPackage.ANN_ALGO_RESOURCE: return createAnnAlgoResource();
			case ExternalServiceLayerCIMPackage.ANN_CRUD_RESOURCE: return createAnnCRUDResource();
			case ExternalServiceLayerCIMPackage.REST_CLIENT_RESOURCE: return createRESTClientResource();
			case ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE: return createTargetRESTService();
			case ExternalServiceLayerCIMPackage.QUERY_PARAM: return createQueryParam();
			case ExternalServiceLayerCIMPackage.INPUT_DATA_MODEL: return createInputDataModel();
			case ExternalServiceLayerCIMPackage.OUTPUT_DATA_MODEL: return createOutputDataModel();
			case ExternalServiceLayerCIMPackage.REPRESENTATION: return createRepresentation();
			case ExternalServiceLayerCIMPackage.MODEL_PROPERTY: return createModelProperty();
			case ExternalServiceLayerCIMPackage.NON_PERSISTENT_OUTPUT: return createNonPersistentOutput();
			case ExternalServiceLayerCIMPackage.AUTO_PERSISTENT_OUTPUT: return createAutoPersistentOutput();
			case ExternalServiceLayerCIMPackage.EXISTENT_CRUD_PERSISTENT_OUTPUT: return createExistentCRUDPersistentOutput();
			case ExternalServiceLayerCIMPackage.COMPLEX_TYPE: return createComplexType();
			case ExternalServiceLayerCIMPackage.COMPLEX_TYPE_PROPERTY: return createComplexTypeProperty();
			case ExternalServiceLayerCIMPackage.PATH_PARAM: return createPathParam();
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
	public AnnAlgoResource createAnnAlgoResource() {
		AnnAlgoResourceImpl annAlgoResource = new AnnAlgoResourceImpl();
		return annAlgoResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnCRUDResource createAnnCRUDResource() {
		AnnCRUDResourceImpl annCRUDResource = new AnnCRUDResourceImpl();
		return annCRUDResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESTClientResource createRESTClientResource() {
		RESTClientResourceImpl restClientResource = new RESTClientResourceImpl();
		return restClientResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetRESTService createTargetRESTService() {
		TargetRESTServiceImpl targetRESTService = new TargetRESTServiceImpl();
		return targetRESTService;
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
	public InputDataModel createInputDataModel() {
		InputDataModelImpl inputDataModel = new InputDataModelImpl();
		return inputDataModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputDataModel createOutputDataModel() {
		OutputDataModelImpl outputDataModel = new OutputDataModelImpl();
		return outputDataModel;
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
	public ModelProperty createModelProperty() {
		ModelPropertyImpl modelProperty = new ModelPropertyImpl();
		return modelProperty;
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
	public ExistentCRUDPersistentOutput createExistentCRUDPersistentOutput() {
		ExistentCRUDPersistentOutputImpl existentCRUDPersistentOutput = new ExistentCRUDPersistentOutputImpl();
		return existentCRUDPersistentOutput;
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
	public PathParam createPathParam() {
		PathParamImpl pathParam = new PathParamImpl();
		return pathParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalServiceLayerCIMPackage getExternalServiceLayerCIMPackage() {
		return (ExternalServiceLayerCIMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExternalServiceLayerCIMPackage getPackage() {
		return ExternalServiceLayerCIMPackage.eINSTANCE;
	}

} //ExternalServiceLayerCIMFactoryImpl
