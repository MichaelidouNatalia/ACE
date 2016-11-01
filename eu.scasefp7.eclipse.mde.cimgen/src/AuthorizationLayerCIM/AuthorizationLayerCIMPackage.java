/**
 */
package AuthorizationLayerCIM;

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
 * @see AuthorizationLayerCIM.AuthorizationLayerCIMFactory
 * @model kind="package"
 * @generated
 */
public interface AuthorizationLayerCIMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "AuthorizationLayerCIM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/eu.scasefp7.eclipse.mde.m2m/Metamodels/AuthorizationCIMMetamodel.ecore";

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
	AuthorizationLayerCIMPackage eINSTANCE = AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl.init();

	/**
	 * The meta object id for the '{@link AuthorizationLayerCIM.impl.AnnotationModelImpl <em>Annotation Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerCIM.impl.AnnotationModelImpl
	 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getAnnotationModel()
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
	 * The meta object id for the '{@link AuthorizationLayerCIM.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerCIM.impl.AnnotationImpl
	 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getAnnotation()
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
	 * The meta object id for the '{@link AuthorizationLayerCIM.impl.AuthorizableResourceImpl <em>Authorizable Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerCIM.impl.AuthorizableResourceImpl
	 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getAuthorizableResource()
	 * @generated
	 */
	int AUTHORIZABLE_RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Has Resource Access Policy Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZABLE_RESOURCE__HAS_RESOURCE_ACCESS_POLICY_SET = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Authorizable Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_RESOURCE = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>BTrack Ownership</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZABLE_RESOURCE__BTRACK_OWNERSHIP = ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Authorizable Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZABLE_RESOURCE_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Authorizable Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORIZABLE_RESOURCE_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AuthorizationLayerCIM.impl.ResourceAccessPolicySetImpl <em>Resource Access Policy Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerCIM.impl.ResourceAccessPolicySetImpl
	 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getResourceAccessPolicySet()
	 * @generated
	 */
	int RESOURCE_ACCESS_POLICY_SET = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS_POLICY_SET__NAME = 0;

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
	 * The feature id for the '<em><b>Has Resource Access Policy Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS_POLICY_SET__HAS_RESOURCE_ACCESS_POLICY_SET = 3;

	/**
	 * The number of structural features of the '<em>Resource Access Policy Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS_POLICY_SET_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Resource Access Policy Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS_POLICY_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AuthorizationLayerCIM.impl.AnnotatedElementImpl <em>Annotated Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerCIM.impl.AnnotatedElementImpl
	 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getAnnotatedElement()
	 * @generated
	 */
	int ANNOTATED_ELEMENT = 4;

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
	 * The meta object id for the '{@link AuthorizationLayerCIM.impl.AnnResourceImpl <em>Ann Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerCIM.impl.AnnResourceImpl
	 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getAnnResource()
	 * @generated
	 */
	int ANN_RESOURCE = 5;

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
	 * The meta object id for the '{@link AuthorizationLayerCIM.impl.ResourceAccessPolicyImpl <em>Resource Access Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerCIM.impl.ResourceAccessPolicyImpl
	 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getResourceAccessPolicy()
	 * @generated
	 */
	int RESOURCE_ACCESS_POLICY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS_POLICY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Rule Combining Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS_POLICY__RULE_COMBINING_ALGORITHM = 1;

	/**
	 * The feature id for the '<em><b>Has Apply Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS_POLICY__HAS_APPLY_CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Has Resource Access Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS_POLICY__HAS_RESOURCE_ACCESS_RULE = 3;

	/**
	 * The number of structural features of the '<em>Resource Access Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS_POLICY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Resource Access Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AuthorizationLayerCIM.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerCIM.impl.ConditionImpl
	 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 7;

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
	 * The meta object id for the '{@link AuthorizationLayerCIM.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerCIM.impl.AttributeImpl
	 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 8;

	/**
	 * The feature id for the '<em><b>Attribute Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ATTRIBUTE_CATEGORY = 0;

	/**
	 * The feature id for the '<em><b>Is Attribute Existing Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_ATTRIBUTE_EXISTING_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Is Attribute New Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_ATTRIBUTE_NEW_PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Is Attribute Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_ATTRIBUTE_RESOURCE = 4;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AuthorizationLayerCIM.impl.AnnPropertyImpl <em>Ann Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerCIM.impl.AnnPropertyImpl
	 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getAnnProperty()
	 * @generated
	 */
	int ANN_PROPERTY = 9;

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
	 * The meta object id for the '{@link AuthorizationLayerCIM.impl.ResourceAccessRuleImpl <em>Resource Access Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerCIM.impl.ResourceAccessRuleImpl
	 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getResourceAccessRule()
	 * @generated
	 */
	int RESOURCE_ACCESS_RULE = 10;

	/**
	 * The feature id for the '<em><b>Has Match Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS_RULE__HAS_MATCH_CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS_RULE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Rule Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS_RULE__RULE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Has Allowed Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS_RULE__HAS_ALLOWED_ACTION = 3;

	/**
	 * The number of structural features of the '<em>Resource Access Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS_RULE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Resource Access Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_ACCESS_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link AuthorizationLayerCIM.impl.AuthorizationSubjectImpl <em>Authorization Subject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerCIM.impl.AuthorizationSubjectImpl
	 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getAuthorizationSubject()
	 * @generated
	 */
	int AUTHORIZATION_SUBJECT = 11;

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
	 * The meta object id for the '{@link AuthorizationLayerCIM.impl.AnnCRUDActivityImpl <em>Ann CRUD Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerCIM.impl.AnnCRUDActivityImpl
	 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getAnnCRUDActivity()
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
	 * The number of structural features of the '<em>Ann CRUD Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_CRUD_ACTIVITY_FEATURE_COUNT = ANNOTATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ann CRUD Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_CRUD_ACTIVITY_OPERATION_COUNT = ANNOTATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link AuthorizationLayerCIM.impl.AllowedActionImpl <em>Allowed Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerCIM.impl.AllowedActionImpl
	 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getAllowedAction()
	 * @generated
	 */
	int ALLOWED_ACTION = 13;

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
	 * The meta object id for the '{@link AuthorizationLayerCIM.impl.NewPropertyImpl <em>New Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerCIM.impl.NewPropertyImpl
	 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getNewProperty()
	 * @generated
	 */
	int NEW_PROPERTY = 14;

	/**
	 * The feature id for the '<em><b>Belongs To Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_PROPERTY__BELONGS_TO_RESOURCE = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_PROPERTY__NAME = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_PROPERTY__TYPE = ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>BIs Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_PROPERTY__BIS_UNIQUE = ANNOTATION_FEATURE_COUNT + 3;

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
	 * The meta object id for the '{@link AuthorizationLayerCIM.CombiningAlgorithm <em>Combining Algorithm</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerCIM.CombiningAlgorithm
	 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getCombiningAlgorithm()
	 * @generated
	 */
	int COMBINING_ALGORITHM = 15;

	/**
	 * The meta object id for the '{@link AuthorizationLayerCIM.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerCIM.Operator
	 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 16;

	/**
	 * The meta object id for the '{@link AuthorizationLayerCIM.AttributeCategory <em>Attribute Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerCIM.AttributeCategory
	 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getAttributeCategory()
	 * @generated
	 */
	int ATTRIBUTE_CATEGORY = 17;

	/**
	 * The meta object id for the '{@link AuthorizationLayerCIM.RuleType <em>Rule Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see AuthorizationLayerCIM.RuleType
	 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getRuleType()
	 * @generated
	 */
	int RULE_TYPE = 18;


	/**
	 * Returns the meta object for class '{@link AuthorizationLayerCIM.AnnotationModel <em>Annotation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Model</em>'.
	 * @see AuthorizationLayerCIM.AnnotationModel
	 * @generated
	 */
	EClass getAnnotationModel();

	/**
	 * Returns the meta object for the attribute '{@link AuthorizationLayerCIM.AnnotationModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AuthorizationLayerCIM.AnnotationModel#getName()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EAttribute getAnnotationModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link AuthorizationLayerCIM.AnnotationModel#getHasAnnotatedElement <em>Has Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Annotated Element</em>'.
	 * @see AuthorizationLayerCIM.AnnotationModel#getHasAnnotatedElement()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EReference getAnnotationModel_HasAnnotatedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link AuthorizationLayerCIM.AnnotationModel#getHasAnnotation <em>Has Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Annotation</em>'.
	 * @see AuthorizationLayerCIM.AnnotationModel#getHasAnnotation()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EReference getAnnotationModel_HasAnnotation();

	/**
	 * Returns the meta object for class '{@link AuthorizationLayerCIM.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see AuthorizationLayerCIM.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for class '{@link AuthorizationLayerCIM.AuthorizableResource <em>Authorizable Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorizable Resource</em>'.
	 * @see AuthorizationLayerCIM.AuthorizableResource
	 * @generated
	 */
	EClass getAuthorizableResource();

	/**
	 * Returns the meta object for the containment reference '{@link AuthorizationLayerCIM.AuthorizableResource#getHasResourceAccessPolicySet <em>Has Resource Access Policy Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Resource Access Policy Set</em>'.
	 * @see AuthorizationLayerCIM.AuthorizableResource#getHasResourceAccessPolicySet()
	 * @see #getAuthorizableResource()
	 * @generated
	 */
	EReference getAuthorizableResource_HasResourceAccessPolicySet();

	/**
	 * Returns the meta object for the reference '{@link AuthorizationLayerCIM.AuthorizableResource#getIsAuthorizableResource <em>Is Authorizable Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Authorizable Resource</em>'.
	 * @see AuthorizationLayerCIM.AuthorizableResource#getIsAuthorizableResource()
	 * @see #getAuthorizableResource()
	 * @generated
	 */
	EReference getAuthorizableResource_IsAuthorizableResource();

	/**
	 * Returns the meta object for the attribute '{@link AuthorizationLayerCIM.AuthorizableResource#isBTrackOwnership <em>BTrack Ownership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BTrack Ownership</em>'.
	 * @see AuthorizationLayerCIM.AuthorizableResource#isBTrackOwnership()
	 * @see #getAuthorizableResource()
	 * @generated
	 */
	EAttribute getAuthorizableResource_BTrackOwnership();

	/**
	 * Returns the meta object for class '{@link AuthorizationLayerCIM.ResourceAccessPolicySet <em>Resource Access Policy Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Access Policy Set</em>'.
	 * @see AuthorizationLayerCIM.ResourceAccessPolicySet
	 * @generated
	 */
	EClass getResourceAccessPolicySet();

	/**
	 * Returns the meta object for the attribute '{@link AuthorizationLayerCIM.ResourceAccessPolicySet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AuthorizationLayerCIM.ResourceAccessPolicySet#getName()
	 * @see #getResourceAccessPolicySet()
	 * @generated
	 */
	EAttribute getResourceAccessPolicySet_Name();

	/**
	 * Returns the meta object for the attribute '{@link AuthorizationLayerCIM.ResourceAccessPolicySet#getPolicyCombiningAlgorithm <em>Policy Combining Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Combining Algorithm</em>'.
	 * @see AuthorizationLayerCIM.ResourceAccessPolicySet#getPolicyCombiningAlgorithm()
	 * @see #getResourceAccessPolicySet()
	 * @generated
	 */
	EAttribute getResourceAccessPolicySet_PolicyCombiningAlgorithm();

	/**
	 * Returns the meta object for the containment reference list '{@link AuthorizationLayerCIM.ResourceAccessPolicySet#getHasResourceAccessPolicy <em>Has Resource Access Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Resource Access Policy</em>'.
	 * @see AuthorizationLayerCIM.ResourceAccessPolicySet#getHasResourceAccessPolicy()
	 * @see #getResourceAccessPolicySet()
	 * @generated
	 */
	EReference getResourceAccessPolicySet_HasResourceAccessPolicy();

	/**
	 * Returns the meta object for the containment reference list '{@link AuthorizationLayerCIM.ResourceAccessPolicySet#getHasResourceAccessPolicySet <em>Has Resource Access Policy Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Resource Access Policy Set</em>'.
	 * @see AuthorizationLayerCIM.ResourceAccessPolicySet#getHasResourceAccessPolicySet()
	 * @see #getResourceAccessPolicySet()
	 * @generated
	 */
	EReference getResourceAccessPolicySet_HasResourceAccessPolicySet();

	/**
	 * Returns the meta object for class '{@link AuthorizationLayerCIM.AnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated Element</em>'.
	 * @see AuthorizationLayerCIM.AnnotatedElement
	 * @generated
	 */
	EClass getAnnotatedElement();

	/**
	 * Returns the meta object for class '{@link AuthorizationLayerCIM.AnnResource <em>Ann Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ann Resource</em>'.
	 * @see AuthorizationLayerCIM.AnnResource
	 * @generated
	 */
	EClass getAnnResource();

	/**
	 * Returns the meta object for the reference '{@link AuthorizationLayerCIM.AnnResource#getAnnotatesResource <em>Annotates Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotates Resource</em>'.
	 * @see AuthorizationLayerCIM.AnnResource#getAnnotatesResource()
	 * @see #getAnnResource()
	 * @generated
	 */
	EReference getAnnResource_AnnotatesResource();

	/**
	 * Returns the meta object for class '{@link AuthorizationLayerCIM.ResourceAccessPolicy <em>Resource Access Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Access Policy</em>'.
	 * @see AuthorizationLayerCIM.ResourceAccessPolicy
	 * @generated
	 */
	EClass getResourceAccessPolicy();

	/**
	 * Returns the meta object for the attribute '{@link AuthorizationLayerCIM.ResourceAccessPolicy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AuthorizationLayerCIM.ResourceAccessPolicy#getName()
	 * @see #getResourceAccessPolicy()
	 * @generated
	 */
	EAttribute getResourceAccessPolicy_Name();

	/**
	 * Returns the meta object for the attribute '{@link AuthorizationLayerCIM.ResourceAccessPolicy#getRuleCombiningAlgorithm <em>Rule Combining Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Combining Algorithm</em>'.
	 * @see AuthorizationLayerCIM.ResourceAccessPolicy#getRuleCombiningAlgorithm()
	 * @see #getResourceAccessPolicy()
	 * @generated
	 */
	EAttribute getResourceAccessPolicy_RuleCombiningAlgorithm();

	/**
	 * Returns the meta object for the containment reference list '{@link AuthorizationLayerCIM.ResourceAccessPolicy#getHasApplyCondition <em>Has Apply Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Apply Condition</em>'.
	 * @see AuthorizationLayerCIM.ResourceAccessPolicy#getHasApplyCondition()
	 * @see #getResourceAccessPolicy()
	 * @generated
	 */
	EReference getResourceAccessPolicy_HasApplyCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link AuthorizationLayerCIM.ResourceAccessPolicy#getHasResourceAccessRule <em>Has Resource Access Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Resource Access Rule</em>'.
	 * @see AuthorizationLayerCIM.ResourceAccessPolicy#getHasResourceAccessRule()
	 * @see #getResourceAccessPolicy()
	 * @generated
	 */
	EReference getResourceAccessPolicy_HasResourceAccessRule();

	/**
	 * Returns the meta object for class '{@link AuthorizationLayerCIM.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see AuthorizationLayerCIM.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link AuthorizationLayerCIM.Condition#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see AuthorizationLayerCIM.Condition#getOperator()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link AuthorizationLayerCIM.Condition#getHasLeftSideOperand <em>Has Left Side Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Left Side Operand</em>'.
	 * @see AuthorizationLayerCIM.Condition#getHasLeftSideOperand()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_HasLeftSideOperand();

	/**
	 * Returns the meta object for the containment reference '{@link AuthorizationLayerCIM.Condition#getHasRightSideOperand <em>Has Right Side Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Right Side Operand</em>'.
	 * @see AuthorizationLayerCIM.Condition#getHasRightSideOperand()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_HasRightSideOperand();

	/**
	 * Returns the meta object for class '{@link AuthorizationLayerCIM.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see AuthorizationLayerCIM.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link AuthorizationLayerCIM.Attribute#getAttributeCategory <em>Attribute Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Category</em>'.
	 * @see AuthorizationLayerCIM.Attribute#getAttributeCategory()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_AttributeCategory();

	/**
	 * Returns the meta object for the reference '{@link AuthorizationLayerCIM.Attribute#getIsAttributeExistingProperty <em>Is Attribute Existing Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Attribute Existing Property</em>'.
	 * @see AuthorizationLayerCIM.Attribute#getIsAttributeExistingProperty()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_IsAttributeExistingProperty();

	/**
	 * Returns the meta object for the attribute list '{@link AuthorizationLayerCIM.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see AuthorizationLayerCIM.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Value();

	/**
	 * Returns the meta object for the reference '{@link AuthorizationLayerCIM.Attribute#getIsAttributeNewProperty <em>Is Attribute New Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Attribute New Property</em>'.
	 * @see AuthorizationLayerCIM.Attribute#getIsAttributeNewProperty()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_IsAttributeNewProperty();

	/**
	 * Returns the meta object for the reference '{@link AuthorizationLayerCIM.Attribute#getIsAttributeResource <em>Is Attribute Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Attribute Resource</em>'.
	 * @see AuthorizationLayerCIM.Attribute#getIsAttributeResource()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_IsAttributeResource();

	/**
	 * Returns the meta object for class '{@link AuthorizationLayerCIM.AnnProperty <em>Ann Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ann Property</em>'.
	 * @see AuthorizationLayerCIM.AnnProperty
	 * @generated
	 */
	EClass getAnnProperty();

	/**
	 * Returns the meta object for the reference '{@link AuthorizationLayerCIM.AnnProperty#getAnnotatesProperty <em>Annotates Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotates Property</em>'.
	 * @see AuthorizationLayerCIM.AnnProperty#getAnnotatesProperty()
	 * @see #getAnnProperty()
	 * @generated
	 */
	EReference getAnnProperty_AnnotatesProperty();

	/**
	 * Returns the meta object for class '{@link AuthorizationLayerCIM.ResourceAccessRule <em>Resource Access Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Access Rule</em>'.
	 * @see AuthorizationLayerCIM.ResourceAccessRule
	 * @generated
	 */
	EClass getResourceAccessRule();

	/**
	 * Returns the meta object for the containment reference list '{@link AuthorizationLayerCIM.ResourceAccessRule#getHasMatchCondition <em>Has Match Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Match Condition</em>'.
	 * @see AuthorizationLayerCIM.ResourceAccessRule#getHasMatchCondition()
	 * @see #getResourceAccessRule()
	 * @generated
	 */
	EReference getResourceAccessRule_HasMatchCondition();

	/**
	 * Returns the meta object for the attribute '{@link AuthorizationLayerCIM.ResourceAccessRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AuthorizationLayerCIM.ResourceAccessRule#getName()
	 * @see #getResourceAccessRule()
	 * @generated
	 */
	EAttribute getResourceAccessRule_Name();

	/**
	 * Returns the meta object for the attribute '{@link AuthorizationLayerCIM.ResourceAccessRule#getRuleType <em>Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Type</em>'.
	 * @see AuthorizationLayerCIM.ResourceAccessRule#getRuleType()
	 * @see #getResourceAccessRule()
	 * @generated
	 */
	EAttribute getResourceAccessRule_RuleType();

	/**
	 * Returns the meta object for the containment reference list '{@link AuthorizationLayerCIM.ResourceAccessRule#getHasAllowedAction <em>Has Allowed Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Allowed Action</em>'.
	 * @see AuthorizationLayerCIM.ResourceAccessRule#getHasAllowedAction()
	 * @see #getResourceAccessRule()
	 * @generated
	 */
	EReference getResourceAccessRule_HasAllowedAction();

	/**
	 * Returns the meta object for class '{@link AuthorizationLayerCIM.AuthorizationSubject <em>Authorization Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorization Subject</em>'.
	 * @see AuthorizationLayerCIM.AuthorizationSubject
	 * @generated
	 */
	EClass getAuthorizationSubject();

	/**
	 * Returns the meta object for the reference '{@link AuthorizationLayerCIM.AuthorizationSubject#getIsAuthorizationSubject <em>Is Authorization Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Authorization Subject</em>'.
	 * @see AuthorizationLayerCIM.AuthorizationSubject#getIsAuthorizationSubject()
	 * @see #getAuthorizationSubject()
	 * @generated
	 */
	EReference getAuthorizationSubject_IsAuthorizationSubject();

	/**
	 * Returns the meta object for class '{@link AuthorizationLayerCIM.AnnCRUDActivity <em>Ann CRUD Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ann CRUD Activity</em>'.
	 * @see AuthorizationLayerCIM.AnnCRUDActivity
	 * @generated
	 */
	EClass getAnnCRUDActivity();

	/**
	 * Returns the meta object for the reference '{@link AuthorizationLayerCIM.AnnCRUDActivity#getAnnotatesCRUDActivity <em>Annotates CRUD Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotates CRUD Activity</em>'.
	 * @see AuthorizationLayerCIM.AnnCRUDActivity#getAnnotatesCRUDActivity()
	 * @see #getAnnCRUDActivity()
	 * @generated
	 */
	EReference getAnnCRUDActivity_AnnotatesCRUDActivity();

	/**
	 * Returns the meta object for class '{@link AuthorizationLayerCIM.AllowedAction <em>Allowed Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allowed Action</em>'.
	 * @see AuthorizationLayerCIM.AllowedAction
	 * @generated
	 */
	EClass getAllowedAction();

	/**
	 * Returns the meta object for the reference '{@link AuthorizationLayerCIM.AllowedAction#getIsAllowedAction <em>Is Allowed Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Allowed Action</em>'.
	 * @see AuthorizationLayerCIM.AllowedAction#getIsAllowedAction()
	 * @see #getAllowedAction()
	 * @generated
	 */
	EReference getAllowedAction_IsAllowedAction();

	/**
	 * Returns the meta object for class '{@link AuthorizationLayerCIM.NewProperty <em>New Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Property</em>'.
	 * @see AuthorizationLayerCIM.NewProperty
	 * @generated
	 */
	EClass getNewProperty();

	/**
	 * Returns the meta object for the reference '{@link AuthorizationLayerCIM.NewProperty#getBelongsToResource <em>Belongs To Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Belongs To Resource</em>'.
	 * @see AuthorizationLayerCIM.NewProperty#getBelongsToResource()
	 * @see #getNewProperty()
	 * @generated
	 */
	EReference getNewProperty_BelongsToResource();

	/**
	 * Returns the meta object for the attribute '{@link AuthorizationLayerCIM.NewProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see AuthorizationLayerCIM.NewProperty#getName()
	 * @see #getNewProperty()
	 * @generated
	 */
	EAttribute getNewProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link AuthorizationLayerCIM.NewProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see AuthorizationLayerCIM.NewProperty#getType()
	 * @see #getNewProperty()
	 * @generated
	 */
	EAttribute getNewProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link AuthorizationLayerCIM.NewProperty#isBIsUnique <em>BIs Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BIs Unique</em>'.
	 * @see AuthorizationLayerCIM.NewProperty#isBIsUnique()
	 * @see #getNewProperty()
	 * @generated
	 */
	EAttribute getNewProperty_BIsUnique();

	/**
	 * Returns the meta object for enum '{@link AuthorizationLayerCIM.CombiningAlgorithm <em>Combining Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Combining Algorithm</em>'.
	 * @see AuthorizationLayerCIM.CombiningAlgorithm
	 * @generated
	 */
	EEnum getCombiningAlgorithm();

	/**
	 * Returns the meta object for enum '{@link AuthorizationLayerCIM.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see AuthorizationLayerCIM.Operator
	 * @generated
	 */
	EEnum getOperator();

	/**
	 * Returns the meta object for enum '{@link AuthorizationLayerCIM.AttributeCategory <em>Attribute Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Category</em>'.
	 * @see AuthorizationLayerCIM.AttributeCategory
	 * @generated
	 */
	EEnum getAttributeCategory();

	/**
	 * Returns the meta object for enum '{@link AuthorizationLayerCIM.RuleType <em>Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rule Type</em>'.
	 * @see AuthorizationLayerCIM.RuleType
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
	AuthorizationLayerCIMFactory getAuthorizationLayerCIMFactory();

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
		 * The meta object literal for the '{@link AuthorizationLayerCIM.impl.AnnotationModelImpl <em>Annotation Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerCIM.impl.AnnotationModelImpl
		 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getAnnotationModel()
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
		 * The meta object literal for the '{@link AuthorizationLayerCIM.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerCIM.impl.AnnotationImpl
		 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '{@link AuthorizationLayerCIM.impl.AuthorizableResourceImpl <em>Authorizable Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerCIM.impl.AuthorizableResourceImpl
		 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getAuthorizableResource()
		 * @generated
		 */
		EClass AUTHORIZABLE_RESOURCE = eINSTANCE.getAuthorizableResource();

		/**
		 * The meta object literal for the '<em><b>Has Resource Access Policy Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHORIZABLE_RESOURCE__HAS_RESOURCE_ACCESS_POLICY_SET = eINSTANCE.getAuthorizableResource_HasResourceAccessPolicySet();

		/**
		 * The meta object literal for the '<em><b>Is Authorizable Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_RESOURCE = eINSTANCE.getAuthorizableResource_IsAuthorizableResource();

		/**
		 * The meta object literal for the '<em><b>BTrack Ownership</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORIZABLE_RESOURCE__BTRACK_OWNERSHIP = eINSTANCE.getAuthorizableResource_BTrackOwnership();

		/**
		 * The meta object literal for the '{@link AuthorizationLayerCIM.impl.ResourceAccessPolicySetImpl <em>Resource Access Policy Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerCIM.impl.ResourceAccessPolicySetImpl
		 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getResourceAccessPolicySet()
		 * @generated
		 */
		EClass RESOURCE_ACCESS_POLICY_SET = eINSTANCE.getResourceAccessPolicySet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ACCESS_POLICY_SET__NAME = eINSTANCE.getResourceAccessPolicySet_Name();

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
		 * The meta object literal for the '<em><b>Has Resource Access Policy Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ACCESS_POLICY_SET__HAS_RESOURCE_ACCESS_POLICY_SET = eINSTANCE.getResourceAccessPolicySet_HasResourceAccessPolicySet();

		/**
		 * The meta object literal for the '{@link AuthorizationLayerCIM.impl.AnnotatedElementImpl <em>Annotated Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerCIM.impl.AnnotatedElementImpl
		 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getAnnotatedElement()
		 * @generated
		 */
		EClass ANNOTATED_ELEMENT = eINSTANCE.getAnnotatedElement();

		/**
		 * The meta object literal for the '{@link AuthorizationLayerCIM.impl.AnnResourceImpl <em>Ann Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerCIM.impl.AnnResourceImpl
		 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getAnnResource()
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
		 * The meta object literal for the '{@link AuthorizationLayerCIM.impl.ResourceAccessPolicyImpl <em>Resource Access Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerCIM.impl.ResourceAccessPolicyImpl
		 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getResourceAccessPolicy()
		 * @generated
		 */
		EClass RESOURCE_ACCESS_POLICY = eINSTANCE.getResourceAccessPolicy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ACCESS_POLICY__NAME = eINSTANCE.getResourceAccessPolicy_Name();

		/**
		 * The meta object literal for the '<em><b>Rule Combining Algorithm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ACCESS_POLICY__RULE_COMBINING_ALGORITHM = eINSTANCE.getResourceAccessPolicy_RuleCombiningAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Has Apply Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ACCESS_POLICY__HAS_APPLY_CONDITION = eINSTANCE.getResourceAccessPolicy_HasApplyCondition();

		/**
		 * The meta object literal for the '<em><b>Has Resource Access Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ACCESS_POLICY__HAS_RESOURCE_ACCESS_RULE = eINSTANCE.getResourceAccessPolicy_HasResourceAccessRule();

		/**
		 * The meta object literal for the '{@link AuthorizationLayerCIM.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerCIM.impl.ConditionImpl
		 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getCondition()
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
		 * The meta object literal for the '{@link AuthorizationLayerCIM.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerCIM.impl.AttributeImpl
		 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getAttribute()
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
		 * The meta object literal for the '<em><b>Is Attribute Existing Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__IS_ATTRIBUTE_EXISTING_PROPERTY = eINSTANCE.getAttribute_IsAttributeExistingProperty();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

		/**
		 * The meta object literal for the '<em><b>Is Attribute New Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__IS_ATTRIBUTE_NEW_PROPERTY = eINSTANCE.getAttribute_IsAttributeNewProperty();

		/**
		 * The meta object literal for the '<em><b>Is Attribute Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__IS_ATTRIBUTE_RESOURCE = eINSTANCE.getAttribute_IsAttributeResource();

		/**
		 * The meta object literal for the '{@link AuthorizationLayerCIM.impl.AnnPropertyImpl <em>Ann Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerCIM.impl.AnnPropertyImpl
		 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getAnnProperty()
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
		 * The meta object literal for the '{@link AuthorizationLayerCIM.impl.ResourceAccessRuleImpl <em>Resource Access Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerCIM.impl.ResourceAccessRuleImpl
		 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getResourceAccessRule()
		 * @generated
		 */
		EClass RESOURCE_ACCESS_RULE = eINSTANCE.getResourceAccessRule();

		/**
		 * The meta object literal for the '<em><b>Has Match Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ACCESS_RULE__HAS_MATCH_CONDITION = eINSTANCE.getResourceAccessRule_HasMatchCondition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ACCESS_RULE__NAME = eINSTANCE.getResourceAccessRule_Name();

		/**
		 * The meta object literal for the '<em><b>Rule Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_ACCESS_RULE__RULE_TYPE = eINSTANCE.getResourceAccessRule_RuleType();

		/**
		 * The meta object literal for the '<em><b>Has Allowed Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_ACCESS_RULE__HAS_ALLOWED_ACTION = eINSTANCE.getResourceAccessRule_HasAllowedAction();

		/**
		 * The meta object literal for the '{@link AuthorizationLayerCIM.impl.AuthorizationSubjectImpl <em>Authorization Subject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerCIM.impl.AuthorizationSubjectImpl
		 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getAuthorizationSubject()
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
		 * The meta object literal for the '{@link AuthorizationLayerCIM.impl.AnnCRUDActivityImpl <em>Ann CRUD Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerCIM.impl.AnnCRUDActivityImpl
		 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getAnnCRUDActivity()
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
		 * The meta object literal for the '{@link AuthorizationLayerCIM.impl.AllowedActionImpl <em>Allowed Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerCIM.impl.AllowedActionImpl
		 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getAllowedAction()
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
		 * The meta object literal for the '{@link AuthorizationLayerCIM.impl.NewPropertyImpl <em>New Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerCIM.impl.NewPropertyImpl
		 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getNewProperty()
		 * @generated
		 */
		EClass NEW_PROPERTY = eINSTANCE.getNewProperty();

		/**
		 * The meta object literal for the '<em><b>Belongs To Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_PROPERTY__BELONGS_TO_RESOURCE = eINSTANCE.getNewProperty_BelongsToResource();

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
		 * The meta object literal for the '{@link AuthorizationLayerCIM.CombiningAlgorithm <em>Combining Algorithm</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerCIM.CombiningAlgorithm
		 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getCombiningAlgorithm()
		 * @generated
		 */
		EEnum COMBINING_ALGORITHM = eINSTANCE.getCombiningAlgorithm();

		/**
		 * The meta object literal for the '{@link AuthorizationLayerCIM.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerCIM.Operator
		 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getOperator()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '{@link AuthorizationLayerCIM.AttributeCategory <em>Attribute Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerCIM.AttributeCategory
		 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getAttributeCategory()
		 * @generated
		 */
		EEnum ATTRIBUTE_CATEGORY = eINSTANCE.getAttributeCategory();

		/**
		 * The meta object literal for the '{@link AuthorizationLayerCIM.RuleType <em>Rule Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see AuthorizationLayerCIM.RuleType
		 * @see AuthorizationLayerCIM.impl.AuthorizationLayerCIMPackageImpl#getRuleType()
		 * @generated
		 */
		EEnum RULE_TYPE = eINSTANCE.getRuleType();

	}

} //AuthorizationLayerCIMPackage
