/**
 */
package AuthenticationLayerCIM.impl;

import AuthenticationLayerCIM.AnnCRUDActivity;
import AuthenticationLayerCIM.AuthenticationLayerCIMPackage;

import ServiceCIM.CRUDActivity;
import ServiceCIM.Resource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ann CRUD Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link AuthenticationLayerCIM.impl.AnnCRUDActivityImpl#getAnnotatesCRUDActivity <em>Annotates CRUD Activity</em>}</li>
 *   <li>{@link AuthenticationLayerCIM.impl.AnnCRUDActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link AuthenticationLayerCIM.impl.AnnCRUDActivityImpl#getBelongsToResource <em>Belongs To Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnCRUDActivityImpl extends AnnotatedElementImpl implements AnnCRUDActivity {
	/**
	 * The cached value of the '{@link #getAnnotatesCRUDActivity() <em>Annotates CRUD Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatesCRUDActivity()
	 * @generated
	 * @ordered
	 */
	protected CRUDActivity annotatesCRUDActivity;

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
	 * The cached value of the '{@link #getBelongsToResource() <em>Belongs To Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelongsToResource()
	 * @generated
	 * @ordered
	 */
	protected Resource belongsToResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnCRUDActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AuthenticationLayerCIMPackage.Literals.ANN_CRUD_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRUDActivity getAnnotatesCRUDActivity() {
		if (annotatesCRUDActivity != null && annotatesCRUDActivity.eIsProxy()) {
			InternalEObject oldAnnotatesCRUDActivity = (InternalEObject)annotatesCRUDActivity;
			annotatesCRUDActivity = (CRUDActivity)eResolveProxy(oldAnnotatesCRUDActivity);
			if (annotatesCRUDActivity != oldAnnotatesCRUDActivity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AuthenticationLayerCIMPackage.ANN_CRUD_ACTIVITY__ANNOTATES_CRUD_ACTIVITY, oldAnnotatesCRUDActivity, annotatesCRUDActivity));
			}
		}
		return annotatesCRUDActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CRUDActivity basicGetAnnotatesCRUDActivity() {
		return annotatesCRUDActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotatesCRUDActivity(CRUDActivity newAnnotatesCRUDActivity) {
		CRUDActivity oldAnnotatesCRUDActivity = annotatesCRUDActivity;
		annotatesCRUDActivity = newAnnotatesCRUDActivity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthenticationLayerCIMPackage.ANN_CRUD_ACTIVITY__ANNOTATES_CRUD_ACTIVITY, oldAnnotatesCRUDActivity, annotatesCRUDActivity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AuthenticationLayerCIMPackage.ANN_CRUD_ACTIVITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getBelongsToResource() {
		if (belongsToResource != null && belongsToResource.eIsProxy()) {
			InternalEObject oldBelongsToResource = (InternalEObject)belongsToResource;
			belongsToResource = (Resource)eResolveProxy(oldBelongsToResource);
			if (belongsToResource != oldBelongsToResource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AuthenticationLayerCIMPackage.ANN_CRUD_ACTIVITY__BELONGS_TO_RESOURCE, oldBelongsToResource, belongsToResource));
			}
		}
		return belongsToResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetBelongsToResource() {
		return belongsToResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelongsToResource(Resource newBelongsToResource) {
		Resource oldBelongsToResource = belongsToResource;
		belongsToResource = newBelongsToResource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthenticationLayerCIMPackage.ANN_CRUD_ACTIVITY__BELONGS_TO_RESOURCE, oldBelongsToResource, belongsToResource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AuthenticationLayerCIMPackage.ANN_CRUD_ACTIVITY__ANNOTATES_CRUD_ACTIVITY:
				if (resolve) return getAnnotatesCRUDActivity();
				return basicGetAnnotatesCRUDActivity();
			case AuthenticationLayerCIMPackage.ANN_CRUD_ACTIVITY__NAME:
				return getName();
			case AuthenticationLayerCIMPackage.ANN_CRUD_ACTIVITY__BELONGS_TO_RESOURCE:
				if (resolve) return getBelongsToResource();
				return basicGetBelongsToResource();
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
			case AuthenticationLayerCIMPackage.ANN_CRUD_ACTIVITY__ANNOTATES_CRUD_ACTIVITY:
				setAnnotatesCRUDActivity((CRUDActivity)newValue);
				return;
			case AuthenticationLayerCIMPackage.ANN_CRUD_ACTIVITY__NAME:
				setName((String)newValue);
				return;
			case AuthenticationLayerCIMPackage.ANN_CRUD_ACTIVITY__BELONGS_TO_RESOURCE:
				setBelongsToResource((Resource)newValue);
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
			case AuthenticationLayerCIMPackage.ANN_CRUD_ACTIVITY__ANNOTATES_CRUD_ACTIVITY:
				setAnnotatesCRUDActivity((CRUDActivity)null);
				return;
			case AuthenticationLayerCIMPackage.ANN_CRUD_ACTIVITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AuthenticationLayerCIMPackage.ANN_CRUD_ACTIVITY__BELONGS_TO_RESOURCE:
				setBelongsToResource((Resource)null);
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
			case AuthenticationLayerCIMPackage.ANN_CRUD_ACTIVITY__ANNOTATES_CRUD_ACTIVITY:
				return annotatesCRUDActivity != null;
			case AuthenticationLayerCIMPackage.ANN_CRUD_ACTIVITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AuthenticationLayerCIMPackage.ANN_CRUD_ACTIVITY__BELONGS_TO_RESOURCE:
				return belongsToResource != null;
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
		result.append(')');
		return result.toString();
	}

} //AnnCRUDActivityImpl
