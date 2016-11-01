/**
 */
package ServiceCIM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServiceCIM.InputRepresentation#getInputMediaType <em>Input Media Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServiceCIM.ServiceCIMPackage#getInputRepresentation()
 * @model
 * @generated
 */
public interface InputRepresentation extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Media Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ServiceCIM.MediaType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Media Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Media Type</em>' attribute.
	 * @see ServiceCIM.MediaType
	 * @see #setInputMediaType(MediaType)
	 * @see ServiceCIM.ServiceCIMPackage#getInputRepresentation_InputMediaType()
	 * @model required="true"
	 * @generated
	 */
	MediaType getInputMediaType();

	/**
	 * Sets the value of the '{@link ServiceCIM.InputRepresentation#getInputMediaType <em>Input Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Media Type</em>' attribute.
	 * @see ServiceCIM.MediaType
	 * @see #getInputMediaType()
	 * @generated
	 */
	void setInputMediaType(MediaType value);

} // InputRepresentation
