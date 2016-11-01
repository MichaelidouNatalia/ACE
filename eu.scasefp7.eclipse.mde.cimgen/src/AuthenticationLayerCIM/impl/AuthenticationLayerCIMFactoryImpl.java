/**
 */
package AuthenticationLayerCIM.impl;

import AuthenticationLayerCIM.*;

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
public class AuthenticationLayerCIMFactoryImpl extends EFactoryImpl implements AuthenticationLayerCIMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AuthenticationLayerCIMFactory init() {
		try {
			AuthenticationLayerCIMFactory theAuthenticationLayerCIMFactory = (AuthenticationLayerCIMFactory)EPackage.Registry.INSTANCE.getEFactory(AuthenticationLayerCIMPackage.eNS_URI);
			if (theAuthenticationLayerCIMFactory != null) {
				return theAuthenticationLayerCIMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AuthenticationLayerCIMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationLayerCIMFactoryImpl() {
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
			case AuthenticationLayerCIMPackage.ANNOTATION_MODEL: return createAnnotationModel();
			case AuthenticationLayerCIMPackage.AUTHENTICATION_MODEL: return createAuthenticationModel();
			case AuthenticationLayerCIMPackage.AUTHENTICATION_TOKEN: return createAuthenticationToken();
			case AuthenticationLayerCIMPackage.PASSWORD: return createPassword();
			case AuthenticationLayerCIMPackage.AUTHENTICATION_MODE: return createAuthenticationMode();
			case AuthenticationLayerCIMPackage.GUEST_MODE: return createGuestMode();
			case AuthenticationLayerCIMPackage.AUTHENTICATION_ONLY_MODE: return createAuthenticationOnlyMode();
			case AuthenticationLayerCIMPackage.BOTH_MODE: return createBothMode();
			case AuthenticationLayerCIMPackage.ANN_RESOURCE: return createAnnResource();
			case AuthenticationLayerCIMPackage.ANN_PROPERTY: return createAnnProperty();
			case AuthenticationLayerCIMPackage.ANN_CRUD_ACTIVITY: return createAnnCRUDActivity();
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
	public AuthenticationModel createAuthenticationModel() {
		AuthenticationModelImpl authenticationModel = new AuthenticationModelImpl();
		return authenticationModel;
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
	public AuthenticationMode createAuthenticationMode() {
		AuthenticationModeImpl authenticationMode = new AuthenticationModeImpl();
		return authenticationMode;
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
	public AnnResource createAnnResource() {
		AnnResourceImpl annResource = new AnnResourceImpl();
		return annResource;
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
	public AnnCRUDActivity createAnnCRUDActivity() {
		AnnCRUDActivityImpl annCRUDActivity = new AnnCRUDActivityImpl();
		return annCRUDActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationLayerCIMPackage getAuthenticationLayerCIMPackage() {
		return (AuthenticationLayerCIMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AuthenticationLayerCIMPackage getPackage() {
		return AuthenticationLayerCIMPackage.eINSTANCE;
	}

} //AuthenticationLayerCIMFactoryImpl
