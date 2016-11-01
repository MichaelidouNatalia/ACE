/**
 */
package AuthenticationLayerPSM.impl;

import AuthenticationLayerPSM.AnnJPAController;
import AuthenticationLayerPSM.AuthenticationLayerPSMPackage;

import RESTfulServicePSM.HibernateController;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ann JPA Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AuthenticationLayerPSM.impl.AnnJPAControllerImpl#getAnnotatesJPAController <em>Annotates JPA Controller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnJPAControllerImpl extends AnnotatedElementImpl implements AnnJPAController {
	/**
	 * The cached value of the '{@link #getAnnotatesJPAController() <em>Annotates JPA Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatesJPAController()
	 * @generated
	 * @ordered
	 */
	protected HibernateController annotatesJPAController;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnJPAControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AuthenticationLayerPSMPackage.Literals.ANN_JPA_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HibernateController getAnnotatesJPAController() {
		if (annotatesJPAController != null && annotatesJPAController.eIsProxy()) {
			InternalEObject oldAnnotatesJPAController = (InternalEObject)annotatesJPAController;
			annotatesJPAController = (HibernateController)eResolveProxy(oldAnnotatesJPAController);
			if (annotatesJPAController != oldAnnotatesJPAController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AuthenticationLayerPSMPackage.ANN_JPA_CONTROLLER__ANNOTATES_JPA_CONTROLLER, oldAnnotatesJPAController, annotatesJPAController));
			}
		}
		return annotatesJPAController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HibernateController basicGetAnnotatesJPAController() {
		return annotatesJPAController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotatesJPAController(HibernateController newAnnotatesJPAController) {
		HibernateController oldAnnotatesJPAController = annotatesJPAController;
		annotatesJPAController = newAnnotatesJPAController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthenticationLayerPSMPackage.ANN_JPA_CONTROLLER__ANNOTATES_JPA_CONTROLLER, oldAnnotatesJPAController, annotatesJPAController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AuthenticationLayerPSMPackage.ANN_JPA_CONTROLLER__ANNOTATES_JPA_CONTROLLER:
				if (resolve) return getAnnotatesJPAController();
				return basicGetAnnotatesJPAController();
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
			case AuthenticationLayerPSMPackage.ANN_JPA_CONTROLLER__ANNOTATES_JPA_CONTROLLER:
				setAnnotatesJPAController((HibernateController)newValue);
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
			case AuthenticationLayerPSMPackage.ANN_JPA_CONTROLLER__ANNOTATES_JPA_CONTROLLER:
				setAnnotatesJPAController((HibernateController)null);
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
			case AuthenticationLayerPSMPackage.ANN_JPA_CONTROLLER__ANNOTATES_JPA_CONTROLLER:
				return annotatesJPAController != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnJPAControllerImpl
