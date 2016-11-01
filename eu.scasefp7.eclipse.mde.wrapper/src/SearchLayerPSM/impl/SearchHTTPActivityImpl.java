/**
 */
package SearchLayerPSM.impl;

import SearchLayerPSM.AnnHTTPActivity;
import SearchLayerPSM.SearchHTTPActivity;
import SearchLayerPSM.SearchLayerPSMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Search HTTP Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SearchLayerPSM.impl.SearchHTTPActivityImpl#getIsSearchHTTPActivity <em>Is Search HTTP Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SearchHTTPActivityImpl extends AnnotationImpl implements SearchHTTPActivity {
	/**
	 * The cached value of the '{@link #getIsSearchHTTPActivity() <em>Is Search HTTP Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSearchHTTPActivity()
	 * @generated
	 * @ordered
	 */
	protected AnnHTTPActivity isSearchHTTPActivity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchHTTPActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SearchLayerPSMPackage.Literals.SEARCH_HTTP_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnHTTPActivity getIsSearchHTTPActivity() {
		if (isSearchHTTPActivity != null && isSearchHTTPActivity.eIsProxy()) {
			InternalEObject oldIsSearchHTTPActivity = (InternalEObject)isSearchHTTPActivity;
			isSearchHTTPActivity = (AnnHTTPActivity)eResolveProxy(oldIsSearchHTTPActivity);
			if (isSearchHTTPActivity != oldIsSearchHTTPActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SearchLayerPSMPackage.SEARCH_HTTP_ACTIVITY__IS_SEARCH_HTTP_ACTIVITY, oldIsSearchHTTPActivity, isSearchHTTPActivity));
			}
		}
		return isSearchHTTPActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnHTTPActivity basicGetIsSearchHTTPActivity() {
		return isSearchHTTPActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSearchHTTPActivity(AnnHTTPActivity newIsSearchHTTPActivity) {
		AnnHTTPActivity oldIsSearchHTTPActivity = isSearchHTTPActivity;
		isSearchHTTPActivity = newIsSearchHTTPActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SearchLayerPSMPackage.SEARCH_HTTP_ACTIVITY__IS_SEARCH_HTTP_ACTIVITY, oldIsSearchHTTPActivity, isSearchHTTPActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SearchLayerPSMPackage.SEARCH_HTTP_ACTIVITY__IS_SEARCH_HTTP_ACTIVITY:
				if (resolve) return getIsSearchHTTPActivity();
				return basicGetIsSearchHTTPActivity();
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
			case SearchLayerPSMPackage.SEARCH_HTTP_ACTIVITY__IS_SEARCH_HTTP_ACTIVITY:
				setIsSearchHTTPActivity((AnnHTTPActivity)newValue);
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
			case SearchLayerPSMPackage.SEARCH_HTTP_ACTIVITY__IS_SEARCH_HTTP_ACTIVITY:
				setIsSearchHTTPActivity((AnnHTTPActivity)null);
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
			case SearchLayerPSMPackage.SEARCH_HTTP_ACTIVITY__IS_SEARCH_HTTP_ACTIVITY:
				return isSearchHTTPActivity != null;
		}
		return super.eIsSet(featureID);
	}

} //SearchHTTPActivityImpl
