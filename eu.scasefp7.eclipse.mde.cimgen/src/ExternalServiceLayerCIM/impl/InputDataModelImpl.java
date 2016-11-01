/**
 */
package ExternalServiceLayerCIM.impl;

import ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage;
import ExternalServiceLayerCIM.InputDataModel;
import ExternalServiceLayerCIM.ModelProperty;
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
 * An implementation of the model object '<em><b>Input Data Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ExternalServiceLayerCIM.impl.InputDataModelImpl#getHasInputRepresentation <em>Has Input Representation</em>}</li>
 *   <li>{@link ExternalServiceLayerCIM.impl.InputDataModelImpl#getHasInputProperties <em>Has Input Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputDataModelImpl extends MinimalEObjectImpl.Container implements InputDataModel {
	/**
	 * The cached value of the '{@link #getHasInputRepresentation() <em>Has Input Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInputRepresentation()
	 * @generated
	 * @ordered
	 */
	protected Representation hasInputRepresentation;

	/**
	 * The cached value of the '{@link #getHasInputProperties() <em>Has Input Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInputProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelProperty> hasInputProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputDataModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExternalServiceLayerCIMPackage.Literals.INPUT_DATA_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Representation getHasInputRepresentation() {
		return hasInputRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasInputRepresentation(Representation newHasInputRepresentation, NotificationChain msgs) {
		Representation oldHasInputRepresentation = hasInputRepresentation;
		hasInputRepresentation = newHasInputRepresentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExternalServiceLayerCIMPackage.INPUT_DATA_MODEL__HAS_INPUT_REPRESENTATION, oldHasInputRepresentation, newHasInputRepresentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasInputRepresentation(Representation newHasInputRepresentation) {
		if (newHasInputRepresentation != hasInputRepresentation) {
			NotificationChain msgs = null;
			if (hasInputRepresentation != null)
				msgs = ((InternalEObject)hasInputRepresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExternalServiceLayerCIMPackage.INPUT_DATA_MODEL__HAS_INPUT_REPRESENTATION, null, msgs);
			if (newHasInputRepresentation != null)
				msgs = ((InternalEObject)newHasInputRepresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExternalServiceLayerCIMPackage.INPUT_DATA_MODEL__HAS_INPUT_REPRESENTATION, null, msgs);
			msgs = basicSetHasInputRepresentation(newHasInputRepresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerCIMPackage.INPUT_DATA_MODEL__HAS_INPUT_REPRESENTATION, newHasInputRepresentation, newHasInputRepresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelProperty> getHasInputProperties() {
		if (hasInputProperties == null) {
			hasInputProperties = new EObjectContainmentEList<ModelProperty>(ModelProperty.class, this, ExternalServiceLayerCIMPackage.INPUT_DATA_MODEL__HAS_INPUT_PROPERTIES);
		}
		return hasInputProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExternalServiceLayerCIMPackage.INPUT_DATA_MODEL__HAS_INPUT_REPRESENTATION:
				return basicSetHasInputRepresentation(null, msgs);
			case ExternalServiceLayerCIMPackage.INPUT_DATA_MODEL__HAS_INPUT_PROPERTIES:
				return ((InternalEList<?>)getHasInputProperties()).basicRemove(otherEnd, msgs);
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
			case ExternalServiceLayerCIMPackage.INPUT_DATA_MODEL__HAS_INPUT_REPRESENTATION:
				return getHasInputRepresentation();
			case ExternalServiceLayerCIMPackage.INPUT_DATA_MODEL__HAS_INPUT_PROPERTIES:
				return getHasInputProperties();
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
			case ExternalServiceLayerCIMPackage.INPUT_DATA_MODEL__HAS_INPUT_REPRESENTATION:
				setHasInputRepresentation((Representation)newValue);
				return;
			case ExternalServiceLayerCIMPackage.INPUT_DATA_MODEL__HAS_INPUT_PROPERTIES:
				getHasInputProperties().clear();
				getHasInputProperties().addAll((Collection<? extends ModelProperty>)newValue);
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
			case ExternalServiceLayerCIMPackage.INPUT_DATA_MODEL__HAS_INPUT_REPRESENTATION:
				setHasInputRepresentation((Representation)null);
				return;
			case ExternalServiceLayerCIMPackage.INPUT_DATA_MODEL__HAS_INPUT_PROPERTIES:
				getHasInputProperties().clear();
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
			case ExternalServiceLayerCIMPackage.INPUT_DATA_MODEL__HAS_INPUT_REPRESENTATION:
				return hasInputRepresentation != null;
			case ExternalServiceLayerCIMPackage.INPUT_DATA_MODEL__HAS_INPUT_PROPERTIES:
				return hasInputProperties != null && !hasInputProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InputDataModelImpl
