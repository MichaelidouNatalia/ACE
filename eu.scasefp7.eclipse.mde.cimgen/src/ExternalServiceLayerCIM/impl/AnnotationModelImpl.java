/**
 */
package ExternalServiceLayerCIM.impl;

import ExternalServiceLayerCIM.AnnotatedElement;
import ExternalServiceLayerCIM.Annotation;
import ExternalServiceLayerCIM.AnnotationModel;
import ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage;

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
 * An implementation of the model object '<em><b>Annotation Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ExternalServiceLayerCIM.impl.AnnotationModelImpl#getHasAnnotatedElement <em>Has Annotated Element</em>}</li>
 *   <li>{@link ExternalServiceLayerCIM.impl.AnnotationModelImpl#getHasAnnotation <em>Has Annotation</em>}</li>
 *   <li>{@link ExternalServiceLayerCIM.impl.AnnotationModelImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationModelImpl extends MinimalEObjectImpl.Container implements AnnotationModel {
	/**
	 * The cached value of the '{@link #getHasAnnotatedElement() <em>Has Annotated Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAnnotatedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnotatedElement> hasAnnotatedElement;

	/**
	 * The cached value of the '{@link #getHasAnnotation() <em>Has Annotation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> hasAnnotation;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExternalServiceLayerCIMPackage.Literals.ANNOTATION_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotatedElement> getHasAnnotatedElement() {
		if (hasAnnotatedElement == null) {
			hasAnnotatedElement = new EObjectContainmentEList<AnnotatedElement>(AnnotatedElement.class, this, ExternalServiceLayerCIMPackage.ANNOTATION_MODEL__HAS_ANNOTATED_ELEMENT);
		}
		return hasAnnotatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getHasAnnotation() {
		if (hasAnnotation == null) {
			hasAnnotation = new EObjectContainmentEList<Annotation>(Annotation.class, this, ExternalServiceLayerCIMPackage.ANNOTATION_MODEL__HAS_ANNOTATION);
		}
		return hasAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExternalServiceLayerCIMPackage.ANNOTATION_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExternalServiceLayerCIMPackage.ANNOTATION_MODEL__HAS_ANNOTATED_ELEMENT:
				return ((InternalEList<?>)getHasAnnotatedElement()).basicRemove(otherEnd, msgs);
			case ExternalServiceLayerCIMPackage.ANNOTATION_MODEL__HAS_ANNOTATION:
				return ((InternalEList<?>)getHasAnnotation()).basicRemove(otherEnd, msgs);
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
			case ExternalServiceLayerCIMPackage.ANNOTATION_MODEL__HAS_ANNOTATED_ELEMENT:
				return getHasAnnotatedElement();
			case ExternalServiceLayerCIMPackage.ANNOTATION_MODEL__HAS_ANNOTATION:
				return getHasAnnotation();
			case ExternalServiceLayerCIMPackage.ANNOTATION_MODEL__NAME:
				return getName();
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
			case ExternalServiceLayerCIMPackage.ANNOTATION_MODEL__HAS_ANNOTATED_ELEMENT:
				getHasAnnotatedElement().clear();
				getHasAnnotatedElement().addAll((Collection<? extends AnnotatedElement>)newValue);
				return;
			case ExternalServiceLayerCIMPackage.ANNOTATION_MODEL__HAS_ANNOTATION:
				getHasAnnotation().clear();
				getHasAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ExternalServiceLayerCIMPackage.ANNOTATION_MODEL__NAME:
				setName((String)newValue);
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
			case ExternalServiceLayerCIMPackage.ANNOTATION_MODEL__HAS_ANNOTATED_ELEMENT:
				getHasAnnotatedElement().clear();
				return;
			case ExternalServiceLayerCIMPackage.ANNOTATION_MODEL__HAS_ANNOTATION:
				getHasAnnotation().clear();
				return;
			case ExternalServiceLayerCIMPackage.ANNOTATION_MODEL__NAME:
				setName(NAME_EDEFAULT);
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
			case ExternalServiceLayerCIMPackage.ANNOTATION_MODEL__HAS_ANNOTATED_ELEMENT:
				return hasAnnotatedElement != null && !hasAnnotatedElement.isEmpty();
			case ExternalServiceLayerCIMPackage.ANNOTATION_MODEL__HAS_ANNOTATION:
				return hasAnnotation != null && !hasAnnotation.isEmpty();
			case ExternalServiceLayerCIMPackage.ANNOTATION_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AnnotationModelImpl
