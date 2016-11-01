/**
 */
package SearchLayerCIM;

import ServiceCIM.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ann Algo Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SearchLayerCIM.AnnAlgoResource#getAnnotatesAlgoResource <em>Annotates Algo Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see SearchLayerCIM.SearchLayerCIMPackage#getAnnAlgoResource()
 * @model
 * @generated
 */
public interface AnnAlgoResource extends AnnotatedElement {
	/**
	 * Returns the value of the '<em><b>Annotates Algo Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotates Algo Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotates Algo Resource</em>' reference.
	 * @see #setAnnotatesAlgoResource(Resource)
	 * @see SearchLayerCIM.SearchLayerCIMPackage#getAnnAlgoResource_AnnotatesAlgoResource()
	 * @model required="true"
	 * @generated
	 */
	Resource getAnnotatesAlgoResource();

	/**
	 * Sets the value of the '{@link SearchLayerCIM.AnnAlgoResource#getAnnotatesAlgoResource <em>Annotates Algo Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotates Algo Resource</em>' reference.
	 * @see #getAnnotatesAlgoResource()
	 * @generated
	 */
	void setAnnotatesAlgoResource(Resource value);

} // AnnAlgoResource
