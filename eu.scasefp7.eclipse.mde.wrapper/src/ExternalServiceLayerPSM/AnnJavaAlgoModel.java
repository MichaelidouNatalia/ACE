/**
 */
package ExternalServiceLayerPSM;

import RESTfulServicePSM.JavaAlgoResourceModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ann Java Algo Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ExternalServiceLayerPSM.AnnJavaAlgoModel#getAnnotatesJavaAlgoModel <em>Annotates Java Algo Model</em>}</li>
 * </ul>
 *
 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getAnnJavaAlgoModel()
 * @model
 * @generated
 */
public interface AnnJavaAlgoModel extends AnnotatedElement {
	/**
	 * Returns the value of the '<em><b>Annotates Java Algo Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotates Java Algo Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotates Java Algo Model</em>' reference.
	 * @see #setAnnotatesJavaAlgoModel(JavaAlgoResourceModel)
	 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#getAnnJavaAlgoModel_AnnotatesJavaAlgoModel()
	 * @model required="true"
	 * @generated
	 */
	JavaAlgoResourceModel getAnnotatesJavaAlgoModel();

	/**
	 * Sets the value of the '{@link ExternalServiceLayerPSM.AnnJavaAlgoModel#getAnnotatesJavaAlgoModel <em>Annotates Java Algo Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotates Java Algo Model</em>' reference.
	 * @see #getAnnotatesJavaAlgoModel()
	 * @generated
	 */
	void setAnnotatesJavaAlgoModel(JavaAlgoResourceModel value);

} // AnnJavaAlgoModel
