/**
 */
package AuthenticationLayerCIM;

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
 * @see AuthenticationLayerCIM.AuthenticationLayerCIMFactory
 * @model kind="package"
 * @generated
 */
public interface AuthenticationLayerCIMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "AuthenticationLayerCIM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/eu.scasefp7.eclipse.mde.m2m/Metamodels/AuthenticationCIMMetamodel.ecore";

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
	AuthenticationLayerCIMPackage eINSTANCE = AuthenticationLayerCIM.impl.AuthenticationLayerCIMPackageImpl.init();

	/**
	 * The meta object id for the '{@link AuthenticationLayerCIM.impl.AnnotationModelImpl <em>Annotation Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthenticationLayerCIM.impl.AnnotationModelImpl
	 * @see AuthenticationLayerCIM.impl.AuthenticationLayerCIMPackageImpl#getAnnotationModel()
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
	 * The meta object id for the '{@link AuthenticationLayerCIM.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthenticationLayerCIM.impl.AnnotationImpl
	 * @see AuthenticationLayerCIM.impl.AuthenticationLayerCIMPackageImpl#getAnnotation()
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
	 * The meta object id for the '{@link AuthenticationLayerCIM.impl.AnnotatedElementImpl <em>Annotated Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthenticationLayerCIM.impl.AnnotatedElementImpl
	 * @see AuthenticationLayerCIM.impl.AuthenticationLayerCIMPackageImpl#getAnnotatedElement()
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
	 * The meta object id for the '{@link AuthenticationLayerCIM.impl.AuthenticationModelImpl <em>Authentication Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthenticationLayerCIM.impl.AuthenticationModelImpl
	 * @see AuthenticationLayerCIM.impl.AuthenticationLayerCIMPackageImpl#getAuthenticationModel()
	 * @generated
	 */
	int AUTHENTICATION_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Has Authentication Token</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_MODEL__HAS_AUTHENTICATION_TOKEN = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Authentication Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_MODEL__RESOURCE_AUTHENTICATION_MODEL = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Authentication Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_MODEL_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Authentication Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_MODEL_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AuthenticationLayerCIM.impl.AuthenticationTokenImpl <em>Authentication Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthenticationLayerCIM.impl.AuthenticationTokenImpl
	 * @see AuthenticationLayerCIM.impl.AuthenticationLayerCIMPackageImpl#getAuthenticationToken()
	 * @generated
	 */
	int AUTHENTICATION_TOKEN = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_TOKEN__NAME = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_TOKEN__TYPE = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>BIs Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_TOKEN__BIS_UNIQUE = ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Property Authentication Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_TOKEN__PROPERTY_AUTHENTICATION_TOKEN = ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Authentication Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_TOKEN_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Authentication Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_TOKEN_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AuthenticationLayerCIM.impl.PasswordImpl <em>Password</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthenticationLayerCIM.impl.PasswordImpl
	 * @see AuthenticationLayerCIM.impl.AuthenticationLayerCIMPackageImpl#getPassword()
	 * @generated
	 */
	int PASSWORD = 5;

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
	 * The feature id for the '<em><b>Property Authentication Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD__PROPERTY_AUTHENTICATION_TOKEN = AUTHENTICATION_TOKEN__PROPERTY_AUTHENTICATION_TOKEN;

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
	 * The meta object id for the '{@link AuthenticationLayerCIM.impl.AuthenticationModeImpl <em>Authentication Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthenticationLayerCIM.impl.AuthenticationModeImpl
	 * @see AuthenticationLayerCIM.impl.AuthenticationLayerCIMPackageImpl#getAuthenticationMode()
	 * @generated
	 */
	int AUTHENTICATION_MODE = 6;

	/**
	 * The feature id for the '<em><b>CRUD Activity Authentication Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_MODE__CRUD_ACTIVITY_AUTHENTICATION_MODE = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Authentication Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_MODE_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Authentication Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_MODE_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AuthenticationLayerCIM.impl.GuestModeImpl <em>Guest Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthenticationLayerCIM.impl.GuestModeImpl
	 * @see AuthenticationLayerCIM.impl.AuthenticationLayerCIMPackageImpl#getGuestMode()
	 * @generated
	 */
	int GUEST_MODE = 7;

	/**
	 * The feature id for the '<em><b>CRUD Activity Authentication Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_MODE__CRUD_ACTIVITY_AUTHENTICATION_MODE = AUTHENTICATION_MODE__CRUD_ACTIVITY_AUTHENTICATION_MODE;

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
	 * The meta object id for the '{@link AuthenticationLayerCIM.impl.AuthenticationOnlyModeImpl <em>Authentication Only Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthenticationLayerCIM.impl.AuthenticationOnlyModeImpl
	 * @see AuthenticationLayerCIM.impl.AuthenticationLayerCIMPackageImpl#getAuthenticationOnlyMode()
	 * @generated
	 */
	int AUTHENTICATION_ONLY_MODE = 8;

	/**
	 * The feature id for the '<em><b>CRUD Activity Authentication Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHENTICATION_ONLY_MODE__CRUD_ACTIVITY_AUTHENTICATION_MODE = AUTHENTICATION_MODE__CRUD_ACTIVITY_AUTHENTICATION_MODE;

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
	 * The meta object id for the '{@link AuthenticationLayerCIM.impl.BothModeImpl <em>Both Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthenticationLayerCIM.impl.BothModeImpl
	 * @see AuthenticationLayerCIM.impl.AuthenticationLayerCIMPackageImpl#getBothMode()
	 * @generated
	 */
	int BOTH_MODE = 9;

	/**
	 * The feature id for the '<em><b>CRUD Activity Authentication Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTH_MODE__CRUD_ACTIVITY_AUTHENTICATION_MODE = AUTHENTICATION_MODE__CRUD_ACTIVITY_AUTHENTICATION_MODE;

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
	 * The meta object id for the '{@link AuthenticationLayerCIM.impl.AnnResourceImpl <em>Ann Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthenticationLayerCIM.impl.AnnResourceImpl
	 * @see AuthenticationLayerCIM.impl.AuthenticationLayerCIMPackageImpl#getAnnResource()
	 * @generated
	 */
	int ANN_RESOURCE = 10;

	/**
	 * The feature id for the '<em><b>Annotates Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_RESOURCE__ANNOTATES_RESOURCE = ANNOTATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ann Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_RESOURCE_FEATURE_COUNT = ANNOTATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ann Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_RESOURCE_OPERATION_COUNT = ANNOTATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AuthenticationLayerCIM.impl.AnnPropertyImpl <em>Ann Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthenticationLayerCIM.impl.AnnPropertyImpl
	 * @see AuthenticationLayerCIM.impl.AuthenticationLayerCIMPackageImpl#getAnnProperty()
	 * @generated
	 */
	int ANN_PROPERTY = 11;

	/**
	 * The feature id for the '<em><b>Annotates Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_PROPERTY__ANNOTATES_PROPERTY = ANNOTATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ann Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_PROPERTY_FEATURE_COUNT = ANNOTATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ann Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_PROPERTY_OPERATION_COUNT = ANNOTATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AuthenticationLayerCIM.impl.AnnCRUDActivityImpl <em>Ann CRUD Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthenticationLayerCIM.impl.AnnCRUDActivityImpl
	 * @see AuthenticationLayerCIM.impl.AuthenticationLayerCIMPackageImpl#getAnnCRUDActivity()
	 * @generated
	 */
	int ANN_CRUD_ACTIVITY = 12;

	/**
	 * The feature id for the '<em><b>Annotates CRUD Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_CRUD_ACTIVITY__ANNOTATES_CRUD_ACTIVITY = ANNOTATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_CRUD_ACTIVITY__NAME = ANNOTATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Belongs To Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_CRUD_ACTIVITY__BELONGS_TO_RESOURCE = ANNOTATED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Ann CRUD Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_CRUD_ACTIVITY_FEATURE_COUNT = ANNOTATED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Ann CRUD Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_CRUD_ACTIVITY_OPERATION_COUNT = ANNOTATED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link AuthenticationLayerCIM.AnnotationModel <em>Annotation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Model</em>'.
	 * @see AuthenticationLayerCIM.AnnotationModel
	 * @generated
	 */
	EClass getAnnotationModel();

	/**
	 * Returns the meta object for the attribute '{@link AuthenticationLayerCIM.AnnotationModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AuthenticationLayerCIM.AnnotationModel#getName()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EAttribute getAnnotationModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link AuthenticationLayerCIM.AnnotationModel#getHasAnnotatedElement <em>Has Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Annotated Element</em>'.
	 * @see AuthenticationLayerCIM.AnnotationModel#getHasAnnotatedElement()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EReference getAnnotationModel_HasAnnotatedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link AuthenticationLayerCIM.AnnotationModel#getHasAnnotation <em>Has Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Annotation</em>'.
	 * @see AuthenticationLayerCIM.AnnotationModel#getHasAnnotation()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EReference getAnnotationModel_HasAnnotation();

	/**
	 * Returns the meta object for class '{@link AuthenticationLayerCIM.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see AuthenticationLayerCIM.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for class '{@link AuthenticationLayerCIM.AnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated Element</em>'.
	 * @see AuthenticationLayerCIM.AnnotatedElement
	 * @generated
	 */
	EClass getAnnotatedElement();

	/**
	 * Returns the meta object for class '{@link AuthenticationLayerCIM.AuthenticationModel <em>Authentication Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication Model</em>'.
	 * @see AuthenticationLayerCIM.AuthenticationModel
	 * @generated
	 */
	EClass getAuthenticationModel();

	/**
	 * Returns the meta object for the containment reference list '{@link AuthenticationLayerCIM.AuthenticationModel#getHasAuthenticationToken <em>Has Authentication Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Authentication Token</em>'.
	 * @see AuthenticationLayerCIM.AuthenticationModel#getHasAuthenticationToken()
	 * @see #getAuthenticationModel()
	 * @generated
	 */
	EReference getAuthenticationModel_HasAuthenticationToken();

	/**
	 * Returns the meta object for the reference '{@link AuthenticationLayerCIM.AuthenticationModel#getResourceAuthenticationModel <em>Resource Authentication Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Authentication Model</em>'.
	 * @see AuthenticationLayerCIM.AuthenticationModel#getResourceAuthenticationModel()
	 * @see #getAuthenticationModel()
	 * @generated
	 */
	EReference getAuthenticationModel_ResourceAuthenticationModel();

	/**
	 * Returns the meta object for class '{@link AuthenticationLayerCIM.AuthenticationToken <em>Authentication Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication Token</em>'.
	 * @see AuthenticationLayerCIM.AuthenticationToken
	 * @generated
	 */
	EClass getAuthenticationToken();

	/**
	 * Returns the meta object for the attribute '{@link AuthenticationLayerCIM.AuthenticationToken#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AuthenticationLayerCIM.AuthenticationToken#getName()
	 * @see #getAuthenticationToken()
	 * @generated
	 */
	EAttribute getAuthenticationToken_Name();

	/**
	 * Returns the meta object for the attribute '{@link AuthenticationLayerCIM.AuthenticationToken#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see AuthenticationLayerCIM.AuthenticationToken#getType()
	 * @see #getAuthenticationToken()
	 * @generated
	 */
	EAttribute getAuthenticationToken_Type();

	/**
	 * Returns the meta object for the attribute '{@link AuthenticationLayerCIM.AuthenticationToken#isBIsUnique <em>BIs Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BIs Unique</em>'.
	 * @see AuthenticationLayerCIM.AuthenticationToken#isBIsUnique()
	 * @see #getAuthenticationToken()
	 * @generated
	 */
	EAttribute getAuthenticationToken_BIsUnique();

	/**
	 * Returns the meta object for the reference '{@link AuthenticationLayerCIM.AuthenticationToken#getPropertyAuthenticationToken <em>Property Authentication Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property Authentication Token</em>'.
	 * @see AuthenticationLayerCIM.AuthenticationToken#getPropertyAuthenticationToken()
	 * @see #getAuthenticationToken()
	 * @generated
	 */
	EReference getAuthenticationToken_PropertyAuthenticationToken();

	/**
	 * Returns the meta object for class '{@link AuthenticationLayerCIM.Password <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Password</em>'.
	 * @see AuthenticationLayerCIM.Password
	 * @generated
	 */
	EClass getPassword();

	/**
	 * Returns the meta object for class '{@link AuthenticationLayerCIM.AuthenticationMode <em>Authentication Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication Mode</em>'.
	 * @see AuthenticationLayerCIM.AuthenticationMode
	 * @generated
	 */
	EClass getAuthenticationMode();

	/**
	 * Returns the meta object for the reference '{@link AuthenticationLayerCIM.AuthenticationMode#getCRUDActivityAuthenticationMode <em>CRUD Activity Authentication Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CRUD Activity Authentication Mode</em>'.
	 * @see AuthenticationLayerCIM.AuthenticationMode#getCRUDActivityAuthenticationMode()
	 * @see #getAuthenticationMode()
	 * @generated
	 */
	EReference getAuthenticationMode_CRUDActivityAuthenticationMode();

	/**
	 * Returns the meta object for class '{@link AuthenticationLayerCIM.GuestMode <em>Guest Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guest Mode</em>'.
	 * @see AuthenticationLayerCIM.GuestMode
	 * @generated
	 */
	EClass getGuestMode();

	/**
	 * Returns the meta object for class '{@link AuthenticationLayerCIM.AuthenticationOnlyMode <em>Authentication Only Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authentication Only Mode</em>'.
	 * @see AuthenticationLayerCIM.AuthenticationOnlyMode
	 * @generated
	 */
	EClass getAuthenticationOnlyMode();

	/**
	 * Returns the meta object for class '{@link AuthenticationLayerCIM.BothMode <em>Both Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Both Mode</em>'.
	 * @see AuthenticationLayerCIM.BothMode
	 * @generated
	 */
	EClass getBothMode();

	/**
	 * Returns the meta object for class '{@link AuthenticationLayerCIM.AnnResource <em>Ann Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ann Resource</em>'.
	 * @see AuthenticationLayerCIM.AnnResource
	 * @generated
	 */
	EClass getAnnResource();

	/**
	 * Returns the meta object for the reference '{@link AuthenticationLayerCIM.AnnResource#getAnnotatesResource <em>Annotates Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotates Resource</em>'.
	 * @see AuthenticationLayerCIM.AnnResource#getAnnotatesResource()
	 * @see #getAnnResource()
	 * @generated
	 */
	EReference getAnnResource_AnnotatesResource();

	/**
	 * Returns the meta object for class '{@link AuthenticationLayerCIM.AnnProperty <em>Ann Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ann Property</em>'.
	 * @see AuthenticationLayerCIM.AnnProperty
	 * @generated
	 */
	EClass getAnnProperty();

	/**
	 * Returns the meta object for the reference '{@link AuthenticationLayerCIM.AnnProperty#getAnnotatesProperty <em>Annotates Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotates Property</em>'.
	 * @see AuthenticationLayerCIM.AnnProperty#getAnnotatesProperty()
	 * @see #getAnnProperty()
	 * @generated
	 */
	EReference getAnnProperty_AnnotatesProperty();

	/**
	 * Returns the meta object for class '{@link AuthenticationLayerCIM.AnnCRUDActivity <em>Ann CRUD Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ann CRUD Activity</em>'.
	 * @see AuthenticationLayerCIM.AnnCRUDActivity
	 * @generated
	 */
	EClass getAnnCRUDActivity();

	/**
	 * Returns the meta object for the reference '{@link AuthenticationLayerCIM.AnnCRUDActivity#getAnnotatesCRUDActivity <em>Annotates CRUD Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotates CRUD Activity</em>'.
	 * @see AuthenticationLayerCIM.AnnCRUDActivity#getAnnotatesCRUDActivity()
	 * @see #getAnnCRUDActivity()
	 * @generated
	 */
	EReference getAnnCRUDActivity_AnnotatesCRUDActivity();

	/**
	 * Returns the meta object for the attribute '{@link AuthenticationLayerCIM.AnnCRUDActivity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AuthenticationLayerCIM.AnnCRUDActivity#getName()
	 * @see #getAnnCRUDActivity()
	 * @generated
	 */
	EAttribute getAnnCRUDActivity_Name();

	/**
	 * Returns the meta object for the reference '{@link AuthenticationLayerCIM.AnnCRUDActivity#getBelongsToResource <em>Belongs To Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Belongs To Resource</em>'.
	 * @see AuthenticationLayerCIM.AnnCRUDActivity#getBelongsToResource()
	 * @see #getAnnCRUDActivity()
	 * @generated
	 */
	EReference getAnnCRUDActivity_BelongsToResource();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AuthenticationLayerCIMFactory getAuthenticationLayerCIMFactory();

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
		 * The meta object literal for the '{@link AuthenticationLayerCIM.impl.AnnotationModelImpl <em>Annotation Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthenticationLayerCIM.impl.AnnotationModelImpl
		 * @see AuthenticationLayerCIM.impl.AuthenticationLayerCIMPackageImpl#getAnnotationModel()
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
		 * The meta object literal for the '{@link AuthenticationLayerCIM.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthenticationLayerCIM.impl.AnnotationImpl
		 * @see AuthenticationLayerCIM.impl.AuthenticationLayerCIMPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '{@link AuthenticationLayerCIM.impl.AnnotatedElementImpl <em>Annotated Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthenticationLayerCIM.impl.AnnotatedElementImpl
		 * @see AuthenticationLayerCIM.impl.AuthenticationLayerCIMPackageImpl#getAnnotatedElement()
		 * @generated
		 */
		EClass ANNOTATED_ELEMENT = eINSTANCE.getAnnotatedElement();

		/**
		 * The meta object literal for the '{@link AuthenticationLayerCIM.impl.AuthenticationModelImpl <em>Authentication Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthenticationLayerCIM.impl.AuthenticationModelImpl
		 * @see AuthenticationLayerCIM.impl.AuthenticationLayerCIMPackageImpl#getAuthenticationModel()
		 * @generated
		 */
		EClass AUTHENTICATION_MODEL = eINSTANCE.getAuthenticationModel();

		/**
		 * The meta object literal for the '<em><b>Has Authentication Token</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHENTICATION_MODEL__HAS_AUTHENTICATION_TOKEN = eINSTANCE.getAuthenticationModel_HasAuthenticationToken();

		/**
		 * The meta object literal for the '<em><b>Resource Authentication Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHENTICATION_MODEL__RESOURCE_AUTHENTICATION_MODEL = eINSTANCE.getAuthenticationModel_ResourceAuthenticationModel();

		/**
		 * The meta object literal for the '{@link AuthenticationLayerCIM.impl.AuthenticationTokenImpl <em>Authentication Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthenticationLayerCIM.impl.AuthenticationTokenImpl
		 * @see AuthenticationLayerCIM.impl.AuthenticationLayerCIMPackageImpl#getAuthenticationToken()
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
		 * The meta object literal for the '<em><b>Property Authentication Token</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHENTICATION_TOKEN__PROPERTY_AUTHENTICATION_TOKEN = eINSTANCE.getAuthenticationToken_PropertyAuthenticationToken();

		/**
		 * The meta object literal for the '{@link AuthenticationLayerCIM.impl.PasswordImpl <em>Password</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthenticationLayerCIM.impl.PasswordImpl
		 * @see AuthenticationLayerCIM.impl.AuthenticationLayerCIMPackageImpl#getPassword()
		 * @generated
		 */
		EClass PASSWORD = eINSTANCE.getPassword();

		/**
		 * The meta object literal for the '{@link AuthenticationLayerCIM.impl.AuthenticationModeImpl <em>Authentication Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthenticationLayerCIM.impl.AuthenticationModeImpl
		 * @see AuthenticationLayerCIM.impl.AuthenticationLayerCIMPackageImpl#getAuthenticationMode()
		 * @generated
		 */
		EClass AUTHENTICATION_MODE = eINSTANCE.getAuthenticationMode();

		/**
		 * The meta object literal for the '<em><b>CRUD Activity Authentication Mode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHENTICATION_MODE__CRUD_ACTIVITY_AUTHENTICATION_MODE = eINSTANCE.getAuthenticationMode_CRUDActivityAuthenticationMode();

		/**
		 * The meta object literal for the '{@link AuthenticationLayerCIM.impl.GuestModeImpl <em>Guest Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthenticationLayerCIM.impl.GuestModeImpl
		 * @see AuthenticationLayerCIM.impl.AuthenticationLayerCIMPackageImpl#getGuestMode()
		 * @generated
		 */
		EClass GUEST_MODE = eINSTANCE.getGuestMode();

		/**
		 * The meta object literal for the '{@link AuthenticationLayerCIM.impl.AuthenticationOnlyModeImpl <em>Authentication Only Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthenticationLayerCIM.impl.AuthenticationOnlyModeImpl
		 * @see AuthenticationLayerCIM.impl.AuthenticationLayerCIMPackageImpl#getAuthenticationOnlyMode()
		 * @generated
		 */
		EClass AUTHENTICATION_ONLY_MODE = eINSTANCE.getAuthenticationOnlyMode();

		/**
		 * The meta object literal for the '{@link AuthenticationLayerCIM.impl.BothModeImpl <em>Both Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthenticationLayerCIM.impl.BothModeImpl
		 * @see AuthenticationLayerCIM.impl.AuthenticationLayerCIMPackageImpl#getBothMode()
		 * @generated
		 */
		EClass BOTH_MODE = eINSTANCE.getBothMode();

		/**
		 * The meta object literal for the '{@link AuthenticationLayerCIM.impl.AnnResourceImpl <em>Ann Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthenticationLayerCIM.impl.AnnResourceImpl
		 * @see AuthenticationLayerCIM.impl.AuthenticationLayerCIMPackageImpl#getAnnResource()
		 * @generated
		 */
		EClass ANN_RESOURCE = eINSTANCE.getAnnResource();

		/**
		 * The meta object literal for the '<em><b>Annotates Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANN_RESOURCE__ANNOTATES_RESOURCE = eINSTANCE.getAnnResource_AnnotatesResource();

		/**
		 * The meta object literal for the '{@link AuthenticationLayerCIM.impl.AnnPropertyImpl <em>Ann Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthenticationLayerCIM.impl.AnnPropertyImpl
		 * @see AuthenticationLayerCIM.impl.AuthenticationLayerCIMPackageImpl#getAnnProperty()
		 * @generated
		 */
		EClass ANN_PROPERTY = eINSTANCE.getAnnProperty();

		/**
		 * The meta object literal for the '<em><b>Annotates Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANN_PROPERTY__ANNOTATES_PROPERTY = eINSTANCE.getAnnProperty_AnnotatesProperty();

		/**
		 * The meta object literal for the '{@link AuthenticationLayerCIM.impl.AnnCRUDActivityImpl <em>Ann CRUD Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthenticationLayerCIM.impl.AnnCRUDActivityImpl
		 * @see AuthenticationLayerCIM.impl.AuthenticationLayerCIMPackageImpl#getAnnCRUDActivity()
		 * @generated
		 */
		EClass ANN_CRUD_ACTIVITY = eINSTANCE.getAnnCRUDActivity();

		/**
		 * The meta object literal for the '<em><b>Annotates CRUD Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANN_CRUD_ACTIVITY__ANNOTATES_CRUD_ACTIVITY = eINSTANCE.getAnnCRUDActivity_AnnotatesCRUDActivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANN_CRUD_ACTIVITY__NAME = eINSTANCE.getAnnCRUDActivity_Name();

		/**
		 * The meta object literal for the '<em><b>Belongs To Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANN_CRUD_ACTIVITY__BELONGS_TO_RESOURCE = eINSTANCE.getAnnCRUDActivity_BelongsToResource();

	}

} //AuthenticationLayerCIMPackage
