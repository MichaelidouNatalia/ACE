/**
 */
package SearchLayerCIM.impl;

import SearchLayerCIM.AnnProperty;
import SearchLayerCIM.SearchLayerCIMPackage;
import SearchLayerCIM.SearchableProperty;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Searchable Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SearchLayerCIM.impl.SearchablePropertyImpl#getPropertyIsSearchable <em>Property Is Searchable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SearchablePropertyImpl extends AnnotationImpl implements SearchableProperty {
	/**
	 * The cached value of the '{@link #getPropertyIsSearchable() <em>Property Is Searchable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyIsSearchable()
	 * @generated
	 * @ordered
	 */
	protected AnnProperty propertyIsSearchable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchablePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SearchLayerCIMPackage.Literals.SEARCHABLE_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnProperty getPropertyIsSearchable() {
		if (propertyIsSearchable != null && propertyIsSearchable.eIsProxy()) {
			InternalEObject oldPropertyIsSearchable = (InternalEObject)propertyIsSearchable;
			propertyIsSearchable = (AnnProperty)eResolveProxy(oldPropertyIsSearchable);
			if (propertyIsSearchable != oldPropertyIsSearchable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SearchLayerCIMPackage.SEARCHABLE_PROPERTY__PROPERTY_IS_SEARCHABLE, oldPropertyIsSearchable, propertyIsSearchable));
			}
		}
		return propertyIsSearchable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnProperty basicGetPropertyIsSearchable() {
		return propertyIsSearchable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyIsSearchable(AnnProperty newPropertyIsSearchable) {
		AnnProperty oldPropertyIsSearchable = propertyIsSearchable;
		propertyIsSearchable = newPropertyIsSearchable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SearchLayerCIMPackage.SEARCHABLE_PROPERTY__PROPERTY_IS_SEARCHABLE, oldPropertyIsSearchable, propertyIsSearchable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SearchLayerCIMPackage.SEARCHABLE_PROPERTY__PROPERTY_IS_SEARCHABLE:
				if (resolve) return getPropertyIsSearchable();
				return basicGetPropertyIsSearchable();
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
			case SearchLayerCIMPackage.SEARCHABLE_PROPERTY__PROPERTY_IS_SEARCHABLE:
				setPropertyIsSearchable((AnnProperty)newValue);
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
			case SearchLayerCIMPackage.SEARCHABLE_PROPERTY__PROPERTY_IS_SEARCHABLE:
				setPropertyIsSearchable((AnnProperty)null);
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
			case SearchLayerCIMPackage.SEARCHABLE_PROPERTY__PROPERTY_IS_SEARCHABLE:
				return propertyIsSearchable != null;
		}
		return super.eIsSet(featureID);
	}

} //SearchablePropertyImpl
