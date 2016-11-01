/**
 */
package ExternalServiceLayerCIM.impl;

import ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage;
import ExternalServiceLayerCIM.ModelProperty;
import ExternalServiceLayerCIM.OutputDataModel;
import ExternalServiceLayerCIM.Representation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Data Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ExternalServiceLayerCIM.impl.OutputDataModelImpl#getHasOutputRepresentation <em>Has Output Representation</em>}</li>
 *   <li>{@link ExternalServiceLayerCIM.impl.OutputDataModelImpl#getHasOutputProperties <em>Has Output Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputDataModelImpl extends MinimalEObjectImpl.Container implements OutputDataModel {
	/**
	 * The cached value of the '{@link #getHasOutputRepresentation() <em>Has Output Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasOutputRepresentation()
	 * @generated
	 * @ordered
	 */
	protected Representation hasOutputRepresentation;

	/**
	 * The cached value of the '{@link #getHasOutputProperties() <em>Has Output Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasOutputProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelProperty> hasOutputProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputDataModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExternalServiceLayerCIMPackage.Literals.OUTPUT_DATA_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Representation getHasOutputRepresentation() {
		return hasOutputRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasOutputRepresentation(Representation newHasOutputRepresentation, NotificationChain msgs) {
		Representation oldHasOutputRepresentation = hasOutputRepresentation;
		hasOutputRepresentation = newHasOutputRepresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExternalServiceLayerCIMPackage.OUTPUT_DATA_MODEL__HAS_OUTPUT_REPRESENTATION, oldHasOutputRepresentation, newHasOutputRepresentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasOutputRepresentation(Representation newHasOutputRepresentation) {
		if (newHasOutputRepresentation != hasOutputRepresentation) {
			NotificationChain msgs = null;
			if (hasOutputRepresentation != null)
				msgs = ((InternalEObject)hasOutputRepresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExternalServiceLayerCIMPackage.OUTPUT_DATA_MODEL__HAS_OUTPUT_REPRESENTATION, null, msgs);
			if (newHasOutputRepresentation != null)
				msgs = ((InternalEObject)newHasOutputRepresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExternalServiceLayerCIMPackage.OUTPUT_DATA_MODEL__HAS_OUTPUT_REPRESENTATION, null, msgs);
			msgs = basicSetHasOutputRepresentation(newHasOutputRepresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerCIMPackage.OUTPUT_DATA_MODEL__HAS_OUTPUT_REPRESENTATION, newHasOutputRepresentation, newHasOutputRepresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelProperty> getHasOutputProperties() {
		if (hasOutputProperties == null) {
			hasOutputProperties = new EObjectContainmentEList<ModelProperty>(ModelProperty.class, this, ExternalServiceLayerCIMPackage.OUTPUT_DATA_MODEL__HAS_OUTPUT_PROPERTIES);
		}
		return hasOutputProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExternalServiceLayerCIMPackage.OUTPUT_DATA_MODEL__HAS_OUTPUT_REPRESENTATION:
				return basicSetHasOutputRepresentation(null, msgs);
			case ExternalServiceLayerCIMPackage.OUTPUT_DATA_MODEL__HAS_OUTPUT_PROPERTIES:
				return ((InternalEList<?>)getHasOutputProperties()).basicRemove(otherEnd, msgs);
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
			case ExternalServiceLayerCIMPackage.OUTPUT_DATA_MODEL__HAS_OUTPUT_REPRESENTATION:
				return getHasOutputRepresentation();
			case ExternalServiceLayerCIMPackage.OUTPUT_DATA_MODEL__HAS_OUTPUT_PROPERTIES:
				return getHasOutputProperties();
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
			case ExternalServiceLayerCIMPackage.OUTPUT_DATA_MODEL__HAS_OUTPUT_REPRESENTATION:
				setHasOutputRepresentation((Representation)newValue);
				return;
			case ExternalServiceLayerCIMPackage.OUTPUT_DATA_MODEL__HAS_OUTPUT_PROPERTIES:
				getHasOutputProperties().clear();
				getHasOutputProperties().addAll((Collection<? extends ModelProperty>)newValue);
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
			case ExternalServiceLayerCIMPackage.OUTPUT_DATA_MODEL__HAS_OUTPUT_REPRESENTATION:
				setHasOutputRepresentation((Representation)null);
				return;
			case ExternalServiceLayerCIMPackage.OUTPUT_DATA_MODEL__HAS_OUTPUT_PROPERTIES:
				getHasOutputProperties().clear();
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
			case ExternalServiceLayerCIMPackage.OUTPUT_DATA_MODEL__HAS_OUTPUT_REPRESENTATION:
				return hasOutputRepresentation != null;
			case ExternalServiceLayerCIMPackage.OUTPUT_DATA_MODEL__HAS_OUTPUT_PROPERTIES:
				return hasOutputProperties != null && !hasOutputProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OutputDataModelImpl
