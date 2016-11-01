/**
 */
package ExternalServiceLayerPSM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import Eu.fp7.scase='PSMMetamodel.ecore#/'"
 * @generated
 */
public interface ExternalServiceLayerPSMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ExternalServiceLayerPSM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/eu.scasefp7.eclipse.mde.m2m/Metamodels/ExternalServiceLayerPSMMetamodel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Eu.fp7.scase";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExternalServiceLayerPSMPackage eINSTANCE = ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl.init();

	/**
	 * The meta object id for the '{@link ExternalServiceLayerPSM.impl.AnnotationModelImpl <em>Annotation Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerPSM.impl.AnnotationModelImpl
	 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getAnnotationModel()
	 * @generated
	 */
	int ANNOTATION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Has Annotated Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MODEL__HAS_ANNOTATED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Has Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MODEL__HAS_ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MODEL__NAME = 2;

	/**
	 * The number of structural features of the '<em>Annotation Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Annotation Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ExternalServiceLayerPSM.impl.AnnotatedElementImpl <em>Annotated Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerPSM.impl.AnnotatedElementImpl
	 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getAnnotatedElement()
	 * @generated
	 */
	int ANNOTATED_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Annotated Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Annotated Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ExternalServiceLayerPSM.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerPSM.impl.AnnotationImpl
	 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 2;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ExternalServiceLayerPSM.impl.AnnJavaAlgoModelImpl <em>Ann Java Algo Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerPSM.impl.AnnJavaAlgoModelImpl
	 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getAnnJavaAlgoModel()
	 * @generated
	 */
	int ANN_JAVA_ALGO_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Annotates Java Algo Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_JAVA_ALGO_MODEL__ANNOTATES_JAVA_ALGO_MODEL = ANNOTATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ann Java Algo Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_JAVA_ALGO_MODEL_FEATURE_COUNT = ANNOTATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ann Java Algo Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_JAVA_ALGO_MODEL_OPERATION_COUNT = ANNOTATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ExternalServiceLayerPSM.impl.AnnJavaAlgoControllerImpl <em>Ann Java Algo Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerPSM.impl.AnnJavaAlgoControllerImpl
	 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getAnnJavaAlgoController()
	 * @generated
	 */
	int ANN_JAVA_ALGO_CONTROLLER = 4;

	/**
	 * The feature id for the '<em><b>Annotates Java Algo Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_JAVA_ALGO_CONTROLLER__ANNOTATES_JAVA_ALGO_CONTROLLER = ANNOTATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ann Java Algo Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_JAVA_ALGO_CONTROLLER_FEATURE_COUNT = ANNOTATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ann Java Algo Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_JAVA_ALGO_CONTROLLER_OPERATION_COUNT = ANNOTATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ExternalServiceLayerPSM.impl.AnnHTTPActivityImpl <em>Ann HTTP Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerPSM.impl.AnnHTTPActivityImpl
	 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getAnnHTTPActivity()
	 * @generated
	 */
	int ANN_HTTP_ACTIVITY = 5;

	/**
	 * The feature id for the '<em><b>Annotates HTTP Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_HTTP_ACTIVITY__ANNOTATES_HTTP_ACTIVITY = ANNOTATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ann HTTP Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_HTTP_ACTIVITY_FEATURE_COUNT = ANNOTATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ann HTTP Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_HTTP_ACTIVITY_OPERATION_COUNT = ANNOTATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ExternalServiceLayerPSM.impl.AnnHTTPActivityHandlerImpl <em>Ann HTTP Activity Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerPSM.impl.AnnHTTPActivityHandlerImpl
	 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getAnnHTTPActivityHandler()
	 * @generated
	 */
	int ANN_HTTP_ACTIVITY_HANDLER = 6;

	/**
	 * The feature id for the '<em><b>Annotates HTTP Activity Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_HTTP_ACTIVITY_HANDLER__ANNOTATES_HTTP_ACTIVITY_HANDLER = ANNOTATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ann HTTP Activity Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_HTTP_ACTIVITY_HANDLER_FEATURE_COUNT = ANNOTATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ann HTTP Activity Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_HTTP_ACTIVITY_HANDLER_OPERATION_COUNT = ANNOTATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ExternalServiceLayerPSM.impl.AnnJavaResourceModelImpl <em>Ann Java Resource Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerPSM.impl.AnnJavaResourceModelImpl
	 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getAnnJavaResourceModel()
	 * @generated
	 */
	int ANN_JAVA_RESOURCE_MODEL = 7;

	/**
	 * The feature id for the '<em><b>Annotates Java Resource Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_JAVA_RESOURCE_MODEL__ANNOTATES_JAVA_RESOURCE_MODEL = ANNOTATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ann Java Resource Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_JAVA_RESOURCE_MODEL_FEATURE_COUNT = ANNOTATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ann Java Resource Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_JAVA_RESOURCE_MODEL_OPERATION_COUNT = ANNOTATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ExternalServiceLayerPSM.impl.JavaRESTClientControllerImpl <em>Java REST Client Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerPSM.impl.JavaRESTClientControllerImpl
	 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getJavaRESTClientController()
	 * @generated
	 */
	int JAVA_REST_CLIENT_CONTROLLER = 8;

	/**
	 * The feature id for the '<em><b>Has Java REST Client HTTP Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REST_CLIENT_CONTROLLER__HAS_JAVA_REST_CLIENT_HTTP_ACTIVITY = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Java REST Client Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REST_CLIENT_CONTROLLER__IS_JAVA_REST_CLIENT_CONTROLLER = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Associated Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REST_CLIENT_CONTROLLER__HAS_ASSOCIATED_MODEL = ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Complex Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REST_CLIENT_CONTROLLER__HAS_COMPLEX_TYPES = ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Java REST Client Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REST_CLIENT_CONTROLLER_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Java REST Client Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REST_CLIENT_CONTROLLER_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ExternalServiceLayerPSM.impl.JavaRESTClientHTTPActivityImpl <em>Java REST Client HTTP Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerPSM.impl.JavaRESTClientHTTPActivityImpl
	 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getJavaRESTClientHTTPActivity()
	 * @generated
	 */
	int JAVA_REST_CLIENT_HTTP_ACTIVITY = 9;

	/**
	 * The feature id for the '<em><b>Has Java REST Client HTTP Activity Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REST_CLIENT_HTTP_ACTIVITY__HAS_JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER = 0;

	/**
	 * The feature id for the '<em><b>Has Query Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REST_CLIENT_HTTP_ACTIVITY__HAS_QUERY_PARAM = 1;

	/**
	 * The feature id for the '<em><b>Is Java REST Client HTTP Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REST_CLIENT_HTTP_ACTIVITY__IS_JAVA_REST_CLIENT_HTTP_ACTIVITY = 2;

	/**
	 * The number of structural features of the '<em>Java REST Client HTTP Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REST_CLIENT_HTTP_ACTIVITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Java REST Client HTTP Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REST_CLIENT_HTTP_ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ExternalServiceLayerPSM.impl.JavaRESTClientHTTPActivityHandlerImpl <em>Java REST Client HTTP Activity Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerPSM.impl.JavaRESTClientHTTPActivityHandlerImpl
	 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getJavaRESTClientHTTPActivityHandler()
	 * @generated
	 */
	int JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER = 10;

	/**
	 * The feature id for the '<em><b>Is Java REST Client HTTP Activity Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER__IS_JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER = 0;

	/**
	 * The feature id for the '<em><b>Target Service URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER__TARGET_SERVICE_URL = 1;

	/**
	 * The feature id for the '<em><b>HTTP Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER__HTTP_VERB = 2;

	/**
	 * The number of structural features of the '<em>Java REST Client HTTP Activity Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Java REST Client HTTP Activity Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ExternalServiceLayerPSM.impl.JavaRESTClientModelImpl <em>Java REST Client Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerPSM.impl.JavaRESTClientModelImpl
	 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getJavaRESTClientModel()
	 * @generated
	 */
	int JAVA_REST_CLIENT_MODEL = 11;

	/**
	 * The feature id for the '<em><b>Has Java Input Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REST_CLIENT_MODEL__HAS_JAVA_INPUT_MODEL = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Java Output Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REST_CLIENT_MODEL__HAS_JAVA_OUTPUT_MODEL = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Java REST Client Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REST_CLIENT_MODEL__IS_JAVA_REST_CLIENT_MODEL = ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Java REST Client Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REST_CLIENT_MODEL_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Java REST Client Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_REST_CLIENT_MODEL_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ExternalServiceLayerPSM.impl.QueryParamImpl <em>Query Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerPSM.impl.QueryParamImpl
	 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getQueryParam()
	 * @generated
	 */
	int QUERY_PARAM = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAM__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Is Auth Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAM__IS_AUTH_TOKEN = 2;

	/**
	 * The feature id for the '<em><b>Auth Token To URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAM__AUTH_TOKEN_TO_URL = 3;

	/**
	 * The number of structural features of the '<em>Query Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Query Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_PARAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ExternalServiceLayerPSM.impl.JavaInputDataModelImpl <em>Java Input Data Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerPSM.impl.JavaInputDataModelImpl
	 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getJavaInputDataModel()
	 * @generated
	 */
	int JAVA_INPUT_DATA_MODEL = 13;

	/**
	 * The feature id for the '<em><b>Has Input Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_INPUT_DATA_MODEL__HAS_INPUT_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Has Input Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_INPUT_DATA_MODEL__HAS_INPUT_REPRESENTATION = 1;

	/**
	 * The number of structural features of the '<em>Java Input Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_INPUT_DATA_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Java Input Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_INPUT_DATA_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ExternalServiceLayerPSM.impl.JavaOutputDataModelImpl <em>Java Output Data Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerPSM.impl.JavaOutputDataModelImpl
	 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getJavaOutputDataModel()
	 * @generated
	 */
	int JAVA_OUTPUT_DATA_MODEL = 14;

	/**
	 * The feature id for the '<em><b>Has Output Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OUTPUT_DATA_MODEL__HAS_OUTPUT_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Has Output Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OUTPUT_DATA_MODEL__HAS_OUTPUT_REPRESENTATION = 1;

	/**
	 * The number of structural features of the '<em>Java Output Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OUTPUT_DATA_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Java Output Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_OUTPUT_DATA_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ExternalServiceLayerPSM.impl.RepresentationImpl <em>Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerPSM.impl.RepresentationImpl
	 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getRepresentation()
	 * @generated
	 */
	int REPRESENTATION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPRESENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ExternalServiceLayerPSM.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerPSM.impl.PropertyImpl
	 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_UNIQUE = 2;

	/**
	 * The feature id for the '<em><b>Has Primitive Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__HAS_PRIMITIVE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Has Complex Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__HAS_COMPLEX_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ExternalServiceLayerPSM.impl.NonPersistentOutputImpl <em>Non Persistent Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerPSM.impl.NonPersistentOutputImpl
	 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getNonPersistentOutput()
	 * @generated
	 */
	int NON_PERSISTENT_OUTPUT = 17;

	/**
	 * The feature id for the '<em><b>Has Output Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_PERSISTENT_OUTPUT__HAS_OUTPUT_PROPERTY = JAVA_OUTPUT_DATA_MODEL__HAS_OUTPUT_PROPERTY;

	/**
	 * The feature id for the '<em><b>Has Output Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_PERSISTENT_OUTPUT__HAS_OUTPUT_REPRESENTATION = JAVA_OUTPUT_DATA_MODEL__HAS_OUTPUT_REPRESENTATION;

	/**
	 * The number of structural features of the '<em>Non Persistent Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_PERSISTENT_OUTPUT_FEATURE_COUNT = JAVA_OUTPUT_DATA_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Non Persistent Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_PERSISTENT_OUTPUT_OPERATION_COUNT = JAVA_OUTPUT_DATA_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ExternalServiceLayerPSM.impl.AutoPersistentOutputImpl <em>Auto Persistent Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerPSM.impl.AutoPersistentOutputImpl
	 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getAutoPersistentOutput()
	 * @generated
	 */
	int AUTO_PERSISTENT_OUTPUT = 18;

	/**
	 * The feature id for the '<em><b>Has Output Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_PERSISTENT_OUTPUT__HAS_OUTPUT_PROPERTY = JAVA_OUTPUT_DATA_MODEL__HAS_OUTPUT_PROPERTY;

	/**
	 * The feature id for the '<em><b>Has Output Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_PERSISTENT_OUTPUT__HAS_OUTPUT_REPRESENTATION = JAVA_OUTPUT_DATA_MODEL__HAS_OUTPUT_REPRESENTATION;

	/**
	 * The number of structural features of the '<em>Auto Persistent Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_PERSISTENT_OUTPUT_FEATURE_COUNT = JAVA_OUTPUT_DATA_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Auto Persistent Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_PERSISTENT_OUTPUT_OPERATION_COUNT = JAVA_OUTPUT_DATA_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ExternalServiceLayerPSM.impl.ExistentJavaModelPersistentOutputImpl <em>Existent Java Model Persistent Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerPSM.impl.ExistentJavaModelPersistentOutputImpl
	 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getExistentJavaModelPersistentOutput()
	 * @generated
	 */
	int EXISTENT_JAVA_MODEL_PERSISTENT_OUTPUT = 19;

	/**
	 * The feature id for the '<em><b>Has Output Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENT_JAVA_MODEL_PERSISTENT_OUTPUT__HAS_OUTPUT_PROPERTY = JAVA_OUTPUT_DATA_MODEL__HAS_OUTPUT_PROPERTY;

	/**
	 * The feature id for the '<em><b>Has Output Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENT_JAVA_MODEL_PERSISTENT_OUTPUT__HAS_OUTPUT_REPRESENTATION = JAVA_OUTPUT_DATA_MODEL__HAS_OUTPUT_REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Is Existent Java Model Persistent Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENT_JAVA_MODEL_PERSISTENT_OUTPUT__IS_EXISTENT_JAVA_MODEL_PERSISTENT_OUTPUT = JAVA_OUTPUT_DATA_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Existent Java Model Persistent Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENT_JAVA_MODEL_PERSISTENT_OUTPUT_FEATURE_COUNT = JAVA_OUTPUT_DATA_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Existent Java Model Persistent Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENT_JAVA_MODEL_PERSISTENT_OUTPUT_OPERATION_COUNT = JAVA_OUTPUT_DATA_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ExternalServiceLayerPSM.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerPSM.impl.ComplexTypeImpl
	 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getComplexType()
	 * @generated
	 */
	int COMPLEX_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Complex Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__COMPLEX_TYPE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Complex Type Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__HAS_COMPLEX_TYPE_PROPERTIES = 1;

	/**
	 * The number of structural features of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ExternalServiceLayerPSM.impl.ComplexTypePropertyImpl <em>Complex Type Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerPSM.impl.ComplexTypePropertyImpl
	 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getComplexTypeProperty()
	 * @generated
	 */
	int COMPLEX_TYPE_PROPERTY = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_PROPERTY__IS_UNIQUE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_PROPERTY__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Has Primitive Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_PROPERTY__HAS_PRIMITIVE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Property Has Complex Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_PROPERTY__PROPERTY_HAS_COMPLEX_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Complex Type Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_PROPERTY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Complex Type Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_PROPERTY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerPSM.AnnotationModel <em>Annotation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Model</em>'.
	 * @see ExternalServiceLayerPSM.AnnotationModel
	 * @generated
	 */
	EClass getAnnotationModel();

	/**
	 * Returns the meta object for the containment reference list '{@link ExternalServiceLayerPSM.AnnotationModel#getHasAnnotatedElement <em>Has Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Annotated Element</em>'.
	 * @see ExternalServiceLayerPSM.AnnotationModel#getHasAnnotatedElement()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EReference getAnnotationModel_HasAnnotatedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link ExternalServiceLayerPSM.AnnotationModel#getHasAnnotation <em>Has Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Annotation</em>'.
	 * @see ExternalServiceLayerPSM.AnnotationModel#getHasAnnotation()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EReference getAnnotationModel_HasAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerPSM.AnnotationModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ExternalServiceLayerPSM.AnnotationModel#getName()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EAttribute getAnnotationModel_Name();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerPSM.AnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated Element</em>'.
	 * @see ExternalServiceLayerPSM.AnnotatedElement
	 * @generated
	 */
	EClass getAnnotatedElement();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerPSM.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see ExternalServiceLayerPSM.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerPSM.AnnJavaAlgoModel <em>Ann Java Algo Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ann Java Algo Model</em>'.
	 * @see ExternalServiceLayerPSM.AnnJavaAlgoModel
	 * @generated
	 */
	EClass getAnnJavaAlgoModel();

	/**
	 * Returns the meta object for the reference '{@link ExternalServiceLayerPSM.AnnJavaAlgoModel#getAnnotatesJavaAlgoModel <em>Annotates Java Algo Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotates Java Algo Model</em>'.
	 * @see ExternalServiceLayerPSM.AnnJavaAlgoModel#getAnnotatesJavaAlgoModel()
	 * @see #getAnnJavaAlgoModel()
	 * @generated
	 */
	EReference getAnnJavaAlgoModel_AnnotatesJavaAlgoModel();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerPSM.AnnJavaAlgoController <em>Ann Java Algo Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ann Java Algo Controller</em>'.
	 * @see ExternalServiceLayerPSM.AnnJavaAlgoController
	 * @generated
	 */
	EClass getAnnJavaAlgoController();

	/**
	 * Returns the meta object for the reference '{@link ExternalServiceLayerPSM.AnnJavaAlgoController#getAnnotatesJavaAlgoController <em>Annotates Java Algo Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotates Java Algo Controller</em>'.
	 * @see ExternalServiceLayerPSM.AnnJavaAlgoController#getAnnotatesJavaAlgoController()
	 * @see #getAnnJavaAlgoController()
	 * @generated
	 */
	EReference getAnnJavaAlgoController_AnnotatesJavaAlgoController();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerPSM.AnnHTTPActivity <em>Ann HTTP Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ann HTTP Activity</em>'.
	 * @see ExternalServiceLayerPSM.AnnHTTPActivity
	 * @generated
	 */
	EClass getAnnHTTPActivity();

	/**
	 * Returns the meta object for the reference '{@link ExternalServiceLayerPSM.AnnHTTPActivity#getAnnotatesHTTPActivity <em>Annotates HTTP Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotates HTTP Activity</em>'.
	 * @see ExternalServiceLayerPSM.AnnHTTPActivity#getAnnotatesHTTPActivity()
	 * @see #getAnnHTTPActivity()
	 * @generated
	 */
	EReference getAnnHTTPActivity_AnnotatesHTTPActivity();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerPSM.AnnHTTPActivityHandler <em>Ann HTTP Activity Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ann HTTP Activity Handler</em>'.
	 * @see ExternalServiceLayerPSM.AnnHTTPActivityHandler
	 * @generated
	 */
	EClass getAnnHTTPActivityHandler();

	/**
	 * Returns the meta object for the reference '{@link ExternalServiceLayerPSM.AnnHTTPActivityHandler#getAnnotatesHTTPActivityHandler <em>Annotates HTTP Activity Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotates HTTP Activity Handler</em>'.
	 * @see ExternalServiceLayerPSM.AnnHTTPActivityHandler#getAnnotatesHTTPActivityHandler()
	 * @see #getAnnHTTPActivityHandler()
	 * @generated
	 */
	EReference getAnnHTTPActivityHandler_AnnotatesHTTPActivityHandler();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerPSM.AnnJavaResourceModel <em>Ann Java Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ann Java Resource Model</em>'.
	 * @see ExternalServiceLayerPSM.AnnJavaResourceModel
	 * @generated
	 */
	EClass getAnnJavaResourceModel();

	/**
	 * Returns the meta object for the reference '{@link ExternalServiceLayerPSM.AnnJavaResourceModel#getAnnotatesJavaResourceModel <em>Annotates Java Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotates Java Resource Model</em>'.
	 * @see ExternalServiceLayerPSM.AnnJavaResourceModel#getAnnotatesJavaResourceModel()
	 * @see #getAnnJavaResourceModel()
	 * @generated
	 */
	EReference getAnnJavaResourceModel_AnnotatesJavaResourceModel();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerPSM.JavaRESTClientController <em>Java REST Client Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java REST Client Controller</em>'.
	 * @see ExternalServiceLayerPSM.JavaRESTClientController
	 * @generated
	 */
	EClass getJavaRESTClientController();

	/**
	 * Returns the meta object for the containment reference '{@link ExternalServiceLayerPSM.JavaRESTClientController#getHasJavaRESTClientHTTPActivity <em>Has Java REST Client HTTP Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Java REST Client HTTP Activity</em>'.
	 * @see ExternalServiceLayerPSM.JavaRESTClientController#getHasJavaRESTClientHTTPActivity()
	 * @see #getJavaRESTClientController()
	 * @generated
	 */
	EReference getJavaRESTClientController_HasJavaRESTClientHTTPActivity();

	/**
	 * Returns the meta object for the reference '{@link ExternalServiceLayerPSM.JavaRESTClientController#getIsJavaRESTClientController <em>Is Java REST Client Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Java REST Client Controller</em>'.
	 * @see ExternalServiceLayerPSM.JavaRESTClientController#getIsJavaRESTClientController()
	 * @see #getJavaRESTClientController()
	 * @generated
	 */
	EReference getJavaRESTClientController_IsJavaRESTClientController();

	/**
	 * Returns the meta object for the reference '{@link ExternalServiceLayerPSM.JavaRESTClientController#getHasAssociatedModel <em>Has Associated Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Associated Model</em>'.
	 * @see ExternalServiceLayerPSM.JavaRESTClientController#getHasAssociatedModel()
	 * @see #getJavaRESTClientController()
	 * @generated
	 */
	EReference getJavaRESTClientController_HasAssociatedModel();

	/**
	 * Returns the meta object for the containment reference list '{@link ExternalServiceLayerPSM.JavaRESTClientController#getHasComplexTypes <em>Has Complex Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Complex Types</em>'.
	 * @see ExternalServiceLayerPSM.JavaRESTClientController#getHasComplexTypes()
	 * @see #getJavaRESTClientController()
	 * @generated
	 */
	EReference getJavaRESTClientController_HasComplexTypes();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerPSM.JavaRESTClientHTTPActivity <em>Java REST Client HTTP Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java REST Client HTTP Activity</em>'.
	 * @see ExternalServiceLayerPSM.JavaRESTClientHTTPActivity
	 * @generated
	 */
	EClass getJavaRESTClientHTTPActivity();

	/**
	 * Returns the meta object for the containment reference '{@link ExternalServiceLayerPSM.JavaRESTClientHTTPActivity#getHasJavaRESTClientHTTPActivityHandler <em>Has Java REST Client HTTP Activity Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Java REST Client HTTP Activity Handler</em>'.
	 * @see ExternalServiceLayerPSM.JavaRESTClientHTTPActivity#getHasJavaRESTClientHTTPActivityHandler()
	 * @see #getJavaRESTClientHTTPActivity()
	 * @generated
	 */
	EReference getJavaRESTClientHTTPActivity_HasJavaRESTClientHTTPActivityHandler();

	/**
	 * Returns the meta object for the containment reference list '{@link ExternalServiceLayerPSM.JavaRESTClientHTTPActivity#getHasQueryParam <em>Has Query Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Query Param</em>'.
	 * @see ExternalServiceLayerPSM.JavaRESTClientHTTPActivity#getHasQueryParam()
	 * @see #getJavaRESTClientHTTPActivity()
	 * @generated
	 */
	EReference getJavaRESTClientHTTPActivity_HasQueryParam();

	/**
	 * Returns the meta object for the reference '{@link ExternalServiceLayerPSM.JavaRESTClientHTTPActivity#getIsJavaRESTClientHTTPActivity <em>Is Java REST Client HTTP Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Java REST Client HTTP Activity</em>'.
	 * @see ExternalServiceLayerPSM.JavaRESTClientHTTPActivity#getIsJavaRESTClientHTTPActivity()
	 * @see #getJavaRESTClientHTTPActivity()
	 * @generated
	 */
	EReference getJavaRESTClientHTTPActivity_IsJavaRESTClientHTTPActivity();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerPSM.JavaRESTClientHTTPActivityHandler <em>Java REST Client HTTP Activity Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java REST Client HTTP Activity Handler</em>'.
	 * @see ExternalServiceLayerPSM.JavaRESTClientHTTPActivityHandler
	 * @generated
	 */
	EClass getJavaRESTClientHTTPActivityHandler();

	/**
	 * Returns the meta object for the reference '{@link ExternalServiceLayerPSM.JavaRESTClientHTTPActivityHandler#getIsJavaRESTClientHTTPActivityHandler <em>Is Java REST Client HTTP Activity Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Java REST Client HTTP Activity Handler</em>'.
	 * @see ExternalServiceLayerPSM.JavaRESTClientHTTPActivityHandler#getIsJavaRESTClientHTTPActivityHandler()
	 * @see #getJavaRESTClientHTTPActivityHandler()
	 * @generated
	 */
	EReference getJavaRESTClientHTTPActivityHandler_IsJavaRESTClientHTTPActivityHandler();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerPSM.JavaRESTClientHTTPActivityHandler#getTargetServiceURL <em>Target Service URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Service URL</em>'.
	 * @see ExternalServiceLayerPSM.JavaRESTClientHTTPActivityHandler#getTargetServiceURL()
	 * @see #getJavaRESTClientHTTPActivityHandler()
	 * @generated
	 */
	EAttribute getJavaRESTClientHTTPActivityHandler_TargetServiceURL();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerPSM.JavaRESTClientHTTPActivityHandler#getHTTPVerb <em>HTTP Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>HTTP Verb</em>'.
	 * @see ExternalServiceLayerPSM.JavaRESTClientHTTPActivityHandler#getHTTPVerb()
	 * @see #getJavaRESTClientHTTPActivityHandler()
	 * @generated
	 */
	EAttribute getJavaRESTClientHTTPActivityHandler_HTTPVerb();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerPSM.JavaRESTClientModel <em>Java REST Client Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java REST Client Model</em>'.
	 * @see ExternalServiceLayerPSM.JavaRESTClientModel
	 * @generated
	 */
	EClass getJavaRESTClientModel();

	/**
	 * Returns the meta object for the containment reference '{@link ExternalServiceLayerPSM.JavaRESTClientModel#getHasJavaInputModel <em>Has Java Input Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Java Input Model</em>'.
	 * @see ExternalServiceLayerPSM.JavaRESTClientModel#getHasJavaInputModel()
	 * @see #getJavaRESTClientModel()
	 * @generated
	 */
	EReference getJavaRESTClientModel_HasJavaInputModel();

	/**
	 * Returns the meta object for the containment reference '{@link ExternalServiceLayerPSM.JavaRESTClientModel#getHasJavaOutputModel <em>Has Java Output Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Java Output Model</em>'.
	 * @see ExternalServiceLayerPSM.JavaRESTClientModel#getHasJavaOutputModel()
	 * @see #getJavaRESTClientModel()
	 * @generated
	 */
	EReference getJavaRESTClientModel_HasJavaOutputModel();

	/**
	 * Returns the meta object for the reference '{@link ExternalServiceLayerPSM.JavaRESTClientModel#getIsJavaRESTClientModel <em>Is Java REST Client Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Java REST Client Model</em>'.
	 * @see ExternalServiceLayerPSM.JavaRESTClientModel#getIsJavaRESTClientModel()
	 * @see #getJavaRESTClientModel()
	 * @generated
	 */
	EReference getJavaRESTClientModel_IsJavaRESTClientModel();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerPSM.QueryParam <em>Query Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Param</em>'.
	 * @see ExternalServiceLayerPSM.QueryParam
	 * @generated
	 */
	EClass getQueryParam();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerPSM.QueryParam#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ExternalServiceLayerPSM.QueryParam#getName()
	 * @see #getQueryParam()
	 * @generated
	 */
	EAttribute getQueryParam_Name();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerPSM.QueryParam#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ExternalServiceLayerPSM.QueryParam#getType()
	 * @see #getQueryParam()
	 * @generated
	 */
	EAttribute getQueryParam_Type();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerPSM.QueryParam#isIsAuthToken <em>Is Auth Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Auth Token</em>'.
	 * @see ExternalServiceLayerPSM.QueryParam#isIsAuthToken()
	 * @see #getQueryParam()
	 * @generated
	 */
	EAttribute getQueryParam_IsAuthToken();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerPSM.QueryParam#getAuthTokenToURL <em>Auth Token To URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auth Token To URL</em>'.
	 * @see ExternalServiceLayerPSM.QueryParam#getAuthTokenToURL()
	 * @see #getQueryParam()
	 * @generated
	 */
	EAttribute getQueryParam_AuthTokenToURL();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerPSM.JavaInputDataModel <em>Java Input Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Input Data Model</em>'.
	 * @see ExternalServiceLayerPSM.JavaInputDataModel
	 * @generated
	 */
	EClass getJavaInputDataModel();

	/**
	 * Returns the meta object for the containment reference list '{@link ExternalServiceLayerPSM.JavaInputDataModel#getHasInputProperty <em>Has Input Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Input Property</em>'.
	 * @see ExternalServiceLayerPSM.JavaInputDataModel#getHasInputProperty()
	 * @see #getJavaInputDataModel()
	 * @generated
	 */
	EReference getJavaInputDataModel_HasInputProperty();

	/**
	 * Returns the meta object for the containment reference '{@link ExternalServiceLayerPSM.JavaInputDataModel#getHasInputRepresentation <em>Has Input Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Input Representation</em>'.
	 * @see ExternalServiceLayerPSM.JavaInputDataModel#getHasInputRepresentation()
	 * @see #getJavaInputDataModel()
	 * @generated
	 */
	EReference getJavaInputDataModel_HasInputRepresentation();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerPSM.JavaOutputDataModel <em>Java Output Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Output Data Model</em>'.
	 * @see ExternalServiceLayerPSM.JavaOutputDataModel
	 * @generated
	 */
	EClass getJavaOutputDataModel();

	/**
	 * Returns the meta object for the containment reference list '{@link ExternalServiceLayerPSM.JavaOutputDataModel#getHasOutputProperty <em>Has Output Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Output Property</em>'.
	 * @see ExternalServiceLayerPSM.JavaOutputDataModel#getHasOutputProperty()
	 * @see #getJavaOutputDataModel()
	 * @generated
	 */
	EReference getJavaOutputDataModel_HasOutputProperty();

	/**
	 * Returns the meta object for the containment reference '{@link ExternalServiceLayerPSM.JavaOutputDataModel#getHasOutputRepresentation <em>Has Output Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Output Representation</em>'.
	 * @see ExternalServiceLayerPSM.JavaOutputDataModel#getHasOutputRepresentation()
	 * @see #getJavaOutputDataModel()
	 * @generated
	 */
	EReference getJavaOutputDataModel_HasOutputRepresentation();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerPSM.Representation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Representation</em>'.
	 * @see ExternalServiceLayerPSM.Representation
	 * @generated
	 */
	EClass getRepresentation();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerPSM.Representation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ExternalServiceLayerPSM.Representation#getName()
	 * @see #getRepresentation()
	 * @generated
	 */
	EAttribute getRepresentation_Name();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerPSM.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see ExternalServiceLayerPSM.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerPSM.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ExternalServiceLayerPSM.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerPSM.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ExternalServiceLayerPSM.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerPSM.Property#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see ExternalServiceLayerPSM.Property#isIsUnique()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsUnique();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerPSM.Property#isHasPrimitiveType <em>Has Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Primitive Type</em>'.
	 * @see ExternalServiceLayerPSM.Property#isHasPrimitiveType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_HasPrimitiveType();

	/**
	 * Returns the meta object for the reference '{@link ExternalServiceLayerPSM.Property#getHasComplexType <em>Has Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Complex Type</em>'.
	 * @see ExternalServiceLayerPSM.Property#getHasComplexType()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_HasComplexType();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerPSM.NonPersistentOutput <em>Non Persistent Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Persistent Output</em>'.
	 * @see ExternalServiceLayerPSM.NonPersistentOutput
	 * @generated
	 */
	EClass getNonPersistentOutput();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerPSM.AutoPersistentOutput <em>Auto Persistent Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auto Persistent Output</em>'.
	 * @see ExternalServiceLayerPSM.AutoPersistentOutput
	 * @generated
	 */
	EClass getAutoPersistentOutput();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerPSM.ExistentJavaModelPersistentOutput <em>Existent Java Model Persistent Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Existent Java Model Persistent Output</em>'.
	 * @see ExternalServiceLayerPSM.ExistentJavaModelPersistentOutput
	 * @generated
	 */
	EClass getExistentJavaModelPersistentOutput();

	/**
	 * Returns the meta object for the reference '{@link ExternalServiceLayerPSM.ExistentJavaModelPersistentOutput#getIsExistentJavaModelPersistentOutput <em>Is Existent Java Model Persistent Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Existent Java Model Persistent Output</em>'.
	 * @see ExternalServiceLayerPSM.ExistentJavaModelPersistentOutput#getIsExistentJavaModelPersistentOutput()
	 * @see #getExistentJavaModelPersistentOutput()
	 * @generated
	 */
	EReference getExistentJavaModelPersistentOutput_IsExistentJavaModelPersistentOutput();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerPSM.ComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Type</em>'.
	 * @see ExternalServiceLayerPSM.ComplexType
	 * @generated
	 */
	EClass getComplexType();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerPSM.ComplexType#getComplexTypeName <em>Complex Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complex Type Name</em>'.
	 * @see ExternalServiceLayerPSM.ComplexType#getComplexTypeName()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_ComplexTypeName();

	/**
	 * Returns the meta object for the containment reference list '{@link ExternalServiceLayerPSM.ComplexType#getHasComplexTypeProperties <em>Has Complex Type Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Complex Type Properties</em>'.
	 * @see ExternalServiceLayerPSM.ComplexType#getHasComplexTypeProperties()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_HasComplexTypeProperties();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerPSM.ComplexTypeProperty <em>Complex Type Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Type Property</em>'.
	 * @see ExternalServiceLayerPSM.ComplexTypeProperty
	 * @generated
	 */
	EClass getComplexTypeProperty();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerPSM.ComplexTypeProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ExternalServiceLayerPSM.ComplexTypeProperty#getName()
	 * @see #getComplexTypeProperty()
	 * @generated
	 */
	EAttribute getComplexTypeProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerPSM.ComplexTypeProperty#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see ExternalServiceLayerPSM.ComplexTypeProperty#isIsUnique()
	 * @see #getComplexTypeProperty()
	 * @generated
	 */
	EAttribute getComplexTypeProperty_IsUnique();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerPSM.ComplexTypeProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ExternalServiceLayerPSM.ComplexTypeProperty#getType()
	 * @see #getComplexTypeProperty()
	 * @generated
	 */
	EAttribute getComplexTypeProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerPSM.ComplexTypeProperty#isHasPrimitiveType <em>Has Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Primitive Type</em>'.
	 * @see ExternalServiceLayerPSM.ComplexTypeProperty#isHasPrimitiveType()
	 * @see #getComplexTypeProperty()
	 * @generated
	 */
	EAttribute getComplexTypeProperty_HasPrimitiveType();

	/**
	 * Returns the meta object for the reference '{@link ExternalServiceLayerPSM.ComplexTypeProperty#getPropertyHasComplexType <em>Property Has Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property Has Complex Type</em>'.
	 * @see ExternalServiceLayerPSM.ComplexTypeProperty#getPropertyHasComplexType()
	 * @see #getComplexTypeProperty()
	 * @generated
	 */
	EReference getComplexTypeProperty_PropertyHasComplexType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExternalServiceLayerPSMFactory getExternalServiceLayerPSMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ExternalServiceLayerPSM.impl.AnnotationModelImpl <em>Annotation Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerPSM.impl.AnnotationModelImpl
		 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getAnnotationModel()
		 * @generated
		 */
		EClass ANNOTATION_MODEL = eINSTANCE.getAnnotationModel();

		/**
		 * The meta object literal for the '<em><b>Has Annotated Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_MODEL__HAS_ANNOTATED_ELEMENT = eINSTANCE.getAnnotationModel_HasAnnotatedElement();

		/**
		 * The meta object literal for the '<em><b>Has Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_MODEL__HAS_ANNOTATION = eINSTANCE.getAnnotationModel_HasAnnotation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_MODEL__NAME = eINSTANCE.getAnnotationModel_Name();

		/**
		 * The meta object literal for the '{@link ExternalServiceLayerPSM.impl.AnnotatedElementImpl <em>Annotated Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerPSM.impl.AnnotatedElementImpl
		 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getAnnotatedElement()
		 * @generated
		 */
		EClass ANNOTATED_ELEMENT = eINSTANCE.getAnnotatedElement();

		/**
		 * The meta object literal for the '{@link ExternalServiceLayerPSM.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerPSM.impl.AnnotationImpl
		 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '{@link ExternalServiceLayerPSM.impl.AnnJavaAlgoModelImpl <em>Ann Java Algo Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerPSM.impl.AnnJavaAlgoModelImpl
		 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getAnnJavaAlgoModel()
		 * @generated
		 */
		EClass ANN_JAVA_ALGO_MODEL = eINSTANCE.getAnnJavaAlgoModel();

		/**
		 * The meta object literal for the '<em><b>Annotates Java Algo Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANN_JAVA_ALGO_MODEL__ANNOTATES_JAVA_ALGO_MODEL = eINSTANCE.getAnnJavaAlgoModel_AnnotatesJavaAlgoModel();

		/**
		 * The meta object literal for the '{@link ExternalServiceLayerPSM.impl.AnnJavaAlgoControllerImpl <em>Ann Java Algo Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerPSM.impl.AnnJavaAlgoControllerImpl
		 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getAnnJavaAlgoController()
		 * @generated
		 */
		EClass ANN_JAVA_ALGO_CONTROLLER = eINSTANCE.getAnnJavaAlgoController();

		/**
		 * The meta object literal for the '<em><b>Annotates Java Algo Controller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANN_JAVA_ALGO_CONTROLLER__ANNOTATES_JAVA_ALGO_CONTROLLER = eINSTANCE.getAnnJavaAlgoController_AnnotatesJavaAlgoController();

		/**
		 * The meta object literal for the '{@link ExternalServiceLayerPSM.impl.AnnHTTPActivityImpl <em>Ann HTTP Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerPSM.impl.AnnHTTPActivityImpl
		 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getAnnHTTPActivity()
		 * @generated
		 */
		EClass ANN_HTTP_ACTIVITY = eINSTANCE.getAnnHTTPActivity();

		/**
		 * The meta object literal for the '<em><b>Annotates HTTP Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANN_HTTP_ACTIVITY__ANNOTATES_HTTP_ACTIVITY = eINSTANCE.getAnnHTTPActivity_AnnotatesHTTPActivity();

		/**
		 * The meta object literal for the '{@link ExternalServiceLayerPSM.impl.AnnHTTPActivityHandlerImpl <em>Ann HTTP Activity Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerPSM.impl.AnnHTTPActivityHandlerImpl
		 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getAnnHTTPActivityHandler()
		 * @generated
		 */
		EClass ANN_HTTP_ACTIVITY_HANDLER = eINSTANCE.getAnnHTTPActivityHandler();

		/**
		 * The meta object literal for the '<em><b>Annotates HTTP Activity Handler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANN_HTTP_ACTIVITY_HANDLER__ANNOTATES_HTTP_ACTIVITY_HANDLER = eINSTANCE.getAnnHTTPActivityHandler_AnnotatesHTTPActivityHandler();

		/**
		 * The meta object literal for the '{@link ExternalServiceLayerPSM.impl.AnnJavaResourceModelImpl <em>Ann Java Resource Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerPSM.impl.AnnJavaResourceModelImpl
		 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getAnnJavaResourceModel()
		 * @generated
		 */
		EClass ANN_JAVA_RESOURCE_MODEL = eINSTANCE.getAnnJavaResourceModel();

		/**
		 * The meta object literal for the '<em><b>Annotates Java Resource Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANN_JAVA_RESOURCE_MODEL__ANNOTATES_JAVA_RESOURCE_MODEL = eINSTANCE.getAnnJavaResourceModel_AnnotatesJavaResourceModel();

		/**
		 * The meta object literal for the '{@link ExternalServiceLayerPSM.impl.JavaRESTClientControllerImpl <em>Java REST Client Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerPSM.impl.JavaRESTClientControllerImpl
		 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getJavaRESTClientController()
		 * @generated
		 */
		EClass JAVA_REST_CLIENT_CONTROLLER = eINSTANCE.getJavaRESTClientController();

		/**
		 * The meta object literal for the '<em><b>Has Java REST Client HTTP Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_REST_CLIENT_CONTROLLER__HAS_JAVA_REST_CLIENT_HTTP_ACTIVITY = eINSTANCE.getJavaRESTClientController_HasJavaRESTClientHTTPActivity();

		/**
		 * The meta object literal for the '<em><b>Is Java REST Client Controller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_REST_CLIENT_CONTROLLER__IS_JAVA_REST_CLIENT_CONTROLLER = eINSTANCE.getJavaRESTClientController_IsJavaRESTClientController();

		/**
		 * The meta object literal for the '<em><b>Has Associated Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_REST_CLIENT_CONTROLLER__HAS_ASSOCIATED_MODEL = eINSTANCE.getJavaRESTClientController_HasAssociatedModel();

		/**
		 * The meta object literal for the '<em><b>Has Complex Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_REST_CLIENT_CONTROLLER__HAS_COMPLEX_TYPES = eINSTANCE.getJavaRESTClientController_HasComplexTypes();

		/**
		 * The meta object literal for the '{@link ExternalServiceLayerPSM.impl.JavaRESTClientHTTPActivityImpl <em>Java REST Client HTTP Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerPSM.impl.JavaRESTClientHTTPActivityImpl
		 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getJavaRESTClientHTTPActivity()
		 * @generated
		 */
		EClass JAVA_REST_CLIENT_HTTP_ACTIVITY = eINSTANCE.getJavaRESTClientHTTPActivity();

		/**
		 * The meta object literal for the '<em><b>Has Java REST Client HTTP Activity Handler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_REST_CLIENT_HTTP_ACTIVITY__HAS_JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER = eINSTANCE.getJavaRESTClientHTTPActivity_HasJavaRESTClientHTTPActivityHandler();

		/**
		 * The meta object literal for the '<em><b>Has Query Param</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_REST_CLIENT_HTTP_ACTIVITY__HAS_QUERY_PARAM = eINSTANCE.getJavaRESTClientHTTPActivity_HasQueryParam();

		/**
		 * The meta object literal for the '<em><b>Is Java REST Client HTTP Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_REST_CLIENT_HTTP_ACTIVITY__IS_JAVA_REST_CLIENT_HTTP_ACTIVITY = eINSTANCE.getJavaRESTClientHTTPActivity_IsJavaRESTClientHTTPActivity();

		/**
		 * The meta object literal for the '{@link ExternalServiceLayerPSM.impl.JavaRESTClientHTTPActivityHandlerImpl <em>Java REST Client HTTP Activity Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerPSM.impl.JavaRESTClientHTTPActivityHandlerImpl
		 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getJavaRESTClientHTTPActivityHandler()
		 * @generated
		 */
		EClass JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER = eINSTANCE.getJavaRESTClientHTTPActivityHandler();

		/**
		 * The meta object literal for the '<em><b>Is Java REST Client HTTP Activity Handler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER__IS_JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER = eINSTANCE.getJavaRESTClientHTTPActivityHandler_IsJavaRESTClientHTTPActivityHandler();

		/**
		 * The meta object literal for the '<em><b>Target Service URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER__TARGET_SERVICE_URL = eINSTANCE.getJavaRESTClientHTTPActivityHandler_TargetServiceURL();

		/**
		 * The meta object literal for the '<em><b>HTTP Verb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER__HTTP_VERB = eINSTANCE.getJavaRESTClientHTTPActivityHandler_HTTPVerb();

		/**
		 * The meta object literal for the '{@link ExternalServiceLayerPSM.impl.JavaRESTClientModelImpl <em>Java REST Client Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerPSM.impl.JavaRESTClientModelImpl
		 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getJavaRESTClientModel()
		 * @generated
		 */
		EClass JAVA_REST_CLIENT_MODEL = eINSTANCE.getJavaRESTClientModel();

		/**
		 * The meta object literal for the '<em><b>Has Java Input Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_REST_CLIENT_MODEL__HAS_JAVA_INPUT_MODEL = eINSTANCE.getJavaRESTClientModel_HasJavaInputModel();

		/**
		 * The meta object literal for the '<em><b>Has Java Output Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_REST_CLIENT_MODEL__HAS_JAVA_OUTPUT_MODEL = eINSTANCE.getJavaRESTClientModel_HasJavaOutputModel();

		/**
		 * The meta object literal for the '<em><b>Is Java REST Client Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_REST_CLIENT_MODEL__IS_JAVA_REST_CLIENT_MODEL = eINSTANCE.getJavaRESTClientModel_IsJavaRESTClientModel();

		/**
		 * The meta object literal for the '{@link ExternalServiceLayerPSM.impl.QueryParamImpl <em>Query Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerPSM.impl.QueryParamImpl
		 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getQueryParam()
		 * @generated
		 */
		EClass QUERY_PARAM = eINSTANCE.getQueryParam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_PARAM__NAME = eINSTANCE.getQueryParam_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_PARAM__TYPE = eINSTANCE.getQueryParam_Type();

		/**
		 * The meta object literal for the '<em><b>Is Auth Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_PARAM__IS_AUTH_TOKEN = eINSTANCE.getQueryParam_IsAuthToken();

		/**
		 * The meta object literal for the '<em><b>Auth Token To URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_PARAM__AUTH_TOKEN_TO_URL = eINSTANCE.getQueryParam_AuthTokenToURL();

		/**
		 * The meta object literal for the '{@link ExternalServiceLayerPSM.impl.JavaInputDataModelImpl <em>Java Input Data Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerPSM.impl.JavaInputDataModelImpl
		 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getJavaInputDataModel()
		 * @generated
		 */
		EClass JAVA_INPUT_DATA_MODEL = eINSTANCE.getJavaInputDataModel();

		/**
		 * The meta object literal for the '<em><b>Has Input Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_INPUT_DATA_MODEL__HAS_INPUT_PROPERTY = eINSTANCE.getJavaInputDataModel_HasInputProperty();

		/**
		 * The meta object literal for the '<em><b>Has Input Representation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_INPUT_DATA_MODEL__HAS_INPUT_REPRESENTATION = eINSTANCE.getJavaInputDataModel_HasInputRepresentation();

		/**
		 * The meta object literal for the '{@link ExternalServiceLayerPSM.impl.JavaOutputDataModelImpl <em>Java Output Data Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerPSM.impl.JavaOutputDataModelImpl
		 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getJavaOutputDataModel()
		 * @generated
		 */
		EClass JAVA_OUTPUT_DATA_MODEL = eINSTANCE.getJavaOutputDataModel();

		/**
		 * The meta object literal for the '<em><b>Has Output Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_OUTPUT_DATA_MODEL__HAS_OUTPUT_PROPERTY = eINSTANCE.getJavaOutputDataModel_HasOutputProperty();

		/**
		 * The meta object literal for the '<em><b>Has Output Representation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_OUTPUT_DATA_MODEL__HAS_OUTPUT_REPRESENTATION = eINSTANCE.getJavaOutputDataModel_HasOutputRepresentation();

		/**
		 * The meta object literal for the '{@link ExternalServiceLayerPSM.impl.RepresentationImpl <em>Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerPSM.impl.RepresentationImpl
		 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getRepresentation()
		 * @generated
		 */
		EClass REPRESENTATION = eINSTANCE.getRepresentation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPRESENTATION__NAME = eINSTANCE.getRepresentation_Name();

		/**
		 * The meta object literal for the '{@link ExternalServiceLayerPSM.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerPSM.impl.PropertyImpl
		 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__TYPE = eINSTANCE.getProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_UNIQUE = eINSTANCE.getProperty_IsUnique();

		/**
		 * The meta object literal for the '<em><b>Has Primitive Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__HAS_PRIMITIVE_TYPE = eINSTANCE.getProperty_HasPrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Has Complex Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__HAS_COMPLEX_TYPE = eINSTANCE.getProperty_HasComplexType();

		/**
		 * The meta object literal for the '{@link ExternalServiceLayerPSM.impl.NonPersistentOutputImpl <em>Non Persistent Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerPSM.impl.NonPersistentOutputImpl
		 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getNonPersistentOutput()
		 * @generated
		 */
		EClass NON_PERSISTENT_OUTPUT = eINSTANCE.getNonPersistentOutput();

		/**
		 * The meta object literal for the '{@link ExternalServiceLayerPSM.impl.AutoPersistentOutputImpl <em>Auto Persistent Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerPSM.impl.AutoPersistentOutputImpl
		 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getAutoPersistentOutput()
		 * @generated
		 */
		EClass AUTO_PERSISTENT_OUTPUT = eINSTANCE.getAutoPersistentOutput();

		/**
		 * The meta object literal for the '{@link ExternalServiceLayerPSM.impl.ExistentJavaModelPersistentOutputImpl <em>Existent Java Model Persistent Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerPSM.impl.ExistentJavaModelPersistentOutputImpl
		 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getExistentJavaModelPersistentOutput()
		 * @generated
		 */
		EClass EXISTENT_JAVA_MODEL_PERSISTENT_OUTPUT = eINSTANCE.getExistentJavaModelPersistentOutput();

		/**
		 * The meta object literal for the '<em><b>Is Existent Java Model Persistent Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXISTENT_JAVA_MODEL_PERSISTENT_OUTPUT__IS_EXISTENT_JAVA_MODEL_PERSISTENT_OUTPUT = eINSTANCE.getExistentJavaModelPersistentOutput_IsExistentJavaModelPersistentOutput();

		/**
		 * The meta object literal for the '{@link ExternalServiceLayerPSM.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerPSM.impl.ComplexTypeImpl
		 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getComplexType()
		 * @generated
		 */
		EClass COMPLEX_TYPE = eINSTANCE.getComplexType();

		/**
		 * The meta object literal for the '<em><b>Complex Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_TYPE__COMPLEX_TYPE_NAME = eINSTANCE.getComplexType_ComplexTypeName();

		/**
		 * The meta object literal for the '<em><b>Has Complex Type Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_TYPE__HAS_COMPLEX_TYPE_PROPERTIES = eINSTANCE.getComplexType_HasComplexTypeProperties();

		/**
		 * The meta object literal for the '{@link ExternalServiceLayerPSM.impl.ComplexTypePropertyImpl <em>Complex Type Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerPSM.impl.ComplexTypePropertyImpl
		 * @see ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl#getComplexTypeProperty()
		 * @generated
		 */
		EClass COMPLEX_TYPE_PROPERTY = eINSTANCE.getComplexTypeProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_TYPE_PROPERTY__NAME = eINSTANCE.getComplexTypeProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_TYPE_PROPERTY__IS_UNIQUE = eINSTANCE.getComplexTypeProperty_IsUnique();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_TYPE_PROPERTY__TYPE = eINSTANCE.getComplexTypeProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Has Primitive Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_TYPE_PROPERTY__HAS_PRIMITIVE_TYPE = eINSTANCE.getComplexTypeProperty_HasPrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Property Has Complex Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_TYPE_PROPERTY__PROPERTY_HAS_COMPLEX_TYPE = eINSTANCE.getComplexTypeProperty_PropertyHasComplexType();

	}

} //ExternalServiceLayerPSMPackage
