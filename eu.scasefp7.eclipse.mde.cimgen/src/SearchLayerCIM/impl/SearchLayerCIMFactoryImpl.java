/**
 */
package SearchLayerCIM.impl;

import SearchLayerCIM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SearchLayerCIMFactoryImpl extends EFactoryImpl implements SearchLayerCIMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SearchLayerCIMFactory init() {
		try {
			SearchLayerCIMFactory theSearchLayerCIMFactory = (SearchLayerCIMFactory)EPackage.Registry.INSTANCE.getEFactory(SearchLayerCIMPackage.eNS_URI);
			if (theSearchLayerCIMFactory != null) {
				return theSearchLayerCIMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SearchLayerCIMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchLayerCIMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SearchLayerCIMPackage.ANNOTATION_MODEL: return createAnnotationModel();
			case SearchLayerCIMPackage.ANNOTATED_ELEMENT: return createAnnotatedElement();
			case SearchLayerCIMPackage.ANNOTATION: return createAnnotation();
			case SearchLayerCIMPackage.ANN_PROPERTY: return createAnnProperty();
			case SearchLayerCIMPackage.ANN_ALGO_RESOURCE: return createAnnAlgoResource();
			case SearchLayerCIMPackage.SEARCH_RESOURCE: return createSearchResource();
			case SearchLayerCIMPackage.SEARCHABLE_PROPERTY: return createSearchableProperty();
			case SearchLayerCIMPackage.SEARCHABLE_RESOURCE: return createSearchableResource();
			case SearchLayerCIMPackage.ANN_CRUD_RESOURCE: return createAnnCRUDResource();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationModel createAnnotationModel() {
		AnnotationModelImpl annotationModel = new AnnotationModelImpl();
		return annotationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotatedElement createAnnotatedElement() {
		AnnotatedElementImpl annotatedElement = new AnnotatedElementImpl();
		return annotatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnProperty createAnnProperty() {
		AnnPropertyImpl annProperty = new AnnPropertyImpl();
		return annProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnAlgoResource createAnnAlgoResource() {
		AnnAlgoResourceImpl annAlgoResource = new AnnAlgoResourceImpl();
		return annAlgoResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchResource createSearchResource() {
		SearchResourceImpl searchResource = new SearchResourceImpl();
		return searchResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchableProperty createSearchableProperty() {
		SearchablePropertyImpl searchableProperty = new SearchablePropertyImpl();
		return searchableProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchableResource createSearchableResource() {
		SearchableResourceImpl searchableResource = new SearchableResourceImpl();
		return searchableResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnCRUDResource createAnnCRUDResource() {
		AnnCRUDResourceImpl annCRUDResource = new AnnCRUDResourceImpl();
		return annCRUDResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchLayerCIMPackage getSearchLayerCIMPackage() {
		return (SearchLayerCIMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SearchLayerCIMPackage getPackage() {
		return SearchLayerCIMPackage.eINSTANCE;
	}

} //SearchLayerCIMFactoryImpl
