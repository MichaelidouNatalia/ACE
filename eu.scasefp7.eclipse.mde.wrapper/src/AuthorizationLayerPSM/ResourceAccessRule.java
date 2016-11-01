/**
 */
package AuthorizationLayerPSM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Access Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerPSM.ResourceAccessRule#getRuleType <em>Rule Type</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.ResourceAccessRule#getHasMatchCondition <em>Has Match Condition</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.ResourceAccessRule#getHasAllowedAction <em>Has Allowed Action</em>}</li>
 * </ul>
 *
 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getResourceAccessRule()
 * @model
 * @generated
 */
public interface ResourceAccessRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Rule Type</b></em>' attribute.
	 * The literals are from the enumeration {@link AuthorizationLayerPSM.RuleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Type</em>' attribute.
	 * @see AuthorizationLayerPSM.RuleType
	 * @see #setRuleType(RuleType)
	 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getResourceAccessRule_RuleType()
	 * @model required="true"
	 * @generated
	 */
	RuleType getRuleType();

	/**
	 * Sets the value of the '{@link AuthorizationLayerPSM.ResourceAccessRule#getRuleType <em>Rule Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Type</em>' attribute.
	 * @see AuthorizationLayerPSM.RuleType
	 * @see #getRuleType()
	 * @generated
	 */
	void setRuleType(RuleType value);

	/**
	 * Returns the value of the '<em><b>Has Match Condition</b></em>' containment reference list.
	 * The list contents are of type {@link AuthorizationLayerPSM.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Match Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Match Condition</em>' containment reference list.
	 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getResourceAccessRule_HasMatchCondition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Condition> getHasMatchCondition();

	/**
	 * Returns the value of the '<em><b>Has Allowed Action</b></em>' containment reference list.
	 * The list contents are of type {@link AuthorizationLayerPSM.AllowedAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Allowed Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Allowed Action</em>' containment reference list.
	 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getResourceAccessRule_HasAllowedAction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AllowedAction> getHasAllowedAction();

} // ResourceAccessRule
