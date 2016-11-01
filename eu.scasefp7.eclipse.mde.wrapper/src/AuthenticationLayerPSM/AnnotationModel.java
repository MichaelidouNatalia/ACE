/**
 */
package AuthenticationLayerPSM;

import RESTfulServicePSM.ServicePSM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AuthenticationLayerPSM.AnnotationModel#getName <em>Name</em>}</li>
 *   <li>{@link AuthenticationLayerPSM.AnnotationModel#getHasAnnotatedElement <em>Has Annotated Element</em>}</li>
 *   <li>{@link AuthenticationLayerPSM.AnnotationModel#getHasAnnotation <em>Has Annotation</em>}</li>
 *   <li>{@link AuthenticationLayerPSM.AnnotationModel#getAnnotatesRESTfulServicePSM <em>Annotates RES Tful Service PSM</em>}</li>
 *   <li>{@link AuthenticationLayerPSM.AnnotationModel#getAnnotationType <em>Annotation Type</em>}</li>
 * </ul>
 *
 * @see AuthenticationLayerPSM.AuthenticationLayerPSMPackage#getAnnotationModel()
 * @model
 * @generated
 */
public interface AnnotationModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see AuthenticationLayerPSM.AuthenticationLayerPSMPackage#getAnnotationModel_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link AuthenticationLayerPSM.AnnotationModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Annotated Element</b></em>' containment reference list.
	 * The list contents are of type {@link AuthenticationLayerPSM.AnnotatedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Annotated Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Annotated Element</em>' containment reference list.
	 * @see AuthenticationLayerPSM.AuthenticationLayerPSMPackage#getAnnotationModel_HasAnnotatedElement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AnnotatedElement> getHasAnnotatedElement();

	/**
	 * Returns the value of the '<em><b>Has Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link AuthenticationLayerPSM.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Annotation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Annotation</em>' containment reference list.
	 * @see AuthenticationLayerPSM.AuthenticationLayerPSMPackage#getAnnotationModel_HasAnnotation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Annotation> getHasAnnotation();

	/**
	 * Returns the value of the '<em><b>Annotates RES Tful Service PSM</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotates RES Tful Service PSM</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotates RES Tful Service PSM</em>' reference.
	 * @see #setAnnotatesRESTfulServicePSM(ServicePSM)
	 * @see AuthenticationLayerPSM.AuthenticationLayerPSMPackage#getAnnotationModel_AnnotatesRESTfulServicePSM()
	 * @model required="true"
	 * @generated
	 */
	ServicePSM getAnnotatesRESTfulServicePSM();

	/**
	 * Sets the value of the '{@link AuthenticationLayerPSM.AnnotationModel#getAnnotatesRESTfulServicePSM <em>Annotates RES Tful Service PSM</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotates RES Tful Service PSM</em>' reference.
	 * @see #getAnnotatesRESTfulServicePSM()
	 * @generated
	 */
	void setAnnotatesRESTfulServicePSM(ServicePSM value);

	/**
	 * Returns the value of the '<em><b>Annotation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Type</em>' attribute.
	 * @see #setAnnotationType(String)
	 * @see AuthenticationLayerPSM.AuthenticationLayerPSMPackage#getAnnotationModel_AnnotationType()
	 * @model required="true"
	 * @generated
	 */
	String getAnnotationType();

	/**
	 * Sets the value of the '{@link AuthenticationLayerPSM.AnnotationModel#getAnnotationType <em>Annotation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation Type</em>' attribute.
	 * @see #getAnnotationType()
	 * @generated
	 */
	void setAnnotationType(String value);

} // AnnotationModel
