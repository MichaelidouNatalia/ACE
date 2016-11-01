/**
 */
package AuthorizationLayerPSM.impl;

import AuthorizationLayerPSM.Attribute;
import AuthorizationLayerPSM.AuthorizationLayerPSMPackage;
import AuthorizationLayerPSM.Condition;
import AuthorizationLayerPSM.Operator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerPSM.impl.ConditionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.impl.ConditionImpl#getHasLeftSideOperand <em>Has Left Side Operand</em>}</li>
 *   <li>{@link AuthorizationLayerPSM.impl.ConditionImpl#getHasRightSideOperand <em>Has Right Side Operand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends MinimalEObjectImpl.Container implements Condition {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final Operator OPERATOR_EDEFAULT = Operator.UNDEFINED;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected Operator operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasLeftSideOperand() <em>Has Left Side Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasLeftSideOperand()
	 * @generated
	 * @ordered
	 */
	protected Attribute hasLeftSideOperand;

	/**
	 * The cached value of the '{@link #getHasRightSideOperand() <em>Has Right Side Operand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRightSideOperand()
	 * @generated
	 * @ordered
	 */
	protected Attribute hasRightSideOperand;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AuthorizationLayerPSMPackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(Operator newOperator) {
		Operator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerPSMPackage.CONDITION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getHasLeftSideOperand() {
		return hasLeftSideOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasLeftSideOperand(Attribute newHasLeftSideOperand, NotificationChain msgs) {
		Attribute oldHasLeftSideOperand = hasLeftSideOperand;
		hasLeftSideOperand = newHasLeftSideOperand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AuthorizationLayerPSMPackage.CONDITION__HAS_LEFT_SIDE_OPERAND, oldHasLeftSideOperand, newHasLeftSideOperand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasLeftSideOperand(Attribute newHasLeftSideOperand) {
		if (newHasLeftSideOperand != hasLeftSideOperand) {
			NotificationChain msgs = null;
			if (hasLeftSideOperand != null)
				msgs = ((InternalEObject)hasLeftSideOperand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AuthorizationLayerPSMPackage.CONDITION__HAS_LEFT_SIDE_OPERAND, null, msgs);
			if (newHasLeftSideOperand != null)
				msgs = ((InternalEObject)newHasLeftSideOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AuthorizationLayerPSMPackage.CONDITION__HAS_LEFT_SIDE_OPERAND, null, msgs);
			msgs = basicSetHasLeftSideOperand(newHasLeftSideOperand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerPSMPackage.CONDITION__HAS_LEFT_SIDE_OPERAND, newHasLeftSideOperand, newHasLeftSideOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getHasRightSideOperand() {
		return hasRightSideOperand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasRightSideOperand(Attribute newHasRightSideOperand, NotificationChain msgs) {
		Attribute oldHasRightSideOperand = hasRightSideOperand;
		hasRightSideOperand = newHasRightSideOperand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AuthorizationLayerPSMPackage.CONDITION__HAS_RIGHT_SIDE_OPERAND, oldHasRightSideOperand, newHasRightSideOperand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasRightSideOperand(Attribute newHasRightSideOperand) {
		if (newHasRightSideOperand != hasRightSideOperand) {
			NotificationChain msgs = null;
			if (hasRightSideOperand != null)
				msgs = ((InternalEObject)hasRightSideOperand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AuthorizationLayerPSMPackage.CONDITION__HAS_RIGHT_SIDE_OPERAND, null, msgs);
			if (newHasRightSideOperand != null)
				msgs = ((InternalEObject)newHasRightSideOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AuthorizationLayerPSMPackage.CONDITION__HAS_RIGHT_SIDE_OPERAND, null, msgs);
			msgs = basicSetHasRightSideOperand(newHasRightSideOperand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerPSMPackage.CONDITION__HAS_RIGHT_SIDE_OPERAND, newHasRightSideOperand, newHasRightSideOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AuthorizationLayerPSMPackage.CONDITION__HAS_LEFT_SIDE_OPERAND:
				return basicSetHasLeftSideOperand(null, msgs);
			case AuthorizationLayerPSMPackage.CONDITION__HAS_RIGHT_SIDE_OPERAND:
				return basicSetHasRightSideOperand(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AuthorizationLayerPSMPackage.CONDITION__OPERATOR:
				return getOperator();
			case AuthorizationLayerPSMPackage.CONDITION__HAS_LEFT_SIDE_OPERAND:
				return getHasLeftSideOperand();
			case AuthorizationLayerPSMPackage.CONDITION__HAS_RIGHT_SIDE_OPERAND:
				return getHasRightSideOperand();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AuthorizationLayerPSMPackage.CONDITION__OPERATOR:
				setOperator((Operator)newValue);
				return;
			case AuthorizationLayerPSMPackage.CONDITION__HAS_LEFT_SIDE_OPERAND:
				setHasLeftSideOperand((Attribute)newValue);
				return;
			case AuthorizationLayerPSMPackage.CONDITION__HAS_RIGHT_SIDE_OPERAND:
				setHasRightSideOperand((Attribute)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AuthorizationLayerPSMPackage.CONDITION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case AuthorizationLayerPSMPackage.CONDITION__HAS_LEFT_SIDE_OPERAND:
				setHasLeftSideOperand((Attribute)null);
				return;
			case AuthorizationLayerPSMPackage.CONDITION__HAS_RIGHT_SIDE_OPERAND:
				setHasRightSideOperand((Attribute)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AuthorizationLayerPSMPackage.CONDITION__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
			case AuthorizationLayerPSMPackage.CONDITION__HAS_LEFT_SIDE_OPERAND:
				return hasLeftSideOperand != null;
			case AuthorizationLayerPSMPackage.CONDITION__HAS_RIGHT_SIDE_OPERAND:
				return hasRightSideOperand != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //ConditionImpl
