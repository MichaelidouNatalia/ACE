/**
 */
package AuthorizationLayerPSM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authorization Performer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerPSM.AuthorizationPerformer#getUsesAuthorizationPolicyEvaluator <em>Uses Authorization Policy Evaluator</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.AuthorizationPerformer#getIsAuthorizationPerformer <em>Is Authorization Performer</em>}</li>
 * </ul>
 *
 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getAuthorizationPerformer()
 * @model
 * @generated
 */
public interface AuthorizationPerformer extends Annotation {
	/**
	 * Returns the value of the '<em><b>Uses Authorization Policy Evaluator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses Authorization Policy Evaluator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses Authorization Policy Evaluator</em>' reference.
	 * @see #setUsesAuthorizationPolicyEvaluator(AuthorizationPolicyEvaluator)
	 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getAuthorizationPerformer_UsesAuthorizationPolicyEvaluator()
	 * @model required="true"
	 * @generated
	 */
	AuthorizationPolicyEvaluator getUsesAuthorizationPolicyEvaluator();

	/**
	 * Sets the value of the '{@link AuthorizationLayerPSM.AuthorizationPerformer#getUsesAuthorizationPolicyEvaluator <em>Uses Authorization Policy Evaluator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses Authorization Policy Evaluator</em>' reference.
	 * @see #getUsesAuthorizationPolicyEvaluator()
	 * @generated
	 */
	void setUsesAuthorizationPolicyEvaluator(AuthorizationPolicyEvaluator value);

	/**
	 * Returns the value of the '<em><b>Is Authorization Performer</b></em>' reference list.
	 * The list contents are of type {@link AuthorizationLayerPSM.AnnHTTPActivityHandler}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Authorization Performer</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Authorization Performer</em>' reference list.
	 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getAuthorizationPerformer_IsAuthorizationPerformer()
	 * @model required="true"
	 * @generated
	 */
	EList<AnnHTTPActivityHandler> getIsAuthorizationPerformer();

} // AuthorizationPerformer
