/**
 */
package ExternalServiceLayerPSM.util;

import ExternalServiceLayerPSM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage
 * @generated
 */
public class ExternalServiceLayerPSMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExternalServiceLayerPSMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalServiceLayerPSMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExternalServiceLayerPSMPackage.eINSTANCE;
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
	protected ExternalServiceLayerPSMSwitch<Adapter> modelSwitch =
		new ExternalServiceLayerPSMSwitch<Adapter>() {
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
			public Adapter caseAnnJavaAlgoModel(AnnJavaAlgoModel object) {
				return createAnnJavaAlgoModelAdapter();
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
			public Adapter caseAnnJavaResourceModel(AnnJavaResourceModel object) {
				return createAnnJavaResourceModelAdapter();
			}
			@Override
			public Adapter caseJavaRESTClientController(JavaRESTClientController object) {
				return createJavaRESTClientControllerAdapter();
			}
			@Override
			public Adapter caseJavaRESTClientHTTPActivity(JavaRESTClientHTTPActivity object) {
				return createJavaRESTClientHTTPActivityAdapter();
			}
			@Override
			public Adapter caseJavaRESTClientHTTPActivityHandler(JavaRESTClientHTTPActivityHandler object) {
				return createJavaRESTClientHTTPActivityHandlerAdapter();
			}
			@Override
			public Adapter caseJavaRESTClientModel(JavaRESTClientModel object) {
				return createJavaRESTClientModelAdapter();
			}
			@Override
			public Adapter caseQueryParam(QueryParam object) {
				return createQueryParamAdapter();
			}
			@Override
			public Adapter caseJavaInputDataModel(JavaInputDataModel object) {
				return createJavaInputDataModelAdapter();
			}
			@Override
			public Adapter caseJavaOutputDataModel(JavaOutputDataModel object) {
				return createJavaOutputDataModelAdapter();
			}
			@Override
			public Adapter caseRepresentation(Representation object) {
				return createRepresentationAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseNonPersistentOutput(NonPersistentOutput object) {
				return createNonPersistentOutputAdapter();
			}
			@Override
			public Adapter caseAutoPersistentOutput(AutoPersistentOutput object) {
				return createAutoPersistentOutputAdapter();
			}
			@Override
			public Adapter caseExistentJavaModelPersistentOutput(ExistentJavaModelPersistentOutput object) {
				return createExistentJavaModelPersistentOutputAdapter();
			}
			@Override
			public Adapter caseComplexType(ComplexType object) {
				return createComplexTypeAdapter();
			}
			@Override
			public Adapter caseComplexTypeProperty(ComplexTypeProperty object) {
				return createComplexTypePropertyAdapter();
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
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerPSM.AnnotationModel <em>Annotation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerPSM.AnnotationModel
	 * @generated
	 */
	public Adapter createAnnotationModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerPSM.AnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerPSM.AnnotatedElement
	 * @generated
	 */
	public Adapter createAnnotatedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerPSM.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerPSM.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerPSM.AnnJavaAlgoModel <em>Ann Java Algo Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerPSM.AnnJavaAlgoModel
	 * @generated
	 */
	public Adapter createAnnJavaAlgoModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerPSM.AnnJavaAlgoController <em>Ann Java Algo Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerPSM.AnnJavaAlgoController
	 * @generated
	 */
	public Adapter createAnnJavaAlgoControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerPSM.AnnHTTPActivity <em>Ann HTTP Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerPSM.AnnHTTPActivity
	 * @generated
	 */
	public Adapter createAnnHTTPActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerPSM.AnnHTTPActivityHandler <em>Ann HTTP Activity Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerPSM.AnnHTTPActivityHandler
	 * @generated
	 */
	public Adapter createAnnHTTPActivityHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerPSM.AnnJavaResourceModel <em>Ann Java Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerPSM.AnnJavaResourceModel
	 * @generated
	 */
	public Adapter createAnnJavaResourceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerPSM.JavaRESTClientController <em>Java REST Client Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerPSM.JavaRESTClientController
	 * @generated
	 */
	public Adapter createJavaRESTClientControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerPSM.JavaRESTClientHTTPActivity <em>Java REST Client HTTP Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerPSM.JavaRESTClientHTTPActivity
	 * @generated
	 */
	public Adapter createJavaRESTClientHTTPActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerPSM.JavaRESTClientHTTPActivityHandler <em>Java REST Client HTTP Activity Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerPSM.JavaRESTClientHTTPActivityHandler
	 * @generated
	 */
	public Adapter createJavaRESTClientHTTPActivityHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerPSM.JavaRESTClientModel <em>Java REST Client Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerPSM.JavaRESTClientModel
	 * @generated
	 */
	public Adapter createJavaRESTClientModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerPSM.QueryParam <em>Query Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerPSM.QueryParam
	 * @generated
	 */
	public Adapter createQueryParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerPSM.JavaInputDataModel <em>Java Input Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerPSM.JavaInputDataModel
	 * @generated
	 */
	public Adapter createJavaInputDataModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerPSM.JavaOutputDataModel <em>Java Output Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerPSM.JavaOutputDataModel
	 * @generated
	 */
	public Adapter createJavaOutputDataModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerPSM.Representation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerPSM.Representation
	 * @generated
	 */
	public Adapter createRepresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerPSM.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerPSM.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerPSM.NonPersistentOutput <em>Non Persistent Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerPSM.NonPersistentOutput
	 * @generated
	 */
	public Adapter createNonPersistentOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerPSM.AutoPersistentOutput <em>Auto Persistent Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerPSM.AutoPersistentOutput
	 * @generated
	 */
	public Adapter createAutoPersistentOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerPSM.ExistentJavaModelPersistentOutput <em>Existent Java Model Persistent Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerPSM.ExistentJavaModelPersistentOutput
	 * @generated
	 */
	public Adapter createExistentJavaModelPersistentOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerPSM.ComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerPSM.ComplexType
	 * @generated
	 */
	public Adapter createComplexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerPSM.ComplexTypeProperty <em>Complex Type Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerPSM.ComplexTypeProperty
	 * @generated
	 */
	public Adapter createComplexTypePropertyAdapter() {
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

} //ExternalServiceLayerPSMAdapterFactory
