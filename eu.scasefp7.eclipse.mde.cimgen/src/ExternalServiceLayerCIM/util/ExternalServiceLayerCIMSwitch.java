/**
 */
package ExternalServiceLayerCIM.util;

import ExternalServiceLayerCIM.*;

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
 * @see ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage
 * @generated
 */
public class ExternalServiceLayerCIMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExternalServiceLayerCIMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalServiceLayerCIMSwitch() {
		if (modelPackage == null) {
			modelPackage = ExternalServiceLayerCIMPackage.eINSTANCE;
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
			case ExternalServiceLayerCIMPackage.ANNOTATION_MODEL: {
				AnnotationModel annotationModel = (AnnotationModel)theEObject;
				T result = caseAnnotationModel(annotationModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerCIMPackage.ANNOTATED_ELEMENT: {
				AnnotatedElement annotatedElement = (AnnotatedElement)theEObject;
				T result = caseAnnotatedElement(annotatedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerCIMPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerCIMPackage.ANN_ALGO_RESOURCE: {
				AnnAlgoResource annAlgoResource = (AnnAlgoResource)theEObject;
				T result = caseAnnAlgoResource(annAlgoResource);
				if (result == null) result = caseAnnotatedElement(annAlgoResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerCIMPackage.ANN_CRUD_RESOURCE: {
				AnnCRUDResource annCRUDResource = (AnnCRUDResource)theEObject;
				T result = caseAnnCRUDResource(annCRUDResource);
				if (result == null) result = caseAnnotatedElement(annCRUDResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerCIMPackage.REST_CLIENT_RESOURCE: {
				RESTClientResource restClientResource = (RESTClientResource)theEObject;
				T result = caseRESTClientResource(restClientResource);
				if (result == null) result = caseAnnotation(restClientResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerCIMPackage.TARGET_REST_SERVICE: {
				TargetRESTService targetRESTService = (TargetRESTService)theEObject;
				T result = caseTargetRESTService(targetRESTService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerCIMPackage.QUERY_PARAM: {
				QueryParam queryParam = (QueryParam)theEObject;
				T result = caseQueryParam(queryParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerCIMPackage.INPUT_DATA_MODEL: {
				InputDataModel inputDataModel = (InputDataModel)theEObject;
				T result = caseInputDataModel(inputDataModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerCIMPackage.OUTPUT_DATA_MODEL: {
				OutputDataModel outputDataModel = (OutputDataModel)theEObject;
				T result = caseOutputDataModel(outputDataModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerCIMPackage.REPRESENTATION: {
				Representation representation = (Representation)theEObject;
				T result = caseRepresentation(representation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerCIMPackage.MODEL_PROPERTY: {
				ModelProperty modelProperty = (ModelProperty)theEObject;
				T result = caseModelProperty(modelProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerCIMPackage.NON_PERSISTENT_OUTPUT: {
				NonPersistentOutput nonPersistentOutput = (NonPersistentOutput)theEObject;
				T result = caseNonPersistentOutput(nonPersistentOutput);
				if (result == null) result = caseOutputDataModel(nonPersistentOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerCIMPackage.AUTO_PERSISTENT_OUTPUT: {
				AutoPersistentOutput autoPersistentOutput = (AutoPersistentOutput)theEObject;
				T result = caseAutoPersistentOutput(autoPersistentOutput);
				if (result == null) result = caseOutputDataModel(autoPersistentOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerCIMPackage.EXISTENT_CRUD_PERSISTENT_OUTPUT: {
				ExistentCRUDPersistentOutput existentCRUDPersistentOutput = (ExistentCRUDPersistentOutput)theEObject;
				T result = caseExistentCRUDPersistentOutput(existentCRUDPersistentOutput);
				if (result == null) result = caseOutputDataModel(existentCRUDPersistentOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerCIMPackage.COMPLEX_TYPE: {
				ComplexType complexType = (ComplexType)theEObject;
				T result = caseComplexType(complexType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerCIMPackage.COMPLEX_TYPE_PROPERTY: {
				ComplexTypeProperty complexTypeProperty = (ComplexTypeProperty)theEObject;
				T result = caseComplexTypeProperty(complexTypeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExternalServiceLayerCIMPackage.PATH_PARAM: {
				PathParam pathParam = (PathParam)theEObject;
				T result = casePathParam(pathParam);
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
	 * Returns the result of interpreting the object as an instance of '<em>Ann Algo Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ann Algo Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnAlgoResource(AnnAlgoResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ann CRUD Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ann CRUD Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnCRUDResource(AnnCRUDResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REST Client Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REST Client Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRESTClientResource(RESTClientResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target REST Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target REST Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetRESTService(TargetRESTService object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Input Data Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Data Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputDataModel(InputDataModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Data Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Data Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputDataModel(OutputDataModel object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Model Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelProperty(ModelProperty object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Existent CRUD Persistent Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Existent CRUD Persistent Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExistentCRUDPersistentOutput(ExistentCRUDPersistentOutput object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Path Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathParam(PathParam object) {
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

} //ExternalServiceLayerCIMSwitch
