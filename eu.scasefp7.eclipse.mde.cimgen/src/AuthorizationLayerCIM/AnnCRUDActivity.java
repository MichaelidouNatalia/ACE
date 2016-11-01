/**
 */
package AuthorizationLayerCIM;

import ServiceCIM.CRUDActivity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ann CRUD Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerCIM.AnnCRUDActivity#getAnnotatesCRUDActivity <em>Annotates CRUD Activity</em>}</li>
 * </ul>
 *
 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getAnnCRUDActivity()
 * @model
 * @generated
 */
public interface AnnCRUDActivity extends AnnotatedElement {
	/**
	 * Returns the value of the '<em><b>Annotates CRUD Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotates CRUD Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotates CRUD Activity</em>' reference.
	 * @see #setAnnotatesCRUDActivity(CRUDActivity)
	 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getAnnCRUDActivity_AnnotatesCRUDActivity()
	 * @model required="true"
	 * @generated
	 */
	CRUDActivity getAnnotatesCRUDActivity();

	/**
	 * Sets the value of the '{@link AuthorizationLayerCIM.AnnCRUDActivity#getAnnotatesCRUDActivity <em>Annotates CRUD Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotates CRUD Activity</em>' reference.
	 * @see #getAnnotatesCRUDActivity()
	 * @generated
	 */
	void setAnnotatesCRUDActivity(CRUDActivity value);

} // AnnCRUDActivity
