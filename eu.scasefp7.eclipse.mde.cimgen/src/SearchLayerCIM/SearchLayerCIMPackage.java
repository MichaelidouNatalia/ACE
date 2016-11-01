/**
 */
package SearchLayerCIM;

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
 * @see SearchLayerCIM.SearchLayerCIMFactory
 * @model kind="package"
 * @generated
 */
public interface SearchLayerCIMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SearchLayerCIM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/eu.scasefp7.eclipse.mde.m2m/Metamodels/SearchLayerCIMMetamodel.ecore";

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
	SearchLayerCIMPackage eINSTANCE = SearchLayerCIM.impl.SearchLayerCIMPackageImpl.init();

	/**
	 * The meta object id for the '{@link SearchLayerCIM.impl.AnnotationModelImpl <em>Annotation Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SearchLayerCIM.impl.AnnotationModelImpl
	 * @see SearchLayerCIM.impl.SearchLayerCIMPackageImpl#getAnnotationModel()
	 * @generated
	 */
	int ANNOTATION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Has Annotated Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MODEL__HAS_ANNOTATED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Has Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MODEL__HAS_ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_MODEL__NAME = 2;

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
	 * The meta object id for the '{@link SearchLayerCIM.impl.AnnotatedElementImpl <em>Annotated Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SearchLayerCIM.impl.AnnotatedElementImpl
	 * @see SearchLayerCIM.impl.SearchLayerCIMPackageImpl#getAnnotatedElement()
	 * @generated
	 */
	int ANNOTATED_ELEMENT = 1;

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
	 * The meta object id for the '{@link SearchLayerCIM.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SearchLayerCIM.impl.AnnotationImpl
	 * @see SearchLayerCIM.impl.SearchLayerCIMPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 2;

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
	 * The meta object id for the '{@link SearchLayerCIM.impl.AnnPropertyImpl <em>Ann Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SearchLayerCIM.impl.AnnPropertyImpl
	 * @see SearchLayerCIM.impl.SearchLayerCIMPackageImpl#getAnnProperty()
	 * @generated
	 */
	int ANN_PROPERTY = 3;

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
	 * The meta object id for the '{@link SearchLayerCIM.impl.AnnAlgoResourceImpl <em>Ann Algo Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SearchLayerCIM.impl.AnnAlgoResourceImpl
	 * @see SearchLayerCIM.impl.SearchLayerCIMPackageImpl#getAnnAlgoResource()
	 * @generated
	 */
	int ANN_ALGO_RESOURCE = 4;

	/**
	 * The feature id for the '<em><b>Annotates Algo Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_ALGO_RESOURCE__ANNOTATES_ALGO_RESOURCE = ANNOTATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ann Algo Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_ALGO_RESOURCE_FEATURE_COUNT = ANNOTATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ann Algo Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_ALGO_RESOURCE_OPERATION_COUNT = ANNOTATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SearchLayerCIM.impl.SearchResourceImpl <em>Search Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SearchLayerCIM.impl.SearchResourceImpl
	 * @see SearchLayerCIM.impl.SearchLayerCIMPackageImpl#getSearchResource()
	 * @generated
	 */
	int SEARCH_RESOURCE = 5;

	/**
	 * The feature id for the '<em><b>Algo Resource Is Search Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_RESOURCE__ALGO_RESOURCE_IS_SEARCH_RESOURCE = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Searches Resource</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_RESOURCE__SEARCHES_RESOURCE = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Search Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_RESOURCE_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Search Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_RESOURCE_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SearchLayerCIM.impl.SearchablePropertyImpl <em>Searchable Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SearchLayerCIM.impl.SearchablePropertyImpl
	 * @see SearchLayerCIM.impl.SearchLayerCIMPackageImpl#getSearchableProperty()
	 * @generated
	 */
	int SEARCHABLE_PROPERTY = 6;

	/**
	 * The feature id for the '<em><b>Property Is Searchable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCHABLE_PROPERTY__PROPERTY_IS_SEARCHABLE = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Searchable Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCHABLE_PROPERTY_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Searchable Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCHABLE_PROPERTY_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SearchLayerCIM.impl.SearchableResourceImpl <em>Searchable Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SearchLayerCIM.impl.SearchableResourceImpl
	 * @see SearchLayerCIM.impl.SearchLayerCIMPackageImpl#getSearchableResource()
	 * @generated
	 */
	int SEARCHABLE_RESOURCE = 7;

	/**
	 * The feature id for the '<em><b>Resource Is Searchable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCHABLE_RESOURCE__RESOURCE_IS_SEARCHABLE = ANNOTATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Searchable Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCHABLE_RESOURCE__HAS_SEARCHABLE_PROPERTY = ANNOTATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Searchable Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCHABLE_RESOURCE_FEATURE_COUNT = ANNOTATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Searchable Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCHABLE_RESOURCE_OPERATION_COUNT = ANNOTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SearchLayerCIM.impl.AnnCRUDResourceImpl <em>Ann CRUD Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SearchLayerCIM.impl.AnnCRUDResourceImpl
	 * @see SearchLayerCIM.impl.SearchLayerCIMPackageImpl#getAnnCRUDResource()
	 * @generated
	 */
	int ANN_CRUD_RESOURCE = 8;

	/**
	 * The feature id for the '<em><b>Annotates Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_CRUD_RESOURCE__ANNOTATES_RESOURCE = ANNOTATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ann CRUD Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_CRUD_RESOURCE_FEATURE_COUNT = ANNOTATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ann CRUD Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANN_CRUD_RESOURCE_OPERATION_COUNT = ANNOTATED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link SearchLayerCIM.AnnotationModel <em>Annotation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Model</em>'.
	 * @see SearchLayerCIM.AnnotationModel
	 * @generated
	 */
	EClass getAnnotationModel();

	/**
	 * Returns the meta object for the containment reference list '{@link SearchLayerCIM.AnnotationModel#getHasAnnotatedElement <em>Has Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Annotated Element</em>'.
	 * @see SearchLayerCIM.AnnotationModel#getHasAnnotatedElement()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EReference getAnnotationModel_HasAnnotatedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link SearchLayerCIM.AnnotationModel#getHasAnnotation <em>Has Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Annotation</em>'.
	 * @see SearchLayerCIM.AnnotationModel#getHasAnnotation()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EReference getAnnotationModel_HasAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link SearchLayerCIM.AnnotationModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SearchLayerCIM.AnnotationModel#getName()
	 * @see #getAnnotationModel()
	 * @generated
	 */
	EAttribute getAnnotationModel_Name();

	/**
	 * Returns the meta object for class '{@link SearchLayerCIM.AnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotated Element</em>'.
	 * @see SearchLayerCIM.AnnotatedElement
	 * @generated
	 */
	EClass getAnnotatedElement();

	/**
	 * Returns the meta object for class '{@link SearchLayerCIM.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see SearchLayerCIM.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for class '{@link SearchLayerCIM.AnnProperty <em>Ann Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ann Property</em>'.
	 * @see SearchLayerCIM.AnnProperty
	 * @generated
	 */
	EClass getAnnProperty();

	/**
	 * Returns the meta object for the reference '{@link SearchLayerCIM.AnnProperty#getAnnotatesProperty <em>Annotates Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotates Property</em>'.
	 * @see SearchLayerCIM.AnnProperty#getAnnotatesProperty()
	 * @see #getAnnProperty()
	 * @generated
	 */
	EReference getAnnProperty_AnnotatesProperty();

	/**
	 * Returns the meta object for class '{@link SearchLayerCIM.AnnAlgoResource <em>Ann Algo Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ann Algo Resource</em>'.
	 * @see SearchLayerCIM.AnnAlgoResource
	 * @generated
	 */
	EClass getAnnAlgoResource();

	/**
	 * Returns the meta object for the reference '{@link SearchLayerCIM.AnnAlgoResource#getAnnotatesAlgoResource <em>Annotates Algo Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotates Algo Resource</em>'.
	 * @see SearchLayerCIM.AnnAlgoResource#getAnnotatesAlgoResource()
	 * @see #getAnnAlgoResource()
	 * @generated
	 */
	EReference getAnnAlgoResource_AnnotatesAlgoResource();

	/**
	 * Returns the meta object for class '{@link SearchLayerCIM.SearchResource <em>Search Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Resource</em>'.
	 * @see SearchLayerCIM.SearchResource
	 * @generated
	 */
	EClass getSearchResource();

	/**
	 * Returns the meta object for the reference '{@link SearchLayerCIM.SearchResource#getAlgoResourceIsSearchResource <em>Algo Resource Is Search Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Algo Resource Is Search Resource</em>'.
	 * @see SearchLayerCIM.SearchResource#getAlgoResourceIsSearchResource()
	 * @see #getSearchResource()
	 * @generated
	 */
	EReference getSearchResource_AlgoResourceIsSearchResource();

	/**
	 * Returns the meta object for the containment reference list '{@link SearchLayerCIM.SearchResource#getSearchesResource <em>Searches Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Searches Resource</em>'.
	 * @see SearchLayerCIM.SearchResource#getSearchesResource()
	 * @see #getSearchResource()
	 * @generated
	 */
	EReference getSearchResource_SearchesResource();

	/**
	 * Returns the meta object for class '{@link SearchLayerCIM.SearchableProperty <em>Searchable Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Searchable Property</em>'.
	 * @see SearchLayerCIM.SearchableProperty
	 * @generated
	 */
	EClass getSearchableProperty();

	/**
	 * Returns the meta object for the reference '{@link SearchLayerCIM.SearchableProperty#getPropertyIsSearchable <em>Property Is Searchable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property Is Searchable</em>'.
	 * @see SearchLayerCIM.SearchableProperty#getPropertyIsSearchable()
	 * @see #getSearchableProperty()
	 * @generated
	 */
	EReference getSearchableProperty_PropertyIsSearchable();

	/**
	 * Returns the meta object for class '{@link SearchLayerCIM.SearchableResource <em>Searchable Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Searchable Resource</em>'.
	 * @see SearchLayerCIM.SearchableResource
	 * @generated
	 */
	EClass getSearchableResource();

	/**
	 * Returns the meta object for the reference '{@link SearchLayerCIM.SearchableResource#getResourceIsSearchable <em>Resource Is Searchable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Is Searchable</em>'.
	 * @see SearchLayerCIM.SearchableResource#getResourceIsSearchable()
	 * @see #getSearchableResource()
	 * @generated
	 */
	EReference getSearchableResource_ResourceIsSearchable();

	/**
	 * Returns the meta object for the containment reference list '{@link SearchLayerCIM.SearchableResource#getHasSearchableProperty <em>Has Searchable Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Searchable Property</em>'.
	 * @see SearchLayerCIM.SearchableResource#getHasSearchableProperty()
	 * @see #getSearchableResource()
	 * @generated
	 */
	EReference getSearchableResource_HasSearchableProperty();

	/**
	 * Returns the meta object for class '{@link SearchLayerCIM.AnnCRUDResource <em>Ann CRUD Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ann CRUD Resource</em>'.
	 * @see SearchLayerCIM.AnnCRUDResource
	 * @generated
	 */
	EClass getAnnCRUDResource();

	/**
	 * Returns the meta object for the reference '{@link SearchLayerCIM.AnnCRUDResource#getAnnotatesResource <em>Annotates Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotates Resource</em>'.
	 * @see SearchLayerCIM.AnnCRUDResource#getAnnotatesResource()
	 * @see #getAnnCRUDResource()
	 * @generated
	 */
	EReference getAnnCRUDResource_AnnotatesResource();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SearchLayerCIMFactory getSearchLayerCIMFactory();

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
		 * The meta object literal for the '{@link SearchLayerCIM.impl.AnnotationModelImpl <em>Annotation Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SearchLayerCIM.impl.AnnotationModelImpl
		 * @see SearchLayerCIM.impl.SearchLayerCIMPackageImpl#getAnnotationModel()
		 * @generated
		 */
		EClass ANNOTATION_MODEL = eINSTANCE.getAnnotationModel();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_MODEL__NAME = eINSTANCE.getAnnotationModel_Name();

		/**
		 * The meta object literal for the '{@link SearchLayerCIM.impl.AnnotatedElementImpl <em>Annotated Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SearchLayerCIM.impl.AnnotatedElementImpl
		 * @see SearchLayerCIM.impl.SearchLayerCIMPackageImpl#getAnnotatedElement()
		 * @generated
		 */
		EClass ANNOTATED_ELEMENT = eINSTANCE.getAnnotatedElement();

		/**
		 * The meta object literal for the '{@link SearchLayerCIM.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SearchLayerCIM.impl.AnnotationImpl
		 * @see SearchLayerCIM.impl.SearchLayerCIMPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '{@link SearchLayerCIM.impl.AnnPropertyImpl <em>Ann Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SearchLayerCIM.impl.AnnPropertyImpl
		 * @see SearchLayerCIM.impl.SearchLayerCIMPackageImpl#getAnnProperty()
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
		 * The meta object literal for the '{@link SearchLayerCIM.impl.AnnAlgoResourceImpl <em>Ann Algo Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SearchLayerCIM.impl.AnnAlgoResourceImpl
		 * @see SearchLayerCIM.impl.SearchLayerCIMPackageImpl#getAnnAlgoResource()
		 * @generated
		 */
		EClass ANN_ALGO_RESOURCE = eINSTANCE.getAnnAlgoResource();

		/**
		 * The meta object literal for the '<em><b>Annotates Algo Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANN_ALGO_RESOURCE__ANNOTATES_ALGO_RESOURCE = eINSTANCE.getAnnAlgoResource_AnnotatesAlgoResource();

		/**
		 * The meta object literal for the '{@link SearchLayerCIM.impl.SearchResourceImpl <em>Search Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SearchLayerCIM.impl.SearchResourceImpl
		 * @see SearchLayerCIM.impl.SearchLayerCIMPackageImpl#getSearchResource()
		 * @generated
		 */
		EClass SEARCH_RESOURCE = eINSTANCE.getSearchResource();

		/**
		 * The meta object literal for the '<em><b>Algo Resource Is Search Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH_RESOURCE__ALGO_RESOURCE_IS_SEARCH_RESOURCE = eINSTANCE.getSearchResource_AlgoResourceIsSearchResource();

		/**
		 * The meta object literal for the '<em><b>Searches Resource</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH_RESOURCE__SEARCHES_RESOURCE = eINSTANCE.getSearchResource_SearchesResource();

		/**
		 * The meta object literal for the '{@link SearchLayerCIM.impl.SearchablePropertyImpl <em>Searchable Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SearchLayerCIM.impl.SearchablePropertyImpl
		 * @see SearchLayerCIM.impl.SearchLayerCIMPackageImpl#getSearchableProperty()
		 * @generated
		 */
		EClass SEARCHABLE_PROPERTY = eINSTANCE.getSearchableProperty();

		/**
		 * The meta object literal for the '<em><b>Property Is Searchable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCHABLE_PROPERTY__PROPERTY_IS_SEARCHABLE = eINSTANCE.getSearchableProperty_PropertyIsSearchable();

		/**
		 * The meta object literal for the '{@link SearchLayerCIM.impl.SearchableResourceImpl <em>Searchable Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SearchLayerCIM.impl.SearchableResourceImpl
		 * @see SearchLayerCIM.impl.SearchLayerCIMPackageImpl#getSearchableResource()
		 * @generated
		 */
		EClass SEARCHABLE_RESOURCE = eINSTANCE.getSearchableResource();

		/**
		 * The meta object literal for the '<em><b>Resource Is Searchable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCHABLE_RESOURCE__RESOURCE_IS_SEARCHABLE = eINSTANCE.getSearchableResource_ResourceIsSearchable();

		/**
		 * The meta object literal for the '<em><b>Has Searchable Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCHABLE_RESOURCE__HAS_SEARCHABLE_PROPERTY = eINSTANCE.getSearchableResource_HasSearchableProperty();

		/**
		 * The meta object literal for the '{@link SearchLayerCIM.impl.AnnCRUDResourceImpl <em>Ann CRUD Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SearchLayerCIM.impl.AnnCRUDResourceImpl
		 * @see SearchLayerCIM.impl.SearchLayerCIMPackageImpl#getAnnCRUDResource()
		 * @generated
		 */
		EClass ANN_CRUD_RESOURCE = eINSTANCE.getAnnCRUDResource();

		/**
		 * The meta object literal for the '<em><b>Annotates Resource</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANN_CRUD_RESOURCE__ANNOTATES_RESOURCE = eINSTANCE.getAnnCRUDResource_AnnotatesResource();

	}

} //SearchLayerCIMPackage
