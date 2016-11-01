/**
 */
package SearchLayerCIM.impl;

import SearchLayerCIM.AnnAlgoResource;
import SearchLayerCIM.AnnCRUDResource;
import SearchLayerCIM.AnnProperty;
import SearchLayerCIM.AnnotatedElement;
import SearchLayerCIM.Annotation;
import SearchLayerCIM.AnnotationModel;
import SearchLayerCIM.SearchLayerCIMFactory;
import SearchLayerCIM.SearchLayerCIMPackage;
import SearchLayerCIM.SearchResource;
import SearchLayerCIM.SearchableProperty;
import SearchLayerCIM.SearchableResource;

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
public class SearchLayerCIMPackageImpl extends EPackageImpl implements SearchLayerCIMPackage {
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
	private EClass annPropertyEClass = null;

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
	private EClass searchResourceEClass = null;

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
	private EClass searchableResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annCRUDResourceEClass = null;

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
	 * @see SearchLayerCIM.SearchLayerCIMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SearchLayerCIMPackageImpl() {
		super(eNS_URI, SearchLayerCIMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SearchLayerCIMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SearchLayerCIMPackage init() {
		if (isInited) return (SearchLayerCIMPackage)EPackage.Registry.INSTANCE.getEPackage(SearchLayerCIMPackage.eNS_URI);

		// Obtain or create and register package
		SearchLayerCIMPackageImpl theSearchLayerCIMPackage = (SearchLayerCIMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SearchLayerCIMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SearchLayerCIMPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ServiceCIMPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSearchLayerCIMPackage.createPackageContents();

		// Initialize created meta-data
		theSearchLayerCIMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSearchLayerCIMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SearchLayerCIMPackage.eNS_URI, theSearchLayerCIMPackage);
		return theSearchLayerCIMPackage;
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
	public EClass getSearchResource() {
		return searchResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchResource_AlgoResourceIsSearchResource() {
		return (EReference)searchResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchResource_SearchesResource() {
		return (EReference)searchResourceEClass.getEStructuralFeatures().get(1);
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
	public EReference getSearchableProperty_PropertyIsSearchable() {
		return (EReference)searchablePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSearchableResource() {
		return searchableResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchableResource_ResourceIsSearchable() {
		return (EReference)searchableResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSearchableResource_HasSearchableProperty() {
		return (EReference)searchableResourceEClass.getEStructuralFeatures().get(1);
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
	public EReference getAnnCRUDResource_AnnotatesResource() {
		return (EReference)annCRUDResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchLayerCIMFactory getSearchLayerCIMFactory() {
		return (SearchLayerCIMFactory)getEFactoryInstance();
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

		annPropertyEClass = createEClass(ANN_PROPERTY);
		createEReference(annPropertyEClass, ANN_PROPERTY__ANNOTATES_PROPERTY);

		annAlgoResourceEClass = createEClass(ANN_ALGO_RESOURCE);
		createEReference(annAlgoResourceEClass, ANN_ALGO_RESOURCE__ANNOTATES_ALGO_RESOURCE);

		searchResourceEClass = createEClass(SEARCH_RESOURCE);
		createEReference(searchResourceEClass, SEARCH_RESOURCE__ALGO_RESOURCE_IS_SEARCH_RESOURCE);
		createEReference(searchResourceEClass, SEARCH_RESOURCE__SEARCHES_RESOURCE);

		searchablePropertyEClass = createEClass(SEARCHABLE_PROPERTY);
		createEReference(searchablePropertyEClass, SEARCHABLE_PROPERTY__PROPERTY_IS_SEARCHABLE);

		searchableResourceEClass = createEClass(SEARCHABLE_RESOURCE);
		createEReference(searchableResourceEClass, SEARCHABLE_RESOURCE__RESOURCE_IS_SEARCHABLE);
		createEReference(searchableResourceEClass, SEARCHABLE_RESOURCE__HAS_SEARCHABLE_PROPERTY);

		annCRUDResourceEClass = createEClass(ANN_CRUD_RESOURCE);
		createEReference(annCRUDResourceEClass, ANN_CRUD_RESOURCE__ANNOTATES_RESOURCE);
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
		annPropertyEClass.getESuperTypes().add(this.getAnnotatedElement());
		annAlgoResourceEClass.getESuperTypes().add(this.getAnnotatedElement());
		searchResourceEClass.getESuperTypes().add(this.getAnnotation());
		searchablePropertyEClass.getESuperTypes().add(this.getAnnotation());
		searchableResourceEClass.getESuperTypes().add(this.getAnnotation());
		annCRUDResourceEClass.getESuperTypes().add(this.getAnnotatedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(annotationModelEClass, AnnotationModel.class, "AnnotationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotationModel_HasAnnotatedElement(), this.getAnnotatedElement(), null, "hasAnnotatedElement", null, 1, -1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationModel_HasAnnotation(), this.getAnnotation(), null, "hasAnnotation", null, 1, -1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotatedElementEClass, AnnotatedElement.class, "AnnotatedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(annPropertyEClass, AnnProperty.class, "AnnProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnProperty_AnnotatesProperty(), theServiceCIMPackage.getProperty(), null, "annotatesProperty", null, 1, 1, AnnProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annAlgoResourceEClass, AnnAlgoResource.class, "AnnAlgoResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnAlgoResource_AnnotatesAlgoResource(), theServiceCIMPackage.getResource(), null, "annotatesAlgoResource", null, 1, 1, AnnAlgoResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(searchResourceEClass, SearchResource.class, "SearchResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSearchResource_AlgoResourceIsSearchResource(), this.getAnnAlgoResource(), null, "AlgoResourceIsSearchResource", null, 1, 1, SearchResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSearchResource_SearchesResource(), this.getSearchableResource(), null, "searchesResource", null, 1, -1, SearchResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(searchablePropertyEClass, SearchableProperty.class, "SearchableProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSearchableProperty_PropertyIsSearchable(), this.getAnnProperty(), null, "PropertyIsSearchable", null, 1, 1, SearchableProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(searchableResourceEClass, SearchableResource.class, "SearchableResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSearchableResource_ResourceIsSearchable(), this.getAnnCRUDResource(), null, "ResourceIsSearchable", null, 1, 1, SearchableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSearchableResource_HasSearchableProperty(), this.getSearchableProperty(), null, "hasSearchableProperty", null, 1, -1, SearchableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annCRUDResourceEClass, AnnCRUDResource.class, "AnnCRUDResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnCRUDResource_AnnotatesResource(), theServiceCIMPackage.getResource(), null, "annotatesResource", null, 1, 1, AnnCRUDResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SearchLayerCIMPackageImpl
