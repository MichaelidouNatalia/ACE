/**
 */
package ServiceCIM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Representation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServiceCIM.OutputRepresentation#getOutputMediaType <em>Output Media Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServiceCIM.ServiceCIMPackage#getOutputRepresentation()
 * @model
 * @generated
 */
public interface OutputRepresentation extends EObject {
	/**
	 * Returns the value of the '<em><b>Output Media Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ServiceCIM.MediaType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Media Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Media Type</em>' attribute.
	 * @see ServiceCIM.MediaType
	 * @see #setOutputMediaType(MediaType)
	 * @see ServiceCIM.ServiceCIMPackage#getOutputRepresentation_OutputMediaType()
	 * @model required="true"
	 * @generated
	 */
	MediaType getOutputMediaType();

	/**
	 * Sets the value of the '{@link ServiceCIM.OutputRepresentation#getOutputMediaType <em>Output Media Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Media Type</em>' attribute.
	 * @see ServiceCIM.MediaType
	 * @see #getOutputMediaType()
	 * @generated
	 */
	void setOutputMediaType(MediaType value);

} // OutputRepresentation
