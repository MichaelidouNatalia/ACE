/**
 */
package RESTfulServicePSM.impl;

import RESTfulServicePSM.HTTPActivity;
import RESTfulServicePSM.JAXRSAnnotation;
import RESTfulServicePSM.JavaResourceControllerManager;
import RESTfulServicePSM.JavaResourceModelManager;
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
 * An implementation of the model object '<em><b>Java Resource Controller Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RESTfulServicePSM.impl.JavaResourceControllerManagerImpl#getJavaRCManagerHasJAXRSAnnotation <em>Java RC Manager Has JAXRS Annotation</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.JavaResourceControllerManagerImpl#getJavaRCManagerHasHTTPActivity <em>Java RC Manager Has HTTP Activity</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.JavaResourceControllerManagerImpl#getHasAssociatedRMManager <em>Has Associated RM Manager</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.JavaResourceControllerManagerImpl#getName <em>Name</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.JavaResourceControllerManagerImpl#getControllerURI <em>Controller URI</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.JavaResourceControllerManagerImpl#getParentName <em>Parent Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaResourceControllerManagerImpl extends MinimalEObjectImpl.Container implements JavaResourceControllerManager {
	/**
	 * The cached value of the '{@link #getJavaRCManagerHasJAXRSAnnotation() <em>Java RC Manager Has JAXRS Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaRCManagerHasJAXRSAnnotation()
	 * @generated
	 * @ordered
	 */
	protected JAXRSAnnotation javaRCManagerHasJAXRSAnnotation;

	/**
	 * The cached value of the '{@link #getJavaRCManagerHasHTTPActivity() <em>Java RC Manager Has HTTP Activity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaRCManagerHasHTTPActivity()
	 * @generated
	 * @ordered
	 */
	protected EList<HTTPActivity> javaRCManagerHasHTTPActivity;

	/**
	 * The cached value of the '{@link #getHasAssociatedRMManager() <em>Has Associated RM Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAssociatedRMManager()
	 * @generated
	 * @ordered
	 */
	protected JavaResourceModelManager hasAssociatedRMManager;

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
	protected JavaResourceControllerManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTfulServicePSMPackage.Literals.JAVA_RESOURCE_CONTROLLER_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JAXRSAnnotation getJavaRCManagerHasJAXRSAnnotation() {
		return javaRCManagerHasJAXRSAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJavaRCManagerHasJAXRSAnnotation(JAXRSAnnotation newJavaRCManagerHasJAXRSAnnotation, NotificationChain msgs) {
		JAXRSAnnotation oldJavaRCManagerHasJAXRSAnnotation = javaRCManagerHasJAXRSAnnotation;
		javaRCManagerHasJAXRSAnnotation = newJavaRCManagerHasJAXRSAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__JAVA_RC_MANAGER_HAS_JAXRS_ANNOTATION, oldJavaRCManagerHasJAXRSAnnotation, newJavaRCManagerHasJAXRSAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaRCManagerHasJAXRSAnnotation(JAXRSAnnotation newJavaRCManagerHasJAXRSAnnotation) {
		if (newJavaRCManagerHasJAXRSAnnotation != javaRCManagerHasJAXRSAnnotation) {
			NotificationChain msgs = null;
			if (javaRCManagerHasJAXRSAnnotation != null)
				msgs = ((InternalEObject)javaRCManagerHasJAXRSAnnotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__JAVA_RC_MANAGER_HAS_JAXRS_ANNOTATION, null, msgs);
			if (newJavaRCManagerHasJAXRSAnnotation != null)
				msgs = ((InternalEObject)newJavaRCManagerHasJAXRSAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__JAVA_RC_MANAGER_HAS_JAXRS_ANNOTATION, null, msgs);
			msgs = basicSetJavaRCManagerHasJAXRSAnnotation(newJavaRCManagerHasJAXRSAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__JAVA_RC_MANAGER_HAS_JAXRS_ANNOTATION, newJavaRCManagerHasJAXRSAnnotation, newJavaRCManagerHasJAXRSAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HTTPActivity> getJavaRCManagerHasHTTPActivity() {
		if (javaRCManagerHasHTTPActivity == null) {
			javaRCManagerHasHTTPActivity = new EObjectContainmentEList<HTTPActivity>(HTTPActivity.class, this, RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__JAVA_RC_MANAGER_HAS_HTTP_ACTIVITY);
		}
		return javaRCManagerHasHTTPActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaResourceModelManager getHasAssociatedRMManager() {
		if (hasAssociatedRMManager != null && hasAssociatedRMManager.eIsProxy()) {
			InternalEObject oldHasAssociatedRMManager = (InternalEObject)hasAssociatedRMManager;
			hasAssociatedRMManager = (JavaResourceModelManager)eResolveProxy(oldHasAssociatedRMManager);
			if (hasAssociatedRMManager != oldHasAssociatedRMManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__HAS_ASSOCIATED_RM_MANAGER, oldHasAssociatedRMManager, hasAssociatedRMManager));
			}
		}
		return hasAssociatedRMManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaResourceModelManager basicGetHasAssociatedRMManager() {
		return hasAssociatedRMManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasAssociatedRMManager(JavaResourceModelManager newHasAssociatedRMManager) {
		JavaResourceModelManager oldHasAssociatedRMManager = hasAssociatedRMManager;
		hasAssociatedRMManager = newHasAssociatedRMManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__HAS_ASSOCIATED_RM_MANAGER, oldHasAssociatedRMManager, hasAssociatedRMManager));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__CONTROLLER_URI, oldControllerURI, controllerURI));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__PARENT_NAME, oldParentName, parentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__JAVA_RC_MANAGER_HAS_JAXRS_ANNOTATION:
				return basicSetJavaRCManagerHasJAXRSAnnotation(null, msgs);
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__JAVA_RC_MANAGER_HAS_HTTP_ACTIVITY:
				return ((InternalEList<?>)getJavaRCManagerHasHTTPActivity()).basicRemove(otherEnd, msgs);
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
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__JAVA_RC_MANAGER_HAS_JAXRS_ANNOTATION:
				return getJavaRCManagerHasJAXRSAnnotation();
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__JAVA_RC_MANAGER_HAS_HTTP_ACTIVITY:
				return getJavaRCManagerHasHTTPActivity();
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__HAS_ASSOCIATED_RM_MANAGER:
				if (resolve) return getHasAssociatedRMManager();
				return basicGetHasAssociatedRMManager();
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__NAME:
				return getName();
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__CONTROLLER_URI:
				return getControllerURI();
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__PARENT_NAME:
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
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__JAVA_RC_MANAGER_HAS_JAXRS_ANNOTATION:
				setJavaRCManagerHasJAXRSAnnotation((JAXRSAnnotation)newValue);
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__JAVA_RC_MANAGER_HAS_HTTP_ACTIVITY:
				getJavaRCManagerHasHTTPActivity().clear();
				getJavaRCManagerHasHTTPActivity().addAll((Collection<? extends HTTPActivity>)newValue);
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__HAS_ASSOCIATED_RM_MANAGER:
				setHasAssociatedRMManager((JavaResourceModelManager)newValue);
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__NAME:
				setName((String)newValue);
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__CONTROLLER_URI:
				setControllerURI((String)newValue);
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__PARENT_NAME:
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
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__JAVA_RC_MANAGER_HAS_JAXRS_ANNOTATION:
				setJavaRCManagerHasJAXRSAnnotation((JAXRSAnnotation)null);
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__JAVA_RC_MANAGER_HAS_HTTP_ACTIVITY:
				getJavaRCManagerHasHTTPActivity().clear();
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__HAS_ASSOCIATED_RM_MANAGER:
				setHasAssociatedRMManager((JavaResourceModelManager)null);
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__CONTROLLER_URI:
				setControllerURI(CONTROLLER_URI_EDEFAULT);
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__PARENT_NAME:
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
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__JAVA_RC_MANAGER_HAS_JAXRS_ANNOTATION:
				return javaRCManagerHasJAXRSAnnotation != null;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__JAVA_RC_MANAGER_HAS_HTTP_ACTIVITY:
				return javaRCManagerHasHTTPActivity != null && !javaRCManagerHasHTTPActivity.isEmpty();
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__HAS_ASSOCIATED_RM_MANAGER:
				return hasAssociatedRMManager != null;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__CONTROLLER_URI:
				return CONTROLLER_URI_EDEFAULT == null ? controllerURI != null : !CONTROLLER_URI_EDEFAULT.equals(controllerURI);
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER__PARENT_NAME:
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

} //JavaResourceControllerManagerImpl
