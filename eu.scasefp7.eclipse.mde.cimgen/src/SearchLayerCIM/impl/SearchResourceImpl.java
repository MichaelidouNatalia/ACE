/**
 */
package SearchLayerCIM.impl;

import SearchLayerCIM.AnnAlgoResource;
import SearchLayerCIM.SearchLayerCIMPackage;
import SearchLayerCIM.SearchResource;
import SearchLayerCIM.SearchableResource;

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
 * An implementation of the model object '<em><b>Search Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SearchLayerCIM.impl.SearchResourceImpl#getAlgoResourceIsSearchResource <em>Algo Resource Is Search Resource</em>}</li>
 *   <li>{@link SearchLayerCIM.impl.SearchResourceImpl#getSearchesResource <em>Searches Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SearchResourceImpl extends AnnotationImpl implements SearchResource {
	/**
	 * The cached value of the '{@link #getAlgoResourceIsSearchResource() <em>Algo Resource Is Search Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgoResourceIsSearchResource()
	 * @generated
	 * @ordered
	 */
	protected AnnAlgoResource algoResourceIsSearchResource;

	/**
	 * The cached value of the '{@link #getSearchesResource() <em>Searches Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchesResource()
	 * @generated
	 * @ordered
	 */
	protected EList<SearchableResource> searchesResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SearchLayerCIMPackage.Literals.SEARCH_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnAlgoResource getAlgoResourceIsSearchResource() {
		if (algoResourceIsSearchResource != null && algoResourceIsSearchResource.eIsProxy()) {
			InternalEObject oldAlgoResourceIsSearchResource = (InternalEObject)algoResourceIsSearchResource;
			algoResourceIsSearchResource = (AnnAlgoResource)eResolveProxy(oldAlgoResourceIsSearchResource);
			if (algoResourceIsSearchResource != oldAlgoResourceIsSearchResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SearchLayerCIMPackage.SEARCH_RESOURCE__ALGO_RESOURCE_IS_SEARCH_RESOURCE, oldAlgoResourceIsSearchResource, algoResourceIsSearchResource));
			}
		}
		return algoResourceIsSearchResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnAlgoResource basicGetAlgoResourceIsSearchResource() {
		return algoResourceIsSearchResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgoResourceIsSearchResource(AnnAlgoResource newAlgoResourceIsSearchResource) {
		AnnAlgoResource oldAlgoResourceIsSearchResource = algoResourceIsSearchResource;
		algoResourceIsSearchResource = newAlgoResourceIsSearchResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SearchLayerCIMPackage.SEARCH_RESOURCE__ALGO_RESOURCE_IS_SEARCH_RESOURCE, oldAlgoResourceIsSearchResource, algoResourceIsSearchResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SearchableResource> getSearchesResource() {
		if (searchesResource == null) {
			searchesResource = new EObjectContainmentEList<SearchableResource>(SearchableResource.class, this, SearchLayerCIMPackage.SEARCH_RESOURCE__SEARCHES_RESOURCE);
		}
		return searchesResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SearchLayerCIMPackage.SEARCH_RESOURCE__SEARCHES_RESOURCE:
				return ((InternalEList<?>)getSearchesResource()).basicRemove(otherEnd, msgs);
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
			case SearchLayerCIMPackage.SEARCH_RESOURCE__ALGO_RESOURCE_IS_SEARCH_RESOURCE:
				if (resolve) return getAlgoResourceIsSearchResource();
				return basicGetAlgoResourceIsSearchResource();
			case SearchLayerCIMPackage.SEARCH_RESOURCE__SEARCHES_RESOURCE:
				return getSearchesResource();
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
			case SearchLayerCIMPackage.SEARCH_RESOURCE__ALGO_RESOURCE_IS_SEARCH_RESOURCE:
				setAlgoResourceIsSearchResource((AnnAlgoResource)newValue);
				return;
			case SearchLayerCIMPackage.SEARCH_RESOURCE__SEARCHES_RESOURCE:
				getSearchesResource().clear();
				getSearchesResource().addAll((Collection<? extends SearchableResource>)newValue);
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
			case SearchLayerCIMPackage.SEARCH_RESOURCE__ALGO_RESOURCE_IS_SEARCH_RESOURCE:
				setAlgoResourceIsSearchResource((AnnAlgoResource)null);
				return;
			case SearchLayerCIMPackage.SEARCH_RESOURCE__SEARCHES_RESOURCE:
				getSearchesResource().clear();
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
			case SearchLayerCIMPackage.SEARCH_RESOURCE__ALGO_RESOURCE_IS_SEARCH_RESOURCE:
				return algoResourceIsSearchResource != null;
			case SearchLayerCIMPackage.SEARCH_RESOURCE__SEARCHES_RESOURCE:
				return searchesResource != null && !searchesResource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SearchResourceImpl
