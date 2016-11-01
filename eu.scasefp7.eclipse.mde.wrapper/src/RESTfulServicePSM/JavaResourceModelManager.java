/**
 */
package RESTfulServicePSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Resource Model Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RESTfulServicePSM.JavaResourceModelManager#getJavaRMManagerHasJAXBAnnotation <em>Java RM Manager Has JAXB Annotation</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaResourceModelManager#getJavaRMManagerHasProperty <em>Java RM Manager Has Property</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaResourceModelManager#getHasRelatedJavaRModel <em>Has Related Java RModel</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaResourceModelManager#getJavaRMManagerHasSetter <em>Java RM Manager Has Setter</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaResourceModelManager#getJavaRMManagerHasGetter <em>Java RM Manager Has Getter</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaResourceModelManager#getName <em>Name</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaResourceModelManager#getParentName <em>Parent Name</em>}</li>
 * </ul>
 *
 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaResourceModelManager()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueXMLRootElementAnnotation uniqueSetterForEveryProeprty uniqueGetterForEveryProeprty uniqueLinkListProperty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqueXMLRootElementAnnotation='self.JavaRMManagerHasJAXBAnnotation->one(JAXBAnnotationText = \'@XmlRootElement\')' uniqueSetterForEveryProeprty='self.JavaRMManagerHasProperty->forAll(Property | \n\t\t\tself.JavaRMManagerHasSetter->one(name = \'set\' + Property.name)\n\t\t)' uniqueGetterForEveryProeprty='self.JavaRMManagerHasProperty->forAll(Property | \n\t\t\tself.JavaRMManagerHasGetter->one(name = \'get\' + Property.name)\n\t\t)' uniqueLinkListProperty='self.JavaRMManagerHasProperty->one(name = \'linklist\') \n\t\t\tand self.JavaRMManagerHasProperty->select(name = \'linklist\').PropertyHasHibernateAnnotation->one(\'@Transient\')'"
 * @generated
 */
public interface JavaResourceModelManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Java RM Manager Has JAXB Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java RM Manager Has JAXB Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java RM Manager Has JAXB Annotation</em>' containment reference.
	 * @see #setJavaRMManagerHasJAXBAnnotation(JAXBAnnotation)
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaResourceModelManager_JavaRMManagerHasJAXBAnnotation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JAXBAnnotation getJavaRMManagerHasJAXBAnnotation();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.JavaResourceModelManager#getJavaRMManagerHasJAXBAnnotation <em>Java RM Manager Has JAXB Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java RM Manager Has JAXB Annotation</em>' containment reference.
	 * @see #getJavaRMManagerHasJAXBAnnotation()
	 * @generated
	 */
	void setJavaRMManagerHasJAXBAnnotation(JAXBAnnotation value);

	/**
	 * Returns the value of the '<em><b>Java RM Manager Has Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java RM Manager Has Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java RM Manager Has Property</em>' containment reference.
	 * @see #setJavaRMManagerHasProperty(PSMComponentProperty)
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaResourceModelManager_JavaRMManagerHasProperty()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PSMComponentProperty getJavaRMManagerHasProperty();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.JavaResourceModelManager#getJavaRMManagerHasProperty <em>Java RM Manager Has Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java RM Manager Has Property</em>' containment reference.
	 * @see #getJavaRMManagerHasProperty()
	 * @generated
	 */
	void setJavaRMManagerHasProperty(PSMComponentProperty value);

	/**
	 * Returns the value of the '<em><b>Has Related Java RModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Related Java RModel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Related Java RModel</em>' reference.
	 * @see #setHasRelatedJavaRModel(JavaResourceModel)
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaResourceModelManager_HasRelatedJavaRModel()
	 * @model required="true"
	 * @generated
	 */
	JavaResourceModel getHasRelatedJavaRModel();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.JavaResourceModelManager#getHasRelatedJavaRModel <em>Has Related Java RModel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Related Java RModel</em>' reference.
	 * @see #getHasRelatedJavaRModel()
	 * @generated
	 */
	void setHasRelatedJavaRModel(JavaResourceModel value);

	/**
	 * Returns the value of the '<em><b>Java RM Manager Has Setter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java RM Manager Has Setter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java RM Manager Has Setter</em>' containment reference.
	 * @see #setJavaRMManagerHasSetter(JavaSetterFunction)
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaResourceModelManager_JavaRMManagerHasSetter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JavaSetterFunction getJavaRMManagerHasSetter();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.JavaResourceModelManager#getJavaRMManagerHasSetter <em>Java RM Manager Has Setter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java RM Manager Has Setter</em>' containment reference.
	 * @see #getJavaRMManagerHasSetter()
	 * @generated
	 */
	void setJavaRMManagerHasSetter(JavaSetterFunction value);

	/**
	 * Returns the value of the '<em><b>Java RM Manager Has Getter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java RM Manager Has Getter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java RM Manager Has Getter</em>' containment reference.
	 * @see #setJavaRMManagerHasGetter(JavaGetterFunction)
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaResourceModelManager_JavaRMManagerHasGetter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JavaGetterFunction getJavaRMManagerHasGetter();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.JavaResourceModelManager#getJavaRMManagerHasGetter <em>Java RM Manager Has Getter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java RM Manager Has Getter</em>' containment reference.
	 * @see #getJavaRMManagerHasGetter()
	 * @generated
	 */
	void setJavaRMManagerHasGetter(JavaGetterFunction value);

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
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaResourceModelManager_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.JavaResourceModelManager#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Name</em>' attribute.
	 * @see #setParentName(String)
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaResourceModelManager_ParentName()
	 * @model required="true"
	 * @generated
	 */
	String getParentName();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.JavaResourceModelManager#getParentName <em>Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Name</em>' attribute.
	 * @see #getParentName()
	 * @generated
	 */
	void setParentName(String value);

} // JavaResourceModelManager
