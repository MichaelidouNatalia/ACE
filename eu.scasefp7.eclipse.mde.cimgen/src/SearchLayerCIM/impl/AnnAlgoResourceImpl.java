/**
 */
package SearchLayerCIM.impl;

import SearchLayerCIM.AnnAlgoResource;
import SearchLayerCIM.SearchLayerCIMPackage;

import ServiceCIM.Resource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ann Algo Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SearchLayerCIM.impl.AnnAlgoResourceImpl#getAnnotatesAlgoResource <em>Annotates Algo Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnAlgoResourceImpl extends AnnotatedElementImpl implements AnnAlgoResource {
	/**
	 * The cached value of the '{@link #getAnnotatesAlgoResource() <em>Annotates Algo Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatesAlgoResource()
	 * @generated
	 * @ordered
	 */
	protected Resource annotatesAlgoResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnAlgoResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SearchLayerCIMPackage.Literals.ANN_ALGO_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getAnnotatesAlgoResource() {
		if (annotatesAlgoResource != null && annotatesAlgoResource.eIsProxy()) {
			InternalEObject oldAnnotatesAlgoResource = (InternalEObject)annotatesAlgoResource;
			annotatesAlgoResource = (Resource)eResolveProxy(oldAnnotatesAlgoResource);
			if (annotatesAlgoResource != oldAnnotatesAlgoResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SearchLayerCIMPackage.ANN_ALGO_RESOURCE__ANNOTATES_ALGO_RESOURCE, oldAnnotatesAlgoResource, annotatesAlgoResource));
			}
		}
		return annotatesAlgoResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetAnnotatesAlgoResource() {
		return annotatesAlgoResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotatesAlgoResource(Resource newAnnotatesAlgoResource) {
		Resource oldAnnotatesAlgoResource = annotatesAlgoResource;
		annotatesAlgoResource = newAnnotatesAlgoResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SearchLayerCIMPackage.ANN_ALGO_RESOURCE__ANNOTATES_ALGO_RESOURCE, oldAnnotatesAlgoResource, annotatesAlgoResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SearchLayerCIMPackage.ANN_ALGO_RESOURCE__ANNOTATES_ALGO_RESOURCE:
				if (resolve) return getAnnotatesAlgoResource();
				return basicGetAnnotatesAlgoResource();
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
			case SearchLayerCIMPackage.ANN_ALGO_RESOURCE__ANNOTATES_ALGO_RESOURCE:
				setAnnotatesAlgoResource((Resource)newValue);
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
			case SearchLayerCIMPackage.ANN_ALGO_RESOURCE__ANNOTATES_ALGO_RESOURCE:
				setAnnotatesAlgoResource((Resource)null);
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
			case SearchLayerCIMPackage.ANN_ALGO_RESOURCE__ANNOTATES_ALGO_RESOURCE:
				return annotatesAlgoResource != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnAlgoResourceImpl
