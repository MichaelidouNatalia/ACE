/**
 */
package AuthorizationLayerPSM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage
 * @generated
 */
public interface AuthorizationLayerPSMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AuthorizationLayerPSMFactory eINSTANCE = AuthorizationLayerPSM.impl.AuthorizationLayerPSMFactoryImpl.init();

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
	 * Returns a new object of class '<em>Ann HTTP Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ann HTTP Activity</em>'.
	 * @generated
	 */
	AnnHTTPActivity createAnnHTTPActivity();

	/**
	 * Returns a new object of class '<em>Ann PSM Component Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ann PSM Component Property</em>'.
	 * @generated
	 */
	AnnPSMComponentProperty createAnnPSMComponentProperty();

	/**
	 * Returns a new object of class '<em>Ann JPA Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ann JPA Controller</em>'.
	 * @generated
	 */
	AnnJPAController createAnnJPAController();

	/**
	 * Returns a new object of class '<em>Ann HTTP Activity Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ann HTTP Activity Handler</em>'.
	 * @generated
	 */
	AnnHTTPActivityHandler createAnnHTTPActivityHandler();

	/**
	 * Returns a new object of class '<em>Ann Java Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ann Java Resource Model</em>'.
	 * @generated
	 */
	AnnJavaResourceModel createAnnJavaResourceModel();

	/**
	 * Returns a new object of class '<em>Ann Java Resource Model Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ann Java Resource Model Manager</em>'.
	 * @generated
	 */
	AnnJavaResourceModelManager createAnnJavaResourceModelManager();

	/**
	 * Returns a new object of class '<em>Ann Java Algo Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ann Java Algo Resource Model</em>'.
	 * @generated
	 */
	AnnJavaAlgoResourceModel createAnnJavaAlgoResourceModel();

	/**
	 * Returns a new object of class '<em>Authorization Subject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authorization Subject</em>'.
	 * @generated
	 */
	AuthorizationSubject createAuthorizationSubject();

	/**
	 * Returns a new object of class '<em>Authorizable Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authorizable Resource</em>'.
	 * @generated
	 */
	AuthorizableResource createAuthorizableResource();

	/**
	 * Returns a new object of class '<em>Authorization Performer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authorization Performer</em>'.
	 * @generated
	 */
	AuthorizationPerformer createAuthorizationPerformer();

	/**
	 * Returns a new object of class '<em>Authorization Data Handler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authorization Data Handler</em>'.
	 * @generated
	 */
	AuthorizationDataHandler createAuthorizationDataHandler();

	/**
	 * Returns a new object of class '<em>Authorization Policy Evaluator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authorization Policy Evaluator</em>'.
	 * @generated
	 */
	AuthorizationPolicyEvaluator createAuthorizationPolicyEvaluator();

	/**
	 * Returns a new object of class '<em>Resource Access Policy Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Access Policy Set</em>'.
	 * @generated
	 */
	ResourceAccessPolicySet createResourceAccessPolicySet();

	/**
	 * Returns a new object of class '<em>Resource Access Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Access Policy</em>'.
	 * @generated
	 */
	ResourceAccessPolicy createResourceAccessPolicy();

	/**
	 * Returns a new object of class '<em>Resource Access Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Access Rule</em>'.
	 * @generated
	 */
	ResourceAccessRule createResourceAccessRule();

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
	AuthorizationLayerPSMPackage getAuthorizationLayerPSMPackage();

} //AuthorizationLayerPSMFactory
