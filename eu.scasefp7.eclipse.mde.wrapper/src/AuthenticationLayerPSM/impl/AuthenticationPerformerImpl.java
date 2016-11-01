/**
 */
package AuthenticationLayerPSM.impl;

import AuthenticationLayerPSM.AnnJPAController;
import AuthenticationLayerPSM.AuthenticationLayerPSMPackage;
import AuthenticationLayerPSM.AuthenticationPerformer;
import AuthenticationLayerPSM.AuthenticationToken;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authentication Performer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AuthenticationLayerPSM.impl.AuthenticationPerformerImpl#getHasAuthenticationToken <em>Has Authentication Token</em>}</li>
 *   <li>{@link AuthenticationLayerPSM.impl.AuthenticationPerformerImpl#getIsSystemAuthenticationPerformer <em>Is System Authentication Performer</em>}</li>
 *   <li>{@link AuthenticationLayerPSM.impl.AuthenticationPerformerImpl#getAuthenticationModelName <em>Authentication Model Name</em>}</li>
 *   <li>{@link AuthenticationLayerPSM.impl.AuthenticationPerformerImpl#getAuthenticationModelParentName <em>Authentication Model Parent Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthenticationPerformerImpl extends AnnotationImpl implements AuthenticationPerformer {
	/**
	 * The cached value of the '{@link #getHasAuthenticationToken() <em>Has Authentication Token</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAuthenticationToken()
	 * @generated
	 * @ordered
	 */
	protected EList<AuthenticationToken> hasAuthenticationToken;

	/**
	 * The cached value of the '{@link #getIsSystemAuthenticationPerformer() <em>Is System Authentication Performer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSystemAuthenticationPerformer()
	 * @generated
	 * @ordered
	 */
	protected AnnJPAController isSystemAuthenticationPerformer;

	/**
	 * The default value of the '{@link #getAuthenticationModelName() <em>Authentication Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationModelName()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHENTICATION_MODEL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthenticationModelName() <em>Authentication Model Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationModelName()
	 * @generated
	 * @ordered
	 */
	protected String authenticationModelName = AUTHENTICATION_MODEL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthenticationModelParentName() <em>Authentication Model Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationModelParentName()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHENTICATION_MODEL_PARENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthenticationModelParentName() <em>Authentication Model Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticationModelParentName()
	 * @generated
	 * @ordered
	 */
	protected String authenticationModelParentName = AUTHENTICATION_MODEL_PARENT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthenticationPerformerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AuthenticationLayerPSMPackage.Literals.AUTHENTICATION_PERFORMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuthenticationToken> getHasAuthenticationToken() {
		if (hasAuthenticationToken == null) {
			hasAuthenticationToken = new EObjectContainmentEList<AuthenticationToken>(AuthenticationToken.class, this, AuthenticationLayerPSMPackage.AUTHENTICATION_PERFORMER__HAS_AUTHENTICATION_TOKEN);
		}
		return hasAuthenticationToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnJPAController getIsSystemAuthenticationPerformer() {
		if (isSystemAuthenticationPerformer != null && isSystemAuthenticationPerformer.eIsProxy()) {
			InternalEObject oldIsSystemAuthenticationPerformer = (InternalEObject)isSystemAuthenticationPerformer;
			isSystemAuthenticationPerformer = (AnnJPAController)eResolveProxy(oldIsSystemAuthenticationPerformer);
			if (isSystemAuthenticationPerformer != oldIsSystemAuthenticationPerformer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AuthenticationLayerPSMPackage.AUTHENTICATION_PERFORMER__IS_SYSTEM_AUTHENTICATION_PERFORMER, oldIsSystemAuthenticationPerformer, isSystemAuthenticationPerformer));
			}
		}
		return isSystemAuthenticationPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnJPAController basicGetIsSystemAuthenticationPerformer() {
		return isSystemAuthenticationPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSystemAuthenticationPerformer(AnnJPAController newIsSystemAuthenticationPerformer) {
		AnnJPAController oldIsSystemAuthenticationPerformer = isSystemAuthenticationPerformer;
		isSystemAuthenticationPerformer = newIsSystemAuthenticationPerformer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthenticationLayerPSMPackage.AUTHENTICATION_PERFORMER__IS_SYSTEM_AUTHENTICATION_PERFORMER, oldIsSystemAuthenticationPerformer, isSystemAuthenticationPerformer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthenticationModelName() {
		return authenticationModelName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthenticationModelName(String newAuthenticationModelName) {
		String oldAuthenticationModelName = authenticationModelName;
		authenticationModelName = newAuthenticationModelName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthenticationLayerPSMPackage.AUTHENTICATION_PERFORMER__AUTHENTICATION_MODEL_NAME, oldAuthenticationModelName, authenticationModelName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthenticationModelParentName() {
		return authenticationModelParentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthenticationModelParentName(String newAuthenticationModelParentName) {
		String oldAuthenticationModelParentName = authenticationModelParentName;
		authenticationModelParentName = newAuthenticationModelParentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthenticationLayerPSMPackage.AUTHENTICATION_PERFORMER__AUTHENTICATION_MODEL_PARENT_NAME, oldAuthenticationModelParentName, authenticationModelParentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AuthenticationLayerPSMPackage.AUTHENTICATION_PERFORMER__HAS_AUTHENTICATION_TOKEN:
				return ((InternalEList<?>)getHasAuthenticationToken()).basicRemove(otherEnd, msgs);
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
			case AuthenticationLayerPSMPackage.AUTHENTICATION_PERFORMER__HAS_AUTHENTICATION_TOKEN:
				return getHasAuthenticationToken();
			case AuthenticationLayerPSMPackage.AUTHENTICATION_PERFORMER__IS_SYSTEM_AUTHENTICATION_PERFORMER:
				if (resolve) return getIsSystemAuthenticationPerformer();
				return basicGetIsSystemAuthenticationPerformer();
			case AuthenticationLayerPSMPackage.AUTHENTICATION_PERFORMER__AUTHENTICATION_MODEL_NAME:
				return getAuthenticationModelName();
			case AuthenticationLayerPSMPackage.AUTHENTICATION_PERFORMER__AUTHENTICATION_MODEL_PARENT_NAME:
				return getAuthenticationModelParentName();
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
			case AuthenticationLayerPSMPackage.AUTHENTICATION_PERFORMER__HAS_AUTHENTICATION_TOKEN:
				getHasAuthenticationToken().clear();
				getHasAuthenticationToken().addAll((Collection<? extends AuthenticationToken>)newValue);
				return;
			case AuthenticationLayerPSMPackage.AUTHENTICATION_PERFORMER__IS_SYSTEM_AUTHENTICATION_PERFORMER:
				setIsSystemAuthenticationPerformer((AnnJPAController)newValue);
				return;
			case AuthenticationLayerPSMPackage.AUTHENTICATION_PERFORMER__AUTHENTICATION_MODEL_NAME:
				setAuthenticationModelName((String)newValue);
				return;
			case AuthenticationLayerPSMPackage.AUTHENTICATION_PERFORMER__AUTHENTICATION_MODEL_PARENT_NAME:
				setAuthenticationModelParentName((String)newValue);
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
			case AuthenticationLayerPSMPackage.AUTHENTICATION_PERFORMER__HAS_AUTHENTICATION_TOKEN:
				getHasAuthenticationToken().clear();
				return;
			case AuthenticationLayerPSMPackage.AUTHENTICATION_PERFORMER__IS_SYSTEM_AUTHENTICATION_PERFORMER:
				setIsSystemAuthenticationPerformer((AnnJPAController)null);
				return;
			case AuthenticationLayerPSMPackage.AUTHENTICATION_PERFORMER__AUTHENTICATION_MODEL_NAME:
				setAuthenticationModelName(AUTHENTICATION_MODEL_NAME_EDEFAULT);
				return;
			case AuthenticationLayerPSMPackage.AUTHENTICATION_PERFORMER__AUTHENTICATION_MODEL_PARENT_NAME:
				setAuthenticationModelParentName(AUTHENTICATION_MODEL_PARENT_NAME_EDEFAULT);
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
			case AuthenticationLayerPSMPackage.AUTHENTICATION_PERFORMER__HAS_AUTHENTICATION_TOKEN:
				return hasAuthenticationToken != null && !hasAuthenticationToken.isEmpty();
			case AuthenticationLayerPSMPackage.AUTHENTICATION_PERFORMER__IS_SYSTEM_AUTHENTICATION_PERFORMER:
				return isSystemAuthenticationPerformer != null;
			case AuthenticationLayerPSMPackage.AUTHENTICATION_PERFORMER__AUTHENTICATION_MODEL_NAME:
				return AUTHENTICATION_MODEL_NAME_EDEFAULT == null ? authenticationModelName != null : !AUTHENTICATION_MODEL_NAME_EDEFAULT.equals(authenticationModelName);
			case AuthenticationLayerPSMPackage.AUTHENTICATION_PERFORMER__AUTHENTICATION_MODEL_PARENT_NAME:
				return AUTHENTICATION_MODEL_PARENT_NAME_EDEFAULT == null ? authenticationModelParentName != null : !AUTHENTICATION_MODEL_PARENT_NAME_EDEFAULT.equals(authenticationModelParentName);
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
		result.append(" (authenticationModelName: ");
		result.append(authenticationModelName);
		result.append(", authenticationModelParentName: ");
		result.append(authenticationModelParentName);
		result.append(')');
		return result.toString();
	}

} //AuthenticationPerformerImpl
