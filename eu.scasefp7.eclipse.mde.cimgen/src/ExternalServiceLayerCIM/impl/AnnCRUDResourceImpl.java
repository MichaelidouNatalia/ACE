/**
 */
package ExternalServiceLayerCIM.impl;

import ExternalServiceLayerCIM.AnnCRUDResource;
import ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage;

import ServiceCIM.Resource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ann CRUD Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ExternalServiceLayerCIM.impl.AnnCRUDResourceImpl#getAnnotatesCRUDResource <em>Annotates CRUD Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnCRUDResourceImpl extends AnnotatedElementImpl implements AnnCRUDResource {
	/**
	 * The cached value of the '{@link #getAnnotatesCRUDResource() <em>Annotates CRUD Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatesCRUDResource()
	 * @generated
	 * @ordered
	 */
	protected Resource annotatesCRUDResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnCRUDResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExternalServiceLayerCIMPackage.Literals.ANN_CRUD_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getAnnotatesCRUDResource() {
		if (annotatesCRUDResource != null && annotatesCRUDResource.eIsProxy()) {
			InternalEObject oldAnnotatesCRUDResource = (InternalEObject)annotatesCRUDResource;
			annotatesCRUDResource = (Resource)eResolveProxy(oldAnnotatesCRUDResource);
			if (annotatesCRUDResource != oldAnnotatesCRUDResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExternalServiceLayerCIMPackage.ANN_CRUD_RESOURCE__ANNOTATES_CRUD_RESOURCE, oldAnnotatesCRUDResource, annotatesCRUDResource));
			}
		}
		return annotatesCRUDResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetAnnotatesCRUDResource() {
		return annotatesCRUDResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotatesCRUDResource(Resource newAnnotatesCRUDResource) {
		Resource oldAnnotatesCRUDResource = annotatesCRUDResource;
		annotatesCRUDResource = newAnnotatesCRUDResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerCIMPackage.ANN_CRUD_RESOURCE__ANNOTATES_CRUD_RESOURCE, oldAnnotatesCRUDResource, annotatesCRUDResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExternalServiceLayerCIMPackage.ANN_CRUD_RESOURCE__ANNOTATES_CRUD_RESOURCE:
				if (resolve) return getAnnotatesCRUDResource();
				return basicGetAnnotatesCRUDResource();
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
			case ExternalServiceLayerCIMPackage.ANN_CRUD_RESOURCE__ANNOTATES_CRUD_RESOURCE:
				setAnnotatesCRUDResource((Resource)newValue);
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
			case ExternalServiceLayerCIMPackage.ANN_CRUD_RESOURCE__ANNOTATES_CRUD_RESOURCE:
				setAnnotatesCRUDResource((Resource)null);
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
			case ExternalServiceLayerCIMPackage.ANN_CRUD_RESOURCE__ANNOTATES_CRUD_RESOURCE:
				return annotatesCRUDResource != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnCRUDResourceImpl
