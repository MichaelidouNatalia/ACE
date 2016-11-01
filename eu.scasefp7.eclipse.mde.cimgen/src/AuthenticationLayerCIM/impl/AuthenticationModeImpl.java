/**
 */
package AuthenticationLayerCIM.impl;

import AuthenticationLayerCIM.AnnCRUDActivity;
import AuthenticationLayerCIM.AuthenticationLayerCIMPackage;
import AuthenticationLayerCIM.AuthenticationMode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authentication Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link AuthenticationLayerCIM.impl.AuthenticationModeImpl#getCRUDActivityAuthenticationMode <em>CRUD Activity Authentication Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuthenticationModeImpl extends AnnotationImpl implements AuthenticationMode {
	/**
	 * The cached value of the '{@link #getCRUDActivityAuthenticationMode() <em>CRUD Activity Authentication Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCRUDActivityAuthenticationMode()
	 * @generated
	 * @ordered
	 */
	protected AnnCRUDActivity crudActivityAuthenticationMode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthenticationModeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AuthenticationLayerCIMPackage.Literals.AUTHENTICATION_MODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnCRUDActivity getCRUDActivityAuthenticationMode() {
		if (crudActivityAuthenticationMode != null && crudActivityAuthenticationMode.eIsProxy()) {
			InternalEObject oldCRUDActivityAuthenticationMode = (InternalEObject)crudActivityAuthenticationMode;
			crudActivityAuthenticationMode = (AnnCRUDActivity)eResolveProxy(oldCRUDActivityAuthenticationMode);
			if (crudActivityAuthenticationMode != oldCRUDActivityAuthenticationMode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AuthenticationLayerCIMPackage.AUTHENTICATION_MODE__CRUD_ACTIVITY_AUTHENTICATION_MODE, oldCRUDActivityAuthenticationMode, crudActivityAuthenticationMode));
			}
		}
		return crudActivityAuthenticationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnCRUDActivity basicGetCRUDActivityAuthenticationMode() {
		return crudActivityAuthenticationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCRUDActivityAuthenticationMode(AnnCRUDActivity newCRUDActivityAuthenticationMode) {
		AnnCRUDActivity oldCRUDActivityAuthenticationMode = crudActivityAuthenticationMode;
		crudActivityAuthenticationMode = newCRUDActivityAuthenticationMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthenticationLayerCIMPackage.AUTHENTICATION_MODE__CRUD_ACTIVITY_AUTHENTICATION_MODE, oldCRUDActivityAuthenticationMode, crudActivityAuthenticationMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AuthenticationLayerCIMPackage.AUTHENTICATION_MODE__CRUD_ACTIVITY_AUTHENTICATION_MODE:
				if (resolve) return getCRUDActivityAuthenticationMode();
				return basicGetCRUDActivityAuthenticationMode();
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
			case AuthenticationLayerCIMPackage.AUTHENTICATION_MODE__CRUD_ACTIVITY_AUTHENTICATION_MODE:
				setCRUDActivityAuthenticationMode((AnnCRUDActivity)newValue);
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
			case AuthenticationLayerCIMPackage.AUTHENTICATION_MODE__CRUD_ACTIVITY_AUTHENTICATION_MODE:
				setCRUDActivityAuthenticationMode((AnnCRUDActivity)null);
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
			case AuthenticationLayerCIMPackage.AUTHENTICATION_MODE__CRUD_ACTIVITY_AUTHENTICATION_MODE:
				return crudActivityAuthenticationMode != null;
		}
		return super.eIsSet(featureID);
	}

} //AuthenticationModeImpl
