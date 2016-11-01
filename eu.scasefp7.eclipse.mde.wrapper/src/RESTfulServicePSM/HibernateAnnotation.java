/**
 */
package RESTfulServicePSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hibernate Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RESTfulServicePSM.HibernateAnnotation#getHibernateAnnotationText <em>Hibernate Annotation Text</em>}</li>
 * </ul>
 *
 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getHibernateAnnotation()
 * @model
 * @generated
 */
public interface HibernateAnnotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Hibernate Annotation Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hibernate Annotation Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hibernate Annotation Text</em>' attribute.
	 * @see #setHibernateAnnotationText(String)
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getHibernateAnnotation_HibernateAnnotationText()
	 * @model required="true"
	 * @generated
	 */
	String getHibernateAnnotationText();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.HibernateAnnotation#getHibernateAnnotationText <em>Hibernate Annotation Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hibernate Annotation Text</em>' attribute.
	 * @see #getHibernateAnnotationText()
	 * @generated
	 */
	void setHibernateAnnotationText(String value);

} // HibernateAnnotation
