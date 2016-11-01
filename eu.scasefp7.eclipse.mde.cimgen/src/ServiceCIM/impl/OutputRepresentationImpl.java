/**
 */
package ServiceCIM.impl;

import ServiceCIM.MediaType;
import ServiceCIM.OutputRepresentation;
import ServiceCIM.ServiceCIMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Representation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ServiceCIM.impl.OutputRepresentationImpl#getOutputMediaType <em>Output Media Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputRepresentationImpl extends MinimalEObjectImpl.Container implements OutputRepresentation {
	/**
	 * The default value of the '{@link #getOutputMediaType() <em>Output Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputMediaType()
	 * @generated
	 * @ordered
	 */
	protected static final MediaType OUTPUT_MEDIA_TYPE_EDEFAULT = MediaType.JSON;

	/**
	 * The cached value of the '{@link #getOutputMediaType() <em>Output Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputMediaType()
	 * @generated
	 * @ordered
	 */
	protected MediaType outputMediaType = OUTPUT_MEDIA_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputRepresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServiceCIMPackage.Literals.OUTPUT_REPRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaType getOutputMediaType() {
		return outputMediaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputMediaType(MediaType newOutputMediaType) {
		MediaType oldOutputMediaType = outputMediaType;
		outputMediaType = newOutputMediaType == null ? OUTPUT_MEDIA_TYPE_EDEFAULT : newOutputMediaType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServiceCIMPackage.OUTPUT_REPRESENTATION__OUTPUT_MEDIA_TYPE, oldOutputMediaType, outputMediaType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServiceCIMPackage.OUTPUT_REPRESENTATION__OUTPUT_MEDIA_TYPE:
				return getOutputMediaType();
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
			case ServiceCIMPackage.OUTPUT_REPRESENTATION__OUTPUT_MEDIA_TYPE:
				setOutputMediaType((MediaType)newValue);
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
			case ServiceCIMPackage.OUTPUT_REPRESENTATION__OUTPUT_MEDIA_TYPE:
				setOutputMediaType(OUTPUT_MEDIA_TYPE_EDEFAULT);
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
			case ServiceCIMPackage.OUTPUT_REPRESENTATION__OUTPUT_MEDIA_TYPE:
				return outputMediaType != OUTPUT_MEDIA_TYPE_EDEFAULT;
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
		result.append(" (outputMediaType: ");
		result.append(outputMediaType);
		result.append(')');
		return result.toString();
	}

} //OutputRepresentationImpl
