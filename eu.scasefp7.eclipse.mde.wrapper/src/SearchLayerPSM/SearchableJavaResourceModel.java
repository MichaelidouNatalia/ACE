/**
 */
package SearchLayerPSM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Searchable Java Resource Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SearchLayerPSM.SearchableJavaResourceModel#getHasSearchableProperty <em>Has Searchable Property</em>}</li>
 *   <li>{@link SearchLayerPSM.SearchableJavaResourceModel#getIsSearchableJavaResourceModel <em>Is Searchable Java Resource Model</em>}</li>
 * </ul>
 *
 * @see SearchLayerPSM.SearchLayerPSMPackage#getSearchableJavaResourceModel()
 * @model
 * @generated
 */
public interface SearchableJavaResourceModel extends Annotation {
	/**
	 * Returns the value of the '<em><b>Has Searchable Property</b></em>' containment reference list.
	 * The list contents are of type {@link SearchLayerPSM.SearchableProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Searchable Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Searchable Property</em>' containment reference list.
	 * @see SearchLayerPSM.SearchLayerPSMPackage#getSearchableJavaResourceModel_HasSearchableProperty()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SearchableProperty> getHasSearchableProperty();

	/**
	 * Returns the value of the '<em><b>Is Searchable Java Resource Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Searchable Java Resource Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Searchable Java Resource Model</em>' reference.
	 * @see #setIsSearchableJavaResourceModel(AnnJavaResourceModel)
	 * @see SearchLayerPSM.SearchLayerPSMPackage#getSearchableJavaResourceModel_IsSearchableJavaResourceModel()
	 * @model required="true"
	 * @generated
	 */
	AnnJavaResourceModel getIsSearchableJavaResourceModel();

	/**
	 * Sets the value of the '{@link SearchLayerPSM.SearchableJavaResourceModel#getIsSearchableJavaResourceModel <em>Is Searchable Java Resource Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Searchable Java Resource Model</em>' reference.
	 * @see #getIsSearchableJavaResourceModel()
	 * @generated
	 */
	void setIsSearchableJavaResourceModel(AnnJavaResourceModel value);

} // SearchableJavaResourceModel
