/**
 */
package AuthenticationLayerCIM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see AuthenticationLayerCIM.AuthenticationLayerCIMPackage
 * @generated
 */
public interface AuthenticationLayerCIMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AuthenticationLayerCIMFactory eINSTANCE = AuthenticationLayerCIM.impl.AuthenticationLayerCIMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Annotation Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Model</em>'.
	 * @generated
	 */
	AnnotationModel createAnnotationModel();

	/**
	 * Returns a new object of class '<em>Authentication Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authentication Model</em>'.
	 * @generated
	 */
	AuthenticationModel createAuthenticationModel();

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
	 * Returns a new object of class '<em>Authentication Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authentication Mode</em>'.
	 * @generated
	 */
	AuthenticationMode createAuthenticationMode();

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
	 * Returns a new object of class '<em>Ann Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ann Resource</em>'.
	 * @generated
	 */
	AnnResource createAnnResource();

	/**
	 * Returns a new object of class '<em>Ann Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ann Property</em>'.
	 * @generated
	 */
	AnnProperty createAnnProperty();

	/**
	 * Returns a new object of class '<em>Ann CRUD Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ann CRUD Activity</em>'.
	 * @generated
	 */
	AnnCRUDActivity createAnnCRUDActivity();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AuthenticationLayerCIMPackage getAuthenticationLayerCIMPackage();

} //AuthenticationLayerCIMFactory
