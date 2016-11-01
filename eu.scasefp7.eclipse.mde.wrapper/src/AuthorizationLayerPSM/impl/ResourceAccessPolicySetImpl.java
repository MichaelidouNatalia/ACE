/**
 */
package AuthorizationLayerPSM.impl;

import AuthorizationLayerPSM.AuthorizationLayerPSMPackage;
import AuthorizationLayerPSM.CombiningAlgorithm;
import AuthorizationLayerPSM.ResourceAccessPolicy;
import AuthorizationLayerPSM.ResourceAccessPolicySet;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Access Policy Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerPSM.impl.ResourceAccessPolicySetImpl#getHasResourceAccessPolicySet <em>Has Resource Access Policy Set</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.impl.ResourceAccessPolicySetImpl#getPolicyCombiningAlgorithm <em>Policy Combining Algorithm</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.impl.ResourceAccessPolicySetImpl#getHasResourceAccessPolicy <em>Has Resource Access Policy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceAccessPolicySetImpl extends MinimalEObjectImpl.Container implements ResourceAccessPolicySet {
	/**
	 * The cached value of the '{@link #getHasResourceAccessPolicySet() <em>Has Resource Access Policy Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasResourceAccessPolicySet()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceAccessPolicySet> hasResourceAccessPolicySet;

	/**
	 * The default value of the '{@link #getPolicyCombiningAlgorithm() <em>Policy Combining Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyCombiningAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final CombiningAlgorithm POLICY_COMBINING_ALGORITHM_EDEFAULT = CombiningAlgorithm.DENY_OVERRIDES;

	/**
	 * The cached value of the '{@link #getPolicyCombiningAlgorithm() <em>Policy Combining Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyCombiningAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected CombiningAlgorithm policyCombiningAlgorithm = POLICY_COMBINING_ALGORITHM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasResourceAccessPolicy() <em>Has Resource Access Policy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasResourceAccessPolicy()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceAccessPolicy> hasResourceAccessPolicy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceAccessPolicySetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AuthorizationLayerPSMPackage.Literals.RESOURCE_ACCESS_POLICY_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceAccessPolicySet> getHasResourceAccessPolicySet() {
		if (hasResourceAccessPolicySet == null) {
			hasResourceAccessPolicySet = new EObjectContainmentEList<ResourceAccessPolicySet>(ResourceAccessPolicySet.class, this, AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY_SET__HAS_RESOURCE_ACCESS_POLICY_SET);
		}
		return hasResourceAccessPolicySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombiningAlgorithm getPolicyCombiningAlgorithm() {
		return policyCombiningAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicyCombiningAlgorithm(CombiningAlgorithm newPolicyCombiningAlgorithm) {
		CombiningAlgorithm oldPolicyCombiningAlgorithm = policyCombiningAlgorithm;
		policyCombiningAlgorithm = newPolicyCombiningAlgorithm == null ? POLICY_COMBINING_ALGORITHM_EDEFAULT : newPolicyCombiningAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY_SET__POLICY_COMBINING_ALGORITHM, oldPolicyCombiningAlgorithm, policyCombiningAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceAccessPolicy> getHasResourceAccessPolicy() {
		if (hasResourceAccessPolicy == null) {
			hasResourceAccessPolicy = new EObjectContainmentEList<ResourceAccessPolicy>(ResourceAccessPolicy.class, this, AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY_SET__HAS_RESOURCE_ACCESS_POLICY);
		}
		return hasResourceAccessPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY_SET__HAS_RESOURCE_ACCESS_POLICY_SET:
				return ((InternalEList<?>)getHasResourceAccessPolicySet()).basicRemove(otherEnd, msgs);
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY_SET__HAS_RESOURCE_ACCESS_POLICY:
				return ((InternalEList<?>)getHasResourceAccessPolicy()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY_SET__HAS_RESOURCE_ACCESS_POLICY_SET:
				return getHasResourceAccessPolicySet();
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY_SET__POLICY_COMBINING_ALGORITHM:
				return getPolicyCombiningAlgorithm();
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY_SET__HAS_RESOURCE_ACCESS_POLICY:
				return getHasResourceAccessPolicy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY_SET__HAS_RESOURCE_ACCESS_POLICY_SET:
				getHasResourceAccessPolicySet().clear();
				getHasResourceAccessPolicySet().addAll((Collection<? extends ResourceAccessPolicySet>)newValue);
				return;
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY_SET__POLICY_COMBINING_ALGORITHM:
				setPolicyCombiningAlgorithm((CombiningAlgorithm)newValue);
				return;
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY_SET__HAS_RESOURCE_ACCESS_POLICY:
				getHasResourceAccessPolicy().clear();
				getHasResourceAccessPolicy().addAll((Collection<? extends ResourceAccessPolicy>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY_SET__HAS_RESOURCE_ACCESS_POLICY_SET:
				getHasResourceAccessPolicySet().clear();
				return;
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY_SET__POLICY_COMBINING_ALGORITHM:
				setPolicyCombiningAlgorithm(POLICY_COMBINING_ALGORITHM_EDEFAULT);
				return;
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY_SET__HAS_RESOURCE_ACCESS_POLICY:
				getHasResourceAccessPolicy().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY_SET__HAS_RESOURCE_ACCESS_POLICY_SET:
				return hasResourceAccessPolicySet != null && !hasResourceAccessPolicySet.isEmpty();
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY_SET__POLICY_COMBINING_ALGORITHM:
				return policyCombiningAlgorithm != POLICY_COMBINING_ALGORITHM_EDEFAULT;
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY_SET__HAS_RESOURCE_ACCESS_POLICY:
				return hasResourceAccessPolicy != null && !hasResourceAccessPolicy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (policyCombiningAlgorithm: ");
		result.append(policyCombiningAlgorithm);
		result.append(')');
		return result.toString();
	}

} //ResourceAccessPolicySetImpl
