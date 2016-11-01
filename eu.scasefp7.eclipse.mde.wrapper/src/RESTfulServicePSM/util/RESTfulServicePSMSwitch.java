/**
 */
package RESTfulServicePSM.util;

import RESTfulServicePSM.*;

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
 * @see RESTfulServicePSM.RESTfulServicePSMPackage
 * @generated
 */
public class RESTfulServicePSMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RESTfulServicePSMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESTfulServicePSMSwitch() {
		if (modelPackage == null) {
			modelPackage = RESTfulServicePSMPackage.eINSTANCE;
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
			case RESTfulServicePSMPackage.HIBERNATE_ACTIVITY: {
				HibernateActivity hibernateActivity = (HibernateActivity)theEObject;
				T result = caseHibernateActivity(hibernateActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTfulServicePSMPackage.HIBERNATE_ANNOTATION: {
				HibernateAnnotation hibernateAnnotation = (HibernateAnnotation)theEObject;
				T result = caseHibernateAnnotation(hibernateAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTfulServicePSMPackage.HIBERNATE_CONTROLLER: {
				HibernateController hibernateController = (HibernateController)theEObject;
				T result = caseHibernateController(hibernateController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTfulServicePSMPackage.HTTP_ACTIVITY: {
				HTTPActivity httpActivity = (HTTPActivity)theEObject;
				T result = caseHTTPActivity(httpActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTfulServicePSMPackage.HTTP_ACTIVITY_FUNCTION_PARAMETER: {
				HTTPActivityFunctionParameter httpActivityFunctionParameter = (HTTPActivityFunctionParameter)theEObject;
				T result = caseHTTPActivityFunctionParameter(httpActivityFunctionParameter);
				if (result == null) result = caseFunctionParameter(httpActivityFunctionParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTfulServicePSMPackage.HTTP_ACTIVITY_HANDLER: {
				HTTPActivityHandler httpActivityHandler = (HTTPActivityHandler)theEObject;
				T result = caseHTTPActivityHandler(httpActivityHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_CONTROLLER: {
				JavaAlgoResourceController javaAlgoResourceController = (JavaAlgoResourceController)theEObject;
				T result = caseJavaAlgoResourceController(javaAlgoResourceController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTfulServicePSMPackage.JAVA_ALGO_RESOURCE_MODEL: {
				JavaAlgoResourceModel javaAlgoResourceModel = (JavaAlgoResourceModel)theEObject;
				T result = caseJavaAlgoResourceModel(javaAlgoResourceModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTfulServicePSMPackage.JAVA_FUNCTION: {
				JavaFunction javaFunction = (JavaFunction)theEObject;
				T result = caseJavaFunction(javaFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTfulServicePSMPackage.JAVA_GETTER_FUNCTION: {
				JavaGetterFunction javaGetterFunction = (JavaGetterFunction)theEObject;
				T result = caseJavaGetterFunction(javaGetterFunction);
				if (result == null) result = caseJavaFunction(javaGetterFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTfulServicePSMPackage.JAVA_HYPERMEDIA_FUNCTION: {
				JavaHypermediaFunction javaHypermediaFunction = (JavaHypermediaFunction)theEObject;
				T result = caseJavaHypermediaFunction(javaHypermediaFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER: {
				JavaResourceController javaResourceController = (JavaResourceController)theEObject;
				T result = caseJavaResourceController(javaResourceController);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTfulServicePSMPackage.JAVA_RESOURCE_CONTROLLER_MANAGER: {
				JavaResourceControllerManager javaResourceControllerManager = (JavaResourceControllerManager)theEObject;
				T result = caseJavaResourceControllerManager(javaResourceControllerManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL: {
				JavaResourceModel javaResourceModel = (JavaResourceModel)theEObject;
				T result = caseJavaResourceModel(javaResourceModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTfulServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER: {
				JavaResourceModelManager javaResourceModelManager = (JavaResourceModelManager)theEObject;
				T result = caseJavaResourceModelManager(javaResourceModelManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTfulServicePSMPackage.PSM_COMPONENT_PROPERTY: {
				PSMComponentProperty psmComponentProperty = (PSMComponentProperty)theEObject;
				T result = casePSMComponentProperty(psmComponentProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTfulServicePSMPackage.JAVA_SETTER_FUNCTION: {
				JavaSetterFunction javaSetterFunction = (JavaSetterFunction)theEObject;
				T result = caseJavaSetterFunction(javaSetterFunction);
				if (result == null) result = caseJavaFunction(javaSetterFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTfulServicePSMPackage.JAXB_ANNOTATION: {
				JAXBAnnotation jaxbAnnotation = (JAXBAnnotation)theEObject;
				T result = caseJAXBAnnotation(jaxbAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTfulServicePSMPackage.JAXRS_ANNOTATION: {
				JAXRSAnnotation jaxrsAnnotation = (JAXRSAnnotation)theEObject;
				T result = caseJAXRSAnnotation(jaxrsAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTfulServicePSMPackage.PSM_HYPERMEDIA_LINK: {
				PSMHypermediaLink psmHypermediaLink = (PSMHypermediaLink)theEObject;
				T result = casePSMHypermediaLink(psmHypermediaLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTfulServicePSMPackage.SERVICE_PSM: {
				ServicePSM servicePSM = (ServicePSM)theEObject;
				T result = caseServicePSM(servicePSM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RESTfulServicePSMPackage.FUNCTION_PARAMETER: {
				FunctionParameter functionParameter = (FunctionParameter)theEObject;
				T result = caseFunctionParameter(functionParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hibernate Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hibernate Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHibernateActivity(HibernateActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hibernate Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hibernate Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHibernateAnnotation(HibernateAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hibernate Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hibernate Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHibernateController(HibernateController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTTP Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTTP Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTTPActivity(HTTPActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTTP Activity Function Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTTP Activity Function Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTTPActivityFunctionParameter(HTTPActivityFunctionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HTTP Activity Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTTP Activity Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHTTPActivityHandler(HTTPActivityHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Algo Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Algo Resource Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaAlgoResourceController(JavaAlgoResourceController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Algo Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Algo Resource Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaAlgoResourceModel(JavaAlgoResourceModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaFunction(JavaFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Getter Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Getter Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaGetterFunction(JavaGetterFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Hypermedia Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Hypermedia Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaHypermediaFunction(JavaHypermediaFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Resource Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Resource Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaResourceController(JavaResourceController object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Resource Controller Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Resource Controller Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaResourceControllerManager(JavaResourceControllerManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Resource Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Resource Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaResourceModel(JavaResourceModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Resource Model Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Resource Model Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaResourceModelManager(JavaResourceModelManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PSM Component Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PSM Component Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePSMComponentProperty(PSMComponentProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Setter Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Setter Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaSetterFunction(JavaSetterFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JAXB Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JAXB Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJAXBAnnotation(JAXBAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JAXRS Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JAXRS Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJAXRSAnnotation(JAXRSAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PSM Hypermedia Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PSM Hypermedia Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePSMHypermediaLink(PSMHypermediaLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service PSM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service PSM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServicePSM(ServicePSM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionParameter(FunctionParameter object) {
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

} //RESTfulServicePSMSwitch
