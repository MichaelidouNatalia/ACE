/**
 */
package AuthorizationLayerPSM.impl;

import AuthorizationLayerPSM.AnnJavaAlgoResourceModel;
import AuthorizationLayerPSM.AnnJavaResourceModel;
import AuthorizationLayerPSM.AnnJavaResourceModelManager;
import AuthorizationLayerPSM.AuthorizableResource;
import AuthorizationLayerPSM.AuthorizationLayerPSMPackage;
import AuthorizationLayerPSM.AuthorizationPerformer;
import AuthorizationLayerPSM.ResourceAccessPolicySet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authorizable Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerPSM.impl.AuthorizableResourceImpl#getIsAuthorizableAlgoModel <em>Is Authorizable Algo Model</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.impl.AuthorizableResourceImpl#getIsAuthorizableResourceModel <em>Is Authorizable Resource Model</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.impl.AuthorizableResourceImpl#getIsAuthorizableModelManager <em>Is Authorizable Model Manager</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.impl.AuthorizableResourceImpl#getHasAuthorizationPerformer <em>Has Authorization Performer</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.impl.AuthorizableResourceImpl#getHasResourceAccessPolicySet <em>Has Resource Access Policy Set</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.impl.AuthorizableResourceImpl#isBTrackOwnership <em>BTrack Ownership</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthorizableResourceImpl extends AnnotationImpl implements AuthorizableResource {
	/**
	 * The cached value of the '{@link #getIsAuthorizableAlgoModel() <em>Is Authorizable Algo Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAuthorizableAlgoModel()
	 * @generated
	 * @ordered
	 */
	protected AnnJavaAlgoResourceModel isAuthorizableAlgoModel;

	/**
	 * The cached value of the '{@link #getIsAuthorizableResourceModel() <em>Is Authorizable Resource Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAuthorizableResourceModel()
	 * @generated
	 * @ordered
	 */
	protected AnnJavaResourceModel isAuthorizableResourceModel;

	/**
	 * The cached value of the '{@link #getIsAuthorizableModelManager() <em>Is Authorizable Model Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAuthorizableModelManager()
	 * @generated
	 * @ordered
	 */
	protected AnnJavaResourceModelManager isAuthorizableModelManager;

	/**
	 * The cached value of the '{@link #getHasAuthorizationPerformer() <em>Has Authorization Performer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAuthorizationPerformer()
	 * @generated
	 * @ordered
	 */
	protected AuthorizationPerformer hasAuthorizationPerformer;

	/**
	 * The cached value of the '{@link #getHasResourceAccessPolicySet() <em>Has Resource Access Policy Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasResourceAccessPolicySet()
	 * @generated
	 * @ordered
	 */
	protected ResourceAccessPolicySet hasResourceAccessPolicySet;

	/**
	 * The default value of the '{@link #isBTrackOwnership() <em>BTrack Ownership</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBTrackOwnership()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BTRACK_OWNERSHIP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBTrackOwnership() <em>BTrack Ownership</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBTrackOwnership()
	 * @generated
	 * @ordered
	 */
	protected boolean bTrackOwnership = BTRACK_OWNERSHIP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorizableResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AuthorizationLayerPSMPackage.Literals.AUTHORIZABLE_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnJavaAlgoResourceModel getIsAuthorizableAlgoModel() {
		if (isAuthorizableAlgoModel != null && isAuthorizableAlgoModel.eIsProxy()) {
			InternalEObject oldIsAuthorizableAlgoModel = (InternalEObject)isAuthorizableAlgoModel;
			isAuthorizableAlgoModel = (AnnJavaAlgoResourceModel)eResolveProxy(oldIsAuthorizableAlgoModel);
			if (isAuthorizableAlgoModel != oldIsAuthorizableAlgoModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_ALGO_MODEL, oldIsAuthorizableAlgoModel, isAuthorizableAlgoModel));
			}
		}
		return isAuthorizableAlgoModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnJavaAlgoResourceModel basicGetIsAuthorizableAlgoModel() {
		return isAuthorizableAlgoModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAuthorizableAlgoModel(AnnJavaAlgoResourceModel newIsAuthorizableAlgoModel) {
		AnnJavaAlgoResourceModel oldIsAuthorizableAlgoModel = isAuthorizableAlgoModel;
		isAuthorizableAlgoModel = newIsAuthorizableAlgoModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_ALGO_MODEL, oldIsAuthorizableAlgoModel, isAuthorizableAlgoModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnJavaResourceModel getIsAuthorizableResourceModel() {
		if (isAuthorizableResourceModel != null && isAuthorizableResourceModel.eIsProxy()) {
			InternalEObject oldIsAuthorizableResourceModel = (InternalEObject)isAuthorizableResourceModel;
			isAuthorizableResourceModel = (AnnJavaResourceModel)eResolveProxy(oldIsAuthorizableResourceModel);
			if (isAuthorizableResourceModel != oldIsAuthorizableResourceModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_RESOURCE_MODEL, oldIsAuthorizableResourceModel, isAuthorizableResourceModel));
			}
		}
		return isAuthorizableResourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnJavaResourceModel basicGetIsAuthorizableResourceModel() {
		return isAuthorizableResourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAuthorizableResourceModel(AnnJavaResourceModel newIsAuthorizableResourceModel) {
		AnnJavaResourceModel oldIsAuthorizableResourceModel = isAuthorizableResourceModel;
		isAuthorizableResourceModel = newIsAuthorizableResourceModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_RESOURCE_MODEL, oldIsAuthorizableResourceModel, isAuthorizableResourceModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnJavaResourceModelManager getIsAuthorizableModelManager() {
		if (isAuthorizableModelManager != null && isAuthorizableModelManager.eIsProxy()) {
			InternalEObject oldIsAuthorizableModelManager = (InternalEObject)isAuthorizableModelManager;
			isAuthorizableModelManager = (AnnJavaResourceModelManager)eResolveProxy(oldIsAuthorizableModelManager);
			if (isAuthorizableModelManager != oldIsAuthorizableModelManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_MODEL_MANAGER, oldIsAuthorizableModelManager, isAuthorizableModelManager));
			}
		}
		return isAuthorizableModelManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnJavaResourceModelManager basicGetIsAuthorizableModelManager() {
		return isAuthorizableModelManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAuthorizableModelManager(AnnJavaResourceModelManager newIsAuthorizableModelManager) {
		AnnJavaResourceModelManager oldIsAuthorizableModelManager = isAuthorizableModelManager;
		isAuthorizableModelManager = newIsAuthorizableModelManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_MODEL_MANAGER, oldIsAuthorizableModelManager, isAuthorizableModelManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationPerformer getHasAuthorizationPerformer() {
		if (hasAuthorizationPerformer != null && hasAuthorizationPerformer.eIsProxy()) {
			InternalEObject oldHasAuthorizationPerformer = (InternalEObject)hasAuthorizationPerformer;
			hasAuthorizationPerformer = (AuthorizationPerformer)eResolveProxy(oldHasAuthorizationPerformer);
			if (hasAuthorizationPerformer != oldHasAuthorizationPerformer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__HAS_AUTHORIZATION_PERFORMER, oldHasAuthorizationPerformer, hasAuthorizationPerformer));
			}
		}
		return hasAuthorizationPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationPerformer basicGetHasAuthorizationPerformer() {
		return hasAuthorizationPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasAuthorizationPerformer(AuthorizationPerformer newHasAuthorizationPerformer) {
		AuthorizationPerformer oldHasAuthorizationPerformer = hasAuthorizationPerformer;
		hasAuthorizationPerformer = newHasAuthorizationPerformer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__HAS_AUTHORIZATION_PERFORMER, oldHasAuthorizationPerformer, hasAuthorizationPerformer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceAccessPolicySet getHasResourceAccessPolicySet() {
		return hasResourceAccessPolicySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasResourceAccessPolicySet(ResourceAccessPolicySet newHasResourceAccessPolicySet, NotificationChain msgs) {
		ResourceAccessPolicySet oldHasResourceAccessPolicySet = hasResourceAccessPolicySet;
		hasResourceAccessPolicySet = newHasResourceAccessPolicySet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__HAS_RESOURCE_ACCESS_POLICY_SET, oldHasResourceAccessPolicySet, newHasResourceAccessPolicySet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasResourceAccessPolicySet(ResourceAccessPolicySet newHasResourceAccessPolicySet) {
		if (newHasResourceAccessPolicySet != hasResourceAccessPolicySet) {
			NotificationChain msgs = null;
			if (hasResourceAccessPolicySet != null)
				msgs = ((InternalEObject)hasResourceAccessPolicySet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__HAS_RESOURCE_ACCESS_POLICY_SET, null, msgs);
			if (newHasResourceAccessPolicySet != null)
				msgs = ((InternalEObject)newHasResourceAccessPolicySet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__HAS_RESOURCE_ACCESS_POLICY_SET, null, msgs);
			msgs = basicSetHasResourceAccessPolicySet(newHasResourceAccessPolicySet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__HAS_RESOURCE_ACCESS_POLICY_SET, newHasResourceAccessPolicySet, newHasResourceAccessPolicySet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBTrackOwnership() {
		return bTrackOwnership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBTrackOwnership(boolean newBTrackOwnership) {
		boolean oldBTrackOwnership = bTrackOwnership;
		bTrackOwnership = newBTrackOwnership;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__BTRACK_OWNERSHIP, oldBTrackOwnership, bTrackOwnership));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__HAS_RESOURCE_ACCESS_POLICY_SET:
				return basicSetHasResourceAccessPolicySet(null, msgs);
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
			case AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_ALGO_MODEL:
				if (resolve) return getIsAuthorizableAlgoModel();
				return basicGetIsAuthorizableAlgoModel();
			case AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_RESOURCE_MODEL:
				if (resolve) return getIsAuthorizableResourceModel();
				return basicGetIsAuthorizableResourceModel();
			case AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_MODEL_MANAGER:
				if (resolve) return getIsAuthorizableModelManager();
				return basicGetIsAuthorizableModelManager();
			case AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__HAS_AUTHORIZATION_PERFORMER:
				if (resolve) return getHasAuthorizationPerformer();
				return basicGetHasAuthorizationPerformer();
			case AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__HAS_RESOURCE_ACCESS_POLICY_SET:
				return getHasResourceAccessPolicySet();
			case AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__BTRACK_OWNERSHIP:
				return isBTrackOwnership();
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
			case AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_ALGO_MODEL:
				setIsAuthorizableAlgoModel((AnnJavaAlgoResourceModel)newValue);
				return;
			case AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_RESOURCE_MODEL:
				setIsAuthorizableResourceModel((AnnJavaResourceModel)newValue);
				return;
			case AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_MODEL_MANAGER:
				setIsAuthorizableModelManager((AnnJavaResourceModelManager)newValue);
				return;
			case AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__HAS_AUTHORIZATION_PERFORMER:
				setHasAuthorizationPerformer((AuthorizationPerformer)newValue);
				return;
			case AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__HAS_RESOURCE_ACCESS_POLICY_SET:
				setHasResourceAccessPolicySet((ResourceAccessPolicySet)newValue);
				return;
			case AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__BTRACK_OWNERSHIP:
				setBTrackOwnership((Boolean)newValue);
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
			case AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_ALGO_MODEL:
				setIsAuthorizableAlgoModel((AnnJavaAlgoResourceModel)null);
				return;
			case AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_RESOURCE_MODEL:
				setIsAuthorizableResourceModel((AnnJavaResourceModel)null);
				return;
			case AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_MODEL_MANAGER:
				setIsAuthorizableModelManager((AnnJavaResourceModelManager)null);
				return;
			case AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__HAS_AUTHORIZATION_PERFORMER:
				setHasAuthorizationPerformer((AuthorizationPerformer)null);
				return;
			case AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__HAS_RESOURCE_ACCESS_POLICY_SET:
				setHasResourceAccessPolicySet((ResourceAccessPolicySet)null);
				return;
			case AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__BTRACK_OWNERSHIP:
				setBTrackOwnership(BTRACK_OWNERSHIP_EDEFAULT);
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
			case AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_ALGO_MODEL:
				return isAuthorizableAlgoModel != null;
			case AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_RESOURCE_MODEL:
				return isAuthorizableResourceModel != null;
			case AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_MODEL_MANAGER:
				return isAuthorizableModelManager != null;
			case AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__HAS_AUTHORIZATION_PERFORMER:
				return hasAuthorizationPerformer != null;
			case AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__HAS_RESOURCE_ACCESS_POLICY_SET:
				return hasResourceAccessPolicySet != null;
			case AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE__BTRACK_OWNERSHIP:
				return bTrackOwnership != BTRACK_OWNERSHIP_EDEFAULT;
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
		result.append(" (bTrackOwnership: ");
		result.append(bTrackOwnership);
		result.append(')');
		return result.toString();
	}

} //AuthorizableResourceImpl
