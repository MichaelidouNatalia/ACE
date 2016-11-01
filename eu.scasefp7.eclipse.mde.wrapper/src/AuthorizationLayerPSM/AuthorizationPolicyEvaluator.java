/**
 */
package AuthorizationLayerPSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authorization Policy Evaluator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerPSM.AuthorizationPolicyEvaluator#getAccesses <em>Accesses</em>}</li>
 * </ul>
 *
 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getAuthorizationPolicyEvaluator()
 * @model
 * @generated
 */
public interface AuthorizationPolicyEvaluator extends Annotation {
	/**
	 * Returns the value of the '<em><b>Accesses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accesses</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accesses</em>' reference.
	 * @see #setAccesses(AuthorizationDataHandler)
	 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getAuthorizationPolicyEvaluator_Accesses()
	 * @model required="true"
	 * @generated
	 */
	AuthorizationDataHandler getAccesses();

	/**
	 * Sets the value of the '{@link AuthorizationLayerPSM.AuthorizationPolicyEvaluator#getAccesses <em>Accesses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accesses</em>' reference.
	 * @see #getAccesses()
	 * @generated
	 */
	void setAccesses(AuthorizationDataHandler value);

} // AuthorizationPolicyEvaluator
