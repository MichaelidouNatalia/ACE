/**
 */
package ExternalServiceLayerPSM.impl;

import ExternalServiceLayerPSM.AnnHTTPActivityHandler;
import ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage;
import ExternalServiceLayerPSM.JavaRESTClientHTTPActivityHandler;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java REST Client HTTP Activity Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ExternalServiceLayerPSM.impl.JavaRESTClientHTTPActivityHandlerImpl#getIsJavaRESTClientHTTPActivityHandler <em>Is Java REST Client HTTP Activity Handler</em>}</li>
 *   <li>{@link ExternalServiceLayerPSM.impl.JavaRESTClientHTTPActivityHandlerImpl#getTargetServiceURL <em>Target Service URL</em>}</li>
 *   <li>{@link ExternalServiceLayerPSM.impl.JavaRESTClientHTTPActivityHandlerImpl#getHTTPVerb <em>HTTP Verb</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaRESTClientHTTPActivityHandlerImpl extends MinimalEObjectImpl.Container implements JavaRESTClientHTTPActivityHandler {
	/**
	 * The cached value of the '{@link #getIsJavaRESTClientHTTPActivityHandler() <em>Is Java REST Client HTTP Activity Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsJavaRESTClientHTTPActivityHandler()
	 * @generated
	 * @ordered
	 */
	protected AnnHTTPActivityHandler isJavaRESTClientHTTPActivityHandler;

	/**
	 * The default value of the '{@link #getTargetServiceURL() <em>Target Service URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetServiceURL()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_SERVICE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetServiceURL() <em>Target Service URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetServiceURL()
	 * @generated
	 * @ordered
	 */
	protected String targetServiceURL = TARGET_SERVICE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getHTTPVerb() <em>HTTP Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHTTPVerb()
	 * @generated
	 * @ordered
	 */
	protected static final String HTTP_VERB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHTTPVerb() <em>HTTP Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHTTPVerb()
	 * @generated
	 * @ordered
	 */
	protected String httpVerb = HTTP_VERB_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaRESTClientHTTPActivityHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExternalServiceLayerPSMPackage.Literals.JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnHTTPActivityHandler getIsJavaRESTClientHTTPActivityHandler() {
		if (isJavaRESTClientHTTPActivityHandler != null && isJavaRESTClientHTTPActivityHandler.eIsProxy()) {
			InternalEObject oldIsJavaRESTClientHTTPActivityHandler = (InternalEObject)isJavaRESTClientHTTPActivityHandler;
			isJavaRESTClientHTTPActivityHandler = (AnnHTTPActivityHandler)eResolveProxy(oldIsJavaRESTClientHTTPActivityHandler);
			if (isJavaRESTClientHTTPActivityHandler != oldIsJavaRESTClientHTTPActivityHandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER__IS_JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER, oldIsJavaRESTClientHTTPActivityHandler, isJavaRESTClientHTTPActivityHandler));
			}
		}
		return isJavaRESTClientHTTPActivityHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnHTTPActivityHandler basicGetIsJavaRESTClientHTTPActivityHandler() {
		return isJavaRESTClientHTTPActivityHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsJavaRESTClientHTTPActivityHandler(AnnHTTPActivityHandler newIsJavaRESTClientHTTPActivityHandler) {
		AnnHTTPActivityHandler oldIsJavaRESTClientHTTPActivityHandler = isJavaRESTClientHTTPActivityHandler;
		isJavaRESTClientHTTPActivityHandler = newIsJavaRESTClientHTTPActivityHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER__IS_JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER, oldIsJavaRESTClientHTTPActivityHandler, isJavaRESTClientHTTPActivityHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetServiceURL() {
		return targetServiceURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetServiceURL(String newTargetServiceURL) {
		String oldTargetServiceURL = targetServiceURL;
		targetServiceURL = newTargetServiceURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER__TARGET_SERVICE_URL, oldTargetServiceURL, targetServiceURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHTTPVerb() {
		return httpVerb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHTTPVerb(String newHTTPVerb) {
		String oldHTTPVerb = httpVerb;
		httpVerb = newHTTPVerb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER__HTTP_VERB, oldHTTPVerb, httpVerb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER__IS_JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER:
				if (resolve) return getIsJavaRESTClientHTTPActivityHandler();
				return basicGetIsJavaRESTClientHTTPActivityHandler();
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER__TARGET_SERVICE_URL:
				return getTargetServiceURL();
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER__HTTP_VERB:
				return getHTTPVerb();
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
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER__IS_JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER:
				setIsJavaRESTClientHTTPActivityHandler((AnnHTTPActivityHandler)newValue);
				return;
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER__TARGET_SERVICE_URL:
				setTargetServiceURL((String)newValue);
				return;
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER__HTTP_VERB:
				setHTTPVerb((String)newValue);
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
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER__IS_JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER:
				setIsJavaRESTClientHTTPActivityHandler((AnnHTTPActivityHandler)null);
				return;
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER__TARGET_SERVICE_URL:
				setTargetServiceURL(TARGET_SERVICE_URL_EDEFAULT);
				return;
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER__HTTP_VERB:
				setHTTPVerb(HTTP_VERB_EDEFAULT);
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
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER__IS_JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER:
				return isJavaRESTClientHTTPActivityHandler != null;
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER__TARGET_SERVICE_URL:
				return TARGET_SERVICE_URL_EDEFAULT == null ? targetServiceURL != null : !TARGET_SERVICE_URL_EDEFAULT.equals(targetServiceURL);
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER__HTTP_VERB:
				return HTTP_VERB_EDEFAULT == null ? httpVerb != null : !HTTP_VERB_EDEFAULT.equals(httpVerb);
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
		result.append(" (targetServiceURL: ");
		result.append(targetServiceURL);
		result.append(", HTTPVerb: ");
		result.append(httpVerb);
		result.append(')');
		return result.toString();
	}

} //JavaRESTClientHTTPActivityHandlerImpl
