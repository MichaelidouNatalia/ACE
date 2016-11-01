/**
 */
package AuthenticationLayerCIM.impl;

import AuthenticationLayerCIM.AnnCRUDActivity;
import AuthenticationLayerCIM.AnnProperty;
import AuthenticationLayerCIM.AnnResource;
import AuthenticationLayerCIM.AnnotatedElement;
import AuthenticationLayerCIM.Annotation;
import AuthenticationLayerCIM.AnnotationModel;
import AuthenticationLayerCIM.AuthenticationLayerCIMFactory;
import AuthenticationLayerCIM.AuthenticationLayerCIMPackage;
import AuthenticationLayerCIM.AuthenticationMode;
import AuthenticationLayerCIM.AuthenticationModel;
import AuthenticationLayerCIM.AuthenticationOnlyMode;
import AuthenticationLayerCIM.AuthenticationToken;
import AuthenticationLayerCIM.BothMode;
import AuthenticationLayerCIM.GuestMode;
import AuthenticationLayerCIM.Password;

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
public class AuthenticationLayerCIMPackageImpl extends EPackageImpl implements AuthenticationLayerCIMPackage {
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
	private EClass authenticationModelEClass = null;

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
	private EClass authenticationModeEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annCRUDActivityEClass = null;

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
	 * @see AuthenticationLayerCIM.AuthenticationLayerCIMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AuthenticationLayerCIMPackageImpl() {
		super(eNS_URI, AuthenticationLayerCIMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AuthenticationLayerCIMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AuthenticationLayerCIMPackage init() {
		if (isInited) return (AuthenticationLayerCIMPackage)EPackage.Registry.INSTANCE.getEPackage(AuthenticationLayerCIMPackage.eNS_URI);

		// Obtain or create and register package
		AuthenticationLayerCIMPackageImpl theAuthenticationLayerCIMPackage = (AuthenticationLayerCIMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AuthenticationLayerCIMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AuthenticationLayerCIMPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ServiceCIMPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAuthenticationLayerCIMPackage.createPackageContents();

		// Initialize created meta-data
		theAuthenticationLayerCIMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAuthenticationLayerCIMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AuthenticationLayerCIMPackage.eNS_URI, theAuthenticationLayerCIMPackage);
		return theAuthenticationLayerCIMPackage;
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
	public EClass getAuthenticationModel() {
		return authenticationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthenticationModel_HasAuthenticationToken() {
		return (EReference)authenticationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthenticationModel_ResourceAuthenticationModel() {
		return (EReference)authenticationModelEClass.getEStructuralFeatures().get(1);
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
	public EReference getAuthenticationToken_PropertyAuthenticationToken() {
		return (EReference)authenticationTokenEClass.getEStructuralFeatures().get(3);
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
	public EClass getAuthenticationMode() {
		return authenticationModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthenticationMode_CRUDActivityAuthenticationMode() {
		return (EReference)authenticationModeEClass.getEStructuralFeatures().get(0);
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
	public EClass getAnnResource() {
		return annResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnResource_AnnotatesResource() {
		return (EReference)annResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnProperty() {
		return annPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnProperty_AnnotatesProperty() {
		return (EReference)annPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnCRUDActivity() {
		return annCRUDActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnCRUDActivity_AnnotatesCRUDActivity() {
		return (EReference)annCRUDActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnCRUDActivity_Name() {
		return (EAttribute)annCRUDActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnCRUDActivity_BelongsToResource() {
		return (EReference)annCRUDActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationLayerCIMFactory getAuthenticationLayerCIMFactory() {
		return (AuthenticationLayerCIMFactory)getEFactoryInstance();
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

		annotationEClass = createEClass(ANNOTATION);

		annotatedElementEClass = createEClass(ANNOTATED_ELEMENT);

		authenticationModelEClass = createEClass(AUTHENTICATION_MODEL);
		createEReference(authenticationModelEClass, AUTHENTICATION_MODEL__HAS_AUTHENTICATION_TOKEN);
		createEReference(authenticationModelEClass, AUTHENTICATION_MODEL__RESOURCE_AUTHENTICATION_MODEL);

		authenticationTokenEClass = createEClass(AUTHENTICATION_TOKEN);
		createEAttribute(authenticationTokenEClass, AUTHENTICATION_TOKEN__NAME);
		createEAttribute(authenticationTokenEClass, AUTHENTICATION_TOKEN__TYPE);
		createEAttribute(authenticationTokenEClass, AUTHENTICATION_TOKEN__BIS_UNIQUE);
		createEReference(authenticationTokenEClass, AUTHENTICATION_TOKEN__PROPERTY_AUTHENTICATION_TOKEN);

		passwordEClass = createEClass(PASSWORD);

		authenticationModeEClass = createEClass(AUTHENTICATION_MODE);
		createEReference(authenticationModeEClass, AUTHENTICATION_MODE__CRUD_ACTIVITY_AUTHENTICATION_MODE);

		guestModeEClass = createEClass(GUEST_MODE);

		authenticationOnlyModeEClass = createEClass(AUTHENTICATION_ONLY_MODE);

		bothModeEClass = createEClass(BOTH_MODE);

		annResourceEClass = createEClass(ANN_RESOURCE);
		createEReference(annResourceEClass, ANN_RESOURCE__ANNOTATES_RESOURCE);

		annPropertyEClass = createEClass(ANN_PROPERTY);
		createEReference(annPropertyEClass, ANN_PROPERTY__ANNOTATES_PROPERTY);

		annCRUDActivityEClass = createEClass(ANN_CRUD_ACTIVITY);
		createEReference(annCRUDActivityEClass, ANN_CRUD_ACTIVITY__ANNOTATES_CRUD_ACTIVITY);
		createEAttribute(annCRUDActivityEClass, ANN_CRUD_ACTIVITY__NAME);
		createEReference(annCRUDActivityEClass, ANN_CRUD_ACTIVITY__BELONGS_TO_RESOURCE);
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
		authenticationModelEClass.getESuperTypes().add(this.getAnnotation());
		authenticationTokenEClass.getESuperTypes().add(this.getAnnotation());
		passwordEClass.getESuperTypes().add(this.getAuthenticationToken());
		authenticationModeEClass.getESuperTypes().add(this.getAnnotation());
		guestModeEClass.getESuperTypes().add(this.getAuthenticationMode());
		authenticationOnlyModeEClass.getESuperTypes().add(this.getAuthenticationMode());
		bothModeEClass.getESuperTypes().add(this.getAuthenticationMode());
		annResourceEClass.getESuperTypes().add(this.getAnnotatedElement());
		annPropertyEClass.getESuperTypes().add(this.getAnnotatedElement());
		annCRUDActivityEClass.getESuperTypes().add(this.getAnnotatedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(annotationModelEClass, AnnotationModel.class, "AnnotationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotationModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationModel_HasAnnotatedElement(), this.getAnnotatedElement(), null, "hasAnnotatedElement", null, 1, -1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationModel_HasAnnotation(), this.getAnnotation(), null, "hasAnnotation", null, 1, -1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(annotatedElementEClass, AnnotatedElement.class, "AnnotatedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(authenticationModelEClass, AuthenticationModel.class, "AuthenticationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuthenticationModel_HasAuthenticationToken(), this.getAuthenticationToken(), null, "hasAuthenticationToken", null, 2, 2, AuthenticationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthenticationModel_ResourceAuthenticationModel(), this.getAnnResource(), null, "ResourceAuthenticationModel", null, 1, 1, AuthenticationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authenticationTokenEClass, AuthenticationToken.class, "AuthenticationToken", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthenticationToken_Name(), ecorePackage.getEString(), "name", null, 1, 1, AuthenticationToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthenticationToken_Type(), ecorePackage.getEString(), "type", null, 1, 1, AuthenticationToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthenticationToken_BIsUnique(), ecorePackage.getEBoolean(), "bIsUnique", null, 1, 1, AuthenticationToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthenticationToken_PropertyAuthenticationToken(), this.getAnnProperty(), null, "PropertyAuthenticationToken", null, 1, 1, AuthenticationToken.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(passwordEClass, Password.class, "Password", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(authenticationModeEClass, AuthenticationMode.class, "AuthenticationMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuthenticationMode_CRUDActivityAuthenticationMode(), this.getAnnCRUDActivity(), null, "CRUDActivityAuthenticationMode", null, 1, 1, AuthenticationMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guestModeEClass, GuestMode.class, "GuestMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(authenticationOnlyModeEClass, AuthenticationOnlyMode.class, "AuthenticationOnlyMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bothModeEClass, BothMode.class, "BothMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(annResourceEClass, AnnResource.class, "AnnResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnResource_AnnotatesResource(), theServiceCIMPackage.getResource(), null, "annotatesResource", null, 1, 1, AnnResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annPropertyEClass, AnnProperty.class, "AnnProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnProperty_AnnotatesProperty(), theServiceCIMPackage.getProperty(), null, "annotatesProperty", null, 1, 1, AnnProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annCRUDActivityEClass, AnnCRUDActivity.class, "AnnCRUDActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnCRUDActivity_AnnotatesCRUDActivity(), theServiceCIMPackage.getCRUDActivity(), null, "annotatesCRUDActivity", null, 1, 1, AnnCRUDActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnCRUDActivity_Name(), ecorePackage.getEString(), "name", null, 1, 1, AnnCRUDActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnCRUDActivity_BelongsToResource(), theServiceCIMPackage.getResource(), null, "belongsToResource", null, 1, 1, AnnCRUDActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AuthenticationLayerCIMPackageImpl
