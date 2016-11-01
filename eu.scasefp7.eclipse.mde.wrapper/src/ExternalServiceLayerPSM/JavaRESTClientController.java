/**
 */
package ExternalServiceLayerPSM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java REST Client Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ExternalServiceLayerPSM.JavaRESTClientController#getHasJavaRESTClientHTTPActivity <em>Has Java REST Client HTTP Activity</em>}</li>
 *   <li>{@link ExternalServiceLayerPSM.JavaRESTClientController#getIsJavaRESTClientController <em>Is Java REST Client Controller</em>}</li>
 *   <li>{@link ExternalServiceLayerPSM.JavaRESTClientController#getHasAssociatedModel <em>Has Associated Model</em>}</li>
 *   <li>{@link ExternalServiceLayerPSM.JavaRESTClientController#getHasComplexTypes <em>Has Complex Types</em>}</li>
 * </ul>
 *
 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getJavaRESTClientController()
 * @model
 * @generated
 */
public interface JavaRESTClientController extends Annotation {
	/**
	 * Returns the value of the '<em><b>Has Java REST Client HTTP Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Java REST Client HTTP Activity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Java REST Client HTTP Activity</em>' containment reference.
	 * @see #setHasJavaRESTClientHTTPActivity(JavaRESTClientHTTPActivity)
	 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getJavaRESTClientController_HasJavaRESTClientHTTPActivity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	JavaRESTClientHTTPActivity getHasJavaRESTClientHTTPActivity();

	/**
	 * Sets the value of the '{@link ExternalServiceLayerPSM.JavaRESTClientController#getHasJavaRESTClientHTTPActivity <em>Has Java REST Client HTTP Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Java REST Client HTTP Activity</em>' containment reference.
	 * @see #getHasJavaRESTClientHTTPActivity()
	 * @generated
	 */
	void setHasJavaRESTClientHTTPActivity(JavaRESTClientHTTPActivity value);

	/**
	 * Returns the value of the '<em><b>Is Java REST Client Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Java REST Client Controller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Java REST Client Controller</em>' reference.
	 * @see #setIsJavaRESTClientController(AnnJavaAlgoController)
	 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getJavaRESTClientController_IsJavaRESTClientController()
	 * @model required="true"
	 * @generated
	 */
	AnnJavaAlgoController getIsJavaRESTClientController();

	/**
	 * Sets the value of the '{@link ExternalServiceLayerPSM.JavaRESTClientController#getIsJavaRESTClientController <em>Is Java REST Client Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Java REST Client Controller</em>' reference.
	 * @see #getIsJavaRESTClientController()
	 * @generated
	 */
	void setIsJavaRESTClientController(AnnJavaAlgoController value);

	/**
	 * Returns the value of the '<em><b>Has Associated Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Associated Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Associated Model</em>' reference.
	 * @see #setHasAssociatedModel(JavaRESTClientModel)
	 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getJavaRESTClientController_HasAssociatedModel()
	 * @model required="true"
	 * @generated
	 */
	JavaRESTClientModel getHasAssociatedModel();

	/**
	 * Sets the value of the '{@link ExternalServiceLayerPSM.JavaRESTClientController#getHasAssociatedModel <em>Has Associated Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Associated Model</em>' reference.
	 * @see #getHasAssociatedModel()
	 * @generated
	 */
	void setHasAssociatedModel(JavaRESTClientModel value);

	/**
	 * Returns the value of the '<em><b>Has Complex Types</b></em>' containment reference list.
	 * The list contents are of type {@link ExternalServiceLayerPSM.ComplexType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Complex Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Complex Types</em>' containment reference list.
	 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getJavaRESTClientController_HasComplexTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComplexType> getHasComplexTypes();

} // JavaRESTClientController
