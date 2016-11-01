/**
 */
package ExternalServiceLayerPSM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ExternalServiceLayerPSM.ComplexType#getComplexTypeName <em>Complex Type Name</em>}</li>
 *   <li>{@link ExternalServiceLayerPSM.ComplexType#getHasComplexTypeProperties <em>Has Complex Type Properties</em>}</li>
 * </ul>
 *
 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getComplexType()
 * @model
 * @generated
 */
public interface ComplexType extends EObject {
	/**
	 * Returns the value of the '<em><b>Complex Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complex Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complex Type Name</em>' attribute.
	 * @see #setComplexTypeName(String)
	 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getComplexType_ComplexTypeName()
	 * @model
	 * @generated
	 */
	String getComplexTypeName();

	/**
	 * Sets the value of the '{@link ExternalServiceLayerPSM.ComplexType#getComplexTypeName <em>Complex Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complex Type Name</em>' attribute.
	 * @see #getComplexTypeName()
	 * @generated
	 */
	void setComplexTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Has Complex Type Properties</b></em>' containment reference list.
	 * The list contents are of type {@link ExternalServiceLayerPSM.ComplexTypeProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Complex Type Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Complex Type Properties</em>' containment reference list.
	 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getComplexType_HasComplexTypeProperties()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ComplexTypeProperty> getHasComplexTypeProperties();

} // ComplexType
