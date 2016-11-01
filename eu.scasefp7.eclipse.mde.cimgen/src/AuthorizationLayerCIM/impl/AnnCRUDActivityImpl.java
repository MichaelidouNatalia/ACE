/**
 */
package AuthorizationLayerCIM.impl;

import AuthorizationLayerCIM.AnnCRUDActivity;
import AuthorizationLayerCIM.AuthorizationLayerCIMPackage;

import ServiceCIM.CRUDActivity;

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
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerCIM.impl.AnnCRUDActivityImpl#getAnnotatesCRUDActivity <em>Annotates CRUD Activity</em>}</li>
 * </ul>
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
		return AuthorizationLayerCIMPackage.Literals.ANN_CRUD_ACTIVITY;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AuthorizationLayerCIMPackage.ANN_CRUD_ACTIVITY__ANNOTATES_CRUD_ACTIVITY, oldAnnotatesCRUDActivity, annotatesCRUDActivity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerCIMPackage.ANN_CRUD_ACTIVITY__ANNOTATES_CRUD_ACTIVITY, oldAnnotatesCRUDActivity, annotatesCRUDActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AuthorizationLayerCIMPackage.ANN_CRUD_ACTIVITY__ANNOTATES_CRUD_ACTIVITY:
				if (resolve) return getAnnotatesCRUDActivity();
				return basicGetAnnotatesCRUDActivity();
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
			case AuthorizationLayerCIMPackage.ANN_CRUD_ACTIVITY__ANNOTATES_CRUD_ACTIVITY:
				setAnnotatesCRUDActivity((CRUDActivity)newValue);
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
			case AuthorizationLayerCIMPackage.ANN_CRUD_ACTIVITY__ANNOTATES_CRUD_ACTIVITY:
				setAnnotatesCRUDActivity((CRUDActivity)null);
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
			case AuthorizationLayerCIMPackage.ANN_CRUD_ACTIVITY__ANNOTATES_CRUD_ACTIVITY:
				return annotatesCRUDActivity != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnCRUDActivityImpl
