/**
 */
package SearchLayerPSM.impl;

import SearchLayerPSM.AnnJavaResourceModel;
import SearchLayerPSM.SearchLayerPSMPackage;
import SearchLayerPSM.SearchableJavaResourceModel;
import SearchLayerPSM.SearchableProperty;

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
 * An implementation of the model object '<em><b>Searchable Java Resource Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SearchLayerPSM.impl.SearchableJavaResourceModelImpl#getHasSearchableProperty <em>Has Searchable Property</em>}</li>
 *   <li>{@link SearchLayerPSM.impl.SearchableJavaResourceModelImpl#getIsSearchableJavaResourceModel <em>Is Searchable Java Resource Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SearchableJavaResourceModelImpl extends AnnotationImpl implements SearchableJavaResourceModel {
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
	 * The cached value of the '{@link #getIsSearchableJavaResourceModel() <em>Is Searchable Java Resource Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSearchableJavaResourceModel()
	 * @generated
	 * @ordered
	 */
	protected AnnJavaResourceModel isSearchableJavaResourceModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SearchableJavaResourceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SearchLayerPSMPackage.Literals.SEARCHABLE_JAVA_RESOURCE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SearchableProperty> getHasSearchableProperty() {
		if (hasSearchableProperty == null) {
			hasSearchableProperty = new EObjectContainmentEList<SearchableProperty>(SearchableProperty.class, this, SearchLayerPSMPackage.SEARCHABLE_JAVA_RESOURCE_MODEL__HAS_SEARCHABLE_PROPERTY);
		}
		return hasSearchableProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnJavaResourceModel getIsSearchableJavaResourceModel() {
		if (isSearchableJavaResourceModel != null && isSearchableJavaResourceModel.eIsProxy()) {
			InternalEObject oldIsSearchableJavaResourceModel = (InternalEObject)isSearchableJavaResourceModel;
			isSearchableJavaResourceModel = (AnnJavaResourceModel)eResolveProxy(oldIsSearchableJavaResourceModel);
			if (isSearchableJavaResourceModel != oldIsSearchableJavaResourceModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SearchLayerPSMPackage.SEARCHABLE_JAVA_RESOURCE_MODEL__IS_SEARCHABLE_JAVA_RESOURCE_MODEL, oldIsSearchableJavaResourceModel, isSearchableJavaResourceModel));
			}
		}
		return isSearchableJavaResourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnJavaResourceModel basicGetIsSearchableJavaResourceModel() {
		return isSearchableJavaResourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSearchableJavaResourceModel(AnnJavaResourceModel newIsSearchableJavaResourceModel) {
		AnnJavaResourceModel oldIsSearchableJavaResourceModel = isSearchableJavaResourceModel;
		isSearchableJavaResourceModel = newIsSearchableJavaResourceModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SearchLayerPSMPackage.SEARCHABLE_JAVA_RESOURCE_MODEL__IS_SEARCHABLE_JAVA_RESOURCE_MODEL, oldIsSearchableJavaResourceModel, isSearchableJavaResourceModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SearchLayerPSMPackage.SEARCHABLE_JAVA_RESOURCE_MODEL__HAS_SEARCHABLE_PROPERTY:
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
			case SearchLayerPSMPackage.SEARCHABLE_JAVA_RESOURCE_MODEL__HAS_SEARCHABLE_PROPERTY:
				return getHasSearchableProperty();
			case SearchLayerPSMPackage.SEARCHABLE_JAVA_RESOURCE_MODEL__IS_SEARCHABLE_JAVA_RESOURCE_MODEL:
				if (resolve) return getIsSearchableJavaResourceModel();
				return basicGetIsSearchableJavaResourceModel();
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
			case SearchLayerPSMPackage.SEARCHABLE_JAVA_RESOURCE_MODEL__HAS_SEARCHABLE_PROPERTY:
				getHasSearchableProperty().clear();
				getHasSearchableProperty().addAll((Collection<? extends SearchableProperty>)newValue);
				return;
			case SearchLayerPSMPackage.SEARCHABLE_JAVA_RESOURCE_MODEL__IS_SEARCHABLE_JAVA_RESOURCE_MODEL:
				setIsSearchableJavaResourceModel((AnnJavaResourceModel)newValue);
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
			case SearchLayerPSMPackage.SEARCHABLE_JAVA_RESOURCE_MODEL__HAS_SEARCHABLE_PROPERTY:
				getHasSearchableProperty().clear();
				return;
			case SearchLayerPSMPackage.SEARCHABLE_JAVA_RESOURCE_MODEL__IS_SEARCHABLE_JAVA_RESOURCE_MODEL:
				setIsSearchableJavaResourceModel((AnnJavaResourceModel)null);
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
			case SearchLayerPSMPackage.SEARCHABLE_JAVA_RESOURCE_MODEL__HAS_SEARCHABLE_PROPERTY:
				return hasSearchableProperty != null && !hasSearchableProperty.isEmpty();
			case SearchLayerPSMPackage.SEARCHABLE_JAVA_RESOURCE_MODEL__IS_SEARCHABLE_JAVA_RESOURCE_MODEL:
				return isSearchableJavaResourceModel != null;
		}
		return super.eIsSet(featureID);
	}

} //SearchableJavaResourceModelImpl
