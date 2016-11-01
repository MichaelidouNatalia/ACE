/**
 */
package AuthorizationLayerCIM.impl;

import AuthorizationLayerCIM.AnnProperty;
import AuthorizationLayerCIM.AnnResource;
import AuthorizationLayerCIM.Attribute;
import AuthorizationLayerCIM.AttributeCategory;
import AuthorizationLayerCIM.AuthorizationLayerCIMPackage;
import AuthorizationLayerCIM.NewProperty;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerCIM.impl.AttributeImpl#getAttributeCategory <em>Attribute Category</em>}</li>
 *   <li>{@link AuthorizationLayerCIM.impl.AttributeImpl#getIsAttributeExistingProperty <em>Is Attribute Existing Property</em>}</li>
 *   <li>{@link AuthorizationLayerCIM.impl.AttributeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link AuthorizationLayerCIM.impl.AttributeImpl#getIsAttributeNewProperty <em>Is Attribute New Property</em>}</li>
 *   <li>{@link AuthorizationLayerCIM.impl.AttributeImpl#getIsAttributeResource <em>Is Attribute Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute {
	/**
	 * The default value of the '{@link #getAttributeCategory() <em>Attribute Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeCategory()
	 * @generated
	 * @ordered
	 */
	protected static final AttributeCategory ATTRIBUTE_CATEGORY_EDEFAULT = AttributeCategory.ACCESS_SUBJECT;

	/**
	 * The cached value of the '{@link #getAttributeCategory() <em>Attribute Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeCategory()
	 * @generated
	 * @ordered
	 */
	protected AttributeCategory attributeCategory = ATTRIBUTE_CATEGORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIsAttributeExistingProperty() <em>Is Attribute Existing Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAttributeExistingProperty()
	 * @generated
	 * @ordered
	 */
	protected AnnProperty isAttributeExistingProperty;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<String> value;

	/**
	 * The cached value of the '{@link #getIsAttributeNewProperty() <em>Is Attribute New Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAttributeNewProperty()
	 * @generated
	 * @ordered
	 */
	protected NewProperty isAttributeNewProperty;

	/**
	 * The cached value of the '{@link #getIsAttributeResource() <em>Is Attribute Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAttributeResource()
	 * @generated
	 * @ordered
	 */
	protected AnnResource isAttributeResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AuthorizationLayerCIMPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeCategory getAttributeCategory() {
		return attributeCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeCategory(AttributeCategory newAttributeCategory) {
		AttributeCategory oldAttributeCategory = attributeCategory;
		attributeCategory = newAttributeCategory == null ? ATTRIBUTE_CATEGORY_EDEFAULT : newAttributeCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerCIMPackage.ATTRIBUTE__ATTRIBUTE_CATEGORY, oldAttributeCategory, attributeCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnProperty getIsAttributeExistingProperty() {
		if (isAttributeExistingProperty != null && isAttributeExistingProperty.eIsProxy()) {
			InternalEObject oldIsAttributeExistingProperty = (InternalEObject)isAttributeExistingProperty;
			isAttributeExistingProperty = (AnnProperty)eResolveProxy(oldIsAttributeExistingProperty);
			if (isAttributeExistingProperty != oldIsAttributeExistingProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AuthorizationLayerCIMPackage.ATTRIBUTE__IS_ATTRIBUTE_EXISTING_PROPERTY, oldIsAttributeExistingProperty, isAttributeExistingProperty));
			}
		}
		return isAttributeExistingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnProperty basicGetIsAttributeExistingProperty() {
		return isAttributeExistingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAttributeExistingProperty(AnnProperty newIsAttributeExistingProperty) {
		AnnProperty oldIsAttributeExistingProperty = isAttributeExistingProperty;
		isAttributeExistingProperty = newIsAttributeExistingProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerCIMPackage.ATTRIBUTE__IS_ATTRIBUTE_EXISTING_PROPERTY, oldIsAttributeExistingProperty, isAttributeExistingProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getValue() {
		if (value == null) {
			value = new EDataTypeEList<String>(String.class, this, AuthorizationLayerCIMPackage.ATTRIBUTE__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewProperty getIsAttributeNewProperty() {
		if (isAttributeNewProperty != null && isAttributeNewProperty.eIsProxy()) {
			InternalEObject oldIsAttributeNewProperty = (InternalEObject)isAttributeNewProperty;
			isAttributeNewProperty = (NewProperty)eResolveProxy(oldIsAttributeNewProperty);
			if (isAttributeNewProperty != oldIsAttributeNewProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AuthorizationLayerCIMPackage.ATTRIBUTE__IS_ATTRIBUTE_NEW_PROPERTY, oldIsAttributeNewProperty, isAttributeNewProperty));
			}
		}
		return isAttributeNewProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewProperty basicGetIsAttributeNewProperty() {
		return isAttributeNewProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAttributeNewProperty(NewProperty newIsAttributeNewProperty) {
		NewProperty oldIsAttributeNewProperty = isAttributeNewProperty;
		isAttributeNewProperty = newIsAttributeNewProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerCIMPackage.ATTRIBUTE__IS_ATTRIBUTE_NEW_PROPERTY, oldIsAttributeNewProperty, isAttributeNewProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnResource getIsAttributeResource() {
		if (isAttributeResource != null && isAttributeResource.eIsProxy()) {
			InternalEObject oldIsAttributeResource = (InternalEObject)isAttributeResource;
			isAttributeResource = (AnnResource)eResolveProxy(oldIsAttributeResource);
			if (isAttributeResource != oldIsAttributeResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AuthorizationLayerCIMPackage.ATTRIBUTE__IS_ATTRIBUTE_RESOURCE, oldIsAttributeResource, isAttributeResource));
			}
		}
		return isAttributeResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnResource basicGetIsAttributeResource() {
		return isAttributeResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAttributeResource(AnnResource newIsAttributeResource) {
		AnnResource oldIsAttributeResource = isAttributeResource;
		isAttributeResource = newIsAttributeResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerCIMPackage.ATTRIBUTE__IS_ATTRIBUTE_RESOURCE, oldIsAttributeResource, isAttributeResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AuthorizationLayerCIMPackage.ATTRIBUTE__ATTRIBUTE_CATEGORY:
				return getAttributeCategory();
			case AuthorizationLayerCIMPackage.ATTRIBUTE__IS_ATTRIBUTE_EXISTING_PROPERTY:
				if (resolve) return getIsAttributeExistingProperty();
				return basicGetIsAttributeExistingProperty();
			case AuthorizationLayerCIMPackage.ATTRIBUTE__VALUE:
				return getValue();
			case AuthorizationLayerCIMPackage.ATTRIBUTE__IS_ATTRIBUTE_NEW_PROPERTY:
				if (resolve) return getIsAttributeNewProperty();
				return basicGetIsAttributeNewProperty();
			case AuthorizationLayerCIMPackage.ATTRIBUTE__IS_ATTRIBUTE_RESOURCE:
				if (resolve) return getIsAttributeResource();
				return basicGetIsAttributeResource();
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
			case AuthorizationLayerCIMPackage.ATTRIBUTE__ATTRIBUTE_CATEGORY:
				setAttributeCategory((AttributeCategory)newValue);
				return;
			case AuthorizationLayerCIMPackage.ATTRIBUTE__IS_ATTRIBUTE_EXISTING_PROPERTY:
				setIsAttributeExistingProperty((AnnProperty)newValue);
				return;
			case AuthorizationLayerCIMPackage.ATTRIBUTE__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends String>)newValue);
				return;
			case AuthorizationLayerCIMPackage.ATTRIBUTE__IS_ATTRIBUTE_NEW_PROPERTY:
				setIsAttributeNewProperty((NewProperty)newValue);
				return;
			case AuthorizationLayerCIMPackage.ATTRIBUTE__IS_ATTRIBUTE_RESOURCE:
				setIsAttributeResource((AnnResource)newValue);
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
			case AuthorizationLayerCIMPackage.ATTRIBUTE__ATTRIBUTE_CATEGORY:
				setAttributeCategory(ATTRIBUTE_CATEGORY_EDEFAULT);
				return;
			case AuthorizationLayerCIMPackage.ATTRIBUTE__IS_ATTRIBUTE_EXISTING_PROPERTY:
				setIsAttributeExistingProperty((AnnProperty)null);
				return;
			case AuthorizationLayerCIMPackage.ATTRIBUTE__VALUE:
				getValue().clear();
				return;
			case AuthorizationLayerCIMPackage.ATTRIBUTE__IS_ATTRIBUTE_NEW_PROPERTY:
				setIsAttributeNewProperty((NewProperty)null);
				return;
			case AuthorizationLayerCIMPackage.ATTRIBUTE__IS_ATTRIBUTE_RESOURCE:
				setIsAttributeResource((AnnResource)null);
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
			case AuthorizationLayerCIMPackage.ATTRIBUTE__ATTRIBUTE_CATEGORY:
				return attributeCategory != ATTRIBUTE_CATEGORY_EDEFAULT;
			case AuthorizationLayerCIMPackage.ATTRIBUTE__IS_ATTRIBUTE_EXISTING_PROPERTY:
				return isAttributeExistingProperty != null;
			case AuthorizationLayerCIMPackage.ATTRIBUTE__VALUE:
				return value != null && !value.isEmpty();
			case AuthorizationLayerCIMPackage.ATTRIBUTE__IS_ATTRIBUTE_NEW_PROPERTY:
				return isAttributeNewProperty != null;
			case AuthorizationLayerCIMPackage.ATTRIBUTE__IS_ATTRIBUTE_RESOURCE:
				return isAttributeResource != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (attributeCategory: ");
		result.append(attributeCategory);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl
