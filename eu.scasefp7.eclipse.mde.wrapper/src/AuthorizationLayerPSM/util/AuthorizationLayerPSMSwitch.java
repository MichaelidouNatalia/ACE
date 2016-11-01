/**
 */
package AuthorizationLayerPSM.util;

import AuthorizationLayerPSM.*;

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
 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage
 * @generated
 */
public class AuthorizationLayerPSMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AuthorizationLayerPSMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationLayerPSMSwitch() {
		if (modelPackage == null) {
			modelPackage = AuthorizationLayerPSMPackage.eINSTANCE;
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
			case AuthorizationLayerPSMPackage.ANNOTATION_MODEL: {
				AnnotationModel annotationModel = (AnnotationModel)theEObject;
				T result = caseAnnotationModel(annotationModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthorizationLayerPSMPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthorizationLayerPSMPackage.ANNOTATED_ELEMENT: {
				AnnotatedElement annotatedElement = (AnnotatedElement)theEObject;
				T result = caseAnnotatedElement(annotatedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthorizationLayerPSMPackage.ANN_HTTP_ACTIVITY: {
				AnnHTTPActivity annHTTPActivity = (AnnHTTPActivity)theEObject;
				T result = caseAnnHTTPActivity(annHTTPActivity);
				if (result == null) result = caseAnnotatedElement(annHTTPActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthorizationLayerPSMPackage.ANN_PSM_COMPONENT_PROPERTY: {
				AnnPSMComponentProperty annPSMComponentProperty = (AnnPSMComponentProperty)theEObject;
				T result = caseAnnPSMComponentProperty(annPSMComponentProperty);
				if (result == null) result = caseAnnotatedElement(annPSMComponentProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthorizationLayerPSMPackage.ANN_JPA_CONTROLLER: {
				AnnJPAController annJPAController = (AnnJPAController)theEObject;
				T result = caseAnnJPAController(annJPAController);
				if (result == null) result = caseAnnotatedElement(annJPAController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthorizationLayerPSMPackage.ANN_HTTP_ACTIVITY_HANDLER: {
				AnnHTTPActivityHandler annHTTPActivityHandler = (AnnHTTPActivityHandler)theEObject;
				T result = caseAnnHTTPActivityHandler(annHTTPActivityHandler);
				if (result == null) result = caseAnnotatedElement(annHTTPActivityHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthorizationLayerPSMPackage.ANN_JAVA_RESOURCE_MODEL: {
				AnnJavaResourceModel annJavaResourceModel = (AnnJavaResourceModel)theEObject;
				T result = caseAnnJavaResourceModel(annJavaResourceModel);
				if (result == null) result = caseAnnotatedElement(annJavaResourceModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthorizationLayerPSMPackage.ANN_JAVA_RESOURCE_MODEL_MANAGER: {
				AnnJavaResourceModelManager annJavaResourceModelManager = (AnnJavaResourceModelManager)theEObject;
				T result = caseAnnJavaResourceModelManager(annJavaResourceModelManager);
				if (result == null) result = caseAnnotatedElement(annJavaResourceModelManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthorizationLayerPSMPackage.ANN_JAVA_ALGO_RESOURCE_MODEL: {
				AnnJavaAlgoResourceModel annJavaAlgoResourceModel = (AnnJavaAlgoResourceModel)theEObject;
				T result = caseAnnJavaAlgoResourceModel(annJavaAlgoResourceModel);
				if (result == null) result = caseAnnotatedElement(annJavaAlgoResourceModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthorizationLayerPSMPackage.AUTHORIZATION_SUBJECT: {
				AuthorizationSubject authorizationSubject = (AuthorizationSubject)theEObject;
				T result = caseAuthorizationSubject(authorizationSubject);
				if (result == null) result = caseAnnotation(authorizationSubject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE: {
				AuthorizableResource authorizableResource = (AuthorizableResource)theEObject;
				T result = caseAuthorizableResource(authorizableResource);
				if (result == null) result = caseAnnotation(authorizableResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthorizationLayerPSMPackage.AUTHORIZATION_PERFORMER: {
				AuthorizationPerformer authorizationPerformer = (AuthorizationPerformer)theEObject;
				T result = caseAuthorizationPerformer(authorizationPerformer);
				if (result == null) result = caseAnnotation(authorizationPerformer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthorizationLayerPSMPackage.AUTHORIZATION_DATA_HANDLER: {
				AuthorizationDataHandler authorizationDataHandler = (AuthorizationDataHandler)theEObject;
				T result = caseAuthorizationDataHandler(authorizationDataHandler);
				if (result == null) result = caseAnnotation(authorizationDataHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthorizationLayerPSMPackage.AUTHORIZATION_POLICY_EVALUATOR: {
				AuthorizationPolicyEvaluator authorizationPolicyEvaluator = (AuthorizationPolicyEvaluator)theEObject;
				T result = caseAuthorizationPolicyEvaluator(authorizationPolicyEvaluator);
				if (result == null) result = caseAnnotation(authorizationPolicyEvaluator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY_SET: {
				ResourceAccessPolicySet resourceAccessPolicySet = (ResourceAccessPolicySet)theEObject;
				T result = caseResourceAccessPolicySet(resourceAccessPolicySet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY: {
				ResourceAccessPolicy resourceAccessPolicy = (ResourceAccessPolicy)theEObject;
				T result = caseResourceAccessPolicy(resourceAccessPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_RULE: {
				ResourceAccessRule resourceAccessRule = (ResourceAccessRule)theEObject;
				T result = caseResourceAccessRule(resourceAccessRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthorizationLayerPSMPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthorizationLayerPSMPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthorizationLayerPSMPackage.ALLOWED_ACTION: {
				AllowedAction allowedAction = (AllowedAction)theEObject;
				T result = caseAllowedAction(allowedAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AuthorizationLayerPSMPackage.NEW_PROPERTY: {
				NewProperty newProperty = (NewProperty)theEObject;
				T result = caseNewProperty(newProperty);
				if (result == null) result = caseAnnotation(newProperty);
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
	 * Returns the result of interpreting the object as an instance of '<em>Ann PSM Component Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ann PSM Component Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnPSMComponentProperty(AnnPSMComponentProperty object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Ann Java Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ann Java Resource Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnJavaResourceModel(AnnJavaResourceModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ann Java Resource Model Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ann Java Resource Model Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnJavaResourceModelManager(AnnJavaResourceModelManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ann Java Algo Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ann Java Algo Resource Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnJavaAlgoResourceModel(AnnJavaAlgoResourceModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorization Subject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorization Subject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorizationSubject(AuthorizationSubject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorizable Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorizable Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorizableResource(AuthorizableResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorization Performer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorization Performer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorizationPerformer(AuthorizationPerformer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorization Data Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorization Data Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorizationDataHandler(AuthorizationDataHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorization Policy Evaluator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorization Policy Evaluator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorizationPolicyEvaluator(AuthorizationPolicyEvaluator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Access Policy Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Access Policy Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceAccessPolicySet(ResourceAccessPolicySet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Access Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Access Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceAccessPolicy(ResourceAccessPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Access Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Access Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceAccessRule(ResourceAccessRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allowed Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allowed Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllowedAction(AllowedAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewProperty(NewProperty object) {
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

} //AuthorizationLayerPSMSwitch
