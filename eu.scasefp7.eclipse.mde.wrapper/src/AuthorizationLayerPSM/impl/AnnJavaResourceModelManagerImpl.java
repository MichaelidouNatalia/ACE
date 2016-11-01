/**
 */
package AuthorizationLayerPSM.impl;

import AuthorizationLayerPSM.AnnJavaResourceModelManager;
import AuthorizationLayerPSM.AuthorizationLayerPSMPackage;

import RESTfulServicePSM.JavaResourceModelManager;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ann Java Resource Model Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerPSM.impl.AnnJavaResourceModelManagerImpl#getAnnotatesJavaResourceModelManager <em>Annotates Java Resource Model Manager</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnJavaResourceModelManagerImpl extends AnnotatedElementImpl implements AnnJavaResourceModelManager {
	/**
	 * The cached value of the '{@link #getAnnotatesJavaResourceModelManager() <em>Annotates Java Resource Model Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatesJavaResourceModelManager()
	 * @generated
	 * @ordered
	 */
	protected JavaResourceModelManager annotatesJavaResourceModelManager;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnJavaResourceModelManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AuthorizationLayerPSMPackage.Literals.ANN_JAVA_RESOURCE_MODEL_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaResourceModelManager getAnnotatesJavaResourceModelManager() {
		if (annotatesJavaResourceModelManager != null && annotatesJavaResourceModelManager.eIsProxy()) {
			InternalEObject oldAnnotatesJavaResourceModelManager = (InternalEObject)annotatesJavaResourceModelManager;
			annotatesJavaResourceModelManager = (JavaResourceModelManager)eResolveProxy(oldAnnotatesJavaResourceModelManager);
			if (annotatesJavaResourceModelManager != oldAnnotatesJavaResourceModelManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AuthorizationLayerPSMPackage.ANN_JAVA_RESOURCE_MODEL_MANAGER__ANNOTATES_JAVA_RESOURCE_MODEL_MANAGER, oldAnnotatesJavaResourceModelManager, annotatesJavaResourceModelManager));
			}
		}
		return annotatesJavaResourceModelManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaResourceModelManager basicGetAnnotatesJavaResourceModelManager() {
		return annotatesJavaResourceModelManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotatesJavaResourceModelManager(JavaResourceModelManager newAnnotatesJavaResourceModelManager) {
		JavaResourceModelManager oldAnnotatesJavaResourceModelManager = annotatesJavaResourceModelManager;
		annotatesJavaResourceModelManager = newAnnotatesJavaResourceModelManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerPSMPackage.ANN_JAVA_RESOURCE_MODEL_MANAGER__ANNOTATES_JAVA_RESOURCE_MODEL_MANAGER, oldAnnotatesJavaResourceModelManager, annotatesJavaResourceModelManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AuthorizationLayerPSMPackage.ANN_JAVA_RESOURCE_MODEL_MANAGER__ANNOTATES_JAVA_RESOURCE_MODEL_MANAGER:
				if (resolve) return getAnnotatesJavaResourceModelManager();
				return basicGetAnnotatesJavaResourceModelManager();
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
			case AuthorizationLayerPSMPackage.ANN_JAVA_RESOURCE_MODEL_MANAGER__ANNOTATES_JAVA_RESOURCE_MODEL_MANAGER:
				setAnnotatesJavaResourceModelManager((JavaResourceModelManager)newValue);
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
			case AuthorizationLayerPSMPackage.ANN_JAVA_RESOURCE_MODEL_MANAGER__ANNOTATES_JAVA_RESOURCE_MODEL_MANAGER:
				setAnnotatesJavaResourceModelManager((JavaResourceModelManager)null);
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
			case AuthorizationLayerPSMPackage.ANN_JAVA_RESOURCE_MODEL_MANAGER__ANNOTATES_JAVA_RESOURCE_MODEL_MANAGER:
				return annotatesJavaResourceModelManager != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnJavaResourceModelManagerImpl
