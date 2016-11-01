/**
 */
package ExternalServiceLayerCIM;

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
 * @see ExternalServiceLayerCIM.ExternalServiceLayerCIMFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import Eu.fp7.scase='CIMMetamodel.ecore#/'"
 * @generated
 */
public interface ExternalServiceLayerCIMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ExternalServiceLayerCIM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/eu.scasefp7.eclipse.mde.m2m/Metamodels/ExternalServiceLayerCIMMetamodel.ecore";

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
	ExternalServiceLayerCIMPackage eINSTANCE = ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl.init();

	/**
	 * The meta object id for the '{@link ExternalServiceLayerCIM.impl.AnnotationModelImpl <em>Annotation Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerCIM.impl.AnnotationModelImpl
	 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getAnnotationModel()
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
	 * The meta object id for the '{@link ExternalServiceLayerCIM.impl.AnnotatedElementImpl <em>Annotated Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerCIM.impl.AnnotatedElementImpl
	 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getAnnotatedElement()
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
	 * The meta object id for the '{@link ExternalServiceLayerCIM.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerCIM.impl.AnnotationImpl
	 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getAnnotation()
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
	 * The meta object id for the '{@link ExternalServiceLayerCIM.impl.AnnAlgoResourceImpl <em>Ann Algo Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerCIM.impl.AnnAlgoResourceImpl
	 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getAnnAlgoResource()
	 * @generated
	 */
	int ANN_ALGO_RESOURCE = 3;

	/**
	 * The feature id for the '<em><b>Annotates Algo Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_ALGO_RESOURCE__ANNOTATES_ALGO_RESOURCE = ANNOTATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ann Algo Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_ALGO_RESOURCE_FEATURE_COUNT = ANNOTATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ann Algo Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_ALGO_RESOURCE_OPERATION_COUNT = ANNOTATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ExternalServiceLayerCIM.impl.AnnCRUDResourceImpl <em>Ann CRUD Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerCIM.impl.AnnCRUDResourceImpl
	 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getAnnCRUDResource()
	 * @generated
	 */
	int ANN_CRUD_RESOURCE = 4;

	/**
	 * The feature id for the '<em><b>Annotates CRUD Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_CRUD_RESOURCE__ANNOTATES_CRUD_RESOURCE = ANNOTATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ann CRUD Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_CRUD_RESOURCE_FEATURE_COUNT = ANNOTATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ann CRUD Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_CRUD_RESOURCE_OPERATION_COUNT = ANNOTATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ExternalServiceLayerCIM.impl.RESTClientResourceImpl <em>REST Client Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerCIM.impl.RESTClientResourceImpl
	 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getRESTClientResource()
	 * @generated
	 */
	int REST_CLIENT_RESOURCE = 5;

	/**
	 * The feature id for the '<em><b>Targets Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_CLIENT_RESOURCE__TARGETS_SERVICE = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is REST Client Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_CLIENT_RESOURCE__IS_REST_CLIENT_RESOURCE = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Path Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_CLIENT_RESOURCE__HAS_PATH_PARAM = ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is REST Client Complex Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_CLIENT_RESOURCE__IS_REST_CLIENT_COMPLEX_TYPE = ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>REST Client Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_CLIENT_RESOURCE_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>REST Client Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_CLIENT_RESOURCE_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ExternalServiceLayerCIM.impl.TargetRESTServiceImpl <em>Target REST Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerCIM.impl.TargetRESTServiceImpl
	 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getTargetRESTService()
	 * @generated
	 */
	int TARGET_REST_SERVICE = 6;

	/**
	 * The feature id for the '<em><b>Has Query Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_REST_SERVICE__HAS_QUERY_PARAM = 0;

	/**
	 * The feature id for the '<em><b>Has Input Data Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_REST_SERVICE__HAS_INPUT_DATA_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Has Output Data Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_REST_SERVICE__HAS_OUTPUT_DATA_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Target URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_REST_SERVICE__TARGET_URL = 3;

	/**
	 * The feature id for the '<em><b>CRUD Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_REST_SERVICE__CRUD_VERB = 4;

	/**
	 * The number of structural features of the '<em>Target REST Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_REST_SERVICE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Target REST Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_REST_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ExternalServiceLayerCIM.impl.QueryParamImpl <em>Query Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerCIM.impl.QueryParamImpl
	 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getQueryParam()
	 * @generated
	 */
	int QUERY_PARAM = 7;

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
	 * The meta object id for the '{@link ExternalServiceLayerCIM.impl.InputDataModelImpl <em>Input Data Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerCIM.impl.InputDataModelImpl
	 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getInputDataModel()
	 * @generated
	 */
	int INPUT_DATA_MODEL = 8;

	/**
	 * The feature id for the '<em><b>Has Input Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATA_MODEL__HAS_INPUT_REPRESENTATION = 0;

	/**
	 * The feature id for the '<em><b>Has Input Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATA_MODEL__HAS_INPUT_PROPERTIES = 1;

	/**
	 * The number of structural features of the '<em>Input Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATA_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Input Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATA_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ExternalServiceLayerCIM.impl.OutputDataModelImpl <em>Output Data Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerCIM.impl.OutputDataModelImpl
	 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getOutputDataModel()
	 * @generated
	 */
	int OUTPUT_DATA_MODEL = 9;

	/**
	 * The feature id for the '<em><b>Has Output Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DATA_MODEL__HAS_OUTPUT_REPRESENTATION = 0;

	/**
	 * The feature id for the '<em><b>Has Output Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DATA_MODEL__HAS_OUTPUT_PROPERTIES = 1;

	/**
	 * The number of structural features of the '<em>Output Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DATA_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Output Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DATA_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ExternalServiceLayerCIM.impl.RepresentationImpl <em>Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerCIM.impl.RepresentationImpl
	 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getRepresentation()
	 * @generated
	 */
	int REPRESENTATION = 10;

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
	 * The meta object id for the '{@link ExternalServiceLayerCIM.impl.ModelPropertyImpl <em>Model Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerCIM.impl.ModelPropertyImpl
	 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getModelProperty()
	 * @generated
	 */
	int MODEL_PROPERTY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PROPERTY__IS_UNIQUE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PROPERTY__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Has Primitive Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PROPERTY__HAS_PRIMITIVE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Has Complex Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PROPERTY__HAS_COMPLEX_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Model Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PROPERTY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Model Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ExternalServiceLayerCIM.impl.NonPersistentOutputImpl <em>Non Persistent Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerCIM.impl.NonPersistentOutputImpl
	 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getNonPersistentOutput()
	 * @generated
	 */
	int NON_PERSISTENT_OUTPUT = 12;

	/**
	 * The feature id for the '<em><b>Has Output Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_PERSISTENT_OUTPUT__HAS_OUTPUT_REPRESENTATION = OUTPUT_DATA_MODEL__HAS_OUTPUT_REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Has Output Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_PERSISTENT_OUTPUT__HAS_OUTPUT_PROPERTIES = OUTPUT_DATA_MODEL__HAS_OUTPUT_PROPERTIES;

	/**
	 * The number of structural features of the '<em>Non Persistent Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_PERSISTENT_OUTPUT_FEATURE_COUNT = OUTPUT_DATA_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Non Persistent Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_PERSISTENT_OUTPUT_OPERATION_COUNT = OUTPUT_DATA_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ExternalServiceLayerCIM.impl.AutoPersistentOutputImpl <em>Auto Persistent Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerCIM.impl.AutoPersistentOutputImpl
	 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getAutoPersistentOutput()
	 * @generated
	 */
	int AUTO_PERSISTENT_OUTPUT = 13;

	/**
	 * The feature id for the '<em><b>Has Output Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_PERSISTENT_OUTPUT__HAS_OUTPUT_REPRESENTATION = OUTPUT_DATA_MODEL__HAS_OUTPUT_REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Has Output Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_PERSISTENT_OUTPUT__HAS_OUTPUT_PROPERTIES = OUTPUT_DATA_MODEL__HAS_OUTPUT_PROPERTIES;

	/**
	 * The number of structural features of the '<em>Auto Persistent Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_PERSISTENT_OUTPUT_FEATURE_COUNT = OUTPUT_DATA_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Auto Persistent Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_PERSISTENT_OUTPUT_OPERATION_COUNT = OUTPUT_DATA_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ExternalServiceLayerCIM.impl.ExistentCRUDPersistentOutputImpl <em>Existent CRUD Persistent Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerCIM.impl.ExistentCRUDPersistentOutputImpl
	 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getExistentCRUDPersistentOutput()
	 * @generated
	 */
	int EXISTENT_CRUD_PERSISTENT_OUTPUT = 14;

	/**
	 * The feature id for the '<em><b>Has Output Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENT_CRUD_PERSISTENT_OUTPUT__HAS_OUTPUT_REPRESENTATION = OUTPUT_DATA_MODEL__HAS_OUTPUT_REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Has Output Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENT_CRUD_PERSISTENT_OUTPUT__HAS_OUTPUT_PROPERTIES = OUTPUT_DATA_MODEL__HAS_OUTPUT_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Is Existent CRUD Persistent Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENT_CRUD_PERSISTENT_OUTPUT__IS_EXISTENT_CRUD_PERSISTENT_OUTPUT = OUTPUT_DATA_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Existent CRUD Persistent Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENT_CRUD_PERSISTENT_OUTPUT_FEATURE_COUNT = OUTPUT_DATA_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Existent CRUD Persistent Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENT_CRUD_PERSISTENT_OUTPUT_OPERATION_COUNT = OUTPUT_DATA_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ExternalServiceLayerCIM.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerCIM.impl.ComplexTypeImpl
	 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getComplexType()
	 * @generated
	 */
	int COMPLEX_TYPE = 15;

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
	 * The meta object id for the '{@link ExternalServiceLayerCIM.impl.ComplexTypePropertyImpl <em>Complex Type Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerCIM.impl.ComplexTypePropertyImpl
	 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getComplexTypeProperty()
	 * @generated
	 */
	int COMPLEX_TYPE_PROPERTY = 16;

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
	 * The meta object id for the '{@link ExternalServiceLayerCIM.impl.PathParamImpl <em>Path Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ExternalServiceLayerCIM.impl.PathParamImpl
	 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getPathParam()
	 * @generated
	 */
	int PATH_PARAM = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAM__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Path Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Path Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_PARAM_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerCIM.AnnotationModel <em>Annotation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Model</em>'.
	 * @see ExternalServiceLayerCIM.AnnotationModel
	 * @generated
	 */
	EClass getAnnotationModel();

	/**
	 * Returns the meta object for the containment reference list '{@link ExternalServiceLayerCIM.AnnotationModel#getHasAnnotatedElement <em>Has Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Annotated Element</em>'.
	 * @see ExternalServiceLayerCIM.AnnotationModel#getHasAnnotatedElement()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EReference getAnnotationModel_HasAnnotatedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link ExternalServiceLayerCIM.AnnotationModel#getHasAnnotation <em>Has Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Annotation</em>'.
	 * @see ExternalServiceLayerCIM.AnnotationModel#getHasAnnotation()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EReference getAnnotationModel_HasAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerCIM.AnnotationModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ExternalServiceLayerCIM.AnnotationModel#getName()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EAttribute getAnnotationModel_Name();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerCIM.AnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated Element</em>'.
	 * @see ExternalServiceLayerCIM.AnnotatedElement
	 * @generated
	 */
	EClass getAnnotatedElement();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerCIM.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see ExternalServiceLayerCIM.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerCIM.AnnAlgoResource <em>Ann Algo Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ann Algo Resource</em>'.
	 * @see ExternalServiceLayerCIM.AnnAlgoResource
	 * @generated
	 */
	EClass getAnnAlgoResource();

	/**
	 * Returns the meta object for the reference '{@link ExternalServiceLayerCIM.AnnAlgoResource#getAnnotatesAlgoResource <em>Annotates Algo Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotates Algo Resource</em>'.
	 * @see ExternalServiceLayerCIM.AnnAlgoResource#getAnnotatesAlgoResource()
	 * @see #getAnnAlgoResource()
	 * @generated
	 */
	EReference getAnnAlgoResource_AnnotatesAlgoResource();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerCIM.AnnCRUDResource <em>Ann CRUD Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ann CRUD Resource</em>'.
	 * @see ExternalServiceLayerCIM.AnnCRUDResource
	 * @generated
	 */
	EClass getAnnCRUDResource();

	/**
	 * Returns the meta object for the reference '{@link ExternalServiceLayerCIM.AnnCRUDResource#getAnnotatesCRUDResource <em>Annotates CRUD Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotates CRUD Resource</em>'.
	 * @see ExternalServiceLayerCIM.AnnCRUDResource#getAnnotatesCRUDResource()
	 * @see #getAnnCRUDResource()
	 * @generated
	 */
	EReference getAnnCRUDResource_AnnotatesCRUDResource();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerCIM.RESTClientResource <em>REST Client Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REST Client Resource</em>'.
	 * @see ExternalServiceLayerCIM.RESTClientResource
	 * @generated
	 */
	EClass getRESTClientResource();

	/**
	 * Returns the meta object for the containment reference '{@link ExternalServiceLayerCIM.RESTClientResource#getTargetsService <em>Targets Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Targets Service</em>'.
	 * @see ExternalServiceLayerCIM.RESTClientResource#getTargetsService()
	 * @see #getRESTClientResource()
	 * @generated
	 */
	EReference getRESTClientResource_TargetsService();

	/**
	 * Returns the meta object for the reference '{@link ExternalServiceLayerCIM.RESTClientResource#getIsRESTClientResource <em>Is REST Client Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is REST Client Resource</em>'.
	 * @see ExternalServiceLayerCIM.RESTClientResource#getIsRESTClientResource()
	 * @see #getRESTClientResource()
	 * @generated
	 */
	EReference getRESTClientResource_IsRESTClientResource();

	/**
	 * Returns the meta object for the containment reference list '{@link ExternalServiceLayerCIM.RESTClientResource#getHasPathParam <em>Has Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Path Param</em>'.
	 * @see ExternalServiceLayerCIM.RESTClientResource#getHasPathParam()
	 * @see #getRESTClientResource()
	 * @generated
	 */
	EReference getRESTClientResource_HasPathParam();

	/**
	 * Returns the meta object for the containment reference list '{@link ExternalServiceLayerCIM.RESTClientResource#getIsRESTClientComplexType <em>Is REST Client Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Is REST Client Complex Type</em>'.
	 * @see ExternalServiceLayerCIM.RESTClientResource#getIsRESTClientComplexType()
	 * @see #getRESTClientResource()
	 * @generated
	 */
	EReference getRESTClientResource_IsRESTClientComplexType();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerCIM.TargetRESTService <em>Target REST Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target REST Service</em>'.
	 * @see ExternalServiceLayerCIM.TargetRESTService
	 * @generated
	 */
	EClass getTargetRESTService();

	/**
	 * Returns the meta object for the containment reference list '{@link ExternalServiceLayerCIM.TargetRESTService#getHasQueryParam <em>Has Query Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Query Param</em>'.
	 * @see ExternalServiceLayerCIM.TargetRESTService#getHasQueryParam()
	 * @see #getTargetRESTService()
	 * @generated
	 */
	EReference getTargetRESTService_HasQueryParam();

	/**
	 * Returns the meta object for the containment reference '{@link ExternalServiceLayerCIM.TargetRESTService#getHasInputDataModel <em>Has Input Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Input Data Model</em>'.
	 * @see ExternalServiceLayerCIM.TargetRESTService#getHasInputDataModel()
	 * @see #getTargetRESTService()
	 * @generated
	 */
	EReference getTargetRESTService_HasInputDataModel();

	/**
	 * Returns the meta object for the containment reference '{@link ExternalServiceLayerCIM.TargetRESTService#getHasOutputDataModel <em>Has Output Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Output Data Model</em>'.
	 * @see ExternalServiceLayerCIM.TargetRESTService#getHasOutputDataModel()
	 * @see #getTargetRESTService()
	 * @generated
	 */
	EReference getTargetRESTService_HasOutputDataModel();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerCIM.TargetRESTService#getTargetURL <em>Target URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target URL</em>'.
	 * @see ExternalServiceLayerCIM.TargetRESTService#getTargetURL()
	 * @see #getTargetRESTService()
	 * @generated
	 */
	EAttribute getTargetRESTService_TargetURL();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerCIM.TargetRESTService#getCRUDVerb <em>CRUD Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CRUD Verb</em>'.
	 * @see ExternalServiceLayerCIM.TargetRESTService#getCRUDVerb()
	 * @see #getTargetRESTService()
	 * @generated
	 */
	EAttribute getTargetRESTService_CRUDVerb();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerCIM.QueryParam <em>Query Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Param</em>'.
	 * @see ExternalServiceLayerCIM.QueryParam
	 * @generated
	 */
	EClass getQueryParam();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerCIM.QueryParam#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ExternalServiceLayerCIM.QueryParam#getName()
	 * @see #getQueryParam()
	 * @generated
	 */
	EAttribute getQueryParam_Name();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerCIM.QueryParam#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ExternalServiceLayerCIM.QueryParam#getType()
	 * @see #getQueryParam()
	 * @generated
	 */
	EAttribute getQueryParam_Type();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerCIM.QueryParam#isIsAuthToken <em>Is Auth Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Auth Token</em>'.
	 * @see ExternalServiceLayerCIM.QueryParam#isIsAuthToken()
	 * @see #getQueryParam()
	 * @generated
	 */
	EAttribute getQueryParam_IsAuthToken();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerCIM.QueryParam#getAuthTokenToURL <em>Auth Token To URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auth Token To URL</em>'.
	 * @see ExternalServiceLayerCIM.QueryParam#getAuthTokenToURL()
	 * @see #getQueryParam()
	 * @generated
	 */
	EAttribute getQueryParam_AuthTokenToURL();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerCIM.InputDataModel <em>Input Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Data Model</em>'.
	 * @see ExternalServiceLayerCIM.InputDataModel
	 * @generated
	 */
	EClass getInputDataModel();

	/**
	 * Returns the meta object for the containment reference '{@link ExternalServiceLayerCIM.InputDataModel#getHasInputRepresentation <em>Has Input Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Input Representation</em>'.
	 * @see ExternalServiceLayerCIM.InputDataModel#getHasInputRepresentation()
	 * @see #getInputDataModel()
	 * @generated
	 */
	EReference getInputDataModel_HasInputRepresentation();

	/**
	 * Returns the meta object for the containment reference list '{@link ExternalServiceLayerCIM.InputDataModel#getHasInputProperties <em>Has Input Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Input Properties</em>'.
	 * @see ExternalServiceLayerCIM.InputDataModel#getHasInputProperties()
	 * @see #getInputDataModel()
	 * @generated
	 */
	EReference getInputDataModel_HasInputProperties();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerCIM.OutputDataModel <em>Output Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Data Model</em>'.
	 * @see ExternalServiceLayerCIM.OutputDataModel
	 * @generated
	 */
	EClass getOutputDataModel();

	/**
	 * Returns the meta object for the containment reference '{@link ExternalServiceLayerCIM.OutputDataModel#getHasOutputRepresentation <em>Has Output Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Output Representation</em>'.
	 * @see ExternalServiceLayerCIM.OutputDataModel#getHasOutputRepresentation()
	 * @see #getOutputDataModel()
	 * @generated
	 */
	EReference getOutputDataModel_HasOutputRepresentation();

	/**
	 * Returns the meta object for the containment reference list '{@link ExternalServiceLayerCIM.OutputDataModel#getHasOutputProperties <em>Has Output Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Output Properties</em>'.
	 * @see ExternalServiceLayerCIM.OutputDataModel#getHasOutputProperties()
	 * @see #getOutputDataModel()
	 * @generated
	 */
	EReference getOutputDataModel_HasOutputProperties();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerCIM.Representation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Representation</em>'.
	 * @see ExternalServiceLayerCIM.Representation
	 * @generated
	 */
	EClass getRepresentation();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerCIM.Representation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ExternalServiceLayerCIM.Representation#getName()
	 * @see #getRepresentation()
	 * @generated
	 */
	EAttribute getRepresentation_Name();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerCIM.ModelProperty <em>Model Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Property</em>'.
	 * @see ExternalServiceLayerCIM.ModelProperty
	 * @generated
	 */
	EClass getModelProperty();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerCIM.ModelProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ExternalServiceLayerCIM.ModelProperty#getName()
	 * @see #getModelProperty()
	 * @generated
	 */
	EAttribute getModelProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerCIM.ModelProperty#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see ExternalServiceLayerCIM.ModelProperty#isIsUnique()
	 * @see #getModelProperty()
	 * @generated
	 */
	EAttribute getModelProperty_IsUnique();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerCIM.ModelProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ExternalServiceLayerCIM.ModelProperty#getType()
	 * @see #getModelProperty()
	 * @generated
	 */
	EAttribute getModelProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerCIM.ModelProperty#isHasPrimitiveType <em>Has Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Primitive Type</em>'.
	 * @see ExternalServiceLayerCIM.ModelProperty#isHasPrimitiveType()
	 * @see #getModelProperty()
	 * @generated
	 */
	EAttribute getModelProperty_HasPrimitiveType();

	/**
	 * Returns the meta object for the reference '{@link ExternalServiceLayerCIM.ModelProperty#getHasComplexType <em>Has Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Complex Type</em>'.
	 * @see ExternalServiceLayerCIM.ModelProperty#getHasComplexType()
	 * @see #getModelProperty()
	 * @generated
	 */
	EReference getModelProperty_HasComplexType();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerCIM.NonPersistentOutput <em>Non Persistent Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Persistent Output</em>'.
	 * @see ExternalServiceLayerCIM.NonPersistentOutput
	 * @generated
	 */
	EClass getNonPersistentOutput();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerCIM.AutoPersistentOutput <em>Auto Persistent Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auto Persistent Output</em>'.
	 * @see ExternalServiceLayerCIM.AutoPersistentOutput
	 * @generated
	 */
	EClass getAutoPersistentOutput();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerCIM.ExistentCRUDPersistentOutput <em>Existent CRUD Persistent Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Existent CRUD Persistent Output</em>'.
	 * @see ExternalServiceLayerCIM.ExistentCRUDPersistentOutput
	 * @generated
	 */
	EClass getExistentCRUDPersistentOutput();

	/**
	 * Returns the meta object for the reference '{@link ExternalServiceLayerCIM.ExistentCRUDPersistentOutput#getIsExistentCRUDPersistentOutput <em>Is Existent CRUD Persistent Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Existent CRUD Persistent Output</em>'.
	 * @see ExternalServiceLayerCIM.ExistentCRUDPersistentOutput#getIsExistentCRUDPersistentOutput()
	 * @see #getExistentCRUDPersistentOutput()
	 * @generated
	 */
	EReference getExistentCRUDPersistentOutput_IsExistentCRUDPersistentOutput();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerCIM.ComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Type</em>'.
	 * @see ExternalServiceLayerCIM.ComplexType
	 * @generated
	 */
	EClass getComplexType();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerCIM.ComplexType#getComplexTypeName <em>Complex Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Complex Type Name</em>'.
	 * @see ExternalServiceLayerCIM.ComplexType#getComplexTypeName()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_ComplexTypeName();

	/**
	 * Returns the meta object for the containment reference list '{@link ExternalServiceLayerCIM.ComplexType#getHasComplexTypeProperties <em>Has Complex Type Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Complex Type Properties</em>'.
	 * @see ExternalServiceLayerCIM.ComplexType#getHasComplexTypeProperties()
	 * @see #getComplexType()
	 * @generated
	 */
	EReference getComplexType_HasComplexTypeProperties();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerCIM.ComplexTypeProperty <em>Complex Type Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Type Property</em>'.
	 * @see ExternalServiceLayerCIM.ComplexTypeProperty
	 * @generated
	 */
	EClass getComplexTypeProperty();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerCIM.ComplexTypeProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ExternalServiceLayerCIM.ComplexTypeProperty#getName()
	 * @see #getComplexTypeProperty()
	 * @generated
	 */
	EAttribute getComplexTypeProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerCIM.ComplexTypeProperty#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see ExternalServiceLayerCIM.ComplexTypeProperty#isIsUnique()
	 * @see #getComplexTypeProperty()
	 * @generated
	 */
	EAttribute getComplexTypeProperty_IsUnique();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerCIM.ComplexTypeProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ExternalServiceLayerCIM.ComplexTypeProperty#getType()
	 * @see #getComplexTypeProperty()
	 * @generated
	 */
	EAttribute getComplexTypeProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerCIM.ComplexTypeProperty#isHasPrimitiveType <em>Has Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Primitive Type</em>'.
	 * @see ExternalServiceLayerCIM.ComplexTypeProperty#isHasPrimitiveType()
	 * @see #getComplexTypeProperty()
	 * @generated
	 */
	EAttribute getComplexTypeProperty_HasPrimitiveType();

	/**
	 * Returns the meta object for the reference '{@link ExternalServiceLayerCIM.ComplexTypeProperty#getPropertyHasComplexType <em>Property Has Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property Has Complex Type</em>'.
	 * @see ExternalServiceLayerCIM.ComplexTypeProperty#getPropertyHasComplexType()
	 * @see #getComplexTypeProperty()
	 * @generated
	 */
	EReference getComplexTypeProperty_PropertyHasComplexType();

	/**
	 * Returns the meta object for class '{@link ExternalServiceLayerCIM.PathParam <em>Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Param</em>'.
	 * @see ExternalServiceLayerCIM.PathParam
	 * @generated
	 */
	EClass getPathParam();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerCIM.PathParam#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ExternalServiceLayerCIM.PathParam#getName()
	 * @see #getPathParam()
	 * @generated
	 */
	EAttribute getPathParam_Name();

	/**
	 * Returns the meta object for the attribute '{@link ExternalServiceLayerCIM.PathParam#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ExternalServiceLayerCIM.PathParam#getType()
	 * @see #getPathParam()
	 * @generated
	 */
	EAttribute getPathParam_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExternalServiceLayerCIMFactory getExternalServiceLayerCIMFactory();

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
		 * The meta object literal for the '{@link ExternalServiceLayerCIM.impl.AnnotationModelImpl <em>Annotation Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerCIM.impl.AnnotationModelImpl
		 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getAnnotationModel()
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
		 * The meta object literal for the '{@link ExternalServiceLayerCIM.impl.AnnotatedElementImpl <em>Annotated Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerCIM.impl.AnnotatedElementImpl
		 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getAnnotatedElement()
		 * @generated
		 */
		EClass ANNOTATED_ELEMENT = eINSTANCE.getAnnotatedElement();

		/**
		 * The meta object literal for the '{@link ExternalServiceLayerCIM.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerCIM.impl.AnnotationImpl
		 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '{@link ExternalServiceLayerCIM.impl.AnnAlgoResourceImpl <em>Ann Algo Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerCIM.impl.AnnAlgoResourceImpl
		 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getAnnAlgoResource()
		 * @generated
		 */
		EClass ANN_ALGO_RESOURCE = eINSTANCE.getAnnAlgoResource();

		/**
		 * The meta object literal for the '<em><b>Annotates Algo Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANN_ALGO_RESOURCE__ANNOTATES_ALGO_RESOURCE = eINSTANCE.getAnnAlgoResource_AnnotatesAlgoResource();

		/**
		 * The meta object literal for the '{@link ExternalServiceLayerCIM.impl.AnnCRUDResourceImpl <em>Ann CRUD Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerCIM.impl.AnnCRUDResourceImpl
		 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getAnnCRUDResource()
		 * @generated
		 */
		EClass ANN_CRUD_RESOURCE = eINSTANCE.getAnnCRUDResource();

		/**
		 * The meta object literal for the '<em><b>Annotates CRUD Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANN_CRUD_RESOURCE__ANNOTATES_CRUD_RESOURCE = eINSTANCE.getAnnCRUDResource_AnnotatesCRUDResource();

		/**
		 * The meta object literal for the '{@link ExternalServiceLayerCIM.impl.RESTClientResourceImpl <em>REST Client Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerCIM.impl.RESTClientResourceImpl
		 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getRESTClientResource()
		 * @generated
		 */
		EClass REST_CLIENT_RESOURCE = eINSTANCE.getRESTClientResource();

		/**
		 * The meta object literal for the '<em><b>Targets Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_CLIENT_RESOURCE__TARGETS_SERVICE = eINSTANCE.getRESTClientResource_TargetsService();

		/**
		 * The meta object literal for the '<em><b>Is REST Client Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_CLIENT_RESOURCE__IS_REST_CLIENT_RESOURCE = eINSTANCE.getRESTClientResource_IsRESTClientResource();

		/**
		 * The meta object literal for the '<em><b>Has Path Param</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_CLIENT_RESOURCE__HAS_PATH_PARAM = eINSTANCE.getRESTClientResource_HasPathParam();

		/**
		 * The meta object literal for the '<em><b>Is REST Client Complex Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REST_CLIENT_RESOURCE__IS_REST_CLIENT_COMPLEX_TYPE = eINSTANCE.getRESTClientResource_IsRESTClientComplexType();

		/**
		 * The meta object literal for the '{@link ExternalServiceLayerCIM.impl.TargetRESTServiceImpl <em>Target REST Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerCIM.impl.TargetRESTServiceImpl
		 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getTargetRESTService()
		 * @generated
		 */
		EClass TARGET_REST_SERVICE = eINSTANCE.getTargetRESTService();

		/**
		 * The meta object literal for the '<em><b>Has Query Param</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_REST_SERVICE__HAS_QUERY_PARAM = eINSTANCE.getTargetRESTService_HasQueryParam();

		/**
		 * The meta object literal for the '<em><b>Has Input Data Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_REST_SERVICE__HAS_INPUT_DATA_MODEL = eINSTANCE.getTargetRESTService_HasInputDataModel();

		/**
		 * The meta object literal for the '<em><b>Has Output Data Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_REST_SERVICE__HAS_OUTPUT_DATA_MODEL = eINSTANCE.getTargetRESTService_HasOutputDataModel();

		/**
		 * The meta object literal for the '<em><b>Target URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_REST_SERVICE__TARGET_URL = eINSTANCE.getTargetRESTService_TargetURL();

		/**
		 * The meta object literal for the '<em><b>CRUD Verb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_REST_SERVICE__CRUD_VERB = eINSTANCE.getTargetRESTService_CRUDVerb();

		/**
		 * The meta object literal for the '{@link ExternalServiceLayerCIM.impl.QueryParamImpl <em>Query Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerCIM.impl.QueryParamImpl
		 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getQueryParam()
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
		 * The meta object literal for the '{@link ExternalServiceLayerCIM.impl.InputDataModelImpl <em>Input Data Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerCIM.impl.InputDataModelImpl
		 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getInputDataModel()
		 * @generated
		 */
		EClass INPUT_DATA_MODEL = eINSTANCE.getInputDataModel();

		/**
		 * The meta object literal for the '<em><b>Has Input Representation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_DATA_MODEL__HAS_INPUT_REPRESENTATION = eINSTANCE.getInputDataModel_HasInputRepresentation();

		/**
		 * The meta object literal for the '<em><b>Has Input Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_DATA_MODEL__HAS_INPUT_PROPERTIES = eINSTANCE.getInputDataModel_HasInputProperties();

		/**
		 * The meta object literal for the '{@link ExternalServiceLayerCIM.impl.OutputDataModelImpl <em>Output Data Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerCIM.impl.OutputDataModelImpl
		 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getOutputDataModel()
		 * @generated
		 */
		EClass OUTPUT_DATA_MODEL = eINSTANCE.getOutputDataModel();

		/**
		 * The meta object literal for the '<em><b>Has Output Representation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_DATA_MODEL__HAS_OUTPUT_REPRESENTATION = eINSTANCE.getOutputDataModel_HasOutputRepresentation();

		/**
		 * The meta object literal for the '<em><b>Has Output Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_DATA_MODEL__HAS_OUTPUT_PROPERTIES = eINSTANCE.getOutputDataModel_HasOutputProperties();

		/**
		 * The meta object literal for the '{@link ExternalServiceLayerCIM.impl.RepresentationImpl <em>Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerCIM.impl.RepresentationImpl
		 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getRepresentation()
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
		 * The meta object literal for the '{@link ExternalServiceLayerCIM.impl.ModelPropertyImpl <em>Model Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerCIM.impl.ModelPropertyImpl
		 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getModelProperty()
		 * @generated
		 */
		EClass MODEL_PROPERTY = eINSTANCE.getModelProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_PROPERTY__NAME = eINSTANCE.getModelProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_PROPERTY__IS_UNIQUE = eINSTANCE.getModelProperty_IsUnique();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_PROPERTY__TYPE = eINSTANCE.getModelProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Has Primitive Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_PROPERTY__HAS_PRIMITIVE_TYPE = eINSTANCE.getModelProperty_HasPrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Has Complex Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_PROPERTY__HAS_COMPLEX_TYPE = eINSTANCE.getModelProperty_HasComplexType();

		/**
		 * The meta object literal for the '{@link ExternalServiceLayerCIM.impl.NonPersistentOutputImpl <em>Non Persistent Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerCIM.impl.NonPersistentOutputImpl
		 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getNonPersistentOutput()
		 * @generated
		 */
		EClass NON_PERSISTENT_OUTPUT = eINSTANCE.getNonPersistentOutput();

		/**
		 * The meta object literal for the '{@link ExternalServiceLayerCIM.impl.AutoPersistentOutputImpl <em>Auto Persistent Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerCIM.impl.AutoPersistentOutputImpl
		 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getAutoPersistentOutput()
		 * @generated
		 */
		EClass AUTO_PERSISTENT_OUTPUT = eINSTANCE.getAutoPersistentOutput();

		/**
		 * The meta object literal for the '{@link ExternalServiceLayerCIM.impl.ExistentCRUDPersistentOutputImpl <em>Existent CRUD Persistent Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerCIM.impl.ExistentCRUDPersistentOutputImpl
		 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getExistentCRUDPersistentOutput()
		 * @generated
		 */
		EClass EXISTENT_CRUD_PERSISTENT_OUTPUT = eINSTANCE.getExistentCRUDPersistentOutput();

		/**
		 * The meta object literal for the '<em><b>Is Existent CRUD Persistent Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXISTENT_CRUD_PERSISTENT_OUTPUT__IS_EXISTENT_CRUD_PERSISTENT_OUTPUT = eINSTANCE.getExistentCRUDPersistentOutput_IsExistentCRUDPersistentOutput();

		/**
		 * The meta object literal for the '{@link ExternalServiceLayerCIM.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerCIM.impl.ComplexTypeImpl
		 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getComplexType()
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
		 * The meta object literal for the '{@link ExternalServiceLayerCIM.impl.ComplexTypePropertyImpl <em>Complex Type Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerCIM.impl.ComplexTypePropertyImpl
		 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getComplexTypeProperty()
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

		/**
		 * The meta object literal for the '{@link ExternalServiceLayerCIM.impl.PathParamImpl <em>Path Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ExternalServiceLayerCIM.impl.PathParamImpl
		 * @see ExternalServiceLayerCIM.impl.ExternalServiceLayerCIMPackageImpl#getPathParam()
		 * @generated
		 */
		EClass PATH_PARAM = eINSTANCE.getPathParam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_PARAM__NAME = eINSTANCE.getPathParam_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_PARAM__TYPE = eINSTANCE.getPathParam_Type();

	}

} //ExternalServiceLayerCIMPackage
