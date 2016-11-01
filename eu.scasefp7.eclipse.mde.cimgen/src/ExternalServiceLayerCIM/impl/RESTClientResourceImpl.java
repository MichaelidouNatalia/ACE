/**
 */
package ExternalServiceLayerCIM.impl;

import ExternalServiceLayerCIM.AnnAlgoResource;
import ExternalServiceLayerCIM.ComplexType;
import ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage;
import ExternalServiceLayerCIM.PathParam;
import ExternalServiceLayerCIM.RESTClientResource;
import ExternalServiceLayerCIM.TargetRESTService;

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
 * An implementation of the model object '<em><b>REST Client Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ExternalServiceLayerCIM.impl.RESTClientResourceImpl#getTargetsService <em>Targets Service</em>}</li>
 *   <li>{@link ExternalServiceLayerCIM.impl.RESTClientResourceImpl#getIsRESTClientResource <em>Is REST Client Resource</em>}</li>
 *   <li>{@link ExternalServiceLayerCIM.impl.RESTClientResourceImpl#getHasPathParam <em>Has Path Param</em>}</li>
 *   <li>{@link ExternalServiceLayerCIM.impl.RESTClientResourceImpl#getIsRESTClientComplexType <em>Is REST Client Complex Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RESTClientResourceImpl extends AnnotationImpl implements RESTClientResource {
	/**
	 * The cached value of the '{@link #getTargetsService() <em>Targets Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetsService()
	 * @generated
	 * @ordered
	 */
	protected TargetRESTService targetsService;

	/**
	 * The cached value of the '{@link #getIsRESTClientResource() <em>Is REST Client Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRESTClientResource()
	 * @generated
	 * @ordered
	 */
	protected AnnAlgoResource isRESTClientResource;

	/**
	 * The cached value of the '{@link #getHasPathParam() <em>Has Path Param</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasPathParam()
	 * @generated
	 * @ordered
	 */
	protected EList<PathParam> hasPathParam;

	/**
	 * The cached value of the '{@link #getIsRESTClientComplexType() <em>Is REST Client Complex Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRESTClientComplexType()
	 * @generated
	 * @ordered
	 */
	protected EList<ComplexType> isRESTClientComplexType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RESTClientResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExternalServiceLayerCIMPackage.Literals.REST_CLIENT_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetRESTService getTargetsService() {
		return targetsService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetsService(TargetRESTService newTargetsService, NotificationChain msgs) {
		TargetRESTService oldTargetsService = targetsService;
		targetsService = newTargetsService;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExternalServiceLayerCIMPackage.REST_CLIENT_RESOURCE__TARGETS_SERVICE, oldTargetsService, newTargetsService);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetsService(TargetRESTService newTargetsService) {
		if (newTargetsService != targetsService) {
			NotificationChain msgs = null;
			if (targetsService != null)
				msgs = ((InternalEObject)targetsService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExternalServiceLayerCIMPackage.REST_CLIENT_RESOURCE__TARGETS_SERVICE, null, msgs);
			if (newTargetsService != null)
				msgs = ((InternalEObject)newTargetsService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExternalServiceLayerCIMPackage.REST_CLIENT_RESOURCE__TARGETS_SERVICE, null, msgs);
			msgs = basicSetTargetsService(newTargetsService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerCIMPackage.REST_CLIENT_RESOURCE__TARGETS_SERVICE, newTargetsService, newTargetsService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnAlgoResource getIsRESTClientResource() {
		if (isRESTClientResource != null && isRESTClientResource.eIsProxy()) {
			InternalEObject oldIsRESTClientResource = (InternalEObject)isRESTClientResource;
			isRESTClientResource = (AnnAlgoResource)eResolveProxy(oldIsRESTClientResource);
			if (isRESTClientResource != oldIsRESTClientResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExternalServiceLayerCIMPackage.REST_CLIENT_RESOURCE__IS_REST_CLIENT_RESOURCE, oldIsRESTClientResource, isRESTClientResource));
			}
		}
		return isRESTClientResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnAlgoResource basicGetIsRESTClientResource() {
		return isRESTClientResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRESTClientResource(AnnAlgoResource newIsRESTClientResource) {
		AnnAlgoResource oldIsRESTClientResource = isRESTClientResource;
		isRESTClientResource = newIsRESTClientResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerCIMPackage.REST_CLIENT_RESOURCE__IS_REST_CLIENT_RESOURCE, oldIsRESTClientResource, isRESTClientResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathParam> getHasPathParam() {
		if (hasPathParam == null) {
			hasPathParam = new EObjectContainmentEList<PathParam>(PathParam.class, this, ExternalServiceLayerCIMPackage.REST_CLIENT_RESOURCE__HAS_PATH_PARAM);
		}
		return hasPathParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComplexType> getIsRESTClientComplexType() {
		if (isRESTClientComplexType == null) {
			isRESTClientComplexType = new EObjectContainmentEList<ComplexType>(ComplexType.class, this, ExternalServiceLayerCIMPackage.REST_CLIENT_RESOURCE__IS_REST_CLIENT_COMPLEX_TYPE);
		}
		return isRESTClientComplexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExternalServiceLayerCIMPackage.REST_CLIENT_RESOURCE__TARGETS_SERVICE:
				return basicSetTargetsService(null, msgs);
			case ExternalServiceLayerCIMPackage.REST_CLIENT_RESOURCE__HAS_PATH_PARAM:
				return ((InternalEList<?>)getHasPathParam()).basicRemove(otherEnd, msgs);
			case ExternalServiceLayerCIMPackage.REST_CLIENT_RESOURCE__IS_REST_CLIENT_COMPLEX_TYPE:
				return ((InternalEList<?>)getIsRESTClientComplexType()).basicRemove(otherEnd, msgs);
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
			case ExternalServiceLayerCIMPackage.REST_CLIENT_RESOURCE__TARGETS_SERVICE:
				return getTargetsService();
			case ExternalServiceLayerCIMPackage.REST_CLIENT_RESOURCE__IS_REST_CLIENT_RESOURCE:
				if (resolve) return getIsRESTClientResource();
				return basicGetIsRESTClientResource();
			case ExternalServiceLayerCIMPackage.REST_CLIENT_RESOURCE__HAS_PATH_PARAM:
				return getHasPathParam();
			case ExternalServiceLayerCIMPackage.REST_CLIENT_RESOURCE__IS_REST_CLIENT_COMPLEX_TYPE:
				return getIsRESTClientComplexType();
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
			case ExternalServiceLayerCIMPackage.REST_CLIENT_RESOURCE__TARGETS_SERVICE:
				setTargetsService((TargetRESTService)newValue);
				return;
			case ExternalServiceLayerCIMPackage.REST_CLIENT_RESOURCE__IS_REST_CLIENT_RESOURCE:
				setIsRESTClientResource((AnnAlgoResource)newValue);
				return;
			case ExternalServiceLayerCIMPackage.REST_CLIENT_RESOURCE__HAS_PATH_PARAM:
				getHasPathParam().clear();
				getHasPathParam().addAll((Collection<? extends PathParam>)newValue);
				return;
			case ExternalServiceLayerCIMPackage.REST_CLIENT_RESOURCE__IS_REST_CLIENT_COMPLEX_TYPE:
				getIsRESTClientComplexType().clear();
				getIsRESTClientComplexType().addAll((Collection<? extends ComplexType>)newValue);
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
			case ExternalServiceLayerCIMPackage.REST_CLIENT_RESOURCE__TARGETS_SERVICE:
				setTargetsService((TargetRESTService)null);
				return;
			case ExternalServiceLayerCIMPackage.REST_CLIENT_RESOURCE__IS_REST_CLIENT_RESOURCE:
				setIsRESTClientResource((AnnAlgoResource)null);
				return;
			case ExternalServiceLayerCIMPackage.REST_CLIENT_RESOURCE__HAS_PATH_PARAM:
				getHasPathParam().clear();
				return;
			case ExternalServiceLayerCIMPackage.REST_CLIENT_RESOURCE__IS_REST_CLIENT_COMPLEX_TYPE:
				getIsRESTClientComplexType().clear();
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
			case ExternalServiceLayerCIMPackage.REST_CLIENT_RESOURCE__TARGETS_SERVICE:
				return targetsService != null;
			case ExternalServiceLayerCIMPackage.REST_CLIENT_RESOURCE__IS_REST_CLIENT_RESOURCE:
				return isRESTClientResource != null;
			case ExternalServiceLayerCIMPackage.REST_CLIENT_RESOURCE__HAS_PATH_PARAM:
				return hasPathParam != null && !hasPathParam.isEmpty();
			case ExternalServiceLayerCIMPackage.REST_CLIENT_RESOURCE__IS_REST_CLIENT_COMPLEX_TYPE:
				return isRESTClientComplexType != null && !isRESTClientComplexType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RESTClientResourceImpl
