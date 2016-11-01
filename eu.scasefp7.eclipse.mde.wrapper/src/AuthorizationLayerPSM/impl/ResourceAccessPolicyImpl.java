/**
 */
package AuthorizationLayerPSM.impl;

import AuthorizationLayerPSM.AuthorizationLayerPSMPackage;
import AuthorizationLayerPSM.CombiningAlgorithm;
import AuthorizationLayerPSM.Condition;
import AuthorizationLayerPSM.ResourceAccessPolicy;
import AuthorizationLayerPSM.ResourceAccessRule;

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
 * An implementation of the model object '<em><b>Resource Access Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerPSM.impl.ResourceAccessPolicyImpl#getRuleCombiningAlgorithm <em>Rule Combining Algorithm</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.impl.ResourceAccessPolicyImpl#getHasResourceAccessRule <em>Has Resource Access Rule</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.impl.ResourceAccessPolicyImpl#getHasApplyCondition <em>Has Apply Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceAccessPolicyImpl extends MinimalEObjectImpl.Container implements ResourceAccessPolicy {
	/**
	 * The default value of the '{@link #getRuleCombiningAlgorithm() <em>Rule Combining Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleCombiningAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final CombiningAlgorithm RULE_COMBINING_ALGORITHM_EDEFAULT = CombiningAlgorithm.DENY_OVERRIDES;

	/**
	 * The cached value of the '{@link #getRuleCombiningAlgorithm() <em>Rule Combining Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleCombiningAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected CombiningAlgorithm ruleCombiningAlgorithm = RULE_COMBINING_ALGORITHM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasResourceAccessRule() <em>Has Resource Access Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasResourceAccessRule()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceAccessRule> hasResourceAccessRule;

	/**
	 * The cached value of the '{@link #getHasApplyCondition() <em>Has Apply Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasApplyCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> hasApplyCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceAccessPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AuthorizationLayerPSMPackage.Literals.RESOURCE_ACCESS_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombiningAlgorithm getRuleCombiningAlgorithm() {
		return ruleCombiningAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleCombiningAlgorithm(CombiningAlgorithm newRuleCombiningAlgorithm) {
		CombiningAlgorithm oldRuleCombiningAlgorithm = ruleCombiningAlgorithm;
		ruleCombiningAlgorithm = newRuleCombiningAlgorithm == null ? RULE_COMBINING_ALGORITHM_EDEFAULT : newRuleCombiningAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY__RULE_COMBINING_ALGORITHM, oldRuleCombiningAlgorithm, ruleCombiningAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceAccessRule> getHasResourceAccessRule() {
		if (hasResourceAccessRule == null) {
			hasResourceAccessRule = new EObjectContainmentEList<ResourceAccessRule>(ResourceAccessRule.class, this, AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY__HAS_RESOURCE_ACCESS_RULE);
		}
		return hasResourceAccessRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getHasApplyCondition() {
		if (hasApplyCondition == null) {
			hasApplyCondition = new EObjectContainmentEList<Condition>(Condition.class, this, AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY__HAS_APPLY_CONDITION);
		}
		return hasApplyCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY__HAS_RESOURCE_ACCESS_RULE:
				return ((InternalEList<?>)getHasResourceAccessRule()).basicRemove(otherEnd, msgs);
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY__HAS_APPLY_CONDITION:
				return ((InternalEList<?>)getHasApplyCondition()).basicRemove(otherEnd, msgs);
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
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY__RULE_COMBINING_ALGORITHM:
				return getRuleCombiningAlgorithm();
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY__HAS_RESOURCE_ACCESS_RULE:
				return getHasResourceAccessRule();
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY__HAS_APPLY_CONDITION:
				return getHasApplyCondition();
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
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY__RULE_COMBINING_ALGORITHM:
				setRuleCombiningAlgorithm((CombiningAlgorithm)newValue);
				return;
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY__HAS_RESOURCE_ACCESS_RULE:
				getHasResourceAccessRule().clear();
				getHasResourceAccessRule().addAll((Collection<? extends ResourceAccessRule>)newValue);
				return;
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY__HAS_APPLY_CONDITION:
				getHasApplyCondition().clear();
				getHasApplyCondition().addAll((Collection<? extends Condition>)newValue);
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
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY__RULE_COMBINING_ALGORITHM:
				setRuleCombiningAlgorithm(RULE_COMBINING_ALGORITHM_EDEFAULT);
				return;
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY__HAS_RESOURCE_ACCESS_RULE:
				getHasResourceAccessRule().clear();
				return;
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY__HAS_APPLY_CONDITION:
				getHasApplyCondition().clear();
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
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY__RULE_COMBINING_ALGORITHM:
				return ruleCombiningAlgorithm != RULE_COMBINING_ALGORITHM_EDEFAULT;
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY__HAS_RESOURCE_ACCESS_RULE:
				return hasResourceAccessRule != null && !hasResourceAccessRule.isEmpty();
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY__HAS_APPLY_CONDITION:
				return hasApplyCondition != null && !hasApplyCondition.isEmpty();
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
		result.append(" (ruleCombiningAlgorithm: ");
		result.append(ruleCombiningAlgorithm);
		result.append(')');
		return result.toString();
	}

} //ResourceAccessPolicyImpl
