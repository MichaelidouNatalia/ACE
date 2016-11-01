/**
 */
package SearchLayerPSM.impl;

import RESTfulServicePSM.PSMComponentProperty;

import SearchLayerPSM.AnnPSMComponentProperty;
import SearchLayerPSM.SearchLayerPSMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ann PSM Component Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SearchLayerPSM.impl.AnnPSMComponentPropertyImpl#getAnnotatesPSMComponentProperty <em>Annotates PSM Component Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnPSMComponentPropertyImpl extends AnnotatedElementImpl implements AnnPSMComponentProperty {
	/**
	 * The cached value of the '{@link #getAnnotatesPSMComponentProperty() <em>Annotates PSM Component Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatesPSMComponentProperty()
	 * @generated
	 * @ordered
	 */
	protected PSMComponentProperty annotatesPSMComponentProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnPSMComponentPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SearchLayerPSMPackage.Literals.ANN_PSM_COMPONENT_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSMComponentProperty getAnnotatesPSMComponentProperty() {
		if (annotatesPSMComponentProperty != null && annotatesPSMComponentProperty.eIsProxy()) {
			InternalEObject oldAnnotatesPSMComponentProperty = (InternalEObject)annotatesPSMComponentProperty;
			annotatesPSMComponentProperty = (PSMComponentProperty)eResolveProxy(oldAnnotatesPSMComponentProperty);
			if (annotatesPSMComponentProperty != oldAnnotatesPSMComponentProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SearchLayerPSMPackage.ANN_PSM_COMPONENT_PROPERTY__ANNOTATES_PSM_COMPONENT_PROPERTY, oldAnnotatesPSMComponentProperty, annotatesPSMComponentProperty));
			}
		}
		return annotatesPSMComponentProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSMComponentProperty basicGetAnnotatesPSMComponentProperty() {
		return annotatesPSMComponentProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotatesPSMComponentProperty(PSMComponentProperty newAnnotatesPSMComponentProperty) {
		PSMComponentProperty oldAnnotatesPSMComponentProperty = annotatesPSMComponentProperty;
		annotatesPSMComponentProperty = newAnnotatesPSMComponentProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SearchLayerPSMPackage.ANN_PSM_COMPONENT_PROPERTY__ANNOTATES_PSM_COMPONENT_PROPERTY, oldAnnotatesPSMComponentProperty, annotatesPSMComponentProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SearchLayerPSMPackage.ANN_PSM_COMPONENT_PROPERTY__ANNOTATES_PSM_COMPONENT_PROPERTY:
				if (resolve) return getAnnotatesPSMComponentProperty();
				return basicGetAnnotatesPSMComponentProperty();
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
			case SearchLayerPSMPackage.ANN_PSM_COMPONENT_PROPERTY__ANNOTATES_PSM_COMPONENT_PROPERTY:
				setAnnotatesPSMComponentProperty((PSMComponentProperty)newValue);
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
			case SearchLayerPSMPackage.ANN_PSM_COMPONENT_PROPERTY__ANNOTATES_PSM_COMPONENT_PROPERTY:
				setAnnotatesPSMComponentProperty((PSMComponentProperty)null);
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
			case SearchLayerPSMPackage.ANN_PSM_COMPONENT_PROPERTY__ANNOTATES_PSM_COMPONENT_PROPERTY:
				return annotatesPSMComponentProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnPSMComponentPropertyImpl
