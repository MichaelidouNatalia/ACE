/**
 */
package SearchLayerCIM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Search Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SearchLayerCIM.SearchResource#getAlgoResourceIsSearchResource <em>Algo Resource Is Search Resource</em>}</li>
 *   <li>{@link SearchLayerCIM.SearchResource#getSearchesResource <em>Searches Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see SearchLayerCIM.SearchLayerCIMPackage#getSearchResource()
 * @model
 * @generated
 */
public interface SearchResource extends Annotation {
	/**
	 * Returns the value of the '<em><b>Algo Resource Is Search Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algo Resource Is Search Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algo Resource Is Search Resource</em>' reference.
	 * @see #setAlgoResourceIsSearchResource(AnnAlgoResource)
	 * @see SearchLayerCIM.SearchLayerCIMPackage#getSearchResource_AlgoResourceIsSearchResource()
	 * @model required="true"
	 * @generated
	 */
	AnnAlgoResource getAlgoResourceIsSearchResource();

	/**
	 * Sets the value of the '{@link SearchLayerCIM.SearchResource#getAlgoResourceIsSearchResource <em>Algo Resource Is Search Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algo Resource Is Search Resource</em>' reference.
	 * @see #getAlgoResourceIsSearchResource()
	 * @generated
	 */
	void setAlgoResourceIsSearchResource(AnnAlgoResource value);

	/**
	 * Returns the value of the '<em><b>Searches Resource</b></em>' containment reference list.
	 * The list contents are of type {@link SearchLayerCIM.SearchableResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Searches Resource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Searches Resource</em>' containment reference list.
	 * @see SearchLayerCIM.SearchLayerCIMPackage#getSearchResource_SearchesResource()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SearchableResource> getSearchesResource();

} // SearchResource
