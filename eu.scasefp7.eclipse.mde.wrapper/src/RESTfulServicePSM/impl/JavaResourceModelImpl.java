/**
 */
package RESTfulServicePSM.impl;

import RESTfulServicePSM.HibernateAnnotation;
import RESTfulServicePSM.JAXBAnnotation;
import RESTfulServicePSM.JavaAlgoResourceModel;
import RESTfulServicePSM.JavaGetterFunction;
import RESTfulServicePSM.JavaResourceModel;
import RESTfulServicePSM.JavaResourceModelManager;
import RESTfulServicePSM.JavaSetterFunction;
import RESTfulServicePSM.PSMComponentProperty;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Resource Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RESTfulServicePSM.impl.JavaResourceModelImpl#getJavaRModelHasJAXBAnnotation <em>Java RModel Has JAXB Annotation</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.JavaResourceModelImpl#getJavaRModelHasProperty <em>Java RModel Has Property</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.JavaResourceModelImpl#getHasRelatedJavaRMManager <em>Has Related Java RM Manager</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.JavaResourceModelImpl#getJavaRModelHasHibernateAnnotation <em>Java RModel Has Hibernate Annotation</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.JavaResourceModelImpl#getJavaRModelHasSetter <em>Java RModel Has Setter</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.JavaResourceModelImpl#getJavaRModelHasGetter <em>Java RModel Has Getter</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.JavaResourceModelImpl#getHasRelatedJavaAlgoModel <em>Has Related Java Algo Model</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.JavaResourceModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.JavaResourceModelImpl#getParentName <em>Parent Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaResourceModelImpl extends MinimalEObjectImpl.Container implements JavaResourceModel {
	/**
	 * The cached value of the '{@link #getJavaRModelHasJAXBAnnotation() <em>Java RModel Has JAXB Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaRModelHasJAXBAnnotation()
	 * @generated
	 * @ordered
	 */
	protected JAXBAnnotation javaRModelHasJAXBAnnotation;

	/**
	 * The cached value of the '{@link #getJavaRModelHasProperty() <em>Java RModel Has Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaRModelHasProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<PSMComponentProperty> javaRModelHasProperty;

	/**
	 * The cached value of the '{@link #getHasRelatedJavaRMManager() <em>Has Related Java RM Manager</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRelatedJavaRMManager()
	 * @generated
	 * @ordered
	 */
	protected EList<JavaResourceModelManager> hasRelatedJavaRMManager;

	/**
	 * The cached value of the '{@link #getJavaRModelHasHibernateAnnotation() <em>Java RModel Has Hibernate Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaRModelHasHibernateAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<HibernateAnnotation> javaRModelHasHibernateAnnotation;

	/**
	 * The cached value of the '{@link #getJavaRModelHasSetter() <em>Java RModel Has Setter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaRModelHasSetter()
	 * @generated
	 * @ordered
	 */
	protected EList<JavaSetterFunction> javaRModelHasSetter;

	/**
	 * The cached value of the '{@link #getJavaRModelHasGetter() <em>Java RModel Has Getter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaRModelHasGetter()
	 * @generated
	 * @ordered
	 */
	protected EList<JavaGetterFunction> javaRModelHasGetter;

	/**
	 * The cached value of the '{@link #getHasRelatedJavaAlgoModel() <em>Has Related Java Algo Model</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRelatedJavaAlgoModel()
	 * @generated
	 * @ordered
	 */
	protected EList<JavaAlgoResourceModel> hasRelatedJavaAlgoModel;

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
	protected JavaResourceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTfulServicePSMPackage.Literals.JAVA_RESOURCE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JAXBAnnotation getJavaRModelHasJAXBAnnotation() {
		return javaRModelHasJAXBAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJavaRModelHasJAXBAnnotation(JAXBAnnotation newJavaRModelHasJAXBAnnotation, NotificationChain msgs) {
		JAXBAnnotation oldJavaRModelHasJAXBAnnotation = javaRModelHasJAXBAnnotation;
		javaRModelHasJAXBAnnotation = newJavaRModelHasJAXBAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_JAXB_ANNOTATION, oldJavaRModelHasJAXBAnnotation, newJavaRModelHasJAXBAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaRModelHasJAXBAnnotation(JAXBAnnotation newJavaRModelHasJAXBAnnotation) {
		if (newJavaRModelHasJAXBAnnotation != javaRModelHasJAXBAnnotation) {
			NotificationChain msgs = null;
			if (javaRModelHasJAXBAnnotation != null)
				msgs = ((InternalEObject)javaRModelHasJAXBAnnotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_JAXB_ANNOTATION, null, msgs);
			if (newJavaRModelHasJAXBAnnotation != null)
				msgs = ((InternalEObject)newJavaRModelHasJAXBAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_JAXB_ANNOTATION, null, msgs);
			msgs = basicSetJavaRModelHasJAXBAnnotation(newJavaRModelHasJAXBAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_JAXB_ANNOTATION, newJavaRModelHasJAXBAnnotation, newJavaRModelHasJAXBAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PSMComponentProperty> getJavaRModelHasProperty() {
		if (javaRModelHasProperty == null) {
			javaRModelHasProperty = new EObjectContainmentEList<PSMComponentProperty>(PSMComponentProperty.class, this, RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_PROPERTY);
		}
		return javaRModelHasProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JavaResourceModelManager> getHasRelatedJavaRMManager() {
		if (hasRelatedJavaRMManager == null) {
			hasRelatedJavaRMManager = new EObjectResolvingEList<JavaResourceModelManager>(JavaResourceModelManager.class, this, RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__HAS_RELATED_JAVA_RM_MANAGER);
		}
		return hasRelatedJavaRMManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HibernateAnnotation> getJavaRModelHasHibernateAnnotation() {
		if (javaRModelHasHibernateAnnotation == null) {
			javaRModelHasHibernateAnnotation = new EObjectContainmentEList<HibernateAnnotation>(HibernateAnnotation.class, this, RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_HIBERNATE_ANNOTATION);
		}
		return javaRModelHasHibernateAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JavaSetterFunction> getJavaRModelHasSetter() {
		if (javaRModelHasSetter == null) {
			javaRModelHasSetter = new EObjectContainmentEList<JavaSetterFunction>(JavaSetterFunction.class, this, RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_SETTER);
		}
		return javaRModelHasSetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JavaGetterFunction> getJavaRModelHasGetter() {
		if (javaRModelHasGetter == null) {
			javaRModelHasGetter = new EObjectContainmentEList<JavaGetterFunction>(JavaGetterFunction.class, this, RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_GETTER);
		}
		return javaRModelHasGetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JavaAlgoResourceModel> getHasRelatedJavaAlgoModel() {
		if (hasRelatedJavaAlgoModel == null) {
			hasRelatedJavaAlgoModel = new EObjectResolvingEList<JavaAlgoResourceModel>(JavaAlgoResourceModel.class, this, RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__HAS_RELATED_JAVA_ALGO_MODEL);
		}
		return hasRelatedJavaAlgoModel;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__PARENT_NAME, oldParentName, parentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_JAXB_ANNOTATION:
				return basicSetJavaRModelHasJAXBAnnotation(null, msgs);
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_PROPERTY:
				return ((InternalEList<?>)getJavaRModelHasProperty()).basicRemove(otherEnd, msgs);
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_HIBERNATE_ANNOTATION:
				return ((InternalEList<?>)getJavaRModelHasHibernateAnnotation()).basicRemove(otherEnd, msgs);
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_SETTER:
				return ((InternalEList<?>)getJavaRModelHasSetter()).basicRemove(otherEnd, msgs);
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_GETTER:
				return ((InternalEList<?>)getJavaRModelHasGetter()).basicRemove(otherEnd, msgs);
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
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_JAXB_ANNOTATION:
				return getJavaRModelHasJAXBAnnotation();
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_PROPERTY:
				return getJavaRModelHasProperty();
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__HAS_RELATED_JAVA_RM_MANAGER:
				return getHasRelatedJavaRMManager();
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_HIBERNATE_ANNOTATION:
				return getJavaRModelHasHibernateAnnotation();
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_SETTER:
				return getJavaRModelHasSetter();
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_GETTER:
				return getJavaRModelHasGetter();
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__HAS_RELATED_JAVA_ALGO_MODEL:
				return getHasRelatedJavaAlgoModel();
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__NAME:
				return getName();
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__PARENT_NAME:
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
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_JAXB_ANNOTATION:
				setJavaRModelHasJAXBAnnotation((JAXBAnnotation)newValue);
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_PROPERTY:
				getJavaRModelHasProperty().clear();
				getJavaRModelHasProperty().addAll((Collection<? extends PSMComponentProperty>)newValue);
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__HAS_RELATED_JAVA_RM_MANAGER:
				getHasRelatedJavaRMManager().clear();
				getHasRelatedJavaRMManager().addAll((Collection<? extends JavaResourceModelManager>)newValue);
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_HIBERNATE_ANNOTATION:
				getJavaRModelHasHibernateAnnotation().clear();
				getJavaRModelHasHibernateAnnotation().addAll((Collection<? extends HibernateAnnotation>)newValue);
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_SETTER:
				getJavaRModelHasSetter().clear();
				getJavaRModelHasSetter().addAll((Collection<? extends JavaSetterFunction>)newValue);
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_GETTER:
				getJavaRModelHasGetter().clear();
				getJavaRModelHasGetter().addAll((Collection<? extends JavaGetterFunction>)newValue);
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__HAS_RELATED_JAVA_ALGO_MODEL:
				getHasRelatedJavaAlgoModel().clear();
				getHasRelatedJavaAlgoModel().addAll((Collection<? extends JavaAlgoResourceModel>)newValue);
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__NAME:
				setName((String)newValue);
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__PARENT_NAME:
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
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_JAXB_ANNOTATION:
				setJavaRModelHasJAXBAnnotation((JAXBAnnotation)null);
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_PROPERTY:
				getJavaRModelHasProperty().clear();
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__HAS_RELATED_JAVA_RM_MANAGER:
				getHasRelatedJavaRMManager().clear();
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_HIBERNATE_ANNOTATION:
				getJavaRModelHasHibernateAnnotation().clear();
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_SETTER:
				getJavaRModelHasSetter().clear();
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_GETTER:
				getJavaRModelHasGetter().clear();
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__HAS_RELATED_JAVA_ALGO_MODEL:
				getHasRelatedJavaAlgoModel().clear();
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__PARENT_NAME:
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
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_JAXB_ANNOTATION:
				return javaRModelHasJAXBAnnotation != null;
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_PROPERTY:
				return javaRModelHasProperty != null && !javaRModelHasProperty.isEmpty();
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__HAS_RELATED_JAVA_RM_MANAGER:
				return hasRelatedJavaRMManager != null && !hasRelatedJavaRMManager.isEmpty();
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_HIBERNATE_ANNOTATION:
				return javaRModelHasHibernateAnnotation != null && !javaRModelHasHibernateAnnotation.isEmpty();
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_SETTER:
				return javaRModelHasSetter != null && !javaRModelHasSetter.isEmpty();
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_GETTER:
				return javaRModelHasGetter != null && !javaRModelHasGetter.isEmpty();
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__HAS_RELATED_JAVA_ALGO_MODEL:
				return hasRelatedJavaAlgoModel != null && !hasRelatedJavaAlgoModel.isEmpty();
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL__PARENT_NAME:
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
		result.append(", parentName: ");
		result.append(parentName);
		result.append(')');
		return result.toString();
	}

} //JavaResourceModelImpl
