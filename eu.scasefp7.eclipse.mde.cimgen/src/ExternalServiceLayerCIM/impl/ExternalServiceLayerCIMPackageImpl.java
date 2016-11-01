/**
 */
package ExternalServiceLayerCIM.impl;

import ExternalServiceLayerCIM.AnnAlgoResource;
import ExternalServiceLayerCIM.AnnCRUDResource;
import ExternalServiceLayerCIM.AnnotatedElement;
import ExternalServiceLayerCIM.Annotation;
import ExternalServiceLayerCIM.AnnotationModel;
import ExternalServiceLayerCIM.AutoPersistentOutput;
import ExternalServiceLayerCIM.ComplexType;
import ExternalServiceLayerCIM.ComplexTypeProperty;
import ExternalServiceLayerCIM.ExistentCRUDPersistentOutput;
import ExternalServiceLayerCIM.ExternalServiceLayerCIMFactory;
import ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage;
import ExternalServiceLayerCIM.InputDataModel;
import ExternalServiceLayerCIM.ModelProperty;
import ExternalServiceLayerCIM.NonPersistentOutput;
import ExternalServiceLayerCIM.OutputDataModel;
import ExternalServiceLayerCIM.PathParam;
import ExternalServiceLayerCIM.QueryParam;
import ExternalServiceLayerCIM.RESTClientResource;
import ExternalServiceLayerCIM.Representation;
import ExternalServiceLayerCIM.TargetRESTService;

import ServiceCIM.ServiceCIMPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalServiceLayerCIMPackageImpl extends EPackageImpl implements ExternalServiceLayerCIMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotatedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annAlgoResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annCRUDResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restClientResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetRESTServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputDataModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputDataModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass representationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonPersistentOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autoPersistentOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existentCRUDPersistentOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexTypePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathParamEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExternalServiceLayerCIMPackageImpl() {
		super(eNS_URI, ExternalServiceLayerCIMFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ExternalServiceLayerCIMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExternalServiceLayerCIMPackage init() {
		if (isInited) return (ExternalServiceLayerCIMPackage)EPackage.Registry.INSTANCE.getEPackage(ExternalServiceLayerCIMPackage.eNS_URI);

		// Obtain or create and register package
		ExternalServiceLayerCIMPackageImpl theExternalServiceLayerCIMPackage = (ExternalServiceLayerCIMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExternalServiceLayerCIMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExternalServiceLayerCIMPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ServiceCIMPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theExternalServiceLayerCIMPackage.createPackageContents();

		// Initialize created meta-data
		theExternalServiceLayerCIMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExternalServiceLayerCIMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExternalServiceLayerCIMPackage.eNS_URI, theExternalServiceLayerCIMPackage);
		return theExternalServiceLayerCIMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationModel() {
		return annotationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationModel_HasAnnotatedElement() {
		return (EReference)annotationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationModel_HasAnnotation() {
		return (EReference)annotationModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationModel_Name() {
		return (EAttribute)annotationModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotatedElement() {
		return annotatedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnAlgoResource() {
		return annAlgoResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnAlgoResource_AnnotatesAlgoResource() {
		return (EReference)annAlgoResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnCRUDResource() {
		return annCRUDResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnCRUDResource_AnnotatesCRUDResource() {
		return (EReference)annCRUDResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRESTClientResource() {
		return restClientResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRESTClientResource_TargetsService() {
		return (EReference)restClientResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRESTClientResource_IsRESTClientResource() {
		return (EReference)restClientResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRESTClientResource_HasPathParam() {
		return (EReference)restClientResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRESTClientResource_IsRESTClientComplexType() {
		return (EReference)restClientResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetRESTService() {
		return targetRESTServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetRESTService_HasQueryParam() {
		return (EReference)targetRESTServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetRESTService_HasInputDataModel() {
		return (EReference)targetRESTServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetRESTService_HasOutputDataModel() {
		return (EReference)targetRESTServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetRESTService_TargetURL() {
		return (EAttribute)targetRESTServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetRESTService_CRUDVerb() {
		return (EAttribute)targetRESTServiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryParam() {
		return queryParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParam_Name() {
		return (EAttribute)queryParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParam_Type() {
		return (EAttribute)queryParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParam_IsAuthToken() {
		return (EAttribute)queryParamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParam_AuthTokenToURL() {
		return (EAttribute)queryParamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputDataModel() {
		return inputDataModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputDataModel_HasInputRepresentation() {
		return (EReference)inputDataModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputDataModel_HasInputProperties() {
		return (EReference)inputDataModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputDataModel() {
		return outputDataModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputDataModel_HasOutputRepresentation() {
		return (EReference)outputDataModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputDataModel_HasOutputProperties() {
		return (EReference)outputDataModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepresentation() {
		return representationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepresentation_Name() {
		return (EAttribute)representationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelProperty() {
		return modelPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelProperty_Name() {
		return (EAttribute)modelPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelProperty_IsUnique() {
		return (EAttribute)modelPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelProperty_Type() {
		return (EAttribute)modelPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelProperty_HasPrimitiveType() {
		return (EAttribute)modelPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelProperty_HasComplexType() {
		return (EReference)modelPropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonPersistentOutput() {
		return nonPersistentOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutoPersistentOutput() {
		return autoPersistentOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExistentCRUDPersistentOutput() {
		return existentCRUDPersistentOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExistentCRUDPersistentOutput_IsExistentCRUDPersistentOutput() {
		return (EReference)existentCRUDPersistentOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexType() {
		return complexTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexType_ComplexTypeName() {
		return (EAttribute)complexTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexType_HasComplexTypeProperties() {
		return (EReference)complexTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexTypeProperty() {
		return complexTypePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexTypeProperty_Name() {
		return (EAttribute)complexTypePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexTypeProperty_IsUnique() {
		return (EAttribute)complexTypePropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexTypeProperty_Type() {
		return (EAttribute)complexTypePropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexTypeProperty_HasPrimitiveType() {
		return (EAttribute)complexTypePropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexTypeProperty_PropertyHasComplexType() {
		return (EReference)complexTypePropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathParam() {
		return pathParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathParam_Name() {
		return (EAttribute)pathParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathParam_Type() {
		return (EAttribute)pathParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalServiceLayerCIMFactory getExternalServiceLayerCIMFactory() {
		return (ExternalServiceLayerCIMFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		annotationModelEClass = createEClass(ANNOTATION_MODEL);
		createEReference(annotationModelEClass, ANNOTATION_MODEL__HAS_ANNOTATED_ELEMENT);
		createEReference(annotationModelEClass, ANNOTATION_MODEL__HAS_ANNOTATION);
		createEAttribute(annotationModelEClass, ANNOTATION_MODEL__NAME);

		annotatedElementEClass = createEClass(ANNOTATED_ELEMENT);

		annotationEClass = createEClass(ANNOTATION);

		annAlgoResourceEClass = createEClass(ANN_ALGO_RESOURCE);
		createEReference(annAlgoResourceEClass, ANN_ALGO_RESOURCE__ANNOTATES_ALGO_RESOURCE);

		annCRUDResourceEClass = createEClass(ANN_CRUD_RESOURCE);
		createEReference(annCRUDResourceEClass, ANN_CRUD_RESOURCE__ANNOTATES_CRUD_RESOURCE);

		restClientResourceEClass = createEClass(REST_CLIENT_RESOURCE);
		createEReference(restClientResourceEClass, REST_CLIENT_RESOURCE__TARGETS_SERVICE);
		createEReference(restClientResourceEClass, REST_CLIENT_RESOURCE__IS_REST_CLIENT_RESOURCE);
		createEReference(restClientResourceEClass, REST_CLIENT_RESOURCE__HAS_PATH_PARAM);
		createEReference(restClientResourceEClass, REST_CLIENT_RESOURCE__IS_REST_CLIENT_COMPLEX_TYPE);

		targetRESTServiceEClass = createEClass(TARGET_REST_SERVICE);
		createEReference(targetRESTServiceEClass, TARGET_REST_SERVICE__HAS_QUERY_PARAM);
		createEReference(targetRESTServiceEClass, TARGET_REST_SERVICE__HAS_INPUT_DATA_MODEL);
		createEReference(targetRESTServiceEClass, TARGET_REST_SERVICE__HAS_OUTPUT_DATA_MODEL);
		createEAttribute(targetRESTServiceEClass, TARGET_REST_SERVICE__TARGET_URL);
		createEAttribute(targetRESTServiceEClass, TARGET_REST_SERVICE__CRUD_VERB);

		queryParamEClass = createEClass(QUERY_PARAM);
		createEAttribute(queryParamEClass, QUERY_PARAM__NAME);
		createEAttribute(queryParamEClass, QUERY_PARAM__TYPE);
		createEAttribute(queryParamEClass, QUERY_PARAM__IS_AUTH_TOKEN);
		createEAttribute(queryParamEClass, QUERY_PARAM__AUTH_TOKEN_TO_URL);

		inputDataModelEClass = createEClass(INPUT_DATA_MODEL);
		createEReference(inputDataModelEClass, INPUT_DATA_MODEL__HAS_INPUT_REPRESENTATION);
		createEReference(inputDataModelEClass, INPUT_DATA_MODEL__HAS_INPUT_PROPERTIES);

		outputDataModelEClass = createEClass(OUTPUT_DATA_MODEL);
		createEReference(outputDataModelEClass, OUTPUT_DATA_MODEL__HAS_OUTPUT_REPRESENTATION);
		createEReference(outputDataModelEClass, OUTPUT_DATA_MODEL__HAS_OUTPUT_PROPERTIES);

		representationEClass = createEClass(REPRESENTATION);
		createEAttribute(representationEClass, REPRESENTATION__NAME);

		modelPropertyEClass = createEClass(MODEL_PROPERTY);
		createEAttribute(modelPropertyEClass, MODEL_PROPERTY__NAME);
		createEAttribute(modelPropertyEClass, MODEL_PROPERTY__IS_UNIQUE);
		createEAttribute(modelPropertyEClass, MODEL_PROPERTY__TYPE);
		createEAttribute(modelPropertyEClass, MODEL_PROPERTY__HAS_PRIMITIVE_TYPE);
		createEReference(modelPropertyEClass, MODEL_PROPERTY__HAS_COMPLEX_TYPE);

		nonPersistentOutputEClass = createEClass(NON_PERSISTENT_OUTPUT);

		autoPersistentOutputEClass = createEClass(AUTO_PERSISTENT_OUTPUT);

		existentCRUDPersistentOutputEClass = createEClass(EXISTENT_CRUD_PERSISTENT_OUTPUT);
		createEReference(existentCRUDPersistentOutputEClass, EXISTENT_CRUD_PERSISTENT_OUTPUT__IS_EXISTENT_CRUD_PERSISTENT_OUTPUT);

		complexTypeEClass = createEClass(COMPLEX_TYPE);
		createEAttribute(complexTypeEClass, COMPLEX_TYPE__COMPLEX_TYPE_NAME);
		createEReference(complexTypeEClass, COMPLEX_TYPE__HAS_COMPLEX_TYPE_PROPERTIES);

		complexTypePropertyEClass = createEClass(COMPLEX_TYPE_PROPERTY);
		createEAttribute(complexTypePropertyEClass, COMPLEX_TYPE_PROPERTY__NAME);
		createEAttribute(complexTypePropertyEClass, COMPLEX_TYPE_PROPERTY__IS_UNIQUE);
		createEAttribute(complexTypePropertyEClass, COMPLEX_TYPE_PROPERTY__TYPE);
		createEAttribute(complexTypePropertyEClass, COMPLEX_TYPE_PROPERTY__HAS_PRIMITIVE_TYPE);
		createEReference(complexTypePropertyEClass, COMPLEX_TYPE_PROPERTY__PROPERTY_HAS_COMPLEX_TYPE);

		pathParamEClass = createEClass(PATH_PARAM);
		createEAttribute(pathParamEClass, PATH_PARAM__NAME);
		createEAttribute(pathParamEClass, PATH_PARAM__TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ServiceCIMPackage theServiceCIMPackage = (ServiceCIMPackage)EPackage.Registry.INSTANCE.getEPackage(ServiceCIMPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		annAlgoResourceEClass.getESuperTypes().add(this.getAnnotatedElement());
		annCRUDResourceEClass.getESuperTypes().add(this.getAnnotatedElement());
		restClientResourceEClass.getESuperTypes().add(this.getAnnotation());
		nonPersistentOutputEClass.getESuperTypes().add(this.getOutputDataModel());
		autoPersistentOutputEClass.getESuperTypes().add(this.getOutputDataModel());
		existentCRUDPersistentOutputEClass.getESuperTypes().add(this.getOutputDataModel());

		// Initialize classes, features, and operations; add parameters
		initEClass(annotationModelEClass, AnnotationModel.class, "AnnotationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotationModel_HasAnnotatedElement(), this.getAnnotatedElement(), null, "hasAnnotatedElement", null, 1, -1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationModel_HasAnnotation(), this.getAnnotation(), null, "hasAnnotation", null, 1, -1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotatedElementEClass, AnnotatedElement.class, "AnnotatedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(annAlgoResourceEClass, AnnAlgoResource.class, "AnnAlgoResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnAlgoResource_AnnotatesAlgoResource(), theServiceCIMPackage.getResource(), null, "annotatesAlgoResource", null, 1, 1, AnnAlgoResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annCRUDResourceEClass, AnnCRUDResource.class, "AnnCRUDResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnCRUDResource_AnnotatesCRUDResource(), theServiceCIMPackage.getResource(), null, "annotatesCRUDResource", null, 1, 1, AnnCRUDResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restClientResourceEClass, RESTClientResource.class, "RESTClientResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRESTClientResource_TargetsService(), this.getTargetRESTService(), null, "targetsService", null, 1, 1, RESTClientResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRESTClientResource_IsRESTClientResource(), this.getAnnAlgoResource(), null, "isRESTClientResource", null, 1, 1, RESTClientResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRESTClientResource_HasPathParam(), this.getPathParam(), null, "hasPathParam", null, 0, -1, RESTClientResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRESTClientResource_IsRESTClientComplexType(), this.getComplexType(), null, "isRESTClientComplexType", null, 0, -1, RESTClientResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetRESTServiceEClass, TargetRESTService.class, "TargetRESTService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTargetRESTService_HasQueryParam(), this.getQueryParam(), null, "hasQueryParam", null, 0, -1, TargetRESTService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetRESTService_HasInputDataModel(), this.getInputDataModel(), null, "hasInputDataModel", null, 0, 1, TargetRESTService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetRESTService_HasOutputDataModel(), this.getOutputDataModel(), null, "hasOutputDataModel", null, 0, 1, TargetRESTService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTargetRESTService_TargetURL(), ecorePackage.getEString(), "targetURL", null, 1, 1, TargetRESTService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTargetRESTService_CRUDVerb(), ecorePackage.getEString(), "CRUDVerb", null, 1, 1, TargetRESTService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryParamEClass, QueryParam.class, "QueryParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryParam_Name(), ecorePackage.getEString(), "name", null, 1, 1, QueryParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryParam_Type(), ecorePackage.getEString(), "type", null, 1, 1, QueryParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryParam_IsAuthToken(), ecorePackage.getEBoolean(), "isAuthToken", null, 0, 1, QueryParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryParam_AuthTokenToURL(), ecorePackage.getEString(), "authTokenToURL", null, 0, 1, QueryParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputDataModelEClass, InputDataModel.class, "InputDataModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputDataModel_HasInputRepresentation(), this.getRepresentation(), null, "hasInputRepresentation", null, 1, 1, InputDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputDataModel_HasInputProperties(), this.getModelProperty(), null, "hasInputProperties", null, 1, -1, InputDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputDataModelEClass, OutputDataModel.class, "OutputDataModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputDataModel_HasOutputRepresentation(), this.getRepresentation(), null, "hasOutputRepresentation", null, 1, 1, OutputDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputDataModel_HasOutputProperties(), this.getModelProperty(), null, "hasOutputProperties", null, 1, -1, OutputDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(representationEClass, Representation.class, "Representation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepresentation_Name(), ecorePackage.getEString(), "name", null, 1, 1, Representation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelPropertyEClass, ModelProperty.class, "ModelProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelProperty_Name(), ecorePackage.getEString(), "name", null, 1, 1, ModelProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelProperty_IsUnique(), ecorePackage.getEBoolean(), "isUnique", null, 1, 1, ModelProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelProperty_Type(), ecorePackage.getEString(), "type", null, 0, 1, ModelProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelProperty_HasPrimitiveType(), ecorePackage.getEBoolean(), "hasPrimitiveType", null, 0, 1, ModelProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelProperty_HasComplexType(), this.getComplexType(), null, "hasComplexType", null, 0, 1, ModelProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonPersistentOutputEClass, NonPersistentOutput.class, "NonPersistentOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(autoPersistentOutputEClass, AutoPersistentOutput.class, "AutoPersistentOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(existentCRUDPersistentOutputEClass, ExistentCRUDPersistentOutput.class, "ExistentCRUDPersistentOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExistentCRUDPersistentOutput_IsExistentCRUDPersistentOutput(), this.getAnnCRUDResource(), null, "isExistentCRUDPersistentOutput", null, 1, 1, ExistentCRUDPersistentOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexTypeEClass, ComplexType.class, "ComplexType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplexType_ComplexTypeName(), ecorePackage.getEString(), "complexTypeName", null, 0, 1, ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplexType_HasComplexTypeProperties(), this.getComplexTypeProperty(), null, "hasComplexTypeProperties", null, 1, -1, ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexTypePropertyEClass, ComplexTypeProperty.class, "ComplexTypeProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplexTypeProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, ComplexTypeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplexTypeProperty_IsUnique(), ecorePackage.getEBoolean(), "isUnique", null, 0, 1, ComplexTypeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplexTypeProperty_Type(), ecorePackage.getEString(), "type", null, 0, 1, ComplexTypeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplexTypeProperty_HasPrimitiveType(), ecorePackage.getEBoolean(), "hasPrimitiveType", null, 0, 1, ComplexTypeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplexTypeProperty_PropertyHasComplexType(), this.getComplexType(), null, "propertyHasComplexType", null, 0, 1, ComplexTypeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathParamEClass, PathParam.class, "PathParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPathParam_Name(), ecorePackage.getEString(), "name", null, 0, 1, PathParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathParam_Type(), ecorePackage.getEString(), "type", null, 0, 1, PathParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "Eu.fp7.scase", "CIMMetamodel.ecore#/"
		   });
	}

} //ExternalServiceLayerCIMPackageImpl
