/**
 */
package AuthenticationLayerCIM.impl;

import AuthenticationLayerCIM.AnnProperty;
import AuthenticationLayerCIM.AuthenticationLayerCIMPackage;
import AuthenticationLayerCIM.AuthenticationToken;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authentication Token</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link AuthenticationLayerCIM.impl.AuthenticationTokenImpl#getName <em>Name</em>}</li>
 *   <li>{@link AuthenticationLayerCIM.impl.AuthenticationTokenImpl#getType <em>Type</em>}</li>
 *   <li>{@link AuthenticationLayerCIM.impl.AuthenticationTokenImpl#isBIsUnique <em>BIs Unique</em>}</li>
 *   <li>{@link AuthenticationLayerCIM.impl.AuthenticationTokenImpl#getPropertyAuthenticationToken <em>Property Authentication Token</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuthenticationTokenImpl extends AnnotationImpl implements AuthenticationToken {
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
	 * The cached value of the '{@link #getPropertyAuthenticationToken() <em>Property Authentication Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyAuthenticationToken()
	 * @generated
	 * @ordered
	 */
	protected AnnProperty propertyAuthenticationToken;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthenticationTokenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AuthenticationLayerCIMPackage.Literals.AUTHENTICATION_TOKEN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AuthenticationLayerCIMPackage.AUTHENTICATION_TOKEN__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AuthenticationLayerCIMPackage.AUTHENTICATION_TOKEN__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AuthenticationLayerCIMPackage.AUTHENTICATION_TOKEN__BIS_UNIQUE, oldBIsUnique, bIsUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnProperty getPropertyAuthenticationToken() {
		if (propertyAuthenticationToken != null && propertyAuthenticationToken.eIsProxy()) {
			InternalEObject oldPropertyAuthenticationToken = (InternalEObject)propertyAuthenticationToken;
			propertyAuthenticationToken = (AnnProperty)eResolveProxy(oldPropertyAuthenticationToken);
			if (propertyAuthenticationToken != oldPropertyAuthenticationToken) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AuthenticationLayerCIMPackage.AUTHENTICATION_TOKEN__PROPERTY_AUTHENTICATION_TOKEN, oldPropertyAuthenticationToken, propertyAuthenticationToken));
			}
		}
		return propertyAuthenticationToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnProperty basicGetPropertyAuthenticationToken() {
		return propertyAuthenticationToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyAuthenticationToken(AnnProperty newPropertyAuthenticationToken) {
		AnnProperty oldPropertyAuthenticationToken = propertyAuthenticationToken;
		propertyAuthenticationToken = newPropertyAuthenticationToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthenticationLayerCIMPackage.AUTHENTICATION_TOKEN__PROPERTY_AUTHENTICATION_TOKEN, oldPropertyAuthenticationToken, propertyAuthenticationToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AuthenticationLayerCIMPackage.AUTHENTICATION_TOKEN__NAME:
				return getName();
			case AuthenticationLayerCIMPackage.AUTHENTICATION_TOKEN__TYPE:
				return getType();
			case AuthenticationLayerCIMPackage.AUTHENTICATION_TOKEN__BIS_UNIQUE:
				return isBIsUnique();
			case AuthenticationLayerCIMPackage.AUTHENTICATION_TOKEN__PROPERTY_AUTHENTICATION_TOKEN:
				if (resolve) return getPropertyAuthenticationToken();
				return basicGetPropertyAuthenticationToken();
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
			case AuthenticationLayerCIMPackage.AUTHENTICATION_TOKEN__NAME:
				setName((String)newValue);
				return;
			case AuthenticationLayerCIMPackage.AUTHENTICATION_TOKEN__TYPE:
				setType((String)newValue);
				return;
			case AuthenticationLayerCIMPackage.AUTHENTICATION_TOKEN__BIS_UNIQUE:
				setBIsUnique((Boolean)newValue);
				return;
			case AuthenticationLayerCIMPackage.AUTHENTICATION_TOKEN__PROPERTY_AUTHENTICATION_TOKEN:
				setPropertyAuthenticationToken((AnnProperty)newValue);
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
			case AuthenticationLayerCIMPackage.AUTHENTICATION_TOKEN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AuthenticationLayerCIMPackage.AUTHENTICATION_TOKEN__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case AuthenticationLayerCIMPackage.AUTHENTICATION_TOKEN__BIS_UNIQUE:
				setBIsUnique(BIS_UNIQUE_EDEFAULT);
				return;
			case AuthenticationLayerCIMPackage.AUTHENTICATION_TOKEN__PROPERTY_AUTHENTICATION_TOKEN:
				setPropertyAuthenticationToken((AnnProperty)null);
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
			case AuthenticationLayerCIMPackage.AUTHENTICATION_TOKEN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AuthenticationLayerCIMPackage.AUTHENTICATION_TOKEN__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case AuthenticationLayerCIMPackage.AUTHENTICATION_TOKEN__BIS_UNIQUE:
				return bIsUnique != BIS_UNIQUE_EDEFAULT;
			case AuthenticationLayerCIMPackage.AUTHENTICATION_TOKEN__PROPERTY_AUTHENTICATION_TOKEN:
				return propertyAuthenticationToken != null;
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

} //AuthenticationTokenImpl
