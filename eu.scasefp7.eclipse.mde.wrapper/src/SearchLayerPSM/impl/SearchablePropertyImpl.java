/**
 */
package SearchLayerPSM.impl;

import SearchLayerPSM.AnnPSMComponentProperty;
import SearchLayerPSM.SearchLayerPSMPackage;
import SearchLayerPSM.SearchableProperty;

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
 * </p>
 * <ul>
 *   <li>{@link SearchLayerPSM.impl.SearchablePropertyImpl#getIsSearchableProperty <em>Is Searchable Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SearchablePropertyImpl extends AnnotationImpl implements SearchableProperty {
	/**
	 * The cached value of the '{@link #getIsSearchableProperty() <em>Is Searchable Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSearchableProperty()
	 * @generated
	 * @ordered
	 */
	protected AnnPSMComponentProperty isSearchableProperty;

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
		return SearchLayerPSMPackage.Literals.SEARCHABLE_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnPSMComponentProperty getIsSearchableProperty() {
		if (isSearchableProperty != null && isSearchableProperty.eIsProxy()) {
			InternalEObject oldIsSearchableProperty = (InternalEObject)isSearchableProperty;
			isSearchableProperty = (AnnPSMComponentProperty)eResolveProxy(oldIsSearchableProperty);
			if (isSearchableProperty != oldIsSearchableProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SearchLayerPSMPackage.SEARCHABLE_PROPERTY__IS_SEARCHABLE_PROPERTY, oldIsSearchableProperty, isSearchableProperty));
			}
		}
		return isSearchableProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnPSMComponentProperty basicGetIsSearchableProperty() {
		return isSearchableProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSearchableProperty(AnnPSMComponentProperty newIsSearchableProperty) {
		AnnPSMComponentProperty oldIsSearchableProperty = isSearchableProperty;
		isSearchableProperty = newIsSearchableProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SearchLayerPSMPackage.SEARCHABLE_PROPERTY__IS_SEARCHABLE_PROPERTY, oldIsSearchableProperty, isSearchableProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SearchLayerPSMPackage.SEARCHABLE_PROPERTY__IS_SEARCHABLE_PROPERTY:
				if (resolve) return getIsSearchableProperty();
				return basicGetIsSearchableProperty();
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
			case SearchLayerPSMPackage.SEARCHABLE_PROPERTY__IS_SEARCHABLE_PROPERTY:
				setIsSearchableProperty((AnnPSMComponentProperty)newValue);
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
			case SearchLayerPSMPackage.SEARCHABLE_PROPERTY__IS_SEARCHABLE_PROPERTY:
				setIsSearchableProperty((AnnPSMComponentProperty)null);
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
			case SearchLayerPSMPackage.SEARCHABLE_PROPERTY__IS_SEARCHABLE_PROPERTY:
				return isSearchableProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //SearchablePropertyImpl
