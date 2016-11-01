/**
 */
package ServiceCIM.impl;

import ServiceCIM.CRUDActivity;
import ServiceCIM.CRUDVerb;
import ServiceCIM.InputRepresentation;
import ServiceCIM.MediaType;
import ServiceCIM.OutputRepresentation;
import ServiceCIM.Property;
import ServiceCIM.RESTfulServiceCIM;
import ServiceCIM.Resource;
import ServiceCIM.ServiceCIMFactory;
import ServiceCIM.ServiceCIMPackage;

import ServiceCIM.util.ServiceCIMValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceCIMPackageImpl extends EPackageImpl implements ServiceCIMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crudActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputRepresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputRepresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resTfulServiceCIMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mediaTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum crudVerbEEnum = null;

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
	 * @see ServiceCIM.ServiceCIMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ServiceCIMPackageImpl() {
		super(eNS_URI, ServiceCIMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ServiceCIMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ServiceCIMPackage init() {
		if (isInited) return (ServiceCIMPackage)EPackage.Registry.INSTANCE.getEPackage(ServiceCIMPackage.eNS_URI);

		// Obtain or create and register package
		ServiceCIMPackageImpl theServiceCIMPackage = (ServiceCIMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ServiceCIMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ServiceCIMPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theServiceCIMPackage.createPackageContents();

		// Initialize created meta-data
		theServiceCIMPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theServiceCIMPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ServiceCIMValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theServiceCIMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ServiceCIMPackage.eNS_URI, theServiceCIMPackage);
		return theServiceCIMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_IsAlgorithmic() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResource_Name() {
		return (EAttribute)resourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_HasInputRepresentation() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_HasCRUDActivity() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_HasProperty() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_HasOutputRepresentation() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_HasRelatedResource() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_IsRelatedResource() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCRUDActivity() {
		return crudActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCRUDActivity_CRUDVerb() {
		return (EAttribute)crudActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsUnique() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsNamingProperty() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Name() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Type() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputRepresentation() {
		return inputRepresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputRepresentation_InputMediaType() {
		return (EAttribute)inputRepresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputRepresentation() {
		return outputRepresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputRepresentation_OutputMediaType() {
		return (EAttribute)outputRepresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRESTfulServiceCIM() {
		return resTfulServiceCIMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRESTfulServiceCIM_Name() {
		return (EAttribute)resTfulServiceCIMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRESTfulServiceCIM_HasResources() {
		return (EReference)resTfulServiceCIMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRESTfulServiceCIM_ServiceOutputPath() {
		return (EAttribute)resTfulServiceCIMEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRESTfulServiceCIM_ServiceDatabaseIP() {
		return (EAttribute)resTfulServiceCIMEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRESTfulServiceCIM_ServiceDatabasePort() {
		return (EAttribute)resTfulServiceCIMEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRESTfulServiceCIM_ServiceDatabaseUsername() {
		return (EAttribute)resTfulServiceCIMEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRESTfulServiceCIM_ServiceDatabasePassword() {
		return (EAttribute)resTfulServiceCIMEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRESTfulServiceCIM_ServiceDatabaseType() {
		return (EAttribute)resTfulServiceCIMEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMediaType() {
		return mediaTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCRUDVerb() {
		return crudVerbEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceCIMFactory getServiceCIMFactory() {
		return (ServiceCIMFactory)getEFactoryInstance();
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
		resourceEClass = createEClass(RESOURCE);
		createEAttribute(resourceEClass, RESOURCE__IS_ALGORITHMIC);
		createEAttribute(resourceEClass, RESOURCE__NAME);
		createEReference(resourceEClass, RESOURCE__HAS_INPUT_REPRESENTATION);
		createEReference(resourceEClass, RESOURCE__HAS_CRUD_ACTIVITY);
		createEReference(resourceEClass, RESOURCE__HAS_PROPERTY);
		createEReference(resourceEClass, RESOURCE__HAS_OUTPUT_REPRESENTATION);
		createEReference(resourceEClass, RESOURCE__HAS_RELATED_RESOURCE);
		createEReference(resourceEClass, RESOURCE__IS_RELATED_RESOURCE);

		crudActivityEClass = createEClass(CRUD_ACTIVITY);
		createEAttribute(crudActivityEClass, CRUD_ACTIVITY__CRUD_VERB);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__IS_UNIQUE);
		createEAttribute(propertyEClass, PROPERTY__IS_NAMING_PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__NAME);
		createEAttribute(propertyEClass, PROPERTY__TYPE);

		inputRepresentationEClass = createEClass(INPUT_REPRESENTATION);
		createEAttribute(inputRepresentationEClass, INPUT_REPRESENTATION__INPUT_MEDIA_TYPE);

		outputRepresentationEClass = createEClass(OUTPUT_REPRESENTATION);
		createEAttribute(outputRepresentationEClass, OUTPUT_REPRESENTATION__OUTPUT_MEDIA_TYPE);

		resTfulServiceCIMEClass = createEClass(RES_TFUL_SERVICE_CIM);
		createEAttribute(resTfulServiceCIMEClass, RES_TFUL_SERVICE_CIM__NAME);
		createEReference(resTfulServiceCIMEClass, RES_TFUL_SERVICE_CIM__HAS_RESOURCES);
		createEAttribute(resTfulServiceCIMEClass, RES_TFUL_SERVICE_CIM__SERVICE_OUTPUT_PATH);
		createEAttribute(resTfulServiceCIMEClass, RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_IP);
		createEAttribute(resTfulServiceCIMEClass, RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_PORT);
		createEAttribute(resTfulServiceCIMEClass, RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_USERNAME);
		createEAttribute(resTfulServiceCIMEClass, RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_PASSWORD);
		createEAttribute(resTfulServiceCIMEClass, RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_TYPE);

		// Create enums
		mediaTypeEEnum = createEEnum(MEDIA_TYPE);
		crudVerbEEnum = createEEnum(CRUD_VERB);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResource_IsAlgorithmic(), ecorePackage.getEBoolean(), "isAlgorithmic", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResource_Name(), ecorePackage.getEString(), "name", null, 1, 1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_HasInputRepresentation(), this.getInputRepresentation(), null, "hasInputRepresentation", null, 1, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_HasCRUDActivity(), this.getCRUDActivity(), null, "hasCRUDActivity", null, 1, 4, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_HasProperty(), this.getProperty(), null, "hasProperty", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_HasOutputRepresentation(), this.getOutputRepresentation(), null, "hasOutputRepresentation", null, 1, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_HasRelatedResource(), this.getResource(), null, "hasRelatedResource", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResource_IsRelatedResource(), this.getResource(), null, "isRelatedResource", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(crudActivityEClass, CRUDActivity.class, "CRUDActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCRUDActivity_CRUDVerb(), this.getCRUDVerb(), "CRUDVerb", null, 1, 1, CRUDActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_IsUnique(), ecorePackage.getEBoolean(), "isUnique", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_IsNamingProperty(), ecorePackage.getEBoolean(), "isNamingProperty", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Type(), ecorePackage.getEString(), "type", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputRepresentationEClass, InputRepresentation.class, "InputRepresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputRepresentation_InputMediaType(), this.getMediaType(), "inputMediaType", null, 1, 1, InputRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputRepresentationEClass, OutputRepresentation.class, "OutputRepresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutputRepresentation_OutputMediaType(), this.getMediaType(), "outputMediaType", null, 1, 1, OutputRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resTfulServiceCIMEClass, RESTfulServiceCIM.class, "RESTfulServiceCIM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRESTfulServiceCIM_Name(), ecorePackage.getEString(), "name", null, 1, 1, RESTfulServiceCIM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRESTfulServiceCIM_HasResources(), this.getResource(), null, "hasResources", null, 1, -1, RESTfulServiceCIM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRESTfulServiceCIM_ServiceOutputPath(), ecorePackage.getEString(), "serviceOutputPath", null, 1, 1, RESTfulServiceCIM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRESTfulServiceCIM_ServiceDatabaseIP(), ecorePackage.getEString(), "serviceDatabaseIP", null, 1, 1, RESTfulServiceCIM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRESTfulServiceCIM_ServiceDatabasePort(), ecorePackage.getEString(), "serviceDatabasePort", null, 1, 1, RESTfulServiceCIM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRESTfulServiceCIM_ServiceDatabaseUsername(), ecorePackage.getEString(), "serviceDatabaseUsername", null, 1, 1, RESTfulServiceCIM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRESTfulServiceCIM_ServiceDatabasePassword(), ecorePackage.getEString(), "serviceDatabasePassword", null, 1, 1, RESTfulServiceCIM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRESTfulServiceCIM_ServiceDatabaseType(), ecorePackage.getEString(), "serviceDatabaseType", null, 1, 1, RESTfulServiceCIM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(mediaTypeEEnum, MediaType.class, "MediaType");
		addEEnumLiteral(mediaTypeEEnum, MediaType.JSON);
		addEEnumLiteral(mediaTypeEEnum, MediaType.XML);

		initEEnum(crudVerbEEnum, CRUDVerb.class, "CRUDVerb");
		addEEnumLiteral(crudVerbEEnum, CRUDVerb.CREATE);
		addEEnumLiteral(crudVerbEEnum, CRUDVerb.READ);
		addEEnumLiteral(crudVerbEEnum, CRUDVerb.UPDATE);
		addEEnumLiteral(crudVerbEEnum, CRUDVerb.DELETE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (resourceEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueCRUDVerbs UniqueInputMediaTypes UniqueOutputMediaTypes UniqueNamingProperty AlgoResHaveNoProperties CRUDResHaveAtLeastOneProperty"
		   });	
		addAnnotation
		  (resTfulServiceCIMEClass, 
		   source, 
		   new String[] {
			 "constraints", "UniqueResourceNames"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (resourceEClass, 
		   source, 
		   new String[] {
			 "UniqueCRUDVerbs", "self.hasCRUDActivity->isUnique(CRUDVerb)",
			 "UniqueInputMediaTypes", "self.hasInputRepresentation->isUnique(MediaType)",
			 "UniqueOutputMediaTypes", "self.hasOutputRepresentation->isUnique(MediaType)",
			 "UniqueNamingProperty", "self.hasProperty->notEmpty() implies self.hasProperty->one(isNamingProperty = true)",
			 "AlgoResHaveNoProperties", "(self.isAlgorithmic = true) implies self.hasProperty->isEmpty()",
			 "CRUDResHaveAtLeastOneProperty", "(self.isAlgorithmic = false) implies self.hasProperty->notEmpty()"
		   });	
		addAnnotation
		  (resTfulServiceCIMEClass, 
		   source, 
		   new String[] {
			 "UniqueResourceNames", "self.hasResources->isUnique(name)"
		   });
		addAnnotation
		  (resTfulServiceCIMEClass, 
		   new boolean[] { true },
		   "http://www.eclipse.org/emf/2002/GenModel",
		   new String[] {
			 "documentation", "OCL constraints"
		   });
	}

} //ServiceCIMPackageImpl
