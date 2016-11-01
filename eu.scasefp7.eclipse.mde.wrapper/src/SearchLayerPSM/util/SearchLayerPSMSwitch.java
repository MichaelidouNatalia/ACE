/**
 */
package SearchLayerPSM.util;

import SearchLayerPSM.*;

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
 * @see SearchLayerPSM.SearchLayerPSMPackage
 * @generated
 */
public class SearchLayerPSMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SearchLayerPSMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchLayerPSMSwitch() {
		if (modelPackage == null) {
			modelPackage = SearchLayerPSMPackage.eINSTANCE;
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
			case SearchLayerPSMPackage.ANNOTATION_MODEL: {
				AnnotationModel annotationModel = (AnnotationModel)theEObject;
				T result = caseAnnotationModel(annotationModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SearchLayerPSMPackage.ANNOTATED_ELEMENT: {
				AnnotatedElement annotatedElement = (AnnotatedElement)theEObject;
				T result = caseAnnotatedElement(annotatedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SearchLayerPSMPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SearchLayerPSMPackage.ANN_PSM_COMPONENT_PROPERTY: {
				AnnPSMComponentProperty annPSMComponentProperty = (AnnPSMComponentProperty)theEObject;
				T result = caseAnnPSMComponentProperty(annPSMComponentProperty);
				if (result == null) result = caseAnnotatedElement(annPSMComponentProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SearchLayerPSMPackage.ANN_JAVA_ALGO_CONTROLLER: {
				AnnJavaAlgoController annJavaAlgoController = (AnnJavaAlgoController)theEObject;
				T result = caseAnnJavaAlgoController(annJavaAlgoController);
				if (result == null) result = caseAnnotatedElement(annJavaAlgoController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SearchLayerPSMPackage.ANN_HTTP_ACTIVITY: {
				AnnHTTPActivity annHTTPActivity = (AnnHTTPActivity)theEObject;
				T result = caseAnnHTTPActivity(annHTTPActivity);
				if (result == null) result = caseAnnotatedElement(annHTTPActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SearchLayerPSMPackage.ANN_HTTP_ACTIVITY_HANDLER: {
				AnnHTTPActivityHandler annHTTPActivityHandler = (AnnHTTPActivityHandler)theEObject;
				T result = caseAnnHTTPActivityHandler(annHTTPActivityHandler);
				if (result == null) result = caseAnnotatedElement(annHTTPActivityHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SearchLayerPSMPackage.SEARCH_CONTROLLER: {
				SearchController searchController = (SearchController)theEObject;
				T result = caseSearchController(searchController);
				if (result == null) result = caseAnnotation(searchController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SearchLayerPSMPackage.SEARCH_HTTP_ACTIVITY: {
				SearchHTTPActivity searchHTTPActivity = (SearchHTTPActivity)theEObject;
				T result = caseSearchHTTPActivity(searchHTTPActivity);
				if (result == null) result = caseAnnotation(searchHTTPActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SearchLayerPSMPackage.SEARCH_HTTP_HANDLER: {
				SearchHTTPHandler searchHTTPHandler = (SearchHTTPHandler)theEObject;
				T result = caseSearchHTTPHandler(searchHTTPHandler);
				if (result == null) result = caseAnnotation(searchHTTPHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SearchLayerPSMPackage.SEARCHABLE_PROPERTY: {
				SearchableProperty searchableProperty = (SearchableProperty)theEObject;
				T result = caseSearchableProperty(searchableProperty);
				if (result == null) result = caseAnnotation(searchableProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SearchLayerPSMPackage.SEARCHABLE_JAVA_RESOURCE_MODEL: {
				SearchableJavaResourceModel searchableJavaResourceModel = (SearchableJavaResourceModel)theEObject;
				T result = caseSearchableJavaResourceModel(searchableJavaResourceModel);
				if (result == null) result = caseAnnotation(searchableJavaResourceModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SearchLayerPSMPackage.ANN_JAVA_RESOURCE_MODEL: {
				AnnJavaResourceModel annJavaResourceModel = (AnnJavaResourceModel)theEObject;
				T result = caseAnnJavaResourceModel(annJavaResourceModel);
				if (result == null) result = caseAnnotatedElement(annJavaResourceModel);
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
	 * Returns the result of interpreting the object as an instance of '<em>Search Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchController(SearchController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search HTTP Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search HTTP Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchHTTPActivity(SearchHTTPActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search HTTP Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search HTTP Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchHTTPHandler(SearchHTTPHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Searchable Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Searchable Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchableProperty(SearchableProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Searchable Java Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Searchable Java Resource Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchableJavaResourceModel(SearchableJavaResourceModel object) {
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

} //SearchLayerPSMSwitch
