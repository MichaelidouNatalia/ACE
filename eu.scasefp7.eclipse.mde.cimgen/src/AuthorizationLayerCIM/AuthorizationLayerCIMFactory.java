/**
 */
package AuthorizationLayerCIM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage
 * @generated
 */
public interface AuthorizationLayerCIMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AuthorizationLayerCIMFactory eINSTANCE = AuthorizationLayerCIM.impl.AuthorizationLayerCIMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Annotation Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Model</em>'.
	 * @generated
	 */
	AnnotationModel createAnnotationModel();

	/**
	 * Returns a new object of class '<em>Authorizable Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authorizable Resource</em>'.
	 * @generated
	 */
	AuthorizableResource createAuthorizableResource();

	/**
	 * Returns a new object of class '<em>Resource Access Policy Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Access Policy Set</em>'.
	 * @generated
	 */
	ResourceAccessPolicySet createResourceAccessPolicySet();

	/**
	 * Returns a new object of class '<em>Ann Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ann Resource</em>'.
	 * @generated
	 */
	AnnResource createAnnResource();

	/**
	 * Returns a new object of class '<em>Resource Access Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Access Policy</em>'.
	 * @generated
	 */
	ResourceAccessPolicy createResourceAccessPolicy();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Ann Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ann Property</em>'.
	 * @generated
	 */
	AnnProperty createAnnProperty();

	/**
	 * Returns a new object of class '<em>Resource Access Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Access Rule</em>'.
	 * @generated
	 */
	ResourceAccessRule createResourceAccessRule();

	/**
	 * Returns a new object of class '<em>Authorization Subject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authorization Subject</em>'.
	 * @generated
	 */
	AuthorizationSubject createAuthorizationSubject();

	/**
	 * Returns a new object of class '<em>Ann CRUD Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ann CRUD Activity</em>'.
	 * @generated
	 */
	AnnCRUDActivity createAnnCRUDActivity();

	/**
	 * Returns a new object of class '<em>Allowed Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Allowed Action</em>'.
	 * @generated
	 */
	AllowedAction createAllowedAction();

	/**
	 * Returns a new object of class '<em>New Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Property</em>'.
	 * @generated
	 */
	NewProperty createNewProperty();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AuthorizationLayerCIMPackage getAuthorizationLayerCIMPackage();

} //AuthorizationLayerCIMFactory
