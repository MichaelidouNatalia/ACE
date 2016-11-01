/**
 */
package RESTfulServicePSM.impl;

import RESTfulServicePSM.JAXBAnnotation;
import RESTfulServicePSM.RESTfulServicePSMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JAXB Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RESTfulServicePSM.impl.JAXBAnnotationImpl#getJAXBAnnotationText <em>JAXB Annotation Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JAXBAnnotationImpl extends MinimalEObjectImpl.Container implements JAXBAnnotation {
	/**
	 * The default value of the '{@link #getJAXBAnnotationText() <em>JAXB Annotation Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJAXBAnnotationText()
	 * @generated
	 * @ordered
	 */
	protected static final String JAXB_ANNOTATION_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJAXBAnnotationText() <em>JAXB Annotation Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJAXBAnnotationText()
	 * @generated
	 * @ordered
	 */
	protected String jaxbAnnotationText = JAXB_ANNOTATION_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JAXBAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTfulServicePSMPackage.Literals.JAXB_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getJAXBAnnotationText() {
		return jaxbAnnotationText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJAXBAnnotationText(String newJAXBAnnotationText) {
		String oldJAXBAnnotationText = jaxbAnnotationText;
		jaxbAnnotationText = newJAXBAnnotationText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.JAXB_ANNOTATION__JAXB_ANNOTATION_TEXT, oldJAXBAnnotationText, jaxbAnnotationText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RESTfulServicePSMPackage.JAXB_ANNOTATION__JAXB_ANNOTATION_TEXT:
				return getJAXBAnnotationText();
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
			case RESTfulServicePSMPackage.JAXB_ANNOTATION__JAXB_ANNOTATION_TEXT:
				setJAXBAnnotationText((String)newValue);
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
			case RESTfulServicePSMPackage.JAXB_ANNOTATION__JAXB_ANNOTATION_TEXT:
				setJAXBAnnotationText(JAXB_ANNOTATION_TEXT_EDEFAULT);
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
			case RESTfulServicePSMPackage.JAXB_ANNOTATION__JAXB_ANNOTATION_TEXT:
				return JAXB_ANNOTATION_TEXT_EDEFAULT == null ? jaxbAnnotationText != null : !JAXB_ANNOTATION_TEXT_EDEFAULT.equals(jaxbAnnotationText);
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
		result.append(" (JAXBAnnotationText: ");
		result.append(jaxbAnnotationText);
		result.append(')');
		return result.toString();
	}

} //JAXBAnnotationImpl
