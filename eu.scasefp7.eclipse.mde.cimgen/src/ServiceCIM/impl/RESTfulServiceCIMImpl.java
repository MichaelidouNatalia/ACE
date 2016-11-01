/**
 */
package ServiceCIM.impl;

import ServiceCIM.RESTfulServiceCIM;
import ServiceCIM.Resource;
import ServiceCIM.ServiceCIMPackage;

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
 * An implementation of the model object '<em><b>RES Tful Service CIM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ServiceCIM.impl.RESTfulServiceCIMImpl#getName <em>Name</em>}</li>
 *   <li>{@link ServiceCIM.impl.RESTfulServiceCIMImpl#getHasResources <em>Has Resources</em>}</li>
 *   <li>{@link ServiceCIM.impl.RESTfulServiceCIMImpl#getServiceOutputPath <em>Service Output Path</em>}</li>
 *   <li>{@link ServiceCIM.impl.RESTfulServiceCIMImpl#getServiceDatabaseIP <em>Service Database IP</em>}</li>
 *   <li>{@link ServiceCIM.impl.RESTfulServiceCIMImpl#getServiceDatabasePort <em>Service Database Port</em>}</li>
 *   <li>{@link ServiceCIM.impl.RESTfulServiceCIMImpl#getServiceDatabaseUsername <em>Service Database Username</em>}</li>
 *   <li>{@link ServiceCIM.impl.RESTfulServiceCIMImpl#getServiceDatabasePassword <em>Service Database Password</em>}</li>
 *   <li>{@link ServiceCIM.impl.RESTfulServiceCIMImpl#getServiceDatabaseType <em>Service Database Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RESTfulServiceCIMImpl extends MinimalEObjectImpl.Container implements RESTfulServiceCIM {
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
	 * The cached value of the '{@link #getHasResources() <em>Has Resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> hasResources;

	/**
	 * The default value of the '{@link #getServiceOutputPath() <em>Service Output Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceOutputPath()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_OUTPUT_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceOutputPath() <em>Service Output Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceOutputPath()
	 * @generated
	 * @ordered
	 */
	protected String serviceOutputPath = SERVICE_OUTPUT_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceDatabaseIP() <em>Service Database IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDatabaseIP()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_DATABASE_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceDatabaseIP() <em>Service Database IP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDatabaseIP()
	 * @generated
	 * @ordered
	 */
	protected String serviceDatabaseIP = SERVICE_DATABASE_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceDatabasePort() <em>Service Database Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDatabasePort()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_DATABASE_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceDatabasePort() <em>Service Database Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDatabasePort()
	 * @generated
	 * @ordered
	 */
	protected String serviceDatabasePort = SERVICE_DATABASE_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceDatabaseUsername() <em>Service Database Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDatabaseUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_DATABASE_USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceDatabaseUsername() <em>Service Database Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDatabaseUsername()
	 * @generated
	 * @ordered
	 */
	protected String serviceDatabaseUsername = SERVICE_DATABASE_USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceDatabasePassword() <em>Service Database Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDatabasePassword()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_DATABASE_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceDatabasePassword() <em>Service Database Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDatabasePassword()
	 * @generated
	 * @ordered
	 */
	protected String serviceDatabasePassword = SERVICE_DATABASE_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceDatabaseType() <em>Service Database Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDatabaseType()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_DATABASE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceDatabaseType() <em>Service Database Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceDatabaseType()
	 * @generated
	 * @ordered
	 */
	protected String serviceDatabaseType = SERVICE_DATABASE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RESTfulServiceCIMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServiceCIMPackage.Literals.RES_TFUL_SERVICE_CIM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServiceCIMPackage.RES_TFUL_SERVICE_CIM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getHasResources() {
		if (hasResources == null) {
			hasResources = new EObjectContainmentEList<Resource>(Resource.class, this, ServiceCIMPackage.RES_TFUL_SERVICE_CIM__HAS_RESOURCES);
		}
		return hasResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceOutputPath() {
		return serviceOutputPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceOutputPath(String newServiceOutputPath) {
		String oldServiceOutputPath = serviceOutputPath;
		serviceOutputPath = newServiceOutputPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServiceCIMPackage.RES_TFUL_SERVICE_CIM__SERVICE_OUTPUT_PATH, oldServiceOutputPath, serviceOutputPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceDatabaseIP() {
		return serviceDatabaseIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDatabaseIP(String newServiceDatabaseIP) {
		String oldServiceDatabaseIP = serviceDatabaseIP;
		serviceDatabaseIP = newServiceDatabaseIP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServiceCIMPackage.RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_IP, oldServiceDatabaseIP, serviceDatabaseIP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceDatabasePort() {
		return serviceDatabasePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDatabasePort(String newServiceDatabasePort) {
		String oldServiceDatabasePort = serviceDatabasePort;
		serviceDatabasePort = newServiceDatabasePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServiceCIMPackage.RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_PORT, oldServiceDatabasePort, serviceDatabasePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceDatabaseUsername() {
		return serviceDatabaseUsername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDatabaseUsername(String newServiceDatabaseUsername) {
		String oldServiceDatabaseUsername = serviceDatabaseUsername;
		serviceDatabaseUsername = newServiceDatabaseUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServiceCIMPackage.RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_USERNAME, oldServiceDatabaseUsername, serviceDatabaseUsername));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceDatabasePassword() {
		return serviceDatabasePassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDatabasePassword(String newServiceDatabasePassword) {
		String oldServiceDatabasePassword = serviceDatabasePassword;
		serviceDatabasePassword = newServiceDatabasePassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServiceCIMPackage.RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_PASSWORD, oldServiceDatabasePassword, serviceDatabasePassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceDatabaseType() {
		return serviceDatabaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceDatabaseType(String newServiceDatabaseType) {
		String oldServiceDatabaseType = serviceDatabaseType;
		serviceDatabaseType = newServiceDatabaseType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServiceCIMPackage.RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_TYPE, oldServiceDatabaseType, serviceDatabaseType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServiceCIMPackage.RES_TFUL_SERVICE_CIM__HAS_RESOURCES:
				return ((InternalEList<?>)getHasResources()).basicRemove(otherEnd, msgs);
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
			case ServiceCIMPackage.RES_TFUL_SERVICE_CIM__NAME:
				return getName();
			case ServiceCIMPackage.RES_TFUL_SERVICE_CIM__HAS_RESOURCES:
				return getHasResources();
			case ServiceCIMPackage.RES_TFUL_SERVICE_CIM__SERVICE_OUTPUT_PATH:
				return getServiceOutputPath();
			case ServiceCIMPackage.RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_IP:
				return getServiceDatabaseIP();
			case ServiceCIMPackage.RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_PORT:
				return getServiceDatabasePort();
			case ServiceCIMPackage.RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_USERNAME:
				return getServiceDatabaseUsername();
			case ServiceCIMPackage.RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_PASSWORD:
				return getServiceDatabasePassword();
			case ServiceCIMPackage.RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_TYPE:
				return getServiceDatabaseType();
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
			case ServiceCIMPackage.RES_TFUL_SERVICE_CIM__NAME:
				setName((String)newValue);
				return;
			case ServiceCIMPackage.RES_TFUL_SERVICE_CIM__HAS_RESOURCES:
				getHasResources().clear();
				getHasResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case ServiceCIMPackage.RES_TFUL_SERVICE_CIM__SERVICE_OUTPUT_PATH:
				setServiceOutputPath((String)newValue);
				return;
			case ServiceCIMPackage.RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_IP:
				setServiceDatabaseIP((String)newValue);
				return;
			case ServiceCIMPackage.RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_PORT:
				setServiceDatabasePort((String)newValue);
				return;
			case ServiceCIMPackage.RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_USERNAME:
				setServiceDatabaseUsername((String)newValue);
				return;
			case ServiceCIMPackage.RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_PASSWORD:
				setServiceDatabasePassword((String)newValue);
				return;
			case ServiceCIMPackage.RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_TYPE:
				setServiceDatabaseType((String)newValue);
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
			case ServiceCIMPackage.RES_TFUL_SERVICE_CIM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ServiceCIMPackage.RES_TFUL_SERVICE_CIM__HAS_RESOURCES:
				getHasResources().clear();
				return;
			case ServiceCIMPackage.RES_TFUL_SERVICE_CIM__SERVICE_OUTPUT_PATH:
				setServiceOutputPath(SERVICE_OUTPUT_PATH_EDEFAULT);
				return;
			case ServiceCIMPackage.RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_IP:
				setServiceDatabaseIP(SERVICE_DATABASE_IP_EDEFAULT);
				return;
			case ServiceCIMPackage.RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_PORT:
				setServiceDatabasePort(SERVICE_DATABASE_PORT_EDEFAULT);
				return;
			case ServiceCIMPackage.RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_USERNAME:
				setServiceDatabaseUsername(SERVICE_DATABASE_USERNAME_EDEFAULT);
				return;
			case ServiceCIMPackage.RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_PASSWORD:
				setServiceDatabasePassword(SERVICE_DATABASE_PASSWORD_EDEFAULT);
				return;
			case ServiceCIMPackage.RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_TYPE:
				setServiceDatabaseType(SERVICE_DATABASE_TYPE_EDEFAULT);
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
			case ServiceCIMPackage.RES_TFUL_SERVICE_CIM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ServiceCIMPackage.RES_TFUL_SERVICE_CIM__HAS_RESOURCES:
				return hasResources != null && !hasResources.isEmpty();
			case ServiceCIMPackage.RES_TFUL_SERVICE_CIM__SERVICE_OUTPUT_PATH:
				return SERVICE_OUTPUT_PATH_EDEFAULT == null ? serviceOutputPath != null : !SERVICE_OUTPUT_PATH_EDEFAULT.equals(serviceOutputPath);
			case ServiceCIMPackage.RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_IP:
				return SERVICE_DATABASE_IP_EDEFAULT == null ? serviceDatabaseIP != null : !SERVICE_DATABASE_IP_EDEFAULT.equals(serviceDatabaseIP);
			case ServiceCIMPackage.RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_PORT:
				return SERVICE_DATABASE_PORT_EDEFAULT == null ? serviceDatabasePort != null : !SERVICE_DATABASE_PORT_EDEFAULT.equals(serviceDatabasePort);
			case ServiceCIMPackage.RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_USERNAME:
				return SERVICE_DATABASE_USERNAME_EDEFAULT == null ? serviceDatabaseUsername != null : !SERVICE_DATABASE_USERNAME_EDEFAULT.equals(serviceDatabaseUsername);
			case ServiceCIMPackage.RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_PASSWORD:
				return SERVICE_DATABASE_PASSWORD_EDEFAULT == null ? serviceDatabasePassword != null : !SERVICE_DATABASE_PASSWORD_EDEFAULT.equals(serviceDatabasePassword);
			case ServiceCIMPackage.RES_TFUL_SERVICE_CIM__SERVICE_DATABASE_TYPE:
				return SERVICE_DATABASE_TYPE_EDEFAULT == null ? serviceDatabaseType != null : !SERVICE_DATABASE_TYPE_EDEFAULT.equals(serviceDatabaseType);
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
		result.append(", serviceOutputPath: ");
		result.append(serviceOutputPath);
		result.append(", serviceDatabaseIP: ");
		result.append(serviceDatabaseIP);
		result.append(", serviceDatabasePort: ");
		result.append(serviceDatabasePort);
		result.append(", serviceDatabaseUsername: ");
		result.append(serviceDatabaseUsername);
		result.append(", serviceDatabasePassword: ");
		result.append(serviceDatabasePassword);
		result.append(", serviceDatabaseType: ");
		result.append(serviceDatabaseType);
		result.append(')');
		return result.toString();
	}

} //RESTfulServiceCIMImpl
