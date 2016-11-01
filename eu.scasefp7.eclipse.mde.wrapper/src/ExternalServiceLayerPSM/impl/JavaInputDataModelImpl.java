/**
 */
package ExternalServiceLayerPSM.impl;

import ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage;
import ExternalServiceLayerPSM.JavaInputDataModel;
import ExternalServiceLayerPSM.Property;
import ExternalServiceLayerPSM.Representation;

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
 * An implementation of the model object '<em><b>Java Input Data Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ExternalServiceLayerPSM.impl.JavaInputDataModelImpl#getHasInputProperty <em>Has Input Property</em>}</li>
 *   <li>{@link ExternalServiceLayerPSM.impl.JavaInputDataModelImpl#getHasInputRepresentation <em>Has Input Representation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaInputDataModelImpl extends MinimalEObjectImpl.Container implements JavaInputDataModel {
	/**
	 * The cached value of the '{@link #getHasInputProperty() <em>Has Input Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasInputProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> hasInputProperty;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaInputDataModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExternalServiceLayerPSMPackage.Literals.JAVA_INPUT_DATA_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getHasInputProperty() {
		if (hasInputProperty == null) {
			hasInputProperty = new EObjectContainmentEList<Property>(Property.class, this, ExternalServiceLayerPSMPackage.JAVA_INPUT_DATA_MODEL__HAS_INPUT_PROPERTY);
		}
		return hasInputProperty;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExternalServiceLayerPSMPackage.JAVA_INPUT_DATA_MODEL__HAS_INPUT_REPRESENTATION, oldHasInputRepresentation, newHasInputRepresentation);
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
				msgs = ((InternalEObject)hasInputRepresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExternalServiceLayerPSMPackage.JAVA_INPUT_DATA_MODEL__HAS_INPUT_REPRESENTATION, null, msgs);
			if (newHasInputRepresentation != null)
				msgs = ((InternalEObject)newHasInputRepresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExternalServiceLayerPSMPackage.JAVA_INPUT_DATA_MODEL__HAS_INPUT_REPRESENTATION, null, msgs);
			msgs = basicSetHasInputRepresentation(newHasInputRepresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerPSMPackage.JAVA_INPUT_DATA_MODEL__HAS_INPUT_REPRESENTATION, newHasInputRepresentation, newHasInputRepresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExternalServiceLayerPSMPackage.JAVA_INPUT_DATA_MODEL__HAS_INPUT_PROPERTY:
				return ((InternalEList<?>)getHasInputProperty()).basicRemove(otherEnd, msgs);
			case ExternalServiceLayerPSMPackage.JAVA_INPUT_DATA_MODEL__HAS_INPUT_REPRESENTATION:
				return basicSetHasInputRepresentation(null, msgs);
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
			case ExternalServiceLayerPSMPackage.JAVA_INPUT_DATA_MODEL__HAS_INPUT_PROPERTY:
				return getHasInputProperty();
			case ExternalServiceLayerPSMPackage.JAVA_INPUT_DATA_MODEL__HAS_INPUT_REPRESENTATION:
				return getHasInputRepresentation();
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
			case ExternalServiceLayerPSMPackage.JAVA_INPUT_DATA_MODEL__HAS_INPUT_PROPERTY:
				getHasInputProperty().clear();
				getHasInputProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case ExternalServiceLayerPSMPackage.JAVA_INPUT_DATA_MODEL__HAS_INPUT_REPRESENTATION:
				setHasInputRepresentation((Representation)newValue);
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
			case ExternalServiceLayerPSMPackage.JAVA_INPUT_DATA_MODEL__HAS_INPUT_PROPERTY:
				getHasInputProperty().clear();
				return;
			case ExternalServiceLayerPSMPackage.JAVA_INPUT_DATA_MODEL__HAS_INPUT_REPRESENTATION:
				setHasInputRepresentation((Representation)null);
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
			case ExternalServiceLayerPSMPackage.JAVA_INPUT_DATA_MODEL__HAS_INPUT_PROPERTY:
				return hasInputProperty != null && !hasInputProperty.isEmpty();
			case ExternalServiceLayerPSMPackage.JAVA_INPUT_DATA_MODEL__HAS_INPUT_REPRESENTATION:
				return hasInputRepresentation != null;
		}
		return super.eIsSet(featureID);
	}

} //JavaInputDataModelImpl
