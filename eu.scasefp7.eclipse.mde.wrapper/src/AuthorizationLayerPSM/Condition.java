/**
 */
package AuthorizationLayerPSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerPSM.Condition#getOperator <em>Operator</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.Condition#getHasLeftSideOperand <em>Has Left Side Operand</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.Condition#getHasRightSideOperand <em>Has Right Side Operand</em>}</li>
 * </ul>
 *
 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The default value is <code>"UNDEFINED"</code>.
	 * The literals are from the enumeration {@link AuthorizationLayerPSM.Operator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see AuthorizationLayerPSM.Operator
	 * @see #setOperator(Operator)
	 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getCondition_Operator()
	 * @model default="UNDEFINED" required="true"
	 * @generated
	 */
	Operator getOperator();

	/**
	 * Sets the value of the '{@link AuthorizationLayerPSM.Condition#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see AuthorizationLayerPSM.Operator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(Operator value);

	/**
	 * Returns the value of the '<em><b>Has Left Side Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Left Side Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Left Side Operand</em>' containment reference.
	 * @see #setHasLeftSideOperand(Attribute)
	 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getCondition_HasLeftSideOperand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Attribute getHasLeftSideOperand();

	/**
	 * Sets the value of the '{@link AuthorizationLayerPSM.Condition#getHasLeftSideOperand <em>Has Left Side Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Left Side Operand</em>' containment reference.
	 * @see #getHasLeftSideOperand()
	 * @generated
	 */
	void setHasLeftSideOperand(Attribute value);

	/**
	 * Returns the value of the '<em><b>Has Right Side Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Right Side Operand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Right Side Operand</em>' containment reference.
	 * @see #setHasRightSideOperand(Attribute)
	 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#getCondition_HasRightSideOperand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Attribute getHasRightSideOperand();

	/**
	 * Sets the value of the '{@link AuthorizationLayerPSM.Condition#getHasRightSideOperand <em>Has Right Side Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Right Side Operand</em>' containment reference.
	 * @see #getHasRightSideOperand()
	 * @generated
	 */
	void setHasRightSideOperand(Attribute value);

} // Condition
