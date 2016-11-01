/**
 */
package RESTfulServicePSM.impl;

import RESTfulServicePSM.HTTPActivityHandler;
import RESTfulServicePSM.HTTPVerb;
import RESTfulServicePSM.JavaHypermediaFunction;
import RESTfulServicePSM.RESTfulServicePSMPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HTTP Activity Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RESTfulServicePSM.impl.HTTPActivityHandlerImpl#getHasHypermediaFunction <em>Has Hypermedia Function</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.HTTPActivityHandlerImpl#getName <em>Name</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.HTTPActivityHandlerImpl#getHandlerHTTPVerb <em>Handler HTTP Verb</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HTTPActivityHandlerImpl extends MinimalEObjectImpl.Container implements HTTPActivityHandler {
	/**
	 * The cached value of the '{@link #getHasHypermediaFunction() <em>Has Hypermedia Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasHypermediaFunction()
	 * @generated
	 * @ordered
	 */
	protected JavaHypermediaFunction hasHypermediaFunction;

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
	 * The default value of the '{@link #getHandlerHTTPVerb() <em>Handler HTTP Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlerHTTPVerb()
	 * @generated
	 * @ordered
	 */
	protected static final HTTPVerb HANDLER_HTTP_VERB_EDEFAULT = HTTPVerb.POST;

	/**
	 * The cached value of the '{@link #getHandlerHTTPVerb() <em>Handler HTTP Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlerHTTPVerb()
	 * @generated
	 * @ordered
	 */
	protected HTTPVerb handlerHTTPVerb = HANDLER_HTTP_VERB_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HTTPActivityHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTfulServicePSMPackage.Literals.HTTP_ACTIVITY_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaHypermediaFunction getHasHypermediaFunction() {
		return hasHypermediaFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasHypermediaFunction(JavaHypermediaFunction newHasHypermediaFunction, NotificationChain msgs) {
		JavaHypermediaFunction oldHasHypermediaFunction = hasHypermediaFunction;
		hasHypermediaFunction = newHasHypermediaFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.HTTP_ACTIVITY_HANDLER__HAS_HYPERMEDIA_FUNCTION, oldHasHypermediaFunction, newHasHypermediaFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasHypermediaFunction(JavaHypermediaFunction newHasHypermediaFunction) {
		if (newHasHypermediaFunction != hasHypermediaFunction) {
			NotificationChain msgs = null;
			if (hasHypermediaFunction != null)
				msgs = ((InternalEObject)hasHypermediaFunction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RESTfulServicePSMPackage.HTTP_ACTIVITY_HANDLER__HAS_HYPERMEDIA_FUNCTION, null, msgs);
			if (newHasHypermediaFunction != null)
				msgs = ((InternalEObject)newHasHypermediaFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RESTfulServicePSMPackage.HTTP_ACTIVITY_HANDLER__HAS_HYPERMEDIA_FUNCTION, null, msgs);
			msgs = basicSetHasHypermediaFunction(newHasHypermediaFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.HTTP_ACTIVITY_HANDLER__HAS_HYPERMEDIA_FUNCTION, newHasHypermediaFunction, newHasHypermediaFunction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.HTTP_ACTIVITY_HANDLER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPVerb getHandlerHTTPVerb() {
		return handlerHTTPVerb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandlerHTTPVerb(HTTPVerb newHandlerHTTPVerb) {
		HTTPVerb oldHandlerHTTPVerb = handlerHTTPVerb;
		handlerHTTPVerb = newHandlerHTTPVerb == null ? HANDLER_HTTP_VERB_EDEFAULT : newHandlerHTTPVerb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.HTTP_ACTIVITY_HANDLER__HANDLER_HTTP_VERB, oldHandlerHTTPVerb, handlerHTTPVerb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RESTfulServicePSMPackage.HTTP_ACTIVITY_HANDLER__HAS_HYPERMEDIA_FUNCTION:
				return basicSetHasHypermediaFunction(null, msgs);
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
			case RESTfulServicePSMPackage.HTTP_ACTIVITY_HANDLER__HAS_HYPERMEDIA_FUNCTION:
				return getHasHypermediaFunction();
			case RESTfulServicePSMPackage.HTTP_ACTIVITY_HANDLER__NAME:
				return getName();
			case RESTfulServicePSMPackage.HTTP_ACTIVITY_HANDLER__HANDLER_HTTP_VERB:
				return getHandlerHTTPVerb();
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
			case RESTfulServicePSMPackage.HTTP_ACTIVITY_HANDLER__HAS_HYPERMEDIA_FUNCTION:
				setHasHypermediaFunction((JavaHypermediaFunction)newValue);
				return;
			case RESTfulServicePSMPackage.HTTP_ACTIVITY_HANDLER__NAME:
				setName((String)newValue);
				return;
			case RESTfulServicePSMPackage.HTTP_ACTIVITY_HANDLER__HANDLER_HTTP_VERB:
				setHandlerHTTPVerb((HTTPVerb)newValue);
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
			case RESTfulServicePSMPackage.HTTP_ACTIVITY_HANDLER__HAS_HYPERMEDIA_FUNCTION:
				setHasHypermediaFunction((JavaHypermediaFunction)null);
				return;
			case RESTfulServicePSMPackage.HTTP_ACTIVITY_HANDLER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RESTfulServicePSMPackage.HTTP_ACTIVITY_HANDLER__HANDLER_HTTP_VERB:
				setHandlerHTTPVerb(HANDLER_HTTP_VERB_EDEFAULT);
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
			case RESTfulServicePSMPackage.HTTP_ACTIVITY_HANDLER__HAS_HYPERMEDIA_FUNCTION:
				return hasHypermediaFunction != null;
			case RESTfulServicePSMPackage.HTTP_ACTIVITY_HANDLER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RESTfulServicePSMPackage.HTTP_ACTIVITY_HANDLER__HANDLER_HTTP_VERB:
				return handlerHTTPVerb != HANDLER_HTTP_VERB_EDEFAULT;
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
		result.append(", HandlerHTTPVerb: ");
		result.append(handlerHTTPVerb);
		result.append(')');
		return result.toString();
	}

} //HTTPActivityHandlerImpl
