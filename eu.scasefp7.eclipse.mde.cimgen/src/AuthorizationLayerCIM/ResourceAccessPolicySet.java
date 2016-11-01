/**
 */
package AuthorizationLayerCIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Access Policy Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerCIM.ResourceAccessPolicySet#getName <em>Name</em>}</li>
 *   <li>{@link AuthorizationLayerCIM.ResourceAccessPolicySet#getPolicyCombiningAlgorithm <em>Policy Combining Algorithm</em>}</li>
 *   <li>{@link AuthorizationLayerCIM.ResourceAccessPolicySet#getHasResourceAccessPolicy <em>Has Resource Access Policy</em>}</li>
 *   <li>{@link AuthorizationLayerCIM.ResourceAccessPolicySet#getHasResourceAccessPolicySet <em>Has Resource Access Policy Set</em>}</li>
 * </ul>
 *
 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getResourceAccessPolicySet()
 * @model
 * @generated
 */
public interface ResourceAccessPolicySet extends EObject {
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
	 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getResourceAccessPolicySet_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link AuthorizationLayerCIM.ResourceAccessPolicySet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Policy Combining Algorithm</b></em>' attribute.
	 * The literals are from the enumeration {@link AuthorizationLayerCIM.CombiningAlgorithm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Combining Algorithm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Combining Algorithm</em>' attribute.
	 * @see AuthorizationLayerCIM.CombiningAlgorithm
	 * @see #setPolicyCombiningAlgorithm(CombiningAlgorithm)
	 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getResourceAccessPolicySet_PolicyCombiningAlgorithm()
	 * @model required="true"
	 * @generated
	 */
	CombiningAlgorithm getPolicyCombiningAlgorithm();

	/**
	 * Sets the value of the '{@link AuthorizationLayerCIM.ResourceAccessPolicySet#getPolicyCombiningAlgorithm <em>Policy Combining Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Combining Algorithm</em>' attribute.
	 * @see AuthorizationLayerCIM.CombiningAlgorithm
	 * @see #getPolicyCombiningAlgorithm()
	 * @generated
	 */
	void setPolicyCombiningAlgorithm(CombiningAlgorithm value);

	/**
	 * Returns the value of the '<em><b>Has Resource Access Policy</b></em>' containment reference list.
	 * The list contents are of type {@link AuthorizationLayerCIM.ResourceAccessPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Resource Access Policy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Resource Access Policy</em>' containment reference list.
	 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getResourceAccessPolicySet_HasResourceAccessPolicy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ResourceAccessPolicy> getHasResourceAccessPolicy();

	/**
	 * Returns the value of the '<em><b>Has Resource Access Policy Set</b></em>' containment reference list.
	 * The list contents are of type {@link AuthorizationLayerCIM.ResourceAccessPolicySet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Resource Access Policy Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Resource Access Policy Set</em>' containment reference list.
	 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getResourceAccessPolicySet_HasResourceAccessPolicySet()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceAccessPolicySet> getHasResourceAccessPolicySet();

} // ResourceAccessPolicySet
