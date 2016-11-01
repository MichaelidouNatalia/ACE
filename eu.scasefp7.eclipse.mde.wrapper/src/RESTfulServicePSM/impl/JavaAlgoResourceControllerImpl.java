/**
 */
package RESTfulServicePSM.impl;

import RESTfulServicePSM.HTTPActivity;
import RESTfulServicePSM.JAXRSAnnotation;
import RESTfulServicePSM.JavaAlgoResourceController;
import RESTfulServicePSM.JavaAlgoResourceModel;
import RESTfulServicePSM.RESTfulServicePSMPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Algo Resource Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RESTfulServicePSM.impl.JavaAlgoResourceControllerImpl#getHasAssociatedAlgoModel <em>Has Associated Algo Model</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.JavaAlgoResourceControllerImpl#getJavaAlgoRControllerHasHTTPActivity <em>Java Algo RController Has HTTP Activity</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.JavaAlgoResourceControllerImpl#getName <em>Name</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.JavaAlgoResourceControllerImpl#getControllerURI <em>Controller URI</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.JavaAlgoResourceControllerImpl#getParentName <em>Parent Name</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.JavaAlgoResourceControllerImpl#getAlgoControllerHasJAXRSAnnotation <em>Algo Controller Has JAXRS Annotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaAlgoResourceControllerImpl extends MinimalEObjectImpl.Container implements JavaAlgoResourceController {
	/**
	 * The cached value of the '{@link #getHasAssociatedAlgoModel() <em>Has Associated Algo Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAssociatedAlgoModel()
	 * @generated
	 * @ordered
	 */
	protected JavaAlgoResourceModel hasAssociatedAlgoModel;

	/**
	 * The cached value of the '{@link #getJavaAlgoRControllerHasHTTPActivity() <em>Java Algo RController Has HTTP Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaAlgoRControllerHasHTTPActivity()
	 * @generated
	 * @ordered
	 */
	protected HTTPActivity javaAlgoRControllerHasHTTPActivity;

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
	 * The default value of the '{@link #getControllerURI() <em>Controller URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerURI()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROLLER_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getControllerURI() <em>Controller URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerURI()
	 * @generated
	 * @ordered
	 */
	protected String controllerURI = CONTROLLER_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getParentName() <em>Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentName() <em>Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentName()
	 * @generated
	 * @ordered
	 */
	protected String parentName = PARENT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAlgoControllerHasJAXRSAnnotation() <em>Algo Controller Has JAXRS Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgoControllerHasJAXRSAnnotation()
	 * @generated
	 * @ordered
	 */
	protected JAXRSAnnotation algoControllerHasJAXRSAnnotation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaAlgoResourceControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTfulServicePSMPackage.Literals.JAVA_ALGO_RESOURCE_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaAlgoResourceModel getHasAssociatedAlgoModel() {
		if (hasAssociatedAlgoModel != null && hasAssociatedAlgoModel.eIsProxy()) {
			InternalEObject oldHasAssociatedAlgoModel = (InternalEObject)hasAssociatedAlgoModel;
			hasAssociatedAlgoModel = (JavaAlgoResourceModel)eResolveProxy(oldHasAssociatedAlgoModel);
			if (hasAssociatedAlgoModel != oldHasAssociatedAlgoModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__HAS_ASSOCIATED_ALGO_MODEL, oldHasAssociatedAlgoModel, hasAssociatedAlgoModel));
			}
		}
		return hasAssociatedAlgoModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaAlgoResourceModel basicGetHasAssociatedAlgoModel() {
		return hasAssociatedAlgoModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasAssociatedAlgoModel(JavaAlgoResourceModel newHasAssociatedAlgoModel) {
		JavaAlgoResourceModel oldHasAssociatedAlgoModel = hasAssociatedAlgoModel;
		hasAssociatedAlgoModel = newHasAssociatedAlgoModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__HAS_ASSOCIATED_ALGO_MODEL, oldHasAssociatedAlgoModel, hasAssociatedAlgoModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPActivity getJavaAlgoRControllerHasHTTPActivity() {
		return javaAlgoRControllerHasHTTPActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJavaAlgoRControllerHasHTTPActivity(HTTPActivity newJavaAlgoRControllerHasHTTPActivity, NotificationChain msgs) {
		HTTPActivity oldJavaAlgoRControllerHasHTTPActivity = javaAlgoRControllerHasHTTPActivity;
		javaAlgoRControllerHasHTTPActivity = newJavaAlgoRControllerHasHTTPActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__JAVA_ALGO_RCONTROLLER_HAS_HTTP_ACTIVITY, oldJavaAlgoRControllerHasHTTPActivity, newJavaAlgoRControllerHasHTTPActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaAlgoRControllerHasHTTPActivity(HTTPActivity newJavaAlgoRControllerHasHTTPActivity) {
		if (newJavaAlgoRControllerHasHTTPActivity != javaAlgoRControllerHasHTTPActivity) {
			NotificationChain msgs = null;
			if (javaAlgoRControllerHasHTTPActivity != null)
				msgs = ((InternalEObject)javaAlgoRControllerHasHTTPActivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__JAVA_ALGO_RCONTROLLER_HAS_HTTP_ACTIVITY, null, msgs);
			if (newJavaAlgoRControllerHasHTTPActivity != null)
				msgs = ((InternalEObject)newJavaAlgoRControllerHasHTTPActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__JAVA_ALGO_RCONTROLLER_HAS_HTTP_ACTIVITY, null, msgs);
			msgs = basicSetJavaAlgoRControllerHasHTTPActivity(newJavaAlgoRControllerHasHTTPActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__JAVA_ALGO_RCONTROLLER_HAS_HTTP_ACTIVITY, newJavaAlgoRControllerHasHTTPActivity, newJavaAlgoRControllerHasHTTPActivity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getControllerURI() {
		return controllerURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControllerURI(String newControllerURI) {
		String oldControllerURI = controllerURI;
		controllerURI = newControllerURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__CONTROLLER_URI, oldControllerURI, controllerURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParentName() {
		return parentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentName(String newParentName) {
		String oldParentName = parentName;
		parentName = newParentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__PARENT_NAME, oldParentName, parentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JAXRSAnnotation getAlgoControllerHasJAXRSAnnotation() {
		return algoControllerHasJAXRSAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlgoControllerHasJAXRSAnnotation(JAXRSAnnotation newAlgoControllerHasJAXRSAnnotation, NotificationChain msgs) {
		JAXRSAnnotation oldAlgoControllerHasJAXRSAnnotation = algoControllerHasJAXRSAnnotation;
		algoControllerHasJAXRSAnnotation = newAlgoControllerHasJAXRSAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_HAS_JAXRS_ANNOTATION, oldAlgoControllerHasJAXRSAnnotation, newAlgoControllerHasJAXRSAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgoControllerHasJAXRSAnnotation(JAXRSAnnotation newAlgoControllerHasJAXRSAnnotation) {
		if (newAlgoControllerHasJAXRSAnnotation != algoControllerHasJAXRSAnnotation) {
			NotificationChain msgs = null;
			if (algoControllerHasJAXRSAnnotation != null)
				msgs = ((InternalEObject)algoControllerHasJAXRSAnnotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_HAS_JAXRS_ANNOTATION, null, msgs);
			if (newAlgoControllerHasJAXRSAnnotation != null)
				msgs = ((InternalEObject)newAlgoControllerHasJAXRSAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_HAS_JAXRS_ANNOTATION, null, msgs);
			msgs = basicSetAlgoControllerHasJAXRSAnnotation(newAlgoControllerHasJAXRSAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_HAS_JAXRS_ANNOTATION, newAlgoControllerHasJAXRSAnnotation, newAlgoControllerHasJAXRSAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__JAVA_ALGO_RCONTROLLER_HAS_HTTP_ACTIVITY:
				return basicSetJavaAlgoRControllerHasHTTPActivity(null, msgs);
			case RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_HAS_JAXRS_ANNOTATION:
				return basicSetAlgoControllerHasJAXRSAnnotation(null, msgs);
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
			case RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__HAS_ASSOCIATED_ALGO_MODEL:
				if (resolve) return getHasAssociatedAlgoModel();
				return basicGetHasAssociatedAlgoModel();
			case RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__JAVA_ALGO_RCONTROLLER_HAS_HTTP_ACTIVITY:
				return getJavaAlgoRControllerHasHTTPActivity();
			case RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__NAME:
				return getName();
			case RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__CONTROLLER_URI:
				return getControllerURI();
			case RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__PARENT_NAME:
				return getParentName();
			case RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_HAS_JAXRS_ANNOTATION:
				return getAlgoControllerHasJAXRSAnnotation();
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
			case RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__HAS_ASSOCIATED_ALGO_MODEL:
				setHasAssociatedAlgoModel((JavaAlgoResourceModel)newValue);
				return;
			case RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__JAVA_ALGO_RCONTROLLER_HAS_HTTP_ACTIVITY:
				setJavaAlgoRControllerHasHTTPActivity((HTTPActivity)newValue);
				return;
			case RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__NAME:
				setName((String)newValue);
				return;
			case RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__CONTROLLER_URI:
				setControllerURI((String)newValue);
				return;
			case RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__PARENT_NAME:
				setParentName((String)newValue);
				return;
			case RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_HAS_JAXRS_ANNOTATION:
				setAlgoControllerHasJAXRSAnnotation((JAXRSAnnotation)newValue);
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
			case RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__HAS_ASSOCIATED_ALGO_MODEL:
				setHasAssociatedAlgoModel((JavaAlgoResourceModel)null);
				return;
			case RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__JAVA_ALGO_RCONTROLLER_HAS_HTTP_ACTIVITY:
				setJavaAlgoRControllerHasHTTPActivity((HTTPActivity)null);
				return;
			case RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__CONTROLLER_URI:
				setControllerURI(CONTROLLER_URI_EDEFAULT);
				return;
			case RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__PARENT_NAME:
				setParentName(PARENT_NAME_EDEFAULT);
				return;
			case RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_HAS_JAXRS_ANNOTATION:
				setAlgoControllerHasJAXRSAnnotation((JAXRSAnnotation)null);
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
			case RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__HAS_ASSOCIATED_ALGO_MODEL:
				return hasAssociatedAlgoModel != null;
			case RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__JAVA_ALGO_RCONTROLLER_HAS_HTTP_ACTIVITY:
				return javaAlgoRControllerHasHTTPActivity != null;
			case RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__CONTROLLER_URI:
				return CONTROLLER_URI_EDEFAULT == null ? controllerURI != null : !CONTROLLER_URI_EDEFAULT.equals(controllerURI);
			case RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__PARENT_NAME:
				return PARENT_NAME_EDEFAULT == null ? parentName != null : !PARENT_NAME_EDEFAULT.equals(parentName);
			case RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_HAS_JAXRS_ANNOTATION:
				return algoControllerHasJAXRSAnnotation != null;
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
		result.append(", controllerURI: ");
		result.append(controllerURI);
		result.append(", parentName: ");
		result.append(parentName);
		result.append(')');
		return result.toString();
	}

} //JavaAlgoResourceControllerImpl
