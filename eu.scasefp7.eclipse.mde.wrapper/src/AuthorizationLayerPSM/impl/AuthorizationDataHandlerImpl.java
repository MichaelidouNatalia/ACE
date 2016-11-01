/**
 */
package AuthorizationLayerPSM.impl;

import AuthorizationLayerPSM.AnnJPAController;
import AuthorizationLayerPSM.AuthorizationDataHandler;
import AuthorizationLayerPSM.AuthorizationLayerPSMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authorization Data Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerPSM.impl.AuthorizationDataHandlerImpl#getIsAuthorizationDataHandler <em>Is Authorization Data Handler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthorizationDataHandlerImpl extends AnnotationImpl implements AuthorizationDataHandler {
	/**
	 * The cached value of the '{@link #getIsAuthorizationDataHandler() <em>Is Authorization Data Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAuthorizationDataHandler()
	 * @generated
	 * @ordered
	 */
	protected AnnJPAController isAuthorizationDataHandler;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorizationDataHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AuthorizationLayerPSMPackage.Literals.AUTHORIZATION_DATA_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnJPAController getIsAuthorizationDataHandler() {
		if (isAuthorizationDataHandler != null && isAuthorizationDataHandler.eIsProxy()) {
			InternalEObject oldIsAuthorizationDataHandler = (InternalEObject)isAuthorizationDataHandler;
			isAuthorizationDataHandler = (AnnJPAController)eResolveProxy(oldIsAuthorizationDataHandler);
			if (isAuthorizationDataHandler != oldIsAuthorizationDataHandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AuthorizationLayerPSMPackage.AUTHORIZATION_DATA_HANDLER__IS_AUTHORIZATION_DATA_HANDLER, oldIsAuthorizationDataHandler, isAuthorizationDataHandler));
			}
		}
		return isAuthorizationDataHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnJPAController basicGetIsAuthorizationDataHandler() {
		return isAuthorizationDataHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAuthorizationDataHandler(AnnJPAController newIsAuthorizationDataHandler) {
		AnnJPAController oldIsAuthorizationDataHandler = isAuthorizationDataHandler;
		isAuthorizationDataHandler = newIsAuthorizationDataHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerPSMPackage.AUTHORIZATION_DATA_HANDLER__IS_AUTHORIZATION_DATA_HANDLER, oldIsAuthorizationDataHandler, isAuthorizationDataHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AuthorizationLayerPSMPackage.AUTHORIZATION_DATA_HANDLER__IS_AUTHORIZATION_DATA_HANDLER:
				if (resolve) return getIsAuthorizationDataHandler();
				return basicGetIsAuthorizationDataHandler();
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
			case AuthorizationLayerPSMPackage.AUTHORIZATION_DATA_HANDLER__IS_AUTHORIZATION_DATA_HANDLER:
				setIsAuthorizationDataHandler((AnnJPAController)newValue);
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
			case AuthorizationLayerPSMPackage.AUTHORIZATION_DATA_HANDLER__IS_AUTHORIZATION_DATA_HANDLER:
				setIsAuthorizationDataHandler((AnnJPAController)null);
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
			case AuthorizationLayerPSMPackage.AUTHORIZATION_DATA_HANDLER__IS_AUTHORIZATION_DATA_HANDLER:
				return isAuthorizationDataHandler != null;
		}
		return super.eIsSet(featureID);
	}

} //AuthorizationDataHandlerImpl
