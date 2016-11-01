/**
 */
package RESTfulServicePSM.impl;

import RESTfulServicePSM.JAXRSAnnotation;
import RESTfulServicePSM.RESTfulServicePSMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JAXRS Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RESTfulServicePSM.impl.JAXRSAnnotationImpl#getJAXRSAnnotationText <em>JAXRS Annotation Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JAXRSAnnotationImpl extends MinimalEObjectImpl.Container implements JAXRSAnnotation {
	/**
	 * The default value of the '{@link #getJAXRSAnnotationText() <em>JAXRS Annotation Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJAXRSAnnotationText()
	 * @generated
	 * @ordered
	 */
	protected static final String JAXRS_ANNOTATION_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJAXRSAnnotationText() <em>JAXRS Annotation Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJAXRSAnnotationText()
	 * @generated
	 * @ordered
	 */
	protected String jaxrsAnnotationText = JAXRS_ANNOTATION_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JAXRSAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTfulServicePSMPackage.Literals.JAXRS_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJAXRSAnnotationText() {
		return jaxrsAnnotationText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJAXRSAnnotationText(String newJAXRSAnnotationText) {
		String oldJAXRSAnnotationText = jaxrsAnnotationText;
		jaxrsAnnotationText = newJAXRSAnnotationText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.JAXRS_ANNOTATION__JAXRS_ANNOTATION_TEXT, oldJAXRSAnnotationText, jaxrsAnnotationText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RESTfulServicePSMPackage.JAXRS_ANNOTATION__JAXRS_ANNOTATION_TEXT:
				return getJAXRSAnnotationText();
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
			case RESTfulServicePSMPackage.JAXRS_ANNOTATION__JAXRS_ANNOTATION_TEXT:
				setJAXRSAnnotationText((String)newValue);
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
			case RESTfulServicePSMPackage.JAXRS_ANNOTATION__JAXRS_ANNOTATION_TEXT:
				setJAXRSAnnotationText(JAXRS_ANNOTATION_TEXT_EDEFAULT);
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
			case RESTfulServicePSMPackage.JAXRS_ANNOTATION__JAXRS_ANNOTATION_TEXT:
				return JAXRS_ANNOTATION_TEXT_EDEFAULT == null ? jaxrsAnnotationText != null : !JAXRS_ANNOTATION_TEXT_EDEFAULT.equals(jaxrsAnnotationText);
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
		result.append(" (JAXRSAnnotationText: ");
		result.append(jaxrsAnnotationText);
		result.append(')');
		return result.toString();
	}

} //JAXRSAnnotationImpl
