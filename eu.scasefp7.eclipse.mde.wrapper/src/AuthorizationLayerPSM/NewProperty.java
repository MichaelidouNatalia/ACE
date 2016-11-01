/**
 */
package AuthorizationLayerPSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerPSM.NewProperty#getName <em>Name</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.NewProperty#getType <em>Type</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.NewProperty#isBIsUnique <em>BIs Unique</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.NewProperty#getBelongsToResource <em>Belongs To Resource</em>}</li>
 * </ul>
 *
 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getNewProperty()
 * @model
 * @generated
 */
public interface NewProperty extends Annotation {
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
	 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getNewProperty_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link AuthorizationLayerPSM.NewProperty#getName <em>Name</em>}' attribute.
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
	 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getNewProperty_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link AuthorizationLayerPSM.NewProperty#getType <em>Type</em>}' attribute.
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
	 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getNewProperty_BIsUnique()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 * @generated
	 */
	boolean isBIsUnique();

	/**
	 * Sets the value of the '{@link AuthorizationLayerPSM.NewProperty#isBIsUnique <em>BIs Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BIs Unique</em>' attribute.
	 * @see #isBIsUnique()
	 * @generated
	 */
	void setBIsUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Belongs To Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belongs To Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongs To Resource</em>' reference.
	 * @see #setBelongsToResource(AnnJavaResourceModel)
	 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getNewProperty_BelongsToResource()
	 * @model required="true"
	 * @generated
	 */
	AnnJavaResourceModel getBelongsToResource();

	/**
	 * Sets the value of the '{@link AuthorizationLayerPSM.NewProperty#getBelongsToResource <em>Belongs To Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Belongs To Resource</em>' reference.
	 * @see #getBelongsToResource()
	 * @generated
	 */
	void setBelongsToResource(AnnJavaResourceModel value);

} // NewProperty
