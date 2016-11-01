/**
 */
package SearchLayerPSM.impl;

import RESTfulServicePSM.HTTPActivityHandler;

import SearchLayerPSM.AnnHTTPActivityHandler;
import SearchLayerPSM.SearchLayerPSMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ann HTTP Activity Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SearchLayerPSM.impl.AnnHTTPActivityHandlerImpl#getAnnotatesHTTPActivityHandler <em>Annotates HTTP Activity Handler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnHTTPActivityHandlerImpl extends AnnotatedElementImpl implements AnnHTTPActivityHandler {
	/**
	 * The cached value of the '{@link #getAnnotatesHTTPActivityHandler() <em>Annotates HTTP Activity Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatesHTTPActivityHandler()
	 * @generated
	 * @ordered
	 */
	protected HTTPActivityHandler annotatesHTTPActivityHandler;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnHTTPActivityHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SearchLayerPSMPackage.Literals.ANN_HTTP_ACTIVITY_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPActivityHandler getAnnotatesHTTPActivityHandler() {
		if (annotatesHTTPActivityHandler != null && annotatesHTTPActivityHandler.eIsProxy()) {
			InternalEObject oldAnnotatesHTTPActivityHandler = (InternalEObject)annotatesHTTPActivityHandler;
			annotatesHTTPActivityHandler = (HTTPActivityHandler)eResolveProxy(oldAnnotatesHTTPActivityHandler);
			if (annotatesHTTPActivityHandler != oldAnnotatesHTTPActivityHandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SearchLayerPSMPackage.ANN_HTTP_ACTIVITY_HANDLER__ANNOTATES_HTTP_ACTIVITY_HANDLER, oldAnnotatesHTTPActivityHandler, annotatesHTTPActivityHandler));
			}
		}
		return annotatesHTTPActivityHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPActivityHandler basicGetAnnotatesHTTPActivityHandler() {
		return annotatesHTTPActivityHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotatesHTTPActivityHandler(HTTPActivityHandler newAnnotatesHTTPActivityHandler) {
		HTTPActivityHandler oldAnnotatesHTTPActivityHandler = annotatesHTTPActivityHandler;
		annotatesHTTPActivityHandler = newAnnotatesHTTPActivityHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SearchLayerPSMPackage.ANN_HTTP_ACTIVITY_HANDLER__ANNOTATES_HTTP_ACTIVITY_HANDLER, oldAnnotatesHTTPActivityHandler, annotatesHTTPActivityHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SearchLayerPSMPackage.ANN_HTTP_ACTIVITY_HANDLER__ANNOTATES_HTTP_ACTIVITY_HANDLER:
				if (resolve) return getAnnotatesHTTPActivityHandler();
				return basicGetAnnotatesHTTPActivityHandler();
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
			case SearchLayerPSMPackage.ANN_HTTP_ACTIVITY_HANDLER__ANNOTATES_HTTP_ACTIVITY_HANDLER:
				setAnnotatesHTTPActivityHandler((HTTPActivityHandler)newValue);
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
			case SearchLayerPSMPackage.ANN_HTTP_ACTIVITY_HANDLER__ANNOTATES_HTTP_ACTIVITY_HANDLER:
				setAnnotatesHTTPActivityHandler((HTTPActivityHandler)null);
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
			case SearchLayerPSMPackage.ANN_HTTP_ACTIVITY_HANDLER__ANNOTATES_HTTP_ACTIVITY_HANDLER:
				return annotatesHTTPActivityHandler != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnHTTPActivityHandlerImpl
