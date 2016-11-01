/**
 */
package SearchLayerPSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Searchable Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SearchLayerPSM.SearchableProperty#getIsSearchableProperty <em>Is Searchable Property</em>}</li>
 * </ul>
 *
 * @see SearchLayerPSM.SearchLayerPSMPackage#getSearchableProperty()
 * @model
 * @generated
 */
public interface SearchableProperty extends Annotation {
	/**
	 * Returns the value of the '<em><b>Is Searchable Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Searchable Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Searchable Property</em>' reference.
	 * @see #setIsSearchableProperty(AnnPSMComponentProperty)
	 * @see SearchLayerPSM.SearchLayerPSMPackage#getSearchableProperty_IsSearchableProperty()
	 * @model required="true"
	 * @generated
	 */
	AnnPSMComponentProperty getIsSearchableProperty();

	/**
	 * Sets the value of the '{@link SearchLayerPSM.SearchableProperty#getIsSearchableProperty <em>Is Searchable Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Searchable Property</em>' reference.
	 * @see #getIsSearchableProperty()
	 * @generated
	 */
	void setIsSearchableProperty(AnnPSMComponentProperty value);

} // SearchableProperty
