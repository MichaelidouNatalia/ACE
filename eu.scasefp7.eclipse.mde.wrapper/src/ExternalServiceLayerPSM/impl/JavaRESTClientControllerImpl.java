/**
 */
package ExternalServiceLayerPSM.impl;

import ExternalServiceLayerPSM.AnnJavaAlgoController;
import ExternalServiceLayerPSM.ComplexType;
import ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage;
import ExternalServiceLayerPSM.JavaRESTClientController;
import ExternalServiceLayerPSM.JavaRESTClientHTTPActivity;
import ExternalServiceLayerPSM.JavaRESTClientModel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java REST Client Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ExternalServiceLayerPSM.impl.JavaRESTClientControllerImpl#getHasJavaRESTClientHTTPActivity <em>Has Java REST Client HTTP Activity</em>}</li>
 *   <li>{@link ExternalServiceLayerPSM.impl.JavaRESTClientControllerImpl#getIsJavaRESTClientController <em>Is Java REST Client Controller</em>}</li>
 *   <li>{@link ExternalServiceLayerPSM.impl.JavaRESTClientControllerImpl#getHasAssociatedModel <em>Has Associated Model</em>}</li>
 *   <li>{@link ExternalServiceLayerPSM.impl.JavaRESTClientControllerImpl#getHasComplexTypes <em>Has Complex Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaRESTClientControllerImpl extends AnnotationImpl implements JavaRESTClientController {
	/**
	 * The cached value of the '{@link #getHasJavaRESTClientHTTPActivity() <em>Has Java REST Client HTTP Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasJavaRESTClientHTTPActivity()
	 * @generated
	 * @ordered
	 */
	protected JavaRESTClientHTTPActivity hasJavaRESTClientHTTPActivity;

	/**
	 * The cached value of the '{@link #getIsJavaRESTClientController() <em>Is Java REST Client Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsJavaRESTClientController()
	 * @generated
	 * @ordered
	 */
	protected AnnJavaAlgoController isJavaRESTClientController;

	/**
	 * The cached value of the '{@link #getHasAssociatedModel() <em>Has Associated Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAssociatedModel()
	 * @generated
	 * @ordered
	 */
	protected JavaRESTClientModel hasAssociatedModel;

	/**
	 * The cached value of the '{@link #getHasComplexTypes() <em>Has Complex Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasComplexTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ComplexType> hasComplexTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaRESTClientControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExternalServiceLayerPSMPackage.Literals.JAVA_REST_CLIENT_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaRESTClientHTTPActivity getHasJavaRESTClientHTTPActivity() {
		return hasJavaRESTClientHTTPActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasJavaRESTClientHTTPActivity(JavaRESTClientHTTPActivity newHasJavaRESTClientHTTPActivity, NotificationChain msgs) {
		JavaRESTClientHTTPActivity oldHasJavaRESTClientHTTPActivity = hasJavaRESTClientHTTPActivity;
		hasJavaRESTClientHTTPActivity = newHasJavaRESTClientHTTPActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_CONTROLLER__HAS_JAVA_REST_CLIENT_HTTP_ACTIVITY, oldHasJavaRESTClientHTTPActivity, newHasJavaRESTClientHTTPActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasJavaRESTClientHTTPActivity(JavaRESTClientHTTPActivity newHasJavaRESTClientHTTPActivity) {
		if (newHasJavaRESTClientHTTPActivity != hasJavaRESTClientHTTPActivity) {
			NotificationChain msgs = null;
			if (hasJavaRESTClientHTTPActivity != null)
				msgs = ((InternalEObject)hasJavaRESTClientHTTPActivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_CONTROLLER__HAS_JAVA_REST_CLIENT_HTTP_ACTIVITY, null, msgs);
			if (newHasJavaRESTClientHTTPActivity != null)
				msgs = ((InternalEObject)newHasJavaRESTClientHTTPActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_CONTROLLER__HAS_JAVA_REST_CLIENT_HTTP_ACTIVITY, null, msgs);
			msgs = basicSetHasJavaRESTClientHTTPActivity(newHasJavaRESTClientHTTPActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_CONTROLLER__HAS_JAVA_REST_CLIENT_HTTP_ACTIVITY, newHasJavaRESTClientHTTPActivity, newHasJavaRESTClientHTTPActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnJavaAlgoController getIsJavaRESTClientController() {
		if (isJavaRESTClientController != null && isJavaRESTClientController.eIsProxy()) {
			InternalEObject oldIsJavaRESTClientController = (InternalEObject)isJavaRESTClientController;
			isJavaRESTClientController = (AnnJavaAlgoController)eResolveProxy(oldIsJavaRESTClientController);
			if (isJavaRESTClientController != oldIsJavaRESTClientController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_CONTROLLER__IS_JAVA_REST_CLIENT_CONTROLLER, oldIsJavaRESTClientController, isJavaRESTClientController));
			}
		}
		return isJavaRESTClientController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnJavaAlgoController basicGetIsJavaRESTClientController() {
		return isJavaRESTClientController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsJavaRESTClientController(AnnJavaAlgoController newIsJavaRESTClientController) {
		AnnJavaAlgoController oldIsJavaRESTClientController = isJavaRESTClientController;
		isJavaRESTClientController = newIsJavaRESTClientController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_CONTROLLER__IS_JAVA_REST_CLIENT_CONTROLLER, oldIsJavaRESTClientController, isJavaRESTClientController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaRESTClientModel getHasAssociatedModel() {
		if (hasAssociatedModel != null && hasAssociatedModel.eIsProxy()) {
			InternalEObject oldHasAssociatedModel = (InternalEObject)hasAssociatedModel;
			hasAssociatedModel = (JavaRESTClientModel)eResolveProxy(oldHasAssociatedModel);
			if (hasAssociatedModel != oldHasAssociatedModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_CONTROLLER__HAS_ASSOCIATED_MODEL, oldHasAssociatedModel, hasAssociatedModel));
			}
		}
		return hasAssociatedModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaRESTClientModel basicGetHasAssociatedModel() {
		return hasAssociatedModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasAssociatedModel(JavaRESTClientModel newHasAssociatedModel) {
		JavaRESTClientModel oldHasAssociatedModel = hasAssociatedModel;
		hasAssociatedModel = newHasAssociatedModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_CONTROLLER__HAS_ASSOCIATED_MODEL, oldHasAssociatedModel, hasAssociatedModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComplexType> getHasComplexTypes() {
		if (hasComplexTypes == null) {
			hasComplexTypes = new EObjectContainmentEList<ComplexType>(ComplexType.class, this, ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_CONTROLLER__HAS_COMPLEX_TYPES);
		}
		return hasComplexTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_CONTROLLER__HAS_JAVA_REST_CLIENT_HTTP_ACTIVITY:
				return basicSetHasJavaRESTClientHTTPActivity(null, msgs);
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_CONTROLLER__HAS_COMPLEX_TYPES:
				return ((InternalEList<?>)getHasComplexTypes()).basicRemove(otherEnd, msgs);
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
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_CONTROLLER__HAS_JAVA_REST_CLIENT_HTTP_ACTIVITY:
				return getHasJavaRESTClientHTTPActivity();
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_CONTROLLER__IS_JAVA_REST_CLIENT_CONTROLLER:
				if (resolve) return getIsJavaRESTClientController();
				return basicGetIsJavaRESTClientController();
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_CONTROLLER__HAS_ASSOCIATED_MODEL:
				if (resolve) return getHasAssociatedModel();
				return basicGetHasAssociatedModel();
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_CONTROLLER__HAS_COMPLEX_TYPES:
				return getHasComplexTypes();
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
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_CONTROLLER__HAS_JAVA_REST_CLIENT_HTTP_ACTIVITY:
				setHasJavaRESTClientHTTPActivity((JavaRESTClientHTTPActivity)newValue);
				return;
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_CONTROLLER__IS_JAVA_REST_CLIENT_CONTROLLER:
				setIsJavaRESTClientController((AnnJavaAlgoController)newValue);
				return;
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_CONTROLLER__HAS_ASSOCIATED_MODEL:
				setHasAssociatedModel((JavaRESTClientModel)newValue);
				return;
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_CONTROLLER__HAS_COMPLEX_TYPES:
				getHasComplexTypes().clear();
				getHasComplexTypes().addAll((Collection<? extends ComplexType>)newValue);
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
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_CONTROLLER__HAS_JAVA_REST_CLIENT_HTTP_ACTIVITY:
				setHasJavaRESTClientHTTPActivity((JavaRESTClientHTTPActivity)null);
				return;
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_CONTROLLER__IS_JAVA_REST_CLIENT_CONTROLLER:
				setIsJavaRESTClientController((AnnJavaAlgoController)null);
				return;
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_CONTROLLER__HAS_ASSOCIATED_MODEL:
				setHasAssociatedModel((JavaRESTClientModel)null);
				return;
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_CONTROLLER__HAS_COMPLEX_TYPES:
				getHasComplexTypes().clear();
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
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_CONTROLLER__HAS_JAVA_REST_CLIENT_HTTP_ACTIVITY:
				return hasJavaRESTClientHTTPActivity != null;
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_CONTROLLER__IS_JAVA_REST_CLIENT_CONTROLLER:
				return isJavaRESTClientController != null;
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_CONTROLLER__HAS_ASSOCIATED_MODEL:
				return hasAssociatedModel != null;
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_CONTROLLER__HAS_COMPLEX_TYPES:
				return hasComplexTypes != null && !hasComplexTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JavaRESTClientControllerImpl
