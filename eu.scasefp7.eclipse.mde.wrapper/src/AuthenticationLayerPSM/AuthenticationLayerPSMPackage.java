/**
 */
package AuthenticationLayerPSM;

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
 * @see AuthenticationLayerPSM.AuthenticationLayerPSMFactory
 * @model kind="package"
 * @generated
 */
public interface AuthenticationLayerPSMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "AuthenticationLayerPSM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/eu.scasefp7.eclipse.mde.m2m/Metamodels/AuthenticationPSMMetamodel.ecore";

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
	AuthenticationLayerPSMPackage eINSTANCE = AuthenticationLayerPSM.impl.AuthenticationLayerPSMPackageImpl.init();

	/**
	 * The meta object id for the '{@link AuthenticationLayerPSM.impl.AnnotationModelImpl <em>Annotation Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthenticationLayerPSM.impl.AnnotationModelImpl
	 * @see AuthenticationLayerPSM.impl.AuthenticationLayerPSMPackageImpl#getAnnotationModel()
	 * @generated
	 */
	int ANNOTATION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Annotated Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MODEL__HAS_ANNOTATED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Has Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MODEL__HAS_ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Annotates RES Tful Service PSM</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MODEL__ANNOTATES_RES_TFUL_SERVICE_PSM = 3;

	/**
	 * The feature id for the '<em><b>Annotation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MODEL__ANNOTATION_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Annotation Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MODEL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Annotation Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AuthenticationLayerPSM.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthenticationLayerPSM.impl.AnnotationImpl
	 * @see AuthenticationLayerPSM.impl.AuthenticationLayerPSMPackageImpl#getAnnotation()
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
	 * The meta object id for the '{@link AuthenticationLayerPSM.impl.AnnotatedElementImpl <em>Annotated Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthenticationLayerPSM.impl.AnnotatedElementImpl
	 * @see AuthenticationLayerPSM.impl.AuthenticationLayerPSMPackageImpl#getAnnotatedElement()
	 * @generated
	 */
	int ANNOTATED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Annotated Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Annotated Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AuthenticationLayerPSM.impl.AuthenticationModeImpl <em>Authentication Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthenticationLayerPSM.impl.AuthenticationModeImpl
	 * @see AuthenticationLayerPSM.impl.AuthenticationLayerPSMPackageImpl#getAuthenticationMode()
	 * @generated
	 */
	int AUTHENTICATION_MODE = 3;

	/**
	 * The feature id for the '<em><b>HTTP Activity Handler Has Authentication Mode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_MODE__HTTP_ACTIVITY_HANDLER_HAS_AUTHENTICATION_MODE = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>HTTP Activity Has Authentication Mode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_MODE__HTTP_ACTIVITY_HAS_AUTHENTICATION_MODE = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Authentication Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_MODE_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Authentication Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_MODE_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AuthenticationLayerPSM.impl.AuthenticationPerformerImpl <em>Authentication Performer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthenticationLayerPSM.impl.AuthenticationPerformerImpl
	 * @see AuthenticationLayerPSM.impl.AuthenticationLayerPSMPackageImpl#getAuthenticationPerformer()
	 * @generated
	 */
	int AUTHENTICATION_PERFORMER = 4;

	/**
	 * The feature id for the '<em><b>Has Authentication Token</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_PERFORMER__HAS_AUTHENTICATION_TOKEN = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is System Authentication Performer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_PERFORMER__IS_SYSTEM_AUTHENTICATION_PERFORMER = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Authentication Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_PERFORMER__AUTHENTICATION_MODEL_NAME = ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Authentication Model Parent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_PERFORMER__AUTHENTICATION_MODEL_PARENT_NAME = ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Authentication Performer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_PERFORMER_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Authentication Performer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_PERFORMER_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AuthenticationLayerPSM.impl.AuthenticationTokenImpl <em>Authentication Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthenticationLayerPSM.impl.AuthenticationTokenImpl
	 * @see AuthenticationLayerPSM.impl.AuthenticationLayerPSMPackageImpl#getAuthenticationToken()
	 * @generated
	 */
	int AUTHENTICATION_TOKEN = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_TOKEN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_TOKEN__TYPE = 1;

	/**
	 * The feature id for the '<em><b>BIs Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_TOKEN__BIS_UNIQUE = 2;

	/**
	 * The number of structural features of the '<em>Authentication Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_TOKEN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Authentication Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_TOKEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AuthenticationLayerPSM.impl.PasswordImpl <em>Password</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthenticationLayerPSM.impl.PasswordImpl
	 * @see AuthenticationLayerPSM.impl.AuthenticationLayerPSMPackageImpl#getPassword()
	 * @generated
	 */
	int PASSWORD = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD__NAME = AUTHENTICATION_TOKEN__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD__TYPE = AUTHENTICATION_TOKEN__TYPE;

	/**
	 * The feature id for the '<em><b>BIs Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD__BIS_UNIQUE = AUTHENTICATION_TOKEN__BIS_UNIQUE;

	/**
	 * The number of structural features of the '<em>Password</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_FEATURE_COUNT = AUTHENTICATION_TOKEN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Password</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_OPERATION_COUNT = AUTHENTICATION_TOKEN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AuthenticationLayerPSM.impl.AnnHTTPActivityImpl <em>Ann HTTP Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthenticationLayerPSM.impl.AnnHTTPActivityImpl
	 * @see AuthenticationLayerPSM.impl.AuthenticationLayerPSMPackageImpl#getAnnHTTPActivity()
	 * @generated
	 */
	int ANN_HTTP_ACTIVITY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_HTTP_ACTIVITY__NAME = ANNOTATED_ELEMENT__NAME;

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
	 * The meta object id for the '{@link AuthenticationLayerPSM.impl.AnnHTTPActivityHandlerImpl <em>Ann HTTP Activity Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthenticationLayerPSM.impl.AnnHTTPActivityHandlerImpl
	 * @see AuthenticationLayerPSM.impl.AuthenticationLayerPSMPackageImpl#getAnnHTTPActivityHandler()
	 * @generated
	 */
	int ANN_HTTP_ACTIVITY_HANDLER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_HTTP_ACTIVITY_HANDLER__NAME = ANNOTATED_ELEMENT__NAME;

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
	 * The meta object id for the '{@link AuthenticationLayerPSM.impl.AnnJPAControllerImpl <em>Ann JPA Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthenticationLayerPSM.impl.AnnJPAControllerImpl
	 * @see AuthenticationLayerPSM.impl.AuthenticationLayerPSMPackageImpl#getAnnJPAController()
	 * @generated
	 */
	int ANN_JPA_CONTROLLER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_JPA_CONTROLLER__NAME = ANNOTATED_ELEMENT__NAME;

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
	 * The meta object id for the '{@link AuthenticationLayerPSM.impl.GuestModeImpl <em>Guest Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthenticationLayerPSM.impl.GuestModeImpl
	 * @see AuthenticationLayerPSM.impl.AuthenticationLayerPSMPackageImpl#getGuestMode()
	 * @generated
	 */
	int GUEST_MODE = 10;

	/**
	 * The feature id for the '<em><b>HTTP Activity Handler Has Authentication Mode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_MODE__HTTP_ACTIVITY_HANDLER_HAS_AUTHENTICATION_MODE = AUTHENTICATION_MODE__HTTP_ACTIVITY_HANDLER_HAS_AUTHENTICATION_MODE;

	/**
	 * The feature id for the '<em><b>HTTP Activity Has Authentication Mode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_MODE__HTTP_ACTIVITY_HAS_AUTHENTICATION_MODE = AUTHENTICATION_MODE__HTTP_ACTIVITY_HAS_AUTHENTICATION_MODE;

	/**
	 * The number of structural features of the '<em>Guest Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_MODE_FEATURE_COUNT = AUTHENTICATION_MODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Guest Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_MODE_OPERATION_COUNT = AUTHENTICATION_MODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AuthenticationLayerPSM.impl.AuthenticationOnlyModeImpl <em>Authentication Only Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthenticationLayerPSM.impl.AuthenticationOnlyModeImpl
	 * @see AuthenticationLayerPSM.impl.AuthenticationLayerPSMPackageImpl#getAuthenticationOnlyMode()
	 * @generated
	 */
	int AUTHENTICATION_ONLY_MODE = 11;

	/**
	 * The feature id for the '<em><b>HTTP Activity Handler Has Authentication Mode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ONLY_MODE__HTTP_ACTIVITY_HANDLER_HAS_AUTHENTICATION_MODE = AUTHENTICATION_MODE__HTTP_ACTIVITY_HANDLER_HAS_AUTHENTICATION_MODE;

	/**
	 * The feature id for the '<em><b>HTTP Activity Has Authentication Mode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ONLY_MODE__HTTP_ACTIVITY_HAS_AUTHENTICATION_MODE = AUTHENTICATION_MODE__HTTP_ACTIVITY_HAS_AUTHENTICATION_MODE;

	/**
	 * The number of structural features of the '<em>Authentication Only Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ONLY_MODE_FEATURE_COUNT = AUTHENTICATION_MODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Authentication Only Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ONLY_MODE_OPERATION_COUNT = AUTHENTICATION_MODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AuthenticationLayerPSM.impl.BothModeImpl <em>Both Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthenticationLayerPSM.impl.BothModeImpl
	 * @see AuthenticationLayerPSM.impl.AuthenticationLayerPSMPackageImpl#getBothMode()
	 * @generated
	 */
	int BOTH_MODE = 12;

	/**
	 * The feature id for the '<em><b>HTTP Activity Handler Has Authentication Mode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTH_MODE__HTTP_ACTIVITY_HANDLER_HAS_AUTHENTICATION_MODE = AUTHENTICATION_MODE__HTTP_ACTIVITY_HANDLER_HAS_AUTHENTICATION_MODE;

	/**
	 * The feature id for the '<em><b>HTTP Activity Has Authentication Mode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTH_MODE__HTTP_ACTIVITY_HAS_AUTHENTICATION_MODE = AUTHENTICATION_MODE__HTTP_ACTIVITY_HAS_AUTHENTICATION_MODE;

	/**
	 * The number of structural features of the '<em>Both Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTH_MODE_FEATURE_COUNT = AUTHENTICATION_MODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Both Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTH_MODE_OPERATION_COUNT = AUTHENTICATION_MODE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link AuthenticationLayerPSM.AnnotationModel <em>Annotation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Model</em>'.
	 * @see AuthenticationLayerPSM.AnnotationModel
	 * @generated
	 */
	EClass getAnnotationModel();

	/**
	 * Returns the meta object for the attribute '{@link AuthenticationLayerPSM.AnnotationModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AuthenticationLayerPSM.AnnotationModel#getName()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EAttribute getAnnotationModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link AuthenticationLayerPSM.AnnotationModel#getHasAnnotatedElement <em>Has Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Annotated Element</em>'.
	 * @see AuthenticationLayerPSM.AnnotationModel#getHasAnnotatedElement()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EReference getAnnotationModel_HasAnnotatedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link AuthenticationLayerPSM.AnnotationModel#getHasAnnotation <em>Has Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Annotation</em>'.
	 * @see AuthenticationLayerPSM.AnnotationModel#getHasAnnotation()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EReference getAnnotationModel_HasAnnotation();

	/**
	 * Returns the meta object for the reference '{@link AuthenticationLayerPSM.AnnotationModel#getAnnotatesRESTfulServicePSM <em>Annotates RES Tful Service PSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotates RES Tful Service PSM</em>'.
	 * @see AuthenticationLayerPSM.AnnotationModel#getAnnotatesRESTfulServicePSM()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EReference getAnnotationModel_AnnotatesRESTfulServicePSM();

	/**
	 * Returns the meta object for the attribute '{@link AuthenticationLayerPSM.AnnotationModel#getAnnotationType <em>Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotation Type</em>'.
	 * @see AuthenticationLayerPSM.AnnotationModel#getAnnotationType()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EAttribute getAnnotationModel_AnnotationType();

	/**
	 * Returns the meta object for class '{@link AuthenticationLayerPSM.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see AuthenticationLayerPSM.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for class '{@link AuthenticationLayerPSM.AnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated Element</em>'.
	 * @see AuthenticationLayerPSM.AnnotatedElement
	 * @generated
	 */
	EClass getAnnotatedElement();

	/**
	 * Returns the meta object for the attribute '{@link AuthenticationLayerPSM.AnnotatedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AuthenticationLayerPSM.AnnotatedElement#getName()
	 * @see #getAnnotatedElement()
	 * @generated
	 */
	EAttribute getAnnotatedElement_Name();

	/**
	 * Returns the meta object for class '{@link AuthenticationLayerPSM.AuthenticationMode <em>Authentication Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication Mode</em>'.
	 * @see AuthenticationLayerPSM.AuthenticationMode
	 * @generated
	 */
	EClass getAuthenticationMode();

	/**
	 * Returns the meta object for the reference list '{@link AuthenticationLayerPSM.AuthenticationMode#getHTTPActivityHandlerHasAuthenticationMode <em>HTTP Activity Handler Has Authentication Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>HTTP Activity Handler Has Authentication Mode</em>'.
	 * @see AuthenticationLayerPSM.AuthenticationMode#getHTTPActivityHandlerHasAuthenticationMode()
	 * @see #getAuthenticationMode()
	 * @generated
	 */
	EReference getAuthenticationMode_HTTPActivityHandlerHasAuthenticationMode();

	/**
	 * Returns the meta object for the reference list '{@link AuthenticationLayerPSM.AuthenticationMode#getHTTPActivityHasAuthenticationMode <em>HTTP Activity Has Authentication Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>HTTP Activity Has Authentication Mode</em>'.
	 * @see AuthenticationLayerPSM.AuthenticationMode#getHTTPActivityHasAuthenticationMode()
	 * @see #getAuthenticationMode()
	 * @generated
	 */
	EReference getAuthenticationMode_HTTPActivityHasAuthenticationMode();

	/**
	 * Returns the meta object for class '{@link AuthenticationLayerPSM.AuthenticationPerformer <em>Authentication Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication Performer</em>'.
	 * @see AuthenticationLayerPSM.AuthenticationPerformer
	 * @generated
	 */
	EClass getAuthenticationPerformer();

	/**
	 * Returns the meta object for the containment reference list '{@link AuthenticationLayerPSM.AuthenticationPerformer#getHasAuthenticationToken <em>Has Authentication Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Authentication Token</em>'.
	 * @see AuthenticationLayerPSM.AuthenticationPerformer#getHasAuthenticationToken()
	 * @see #getAuthenticationPerformer()
	 * @generated
	 */
	EReference getAuthenticationPerformer_HasAuthenticationToken();

	/**
	 * Returns the meta object for the reference '{@link AuthenticationLayerPSM.AuthenticationPerformer#getIsSystemAuthenticationPerformer <em>Is System Authentication Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is System Authentication Performer</em>'.
	 * @see AuthenticationLayerPSM.AuthenticationPerformer#getIsSystemAuthenticationPerformer()
	 * @see #getAuthenticationPerformer()
	 * @generated
	 */
	EReference getAuthenticationPerformer_IsSystemAuthenticationPerformer();

	/**
	 * Returns the meta object for the attribute '{@link AuthenticationLayerPSM.AuthenticationPerformer#getAuthenticationModelName <em>Authentication Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authentication Model Name</em>'.
	 * @see AuthenticationLayerPSM.AuthenticationPerformer#getAuthenticationModelName()
	 * @see #getAuthenticationPerformer()
	 * @generated
	 */
	EAttribute getAuthenticationPerformer_AuthenticationModelName();

	/**
	 * Returns the meta object for the attribute '{@link AuthenticationLayerPSM.AuthenticationPerformer#getAuthenticationModelParentName <em>Authentication Model Parent Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authentication Model Parent Name</em>'.
	 * @see AuthenticationLayerPSM.AuthenticationPerformer#getAuthenticationModelParentName()
	 * @see #getAuthenticationPerformer()
	 * @generated
	 */
	EAttribute getAuthenticationPerformer_AuthenticationModelParentName();

	/**
	 * Returns the meta object for class '{@link AuthenticationLayerPSM.AuthenticationToken <em>Authentication Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication Token</em>'.
	 * @see AuthenticationLayerPSM.AuthenticationToken
	 * @generated
	 */
	EClass getAuthenticationToken();

	/**
	 * Returns the meta object for the attribute '{@link AuthenticationLayerPSM.AuthenticationToken#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AuthenticationLayerPSM.AuthenticationToken#getName()
	 * @see #getAuthenticationToken()
	 * @generated
	 */
	EAttribute getAuthenticationToken_Name();

	/**
	 * Returns the meta object for the attribute '{@link AuthenticationLayerPSM.AuthenticationToken#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see AuthenticationLayerPSM.AuthenticationToken#getType()
	 * @see #getAuthenticationToken()
	 * @generated
	 */
	EAttribute getAuthenticationToken_Type();

	/**
	 * Returns the meta object for the attribute '{@link AuthenticationLayerPSM.AuthenticationToken#isBIsUnique <em>BIs Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BIs Unique</em>'.
	 * @see AuthenticationLayerPSM.AuthenticationToken#isBIsUnique()
	 * @see #getAuthenticationToken()
	 * @generated
	 */
	EAttribute getAuthenticationToken_BIsUnique();

	/**
	 * Returns the meta object for class '{@link AuthenticationLayerPSM.Password <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Password</em>'.
	 * @see AuthenticationLayerPSM.Password
	 * @generated
	 */
	EClass getPassword();

	/**
	 * Returns the meta object for class '{@link AuthenticationLayerPSM.AnnHTTPActivity <em>Ann HTTP Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ann HTTP Activity</em>'.
	 * @see AuthenticationLayerPSM.AnnHTTPActivity
	 * @generated
	 */
	EClass getAnnHTTPActivity();

	/**
	 * Returns the meta object for the reference '{@link AuthenticationLayerPSM.AnnHTTPActivity#getAnnotatesHTTPActivity <em>Annotates HTTP Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotates HTTP Activity</em>'.
	 * @see AuthenticationLayerPSM.AnnHTTPActivity#getAnnotatesHTTPActivity()
	 * @see #getAnnHTTPActivity()
	 * @generated
	 */
	EReference getAnnHTTPActivity_AnnotatesHTTPActivity();

	/**
	 * Returns the meta object for class '{@link AuthenticationLayerPSM.AnnHTTPActivityHandler <em>Ann HTTP Activity Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ann HTTP Activity Handler</em>'.
	 * @see AuthenticationLayerPSM.AnnHTTPActivityHandler
	 * @generated
	 */
	EClass getAnnHTTPActivityHandler();

	/**
	 * Returns the meta object for the reference '{@link AuthenticationLayerPSM.AnnHTTPActivityHandler#getAnnotatesHTTPActivityHandler <em>Annotates HTTP Activity Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotates HTTP Activity Handler</em>'.
	 * @see AuthenticationLayerPSM.AnnHTTPActivityHandler#getAnnotatesHTTPActivityHandler()
	 * @see #getAnnHTTPActivityHandler()
	 * @generated
	 */
	EReference getAnnHTTPActivityHandler_AnnotatesHTTPActivityHandler();

	/**
	 * Returns the meta object for class '{@link AuthenticationLayerPSM.AnnJPAController <em>Ann JPA Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ann JPA Controller</em>'.
	 * @see AuthenticationLayerPSM.AnnJPAController
	 * @generated
	 */
	EClass getAnnJPAController();

	/**
	 * Returns the meta object for the reference '{@link AuthenticationLayerPSM.AnnJPAController#getAnnotatesJPAController <em>Annotates JPA Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotates JPA Controller</em>'.
	 * @see AuthenticationLayerPSM.AnnJPAController#getAnnotatesJPAController()
	 * @see #getAnnJPAController()
	 * @generated
	 */
	EReference getAnnJPAController_AnnotatesJPAController();

	/**
	 * Returns the meta object for class '{@link AuthenticationLayerPSM.GuestMode <em>Guest Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guest Mode</em>'.
	 * @see AuthenticationLayerPSM.GuestMode
	 * @generated
	 */
	EClass getGuestMode();

	/**
	 * Returns the meta object for class '{@link AuthenticationLayerPSM.AuthenticationOnlyMode <em>Authentication Only Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication Only Mode</em>'.
	 * @see AuthenticationLayerPSM.AuthenticationOnlyMode
	 * @generated
	 */
	EClass getAuthenticationOnlyMode();

	/**
	 * Returns the meta object for class '{@link AuthenticationLayerPSM.BothMode <em>Both Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Both Mode</em>'.
	 * @see AuthenticationLayerPSM.BothMode
	 * @generated
	 */
	EClass getBothMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AuthenticationLayerPSMFactory getAuthenticationLayerPSMFactory();

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
		 * The meta object literal for the '{@link AuthenticationLayerPSM.impl.AnnotationModelImpl <em>Annotation Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthenticationLayerPSM.impl.AnnotationModelImpl
		 * @see AuthenticationLayerPSM.impl.AuthenticationLayerPSMPackageImpl#getAnnotationModel()
		 * @generated
		 */
		EClass ANNOTATION_MODEL = eINSTANCE.getAnnotationModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_MODEL__NAME = eINSTANCE.getAnnotationModel_Name();

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
		 * The meta object literal for the '<em><b>Annotates RES Tful Service PSM</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_MODEL__ANNOTATES_RES_TFUL_SERVICE_PSM = eINSTANCE.getAnnotationModel_AnnotatesRESTfulServicePSM();

		/**
		 * The meta object literal for the '<em><b>Annotation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_MODEL__ANNOTATION_TYPE = eINSTANCE.getAnnotationModel_AnnotationType();

		/**
		 * The meta object literal for the '{@link AuthenticationLayerPSM.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthenticationLayerPSM.impl.AnnotationImpl
		 * @see AuthenticationLayerPSM.impl.AuthenticationLayerPSMPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '{@link AuthenticationLayerPSM.impl.AnnotatedElementImpl <em>Annotated Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthenticationLayerPSM.impl.AnnotatedElementImpl
		 * @see AuthenticationLayerPSM.impl.AuthenticationLayerPSMPackageImpl#getAnnotatedElement()
		 * @generated
		 */
		EClass ANNOTATED_ELEMENT = eINSTANCE.getAnnotatedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATED_ELEMENT__NAME = eINSTANCE.getAnnotatedElement_Name();

		/**
		 * The meta object literal for the '{@link AuthenticationLayerPSM.impl.AuthenticationModeImpl <em>Authentication Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthenticationLayerPSM.impl.AuthenticationModeImpl
		 * @see AuthenticationLayerPSM.impl.AuthenticationLayerPSMPackageImpl#getAuthenticationMode()
		 * @generated
		 */
		EClass AUTHENTICATION_MODE = eINSTANCE.getAuthenticationMode();

		/**
		 * The meta object literal for the '<em><b>HTTP Activity Handler Has Authentication Mode</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHENTICATION_MODE__HTTP_ACTIVITY_HANDLER_HAS_AUTHENTICATION_MODE = eINSTANCE.getAuthenticationMode_HTTPActivityHandlerHasAuthenticationMode();

		/**
		 * The meta object literal for the '<em><b>HTTP Activity Has Authentication Mode</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHENTICATION_MODE__HTTP_ACTIVITY_HAS_AUTHENTICATION_MODE = eINSTANCE.getAuthenticationMode_HTTPActivityHasAuthenticationMode();

		/**
		 * The meta object literal for the '{@link AuthenticationLayerPSM.impl.AuthenticationPerformerImpl <em>Authentication Performer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthenticationLayerPSM.impl.AuthenticationPerformerImpl
		 * @see AuthenticationLayerPSM.impl.AuthenticationLayerPSMPackageImpl#getAuthenticationPerformer()
		 * @generated
		 */
		EClass AUTHENTICATION_PERFORMER = eINSTANCE.getAuthenticationPerformer();

		/**
		 * The meta object literal for the '<em><b>Has Authentication Token</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHENTICATION_PERFORMER__HAS_AUTHENTICATION_TOKEN = eINSTANCE.getAuthenticationPerformer_HasAuthenticationToken();

		/**
		 * The meta object literal for the '<em><b>Is System Authentication Performer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHENTICATION_PERFORMER__IS_SYSTEM_AUTHENTICATION_PERFORMER = eINSTANCE.getAuthenticationPerformer_IsSystemAuthenticationPerformer();

		/**
		 * The meta object literal for the '<em><b>Authentication Model Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_PERFORMER__AUTHENTICATION_MODEL_NAME = eINSTANCE.getAuthenticationPerformer_AuthenticationModelName();

		/**
		 * The meta object literal for the '<em><b>Authentication Model Parent Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_PERFORMER__AUTHENTICATION_MODEL_PARENT_NAME = eINSTANCE.getAuthenticationPerformer_AuthenticationModelParentName();

		/**
		 * The meta object literal for the '{@link AuthenticationLayerPSM.impl.AuthenticationTokenImpl <em>Authentication Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthenticationLayerPSM.impl.AuthenticationTokenImpl
		 * @see AuthenticationLayerPSM.impl.AuthenticationLayerPSMPackageImpl#getAuthenticationToken()
		 * @generated
		 */
		EClass AUTHENTICATION_TOKEN = eINSTANCE.getAuthenticationToken();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_TOKEN__NAME = eINSTANCE.getAuthenticationToken_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_TOKEN__TYPE = eINSTANCE.getAuthenticationToken_Type();

		/**
		 * The meta object literal for the '<em><b>BIs Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHENTICATION_TOKEN__BIS_UNIQUE = eINSTANCE.getAuthenticationToken_BIsUnique();

		/**
		 * The meta object literal for the '{@link AuthenticationLayerPSM.impl.PasswordImpl <em>Password</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthenticationLayerPSM.impl.PasswordImpl
		 * @see AuthenticationLayerPSM.impl.AuthenticationLayerPSMPackageImpl#getPassword()
		 * @generated
		 */
		EClass PASSWORD = eINSTANCE.getPassword();

		/**
		 * The meta object literal for the '{@link AuthenticationLayerPSM.impl.AnnHTTPActivityImpl <em>Ann HTTP Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthenticationLayerPSM.impl.AnnHTTPActivityImpl
		 * @see AuthenticationLayerPSM.impl.AuthenticationLayerPSMPackageImpl#getAnnHTTPActivity()
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
		 * The meta object literal for the '{@link AuthenticationLayerPSM.impl.AnnHTTPActivityHandlerImpl <em>Ann HTTP Activity Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthenticationLayerPSM.impl.AnnHTTPActivityHandlerImpl
		 * @see AuthenticationLayerPSM.impl.AuthenticationLayerPSMPackageImpl#getAnnHTTPActivityHandler()
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
		 * The meta object literal for the '{@link AuthenticationLayerPSM.impl.AnnJPAControllerImpl <em>Ann JPA Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthenticationLayerPSM.impl.AnnJPAControllerImpl
		 * @see AuthenticationLayerPSM.impl.AuthenticationLayerPSMPackageImpl#getAnnJPAController()
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
		 * The meta object literal for the '{@link AuthenticationLayerPSM.impl.GuestModeImpl <em>Guest Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthenticationLayerPSM.impl.GuestModeImpl
		 * @see AuthenticationLayerPSM.impl.AuthenticationLayerPSMPackageImpl#getGuestMode()
		 * @generated
		 */
		EClass GUEST_MODE = eINSTANCE.getGuestMode();

		/**
		 * The meta object literal for the '{@link AuthenticationLayerPSM.impl.AuthenticationOnlyModeImpl <em>Authentication Only Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthenticationLayerPSM.impl.AuthenticationOnlyModeImpl
		 * @see AuthenticationLayerPSM.impl.AuthenticationLayerPSMPackageImpl#getAuthenticationOnlyMode()
		 * @generated
		 */
		EClass AUTHENTICATION_ONLY_MODE = eINSTANCE.getAuthenticationOnlyMode();

		/**
		 * The meta object literal for the '{@link AuthenticationLayerPSM.impl.BothModeImpl <em>Both Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthenticationLayerPSM.impl.BothModeImpl
		 * @see AuthenticationLayerPSM.impl.AuthenticationLayerPSMPackageImpl#getBothMode()
		 * @generated
		 */
		EClass BOTH_MODE = eINSTANCE.getBothMode();

	}

} //AuthenticationLayerPSMPackage
