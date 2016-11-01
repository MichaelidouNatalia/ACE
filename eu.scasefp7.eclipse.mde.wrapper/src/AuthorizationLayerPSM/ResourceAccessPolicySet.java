/**
 */
package AuthorizationLayerPSM;

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
 *   <li>{@link AuthorizationLayerPSM.ResourceAccessPolicySet#getHasResourceAccessPolicySet <em>Has Resource Access Policy Set</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.ResourceAccessPolicySet#getPolicyCombiningAlgorithm <em>Policy Combining Algorithm</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.ResourceAccessPolicySet#getHasResourceAccessPolicy <em>Has Resource Access Policy</em>}</li>
 * </ul>
 *
 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getResourceAccessPolicySet()
 * @model
 * @generated
 */
public interface ResourceAccessPolicySet extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Resource Access Policy Set</b></em>' containment reference list.
	 * The list contents are of type {@link AuthorizationLayerPSM.ResourceAccessPolicySet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Resource Access Policy Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Resource Access Policy Set</em>' containment reference list.
	 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getResourceAccessPolicySet_HasResourceAccessPolicySet()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceAccessPolicySet> getHasResourceAccessPolicySet();

	/**
	 * Returns the value of the '<em><b>Policy Combining Algorithm</b></em>' attribute.
	 * The literals are from the enumeration {@link AuthorizationLayerPSM.CombiningAlgorithm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Combining Algorithm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Combining Algorithm</em>' attribute.
	 * @see AuthorizationLayerPSM.CombiningAlgorithm
	 * @see #setPolicyCombiningAlgorithm(CombiningAlgorithm)
	 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getResourceAccessPolicySet_PolicyCombiningAlgorithm()
	 * @model required="true"
	 * @generated
	 */
	CombiningAlgorithm getPolicyCombiningAlgorithm();

	/**
	 * Sets the value of the '{@link AuthorizationLayerPSM.ResourceAccessPolicySet#getPolicyCombiningAlgorithm <em>Policy Combining Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Combining Algorithm</em>' attribute.
	 * @see AuthorizationLayerPSM.CombiningAlgorithm
	 * @see #getPolicyCombiningAlgorithm()
	 * @generated
	 */
	void setPolicyCombiningAlgorithm(CombiningAlgorithm value);

	/**
	 * Returns the value of the '<em><b>Has Resource Access Policy</b></em>' containment reference list.
	 * The list contents are of type {@link AuthorizationLayerPSM.ResourceAccessPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Resource Access Policy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Resource Access Policy</em>' containment reference list.
	 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getResourceAccessPolicySet_HasResourceAccessPolicy()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ResourceAccessPolicy> getHasResourceAccessPolicy();

} // ResourceAccessPolicySet
