/**
 */
package AuthenticationLayerPSM.impl;

import AuthenticationLayerPSM.AnnotatedElement;
import AuthenticationLayerPSM.Annotation;
import AuthenticationLayerPSM.AnnotationModel;
import AuthenticationLayerPSM.AuthenticationLayerPSMPackage;

import RESTfulServicePSM.ServicePSM;

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
 * </p>
 * <ul>
 *   <li>{@link AuthenticationLayerPSM.impl.AnnotationModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link AuthenticationLayerPSM.impl.AnnotationModelImpl#getHasAnnotatedElement <em>Has Annotated Element</em>}</li>
 *   <li>{@link AuthenticationLayerPSM.impl.AnnotationModelImpl#getHasAnnotation <em>Has Annotation</em>}</li>
 *   <li>{@link AuthenticationLayerPSM.impl.AnnotationModelImpl#getAnnotatesRESTfulServicePSM <em>Annotates RES Tful Service PSM</em>}</li>
 *   <li>{@link AuthenticationLayerPSM.impl.AnnotationModelImpl#getAnnotationType <em>Annotation Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationModelImpl extends MinimalEObjectImpl.Container implements AnnotationModel {
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
	 * The cached value of the '{@link #getAnnotatesRESTfulServicePSM() <em>Annotates RES Tful Service PSM</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatesRESTfulServicePSM()
	 * @generated
	 * @ordered
	 */
	protected ServicePSM annotatesRESTfulServicePSM;

	/**
	 * The default value of the '{@link #getAnnotationType() <em>Annotation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationType()
	 * @generated
	 * @ordered
	 */
	protected static final String ANNOTATION_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnnotationType() <em>Annotation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationType()
	 * @generated
	 * @ordered
	 */
	protected String annotationType = ANNOTATION_TYPE_EDEFAULT;

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
		return AuthenticationLayerPSMPackage.Literals.ANNOTATION_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AuthenticationLayerPSMPackage.ANNOTATION_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnnotatedElement> getHasAnnotatedElement() {
		if (hasAnnotatedElement == null) {
			hasAnnotatedElement = new EObjectContainmentEList<AnnotatedElement>(AnnotatedElement.class, this, AuthenticationLayerPSMPackage.ANNOTATION_MODEL__HAS_ANNOTATED_ELEMENT);
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
			hasAnnotation = new EObjectContainmentEList<Annotation>(Annotation.class, this, AuthenticationLayerPSMPackage.ANNOTATION_MODEL__HAS_ANNOTATION);
		}
		return hasAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicePSM getAnnotatesRESTfulServicePSM() {
		if (annotatesRESTfulServicePSM != null && annotatesRESTfulServicePSM.eIsProxy()) {
			InternalEObject oldAnnotatesRESTfulServicePSM = (InternalEObject)annotatesRESTfulServicePSM;
			annotatesRESTfulServicePSM = (ServicePSM)eResolveProxy(oldAnnotatesRESTfulServicePSM);
			if (annotatesRESTfulServicePSM != oldAnnotatesRESTfulServicePSM) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AuthenticationLayerPSMPackage.ANNOTATION_MODEL__ANNOTATES_RES_TFUL_SERVICE_PSM, oldAnnotatesRESTfulServicePSM, annotatesRESTfulServicePSM));
			}
		}
		return annotatesRESTfulServicePSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicePSM basicGetAnnotatesRESTfulServicePSM() {
		return annotatesRESTfulServicePSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotatesRESTfulServicePSM(ServicePSM newAnnotatesRESTfulServicePSM) {
		ServicePSM oldAnnotatesRESTfulServicePSM = annotatesRESTfulServicePSM;
		annotatesRESTfulServicePSM = newAnnotatesRESTfulServicePSM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthenticationLayerPSMPackage.ANNOTATION_MODEL__ANNOTATES_RES_TFUL_SERVICE_PSM, oldAnnotatesRESTfulServicePSM, annotatesRESTfulServicePSM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnnotationType() {
		return annotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotationType(String newAnnotationType) {
		String oldAnnotationType = annotationType;
		annotationType = newAnnotationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthenticationLayerPSMPackage.ANNOTATION_MODEL__ANNOTATION_TYPE, oldAnnotationType, annotationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AuthenticationLayerPSMPackage.ANNOTATION_MODEL__HAS_ANNOTATED_ELEMENT:
				return ((InternalEList<?>)getHasAnnotatedElement()).basicRemove(otherEnd, msgs);
			case AuthenticationLayerPSMPackage.ANNOTATION_MODEL__HAS_ANNOTATION:
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
			case AuthenticationLayerPSMPackage.ANNOTATION_MODEL__NAME:
				return getName();
			case AuthenticationLayerPSMPackage.ANNOTATION_MODEL__HAS_ANNOTATED_ELEMENT:
				return getHasAnnotatedElement();
			case AuthenticationLayerPSMPackage.ANNOTATION_MODEL__HAS_ANNOTATION:
				return getHasAnnotation();
			case AuthenticationLayerPSMPackage.ANNOTATION_MODEL__ANNOTATES_RES_TFUL_SERVICE_PSM:
				if (resolve) return getAnnotatesRESTfulServicePSM();
				return basicGetAnnotatesRESTfulServicePSM();
			case AuthenticationLayerPSMPackage.ANNOTATION_MODEL__ANNOTATION_TYPE:
				return getAnnotationType();
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
			case AuthenticationLayerPSMPackage.ANNOTATION_MODEL__NAME:
				setName((String)newValue);
				return;
			case AuthenticationLayerPSMPackage.ANNOTATION_MODEL__HAS_ANNOTATED_ELEMENT:
				getHasAnnotatedElement().clear();
				getHasAnnotatedElement().addAll((Collection<? extends AnnotatedElement>)newValue);
				return;
			case AuthenticationLayerPSMPackage.ANNOTATION_MODEL__HAS_ANNOTATION:
				getHasAnnotation().clear();
				getHasAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case AuthenticationLayerPSMPackage.ANNOTATION_MODEL__ANNOTATES_RES_TFUL_SERVICE_PSM:
				setAnnotatesRESTfulServicePSM((ServicePSM)newValue);
				return;
			case AuthenticationLayerPSMPackage.ANNOTATION_MODEL__ANNOTATION_TYPE:
				setAnnotationType((String)newValue);
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
			case AuthenticationLayerPSMPackage.ANNOTATION_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AuthenticationLayerPSMPackage.ANNOTATION_MODEL__HAS_ANNOTATED_ELEMENT:
				getHasAnnotatedElement().clear();
				return;
			case AuthenticationLayerPSMPackage.ANNOTATION_MODEL__HAS_ANNOTATION:
				getHasAnnotation().clear();
				return;
			case AuthenticationLayerPSMPackage.ANNOTATION_MODEL__ANNOTATES_RES_TFUL_SERVICE_PSM:
				setAnnotatesRESTfulServicePSM((ServicePSM)null);
				return;
			case AuthenticationLayerPSMPackage.ANNOTATION_MODEL__ANNOTATION_TYPE:
				setAnnotationType(ANNOTATION_TYPE_EDEFAULT);
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
			case AuthenticationLayerPSMPackage.ANNOTATION_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AuthenticationLayerPSMPackage.ANNOTATION_MODEL__HAS_ANNOTATED_ELEMENT:
				return hasAnnotatedElement != null && !hasAnnotatedElement.isEmpty();
			case AuthenticationLayerPSMPackage.ANNOTATION_MODEL__HAS_ANNOTATION:
				return hasAnnotation != null && !hasAnnotation.isEmpty();
			case AuthenticationLayerPSMPackage.ANNOTATION_MODEL__ANNOTATES_RES_TFUL_SERVICE_PSM:
				return annotatesRESTfulServicePSM != null;
			case AuthenticationLayerPSMPackage.ANNOTATION_MODEL__ANNOTATION_TYPE:
				return ANNOTATION_TYPE_EDEFAULT == null ? annotationType != null : !ANNOTATION_TYPE_EDEFAULT.equals(annotationType);
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
		result.append(", annotationType: ");
		result.append(annotationType);
		result.append(')');
		return result.toString();
	}

} //AnnotationModelImpl
