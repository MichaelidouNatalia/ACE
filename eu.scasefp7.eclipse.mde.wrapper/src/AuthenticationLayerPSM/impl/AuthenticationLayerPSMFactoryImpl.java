/**
 */
package AuthenticationLayerPSM.impl;

import AuthenticationLayerPSM.*;

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
public class AuthenticationLayerPSMFactoryImpl extends EFactoryImpl implements AuthenticationLayerPSMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AuthenticationLayerPSMFactory init() {
		try {
			AuthenticationLayerPSMFactory theAuthenticationLayerPSMFactory = (AuthenticationLayerPSMFactory)EPackage.Registry.INSTANCE.getEFactory(AuthenticationLayerPSMPackage.eNS_URI);
			if (theAuthenticationLayerPSMFactory != null) {
				return theAuthenticationLayerPSMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AuthenticationLayerPSMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationLayerPSMFactoryImpl() {
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
			case AuthenticationLayerPSMPackage.ANNOTATION_MODEL: return createAnnotationModel();
			case AuthenticationLayerPSMPackage.ANNOTATION: return createAnnotation();
			case AuthenticationLayerPSMPackage.ANNOTATED_ELEMENT: return createAnnotatedElement();
			case AuthenticationLayerPSMPackage.AUTHENTICATION_MODE: return createAuthenticationMode();
			case AuthenticationLayerPSMPackage.AUTHENTICATION_PERFORMER: return createAuthenticationPerformer();
			case AuthenticationLayerPSMPackage.AUTHENTICATION_TOKEN: return createAuthenticationToken();
			case AuthenticationLayerPSMPackage.PASSWORD: return createPassword();
			case AuthenticationLayerPSMPackage.ANN_HTTP_ACTIVITY: return createAnnHTTPActivity();
			case AuthenticationLayerPSMPackage.ANN_HTTP_ACTIVITY_HANDLER: return createAnnHTTPActivityHandler();
			case AuthenticationLayerPSMPackage.ANN_JPA_CONTROLLER: return createAnnJPAController();
			case AuthenticationLayerPSMPackage.GUEST_MODE: return createGuestMode();
			case AuthenticationLayerPSMPackage.AUTHENTICATION_ONLY_MODE: return createAuthenticationOnlyMode();
			case AuthenticationLayerPSMPackage.BOTH_MODE: return createBothMode();
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
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
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
	public AuthenticationMode createAuthenticationMode() {
		AuthenticationModeImpl authenticationMode = new AuthenticationModeImpl();
		return authenticationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationPerformer createAuthenticationPerformer() {
		AuthenticationPerformerImpl authenticationPerformer = new AuthenticationPerformerImpl();
		return authenticationPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationToken createAuthenticationToken() {
		AuthenticationTokenImpl authenticationToken = new AuthenticationTokenImpl();
		return authenticationToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Password createPassword() {
		PasswordImpl password = new PasswordImpl();
		return password;
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
	public AnnJPAController createAnnJPAController() {
		AnnJPAControllerImpl annJPAController = new AnnJPAControllerImpl();
		return annJPAController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuestMode createGuestMode() {
		GuestModeImpl guestMode = new GuestModeImpl();
		return guestMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationOnlyMode createAuthenticationOnlyMode() {
		AuthenticationOnlyModeImpl authenticationOnlyMode = new AuthenticationOnlyModeImpl();
		return authenticationOnlyMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BothMode createBothMode() {
		BothModeImpl bothMode = new BothModeImpl();
		return bothMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationLayerPSMPackage getAuthenticationLayerPSMPackage() {
		return (AuthenticationLayerPSMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AuthenticationLayerPSMPackage getPackage() {
		return AuthenticationLayerPSMPackage.eINSTANCE;
	}

} //AuthenticationLayerPSMFactoryImpl
