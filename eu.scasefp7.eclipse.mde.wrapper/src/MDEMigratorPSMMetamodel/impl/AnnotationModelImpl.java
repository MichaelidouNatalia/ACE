/**
 */
package MDEMigratorPSMMetamodel.impl;

import MDEMigratorPSMMetamodel.Annotation;
import MDEMigratorPSMMetamodel.AnnotationModel;
import MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage;

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
 * An implementation of the model object '<em><b>Annotation Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MDEMigratorPSMMetamodel.impl.AnnotationModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link MDEMigratorPSMMetamodel.impl.AnnotationModelImpl#getStrDBName <em>Str DB Name</em>}</li>
 *   <li>{@link MDEMigratorPSMMetamodel.impl.AnnotationModelImpl#getStrDBURL <em>Str DBURL</em>}</li>
 *   <li>{@link MDEMigratorPSMMetamodel.impl.AnnotationModelImpl#getStrDBUsername <em>Str DB Username</em>}</li>
 *   <li>{@link MDEMigratorPSMMetamodel.impl.AnnotationModelImpl#getStrDBPassword <em>Str DB Password</em>}</li>
 *   <li>{@link MDEMigratorPSMMetamodel.impl.AnnotationModelImpl#getStrDBType <em>Str DB Type</em>}</li>
 *   <li>{@link MDEMigratorPSMMetamodel.impl.AnnotationModelImpl#getHasAnnotation <em>Has Annotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationModelImpl extends MinimalEObjectImpl.Container implements AnnotationModel {
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
	 * The default value of the '{@link #getStrDBName() <em>Str DB Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrDBName()
	 * @generated
	 * @ordered
	 */
	protected static final String STR_DB_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrDBName() <em>Str DB Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrDBName()
	 * @generated
	 * @ordered
	 */
	protected String strDBName = STR_DB_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrDBURL() <em>Str DBURL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrDBURL()
	 * @generated
	 * @ordered
	 */
	protected static final String STR_DBURL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrDBURL() <em>Str DBURL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrDBURL()
	 * @generated
	 * @ordered
	 */
	protected String strDBURL = STR_DBURL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrDBUsername() <em>Str DB Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrDBUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String STR_DB_USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrDBUsername() <em>Str DB Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrDBUsername()
	 * @generated
	 * @ordered
	 */
	protected String strDBUsername = STR_DB_USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrDBPassword() <em>Str DB Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrDBPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String STR_DB_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrDBPassword() <em>Str DB Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrDBPassword()
	 * @generated
	 * @ordered
	 */
	protected String strDBPassword = STR_DB_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrDBType() <em>Str DB Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrDBType()
	 * @generated
	 * @ordered
	 */
	protected static final String STR_DB_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrDBType() <em>Str DB Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrDBType()
	 * @generated
	 * @ordered
	 */
	protected String strDBType = STR_DB_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasAnnotation() <em>Has Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> hasAnnotation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MDEMigratorPSMMetamodelPackage.Literals.ANNOTATION_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrDBName() {
		return strDBName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrDBName(String newStrDBName) {
		String oldStrDBName = strDBName;
		strDBName = newStrDBName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__STR_DB_NAME, oldStrDBName, strDBName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrDBURL() {
		return strDBURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrDBURL(String newStrDBURL) {
		String oldStrDBURL = strDBURL;
		strDBURL = newStrDBURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__STR_DBURL, oldStrDBURL, strDBURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrDBUsername() {
		return strDBUsername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrDBUsername(String newStrDBUsername) {
		String oldStrDBUsername = strDBUsername;
		strDBUsername = newStrDBUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__STR_DB_USERNAME, oldStrDBUsername, strDBUsername));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrDBPassword() {
		return strDBPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrDBPassword(String newStrDBPassword) {
		String oldStrDBPassword = strDBPassword;
		strDBPassword = newStrDBPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__STR_DB_PASSWORD, oldStrDBPassword, strDBPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStrDBType() {
		return strDBType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrDBType(String newStrDBType) {
		String oldStrDBType = strDBType;
		strDBType = newStrDBType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__STR_DB_TYPE, oldStrDBType, strDBType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getHasAnnotation() {
		if (hasAnnotation == null) {
			hasAnnotation = new EObjectContainmentEList<Annotation>(Annotation.class, this, MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__HAS_ANNOTATION);
		}
		return hasAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__HAS_ANNOTATION:
				return ((InternalEList<?>)getHasAnnotation()).basicRemove(otherEnd, msgs);
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
			case MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__NAME:
				return getName();
			case MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__STR_DB_NAME:
				return getStrDBName();
			case MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__STR_DBURL:
				return getStrDBURL();
			case MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__STR_DB_USERNAME:
				return getStrDBUsername();
			case MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__STR_DB_PASSWORD:
				return getStrDBPassword();
			case MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__STR_DB_TYPE:
				return getStrDBType();
			case MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__HAS_ANNOTATION:
				return getHasAnnotation();
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
			case MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__NAME:
				setName((String)newValue);
				return;
			case MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__STR_DB_NAME:
				setStrDBName((String)newValue);
				return;
			case MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__STR_DBURL:
				setStrDBURL((String)newValue);
				return;
			case MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__STR_DB_USERNAME:
				setStrDBUsername((String)newValue);
				return;
			case MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__STR_DB_PASSWORD:
				setStrDBPassword((String)newValue);
				return;
			case MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__STR_DB_TYPE:
				setStrDBType((String)newValue);
				return;
			case MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__HAS_ANNOTATION:
				getHasAnnotation().clear();
				getHasAnnotation().addAll((Collection<? extends Annotation>)newValue);
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
			case MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__STR_DB_NAME:
				setStrDBName(STR_DB_NAME_EDEFAULT);
				return;
			case MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__STR_DBURL:
				setStrDBURL(STR_DBURL_EDEFAULT);
				return;
			case MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__STR_DB_USERNAME:
				setStrDBUsername(STR_DB_USERNAME_EDEFAULT);
				return;
			case MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__STR_DB_PASSWORD:
				setStrDBPassword(STR_DB_PASSWORD_EDEFAULT);
				return;
			case MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__STR_DB_TYPE:
				setStrDBType(STR_DB_TYPE_EDEFAULT);
				return;
			case MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__HAS_ANNOTATION:
				getHasAnnotation().clear();
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
			case MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__STR_DB_NAME:
				return STR_DB_NAME_EDEFAULT == null ? strDBName != null : !STR_DB_NAME_EDEFAULT.equals(strDBName);
			case MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__STR_DBURL:
				return STR_DBURL_EDEFAULT == null ? strDBURL != null : !STR_DBURL_EDEFAULT.equals(strDBURL);
			case MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__STR_DB_USERNAME:
				return STR_DB_USERNAME_EDEFAULT == null ? strDBUsername != null : !STR_DB_USERNAME_EDEFAULT.equals(strDBUsername);
			case MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__STR_DB_PASSWORD:
				return STR_DB_PASSWORD_EDEFAULT == null ? strDBPassword != null : !STR_DB_PASSWORD_EDEFAULT.equals(strDBPassword);
			case MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__STR_DB_TYPE:
				return STR_DB_TYPE_EDEFAULT == null ? strDBType != null : !STR_DB_TYPE_EDEFAULT.equals(strDBType);
			case MDEMigratorPSMMetamodelPackage.ANNOTATION_MODEL__HAS_ANNOTATION:
				return hasAnnotation != null && !hasAnnotation.isEmpty();
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
		result.append(", strDBName: ");
		result.append(strDBName);
		result.append(", strDBURL: ");
		result.append(strDBURL);
		result.append(", strDBUsername: ");
		result.append(strDBUsername);
		result.append(", strDBPassword: ");
		result.append(strDBPassword);
		result.append(", strDBType: ");
		result.append(strDBType);
		result.append(')');
		return result.toString();
	}

} //AnnotationModelImpl
