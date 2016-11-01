/**
 */
package ServiceCIM;

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
 * @see ServiceCIM.ServiceCIMFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface ServiceCIMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ServiceCIM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/eu.scasefp7.eclipse.mde.m2m/Metamodels/CIMMetamodel.ecore";

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
	ServiceCIMPackage eINSTANCE = ServiceCIM.impl.ServiceCIMPackageImpl.init();

	/**
	 * The meta object id for the '{@link ServiceCIM.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServiceCIM.impl.ResourceImpl
	 * @see ServiceCIM.impl.ServiceCIMPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 0;

	/**
	 * The feature id for the '<em><b>Is Algorithmic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__IS_ALGORITHMIC = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Has Input Representation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__HAS_INPUT_REPRESENTATION = 2;

	/**
	 * The feature id for the '<em><b>Has CRUD Activity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__HAS_CRUD_ACTIVITY = 3;

	/**
	 * The feature id for the '<em><b>Has Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__HAS_PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Has Output Representation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__HAS_OUTPUT_REPRESENTATION = 5;

	/**
	 * The feature id for the '<em><b>Has Related Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__HAS_RELATED_RESOURCE = 6;

	/**
	 * The feature id for the '<em><b>Is Related Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__IS_RELATED_RESOURCE = 7;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServiceCIM.impl.CRUDActivityImpl <em>CRUD Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServiceCIM.impl.CRUDActivityImpl
	 * @see ServiceCIM.impl.ServiceCIMPackageImpl#getCRUDActivity()
	 * @generated
	 */
	int CRUD_ACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>CRUD Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_ACTIVITY__CRUD_VERB = 0;

	/**
	 * The number of structural features of the '<em>CRUD Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_ACTIVITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>CRUD Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRUD_ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServiceCIM.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServiceCIM.impl.PropertyImpl
	 * @see ServiceCIM.impl.ServiceCIMPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_UNIQUE = 0;

	/**
	 * The feature id for the '<em><b>Is Naming Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__IS_NAMING_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServiceCIM.impl.InputRepresentationImpl <em>Input Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServiceCIM.impl.InputRepresentationImpl
	 * @see ServiceCIM.impl.ServiceCIMPackageImpl#getInputRepresentation()
	 * @generated
	 */
	int INPUT_REPRESENTATION = 3;

	/**
	 * The feature id for the '<em><b>Input Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REPRESENTATION__INPUT_MEDIA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Input Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REPRESENTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Input Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_REPRESENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServiceCIM.impl.OutputRepresentationImpl <em>Output Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServiceCIM.impl.OutputRepresentationImpl
	 * @see ServiceCIM.impl.ServiceCIMPackageImpl#getOutputRepresentation()
	 * @generated
	 */
	int OUTPUT_REPRESENTATION = 4;

	/**
	 * The feature id for the '<em><b>Output Media Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REPRESENTATION__OUTPUT_MEDIA_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Output Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REPRESENTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Output Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_REPRESENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServiceCIM.impl.RESTfulServiceCIMImpl <em>RES Tful Service CIM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServiceCIM.impl.RESTfulServiceCIMImpl
	 * @see ServiceCIM.impl.ServiceCIMPackageImpl#getRESTfulServiceCIM()
	 * @generated
	 */
	int RES_TFUL_SERVICE_CIM = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_CIM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Has Resources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_CIM__HAS_RESOURCES = 1;

	/**
	 * The feature id for the '<em><b>Service Output Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_CIM__SERVICE_OUTPUT_PATH = 2;

	/**
	 * The feature id for the '<em><b>Service Database IP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_IP = 3;

	/**
	 * The feature id for the '<em><b>Service Database Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_PORT = 4;

	/**
	 * The feature id for the '<em><b>Service Database Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_USERNAME = 5;

	/**
	 * The feature id for the '<em><b>Service Database Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_PASSWORD = 6;

	/**
	 * The feature id for the '<em><b>Service Database Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_TYPE = 7;

	/**
	 * The number of structural features of the '<em>RES Tful Service CIM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_CIM_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>RES Tful Service CIM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RES_TFUL_SERVICE_CIM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ServiceCIM.MediaType <em>Media Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServiceCIM.MediaType
	 * @see ServiceCIM.impl.ServiceCIMPackageImpl#getMediaType()
	 * @generated
	 */
	int MEDIA_TYPE = 6;

	/**
	 * The meta object id for the '{@link ServiceCIM.CRUDVerb <em>CRUD Verb</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ServiceCIM.CRUDVerb
	 * @see ServiceCIM.impl.ServiceCIMPackageImpl#getCRUDVerb()
	 * @generated
	 */
	int CRUD_VERB = 7;


	/**
	 * Returns the meta object for class '{@link ServiceCIM.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see ServiceCIM.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the attribute '{@link ServiceCIM.Resource#isIsAlgorithmic <em>Is Algorithmic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Algorithmic</em>'.
	 * @see ServiceCIM.Resource#isIsAlgorithmic()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_IsAlgorithmic();

	/**
	 * Returns the meta object for the attribute '{@link ServiceCIM.Resource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ServiceCIM.Resource#getName()
	 * @see #getResource()
	 * @generated
	 */
	EAttribute getResource_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ServiceCIM.Resource#getHasInputRepresentation <em>Has Input Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Input Representation</em>'.
	 * @see ServiceCIM.Resource#getHasInputRepresentation()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_HasInputRepresentation();

	/**
	 * Returns the meta object for the containment reference list '{@link ServiceCIM.Resource#getHasCRUDActivity <em>Has CRUD Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has CRUD Activity</em>'.
	 * @see ServiceCIM.Resource#getHasCRUDActivity()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_HasCRUDActivity();

	/**
	 * Returns the meta object for the containment reference list '{@link ServiceCIM.Resource#getHasProperty <em>Has Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Property</em>'.
	 * @see ServiceCIM.Resource#getHasProperty()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_HasProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link ServiceCIM.Resource#getHasOutputRepresentation <em>Has Output Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Output Representation</em>'.
	 * @see ServiceCIM.Resource#getHasOutputRepresentation()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_HasOutputRepresentation();

	/**
	 * Returns the meta object for the reference list '{@link ServiceCIM.Resource#getHasRelatedResource <em>Has Related Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Related Resource</em>'.
	 * @see ServiceCIM.Resource#getHasRelatedResource()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_HasRelatedResource();

	/**
	 * Returns the meta object for the reference list '{@link ServiceCIM.Resource#getIsRelatedResource <em>Is Related Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Related Resource</em>'.
	 * @see ServiceCIM.Resource#getIsRelatedResource()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_IsRelatedResource();

	/**
	 * Returns the meta object for class '{@link ServiceCIM.CRUDActivity <em>CRUD Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CRUD Activity</em>'.
	 * @see ServiceCIM.CRUDActivity
	 * @generated
	 */
	EClass getCRUDActivity();

	/**
	 * Returns the meta object for the attribute '{@link ServiceCIM.CRUDActivity#getCRUDVerb <em>CRUD Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CRUD Verb</em>'.
	 * @see ServiceCIM.CRUDActivity#getCRUDVerb()
	 * @see #getCRUDActivity()
	 * @generated
	 */
	EAttribute getCRUDActivity_CRUDVerb();

	/**
	 * Returns the meta object for class '{@link ServiceCIM.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see ServiceCIM.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link ServiceCIM.Property#isIsUnique <em>Is Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unique</em>'.
	 * @see ServiceCIM.Property#isIsUnique()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsUnique();

	/**
	 * Returns the meta object for the attribute '{@link ServiceCIM.Property#isIsNamingProperty <em>Is Naming Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Naming Property</em>'.
	 * @see ServiceCIM.Property#isIsNamingProperty()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_IsNamingProperty();

	/**
	 * Returns the meta object for the attribute '{@link ServiceCIM.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ServiceCIM.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link ServiceCIM.Property#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ServiceCIM.Property#getType()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Type();

	/**
	 * Returns the meta object for class '{@link ServiceCIM.InputRepresentation <em>Input Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Representation</em>'.
	 * @see ServiceCIM.InputRepresentation
	 * @generated
	 */
	EClass getInputRepresentation();

	/**
	 * Returns the meta object for the attribute '{@link ServiceCIM.InputRepresentation#getInputMediaType <em>Input Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Media Type</em>'.
	 * @see ServiceCIM.InputRepresentation#getInputMediaType()
	 * @see #getInputRepresentation()
	 * @generated
	 */
	EAttribute getInputRepresentation_InputMediaType();

	/**
	 * Returns the meta object for class '{@link ServiceCIM.OutputRepresentation <em>Output Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Representation</em>'.
	 * @see ServiceCIM.OutputRepresentation
	 * @generated
	 */
	EClass getOutputRepresentation();

	/**
	 * Returns the meta object for the attribute '{@link ServiceCIM.OutputRepresentation#getOutputMediaType <em>Output Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Media Type</em>'.
	 * @see ServiceCIM.OutputRepresentation#getOutputMediaType()
	 * @see #getOutputRepresentation()
	 * @generated
	 */
	EAttribute getOutputRepresentation_OutputMediaType();

	/**
	 * Returns the meta object for class '{@link ServiceCIM.RESTfulServiceCIM <em>RES Tful Service CIM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RES Tful Service CIM</em>'.
	 * @see ServiceCIM.RESTfulServiceCIM
	 * @generated
	 */
	EClass getRESTfulServiceCIM();

	/**
	 * Returns the meta object for the attribute '{@link ServiceCIM.RESTfulServiceCIM#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ServiceCIM.RESTfulServiceCIM#getName()
	 * @see #getRESTfulServiceCIM()
	 * @generated
	 */
	EAttribute getRESTfulServiceCIM_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ServiceCIM.RESTfulServiceCIM#getHasResources <em>Has Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Resources</em>'.
	 * @see ServiceCIM.RESTfulServiceCIM#getHasResources()
	 * @see #getRESTfulServiceCIM()
	 * @generated
	 */
	EReference getRESTfulServiceCIM_HasResources();

	/**
	 * Returns the meta object for the attribute '{@link ServiceCIM.RESTfulServiceCIM#getServiceOutputPath <em>Service Output Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Output Path</em>'.
	 * @see ServiceCIM.RESTfulServiceCIM#getServiceOutputPath()
	 * @see #getRESTfulServiceCIM()
	 * @generated
	 */
	EAttribute getRESTfulServiceCIM_ServiceOutputPath();

	/**
	 * Returns the meta object for the attribute '{@link ServiceCIM.RESTfulServiceCIM#getServiceDatabaseIP <em>Service Database IP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Database IP</em>'.
	 * @see ServiceCIM.RESTfulServiceCIM#getServiceDatabaseIP()
	 * @see #getRESTfulServiceCIM()
	 * @generated
	 */
	EAttribute getRESTfulServiceCIM_ServiceDatabaseIP();

	/**
	 * Returns the meta object for the attribute '{@link ServiceCIM.RESTfulServiceCIM#getServiceDatabasePort <em>Service Database Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Database Port</em>'.
	 * @see ServiceCIM.RESTfulServiceCIM#getServiceDatabasePort()
	 * @see #getRESTfulServiceCIM()
	 * @generated
	 */
	EAttribute getRESTfulServiceCIM_ServiceDatabasePort();

	/**
	 * Returns the meta object for the attribute '{@link ServiceCIM.RESTfulServiceCIM#getServiceDatabaseUsername <em>Service Database Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Database Username</em>'.
	 * @see ServiceCIM.RESTfulServiceCIM#getServiceDatabaseUsername()
	 * @see #getRESTfulServiceCIM()
	 * @generated
	 */
	EAttribute getRESTfulServiceCIM_ServiceDatabaseUsername();

	/**
	 * Returns the meta object for the attribute '{@link ServiceCIM.RESTfulServiceCIM#getServiceDatabasePassword <em>Service Database Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Database Password</em>'.
	 * @see ServiceCIM.RESTfulServiceCIM#getServiceDatabasePassword()
	 * @see #getRESTfulServiceCIM()
	 * @generated
	 */
	EAttribute getRESTfulServiceCIM_ServiceDatabasePassword();

	/**
	 * Returns the meta object for the attribute '{@link ServiceCIM.RESTfulServiceCIM#getServiceDatabaseType <em>Service Database Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Database Type</em>'.
	 * @see ServiceCIM.RESTfulServiceCIM#getServiceDatabaseType()
	 * @see #getRESTfulServiceCIM()
	 * @generated
	 */
	EAttribute getRESTfulServiceCIM_ServiceDatabaseType();

	/**
	 * Returns the meta object for enum '{@link ServiceCIM.MediaType <em>Media Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Media Type</em>'.
	 * @see ServiceCIM.MediaType
	 * @generated
	 */
	EEnum getMediaType();

	/**
	 * Returns the meta object for enum '{@link ServiceCIM.CRUDVerb <em>CRUD Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CRUD Verb</em>'.
	 * @see ServiceCIM.CRUDVerb
	 * @generated
	 */
	EEnum getCRUDVerb();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ServiceCIMFactory getServiceCIMFactory();

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
		 * The meta object literal for the '{@link ServiceCIM.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServiceCIM.impl.ResourceImpl
		 * @see ServiceCIM.impl.ServiceCIMPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Is Algorithmic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__IS_ALGORITHMIC = eINSTANCE.getResource_IsAlgorithmic();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE__NAME = eINSTANCE.getResource_Name();

		/**
		 * The meta object literal for the '<em><b>Has Input Representation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__HAS_INPUT_REPRESENTATION = eINSTANCE.getResource_HasInputRepresentation();

		/**
		 * The meta object literal for the '<em><b>Has CRUD Activity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__HAS_CRUD_ACTIVITY = eINSTANCE.getResource_HasCRUDActivity();

		/**
		 * The meta object literal for the '<em><b>Has Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__HAS_PROPERTY = eINSTANCE.getResource_HasProperty();

		/**
		 * The meta object literal for the '<em><b>Has Output Representation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__HAS_OUTPUT_REPRESENTATION = eINSTANCE.getResource_HasOutputRepresentation();

		/**
		 * The meta object literal for the '<em><b>Has Related Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__HAS_RELATED_RESOURCE = eINSTANCE.getResource_HasRelatedResource();

		/**
		 * The meta object literal for the '<em><b>Is Related Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__IS_RELATED_RESOURCE = eINSTANCE.getResource_IsRelatedResource();

		/**
		 * The meta object literal for the '{@link ServiceCIM.impl.CRUDActivityImpl <em>CRUD Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServiceCIM.impl.CRUDActivityImpl
		 * @see ServiceCIM.impl.ServiceCIMPackageImpl#getCRUDActivity()
		 * @generated
		 */
		EClass CRUD_ACTIVITY = eINSTANCE.getCRUDActivity();

		/**
		 * The meta object literal for the '<em><b>CRUD Verb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRUD_ACTIVITY__CRUD_VERB = eINSTANCE.getCRUDActivity_CRUDVerb();

		/**
		 * The meta object literal for the '{@link ServiceCIM.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServiceCIM.impl.PropertyImpl
		 * @see ServiceCIM.impl.ServiceCIMPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_UNIQUE = eINSTANCE.getProperty_IsUnique();

		/**
		 * The meta object literal for the '<em><b>Is Naming Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__IS_NAMING_PROPERTY = eINSTANCE.getProperty_IsNamingProperty();

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
		 * The meta object literal for the '{@link ServiceCIM.impl.InputRepresentationImpl <em>Input Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServiceCIM.impl.InputRepresentationImpl
		 * @see ServiceCIM.impl.ServiceCIMPackageImpl#getInputRepresentation()
		 * @generated
		 */
		EClass INPUT_REPRESENTATION = eINSTANCE.getInputRepresentation();

		/**
		 * The meta object literal for the '<em><b>Input Media Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_REPRESENTATION__INPUT_MEDIA_TYPE = eINSTANCE.getInputRepresentation_InputMediaType();

		/**
		 * The meta object literal for the '{@link ServiceCIM.impl.OutputRepresentationImpl <em>Output Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServiceCIM.impl.OutputRepresentationImpl
		 * @see ServiceCIM.impl.ServiceCIMPackageImpl#getOutputRepresentation()
		 * @generated
		 */
		EClass OUTPUT_REPRESENTATION = eINSTANCE.getOutputRepresentation();

		/**
		 * The meta object literal for the '<em><b>Output Media Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_REPRESENTATION__OUTPUT_MEDIA_TYPE = eINSTANCE.getOutputRepresentation_OutputMediaType();

		/**
		 * The meta object literal for the '{@link ServiceCIM.impl.RESTfulServiceCIMImpl <em>RES Tful Service CIM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServiceCIM.impl.RESTfulServiceCIMImpl
		 * @see ServiceCIM.impl.ServiceCIMPackageImpl#getRESTfulServiceCIM()
		 * @generated
		 */
		EClass RES_TFUL_SERVICE_CIM = eINSTANCE.getRESTfulServiceCIM();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_TFUL_SERVICE_CIM__NAME = eINSTANCE.getRESTfulServiceCIM_Name();

		/**
		 * The meta object literal for the '<em><b>Has Resources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RES_TFUL_SERVICE_CIM__HAS_RESOURCES = eINSTANCE.getRESTfulServiceCIM_HasResources();

		/**
		 * The meta object literal for the '<em><b>Service Output Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_TFUL_SERVICE_CIM__SERVICE_OUTPUT_PATH = eINSTANCE.getRESTfulServiceCIM_ServiceOutputPath();

		/**
		 * The meta object literal for the '<em><b>Service Database IP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_IP = eINSTANCE.getRESTfulServiceCIM_ServiceDatabaseIP();

		/**
		 * The meta object literal for the '<em><b>Service Database Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_PORT = eINSTANCE.getRESTfulServiceCIM_ServiceDatabasePort();

		/**
		 * The meta object literal for the '<em><b>Service Database Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_USERNAME = eINSTANCE.getRESTfulServiceCIM_ServiceDatabaseUsername();

		/**
		 * The meta object literal for the '<em><b>Service Database Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_PASSWORD = eINSTANCE.getRESTfulServiceCIM_ServiceDatabasePassword();

		/**
		 * The meta object literal for the '<em><b>Service Database Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_TYPE = eINSTANCE.getRESTfulServiceCIM_ServiceDatabaseType();

		/**
		 * The meta object literal for the '{@link ServiceCIM.MediaType <em>Media Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServiceCIM.MediaType
		 * @see ServiceCIM.impl.ServiceCIMPackageImpl#getMediaType()
		 * @generated
		 */
		EEnum MEDIA_TYPE = eINSTANCE.getMediaType();

		/**
		 * The meta object literal for the '{@link ServiceCIM.CRUDVerb <em>CRUD Verb</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ServiceCIM.CRUDVerb
		 * @see ServiceCIM.impl.ServiceCIMPackageImpl#getCRUDVerb()
		 * @generated
		 */
		EEnum CRUD_VERB = eINSTANCE.getCRUDVerb();

	}

} //ServiceCIMPackage
