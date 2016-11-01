/**
 */
package SearchLayerCIM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Searchable Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SearchLayerCIM.SearchableResource#getResourceIsSearchable <em>Resource Is Searchable</em>}</li>
 *   <li>{@link SearchLayerCIM.SearchableResource#getHasSearchableProperty <em>Has Searchable Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see SearchLayerCIM.SearchLayerCIMPackage#getSearchableResource()
 * @model
 * @generated
 */
public interface SearchableResource extends Annotation {
	/**
	 * Returns the value of the '<em><b>Resource Is Searchable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Is Searchable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Is Searchable</em>' reference.
	 * @see #setResourceIsSearchable(AnnCRUDResource)
	 * @see SearchLayerCIM.SearchLayerCIMPackage#getSearchableResource_ResourceIsSearchable()
	 * @model required="true"
	 * @generated
	 */
	AnnCRUDResource getResourceIsSearchable();

	/**
	 * Sets the value of the '{@link SearchLayerCIM.SearchableResource#getResourceIsSearchable <em>Resource Is Searchable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Is Searchable</em>' reference.
	 * @see #getResourceIsSearchable()
	 * @generated
	 */
	void setResourceIsSearchable(AnnCRUDResource value);

	/**
	 * Returns the value of the '<em><b>Has Searchable Property</b></em>' containment reference list.
	 * The list contents are of type {@link SearchLayerCIM.SearchableProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Searchable Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Searchable Property</em>' containment reference list.
	 * @see SearchLayerCIM.SearchLayerCIMPackage#getSearchableResource_HasSearchableProperty()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SearchableProperty> getHasSearchableProperty();

} // SearchableResource
