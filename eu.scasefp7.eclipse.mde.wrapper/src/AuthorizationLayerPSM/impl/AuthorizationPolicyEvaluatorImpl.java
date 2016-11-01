/**
 */
package AuthorizationLayerPSM.impl;

import AuthorizationLayerPSM.AuthorizationDataHandler;
import AuthorizationLayerPSM.AuthorizationLayerPSMPackage;
import AuthorizationLayerPSM.AuthorizationPolicyEvaluator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authorization Policy Evaluator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerPSM.impl.AuthorizationPolicyEvaluatorImpl#getAccesses <em>Accesses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthorizationPolicyEvaluatorImpl extends AnnotationImpl implements AuthorizationPolicyEvaluator {
	/**
	 * The cached value of the '{@link #getAccesses() <em>Accesses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccesses()
	 * @generated
	 * @ordered
	 */
	protected AuthorizationDataHandler accesses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorizationPolicyEvaluatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AuthorizationLayerPSMPackage.Literals.AUTHORIZATION_POLICY_EVALUATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationDataHandler getAccesses() {
		if (accesses != null && accesses.eIsProxy()) {
			InternalEObject oldAccesses = (InternalEObject)accesses;
			accesses = (AuthorizationDataHandler)eResolveProxy(oldAccesses);
			if (accesses != oldAccesses) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AuthorizationLayerPSMPackage.AUTHORIZATION_POLICY_EVALUATOR__ACCESSES, oldAccesses, accesses));
			}
		}
		return accesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationDataHandler basicGetAccesses() {
		return accesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccesses(AuthorizationDataHandler newAccesses) {
		AuthorizationDataHandler oldAccesses = accesses;
		accesses = newAccesses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerPSMPackage.AUTHORIZATION_POLICY_EVALUATOR__ACCESSES, oldAccesses, accesses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AuthorizationLayerPSMPackage.AUTHORIZATION_POLICY_EVALUATOR__ACCESSES:
				if (resolve) return getAccesses();
				return basicGetAccesses();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AuthorizationLayerPSMPackage.AUTHORIZATION_POLICY_EVALUATOR__ACCESSES:
				setAccesses((AuthorizationDataHandler)newValue);
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
			case AuthorizationLayerPSMPackage.AUTHORIZATION_POLICY_EVALUATOR__ACCESSES:
				setAccesses((AuthorizationDataHandler)null);
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
			case AuthorizationLayerPSMPackage.AUTHORIZATION_POLICY_EVALUATOR__ACCESSES:
				return accesses != null;
		}
		return super.eIsSet(featureID);
	}

} //AuthorizationPolicyEvaluatorImpl
