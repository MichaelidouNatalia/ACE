/**
 */
package AuthorizationLayerPSM.impl;

import AuthorizationLayerPSM.AnnPSMComponentProperty;
import AuthorizationLayerPSM.Attribute;
import AuthorizationLayerPSM.AttributeCategory;
import AuthorizationLayerPSM.AuthorizationLayerPSMPackage;
import AuthorizationLayerPSM.NewProperty;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerPSM.impl.AttributeImpl#getAttributeCategory <em>Attribute Category</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.impl.AttributeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.impl.AttributeImpl#getIsAttributeExistingProperty <em>Is Attribute Existing Property</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.impl.AttributeImpl#getIsAttributeNewProperty <em>Is Attribute New Property</em>}</li>
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
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EList<String> value;

	/**
	 * The cached value of the '{@link #getIsAttributeExistingProperty() <em>Is Attribute Existing Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAttributeExistingProperty()
	 * @generated
	 * @ordered
	 */
	protected AnnPSMComponentProperty isAttributeExistingProperty;

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
		return AuthorizationLayerPSMPackage.Literals.ATTRIBUTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerPSMPackage.ATTRIBUTE__ATTRIBUTE_CATEGORY, oldAttributeCategory, attributeCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getValue() {
		if (value == null) {
			value = new EDataTypeUniqueEList<String>(String.class, this, AuthorizationLayerPSMPackage.ATTRIBUTE__VALUE);
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnPSMComponentProperty getIsAttributeExistingProperty() {
		if (isAttributeExistingProperty != null && isAttributeExistingProperty.eIsProxy()) {
			InternalEObject oldIsAttributeExistingProperty = (InternalEObject)isAttributeExistingProperty;
			isAttributeExistingProperty = (AnnPSMComponentProperty)eResolveProxy(oldIsAttributeExistingProperty);
			if (isAttributeExistingProperty != oldIsAttributeExistingProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AuthorizationLayerPSMPackage.ATTRIBUTE__IS_ATTRIBUTE_EXISTING_PROPERTY, oldIsAttributeExistingProperty, isAttributeExistingProperty));
			}
		}
		return isAttributeExistingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnPSMComponentProperty basicGetIsAttributeExistingProperty() {
		return isAttributeExistingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAttributeExistingProperty(AnnPSMComponentProperty newIsAttributeExistingProperty) {
		AnnPSMComponentProperty oldIsAttributeExistingProperty = isAttributeExistingProperty;
		isAttributeExistingProperty = newIsAttributeExistingProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerPSMPackage.ATTRIBUTE__IS_ATTRIBUTE_EXISTING_PROPERTY, oldIsAttributeExistingProperty, isAttributeExistingProperty));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AuthorizationLayerPSMPackage.ATTRIBUTE__IS_ATTRIBUTE_NEW_PROPERTY, oldIsAttributeNewProperty, isAttributeNewProperty));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerPSMPackage.ATTRIBUTE__IS_ATTRIBUTE_NEW_PROPERTY, oldIsAttributeNewProperty, isAttributeNewProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AuthorizationLayerPSMPackage.ATTRIBUTE__ATTRIBUTE_CATEGORY:
				return getAttributeCategory();
			case AuthorizationLayerPSMPackage.ATTRIBUTE__VALUE:
				return getValue();
			case AuthorizationLayerPSMPackage.ATTRIBUTE__IS_ATTRIBUTE_EXISTING_PROPERTY:
				if (resolve) return getIsAttributeExistingProperty();
				return basicGetIsAttributeExistingProperty();
			case AuthorizationLayerPSMPackage.ATTRIBUTE__IS_ATTRIBUTE_NEW_PROPERTY:
				if (resolve) return getIsAttributeNewProperty();
				return basicGetIsAttributeNewProperty();
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
			case AuthorizationLayerPSMPackage.ATTRIBUTE__ATTRIBUTE_CATEGORY:
				setAttributeCategory((AttributeCategory)newValue);
				return;
			case AuthorizationLayerPSMPackage.ATTRIBUTE__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends String>)newValue);
				return;
			case AuthorizationLayerPSMPackage.ATTRIBUTE__IS_ATTRIBUTE_EXISTING_PROPERTY:
				setIsAttributeExistingProperty((AnnPSMComponentProperty)newValue);
				return;
			case AuthorizationLayerPSMPackage.ATTRIBUTE__IS_ATTRIBUTE_NEW_PROPERTY:
				setIsAttributeNewProperty((NewProperty)newValue);
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
			case AuthorizationLayerPSMPackage.ATTRIBUTE__ATTRIBUTE_CATEGORY:
				setAttributeCategory(ATTRIBUTE_CATEGORY_EDEFAULT);
				return;
			case AuthorizationLayerPSMPackage.ATTRIBUTE__VALUE:
				getValue().clear();
				return;
			case AuthorizationLayerPSMPackage.ATTRIBUTE__IS_ATTRIBUTE_EXISTING_PROPERTY:
				setIsAttributeExistingProperty((AnnPSMComponentProperty)null);
				return;
			case AuthorizationLayerPSMPackage.ATTRIBUTE__IS_ATTRIBUTE_NEW_PROPERTY:
				setIsAttributeNewProperty((NewProperty)null);
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
			case AuthorizationLayerPSMPackage.ATTRIBUTE__ATTRIBUTE_CATEGORY:
				return attributeCategory != ATTRIBUTE_CATEGORY_EDEFAULT;
			case AuthorizationLayerPSMPackage.ATTRIBUTE__VALUE:
				return value != null && !value.isEmpty();
			case AuthorizationLayerPSMPackage.ATTRIBUTE__IS_ATTRIBUTE_EXISTING_PROPERTY:
				return isAttributeExistingProperty != null;
			case AuthorizationLayerPSMPackage.ATTRIBUTE__IS_ATTRIBUTE_NEW_PROPERTY:
				return isAttributeNewProperty != null;
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
