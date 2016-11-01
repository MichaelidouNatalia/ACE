/**
 */
package AuthorizationLayerCIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Access Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerCIM.ResourceAccessPolicy#getName <em>Name</em>}</li>
 *   <li>{@link AuthorizationLayerCIM.ResourceAccessPolicy#getRuleCombiningAlgorithm <em>Rule Combining Algorithm</em>}</li>
 *   <li>{@link AuthorizationLayerCIM.ResourceAccessPolicy#getHasApplyCondition <em>Has Apply Condition</em>}</li>
 *   <li>{@link AuthorizationLayerCIM.ResourceAccessPolicy#getHasResourceAccessRule <em>Has Resource Access Rule</em>}</li>
 * </ul>
 *
 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getResourceAccessPolicy()
 * @model
 * @generated
 */
public interface ResourceAccessPolicy extends EObject {
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
	 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getResourceAccessPolicy_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link AuthorizationLayerCIM.ResourceAccessPolicy#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rule Combining Algorithm</b></em>' attribute.
	 * The literals are from the enumeration {@link AuthorizationLayerCIM.CombiningAlgorithm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule Combining Algorithm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Combining Algorithm</em>' attribute.
	 * @see AuthorizationLayerCIM.CombiningAlgorithm
	 * @see #setRuleCombiningAlgorithm(CombiningAlgorithm)
	 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getResourceAccessPolicy_RuleCombiningAlgorithm()
	 * @model required="true"
	 * @generated
	 */
	CombiningAlgorithm getRuleCombiningAlgorithm();

	/**
	 * Sets the value of the '{@link AuthorizationLayerCIM.ResourceAccessPolicy#getRuleCombiningAlgorithm <em>Rule Combining Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Combining Algorithm</em>' attribute.
	 * @see AuthorizationLayerCIM.CombiningAlgorithm
	 * @see #getRuleCombiningAlgorithm()
	 * @generated
	 */
	void setRuleCombiningAlgorithm(CombiningAlgorithm value);

	/**
	 * Returns the value of the '<em><b>Has Apply Condition</b></em>' containment reference list.
	 * The list contents are of type {@link AuthorizationLayerCIM.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Apply Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Apply Condition</em>' containment reference list.
	 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getResourceAccessPolicy_HasApplyCondition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getHasApplyCondition();

	/**
	 * Returns the value of the '<em><b>Has Resource Access Rule</b></em>' containment reference list.
	 * The list contents are of type {@link AuthorizationLayerCIM.ResourceAccessRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Resource Access Rule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Resource Access Rule</em>' containment reference list.
	 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getResourceAccessPolicy_HasResourceAccessRule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ResourceAccessRule> getHasResourceAccessRule();

} // ResourceAccessPolicy
