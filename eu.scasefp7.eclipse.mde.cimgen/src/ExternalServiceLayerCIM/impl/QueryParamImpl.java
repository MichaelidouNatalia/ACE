/**
 */
package ExternalServiceLayerCIM.impl;

import ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage;
import ExternalServiceLayerCIM.QueryParam;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ExternalServiceLayerCIM.impl.QueryParamImpl#getName <em>Name</em>}</li>
 *   <li>{@link ExternalServiceLayerCIM.impl.QueryParamImpl#getType <em>Type</em>}</li>
 *   <li>{@link ExternalServiceLayerCIM.impl.QueryParamImpl#isIsAuthToken <em>Is Auth Token</em>}</li>
 *   <li>{@link ExternalServiceLayerCIM.impl.QueryParamImpl#getAuthTokenToURL <em>Auth Token To URL</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryParamImpl extends MinimalEObjectImpl.Container implements QueryParam {
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
	 * The default value of the '{@link #isIsAuthToken() <em>Is Auth Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAuthToken()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_AUTH_TOKEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAuthToken() <em>Is Auth Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAuthToken()
	 * @generated
	 * @ordered
	 */
	protected boolean isAuthToken = IS_AUTH_TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthTokenToURL() <em>Auth Token To URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthTokenToURL()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTH_TOKEN_TO_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthTokenToURL() <em>Auth Token To URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthTokenToURL()
	 * @generated
	 * @ordered
	 */
	protected String authTokenToURL = AUTH_TOKEN_TO_URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExternalServiceLayerCIMPackage.Literals.QUERY_PARAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerCIMPackage.QUERY_PARAM__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerCIMPackage.QUERY_PARAM__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAuthToken() {
		return isAuthToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAuthToken(boolean newIsAuthToken) {
		boolean oldIsAuthToken = isAuthToken;
		isAuthToken = newIsAuthToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerCIMPackage.QUERY_PARAM__IS_AUTH_TOKEN, oldIsAuthToken, isAuthToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthTokenToURL() {
		return authTokenToURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthTokenToURL(String newAuthTokenToURL) {
		String oldAuthTokenToURL = authTokenToURL;
		authTokenToURL = newAuthTokenToURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerCIMPackage.QUERY_PARAM__AUTH_TOKEN_TO_URL, oldAuthTokenToURL, authTokenToURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExternalServiceLayerCIMPackage.QUERY_PARAM__NAME:
				return getName();
			case ExternalServiceLayerCIMPackage.QUERY_PARAM__TYPE:
				return getType();
			case ExternalServiceLayerCIMPackage.QUERY_PARAM__IS_AUTH_TOKEN:
				return isIsAuthToken();
			case ExternalServiceLayerCIMPackage.QUERY_PARAM__AUTH_TOKEN_TO_URL:
				return getAuthTokenToURL();
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
			case ExternalServiceLayerCIMPackage.QUERY_PARAM__NAME:
				setName((String)newValue);
				return;
			case ExternalServiceLayerCIMPackage.QUERY_PARAM__TYPE:
				setType((String)newValue);
				return;
			case ExternalServiceLayerCIMPackage.QUERY_PARAM__IS_AUTH_TOKEN:
				setIsAuthToken((Boolean)newValue);
				return;
			case ExternalServiceLayerCIMPackage.QUERY_PARAM__AUTH_TOKEN_TO_URL:
				setAuthTokenToURL((String)newValue);
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
			case ExternalServiceLayerCIMPackage.QUERY_PARAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ExternalServiceLayerCIMPackage.QUERY_PARAM__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ExternalServiceLayerCIMPackage.QUERY_PARAM__IS_AUTH_TOKEN:
				setIsAuthToken(IS_AUTH_TOKEN_EDEFAULT);
				return;
			case ExternalServiceLayerCIMPackage.QUERY_PARAM__AUTH_TOKEN_TO_URL:
				setAuthTokenToURL(AUTH_TOKEN_TO_URL_EDEFAULT);
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
			case ExternalServiceLayerCIMPackage.QUERY_PARAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ExternalServiceLayerCIMPackage.QUERY_PARAM__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ExternalServiceLayerCIMPackage.QUERY_PARAM__IS_AUTH_TOKEN:
				return isAuthToken != IS_AUTH_TOKEN_EDEFAULT;
			case ExternalServiceLayerCIMPackage.QUERY_PARAM__AUTH_TOKEN_TO_URL:
				return AUTH_TOKEN_TO_URL_EDEFAULT == null ? authTokenToURL != null : !AUTH_TOKEN_TO_URL_EDEFAULT.equals(authTokenToURL);
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
		result.append(", isAuthToken: ");
		result.append(isAuthToken);
		result.append(", authTokenToURL: ");
		result.append(authTokenToURL);
		result.append(')');
		return result.toString();
	}

} //QueryParamImpl
