/**
 */
package ServiceCIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServiceCIM.Resource#isIsAlgorithmic <em>Is Algorithmic</em>}</li>
 *   <li>{@link ServiceCIM.Resource#getName <em>Name</em>}</li>
 *   <li>{@link ServiceCIM.Resource#getHasInputRepresentation <em>Has Input Representation</em>}</li>
 *   <li>{@link ServiceCIM.Resource#getHasCRUDActivity <em>Has CRUD Activity</em>}</li>
 *   <li>{@link ServiceCIM.Resource#getHasProperty <em>Has Property</em>}</li>
 *   <li>{@link ServiceCIM.Resource#getHasOutputRepresentation <em>Has Output Representation</em>}</li>
 *   <li>{@link ServiceCIM.Resource#getHasRelatedResource <em>Has Related Resource</em>}</li>
 *   <li>{@link ServiceCIM.Resource#getIsRelatedResource <em>Is Related Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServiceCIM.ServiceCIMPackage#getResource()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='UniqueCRUDVerbs UniqueInputMediaTypes UniqueOutputMediaTypes UniqueNamingProperty AlgoResHaveNoProperties CRUDResHaveAtLeastOneProperty'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot UniqueCRUDVerbs='self.hasCRUDActivity->isUnique(CRUDVerb)' UniqueInputMediaTypes='self.hasInputRepresentation->isUnique(MediaType)' UniqueOutputMediaTypes='self.hasOutputRepresentation->isUnique(MediaType)' UniqueNamingProperty='self.hasProperty->notEmpty() implies self.hasProperty->one(isNamingProperty = true)' AlgoResHaveNoProperties='(self.isAlgorithmic = true) implies self.hasProperty->isEmpty()' CRUDResHaveAtLeastOneProperty='(self.isAlgorithmic = false) implies self.hasProperty->notEmpty()'"
 * @generated
 */
public interface Resource extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Algorithmic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Algorithmic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Algorithmic</em>' attribute.
	 * @see #setIsAlgorithmic(boolean)
	 * @see ServiceCIM.ServiceCIMPackage#getResource_IsAlgorithmic()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsAlgorithmic();

	/**
	 * Sets the value of the '{@link ServiceCIM.Resource#isIsAlgorithmic <em>Is Algorithmic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Algorithmic</em>' attribute.
	 * @see #isIsAlgorithmic()
	 * @generated
	 */
	void setIsAlgorithmic(boolean value);

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
	 * @see ServiceCIM.ServiceCIMPackage#getResource_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ServiceCIM.Resource#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Has Input Representation</b></em>' containment reference list.
	 * The list contents are of type {@link ServiceCIM.InputRepresentation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Input Representation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Input Representation</em>' containment reference list.
	 * @see ServiceCIM.ServiceCIMPackage#getResource_HasInputRepresentation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InputRepresentation> getHasInputRepresentation();

	/**
	 * Returns the value of the '<em><b>Has CRUD Activity</b></em>' containment reference list.
	 * The list contents are of type {@link ServiceCIM.CRUDActivity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has CRUD Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has CRUD Activity</em>' containment reference list.
	 * @see ServiceCIM.ServiceCIMPackage#getResource_HasCRUDActivity()
	 * @model containment="true" required="true" upper="4"
	 * @generated
	 */
	EList<CRUDActivity> getHasCRUDActivity();

	/**
	 * Returns the value of the '<em><b>Has Property</b></em>' containment reference list.
	 * The list contents are of type {@link ServiceCIM.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Property</em>' containment reference list.
	 * @see ServiceCIM.ServiceCIMPackage#getResource_HasProperty()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getHasProperty();

	/**
	 * Returns the value of the '<em><b>Has Output Representation</b></em>' containment reference list.
	 * The list contents are of type {@link ServiceCIM.OutputRepresentation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Output Representation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Output Representation</em>' containment reference list.
	 * @see ServiceCIM.ServiceCIMPackage#getResource_HasOutputRepresentation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<OutputRepresentation> getHasOutputRepresentation();

	/**
	 * Returns the value of the '<em><b>Has Related Resource</b></em>' reference list.
	 * The list contents are of type {@link ServiceCIM.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Related Resource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Related Resource</em>' reference list.
	 * @see ServiceCIM.ServiceCIMPackage#getResource_HasRelatedResource()
	 * @model
	 * @generated
	 */
	EList<Resource> getHasRelatedResource();

	/**
	 * Returns the value of the '<em><b>Is Related Resource</b></em>' reference list.
	 * The list contents are of type {@link ServiceCIM.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Related Resource</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Related Resource</em>' reference list.
	 * @see ServiceCIM.ServiceCIMPackage#getResource_IsRelatedResource()
	 * @model
	 * @generated
	 */
	EList<Resource> getIsRelatedResource();

} // Resource
