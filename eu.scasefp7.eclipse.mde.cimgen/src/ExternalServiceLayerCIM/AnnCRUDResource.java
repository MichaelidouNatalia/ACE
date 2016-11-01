/**
 */
package ExternalServiceLayerCIM;

import ServiceCIM.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ann CRUD Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ExternalServiceLayerCIM.AnnCRUDResource#getAnnotatesCRUDResource <em>Annotates CRUD Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage#getAnnCRUDResource()
 * @model
 * @generated
 */
public interface AnnCRUDResource extends AnnotatedElement {
	/**
	 * Returns the value of the '<em><b>Annotates CRUD Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotates CRUD Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotates CRUD Resource</em>' reference.
	 * @see #setAnnotatesCRUDResource(Resource)
	 * @see ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage#getAnnCRUDResource_AnnotatesCRUDResource()
	 * @model required="true"
	 * @generated
	 */
	Resource getAnnotatesCRUDResource();

	/**
	 * Sets the value of the '{@link ExternalServiceLayerCIM.AnnCRUDResource#getAnnotatesCRUDResource <em>Annotates CRUD Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotates CRUD Resource</em>' reference.
	 * @see #getAnnotatesCRUDResource()
	 * @generated
	 */
	void setAnnotatesCRUDResource(Resource value);

} // AnnCRUDResource
