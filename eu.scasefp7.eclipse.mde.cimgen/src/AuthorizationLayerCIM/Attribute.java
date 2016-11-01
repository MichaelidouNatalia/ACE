/**
 */
package AuthorizationLayerCIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerCIM.Attribute#getAttributeCategory <em>Attribute Category</em>}</li>
 *   <li>{@link AuthorizationLayerCIM.Attribute#getIsAttributeExistingProperty <em>Is Attribute Existing Property</em>}</li>
 *   <li>{@link AuthorizationLayerCIM.Attribute#getValue <em>Value</em>}</li>
 *   <li>{@link AuthorizationLayerCIM.Attribute#getIsAttributeNewProperty <em>Is Attribute New Property</em>}</li>
 *   <li>{@link AuthorizationLayerCIM.Attribute#getIsAttributeResource <em>Is Attribute Resource</em>}</li>
 * </ul>
 *
 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute Category</b></em>' attribute.
	 * The literals are from the enumeration {@link AuthorizationLayerCIM.AttributeCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Category</em>' attribute.
	 * @see AuthorizationLayerCIM.AttributeCategory
	 * @see #setAttributeCategory(AttributeCategory)
	 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getAttribute_AttributeCategory()
	 * @model required="true"
	 * @generated
	 */
	AttributeCategory getAttributeCategory();

	/**
	 * Sets the value of the '{@link AuthorizationLayerCIM.Attribute#getAttributeCategory <em>Attribute Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Category</em>' attribute.
	 * @see AuthorizationLayerCIM.AttributeCategory
	 * @see #getAttributeCategory()
	 * @generated
	 */
	void setAttributeCategory(AttributeCategory value);

	/**
	 * Returns the value of the '<em><b>Is Attribute Existing Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Attribute Existing Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Attribute Existing Property</em>' reference.
	 * @see #setIsAttributeExistingProperty(AnnProperty)
	 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getAttribute_IsAttributeExistingProperty()
	 * @model
	 * @generated
	 */
	AnnProperty getIsAttributeExistingProperty();

	/**
	 * Sets the value of the '{@link AuthorizationLayerCIM.Attribute#getIsAttributeExistingProperty <em>Is Attribute Existing Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Attribute Existing Property</em>' reference.
	 * @see #getIsAttributeExistingProperty()
	 * @generated
	 */
	void setIsAttributeExistingProperty(AnnProperty value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getAttribute_Value()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getValue();

	/**
	 * Returns the value of the '<em><b>Is Attribute New Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Attribute New Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Attribute New Property</em>' reference.
	 * @see #setIsAttributeNewProperty(NewProperty)
	 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getAttribute_IsAttributeNewProperty()
	 * @model
	 * @generated
	 */
	NewProperty getIsAttributeNewProperty();

	/**
	 * Sets the value of the '{@link AuthorizationLayerCIM.Attribute#getIsAttributeNewProperty <em>Is Attribute New Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Attribute New Property</em>' reference.
	 * @see #getIsAttributeNewProperty()
	 * @generated
	 */
	void setIsAttributeNewProperty(NewProperty value);

	/**
	 * Returns the value of the '<em><b>Is Attribute Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Attribute Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Attribute Resource</em>' reference.
	 * @see #setIsAttributeResource(AnnResource)
	 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getAttribute_IsAttributeResource()
	 * @model
	 * @generated
	 */
	AnnResource getIsAttributeResource();

	/**
	 * Sets the value of the '{@link AuthorizationLayerCIM.Attribute#getIsAttributeResource <em>Is Attribute Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Attribute Resource</em>' reference.
	 * @see #getIsAttributeResource()
	 * @generated
	 */
	void setIsAttributeResource(AnnResource value);

} // Attribute
