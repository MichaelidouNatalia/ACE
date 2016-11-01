/**
 */
package RESTfulServicePSM.impl;

import RESTfulServicePSM.HTTPVerb;
import RESTfulServicePSM.HibernateActivity;
import RESTfulServicePSM.RESTfulServicePSMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hibernate Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RESTfulServicePSM.impl.HibernateActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.HibernateActivityImpl#getHibernateActivityHTTPVerb <em>Hibernate Activity HTTP Verb</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HibernateActivityImpl extends MinimalEObjectImpl.Container implements HibernateActivity {
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
	 * The default value of the '{@link #getHibernateActivityHTTPVerb() <em>Hibernate Activity HTTP Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHibernateActivityHTTPVerb()
	 * @generated
	 * @ordered
	 */
	protected static final HTTPVerb HIBERNATE_ACTIVITY_HTTP_VERB_EDEFAULT = HTTPVerb.POST;

	/**
	 * The cached value of the '{@link #getHibernateActivityHTTPVerb() <em>Hibernate Activity HTTP Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHibernateActivityHTTPVerb()
	 * @generated
	 * @ordered
	 */
	protected HTTPVerb hibernateActivityHTTPVerb = HIBERNATE_ACTIVITY_HTTP_VERB_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HibernateActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTfulServicePSMPackage.Literals.HIBERNATE_ACTIVITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.HIBERNATE_ACTIVITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPVerb getHibernateActivityHTTPVerb() {
		return hibernateActivityHTTPVerb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHibernateActivityHTTPVerb(HTTPVerb newHibernateActivityHTTPVerb) {
		HTTPVerb oldHibernateActivityHTTPVerb = hibernateActivityHTTPVerb;
		hibernateActivityHTTPVerb = newHibernateActivityHTTPVerb == null ? HIBERNATE_ACTIVITY_HTTP_VERB_EDEFAULT : newHibernateActivityHTTPVerb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.HIBERNATE_ACTIVITY__HIBERNATE_ACTIVITY_HTTP_VERB, oldHibernateActivityHTTPVerb, hibernateActivityHTTPVerb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RESTfulServicePSMPackage.HIBERNATE_ACTIVITY__NAME:
				return getName();
			case RESTfulServicePSMPackage.HIBERNATE_ACTIVITY__HIBERNATE_ACTIVITY_HTTP_VERB:
				return getHibernateActivityHTTPVerb();
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
			case RESTfulServicePSMPackage.HIBERNATE_ACTIVITY__NAME:
				setName((String)newValue);
				return;
			case RESTfulServicePSMPackage.HIBERNATE_ACTIVITY__HIBERNATE_ACTIVITY_HTTP_VERB:
				setHibernateActivityHTTPVerb((HTTPVerb)newValue);
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
			case RESTfulServicePSMPackage.HIBERNATE_ACTIVITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RESTfulServicePSMPackage.HIBERNATE_ACTIVITY__HIBERNATE_ACTIVITY_HTTP_VERB:
				setHibernateActivityHTTPVerb(HIBERNATE_ACTIVITY_HTTP_VERB_EDEFAULT);
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
			case RESTfulServicePSMPackage.HIBERNATE_ACTIVITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RESTfulServicePSMPackage.HIBERNATE_ACTIVITY__HIBERNATE_ACTIVITY_HTTP_VERB:
				return hibernateActivityHTTPVerb != HIBERNATE_ACTIVITY_HTTP_VERB_EDEFAULT;
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
		result.append(", HibernateActivityHTTPVerb: ");
		result.append(hibernateActivityHTTPVerb);
		result.append(')');
		return result.toString();
	}

} //HibernateActivityImpl
