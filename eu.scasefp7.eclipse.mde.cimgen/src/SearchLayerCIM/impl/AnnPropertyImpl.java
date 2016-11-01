/**
 */
package SearchLayerCIM.impl;

import SearchLayerCIM.AnnProperty;
import SearchLayerCIM.SearchLayerCIMPackage;

import ServiceCIM.Property;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ann Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SearchLayerCIM.impl.AnnPropertyImpl#getAnnotatesProperty <em>Annotates Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnPropertyImpl extends AnnotatedElementImpl implements AnnProperty {
	/**
	 * The cached value of the '{@link #getAnnotatesProperty() <em>Annotates Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatesProperty()
	 * @generated
	 * @ordered
	 */
	protected Property annotatesProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SearchLayerCIMPackage.Literals.ANN_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getAnnotatesProperty() {
		if (annotatesProperty != null && annotatesProperty.eIsProxy()) {
			InternalEObject oldAnnotatesProperty = (InternalEObject)annotatesProperty;
			annotatesProperty = (Property)eResolveProxy(oldAnnotatesProperty);
			if (annotatesProperty != oldAnnotatesProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SearchLayerCIMPackage.ANN_PROPERTY__ANNOTATES_PROPERTY, oldAnnotatesProperty, annotatesProperty));
			}
		}
		return annotatesProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetAnnotatesProperty() {
		return annotatesProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotatesProperty(Property newAnnotatesProperty) {
		Property oldAnnotatesProperty = annotatesProperty;
		annotatesProperty = newAnnotatesProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SearchLayerCIMPackage.ANN_PROPERTY__ANNOTATES_PROPERTY, oldAnnotatesProperty, annotatesProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SearchLayerCIMPackage.ANN_PROPERTY__ANNOTATES_PROPERTY:
				if (resolve) return getAnnotatesProperty();
				return basicGetAnnotatesProperty();
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
			case SearchLayerCIMPackage.ANN_PROPERTY__ANNOTATES_PROPERTY:
				setAnnotatesProperty((Property)newValue);
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
			case SearchLayerCIMPackage.ANN_PROPERTY__ANNOTATES_PROPERTY:
				setAnnotatesProperty((Property)null);
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
			case SearchLayerCIMPackage.ANN_PROPERTY__ANNOTATES_PROPERTY:
				return annotatesProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnPropertyImpl
