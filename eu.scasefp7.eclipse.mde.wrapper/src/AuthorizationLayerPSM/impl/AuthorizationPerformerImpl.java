/**
 */
package AuthorizationLayerPSM.impl;

import AuthorizationLayerPSM.AnnHTTPActivityHandler;
import AuthorizationLayerPSM.AuthorizationLayerPSMPackage;
import AuthorizationLayerPSM.AuthorizationPerformer;
import AuthorizationLayerPSM.AuthorizationPolicyEvaluator;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authorization Performer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerPSM.impl.AuthorizationPerformerImpl#getUsesAuthorizationPolicyEvaluator <em>Uses Authorization Policy Evaluator</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.impl.AuthorizationPerformerImpl#getIsAuthorizationPerformer <em>Is Authorization Performer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthorizationPerformerImpl extends AnnotationImpl implements AuthorizationPerformer {
	/**
	 * The cached value of the '{@link #getUsesAuthorizationPolicyEvaluator() <em>Uses Authorization Policy Evaluator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesAuthorizationPolicyEvaluator()
	 * @generated
	 * @ordered
	 */
	protected AuthorizationPolicyEvaluator usesAuthorizationPolicyEvaluator;

	/**
	 * The cached value of the '{@link #getIsAuthorizationPerformer() <em>Is Authorization Performer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAuthorizationPerformer()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnHTTPActivityHandler> isAuthorizationPerformer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorizationPerformerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AuthorizationLayerPSMPackage.Literals.AUTHORIZATION_PERFORMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationPolicyEvaluator getUsesAuthorizationPolicyEvaluator() {
		if (usesAuthorizationPolicyEvaluator != null && usesAuthorizationPolicyEvaluator.eIsProxy()) {
			InternalEObject oldUsesAuthorizationPolicyEvaluator = (InternalEObject)usesAuthorizationPolicyEvaluator;
			usesAuthorizationPolicyEvaluator = (AuthorizationPolicyEvaluator)eResolveProxy(oldUsesAuthorizationPolicyEvaluator);
			if (usesAuthorizationPolicyEvaluator != oldUsesAuthorizationPolicyEvaluator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AuthorizationLayerPSMPackage.AUTHORIZATION_PERFORMER__USES_AUTHORIZATION_POLICY_EVALUATOR, oldUsesAuthorizationPolicyEvaluator, usesAuthorizationPolicyEvaluator));
			}
		}
		return usesAuthorizationPolicyEvaluator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationPolicyEvaluator basicGetUsesAuthorizationPolicyEvaluator() {
		return usesAuthorizationPolicyEvaluator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesAuthorizationPolicyEvaluator(AuthorizationPolicyEvaluator newUsesAuthorizationPolicyEvaluator) {
		AuthorizationPolicyEvaluator oldUsesAuthorizationPolicyEvaluator = usesAuthorizationPolicyEvaluator;
		usesAuthorizationPolicyEvaluator = newUsesAuthorizationPolicyEvaluator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerPSMPackage.AUTHORIZATION_PERFORMER__USES_AUTHORIZATION_POLICY_EVALUATOR, oldUsesAuthorizationPolicyEvaluator, usesAuthorizationPolicyEvaluator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnHTTPActivityHandler> getIsAuthorizationPerformer() {
		if (isAuthorizationPerformer == null) {
			isAuthorizationPerformer = new EObjectResolvingEList<AnnHTTPActivityHandler>(AnnHTTPActivityHandler.class, this, AuthorizationLayerPSMPackage.AUTHORIZATION_PERFORMER__IS_AUTHORIZATION_PERFORMER);
		}
		return isAuthorizationPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AuthorizationLayerPSMPackage.AUTHORIZATION_PERFORMER__USES_AUTHORIZATION_POLICY_EVALUATOR:
				if (resolve) return getUsesAuthorizationPolicyEvaluator();
				return basicGetUsesAuthorizationPolicyEvaluator();
			case AuthorizationLayerPSMPackage.AUTHORIZATION_PERFORMER__IS_AUTHORIZATION_PERFORMER:
				return getIsAuthorizationPerformer();
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
			case AuthorizationLayerPSMPackage.AUTHORIZATION_PERFORMER__USES_AUTHORIZATION_POLICY_EVALUATOR:
				setUsesAuthorizationPolicyEvaluator((AuthorizationPolicyEvaluator)newValue);
				return;
			case AuthorizationLayerPSMPackage.AUTHORIZATION_PERFORMER__IS_AUTHORIZATION_PERFORMER:
				getIsAuthorizationPerformer().clear();
				getIsAuthorizationPerformer().addAll((Collection<? extends AnnHTTPActivityHandler>)newValue);
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
			case AuthorizationLayerPSMPackage.AUTHORIZATION_PERFORMER__USES_AUTHORIZATION_POLICY_EVALUATOR:
				setUsesAuthorizationPolicyEvaluator((AuthorizationPolicyEvaluator)null);
				return;
			case AuthorizationLayerPSMPackage.AUTHORIZATION_PERFORMER__IS_AUTHORIZATION_PERFORMER:
				getIsAuthorizationPerformer().clear();
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
			case AuthorizationLayerPSMPackage.AUTHORIZATION_PERFORMER__USES_AUTHORIZATION_POLICY_EVALUATOR:
				return usesAuthorizationPolicyEvaluator != null;
			case AuthorizationLayerPSMPackage.AUTHORIZATION_PERFORMER__IS_AUTHORIZATION_PERFORMER:
				return isAuthorizationPerformer != null && !isAuthorizationPerformer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AuthorizationPerformerImpl
