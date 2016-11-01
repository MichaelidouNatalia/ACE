/**
 */
package ExternalServiceLayerPSM.impl;

import ExternalServiceLayerPSM.AnnJavaResourceModel;
import ExternalServiceLayerPSM.ExistentJavaModelPersistentOutput;
import ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Existent Java Model Persistent Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ExternalServiceLayerPSM.impl.ExistentJavaModelPersistentOutputImpl#getIsExistentJavaModelPersistentOutput <em>Is Existent Java Model Persistent Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExistentJavaModelPersistentOutputImpl extends JavaOutputDataModelImpl implements ExistentJavaModelPersistentOutput {
	/**
	 * The cached value of the '{@link #getIsExistentJavaModelPersistentOutput() <em>Is Existent Java Model Persistent Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsExistentJavaModelPersistentOutput()
	 * @generated
	 * @ordered
	 */
	protected AnnJavaResourceModel isExistentJavaModelPersistentOutput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExistentJavaModelPersistentOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExternalServiceLayerPSMPackage.Literals.EXISTENT_JAVA_MODEL_PERSISTENT_OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnJavaResourceModel getIsExistentJavaModelPersistentOutput() {
		if (isExistentJavaModelPersistentOutput != null && isExistentJavaModelPersistentOutput.eIsProxy()) {
			InternalEObject oldIsExistentJavaModelPersistentOutput = (InternalEObject)isExistentJavaModelPersistentOutput;
			isExistentJavaModelPersistentOutput = (AnnJavaResourceModel)eResolveProxy(oldIsExistentJavaModelPersistentOutput);
			if (isExistentJavaModelPersistentOutput != oldIsExistentJavaModelPersistentOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExternalServiceLayerPSMPackage.EXISTENT_JAVA_MODEL_PERSISTENT_OUTPUT__IS_EXISTENT_JAVA_MODEL_PERSISTENT_OUTPUT, oldIsExistentJavaModelPersistentOutput, isExistentJavaModelPersistentOutput));
			}
		}
		return isExistentJavaModelPersistentOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnJavaResourceModel basicGetIsExistentJavaModelPersistentOutput() {
		return isExistentJavaModelPersistentOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsExistentJavaModelPersistentOutput(AnnJavaResourceModel newIsExistentJavaModelPersistentOutput) {
		AnnJavaResourceModel oldIsExistentJavaModelPersistentOutput = isExistentJavaModelPersistentOutput;
		isExistentJavaModelPersistentOutput = newIsExistentJavaModelPersistentOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerPSMPackage.EXISTENT_JAVA_MODEL_PERSISTENT_OUTPUT__IS_EXISTENT_JAVA_MODEL_PERSISTENT_OUTPUT, oldIsExistentJavaModelPersistentOutput, isExistentJavaModelPersistentOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExternalServiceLayerPSMPackage.EXISTENT_JAVA_MODEL_PERSISTENT_OUTPUT__IS_EXISTENT_JAVA_MODEL_PERSISTENT_OUTPUT:
				if (resolve) return getIsExistentJavaModelPersistentOutput();
				return basicGetIsExistentJavaModelPersistentOutput();
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
			case ExternalServiceLayerPSMPackage.EXISTENT_JAVA_MODEL_PERSISTENT_OUTPUT__IS_EXISTENT_JAVA_MODEL_PERSISTENT_OUTPUT:
				setIsExistentJavaModelPersistentOutput((AnnJavaResourceModel)newValue);
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
			case ExternalServiceLayerPSMPackage.EXISTENT_JAVA_MODEL_PERSISTENT_OUTPUT__IS_EXISTENT_JAVA_MODEL_PERSISTENT_OUTPUT:
				setIsExistentJavaModelPersistentOutput((AnnJavaResourceModel)null);
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
			case ExternalServiceLayerPSMPackage.EXISTENT_JAVA_MODEL_PERSISTENT_OUTPUT__IS_EXISTENT_JAVA_MODEL_PERSISTENT_OUTPUT:
				return isExistentJavaModelPersistentOutput != null;
		}
		return super.eIsSet(featureID);
	}

} //ExistentJavaModelPersistentOutputImpl
