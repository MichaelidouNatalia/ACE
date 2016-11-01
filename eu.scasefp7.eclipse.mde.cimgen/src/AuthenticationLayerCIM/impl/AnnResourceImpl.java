/**
 */
package AuthenticationLayerCIM.impl;

import AuthenticationLayerCIM.AnnResource;
import AuthenticationLayerCIM.AuthenticationLayerCIMPackage;

import ServiceCIM.Resource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ann Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link AuthenticationLayerCIM.impl.AnnResourceImpl#getAnnotatesResource <em>Annotates Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnResourceImpl extends AnnotatedElementImpl implements AnnResource {
	/**
	 * The cached value of the '{@link #getAnnotatesResource() <em>Annotates Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatesResource()
	 * @generated
	 * @ordered
	 */
	protected Resource annotatesResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AuthenticationLayerCIMPackage.Literals.ANN_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getAnnotatesResource() {
		if (annotatesResource != null && annotatesResource.eIsProxy()) {
			InternalEObject oldAnnotatesResource = (InternalEObject)annotatesResource;
			annotatesResource = (Resource)eResolveProxy(oldAnnotatesResource);
			if (annotatesResource != oldAnnotatesResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AuthenticationLayerCIMPackage.ANN_RESOURCE__ANNOTATES_RESOURCE, oldAnnotatesResource, annotatesResource));
			}
		}
		return annotatesResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetAnnotatesResource() {
		return annotatesResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotatesResource(Resource newAnnotatesResource) {
		Resource oldAnnotatesResource = annotatesResource;
		annotatesResource = newAnnotatesResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthenticationLayerCIMPackage.ANN_RESOURCE__ANNOTATES_RESOURCE, oldAnnotatesResource, annotatesResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AuthenticationLayerCIMPackage.ANN_RESOURCE__ANNOTATES_RESOURCE:
				if (resolve) return getAnnotatesResource();
				return basicGetAnnotatesResource();
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
			case AuthenticationLayerCIMPackage.ANN_RESOURCE__ANNOTATES_RESOURCE:
				setAnnotatesResource((Resource)newValue);
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
			case AuthenticationLayerCIMPackage.ANN_RESOURCE__ANNOTATES_RESOURCE:
				setAnnotatesResource((Resource)null);
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
			case AuthenticationLayerCIMPackage.ANN_RESOURCE__ANNOTATES_RESOURCE:
				return annotatesResource != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnResourceImpl
