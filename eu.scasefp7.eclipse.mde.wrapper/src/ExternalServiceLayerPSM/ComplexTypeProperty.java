/**
 */
package ExternalServiceLayerPSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Type Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ExternalServiceLayerPSM.ComplexTypeProperty#getName <em>Name</em>}</li>
 *   <li>{@link ExternalServiceLayerPSM.ComplexTypeProperty#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link ExternalServiceLayerPSM.ComplexTypeProperty#getType <em>Type</em>}</li>
 *   <li>{@link ExternalServiceLayerPSM.ComplexTypeProperty#isHasPrimitiveType <em>Has Primitive Type</em>}</li>
 *   <li>{@link ExternalServiceLayerPSM.ComplexTypeProperty#getPropertyHasComplexType <em>Property Has Complex Type</em>}</li>
 * </ul>
 *
 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getComplexTypeProperty()
 * @model
 * @generated
 */
public interface ComplexTypeProperty extends EObject {
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
	 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getComplexTypeProperty_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ExternalServiceLayerPSM.ComplexTypeProperty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Unique</em>' attribute.
	 * @see #setIsUnique(boolean)
	 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getComplexTypeProperty_IsUnique()
	 * @model
	 * @generated
	 */
	boolean isIsUnique();

	/**
	 * Sets the value of the '{@link ExternalServiceLayerPSM.ComplexTypeProperty#isIsUnique <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Unique</em>' attribute.
	 * @see #isIsUnique()
	 * @generated
	 */
	void setIsUnique(boolean value);

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
	 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getComplexTypeProperty_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link ExternalServiceLayerPSM.ComplexTypeProperty#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Has Primitive Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Primitive Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Primitive Type</em>' attribute.
	 * @see #setHasPrimitiveType(boolean)
	 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getComplexTypeProperty_HasPrimitiveType()
	 * @model
	 * @generated
	 */
	boolean isHasPrimitiveType();

	/**
	 * Sets the value of the '{@link ExternalServiceLayerPSM.ComplexTypeProperty#isHasPrimitiveType <em>Has Primitive Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Primitive Type</em>' attribute.
	 * @see #isHasPrimitiveType()
	 * @generated
	 */
	void setHasPrimitiveType(boolean value);

	/**
	 * Returns the value of the '<em><b>Property Has Complex Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Has Complex Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Has Complex Type</em>' reference.
	 * @see #setPropertyHasComplexType(ComplexType)
	 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getComplexTypeProperty_PropertyHasComplexType()
	 * @model
	 * @generated
	 */
	ComplexType getPropertyHasComplexType();

	/**
	 * Sets the value of the '{@link ExternalServiceLayerPSM.ComplexTypeProperty#getPropertyHasComplexType <em>Property Has Complex Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Has Complex Type</em>' reference.
	 * @see #getPropertyHasComplexType()
	 * @generated
	 */
	void setPropertyHasComplexType(ComplexType value);

} // ComplexTypeProperty
