/**
 */
package ExternalServiceLayerPSM.impl;

import ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage;
import ExternalServiceLayerPSM.JavaOutputDataModel;
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
 * An implementation of the model object '<em><b>Java Output Data Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ExternalServiceLayerPSM.impl.JavaOutputDataModelImpl#getHasOutputProperty <em>Has Output Property</em>}</li>
 *   <li>{@link ExternalServiceLayerPSM.impl.JavaOutputDataModelImpl#getHasOutputRepresentation <em>Has Output Representation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaOutputDataModelImpl extends MinimalEObjectImpl.Container implements JavaOutputDataModel {
	/**
	 * The cached value of the '{@link #getHasOutputProperty() <em>Has Output Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasOutputProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> hasOutputProperty;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaOutputDataModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExternalServiceLayerPSMPackage.Literals.JAVA_OUTPUT_DATA_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getHasOutputProperty() {
		if (hasOutputProperty == null) {
			hasOutputProperty = new EObjectContainmentEList<Property>(Property.class, this, ExternalServiceLayerPSMPackage.JAVA_OUTPUT_DATA_MODEL__HAS_OUTPUT_PROPERTY);
		}
		return hasOutputProperty;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExternalServiceLayerPSMPackage.JAVA_OUTPUT_DATA_MODEL__HAS_OUTPUT_REPRESENTATION, oldHasOutputRepresentation, newHasOutputRepresentation);
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
				msgs = ((InternalEObject)hasOutputRepresentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExternalServiceLayerPSMPackage.JAVA_OUTPUT_DATA_MODEL__HAS_OUTPUT_REPRESENTATION, null, msgs);
			if (newHasOutputRepresentation != null)
				msgs = ((InternalEObject)newHasOutputRepresentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExternalServiceLayerPSMPackage.JAVA_OUTPUT_DATA_MODEL__HAS_OUTPUT_REPRESENTATION, null, msgs);
			msgs = basicSetHasOutputRepresentation(newHasOutputRepresentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerPSMPackage.JAVA_OUTPUT_DATA_MODEL__HAS_OUTPUT_REPRESENTATION, newHasOutputRepresentation, newHasOutputRepresentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExternalServiceLayerPSMPackage.JAVA_OUTPUT_DATA_MODEL__HAS_OUTPUT_PROPERTY:
				return ((InternalEList<?>)getHasOutputProperty()).basicRemove(otherEnd, msgs);
			case ExternalServiceLayerPSMPackage.JAVA_OUTPUT_DATA_MODEL__HAS_OUTPUT_REPRESENTATION:
				return basicSetHasOutputRepresentation(null, msgs);
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
			case ExternalServiceLayerPSMPackage.JAVA_OUTPUT_DATA_MODEL__HAS_OUTPUT_PROPERTY:
				return getHasOutputProperty();
			case ExternalServiceLayerPSMPackage.JAVA_OUTPUT_DATA_MODEL__HAS_OUTPUT_REPRESENTATION:
				return getHasOutputRepresentation();
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
			case ExternalServiceLayerPSMPackage.JAVA_OUTPUT_DATA_MODEL__HAS_OUTPUT_PROPERTY:
				getHasOutputProperty().clear();
				getHasOutputProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case ExternalServiceLayerPSMPackage.JAVA_OUTPUT_DATA_MODEL__HAS_OUTPUT_REPRESENTATION:
				setHasOutputRepresentation((Representation)newValue);
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
			case ExternalServiceLayerPSMPackage.JAVA_OUTPUT_DATA_MODEL__HAS_OUTPUT_PROPERTY:
				getHasOutputProperty().clear();
				return;
			case ExternalServiceLayerPSMPackage.JAVA_OUTPUT_DATA_MODEL__HAS_OUTPUT_REPRESENTATION:
				setHasOutputRepresentation((Representation)null);
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
			case ExternalServiceLayerPSMPackage.JAVA_OUTPUT_DATA_MODEL__HAS_OUTPUT_PROPERTY:
				return hasOutputProperty != null && !hasOutputProperty.isEmpty();
			case ExternalServiceLayerPSMPackage.JAVA_OUTPUT_DATA_MODEL__HAS_OUTPUT_REPRESENTATION:
				return hasOutputRepresentation != null;
		}
		return super.eIsSet(featureID);
	}

} //JavaOutputDataModelImpl
