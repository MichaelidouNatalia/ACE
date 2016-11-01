/**
 */
package AuthorizationLayerPSM.impl;

import AuthorizationLayerPSM.AnnJavaResourceModel;
import AuthorizationLayerPSM.AuthorizationLayerPSMPackage;
import AuthorizationLayerPSM.AuthorizationSubject;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authorization Subject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link AuthorizationLayerPSM.impl.AuthorizationSubjectImpl#getIsAuthorizationSubject <em>Is Authorization Subject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuthorizationSubjectImpl extends AnnotationImpl implements AuthorizationSubject {
	/**
	 * The cached value of the '{@link #getIsAuthorizationSubject() <em>Is Authorization Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAuthorizationSubject()
	 * @generated
	 * @ordered
	 */
	protected AnnJavaResourceModel isAuthorizationSubject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorizationSubjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AuthorizationLayerPSMPackage.Literals.AUTHORIZATION_SUBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnJavaResourceModel getIsAuthorizationSubject() {
		if (isAuthorizationSubject != null && isAuthorizationSubject.eIsProxy()) {
			InternalEObject oldIsAuthorizationSubject = (InternalEObject)isAuthorizationSubject;
			isAuthorizationSubject = (AnnJavaResourceModel)eResolveProxy(oldIsAuthorizationSubject);
			if (isAuthorizationSubject != oldIsAuthorizationSubject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AuthorizationLayerPSMPackage.AUTHORIZATION_SUBJECT__IS_AUTHORIZATION_SUBJECT, oldIsAuthorizationSubject, isAuthorizationSubject));
			}
		}
		return isAuthorizationSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnJavaResourceModel basicGetIsAuthorizationSubject() {
		return isAuthorizationSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAuthorizationSubject(AnnJavaResourceModel newIsAuthorizationSubject) {
		AnnJavaResourceModel oldIsAuthorizationSubject = isAuthorizationSubject;
		isAuthorizationSubject = newIsAuthorizationSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AuthorizationLayerPSMPackage.AUTHORIZATION_SUBJECT__IS_AUTHORIZATION_SUBJECT, oldIsAuthorizationSubject, isAuthorizationSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AuthorizationLayerPSMPackage.AUTHORIZATION_SUBJECT__IS_AUTHORIZATION_SUBJECT:
				if (resolve) return getIsAuthorizationSubject();
				return basicGetIsAuthorizationSubject();
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
			case AuthorizationLayerPSMPackage.AUTHORIZATION_SUBJECT__IS_AUTHORIZATION_SUBJECT:
				setIsAuthorizationSubject((AnnJavaResourceModel)newValue);
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
			case AuthorizationLayerPSMPackage.AUTHORIZATION_SUBJECT__IS_AUTHORIZATION_SUBJECT:
				setIsAuthorizationSubject((AnnJavaResourceModel)null);
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
			case AuthorizationLayerPSMPackage.AUTHORIZATION_SUBJECT__IS_AUTHORIZATION_SUBJECT:
				return isAuthorizationSubject != null;
		}
		return super.eIsSet(featureID);
	}

} //AuthorizationSubjectImpl
