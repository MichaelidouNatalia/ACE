/**
 */
package ServiceCIM.impl;

import ServiceCIM.InputRepresentation;
import ServiceCIM.MediaType;
import ServiceCIM.ServiceCIMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Representation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ServiceCIM.impl.InputRepresentationImpl#getInputMediaType <em>Input Media Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputRepresentationImpl extends MinimalEObjectImpl.Container implements InputRepresentation {
	/**
	 * The default value of the '{@link #getInputMediaType() <em>Input Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputMediaType()
	 * @generated
	 * @ordered
	 */
	protected static final MediaType INPUT_MEDIA_TYPE_EDEFAULT = MediaType.JSON;

	/**
	 * The cached value of the '{@link #getInputMediaType() <em>Input Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputMediaType()
	 * @generated
	 * @ordered
	 */
	protected MediaType inputMediaType = INPUT_MEDIA_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputRepresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServiceCIMPackage.Literals.INPUT_REPRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaType getInputMediaType() {
		return inputMediaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputMediaType(MediaType newInputMediaType) {
		MediaType oldInputMediaType = inputMediaType;
		inputMediaType = newInputMediaType == null ? INPUT_MEDIA_TYPE_EDEFAULT : newInputMediaType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServiceCIMPackage.INPUT_REPRESENTATION__INPUT_MEDIA_TYPE, oldInputMediaType, inputMediaType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServiceCIMPackage.INPUT_REPRESENTATION__INPUT_MEDIA_TYPE:
				return getInputMediaType();
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
			case ServiceCIMPackage.INPUT_REPRESENTATION__INPUT_MEDIA_TYPE:
				setInputMediaType((MediaType)newValue);
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
			case ServiceCIMPackage.INPUT_REPRESENTATION__INPUT_MEDIA_TYPE:
				setInputMediaType(INPUT_MEDIA_TYPE_EDEFAULT);
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
			case ServiceCIMPackage.INPUT_REPRESENTATION__INPUT_MEDIA_TYPE:
				return inputMediaType != INPUT_MEDIA_TYPE_EDEFAULT;
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
		result.append(" (inputMediaType: ");
		result.append(inputMediaType);
		result.append(')');
		return result.toString();
	}

} //InputRepresentationImpl
