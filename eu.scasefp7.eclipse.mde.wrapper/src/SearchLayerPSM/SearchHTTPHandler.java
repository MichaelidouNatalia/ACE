/**
 */
package SearchLayerPSM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Search HTTP Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SearchLayerPSM.SearchHTTPHandler#getIsHTTPActivityHandler <em>Is HTTP Activity Handler</em>}</li>
 *   <li>{@link SearchLayerPSM.SearchHTTPHandler#getSearchesJavaResourceModel <em>Searches Java Resource Model</em>}</li>
 * </ul>
 *
 * @see SearchLayerPSM.SearchLayerPSMPackage#getSearchHTTPHandler()
 * @model
 * @generated
 */
public interface SearchHTTPHandler extends Annotation {
	/**
	 * Returns the value of the '<em><b>Is HTTP Activity Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is HTTP Activity Handler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is HTTP Activity Handler</em>' reference.
	 * @see #setIsHTTPActivityHandler(AnnHTTPActivityHandler)
	 * @see SearchLayerPSM.SearchLayerPSMPackage#getSearchHTTPHandler_IsHTTPActivityHandler()
	 * @model required="true"
	 * @generated
	 */
	AnnHTTPActivityHandler getIsHTTPActivityHandler();

	/**
	 * Sets the value of the '{@link SearchLayerPSM.SearchHTTPHandler#getIsHTTPActivityHandler <em>Is HTTP Activity Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is HTTP Activity Handler</em>' reference.
	 * @see #getIsHTTPActivityHandler()
	 * @generated
	 */
	void setIsHTTPActivityHandler(AnnHTTPActivityHandler value);

	/**
	 * Returns the value of the '<em><b>Searches Java Resource Model</b></em>' containment reference list.
	 * The list contents are of type {@link SearchLayerPSM.SearchableJavaResourceModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Searches Java Resource Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Searches Java Resource Model</em>' containment reference list.
	 * @see SearchLayerPSM.SearchLayerPSMPackage#getSearchHTTPHandler_SearchesJavaResourceModel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SearchableJavaResourceModel> getSearchesJavaResourceModel();

} // SearchHTTPHandler
