/**
 */
package AuthenticationLayerCIM.impl;

import AuthenticationLayerCIM.AnnResource;
import AuthenticationLayerCIM.AuthenticationLayerCIMPackage;
import AuthenticationLayerCIM.AuthenticationModel;
import AuthenticationLayerCIM.AuthenticationToken;

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
 * An implementation of the model object '<em><b>Authentication Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link AuthenticationLayerCIM.impl.AuthenticationModelImpl#getHasAuthenticationToken <em>Has Authentication Token</em>}</li>
 *   <li>{@link AuthenticationLayerCIM.impl.AuthenticationModelImpl#getResourceAuthenticationModel <em>Resource Authentication Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuthenticationModelImpl extends AnnotationImpl implements AuthenticationModel {
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
	 * The cached value of the '{@link #getResourceAuthenticationModel() <em>Resource Authentication Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceAuthenticationModel()
	 * @generated
	 * @ordered
	 */
	protected AnnResource resourceAuthenticationModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthenticationModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AuthenticationLayerCIMPackage.Literals.AUTHENTICATION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuthenticationToken> getHasAuthenticationToken() {
		if (hasAuthenticationToken == null) {
			hasAuthenticationToken = new EObjectContainmentEList<AuthenticationToken>(AuthenticationToken.class, this, AuthenticationLayerCIMPackage.AUTHENTICATION_MODEL__HAS_AUTHENTICATION_TOKEN);
		}
		return hasAuthenticationToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnResource getResourceAuthenticationModel() {
		if (resourceAuthenticationModel != null && resourceAuthenticationModel.eIsProxy()) {
			InternalEObject oldResourceAuthenticationModel = (InternalEObject)resourceAuthenticationModel;
			resourceAuthenticationModel = (AnnResource)eResolveProxy(oldResourceAuthenticationModel);
			if (resourceAuthenticationModel != oldResourceAuthenticationModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AuthenticationLayerCIMPackage.AUTHENTICATION_MODEL__RESOURCE_AUTHENTICATION_MODEL, oldResourceAuthenticationModel, resourceAuthenticationModel));
			}
		}
		return resourceAuthenticationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnResource basicGetResourceAuthenticationModel() {
		return resourceAuthenticationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceAuthenticationModel(AnnResource newResourceAuthenticationModel) {
		AnnResource oldResourceAuthenticationModel = resourceAuthenticationModel;
		resourceAuthenticationModel = newResourceAuthenticationModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthenticationLayerCIMPackage.AUTHENTICATION_MODEL__RESOURCE_AUTHENTICATION_MODEL, oldResourceAuthenticationModel, resourceAuthenticationModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AuthenticationLayerCIMPackage.AUTHENTICATION_MODEL__HAS_AUTHENTICATION_TOKEN:
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
			case AuthenticationLayerCIMPackage.AUTHENTICATION_MODEL__HAS_AUTHENTICATION_TOKEN:
				return getHasAuthenticationToken();
			case AuthenticationLayerCIMPackage.AUTHENTICATION_MODEL__RESOURCE_AUTHENTICATION_MODEL:
				if (resolve) return getResourceAuthenticationModel();
				return basicGetResourceAuthenticationModel();
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
			case AuthenticationLayerCIMPackage.AUTHENTICATION_MODEL__HAS_AUTHENTICATION_TOKEN:
				getHasAuthenticationToken().clear();
				getHasAuthenticationToken().addAll((Collection<? extends AuthenticationToken>)newValue);
				return;
			case AuthenticationLayerCIMPackage.AUTHENTICATION_MODEL__RESOURCE_AUTHENTICATION_MODEL:
				setResourceAuthenticationModel((AnnResource)newValue);
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
			case AuthenticationLayerCIMPackage.AUTHENTICATION_MODEL__HAS_AUTHENTICATION_TOKEN:
				getHasAuthenticationToken().clear();
				return;
			case AuthenticationLayerCIMPackage.AUTHENTICATION_MODEL__RESOURCE_AUTHENTICATION_MODEL:
				setResourceAuthenticationModel((AnnResource)null);
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
			case AuthenticationLayerCIMPackage.AUTHENTICATION_MODEL__HAS_AUTHENTICATION_TOKEN:
				return hasAuthenticationToken != null && !hasAuthenticationToken.isEmpty();
			case AuthenticationLayerCIMPackage.AUTHENTICATION_MODEL__RESOURCE_AUTHENTICATION_MODEL:
				return resourceAuthenticationModel != null;
		}
		return super.eIsSet(featureID);
	}

} //AuthenticationModelImpl
