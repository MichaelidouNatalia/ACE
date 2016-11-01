/**
 */
package SearchLayerPSM.impl;

import AnnotationLayerStack.AnnotationLayerStackPackage;

import AnnotationLayerStack.impl.AnnotationLayerStackPackageImpl;

import AuthenticationLayerPSM.AuthenticationLayerPSMPackage;

import AuthenticationLayerPSM.impl.AuthenticationLayerPSMPackageImpl;

import AuthorizationLayerPSM.AuthorizationLayerPSMPackage;

import AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl;

import ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage;

import ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl;

import MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage;

import MDEMigratorPSMMetamodel.impl.MDEMigratorPSMMetamodelPackageImpl;

import RESTfulServicePSM.RESTfulServicePSMPackage;

import RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl;

import SearchLayerPSM.AnnHTTPActivity;
import SearchLayerPSM.AnnHTTPActivityHandler;
import SearchLayerPSM.AnnJavaAlgoController;
import SearchLayerPSM.AnnJavaResourceModel;
import SearchLayerPSM.AnnPSMComponentProperty;
import SearchLayerPSM.AnnotatedElement;
import SearchLayerPSM.Annotation;
import SearchLayerPSM.AnnotationModel;
import SearchLayerPSM.SearchController;
import SearchLayerPSM.SearchHTTPActivity;
import SearchLayerPSM.SearchHTTPHandler;
import SearchLayerPSM.SearchLayerPSMFactory;
import SearchLayerPSM.SearchLayerPSMPackage;
import SearchLayerPSM.SearchableJavaResourceModel;
import SearchLayerPSM.SearchableProperty;

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
public class SearchLayerPSMPackageImpl extends EPackageImpl implements SearchLayerPSMPackage {
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
	private EClass annPSMComponentPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annJavaAlgoControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annHTTPActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annHTTPActivityHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchHTTPActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchHTTPHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchablePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass searchableJavaResourceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annJavaResourceModelEClass = null;

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
	 * @see SearchLayerPSM.SearchLayerPSMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SearchLayerPSMPackageImpl() {
		super(eNS_URI, SearchLayerPSMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SearchLayerPSMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SearchLayerPSMPackage init() {
		if (isInited) return (SearchLayerPSMPackage)EPackage.Registry.INSTANCE.getEPackage(SearchLayerPSMPackage.eNS_URI);

		// Obtain or create and register package
		SearchLayerPSMPackageImpl theSearchLayerPSMPackage = (SearchLayerPSMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SearchLayerPSMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SearchLayerPSMPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AnnotationLayerStackPackageImpl theAnnotationLayerStackPackage = (AnnotationLayerStackPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AnnotationLayerStackPackage.eNS_URI) instanceof AnnotationLayerStackPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnnotationLayerStackPackage.eNS_URI) : AnnotationLayerStackPackage.eINSTANCE);
		AuthenticationLayerPSMPackageImpl theAuthenticationLayerPSMPackage = (AuthenticationLayerPSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AuthenticationLayerPSMPackage.eNS_URI) instanceof AuthenticationLayerPSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AuthenticationLayerPSMPackage.eNS_URI) : AuthenticationLayerPSMPackage.eINSTANCE);
		RESTfulServicePSMPackageImpl theRESTfulServicePSMPackage = (RESTfulServicePSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RESTfulServicePSMPackage.eNS_URI) instanceof RESTfulServicePSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RESTfulServicePSMPackage.eNS_URI) : RESTfulServicePSMPackage.eINSTANCE);
		ExternalServiceLayerPSMPackageImpl theExternalServiceLayerPSMPackage = (ExternalServiceLayerPSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExternalServiceLayerPSMPackage.eNS_URI) instanceof ExternalServiceLayerPSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExternalServiceLayerPSMPackage.eNS_URI) : ExternalServiceLayerPSMPackage.eINSTANCE);
		AuthorizationLayerPSMPackageImpl theAuthorizationLayerPSMPackage = (AuthorizationLayerPSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AuthorizationLayerPSMPackage.eNS_URI) instanceof AuthorizationLayerPSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AuthorizationLayerPSMPackage.eNS_URI) : AuthorizationLayerPSMPackage.eINSTANCE);
		MDEMigratorPSMMetamodelPackageImpl theMDEMigratorPSMMetamodelPackage = (MDEMigratorPSMMetamodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MDEMigratorPSMMetamodelPackage.eNS_URI) instanceof MDEMigratorPSMMetamodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MDEMigratorPSMMetamodelPackage.eNS_URI) : MDEMigratorPSMMetamodelPackage.eINSTANCE);

		// Create package meta-data objects
		theSearchLayerPSMPackage.createPackageContents();
		theAnnotationLayerStackPackage.createPackageContents();
		theAuthenticationLayerPSMPackage.createPackageContents();
		theRESTfulServicePSMPackage.createPackageContents();
		theExternalServiceLayerPSMPackage.createPackageContents();
		theAuthorizationLayerPSMPackage.createPackageContents();
		theMDEMigratorPSMMetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theSearchLayerPSMPackage.initializePackageContents();
		theAnnotationLayerStackPackage.initializePackageContents();
		theAuthenticationLayerPSMPackage.initializePackageContents();
		theRESTfulServicePSMPackage.initializePackageContents();
		theExternalServiceLayerPSMPackage.initializePackageContents();
		theAuthorizationLayerPSMPackage.initializePackageContents();
		theMDEMigratorPSMMetamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSearchLayerPSMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SearchLayerPSMPackage.eNS_URI, theSearchLayerPSMPackage);
		return theSearchLayerPSMPackage;
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
	public EReference getAnnotationModel_AnnotatesRESTfulServicePSM() {
		return (EReference)annotationModelEClass.getEStructuralFeatures().get(3);
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
	public EClass getAnnPSMComponentProperty() {
		return annPSMComponentPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnPSMComponentProperty_AnnotatesPSMComponentProperty() {
		return (EReference)annPSMComponentPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnJavaAlgoController() {
		return annJavaAlgoControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnJavaAlgoController_AnnotatesJavaAlgoController() {
		return (EReference)annJavaAlgoControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnHTTPActivity() {
		return annHTTPActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnHTTPActivity_AnnotatesHTTPActivity() {
		return (EReference)annHTTPActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnHTTPActivityHandler() {
		return annHTTPActivityHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnHTTPActivityHandler_AnnotatesHTTPActivityHandler() {
		return (EReference)annHTTPActivityHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchController() {
		return searchControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchController_IsSearchController() {
		return (EReference)searchControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchHTTPActivity() {
		return searchHTTPActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchHTTPActivity_IsSearchHTTPActivity() {
		return (EReference)searchHTTPActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchHTTPHandler() {
		return searchHTTPHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchHTTPHandler_IsHTTPActivityHandler() {
		return (EReference)searchHTTPHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchHTTPHandler_SearchesJavaResourceModel() {
		return (EReference)searchHTTPHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchableProperty() {
		return searchablePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchableProperty_IsSearchableProperty() {
		return (EReference)searchablePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchableJavaResourceModel() {
		return searchableJavaResourceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchableJavaResourceModel_HasSearchableProperty() {
		return (EReference)searchableJavaResourceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchableJavaResourceModel_IsSearchableJavaResourceModel() {
		return (EReference)searchableJavaResourceModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnJavaResourceModel() {
		return annJavaResourceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnJavaResourceModel_AnnotatesJavaResourceModel() {
		return (EReference)annJavaResourceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchLayerPSMFactory getSearchLayerPSMFactory() {
		return (SearchLayerPSMFactory)getEFactoryInstance();
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
		createEReference(annotationModelEClass, ANNOTATION_MODEL__ANNOTATES_RES_TFUL_SERVICE_PSM);

		annotatedElementEClass = createEClass(ANNOTATED_ELEMENT);

		annotationEClass = createEClass(ANNOTATION);

		annPSMComponentPropertyEClass = createEClass(ANN_PSM_COMPONENT_PROPERTY);
		createEReference(annPSMComponentPropertyEClass, ANN_PSM_COMPONENT_PROPERTY__ANNOTATES_PSM_COMPONENT_PROPERTY);

		annJavaAlgoControllerEClass = createEClass(ANN_JAVA_ALGO_CONTROLLER);
		createEReference(annJavaAlgoControllerEClass, ANN_JAVA_ALGO_CONTROLLER__ANNOTATES_JAVA_ALGO_CONTROLLER);

		annHTTPActivityEClass = createEClass(ANN_HTTP_ACTIVITY);
		createEReference(annHTTPActivityEClass, ANN_HTTP_ACTIVITY__ANNOTATES_HTTP_ACTIVITY);

		annHTTPActivityHandlerEClass = createEClass(ANN_HTTP_ACTIVITY_HANDLER);
		createEReference(annHTTPActivityHandlerEClass, ANN_HTTP_ACTIVITY_HANDLER__ANNOTATES_HTTP_ACTIVITY_HANDLER);

		searchControllerEClass = createEClass(SEARCH_CONTROLLER);
		createEReference(searchControllerEClass, SEARCH_CONTROLLER__IS_SEARCH_CONTROLLER);

		searchHTTPActivityEClass = createEClass(SEARCH_HTTP_ACTIVITY);
		createEReference(searchHTTPActivityEClass, SEARCH_HTTP_ACTIVITY__IS_SEARCH_HTTP_ACTIVITY);

		searchHTTPHandlerEClass = createEClass(SEARCH_HTTP_HANDLER);
		createEReference(searchHTTPHandlerEClass, SEARCH_HTTP_HANDLER__IS_HTTP_ACTIVITY_HANDLER);
		createEReference(searchHTTPHandlerEClass, SEARCH_HTTP_HANDLER__SEARCHES_JAVA_RESOURCE_MODEL);

		searchablePropertyEClass = createEClass(SEARCHABLE_PROPERTY);
		createEReference(searchablePropertyEClass, SEARCHABLE_PROPERTY__IS_SEARCHABLE_PROPERTY);

		searchableJavaResourceModelEClass = createEClass(SEARCHABLE_JAVA_RESOURCE_MODEL);
		createEReference(searchableJavaResourceModelEClass, SEARCHABLE_JAVA_RESOURCE_MODEL__HAS_SEARCHABLE_PROPERTY);
		createEReference(searchableJavaResourceModelEClass, SEARCHABLE_JAVA_RESOURCE_MODEL__IS_SEARCHABLE_JAVA_RESOURCE_MODEL);

		annJavaResourceModelEClass = createEClass(ANN_JAVA_RESOURCE_MODEL);
		createEReference(annJavaResourceModelEClass, ANN_JAVA_RESOURCE_MODEL__ANNOTATES_JAVA_RESOURCE_MODEL);
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
		RESTfulServicePSMPackage theRESTfulServicePSMPackage = (RESTfulServicePSMPackage)EPackage.Registry.INSTANCE.getEPackage(RESTfulServicePSMPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		annPSMComponentPropertyEClass.getESuperTypes().add(this.getAnnotatedElement());
		annJavaAlgoControllerEClass.getESuperTypes().add(this.getAnnotatedElement());
		annHTTPActivityEClass.getESuperTypes().add(this.getAnnotatedElement());
		annHTTPActivityHandlerEClass.getESuperTypes().add(this.getAnnotatedElement());
		searchControllerEClass.getESuperTypes().add(this.getAnnotation());
		searchHTTPActivityEClass.getESuperTypes().add(this.getAnnotation());
		searchHTTPHandlerEClass.getESuperTypes().add(this.getAnnotation());
		searchablePropertyEClass.getESuperTypes().add(this.getAnnotation());
		searchableJavaResourceModelEClass.getESuperTypes().add(this.getAnnotation());
		annJavaResourceModelEClass.getESuperTypes().add(this.getAnnotatedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(annotationModelEClass, AnnotationModel.class, "AnnotationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotationModel_HasAnnotatedElement(), this.getAnnotatedElement(), null, "hasAnnotatedElement", null, 1, -1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationModel_HasAnnotation(), this.getAnnotation(), null, "hasAnnotation", null, 1, -1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationModel_AnnotatesRESTfulServicePSM(), theRESTfulServicePSMPackage.getServicePSM(), null, "annotatesRESTfulServicePSM", null, 1, 1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotatedElementEClass, AnnotatedElement.class, "AnnotatedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(annPSMComponentPropertyEClass, AnnPSMComponentProperty.class, "AnnPSMComponentProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnPSMComponentProperty_AnnotatesPSMComponentProperty(), theRESTfulServicePSMPackage.getPSMComponentProperty(), null, "annotatesPSMComponentProperty", null, 1, 1, AnnPSMComponentProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annJavaAlgoControllerEClass, AnnJavaAlgoController.class, "AnnJavaAlgoController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnJavaAlgoController_AnnotatesJavaAlgoController(), theRESTfulServicePSMPackage.getJavaAlgoResourceController(), null, "annotatesJavaAlgoController", null, 1, 1, AnnJavaAlgoController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annHTTPActivityEClass, AnnHTTPActivity.class, "AnnHTTPActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnHTTPActivity_AnnotatesHTTPActivity(), theRESTfulServicePSMPackage.getHTTPActivity(), null, "annotatesHTTPActivity", null, 1, 1, AnnHTTPActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annHTTPActivityHandlerEClass, AnnHTTPActivityHandler.class, "AnnHTTPActivityHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnHTTPActivityHandler_AnnotatesHTTPActivityHandler(), theRESTfulServicePSMPackage.getHTTPActivityHandler(), null, "annotatesHTTPActivityHandler", null, 1, 1, AnnHTTPActivityHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(searchControllerEClass, SearchController.class, "SearchController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSearchController_IsSearchController(), this.getAnnJavaAlgoController(), null, "isSearchController", null, 1, 1, SearchController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(searchHTTPActivityEClass, SearchHTTPActivity.class, "SearchHTTPActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSearchHTTPActivity_IsSearchHTTPActivity(), this.getAnnHTTPActivity(), null, "isSearchHTTPActivity", null, 1, 1, SearchHTTPActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(searchHTTPHandlerEClass, SearchHTTPHandler.class, "SearchHTTPHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSearchHTTPHandler_IsHTTPActivityHandler(), this.getAnnHTTPActivityHandler(), null, "isHTTPActivityHandler", null, 1, 1, SearchHTTPHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSearchHTTPHandler_SearchesJavaResourceModel(), this.getSearchableJavaResourceModel(), null, "searchesJavaResourceModel", null, 1, -1, SearchHTTPHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(searchablePropertyEClass, SearchableProperty.class, "SearchableProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSearchableProperty_IsSearchableProperty(), this.getAnnPSMComponentProperty(), null, "isSearchableProperty", null, 1, 1, SearchableProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(searchableJavaResourceModelEClass, SearchableJavaResourceModel.class, "SearchableJavaResourceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSearchableJavaResourceModel_HasSearchableProperty(), this.getSearchableProperty(), null, "hasSearchableProperty", null, 1, -1, SearchableJavaResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSearchableJavaResourceModel_IsSearchableJavaResourceModel(), this.getAnnJavaResourceModel(), null, "isSearchableJavaResourceModel", null, 1, 1, SearchableJavaResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annJavaResourceModelEClass, AnnJavaResourceModel.class, "AnnJavaResourceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnJavaResourceModel_AnnotatesJavaResourceModel(), theRESTfulServicePSMPackage.getJavaResourceModel(), null, "annotatesJavaResourceModel", null, 1, 1, AnnJavaResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SearchLayerPSMPackageImpl
