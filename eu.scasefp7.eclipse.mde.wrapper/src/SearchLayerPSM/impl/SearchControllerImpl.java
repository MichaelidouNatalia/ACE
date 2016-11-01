/**
 */
package SearchLayerPSM.impl;

import SearchLayerPSM.AnnJavaAlgoController;
import SearchLayerPSM.SearchController;
import SearchLayerPSM.SearchLayerPSMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Search Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SearchLayerPSM.impl.SearchControllerImpl#getIsSearchController <em>Is Search Controller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SearchControllerImpl extends AnnotationImpl implements SearchController {
	/**
	 * The cached value of the '{@link #getIsSearchController() <em>Is Search Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSearchController()
	 * @generated
	 * @ordered
	 */
	protected AnnJavaAlgoController isSearchController;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SearchLayerPSMPackage.Literals.SEARCH_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnJavaAlgoController getIsSearchController() {
		if (isSearchController != null && isSearchController.eIsProxy()) {
			InternalEObject oldIsSearchController = (InternalEObject)isSearchController;
			isSearchController = (AnnJavaAlgoController)eResolveProxy(oldIsSearchController);
			if (isSearchController != oldIsSearchController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SearchLayerPSMPackage.SEARCH_CONTROLLER__IS_SEARCH_CONTROLLER, oldIsSearchController, isSearchController));
			}
		}
		return isSearchController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnJavaAlgoController basicGetIsSearchController() {
		return isSearchController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSearchController(AnnJavaAlgoController newIsSearchController) {
		AnnJavaAlgoController oldIsSearchController = isSearchController;
		isSearchController = newIsSearchController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SearchLayerPSMPackage.SEARCH_CONTROLLER__IS_SEARCH_CONTROLLER, oldIsSearchController, isSearchController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SearchLayerPSMPackage.SEARCH_CONTROLLER__IS_SEARCH_CONTROLLER:
				if (resolve) return getIsSearchController();
				return basicGetIsSearchController();
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
			case SearchLayerPSMPackage.SEARCH_CONTROLLER__IS_SEARCH_CONTROLLER:
				setIsSearchController((AnnJavaAlgoController)newValue);
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
			case SearchLayerPSMPackage.SEARCH_CONTROLLER__IS_SEARCH_CONTROLLER:
				setIsSearchController((AnnJavaAlgoController)null);
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
			case SearchLayerPSMPackage.SEARCH_CONTROLLER__IS_SEARCH_CONTROLLER:
				return isSearchController != null;
		}
		return super.eIsSet(featureID);
	}

} //SearchControllerImpl
