/**
 */
package ExternalServiceLayerCIM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target REST Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ExternalServiceLayerCIM.TargetRESTService#getHasQueryParam <em>Has Query Param</em>}</li>
 *   <li>{@link ExternalServiceLayerCIM.TargetRESTService#getHasInputDataModel <em>Has Input Data Model</em>}</li>
 *   <li>{@link ExternalServiceLayerCIM.TargetRESTService#getHasOutputDataModel <em>Has Output Data Model</em>}</li>
 *   <li>{@link ExternalServiceLayerCIM.TargetRESTService#getTargetURL <em>Target URL</em>}</li>
 *   <li>{@link ExternalServiceLayerCIM.TargetRESTService#getCRUDVerb <em>CRUD Verb</em>}</li>
 * </ul>
 * </p>
 *
 * @see ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage#getTargetRESTService()
 * @model
 * @generated
 */
public interface TargetRESTService extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Query Param</b></em>' containment reference list.
	 * The list contents are of type {@link ExternalServiceLayerCIM.QueryParam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Query Param</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Query Param</em>' containment reference list.
	 * @see ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage#getTargetRESTService_HasQueryParam()
	 * @model containment="true"
	 * @generated
	 */
	EList<QueryParam> getHasQueryParam();

	/**
	 * Returns the value of the '<em><b>Has Input Data Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Input Data Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Input Data Model</em>' containment reference.
	 * @see #setHasInputDataModel(InputDataModel)
	 * @see ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage#getTargetRESTService_HasInputDataModel()
	 * @model containment="true"
	 * @generated
	 */
	InputDataModel getHasInputDataModel();

	/**
	 * Sets the value of the '{@link ExternalServiceLayerCIM.TargetRESTService#getHasInputDataModel <em>Has Input Data Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Input Data Model</em>' containment reference.
	 * @see #getHasInputDataModel()
	 * @generated
	 */
	void setHasInputDataModel(InputDataModel value);

	/**
	 * Returns the value of the '<em><b>Has Output Data Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Output Data Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Output Data Model</em>' containment reference.
	 * @see #setHasOutputDataModel(OutputDataModel)
	 * @see ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage#getTargetRESTService_HasOutputDataModel()
	 * @model containment="true"
	 * @generated
	 */
	OutputDataModel getHasOutputDataModel();

	/**
	 * Sets the value of the '{@link ExternalServiceLayerCIM.TargetRESTService#getHasOutputDataModel <em>Has Output Data Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Output Data Model</em>' containment reference.
	 * @see #getHasOutputDataModel()
	 * @generated
	 */
	void setHasOutputDataModel(OutputDataModel value);

	/**
	 * Returns the value of the '<em><b>Target URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target URL</em>' attribute.
	 * @see #setTargetURL(String)
	 * @see ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage#getTargetRESTService_TargetURL()
	 * @model required="true"
	 * @generated
	 */
	String getTargetURL();

	/**
	 * Sets the value of the '{@link ExternalServiceLayerCIM.TargetRESTService#getTargetURL <em>Target URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target URL</em>' attribute.
	 * @see #getTargetURL()
	 * @generated
	 */
	void setTargetURL(String value);

	/**
	 * Returns the value of the '<em><b>CRUD Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CRUD Verb</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CRUD Verb</em>' attribute.
	 * @see #setCRUDVerb(String)
	 * @see ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage#getTargetRESTService_CRUDVerb()
	 * @model required="true"
	 * @generated
	 */
	String getCRUDVerb();

	/**
	 * Sets the value of the '{@link ExternalServiceLayerCIM.TargetRESTService#getCRUDVerb <em>CRUD Verb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CRUD Verb</em>' attribute.
	 * @see #getCRUDVerb()
	 * @generated
	 */
	void setCRUDVerb(String value);

} // TargetRESTService
