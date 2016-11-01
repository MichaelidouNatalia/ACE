/**
 */
package AuthorizationLayerCIM;

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
 *   <li>{@link AuthorizationLayerCIM.AllowedAction#getIsAllowedAction <em>Is Allowed Action</em>}</li>
 * </ul>
 *
 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getAllowedAction()
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
	 * @see #setIsAllowedAction(AnnCRUDActivity)
	 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#getAllowedAction_IsAllowedAction()
	 * @model required="true"
	 * @generated
	 */
	AnnCRUDActivity getIsAllowedAction();

	/**
	 * Sets the value of the '{@link AuthorizationLayerCIM.AllowedAction#getIsAllowedAction <em>Is Allowed Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Allowed Action</em>' reference.
	 * @see #getIsAllowedAction()
	 * @generated
	 */
	void setIsAllowedAction(AnnCRUDActivity value);

} // AllowedAction
