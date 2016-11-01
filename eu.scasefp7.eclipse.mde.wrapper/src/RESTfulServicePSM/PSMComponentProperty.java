/**
 */
package RESTfulServicePSM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PSM Component Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RESTfulServicePSM.PSMComponentProperty#getPropertyHasHibernateAnnotation <em>Property Has Hibernate Annotation</em>}</li>
 *   <li>{@link RESTfulServicePSM.PSMComponentProperty#getName <em>Name</em>}</li>
 *   <li>{@link RESTfulServicePSM.PSMComponentProperty#getType <em>Type</em>}</li>
 *   <li>{@link RESTfulServicePSM.PSMComponentProperty#isBIsUnique <em>BIs Unique</em>}</li>
 *   <li>{@link RESTfulServicePSM.PSMComponentProperty#isBIsNamingProperty <em>BIs Naming Property</em>}</li>
 *   <li>{@link RESTfulServicePSM.PSMComponentProperty#isBIsPrimaryIdentifier <em>BIs Primary Identifier</em>}</li>
 * </ul>
 *
 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getPSMComponentProperty()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='primaryIdentifierHasProperAnnotations'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot primaryIdentifierHasProperAnnotations='(\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t(\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tself.bIsPrimaryIdentifier \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\timplies \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t(\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t\tself.PropertyHasHibernateAnnotation->one(\'@Id\')\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t\tand\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t\tself.PropertyHasHibernateAnnotation->one(\'@GeneratedValue\')\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t)\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t)\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t \tand\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t(\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t(\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t\tself.PropertyHasHibernateAnnotation->one(\'@Id\')\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t\tand\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t\tself.PropertyHasHibernateAnnotation->one(\'@GeneratedValue\')\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t)\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\timplies\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\tself.bIsPrimaryIdentifier\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t)\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t )'"
 * @generated
 */
public interface PSMComponentProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Property Has Hibernate Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link RESTfulServicePSM.HibernateAnnotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Has Hibernate Annotation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Has Hibernate Annotation</em>' containment reference list.
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getPSMComponentProperty_PropertyHasHibernateAnnotation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<HibernateAnnotation> getPropertyHasHibernateAnnotation();

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
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getPSMComponentProperty_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.PSMComponentProperty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getPSMComponentProperty_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.PSMComponentProperty#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>BIs Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BIs Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BIs Unique</em>' attribute.
	 * @see #setBIsUnique(boolean)
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getPSMComponentProperty_BIsUnique()
	 * @model required="true"
	 * @generated
	 */
	boolean isBIsUnique();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.PSMComponentProperty#isBIsUnique <em>BIs Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BIs Unique</em>' attribute.
	 * @see #isBIsUnique()
	 * @generated
	 */
	void setBIsUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>BIs Naming Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BIs Naming Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BIs Naming Property</em>' attribute.
	 * @see #setBIsNamingProperty(boolean)
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getPSMComponentProperty_BIsNamingProperty()
	 * @model required="true"
	 * @generated
	 */
	boolean isBIsNamingProperty();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.PSMComponentProperty#isBIsNamingProperty <em>BIs Naming Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BIs Naming Property</em>' attribute.
	 * @see #isBIsNamingProperty()
	 * @generated
	 */
	void setBIsNamingProperty(boolean value);

	/**
	 * Returns the value of the '<em><b>BIs Primary Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BIs Primary Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BIs Primary Identifier</em>' attribute.
	 * @see #setBIsPrimaryIdentifier(boolean)
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#getPSMComponentProperty_BIsPrimaryIdentifier()
	 * @model required="true"
	 * @generated
	 */
	boolean isBIsPrimaryIdentifier();

	/**
	 * Sets the value of the '{@link RESTfulServicePSM.PSMComponentProperty#isBIsPrimaryIdentifier <em>BIs Primary Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BIs Primary Identifier</em>' attribute.
	 * @see #isBIsPrimaryIdentifier()
	 * @generated
	 */
	void setBIsPrimaryIdentifier(boolean value);

} // PSMComponentProperty
