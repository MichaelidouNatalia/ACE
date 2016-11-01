/**
 */
package AuthorizationLayerCIM;

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
 *   <li>{@link AuthorizationLayerCIM.ResourceAccessRule#getHasMatchCondition <em>Has Match Condition</em>}</li>
 *   <li>{@link AuthorizationLayerCIM.ResourceAccessRule#getName <em>Name</em>}</li>
 *   <li>{@link AuthorizationLayerCIM.ResourceAccessRule#getRuleType <em>Rule Type</em>}</li>
 *   <li>{@link AuthorizationLayerCIM.ResourceAccessRule#getHasAllowedAction <em>Has Allowed Action</em>}</li>
 * </ul>
 *
 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getResourceAccessRule()
 * @model
 * @generated
 */
public interface ResourceAccessRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Match Condition</b></em>' containment reference list.
	 * The list contents are of type {@link AuthorizationLayerCIM.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Match Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Match Condition</em>' containment reference list.
	 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getResourceAccessRule_HasMatchCondition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Condition> getHasMatchCondition();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getResourceAccessRule_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link AuthorizationLayerCIM.ResourceAccessRule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rule Type</b></em>' attribute.
	 * The literals are from the enumeration {@link AuthorizationLayerCIM.RuleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Type</em>' attribute.
	 * @see AuthorizationLayerCIM.RuleType
	 * @see #setRuleType(RuleType)
	 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getResourceAccessRule_RuleType()
	 * @model required="true"
	 * @generated
	 */
	RuleType getRuleType();

	/**
	 * Sets the value of the '{@link AuthorizationLayerCIM.ResourceAccessRule#getRuleType <em>Rule Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Type</em>' attribute.
	 * @see AuthorizationLayerCIM.RuleType
	 * @see #getRuleType()
	 * @generated
	 */
	void setRuleType(RuleType value);

	/**
	 * Returns the value of the '<em><b>Has Allowed Action</b></em>' containment reference list.
	 * The list contents are of type {@link AuthorizationLayerCIM.AllowedAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Allowed Action</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Allowed Action</em>' containment reference list.
	 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getResourceAccessRule_HasAllowedAction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AllowedAction> getHasAllowedAction();

} // ResourceAccessRule
