/**
 */
package AuthenticationLayerCIM;

import ServiceCIM.CRUDActivity;
import ServiceCIM.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ann CRUD Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AuthenticationLayerCIM.AnnCRUDActivity#getAnnotatesCRUDActivity <em>Annotates CRUD Activity</em>}</li>
 *   <li>{@link AuthenticationLayerCIM.AnnCRUDActivity#getName <em>Name</em>}</li>
 *   <li>{@link AuthenticationLayerCIM.AnnCRUDActivity#getBelongsToResource <em>Belongs To Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see AuthenticationLayerCIM.AuthenticationLayerCIMPackage#getAnnCRUDActivity()
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
	 * @see AuthenticationLayerCIM.AuthenticationLayerCIMPackage#getAnnCRUDActivity_AnnotatesCRUDActivity()
	 * @model required="true"
	 * @generated
	 */
	CRUDActivity getAnnotatesCRUDActivity();

	/**
	 * Sets the value of the '{@link AuthenticationLayerCIM.AnnCRUDActivity#getAnnotatesCRUDActivity <em>Annotates CRUD Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotates CRUD Activity</em>' reference.
	 * @see #getAnnotatesCRUDActivity()
	 * @generated
	 */
	void setAnnotatesCRUDActivity(CRUDActivity value);

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
	 * @see AuthenticationLayerCIM.AuthenticationLayerCIMPackage#getAnnCRUDActivity_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link AuthenticationLayerCIM.AnnCRUDActivity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Belongs To Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belongs To Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To Resource</em>' reference.
	 * @see #setBelongsToResource(Resource)
	 * @see AuthenticationLayerCIM.AuthenticationLayerCIMPackage#getAnnCRUDActivity_BelongsToResource()
	 * @model required="true"
	 * @generated
	 */
	Resource getBelongsToResource();

	/**
	 * Sets the value of the '{@link AuthenticationLayerCIM.AnnCRUDActivity#getBelongsToResource <em>Belongs To Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To Resource</em>' reference.
	 * @see #getBelongsToResource()
	 * @generated
	 */
	void setBelongsToResource(Resource value);

} // AnnCRUDActivity
