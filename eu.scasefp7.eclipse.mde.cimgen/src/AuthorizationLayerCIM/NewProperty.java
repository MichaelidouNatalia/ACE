/**
 */
package AuthorizationLayerCIM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerCIM.NewProperty#getBelongsToResource <em>Belongs To Resource</em>}</li>
 *   <li>{@link AuthorizationLayerCIM.NewProperty#getName <em>Name</em>}</li>
 *   <li>{@link AuthorizationLayerCIM.NewProperty#getType <em>Type</em>}</li>
 *   <li>{@link AuthorizationLayerCIM.NewProperty#isBIsUnique <em>BIs Unique</em>}</li>
 * </ul>
 *
 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getNewProperty()
 * @model
 * @generated
 */
public interface NewProperty extends Annotation {
	/**
	 * Returns the value of the '<em><b>Belongs To Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belongs To Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To Resource</em>' reference.
	 * @see #setBelongsToResource(AnnResource)
	 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getNewProperty_BelongsToResource()
	 * @model required="true"
	 * @generated
	 */
	AnnResource getBelongsToResource();

	/**
	 * Sets the value of the '{@link AuthorizationLayerCIM.NewProperty#getBelongsToResource <em>Belongs To Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To Resource</em>' reference.
	 * @see #getBelongsToResource()
	 * @generated
	 */
	void setBelongsToResource(AnnResource value);

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
	 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getNewProperty_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link AuthorizationLayerCIM.NewProperty#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getNewProperty_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link AuthorizationLayerCIM.NewProperty#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>BIs Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BIs Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BIs Unique</em>' attribute.
	 * @see #setBIsUnique(boolean)
	 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getNewProperty_BIsUnique()
	 * @model required="true"
	 * @generated
	 */
	boolean isBIsUnique();

	/**
	 * Sets the value of the '{@link AuthorizationLayerCIM.NewProperty#isBIsUnique <em>BIs Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BIs Unique</em>' attribute.
	 * @see #isBIsUnique()
	 * @generated
	 */
	void setBIsUnique(boolean value);

} // NewProperty
