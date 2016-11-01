/**
 */
package RESTfulServicePSM.impl;

import RESTfulServicePSM.HibernateAnnotation;
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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PSM Component Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RESTfulServicePSM.impl.PSMComponentPropertyImpl#getPropertyHasHibernateAnnotation <em>Property Has Hibernate Annotation</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.PSMComponentPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.PSMComponentPropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.PSMComponentPropertyImpl#isBIsUnique <em>BIs Unique</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.PSMComponentPropertyImpl#isBIsNamingProperty <em>BIs Naming Property</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.PSMComponentPropertyImpl#isBIsPrimaryIdentifier <em>BIs Primary Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PSMComponentPropertyImpl extends MinimalEObjectImpl.Container implements PSMComponentProperty {
	/**
	 * The cached value of the '{@link #getPropertyHasHibernateAnnotation() <em>Property Has Hibernate Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyHasHibernateAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<HibernateAnnotation> propertyHasHibernateAnnotation;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isBIsUnique() <em>BIs Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BIS_UNIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBIsUnique() <em>BIs Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBIsUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean bIsUnique = BIS_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isBIsNamingProperty() <em>BIs Naming Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBIsNamingProperty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BIS_NAMING_PROPERTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBIsNamingProperty() <em>BIs Naming Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBIsNamingProperty()
	 * @generated
	 * @ordered
	 */
	protected boolean bIsNamingProperty = BIS_NAMING_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #isBIsPrimaryIdentifier() <em>BIs Primary Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBIsPrimaryIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BIS_PRIMARY_IDENTIFIER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBIsPrimaryIdentifier() <em>BIs Primary Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBIsPrimaryIdentifier()
	 * @generated
	 * @ordered
	 */
	protected boolean bIsPrimaryIdentifier = BIS_PRIMARY_IDENTIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PSMComponentPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTfulServicePSMPackage.Literals.PSM_COMPONENT_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HibernateAnnotation> getPropertyHasHibernateAnnotation() {
		if (propertyHasHibernateAnnotation == null) {
			propertyHasHibernateAnnotation = new EObjectContainmentEList<HibernateAnnotation>(HibernateAnnotation.class, this, RESTfulServicePSMPackage.PSM_COMPONENT_PROPERTY__PROPERTY_HAS_HIBERNATE_ANNOTATION);
		}
		return propertyHasHibernateAnnotation;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.PSM_COMPONENT_PROPERTY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.PSM_COMPONENT_PROPERTY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBIsUnique() {
		return bIsUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBIsUnique(boolean newBIsUnique) {
		boolean oldBIsUnique = bIsUnique;
		bIsUnique = newBIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.PSM_COMPONENT_PROPERTY__BIS_UNIQUE, oldBIsUnique, bIsUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBIsNamingProperty() {
		return bIsNamingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBIsNamingProperty(boolean newBIsNamingProperty) {
		boolean oldBIsNamingProperty = bIsNamingProperty;
		bIsNamingProperty = newBIsNamingProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.PSM_COMPONENT_PROPERTY__BIS_NAMING_PROPERTY, oldBIsNamingProperty, bIsNamingProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBIsPrimaryIdentifier() {
		return bIsPrimaryIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBIsPrimaryIdentifier(boolean newBIsPrimaryIdentifier) {
		boolean oldBIsPrimaryIdentifier = bIsPrimaryIdentifier;
		bIsPrimaryIdentifier = newBIsPrimaryIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.PSM_COMPONENT_PROPERTY__BIS_PRIMARY_IDENTIFIER, oldBIsPrimaryIdentifier, bIsPrimaryIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RESTfulServicePSMPackage.PSM_COMPONENT_PROPERTY__PROPERTY_HAS_HIBERNATE_ANNOTATION:
				return ((InternalEList<?>)getPropertyHasHibernateAnnotation()).basicRemove(otherEnd, msgs);
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
			case RESTfulServicePSMPackage.PSM_COMPONENT_PROPERTY__PROPERTY_HAS_HIBERNATE_ANNOTATION:
				return getPropertyHasHibernateAnnotation();
			case RESTfulServicePSMPackage.PSM_COMPONENT_PROPERTY__NAME:
				return getName();
			case RESTfulServicePSMPackage.PSM_COMPONENT_PROPERTY__TYPE:
				return getType();
			case RESTfulServicePSMPackage.PSM_COMPONENT_PROPERTY__BIS_UNIQUE:
				return isBIsUnique();
			case RESTfulServicePSMPackage.PSM_COMPONENT_PROPERTY__BIS_NAMING_PROPERTY:
				return isBIsNamingProperty();
			case RESTfulServicePSMPackage.PSM_COMPONENT_PROPERTY__BIS_PRIMARY_IDENTIFIER:
				return isBIsPrimaryIdentifier();
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
			case RESTfulServicePSMPackage.PSM_COMPONENT_PROPERTY__PROPERTY_HAS_HIBERNATE_ANNOTATION:
				getPropertyHasHibernateAnnotation().clear();
				getPropertyHasHibernateAnnotation().addAll((Collection<? extends HibernateAnnotation>)newValue);
				return;
			case RESTfulServicePSMPackage.PSM_COMPONENT_PROPERTY__NAME:
				setName((String)newValue);
				return;
			case RESTfulServicePSMPackage.PSM_COMPONENT_PROPERTY__TYPE:
				setType((String)newValue);
				return;
			case RESTfulServicePSMPackage.PSM_COMPONENT_PROPERTY__BIS_UNIQUE:
				setBIsUnique((Boolean)newValue);
				return;
			case RESTfulServicePSMPackage.PSM_COMPONENT_PROPERTY__BIS_NAMING_PROPERTY:
				setBIsNamingProperty((Boolean)newValue);
				return;
			case RESTfulServicePSMPackage.PSM_COMPONENT_PROPERTY__BIS_PRIMARY_IDENTIFIER:
				setBIsPrimaryIdentifier((Boolean)newValue);
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
			case RESTfulServicePSMPackage.PSM_COMPONENT_PROPERTY__PROPERTY_HAS_HIBERNATE_ANNOTATION:
				getPropertyHasHibernateAnnotation().clear();
				return;
			case RESTfulServicePSMPackage.PSM_COMPONENT_PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RESTfulServicePSMPackage.PSM_COMPONENT_PROPERTY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case RESTfulServicePSMPackage.PSM_COMPONENT_PROPERTY__BIS_UNIQUE:
				setBIsUnique(BIS_UNIQUE_EDEFAULT);
				return;
			case RESTfulServicePSMPackage.PSM_COMPONENT_PROPERTY__BIS_NAMING_PROPERTY:
				setBIsNamingProperty(BIS_NAMING_PROPERTY_EDEFAULT);
				return;
			case RESTfulServicePSMPackage.PSM_COMPONENT_PROPERTY__BIS_PRIMARY_IDENTIFIER:
				setBIsPrimaryIdentifier(BIS_PRIMARY_IDENTIFIER_EDEFAULT);
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
			case RESTfulServicePSMPackage.PSM_COMPONENT_PROPERTY__PROPERTY_HAS_HIBERNATE_ANNOTATION:
				return propertyHasHibernateAnnotation != null && !propertyHasHibernateAnnotation.isEmpty();
			case RESTfulServicePSMPackage.PSM_COMPONENT_PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RESTfulServicePSMPackage.PSM_COMPONENT_PROPERTY__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case RESTfulServicePSMPackage.PSM_COMPONENT_PROPERTY__BIS_UNIQUE:
				return bIsUnique != BIS_UNIQUE_EDEFAULT;
			case RESTfulServicePSMPackage.PSM_COMPONENT_PROPERTY__BIS_NAMING_PROPERTY:
				return bIsNamingProperty != BIS_NAMING_PROPERTY_EDEFAULT;
			case RESTfulServicePSMPackage.PSM_COMPONENT_PROPERTY__BIS_PRIMARY_IDENTIFIER:
				return bIsPrimaryIdentifier != BIS_PRIMARY_IDENTIFIER_EDEFAULT;
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
		result.append(", type: ");
		result.append(type);
		result.append(", bIsUnique: ");
		result.append(bIsUnique);
		result.append(", bIsNamingProperty: ");
		result.append(bIsNamingProperty);
		result.append(", bIsPrimaryIdentifier: ");
		result.append(bIsPrimaryIdentifier);
		result.append(')');
		return result.toString();
	}

} //PSMComponentPropertyImpl
