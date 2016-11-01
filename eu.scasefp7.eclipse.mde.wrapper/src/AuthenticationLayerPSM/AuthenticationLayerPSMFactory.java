/**
 */
package AuthenticationLayerPSM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see AuthenticationLayerPSM.AuthenticationLayerPSMPackage
 * @generated
 */
public interface AuthenticationLayerPSMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AuthenticationLayerPSMFactory eINSTANCE = AuthenticationLayerPSM.impl.AuthenticationLayerPSMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Annotation Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Model</em>'.
	 * @generated
	 */
	AnnotationModel createAnnotationModel();

	/**
	 * Returns a new object of class '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation</em>'.
	 * @generated
	 */
	Annotation createAnnotation();

	/**
	 * Returns a new object of class '<em>Annotated Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotated Element</em>'.
	 * @generated
	 */
	AnnotatedElement createAnnotatedElement();

	/**
	 * Returns a new object of class '<em>Authentication Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authentication Mode</em>'.
	 * @generated
	 */
	AuthenticationMode createAuthenticationMode();

	/**
	 * Returns a new object of class '<em>Authentication Performer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authentication Performer</em>'.
	 * @generated
	 */
	AuthenticationPerformer createAuthenticationPerformer();

	/**
	 * Returns a new object of class '<em>Authentication Token</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authentication Token</em>'.
	 * @generated
	 */
	AuthenticationToken createAuthenticationToken();

	/**
	 * Returns a new object of class '<em>Password</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Password</em>'.
	 * @generated
	 */
	Password createPassword();

	/**
	 * Returns a new object of class '<em>Ann HTTP Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ann HTTP Activity</em>'.
	 * @generated
	 */
	AnnHTTPActivity createAnnHTTPActivity();

	/**
	 * Returns a new object of class '<em>Ann HTTP Activity Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ann HTTP Activity Handler</em>'.
	 * @generated
	 */
	AnnHTTPActivityHandler createAnnHTTPActivityHandler();

	/**
	 * Returns a new object of class '<em>Ann JPA Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ann JPA Controller</em>'.
	 * @generated
	 */
	AnnJPAController createAnnJPAController();

	/**
	 * Returns a new object of class '<em>Guest Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guest Mode</em>'.
	 * @generated
	 */
	GuestMode createGuestMode();

	/**
	 * Returns a new object of class '<em>Authentication Only Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authentication Only Mode</em>'.
	 * @generated
	 */
	AuthenticationOnlyMode createAuthenticationOnlyMode();

	/**
	 * Returns a new object of class '<em>Both Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Both Mode</em>'.
	 * @generated
	 */
	BothMode createBothMode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AuthenticationLayerPSMPackage getAuthenticationLayerPSMPackage();

} //AuthenticationLayerPSMFactory
