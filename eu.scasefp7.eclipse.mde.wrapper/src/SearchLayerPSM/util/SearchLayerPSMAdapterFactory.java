/**
 */
package SearchLayerPSM.util;

import SearchLayerPSM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see SearchLayerPSM.SearchLayerPSMPackage
 * @generated
 */
public class SearchLayerPSMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SearchLayerPSMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchLayerPSMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SearchLayerPSMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchLayerPSMSwitch<Adapter> modelSwitch =
		new SearchLayerPSMSwitch<Adapter>() {
			@Override
			public Adapter caseAnnotationModel(AnnotationModel object) {
				return createAnnotationModelAdapter();
			}
			@Override
			public Adapter caseAnnotatedElement(AnnotatedElement object) {
				return createAnnotatedElementAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			@Override
			public Adapter caseAnnPSMComponentProperty(AnnPSMComponentProperty object) {
				return createAnnPSMComponentPropertyAdapter();
			}
			@Override
			public Adapter caseAnnJavaAlgoController(AnnJavaAlgoController object) {
				return createAnnJavaAlgoControllerAdapter();
			}
			@Override
			public Adapter caseAnnHTTPActivity(AnnHTTPActivity object) {
				return createAnnHTTPActivityAdapter();
			}
			@Override
			public Adapter caseAnnHTTPActivityHandler(AnnHTTPActivityHandler object) {
				return createAnnHTTPActivityHandlerAdapter();
			}
			@Override
			public Adapter caseSearchController(SearchController object) {
				return createSearchControllerAdapter();
			}
			@Override
			public Adapter caseSearchHTTPActivity(SearchHTTPActivity object) {
				return createSearchHTTPActivityAdapter();
			}
			@Override
			public Adapter caseSearchHTTPHandler(SearchHTTPHandler object) {
				return createSearchHTTPHandlerAdapter();
			}
			@Override
			public Adapter caseSearchableProperty(SearchableProperty object) {
				return createSearchablePropertyAdapter();
			}
			@Override
			public Adapter caseSearchableJavaResourceModel(SearchableJavaResourceModel object) {
				return createSearchableJavaResourceModelAdapter();
			}
			@Override
			public Adapter caseAnnJavaResourceModel(AnnJavaResourceModel object) {
				return createAnnJavaResourceModelAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link SearchLayerPSM.AnnotationModel <em>Annotation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SearchLayerPSM.AnnotationModel
	 * @generated
	 */
	public Adapter createAnnotationModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SearchLayerPSM.AnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SearchLayerPSM.AnnotatedElement
	 * @generated
	 */
	public Adapter createAnnotatedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SearchLayerPSM.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SearchLayerPSM.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SearchLayerPSM.AnnPSMComponentProperty <em>Ann PSM Component Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SearchLayerPSM.AnnPSMComponentProperty
	 * @generated
	 */
	public Adapter createAnnPSMComponentPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SearchLayerPSM.AnnJavaAlgoController <em>Ann Java Algo Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SearchLayerPSM.AnnJavaAlgoController
	 * @generated
	 */
	public Adapter createAnnJavaAlgoControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SearchLayerPSM.AnnHTTPActivity <em>Ann HTTP Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SearchLayerPSM.AnnHTTPActivity
	 * @generated
	 */
	public Adapter createAnnHTTPActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SearchLayerPSM.AnnHTTPActivityHandler <em>Ann HTTP Activity Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SearchLayerPSM.AnnHTTPActivityHandler
	 * @generated
	 */
	public Adapter createAnnHTTPActivityHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SearchLayerPSM.SearchController <em>Search Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SearchLayerPSM.SearchController
	 * @generated
	 */
	public Adapter createSearchControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SearchLayerPSM.SearchHTTPActivity <em>Search HTTP Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SearchLayerPSM.SearchHTTPActivity
	 * @generated
	 */
	public Adapter createSearchHTTPActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SearchLayerPSM.SearchHTTPHandler <em>Search HTTP Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SearchLayerPSM.SearchHTTPHandler
	 * @generated
	 */
	public Adapter createSearchHTTPHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SearchLayerPSM.SearchableProperty <em>Searchable Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SearchLayerPSM.SearchableProperty
	 * @generated
	 */
	public Adapter createSearchablePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SearchLayerPSM.SearchableJavaResourceModel <em>Searchable Java Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SearchLayerPSM.SearchableJavaResourceModel
	 * @generated
	 */
	public Adapter createSearchableJavaResourceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link SearchLayerPSM.AnnJavaResourceModel <em>Ann Java Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see SearchLayerPSM.AnnJavaResourceModel
	 * @generated
	 */
	public Adapter createAnnJavaResourceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SearchLayerPSMAdapterFactory
