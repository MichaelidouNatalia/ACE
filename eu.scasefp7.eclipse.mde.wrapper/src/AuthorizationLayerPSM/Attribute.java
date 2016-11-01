/**
 */
package AuthorizationLayerPSM;

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
 *   <li>{@link AuthorizationLayerPSM.Attribute#getAttributeCategory <em>Attribute Category</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.Attribute#getValue <em>Value</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.Attribute#getIsAttributeExistingProperty <em>Is Attribute Existing Property</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.Attribute#getIsAttributeNewProperty <em>Is Attribute New Property</em>}</li>
 * </ul>
 *
 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute Category</b></em>' attribute.
	 * The literals are from the enumeration {@link AuthorizationLayerPSM.AttributeCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Category</em>' attribute.
	 * @see AuthorizationLayerPSM.AttributeCategory
	 * @see #setAttributeCategory(AttributeCategory)
	 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getAttribute_AttributeCategory()
	 * @model required="true"
	 * @generated
	 */
	AttributeCategory getAttributeCategory();

	/**
	 * Sets the value of the '{@link AuthorizationLayerPSM.Attribute#getAttributeCategory <em>Attribute Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Category</em>' attribute.
	 * @see AuthorizationLayerPSM.AttributeCategory
	 * @see #getAttributeCategory()
	 * @generated
	 */
	void setAttributeCategory(AttributeCategory value);

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
	 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getAttribute_Value()
	 * @model
	 * @generated
	 */
	EList<String> getValue();

	/**
	 * Returns the value of the '<em><b>Is Attribute Existing Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Attribute Existing Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Attribute Existing Property</em>' reference.
	 * @see #setIsAttributeExistingProperty(AnnPSMComponentProperty)
	 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getAttribute_IsAttributeExistingProperty()
	 * @model
	 * @generated
	 */
	AnnPSMComponentProperty getIsAttributeExistingProperty();

	/**
	 * Sets the value of the '{@link AuthorizationLayerPSM.Attribute#getIsAttributeExistingProperty <em>Is Attribute Existing Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Attribute Existing Property</em>' reference.
	 * @see #getIsAttributeExistingProperty()
	 * @generated
	 */
	void setIsAttributeExistingProperty(AnnPSMComponentProperty value);

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
	 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getAttribute_IsAttributeNewProperty()
	 * @model
	 * @generated
	 */
	NewProperty getIsAttributeNewProperty();

	/**
	 * Sets the value of the '{@link AuthorizationLayerPSM.Attribute#getIsAttributeNewProperty <em>Is Attribute New Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Attribute New Property</em>' reference.
	 * @see #getIsAttributeNewProperty()
	 * @generated
	 */
	void setIsAttributeNewProperty(NewProperty value);

} // Attribute
