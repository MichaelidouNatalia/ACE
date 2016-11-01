/**
 */
package AuthorizationLayerCIM.util;

import AuthorizationLayerCIM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage
 * @generated
 */
public class AuthorizationLayerCIMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AuthorizationLayerCIMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationLayerCIMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AuthorizationLayerCIMPackage.eINSTANCE;
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
	protected AuthorizationLayerCIMSwitch<Adapter> modelSwitch =
		new AuthorizationLayerCIMSwitch<Adapter>() {
			@Override
			public Adapter caseAnnotationModel(AnnotationModel object) {
				return createAnnotationModelAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			@Override
			public Adapter caseAuthorizableResource(AuthorizableResource object) {
				return createAuthorizableResourceAdapter();
			}
			@Override
			public Adapter caseResourceAccessPolicySet(ResourceAccessPolicySet object) {
				return createResourceAccessPolicySetAdapter();
			}
			@Override
			public Adapter caseAnnotatedElement(AnnotatedElement object) {
				return createAnnotatedElementAdapter();
			}
			@Override
			public Adapter caseAnnResource(AnnResource object) {
				return createAnnResourceAdapter();
			}
			@Override
			public Adapter caseResourceAccessPolicy(ResourceAccessPolicy object) {
				return createResourceAccessPolicyAdapter();
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
			public Adapter caseAnnProperty(AnnProperty object) {
				return createAnnPropertyAdapter();
			}
			@Override
			public Adapter caseResourceAccessRule(ResourceAccessRule object) {
				return createResourceAccessRuleAdapter();
			}
			@Override
			public Adapter caseAuthorizationSubject(AuthorizationSubject object) {
				return createAuthorizationSubjectAdapter();
			}
			@Override
			public Adapter caseAnnCRUDActivity(AnnCRUDActivity object) {
				return createAnnCRUDActivityAdapter();
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
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerCIM.AnnotationModel <em>Annotation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerCIM.AnnotationModel
	 * @generated
	 */
	public Adapter createAnnotationModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerCIM.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerCIM.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerCIM.AuthorizableResource <em>Authorizable Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerCIM.AuthorizableResource
	 * @generated
	 */
	public Adapter createAuthorizableResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerCIM.ResourceAccessPolicySet <em>Resource Access Policy Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerCIM.ResourceAccessPolicySet
	 * @generated
	 */
	public Adapter createResourceAccessPolicySetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerCIM.AnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerCIM.AnnotatedElement
	 * @generated
	 */
	public Adapter createAnnotatedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerCIM.AnnResource <em>Ann Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerCIM.AnnResource
	 * @generated
	 */
	public Adapter createAnnResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerCIM.ResourceAccessPolicy <em>Resource Access Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerCIM.ResourceAccessPolicy
	 * @generated
	 */
	public Adapter createResourceAccessPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerCIM.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerCIM.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerCIM.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerCIM.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerCIM.AnnProperty <em>Ann Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerCIM.AnnProperty
	 * @generated
	 */
	public Adapter createAnnPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerCIM.ResourceAccessRule <em>Resource Access Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerCIM.ResourceAccessRule
	 * @generated
	 */
	public Adapter createResourceAccessRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerCIM.AuthorizationSubject <em>Authorization Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerCIM.AuthorizationSubject
	 * @generated
	 */
	public Adapter createAuthorizationSubjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerCIM.AnnCRUDActivity <em>Ann CRUD Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerCIM.AnnCRUDActivity
	 * @generated
	 */
	public Adapter createAnnCRUDActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerCIM.AllowedAction <em>Allowed Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerCIM.AllowedAction
	 * @generated
	 */
	public Adapter createAllowedActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthorizationLayerCIM.NewProperty <em>New Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthorizationLayerCIM.NewProperty
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

} //AuthorizationLayerCIMAdapterFactory
