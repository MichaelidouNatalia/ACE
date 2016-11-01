/**
 */
package RESTfulServicePSM.impl;

import RESTfulServicePSM.HTTPActivityFunctionParameter;
import RESTfulServicePSM.JAXRSAnnotation;
import RESTfulServicePSM.RESTfulServicePSMPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HTTP Activity Function Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RESTfulServicePSM.impl.HTTPActivityFunctionParameterImpl#getHTTPFunctionParameterHasJAXRSAnnotation <em>HTTP Function Parameter Has JAXRS Annotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HTTPActivityFunctionParameterImpl extends FunctionParameterImpl implements HTTPActivityFunctionParameter {
	/**
	 * The cached value of the '{@link #getHTTPFunctionParameterHasJAXRSAnnotation() <em>HTTP Function Parameter Has JAXRS Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHTTPFunctionParameterHasJAXRSAnnotation()
	 * @generated
	 * @ordered
	 */
	protected JAXRSAnnotation httpFunctionParameterHasJAXRSAnnotation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HTTPActivityFunctionParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTfulServicePSMPackage.Literals.HTTP_ACTIVITY_FUNCTION_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JAXRSAnnotation getHTTPFunctionParameterHasJAXRSAnnotation() {
		return httpFunctionParameterHasJAXRSAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHTTPFunctionParameterHasJAXRSAnnotation(JAXRSAnnotation newHTTPFunctionParameterHasJAXRSAnnotation, NotificationChain msgs) {
		JAXRSAnnotation oldHTTPFunctionParameterHasJAXRSAnnotation = httpFunctionParameterHasJAXRSAnnotation;
		httpFunctionParameterHasJAXRSAnnotation = newHTTPFunctionParameterHasJAXRSAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.HTTP_ACTIVITY_FUNCTION_PARAMETER__HTTP_FUNCTION_PARAMETER_HAS_JAXRS_ANNOTATION, oldHTTPFunctionParameterHasJAXRSAnnotation, newHTTPFunctionParameterHasJAXRSAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHTTPFunctionParameterHasJAXRSAnnotation(JAXRSAnnotation newHTTPFunctionParameterHasJAXRSAnnotation) {
		if (newHTTPFunctionParameterHasJAXRSAnnotation != httpFunctionParameterHasJAXRSAnnotation) {
			NotificationChain msgs = null;
			if (httpFunctionParameterHasJAXRSAnnotation != null)
				msgs = ((InternalEObject)httpFunctionParameterHasJAXRSAnnotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RESTfulServicePSMPackage.HTTP_ACTIVITY_FUNCTION_PARAMETER__HTTP_FUNCTION_PARAMETER_HAS_JAXRS_ANNOTATION, null, msgs);
			if (newHTTPFunctionParameterHasJAXRSAnnotation != null)
				msgs = ((InternalEObject)newHTTPFunctionParameterHasJAXRSAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RESTfulServicePSMPackage.HTTP_ACTIVITY_FUNCTION_PARAMETER__HTTP_FUNCTION_PARAMETER_HAS_JAXRS_ANNOTATION, null, msgs);
			msgs = basicSetHTTPFunctionParameterHasJAXRSAnnotation(newHTTPFunctionParameterHasJAXRSAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.HTTP_ACTIVITY_FUNCTION_PARAMETER__HTTP_FUNCTION_PARAMETER_HAS_JAXRS_ANNOTATION, newHTTPFunctionParameterHasJAXRSAnnotation, newHTTPFunctionParameterHasJAXRSAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RESTfulServicePSMPackage.HTTP_ACTIVITY_FUNCTION_PARAMETER__HTTP_FUNCTION_PARAMETER_HAS_JAXRS_ANNOTATION:
				return basicSetHTTPFunctionParameterHasJAXRSAnnotation(null, msgs);
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
			case RESTfulServicePSMPackage.HTTP_ACTIVITY_FUNCTION_PARAMETER__HTTP_FUNCTION_PARAMETER_HAS_JAXRS_ANNOTATION:
				return getHTTPFunctionParameterHasJAXRSAnnotation();
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
			case RESTfulServicePSMPackage.HTTP_ACTIVITY_FUNCTION_PARAMETER__HTTP_FUNCTION_PARAMETER_HAS_JAXRS_ANNOTATION:
				setHTTPFunctionParameterHasJAXRSAnnotation((JAXRSAnnotation)newValue);
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
			case RESTfulServicePSMPackage.HTTP_ACTIVITY_FUNCTION_PARAMETER__HTTP_FUNCTION_PARAMETER_HAS_JAXRS_ANNOTATION:
				setHTTPFunctionParameterHasJAXRSAnnotation((JAXRSAnnotation)null);
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
			case RESTfulServicePSMPackage.HTTP_ACTIVITY_FUNCTION_PARAMETER__HTTP_FUNCTION_PARAMETER_HAS_JAXRS_ANNOTATION:
				return httpFunctionParameterHasJAXRSAnnotation != null;
		}
		return super.eIsSet(featureID);
	}

} //HTTPActivityFunctionParameterImpl
