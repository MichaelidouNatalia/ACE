/**
 */
package AuthorizationLayerCIM.impl;

import AuthorizationLayerCIM.AnnResource;
import AuthorizationLayerCIM.AuthorizableResource;
import AuthorizationLayerCIM.AuthorizationLayerCIMPackage;
import AuthorizationLayerCIM.ResourceAccessPolicySet;
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
 *   <li>{@link AuthorizationLayerCIM.impl.AuthorizableResourceImpl#getHasResourceAccessPolicySet <em>Has Resource Access Policy Set</em>}</li>
 *   <li>{@link AuthorizationLayerCIM.impl.AuthorizableResourceImpl#getIsAuthorizableResource <em>Is Authorizable Resource</em>}</li>
 *   <li>{@link AuthorizationLayerCIM.impl.AuthorizableResourceImpl#isBTrackOwnership <em>BTrack Ownership</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthorizableResourceImpl extends AnnotationImpl implements AuthorizableResource {
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
	 * The cached value of the '{@link #getIsAuthorizableResource() <em>Is Authorizable Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAuthorizableResource()
	 * @generated
	 * @ordered
	 */
	protected AnnResource isAuthorizableResource;

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
		return AuthorizationLayerCIMPackage.Literals.AUTHORIZABLE_RESOURCE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AuthorizationLayerCIMPackage.AUTHORIZABLE_RESOURCE__HAS_RESOURCE_ACCESS_POLICY_SET, oldHasResourceAccessPolicySet, newHasResourceAccessPolicySet);
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
				msgs = ((InternalEObject)hasResourceAccessPolicySet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AuthorizationLayerCIMPackage.AUTHORIZABLE_RESOURCE__HAS_RESOURCE_ACCESS_POLICY_SET, null, msgs);
			if (newHasResourceAccessPolicySet != null)
				msgs = ((InternalEObject)newHasResourceAccessPolicySet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AuthorizationLayerCIMPackage.AUTHORIZABLE_RESOURCE__HAS_RESOURCE_ACCESS_POLICY_SET, null, msgs);
			msgs = basicSetHasResourceAccessPolicySet(newHasResourceAccessPolicySet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerCIMPackage.AUTHORIZABLE_RESOURCE__HAS_RESOURCE_ACCESS_POLICY_SET, newHasResourceAccessPolicySet, newHasResourceAccessPolicySet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnResource getIsAuthorizableResource() {
		if (isAuthorizableResource != null && isAuthorizableResource.eIsProxy()) {
			InternalEObject oldIsAuthorizableResource = (InternalEObject)isAuthorizableResource;
			isAuthorizableResource = (AnnResource)eResolveProxy(oldIsAuthorizableResource);
			if (isAuthorizableResource != oldIsAuthorizableResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AuthorizationLayerCIMPackage.AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_RESOURCE, oldIsAuthorizableResource, isAuthorizableResource));
			}
		}
		return isAuthorizableResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnResource basicGetIsAuthorizableResource() {
		return isAuthorizableResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAuthorizableResource(AnnResource newIsAuthorizableResource) {
		AnnResource oldIsAuthorizableResource = isAuthorizableResource;
		isAuthorizableResource = newIsAuthorizableResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerCIMPackage.AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_RESOURCE, oldIsAuthorizableResource, isAuthorizableResource));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerCIMPackage.AUTHORIZABLE_RESOURCE__BTRACK_OWNERSHIP, oldBTrackOwnership, bTrackOwnership));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AuthorizationLayerCIMPackage.AUTHORIZABLE_RESOURCE__HAS_RESOURCE_ACCESS_POLICY_SET:
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
			case AuthorizationLayerCIMPackage.AUTHORIZABLE_RESOURCE__HAS_RESOURCE_ACCESS_POLICY_SET:
				return getHasResourceAccessPolicySet();
			case AuthorizationLayerCIMPackage.AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_RESOURCE:
				if (resolve) return getIsAuthorizableResource();
				return basicGetIsAuthorizableResource();
			case AuthorizationLayerCIMPackage.AUTHORIZABLE_RESOURCE__BTRACK_OWNERSHIP:
				return isBTrackOwnership();
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
			case AuthorizationLayerCIMPackage.AUTHORIZABLE_RESOURCE__HAS_RESOURCE_ACCESS_POLICY_SET:
				setHasResourceAccessPolicySet((ResourceAccessPolicySet)newValue);
				return;
			case AuthorizationLayerCIMPackage.AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_RESOURCE:
				setIsAuthorizableResource((AnnResource)newValue);
				return;
			case AuthorizationLayerCIMPackage.AUTHORIZABLE_RESOURCE__BTRACK_OWNERSHIP:
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
			case AuthorizationLayerCIMPackage.AUTHORIZABLE_RESOURCE__HAS_RESOURCE_ACCESS_POLICY_SET:
				setHasResourceAccessPolicySet((ResourceAccessPolicySet)null);
				return;
			case AuthorizationLayerCIMPackage.AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_RESOURCE:
				setIsAuthorizableResource((AnnResource)null);
				return;
			case AuthorizationLayerCIMPackage.AUTHORIZABLE_RESOURCE__BTRACK_OWNERSHIP:
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
			case AuthorizationLayerCIMPackage.AUTHORIZABLE_RESOURCE__HAS_RESOURCE_ACCESS_POLICY_SET:
				return hasResourceAccessPolicySet != null;
			case AuthorizationLayerCIMPackage.AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_RESOURCE:
				return isAuthorizableResource != null;
			case AuthorizationLayerCIMPackage.AUTHORIZABLE_RESOURCE__BTRACK_OWNERSHIP:
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
