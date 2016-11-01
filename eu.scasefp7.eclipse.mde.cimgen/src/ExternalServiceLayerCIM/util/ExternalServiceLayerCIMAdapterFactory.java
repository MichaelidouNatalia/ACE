/**
 */
package ExternalServiceLayerCIM.util;

import ExternalServiceLayerCIM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage
 * @generated
 */
public class ExternalServiceLayerCIMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExternalServiceLayerCIMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalServiceLayerCIMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExternalServiceLayerCIMPackage.eINSTANCE;
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
	protected ExternalServiceLayerCIMSwitch<Adapter> modelSwitch =
		new ExternalServiceLayerCIMSwitch<Adapter>() {
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
			public Adapter caseAnnAlgoResource(AnnAlgoResource object) {
				return createAnnAlgoResourceAdapter();
			}
			@Override
			public Adapter caseAnnCRUDResource(AnnCRUDResource object) {
				return createAnnCRUDResourceAdapter();
			}
			@Override
			public Adapter caseRESTClientResource(RESTClientResource object) {
				return createRESTClientResourceAdapter();
			}
			@Override
			public Adapter caseTargetRESTService(TargetRESTService object) {
				return createTargetRESTServiceAdapter();
			}
			@Override
			public Adapter caseQueryParam(QueryParam object) {
				return createQueryParamAdapter();
			}
			@Override
			public Adapter caseInputDataModel(InputDataModel object) {
				return createInputDataModelAdapter();
			}
			@Override
			public Adapter caseOutputDataModel(OutputDataModel object) {
				return createOutputDataModelAdapter();
			}
			@Override
			public Adapter caseRepresentation(Representation object) {
				return createRepresentationAdapter();
			}
			@Override
			public Adapter caseModelProperty(ModelProperty object) {
				return createModelPropertyAdapter();
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
			public Adapter caseExistentCRUDPersistentOutput(ExistentCRUDPersistentOutput object) {
				return createExistentCRUDPersistentOutputAdapter();
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
			public Adapter casePathParam(PathParam object) {
				return createPathParamAdapter();
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
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerCIM.AnnotationModel <em>Annotation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerCIM.AnnotationModel
	 * @generated
	 */
	public Adapter createAnnotationModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerCIM.AnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerCIM.AnnotatedElement
	 * @generated
	 */
	public Adapter createAnnotatedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerCIM.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerCIM.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerCIM.AnnAlgoResource <em>Ann Algo Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerCIM.AnnAlgoResource
	 * @generated
	 */
	public Adapter createAnnAlgoResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerCIM.AnnCRUDResource <em>Ann CRUD Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerCIM.AnnCRUDResource
	 * @generated
	 */
	public Adapter createAnnCRUDResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerCIM.RESTClientResource <em>REST Client Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerCIM.RESTClientResource
	 * @generated
	 */
	public Adapter createRESTClientResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerCIM.TargetRESTService <em>Target REST Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerCIM.TargetRESTService
	 * @generated
	 */
	public Adapter createTargetRESTServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerCIM.QueryParam <em>Query Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerCIM.QueryParam
	 * @generated
	 */
	public Adapter createQueryParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerCIM.InputDataModel <em>Input Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerCIM.InputDataModel
	 * @generated
	 */
	public Adapter createInputDataModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerCIM.OutputDataModel <em>Output Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerCIM.OutputDataModel
	 * @generated
	 */
	public Adapter createOutputDataModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerCIM.Representation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerCIM.Representation
	 * @generated
	 */
	public Adapter createRepresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerCIM.ModelProperty <em>Model Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerCIM.ModelProperty
	 * @generated
	 */
	public Adapter createModelPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerCIM.NonPersistentOutput <em>Non Persistent Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerCIM.NonPersistentOutput
	 * @generated
	 */
	public Adapter createNonPersistentOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerCIM.AutoPersistentOutput <em>Auto Persistent Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerCIM.AutoPersistentOutput
	 * @generated
	 */
	public Adapter createAutoPersistentOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerCIM.ExistentCRUDPersistentOutput <em>Existent CRUD Persistent Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerCIM.ExistentCRUDPersistentOutput
	 * @generated
	 */
	public Adapter createExistentCRUDPersistentOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerCIM.ComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerCIM.ComplexType
	 * @generated
	 */
	public Adapter createComplexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerCIM.ComplexTypeProperty <em>Complex Type Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerCIM.ComplexTypeProperty
	 * @generated
	 */
	public Adapter createComplexTypePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ExternalServiceLayerCIM.PathParam <em>Path Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ExternalServiceLayerCIM.PathParam
	 * @generated
	 */
	public Adapter createPathParamAdapter() {
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

} //ExternalServiceLayerCIMAdapterFactory
