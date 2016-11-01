/**
 */
package RESTfulServicePSM.impl;

import RESTfulServicePSM.HTTPActivity;
import RESTfulServicePSM.JAXRSAnnotation;
import RESTfulServicePSM.JavaResourceController;
import RESTfulServicePSM.JavaResourceModel;
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
 * An implementation of the model object '<em><b>Java Resource Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RESTfulServicePSM.impl.JavaResourceControllerImpl#getJavaRControllerHasJAXRSAnnotation <em>Java RController Has JAXRS Annotation</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.JavaResourceControllerImpl#getJavaRControllerHasHTTPActivity <em>Java RController Has HTTP Activity</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.JavaResourceControllerImpl#getHasAssociatedJavaRModel <em>Has Associated Java RModel</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.JavaResourceControllerImpl#getName <em>Name</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.JavaResourceControllerImpl#getControllerURI <em>Controller URI</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.JavaResourceControllerImpl#getParentName <em>Parent Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaResourceControllerImpl extends MinimalEObjectImpl.Container implements JavaResourceController {
	/**
	 * The cached value of the '{@link #getJavaRControllerHasJAXRSAnnotation() <em>Java RController Has JAXRS Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaRControllerHasJAXRSAnnotation()
	 * @generated
	 * @ordered
	 */
	protected JAXRSAnnotation javaRControllerHasJAXRSAnnotation;

	/**
	 * The cached value of the '{@link #getJavaRControllerHasHTTPActivity() <em>Java RController Has HTTP Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaRControllerHasHTTPActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<HTTPActivity> javaRControllerHasHTTPActivity;

	/**
	 * The cached value of the '{@link #getHasAssociatedJavaRModel() <em>Has Associated Java RModel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAssociatedJavaRModel()
	 * @generated
	 * @ordered
	 */
	protected JavaResourceModel hasAssociatedJavaRModel;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaResourceControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTfulServicePSMPackage.Literals.JAVA_RESOURCE_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JAXRSAnnotation getJavaRControllerHasJAXRSAnnotation() {
		return javaRControllerHasJAXRSAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJavaRControllerHasJAXRSAnnotation(JAXRSAnnotation newJavaRControllerHasJAXRSAnnotation, NotificationChain msgs) {
		JAXRSAnnotation oldJavaRControllerHasJAXRSAnnotation = javaRControllerHasJAXRSAnnotation;
		javaRControllerHasJAXRSAnnotation = newJavaRControllerHasJAXRSAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__JAVA_RCONTROLLER_HAS_JAXRS_ANNOTATION, oldJavaRControllerHasJAXRSAnnotation, newJavaRControllerHasJAXRSAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaRControllerHasJAXRSAnnotation(JAXRSAnnotation newJavaRControllerHasJAXRSAnnotation) {
		if (newJavaRControllerHasJAXRSAnnotation != javaRControllerHasJAXRSAnnotation) {
			NotificationChain msgs = null;
			if (javaRControllerHasJAXRSAnnotation != null)
				msgs = ((InternalEObject)javaRControllerHasJAXRSAnnotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__JAVA_RCONTROLLER_HAS_JAXRS_ANNOTATION, null, msgs);
			if (newJavaRControllerHasJAXRSAnnotation != null)
				msgs = ((InternalEObject)newJavaRControllerHasJAXRSAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__JAVA_RCONTROLLER_HAS_JAXRS_ANNOTATION, null, msgs);
			msgs = basicSetJavaRControllerHasJAXRSAnnotation(newJavaRControllerHasJAXRSAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__JAVA_RCONTROLLER_HAS_JAXRS_ANNOTATION, newJavaRControllerHasJAXRSAnnotation, newJavaRControllerHasJAXRSAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HTTPActivity> getJavaRControllerHasHTTPActivity() {
		if (javaRControllerHasHTTPActivity == null) {
			javaRControllerHasHTTPActivity = new EObjectContainmentEList<HTTPActivity>(HTTPActivity.class, this, RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__JAVA_RCONTROLLER_HAS_HTTP_ACTIVITY);
		}
		return javaRControllerHasHTTPActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaResourceModel getHasAssociatedJavaRModel() {
		if (hasAssociatedJavaRModel != null && hasAssociatedJavaRModel.eIsProxy()) {
			InternalEObject oldHasAssociatedJavaRModel = (InternalEObject)hasAssociatedJavaRModel;
			hasAssociatedJavaRModel = (JavaResourceModel)eResolveProxy(oldHasAssociatedJavaRModel);
			if (hasAssociatedJavaRModel != oldHasAssociatedJavaRModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__HAS_ASSOCIATED_JAVA_RMODEL, oldHasAssociatedJavaRModel, hasAssociatedJavaRModel));
			}
		}
		return hasAssociatedJavaRModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaResourceModel basicGetHasAssociatedJavaRModel() {
		return hasAssociatedJavaRModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasAssociatedJavaRModel(JavaResourceModel newHasAssociatedJavaRModel) {
		JavaResourceModel oldHasAssociatedJavaRModel = hasAssociatedJavaRModel;
		hasAssociatedJavaRModel = newHasAssociatedJavaRModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__HAS_ASSOCIATED_JAVA_RMODEL, oldHasAssociatedJavaRModel, hasAssociatedJavaRModel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__CONTROLLER_URI, oldControllerURI, controllerURI));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__PARENT_NAME, oldParentName, parentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__JAVA_RCONTROLLER_HAS_JAXRS_ANNOTATION:
				return basicSetJavaRControllerHasJAXRSAnnotation(null, msgs);
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__JAVA_RCONTROLLER_HAS_HTTP_ACTIVITY:
				return ((InternalEList<?>)getJavaRControllerHasHTTPActivity()).basicRemove(otherEnd, msgs);
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
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__JAVA_RCONTROLLER_HAS_JAXRS_ANNOTATION:
				return getJavaRControllerHasJAXRSAnnotation();
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__JAVA_RCONTROLLER_HAS_HTTP_ACTIVITY:
				return getJavaRControllerHasHTTPActivity();
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__HAS_ASSOCIATED_JAVA_RMODEL:
				if (resolve) return getHasAssociatedJavaRModel();
				return basicGetHasAssociatedJavaRModel();
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__NAME:
				return getName();
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__CONTROLLER_URI:
				return getControllerURI();
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__PARENT_NAME:
				return getParentName();
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
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__JAVA_RCONTROLLER_HAS_JAXRS_ANNOTATION:
				setJavaRControllerHasJAXRSAnnotation((JAXRSAnnotation)newValue);
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__JAVA_RCONTROLLER_HAS_HTTP_ACTIVITY:
				getJavaRControllerHasHTTPActivity().clear();
				getJavaRControllerHasHTTPActivity().addAll((Collection<? extends HTTPActivity>)newValue);
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__HAS_ASSOCIATED_JAVA_RMODEL:
				setHasAssociatedJavaRModel((JavaResourceModel)newValue);
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__NAME:
				setName((String)newValue);
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__CONTROLLER_URI:
				setControllerURI((String)newValue);
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__PARENT_NAME:
				setParentName((String)newValue);
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
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__JAVA_RCONTROLLER_HAS_JAXRS_ANNOTATION:
				setJavaRControllerHasJAXRSAnnotation((JAXRSAnnotation)null);
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__JAVA_RCONTROLLER_HAS_HTTP_ACTIVITY:
				getJavaRControllerHasHTTPActivity().clear();
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__HAS_ASSOCIATED_JAVA_RMODEL:
				setHasAssociatedJavaRModel((JavaResourceModel)null);
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__CONTROLLER_URI:
				setControllerURI(CONTROLLER_URI_EDEFAULT);
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__PARENT_NAME:
				setParentName(PARENT_NAME_EDEFAULT);
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
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__JAVA_RCONTROLLER_HAS_JAXRS_ANNOTATION:
				return javaRControllerHasJAXRSAnnotation != null;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__JAVA_RCONTROLLER_HAS_HTTP_ACTIVITY:
				return javaRControllerHasHTTPActivity != null && !javaRControllerHasHTTPActivity.isEmpty();
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__HAS_ASSOCIATED_JAVA_RMODEL:
				return hasAssociatedJavaRModel != null;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__CONTROLLER_URI:
				return CONTROLLER_URI_EDEFAULT == null ? controllerURI != null : !CONTROLLER_URI_EDEFAULT.equals(controllerURI);
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER__PARENT_NAME:
				return PARENT_NAME_EDEFAULT == null ? parentName != null : !PARENT_NAME_EDEFAULT.equals(parentName);
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

} //JavaResourceControllerImpl
