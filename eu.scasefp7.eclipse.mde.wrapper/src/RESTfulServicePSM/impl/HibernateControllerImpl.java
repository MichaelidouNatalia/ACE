/**
 */
package RESTfulServicePSM.impl;

import RESTfulServicePSM.HibernateActivity;
import RESTfulServicePSM.HibernateController;
import RESTfulServicePSM.RESTfulServicePSMPackage;

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
 * An implementation of the model object '<em><b>Hibernate Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RESTfulServicePSM.impl.HibernateControllerImpl#getHasHibernateActivity <em>Has Hibernate Activity</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.HibernateControllerImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HibernateControllerImpl extends MinimalEObjectImpl.Container implements HibernateController {
	/**
	 * The cached value of the '{@link #getHasHibernateActivity() <em>Has Hibernate Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasHibernateActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<HibernateActivity> hasHibernateActivity;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HibernateControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTfulServicePSMPackage.Literals.HIBERNATE_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HibernateActivity> getHasHibernateActivity() {
		if (hasHibernateActivity == null) {
			hasHibernateActivity = new EObjectContainmentEList<HibernateActivity>(HibernateActivity.class, this, RESTfulServicePSMPackage.HIBERNATE_CONTROLLER__HAS_HIBERNATE_ACTIVITY);
		}
		return hasHibernateActivity;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.HIBERNATE_CONTROLLER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RESTfulServicePSMPackage.HIBERNATE_CONTROLLER__HAS_HIBERNATE_ACTIVITY:
				return ((InternalEList<?>)getHasHibernateActivity()).basicRemove(otherEnd, msgs);
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
			case RESTfulServicePSMPackage.HIBERNATE_CONTROLLER__HAS_HIBERNATE_ACTIVITY:
				return getHasHibernateActivity();
			case RESTfulServicePSMPackage.HIBERNATE_CONTROLLER__NAME:
				return getName();
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
			case RESTfulServicePSMPackage.HIBERNATE_CONTROLLER__HAS_HIBERNATE_ACTIVITY:
				getHasHibernateActivity().clear();
				getHasHibernateActivity().addAll((Collection<? extends HibernateActivity>)newValue);
				return;
			case RESTfulServicePSMPackage.HIBERNATE_CONTROLLER__NAME:
				setName((String)newValue);
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
			case RESTfulServicePSMPackage.HIBERNATE_CONTROLLER__HAS_HIBERNATE_ACTIVITY:
				getHasHibernateActivity().clear();
				return;
			case RESTfulServicePSMPackage.HIBERNATE_CONTROLLER__NAME:
				setName(NAME_EDEFAULT);
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
			case RESTfulServicePSMPackage.HIBERNATE_CONTROLLER__HAS_HIBERNATE_ACTIVITY:
				return hasHibernateActivity != null && !hasHibernateActivity.isEmpty();
			case RESTfulServicePSMPackage.HIBERNATE_CONTROLLER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(')');
		return result.toString();
	}

} //HibernateControllerImpl
