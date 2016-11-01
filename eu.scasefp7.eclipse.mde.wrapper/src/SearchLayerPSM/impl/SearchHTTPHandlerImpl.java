/**
 */
package SearchLayerPSM.impl;

import SearchLayerPSM.AnnHTTPActivityHandler;
import SearchLayerPSM.SearchHTTPHandler;
import SearchLayerPSM.SearchLayerPSMPackage;
import SearchLayerPSM.SearchableJavaResourceModel;

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
 * An implementation of the model object '<em><b>Search HTTP Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SearchLayerPSM.impl.SearchHTTPHandlerImpl#getIsHTTPActivityHandler <em>Is HTTP Activity Handler</em>}</li>
 *   <li>{@link SearchLayerPSM.impl.SearchHTTPHandlerImpl#getSearchesJavaResourceModel <em>Searches Java Resource Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SearchHTTPHandlerImpl extends AnnotationImpl implements SearchHTTPHandler {
	/**
	 * The cached value of the '{@link #getIsHTTPActivityHandler() <em>Is HTTP Activity Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsHTTPActivityHandler()
	 * @generated
	 * @ordered
	 */
	protected AnnHTTPActivityHandler isHTTPActivityHandler;

	/**
	 * The cached value of the '{@link #getSearchesJavaResourceModel() <em>Searches Java Resource Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchesJavaResourceModel()
	 * @generated
	 * @ordered
	 */
	protected EList<SearchableJavaResourceModel> searchesJavaResourceModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchHTTPHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SearchLayerPSMPackage.Literals.SEARCH_HTTP_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnHTTPActivityHandler getIsHTTPActivityHandler() {
		if (isHTTPActivityHandler != null && isHTTPActivityHandler.eIsProxy()) {
			InternalEObject oldIsHTTPActivityHandler = (InternalEObject)isHTTPActivityHandler;
			isHTTPActivityHandler = (AnnHTTPActivityHandler)eResolveProxy(oldIsHTTPActivityHandler);
			if (isHTTPActivityHandler != oldIsHTTPActivityHandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SearchLayerPSMPackage.SEARCH_HTTP_HANDLER__IS_HTTP_ACTIVITY_HANDLER, oldIsHTTPActivityHandler, isHTTPActivityHandler));
			}
		}
		return isHTTPActivityHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnHTTPActivityHandler basicGetIsHTTPActivityHandler() {
		return isHTTPActivityHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsHTTPActivityHandler(AnnHTTPActivityHandler newIsHTTPActivityHandler) {
		AnnHTTPActivityHandler oldIsHTTPActivityHandler = isHTTPActivityHandler;
		isHTTPActivityHandler = newIsHTTPActivityHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SearchLayerPSMPackage.SEARCH_HTTP_HANDLER__IS_HTTP_ACTIVITY_HANDLER, oldIsHTTPActivityHandler, isHTTPActivityHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SearchableJavaResourceModel> getSearchesJavaResourceModel() {
		if (searchesJavaResourceModel == null) {
			searchesJavaResourceModel = new EObjectContainmentEList<SearchableJavaResourceModel>(SearchableJavaResourceModel.class, this, SearchLayerPSMPackage.SEARCH_HTTP_HANDLER__SEARCHES_JAVA_RESOURCE_MODEL);
		}
		return searchesJavaResourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SearchLayerPSMPackage.SEARCH_HTTP_HANDLER__SEARCHES_JAVA_RESOURCE_MODEL:
				return ((InternalEList<?>)getSearchesJavaResourceModel()).basicRemove(otherEnd, msgs);
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
			case SearchLayerPSMPackage.SEARCH_HTTP_HANDLER__IS_HTTP_ACTIVITY_HANDLER:
				if (resolve) return getIsHTTPActivityHandler();
				return basicGetIsHTTPActivityHandler();
			case SearchLayerPSMPackage.SEARCH_HTTP_HANDLER__SEARCHES_JAVA_RESOURCE_MODEL:
				return getSearchesJavaResourceModel();
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
			case SearchLayerPSMPackage.SEARCH_HTTP_HANDLER__IS_HTTP_ACTIVITY_HANDLER:
				setIsHTTPActivityHandler((AnnHTTPActivityHandler)newValue);
				return;
			case SearchLayerPSMPackage.SEARCH_HTTP_HANDLER__SEARCHES_JAVA_RESOURCE_MODEL:
				getSearchesJavaResourceModel().clear();
				getSearchesJavaResourceModel().addAll((Collection<? extends SearchableJavaResourceModel>)newValue);
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
			case SearchLayerPSMPackage.SEARCH_HTTP_HANDLER__IS_HTTP_ACTIVITY_HANDLER:
				setIsHTTPActivityHandler((AnnHTTPActivityHandler)null);
				return;
			case SearchLayerPSMPackage.SEARCH_HTTP_HANDLER__SEARCHES_JAVA_RESOURCE_MODEL:
				getSearchesJavaResourceModel().clear();
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
			case SearchLayerPSMPackage.SEARCH_HTTP_HANDLER__IS_HTTP_ACTIVITY_HANDLER:
				return isHTTPActivityHandler != null;
			case SearchLayerPSMPackage.SEARCH_HTTP_HANDLER__SEARCHES_JAVA_RESOURCE_MODEL:
				return searchesJavaResourceModel != null && !searchesJavaResourceModel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SearchHTTPHandlerImpl
