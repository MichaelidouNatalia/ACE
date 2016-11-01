/**
 */
package RESTfulServicePSM.impl;

import RESTfulServicePSM.HibernateAnnotation;
import RESTfulServicePSM.RESTfulServicePSMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hibernate Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RESTfulServicePSM.impl.HibernateAnnotationImpl#getHibernateAnnotationText <em>Hibernate Annotation Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HibernateAnnotationImpl extends MinimalEObjectImpl.Container implements HibernateAnnotation {
	/**
	 * The default value of the '{@link #getHibernateAnnotationText() <em>Hibernate Annotation Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHibernateAnnotationText()
	 * @generated
	 * @ordered
	 */
	protected static final String HIBERNATE_ANNOTATION_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHibernateAnnotationText() <em>Hibernate Annotation Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHibernateAnnotationText()
	 * @generated
	 * @ordered
	 */
	protected String hibernateAnnotationText = HIBERNATE_ANNOTATION_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HibernateAnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTfulServicePSMPackage.Literals.HIBERNATE_ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHibernateAnnotationText() {
		return hibernateAnnotationText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHibernateAnnotationText(String newHibernateAnnotationText) {
		String oldHibernateAnnotationText = hibernateAnnotationText;
		hibernateAnnotationText = newHibernateAnnotationText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.HIBERNATE_ANNOTATION__HIBERNATE_ANNOTATION_TEXT, oldHibernateAnnotationText, hibernateAnnotationText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RESTfulServicePSMPackage.HIBERNATE_ANNOTATION__HIBERNATE_ANNOTATION_TEXT:
				return getHibernateAnnotationText();
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
			case RESTfulServicePSMPackage.HIBERNATE_ANNOTATION__HIBERNATE_ANNOTATION_TEXT:
				setHibernateAnnotationText((String)newValue);
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
			case RESTfulServicePSMPackage.HIBERNATE_ANNOTATION__HIBERNATE_ANNOTATION_TEXT:
				setHibernateAnnotationText(HIBERNATE_ANNOTATION_TEXT_EDEFAULT);
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
			case RESTfulServicePSMPackage.HIBERNATE_ANNOTATION__HIBERNATE_ANNOTATION_TEXT:
				return HIBERNATE_ANNOTATION_TEXT_EDEFAULT == null ? hibernateAnnotationText != null : !HIBERNATE_ANNOTATION_TEXT_EDEFAULT.equals(hibernateAnnotationText);
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
		result.append(" (HibernateAnnotationText: ");
		result.append(hibernateAnnotationText);
		result.append(')');
		return result.toString();
	}

} //HibernateAnnotationImpl
