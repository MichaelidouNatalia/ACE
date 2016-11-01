/**
 */
package ExternalServiceLayerCIM.impl;

import ExternalServiceLayerCIM.ComplexType;
import ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage;
import ExternalServiceLayerCIM.ModelProperty;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ExternalServiceLayerCIM.impl.ModelPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link ExternalServiceLayerCIM.impl.ModelPropertyImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link ExternalServiceLayerCIM.impl.ModelPropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link ExternalServiceLayerCIM.impl.ModelPropertyImpl#isHasPrimitiveType <em>Has Primitive Type</em>}</li>
 *   <li>{@link ExternalServiceLayerCIM.impl.ModelPropertyImpl#getHasComplexType <em>Has Complex Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelPropertyImpl extends MinimalEObjectImpl.Container implements ModelProperty {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasPrimitiveType() <em>Has Primitive Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasPrimitiveType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_PRIMITIVE_TYPE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasPrimitiveType() <em>Has Primitive Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasPrimitiveType()
	 * @generated
	 * @ordered
	 */
	protected boolean hasPrimitiveType = HAS_PRIMITIVE_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasComplexType() <em>Has Complex Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasComplexType()
	 * @generated
	 * @ordered
	 */
	protected ComplexType hasComplexType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExternalServiceLayerCIMPackage.Literals.MODEL_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerCIMPackage.MODEL_PROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUnique() {
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(boolean newIsUnique) {
		boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerCIMPackage.MODEL_PROPERTY__IS_UNIQUE, oldIsUnique, isUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerCIMPackage.MODEL_PROPERTY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasPrimitiveType() {
		return hasPrimitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasPrimitiveType(boolean newHasPrimitiveType) {
		boolean oldHasPrimitiveType = hasPrimitiveType;
		hasPrimitiveType = newHasPrimitiveType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerCIMPackage.MODEL_PROPERTY__HAS_PRIMITIVE_TYPE, oldHasPrimitiveType, hasPrimitiveType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexType getHasComplexType() {
		if (hasComplexType != null && hasComplexType.eIsProxy()) {
			InternalEObject oldHasComplexType = (InternalEObject)hasComplexType;
			hasComplexType = (ComplexType)eResolveProxy(oldHasComplexType);
			if (hasComplexType != oldHasComplexType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExternalServiceLayerCIMPackage.MODEL_PROPERTY__HAS_COMPLEX_TYPE, oldHasComplexType, hasComplexType));
			}
		}
		return hasComplexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexType basicGetHasComplexType() {
		return hasComplexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasComplexType(ComplexType newHasComplexType) {
		ComplexType oldHasComplexType = hasComplexType;
		hasComplexType = newHasComplexType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerCIMPackage.MODEL_PROPERTY__HAS_COMPLEX_TYPE, oldHasComplexType, hasComplexType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExternalServiceLayerCIMPackage.MODEL_PROPERTY__NAME:
				return getName();
			case ExternalServiceLayerCIMPackage.MODEL_PROPERTY__IS_UNIQUE:
				return isIsUnique();
			case ExternalServiceLayerCIMPackage.MODEL_PROPERTY__TYPE:
				return getType();
			case ExternalServiceLayerCIMPackage.MODEL_PROPERTY__HAS_PRIMITIVE_TYPE:
				return isHasPrimitiveType();
			case ExternalServiceLayerCIMPackage.MODEL_PROPERTY__HAS_COMPLEX_TYPE:
				if (resolve) return getHasComplexType();
				return basicGetHasComplexType();
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
			case ExternalServiceLayerCIMPackage.MODEL_PROPERTY__NAME:
				setName((String)newValue);
				return;
			case ExternalServiceLayerCIMPackage.MODEL_PROPERTY__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case ExternalServiceLayerCIMPackage.MODEL_PROPERTY__TYPE:
				setType((String)newValue);
				return;
			case ExternalServiceLayerCIMPackage.MODEL_PROPERTY__HAS_PRIMITIVE_TYPE:
				setHasPrimitiveType((Boolean)newValue);
				return;
			case ExternalServiceLayerCIMPackage.MODEL_PROPERTY__HAS_COMPLEX_TYPE:
				setHasComplexType((ComplexType)newValue);
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
			case ExternalServiceLayerCIMPackage.MODEL_PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExternalServiceLayerCIMPackage.MODEL_PROPERTY__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case ExternalServiceLayerCIMPackage.MODEL_PROPERTY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ExternalServiceLayerCIMPackage.MODEL_PROPERTY__HAS_PRIMITIVE_TYPE:
				setHasPrimitiveType(HAS_PRIMITIVE_TYPE_EDEFAULT);
				return;
			case ExternalServiceLayerCIMPackage.MODEL_PROPERTY__HAS_COMPLEX_TYPE:
				setHasComplexType((ComplexType)null);
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
			case ExternalServiceLayerCIMPackage.MODEL_PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExternalServiceLayerCIMPackage.MODEL_PROPERTY__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case ExternalServiceLayerCIMPackage.MODEL_PROPERTY__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ExternalServiceLayerCIMPackage.MODEL_PROPERTY__HAS_PRIMITIVE_TYPE:
				return hasPrimitiveType != HAS_PRIMITIVE_TYPE_EDEFAULT;
			case ExternalServiceLayerCIMPackage.MODEL_PROPERTY__HAS_COMPLEX_TYPE:
				return hasComplexType != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", isUnique: ");
		result.append(isUnique);
		result.append(", type: ");
		result.append(type);
		result.append(", hasPrimitiveType: ");
		result.append(hasPrimitiveType);
		result.append(')');
		return result.toString();
	}

} //ModelPropertyImpl
