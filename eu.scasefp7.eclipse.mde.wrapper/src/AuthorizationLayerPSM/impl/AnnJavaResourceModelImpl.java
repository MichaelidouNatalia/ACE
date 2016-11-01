/**
 */
package AuthorizationLayerPSM.impl;

import AuthorizationLayerPSM.AnnJavaResourceModel;
import AuthorizationLayerPSM.AuthorizationLayerPSMPackage;

import RESTfulServicePSM.JavaResourceModel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ann Java Resource Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerPSM.impl.AnnJavaResourceModelImpl#getAnnotatesJavaResourceModel <em>Annotates Java Resource Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnJavaResourceModelImpl extends AnnotatedElementImpl implements AnnJavaResourceModel {
	/**
	 * The cached value of the '{@link #getAnnotatesJavaResourceModel() <em>Annotates Java Resource Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatesJavaResourceModel()
	 * @generated
	 * @ordered
	 */
	protected JavaResourceModel annotatesJavaResourceModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnJavaResourceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AuthorizationLayerPSMPackage.Literals.ANN_JAVA_RESOURCE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaResourceModel getAnnotatesJavaResourceModel() {
		if (annotatesJavaResourceModel != null && annotatesJavaResourceModel.eIsProxy()) {
			InternalEObject oldAnnotatesJavaResourceModel = (InternalEObject)annotatesJavaResourceModel;
			annotatesJavaResourceModel = (JavaResourceModel)eResolveProxy(oldAnnotatesJavaResourceModel);
			if (annotatesJavaResourceModel != oldAnnotatesJavaResourceModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AuthorizationLayerPSMPackage.ANN_JAVA_RESOURCE_MODEL__ANNOTATES_JAVA_RESOURCE_MODEL, oldAnnotatesJavaResourceModel, annotatesJavaResourceModel));
			}
		}
		return annotatesJavaResourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaResourceModel basicGetAnnotatesJavaResourceModel() {
		return annotatesJavaResourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotatesJavaResourceModel(JavaResourceModel newAnnotatesJavaResourceModel) {
		JavaResourceModel oldAnnotatesJavaResourceModel = annotatesJavaResourceModel;
		annotatesJavaResourceModel = newAnnotatesJavaResourceModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerPSMPackage.ANN_JAVA_RESOURCE_MODEL__ANNOTATES_JAVA_RESOURCE_MODEL, oldAnnotatesJavaResourceModel, annotatesJavaResourceModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AuthorizationLayerPSMPackage.ANN_JAVA_RESOURCE_MODEL__ANNOTATES_JAVA_RESOURCE_MODEL:
				if (resolve) return getAnnotatesJavaResourceModel();
				return basicGetAnnotatesJavaResourceModel();
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
			case AuthorizationLayerPSMPackage.ANN_JAVA_RESOURCE_MODEL__ANNOTATES_JAVA_RESOURCE_MODEL:
				setAnnotatesJavaResourceModel((JavaResourceModel)newValue);
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
			case AuthorizationLayerPSMPackage.ANN_JAVA_RESOURCE_MODEL__ANNOTATES_JAVA_RESOURCE_MODEL:
				setAnnotatesJavaResourceModel((JavaResourceModel)null);
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
			case AuthorizationLayerPSMPackage.ANN_JAVA_RESOURCE_MODEL__ANNOTATES_JAVA_RESOURCE_MODEL:
				return annotatesJavaResourceModel != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnJavaResourceModelImpl
