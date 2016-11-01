/**
 */
package ExternalServiceLayerCIM.impl;

import ExternalServiceLayerCIM.AnnCRUDResource;
import ExternalServiceLayerCIM.ExistentCRUDPersistentOutput;
import ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Existent CRUD Persistent Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ExternalServiceLayerCIM.impl.ExistentCRUDPersistentOutputImpl#getIsExistentCRUDPersistentOutput <em>Is Existent CRUD Persistent Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExistentCRUDPersistentOutputImpl extends OutputDataModelImpl implements ExistentCRUDPersistentOutput {
	/**
	 * The cached value of the '{@link #getIsExistentCRUDPersistentOutput() <em>Is Existent CRUD Persistent Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsExistentCRUDPersistentOutput()
	 * @generated
	 * @ordered
	 */
	protected AnnCRUDResource isExistentCRUDPersistentOutput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExistentCRUDPersistentOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExternalServiceLayerCIMPackage.Literals.EXISTENT_CRUD_PERSISTENT_OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnCRUDResource getIsExistentCRUDPersistentOutput() {
		if (isExistentCRUDPersistentOutput != null && isExistentCRUDPersistentOutput.eIsProxy()) {
			InternalEObject oldIsExistentCRUDPersistentOutput = (InternalEObject)isExistentCRUDPersistentOutput;
			isExistentCRUDPersistentOutput = (AnnCRUDResource)eResolveProxy(oldIsExistentCRUDPersistentOutput);
			if (isExistentCRUDPersistentOutput != oldIsExistentCRUDPersistentOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExternalServiceLayerCIMPackage.EXISTENT_CRUD_PERSISTENT_OUTPUT__IS_EXISTENT_CRUD_PERSISTENT_OUTPUT, oldIsExistentCRUDPersistentOutput, isExistentCRUDPersistentOutput));
			}
		}
		return isExistentCRUDPersistentOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnCRUDResource basicGetIsExistentCRUDPersistentOutput() {
		return isExistentCRUDPersistentOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsExistentCRUDPersistentOutput(AnnCRUDResource newIsExistentCRUDPersistentOutput) {
		AnnCRUDResource oldIsExistentCRUDPersistentOutput = isExistentCRUDPersistentOutput;
		isExistentCRUDPersistentOutput = newIsExistentCRUDPersistentOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerCIMPackage.EXISTENT_CRUD_PERSISTENT_OUTPUT__IS_EXISTENT_CRUD_PERSISTENT_OUTPUT, oldIsExistentCRUDPersistentOutput, isExistentCRUDPersistentOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExternalServiceLayerCIMPackage.EXISTENT_CRUD_PERSISTENT_OUTPUT__IS_EXISTENT_CRUD_PERSISTENT_OUTPUT:
				if (resolve) return getIsExistentCRUDPersistentOutput();
				return basicGetIsExistentCRUDPersistentOutput();
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
			case ExternalServiceLayerCIMPackage.EXISTENT_CRUD_PERSISTENT_OUTPUT__IS_EXISTENT_CRUD_PERSISTENT_OUTPUT:
				setIsExistentCRUDPersistentOutput((AnnCRUDResource)newValue);
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
			case ExternalServiceLayerCIMPackage.EXISTENT_CRUD_PERSISTENT_OUTPUT__IS_EXISTENT_CRUD_PERSISTENT_OUTPUT:
				setIsExistentCRUDPersistentOutput((AnnCRUDResource)null);
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
			case ExternalServiceLayerCIMPackage.EXISTENT_CRUD_PERSISTENT_OUTPUT__IS_EXISTENT_CRUD_PERSISTENT_OUTPUT:
				return isExistentCRUDPersistentOutput != null;
		}
		return super.eIsSet(featureID);
	}

} //ExistentCRUDPersistentOutputImpl
