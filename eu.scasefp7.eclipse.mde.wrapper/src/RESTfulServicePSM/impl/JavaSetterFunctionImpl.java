/**
 */
package RESTfulServicePSM.impl;

import RESTfulServicePSM.JAXBAnnotation;
import RESTfulServicePSM.JavaSetterFunction;
import RESTfulServicePSM.PSMComponentProperty;
import RESTfulServicePSM.RESTfulServicePSMPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Setter Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RESTfulServicePSM.impl.JavaSetterFunctionImpl#getSetsProperty <em>Sets Property</em>}</li>
 *   <li>{@link RESTfulServicePSM.impl.JavaSetterFunctionImpl#getSetterFunctionHasJAXBAnnotation <em>Setter Function Has JAXB Annotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaSetterFunctionImpl extends JavaFunctionImpl implements JavaSetterFunction {
	/**
	 * The cached value of the '{@link #getSetsProperty() <em>Sets Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetsProperty()
	 * @generated
	 * @ordered
	 */
	protected PSMComponentProperty setsProperty;

	/**
	 * The cached value of the '{@link #getSetterFunctionHasJAXBAnnotation() <em>Setter Function Has JAXB Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetterFunctionHasJAXBAnnotation()
	 * @generated
	 * @ordered
	 */
	protected JAXBAnnotation setterFunctionHasJAXBAnnotation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaSetterFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTfulServicePSMPackage.Literals.JAVA_SETTER_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSMComponentProperty getSetsProperty() {
		if (setsProperty != null && setsProperty.eIsProxy()) {
			InternalEObject oldSetsProperty = (InternalEObject)setsProperty;
			setsProperty = (PSMComponentProperty)eResolveProxy(oldSetsProperty);
			if (setsProperty != oldSetsProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RESTfulServicePSMPackage.JAVA_SETTER_FUNCTION__SETS_PROPERTY, oldSetsProperty, setsProperty));
			}
		}
		return setsProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSMComponentProperty basicGetSetsProperty() {
		return setsProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetsProperty(PSMComponentProperty newSetsProperty) {
		PSMComponentProperty oldSetsProperty = setsProperty;
		setsProperty = newSetsProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.JAVA_SETTER_FUNCTION__SETS_PROPERTY, oldSetsProperty, setsProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JAXBAnnotation getSetterFunctionHasJAXBAnnotation() {
		return setterFunctionHasJAXBAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetterFunctionHasJAXBAnnotation(JAXBAnnotation newSetterFunctionHasJAXBAnnotation, NotificationChain msgs) {
		JAXBAnnotation oldSetterFunctionHasJAXBAnnotation = setterFunctionHasJAXBAnnotation;
		setterFunctionHasJAXBAnnotation = newSetterFunctionHasJAXBAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.JAVA_SETTER_FUNCTION__SETTER_FUNCTION_HAS_JAXB_ANNOTATION, oldSetterFunctionHasJAXBAnnotation, newSetterFunctionHasJAXBAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetterFunctionHasJAXBAnnotation(JAXBAnnotation newSetterFunctionHasJAXBAnnotation) {
		if (newSetterFunctionHasJAXBAnnotation != setterFunctionHasJAXBAnnotation) {
			NotificationChain msgs = null;
			if (setterFunctionHasJAXBAnnotation != null)
				msgs = ((InternalEObject)setterFunctionHasJAXBAnnotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RESTfulServicePSMPackage.JAVA_SETTER_FUNCTION__SETTER_FUNCTION_HAS_JAXB_ANNOTATION, null, msgs);
			if (newSetterFunctionHasJAXBAnnotation != null)
				msgs = ((InternalEObject)newSetterFunctionHasJAXBAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RESTfulServicePSMPackage.JAVA_SETTER_FUNCTION__SETTER_FUNCTION_HAS_JAXB_ANNOTATION, null, msgs);
			msgs = basicSetSetterFunctionHasJAXBAnnotation(newSetterFunctionHasJAXBAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.JAVA_SETTER_FUNCTION__SETTER_FUNCTION_HAS_JAXB_ANNOTATION, newSetterFunctionHasJAXBAnnotation, newSetterFunctionHasJAXBAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RESTfulServicePSMPackage.JAVA_SETTER_FUNCTION__SETTER_FUNCTION_HAS_JAXB_ANNOTATION:
				return basicSetSetterFunctionHasJAXBAnnotation(null, msgs);
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
			case RESTfulServicePSMPackage.JAVA_SETTER_FUNCTION__SETS_PROPERTY:
				if (resolve) return getSetsProperty();
				return basicGetSetsProperty();
			case RESTfulServicePSMPackage.JAVA_SETTER_FUNCTION__SETTER_FUNCTION_HAS_JAXB_ANNOTATION:
				return getSetterFunctionHasJAXBAnnotation();
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
			case RESTfulServicePSMPackage.JAVA_SETTER_FUNCTION__SETS_PROPERTY:
				setSetsProperty((PSMComponentProperty)newValue);
				return;
			case RESTfulServicePSMPackage.JAVA_SETTER_FUNCTION__SETTER_FUNCTION_HAS_JAXB_ANNOTATION:
				setSetterFunctionHasJAXBAnnotation((JAXBAnnotation)newValue);
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
			case RESTfulServicePSMPackage.JAVA_SETTER_FUNCTION__SETS_PROPERTY:
				setSetsProperty((PSMComponentProperty)null);
				return;
			case RESTfulServicePSMPackage.JAVA_SETTER_FUNCTION__SETTER_FUNCTION_HAS_JAXB_ANNOTATION:
				setSetterFunctionHasJAXBAnnotation((JAXBAnnotation)null);
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
			case RESTfulServicePSMPackage.JAVA_SETTER_FUNCTION__SETS_PROPERTY:
				return setsProperty != null;
			case RESTfulServicePSMPackage.JAVA_SETTER_FUNCTION__SETTER_FUNCTION_HAS_JAXB_ANNOTATION:
				return setterFunctionHasJAXBAnnotation != null;
		}
		return super.eIsSet(featureID);
	}

} //JavaSetterFunctionImpl
