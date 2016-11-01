/**
 */
package AuthorizationLayerPSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Allowed Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerPSM.AllowedAction#getIsAllowedAction <em>Is Allowed Action</em>}</li>
 * </ul>
 *
 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getAllowedAction()
 * @model
 * @generated
 */
public interface AllowedAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Allowed Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Allowed Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Allowed Action</em>' reference.
	 * @see #setIsAllowedAction(AnnHTTPActivity)
	 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getAllowedAction_IsAllowedAction()
	 * @model required="true"
	 * @generated
	 */
	AnnHTTPActivity getIsAllowedAction();

	/**
	 * Sets the value of the '{@link AuthorizationLayerPSM.AllowedAction#getIsAllowedAction <em>Is Allowed Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Allowed Action</em>' reference.
	 * @see #getIsAllowedAction()
	 * @generated
	 */
	void setIsAllowedAction(AnnHTTPActivity value);

} // AllowedAction
