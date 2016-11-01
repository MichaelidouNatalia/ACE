/**
 */
package RESTfulServicePSM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Resource Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RESTfulServicePSM.JavaResourceModel#getJavaRModelHasJAXBAnnotation <em>Java RModel Has JAXB Annotation</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaResourceModel#getJavaRModelHasProperty <em>Java RModel Has Property</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaResourceModel#getHasRelatedJavaRMManager <em>Has Related Java RM Manager</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaResourceModel#getJavaRModelHasHibernateAnnotation <em>Java RModel Has Hibernate Annotation</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaResourceModel#getJavaRModelHasSetter <em>Java RModel Has Setter</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaResourceModel#getJavaRModelHasGetter <em>Java RModel Has Getter</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaResourceModel#getHasRelatedJavaAlgoModel <em>Has Related Java Algo Model</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaResourceModel#getName <em>Name</em>}</li>
 *   <li>{@link RESTfulServicePSM.JavaResourceModel#getParentName <em>Parent Name</em>}</li>
 * </ul>
 *
 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaResourceModel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='uniqueXMLRootElementAnnotation uniqueNamingProperty neededRModelHibernateAnnotationsExist uniquePrimaryIdentifier uniqueSetterForEveryProeprty uniqueGetterForEveryProeprty uniqueLinkListProperty properCollectionHibernateAnnotations'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot uniqueXMLRootElementAnnotation='self.JavaRModelHasJAXBAnnotation->one(JAXBAnnotationText = \'@XmlRootElement\')' uniqueNamingProperty='self.JavaRModelHasProperty->isUnique(bIsNamingProperty = true)' neededRModelHibernateAnnotationsExist='self.JavaRModelHasHibernateAnnotation->one(\'@Entity\') and self.JavaRModelHasHibernateAnnotation->one(\'@Table(name=\"\' + self.parentName + \'\")\')' uniquePrimaryIdentifier='self.JavaRModelHasProperty->isUnique(bIsPrimaryIdentifier = true)' uniqueSetterForEveryProeprty='self.JavaRModelHasProperty->forAll(Property | \n\t\t\tself.JavaRModelHasSetter->one(name = \'set\' + Property.name)\n\t\t)' uniqueGetterForEveryProeprty='self.JavaRModelHasProperty->forAll(Property | \n\t\t\tself.JavaRModelHasGetter->one(name = \'get\' + Property.name)\n\t\t)' uniqueLinkListProperty='self.JavaRModelHasProperty->one(name = \'linklist\') \n\t\t\tand self.JavaRModelHasProperty->select(name = \'linklist\').PropertyHasHibernateAnnotation->one(\'@Transient\')' properCollectionHibernateAnnotations='\n\t\tlet JRRModels : Sequence(JavaResourceModel) = self.hasRelatedJavaRMManager.hasRelatedJavaRModel in\n\t\t\tself.JavaRModelHasProperty->select((bIsUnique = false) and (name <> \'linklist\'))->reject( Property | JRRModels->exists(JRRModel | \'SetOf\' + JRRModel.name = Property.name))\n\t\t\t\t->forAll(CollectionProperty | CollectionProperty.PropertyHasHibernateAnnotation->one(\'@ElementCollection(fetch = FetchType.EAGER)\')\n\t\t\t\t\tand\n\t\t\t\t\tCollectionProperty.PropertyHasHibernateAnnotation->one(\'@CollectionTable(name=\"\' + self.parentName + CollectionProperty.name +\'\", joinColumns=@JoinColumn(name=\"\' + self.JavaRModelHasProperty->select(bIsPrimaryIdentifier = true)->at(1).name + \'\"))\')\n\t\t\t\t\tand\n\t\t\t\t\tCollectionProperty.PropertyHasHibernateAnnotation->one(\'@ForeignKey(name = \"fk_\' + self.parentName + \'_\' + CollectionProperty.name + \'\")\')\n\t\t\t\t)'"
 * @generated
 */
public interface JavaResourceModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Java RModel Has JAXB Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java RModel Has JAXB Annotation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java RModel Has JAXB Annotation</em>' containment reference.
	 * @see #setJavaRModelHasJAXBAnnotation(JAXBAnnotation)
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaResourceModel_JavaRModelHasJAXBAnnotation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JAXBAnnotation getJavaRModelHasJAXBAnnotation();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.JavaResourceModel#getJavaRModelHasJAXBAnnotation <em>Java RModel Has JAXB Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java RModel Has JAXB Annotation</em>' containment reference.
	 * @see #getJavaRModelHasJAXBAnnotation()
	 * @generated
	 */
	void setJavaRModelHasJAXBAnnotation(JAXBAnnotation value);

	/**
	 * Returns the value of the '<em><b>Java RModel Has Property</b></em>' containment reference list.
	 * The list contents are of type {@link RESTfulServicePSM.PSMComponentProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java RModel Has Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java RModel Has Property</em>' containment reference list.
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaResourceModel_JavaRModelHasProperty()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PSMComponentProperty> getJavaRModelHasProperty();

	/**
	 * Returns the value of the '<em><b>Has Related Java RM Manager</b></em>' reference list.
	 * The list contents are of type {@link RESTfulServicePSM.JavaResourceModelManager}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Related Java RM Manager</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Related Java RM Manager</em>' reference list.
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaResourceModel_HasRelatedJavaRMManager()
	 * @model
	 * @generated
	 */
	EList<JavaResourceModelManager> getHasRelatedJavaRMManager();

	/**
	 * Returns the value of the '<em><b>Java RModel Has Hibernate Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link RESTfulServicePSM.HibernateAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java RModel Has Hibernate Annotation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java RModel Has Hibernate Annotation</em>' containment reference list.
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaResourceModel_JavaRModelHasHibernateAnnotation()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<HibernateAnnotation> getJavaRModelHasHibernateAnnotation();

	/**
	 * Returns the value of the '<em><b>Java RModel Has Setter</b></em>' containment reference list.
	 * The list contents are of type {@link RESTfulServicePSM.JavaSetterFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java RModel Has Setter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java RModel Has Setter</em>' containment reference list.
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaResourceModel_JavaRModelHasSetter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<JavaSetterFunction> getJavaRModelHasSetter();

	/**
	 * Returns the value of the '<em><b>Java RModel Has Getter</b></em>' containment reference list.
	 * The list contents are of type {@link RESTfulServicePSM.JavaGetterFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java RModel Has Getter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java RModel Has Getter</em>' containment reference list.
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaResourceModel_JavaRModelHasGetter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<JavaGetterFunction> getJavaRModelHasGetter();

	/**
	 * Returns the value of the '<em><b>Has Related Java Algo Model</b></em>' reference list.
	 * The list contents are of type {@link RESTfulServicePSM.JavaAlgoResourceModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Related Java Algo Model</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Related Java Algo Model</em>' reference list.
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaResourceModel_HasRelatedJavaAlgoModel()
	 * @model
	 * @generated
	 */
	EList<JavaAlgoResourceModel> getHasRelatedJavaAlgoModel();

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
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaResourceModel_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.JavaResourceModel#getName <em>Name</em>}' attribute.
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
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getJavaResourceModel_ParentName()
	 * @model required="true"
	 * @generated
	 */
	String getParentName();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.JavaResourceModel#getParentName <em>Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Name</em>' attribute.
	 * @see #getParentName()
	 * @generated
	 */
	void setParentName(String value);

} // JavaResourceModel
