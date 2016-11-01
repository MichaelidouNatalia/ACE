/**
 */
package RESTfulServicePSM.impl;

import RESTfulServicePSM.JavaGetterFunction;
import RESTfulServicePSM.PSMComponentProperty;
import RESTfulServicePSM.RESTfulServicePSMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Getter Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RESTfulServicePSM.impl.JavaGetterFunctionImpl#getGetsProperty <em>Gets Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JavaGetterFunctionImpl extends JavaFunctionImpl implements JavaGetterFunction {
	/**
	 * The cached value of the '{@link #getGetsProperty() <em>Gets Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetsProperty()
	 * @generated
	 * @ordered
	 */
	protected PSMComponentProperty getsProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaGetterFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESTfulServicePSMPackage.Literals.JAVA_GETTER_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSMComponentProperty getGetsProperty() {
		if (getsProperty != null && getsProperty.eIsProxy()) {
			InternalEObject oldGetsProperty = (InternalEObject)getsProperty;
			getsProperty = (PSMComponentProperty)eResolveProxy(oldGetsProperty);
			if (getsProperty != oldGetsProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RESTfulServicePSMPackage.JAVA_GETTER_FUNCTION__GETS_PROPERTY, oldGetsProperty, getsProperty));
			}
		}
		return getsProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSMComponentProperty basicGetGetsProperty() {
		return getsProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetsProperty(PSMComponentProperty newGetsProperty) {
		PSMComponentProperty oldGetsProperty = getsProperty;
		getsProperty = newGetsProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RESTfulServicePSMPackage.JAVA_GETTER_FUNCTION__GETS_PROPERTY, oldGetsProperty, getsProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RESTfulServicePSMPackage.JAVA_GETTER_FUNCTION__GETS_PROPERTY:
				if (resolve) return getGetsProperty();
				return basicGetGetsProperty();
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
			case RESTfulServicePSMPackage.JAVA_GETTER_FUNCTION__GETS_PROPERTY:
				setGetsProperty((PSMComponentProperty)newValue);
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
			case RESTfulServicePSMPackage.JAVA_GETTER_FUNCTION__GETS_PROPERTY:
				setGetsProperty((PSMComponentProperty)null);
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
			case RESTfulServicePSMPackage.JAVA_GETTER_FUNCTION__GETS_PROPERTY:
				return getsProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //JavaGetterFunctionImpl
