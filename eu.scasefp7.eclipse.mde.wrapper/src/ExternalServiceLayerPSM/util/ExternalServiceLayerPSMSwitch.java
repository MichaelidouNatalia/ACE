/**
 */
package ExternalServiceLayerPSM.util;

import ExternalServiceLayerPSM.*;

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
 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage
 * @generated
 */
public class ExternalServiceLayerPSMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExternalServiceLayerPSMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalServiceLayerPSMSwitch() {
		if (modelPackage == null) {
			modelPackage = ExternalServiceLayerPSMPackage.eINSTANCE;
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
			case ExternalServiceLayerPSMPackage.ANNOTATION_MODEL: {
				AnnotationModel annotationModel = (AnnotationModel)theEObject;
				T result = caseAnnotationModel(annotationModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerPSMPackage.ANNOTATED_ELEMENT: {
				AnnotatedElement annotatedElement = (AnnotatedElement)theEObject;
				T result = caseAnnotatedElement(annotatedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerPSMPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerPSMPackage.ANN_JAVA_ALGO_MODEL: {
				AnnJavaAlgoModel annJavaAlgoModel = (AnnJavaAlgoModel)theEObject;
				T result = caseAnnJavaAlgoModel(annJavaAlgoModel);
				if (result == null) result = caseAnnotatedElement(annJavaAlgoModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerPSMPackage.ANN_JAVA_ALGO_CONTROLLER: {
				AnnJavaAlgoController annJavaAlgoController = (AnnJavaAlgoController)theEObject;
				T result = caseAnnJavaAlgoController(annJavaAlgoController);
				if (result == null) result = caseAnnotatedElement(annJavaAlgoController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerPSMPackage.ANN_HTTP_ACTIVITY: {
				AnnHTTPActivity annHTTPActivity = (AnnHTTPActivity)theEObject;
				T result = caseAnnHTTPActivity(annHTTPActivity);
				if (result == null) result = caseAnnotatedElement(annHTTPActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerPSMPackage.ANN_HTTP_ACTIVITY_HANDLER: {
				AnnHTTPActivityHandler annHTTPActivityHandler = (AnnHTTPActivityHandler)theEObject;
				T result = caseAnnHTTPActivityHandler(annHTTPActivityHandler);
				if (result == null) result = caseAnnotatedElement(annHTTPActivityHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerPSMPackage.ANN_JAVA_RESOURCE_MODEL: {
				AnnJavaResourceModel annJavaResourceModel = (AnnJavaResourceModel)theEObject;
				T result = caseAnnJavaResourceModel(annJavaResourceModel);
				if (result == null) result = caseAnnotatedElement(annJavaResourceModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_CONTROLLER: {
				JavaRESTClientController javaRESTClientController = (JavaRESTClientController)theEObject;
				T result = caseJavaRESTClientController(javaRESTClientController);
				if (result == null) result = caseAnnotation(javaRESTClientController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY: {
				JavaRESTClientHTTPActivity javaRESTClientHTTPActivity = (JavaRESTClientHTTPActivity)theEObject;
				T result = caseJavaRESTClientHTTPActivity(javaRESTClientHTTPActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER: {
				JavaRESTClientHTTPActivityHandler javaRESTClientHTTPActivityHandler = (JavaRESTClientHTTPActivityHandler)theEObject;
				T result = caseJavaRESTClientHTTPActivityHandler(javaRESTClientHTTPActivityHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerPSMPackage.JAVA_REST_CLIENT_MODEL: {
				JavaRESTClientModel javaRESTClientModel = (JavaRESTClientModel)theEObject;
				T result = caseJavaRESTClientModel(javaRESTClientModel);
				if (result == null) result = caseAnnotation(javaRESTClientModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerPSMPackage.QUERY_PARAM: {
				QueryParam queryParam = (QueryParam)theEObject;
				T result = caseQueryParam(queryParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerPSMPackage.JAVA_INPUT_DATA_MODEL: {
				JavaInputDataModel javaInputDataModel = (JavaInputDataModel)theEObject;
				T result = caseJavaInputDataModel(javaInputDataModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerPSMPackage.JAVA_OUTPUT_DATA_MODEL: {
				JavaOutputDataModel javaOutputDataModel = (JavaOutputDataModel)theEObject;
				T result = caseJavaOutputDataModel(javaOutputDataModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerPSMPackage.REPRESENTATION: {
				Representation representation = (Representation)theEObject;
				T result = caseRepresentation(representation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerPSMPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerPSMPackage.NON_PERSISTENT_OUTPUT: {
				NonPersistentOutput nonPersistentOutput = (NonPersistentOutput)theEObject;
				T result = caseNonPersistentOutput(nonPersistentOutput);
				if (result == null) result = caseJavaOutputDataModel(nonPersistentOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerPSMPackage.AUTO_PERSISTENT_OUTPUT: {
				AutoPersistentOutput autoPersistentOutput = (AutoPersistentOutput)theEObject;
				T result = caseAutoPersistentOutput(autoPersistentOutput);
				if (result == null) result = caseJavaOutputDataModel(autoPersistentOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerPSMPackage.EXISTENT_JAVA_MODEL_PERSISTENT_OUTPUT: {
				ExistentJavaModelPersistentOutput existentJavaModelPersistentOutput = (ExistentJavaModelPersistentOutput)theEObject;
				T result = caseExistentJavaModelPersistentOutput(existentJavaModelPersistentOutput);
				if (result == null) result = caseJavaOutputDataModel(existentJavaModelPersistentOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerPSMPackage.COMPLEX_TYPE: {
				ComplexType complexType = (ComplexType)theEObject;
				T result = caseComplexType(complexType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerPSMPackage.COMPLEX_TYPE_PROPERTY: {
				ComplexTypeProperty complexTypeProperty = (ComplexTypeProperty)theEObject;
				T result = caseComplexTypeProperty(complexTypeProperty);
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
	 * Returns the result of interpreting the object as an instance of '<em>Ann Java Algo Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ann Java Algo Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnJavaAlgoModel(AnnJavaAlgoModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ann Java Algo Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ann Java Algo Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnJavaAlgoController(AnnJavaAlgoController object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Java REST Client Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java REST Client Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaRESTClientController(JavaRESTClientController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java REST Client HTTP Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java REST Client HTTP Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaRESTClientHTTPActivity(JavaRESTClientHTTPActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java REST Client HTTP Activity Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java REST Client HTTP Activity Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaRESTClientHTTPActivityHandler(JavaRESTClientHTTPActivityHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java REST Client Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java REST Client Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaRESTClientModel(JavaRESTClientModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryParam(QueryParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Input Data Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Input Data Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaInputDataModel(JavaInputDataModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Output Data Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Output Data Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaOutputDataModel(JavaOutputDataModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Representation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Representation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepresentation(Representation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Persistent Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Persistent Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonPersistentOutput(NonPersistentOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auto Persistent Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auto Persistent Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutoPersistentOutput(AutoPersistentOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Existent Java Model Persistent Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Existent Java Model Persistent Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExistentJavaModelPersistentOutput(ExistentJavaModelPersistentOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexType(ComplexType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Type Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Type Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexTypeProperty(ComplexTypeProperty object) {
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

} //ExternalServiceLayerPSMSwitch
