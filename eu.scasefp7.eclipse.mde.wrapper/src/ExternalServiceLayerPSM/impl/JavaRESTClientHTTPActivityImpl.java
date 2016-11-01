/**
 */
package ExternalServiceLayerPSM.impl;

import ExternalServiceLayerPSM.AnnHTTPActivity;
import ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage;
import ExternalServiceLayerPSM.JavaRESTClientHTTPActivity;
import ExternalServiceLayerPSM.JavaRESTClientHTTPActivityHandler;
import ExternalServiceLayerPSM.QueryParam;

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
 * An implementation of the model object '<em><b>Java REST Client HTTP Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ExternalServiceLayerPSM.impl.JavaRESTClientHTTPActivityImpl#getHasJavaRESTClientHTTPActivityHandler <em>Has Java REST Client HTTP Activity Handler</em>}</li>
 *   <li>{@link ExternalServiceLayerPSM.impl.JavaRESTClientHTTPActivityImpl#getHasQueryParam <em>Has Query Param</em>}</li>
 *   <li>{@link ExternalServiceLayerPSM.impl.JavaRESTClientHTTPActivityImpl#getIsJavaRESTClientHTTPActivity <em>Is Java REST Client HTTP Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaRESTClientHTTPActivityImpl extends MinimalEObjectImpl.Container implements JavaRESTClientHTTPActivity {
	/**
	 * The cached value of the '{@link #getHasJavaRESTClientHTTPActivityHandler() <em>Has Java REST Client HTTP Activity Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasJavaRESTClientHTTPActivityHandler()
	 * @generated
	 * @ordered
	 */
	protected JavaRESTClientHTTPActivityHandler hasJavaRESTClientHTTPActivityHandler;

	/**
	 * The cached value of the '{@link #getHasQueryParam() <em>Has Query Param</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasQueryParam()
	 * @generated
	 * @ordered
	 */
	protected EList<QueryParam> hasQueryParam;

	/**
	 * The cached value of the '{@link #getIsJavaRESTClientHTTPActivity() <em>Is Java REST Client HTTP Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsJavaRESTClientHTTPActivity()
	 * @generated
	 * @ordered
	 */
	protected AnnHTTPActivity isJavaRESTClientHTTPActivity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaRESTClientHTTPActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExternalServiceLayerPSMPackage.Literals.JAVA_REST_CLIENT_HTTP_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaRESTClientHTTPActivityHandler getHasJavaRESTClientHTTPActivityHandler() {
		return hasJavaRESTClientHTTPActivityHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasJavaRESTClientHTTPActivityHandler(JavaRESTClientHTTPActivityHandler newHasJavaRESTClientHTTPActivityHandler, NotificationChain msgs) {
		JavaRESTClientHTTPActivityHandler oldHasJavaRESTClientHTTPActivityHandler = hasJavaRESTClientHTTPActivityHandler;
		hasJavaRESTClientHTTPActivityHandler = newHasJavaRESTClientHTTPActivityHandler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY__HAS_JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER, oldHasJavaRESTClientHTTPActivityHandler, newHasJavaRESTClientHTTPActivityHandler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasJavaRESTClientHTTPActivityHandler(JavaRESTClientHTTPActivityHandler newHasJavaRESTClientHTTPActivityHandler) {
		if (newHasJavaRESTClientHTTPActivityHandler != hasJavaRESTClientHTTPActivityHandler) {
			NotificationChain msgs = null;
			if (hasJavaRESTClientHTTPActivityHandler != null)
				msgs = ((InternalEObject)hasJavaRESTClientHTTPActivityHandler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY__HAS_JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER, null, msgs);
			if (newHasJavaRESTClientHTTPActivityHandler != null)
				msgs = ((InternalEObject)newHasJavaRESTClientHTTPActivityHandler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY__HAS_JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER, null, msgs);
			msgs = basicSetHasJavaRESTClientHTTPActivityHandler(newHasJavaRESTClientHTTPActivityHandler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY__HAS_JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER, newHasJavaRESTClientHTTPActivityHandler, newHasJavaRESTClientHTTPActivityHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QueryParam> getHasQueryParam() {
		if (hasQueryParam == null) {
			hasQueryParam = new EObjectContainmentEList<QueryParam>(QueryParam.class, this, ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY__HAS_QUERY_PARAM);
		}
		return hasQueryParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnHTTPActivity getIsJavaRESTClientHTTPActivity() {
		if (isJavaRESTClientHTTPActivity != null && isJavaRESTClientHTTPActivity.eIsProxy()) {
			InternalEObject oldIsJavaRESTClientHTTPActivity = (InternalEObject)isJavaRESTClientHTTPActivity;
			isJavaRESTClientHTTPActivity = (AnnHTTPActivity)eResolveProxy(oldIsJavaRESTClientHTTPActivity);
			if (isJavaRESTClientHTTPActivity != oldIsJavaRESTClientHTTPActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY__IS_JAVA_REST_CLIENT_HTTP_ACTIVITY, oldIsJavaRESTClientHTTPActivity, isJavaRESTClientHTTPActivity));
			}
		}
		return isJavaRESTClientHTTPActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnHTTPActivity basicGetIsJavaRESTClientHTTPActivity() {
		return isJavaRESTClientHTTPActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsJavaRESTClientHTTPActivity(AnnHTTPActivity newIsJavaRESTClientHTTPActivity) {
		AnnHTTPActivity oldIsJavaRESTClientHTTPActivity = isJavaRESTClientHTTPActivity;
		isJavaRESTClientHTTPActivity = newIsJavaRESTClientHTTPActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY__IS_JAVA_REST_CLIENT_HTTP_ACTIVITY, oldIsJavaRESTClientHTTPActivity, isJavaRESTClientHTTPActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY__HAS_JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER:
				return basicSetHasJavaRESTClientHTTPActivityHandler(null, msgs);
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY__HAS_QUERY_PARAM:
				return ((InternalEList<?>)getHasQueryParam()).basicRemove(otherEnd, msgs);
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
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY__HAS_JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER:
				return getHasJavaRESTClientHTTPActivityHandler();
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY__HAS_QUERY_PARAM:
				return getHasQueryParam();
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY__IS_JAVA_REST_CLIENT_HTTP_ACTIVITY:
				if (resolve) return getIsJavaRESTClientHTTPActivity();
				return basicGetIsJavaRESTClientHTTPActivity();
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
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY__HAS_JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER:
				setHasJavaRESTClientHTTPActivityHandler((JavaRESTClientHTTPActivityHandler)newValue);
				return;
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY__HAS_QUERY_PARAM:
				getHasQueryParam().clear();
				getHasQueryParam().addAll((Collection<? extends QueryParam>)newValue);
				return;
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY__IS_JAVA_REST_CLIENT_HTTP_ACTIVITY:
				setIsJavaRESTClientHTTPActivity((AnnHTTPActivity)newValue);
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
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY__HAS_JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER:
				setHasJavaRESTClientHTTPActivityHandler((JavaRESTClientHTTPActivityHandler)null);
				return;
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY__HAS_QUERY_PARAM:
				getHasQueryParam().clear();
				return;
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY__IS_JAVA_REST_CLIENT_HTTP_ACTIVITY:
				setIsJavaRESTClientHTTPActivity((AnnHTTPActivity)null);
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
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY__HAS_JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER:
				return hasJavaRESTClientHTTPActivityHandler != null;
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY__HAS_QUERY_PARAM:
				return hasQueryParam != null && !hasQueryParam.isEmpty();
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY__IS_JAVA_REST_CLIENT_HTTP_ACTIVITY:
				return isJavaRESTClientHTTPActivity != null;
		}
		return super.eIsSet(featureID);
	}

} //JavaRESTClientHTTPActivityImpl
