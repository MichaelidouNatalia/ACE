/**
 */
package AuthorizationLayerPSM.util;

import AuthorizationLayerPSM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage
 * @generated
 */
public class AuthorizationLayerPSMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AuthorizationLayerPSMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationLayerPSMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AuthorizationLayerPSMPackage.eINSTANCE;
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
	protected AuthorizationLayerPSMSwitch<Adapter> modelSwitch =
		new AuthorizationLayerPSMSwitch<Adapter>() {
			@Override
			public Adapter caseAnnotationModel(AnnotationModel object) {
				return createAnnotationModelAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			@Override
			public Adapter caseAnnotatedElement(AnnotatedElement object) {
				return createAnnotatedElementAdapter();
			}
			@Override
			public Adapter caseAnnHTTPActivity(AnnHTTPActivity object) {
				return createAnnHTTPActivityAdapter();
			}
			@Override
			public Adapter caseAnnPSMComponentProperty(AnnPSMComponentProperty object) {
				return createAnnPSMComponentPropertyAdapter();
			}
			@Override
			public Adapter caseAnnJPAController(AnnJPAController object) {
				return createAnnJPAControllerAdapter();
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
			public Adapter caseAnnJavaResourceModelManager(AnnJavaResourceModelManager object) {
				return createAnnJavaResourceModelManagerAdapter();
			}
			@Override
			public Adapter caseAnnJavaAlgoResourceModel(AnnJavaAlgoResourceModel object) {
				return createAnnJavaAlgoResourceModelAdapter();
			}
			@Override
			public Adapter caseAuthorizationSubject(AuthorizationSubject object) {
				return createAuthorizationSubjectAdapter();
			}
			@Override
			public Adapter caseAuthorizableResource(AuthorizableResource object) {
				return createAuthorizableResourceAdapter();
			}
			@Override
			public Adapter caseAuthorizationPerformer(AuthorizationPerformer object) {
				return createAuthorizationPerformerAdapter();
			}
			@Override
			public Adapter caseAuthorizationDataHandler(AuthorizationDataHandler object) {
				return createAuthorizationDataHandlerAdapter();
			}
			@Override
			public Adapter caseAuthorizationPolicyEvaluator(AuthorizationPolicyEvaluator object) {
				return createAuthorizationPolicyEvaluatorAdapter();
			}
			@Override
			public Adapter caseResourceAccessPolicySet(ResourceAccessPolicySet object) {
				return createResourceAccessPolicySetAdapter();
			}
			@Override
			public Adapter caseResourceAccessPolicy(ResourceAccessPolicy object) {
				return createResourceAccessPolicyAdapter();
			}
			@Override
			public Adapter caseResourceAccessRule(ResourceAccessRule object) {
				return createResourceAccessRuleAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseAllowedAction(AllowedAction object) {
				return createAllowedActionAdapter();
			}
			@Override
			public Adapter caseNewProperty(NewProperty object) {
				return createNewPropertyAdapter();
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
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerPSM.AnnotationModel <em>Annotation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerPSM.AnnotationModel
	 * @generated
	 */
	public Adapter createAnnotationModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerPSM.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerPSM.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerPSM.AnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerPSM.AnnotatedElement
	 * @generated
	 */
	public Adapter createAnnotatedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerPSM.AnnHTTPActivity <em>Ann HTTP Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerPSM.AnnHTTPActivity
	 * @generated
	 */
	public Adapter createAnnHTTPActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerPSM.AnnPSMComponentProperty <em>Ann PSM Component Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerPSM.AnnPSMComponentProperty
	 * @generated
	 */
	public Adapter createAnnPSMComponentPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerPSM.AnnJPAController <em>Ann JPA Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerPSM.AnnJPAController
	 * @generated
	 */
	public Adapter createAnnJPAControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerPSM.AnnHTTPActivityHandler <em>Ann HTTP Activity Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerPSM.AnnHTTPActivityHandler
	 * @generated
	 */
	public Adapter createAnnHTTPActivityHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerPSM.AnnJavaResourceModel <em>Ann Java Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerPSM.AnnJavaResourceModel
	 * @generated
	 */
	public Adapter createAnnJavaResourceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerPSM.AnnJavaResourceModelManager <em>Ann Java Resource Model Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerPSM.AnnJavaResourceModelManager
	 * @generated
	 */
	public Adapter createAnnJavaResourceModelManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerPSM.AnnJavaAlgoResourceModel <em>Ann Java Algo Resource Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerPSM.AnnJavaAlgoResourceModel
	 * @generated
	 */
	public Adapter createAnnJavaAlgoResourceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerPSM.AuthorizationSubject <em>Authorization Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerPSM.AuthorizationSubject
	 * @generated
	 */
	public Adapter createAuthorizationSubjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerPSM.AuthorizableResource <em>Authorizable Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerPSM.AuthorizableResource
	 * @generated
	 */
	public Adapter createAuthorizableResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerPSM.AuthorizationPerformer <em>Authorization Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerPSM.AuthorizationPerformer
	 * @generated
	 */
	public Adapter createAuthorizationPerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerPSM.AuthorizationDataHandler <em>Authorization Data Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerPSM.AuthorizationDataHandler
	 * @generated
	 */
	public Adapter createAuthorizationDataHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerPSM.AuthorizationPolicyEvaluator <em>Authorization Policy Evaluator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerPSM.AuthorizationPolicyEvaluator
	 * @generated
	 */
	public Adapter createAuthorizationPolicyEvaluatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerPSM.ResourceAccessPolicySet <em>Resource Access Policy Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerPSM.ResourceAccessPolicySet
	 * @generated
	 */
	public Adapter createResourceAccessPolicySetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerPSM.ResourceAccessPolicy <em>Resource Access Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerPSM.ResourceAccessPolicy
	 * @generated
	 */
	public Adapter createResourceAccessPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerPSM.ResourceAccessRule <em>Resource Access Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerPSM.ResourceAccessRule
	 * @generated
	 */
	public Adapter createResourceAccessRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerPSM.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerPSM.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerPSM.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerPSM.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerPSM.AllowedAction <em>Allowed Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerPSM.AllowedAction
	 * @generated
	 */
	public Adapter createAllowedActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerPSM.NewProperty <em>New Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerPSM.NewProperty
	 * @generated
	 */
	public Adapter createNewPropertyAdapter() {
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

} //AuthorizationLayerPSMAdapterFactory
