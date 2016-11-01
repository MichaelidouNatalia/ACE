/**
 */
package ExternalServiceLayerPSM.impl;

import ExternalServiceLayerPSM.AnnJavaAlgoModel;
import ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage;
import ExternalServiceLayerPSM.JavaInputDataModel;
import ExternalServiceLayerPSM.JavaOutputDataModel;
import ExternalServiceLayerPSM.JavaRESTClientModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java REST Client Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ExternalServiceLayerPSM.impl.JavaRESTClientModelImpl#getHasJavaInputModel <em>Has Java Input Model</em>}</li>
 *   <li>{@link ExternalServiceLayerPSM.impl.JavaRESTClientModelImpl#getHasJavaOutputModel <em>Has Java Output Model</em>}</li>
 *   <li>{@link ExternalServiceLayerPSM.impl.JavaRESTClientModelImpl#getIsJavaRESTClientModel <em>Is Java REST Client Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaRESTClientModelImpl extends AnnotationImpl implements JavaRESTClientModel {
	/**
	 * The cached value of the '{@link #getHasJavaInputModel() <em>Has Java Input Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasJavaInputModel()
	 * @generated
	 * @ordered
	 */
	protected JavaInputDataModel hasJavaInputModel;

	/**
	 * The cached value of the '{@link #getHasJavaOutputModel() <em>Has Java Output Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasJavaOutputModel()
	 * @generated
	 * @ordered
	 */
	protected JavaOutputDataModel hasJavaOutputModel;

	/**
	 * The cached value of the '{@link #getIsJavaRESTClientModel() <em>Is Java REST Client Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsJavaRESTClientModel()
	 * @generated
	 * @ordered
	 */
	protected AnnJavaAlgoModel isJavaRESTClientModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaRESTClientModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExternalServiceLayerPSMPackage.Literals.JAVA_REST_CLIENT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaInputDataModel getHasJavaInputModel() {
		return hasJavaInputModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasJavaInputModel(JavaInputDataModel newHasJavaInputModel, NotificationChain msgs) {
		JavaInputDataModel oldHasJavaInputModel = hasJavaInputModel;
		hasJavaInputModel = newHasJavaInputModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_MODEL__HAS_JAVA_INPUT_MODEL, oldHasJavaInputModel, newHasJavaInputModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasJavaInputModel(JavaInputDataModel newHasJavaInputModel) {
		if (newHasJavaInputModel != hasJavaInputModel) {
			NotificationChain msgs = null;
			if (hasJavaInputModel != null)
				msgs = ((InternalEObject)hasJavaInputModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_MODEL__HAS_JAVA_INPUT_MODEL, null, msgs);
			if (newHasJavaInputModel != null)
				msgs = ((InternalEObject)newHasJavaInputModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_MODEL__HAS_JAVA_INPUT_MODEL, null, msgs);
			msgs = basicSetHasJavaInputModel(newHasJavaInputModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_MODEL__HAS_JAVA_INPUT_MODEL, newHasJavaInputModel, newHasJavaInputModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaOutputDataModel getHasJavaOutputModel() {
		return hasJavaOutputModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasJavaOutputModel(JavaOutputDataModel newHasJavaOutputModel, NotificationChain msgs) {
		JavaOutputDataModel oldHasJavaOutputModel = hasJavaOutputModel;
		hasJavaOutputModel = newHasJavaOutputModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_MODEL__HAS_JAVA_OUTPUT_MODEL, oldHasJavaOutputModel, newHasJavaOutputModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasJavaOutputModel(JavaOutputDataModel newHasJavaOutputModel) {
		if (newHasJavaOutputModel != hasJavaOutputModel) {
			NotificationChain msgs = null;
			if (hasJavaOutputModel != null)
				msgs = ((InternalEObject)hasJavaOutputModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_MODEL__HAS_JAVA_OUTPUT_MODEL, null, msgs);
			if (newHasJavaOutputModel != null)
				msgs = ((InternalEObject)newHasJavaOutputModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_MODEL__HAS_JAVA_OUTPUT_MODEL, null, msgs);
			msgs = basicSetHasJavaOutputModel(newHasJavaOutputModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_MODEL__HAS_JAVA_OUTPUT_MODEL, newHasJavaOutputModel, newHasJavaOutputModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnJavaAlgoModel getIsJavaRESTClientModel() {
		if (isJavaRESTClientModel != null && isJavaRESTClientModel.eIsProxy()) {
			InternalEObject oldIsJavaRESTClientModel = (InternalEObject)isJavaRESTClientModel;
			isJavaRESTClientModel = (AnnJavaAlgoModel)eResolveProxy(oldIsJavaRESTClientModel);
			if (isJavaRESTClientModel != oldIsJavaRESTClientModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_MODEL__IS_JAVA_REST_CLIENT_MODEL, oldIsJavaRESTClientModel, isJavaRESTClientModel));
			}
		}
		return isJavaRESTClientModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnJavaAlgoModel basicGetIsJavaRESTClientModel() {
		return isJavaRESTClientModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsJavaRESTClientModel(AnnJavaAlgoModel newIsJavaRESTClientModel) {
		AnnJavaAlgoModel oldIsJavaRESTClientModel = isJavaRESTClientModel;
		isJavaRESTClientModel = newIsJavaRESTClientModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_MODEL__IS_JAVA_REST_CLIENT_MODEL, oldIsJavaRESTClientModel, isJavaRESTClientModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_MODEL__HAS_JAVA_INPUT_MODEL:
				return basicSetHasJavaInputModel(null, msgs);
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_MODEL__HAS_JAVA_OUTPUT_MODEL:
				return basicSetHasJavaOutputModel(null, msgs);
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
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_MODEL__HAS_JAVA_INPUT_MODEL:
				return getHasJavaInputModel();
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_MODEL__HAS_JAVA_OUTPUT_MODEL:
				return getHasJavaOutputModel();
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_MODEL__IS_JAVA_REST_CLIENT_MODEL:
				if (resolve) return getIsJavaRESTClientModel();
				return basicGetIsJavaRESTClientModel();
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
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_MODEL__HAS_JAVA_INPUT_MODEL:
				setHasJavaInputModel((JavaInputDataModel)newValue);
				return;
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_MODEL__HAS_JAVA_OUTPUT_MODEL:
				setHasJavaOutputModel((JavaOutputDataModel)newValue);
				return;
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_MODEL__IS_JAVA_REST_CLIENT_MODEL:
				setIsJavaRESTClientModel((AnnJavaAlgoModel)newValue);
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
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_MODEL__HAS_JAVA_INPUT_MODEL:
				setHasJavaInputModel((JavaInputDataModel)null);
				return;
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_MODEL__HAS_JAVA_OUTPUT_MODEL:
				setHasJavaOutputModel((JavaOutputDataModel)null);
				return;
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_MODEL__IS_JAVA_REST_CLIENT_MODEL:
				setIsJavaRESTClientModel((AnnJavaAlgoModel)null);
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
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_MODEL__HAS_JAVA_INPUT_MODEL:
				return hasJavaInputModel != null;
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_MODEL__HAS_JAVA_OUTPUT_MODEL:
				return hasJavaOutputModel != null;
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_MODEL__IS_JAVA_REST_CLIENT_MODEL:
				return isJavaRESTClientModel != null;
		}
		return super.eIsSet(featureID);
	}

} //JavaRESTClientModelImpl
