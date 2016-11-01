/**
 */
package ExternalServiceLayerCIM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>REST Client Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ExternalServiceLayerCIM.RESTClientResource#getTargetsService <em>Targets Service</em>}</li>
 *   <li>{@link ExternalServiceLayerCIM.RESTClientResource#getIsRESTClientResource <em>Is REST Client Resource</em>}</li>
 *   <li>{@link ExternalServiceLayerCIM.RESTClientResource#getHasPathParam <em>Has Path Param</em>}</li>
 *   <li>{@link ExternalServiceLayerCIM.RESTClientResource#getIsRESTClientComplexType <em>Is REST Client Complex Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage#getRESTClientResource()
 * @model
 * @generated
 */
public interface RESTClientResource extends Annotation {
	/**
	 * Returns the value of the '<em><b>Targets Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Targets Service</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets Service</em>' containment reference.
	 * @see #setTargetsService(TargetRESTService)
	 * @see ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage#getRESTClientResource_TargetsService()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TargetRESTService getTargetsService();

	/**
	 * Sets the value of the '{@link ExternalServiceLayerCIM.RESTClientResource#getTargetsService <em>Targets Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Targets Service</em>' containment reference.
	 * @see #getTargetsService()
	 * @generated
	 */
	void setTargetsService(TargetRESTService value);

	/**
	 * Returns the value of the '<em><b>Is REST Client Resource</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is REST Client Resource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is REST Client Resource</em>' reference.
	 * @see #setIsRESTClientResource(AnnAlgoResource)
	 * @see ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage#getRESTClientResource_IsRESTClientResource()
	 * @model required="true"
	 * @generated
	 */
	AnnAlgoResource getIsRESTClientResource();

	/**
	 * Sets the value of the '{@link ExternalServiceLayerCIM.RESTClientResource#getIsRESTClientResource <em>Is REST Client Resource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is REST Client Resource</em>' reference.
	 * @see #getIsRESTClientResource()
	 * @generated
	 */
	void setIsRESTClientResource(AnnAlgoResource value);

	/**
	 * Returns the value of the '<em><b>Has Path Param</b></em>' containment reference list.
	 * The list contents are of type {@link ExternalServiceLayerCIM.PathParam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Path Param</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Path Param</em>' containment reference list.
	 * @see ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage#getRESTClientResource_HasPathParam()
	 * @model containment="true"
	 * @generated
	 */
	EList<PathParam> getHasPathParam();

	/**
	 * Returns the value of the '<em><b>Is REST Client Complex Type</b></em>' containment reference list.
	 * The list contents are of type {@link ExternalServiceLayerCIM.ComplexType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is REST Client Complex Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is REST Client Complex Type</em>' containment reference list.
	 * @see ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage#getRESTClientResource_IsRESTClientComplexType()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComplexType> getIsRESTClientComplexType();

} // RESTClientResource
