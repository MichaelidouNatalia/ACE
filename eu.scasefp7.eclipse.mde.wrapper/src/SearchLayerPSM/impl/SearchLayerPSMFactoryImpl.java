/**
 */
package SearchLayerPSM.impl;

import SearchLayerPSM.*;

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
public class SearchLayerPSMFactoryImpl extends EFactoryImpl implements SearchLayerPSMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SearchLayerPSMFactory init() {
		try {
			SearchLayerPSMFactory theSearchLayerPSMFactory = (SearchLayerPSMFactory)EPackage.Registry.INSTANCE.getEFactory(SearchLayerPSMPackage.eNS_URI);
			if (theSearchLayerPSMFactory != null) {
				return theSearchLayerPSMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SearchLayerPSMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchLayerPSMFactoryImpl() {
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
			case SearchLayerPSMPackage.ANNOTATION_MODEL: return createAnnotationModel();
			case SearchLayerPSMPackage.ANNOTATED_ELEMENT: return createAnnotatedElement();
			case SearchLayerPSMPackage.ANNOTATION: return createAnnotation();
			case SearchLayerPSMPackage.ANN_PSM_COMPONENT_PROPERTY: return createAnnPSMComponentProperty();
			case SearchLayerPSMPackage.ANN_JAVA_ALGO_CONTROLLER: return createAnnJavaAlgoController();
			case SearchLayerPSMPackage.ANN_HTTP_ACTIVITY: return createAnnHTTPActivity();
			case SearchLayerPSMPackage.ANN_HTTP_ACTIVITY_HANDLER: return createAnnHTTPActivityHandler();
			case SearchLayerPSMPackage.SEARCH_CONTROLLER: return createSearchController();
			case SearchLayerPSMPackage.SEARCH_HTTP_ACTIVITY: return createSearchHTTPActivity();
			case SearchLayerPSMPackage.SEARCH_HTTP_HANDLER: return createSearchHTTPHandler();
			case SearchLayerPSMPackage.SEARCHABLE_PROPERTY: return createSearchableProperty();
			case SearchLayerPSMPackage.SEARCHABLE_JAVA_RESOURCE_MODEL: return createSearchableJavaResourceModel();
			case SearchLayerPSMPackage.ANN_JAVA_RESOURCE_MODEL: return createAnnJavaResourceModel();
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
	public AnnPSMComponentProperty createAnnPSMComponentProperty() {
		AnnPSMComponentPropertyImpl annPSMComponentProperty = new AnnPSMComponentPropertyImpl();
		return annPSMComponentProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnJavaAlgoController createAnnJavaAlgoController() {
		AnnJavaAlgoControllerImpl annJavaAlgoController = new AnnJavaAlgoControllerImpl();
		return annJavaAlgoController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnHTTPActivity createAnnHTTPActivity() {
		AnnHTTPActivityImpl annHTTPActivity = new AnnHTTPActivityImpl();
		return annHTTPActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnHTTPActivityHandler createAnnHTTPActivityHandler() {
		AnnHTTPActivityHandlerImpl annHTTPActivityHandler = new AnnHTTPActivityHandlerImpl();
		return annHTTPActivityHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchController createSearchController() {
		SearchControllerImpl searchController = new SearchControllerImpl();
		return searchController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchHTTPActivity createSearchHTTPActivity() {
		SearchHTTPActivityImpl searchHTTPActivity = new SearchHTTPActivityImpl();
		return searchHTTPActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchHTTPHandler createSearchHTTPHandler() {
		SearchHTTPHandlerImpl searchHTTPHandler = new SearchHTTPHandlerImpl();
		return searchHTTPHandler;
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
	public SearchableJavaResourceModel createSearchableJavaResourceModel() {
		SearchableJavaResourceModelImpl searchableJavaResourceModel = new SearchableJavaResourceModelImpl();
		return searchableJavaResourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnJavaResourceModel createAnnJavaResourceModel() {
		AnnJavaResourceModelImpl annJavaResourceModel = new AnnJavaResourceModelImpl();
		return annJavaResourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchLayerPSMPackage getSearchLayerPSMPackage() {
		return (SearchLayerPSMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SearchLayerPSMPackage getPackage() {
		return SearchLayerPSMPackage.eINSTANCE;
	}

} //SearchLayerPSMFactoryImpl
