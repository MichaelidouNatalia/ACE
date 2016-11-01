/**
 */
package RESTfulServicePSM.impl;

import RESTfulServicePSM.HTTPActivity;
import RESTfulServicePSM.HTTPActivityFunctionParameter;
import RESTfulServicePSM.HTTPActivityHandler;
import RESTfulServicePSM.HTTPVerb;
import RESTfulServicePSM.HibernateActivity;
import RESTfulServicePSM.JAXRSAnnotation;
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
 * An implementation of the model object '<em><b>HTTP Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RESTfulServicePSM.impl.HTTPActivityImpl#getIsMappedToHibernateActivity <em>Is Mapped To Hibernate Activity</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.HTTPActivityImpl#getHasHTTPActivityParameter <em>Has HTTP Activity Parameter</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.HTTPActivityImpl#getActivityHTTPVerb <em>Activity HTTP Verb</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.HTTPActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.HTTPActivityImpl#getHTTPActivityURI <em>HTTP Activity URI</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.HTTPActivityImpl#getHasHTTPActivityHandler <em>Has HTTP Activity Handler</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.HTTPActivityImpl#getHTTPActivityHasJAXRSAnnotation <em>HTTP Activity Has JAXRS Annotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HTTPActivityImpl extends MinimalEObjectImpl.Container implements HTTPActivity {
	/**
	 * The cached value of the '{@link #getIsMappedToHibernateActivity() <em>Is Mapped To Hibernate Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMappedToHibernateActivity()
	 * @generated
	 * @ordered
	 */
	protected HibernateActivity isMappedToHibernateActivity;

	/**
	 * The cached value of the '{@link #getHasHTTPActivityParameter() <em>Has HTTP Activity Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasHTTPActivityParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<HTTPActivityFunctionParameter> hasHTTPActivityParameter;

	/**
	 * The default value of the '{@link #getActivityHTTPVerb() <em>Activity HTTP Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityHTTPVerb()
	 * @generated
	 * @ordered
	 */
	protected static final HTTPVerb ACTIVITY_HTTP_VERB_EDEFAULT = HTTPVerb.POST;

	/**
	 * The cached value of the '{@link #getActivityHTTPVerb() <em>Activity HTTP Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityHTTPVerb()
	 * @generated
	 * @ordered
	 */
	protected HTTPVerb activityHTTPVerb = ACTIVITY_HTTP_VERB_EDEFAULT;

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
	 * The default value of the '{@link #getHTTPActivityURI() <em>HTTP Activity URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHTTPActivityURI()
	 * @generated
	 * @ordered
	 */
	protected static final String HTTP_ACTIVITY_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHTTPActivityURI() <em>HTTP Activity URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHTTPActivityURI()
	 * @generated
	 * @ordered
	 */
	protected String httpActivityURI = HTTP_ACTIVITY_URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasHTTPActivityHandler() <em>Has HTTP Activity Handler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasHTTPActivityHandler()
	 * @generated
	 * @ordered
	 */
	protected HTTPActivityHandler hasHTTPActivityHandler;

	/**
	 * The cached value of the '{@link #getHTTPActivityHasJAXRSAnnotation() <em>HTTP Activity Has JAXRS Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHTTPActivityHasJAXRSAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<JAXRSAnnotation> httpActivityHasJAXRSAnnotation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HTTPActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTfulServicePSMPackage.Literals.HTTP_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HibernateActivity getIsMappedToHibernateActivity() {
		if (isMappedToHibernateActivity != null && isMappedToHibernateActivity.eIsProxy()) {
			InternalEObject oldIsMappedToHibernateActivity = (InternalEObject)isMappedToHibernateActivity;
			isMappedToHibernateActivity = (HibernateActivity)eResolveProxy(oldIsMappedToHibernateActivity);
			if (isMappedToHibernateActivity != oldIsMappedToHibernateActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RESTfulServicePSMPackage.HTTP_ACTIVITY__IS_MAPPED_TO_HIBERNATE_ACTIVITY, oldIsMappedToHibernateActivity, isMappedToHibernateActivity));
			}
		}
		return isMappedToHibernateActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HibernateActivity basicGetIsMappedToHibernateActivity() {
		return isMappedToHibernateActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMappedToHibernateActivity(HibernateActivity newIsMappedToHibernateActivity) {
		HibernateActivity oldIsMappedToHibernateActivity = isMappedToHibernateActivity;
		isMappedToHibernateActivity = newIsMappedToHibernateActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.HTTP_ACTIVITY__IS_MAPPED_TO_HIBERNATE_ACTIVITY, oldIsMappedToHibernateActivity, isMappedToHibernateActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HTTPActivityFunctionParameter> getHasHTTPActivityParameter() {
		if (hasHTTPActivityParameter == null) {
			hasHTTPActivityParameter = new EObjectContainmentEList<HTTPActivityFunctionParameter>(HTTPActivityFunctionParameter.class, this, RESTfulServicePSMPackage.HTTP_ACTIVITY__HAS_HTTP_ACTIVITY_PARAMETER);
		}
		return hasHTTPActivityParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPVerb getActivityHTTPVerb() {
		return activityHTTPVerb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityHTTPVerb(HTTPVerb newActivityHTTPVerb) {
		HTTPVerb oldActivityHTTPVerb = activityHTTPVerb;
		activityHTTPVerb = newActivityHTTPVerb == null ? ACTIVITY_HTTP_VERB_EDEFAULT : newActivityHTTPVerb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.HTTP_ACTIVITY__ACTIVITY_HTTP_VERB, oldActivityHTTPVerb, activityHTTPVerb));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.HTTP_ACTIVITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHTTPActivityURI() {
		return httpActivityURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHTTPActivityURI(String newHTTPActivityURI) {
		String oldHTTPActivityURI = httpActivityURI;
		httpActivityURI = newHTTPActivityURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.HTTP_ACTIVITY__HTTP_ACTIVITY_URI, oldHTTPActivityURI, httpActivityURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPActivityHandler getHasHTTPActivityHandler() {
		return hasHTTPActivityHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasHTTPActivityHandler(HTTPActivityHandler newHasHTTPActivityHandler, NotificationChain msgs) {
		HTTPActivityHandler oldHasHTTPActivityHandler = hasHTTPActivityHandler;
		hasHTTPActivityHandler = newHasHTTPActivityHandler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.HTTP_ACTIVITY__HAS_HTTP_ACTIVITY_HANDLER, oldHasHTTPActivityHandler, newHasHTTPActivityHandler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasHTTPActivityHandler(HTTPActivityHandler newHasHTTPActivityHandler) {
		if (newHasHTTPActivityHandler != hasHTTPActivityHandler) {
			NotificationChain msgs = null;
			if (hasHTTPActivityHandler != null)
				msgs = ((InternalEObject)hasHTTPActivityHandler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RESTfulServicePSMPackage.HTTP_ACTIVITY__HAS_HTTP_ACTIVITY_HANDLER, null, msgs);
			if (newHasHTTPActivityHandler != null)
				msgs = ((InternalEObject)newHasHTTPActivityHandler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RESTfulServicePSMPackage.HTTP_ACTIVITY__HAS_HTTP_ACTIVITY_HANDLER, null, msgs);
			msgs = basicSetHasHTTPActivityHandler(newHasHTTPActivityHandler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.HTTP_ACTIVITY__HAS_HTTP_ACTIVITY_HANDLER, newHasHTTPActivityHandler, newHasHTTPActivityHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JAXRSAnnotation> getHTTPActivityHasJAXRSAnnotation() {
		if (httpActivityHasJAXRSAnnotation == null) {
			httpActivityHasJAXRSAnnotation = new EObjectContainmentEList<JAXRSAnnotation>(JAXRSAnnotation.class, this, RESTfulServicePSMPackage.HTTP_ACTIVITY__HTTP_ACTIVITY_HAS_JAXRS_ANNOTATION);
		}
		return httpActivityHasJAXRSAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RESTfulServicePSMPackage.HTTP_ACTIVITY__HAS_HTTP_ACTIVITY_PARAMETER:
				return ((InternalEList<?>)getHasHTTPActivityParameter()).basicRemove(otherEnd, msgs);
			case RESTfulServicePSMPackage.HTTP_ACTIVITY__HAS_HTTP_ACTIVITY_HANDLER:
				return basicSetHasHTTPActivityHandler(null, msgs);
			case RESTfulServicePSMPackage.HTTP_ACTIVITY__HTTP_ACTIVITY_HAS_JAXRS_ANNOTATION:
				return ((InternalEList<?>)getHTTPActivityHasJAXRSAnnotation()).basicRemove(otherEnd, msgs);
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
			case RESTfulServicePSMPackage.HTTP_ACTIVITY__IS_MAPPED_TO_HIBERNATE_ACTIVITY:
				if (resolve) return getIsMappedToHibernateActivity();
				return basicGetIsMappedToHibernateActivity();
			case RESTfulServicePSMPackage.HTTP_ACTIVITY__HAS_HTTP_ACTIVITY_PARAMETER:
				return getHasHTTPActivityParameter();
			case RESTfulServicePSMPackage.HTTP_ACTIVITY__ACTIVITY_HTTP_VERB:
				return getActivityHTTPVerb();
			case RESTfulServicePSMPackage.HTTP_ACTIVITY__NAME:
				return getName();
			case RESTfulServicePSMPackage.HTTP_ACTIVITY__HTTP_ACTIVITY_URI:
				return getHTTPActivityURI();
			case RESTfulServicePSMPackage.HTTP_ACTIVITY__HAS_HTTP_ACTIVITY_HANDLER:
				return getHasHTTPActivityHandler();
			case RESTfulServicePSMPackage.HTTP_ACTIVITY__HTTP_ACTIVITY_HAS_JAXRS_ANNOTATION:
				return getHTTPActivityHasJAXRSAnnotation();
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
			case RESTfulServicePSMPackage.HTTP_ACTIVITY__IS_MAPPED_TO_HIBERNATE_ACTIVITY:
				setIsMappedToHibernateActivity((HibernateActivity)newValue);
				return;
			case RESTfulServicePSMPackage.HTTP_ACTIVITY__HAS_HTTP_ACTIVITY_PARAMETER:
				getHasHTTPActivityParameter().clear();
				getHasHTTPActivityParameter().addAll((Collection<? extends HTTPActivityFunctionParameter>)newValue);
				return;
			case RESTfulServicePSMPackage.HTTP_ACTIVITY__ACTIVITY_HTTP_VERB:
				setActivityHTTPVerb((HTTPVerb)newValue);
				return;
			case RESTfulServicePSMPackage.HTTP_ACTIVITY__NAME:
				setName((String)newValue);
				return;
			case RESTfulServicePSMPackage.HTTP_ACTIVITY__HTTP_ACTIVITY_URI:
				setHTTPActivityURI((String)newValue);
				return;
			case RESTfulServicePSMPackage.HTTP_ACTIVITY__HAS_HTTP_ACTIVITY_HANDLER:
				setHasHTTPActivityHandler((HTTPActivityHandler)newValue);
				return;
			case RESTfulServicePSMPackage.HTTP_ACTIVITY__HTTP_ACTIVITY_HAS_JAXRS_ANNOTATION:
				getHTTPActivityHasJAXRSAnnotation().clear();
				getHTTPActivityHasJAXRSAnnotation().addAll((Collection<? extends JAXRSAnnotation>)newValue);
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
			case RESTfulServicePSMPackage.HTTP_ACTIVITY__IS_MAPPED_TO_HIBERNATE_ACTIVITY:
				setIsMappedToHibernateActivity((HibernateActivity)null);
				return;
			case RESTfulServicePSMPackage.HTTP_ACTIVITY__HAS_HTTP_ACTIVITY_PARAMETER:
				getHasHTTPActivityParameter().clear();
				return;
			case RESTfulServicePSMPackage.HTTP_ACTIVITY__ACTIVITY_HTTP_VERB:
				setActivityHTTPVerb(ACTIVITY_HTTP_VERB_EDEFAULT);
				return;
			case RESTfulServicePSMPackage.HTTP_ACTIVITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RESTfulServicePSMPackage.HTTP_ACTIVITY__HTTP_ACTIVITY_URI:
				setHTTPActivityURI(HTTP_ACTIVITY_URI_EDEFAULT);
				return;
			case RESTfulServicePSMPackage.HTTP_ACTIVITY__HAS_HTTP_ACTIVITY_HANDLER:
				setHasHTTPActivityHandler((HTTPActivityHandler)null);
				return;
			case RESTfulServicePSMPackage.HTTP_ACTIVITY__HTTP_ACTIVITY_HAS_JAXRS_ANNOTATION:
				getHTTPActivityHasJAXRSAnnotation().clear();
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
			case RESTfulServicePSMPackage.HTTP_ACTIVITY__IS_MAPPED_TO_HIBERNATE_ACTIVITY:
				return isMappedToHibernateActivity != null;
			case RESTfulServicePSMPackage.HTTP_ACTIVITY__HAS_HTTP_ACTIVITY_PARAMETER:
				return hasHTTPActivityParameter != null && !hasHTTPActivityParameter.isEmpty();
			case RESTfulServicePSMPackage.HTTP_ACTIVITY__ACTIVITY_HTTP_VERB:
				return activityHTTPVerb != ACTIVITY_HTTP_VERB_EDEFAULT;
			case RESTfulServicePSMPackage.HTTP_ACTIVITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RESTfulServicePSMPackage.HTTP_ACTIVITY__HTTP_ACTIVITY_URI:
				return HTTP_ACTIVITY_URI_EDEFAULT == null ? httpActivityURI != null : !HTTP_ACTIVITY_URI_EDEFAULT.equals(httpActivityURI);
			case RESTfulServicePSMPackage.HTTP_ACTIVITY__HAS_HTTP_ACTIVITY_HANDLER:
				return hasHTTPActivityHandler != null;
			case RESTfulServicePSMPackage.HTTP_ACTIVITY__HTTP_ACTIVITY_HAS_JAXRS_ANNOTATION:
				return httpActivityHasJAXRSAnnotation != null && !httpActivityHasJAXRSAnnotation.isEmpty();
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
		result.append(" (ActivityHTTPVerb: ");
		result.append(activityHTTPVerb);
		result.append(", name: ");
		result.append(name);
		result.append(", HTTPActivityURI: ");
		result.append(httpActivityURI);
		result.append(')');
		return result.toString();
	}

} //HTTPActivityImpl
