/**
 */
package AuthenticationLayerPSM.util;

import AuthenticationLayerPSM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see AuthenticationLayerPSM.AuthenticationLayerPSMPackage
 * @generated
 */
public class AuthenticationLayerPSMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AuthenticationLayerPSMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationLayerPSMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AuthenticationLayerPSMPackage.eINSTANCE;
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
	protected AuthenticationLayerPSMSwitch<Adapter> modelSwitch =
		new AuthenticationLayerPSMSwitch<Adapter>() {
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
			public Adapter caseAuthenticationMode(AuthenticationMode object) {
				return createAuthenticationModeAdapter();
			}
			@Override
			public Adapter caseAuthenticationPerformer(AuthenticationPerformer object) {
				return createAuthenticationPerformerAdapter();
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
			public Adapter caseAnnHTTPActivity(AnnHTTPActivity object) {
				return createAnnHTTPActivityAdapter();
			}
			@Override
			public Adapter caseAnnHTTPActivityHandler(AnnHTTPActivityHandler object) {
				return createAnnHTTPActivityHandlerAdapter();
			}
			@Override
			public Adapter caseAnnJPAController(AnnJPAController object) {
				return createAnnJPAControllerAdapter();
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
	 * Creates a new adapter for an object of class '{@link AuthenticationLayerPSM.AnnotationModel <em>Annotation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthenticationLayerPSM.AnnotationModel
	 * @generated
	 */
	public Adapter createAnnotationModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthenticationLayerPSM.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthenticationLayerPSM.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthenticationLayerPSM.AnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthenticationLayerPSM.AnnotatedElement
	 * @generated
	 */
	public Adapter createAnnotatedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthenticationLayerPSM.AuthenticationMode <em>Authentication Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthenticationLayerPSM.AuthenticationMode
	 * @generated
	 */
	public Adapter createAuthenticationModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthenticationLayerPSM.AuthenticationPerformer <em>Authentication Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthenticationLayerPSM.AuthenticationPerformer
	 * @generated
	 */
	public Adapter createAuthenticationPerformerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthenticationLayerPSM.AuthenticationToken <em>Authentication Token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthenticationLayerPSM.AuthenticationToken
	 * @generated
	 */
	public Adapter createAuthenticationTokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthenticationLayerPSM.Password <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthenticationLayerPSM.Password
	 * @generated
	 */
	public Adapter createPasswordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthenticationLayerPSM.AnnHTTPActivity <em>Ann HTTP Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthenticationLayerPSM.AnnHTTPActivity
	 * @generated
	 */
	public Adapter createAnnHTTPActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthenticationLayerPSM.AnnHTTPActivityHandler <em>Ann HTTP Activity Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthenticationLayerPSM.AnnHTTPActivityHandler
	 * @generated
	 */
	public Adapter createAnnHTTPActivityHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthenticationLayerPSM.AnnJPAController <em>Ann JPA Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthenticationLayerPSM.AnnJPAController
	 * @generated
	 */
	public Adapter createAnnJPAControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthenticationLayerPSM.GuestMode <em>Guest Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthenticationLayerPSM.GuestMode
	 * @generated
	 */
	public Adapter createGuestModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthenticationLayerPSM.AuthenticationOnlyMode <em>Authentication Only Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthenticationLayerPSM.AuthenticationOnlyMode
	 * @generated
	 */
	public Adapter createAuthenticationOnlyModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link AuthenticationLayerPSM.BothMode <em>Both Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see AuthenticationLayerPSM.BothMode
	 * @generated
	 */
	public Adapter createBothModeAdapter() {
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

} //AuthenticationLayerPSMAdapterFactory
