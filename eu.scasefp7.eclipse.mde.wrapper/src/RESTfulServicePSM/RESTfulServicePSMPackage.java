/**
 */
package RESTfulServicePSM;

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
 * @see RESTfulServicePSM.RESTfulServicePSMFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface RESTfulServicePSMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "RESTfulServicePSM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/eu.scasefp7.eclipse.mde.m2m/Metamodels/PSMMetamodel.ecore";

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
	RESTfulServicePSMPackage eINSTANCE = RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl.init();

	/**
	 * The meta object id for the '{@link RESTfulServicePSM.impl.HibernateActivityImpl <em>Hibernate Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RESTfulServicePSM.impl.HibernateActivityImpl
	 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getHibernateActivity()
	 * @generated
	 */
	int HIBERNATE_ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_ACTIVITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Hibernate Activity HTTP Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_ACTIVITY__HIBERNATE_ACTIVITY_HTTP_VERB = 1;

	/**
	 * The number of structural features of the '<em>Hibernate Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_ACTIVITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Hibernate Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RESTfulServicePSM.impl.HibernateAnnotationImpl <em>Hibernate Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RESTfulServicePSM.impl.HibernateAnnotationImpl
	 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getHibernateAnnotation()
	 * @generated
	 */
	int HIBERNATE_ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Hibernate Annotation Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_ANNOTATION__HIBERNATE_ANNOTATION_TEXT = 0;

	/**
	 * The number of structural features of the '<em>Hibernate Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_ANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Hibernate Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RESTfulServicePSM.impl.HibernateControllerImpl <em>Hibernate Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RESTfulServicePSM.impl.HibernateControllerImpl
	 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getHibernateController()
	 * @generated
	 */
	int HIBERNATE_CONTROLLER = 2;

	/**
	 * The feature id for the '<em><b>Has Hibernate Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_CONTROLLER__HAS_HIBERNATE_ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_CONTROLLER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Hibernate Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_CONTROLLER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Hibernate Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIBERNATE_CONTROLLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RESTfulServicePSM.impl.HTTPActivityImpl <em>HTTP Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RESTfulServicePSM.impl.HTTPActivityImpl
	 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getHTTPActivity()
	 * @generated
	 */
	int HTTP_ACTIVITY = 3;

	/**
	 * The feature id for the '<em><b>Is Mapped To Hibernate Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_ACTIVITY__IS_MAPPED_TO_HIBERNATE_ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Has HTTP Activity Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_ACTIVITY__HAS_HTTP_ACTIVITY_PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Activity HTTP Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_ACTIVITY__ACTIVITY_HTTP_VERB = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_ACTIVITY__NAME = 3;

	/**
	 * The feature id for the '<em><b>HTTP Activity URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_ACTIVITY__HTTP_ACTIVITY_URI = 4;

	/**
	 * The feature id for the '<em><b>Has HTTP Activity Handler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_ACTIVITY__HAS_HTTP_ACTIVITY_HANDLER = 5;

	/**
	 * The feature id for the '<em><b>HTTP Activity Has JAXRS Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_ACTIVITY__HTTP_ACTIVITY_HAS_JAXRS_ANNOTATION = 6;

	/**
	 * The number of structural features of the '<em>HTTP Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_ACTIVITY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>HTTP Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RESTfulServicePSM.impl.FunctionParameterImpl <em>Function Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RESTfulServicePSM.impl.FunctionParameterImpl
	 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getFunctionParameter()
	 * @generated
	 */
	int FUNCTION_PARAMETER = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMETER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>BIs Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMETER__BIS_UNIQUE = 2;

	/**
	 * The feature id for the '<em><b>BIs Return Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMETER__BIS_RETURN_PARAMETER = 3;

	/**
	 * The number of structural features of the '<em>Function Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMETER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Function Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RESTfulServicePSM.impl.HTTPActivityFunctionParameterImpl <em>HTTP Activity Function Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RESTfulServicePSM.impl.HTTPActivityFunctionParameterImpl
	 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getHTTPActivityFunctionParameter()
	 * @generated
	 */
	int HTTP_ACTIVITY_FUNCTION_PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_ACTIVITY_FUNCTION_PARAMETER__NAME = FUNCTION_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_ACTIVITY_FUNCTION_PARAMETER__TYPE = FUNCTION_PARAMETER__TYPE;

	/**
	 * The feature id for the '<em><b>BIs Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_ACTIVITY_FUNCTION_PARAMETER__BIS_UNIQUE = FUNCTION_PARAMETER__BIS_UNIQUE;

	/**
	 * The feature id for the '<em><b>BIs Return Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_ACTIVITY_FUNCTION_PARAMETER__BIS_RETURN_PARAMETER = FUNCTION_PARAMETER__BIS_RETURN_PARAMETER;

	/**
	 * The feature id for the '<em><b>HTTP Function Parameter Has JAXRS Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_ACTIVITY_FUNCTION_PARAMETER__HTTP_FUNCTION_PARAMETER_HAS_JAXRS_ANNOTATION = FUNCTION_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HTTP Activity Function Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_ACTIVITY_FUNCTION_PARAMETER_FEATURE_COUNT = FUNCTION_PARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>HTTP Activity Function Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_ACTIVITY_FUNCTION_PARAMETER_OPERATION_COUNT = FUNCTION_PARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RESTfulServicePSM.impl.HTTPActivityHandlerImpl <em>HTTP Activity Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RESTfulServicePSM.impl.HTTPActivityHandlerImpl
	 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getHTTPActivityHandler()
	 * @generated
	 */
	int HTTP_ACTIVITY_HANDLER = 5;

	/**
	 * The feature id for the '<em><b>Has Hypermedia Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_ACTIVITY_HANDLER__HAS_HYPERMEDIA_FUNCTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_ACTIVITY_HANDLER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Handler HTTP Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_ACTIVITY_HANDLER__HANDLER_HTTP_VERB = 2;

	/**
	 * The number of structural features of the '<em>HTTP Activity Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_ACTIVITY_HANDLER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>HTTP Activity Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_ACTIVITY_HANDLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RESTfulServicePSM.impl.JavaAlgoResourceControllerImpl <em>Java Algo Resource Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RESTfulServicePSM.impl.JavaAlgoResourceControllerImpl
	 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getJavaAlgoResourceController()
	 * @generated
	 */
	int JAVA_ALGO_RESOURCE_CONTROLLER = 6;

	/**
	 * The feature id for the '<em><b>Has Associated Algo Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ALGO_RESOURCE_CONTROLLER__HAS_ASSOCIATED_ALGO_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Java Algo RController Has HTTP Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ALGO_RESOURCE_CONTROLLER__JAVA_ALGO_RCONTROLLER_HAS_HTTP_ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ALGO_RESOURCE_CONTROLLER__NAME = 2;

	/**
	 * The feature id for the '<em><b>Controller URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ALGO_RESOURCE_CONTROLLER__CONTROLLER_URI = 3;

	/**
	 * The feature id for the '<em><b>Parent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ALGO_RESOURCE_CONTROLLER__PARENT_NAME = 4;

	/**
	 * The feature id for the '<em><b>Algo Controller Has JAXRS Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_HAS_JAXRS_ANNOTATION = 5;

	/**
	 * The number of structural features of the '<em>Java Algo Resource Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ALGO_RESOURCE_CONTROLLER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Java Algo Resource Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ALGO_RESOURCE_CONTROLLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RESTfulServicePSM.impl.JavaAlgoResourceModelImpl <em>Java Algo Resource Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RESTfulServicePSM.impl.JavaAlgoResourceModelImpl
	 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getJavaAlgoResourceModel()
	 * @generated
	 */
	int JAVA_ALGO_RESOURCE_MODEL = 7;

	/**
	 * The feature id for the '<em><b>Java Algo Model Has JAXB Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_JAXB_ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Java Algo Model Has Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Java Algo Model Has Setter Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_SETTER_FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Java Algo Model Has Getter Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_GETTER_FUNCTION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ALGO_RESOURCE_MODEL__NAME = 4;

	/**
	 * The feature id for the '<em><b>Parent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ALGO_RESOURCE_MODEL__PARENT_NAME = 5;

	/**
	 * The feature id for the '<em><b>Has Related Algo Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ALGO_RESOURCE_MODEL__HAS_RELATED_ALGO_MODEL = 6;

	/**
	 * The feature id for the '<em><b>Is Related Algo Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ALGO_RESOURCE_MODEL__IS_RELATED_ALGO_MODEL = 7;

	/**
	 * The number of structural features of the '<em>Java Algo Resource Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ALGO_RESOURCE_MODEL_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Java Algo Resource Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_ALGO_RESOURCE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RESTfulServicePSM.impl.JavaFunctionImpl <em>Java Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RESTfulServicePSM.impl.JavaFunctionImpl
	 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getJavaFunction()
	 * @generated
	 */
	int JAVA_FUNCTION = 8;

	/**
	 * The feature id for the '<em><b>Has Function Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FUNCTION__HAS_FUNCTION_PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FUNCTION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Java Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FUNCTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Java Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RESTfulServicePSM.impl.JavaGetterFunctionImpl <em>Java Getter Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RESTfulServicePSM.impl.JavaGetterFunctionImpl
	 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getJavaGetterFunction()
	 * @generated
	 */
	int JAVA_GETTER_FUNCTION = 9;

	/**
	 * The feature id for the '<em><b>Has Function Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GETTER_FUNCTION__HAS_FUNCTION_PARAMETER = JAVA_FUNCTION__HAS_FUNCTION_PARAMETER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GETTER_FUNCTION__NAME = JAVA_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Gets Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GETTER_FUNCTION__GETS_PROPERTY = JAVA_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Java Getter Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GETTER_FUNCTION_FEATURE_COUNT = JAVA_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Java Getter Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_GETTER_FUNCTION_OPERATION_COUNT = JAVA_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RESTfulServicePSM.impl.JavaHypermediaFunctionImpl <em>Java Hypermedia Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RESTfulServicePSM.impl.JavaHypermediaFunctionImpl
	 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getJavaHypermediaFunction()
	 * @generated
	 */
	int JAVA_HYPERMEDIA_FUNCTION = 10;

	/**
	 * The feature id for the '<em><b>Has PSM Hypermedia Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_HYPERMEDIA_FUNCTION__HAS_PSM_HYPERMEDIA_LINK = 0;

	/**
	 * The number of structural features of the '<em>Java Hypermedia Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_HYPERMEDIA_FUNCTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Java Hypermedia Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_HYPERMEDIA_FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RESTfulServicePSM.impl.JavaResourceControllerImpl <em>Java Resource Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RESTfulServicePSM.impl.JavaResourceControllerImpl
	 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getJavaResourceController()
	 * @generated
	 */
	int JAVA_RESOURCE_CONTROLLER = 11;

	/**
	 * The feature id for the '<em><b>Java RController Has JAXRS Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_CONTROLLER__JAVA_RCONTROLLER_HAS_JAXRS_ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Java RController Has HTTP Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_CONTROLLER__JAVA_RCONTROLLER_HAS_HTTP_ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Has Associated Java RModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_CONTROLLER__HAS_ASSOCIATED_JAVA_RMODEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_CONTROLLER__NAME = 3;

	/**
	 * The feature id for the '<em><b>Controller URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_CONTROLLER__CONTROLLER_URI = 4;

	/**
	 * The feature id for the '<em><b>Parent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_CONTROLLER__PARENT_NAME = 5;

	/**
	 * The number of structural features of the '<em>Java Resource Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_CONTROLLER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Java Resource Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_CONTROLLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RESTfulServicePSM.impl.JavaResourceControllerManagerImpl <em>Java Resource Controller Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RESTfulServicePSM.impl.JavaResourceControllerManagerImpl
	 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getJavaResourceControllerManager()
	 * @generated
	 */
	int JAVA_RESOURCE_CONTROLLER_MANAGER = 12;

	/**
	 * The feature id for the '<em><b>Java RC Manager Has JAXRS Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_CONTROLLER_MANAGER__JAVA_RC_MANAGER_HAS_JAXRS_ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Java RC Manager Has HTTP Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_CONTROLLER_MANAGER__JAVA_RC_MANAGER_HAS_HTTP_ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Has Associated RM Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_CONTROLLER_MANAGER__HAS_ASSOCIATED_RM_MANAGER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_CONTROLLER_MANAGER__NAME = 3;

	/**
	 * The feature id for the '<em><b>Controller URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_CONTROLLER_MANAGER__CONTROLLER_URI = 4;

	/**
	 * The feature id for the '<em><b>Parent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_CONTROLLER_MANAGER__PARENT_NAME = 5;

	/**
	 * The number of structural features of the '<em>Java Resource Controller Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_CONTROLLER_MANAGER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Java Resource Controller Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_CONTROLLER_MANAGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RESTfulServicePSM.impl.JavaResourceModelImpl <em>Java Resource Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RESTfulServicePSM.impl.JavaResourceModelImpl
	 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getJavaResourceModel()
	 * @generated
	 */
	int JAVA_RESOURCE_MODEL = 13;

	/**
	 * The feature id for the '<em><b>Java RModel Has JAXB Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_JAXB_ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Java RModel Has Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Has Related Java RM Manager</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_MODEL__HAS_RELATED_JAVA_RM_MANAGER = 2;

	/**
	 * The feature id for the '<em><b>Java RModel Has Hibernate Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_HIBERNATE_ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Java RModel Has Setter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_SETTER = 4;

	/**
	 * The feature id for the '<em><b>Java RModel Has Getter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_GETTER = 5;

	/**
	 * The feature id for the '<em><b>Has Related Java Algo Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_MODEL__HAS_RELATED_JAVA_ALGO_MODEL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_MODEL__NAME = 7;

	/**
	 * The feature id for the '<em><b>Parent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_MODEL__PARENT_NAME = 8;

	/**
	 * The number of structural features of the '<em>Java Resource Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_MODEL_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Java Resource Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RESTfulServicePSM.impl.JavaResourceModelManagerImpl <em>Java Resource Model Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RESTfulServicePSM.impl.JavaResourceModelManagerImpl
	 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getJavaResourceModelManager()
	 * @generated
	 */
	int JAVA_RESOURCE_MODEL_MANAGER = 14;

	/**
	 * The feature id for the '<em><b>Java RM Manager Has JAXB Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_JAXB_ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Java RM Manager Has Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Has Related Java RModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_MODEL_MANAGER__HAS_RELATED_JAVA_RMODEL = 2;

	/**
	 * The feature id for the '<em><b>Java RM Manager Has Setter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_SETTER = 3;

	/**
	 * The feature id for the '<em><b>Java RM Manager Has Getter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_GETTER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_MODEL_MANAGER__NAME = 5;

	/**
	 * The feature id for the '<em><b>Parent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_MODEL_MANAGER__PARENT_NAME = 6;

	/**
	 * The number of structural features of the '<em>Java Resource Model Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_MODEL_MANAGER_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Java Resource Model Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_RESOURCE_MODEL_MANAGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RESTfulServicePSM.impl.PSMComponentPropertyImpl <em>PSM Component Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RESTfulServicePSM.impl.PSMComponentPropertyImpl
	 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getPSMComponentProperty()
	 * @generated
	 */
	int PSM_COMPONENT_PROPERTY = 15;

	/**
	 * The feature id for the '<em><b>Property Has Hibernate Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_COMPONENT_PROPERTY__PROPERTY_HAS_HIBERNATE_ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_COMPONENT_PROPERTY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_COMPONENT_PROPERTY__TYPE = 2;

	/**
	 * The feature id for the '<em><b>BIs Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_COMPONENT_PROPERTY__BIS_UNIQUE = 3;

	/**
	 * The feature id for the '<em><b>BIs Naming Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_COMPONENT_PROPERTY__BIS_NAMING_PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>BIs Primary Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_COMPONENT_PROPERTY__BIS_PRIMARY_IDENTIFIER = 5;

	/**
	 * The number of structural features of the '<em>PSM Component Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_COMPONENT_PROPERTY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>PSM Component Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_COMPONENT_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RESTfulServicePSM.impl.JavaSetterFunctionImpl <em>Java Setter Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RESTfulServicePSM.impl.JavaSetterFunctionImpl
	 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getJavaSetterFunction()
	 * @generated
	 */
	int JAVA_SETTER_FUNCTION = 16;

	/**
	 * The feature id for the '<em><b>Has Function Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SETTER_FUNCTION__HAS_FUNCTION_PARAMETER = JAVA_FUNCTION__HAS_FUNCTION_PARAMETER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SETTER_FUNCTION__NAME = JAVA_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Sets Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SETTER_FUNCTION__SETS_PROPERTY = JAVA_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Setter Function Has JAXB Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SETTER_FUNCTION__SETTER_FUNCTION_HAS_JAXB_ANNOTATION = JAVA_FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Java Setter Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SETTER_FUNCTION_FEATURE_COUNT = JAVA_FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Java Setter Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SETTER_FUNCTION_OPERATION_COUNT = JAVA_FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link RESTfulServicePSM.impl.JAXBAnnotationImpl <em>JAXB Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RESTfulServicePSM.impl.JAXBAnnotationImpl
	 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getJAXBAnnotation()
	 * @generated
	 */
	int JAXB_ANNOTATION = 17;

	/**
	 * The feature id for the '<em><b>JAXB Annotation Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAXB_ANNOTATION__JAXB_ANNOTATION_TEXT = 0;

	/**
	 * The number of structural features of the '<em>JAXB Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAXB_ANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>JAXB Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAXB_ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RESTfulServicePSM.impl.JAXRSAnnotationImpl <em>JAXRS Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RESTfulServicePSM.impl.JAXRSAnnotationImpl
	 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getJAXRSAnnotation()
	 * @generated
	 */
	int JAXRS_ANNOTATION = 18;

	/**
	 * The feature id for the '<em><b>JAXRS Annotation Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAXRS_ANNOTATION__JAXRS_ANNOTATION_TEXT = 0;

	/**
	 * The number of structural features of the '<em>JAXRS Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAXRS_ANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>JAXRS Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAXRS_ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RESTfulServicePSM.impl.PSMHypermediaLinkImpl <em>PSM Hypermedia Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RESTfulServicePSM.impl.PSMHypermediaLinkImpl
	 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getPSMHypermediaLink()
	 * @generated
	 */
	int PSM_HYPERMEDIA_LINK = 19;

	/**
	 * The feature id for the '<em><b>Has Target Java Algo Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_HYPERMEDIA_LINK__HAS_TARGET_JAVA_ALGO_CONTROLLER = 0;

	/**
	 * The feature id for the '<em><b>Has Target Java RController</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_HYPERMEDIA_LINK__HAS_TARGET_JAVA_RCONTROLLER = 1;

	/**
	 * The feature id for the '<em><b>Has Target RC Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_HYPERMEDIA_LINK__HAS_TARGET_RC_MANAGER = 2;

	/**
	 * The feature id for the '<em><b>Link HTTP Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_HYPERMEDIA_LINK__LINK_HTTP_VERB = 3;

	/**
	 * The feature id for the '<em><b>Link Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_HYPERMEDIA_LINK__LINK_TYPE = 4;

	/**
	 * The number of structural features of the '<em>PSM Hypermedia Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_HYPERMEDIA_LINK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>PSM Hypermedia Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSM_HYPERMEDIA_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RESTfulServicePSM.impl.ServicePSMImpl <em>Service PSM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RESTfulServicePSM.impl.ServicePSMImpl
	 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getServicePSM()
	 * @generated
	 */
	int SERVICE_PSM = 20;

	/**
	 * The feature id for the '<em><b>Has Java RModel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PSM__HAS_JAVA_RMODEL = 0;

	/**
	 * The feature id for the '<em><b>Has Java RController</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PSM__HAS_JAVA_RCONTROLLER = 1;

	/**
	 * The feature id for the '<em><b>Has Java RC Manager</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PSM__HAS_JAVA_RC_MANAGER = 2;

	/**
	 * The feature id for the '<em><b>Has Java RM Manager</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PSM__HAS_JAVA_RM_MANAGER = 3;

	/**
	 * The feature id for the '<em><b>Has Java Algo Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PSM__HAS_JAVA_ALGO_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Has Java Algo Controller</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PSM__HAS_JAVA_ALGO_CONTROLLER = 5;

	/**
	 * The feature id for the '<em><b>Has Hibernate Controller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PSM__HAS_HIBERNATE_CONTROLLER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PSM__NAME = 7;

	/**
	 * The feature id for the '<em><b>Service Output Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PSM__SERVICE_OUTPUT_PATH = 8;

	/**
	 * The feature id for the '<em><b>Service Database IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PSM__SERVICE_DATABASE_IP = 9;

	/**
	 * The feature id for the '<em><b>Service Database Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PSM__SERVICE_DATABASE_PORT = 10;

	/**
	 * The feature id for the '<em><b>Service Database Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PSM__SERVICE_DATABASE_USERNAME = 11;

	/**
	 * The feature id for the '<em><b>Service Database Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PSM__SERVICE_DATABASE_PASSWORD = 12;

	/**
	 * The feature id for the '<em><b>Service Database Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PSM__SERVICE_DATABASE_TYPE = 13;

	/**
	 * The number of structural features of the '<em>Service PSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PSM_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Service PSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PSM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RESTfulServicePSM.HTTPVerb <em>HTTP Verb</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RESTfulServicePSM.HTTPVerb
	 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getHTTPVerb()
	 * @generated
	 */
	int HTTP_VERB = 22;

	/**
	 * The meta object id for the '{@link RESTfulServicePSM.MediaType <em>Media Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RESTfulServicePSM.MediaType
	 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getMediaType()
	 * @generated
	 */
	int MEDIA_TYPE = 23;

	/**
	 * The meta object id for the '{@link RESTfulServicePSM.LinkType <em>Link Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RESTfulServicePSM.LinkType
	 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getLinkType()
	 * @generated
	 */
	int LINK_TYPE = 24;


	/**
	 * Returns the meta object for class '{@link RESTfulServicePSM.HibernateActivity <em>Hibernate Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hibernate Activity</em>'.
	 * @see RESTfulServicePSM.HibernateActivity
	 * @generated
	 */
	EClass getHibernateActivity();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.HibernateActivity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RESTfulServicePSM.HibernateActivity#getName()
	 * @see #getHibernateActivity()
	 * @generated
	 */
	EAttribute getHibernateActivity_Name();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.HibernateActivity#getHibernateActivityHTTPVerb <em>Hibernate Activity HTTP Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hibernate Activity HTTP Verb</em>'.
	 * @see RESTfulServicePSM.HibernateActivity#getHibernateActivityHTTPVerb()
	 * @see #getHibernateActivity()
	 * @generated
	 */
	EAttribute getHibernateActivity_HibernateActivityHTTPVerb();

	/**
	 * Returns the meta object for class '{@link RESTfulServicePSM.HibernateAnnotation <em>Hibernate Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hibernate Annotation</em>'.
	 * @see RESTfulServicePSM.HibernateAnnotation
	 * @generated
	 */
	EClass getHibernateAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.HibernateAnnotation#getHibernateAnnotationText <em>Hibernate Annotation Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hibernate Annotation Text</em>'.
	 * @see RESTfulServicePSM.HibernateAnnotation#getHibernateAnnotationText()
	 * @see #getHibernateAnnotation()
	 * @generated
	 */
	EAttribute getHibernateAnnotation_HibernateAnnotationText();

	/**
	 * Returns the meta object for class '{@link RESTfulServicePSM.HibernateController <em>Hibernate Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hibernate Controller</em>'.
	 * @see RESTfulServicePSM.HibernateController
	 * @generated
	 */
	EClass getHibernateController();

	/**
	 * Returns the meta object for the containment reference list '{@link RESTfulServicePSM.HibernateController#getHasHibernateActivity <em>Has Hibernate Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Hibernate Activity</em>'.
	 * @see RESTfulServicePSM.HibernateController#getHasHibernateActivity()
	 * @see #getHibernateController()
	 * @generated
	 */
	EReference getHibernateController_HasHibernateActivity();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.HibernateController#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RESTfulServicePSM.HibernateController#getName()
	 * @see #getHibernateController()
	 * @generated
	 */
	EAttribute getHibernateController_Name();

	/**
	 * Returns the meta object for class '{@link RESTfulServicePSM.HTTPActivity <em>HTTP Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTTP Activity</em>'.
	 * @see RESTfulServicePSM.HTTPActivity
	 * @generated
	 */
	EClass getHTTPActivity();

	/**
	 * Returns the meta object for the reference '{@link RESTfulServicePSM.HTTPActivity#getIsMappedToHibernateActivity <em>Is Mapped To Hibernate Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Mapped To Hibernate Activity</em>'.
	 * @see RESTfulServicePSM.HTTPActivity#getIsMappedToHibernateActivity()
	 * @see #getHTTPActivity()
	 * @generated
	 */
	EReference getHTTPActivity_IsMappedToHibernateActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link RESTfulServicePSM.HTTPActivity#getHasHTTPActivityParameter <em>Has HTTP Activity Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has HTTP Activity Parameter</em>'.
	 * @see RESTfulServicePSM.HTTPActivity#getHasHTTPActivityParameter()
	 * @see #getHTTPActivity()
	 * @generated
	 */
	EReference getHTTPActivity_HasHTTPActivityParameter();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.HTTPActivity#getActivityHTTPVerb <em>Activity HTTP Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity HTTP Verb</em>'.
	 * @see RESTfulServicePSM.HTTPActivity#getActivityHTTPVerb()
	 * @see #getHTTPActivity()
	 * @generated
	 */
	EAttribute getHTTPActivity_ActivityHTTPVerb();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.HTTPActivity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RESTfulServicePSM.HTTPActivity#getName()
	 * @see #getHTTPActivity()
	 * @generated
	 */
	EAttribute getHTTPActivity_Name();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.HTTPActivity#getHTTPActivityURI <em>HTTP Activity URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>HTTP Activity URI</em>'.
	 * @see RESTfulServicePSM.HTTPActivity#getHTTPActivityURI()
	 * @see #getHTTPActivity()
	 * @generated
	 */
	EAttribute getHTTPActivity_HTTPActivityURI();

	/**
	 * Returns the meta object for the containment reference '{@link RESTfulServicePSM.HTTPActivity#getHasHTTPActivityHandler <em>Has HTTP Activity Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has HTTP Activity Handler</em>'.
	 * @see RESTfulServicePSM.HTTPActivity#getHasHTTPActivityHandler()
	 * @see #getHTTPActivity()
	 * @generated
	 */
	EReference getHTTPActivity_HasHTTPActivityHandler();

	/**
	 * Returns the meta object for the containment reference list '{@link RESTfulServicePSM.HTTPActivity#getHTTPActivityHasJAXRSAnnotation <em>HTTP Activity Has JAXRS Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>HTTP Activity Has JAXRS Annotation</em>'.
	 * @see RESTfulServicePSM.HTTPActivity#getHTTPActivityHasJAXRSAnnotation()
	 * @see #getHTTPActivity()
	 * @generated
	 */
	EReference getHTTPActivity_HTTPActivityHasJAXRSAnnotation();

	/**
	 * Returns the meta object for class '{@link RESTfulServicePSM.HTTPActivityFunctionParameter <em>HTTP Activity Function Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTTP Activity Function Parameter</em>'.
	 * @see RESTfulServicePSM.HTTPActivityFunctionParameter
	 * @generated
	 */
	EClass getHTTPActivityFunctionParameter();

	/**
	 * Returns the meta object for the containment reference '{@link RESTfulServicePSM.HTTPActivityFunctionParameter#getHTTPFunctionParameterHasJAXRSAnnotation <em>HTTP Function Parameter Has JAXRS Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>HTTP Function Parameter Has JAXRS Annotation</em>'.
	 * @see RESTfulServicePSM.HTTPActivityFunctionParameter#getHTTPFunctionParameterHasJAXRSAnnotation()
	 * @see #getHTTPActivityFunctionParameter()
	 * @generated
	 */
	EReference getHTTPActivityFunctionParameter_HTTPFunctionParameterHasJAXRSAnnotation();

	/**
	 * Returns the meta object for class '{@link RESTfulServicePSM.HTTPActivityHandler <em>HTTP Activity Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTTP Activity Handler</em>'.
	 * @see RESTfulServicePSM.HTTPActivityHandler
	 * @generated
	 */
	EClass getHTTPActivityHandler();

	/**
	 * Returns the meta object for the containment reference '{@link RESTfulServicePSM.HTTPActivityHandler#getHasHypermediaFunction <em>Has Hypermedia Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Hypermedia Function</em>'.
	 * @see RESTfulServicePSM.HTTPActivityHandler#getHasHypermediaFunction()
	 * @see #getHTTPActivityHandler()
	 * @generated
	 */
	EReference getHTTPActivityHandler_HasHypermediaFunction();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.HTTPActivityHandler#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RESTfulServicePSM.HTTPActivityHandler#getName()
	 * @see #getHTTPActivityHandler()
	 * @generated
	 */
	EAttribute getHTTPActivityHandler_Name();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.HTTPActivityHandler#getHandlerHTTPVerb <em>Handler HTTP Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handler HTTP Verb</em>'.
	 * @see RESTfulServicePSM.HTTPActivityHandler#getHandlerHTTPVerb()
	 * @see #getHTTPActivityHandler()
	 * @generated
	 */
	EAttribute getHTTPActivityHandler_HandlerHTTPVerb();

	/**
	 * Returns the meta object for class '{@link RESTfulServicePSM.JavaAlgoResourceController <em>Java Algo Resource Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Algo Resource Controller</em>'.
	 * @see RESTfulServicePSM.JavaAlgoResourceController
	 * @generated
	 */
	EClass getJavaAlgoResourceController();

	/**
	 * Returns the meta object for the reference '{@link RESTfulServicePSM.JavaAlgoResourceController#getHasAssociatedAlgoModel <em>Has Associated Algo Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Associated Algo Model</em>'.
	 * @see RESTfulServicePSM.JavaAlgoResourceController#getHasAssociatedAlgoModel()
	 * @see #getJavaAlgoResourceController()
	 * @generated
	 */
	EReference getJavaAlgoResourceController_HasAssociatedAlgoModel();

	/**
	 * Returns the meta object for the containment reference '{@link RESTfulServicePSM.JavaAlgoResourceController#getJavaAlgoRControllerHasHTTPActivity <em>Java Algo RController Has HTTP Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Java Algo RController Has HTTP Activity</em>'.
	 * @see RESTfulServicePSM.JavaAlgoResourceController#getJavaAlgoRControllerHasHTTPActivity()
	 * @see #getJavaAlgoResourceController()
	 * @generated
	 */
	EReference getJavaAlgoResourceController_JavaAlgoRControllerHasHTTPActivity();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.JavaAlgoResourceController#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RESTfulServicePSM.JavaAlgoResourceController#getName()
	 * @see #getJavaAlgoResourceController()
	 * @generated
	 */
	EAttribute getJavaAlgoResourceController_Name();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.JavaAlgoResourceController#getControllerURI <em>Controller URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controller URI</em>'.
	 * @see RESTfulServicePSM.JavaAlgoResourceController#getControllerURI()
	 * @see #getJavaAlgoResourceController()
	 * @generated
	 */
	EAttribute getJavaAlgoResourceController_ControllerURI();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.JavaAlgoResourceController#getParentName <em>Parent Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Name</em>'.
	 * @see RESTfulServicePSM.JavaAlgoResourceController#getParentName()
	 * @see #getJavaAlgoResourceController()
	 * @generated
	 */
	EAttribute getJavaAlgoResourceController_ParentName();

	/**
	 * Returns the meta object for the containment reference '{@link RESTfulServicePSM.JavaAlgoResourceController#getAlgoControllerHasJAXRSAnnotation <em>Algo Controller Has JAXRS Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Algo Controller Has JAXRS Annotation</em>'.
	 * @see RESTfulServicePSM.JavaAlgoResourceController#getAlgoControllerHasJAXRSAnnotation()
	 * @see #getJavaAlgoResourceController()
	 * @generated
	 */
	EReference getJavaAlgoResourceController_AlgoControllerHasJAXRSAnnotation();

	/**
	 * Returns the meta object for class '{@link RESTfulServicePSM.JavaAlgoResourceModel <em>Java Algo Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Algo Resource Model</em>'.
	 * @see RESTfulServicePSM.JavaAlgoResourceModel
	 * @generated
	 */
	EClass getJavaAlgoResourceModel();

	/**
	 * Returns the meta object for the containment reference '{@link RESTfulServicePSM.JavaAlgoResourceModel#getJavaAlgoModelHasJAXBAnnotation <em>Java Algo Model Has JAXB Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Java Algo Model Has JAXB Annotation</em>'.
	 * @see RESTfulServicePSM.JavaAlgoResourceModel#getJavaAlgoModelHasJAXBAnnotation()
	 * @see #getJavaAlgoResourceModel()
	 * @generated
	 */
	EReference getJavaAlgoResourceModel_JavaAlgoModelHasJAXBAnnotation();

	/**
	 * Returns the meta object for the containment reference '{@link RESTfulServicePSM.JavaAlgoResourceModel#getJavaAlgoModelHasProperty <em>Java Algo Model Has Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Java Algo Model Has Property</em>'.
	 * @see RESTfulServicePSM.JavaAlgoResourceModel#getJavaAlgoModelHasProperty()
	 * @see #getJavaAlgoResourceModel()
	 * @generated
	 */
	EReference getJavaAlgoResourceModel_JavaAlgoModelHasProperty();

	/**
	 * Returns the meta object for the containment reference '{@link RESTfulServicePSM.JavaAlgoResourceModel#getJavaAlgoModelHasSetterFunction <em>Java Algo Model Has Setter Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Java Algo Model Has Setter Function</em>'.
	 * @see RESTfulServicePSM.JavaAlgoResourceModel#getJavaAlgoModelHasSetterFunction()
	 * @see #getJavaAlgoResourceModel()
	 * @generated
	 */
	EReference getJavaAlgoResourceModel_JavaAlgoModelHasSetterFunction();

	/**
	 * Returns the meta object for the containment reference '{@link RESTfulServicePSM.JavaAlgoResourceModel#getJavaAlgoModelHasGetterFunction <em>Java Algo Model Has Getter Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Java Algo Model Has Getter Function</em>'.
	 * @see RESTfulServicePSM.JavaAlgoResourceModel#getJavaAlgoModelHasGetterFunction()
	 * @see #getJavaAlgoResourceModel()
	 * @generated
	 */
	EReference getJavaAlgoResourceModel_JavaAlgoModelHasGetterFunction();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.JavaAlgoResourceModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RESTfulServicePSM.JavaAlgoResourceModel#getName()
	 * @see #getJavaAlgoResourceModel()
	 * @generated
	 */
	EAttribute getJavaAlgoResourceModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.JavaAlgoResourceModel#getParentName <em>Parent Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Name</em>'.
	 * @see RESTfulServicePSM.JavaAlgoResourceModel#getParentName()
	 * @see #getJavaAlgoResourceModel()
	 * @generated
	 */
	EAttribute getJavaAlgoResourceModel_ParentName();

	/**
	 * Returns the meta object for the reference list '{@link RESTfulServicePSM.JavaAlgoResourceModel#getHasRelatedAlgoModel <em>Has Related Algo Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Related Algo Model</em>'.
	 * @see RESTfulServicePSM.JavaAlgoResourceModel#getHasRelatedAlgoModel()
	 * @see #getJavaAlgoResourceModel()
	 * @generated
	 */
	EReference getJavaAlgoResourceModel_HasRelatedAlgoModel();

	/**
	 * Returns the meta object for the reference list '{@link RESTfulServicePSM.JavaAlgoResourceModel#getIsRelatedAlgoModel <em>Is Related Algo Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Related Algo Model</em>'.
	 * @see RESTfulServicePSM.JavaAlgoResourceModel#getIsRelatedAlgoModel()
	 * @see #getJavaAlgoResourceModel()
	 * @generated
	 */
	EReference getJavaAlgoResourceModel_IsRelatedAlgoModel();

	/**
	 * Returns the meta object for class '{@link RESTfulServicePSM.JavaFunction <em>Java Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Function</em>'.
	 * @see RESTfulServicePSM.JavaFunction
	 * @generated
	 */
	EClass getJavaFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link RESTfulServicePSM.JavaFunction#getHasFunctionParameter <em>Has Function Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Function Parameter</em>'.
	 * @see RESTfulServicePSM.JavaFunction#getHasFunctionParameter()
	 * @see #getJavaFunction()
	 * @generated
	 */
	EReference getJavaFunction_HasFunctionParameter();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.JavaFunction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RESTfulServicePSM.JavaFunction#getName()
	 * @see #getJavaFunction()
	 * @generated
	 */
	EAttribute getJavaFunction_Name();

	/**
	 * Returns the meta object for class '{@link RESTfulServicePSM.JavaGetterFunction <em>Java Getter Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Getter Function</em>'.
	 * @see RESTfulServicePSM.JavaGetterFunction
	 * @generated
	 */
	EClass getJavaGetterFunction();

	/**
	 * Returns the meta object for the reference '{@link RESTfulServicePSM.JavaGetterFunction#getGetsProperty <em>Gets Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gets Property</em>'.
	 * @see RESTfulServicePSM.JavaGetterFunction#getGetsProperty()
	 * @see #getJavaGetterFunction()
	 * @generated
	 */
	EReference getJavaGetterFunction_GetsProperty();

	/**
	 * Returns the meta object for class '{@link RESTfulServicePSM.JavaHypermediaFunction <em>Java Hypermedia Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Hypermedia Function</em>'.
	 * @see RESTfulServicePSM.JavaHypermediaFunction
	 * @generated
	 */
	EClass getJavaHypermediaFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link RESTfulServicePSM.JavaHypermediaFunction#getHasPSMHypermediaLink <em>Has PSM Hypermedia Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has PSM Hypermedia Link</em>'.
	 * @see RESTfulServicePSM.JavaHypermediaFunction#getHasPSMHypermediaLink()
	 * @see #getJavaHypermediaFunction()
	 * @generated
	 */
	EReference getJavaHypermediaFunction_HasPSMHypermediaLink();

	/**
	 * Returns the meta object for class '{@link RESTfulServicePSM.JavaResourceController <em>Java Resource Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Resource Controller</em>'.
	 * @see RESTfulServicePSM.JavaResourceController
	 * @generated
	 */
	EClass getJavaResourceController();

	/**
	 * Returns the meta object for the containment reference '{@link RESTfulServicePSM.JavaResourceController#getJavaRControllerHasJAXRSAnnotation <em>Java RController Has JAXRS Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Java RController Has JAXRS Annotation</em>'.
	 * @see RESTfulServicePSM.JavaResourceController#getJavaRControllerHasJAXRSAnnotation()
	 * @see #getJavaResourceController()
	 * @generated
	 */
	EReference getJavaResourceController_JavaRControllerHasJAXRSAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link RESTfulServicePSM.JavaResourceController#getJavaRControllerHasHTTPActivity <em>Java RController Has HTTP Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Java RController Has HTTP Activity</em>'.
	 * @see RESTfulServicePSM.JavaResourceController#getJavaRControllerHasHTTPActivity()
	 * @see #getJavaResourceController()
	 * @generated
	 */
	EReference getJavaResourceController_JavaRControllerHasHTTPActivity();

	/**
	 * Returns the meta object for the reference '{@link RESTfulServicePSM.JavaResourceController#getHasAssociatedJavaRModel <em>Has Associated Java RModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Associated Java RModel</em>'.
	 * @see RESTfulServicePSM.JavaResourceController#getHasAssociatedJavaRModel()
	 * @see #getJavaResourceController()
	 * @generated
	 */
	EReference getJavaResourceController_HasAssociatedJavaRModel();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.JavaResourceController#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RESTfulServicePSM.JavaResourceController#getName()
	 * @see #getJavaResourceController()
	 * @generated
	 */
	EAttribute getJavaResourceController_Name();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.JavaResourceController#getControllerURI <em>Controller URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controller URI</em>'.
	 * @see RESTfulServicePSM.JavaResourceController#getControllerURI()
	 * @see #getJavaResourceController()
	 * @generated
	 */
	EAttribute getJavaResourceController_ControllerURI();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.JavaResourceController#getParentName <em>Parent Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Name</em>'.
	 * @see RESTfulServicePSM.JavaResourceController#getParentName()
	 * @see #getJavaResourceController()
	 * @generated
	 */
	EAttribute getJavaResourceController_ParentName();

	/**
	 * Returns the meta object for class '{@link RESTfulServicePSM.JavaResourceControllerManager <em>Java Resource Controller Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Resource Controller Manager</em>'.
	 * @see RESTfulServicePSM.JavaResourceControllerManager
	 * @generated
	 */
	EClass getJavaResourceControllerManager();

	/**
	 * Returns the meta object for the containment reference '{@link RESTfulServicePSM.JavaResourceControllerManager#getJavaRCManagerHasJAXRSAnnotation <em>Java RC Manager Has JAXRS Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Java RC Manager Has JAXRS Annotation</em>'.
	 * @see RESTfulServicePSM.JavaResourceControllerManager#getJavaRCManagerHasJAXRSAnnotation()
	 * @see #getJavaResourceControllerManager()
	 * @generated
	 */
	EReference getJavaResourceControllerManager_JavaRCManagerHasJAXRSAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link RESTfulServicePSM.JavaResourceControllerManager#getJavaRCManagerHasHTTPActivity <em>Java RC Manager Has HTTP Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Java RC Manager Has HTTP Activity</em>'.
	 * @see RESTfulServicePSM.JavaResourceControllerManager#getJavaRCManagerHasHTTPActivity()
	 * @see #getJavaResourceControllerManager()
	 * @generated
	 */
	EReference getJavaResourceControllerManager_JavaRCManagerHasHTTPActivity();

	/**
	 * Returns the meta object for the reference '{@link RESTfulServicePSM.JavaResourceControllerManager#getHasAssociatedRMManager <em>Has Associated RM Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Associated RM Manager</em>'.
	 * @see RESTfulServicePSM.JavaResourceControllerManager#getHasAssociatedRMManager()
	 * @see #getJavaResourceControllerManager()
	 * @generated
	 */
	EReference getJavaResourceControllerManager_HasAssociatedRMManager();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.JavaResourceControllerManager#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RESTfulServicePSM.JavaResourceControllerManager#getName()
	 * @see #getJavaResourceControllerManager()
	 * @generated
	 */
	EAttribute getJavaResourceControllerManager_Name();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.JavaResourceControllerManager#getControllerURI <em>Controller URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controller URI</em>'.
	 * @see RESTfulServicePSM.JavaResourceControllerManager#getControllerURI()
	 * @see #getJavaResourceControllerManager()
	 * @generated
	 */
	EAttribute getJavaResourceControllerManager_ControllerURI();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.JavaResourceControllerManager#getParentName <em>Parent Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Name</em>'.
	 * @see RESTfulServicePSM.JavaResourceControllerManager#getParentName()
	 * @see #getJavaResourceControllerManager()
	 * @generated
	 */
	EAttribute getJavaResourceControllerManager_ParentName();

	/**
	 * Returns the meta object for class '{@link RESTfulServicePSM.JavaResourceModel <em>Java Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Resource Model</em>'.
	 * @see RESTfulServicePSM.JavaResourceModel
	 * @generated
	 */
	EClass getJavaResourceModel();

	/**
	 * Returns the meta object for the containment reference '{@link RESTfulServicePSM.JavaResourceModel#getJavaRModelHasJAXBAnnotation <em>Java RModel Has JAXB Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Java RModel Has JAXB Annotation</em>'.
	 * @see RESTfulServicePSM.JavaResourceModel#getJavaRModelHasJAXBAnnotation()
	 * @see #getJavaResourceModel()
	 * @generated
	 */
	EReference getJavaResourceModel_JavaRModelHasJAXBAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link RESTfulServicePSM.JavaResourceModel#getJavaRModelHasProperty <em>Java RModel Has Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Java RModel Has Property</em>'.
	 * @see RESTfulServicePSM.JavaResourceModel#getJavaRModelHasProperty()
	 * @see #getJavaResourceModel()
	 * @generated
	 */
	EReference getJavaResourceModel_JavaRModelHasProperty();

	/**
	 * Returns the meta object for the reference list '{@link RESTfulServicePSM.JavaResourceModel#getHasRelatedJavaRMManager <em>Has Related Java RM Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Related Java RM Manager</em>'.
	 * @see RESTfulServicePSM.JavaResourceModel#getHasRelatedJavaRMManager()
	 * @see #getJavaResourceModel()
	 * @generated
	 */
	EReference getJavaResourceModel_HasRelatedJavaRMManager();

	/**
	 * Returns the meta object for the containment reference list '{@link RESTfulServicePSM.JavaResourceModel#getJavaRModelHasHibernateAnnotation <em>Java RModel Has Hibernate Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Java RModel Has Hibernate Annotation</em>'.
	 * @see RESTfulServicePSM.JavaResourceModel#getJavaRModelHasHibernateAnnotation()
	 * @see #getJavaResourceModel()
	 * @generated
	 */
	EReference getJavaResourceModel_JavaRModelHasHibernateAnnotation();

	/**
	 * Returns the meta object for the containment reference list '{@link RESTfulServicePSM.JavaResourceModel#getJavaRModelHasSetter <em>Java RModel Has Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Java RModel Has Setter</em>'.
	 * @see RESTfulServicePSM.JavaResourceModel#getJavaRModelHasSetter()
	 * @see #getJavaResourceModel()
	 * @generated
	 */
	EReference getJavaResourceModel_JavaRModelHasSetter();

	/**
	 * Returns the meta object for the containment reference list '{@link RESTfulServicePSM.JavaResourceModel#getJavaRModelHasGetter <em>Java RModel Has Getter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Java RModel Has Getter</em>'.
	 * @see RESTfulServicePSM.JavaResourceModel#getJavaRModelHasGetter()
	 * @see #getJavaResourceModel()
	 * @generated
	 */
	EReference getJavaResourceModel_JavaRModelHasGetter();

	/**
	 * Returns the meta object for the reference list '{@link RESTfulServicePSM.JavaResourceModel#getHasRelatedJavaAlgoModel <em>Has Related Java Algo Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Related Java Algo Model</em>'.
	 * @see RESTfulServicePSM.JavaResourceModel#getHasRelatedJavaAlgoModel()
	 * @see #getJavaResourceModel()
	 * @generated
	 */
	EReference getJavaResourceModel_HasRelatedJavaAlgoModel();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.JavaResourceModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RESTfulServicePSM.JavaResourceModel#getName()
	 * @see #getJavaResourceModel()
	 * @generated
	 */
	EAttribute getJavaResourceModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.JavaResourceModel#getParentName <em>Parent Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Name</em>'.
	 * @see RESTfulServicePSM.JavaResourceModel#getParentName()
	 * @see #getJavaResourceModel()
	 * @generated
	 */
	EAttribute getJavaResourceModel_ParentName();

	/**
	 * Returns the meta object for class '{@link RESTfulServicePSM.JavaResourceModelManager <em>Java Resource Model Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Resource Model Manager</em>'.
	 * @see RESTfulServicePSM.JavaResourceModelManager
	 * @generated
	 */
	EClass getJavaResourceModelManager();

	/**
	 * Returns the meta object for the containment reference '{@link RESTfulServicePSM.JavaResourceModelManager#getJavaRMManagerHasJAXBAnnotation <em>Java RM Manager Has JAXB Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Java RM Manager Has JAXB Annotation</em>'.
	 * @see RESTfulServicePSM.JavaResourceModelManager#getJavaRMManagerHasJAXBAnnotation()
	 * @see #getJavaResourceModelManager()
	 * @generated
	 */
	EReference getJavaResourceModelManager_JavaRMManagerHasJAXBAnnotation();

	/**
	 * Returns the meta object for the containment reference '{@link RESTfulServicePSM.JavaResourceModelManager#getJavaRMManagerHasProperty <em>Java RM Manager Has Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Java RM Manager Has Property</em>'.
	 * @see RESTfulServicePSM.JavaResourceModelManager#getJavaRMManagerHasProperty()
	 * @see #getJavaResourceModelManager()
	 * @generated
	 */
	EReference getJavaResourceModelManager_JavaRMManagerHasProperty();

	/**
	 * Returns the meta object for the reference '{@link RESTfulServicePSM.JavaResourceModelManager#getHasRelatedJavaRModel <em>Has Related Java RModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Related Java RModel</em>'.
	 * @see RESTfulServicePSM.JavaResourceModelManager#getHasRelatedJavaRModel()
	 * @see #getJavaResourceModelManager()
	 * @generated
	 */
	EReference getJavaResourceModelManager_HasRelatedJavaRModel();

	/**
	 * Returns the meta object for the containment reference '{@link RESTfulServicePSM.JavaResourceModelManager#getJavaRMManagerHasSetter <em>Java RM Manager Has Setter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Java RM Manager Has Setter</em>'.
	 * @see RESTfulServicePSM.JavaResourceModelManager#getJavaRMManagerHasSetter()
	 * @see #getJavaResourceModelManager()
	 * @generated
	 */
	EReference getJavaResourceModelManager_JavaRMManagerHasSetter();

	/**
	 * Returns the meta object for the containment reference '{@link RESTfulServicePSM.JavaResourceModelManager#getJavaRMManagerHasGetter <em>Java RM Manager Has Getter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Java RM Manager Has Getter</em>'.
	 * @see RESTfulServicePSM.JavaResourceModelManager#getJavaRMManagerHasGetter()
	 * @see #getJavaResourceModelManager()
	 * @generated
	 */
	EReference getJavaResourceModelManager_JavaRMManagerHasGetter();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.JavaResourceModelManager#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RESTfulServicePSM.JavaResourceModelManager#getName()
	 * @see #getJavaResourceModelManager()
	 * @generated
	 */
	EAttribute getJavaResourceModelManager_Name();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.JavaResourceModelManager#getParentName <em>Parent Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Name</em>'.
	 * @see RESTfulServicePSM.JavaResourceModelManager#getParentName()
	 * @see #getJavaResourceModelManager()
	 * @generated
	 */
	EAttribute getJavaResourceModelManager_ParentName();

	/**
	 * Returns the meta object for class '{@link RESTfulServicePSM.PSMComponentProperty <em>PSM Component Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PSM Component Property</em>'.
	 * @see RESTfulServicePSM.PSMComponentProperty
	 * @generated
	 */
	EClass getPSMComponentProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link RESTfulServicePSM.PSMComponentProperty#getPropertyHasHibernateAnnotation <em>Property Has Hibernate Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Has Hibernate Annotation</em>'.
	 * @see RESTfulServicePSM.PSMComponentProperty#getPropertyHasHibernateAnnotation()
	 * @see #getPSMComponentProperty()
	 * @generated
	 */
	EReference getPSMComponentProperty_PropertyHasHibernateAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.PSMComponentProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RESTfulServicePSM.PSMComponentProperty#getName()
	 * @see #getPSMComponentProperty()
	 * @generated
	 */
	EAttribute getPSMComponentProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.PSMComponentProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see RESTfulServicePSM.PSMComponentProperty#getType()
	 * @see #getPSMComponentProperty()
	 * @generated
	 */
	EAttribute getPSMComponentProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.PSMComponentProperty#isBIsUnique <em>BIs Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BIs Unique</em>'.
	 * @see RESTfulServicePSM.PSMComponentProperty#isBIsUnique()
	 * @see #getPSMComponentProperty()
	 * @generated
	 */
	EAttribute getPSMComponentProperty_BIsUnique();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.PSMComponentProperty#isBIsNamingProperty <em>BIs Naming Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BIs Naming Property</em>'.
	 * @see RESTfulServicePSM.PSMComponentProperty#isBIsNamingProperty()
	 * @see #getPSMComponentProperty()
	 * @generated
	 */
	EAttribute getPSMComponentProperty_BIsNamingProperty();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.PSMComponentProperty#isBIsPrimaryIdentifier <em>BIs Primary Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BIs Primary Identifier</em>'.
	 * @see RESTfulServicePSM.PSMComponentProperty#isBIsPrimaryIdentifier()
	 * @see #getPSMComponentProperty()
	 * @generated
	 */
	EAttribute getPSMComponentProperty_BIsPrimaryIdentifier();

	/**
	 * Returns the meta object for class '{@link RESTfulServicePSM.JavaSetterFunction <em>Java Setter Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Setter Function</em>'.
	 * @see RESTfulServicePSM.JavaSetterFunction
	 * @generated
	 */
	EClass getJavaSetterFunction();

	/**
	 * Returns the meta object for the reference '{@link RESTfulServicePSM.JavaSetterFunction#getSetsProperty <em>Sets Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sets Property</em>'.
	 * @see RESTfulServicePSM.JavaSetterFunction#getSetsProperty()
	 * @see #getJavaSetterFunction()
	 * @generated
	 */
	EReference getJavaSetterFunction_SetsProperty();

	/**
	 * Returns the meta object for the containment reference '{@link RESTfulServicePSM.JavaSetterFunction#getSetterFunctionHasJAXBAnnotation <em>Setter Function Has JAXB Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Setter Function Has JAXB Annotation</em>'.
	 * @see RESTfulServicePSM.JavaSetterFunction#getSetterFunctionHasJAXBAnnotation()
	 * @see #getJavaSetterFunction()
	 * @generated
	 */
	EReference getJavaSetterFunction_SetterFunctionHasJAXBAnnotation();

	/**
	 * Returns the meta object for class '{@link RESTfulServicePSM.JAXBAnnotation <em>JAXB Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JAXB Annotation</em>'.
	 * @see RESTfulServicePSM.JAXBAnnotation
	 * @generated
	 */
	EClass getJAXBAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.JAXBAnnotation#getJAXBAnnotationText <em>JAXB Annotation Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>JAXB Annotation Text</em>'.
	 * @see RESTfulServicePSM.JAXBAnnotation#getJAXBAnnotationText()
	 * @see #getJAXBAnnotation()
	 * @generated
	 */
	EAttribute getJAXBAnnotation_JAXBAnnotationText();

	/**
	 * Returns the meta object for class '{@link RESTfulServicePSM.JAXRSAnnotation <em>JAXRS Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JAXRS Annotation</em>'.
	 * @see RESTfulServicePSM.JAXRSAnnotation
	 * @generated
	 */
	EClass getJAXRSAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.JAXRSAnnotation#getJAXRSAnnotationText <em>JAXRS Annotation Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>JAXRS Annotation Text</em>'.
	 * @see RESTfulServicePSM.JAXRSAnnotation#getJAXRSAnnotationText()
	 * @see #getJAXRSAnnotation()
	 * @generated
	 */
	EAttribute getJAXRSAnnotation_JAXRSAnnotationText();

	/**
	 * Returns the meta object for class '{@link RESTfulServicePSM.PSMHypermediaLink <em>PSM Hypermedia Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PSM Hypermedia Link</em>'.
	 * @see RESTfulServicePSM.PSMHypermediaLink
	 * @generated
	 */
	EClass getPSMHypermediaLink();

	/**
	 * Returns the meta object for the reference '{@link RESTfulServicePSM.PSMHypermediaLink#getHasTargetJavaAlgoController <em>Has Target Java Algo Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Target Java Algo Controller</em>'.
	 * @see RESTfulServicePSM.PSMHypermediaLink#getHasTargetJavaAlgoController()
	 * @see #getPSMHypermediaLink()
	 * @generated
	 */
	EReference getPSMHypermediaLink_HasTargetJavaAlgoController();

	/**
	 * Returns the meta object for the reference '{@link RESTfulServicePSM.PSMHypermediaLink#getHasTargetJavaRController <em>Has Target Java RController</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Target Java RController</em>'.
	 * @see RESTfulServicePSM.PSMHypermediaLink#getHasTargetJavaRController()
	 * @see #getPSMHypermediaLink()
	 * @generated
	 */
	EReference getPSMHypermediaLink_HasTargetJavaRController();

	/**
	 * Returns the meta object for the reference '{@link RESTfulServicePSM.PSMHypermediaLink#getHasTargetRCManager <em>Has Target RC Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Target RC Manager</em>'.
	 * @see RESTfulServicePSM.PSMHypermediaLink#getHasTargetRCManager()
	 * @see #getPSMHypermediaLink()
	 * @generated
	 */
	EReference getPSMHypermediaLink_HasTargetRCManager();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.PSMHypermediaLink#getLinkHTTPVerb <em>Link HTTP Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link HTTP Verb</em>'.
	 * @see RESTfulServicePSM.PSMHypermediaLink#getLinkHTTPVerb()
	 * @see #getPSMHypermediaLink()
	 * @generated
	 */
	EAttribute getPSMHypermediaLink_LinkHTTPVerb();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.PSMHypermediaLink#getLinkType <em>Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Type</em>'.
	 * @see RESTfulServicePSM.PSMHypermediaLink#getLinkType()
	 * @see #getPSMHypermediaLink()
	 * @generated
	 */
	EAttribute getPSMHypermediaLink_LinkType();

	/**
	 * Returns the meta object for class '{@link RESTfulServicePSM.ServicePSM <em>Service PSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service PSM</em>'.
	 * @see RESTfulServicePSM.ServicePSM
	 * @generated
	 */
	EClass getServicePSM();

	/**
	 * Returns the meta object for the containment reference list '{@link RESTfulServicePSM.ServicePSM#getHasJavaRModel <em>Has Java RModel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Java RModel</em>'.
	 * @see RESTfulServicePSM.ServicePSM#getHasJavaRModel()
	 * @see #getServicePSM()
	 * @generated
	 */
	EReference getServicePSM_HasJavaRModel();

	/**
	 * Returns the meta object for the containment reference list '{@link RESTfulServicePSM.ServicePSM#getHasJavaRController <em>Has Java RController</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Java RController</em>'.
	 * @see RESTfulServicePSM.ServicePSM#getHasJavaRController()
	 * @see #getServicePSM()
	 * @generated
	 */
	EReference getServicePSM_HasJavaRController();

	/**
	 * Returns the meta object for the containment reference list '{@link RESTfulServicePSM.ServicePSM#getHasJavaRCManager <em>Has Java RC Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Java RC Manager</em>'.
	 * @see RESTfulServicePSM.ServicePSM#getHasJavaRCManager()
	 * @see #getServicePSM()
	 * @generated
	 */
	EReference getServicePSM_HasJavaRCManager();

	/**
	 * Returns the meta object for the containment reference list '{@link RESTfulServicePSM.ServicePSM#getHasJavaRMManager <em>Has Java RM Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Java RM Manager</em>'.
	 * @see RESTfulServicePSM.ServicePSM#getHasJavaRMManager()
	 * @see #getServicePSM()
	 * @generated
	 */
	EReference getServicePSM_HasJavaRMManager();

	/**
	 * Returns the meta object for the containment reference list '{@link RESTfulServicePSM.ServicePSM#getHasJavaAlgoModel <em>Has Java Algo Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Java Algo Model</em>'.
	 * @see RESTfulServicePSM.ServicePSM#getHasJavaAlgoModel()
	 * @see #getServicePSM()
	 * @generated
	 */
	EReference getServicePSM_HasJavaAlgoModel();

	/**
	 * Returns the meta object for the containment reference list '{@link RESTfulServicePSM.ServicePSM#getHasJavaAlgoController <em>Has Java Algo Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Java Algo Controller</em>'.
	 * @see RESTfulServicePSM.ServicePSM#getHasJavaAlgoController()
	 * @see #getServicePSM()
	 * @generated
	 */
	EReference getServicePSM_HasJavaAlgoController();

	/**
	 * Returns the meta object for the containment reference '{@link RESTfulServicePSM.ServicePSM#getHasHibernateController <em>Has Hibernate Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Hibernate Controller</em>'.
	 * @see RESTfulServicePSM.ServicePSM#getHasHibernateController()
	 * @see #getServicePSM()
	 * @generated
	 */
	EReference getServicePSM_HasHibernateController();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.ServicePSM#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RESTfulServicePSM.ServicePSM#getName()
	 * @see #getServicePSM()
	 * @generated
	 */
	EAttribute getServicePSM_Name();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.ServicePSM#getServiceOutputPath <em>Service Output Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Output Path</em>'.
	 * @see RESTfulServicePSM.ServicePSM#getServiceOutputPath()
	 * @see #getServicePSM()
	 * @generated
	 */
	EAttribute getServicePSM_ServiceOutputPath();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.ServicePSM#getServiceDatabaseIP <em>Service Database IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Database IP</em>'.
	 * @see RESTfulServicePSM.ServicePSM#getServiceDatabaseIP()
	 * @see #getServicePSM()
	 * @generated
	 */
	EAttribute getServicePSM_ServiceDatabaseIP();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.ServicePSM#getServiceDatabasePort <em>Service Database Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Database Port</em>'.
	 * @see RESTfulServicePSM.ServicePSM#getServiceDatabasePort()
	 * @see #getServicePSM()
	 * @generated
	 */
	EAttribute getServicePSM_ServiceDatabasePort();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.ServicePSM#getServiceDatabaseUsername <em>Service Database Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Database Username</em>'.
	 * @see RESTfulServicePSM.ServicePSM#getServiceDatabaseUsername()
	 * @see #getServicePSM()
	 * @generated
	 */
	EAttribute getServicePSM_ServiceDatabaseUsername();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.ServicePSM#getServiceDatabasePassword <em>Service Database Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Database Password</em>'.
	 * @see RESTfulServicePSM.ServicePSM#getServiceDatabasePassword()
	 * @see #getServicePSM()
	 * @generated
	 */
	EAttribute getServicePSM_ServiceDatabasePassword();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.ServicePSM#getServiceDatabaseType <em>Service Database Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Database Type</em>'.
	 * @see RESTfulServicePSM.ServicePSM#getServiceDatabaseType()
	 * @see #getServicePSM()
	 * @generated
	 */
	EAttribute getServicePSM_ServiceDatabaseType();

	/**
	 * Returns the meta object for class '{@link RESTfulServicePSM.FunctionParameter <em>Function Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Parameter</em>'.
	 * @see RESTfulServicePSM.FunctionParameter
	 * @generated
	 */
	EClass getFunctionParameter();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.FunctionParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RESTfulServicePSM.FunctionParameter#getName()
	 * @see #getFunctionParameter()
	 * @generated
	 */
	EAttribute getFunctionParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.FunctionParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see RESTfulServicePSM.FunctionParameter#getType()
	 * @see #getFunctionParameter()
	 * @generated
	 */
	EAttribute getFunctionParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.FunctionParameter#isBIsUnique <em>BIs Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BIs Unique</em>'.
	 * @see RESTfulServicePSM.FunctionParameter#isBIsUnique()
	 * @see #getFunctionParameter()
	 * @generated
	 */
	EAttribute getFunctionParameter_BIsUnique();

	/**
	 * Returns the meta object for the attribute '{@link RESTfulServicePSM.FunctionParameter#isBIsReturnParameter <em>BIs Return Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BIs Return Parameter</em>'.
	 * @see RESTfulServicePSM.FunctionParameter#isBIsReturnParameter()
	 * @see #getFunctionParameter()
	 * @generated
	 */
	EAttribute getFunctionParameter_BIsReturnParameter();

	/**
	 * Returns the meta object for enum '{@link RESTfulServicePSM.HTTPVerb <em>HTTP Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>HTTP Verb</em>'.
	 * @see RESTfulServicePSM.HTTPVerb
	 * @generated
	 */
	EEnum getHTTPVerb();

	/**
	 * Returns the meta object for enum '{@link RESTfulServicePSM.MediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Media Type</em>'.
	 * @see RESTfulServicePSM.MediaType
	 * @generated
	 */
	EEnum getMediaType();

	/**
	 * Returns the meta object for enum '{@link RESTfulServicePSM.LinkType <em>Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Link Type</em>'.
	 * @see RESTfulServicePSM.LinkType
	 * @generated
	 */
	EEnum getLinkType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RESTfulServicePSMFactory getRESTfulServicePSMFactory();

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
		 * The meta object literal for the '{@link RESTfulServicePSM.impl.HibernateActivityImpl <em>Hibernate Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RESTfulServicePSM.impl.HibernateActivityImpl
		 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getHibernateActivity()
		 * @generated
		 */
		EClass HIBERNATE_ACTIVITY = eINSTANCE.getHibernateActivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIBERNATE_ACTIVITY__NAME = eINSTANCE.getHibernateActivity_Name();

		/**
		 * The meta object literal for the '<em><b>Hibernate Activity HTTP Verb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIBERNATE_ACTIVITY__HIBERNATE_ACTIVITY_HTTP_VERB = eINSTANCE.getHibernateActivity_HibernateActivityHTTPVerb();

		/**
		 * The meta object literal for the '{@link RESTfulServicePSM.impl.HibernateAnnotationImpl <em>Hibernate Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RESTfulServicePSM.impl.HibernateAnnotationImpl
		 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getHibernateAnnotation()
		 * @generated
		 */
		EClass HIBERNATE_ANNOTATION = eINSTANCE.getHibernateAnnotation();

		/**
		 * The meta object literal for the '<em><b>Hibernate Annotation Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIBERNATE_ANNOTATION__HIBERNATE_ANNOTATION_TEXT = eINSTANCE.getHibernateAnnotation_HibernateAnnotationText();

		/**
		 * The meta object literal for the '{@link RESTfulServicePSM.impl.HibernateControllerImpl <em>Hibernate Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RESTfulServicePSM.impl.HibernateControllerImpl
		 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getHibernateController()
		 * @generated
		 */
		EClass HIBERNATE_CONTROLLER = eINSTANCE.getHibernateController();

		/**
		 * The meta object literal for the '<em><b>Has Hibernate Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIBERNATE_CONTROLLER__HAS_HIBERNATE_ACTIVITY = eINSTANCE.getHibernateController_HasHibernateActivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIBERNATE_CONTROLLER__NAME = eINSTANCE.getHibernateController_Name();

		/**
		 * The meta object literal for the '{@link RESTfulServicePSM.impl.HTTPActivityImpl <em>HTTP Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RESTfulServicePSM.impl.HTTPActivityImpl
		 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getHTTPActivity()
		 * @generated
		 */
		EClass HTTP_ACTIVITY = eINSTANCE.getHTTPActivity();

		/**
		 * The meta object literal for the '<em><b>Is Mapped To Hibernate Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_ACTIVITY__IS_MAPPED_TO_HIBERNATE_ACTIVITY = eINSTANCE.getHTTPActivity_IsMappedToHibernateActivity();

		/**
		 * The meta object literal for the '<em><b>Has HTTP Activity Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_ACTIVITY__HAS_HTTP_ACTIVITY_PARAMETER = eINSTANCE.getHTTPActivity_HasHTTPActivityParameter();

		/**
		 * The meta object literal for the '<em><b>Activity HTTP Verb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_ACTIVITY__ACTIVITY_HTTP_VERB = eINSTANCE.getHTTPActivity_ActivityHTTPVerb();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_ACTIVITY__NAME = eINSTANCE.getHTTPActivity_Name();

		/**
		 * The meta object literal for the '<em><b>HTTP Activity URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_ACTIVITY__HTTP_ACTIVITY_URI = eINSTANCE.getHTTPActivity_HTTPActivityURI();

		/**
		 * The meta object literal for the '<em><b>Has HTTP Activity Handler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_ACTIVITY__HAS_HTTP_ACTIVITY_HANDLER = eINSTANCE.getHTTPActivity_HasHTTPActivityHandler();

		/**
		 * The meta object literal for the '<em><b>HTTP Activity Has JAXRS Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_ACTIVITY__HTTP_ACTIVITY_HAS_JAXRS_ANNOTATION = eINSTANCE.getHTTPActivity_HTTPActivityHasJAXRSAnnotation();

		/**
		 * The meta object literal for the '{@link RESTfulServicePSM.impl.HTTPActivityFunctionParameterImpl <em>HTTP Activity Function Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RESTfulServicePSM.impl.HTTPActivityFunctionParameterImpl
		 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getHTTPActivityFunctionParameter()
		 * @generated
		 */
		EClass HTTP_ACTIVITY_FUNCTION_PARAMETER = eINSTANCE.getHTTPActivityFunctionParameter();

		/**
		 * The meta object literal for the '<em><b>HTTP Function Parameter Has JAXRS Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_ACTIVITY_FUNCTION_PARAMETER__HTTP_FUNCTION_PARAMETER_HAS_JAXRS_ANNOTATION = eINSTANCE.getHTTPActivityFunctionParameter_HTTPFunctionParameterHasJAXRSAnnotation();

		/**
		 * The meta object literal for the '{@link RESTfulServicePSM.impl.HTTPActivityHandlerImpl <em>HTTP Activity Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RESTfulServicePSM.impl.HTTPActivityHandlerImpl
		 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getHTTPActivityHandler()
		 * @generated
		 */
		EClass HTTP_ACTIVITY_HANDLER = eINSTANCE.getHTTPActivityHandler();

		/**
		 * The meta object literal for the '<em><b>Has Hypermedia Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTTP_ACTIVITY_HANDLER__HAS_HYPERMEDIA_FUNCTION = eINSTANCE.getHTTPActivityHandler_HasHypermediaFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_ACTIVITY_HANDLER__NAME = eINSTANCE.getHTTPActivityHandler_Name();

		/**
		 * The meta object literal for the '<em><b>Handler HTTP Verb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_ACTIVITY_HANDLER__HANDLER_HTTP_VERB = eINSTANCE.getHTTPActivityHandler_HandlerHTTPVerb();

		/**
		 * The meta object literal for the '{@link RESTfulServicePSM.impl.JavaAlgoResourceControllerImpl <em>Java Algo Resource Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RESTfulServicePSM.impl.JavaAlgoResourceControllerImpl
		 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getJavaAlgoResourceController()
		 * @generated
		 */
		EClass JAVA_ALGO_RESOURCE_CONTROLLER = eINSTANCE.getJavaAlgoResourceController();

		/**
		 * The meta object literal for the '<em><b>Has Associated Algo Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_ALGO_RESOURCE_CONTROLLER__HAS_ASSOCIATED_ALGO_MODEL = eINSTANCE.getJavaAlgoResourceController_HasAssociatedAlgoModel();

		/**
		 * The meta object literal for the '<em><b>Java Algo RController Has HTTP Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_ALGO_RESOURCE_CONTROLLER__JAVA_ALGO_RCONTROLLER_HAS_HTTP_ACTIVITY = eINSTANCE.getJavaAlgoResourceController_JavaAlgoRControllerHasHTTPActivity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_ALGO_RESOURCE_CONTROLLER__NAME = eINSTANCE.getJavaAlgoResourceController_Name();

		/**
		 * The meta object literal for the '<em><b>Controller URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_ALGO_RESOURCE_CONTROLLER__CONTROLLER_URI = eINSTANCE.getJavaAlgoResourceController_ControllerURI();

		/**
		 * The meta object literal for the '<em><b>Parent Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_ALGO_RESOURCE_CONTROLLER__PARENT_NAME = eINSTANCE.getJavaAlgoResourceController_ParentName();

		/**
		 * The meta object literal for the '<em><b>Algo Controller Has JAXRS Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_HAS_JAXRS_ANNOTATION = eINSTANCE.getJavaAlgoResourceController_AlgoControllerHasJAXRSAnnotation();

		/**
		 * The meta object literal for the '{@link RESTfulServicePSM.impl.JavaAlgoResourceModelImpl <em>Java Algo Resource Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RESTfulServicePSM.impl.JavaAlgoResourceModelImpl
		 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getJavaAlgoResourceModel()
		 * @generated
		 */
		EClass JAVA_ALGO_RESOURCE_MODEL = eINSTANCE.getJavaAlgoResourceModel();

		/**
		 * The meta object literal for the '<em><b>Java Algo Model Has JAXB Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_JAXB_ANNOTATION = eINSTANCE.getJavaAlgoResourceModel_JavaAlgoModelHasJAXBAnnotation();

		/**
		 * The meta object literal for the '<em><b>Java Algo Model Has Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_PROPERTY = eINSTANCE.getJavaAlgoResourceModel_JavaAlgoModelHasProperty();

		/**
		 * The meta object literal for the '<em><b>Java Algo Model Has Setter Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_SETTER_FUNCTION = eINSTANCE.getJavaAlgoResourceModel_JavaAlgoModelHasSetterFunction();

		/**
		 * The meta object literal for the '<em><b>Java Algo Model Has Getter Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_GETTER_FUNCTION = eINSTANCE.getJavaAlgoResourceModel_JavaAlgoModelHasGetterFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_ALGO_RESOURCE_MODEL__NAME = eINSTANCE.getJavaAlgoResourceModel_Name();

		/**
		 * The meta object literal for the '<em><b>Parent Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_ALGO_RESOURCE_MODEL__PARENT_NAME = eINSTANCE.getJavaAlgoResourceModel_ParentName();

		/**
		 * The meta object literal for the '<em><b>Has Related Algo Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_ALGO_RESOURCE_MODEL__HAS_RELATED_ALGO_MODEL = eINSTANCE.getJavaAlgoResourceModel_HasRelatedAlgoModel();

		/**
		 * The meta object literal for the '<em><b>Is Related Algo Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_ALGO_RESOURCE_MODEL__IS_RELATED_ALGO_MODEL = eINSTANCE.getJavaAlgoResourceModel_IsRelatedAlgoModel();

		/**
		 * The meta object literal for the '{@link RESTfulServicePSM.impl.JavaFunctionImpl <em>Java Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RESTfulServicePSM.impl.JavaFunctionImpl
		 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getJavaFunction()
		 * @generated
		 */
		EClass JAVA_FUNCTION = eINSTANCE.getJavaFunction();

		/**
		 * The meta object literal for the '<em><b>Has Function Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_FUNCTION__HAS_FUNCTION_PARAMETER = eINSTANCE.getJavaFunction_HasFunctionParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_FUNCTION__NAME = eINSTANCE.getJavaFunction_Name();

		/**
		 * The meta object literal for the '{@link RESTfulServicePSM.impl.JavaGetterFunctionImpl <em>Java Getter Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RESTfulServicePSM.impl.JavaGetterFunctionImpl
		 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getJavaGetterFunction()
		 * @generated
		 */
		EClass JAVA_GETTER_FUNCTION = eINSTANCE.getJavaGetterFunction();

		/**
		 * The meta object literal for the '<em><b>Gets Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_GETTER_FUNCTION__GETS_PROPERTY = eINSTANCE.getJavaGetterFunction_GetsProperty();

		/**
		 * The meta object literal for the '{@link RESTfulServicePSM.impl.JavaHypermediaFunctionImpl <em>Java Hypermedia Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RESTfulServicePSM.impl.JavaHypermediaFunctionImpl
		 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getJavaHypermediaFunction()
		 * @generated
		 */
		EClass JAVA_HYPERMEDIA_FUNCTION = eINSTANCE.getJavaHypermediaFunction();

		/**
		 * The meta object literal for the '<em><b>Has PSM Hypermedia Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_HYPERMEDIA_FUNCTION__HAS_PSM_HYPERMEDIA_LINK = eINSTANCE.getJavaHypermediaFunction_HasPSMHypermediaLink();

		/**
		 * The meta object literal for the '{@link RESTfulServicePSM.impl.JavaResourceControllerImpl <em>Java Resource Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RESTfulServicePSM.impl.JavaResourceControllerImpl
		 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getJavaResourceController()
		 * @generated
		 */
		EClass JAVA_RESOURCE_CONTROLLER = eINSTANCE.getJavaResourceController();

		/**
		 * The meta object literal for the '<em><b>Java RController Has JAXRS Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_RESOURCE_CONTROLLER__JAVA_RCONTROLLER_HAS_JAXRS_ANNOTATION = eINSTANCE.getJavaResourceController_JavaRControllerHasJAXRSAnnotation();

		/**
		 * The meta object literal for the '<em><b>Java RController Has HTTP Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_RESOURCE_CONTROLLER__JAVA_RCONTROLLER_HAS_HTTP_ACTIVITY = eINSTANCE.getJavaResourceController_JavaRControllerHasHTTPActivity();

		/**
		 * The meta object literal for the '<em><b>Has Associated Java RModel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_RESOURCE_CONTROLLER__HAS_ASSOCIATED_JAVA_RMODEL = eINSTANCE.getJavaResourceController_HasAssociatedJavaRModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_RESOURCE_CONTROLLER__NAME = eINSTANCE.getJavaResourceController_Name();

		/**
		 * The meta object literal for the '<em><b>Controller URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_RESOURCE_CONTROLLER__CONTROLLER_URI = eINSTANCE.getJavaResourceController_ControllerURI();

		/**
		 * The meta object literal for the '<em><b>Parent Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_RESOURCE_CONTROLLER__PARENT_NAME = eINSTANCE.getJavaResourceController_ParentName();

		/**
		 * The meta object literal for the '{@link RESTfulServicePSM.impl.JavaResourceControllerManagerImpl <em>Java Resource Controller Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RESTfulServicePSM.impl.JavaResourceControllerManagerImpl
		 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getJavaResourceControllerManager()
		 * @generated
		 */
		EClass JAVA_RESOURCE_CONTROLLER_MANAGER = eINSTANCE.getJavaResourceControllerManager();

		/**
		 * The meta object literal for the '<em><b>Java RC Manager Has JAXRS Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_RESOURCE_CONTROLLER_MANAGER__JAVA_RC_MANAGER_HAS_JAXRS_ANNOTATION = eINSTANCE.getJavaResourceControllerManager_JavaRCManagerHasJAXRSAnnotation();

		/**
		 * The meta object literal for the '<em><b>Java RC Manager Has HTTP Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_RESOURCE_CONTROLLER_MANAGER__JAVA_RC_MANAGER_HAS_HTTP_ACTIVITY = eINSTANCE.getJavaResourceControllerManager_JavaRCManagerHasHTTPActivity();

		/**
		 * The meta object literal for the '<em><b>Has Associated RM Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_RESOURCE_CONTROLLER_MANAGER__HAS_ASSOCIATED_RM_MANAGER = eINSTANCE.getJavaResourceControllerManager_HasAssociatedRMManager();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_RESOURCE_CONTROLLER_MANAGER__NAME = eINSTANCE.getJavaResourceControllerManager_Name();

		/**
		 * The meta object literal for the '<em><b>Controller URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_RESOURCE_CONTROLLER_MANAGER__CONTROLLER_URI = eINSTANCE.getJavaResourceControllerManager_ControllerURI();

		/**
		 * The meta object literal for the '<em><b>Parent Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_RESOURCE_CONTROLLER_MANAGER__PARENT_NAME = eINSTANCE.getJavaResourceControllerManager_ParentName();

		/**
		 * The meta object literal for the '{@link RESTfulServicePSM.impl.JavaResourceModelImpl <em>Java Resource Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RESTfulServicePSM.impl.JavaResourceModelImpl
		 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getJavaResourceModel()
		 * @generated
		 */
		EClass JAVA_RESOURCE_MODEL = eINSTANCE.getJavaResourceModel();

		/**
		 * The meta object literal for the '<em><b>Java RModel Has JAXB Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_JAXB_ANNOTATION = eINSTANCE.getJavaResourceModel_JavaRModelHasJAXBAnnotation();

		/**
		 * The meta object literal for the '<em><b>Java RModel Has Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_PROPERTY = eINSTANCE.getJavaResourceModel_JavaRModelHasProperty();

		/**
		 * The meta object literal for the '<em><b>Has Related Java RM Manager</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_RESOURCE_MODEL__HAS_RELATED_JAVA_RM_MANAGER = eINSTANCE.getJavaResourceModel_HasRelatedJavaRMManager();

		/**
		 * The meta object literal for the '<em><b>Java RModel Has Hibernate Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_HIBERNATE_ANNOTATION = eINSTANCE.getJavaResourceModel_JavaRModelHasHibernateAnnotation();

		/**
		 * The meta object literal for the '<em><b>Java RModel Has Setter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_SETTER = eINSTANCE.getJavaResourceModel_JavaRModelHasSetter();

		/**
		 * The meta object literal for the '<em><b>Java RModel Has Getter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_GETTER = eINSTANCE.getJavaResourceModel_JavaRModelHasGetter();

		/**
		 * The meta object literal for the '<em><b>Has Related Java Algo Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_RESOURCE_MODEL__HAS_RELATED_JAVA_ALGO_MODEL = eINSTANCE.getJavaResourceModel_HasRelatedJavaAlgoModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_RESOURCE_MODEL__NAME = eINSTANCE.getJavaResourceModel_Name();

		/**
		 * The meta object literal for the '<em><b>Parent Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_RESOURCE_MODEL__PARENT_NAME = eINSTANCE.getJavaResourceModel_ParentName();

		/**
		 * The meta object literal for the '{@link RESTfulServicePSM.impl.JavaResourceModelManagerImpl <em>Java Resource Model Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RESTfulServicePSM.impl.JavaResourceModelManagerImpl
		 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getJavaResourceModelManager()
		 * @generated
		 */
		EClass JAVA_RESOURCE_MODEL_MANAGER = eINSTANCE.getJavaResourceModelManager();

		/**
		 * The meta object literal for the '<em><b>Java RM Manager Has JAXB Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_JAXB_ANNOTATION = eINSTANCE.getJavaResourceModelManager_JavaRMManagerHasJAXBAnnotation();

		/**
		 * The meta object literal for the '<em><b>Java RM Manager Has Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_PROPERTY = eINSTANCE.getJavaResourceModelManager_JavaRMManagerHasProperty();

		/**
		 * The meta object literal for the '<em><b>Has Related Java RModel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_RESOURCE_MODEL_MANAGER__HAS_RELATED_JAVA_RMODEL = eINSTANCE.getJavaResourceModelManager_HasRelatedJavaRModel();

		/**
		 * The meta object literal for the '<em><b>Java RM Manager Has Setter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_SETTER = eINSTANCE.getJavaResourceModelManager_JavaRMManagerHasSetter();

		/**
		 * The meta object literal for the '<em><b>Java RM Manager Has Getter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_GETTER = eINSTANCE.getJavaResourceModelManager_JavaRMManagerHasGetter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_RESOURCE_MODEL_MANAGER__NAME = eINSTANCE.getJavaResourceModelManager_Name();

		/**
		 * The meta object literal for the '<em><b>Parent Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_RESOURCE_MODEL_MANAGER__PARENT_NAME = eINSTANCE.getJavaResourceModelManager_ParentName();

		/**
		 * The meta object literal for the '{@link RESTfulServicePSM.impl.PSMComponentPropertyImpl <em>PSM Component Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RESTfulServicePSM.impl.PSMComponentPropertyImpl
		 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getPSMComponentProperty()
		 * @generated
		 */
		EClass PSM_COMPONENT_PROPERTY = eINSTANCE.getPSMComponentProperty();

		/**
		 * The meta object literal for the '<em><b>Property Has Hibernate Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSM_COMPONENT_PROPERTY__PROPERTY_HAS_HIBERNATE_ANNOTATION = eINSTANCE.getPSMComponentProperty_PropertyHasHibernateAnnotation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSM_COMPONENT_PROPERTY__NAME = eINSTANCE.getPSMComponentProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSM_COMPONENT_PROPERTY__TYPE = eINSTANCE.getPSMComponentProperty_Type();

		/**
		 * The meta object literal for the '<em><b>BIs Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSM_COMPONENT_PROPERTY__BIS_UNIQUE = eINSTANCE.getPSMComponentProperty_BIsUnique();

		/**
		 * The meta object literal for the '<em><b>BIs Naming Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSM_COMPONENT_PROPERTY__BIS_NAMING_PROPERTY = eINSTANCE.getPSMComponentProperty_BIsNamingProperty();

		/**
		 * The meta object literal for the '<em><b>BIs Primary Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSM_COMPONENT_PROPERTY__BIS_PRIMARY_IDENTIFIER = eINSTANCE.getPSMComponentProperty_BIsPrimaryIdentifier();

		/**
		 * The meta object literal for the '{@link RESTfulServicePSM.impl.JavaSetterFunctionImpl <em>Java Setter Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RESTfulServicePSM.impl.JavaSetterFunctionImpl
		 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getJavaSetterFunction()
		 * @generated
		 */
		EClass JAVA_SETTER_FUNCTION = eINSTANCE.getJavaSetterFunction();

		/**
		 * The meta object literal for the '<em><b>Sets Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_SETTER_FUNCTION__SETS_PROPERTY = eINSTANCE.getJavaSetterFunction_SetsProperty();

		/**
		 * The meta object literal for the '<em><b>Setter Function Has JAXB Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JAVA_SETTER_FUNCTION__SETTER_FUNCTION_HAS_JAXB_ANNOTATION = eINSTANCE.getJavaSetterFunction_SetterFunctionHasJAXBAnnotation();

		/**
		 * The meta object literal for the '{@link RESTfulServicePSM.impl.JAXBAnnotationImpl <em>JAXB Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RESTfulServicePSM.impl.JAXBAnnotationImpl
		 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getJAXBAnnotation()
		 * @generated
		 */
		EClass JAXB_ANNOTATION = eINSTANCE.getJAXBAnnotation();

		/**
		 * The meta object literal for the '<em><b>JAXB Annotation Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAXB_ANNOTATION__JAXB_ANNOTATION_TEXT = eINSTANCE.getJAXBAnnotation_JAXBAnnotationText();

		/**
		 * The meta object literal for the '{@link RESTfulServicePSM.impl.JAXRSAnnotationImpl <em>JAXRS Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RESTfulServicePSM.impl.JAXRSAnnotationImpl
		 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getJAXRSAnnotation()
		 * @generated
		 */
		EClass JAXRS_ANNOTATION = eINSTANCE.getJAXRSAnnotation();

		/**
		 * The meta object literal for the '<em><b>JAXRS Annotation Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAXRS_ANNOTATION__JAXRS_ANNOTATION_TEXT = eINSTANCE.getJAXRSAnnotation_JAXRSAnnotationText();

		/**
		 * The meta object literal for the '{@link RESTfulServicePSM.impl.PSMHypermediaLinkImpl <em>PSM Hypermedia Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RESTfulServicePSM.impl.PSMHypermediaLinkImpl
		 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getPSMHypermediaLink()
		 * @generated
		 */
		EClass PSM_HYPERMEDIA_LINK = eINSTANCE.getPSMHypermediaLink();

		/**
		 * The meta object literal for the '<em><b>Has Target Java Algo Controller</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSM_HYPERMEDIA_LINK__HAS_TARGET_JAVA_ALGO_CONTROLLER = eINSTANCE.getPSMHypermediaLink_HasTargetJavaAlgoController();

		/**
		 * The meta object literal for the '<em><b>Has Target Java RController</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSM_HYPERMEDIA_LINK__HAS_TARGET_JAVA_RCONTROLLER = eINSTANCE.getPSMHypermediaLink_HasTargetJavaRController();

		/**
		 * The meta object literal for the '<em><b>Has Target RC Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSM_HYPERMEDIA_LINK__HAS_TARGET_RC_MANAGER = eINSTANCE.getPSMHypermediaLink_HasTargetRCManager();

		/**
		 * The meta object literal for the '<em><b>Link HTTP Verb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSM_HYPERMEDIA_LINK__LINK_HTTP_VERB = eINSTANCE.getPSMHypermediaLink_LinkHTTPVerb();

		/**
		 * The meta object literal for the '<em><b>Link Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PSM_HYPERMEDIA_LINK__LINK_TYPE = eINSTANCE.getPSMHypermediaLink_LinkType();

		/**
		 * The meta object literal for the '{@link RESTfulServicePSM.impl.ServicePSMImpl <em>Service PSM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RESTfulServicePSM.impl.ServicePSMImpl
		 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getServicePSM()
		 * @generated
		 */
		EClass SERVICE_PSM = eINSTANCE.getServicePSM();

		/**
		 * The meta object literal for the '<em><b>Has Java RModel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PSM__HAS_JAVA_RMODEL = eINSTANCE.getServicePSM_HasJavaRModel();

		/**
		 * The meta object literal for the '<em><b>Has Java RController</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PSM__HAS_JAVA_RCONTROLLER = eINSTANCE.getServicePSM_HasJavaRController();

		/**
		 * The meta object literal for the '<em><b>Has Java RC Manager</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PSM__HAS_JAVA_RC_MANAGER = eINSTANCE.getServicePSM_HasJavaRCManager();

		/**
		 * The meta object literal for the '<em><b>Has Java RM Manager</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PSM__HAS_JAVA_RM_MANAGER = eINSTANCE.getServicePSM_HasJavaRMManager();

		/**
		 * The meta object literal for the '<em><b>Has Java Algo Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PSM__HAS_JAVA_ALGO_MODEL = eINSTANCE.getServicePSM_HasJavaAlgoModel();

		/**
		 * The meta object literal for the '<em><b>Has Java Algo Controller</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PSM__HAS_JAVA_ALGO_CONTROLLER = eINSTANCE.getServicePSM_HasJavaAlgoController();

		/**
		 * The meta object literal for the '<em><b>Has Hibernate Controller</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_PSM__HAS_HIBERNATE_CONTROLLER = eINSTANCE.getServicePSM_HasHibernateController();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PSM__NAME = eINSTANCE.getServicePSM_Name();

		/**
		 * The meta object literal for the '<em><b>Service Output Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PSM__SERVICE_OUTPUT_PATH = eINSTANCE.getServicePSM_ServiceOutputPath();

		/**
		 * The meta object literal for the '<em><b>Service Database IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PSM__SERVICE_DATABASE_IP = eINSTANCE.getServicePSM_ServiceDatabaseIP();

		/**
		 * The meta object literal for the '<em><b>Service Database Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PSM__SERVICE_DATABASE_PORT = eINSTANCE.getServicePSM_ServiceDatabasePort();

		/**
		 * The meta object literal for the '<em><b>Service Database Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PSM__SERVICE_DATABASE_USERNAME = eINSTANCE.getServicePSM_ServiceDatabaseUsername();

		/**
		 * The meta object literal for the '<em><b>Service Database Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PSM__SERVICE_DATABASE_PASSWORD = eINSTANCE.getServicePSM_ServiceDatabasePassword();

		/**
		 * The meta object literal for the '<em><b>Service Database Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_PSM__SERVICE_DATABASE_TYPE = eINSTANCE.getServicePSM_ServiceDatabaseType();

		/**
		 * The meta object literal for the '{@link RESTfulServicePSM.impl.FunctionParameterImpl <em>Function Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RESTfulServicePSM.impl.FunctionParameterImpl
		 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getFunctionParameter()
		 * @generated
		 */
		EClass FUNCTION_PARAMETER = eINSTANCE.getFunctionParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_PARAMETER__NAME = eINSTANCE.getFunctionParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_PARAMETER__TYPE = eINSTANCE.getFunctionParameter_Type();

		/**
		 * The meta object literal for the '<em><b>BIs Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_PARAMETER__BIS_UNIQUE = eINSTANCE.getFunctionParameter_BIsUnique();

		/**
		 * The meta object literal for the '<em><b>BIs Return Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_PARAMETER__BIS_RETURN_PARAMETER = eINSTANCE.getFunctionParameter_BIsReturnParameter();

		/**
		 * The meta object literal for the '{@link RESTfulServicePSM.HTTPVerb <em>HTTP Verb</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RESTfulServicePSM.HTTPVerb
		 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getHTTPVerb()
		 * @generated
		 */
		EEnum HTTP_VERB = eINSTANCE.getHTTPVerb();

		/**
		 * The meta object literal for the '{@link RESTfulServicePSM.MediaType <em>Media Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RESTfulServicePSM.MediaType
		 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getMediaType()
		 * @generated
		 */
		EEnum MEDIA_TYPE = eINSTANCE.getMediaType();

		/**
		 * The meta object literal for the '{@link RESTfulServicePSM.LinkType <em>Link Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RESTfulServicePSM.LinkType
		 * @see RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl#getLinkType()
		 * @generated
		 */
		EEnum LINK_TYPE = eINSTANCE.getLinkType();

	}

} //RESTfulServicePSMPackage
