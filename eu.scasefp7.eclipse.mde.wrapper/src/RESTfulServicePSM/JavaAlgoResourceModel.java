/**
 */
package RESTfulServicePSM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Algo Resource Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RESTfulServicePSM.JavaAlgoResourceModel#getJavaAlgoModelHasJAXBAnnotation <em>Java Algo Model Has JAXB Annotation</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaAlgoResourceModel#getJavaAlgoModelHasProperty <em>Java Algo Model Has Property</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaAlgoResourceModel#getJavaAlgoModelHasSetterFunction <em>Java Algo Model Has Setter Function</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaAlgoResourceModel#getJavaAlgoModelHasGetterFunction <em>Java Algo Model Has Getter Function</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaAlgoResourceModel#getName <em>Name</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaAlgoResourceModel#getParentName <em>Parent Name</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaAlgoResourceModel#getHasRelatedAlgoModel <em>Has Related Algo Model</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaAlgoResourceModel#getIsRelatedAlgoModel <em>Is Related Algo Model</em>}</li>
 * </ul>
 *
 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaAlgoResourceModel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueXMLRootElementAnnotation uniqueSetterForEveryProeprty uniqueGetterForEveryProeprty uniqueLinkListProperty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqueXMLRootElementAnnotation='self.JavaAlgoModelHasJAXBAnnotation->one(JAXBAnnotationText = \'@XmlRootElement\')' uniqueSetterForEveryProeprty='self.JavaAlgoModelHasProperty->forAll(Property | \n\t\t\tself.JavaAlgoModelHasSetterFunction->one(name = \'set\' + Property.name)\n\t\t)' uniqueGetterForEveryProeprty='self.JavaAlgoModelHasProperty->forAll(Property | \n\t\t\tself.JavaAlgoModelHasGetterFunction->one(name = \'get\' + Property.name)\n\t\t)' uniqueLinkListProperty='self.JavaAlgoModelHasProperty->one(name = \'linklist\') \n\t\t\tand self.JavaAlgoModelHasProperty->select(name = \'linklist\').PropertyHasHibernateAnnotation->one(\'@Transient\')'"
 * @generated
 */
public interface JavaAlgoResourceModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Java Algo Model Has JAXB Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Algo Model Has JAXB Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Algo Model Has JAXB Annotation</em>' containment reference.
	 * @see #setJavaAlgoModelHasJAXBAnnotation(JAXBAnnotation)
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaAlgoResourceModel_JavaAlgoModelHasJAXBAnnotation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JAXBAnnotation getJavaAlgoModelHasJAXBAnnotation();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.JavaAlgoResourceModel#getJavaAlgoModelHasJAXBAnnotation <em>Java Algo Model Has JAXB Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Algo Model Has JAXB Annotation</em>' containment reference.
	 * @see #getJavaAlgoModelHasJAXBAnnotation()
	 * @generated
	 */
	void setJavaAlgoModelHasJAXBAnnotation(JAXBAnnotation value);

	/**
	 * Returns the value of the '<em><b>Java Algo Model Has Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Algo Model Has Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Algo Model Has Property</em>' containment reference.
	 * @see #setJavaAlgoModelHasProperty(PSMComponentProperty)
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaAlgoResourceModel_JavaAlgoModelHasProperty()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PSMComponentProperty getJavaAlgoModelHasProperty();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.JavaAlgoResourceModel#getJavaAlgoModelHasProperty <em>Java Algo Model Has Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Algo Model Has Property</em>' containment reference.
	 * @see #getJavaAlgoModelHasProperty()
	 * @generated
	 */
	void setJavaAlgoModelHasProperty(PSMComponentProperty value);

	/**
	 * Returns the value of the '<em><b>Java Algo Model Has Setter Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Algo Model Has Setter Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Algo Model Has Setter Function</em>' containment reference.
	 * @see #setJavaAlgoModelHasSetterFunction(JavaSetterFunction)
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaAlgoResourceModel_JavaAlgoModelHasSetterFunction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JavaSetterFunction getJavaAlgoModelHasSetterFunction();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.JavaAlgoResourceModel#getJavaAlgoModelHasSetterFunction <em>Java Algo Model Has Setter Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Algo Model Has Setter Function</em>' containment reference.
	 * @see #getJavaAlgoModelHasSetterFunction()
	 * @generated
	 */
	void setJavaAlgoModelHasSetterFunction(JavaSetterFunction value);

	/**
	 * Returns the value of the '<em><b>Java Algo Model Has Getter Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Algo Model Has Getter Function</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Algo Model Has Getter Function</em>' containment reference.
	 * @see #setJavaAlgoModelHasGetterFunction(JavaGetterFunction)
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaAlgoResourceModel_JavaAlgoModelHasGetterFunction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JavaGetterFunction getJavaAlgoModelHasGetterFunction();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.JavaAlgoResourceModel#getJavaAlgoModelHasGetterFunction <em>Java Algo Model Has Getter Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Algo Model Has Getter Function</em>' containment reference.
	 * @see #getJavaAlgoModelHasGetterFunction()
	 * @generated
	 */
	void setJavaAlgoModelHasGetterFunction(JavaGetterFunction value);

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
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaAlgoResourceModel_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.JavaAlgoResourceModel#getName <em>Name</em>}' attribute.
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
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaAlgoResourceModel_ParentName()
	 * @model required="true"
	 * @generated
	 */
	String getParentName();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.JavaAlgoResourceModel#getParentName <em>Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Name</em>' attribute.
	 * @see #getParentName()
	 * @generated
	 */
	void setParentName(String value);

	/**
	 * Returns the value of the '<em><b>Has Related Algo Model</b></em>' reference list.
	 * The list contents are of type {@link RESTfulServicePSM.JavaAlgoResourceModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Related Algo Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Related Algo Model</em>' reference list.
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaAlgoResourceModel_HasRelatedAlgoModel()
	 * @model
	 * @generated
	 */
	EList<JavaAlgoResourceModel> getHasRelatedAlgoModel();

	/**
	 * Returns the value of the '<em><b>Is Related Algo Model</b></em>' reference list.
	 * The list contents are of type {@link RESTfulServicePSM.JavaAlgoResourceModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Related Algo Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Related Algo Model</em>' reference list.
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaAlgoResourceModel_IsRelatedAlgoModel()
	 * @model
	 * @generated
	 */
	EList<JavaAlgoResourceModel> getIsRelatedAlgoModel();

} // JavaAlgoResourceModel
