/**
 */
package AuthorizationLayerPSM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see AuthorizationLayerPSM.AuthorizationLayerPSMFactory
 * @model kind="package"
 * @generated
 */
public interface AuthorizationLayerPSMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "AuthorizationLayerPSM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/eu.scasefp7.eclipse.mde.m2m/Metamodels/AuthorizationPSMMetamodel.ecore";

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
	AuthorizationLayerPSMPackage eINSTANCE = AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl.init();

	/**
	 * The meta object id for the '{@link AuthorizationLayerPSM.impl.AnnotationModelImpl <em>Annotation Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerPSM.impl.AnnotationModelImpl
	 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAnnotationModel()
	 * @generated
	 */
	int ANNOTATION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Has Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MODEL__HAS_ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Has Annotated Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MODEL__HAS_ANNOTATED_ELEMENT = 1;

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
	 * The meta object id for the '{@link AuthorizationLayerPSM.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerPSM.impl.AnnotationImpl
	 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 1;

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
	 * The meta object id for the '{@link AuthorizationLayerPSM.impl.AnnotatedElementImpl <em>Annotated Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerPSM.impl.AnnotatedElementImpl
	 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAnnotatedElement()
	 * @generated
	 */
	int ANNOTATED_ELEMENT = 2;

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
	 * The meta object id for the '{@link AuthorizationLayerPSM.impl.AnnHTTPActivityImpl <em>Ann HTTP Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerPSM.impl.AnnHTTPActivityImpl
	 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAnnHTTPActivity()
	 * @generated
	 */
	int ANN_HTTP_ACTIVITY = 3;

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
	 * The meta object id for the '{@link AuthorizationLayerPSM.impl.AnnPSMComponentPropertyImpl <em>Ann PSM Component Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerPSM.impl.AnnPSMComponentPropertyImpl
	 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAnnPSMComponentProperty()
	 * @generated
	 */
	int ANN_PSM_COMPONENT_PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Annotates PSM Component Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_PSM_COMPONENT_PROPERTY__ANNOTATES_PSM_COMPONENT_PROPERTY = ANNOTATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ann PSM Component Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_PSM_COMPONENT_PROPERTY_FEATURE_COUNT = ANNOTATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ann PSM Component Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_PSM_COMPONENT_PROPERTY_OPERATION_COUNT = ANNOTATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AuthorizationLayerPSM.impl.AnnJPAControllerImpl <em>Ann JPA Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerPSM.impl.AnnJPAControllerImpl
	 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAnnJPAController()
	 * @generated
	 */
	int ANN_JPA_CONTROLLER = 5;

	/**
	 * The feature id for the '<em><b>Annotates JPA Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_JPA_CONTROLLER__ANNOTATES_JPA_CONTROLLER = ANNOTATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ann JPA Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_JPA_CONTROLLER_FEATURE_COUNT = ANNOTATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ann JPA Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_JPA_CONTROLLER_OPERATION_COUNT = ANNOTATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AuthorizationLayerPSM.impl.AnnHTTPActivityHandlerImpl <em>Ann HTTP Activity Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerPSM.impl.AnnHTTPActivityHandlerImpl
	 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAnnHTTPActivityHandler()
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
	 * The meta object id for the '{@link AuthorizationLayerPSM.impl.AnnJavaResourceModelImpl <em>Ann Java Resource Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerPSM.impl.AnnJavaResourceModelImpl
	 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAnnJavaResourceModel()
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
	 * The meta object id for the '{@link AuthorizationLayerPSM.impl.AnnJavaResourceModelManagerImpl <em>Ann Java Resource Model Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerPSM.impl.AnnJavaResourceModelManagerImpl
	 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAnnJavaResourceModelManager()
	 * @generated
	 */
	int ANN_JAVA_RESOURCE_MODEL_MANAGER = 8;

	/**
	 * The feature id for the '<em><b>Annotates Java Resource Model Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_JAVA_RESOURCE_MODEL_MANAGER__ANNOTATES_JAVA_RESOURCE_MODEL_MANAGER = ANNOTATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ann Java Resource Model Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_JAVA_RESOURCE_MODEL_MANAGER_FEATURE_COUNT = ANNOTATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ann Java Resource Model Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_JAVA_RESOURCE_MODEL_MANAGER_OPERATION_COUNT = ANNOTATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AuthorizationLayerPSM.impl.AnnJavaAlgoResourceModelImpl <em>Ann Java Algo Resource Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerPSM.impl.AnnJavaAlgoResourceModelImpl
	 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAnnJavaAlgoResourceModel()
	 * @generated
	 */
	int ANN_JAVA_ALGO_RESOURCE_MODEL = 9;

	/**
	 * The feature id for the '<em><b>Annotates Java Lago Resource Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_JAVA_ALGO_RESOURCE_MODEL__ANNOTATES_JAVA_LAGO_RESOURCE_MODEL = ANNOTATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ann Java Algo Resource Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_JAVA_ALGO_RESOURCE_MODEL_FEATURE_COUNT = ANNOTATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ann Java Algo Resource Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_JAVA_ALGO_RESOURCE_MODEL_OPERATION_COUNT = ANNOTATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AuthorizationLayerPSM.impl.AuthorizationSubjectImpl <em>Authorization Subject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerPSM.impl.AuthorizationSubjectImpl
	 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAuthorizationSubject()
	 * @generated
	 */
	int AUTHORIZATION_SUBJECT = 10;

	/**
	 * The feature id for the '<em><b>Is Authorization Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_SUBJECT__IS_AUTHORIZATION_SUBJECT = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Authorization Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_SUBJECT_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Authorization Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_SUBJECT_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AuthorizationLayerPSM.impl.AuthorizableResourceImpl <em>Authorizable Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerPSM.impl.AuthorizableResourceImpl
	 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAuthorizableResource()
	 * @generated
	 */
	int AUTHORIZABLE_RESOURCE = 11;

	/**
	 * The feature id for the '<em><b>Is Authorizable Algo Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_ALGO_MODEL = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Authorizable Resource Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_RESOURCE_MODEL = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Authorizable Model Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_MODEL_MANAGER = ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Authorization Performer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZABLE_RESOURCE__HAS_AUTHORIZATION_PERFORMER = ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Has Resource Access Policy Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZABLE_RESOURCE__HAS_RESOURCE_ACCESS_POLICY_SET = ANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>BTrack Ownership</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZABLE_RESOURCE__BTRACK_OWNERSHIP = ANNOTATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Authorizable Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZABLE_RESOURCE_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Authorizable Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZABLE_RESOURCE_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AuthorizationLayerPSM.impl.AuthorizationPerformerImpl <em>Authorization Performer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerPSM.impl.AuthorizationPerformerImpl
	 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAuthorizationPerformer()
	 * @generated
	 */
	int AUTHORIZATION_PERFORMER = 12;

	/**
	 * The feature id for the '<em><b>Uses Authorization Policy Evaluator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_PERFORMER__USES_AUTHORIZATION_POLICY_EVALUATOR = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Authorization Performer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_PERFORMER__IS_AUTHORIZATION_PERFORMER = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Authorization Performer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_PERFORMER_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Authorization Performer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_PERFORMER_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AuthorizationLayerPSM.impl.AuthorizationDataHandlerImpl <em>Authorization Data Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerPSM.impl.AuthorizationDataHandlerImpl
	 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAuthorizationDataHandler()
	 * @generated
	 */
	int AUTHORIZATION_DATA_HANDLER = 13;

	/**
	 * The feature id for the '<em><b>Is Authorization Data Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_DATA_HANDLER__IS_AUTHORIZATION_DATA_HANDLER = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Authorization Data Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_DATA_HANDLER_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Authorization Data Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_DATA_HANDLER_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AuthorizationLayerPSM.impl.AuthorizationPolicyEvaluatorImpl <em>Authorization Policy Evaluator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerPSM.impl.AuthorizationPolicyEvaluatorImpl
	 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAuthorizationPolicyEvaluator()
	 * @generated
	 */
	int AUTHORIZATION_POLICY_EVALUATOR = 14;

	/**
	 * The feature id for the '<em><b>Accesses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_POLICY_EVALUATOR__ACCESSES = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Authorization Policy Evaluator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_POLICY_EVALUATOR_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Authorization Policy Evaluator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZATION_POLICY_EVALUATOR_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AuthorizationLayerPSM.impl.ResourceAccessPolicySetImpl <em>Resource Access Policy Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerPSM.impl.ResourceAccessPolicySetImpl
	 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getResourceAccessPolicySet()
	 * @generated
	 */
	int RESOURCE_ACCESS_POLICY_SET = 15;

	/**
	 * The feature id for the '<em><b>Has Resource Access Policy Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS_POLICY_SET__HAS_RESOURCE_ACCESS_POLICY_SET = 0;

	/**
	 * The feature id for the '<em><b>Policy Combining Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS_POLICY_SET__POLICY_COMBINING_ALGORITHM = 1;

	/**
	 * The feature id for the '<em><b>Has Resource Access Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS_POLICY_SET__HAS_RESOURCE_ACCESS_POLICY = 2;

	/**
	 * The number of structural features of the '<em>Resource Access Policy Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS_POLICY_SET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Resource Access Policy Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS_POLICY_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AuthorizationLayerPSM.impl.ResourceAccessPolicyImpl <em>Resource Access Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerPSM.impl.ResourceAccessPolicyImpl
	 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getResourceAccessPolicy()
	 * @generated
	 */
	int RESOURCE_ACCESS_POLICY = 16;

	/**
	 * The feature id for the '<em><b>Rule Combining Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS_POLICY__RULE_COMBINING_ALGORITHM = 0;

	/**
	 * The feature id for the '<em><b>Has Resource Access Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS_POLICY__HAS_RESOURCE_ACCESS_RULE = 1;

	/**
	 * The feature id for the '<em><b>Has Apply Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS_POLICY__HAS_APPLY_CONDITION = 2;

	/**
	 * The number of structural features of the '<em>Resource Access Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS_POLICY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Resource Access Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AuthorizationLayerPSM.impl.ResourceAccessRuleImpl <em>Resource Access Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerPSM.impl.ResourceAccessRuleImpl
	 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getResourceAccessRule()
	 * @generated
	 */
	int RESOURCE_ACCESS_RULE = 17;

	/**
	 * The feature id for the '<em><b>Rule Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS_RULE__RULE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Has Match Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS_RULE__HAS_MATCH_CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Has Allowed Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS_RULE__HAS_ALLOWED_ACTION = 2;

	/**
	 * The number of structural features of the '<em>Resource Access Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS_RULE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Resource Access Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AuthorizationLayerPSM.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerPSM.impl.ConditionImpl
	 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 18;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Has Left Side Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__HAS_LEFT_SIDE_OPERAND = 1;

	/**
	 * The feature id for the '<em><b>Has Right Side Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__HAS_RIGHT_SIDE_OPERAND = 2;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AuthorizationLayerPSM.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerPSM.impl.AttributeImpl
	 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 19;

	/**
	 * The feature id for the '<em><b>Attribute Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTE_CATEGORY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Is Attribute Existing Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_ATTRIBUTE_EXISTING_PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Is Attribute New Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_ATTRIBUTE_NEW_PROPERTY = 3;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AuthorizationLayerPSM.impl.AllowedActionImpl <em>Allowed Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerPSM.impl.AllowedActionImpl
	 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAllowedAction()
	 * @generated
	 */
	int ALLOWED_ACTION = 20;

	/**
	 * The feature id for the '<em><b>Is Allowed Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_ACTION__IS_ALLOWED_ACTION = 0;

	/**
	 * The number of structural features of the '<em>Allowed Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_ACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Allowed Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOWED_ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AuthorizationLayerPSM.impl.NewPropertyImpl <em>New Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerPSM.impl.NewPropertyImpl
	 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getNewProperty()
	 * @generated
	 */
	int NEW_PROPERTY = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_PROPERTY__NAME = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_PROPERTY__TYPE = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>BIs Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_PROPERTY__BIS_UNIQUE = ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Belongs To Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_PROPERTY__BELONGS_TO_RESOURCE = ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>New Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_PROPERTY_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>New Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_PROPERTY_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AuthorizationLayerPSM.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerPSM.Operator
	 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 22;

	/**
	 * The meta object id for the '{@link AuthorizationLayerPSM.CombiningAlgorithm <em>Combining Algorithm</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerPSM.CombiningAlgorithm
	 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getCombiningAlgorithm()
	 * @generated
	 */
	int COMBINING_ALGORITHM = 23;

	/**
	 * The meta object id for the '{@link AuthorizationLayerPSM.AttributeCategory <em>Attribute Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerPSM.AttributeCategory
	 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAttributeCategory()
	 * @generated
	 */
	int ATTRIBUTE_CATEGORY = 24;

	/**
	 * The meta object id for the '{@link AuthorizationLayerPSM.RuleType <em>Rule Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerPSM.RuleType
	 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getRuleType()
	 * @generated
	 */
	int RULE_TYPE = 25;


	/**
	 * Returns the meta object for class '{@link AuthorizationLayerPSM.AnnotationModel <em>Annotation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Model</em>'.
	 * @see AuthorizationLayerPSM.AnnotationModel
	 * @generated
	 */
	EClass getAnnotationModel();

	/**
	 * Returns the meta object for the containment reference list '{@link AuthorizationLayerPSM.AnnotationModel#getHasAnnotation <em>Has Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Annotation</em>'.
	 * @see AuthorizationLayerPSM.AnnotationModel#getHasAnnotation()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EReference getAnnotationModel_HasAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link AuthorizationLayerPSM.AnnotationModel#getHasAnnotatedElement <em>Has Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Annotated Element</em>'.
	 * @see AuthorizationLayerPSM.AnnotationModel#getHasAnnotatedElement()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EReference getAnnotationModel_HasAnnotatedElement();

	/**
	 * Returns the meta object for the attribute '{@link AuthorizationLayerPSM.AnnotationModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AuthorizationLayerPSM.AnnotationModel#getName()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EAttribute getAnnotationModel_Name();

	/**
	 * Returns the meta object for class '{@link AuthorizationLayerPSM.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see AuthorizationLayerPSM.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for class '{@link AuthorizationLayerPSM.AnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated Element</em>'.
	 * @see AuthorizationLayerPSM.AnnotatedElement
	 * @generated
	 */
	EClass getAnnotatedElement();

	/**
	 * Returns the meta object for class '{@link AuthorizationLayerPSM.AnnHTTPActivity <em>Ann HTTP Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ann HTTP Activity</em>'.
	 * @see AuthorizationLayerPSM.AnnHTTPActivity
	 * @generated
	 */
	EClass getAnnHTTPActivity();

	/**
	 * Returns the meta object for the reference '{@link AuthorizationLayerPSM.AnnHTTPActivity#getAnnotatesHTTPActivity <em>Annotates HTTP Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotates HTTP Activity</em>'.
	 * @see AuthorizationLayerPSM.AnnHTTPActivity#getAnnotatesHTTPActivity()
	 * @see #getAnnHTTPActivity()
	 * @generated
	 */
	EReference getAnnHTTPActivity_AnnotatesHTTPActivity();

	/**
	 * Returns the meta object for class '{@link AuthorizationLayerPSM.AnnPSMComponentProperty <em>Ann PSM Component Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ann PSM Component Property</em>'.
	 * @see AuthorizationLayerPSM.AnnPSMComponentProperty
	 * @generated
	 */
	EClass getAnnPSMComponentProperty();

	/**
	 * Returns the meta object for the reference '{@link AuthorizationLayerPSM.AnnPSMComponentProperty#getAnnotatesPSMComponentProperty <em>Annotates PSM Component Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotates PSM Component Property</em>'.
	 * @see AuthorizationLayerPSM.AnnPSMComponentProperty#getAnnotatesPSMComponentProperty()
	 * @see #getAnnPSMComponentProperty()
	 * @generated
	 */
	EReference getAnnPSMComponentProperty_AnnotatesPSMComponentProperty();

	/**
	 * Returns the meta object for class '{@link AuthorizationLayerPSM.AnnJPAController <em>Ann JPA Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ann JPA Controller</em>'.
	 * @see AuthorizationLayerPSM.AnnJPAController
	 * @generated
	 */
	EClass getAnnJPAController();

	/**
	 * Returns the meta object for the reference '{@link AuthorizationLayerPSM.AnnJPAController#getAnnotatesJPAController <em>Annotates JPA Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotates JPA Controller</em>'.
	 * @see AuthorizationLayerPSM.AnnJPAController#getAnnotatesJPAController()
	 * @see #getAnnJPAController()
	 * @generated
	 */
	EReference getAnnJPAController_AnnotatesJPAController();

	/**
	 * Returns the meta object for class '{@link AuthorizationLayerPSM.AnnHTTPActivityHandler <em>Ann HTTP Activity Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ann HTTP Activity Handler</em>'.
	 * @see AuthorizationLayerPSM.AnnHTTPActivityHandler
	 * @generated
	 */
	EClass getAnnHTTPActivityHandler();

	/**
	 * Returns the meta object for the reference '{@link AuthorizationLayerPSM.AnnHTTPActivityHandler#getAnnotatesHTTPActivityHandler <em>Annotates HTTP Activity Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotates HTTP Activity Handler</em>'.
	 * @see AuthorizationLayerPSM.AnnHTTPActivityHandler#getAnnotatesHTTPActivityHandler()
	 * @see #getAnnHTTPActivityHandler()
	 * @generated
	 */
	EReference getAnnHTTPActivityHandler_AnnotatesHTTPActivityHandler();

	/**
	 * Returns the meta object for class '{@link AuthorizationLayerPSM.AnnJavaResourceModel <em>Ann Java Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ann Java Resource Model</em>'.
	 * @see AuthorizationLayerPSM.AnnJavaResourceModel
	 * @generated
	 */
	EClass getAnnJavaResourceModel();

	/**
	 * Returns the meta object for the reference '{@link AuthorizationLayerPSM.AnnJavaResourceModel#getAnnotatesJavaResourceModel <em>Annotates Java Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotates Java Resource Model</em>'.
	 * @see AuthorizationLayerPSM.AnnJavaResourceModel#getAnnotatesJavaResourceModel()
	 * @see #getAnnJavaResourceModel()
	 * @generated
	 */
	EReference getAnnJavaResourceModel_AnnotatesJavaResourceModel();

	/**
	 * Returns the meta object for class '{@link AuthorizationLayerPSM.AnnJavaResourceModelManager <em>Ann Java Resource Model Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ann Java Resource Model Manager</em>'.
	 * @see AuthorizationLayerPSM.AnnJavaResourceModelManager
	 * @generated
	 */
	EClass getAnnJavaResourceModelManager();

	/**
	 * Returns the meta object for the reference '{@link AuthorizationLayerPSM.AnnJavaResourceModelManager#getAnnotatesJavaResourceModelManager <em>Annotates Java Resource Model Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotates Java Resource Model Manager</em>'.
	 * @see AuthorizationLayerPSM.AnnJavaResourceModelManager#getAnnotatesJavaResourceModelManager()
	 * @see #getAnnJavaResourceModelManager()
	 * @generated
	 */
	EReference getAnnJavaResourceModelManager_AnnotatesJavaResourceModelManager();

	/**
	 * Returns the meta object for class '{@link AuthorizationLayerPSM.AnnJavaAlgoResourceModel <em>Ann Java Algo Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ann Java Algo Resource Model</em>'.
	 * @see AuthorizationLayerPSM.AnnJavaAlgoResourceModel
	 * @generated
	 */
	EClass getAnnJavaAlgoResourceModel();

	/**
	 * Returns the meta object for the reference '{@link AuthorizationLayerPSM.AnnJavaAlgoResourceModel#getAnnotatesJavaLagoResourceModel <em>Annotates Java Lago Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotates Java Lago Resource Model</em>'.
	 * @see AuthorizationLayerPSM.AnnJavaAlgoResourceModel#getAnnotatesJavaLagoResourceModel()
	 * @see #getAnnJavaAlgoResourceModel()
	 * @generated
	 */
	EReference getAnnJavaAlgoResourceModel_AnnotatesJavaLagoResourceModel();

	/**
	 * Returns the meta object for class '{@link AuthorizationLayerPSM.AuthorizationSubject <em>Authorization Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorization Subject</em>'.
	 * @see AuthorizationLayerPSM.AuthorizationSubject
	 * @generated
	 */
	EClass getAuthorizationSubject();

	/**
	 * Returns the meta object for the reference '{@link AuthorizationLayerPSM.AuthorizationSubject#getIsAuthorizationSubject <em>Is Authorization Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Authorization Subject</em>'.
	 * @see AuthorizationLayerPSM.AuthorizationSubject#getIsAuthorizationSubject()
	 * @see #getAuthorizationSubject()
	 * @generated
	 */
	EReference getAuthorizationSubject_IsAuthorizationSubject();

	/**
	 * Returns the meta object for class '{@link AuthorizationLayerPSM.AuthorizableResource <em>Authorizable Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorizable Resource</em>'.
	 * @see AuthorizationLayerPSM.AuthorizableResource
	 * @generated
	 */
	EClass getAuthorizableResource();

	/**
	 * Returns the meta object for the reference '{@link AuthorizationLayerPSM.AuthorizableResource#getIsAuthorizableAlgoModel <em>Is Authorizable Algo Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Authorizable Algo Model</em>'.
	 * @see AuthorizationLayerPSM.AuthorizableResource#getIsAuthorizableAlgoModel()
	 * @see #getAuthorizableResource()
	 * @generated
	 */
	EReference getAuthorizableResource_IsAuthorizableAlgoModel();

	/**
	 * Returns the meta object for the reference '{@link AuthorizationLayerPSM.AuthorizableResource#getIsAuthorizableResourceModel <em>Is Authorizable Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Authorizable Resource Model</em>'.
	 * @see AuthorizationLayerPSM.AuthorizableResource#getIsAuthorizableResourceModel()
	 * @see #getAuthorizableResource()
	 * @generated
	 */
	EReference getAuthorizableResource_IsAuthorizableResourceModel();

	/**
	 * Returns the meta object for the reference '{@link AuthorizationLayerPSM.AuthorizableResource#getIsAuthorizableModelManager <em>Is Authorizable Model Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Authorizable Model Manager</em>'.
	 * @see AuthorizationLayerPSM.AuthorizableResource#getIsAuthorizableModelManager()
	 * @see #getAuthorizableResource()
	 * @generated
	 */
	EReference getAuthorizableResource_IsAuthorizableModelManager();

	/**
	 * Returns the meta object for the reference '{@link AuthorizationLayerPSM.AuthorizableResource#getHasAuthorizationPerformer <em>Has Authorization Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Authorization Performer</em>'.
	 * @see AuthorizationLayerPSM.AuthorizableResource#getHasAuthorizationPerformer()
	 * @see #getAuthorizableResource()
	 * @generated
	 */
	EReference getAuthorizableResource_HasAuthorizationPerformer();

	/**
	 * Returns the meta object for the containment reference '{@link AuthorizationLayerPSM.AuthorizableResource#getHasResourceAccessPolicySet <em>Has Resource Access Policy Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Resource Access Policy Set</em>'.
	 * @see AuthorizationLayerPSM.AuthorizableResource#getHasResourceAccessPolicySet()
	 * @see #getAuthorizableResource()
	 * @generated
	 */
	EReference getAuthorizableResource_HasResourceAccessPolicySet();

	/**
	 * Returns the meta object for the attribute '{@link AuthorizationLayerPSM.AuthorizableResource#isBTrackOwnership <em>BTrack Ownership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BTrack Ownership</em>'.
	 * @see AuthorizationLayerPSM.AuthorizableResource#isBTrackOwnership()
	 * @see #getAuthorizableResource()
	 * @generated
	 */
	EAttribute getAuthorizableResource_BTrackOwnership();

	/**
	 * Returns the meta object for class '{@link AuthorizationLayerPSM.AuthorizationPerformer <em>Authorization Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorization Performer</em>'.
	 * @see AuthorizationLayerPSM.AuthorizationPerformer
	 * @generated
	 */
	EClass getAuthorizationPerformer();

	/**
	 * Returns the meta object for the reference '{@link AuthorizationLayerPSM.AuthorizationPerformer#getUsesAuthorizationPolicyEvaluator <em>Uses Authorization Policy Evaluator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uses Authorization Policy Evaluator</em>'.
	 * @see AuthorizationLayerPSM.AuthorizationPerformer#getUsesAuthorizationPolicyEvaluator()
	 * @see #getAuthorizationPerformer()
	 * @generated
	 */
	EReference getAuthorizationPerformer_UsesAuthorizationPolicyEvaluator();

	/**
	 * Returns the meta object for the reference list '{@link AuthorizationLayerPSM.AuthorizationPerformer#getIsAuthorizationPerformer <em>Is Authorization Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Authorization Performer</em>'.
	 * @see AuthorizationLayerPSM.AuthorizationPerformer#getIsAuthorizationPerformer()
	 * @see #getAuthorizationPerformer()
	 * @generated
	 */
	EReference getAuthorizationPerformer_IsAuthorizationPerformer();

	/**
	 * Returns the meta object for class '{@link AuthorizationLayerPSM.AuthorizationDataHandler <em>Authorization Data Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorization Data Handler</em>'.
	 * @see AuthorizationLayerPSM.AuthorizationDataHandler
	 * @generated
	 */
	EClass getAuthorizationDataHandler();

	/**
	 * Returns the meta object for the reference '{@link AuthorizationLayerPSM.AuthorizationDataHandler#getIsAuthorizationDataHandler <em>Is Authorization Data Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Authorization Data Handler</em>'.
	 * @see AuthorizationLayerPSM.AuthorizationDataHandler#getIsAuthorizationDataHandler()
	 * @see #getAuthorizationDataHandler()
	 * @generated
	 */
	EReference getAuthorizationDataHandler_IsAuthorizationDataHandler();

	/**
	 * Returns the meta object for class '{@link AuthorizationLayerPSM.AuthorizationPolicyEvaluator <em>Authorization Policy Evaluator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorization Policy Evaluator</em>'.
	 * @see AuthorizationLayerPSM.AuthorizationPolicyEvaluator
	 * @generated
	 */
	EClass getAuthorizationPolicyEvaluator();

	/**
	 * Returns the meta object for the reference '{@link AuthorizationLayerPSM.AuthorizationPolicyEvaluator#getAccesses <em>Accesses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Accesses</em>'.
	 * @see AuthorizationLayerPSM.AuthorizationPolicyEvaluator#getAccesses()
	 * @see #getAuthorizationPolicyEvaluator()
	 * @generated
	 */
	EReference getAuthorizationPolicyEvaluator_Accesses();

	/**
	 * Returns the meta object for class '{@link AuthorizationLayerPSM.ResourceAccessPolicySet <em>Resource Access Policy Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Access Policy Set</em>'.
	 * @see AuthorizationLayerPSM.ResourceAccessPolicySet
	 * @generated
	 */
	EClass getResourceAccessPolicySet();

	/**
	 * Returns the meta object for the containment reference list '{@link AuthorizationLayerPSM.ResourceAccessPolicySet#getHasResourceAccessPolicySet <em>Has Resource Access Policy Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Resource Access Policy Set</em>'.
	 * @see AuthorizationLayerPSM.ResourceAccessPolicySet#getHasResourceAccessPolicySet()
	 * @see #getResourceAccessPolicySet()
	 * @generated
	 */
	EReference getResourceAccessPolicySet_HasResourceAccessPolicySet();

	/**
	 * Returns the meta object for the attribute '{@link AuthorizationLayerPSM.ResourceAccessPolicySet#getPolicyCombiningAlgorithm <em>Policy Combining Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Combining Algorithm</em>'.
	 * @see AuthorizationLayerPSM.ResourceAccessPolicySet#getPolicyCombiningAlgorithm()
	 * @see #getResourceAccessPolicySet()
	 * @generated
	 */
	EAttribute getResourceAccessPolicySet_PolicyCombiningAlgorithm();

	/**
	 * Returns the meta object for the containment reference list '{@link AuthorizationLayerPSM.ResourceAccessPolicySet#getHasResourceAccessPolicy <em>Has Resource Access Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Resource Access Policy</em>'.
	 * @see AuthorizationLayerPSM.ResourceAccessPolicySet#getHasResourceAccessPolicy()
	 * @see #getResourceAccessPolicySet()
	 * @generated
	 */
	EReference getResourceAccessPolicySet_HasResourceAccessPolicy();

	/**
	 * Returns the meta object for class '{@link AuthorizationLayerPSM.ResourceAccessPolicy <em>Resource Access Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Access Policy</em>'.
	 * @see AuthorizationLayerPSM.ResourceAccessPolicy
	 * @generated
	 */
	EClass getResourceAccessPolicy();

	/**
	 * Returns the meta object for the attribute '{@link AuthorizationLayerPSM.ResourceAccessPolicy#getRuleCombiningAlgorithm <em>Rule Combining Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Combining Algorithm</em>'.
	 * @see AuthorizationLayerPSM.ResourceAccessPolicy#getRuleCombiningAlgorithm()
	 * @see #getResourceAccessPolicy()
	 * @generated
	 */
	EAttribute getResourceAccessPolicy_RuleCombiningAlgorithm();

	/**
	 * Returns the meta object for the containment reference list '{@link AuthorizationLayerPSM.ResourceAccessPolicy#getHasResourceAccessRule <em>Has Resource Access Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Resource Access Rule</em>'.
	 * @see AuthorizationLayerPSM.ResourceAccessPolicy#getHasResourceAccessRule()
	 * @see #getResourceAccessPolicy()
	 * @generated
	 */
	EReference getResourceAccessPolicy_HasResourceAccessRule();

	/**
	 * Returns the meta object for the containment reference list '{@link AuthorizationLayerPSM.ResourceAccessPolicy#getHasApplyCondition <em>Has Apply Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Apply Condition</em>'.
	 * @see AuthorizationLayerPSM.ResourceAccessPolicy#getHasApplyCondition()
	 * @see #getResourceAccessPolicy()
	 * @generated
	 */
	EReference getResourceAccessPolicy_HasApplyCondition();

	/**
	 * Returns the meta object for class '{@link AuthorizationLayerPSM.ResourceAccessRule <em>Resource Access Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Access Rule</em>'.
	 * @see AuthorizationLayerPSM.ResourceAccessRule
	 * @generated
	 */
	EClass getResourceAccessRule();

	/**
	 * Returns the meta object for the attribute '{@link AuthorizationLayerPSM.ResourceAccessRule#getRuleType <em>Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Type</em>'.
	 * @see AuthorizationLayerPSM.ResourceAccessRule#getRuleType()
	 * @see #getResourceAccessRule()
	 * @generated
	 */
	EAttribute getResourceAccessRule_RuleType();

	/**
	 * Returns the meta object for the containment reference list '{@link AuthorizationLayerPSM.ResourceAccessRule#getHasMatchCondition <em>Has Match Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Match Condition</em>'.
	 * @see AuthorizationLayerPSM.ResourceAccessRule#getHasMatchCondition()
	 * @see #getResourceAccessRule()
	 * @generated
	 */
	EReference getResourceAccessRule_HasMatchCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link AuthorizationLayerPSM.ResourceAccessRule#getHasAllowedAction <em>Has Allowed Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Allowed Action</em>'.
	 * @see AuthorizationLayerPSM.ResourceAccessRule#getHasAllowedAction()
	 * @see #getResourceAccessRule()
	 * @generated
	 */
	EReference getResourceAccessRule_HasAllowedAction();

	/**
	 * Returns the meta object for class '{@link AuthorizationLayerPSM.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see AuthorizationLayerPSM.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link AuthorizationLayerPSM.Condition#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see AuthorizationLayerPSM.Condition#getOperator()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link AuthorizationLayerPSM.Condition#getHasLeftSideOperand <em>Has Left Side Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Left Side Operand</em>'.
	 * @see AuthorizationLayerPSM.Condition#getHasLeftSideOperand()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_HasLeftSideOperand();

	/**
	 * Returns the meta object for the containment reference '{@link AuthorizationLayerPSM.Condition#getHasRightSideOperand <em>Has Right Side Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Right Side Operand</em>'.
	 * @see AuthorizationLayerPSM.Condition#getHasRightSideOperand()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_HasRightSideOperand();

	/**
	 * Returns the meta object for class '{@link AuthorizationLayerPSM.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see AuthorizationLayerPSM.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link AuthorizationLayerPSM.Attribute#getAttributeCategory <em>Attribute Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Category</em>'.
	 * @see AuthorizationLayerPSM.Attribute#getAttributeCategory()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_AttributeCategory();

	/**
	 * Returns the meta object for the attribute list '{@link AuthorizationLayerPSM.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see AuthorizationLayerPSM.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Value();

	/**
	 * Returns the meta object for the reference '{@link AuthorizationLayerPSM.Attribute#getIsAttributeExistingProperty <em>Is Attribute Existing Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Attribute Existing Property</em>'.
	 * @see AuthorizationLayerPSM.Attribute#getIsAttributeExistingProperty()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_IsAttributeExistingProperty();

	/**
	 * Returns the meta object for the reference '{@link AuthorizationLayerPSM.Attribute#getIsAttributeNewProperty <em>Is Attribute New Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Attribute New Property</em>'.
	 * @see AuthorizationLayerPSM.Attribute#getIsAttributeNewProperty()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_IsAttributeNewProperty();

	/**
	 * Returns the meta object for class '{@link AuthorizationLayerPSM.AllowedAction <em>Allowed Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allowed Action</em>'.
	 * @see AuthorizationLayerPSM.AllowedAction
	 * @generated
	 */
	EClass getAllowedAction();

	/**
	 * Returns the meta object for the reference '{@link AuthorizationLayerPSM.AllowedAction#getIsAllowedAction <em>Is Allowed Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Allowed Action</em>'.
	 * @see AuthorizationLayerPSM.AllowedAction#getIsAllowedAction()
	 * @see #getAllowedAction()
	 * @generated
	 */
	EReference getAllowedAction_IsAllowedAction();

	/**
	 * Returns the meta object for class '{@link AuthorizationLayerPSM.NewProperty <em>New Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Property</em>'.
	 * @see AuthorizationLayerPSM.NewProperty
	 * @generated
	 */
	EClass getNewProperty();

	/**
	 * Returns the meta object for the attribute '{@link AuthorizationLayerPSM.NewProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AuthorizationLayerPSM.NewProperty#getName()
	 * @see #getNewProperty()
	 * @generated
	 */
	EAttribute getNewProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link AuthorizationLayerPSM.NewProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see AuthorizationLayerPSM.NewProperty#getType()
	 * @see #getNewProperty()
	 * @generated
	 */
	EAttribute getNewProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link AuthorizationLayerPSM.NewProperty#isBIsUnique <em>BIs Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BIs Unique</em>'.
	 * @see AuthorizationLayerPSM.NewProperty#isBIsUnique()
	 * @see #getNewProperty()
	 * @generated
	 */
	EAttribute getNewProperty_BIsUnique();

	/**
	 * Returns the meta object for the reference '{@link AuthorizationLayerPSM.NewProperty#getBelongsToResource <em>Belongs To Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Belongs To Resource</em>'.
	 * @see AuthorizationLayerPSM.NewProperty#getBelongsToResource()
	 * @see #getNewProperty()
	 * @generated
	 */
	EReference getNewProperty_BelongsToResource();

	/**
	 * Returns the meta object for enum '{@link AuthorizationLayerPSM.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see AuthorizationLayerPSM.Operator
	 * @generated
	 */
	EEnum getOperator();

	/**
	 * Returns the meta object for enum '{@link AuthorizationLayerPSM.CombiningAlgorithm <em>Combining Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Combining Algorithm</em>'.
	 * @see AuthorizationLayerPSM.CombiningAlgorithm
	 * @generated
	 */
	EEnum getCombiningAlgorithm();

	/**
	 * Returns the meta object for enum '{@link AuthorizationLayerPSM.AttributeCategory <em>Attribute Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Category</em>'.
	 * @see AuthorizationLayerPSM.AttributeCategory
	 * @generated
	 */
	EEnum getAttributeCategory();

	/**
	 * Returns the meta object for enum '{@link AuthorizationLayerPSM.RuleType <em>Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rule Type</em>'.
	 * @see AuthorizationLayerPSM.RuleType
	 * @generated
	 */
	EEnum getRuleType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AuthorizationLayerPSMFactory getAuthorizationLayerPSMFactory();

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
		 * The meta object literal for the '{@link AuthorizationLayerPSM.impl.AnnotationModelImpl <em>Annotation Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerPSM.impl.AnnotationModelImpl
		 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAnnotationModel()
		 * @generated
		 */
		EClass ANNOTATION_MODEL = eINSTANCE.getAnnotationModel();

		/**
		 * The meta object literal for the '<em><b>Has Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_MODEL__HAS_ANNOTATION = eINSTANCE.getAnnotationModel_HasAnnotation();

		/**
		 * The meta object literal for the '<em><b>Has Annotated Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_MODEL__HAS_ANNOTATED_ELEMENT = eINSTANCE.getAnnotationModel_HasAnnotatedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_MODEL__NAME = eINSTANCE.getAnnotationModel_Name();

		/**
		 * The meta object literal for the '{@link AuthorizationLayerPSM.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerPSM.impl.AnnotationImpl
		 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '{@link AuthorizationLayerPSM.impl.AnnotatedElementImpl <em>Annotated Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerPSM.impl.AnnotatedElementImpl
		 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAnnotatedElement()
		 * @generated
		 */
		EClass ANNOTATED_ELEMENT = eINSTANCE.getAnnotatedElement();

		/**
		 * The meta object literal for the '{@link AuthorizationLayerPSM.impl.AnnHTTPActivityImpl <em>Ann HTTP Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerPSM.impl.AnnHTTPActivityImpl
		 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAnnHTTPActivity()
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
		 * The meta object literal for the '{@link AuthorizationLayerPSM.impl.AnnPSMComponentPropertyImpl <em>Ann PSM Component Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerPSM.impl.AnnPSMComponentPropertyImpl
		 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAnnPSMComponentProperty()
		 * @generated
		 */
		EClass ANN_PSM_COMPONENT_PROPERTY = eINSTANCE.getAnnPSMComponentProperty();

		/**
		 * The meta object literal for the '<em><b>Annotates PSM Component Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANN_PSM_COMPONENT_PROPERTY__ANNOTATES_PSM_COMPONENT_PROPERTY = eINSTANCE.getAnnPSMComponentProperty_AnnotatesPSMComponentProperty();

		/**
		 * The meta object literal for the '{@link AuthorizationLayerPSM.impl.AnnJPAControllerImpl <em>Ann JPA Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerPSM.impl.AnnJPAControllerImpl
		 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAnnJPAController()
		 * @generated
		 */
		EClass ANN_JPA_CONTROLLER = eINSTANCE.getAnnJPAController();

		/**
		 * The meta object literal for the '<em><b>Annotates JPA Controller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANN_JPA_CONTROLLER__ANNOTATES_JPA_CONTROLLER = eINSTANCE.getAnnJPAController_AnnotatesJPAController();

		/**
		 * The meta object literal for the '{@link AuthorizationLayerPSM.impl.AnnHTTPActivityHandlerImpl <em>Ann HTTP Activity Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerPSM.impl.AnnHTTPActivityHandlerImpl
		 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAnnHTTPActivityHandler()
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
		 * The meta object literal for the '{@link AuthorizationLayerPSM.impl.AnnJavaResourceModelImpl <em>Ann Java Resource Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerPSM.impl.AnnJavaResourceModelImpl
		 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAnnJavaResourceModel()
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
		 * The meta object literal for the '{@link AuthorizationLayerPSM.impl.AnnJavaResourceModelManagerImpl <em>Ann Java Resource Model Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerPSM.impl.AnnJavaResourceModelManagerImpl
		 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAnnJavaResourceModelManager()
		 * @generated
		 */
		EClass ANN_JAVA_RESOURCE_MODEL_MANAGER = eINSTANCE.getAnnJavaResourceModelManager();

		/**
		 * The meta object literal for the '<em><b>Annotates Java Resource Model Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANN_JAVA_RESOURCE_MODEL_MANAGER__ANNOTATES_JAVA_RESOURCE_MODEL_MANAGER = eINSTANCE.getAnnJavaResourceModelManager_AnnotatesJavaResourceModelManager();

		/**
		 * The meta object literal for the '{@link AuthorizationLayerPSM.impl.AnnJavaAlgoResourceModelImpl <em>Ann Java Algo Resource Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerPSM.impl.AnnJavaAlgoResourceModelImpl
		 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAnnJavaAlgoResourceModel()
		 * @generated
		 */
		EClass ANN_JAVA_ALGO_RESOURCE_MODEL = eINSTANCE.getAnnJavaAlgoResourceModel();

		/**
		 * The meta object literal for the '<em><b>Annotates Java Lago Resource Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANN_JAVA_ALGO_RESOURCE_MODEL__ANNOTATES_JAVA_LAGO_RESOURCE_MODEL = eINSTANCE.getAnnJavaAlgoResourceModel_AnnotatesJavaLagoResourceModel();

		/**
		 * The meta object literal for the '{@link AuthorizationLayerPSM.impl.AuthorizationSubjectImpl <em>Authorization Subject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerPSM.impl.AuthorizationSubjectImpl
		 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAuthorizationSubject()
		 * @generated
		 */
		EClass AUTHORIZATION_SUBJECT = eINSTANCE.getAuthorizationSubject();

		/**
		 * The meta object literal for the '<em><b>Is Authorization Subject</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHORIZATION_SUBJECT__IS_AUTHORIZATION_SUBJECT = eINSTANCE.getAuthorizationSubject_IsAuthorizationSubject();

		/**
		 * The meta object literal for the '{@link AuthorizationLayerPSM.impl.AuthorizableResourceImpl <em>Authorizable Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerPSM.impl.AuthorizableResourceImpl
		 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAuthorizableResource()
		 * @generated
		 */
		EClass AUTHORIZABLE_RESOURCE = eINSTANCE.getAuthorizableResource();

		/**
		 * The meta object literal for the '<em><b>Is Authorizable Algo Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_ALGO_MODEL = eINSTANCE.getAuthorizableResource_IsAuthorizableAlgoModel();

		/**
		 * The meta object literal for the '<em><b>Is Authorizable Resource Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_RESOURCE_MODEL = eINSTANCE.getAuthorizableResource_IsAuthorizableResourceModel();

		/**
		 * The meta object literal for the '<em><b>Is Authorizable Model Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_MODEL_MANAGER = eINSTANCE.getAuthorizableResource_IsAuthorizableModelManager();

		/**
		 * The meta object literal for the '<em><b>Has Authorization Performer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHORIZABLE_RESOURCE__HAS_AUTHORIZATION_PERFORMER = eINSTANCE.getAuthorizableResource_HasAuthorizationPerformer();

		/**
		 * The meta object literal for the '<em><b>Has Resource Access Policy Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHORIZABLE_RESOURCE__HAS_RESOURCE_ACCESS_POLICY_SET = eINSTANCE.getAuthorizableResource_HasResourceAccessPolicySet();

		/**
		 * The meta object literal for the '<em><b>BTrack Ownership</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORIZABLE_RESOURCE__BTRACK_OWNERSHIP = eINSTANCE.getAuthorizableResource_BTrackOwnership();

		/**
		 * The meta object literal for the '{@link AuthorizationLayerPSM.impl.AuthorizationPerformerImpl <em>Authorization Performer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerPSM.impl.AuthorizationPerformerImpl
		 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAuthorizationPerformer()
		 * @generated
		 */
		EClass AUTHORIZATION_PERFORMER = eINSTANCE.getAuthorizationPerformer();

		/**
		 * The meta object literal for the '<em><b>Uses Authorization Policy Evaluator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHORIZATION_PERFORMER__USES_AUTHORIZATION_POLICY_EVALUATOR = eINSTANCE.getAuthorizationPerformer_UsesAuthorizationPolicyEvaluator();

		/**
		 * The meta object literal for the '<em><b>Is Authorization Performer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHORIZATION_PERFORMER__IS_AUTHORIZATION_PERFORMER = eINSTANCE.getAuthorizationPerformer_IsAuthorizationPerformer();

		/**
		 * The meta object literal for the '{@link AuthorizationLayerPSM.impl.AuthorizationDataHandlerImpl <em>Authorization Data Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerPSM.impl.AuthorizationDataHandlerImpl
		 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAuthorizationDataHandler()
		 * @generated
		 */
		EClass AUTHORIZATION_DATA_HANDLER = eINSTANCE.getAuthorizationDataHandler();

		/**
		 * The meta object literal for the '<em><b>Is Authorization Data Handler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHORIZATION_DATA_HANDLER__IS_AUTHORIZATION_DATA_HANDLER = eINSTANCE.getAuthorizationDataHandler_IsAuthorizationDataHandler();

		/**
		 * The meta object literal for the '{@link AuthorizationLayerPSM.impl.AuthorizationPolicyEvaluatorImpl <em>Authorization Policy Evaluator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerPSM.impl.AuthorizationPolicyEvaluatorImpl
		 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAuthorizationPolicyEvaluator()
		 * @generated
		 */
		EClass AUTHORIZATION_POLICY_EVALUATOR = eINSTANCE.getAuthorizationPolicyEvaluator();

		/**
		 * The meta object literal for the '<em><b>Accesses</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHORIZATION_POLICY_EVALUATOR__ACCESSES = eINSTANCE.getAuthorizationPolicyEvaluator_Accesses();

		/**
		 * The meta object literal for the '{@link AuthorizationLayerPSM.impl.ResourceAccessPolicySetImpl <em>Resource Access Policy Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerPSM.impl.ResourceAccessPolicySetImpl
		 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getResourceAccessPolicySet()
		 * @generated
		 */
		EClass RESOURCE_ACCESS_POLICY_SET = eINSTANCE.getResourceAccessPolicySet();

		/**
		 * The meta object literal for the '<em><b>Has Resource Access Policy Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ACCESS_POLICY_SET__HAS_RESOURCE_ACCESS_POLICY_SET = eINSTANCE.getResourceAccessPolicySet_HasResourceAccessPolicySet();

		/**
		 * The meta object literal for the '<em><b>Policy Combining Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ACCESS_POLICY_SET__POLICY_COMBINING_ALGORITHM = eINSTANCE.getResourceAccessPolicySet_PolicyCombiningAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Has Resource Access Policy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ACCESS_POLICY_SET__HAS_RESOURCE_ACCESS_POLICY = eINSTANCE.getResourceAccessPolicySet_HasResourceAccessPolicy();

		/**
		 * The meta object literal for the '{@link AuthorizationLayerPSM.impl.ResourceAccessPolicyImpl <em>Resource Access Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerPSM.impl.ResourceAccessPolicyImpl
		 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getResourceAccessPolicy()
		 * @generated
		 */
		EClass RESOURCE_ACCESS_POLICY = eINSTANCE.getResourceAccessPolicy();

		/**
		 * The meta object literal for the '<em><b>Rule Combining Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ACCESS_POLICY__RULE_COMBINING_ALGORITHM = eINSTANCE.getResourceAccessPolicy_RuleCombiningAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Has Resource Access Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ACCESS_POLICY__HAS_RESOURCE_ACCESS_RULE = eINSTANCE.getResourceAccessPolicy_HasResourceAccessRule();

		/**
		 * The meta object literal for the '<em><b>Has Apply Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ACCESS_POLICY__HAS_APPLY_CONDITION = eINSTANCE.getResourceAccessPolicy_HasApplyCondition();

		/**
		 * The meta object literal for the '{@link AuthorizationLayerPSM.impl.ResourceAccessRuleImpl <em>Resource Access Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerPSM.impl.ResourceAccessRuleImpl
		 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getResourceAccessRule()
		 * @generated
		 */
		EClass RESOURCE_ACCESS_RULE = eINSTANCE.getResourceAccessRule();

		/**
		 * The meta object literal for the '<em><b>Rule Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ACCESS_RULE__RULE_TYPE = eINSTANCE.getResourceAccessRule_RuleType();

		/**
		 * The meta object literal for the '<em><b>Has Match Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ACCESS_RULE__HAS_MATCH_CONDITION = eINSTANCE.getResourceAccessRule_HasMatchCondition();

		/**
		 * The meta object literal for the '<em><b>Has Allowed Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ACCESS_RULE__HAS_ALLOWED_ACTION = eINSTANCE.getResourceAccessRule_HasAllowedAction();

		/**
		 * The meta object literal for the '{@link AuthorizationLayerPSM.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerPSM.impl.ConditionImpl
		 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__OPERATOR = eINSTANCE.getCondition_Operator();

		/**
		 * The meta object literal for the '<em><b>Has Left Side Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__HAS_LEFT_SIDE_OPERAND = eINSTANCE.getCondition_HasLeftSideOperand();

		/**
		 * The meta object literal for the '<em><b>Has Right Side Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__HAS_RIGHT_SIDE_OPERAND = eINSTANCE.getCondition_HasRightSideOperand();

		/**
		 * The meta object literal for the '{@link AuthorizationLayerPSM.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerPSM.impl.AttributeImpl
		 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Attribute Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__ATTRIBUTE_CATEGORY = eINSTANCE.getAttribute_AttributeCategory();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

		/**
		 * The meta object literal for the '<em><b>Is Attribute Existing Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__IS_ATTRIBUTE_EXISTING_PROPERTY = eINSTANCE.getAttribute_IsAttributeExistingProperty();

		/**
		 * The meta object literal for the '<em><b>Is Attribute New Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__IS_ATTRIBUTE_NEW_PROPERTY = eINSTANCE.getAttribute_IsAttributeNewProperty();

		/**
		 * The meta object literal for the '{@link AuthorizationLayerPSM.impl.AllowedActionImpl <em>Allowed Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerPSM.impl.AllowedActionImpl
		 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAllowedAction()
		 * @generated
		 */
		EClass ALLOWED_ACTION = eINSTANCE.getAllowedAction();

		/**
		 * The meta object literal for the '<em><b>Is Allowed Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOWED_ACTION__IS_ALLOWED_ACTION = eINSTANCE.getAllowedAction_IsAllowedAction();

		/**
		 * The meta object literal for the '{@link AuthorizationLayerPSM.impl.NewPropertyImpl <em>New Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerPSM.impl.NewPropertyImpl
		 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getNewProperty()
		 * @generated
		 */
		EClass NEW_PROPERTY = eINSTANCE.getNewProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEW_PROPERTY__NAME = eINSTANCE.getNewProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEW_PROPERTY__TYPE = eINSTANCE.getNewProperty_Type();

		/**
		 * The meta object literal for the '<em><b>BIs Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NEW_PROPERTY__BIS_UNIQUE = eINSTANCE.getNewProperty_BIsUnique();

		/**
		 * The meta object literal for the '<em><b>Belongs To Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_PROPERTY__BELONGS_TO_RESOURCE = eINSTANCE.getNewProperty_BelongsToResource();

		/**
		 * The meta object literal for the '{@link AuthorizationLayerPSM.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerPSM.Operator
		 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getOperator()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '{@link AuthorizationLayerPSM.CombiningAlgorithm <em>Combining Algorithm</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerPSM.CombiningAlgorithm
		 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getCombiningAlgorithm()
		 * @generated
		 */
		EEnum COMBINING_ALGORITHM = eINSTANCE.getCombiningAlgorithm();

		/**
		 * The meta object literal for the '{@link AuthorizationLayerPSM.AttributeCategory <em>Attribute Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerPSM.AttributeCategory
		 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getAttributeCategory()
		 * @generated
		 */
		EEnum ATTRIBUTE_CATEGORY = eINSTANCE.getAttributeCategory();

		/**
		 * The meta object literal for the '{@link AuthorizationLayerPSM.RuleType <em>Rule Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerPSM.RuleType
		 * @see AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl#getRuleType()
		 * @generated
		 */
		EEnum RULE_TYPE = eINSTANCE.getRuleType();

	}

} //AuthorizationLayerPSMPackage
