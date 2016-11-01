/**
 */
package AuthenticationLayerCIM.util;

import AuthenticationLayerCIM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see AuthenticationLayerCIM.AuthenticationLayerCIMPackage
 * @generated
 */
public class AuthenticationLayerCIMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AuthenticationLayerCIMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationLayerCIMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AuthenticationLayerCIMPackage.eINSTANCE;
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
	protected AuthenticationLayerCIMSwitch<Adapter> modelSwitch =
		new AuthenticationLayerCIMSwitch<Adapter>() {
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
			public Adapter caseAuthenticationModel(AuthenticationModel object) {
				return createAuthenticationModelAdapter();
			}
			@Override
			public Adapter caseAuthenticationToken(AuthenticationToken object) {
				return createAuthenticationTokenAdapter();
			}
			@Override
			public Adapter casePassword(Password object) {
				return createPasswordAdapter();
			}
			@Override
			public Adapter caseAuthenticationMode(AuthenticationMode object) {
				return createAuthenticationModeAdapter();
			}
			@Override
			public Adapter caseGuestMode(GuestMode object) {
				return createGuestModeAdapter();
			}
			@Override
			public Adapter caseAuthenticationOnlyMode(AuthenticationOnlyMode object) {
				return createAuthenticationOnlyModeAdapter();
			}
			@Override
			public Adapter caseBothMode(BothMode object) {
				return createBothModeAdapter();
			}
			@Override
			public Adapter caseAnnResource(AnnResource object) {
				return createAnnResourceAdapter();
			}
			@Override
			public Adapter caseAnnProperty(AnnProperty object) {
				return createAnnPropertyAdapter();
			}
			@Override
			public Adapter caseAnnCRUDActivity(AnnCRUDActivity object) {
				return createAnnCRUDActivityAdapter();
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
	 * Creates a new adapter for an object of class '{@link AuthenticationLayerCIM.AnnotationModel <em>Annotation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthenticationLayerCIM.AnnotationModel
	 * @generated
	 */
	public Adapter createAnnotationModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthenticationLayerCIM.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthenticationLayerCIM.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthenticationLayerCIM.AnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthenticationLayerCIM.AnnotatedElement
	 * @generated
	 */
	public Adapter createAnnotatedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthenticationLayerCIM.AuthenticationModel <em>Authentication Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthenticationLayerCIM.AuthenticationModel
	 * @generated
	 */
	public Adapter createAuthenticationModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthenticationLayerCIM.AuthenticationToken <em>Authentication Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthenticationLayerCIM.AuthenticationToken
	 * @generated
	 */
	public Adapter createAuthenticationTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthenticationLayerCIM.Password <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthenticationLayerCIM.Password
	 * @generated
	 */
	public Adapter createPasswordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthenticationLayerCIM.AuthenticationMode <em>Authentication Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthenticationLayerCIM.AuthenticationMode
	 * @generated
	 */
	public Adapter createAuthenticationModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthenticationLayerCIM.GuestMode <em>Guest Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthenticationLayerCIM.GuestMode
	 * @generated
	 */
	public Adapter createGuestModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthenticationLayerCIM.AuthenticationOnlyMode <em>Authentication Only Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthenticationLayerCIM.AuthenticationOnlyMode
	 * @generated
	 */
	public Adapter createAuthenticationOnlyModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthenticationLayerCIM.BothMode <em>Both Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthenticationLayerCIM.BothMode
	 * @generated
	 */
	public Adapter createBothModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthenticationLayerCIM.AnnResource <em>Ann Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthenticationLayerCIM.AnnResource
	 * @generated
	 */
	public Adapter createAnnResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthenticationLayerCIM.AnnProperty <em>Ann Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthenticationLayerCIM.AnnProperty
	 * @generated
	 */
	public Adapter createAnnPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthenticationLayerCIM.AnnCRUDActivity <em>Ann CRUD Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthenticationLayerCIM.AnnCRUDActivity
	 * @generated
	 */
	public Adapter createAnnCRUDActivityAdapter() {
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

} //AuthenticationLayerCIMAdapterFactory
