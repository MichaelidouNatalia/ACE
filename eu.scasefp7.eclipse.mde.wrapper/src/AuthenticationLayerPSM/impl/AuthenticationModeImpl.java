/**
 */
package AuthenticationLayerPSM.impl;

import AuthenticationLayerPSM.AnnHTTPActivity;
import AuthenticationLayerPSM.AnnHTTPActivityHandler;
import AuthenticationLayerPSM.AuthenticationLayerPSMPackage;
import AuthenticationLayerPSM.AuthenticationMode;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authentication Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AuthenticationLayerPSM.impl.AuthenticationModeImpl#getHTTPActivityHandlerHasAuthenticationMode <em>HTTP Activity Handler Has Authentication Mode</em>}</li>
 *   <li>{@link AuthenticationLayerPSM.impl.AuthenticationModeImpl#getHTTPActivityHasAuthenticationMode <em>HTTP Activity Has Authentication Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthenticationModeImpl extends AnnotationImpl implements AuthenticationMode {
	/**
	 * The cached value of the '{@link #getHTTPActivityHandlerHasAuthenticationMode() <em>HTTP Activity Handler Has Authentication Mode</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHTTPActivityHandlerHasAuthenticationMode()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnHTTPActivityHandler> httpActivityHandlerHasAuthenticationMode;

	/**
	 * The cached value of the '{@link #getHTTPActivityHasAuthenticationMode() <em>HTTP Activity Has Authentication Mode</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHTTPActivityHasAuthenticationMode()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnHTTPActivity> httpActivityHasAuthenticationMode;

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
		return AuthenticationLayerPSMPackage.Literals.AUTHENTICATION_MODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnHTTPActivityHandler> getHTTPActivityHandlerHasAuthenticationMode() {
		if (httpActivityHandlerHasAuthenticationMode == null) {
			httpActivityHandlerHasAuthenticationMode = new EObjectResolvingEList<AnnHTTPActivityHandler>(AnnHTTPActivityHandler.class, this, AuthenticationLayerPSMPackage.AUTHENTICATION_MODE__HTTP_ACTIVITY_HANDLER_HAS_AUTHENTICATION_MODE);
		}
		return httpActivityHandlerHasAuthenticationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnHTTPActivity> getHTTPActivityHasAuthenticationMode() {
		if (httpActivityHasAuthenticationMode == null) {
			httpActivityHasAuthenticationMode = new EObjectResolvingEList<AnnHTTPActivity>(AnnHTTPActivity.class, this, AuthenticationLayerPSMPackage.AUTHENTICATION_MODE__HTTP_ACTIVITY_HAS_AUTHENTICATION_MODE);
		}
		return httpActivityHasAuthenticationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AuthenticationLayerPSMPackage.AUTHENTICATION_MODE__HTTP_ACTIVITY_HANDLER_HAS_AUTHENTICATION_MODE:
				return getHTTPActivityHandlerHasAuthenticationMode();
			case AuthenticationLayerPSMPackage.AUTHENTICATION_MODE__HTTP_ACTIVITY_HAS_AUTHENTICATION_MODE:
				return getHTTPActivityHasAuthenticationMode();
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
			case AuthenticationLayerPSMPackage.AUTHENTICATION_MODE__HTTP_ACTIVITY_HANDLER_HAS_AUTHENTICATION_MODE:
				getHTTPActivityHandlerHasAuthenticationMode().clear();
				getHTTPActivityHandlerHasAuthenticationMode().addAll((Collection<? extends AnnHTTPActivityHandler>)newValue);
				return;
			case AuthenticationLayerPSMPackage.AUTHENTICATION_MODE__HTTP_ACTIVITY_HAS_AUTHENTICATION_MODE:
				getHTTPActivityHasAuthenticationMode().clear();
				getHTTPActivityHasAuthenticationMode().addAll((Collection<? extends AnnHTTPActivity>)newValue);
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
			case AuthenticationLayerPSMPackage.AUTHENTICATION_MODE__HTTP_ACTIVITY_HANDLER_HAS_AUTHENTICATION_MODE:
				getHTTPActivityHandlerHasAuthenticationMode().clear();
				return;
			case AuthenticationLayerPSMPackage.AUTHENTICATION_MODE__HTTP_ACTIVITY_HAS_AUTHENTICATION_MODE:
				getHTTPActivityHasAuthenticationMode().clear();
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
			case AuthenticationLayerPSMPackage.AUTHENTICATION_MODE__HTTP_ACTIVITY_HANDLER_HAS_AUTHENTICATION_MODE:
				return httpActivityHandlerHasAuthenticationMode != null && !httpActivityHandlerHasAuthenticationMode.isEmpty();
			case AuthenticationLayerPSMPackage.AUTHENTICATION_MODE__HTTP_ACTIVITY_HAS_AUTHENTICATION_MODE:
				return httpActivityHasAuthenticationMode != null && !httpActivityHasAuthenticationMode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AuthenticationModeImpl
