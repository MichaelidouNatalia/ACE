/**
 */
package SearchLayerPSM;

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
 * @see SearchLayerPSM.SearchLayerPSMFactory
 * @model kind="package"
 * @generated
 */
public interface SearchLayerPSMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SearchLayerPSM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/eu.scasefp7.eclipse.mde.m2m/Metamodels/SearchLayerPSMMetamodel.ecore";

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
	SearchLayerPSMPackage eINSTANCE = SearchLayerPSM.impl.SearchLayerPSMPackageImpl.init();

	/**
	 * The meta object id for the '{@link SearchLayerPSM.impl.AnnotationModelImpl <em>Annotation Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SearchLayerPSM.impl.AnnotationModelImpl
	 * @see SearchLayerPSM.impl.SearchLayerPSMPackageImpl#getAnnotationModel()
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
	 * The feature id for the '<em><b>Annotates RES Tful Service PSM</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MODEL__ANNOTATES_RES_TFUL_SERVICE_PSM = 3;

	/**
	 * The number of structural features of the '<em>Annotation Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Annotation Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SearchLayerPSM.impl.AnnotatedElementImpl <em>Annotated Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SearchLayerPSM.impl.AnnotatedElementImpl
	 * @see SearchLayerPSM.impl.SearchLayerPSMPackageImpl#getAnnotatedElement()
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
	 * The meta object id for the '{@link SearchLayerPSM.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SearchLayerPSM.impl.AnnotationImpl
	 * @see SearchLayerPSM.impl.SearchLayerPSMPackageImpl#getAnnotation()
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
	 * The meta object id for the '{@link SearchLayerPSM.impl.AnnPSMComponentPropertyImpl <em>Ann PSM Component Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SearchLayerPSM.impl.AnnPSMComponentPropertyImpl
	 * @see SearchLayerPSM.impl.SearchLayerPSMPackageImpl#getAnnPSMComponentProperty()
	 * @generated
	 */
	int ANN_PSM_COMPONENT_PROPERTY = 3;

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
	 * The meta object id for the '{@link SearchLayerPSM.impl.AnnJavaAlgoControllerImpl <em>Ann Java Algo Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SearchLayerPSM.impl.AnnJavaAlgoControllerImpl
	 * @see SearchLayerPSM.impl.SearchLayerPSMPackageImpl#getAnnJavaAlgoController()
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
	 * The meta object id for the '{@link SearchLayerPSM.impl.AnnHTTPActivityImpl <em>Ann HTTP Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SearchLayerPSM.impl.AnnHTTPActivityImpl
	 * @see SearchLayerPSM.impl.SearchLayerPSMPackageImpl#getAnnHTTPActivity()
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
	 * The meta object id for the '{@link SearchLayerPSM.impl.AnnHTTPActivityHandlerImpl <em>Ann HTTP Activity Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SearchLayerPSM.impl.AnnHTTPActivityHandlerImpl
	 * @see SearchLayerPSM.impl.SearchLayerPSMPackageImpl#getAnnHTTPActivityHandler()
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
	 * The meta object id for the '{@link SearchLayerPSM.impl.SearchControllerImpl <em>Search Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SearchLayerPSM.impl.SearchControllerImpl
	 * @see SearchLayerPSM.impl.SearchLayerPSMPackageImpl#getSearchController()
	 * @generated
	 */
	int SEARCH_CONTROLLER = 7;

	/**
	 * The feature id for the '<em><b>Is Search Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_CONTROLLER__IS_SEARCH_CONTROLLER = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Search Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_CONTROLLER_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Search Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_CONTROLLER_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SearchLayerPSM.impl.SearchHTTPActivityImpl <em>Search HTTP Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SearchLayerPSM.impl.SearchHTTPActivityImpl
	 * @see SearchLayerPSM.impl.SearchLayerPSMPackageImpl#getSearchHTTPActivity()
	 * @generated
	 */
	int SEARCH_HTTP_ACTIVITY = 8;

	/**
	 * The feature id for the '<em><b>Is Search HTTP Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_HTTP_ACTIVITY__IS_SEARCH_HTTP_ACTIVITY = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Search HTTP Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_HTTP_ACTIVITY_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Search HTTP Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_HTTP_ACTIVITY_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SearchLayerPSM.impl.SearchHTTPHandlerImpl <em>Search HTTP Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SearchLayerPSM.impl.SearchHTTPHandlerImpl
	 * @see SearchLayerPSM.impl.SearchLayerPSMPackageImpl#getSearchHTTPHandler()
	 * @generated
	 */
	int SEARCH_HTTP_HANDLER = 9;

	/**
	 * The feature id for the '<em><b>Is HTTP Activity Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_HTTP_HANDLER__IS_HTTP_ACTIVITY_HANDLER = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Searches Java Resource Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_HTTP_HANDLER__SEARCHES_JAVA_RESOURCE_MODEL = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Search HTTP Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_HTTP_HANDLER_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Search HTTP Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_HTTP_HANDLER_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SearchLayerPSM.impl.SearchablePropertyImpl <em>Searchable Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SearchLayerPSM.impl.SearchablePropertyImpl
	 * @see SearchLayerPSM.impl.SearchLayerPSMPackageImpl#getSearchableProperty()
	 * @generated
	 */
	int SEARCHABLE_PROPERTY = 10;

	/**
	 * The feature id for the '<em><b>Is Searchable Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCHABLE_PROPERTY__IS_SEARCHABLE_PROPERTY = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Searchable Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCHABLE_PROPERTY_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Searchable Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCHABLE_PROPERTY_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SearchLayerPSM.impl.SearchableJavaResourceModelImpl <em>Searchable Java Resource Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SearchLayerPSM.impl.SearchableJavaResourceModelImpl
	 * @see SearchLayerPSM.impl.SearchLayerPSMPackageImpl#getSearchableJavaResourceModel()
	 * @generated
	 */
	int SEARCHABLE_JAVA_RESOURCE_MODEL = 11;

	/**
	 * The feature id for the '<em><b>Has Searchable Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCHABLE_JAVA_RESOURCE_MODEL__HAS_SEARCHABLE_PROPERTY = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Searchable Java Resource Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCHABLE_JAVA_RESOURCE_MODEL__IS_SEARCHABLE_JAVA_RESOURCE_MODEL = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Searchable Java Resource Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCHABLE_JAVA_RESOURCE_MODEL_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Searchable Java Resource Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCHABLE_JAVA_RESOURCE_MODEL_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SearchLayerPSM.impl.AnnJavaResourceModelImpl <em>Ann Java Resource Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SearchLayerPSM.impl.AnnJavaResourceModelImpl
	 * @see SearchLayerPSM.impl.SearchLayerPSMPackageImpl#getAnnJavaResourceModel()
	 * @generated
	 */
	int ANN_JAVA_RESOURCE_MODEL = 12;

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
	 * Returns the meta object for class '{@link SearchLayerPSM.AnnotationModel <em>Annotation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Model</em>'.
	 * @see SearchLayerPSM.AnnotationModel
	 * @generated
	 */
	EClass getAnnotationModel();

	/**
	 * Returns the meta object for the containment reference list '{@link SearchLayerPSM.AnnotationModel#getHasAnnotatedElement <em>Has Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Annotated Element</em>'.
	 * @see SearchLayerPSM.AnnotationModel#getHasAnnotatedElement()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EReference getAnnotationModel_HasAnnotatedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link SearchLayerPSM.AnnotationModel#getHasAnnotation <em>Has Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Annotation</em>'.
	 * @see SearchLayerPSM.AnnotationModel#getHasAnnotation()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EReference getAnnotationModel_HasAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link SearchLayerPSM.AnnotationModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SearchLayerPSM.AnnotationModel#getName()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EAttribute getAnnotationModel_Name();

	/**
	 * Returns the meta object for the reference '{@link SearchLayerPSM.AnnotationModel#getAnnotatesRESTfulServicePSM <em>Annotates RES Tful Service PSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotates RES Tful Service PSM</em>'.
	 * @see SearchLayerPSM.AnnotationModel#getAnnotatesRESTfulServicePSM()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EReference getAnnotationModel_AnnotatesRESTfulServicePSM();

	/**
	 * Returns the meta object for class '{@link SearchLayerPSM.AnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated Element</em>'.
	 * @see SearchLayerPSM.AnnotatedElement
	 * @generated
	 */
	EClass getAnnotatedElement();

	/**
	 * Returns the meta object for class '{@link SearchLayerPSM.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see SearchLayerPSM.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for class '{@link SearchLayerPSM.AnnPSMComponentProperty <em>Ann PSM Component Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ann PSM Component Property</em>'.
	 * @see SearchLayerPSM.AnnPSMComponentProperty
	 * @generated
	 */
	EClass getAnnPSMComponentProperty();

	/**
	 * Returns the meta object for the reference '{@link SearchLayerPSM.AnnPSMComponentProperty#getAnnotatesPSMComponentProperty <em>Annotates PSM Component Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotates PSM Component Property</em>'.
	 * @see SearchLayerPSM.AnnPSMComponentProperty#getAnnotatesPSMComponentProperty()
	 * @see #getAnnPSMComponentProperty()
	 * @generated
	 */
	EReference getAnnPSMComponentProperty_AnnotatesPSMComponentProperty();

	/**
	 * Returns the meta object for class '{@link SearchLayerPSM.AnnJavaAlgoController <em>Ann Java Algo Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ann Java Algo Controller</em>'.
	 * @see SearchLayerPSM.AnnJavaAlgoController
	 * @generated
	 */
	EClass getAnnJavaAlgoController();

	/**
	 * Returns the meta object for the reference '{@link SearchLayerPSM.AnnJavaAlgoController#getAnnotatesJavaAlgoController <em>Annotates Java Algo Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotates Java Algo Controller</em>'.
	 * @see SearchLayerPSM.AnnJavaAlgoController#getAnnotatesJavaAlgoController()
	 * @see #getAnnJavaAlgoController()
	 * @generated
	 */
	EReference getAnnJavaAlgoController_AnnotatesJavaAlgoController();

	/**
	 * Returns the meta object for class '{@link SearchLayerPSM.AnnHTTPActivity <em>Ann HTTP Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ann HTTP Activity</em>'.
	 * @see SearchLayerPSM.AnnHTTPActivity
	 * @generated
	 */
	EClass getAnnHTTPActivity();

	/**
	 * Returns the meta object for the reference '{@link SearchLayerPSM.AnnHTTPActivity#getAnnotatesHTTPActivity <em>Annotates HTTP Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotates HTTP Activity</em>'.
	 * @see SearchLayerPSM.AnnHTTPActivity#getAnnotatesHTTPActivity()
	 * @see #getAnnHTTPActivity()
	 * @generated
	 */
	EReference getAnnHTTPActivity_AnnotatesHTTPActivity();

	/**
	 * Returns the meta object for class '{@link SearchLayerPSM.AnnHTTPActivityHandler <em>Ann HTTP Activity Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ann HTTP Activity Handler</em>'.
	 * @see SearchLayerPSM.AnnHTTPActivityHandler
	 * @generated
	 */
	EClass getAnnHTTPActivityHandler();

	/**
	 * Returns the meta object for the reference '{@link SearchLayerPSM.AnnHTTPActivityHandler#getAnnotatesHTTPActivityHandler <em>Annotates HTTP Activity Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotates HTTP Activity Handler</em>'.
	 * @see SearchLayerPSM.AnnHTTPActivityHandler#getAnnotatesHTTPActivityHandler()
	 * @see #getAnnHTTPActivityHandler()
	 * @generated
	 */
	EReference getAnnHTTPActivityHandler_AnnotatesHTTPActivityHandler();

	/**
	 * Returns the meta object for class '{@link SearchLayerPSM.SearchController <em>Search Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Controller</em>'.
	 * @see SearchLayerPSM.SearchController
	 * @generated
	 */
	EClass getSearchController();

	/**
	 * Returns the meta object for the reference '{@link SearchLayerPSM.SearchController#getIsSearchController <em>Is Search Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Search Controller</em>'.
	 * @see SearchLayerPSM.SearchController#getIsSearchController()
	 * @see #getSearchController()
	 * @generated
	 */
	EReference getSearchController_IsSearchController();

	/**
	 * Returns the meta object for class '{@link SearchLayerPSM.SearchHTTPActivity <em>Search HTTP Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search HTTP Activity</em>'.
	 * @see SearchLayerPSM.SearchHTTPActivity
	 * @generated
	 */
	EClass getSearchHTTPActivity();

	/**
	 * Returns the meta object for the reference '{@link SearchLayerPSM.SearchHTTPActivity#getIsSearchHTTPActivity <em>Is Search HTTP Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Search HTTP Activity</em>'.
	 * @see SearchLayerPSM.SearchHTTPActivity#getIsSearchHTTPActivity()
	 * @see #getSearchHTTPActivity()
	 * @generated
	 */
	EReference getSearchHTTPActivity_IsSearchHTTPActivity();

	/**
	 * Returns the meta object for class '{@link SearchLayerPSM.SearchHTTPHandler <em>Search HTTP Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search HTTP Handler</em>'.
	 * @see SearchLayerPSM.SearchHTTPHandler
	 * @generated
	 */
	EClass getSearchHTTPHandler();

	/**
	 * Returns the meta object for the reference '{@link SearchLayerPSM.SearchHTTPHandler#getIsHTTPActivityHandler <em>Is HTTP Activity Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is HTTP Activity Handler</em>'.
	 * @see SearchLayerPSM.SearchHTTPHandler#getIsHTTPActivityHandler()
	 * @see #getSearchHTTPHandler()
	 * @generated
	 */
	EReference getSearchHTTPHandler_IsHTTPActivityHandler();

	/**
	 * Returns the meta object for the containment reference list '{@link SearchLayerPSM.SearchHTTPHandler#getSearchesJavaResourceModel <em>Searches Java Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Searches Java Resource Model</em>'.
	 * @see SearchLayerPSM.SearchHTTPHandler#getSearchesJavaResourceModel()
	 * @see #getSearchHTTPHandler()
	 * @generated
	 */
	EReference getSearchHTTPHandler_SearchesJavaResourceModel();

	/**
	 * Returns the meta object for class '{@link SearchLayerPSM.SearchableProperty <em>Searchable Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Searchable Property</em>'.
	 * @see SearchLayerPSM.SearchableProperty
	 * @generated
	 */
	EClass getSearchableProperty();

	/**
	 * Returns the meta object for the reference '{@link SearchLayerPSM.SearchableProperty#getIsSearchableProperty <em>Is Searchable Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Searchable Property</em>'.
	 * @see SearchLayerPSM.SearchableProperty#getIsSearchableProperty()
	 * @see #getSearchableProperty()
	 * @generated
	 */
	EReference getSearchableProperty_IsSearchableProperty();

	/**
	 * Returns the meta object for class '{@link SearchLayerPSM.SearchableJavaResourceModel <em>Searchable Java Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Searchable Java Resource Model</em>'.
	 * @see SearchLayerPSM.SearchableJavaResourceModel
	 * @generated
	 */
	EClass getSearchableJavaResourceModel();

	/**
	 * Returns the meta object for the containment reference list '{@link SearchLayerPSM.SearchableJavaResourceModel#getHasSearchableProperty <em>Has Searchable Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Searchable Property</em>'.
	 * @see SearchLayerPSM.SearchableJavaResourceModel#getHasSearchableProperty()
	 * @see #getSearchableJavaResourceModel()
	 * @generated
	 */
	EReference getSearchableJavaResourceModel_HasSearchableProperty();

	/**
	 * Returns the meta object for the reference '{@link SearchLayerPSM.SearchableJavaResourceModel#getIsSearchableJavaResourceModel <em>Is Searchable Java Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Searchable Java Resource Model</em>'.
	 * @see SearchLayerPSM.SearchableJavaResourceModel#getIsSearchableJavaResourceModel()
	 * @see #getSearchableJavaResourceModel()
	 * @generated
	 */
	EReference getSearchableJavaResourceModel_IsSearchableJavaResourceModel();

	/**
	 * Returns the meta object for class '{@link SearchLayerPSM.AnnJavaResourceModel <em>Ann Java Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ann Java Resource Model</em>'.
	 * @see SearchLayerPSM.AnnJavaResourceModel
	 * @generated
	 */
	EClass getAnnJavaResourceModel();

	/**
	 * Returns the meta object for the reference '{@link SearchLayerPSM.AnnJavaResourceModel#getAnnotatesJavaResourceModel <em>Annotates Java Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotates Java Resource Model</em>'.
	 * @see SearchLayerPSM.AnnJavaResourceModel#getAnnotatesJavaResourceModel()
	 * @see #getAnnJavaResourceModel()
	 * @generated
	 */
	EReference getAnnJavaResourceModel_AnnotatesJavaResourceModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SearchLayerPSMFactory getSearchLayerPSMFactory();

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
		 * The meta object literal for the '{@link SearchLayerPSM.impl.AnnotationModelImpl <em>Annotation Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SearchLayerPSM.impl.AnnotationModelImpl
		 * @see SearchLayerPSM.impl.SearchLayerPSMPackageImpl#getAnnotationModel()
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
		 * The meta object literal for the '<em><b>Annotates RES Tful Service PSM</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_MODEL__ANNOTATES_RES_TFUL_SERVICE_PSM = eINSTANCE.getAnnotationModel_AnnotatesRESTfulServicePSM();

		/**
		 * The meta object literal for the '{@link SearchLayerPSM.impl.AnnotatedElementImpl <em>Annotated Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SearchLayerPSM.impl.AnnotatedElementImpl
		 * @see SearchLayerPSM.impl.SearchLayerPSMPackageImpl#getAnnotatedElement()
		 * @generated
		 */
		EClass ANNOTATED_ELEMENT = eINSTANCE.getAnnotatedElement();

		/**
		 * The meta object literal for the '{@link SearchLayerPSM.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SearchLayerPSM.impl.AnnotationImpl
		 * @see SearchLayerPSM.impl.SearchLayerPSMPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '{@link SearchLayerPSM.impl.AnnPSMComponentPropertyImpl <em>Ann PSM Component Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SearchLayerPSM.impl.AnnPSMComponentPropertyImpl
		 * @see SearchLayerPSM.impl.SearchLayerPSMPackageImpl#getAnnPSMComponentProperty()
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
		 * The meta object literal for the '{@link SearchLayerPSM.impl.AnnJavaAlgoControllerImpl <em>Ann Java Algo Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SearchLayerPSM.impl.AnnJavaAlgoControllerImpl
		 * @see SearchLayerPSM.impl.SearchLayerPSMPackageImpl#getAnnJavaAlgoController()
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
		 * The meta object literal for the '{@link SearchLayerPSM.impl.AnnHTTPActivityImpl <em>Ann HTTP Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SearchLayerPSM.impl.AnnHTTPActivityImpl
		 * @see SearchLayerPSM.impl.SearchLayerPSMPackageImpl#getAnnHTTPActivity()
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
		 * The meta object literal for the '{@link SearchLayerPSM.impl.AnnHTTPActivityHandlerImpl <em>Ann HTTP Activity Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SearchLayerPSM.impl.AnnHTTPActivityHandlerImpl
		 * @see SearchLayerPSM.impl.SearchLayerPSMPackageImpl#getAnnHTTPActivityHandler()
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
		 * The meta object literal for the '{@link SearchLayerPSM.impl.SearchControllerImpl <em>Search Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SearchLayerPSM.impl.SearchControllerImpl
		 * @see SearchLayerPSM.impl.SearchLayerPSMPackageImpl#getSearchController()
		 * @generated
		 */
		EClass SEARCH_CONTROLLER = eINSTANCE.getSearchController();

		/**
		 * The meta object literal for the '<em><b>Is Search Controller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH_CONTROLLER__IS_SEARCH_CONTROLLER = eINSTANCE.getSearchController_IsSearchController();

		/**
		 * The meta object literal for the '{@link SearchLayerPSM.impl.SearchHTTPActivityImpl <em>Search HTTP Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SearchLayerPSM.impl.SearchHTTPActivityImpl
		 * @see SearchLayerPSM.impl.SearchLayerPSMPackageImpl#getSearchHTTPActivity()
		 * @generated
		 */
		EClass SEARCH_HTTP_ACTIVITY = eINSTANCE.getSearchHTTPActivity();

		/**
		 * The meta object literal for the '<em><b>Is Search HTTP Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH_HTTP_ACTIVITY__IS_SEARCH_HTTP_ACTIVITY = eINSTANCE.getSearchHTTPActivity_IsSearchHTTPActivity();

		/**
		 * The meta object literal for the '{@link SearchLayerPSM.impl.SearchHTTPHandlerImpl <em>Search HTTP Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SearchLayerPSM.impl.SearchHTTPHandlerImpl
		 * @see SearchLayerPSM.impl.SearchLayerPSMPackageImpl#getSearchHTTPHandler()
		 * @generated
		 */
		EClass SEARCH_HTTP_HANDLER = eINSTANCE.getSearchHTTPHandler();

		/**
		 * The meta object literal for the '<em><b>Is HTTP Activity Handler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH_HTTP_HANDLER__IS_HTTP_ACTIVITY_HANDLER = eINSTANCE.getSearchHTTPHandler_IsHTTPActivityHandler();

		/**
		 * The meta object literal for the '<em><b>Searches Java Resource Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH_HTTP_HANDLER__SEARCHES_JAVA_RESOURCE_MODEL = eINSTANCE.getSearchHTTPHandler_SearchesJavaResourceModel();

		/**
		 * The meta object literal for the '{@link SearchLayerPSM.impl.SearchablePropertyImpl <em>Searchable Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SearchLayerPSM.impl.SearchablePropertyImpl
		 * @see SearchLayerPSM.impl.SearchLayerPSMPackageImpl#getSearchableProperty()
		 * @generated
		 */
		EClass SEARCHABLE_PROPERTY = eINSTANCE.getSearchableProperty();

		/**
		 * The meta object literal for the '<em><b>Is Searchable Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCHABLE_PROPERTY__IS_SEARCHABLE_PROPERTY = eINSTANCE.getSearchableProperty_IsSearchableProperty();

		/**
		 * The meta object literal for the '{@link SearchLayerPSM.impl.SearchableJavaResourceModelImpl <em>Searchable Java Resource Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SearchLayerPSM.impl.SearchableJavaResourceModelImpl
		 * @see SearchLayerPSM.impl.SearchLayerPSMPackageImpl#getSearchableJavaResourceModel()
		 * @generated
		 */
		EClass SEARCHABLE_JAVA_RESOURCE_MODEL = eINSTANCE.getSearchableJavaResourceModel();

		/**
		 * The meta object literal for the '<em><b>Has Searchable Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCHABLE_JAVA_RESOURCE_MODEL__HAS_SEARCHABLE_PROPERTY = eINSTANCE.getSearchableJavaResourceModel_HasSearchableProperty();

		/**
		 * The meta object literal for the '<em><b>Is Searchable Java Resource Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCHABLE_JAVA_RESOURCE_MODEL__IS_SEARCHABLE_JAVA_RESOURCE_MODEL = eINSTANCE.getSearchableJavaResourceModel_IsSearchableJavaResourceModel();

		/**
		 * The meta object literal for the '{@link SearchLayerPSM.impl.AnnJavaResourceModelImpl <em>Ann Java Resource Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SearchLayerPSM.impl.AnnJavaResourceModelImpl
		 * @see SearchLayerPSM.impl.SearchLayerPSMPackageImpl#getAnnJavaResourceModel()
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

	}

} //SearchLayerPSMPackage
