/**
 */
package SearchLayerCIM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Searchable Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SearchLayerCIM.SearchableProperty#getPropertyIsSearchable <em>Property Is Searchable</em>}</li>
 * </ul>
 * </p>
 *
 * @see SearchLayerCIM.SearchLayerCIMPackage#getSearchableProperty()
 * @model
 * @generated
 */
public interface SearchableProperty extends Annotation {
	/**
	 * Returns the value of the '<em><b>Property Is Searchable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Is Searchable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Is Searchable</em>' reference.
	 * @see #setPropertyIsSearchable(AnnProperty)
	 * @see SearchLayerCIM.SearchLayerCIMPackage#getSearchableProperty_PropertyIsSearchable()
	 * @model required="true"
	 * @generated
	 */
	AnnProperty getPropertyIsSearchable();

	/**
	 * Sets the value of the '{@link SearchLayerCIM.SearchableProperty#getPropertyIsSearchable <em>Property Is Searchable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Is Searchable</em>' reference.
	 * @see #getPropertyIsSearchable()
	 * @generated
	 */
	void setPropertyIsSearchable(AnnProperty value);

} // SearchableProperty
