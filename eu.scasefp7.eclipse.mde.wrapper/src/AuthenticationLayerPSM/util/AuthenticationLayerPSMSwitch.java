/**
 */
package AuthenticationLayerPSM.util;

import AuthenticationLayerPSM.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see AuthenticationLayerPSM.AuthenticationLayerPSMPackage
 * @generated
 */
public class AuthenticationLayerPSMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AuthenticationLayerPSMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationLayerPSMSwitch() {
		if (modelPackage == null) {
			modelPackage = AuthenticationLayerPSMPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AuthenticationLayerPSMPackage.ANNOTATION_MODEL: {
				AnnotationModel annotationModel = (AnnotationModel)theEObject;
				T result = caseAnnotationModel(annotationModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthenticationLayerPSMPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthenticationLayerPSMPackage.ANNOTATED_ELEMENT: {
				AnnotatedElement annotatedElement = (AnnotatedElement)theEObject;
				T result = caseAnnotatedElement(annotatedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthenticationLayerPSMPackage.AUTHENTICATION_MODE: {
				AuthenticationMode authenticationMode = (AuthenticationMode)theEObject;
				T result = caseAuthenticationMode(authenticationMode);
				if (result == null) result = caseAnnotation(authenticationMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthenticationLayerPSMPackage.AUTHENTICATION_PERFORMER: {
				AuthenticationPerformer authenticationPerformer = (AuthenticationPerformer)theEObject;
				T result = caseAuthenticationPerformer(authenticationPerformer);
				if (result == null) result = caseAnnotation(authenticationPerformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthenticationLayerPSMPackage.AUTHENTICATION_TOKEN: {
				AuthenticationToken authenticationToken = (AuthenticationToken)theEObject;
				T result = caseAuthenticationToken(authenticationToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthenticationLayerPSMPackage.PASSWORD: {
				Password password = (Password)theEObject;
				T result = casePassword(password);
				if (result == null) result = caseAuthenticationToken(password);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthenticationLayerPSMPackage.ANN_HTTP_ACTIVITY: {
				AnnHTTPActivity annHTTPActivity = (AnnHTTPActivity)theEObject;
				T result = caseAnnHTTPActivity(annHTTPActivity);
				if (result == null) result = caseAnnotatedElement(annHTTPActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthenticationLayerPSMPackage.ANN_HTTP_ACTIVITY_HANDLER: {
				AnnHTTPActivityHandler annHTTPActivityHandler = (AnnHTTPActivityHandler)theEObject;
				T result = caseAnnHTTPActivityHandler(annHTTPActivityHandler);
				if (result == null) result = caseAnnotatedElement(annHTTPActivityHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthenticationLayerPSMPackage.ANN_JPA_CONTROLLER: {
				AnnJPAController annJPAController = (AnnJPAController)theEObject;
				T result = caseAnnJPAController(annJPAController);
				if (result == null) result = caseAnnotatedElement(annJPAController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthenticationLayerPSMPackage.GUEST_MODE: {
				GuestMode guestMode = (GuestMode)theEObject;
				T result = caseGuestMode(guestMode);
				if (result == null) result = caseAuthenticationMode(guestMode);
				if (result == null) result = caseAnnotation(guestMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthenticationLayerPSMPackage.AUTHENTICATION_ONLY_MODE: {
				AuthenticationOnlyMode authenticationOnlyMode = (AuthenticationOnlyMode)theEObject;
				T result = caseAuthenticationOnlyMode(authenticationOnlyMode);
				if (result == null) result = caseAuthenticationMode(authenticationOnlyMode);
				if (result == null) result = caseAnnotation(authenticationOnlyMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthenticationLayerPSMPackage.BOTH_MODE: {
				BothMode bothMode = (BothMode)theEObject;
				T result = caseBothMode(bothMode);
				if (result == null) result = caseAuthenticationMode(bothMode);
				if (result == null) result = caseAnnotation(bothMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationModel(AnnotationModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotated Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotated Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotatedElement(AnnotatedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authentication Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authentication Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthenticationMode(AuthenticationMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authentication Performer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authentication Performer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthenticationPerformer(AuthenticationPerformer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authentication Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authentication Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthenticationToken(AuthenticationToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Password</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Password</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassword(Password object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ann HTTP Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ann HTTP Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnHTTPActivity(AnnHTTPActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ann HTTP Activity Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ann HTTP Activity Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnHTTPActivityHandler(AnnHTTPActivityHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ann JPA Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ann JPA Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnJPAController(AnnJPAController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guest Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guest Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuestMode(GuestMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authentication Only Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authentication Only Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthenticationOnlyMode(AuthenticationOnlyMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Both Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Both Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBothMode(BothMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AuthenticationLayerPSMSwitch
