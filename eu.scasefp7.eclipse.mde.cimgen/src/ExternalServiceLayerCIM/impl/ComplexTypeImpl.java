/**
 */
package ExternalServiceLayerCIM.impl;

import ExternalServiceLayerCIM.ComplexType;
import ExternalServiceLayerCIM.ComplexTypeProperty;
import ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ExternalServiceLayerCIM.impl.ComplexTypeImpl#getComplexTypeName <em>Complex Type Name</em>}</li>
 *   <li>{@link ExternalServiceLayerCIM.impl.ComplexTypeImpl#getHasComplexTypeProperties <em>Has Complex Type Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplexTypeImpl extends MinimalEObjectImpl.Container implements ComplexType {
	/**
	 * The default value of the '{@link #getComplexTypeName() <em>Complex Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPLEX_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComplexTypeName() <em>Complex Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexTypeName()
	 * @generated
	 * @ordered
	 */
	protected String complexTypeName = COMPLEX_TYPE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasComplexTypeProperties() <em>Has Complex Type Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasComplexTypeProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<ComplexTypeProperty> hasComplexTypeProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExternalServiceLayerCIMPackage.Literals.COMPLEX_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComplexTypeName() {
		return complexTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplexTypeName(String newComplexTypeName) {
		String oldComplexTypeName = complexTypeName;
		complexTypeName = newComplexTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerCIMPackage.COMPLEX_TYPE__COMPLEX_TYPE_NAME, oldComplexTypeName, complexTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComplexTypeProperty> getHasComplexTypeProperties() {
		if (hasComplexTypeProperties == null) {
			hasComplexTypeProperties = new EObjectContainmentEList<ComplexTypeProperty>(ComplexTypeProperty.class, this, ExternalServiceLayerCIMPackage.COMPLEX_TYPE__HAS_COMPLEX_TYPE_PROPERTIES);
		}
		return hasComplexTypeProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExternalServiceLayerCIMPackage.COMPLEX_TYPE__HAS_COMPLEX_TYPE_PROPERTIES:
				return ((InternalEList<?>)getHasComplexTypeProperties()).basicRemove(otherEnd, msgs);
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
			case ExternalServiceLayerCIMPackage.COMPLEX_TYPE__COMPLEX_TYPE_NAME:
				return getComplexTypeName();
			case ExternalServiceLayerCIMPackage.COMPLEX_TYPE__HAS_COMPLEX_TYPE_PROPERTIES:
				return getHasComplexTypeProperties();
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
			case ExternalServiceLayerCIMPackage.COMPLEX_TYPE__COMPLEX_TYPE_NAME:
				setComplexTypeName((String)newValue);
				return;
			case ExternalServiceLayerCIMPackage.COMPLEX_TYPE__HAS_COMPLEX_TYPE_PROPERTIES:
				getHasComplexTypeProperties().clear();
				getHasComplexTypeProperties().addAll((Collection<? extends ComplexTypeProperty>)newValue);
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
			case ExternalServiceLayerCIMPackage.COMPLEX_TYPE__COMPLEX_TYPE_NAME:
				setComplexTypeName(COMPLEX_TYPE_NAME_EDEFAULT);
				return;
			case ExternalServiceLayerCIMPackage.COMPLEX_TYPE__HAS_COMPLEX_TYPE_PROPERTIES:
				getHasComplexTypeProperties().clear();
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
			case ExternalServiceLayerCIMPackage.COMPLEX_TYPE__COMPLEX_TYPE_NAME:
				return COMPLEX_TYPE_NAME_EDEFAULT == null ? complexTypeName != null : !COMPLEX_TYPE_NAME_EDEFAULT.equals(complexTypeName);
			case ExternalServiceLayerCIMPackage.COMPLEX_TYPE__HAS_COMPLEX_TYPE_PROPERTIES:
				return hasComplexTypeProperties != null && !hasComplexTypeProperties.isEmpty();
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
		result.append(" (complexTypeName: ");
		result.append(complexTypeName);
		result.append(')');
		return result.toString();
	}

} //ComplexTypeImpl
