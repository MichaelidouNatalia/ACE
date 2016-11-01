/**
 */
package AuthenticationLayerCIM.util;

import AuthenticationLayerCIM.*;

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
 * @see AuthenticationLayerCIM.AuthenticationLayerCIMPackage
 * @generated
 */
public class AuthenticationLayerCIMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AuthenticationLayerCIMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationLayerCIMSwitch() {
		if (modelPackage == null) {
			modelPackage = AuthenticationLayerCIMPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
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
			case AuthenticationLayerCIMPackage.ANNOTATION_MODEL: {
				AnnotationModel annotationModel = (AnnotationModel)theEObject;
				T result = caseAnnotationModel(annotationModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthenticationLayerCIMPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthenticationLayerCIMPackage.ANNOTATED_ELEMENT: {
				AnnotatedElement annotatedElement = (AnnotatedElement)theEObject;
				T result = caseAnnotatedElement(annotatedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthenticationLayerCIMPackage.AUTHENTICATION_MODEL: {
				AuthenticationModel authenticationModel = (AuthenticationModel)theEObject;
				T result = caseAuthenticationModel(authenticationModel);
				if (result == null) result = caseAnnotation(authenticationModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthenticationLayerCIMPackage.AUTHENTICATION_TOKEN: {
				AuthenticationToken authenticationToken = (AuthenticationToken)theEObject;
				T result = caseAuthenticationToken(authenticationToken);
				if (result == null) result = caseAnnotation(authenticationToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthenticationLayerCIMPackage.PASSWORD: {
				Password password = (Password)theEObject;
				T result = casePassword(password);
				if (result == null) result = caseAuthenticationToken(password);
				if (result == null) result = caseAnnotation(password);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthenticationLayerCIMPackage.AUTHENTICATION_MODE: {
				AuthenticationMode authenticationMode = (AuthenticationMode)theEObject;
				T result = caseAuthenticationMode(authenticationMode);
				if (result == null) result = caseAnnotation(authenticationMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthenticationLayerCIMPackage.GUEST_MODE: {
				GuestMode guestMode = (GuestMode)theEObject;
				T result = caseGuestMode(guestMode);
				if (result == null) result = caseAuthenticationMode(guestMode);
				if (result == null) result = caseAnnotation(guestMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthenticationLayerCIMPackage.AUTHENTICATION_ONLY_MODE: {
				AuthenticationOnlyMode authenticationOnlyMode = (AuthenticationOnlyMode)theEObject;
				T result = caseAuthenticationOnlyMode(authenticationOnlyMode);
				if (result == null) result = caseAuthenticationMode(authenticationOnlyMode);
				if (result == null) result = caseAnnotation(authenticationOnlyMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthenticationLayerCIMPackage.BOTH_MODE: {
				BothMode bothMode = (BothMode)theEObject;
				T result = caseBothMode(bothMode);
				if (result == null) result = caseAuthenticationMode(bothMode);
				if (result == null) result = caseAnnotation(bothMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthenticationLayerCIMPackage.ANN_RESOURCE: {
				AnnResource annResource = (AnnResource)theEObject;
				T result = caseAnnResource(annResource);
				if (result == null) result = caseAnnotatedElement(annResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthenticationLayerCIMPackage.ANN_PROPERTY: {
				AnnProperty annProperty = (AnnProperty)theEObject;
				T result = caseAnnProperty(annProperty);
				if (result == null) result = caseAnnotatedElement(annProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthenticationLayerCIMPackage.ANN_CRUD_ACTIVITY: {
				AnnCRUDActivity annCRUDActivity = (AnnCRUDActivity)theEObject;
				T result = caseAnnCRUDActivity(annCRUDActivity);
				if (result == null) result = caseAnnotatedElement(annCRUDActivity);
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
	 * Returns the result of interpreting the object as an instance of '<em>Authentication Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authentication Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthenticationModel(AuthenticationModel object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Ann Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ann Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnResource(AnnResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ann Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ann Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnProperty(AnnProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ann CRUD Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ann CRUD Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnCRUDActivity(AnnCRUDActivity object) {
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

} //AuthenticationLayerCIMSwitch
