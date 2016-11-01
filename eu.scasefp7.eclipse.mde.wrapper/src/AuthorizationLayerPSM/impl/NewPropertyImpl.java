/**
 */
package AuthorizationLayerPSM.impl;

import AuthorizationLayerPSM.AnnJavaResourceModel;
import AuthorizationLayerPSM.AuthorizationLayerPSMPackage;
import AuthorizationLayerPSM.NewProperty;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>New Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerPSM.impl.NewPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.impl.NewPropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.impl.NewPropertyImpl#isBIsUnique <em>BIs Unique</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.impl.NewPropertyImpl#getBelongsToResource <em>Belongs To Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NewPropertyImpl extends AnnotationImpl implements NewProperty {
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
	 * The cached value of the '{@link #getBelongsToResource() <em>Belongs To Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelongsToResource()
	 * @generated
	 * @ordered
	 */
	protected AnnJavaResourceModel belongsToResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AuthorizationLayerPSMPackage.Literals.NEW_PROPERTY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerPSMPackage.NEW_PROPERTY__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerPSMPackage.NEW_PROPERTY__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerPSMPackage.NEW_PROPERTY__BIS_UNIQUE, oldBIsUnique, bIsUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnJavaResourceModel getBelongsToResource() {
		if (belongsToResource != null && belongsToResource.eIsProxy()) {
			InternalEObject oldBelongsToResource = (InternalEObject)belongsToResource;
			belongsToResource = (AnnJavaResourceModel)eResolveProxy(oldBelongsToResource);
			if (belongsToResource != oldBelongsToResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AuthorizationLayerPSMPackage.NEW_PROPERTY__BELONGS_TO_RESOURCE, oldBelongsToResource, belongsToResource));
			}
		}
		return belongsToResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnJavaResourceModel basicGetBelongsToResource() {
		return belongsToResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelongsToResource(AnnJavaResourceModel newBelongsToResource) {
		AnnJavaResourceModel oldBelongsToResource = belongsToResource;
		belongsToResource = newBelongsToResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerPSMPackage.NEW_PROPERTY__BELONGS_TO_RESOURCE, oldBelongsToResource, belongsToResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AuthorizationLayerPSMPackage.NEW_PROPERTY__NAME:
				return getName();
			case AuthorizationLayerPSMPackage.NEW_PROPERTY__TYPE:
				return getType();
			case AuthorizationLayerPSMPackage.NEW_PROPERTY__BIS_UNIQUE:
				return isBIsUnique();
			case AuthorizationLayerPSMPackage.NEW_PROPERTY__BELONGS_TO_RESOURCE:
				if (resolve) return getBelongsToResource();
				return basicGetBelongsToResource();
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
			case AuthorizationLayerPSMPackage.NEW_PROPERTY__NAME:
				setName((String)newValue);
				return;
			case AuthorizationLayerPSMPackage.NEW_PROPERTY__TYPE:
				setType((String)newValue);
				return;
			case AuthorizationLayerPSMPackage.NEW_PROPERTY__BIS_UNIQUE:
				setBIsUnique((Boolean)newValue);
				return;
			case AuthorizationLayerPSMPackage.NEW_PROPERTY__BELONGS_TO_RESOURCE:
				setBelongsToResource((AnnJavaResourceModel)newValue);
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
			case AuthorizationLayerPSMPackage.NEW_PROPERTY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AuthorizationLayerPSMPackage.NEW_PROPERTY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case AuthorizationLayerPSMPackage.NEW_PROPERTY__BIS_UNIQUE:
				setBIsUnique(BIS_UNIQUE_EDEFAULT);
				return;
			case AuthorizationLayerPSMPackage.NEW_PROPERTY__BELONGS_TO_RESOURCE:
				setBelongsToResource((AnnJavaResourceModel)null);
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
			case AuthorizationLayerPSMPackage.NEW_PROPERTY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AuthorizationLayerPSMPackage.NEW_PROPERTY__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case AuthorizationLayerPSMPackage.NEW_PROPERTY__BIS_UNIQUE:
				return bIsUnique != BIS_UNIQUE_EDEFAULT;
			case AuthorizationLayerPSMPackage.NEW_PROPERTY__BELONGS_TO_RESOURCE:
				return belongsToResource != null;
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
		result.append(')');
		return result.toString();
	}

} //NewPropertyImpl
