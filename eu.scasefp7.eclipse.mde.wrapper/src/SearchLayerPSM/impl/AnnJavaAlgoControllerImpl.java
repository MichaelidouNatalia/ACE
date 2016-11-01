/**
 */
package SearchLayerPSM.impl;

import RESTfulServicePSM.JavaAlgoResourceController;

import SearchLayerPSM.AnnJavaAlgoController;
import SearchLayerPSM.SearchLayerPSMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ann Java Algo Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SearchLayerPSM.impl.AnnJavaAlgoControllerImpl#getAnnotatesJavaAlgoController <em>Annotates Java Algo Controller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnJavaAlgoControllerImpl extends AnnotatedElementImpl implements AnnJavaAlgoController {
	/**
	 * The cached value of the '{@link #getAnnotatesJavaAlgoController() <em>Annotates Java Algo Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatesJavaAlgoController()
	 * @generated
	 * @ordered
	 */
	protected JavaAlgoResourceController annotatesJavaAlgoController;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnJavaAlgoControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SearchLayerPSMPackage.Literals.ANN_JAVA_ALGO_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaAlgoResourceController getAnnotatesJavaAlgoController() {
		if (annotatesJavaAlgoController != null && annotatesJavaAlgoController.eIsProxy()) {
			InternalEObject oldAnnotatesJavaAlgoController = (InternalEObject)annotatesJavaAlgoController;
			annotatesJavaAlgoController = (JavaAlgoResourceController)eResolveProxy(oldAnnotatesJavaAlgoController);
			if (annotatesJavaAlgoController != oldAnnotatesJavaAlgoController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SearchLayerPSMPackage.ANN_JAVA_ALGO_CONTROLLER__ANNOTATES_JAVA_ALGO_CONTROLLER, oldAnnotatesJavaAlgoController, annotatesJavaAlgoController));
			}
		}
		return annotatesJavaAlgoController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaAlgoResourceController basicGetAnnotatesJavaAlgoController() {
		return annotatesJavaAlgoController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotatesJavaAlgoController(JavaAlgoResourceController newAnnotatesJavaAlgoController) {
		JavaAlgoResourceController oldAnnotatesJavaAlgoController = annotatesJavaAlgoController;
		annotatesJavaAlgoController = newAnnotatesJavaAlgoController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SearchLayerPSMPackage.ANN_JAVA_ALGO_CONTROLLER__ANNOTATES_JAVA_ALGO_CONTROLLER, oldAnnotatesJavaAlgoController, annotatesJavaAlgoController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SearchLayerPSMPackage.ANN_JAVA_ALGO_CONTROLLER__ANNOTATES_JAVA_ALGO_CONTROLLER:
				if (resolve) return getAnnotatesJavaAlgoController();
				return basicGetAnnotatesJavaAlgoController();
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
			case SearchLayerPSMPackage.ANN_JAVA_ALGO_CONTROLLER__ANNOTATES_JAVA_ALGO_CONTROLLER:
				setAnnotatesJavaAlgoController((JavaAlgoResourceController)newValue);
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
			case SearchLayerPSMPackage.ANN_JAVA_ALGO_CONTROLLER__ANNOTATES_JAVA_ALGO_CONTROLLER:
				setAnnotatesJavaAlgoController((JavaAlgoResourceController)null);
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
			case SearchLayerPSMPackage.ANN_JAVA_ALGO_CONTROLLER__ANNOTATES_JAVA_ALGO_CONTROLLER:
				return annotatesJavaAlgoController != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnJavaAlgoControllerImpl
