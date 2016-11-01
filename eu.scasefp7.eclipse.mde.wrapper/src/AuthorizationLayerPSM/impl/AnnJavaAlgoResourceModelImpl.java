/**
 */
package AuthorizationLayerPSM.impl;

import AuthorizationLayerPSM.AnnJavaAlgoResourceModel;
import AuthorizationLayerPSM.AuthorizationLayerPSMPackage;

import RESTfulServicePSM.JavaAlgoResourceModel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ann Java Algo Resource Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerPSM.impl.AnnJavaAlgoResourceModelImpl#getAnnotatesJavaLagoResourceModel <em>Annotates Java Lago Resource Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnJavaAlgoResourceModelImpl extends AnnotatedElementImpl implements AnnJavaAlgoResourceModel {
	/**
	 * The cached value of the '{@link #getAnnotatesJavaLagoResourceModel() <em>Annotates Java Lago Resource Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatesJavaLagoResourceModel()
	 * @generated
	 * @ordered
	 */
	protected JavaAlgoResourceModel annotatesJavaLagoResourceModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnJavaAlgoResourceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AuthorizationLayerPSMPackage.Literals.ANN_JAVA_ALGO_RESOURCE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaAlgoResourceModel getAnnotatesJavaLagoResourceModel() {
		if (annotatesJavaLagoResourceModel != null && annotatesJavaLagoResourceModel.eIsProxy()) {
			InternalEObject oldAnnotatesJavaLagoResourceModel = (InternalEObject)annotatesJavaLagoResourceModel;
			annotatesJavaLagoResourceModel = (JavaAlgoResourceModel)eResolveProxy(oldAnnotatesJavaLagoResourceModel);
			if (annotatesJavaLagoResourceModel != oldAnnotatesJavaLagoResourceModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AuthorizationLayerPSMPackage.ANN_JAVA_ALGO_RESOURCE_MODEL__ANNOTATES_JAVA_LAGO_RESOURCE_MODEL, oldAnnotatesJavaLagoResourceModel, annotatesJavaLagoResourceModel));
			}
		}
		return annotatesJavaLagoResourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaAlgoResourceModel basicGetAnnotatesJavaLagoResourceModel() {
		return annotatesJavaLagoResourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotatesJavaLagoResourceModel(JavaAlgoResourceModel newAnnotatesJavaLagoResourceModel) {
		JavaAlgoResourceModel oldAnnotatesJavaLagoResourceModel = annotatesJavaLagoResourceModel;
		annotatesJavaLagoResourceModel = newAnnotatesJavaLagoResourceModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerPSMPackage.ANN_JAVA_ALGO_RESOURCE_MODEL__ANNOTATES_JAVA_LAGO_RESOURCE_MODEL, oldAnnotatesJavaLagoResourceModel, annotatesJavaLagoResourceModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AuthorizationLayerPSMPackage.ANN_JAVA_ALGO_RESOURCE_MODEL__ANNOTATES_JAVA_LAGO_RESOURCE_MODEL:
				if (resolve) return getAnnotatesJavaLagoResourceModel();
				return basicGetAnnotatesJavaLagoResourceModel();
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
			case AuthorizationLayerPSMPackage.ANN_JAVA_ALGO_RESOURCE_MODEL__ANNOTATES_JAVA_LAGO_RESOURCE_MODEL:
				setAnnotatesJavaLagoResourceModel((JavaAlgoResourceModel)newValue);
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
			case AuthorizationLayerPSMPackage.ANN_JAVA_ALGO_RESOURCE_MODEL__ANNOTATES_JAVA_LAGO_RESOURCE_MODEL:
				setAnnotatesJavaLagoResourceModel((JavaAlgoResourceModel)null);
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
			case AuthorizationLayerPSMPackage.ANN_JAVA_ALGO_RESOURCE_MODEL__ANNOTATES_JAVA_LAGO_RESOURCE_MODEL:
				return annotatesJavaLagoResourceModel != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnJavaAlgoResourceModelImpl
