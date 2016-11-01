/**
 */
package AuthorizationLayerCIM.impl;

import AuthorizationLayerCIM.AllowedAction;
import AuthorizationLayerCIM.AnnCRUDActivity;
import AuthorizationLayerCIM.AuthorizationLayerCIMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allowed Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerCIM.impl.AllowedActionImpl#getIsAllowedAction <em>Is Allowed Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllowedActionImpl extends MinimalEObjectImpl.Container implements AllowedAction {
	/**
	 * The cached value of the '{@link #getIsAllowedAction() <em>Is Allowed Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAllowedAction()
	 * @generated
	 * @ordered
	 */
	protected AnnCRUDActivity isAllowedAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllowedActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AuthorizationLayerCIMPackage.Literals.ALLOWED_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnCRUDActivity getIsAllowedAction() {
		if (isAllowedAction != null && isAllowedAction.eIsProxy()) {
			InternalEObject oldIsAllowedAction = (InternalEObject)isAllowedAction;
			isAllowedAction = (AnnCRUDActivity)eResolveProxy(oldIsAllowedAction);
			if (isAllowedAction != oldIsAllowedAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AuthorizationLayerCIMPackage.ALLOWED_ACTION__IS_ALLOWED_ACTION, oldIsAllowedAction, isAllowedAction));
			}
		}
		return isAllowedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnCRUDActivity basicGetIsAllowedAction() {
		return isAllowedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAllowedAction(AnnCRUDActivity newIsAllowedAction) {
		AnnCRUDActivity oldIsAllowedAction = isAllowedAction;
		isAllowedAction = newIsAllowedAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerCIMPackage.ALLOWED_ACTION__IS_ALLOWED_ACTION, oldIsAllowedAction, isAllowedAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AuthorizationLayerCIMPackage.ALLOWED_ACTION__IS_ALLOWED_ACTION:
				if (resolve) return getIsAllowedAction();
				return basicGetIsAllowedAction();
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
			case AuthorizationLayerCIMPackage.ALLOWED_ACTION__IS_ALLOWED_ACTION:
				setIsAllowedAction((AnnCRUDActivity)newValue);
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
			case AuthorizationLayerCIMPackage.ALLOWED_ACTION__IS_ALLOWED_ACTION:
				setIsAllowedAction((AnnCRUDActivity)null);
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
			case AuthorizationLayerCIMPackage.ALLOWED_ACTION__IS_ALLOWED_ACTION:
				return isAllowedAction != null;
		}
		return super.eIsSet(featureID);
	}

} //AllowedActionImpl
