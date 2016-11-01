/**
 */
package ExternalServiceLayerPSM.impl;

import ExternalServiceLayerPSM.AnnJavaAlgoModel;
import ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage;

import RESTfulServicePSM.JavaAlgoResourceModel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ann Java Algo Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ExternalServiceLayerPSM.impl.AnnJavaAlgoModelImpl#getAnnotatesJavaAlgoModel <em>Annotates Java Algo Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnJavaAlgoModelImpl extends AnnotatedElementImpl implements AnnJavaAlgoModel {
	/**
	 * The cached value of the '{@link #getAnnotatesJavaAlgoModel() <em>Annotates Java Algo Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatesJavaAlgoModel()
	 * @generated
	 * @ordered
	 */
	protected JavaAlgoResourceModel annotatesJavaAlgoModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnJavaAlgoModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExternalServiceLayerPSMPackage.Literals.ANN_JAVA_ALGO_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaAlgoResourceModel getAnnotatesJavaAlgoModel() {
		if (annotatesJavaAlgoModel != null && annotatesJavaAlgoModel.eIsProxy()) {
			InternalEObject oldAnnotatesJavaAlgoModel = (InternalEObject)annotatesJavaAlgoModel;
			annotatesJavaAlgoModel = (JavaAlgoResourceModel)eResolveProxy(oldAnnotatesJavaAlgoModel);
			if (annotatesJavaAlgoModel != oldAnnotatesJavaAlgoModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExternalServiceLayerPSMPackage.ANN_JAVA_ALGO_MODEL__ANNOTATES_JAVA_ALGO_MODEL, oldAnnotatesJavaAlgoModel, annotatesJavaAlgoModel));
			}
		}
		return annotatesJavaAlgoModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaAlgoResourceModel basicGetAnnotatesJavaAlgoModel() {
		return annotatesJavaAlgoModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotatesJavaAlgoModel(JavaAlgoResourceModel newAnnotatesJavaAlgoModel) {
		JavaAlgoResourceModel oldAnnotatesJavaAlgoModel = annotatesJavaAlgoModel;
		annotatesJavaAlgoModel = newAnnotatesJavaAlgoModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerPSMPackage.ANN_JAVA_ALGO_MODEL__ANNOTATES_JAVA_ALGO_MODEL, oldAnnotatesJavaAlgoModel, annotatesJavaAlgoModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExternalServiceLayerPSMPackage.ANN_JAVA_ALGO_MODEL__ANNOTATES_JAVA_ALGO_MODEL:
				if (resolve) return getAnnotatesJavaAlgoModel();
				return basicGetAnnotatesJavaAlgoModel();
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
			case ExternalServiceLayerPSMPackage.ANN_JAVA_ALGO_MODEL__ANNOTATES_JAVA_ALGO_MODEL:
				setAnnotatesJavaAlgoModel((JavaAlgoResourceModel)newValue);
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
			case ExternalServiceLayerPSMPackage.ANN_JAVA_ALGO_MODEL__ANNOTATES_JAVA_ALGO_MODEL:
				setAnnotatesJavaAlgoModel((JavaAlgoResourceModel)null);
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
			case ExternalServiceLayerPSMPackage.ANN_JAVA_ALGO_MODEL__ANNOTATES_JAVA_ALGO_MODEL:
				return annotatesJavaAlgoModel != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnJavaAlgoModelImpl
