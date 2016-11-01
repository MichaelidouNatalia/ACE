/**
 */
package AuthenticationLayerPSM.impl;

import AnnotationLayerStack.AnnotationLayerStackPackage;

import AnnotationLayerStack.impl.AnnotationLayerStackPackageImpl;

import AuthenticationLayerPSM.AnnHTTPActivity;
import AuthenticationLayerPSM.AnnHTTPActivityHandler;
import AuthenticationLayerPSM.AnnJPAController;
import AuthenticationLayerPSM.AnnotatedElement;
import AuthenticationLayerPSM.Annotation;
import AuthenticationLayerPSM.AnnotationModel;
import AuthenticationLayerPSM.AuthenticationLayerPSMFactory;
import AuthenticationLayerPSM.AuthenticationLayerPSMPackage;
import AuthenticationLayerPSM.AuthenticationMode;
import AuthenticationLayerPSM.AuthenticationOnlyMode;
import AuthenticationLayerPSM.AuthenticationPerformer;
import AuthenticationLayerPSM.AuthenticationToken;
import AuthenticationLayerPSM.BothMode;
import AuthenticationLayerPSM.GuestMode;
import AuthenticationLayerPSM.Password;

import AuthorizationLayerPSM.AuthorizationLayerPSMPackage;

import AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl;

import ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage;

import ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl;

import MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage;

import MDEMigratorPSMMetamodel.impl.MDEMigratorPSMMetamodelPackageImpl;

import RESTfulServicePSM.RESTfulServicePSMPackage;

import RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl;

import SearchLayerPSM.SearchLayerPSMPackage;

import SearchLayerPSM.impl.SearchLayerPSMPackageImpl;

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
public class AuthenticationLayerPSMPackageImpl extends EPackageImpl implements AuthenticationLayerPSMPackage {
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
	private EClass annotationEClass = null;

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
	private EClass authenticationModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationPerformerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationTokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passwordEClass = null;

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
	private EClass annJPAControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guestModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authenticationOnlyModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bothModeEClass = null;

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
	 * @see AuthenticationLayerPSM.AuthenticationLayerPSMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AuthenticationLayerPSMPackageImpl() {
		super(eNS_URI, AuthenticationLayerPSMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AuthenticationLayerPSMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AuthenticationLayerPSMPackage init() {
		if (isInited) return (AuthenticationLayerPSMPackage)EPackage.Registry.INSTANCE.getEPackage(AuthenticationLayerPSMPackage.eNS_URI);

		// Obtain or create and register package
		AuthenticationLayerPSMPackageImpl theAuthenticationLayerPSMPackage = (AuthenticationLayerPSMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AuthenticationLayerPSMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AuthenticationLayerPSMPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AnnotationLayerStackPackageImpl theAnnotationLayerStackPackage = (AnnotationLayerStackPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AnnotationLayerStackPackage.eNS_URI) instanceof AnnotationLayerStackPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnnotationLayerStackPackage.eNS_URI) : AnnotationLayerStackPackage.eINSTANCE);
		RESTfulServicePSMPackageImpl theRESTfulServicePSMPackage = (RESTfulServicePSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RESTfulServicePSMPackage.eNS_URI) instanceof RESTfulServicePSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RESTfulServicePSMPackage.eNS_URI) : RESTfulServicePSMPackage.eINSTANCE);
		SearchLayerPSMPackageImpl theSearchLayerPSMPackage = (SearchLayerPSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SearchLayerPSMPackage.eNS_URI) instanceof SearchLayerPSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SearchLayerPSMPackage.eNS_URI) : SearchLayerPSMPackage.eINSTANCE);
		ExternalServiceLayerPSMPackageImpl theExternalServiceLayerPSMPackage = (ExternalServiceLayerPSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExternalServiceLayerPSMPackage.eNS_URI) instanceof ExternalServiceLayerPSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExternalServiceLayerPSMPackage.eNS_URI) : ExternalServiceLayerPSMPackage.eINSTANCE);
		AuthorizationLayerPSMPackageImpl theAuthorizationLayerPSMPackage = (AuthorizationLayerPSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AuthorizationLayerPSMPackage.eNS_URI) instanceof AuthorizationLayerPSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AuthorizationLayerPSMPackage.eNS_URI) : AuthorizationLayerPSMPackage.eINSTANCE);
		MDEMigratorPSMMetamodelPackageImpl theMDEMigratorPSMMetamodelPackage = (MDEMigratorPSMMetamodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MDEMigratorPSMMetamodelPackage.eNS_URI) instanceof MDEMigratorPSMMetamodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MDEMigratorPSMMetamodelPackage.eNS_URI) : MDEMigratorPSMMetamodelPackage.eINSTANCE);

		// Create package meta-data objects
		theAuthenticationLayerPSMPackage.createPackageContents();
		theAnnotationLayerStackPackage.createPackageContents();
		theRESTfulServicePSMPackage.createPackageContents();
		theSearchLayerPSMPackage.createPackageContents();
		theExternalServiceLayerPSMPackage.createPackageContents();
		theAuthorizationLayerPSMPackage.createPackageContents();
		theMDEMigratorPSMMetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theAuthenticationLayerPSMPackage.initializePackageContents();
		theAnnotationLayerStackPackage.initializePackageContents();
		theRESTfulServicePSMPackage.initializePackageContents();
		theSearchLayerPSMPackage.initializePackageContents();
		theExternalServiceLayerPSMPackage.initializePackageContents();
		theAuthorizationLayerPSMPackage.initializePackageContents();
		theMDEMigratorPSMMetamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAuthenticationLayerPSMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AuthenticationLayerPSMPackage.eNS_URI, theAuthenticationLayerPSMPackage);
		return theAuthenticationLayerPSMPackage;
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
	public EAttribute getAnnotationModel_Name() {
		return (EAttribute)annotationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationModel_HasAnnotatedElement() {
		return (EReference)annotationModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationModel_HasAnnotation() {
		return (EReference)annotationModelEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getAnnotationModel_AnnotationType() {
		return (EAttribute)annotationModelEClass.getEStructuralFeatures().get(4);
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
	public EClass getAnnotatedElement() {
		return annotatedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotatedElement_Name() {
		return (EAttribute)annotatedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthenticationMode() {
		return authenticationModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthenticationMode_HTTPActivityHandlerHasAuthenticationMode() {
		return (EReference)authenticationModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthenticationMode_HTTPActivityHasAuthenticationMode() {
		return (EReference)authenticationModeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthenticationPerformer() {
		return authenticationPerformerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthenticationPerformer_HasAuthenticationToken() {
		return (EReference)authenticationPerformerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthenticationPerformer_IsSystemAuthenticationPerformer() {
		return (EReference)authenticationPerformerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticationPerformer_AuthenticationModelName() {
		return (EAttribute)authenticationPerformerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticationPerformer_AuthenticationModelParentName() {
		return (EAttribute)authenticationPerformerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthenticationToken() {
		return authenticationTokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticationToken_Name() {
		return (EAttribute)authenticationTokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticationToken_Type() {
		return (EAttribute)authenticationTokenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthenticationToken_BIsUnique() {
		return (EAttribute)authenticationTokenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassword() {
		return passwordEClass;
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
	public EClass getAnnJPAController() {
		return annJPAControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnJPAController_AnnotatesJPAController() {
		return (EReference)annJPAControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuestMode() {
		return guestModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthenticationOnlyMode() {
		return authenticationOnlyModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBothMode() {
		return bothModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationLayerPSMFactory getAuthenticationLayerPSMFactory() {
		return (AuthenticationLayerPSMFactory)getEFactoryInstance();
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
		createEAttribute(annotationModelEClass, ANNOTATION_MODEL__NAME);
		createEReference(annotationModelEClass, ANNOTATION_MODEL__HAS_ANNOTATED_ELEMENT);
		createEReference(annotationModelEClass, ANNOTATION_MODEL__HAS_ANNOTATION);
		createEReference(annotationModelEClass, ANNOTATION_MODEL__ANNOTATES_RES_TFUL_SERVICE_PSM);
		createEAttribute(annotationModelEClass, ANNOTATION_MODEL__ANNOTATION_TYPE);

		annotationEClass = createEClass(ANNOTATION);

		annotatedElementEClass = createEClass(ANNOTATED_ELEMENT);
		createEAttribute(annotatedElementEClass, ANNOTATED_ELEMENT__NAME);

		authenticationModeEClass = createEClass(AUTHENTICATION_MODE);
		createEReference(authenticationModeEClass, AUTHENTICATION_MODE__HTTP_ACTIVITY_HANDLER_HAS_AUTHENTICATION_MODE);
		createEReference(authenticationModeEClass, AUTHENTICATION_MODE__HTTP_ACTIVITY_HAS_AUTHENTICATION_MODE);

		authenticationPerformerEClass = createEClass(AUTHENTICATION_PERFORMER);
		createEReference(authenticationPerformerEClass, AUTHENTICATION_PERFORMER__HAS_AUTHENTICATION_TOKEN);
		createEReference(authenticationPerformerEClass, AUTHENTICATION_PERFORMER__IS_SYSTEM_AUTHENTICATION_PERFORMER);
		createEAttribute(authenticationPerformerEClass, AUTHENTICATION_PERFORMER__AUTHENTICATION_MODEL_NAME);
		createEAttribute(authenticationPerformerEClass, AUTHENTICATION_PERFORMER__AUTHENTICATION_MODEL_PARENT_NAME);

		authenticationTokenEClass = createEClass(AUTHENTICATION_TOKEN);
		createEAttribute(authenticationTokenEClass, AUTHENTICATION_TOKEN__NAME);
		createEAttribute(authenticationTokenEClass, AUTHENTICATION_TOKEN__TYPE);
		createEAttribute(authenticationTokenEClass, AUTHENTICATION_TOKEN__BIS_UNIQUE);

		passwordEClass = createEClass(PASSWORD);

		annHTTPActivityEClass = createEClass(ANN_HTTP_ACTIVITY);
		createEReference(annHTTPActivityEClass, ANN_HTTP_ACTIVITY__ANNOTATES_HTTP_ACTIVITY);

		annHTTPActivityHandlerEClass = createEClass(ANN_HTTP_ACTIVITY_HANDLER);
		createEReference(annHTTPActivityHandlerEClass, ANN_HTTP_ACTIVITY_HANDLER__ANNOTATES_HTTP_ACTIVITY_HANDLER);

		annJPAControllerEClass = createEClass(ANN_JPA_CONTROLLER);
		createEReference(annJPAControllerEClass, ANN_JPA_CONTROLLER__ANNOTATES_JPA_CONTROLLER);

		guestModeEClass = createEClass(GUEST_MODE);

		authenticationOnlyModeEClass = createEClass(AUTHENTICATION_ONLY_MODE);

		bothModeEClass = createEClass(BOTH_MODE);
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
		authenticationModeEClass.getESuperTypes().add(this.getAnnotation());
		authenticationPerformerEClass.getESuperTypes().add(this.getAnnotation());
		passwordEClass.getESuperTypes().add(this.getAuthenticationToken());
		annHTTPActivityEClass.getESuperTypes().add(this.getAnnotatedElement());
		annHTTPActivityHandlerEClass.getESuperTypes().add(this.getAnnotatedElement());
		annJPAControllerEClass.getESuperTypes().add(this.getAnnotatedElement());
		guestModeEClass.getESuperTypes().add(this.getAuthenticationMode());
		authenticationOnlyModeEClass.getESuperTypes().add(this.getAuthenticationMode());
		bothModeEClass.getESuperTypes().add(this.getAuthenticationMode());

		// Initialize classes, features, and operations; add parameters
		initEClass(annotationModelEClass, AnnotationModel.class, "AnnotationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotationModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationModel_HasAnnotatedElement(), this.getAnnotatedElement(), null, "hasAnnotatedElement", null, 1, -1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationModel_HasAnnotation(), this.getAnnotation(), null, "hasAnnotation", null, 1, -1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationModel_AnnotatesRESTfulServicePSM(), theRESTfulServicePSMPackage.getServicePSM(), null, "annotatesRESTfulServicePSM", null, 1, 1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationModel_AnnotationType(), ecorePackage.getEString(), "annotationType", null, 1, 1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(annotatedElementEClass, AnnotatedElement.class, "AnnotatedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotatedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, AnnotatedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authenticationModeEClass, AuthenticationMode.class, "AuthenticationMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuthenticationMode_HTTPActivityHandlerHasAuthenticationMode(), this.getAnnHTTPActivityHandler(), null, "HTTPActivityHandlerHasAuthenticationMode", null, 1, -1, AuthenticationMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthenticationMode_HTTPActivityHasAuthenticationMode(), this.getAnnHTTPActivity(), null, "HTTPActivityHasAuthenticationMode", null, 1, -1, AuthenticationMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authenticationPerformerEClass, AuthenticationPerformer.class, "AuthenticationPerformer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuthenticationPerformer_HasAuthenticationToken(), this.getAuthenticationToken(), null, "hasAuthenticationToken", null, 2, 2, AuthenticationPerformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthenticationPerformer_IsSystemAuthenticationPerformer(), this.getAnnJPAController(), null, "isSystemAuthenticationPerformer", null, 1, 1, AuthenticationPerformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthenticationPerformer_AuthenticationModelName(), ecorePackage.getEString(), "authenticationModelName", null, 1, 1, AuthenticationPerformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthenticationPerformer_AuthenticationModelParentName(), ecorePackage.getEString(), "authenticationModelParentName", null, 1, 1, AuthenticationPerformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authenticationTokenEClass, AuthenticationToken.class, "AuthenticationToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthenticationToken_Name(), ecorePackage.getEString(), "name", null, 1, 1, AuthenticationToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthenticationToken_Type(), ecorePackage.getEString(), "type", null, 1, 1, AuthenticationToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthenticationToken_BIsUnique(), ecorePackage.getEBoolean(), "bIsUnique", null, 1, 1, AuthenticationToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(passwordEClass, Password.class, "Password", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(annHTTPActivityEClass, AnnHTTPActivity.class, "AnnHTTPActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnHTTPActivity_AnnotatesHTTPActivity(), theRESTfulServicePSMPackage.getHTTPActivity(), null, "annotatesHTTPActivity", null, 1, 1, AnnHTTPActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annHTTPActivityHandlerEClass, AnnHTTPActivityHandler.class, "AnnHTTPActivityHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnHTTPActivityHandler_AnnotatesHTTPActivityHandler(), theRESTfulServicePSMPackage.getHTTPActivityHandler(), null, "annotatesHTTPActivityHandler", null, 1, 1, AnnHTTPActivityHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annJPAControllerEClass, AnnJPAController.class, "AnnJPAController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnJPAController_AnnotatesJPAController(), theRESTfulServicePSMPackage.getHibernateController(), null, "annotatesJPAController", null, 1, 1, AnnJPAController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guestModeEClass, GuestMode.class, "GuestMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(authenticationOnlyModeEClass, AuthenticationOnlyMode.class, "AuthenticationOnlyMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bothModeEClass, BothMode.class, "BothMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //AuthenticationLayerPSMPackageImpl
