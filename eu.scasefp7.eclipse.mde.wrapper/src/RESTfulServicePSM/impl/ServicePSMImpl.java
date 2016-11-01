/**
 */
package RESTfulServicePSM.impl;

import RESTfulServicePSM.HibernateController;
import RESTfulServicePSM.JavaAlgoResourceController;
import RESTfulServicePSM.JavaAlgoResourceModel;
import RESTfulServicePSM.JavaResourceController;
import RESTfulServicePSM.JavaResourceControllerManager;
import RESTfulServicePSM.JavaResourceModel;
import RESTfulServicePSM.JavaResourceModelManager;
import RESTfulServicePSM.RESTfulServicePSMPackage;
import RESTfulServicePSM.ServicePSM;

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
 * An implementation of the model object '<em><b>Service PSM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RESTfulServicePSM.impl.ServicePSMImpl#getHasJavaRModel <em>Has Java RModel</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.ServicePSMImpl#getHasJavaRController <em>Has Java RController</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.ServicePSMImpl#getHasJavaRCManager <em>Has Java RC Manager</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.ServicePSMImpl#getHasJavaRMManager <em>Has Java RM Manager</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.ServicePSMImpl#getHasJavaAlgoModel <em>Has Java Algo Model</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.ServicePSMImpl#getHasJavaAlgoController <em>Has Java Algo Controller</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.ServicePSMImpl#getHasHibernateController <em>Has Hibernate Controller</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.ServicePSMImpl#getName <em>Name</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.ServicePSMImpl#getServiceOutputPath <em>Service Output Path</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.ServicePSMImpl#getServiceDatabaseIP <em>Service Database IP</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.ServicePSMImpl#getServiceDatabasePort <em>Service Database Port</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.ServicePSMImpl#getServiceDatabaseUsername <em>Service Database Username</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.ServicePSMImpl#getServiceDatabasePassword <em>Service Database Password</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.ServicePSMImpl#getServiceDatabaseType <em>Service Database Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServicePSMImpl extends MinimalEObjectImpl.Container implements ServicePSM {
	/**
	 * The cached value of the '{@link #getHasJavaRModel() <em>Has Java RModel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasJavaRModel()
	 * @generated
	 * @ordered
	 */
	protected EList<JavaResourceModel> hasJavaRModel;

	/**
	 * The cached value of the '{@link #getHasJavaRController() <em>Has Java RController</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasJavaRController()
	 * @generated
	 * @ordered
	 */
	protected EList<JavaResourceController> hasJavaRController;

	/**
	 * The cached value of the '{@link #getHasJavaRCManager() <em>Has Java RC Manager</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasJavaRCManager()
	 * @generated
	 * @ordered
	 */
	protected EList<JavaResourceControllerManager> hasJavaRCManager;

	/**
	 * The cached value of the '{@link #getHasJavaRMManager() <em>Has Java RM Manager</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasJavaRMManager()
	 * @generated
	 * @ordered
	 */
	protected EList<JavaResourceModelManager> hasJavaRMManager;

	/**
	 * The cached value of the '{@link #getHasJavaAlgoModel() <em>Has Java Algo Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasJavaAlgoModel()
	 * @generated
	 * @ordered
	 */
	protected EList<JavaAlgoResourceModel> hasJavaAlgoModel;

	/**
	 * The cached value of the '{@link #getHasJavaAlgoController() <em>Has Java Algo Controller</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasJavaAlgoController()
	 * @generated
	 * @ordered
	 */
	protected EList<JavaAlgoResourceController> hasJavaAlgoController;

	/**
	 * The cached value of the '{@link #getHasHibernateController() <em>Has Hibernate Controller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasHibernateController()
	 * @generated
	 * @ordered
	 */
	protected HibernateController hasHibernateController;

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
	protected ServicePSMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTfulServicePSMPackage.Literals.SERVICE_PSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JavaResourceModel> getHasJavaRModel() {
		if (hasJavaRModel == null) {
			hasJavaRModel = new EObjectContainmentEList<JavaResourceModel>(JavaResourceModel.class, this, RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_RMODEL);
		}
		return hasJavaRModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JavaResourceController> getHasJavaRController() {
		if (hasJavaRController == null) {
			hasJavaRController = new EObjectContainmentEList<JavaResourceController>(JavaResourceController.class, this, RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_RCONTROLLER);
		}
		return hasJavaRController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JavaResourceControllerManager> getHasJavaRCManager() {
		if (hasJavaRCManager == null) {
			hasJavaRCManager = new EObjectContainmentEList<JavaResourceControllerManager>(JavaResourceControllerManager.class, this, RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_RC_MANAGER);
		}
		return hasJavaRCManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JavaResourceModelManager> getHasJavaRMManager() {
		if (hasJavaRMManager == null) {
			hasJavaRMManager = new EObjectContainmentEList<JavaResourceModelManager>(JavaResourceModelManager.class, this, RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_RM_MANAGER);
		}
		return hasJavaRMManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JavaAlgoResourceModel> getHasJavaAlgoModel() {
		if (hasJavaAlgoModel == null) {
			hasJavaAlgoModel = new EObjectContainmentEList<JavaAlgoResourceModel>(JavaAlgoResourceModel.class, this, RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_ALGO_MODEL);
		}
		return hasJavaAlgoModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JavaAlgoResourceController> getHasJavaAlgoController() {
		if (hasJavaAlgoController == null) {
			hasJavaAlgoController = new EObjectContainmentEList<JavaAlgoResourceController>(JavaAlgoResourceController.class, this, RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_ALGO_CONTROLLER);
		}
		return hasJavaAlgoController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HibernateController getHasHibernateController() {
		return hasHibernateController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasHibernateController(HibernateController newHasHibernateController, NotificationChain msgs) {
		HibernateController oldHasHibernateController = hasHibernateController;
		hasHibernateController = newHasHibernateController;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.SERVICE_PSM__HAS_HIBERNATE_CONTROLLER, oldHasHibernateController, newHasHibernateController);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasHibernateController(HibernateController newHasHibernateController) {
		if (newHasHibernateController != hasHibernateController) {
			NotificationChain msgs = null;
			if (hasHibernateController != null)
				msgs = ((InternalEObject)hasHibernateController).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RESTfulServicePSMPackage.SERVICE_PSM__HAS_HIBERNATE_CONTROLLER, null, msgs);
			if (newHasHibernateController != null)
				msgs = ((InternalEObject)newHasHibernateController).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RESTfulServicePSMPackage.SERVICE_PSM__HAS_HIBERNATE_CONTROLLER, null, msgs);
			msgs = basicSetHasHibernateController(newHasHibernateController, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.SERVICE_PSM__HAS_HIBERNATE_CONTROLLER, newHasHibernateController, newHasHibernateController));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.SERVICE_PSM__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.SERVICE_PSM__SERVICE_OUTPUT_PATH, oldServiceOutputPath, serviceOutputPath));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.SERVICE_PSM__SERVICE_DATABASE_IP, oldServiceDatabaseIP, serviceDatabaseIP));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.SERVICE_PSM__SERVICE_DATABASE_PORT, oldServiceDatabasePort, serviceDatabasePort));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.SERVICE_PSM__SERVICE_DATABASE_USERNAME, oldServiceDatabaseUsername, serviceDatabaseUsername));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.SERVICE_PSM__SERVICE_DATABASE_PASSWORD, oldServiceDatabasePassword, serviceDatabasePassword));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.SERVICE_PSM__SERVICE_DATABASE_TYPE, oldServiceDatabaseType, serviceDatabaseType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_RMODEL:
				return ((InternalEList<?>)getHasJavaRModel()).basicRemove(otherEnd, msgs);
			case RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_RCONTROLLER:
				return ((InternalEList<?>)getHasJavaRController()).basicRemove(otherEnd, msgs);
			case RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_RC_MANAGER:
				return ((InternalEList<?>)getHasJavaRCManager()).basicRemove(otherEnd, msgs);
			case RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_RM_MANAGER:
				return ((InternalEList<?>)getHasJavaRMManager()).basicRemove(otherEnd, msgs);
			case RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_ALGO_MODEL:
				return ((InternalEList<?>)getHasJavaAlgoModel()).basicRemove(otherEnd, msgs);
			case RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_ALGO_CONTROLLER:
				return ((InternalEList<?>)getHasJavaAlgoController()).basicRemove(otherEnd, msgs);
			case RESTfulServicePSMPackage.SERVICE_PSM__HAS_HIBERNATE_CONTROLLER:
				return basicSetHasHibernateController(null, msgs);
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
			case RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_RMODEL:
				return getHasJavaRModel();
			case RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_RCONTROLLER:
				return getHasJavaRController();
			case RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_RC_MANAGER:
				return getHasJavaRCManager();
			case RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_RM_MANAGER:
				return getHasJavaRMManager();
			case RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_ALGO_MODEL:
				return getHasJavaAlgoModel();
			case RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_ALGO_CONTROLLER:
				return getHasJavaAlgoController();
			case RESTfulServicePSMPackage.SERVICE_PSM__HAS_HIBERNATE_CONTROLLER:
				return getHasHibernateController();
			case RESTfulServicePSMPackage.SERVICE_PSM__NAME:
				return getName();
			case RESTfulServicePSMPackage.SERVICE_PSM__SERVICE_OUTPUT_PATH:
				return getServiceOutputPath();
			case RESTfulServicePSMPackage.SERVICE_PSM__SERVICE_DATABASE_IP:
				return getServiceDatabaseIP();
			case RESTfulServicePSMPackage.SERVICE_PSM__SERVICE_DATABASE_PORT:
				return getServiceDatabasePort();
			case RESTfulServicePSMPackage.SERVICE_PSM__SERVICE_DATABASE_USERNAME:
				return getServiceDatabaseUsername();
			case RESTfulServicePSMPackage.SERVICE_PSM__SERVICE_DATABASE_PASSWORD:
				return getServiceDatabasePassword();
			case RESTfulServicePSMPackage.SERVICE_PSM__SERVICE_DATABASE_TYPE:
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
			case RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_RMODEL:
				getHasJavaRModel().clear();
				getHasJavaRModel().addAll((Collection<? extends JavaResourceModel>)newValue);
				return;
			case RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_RCONTROLLER:
				getHasJavaRController().clear();
				getHasJavaRController().addAll((Collection<? extends JavaResourceController>)newValue);
				return;
			case RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_RC_MANAGER:
				getHasJavaRCManager().clear();
				getHasJavaRCManager().addAll((Collection<? extends JavaResourceControllerManager>)newValue);
				return;
			case RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_RM_MANAGER:
				getHasJavaRMManager().clear();
				getHasJavaRMManager().addAll((Collection<? extends JavaResourceModelManager>)newValue);
				return;
			case RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_ALGO_MODEL:
				getHasJavaAlgoModel().clear();
				getHasJavaAlgoModel().addAll((Collection<? extends JavaAlgoResourceModel>)newValue);
				return;
			case RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_ALGO_CONTROLLER:
				getHasJavaAlgoController().clear();
				getHasJavaAlgoController().addAll((Collection<? extends JavaAlgoResourceController>)newValue);
				return;
			case RESTfulServicePSMPackage.SERVICE_PSM__HAS_HIBERNATE_CONTROLLER:
				setHasHibernateController((HibernateController)newValue);
				return;
			case RESTfulServicePSMPackage.SERVICE_PSM__NAME:
				setName((String)newValue);
				return;
			case RESTfulServicePSMPackage.SERVICE_PSM__SERVICE_OUTPUT_PATH:
				setServiceOutputPath((String)newValue);
				return;
			case RESTfulServicePSMPackage.SERVICE_PSM__SERVICE_DATABASE_IP:
				setServiceDatabaseIP((String)newValue);
				return;
			case RESTfulServicePSMPackage.SERVICE_PSM__SERVICE_DATABASE_PORT:
				setServiceDatabasePort((String)newValue);
				return;
			case RESTfulServicePSMPackage.SERVICE_PSM__SERVICE_DATABASE_USERNAME:
				setServiceDatabaseUsername((String)newValue);
				return;
			case RESTfulServicePSMPackage.SERVICE_PSM__SERVICE_DATABASE_PASSWORD:
				setServiceDatabasePassword((String)newValue);
				return;
			case RESTfulServicePSMPackage.SERVICE_PSM__SERVICE_DATABASE_TYPE:
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
			case RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_RMODEL:
				getHasJavaRModel().clear();
				return;
			case RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_RCONTROLLER:
				getHasJavaRController().clear();
				return;
			case RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_RC_MANAGER:
				getHasJavaRCManager().clear();
				return;
			case RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_RM_MANAGER:
				getHasJavaRMManager().clear();
				return;
			case RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_ALGO_MODEL:
				getHasJavaAlgoModel().clear();
				return;
			case RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_ALGO_CONTROLLER:
				getHasJavaAlgoController().clear();
				return;
			case RESTfulServicePSMPackage.SERVICE_PSM__HAS_HIBERNATE_CONTROLLER:
				setHasHibernateController((HibernateController)null);
				return;
			case RESTfulServicePSMPackage.SERVICE_PSM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RESTfulServicePSMPackage.SERVICE_PSM__SERVICE_OUTPUT_PATH:
				setServiceOutputPath(SERVICE_OUTPUT_PATH_EDEFAULT);
				return;
			case RESTfulServicePSMPackage.SERVICE_PSM__SERVICE_DATABASE_IP:
				setServiceDatabaseIP(SERVICE_DATABASE_IP_EDEFAULT);
				return;
			case RESTfulServicePSMPackage.SERVICE_PSM__SERVICE_DATABASE_PORT:
				setServiceDatabasePort(SERVICE_DATABASE_PORT_EDEFAULT);
				return;
			case RESTfulServicePSMPackage.SERVICE_PSM__SERVICE_DATABASE_USERNAME:
				setServiceDatabaseUsername(SERVICE_DATABASE_USERNAME_EDEFAULT);
				return;
			case RESTfulServicePSMPackage.SERVICE_PSM__SERVICE_DATABASE_PASSWORD:
				setServiceDatabasePassword(SERVICE_DATABASE_PASSWORD_EDEFAULT);
				return;
			case RESTfulServicePSMPackage.SERVICE_PSM__SERVICE_DATABASE_TYPE:
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
			case RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_RMODEL:
				return hasJavaRModel != null && !hasJavaRModel.isEmpty();
			case RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_RCONTROLLER:
				return hasJavaRController != null && !hasJavaRController.isEmpty();
			case RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_RC_MANAGER:
				return hasJavaRCManager != null && !hasJavaRCManager.isEmpty();
			case RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_RM_MANAGER:
				return hasJavaRMManager != null && !hasJavaRMManager.isEmpty();
			case RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_ALGO_MODEL:
				return hasJavaAlgoModel != null && !hasJavaAlgoModel.isEmpty();
			case RESTfulServicePSMPackage.SERVICE_PSM__HAS_JAVA_ALGO_CONTROLLER:
				return hasJavaAlgoController != null && !hasJavaAlgoController.isEmpty();
			case RESTfulServicePSMPackage.SERVICE_PSM__HAS_HIBERNATE_CONTROLLER:
				return hasHibernateController != null;
			case RESTfulServicePSMPackage.SERVICE_PSM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RESTfulServicePSMPackage.SERVICE_PSM__SERVICE_OUTPUT_PATH:
				return SERVICE_OUTPUT_PATH_EDEFAULT == null ? serviceOutputPath != null : !SERVICE_OUTPUT_PATH_EDEFAULT.equals(serviceOutputPath);
			case RESTfulServicePSMPackage.SERVICE_PSM__SERVICE_DATABASE_IP:
				return SERVICE_DATABASE_IP_EDEFAULT == null ? serviceDatabaseIP != null : !SERVICE_DATABASE_IP_EDEFAULT.equals(serviceDatabaseIP);
			case RESTfulServicePSMPackage.SERVICE_PSM__SERVICE_DATABASE_PORT:
				return SERVICE_DATABASE_PORT_EDEFAULT == null ? serviceDatabasePort != null : !SERVICE_DATABASE_PORT_EDEFAULT.equals(serviceDatabasePort);
			case RESTfulServicePSMPackage.SERVICE_PSM__SERVICE_DATABASE_USERNAME:
				return SERVICE_DATABASE_USERNAME_EDEFAULT == null ? serviceDatabaseUsername != null : !SERVICE_DATABASE_USERNAME_EDEFAULT.equals(serviceDatabaseUsername);
			case RESTfulServicePSMPackage.SERVICE_PSM__SERVICE_DATABASE_PASSWORD:
				return SERVICE_DATABASE_PASSWORD_EDEFAULT == null ? serviceDatabasePassword != null : !SERVICE_DATABASE_PASSWORD_EDEFAULT.equals(serviceDatabasePassword);
			case RESTfulServicePSMPackage.SERVICE_PSM__SERVICE_DATABASE_TYPE:
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

} //ServicePSMImpl
