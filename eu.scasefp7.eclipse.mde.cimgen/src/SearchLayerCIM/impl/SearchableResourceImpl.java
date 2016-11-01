/**
 */
package SearchLayerCIM.impl;

import SearchLayerCIM.AnnCRUDResource;
import SearchLayerCIM.SearchLayerCIMPackage;
import SearchLayerCIM.SearchableProperty;
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
 * An implementation of the model object '<em><b>Searchable Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SearchLayerCIM.impl.SearchableResourceImpl#getResourceIsSearchable <em>Resource Is Searchable</em>}</li>
 *   <li>{@link SearchLayerCIM.impl.SearchableResourceImpl#getHasSearchableProperty <em>Has Searchable Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SearchableResourceImpl extends AnnotationImpl implements SearchableResource {
	/**
	 * The cached value of the '{@link #getResourceIsSearchable() <em>Resource Is Searchable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceIsSearchable()
	 * @generated
	 * @ordered
	 */
	protected AnnCRUDResource resourceIsSearchable;

	/**
	 * The cached value of the '{@link #getHasSearchableProperty() <em>Has Searchable Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSearchableProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<SearchableProperty> hasSearchableProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchableResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SearchLayerCIMPackage.Literals.SEARCHABLE_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnCRUDResource getResourceIsSearchable() {
		if (resourceIsSearchable != null && resourceIsSearchable.eIsProxy()) {
			InternalEObject oldResourceIsSearchable = (InternalEObject)resourceIsSearchable;
			resourceIsSearchable = (AnnCRUDResource)eResolveProxy(oldResourceIsSearchable);
			if (resourceIsSearchable != oldResourceIsSearchable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SearchLayerCIMPackage.SEARCHABLE_RESOURCE__RESOURCE_IS_SEARCHABLE, oldResourceIsSearchable, resourceIsSearchable));
			}
		}
		return resourceIsSearchable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnCRUDResource basicGetResourceIsSearchable() {
		return resourceIsSearchable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceIsSearchable(AnnCRUDResource newResourceIsSearchable) {
		AnnCRUDResource oldResourceIsSearchable = resourceIsSearchable;
		resourceIsSearchable = newResourceIsSearchable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SearchLayerCIMPackage.SEARCHABLE_RESOURCE__RESOURCE_IS_SEARCHABLE, oldResourceIsSearchable, resourceIsSearchable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SearchableProperty> getHasSearchableProperty() {
		if (hasSearchableProperty == null) {
			hasSearchableProperty = new EObjectContainmentEList<SearchableProperty>(SearchableProperty.class, this, SearchLayerCIMPackage.SEARCHABLE_RESOURCE__HAS_SEARCHABLE_PROPERTY);
		}
		return hasSearchableProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SearchLayerCIMPackage.SEARCHABLE_RESOURCE__HAS_SEARCHABLE_PROPERTY:
				return ((InternalEList<?>)getHasSearchableProperty()).basicRemove(otherEnd, msgs);
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
			case SearchLayerCIMPackage.SEARCHABLE_RESOURCE__RESOURCE_IS_SEARCHABLE:
				if (resolve) return getResourceIsSearchable();
				return basicGetResourceIsSearchable();
			case SearchLayerCIMPackage.SEARCHABLE_RESOURCE__HAS_SEARCHABLE_PROPERTY:
				return getHasSearchableProperty();
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
			case SearchLayerCIMPackage.SEARCHABLE_RESOURCE__RESOURCE_IS_SEARCHABLE:
				setResourceIsSearchable((AnnCRUDResource)newValue);
				return;
			case SearchLayerCIMPackage.SEARCHABLE_RESOURCE__HAS_SEARCHABLE_PROPERTY:
				getHasSearchableProperty().clear();
				getHasSearchableProperty().addAll((Collection<? extends SearchableProperty>)newValue);
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
			case SearchLayerCIMPackage.SEARCHABLE_RESOURCE__RESOURCE_IS_SEARCHABLE:
				setResourceIsSearchable((AnnCRUDResource)null);
				return;
			case SearchLayerCIMPackage.SEARCHABLE_RESOURCE__HAS_SEARCHABLE_PROPERTY:
				getHasSearchableProperty().clear();
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
			case SearchLayerCIMPackage.SEARCHABLE_RESOURCE__RESOURCE_IS_SEARCHABLE:
				return resourceIsSearchable != null;
			case SearchLayerCIMPackage.SEARCHABLE_RESOURCE__HAS_SEARCHABLE_PROPERTY:
				return hasSearchableProperty != null && !hasSearchableProperty.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SearchableResourceImpl
