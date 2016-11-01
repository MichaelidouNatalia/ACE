/**
 */
package AuthorizationLayerPSM.impl;

import AuthorizationLayerPSM.AllowedAction;
import AuthorizationLayerPSM.AuthorizationLayerPSMPackage;
import AuthorizationLayerPSM.Condition;
import AuthorizationLayerPSM.ResourceAccessRule;
import AuthorizationLayerPSM.RuleType;

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
 * An implementation of the model object '<em><b>Resource Access Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerPSM.impl.ResourceAccessRuleImpl#getRuleType <em>Rule Type</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.impl.ResourceAccessRuleImpl#getHasMatchCondition <em>Has Match Condition</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.impl.ResourceAccessRuleImpl#getHasAllowedAction <em>Has Allowed Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceAccessRuleImpl extends MinimalEObjectImpl.Container implements ResourceAccessRule {
	/**
	 * The default value of the '{@link #getRuleType() <em>Rule Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleType()
	 * @generated
	 * @ordered
	 */
	protected static final RuleType RULE_TYPE_EDEFAULT = RuleType.PERMIT;

	/**
	 * The cached value of the '{@link #getRuleType() <em>Rule Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleType()
	 * @generated
	 * @ordered
	 */
	protected RuleType ruleType = RULE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasMatchCondition() <em>Has Match Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasMatchCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> hasMatchCondition;

	/**
	 * The cached value of the '{@link #getHasAllowedAction() <em>Has Allowed Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAllowedAction()
	 * @generated
	 * @ordered
	 */
	protected EList<AllowedAction> hasAllowedAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceAccessRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AuthorizationLayerPSMPackage.Literals.RESOURCE_ACCESS_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleType getRuleType() {
		return ruleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuleType(RuleType newRuleType) {
		RuleType oldRuleType = ruleType;
		ruleType = newRuleType == null ? RULE_TYPE_EDEFAULT : newRuleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerPSMPackage.RESOURCE_ACCESS_RULE__RULE_TYPE, oldRuleType, ruleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getHasMatchCondition() {
		if (hasMatchCondition == null) {
			hasMatchCondition = new EObjectContainmentEList<Condition>(Condition.class, this, AuthorizationLayerPSMPackage.RESOURCE_ACCESS_RULE__HAS_MATCH_CONDITION);
		}
		return hasMatchCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AllowedAction> getHasAllowedAction() {
		if (hasAllowedAction == null) {
			hasAllowedAction = new EObjectContainmentEList<AllowedAction>(AllowedAction.class, this, AuthorizationLayerPSMPackage.RESOURCE_ACCESS_RULE__HAS_ALLOWED_ACTION);
		}
		return hasAllowedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_RULE__HAS_MATCH_CONDITION:
				return ((InternalEList<?>)getHasMatchCondition()).basicRemove(otherEnd, msgs);
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_RULE__HAS_ALLOWED_ACTION:
				return ((InternalEList<?>)getHasAllowedAction()).basicRemove(otherEnd, msgs);
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
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_RULE__RULE_TYPE:
				return getRuleType();
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_RULE__HAS_MATCH_CONDITION:
				return getHasMatchCondition();
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_RULE__HAS_ALLOWED_ACTION:
				return getHasAllowedAction();
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
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_RULE__RULE_TYPE:
				setRuleType((RuleType)newValue);
				return;
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_RULE__HAS_MATCH_CONDITION:
				getHasMatchCondition().clear();
				getHasMatchCondition().addAll((Collection<? extends Condition>)newValue);
				return;
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_RULE__HAS_ALLOWED_ACTION:
				getHasAllowedAction().clear();
				getHasAllowedAction().addAll((Collection<? extends AllowedAction>)newValue);
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
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_RULE__RULE_TYPE:
				setRuleType(RULE_TYPE_EDEFAULT);
				return;
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_RULE__HAS_MATCH_CONDITION:
				getHasMatchCondition().clear();
				return;
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_RULE__HAS_ALLOWED_ACTION:
				getHasAllowedAction().clear();
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
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_RULE__RULE_TYPE:
				return ruleType != RULE_TYPE_EDEFAULT;
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_RULE__HAS_MATCH_CONDITION:
				return hasMatchCondition != null && !hasMatchCondition.isEmpty();
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_RULE__HAS_ALLOWED_ACTION:
				return hasAllowedAction != null && !hasAllowedAction.isEmpty();
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
		result.append(" (ruleType: ");
		result.append(ruleType);
		result.append(')');
		return result.toString();
	}

} //ResourceAccessRuleImpl
