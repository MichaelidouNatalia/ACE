/**
 */
package ExternalServiceLayerPSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java REST Client Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ExternalServiceLayerPSM.JavaRESTClientModel#getHasJavaInputModel <em>Has Java Input Model</em>}</li>
 *   <li>{@link ExternalServiceLayerPSM.JavaRESTClientModel#getHasJavaOutputModel <em>Has Java Output Model</em>}</li>
 *   <li>{@link ExternalServiceLayerPSM.JavaRESTClientModel#getIsJavaRESTClientModel <em>Is Java REST Client Model</em>}</li>
 * </ul>
 *
 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getJavaRESTClientModel()
 * @model
 * @generated
 */
public interface JavaRESTClientModel extends Annotation {
	/**
	 * Returns the value of the '<em><b>Has Java Input Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Java Input Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Java Input Model</em>' containment reference.
	 * @see #setHasJavaInputModel(JavaInputDataModel)
	 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getJavaRESTClientModel_HasJavaInputModel()
	 * @model containment="true"
	 * @generated
	 */
	JavaInputDataModel getHasJavaInputModel();

	/**
	 * Sets the value of the '{@link ExternalServiceLayerPSM.JavaRESTClientModel#getHasJavaInputModel <em>Has Java Input Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Java Input Model</em>' containment reference.
	 * @see #getHasJavaInputModel()
	 * @generated
	 */
	void setHasJavaInputModel(JavaInputDataModel value);

	/**
	 * Returns the value of the '<em><b>Has Java Output Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Java Output Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Java Output Model</em>' containment reference.
	 * @see #setHasJavaOutputModel(JavaOutputDataModel)
	 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getJavaRESTClientModel_HasJavaOutputModel()
	 * @model containment="true"
	 * @generated
	 */
	JavaOutputDataModel getHasJavaOutputModel();

	/**
	 * Sets the value of the '{@link ExternalServiceLayerPSM.JavaRESTClientModel#getHasJavaOutputModel <em>Has Java Output Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Java Output Model</em>' containment reference.
	 * @see #getHasJavaOutputModel()
	 * @generated
	 */
	void setHasJavaOutputModel(JavaOutputDataModel value);

	/**
	 * Returns the value of the '<em><b>Is Java REST Client Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Java REST Client Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Java REST Client Model</em>' reference.
	 * @see #setIsJavaRESTClientModel(AnnJavaAlgoModel)
	 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getJavaRESTClientModel_IsJavaRESTClientModel()
	 * @model required="true"
	 * @generated
	 */
	AnnJavaAlgoModel getIsJavaRESTClientModel();

	/**
	 * Sets the value of the '{@link ExternalServiceLayerPSM.JavaRESTClientModel#getIsJavaRESTClientModel <em>Is Java REST Client Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Java REST Client Model</em>' reference.
	 * @see #getIsJavaRESTClientModel()
	 * @generated
	 */
	void setIsJavaRESTClientModel(AnnJavaAlgoModel value);

} // JavaRESTClientModel
