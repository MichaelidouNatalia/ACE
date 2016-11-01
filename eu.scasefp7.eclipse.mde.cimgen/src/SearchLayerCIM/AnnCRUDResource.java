/**
 */
package SearchLayerCIM;

import ServiceCIM.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ann CRUD Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SearchLayerCIM.AnnCRUDResource#getAnnotatesResource <em>Annotates Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see SearchLayerCIM.SearchLayerCIMPackage#getAnnCRUDResource()
 * @model
 * @generated
 */
public interface AnnCRUDResource extends AnnotatedElement {
	/**
	 * Returns the value of the '<em><b>Annotates Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotates Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotates Resource</em>' reference.
	 * @see #setAnnotatesResource(Resource)
	 * @see SearchLayerCIM.SearchLayerCIMPackage#getAnnCRUDResource_AnnotatesResource()
	 * @model required="true"
	 * @generated
	 */
	Resource getAnnotatesResource();

	/**
	 * Sets the value of the '{@link SearchLayerCIM.AnnCRUDResource#getAnnotatesResource <em>Annotates Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotates Resource</em>' reference.
	 * @see #getAnnotatesResource()
	 * @generated
	 */
	void setAnnotatesResource(Resource value);

} // AnnCRUDResource
