/**
 */
package AuthorizationLayerPSM.impl;

import AuthorizationLayerPSM.AnnHTTPActivity;
import AuthorizationLayerPSM.AuthorizationLayerPSMPackage;

import RESTfulServicePSM.HTTPActivity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ann HTTP Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerPSM.impl.AnnHTTPActivityImpl#getAnnotatesHTTPActivity <em>Annotates HTTP Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnHTTPActivityImpl extends AnnotatedElementImpl implements AnnHTTPActivity {
	/**
	 * The cached value of the '{@link #getAnnotatesHTTPActivity() <em>Annotates HTTP Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatesHTTPActivity()
	 * @generated
	 * @ordered
	 */
	protected HTTPActivity annotatesHTTPActivity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnHTTPActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AuthorizationLayerPSMPackage.Literals.ANN_HTTP_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPActivity getAnnotatesHTTPActivity() {
		if (annotatesHTTPActivity != null && annotatesHTTPActivity.eIsProxy()) {
			InternalEObject oldAnnotatesHTTPActivity = (InternalEObject)annotatesHTTPActivity;
			annotatesHTTPActivity = (HTTPActivity)eResolveProxy(oldAnnotatesHTTPActivity);
			if (annotatesHTTPActivity != oldAnnotatesHTTPActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AuthorizationLayerPSMPackage.ANN_HTTP_ACTIVITY__ANNOTATES_HTTP_ACTIVITY, oldAnnotatesHTTPActivity, annotatesHTTPActivity));
			}
		}
		return annotatesHTTPActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPActivity basicGetAnnotatesHTTPActivity() {
		return annotatesHTTPActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotatesHTTPActivity(HTTPActivity newAnnotatesHTTPActivity) {
		HTTPActivity oldAnnotatesHTTPActivity = annotatesHTTPActivity;
		annotatesHTTPActivity = newAnnotatesHTTPActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerPSMPackage.ANN_HTTP_ACTIVITY__ANNOTATES_HTTP_ACTIVITY, oldAnnotatesHTTPActivity, annotatesHTTPActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AuthorizationLayerPSMPackage.ANN_HTTP_ACTIVITY__ANNOTATES_HTTP_ACTIVITY:
				if (resolve) return getAnnotatesHTTPActivity();
				return basicGetAnnotatesHTTPActivity();
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
			case AuthorizationLayerPSMPackage.ANN_HTTP_ACTIVITY__ANNOTATES_HTTP_ACTIVITY:
				setAnnotatesHTTPActivity((HTTPActivity)newValue);
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
			case AuthorizationLayerPSMPackage.ANN_HTTP_ACTIVITY__ANNOTATES_HTTP_ACTIVITY:
				setAnnotatesHTTPActivity((HTTPActivity)null);
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
			case AuthorizationLayerPSMPackage.ANN_HTTP_ACTIVITY__ANNOTATES_HTTP_ACTIVITY:
				return annotatesHTTPActivity != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnHTTPActivityImpl
