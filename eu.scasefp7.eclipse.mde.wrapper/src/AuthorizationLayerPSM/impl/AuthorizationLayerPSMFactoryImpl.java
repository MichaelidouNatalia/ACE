/**
 */
package AuthorizationLayerPSM.impl;

import AuthorizationLayerPSM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AuthorizationLayerPSMFactoryImpl extends EFactoryImpl implements AuthorizationLayerPSMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AuthorizationLayerPSMFactory init() {
		try {
			AuthorizationLayerPSMFactory theAuthorizationLayerPSMFactory = (AuthorizationLayerPSMFactory)EPackage.Registry.INSTANCE.getEFactory(AuthorizationLayerPSMPackage.eNS_URI);
			if (theAuthorizationLayerPSMFactory != null) {
				return theAuthorizationLayerPSMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AuthorizationLayerPSMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationLayerPSMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AuthorizationLayerPSMPackage.ANNOTATION_MODEL: return createAnnotationModel();
			case AuthorizationLayerPSMPackage.ANNOTATION: return createAnnotation();
			case AuthorizationLayerPSMPackage.ANNOTATED_ELEMENT: return createAnnotatedElement();
			case AuthorizationLayerPSMPackage.ANN_HTTP_ACTIVITY: return createAnnHTTPActivity();
			case AuthorizationLayerPSMPackage.ANN_PSM_COMPONENT_PROPERTY: return createAnnPSMComponentProperty();
			case AuthorizationLayerPSMPackage.ANN_JPA_CONTROLLER: return createAnnJPAController();
			case AuthorizationLayerPSMPackage.ANN_HTTP_ACTIVITY_HANDLER: return createAnnHTTPActivityHandler();
			case AuthorizationLayerPSMPackage.ANN_JAVA_RESOURCE_MODEL: return createAnnJavaResourceModel();
			case AuthorizationLayerPSMPackage.ANN_JAVA_RESOURCE_MODEL_MANAGER: return createAnnJavaResourceModelManager();
			case AuthorizationLayerPSMPackage.ANN_JAVA_ALGO_RESOURCE_MODEL: return createAnnJavaAlgoResourceModel();
			case AuthorizationLayerPSMPackage.AUTHORIZATION_SUBJECT: return createAuthorizationSubject();
			case AuthorizationLayerPSMPackage.AUTHORIZABLE_RESOURCE: return createAuthorizableResource();
			case AuthorizationLayerPSMPackage.AUTHORIZATION_PERFORMER: return createAuthorizationPerformer();
			case AuthorizationLayerPSMPackage.AUTHORIZATION_DATA_HANDLER: return createAuthorizationDataHandler();
			case AuthorizationLayerPSMPackage.AUTHORIZATION_POLICY_EVALUATOR: return createAuthorizationPolicyEvaluator();
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY_SET: return createResourceAccessPolicySet();
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_POLICY: return createResourceAccessPolicy();
			case AuthorizationLayerPSMPackage.RESOURCE_ACCESS_RULE: return createResourceAccessRule();
			case AuthorizationLayerPSMPackage.CONDITION: return createCondition();
			case AuthorizationLayerPSMPackage.ATTRIBUTE: return createAttribute();
			case AuthorizationLayerPSMPackage.ALLOWED_ACTION: return createAllowedAction();
			case AuthorizationLayerPSMPackage.NEW_PROPERTY: return createNewProperty();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AuthorizationLayerPSMPackage.OPERATOR:
				return createOperatorFromString(eDataType, initialValue);
			case AuthorizationLayerPSMPackage.COMBINING_ALGORITHM:
				return createCombiningAlgorithmFromString(eDataType, initialValue);
			case AuthorizationLayerPSMPackage.ATTRIBUTE_CATEGORY:
				return createAttributeCategoryFromString(eDataType, initialValue);
			case AuthorizationLayerPSMPackage.RULE_TYPE:
				return createRuleTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AuthorizationLayerPSMPackage.OPERATOR:
				return convertOperatorToString(eDataType, instanceValue);
			case AuthorizationLayerPSMPackage.COMBINING_ALGORITHM:
				return convertCombiningAlgorithmToString(eDataType, instanceValue);
			case AuthorizationLayerPSMPackage.ATTRIBUTE_CATEGORY:
				return convertAttributeCategoryToString(eDataType, instanceValue);
			case AuthorizationLayerPSMPackage.RULE_TYPE:
				return convertRuleTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationModel createAnnotationModel() {
		AnnotationModelImpl annotationModel = new AnnotationModelImpl();
		return annotationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotatedElement createAnnotatedElement() {
		AnnotatedElementImpl annotatedElement = new AnnotatedElementImpl();
		return annotatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnHTTPActivity createAnnHTTPActivity() {
		AnnHTTPActivityImpl annHTTPActivity = new AnnHTTPActivityImpl();
		return annHTTPActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnPSMComponentProperty createAnnPSMComponentProperty() {
		AnnPSMComponentPropertyImpl annPSMComponentProperty = new AnnPSMComponentPropertyImpl();
		return annPSMComponentProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnJPAController createAnnJPAController() {
		AnnJPAControllerImpl annJPAController = new AnnJPAControllerImpl();
		return annJPAController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnHTTPActivityHandler createAnnHTTPActivityHandler() {
		AnnHTTPActivityHandlerImpl annHTTPActivityHandler = new AnnHTTPActivityHandlerImpl();
		return annHTTPActivityHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnJavaResourceModel createAnnJavaResourceModel() {
		AnnJavaResourceModelImpl annJavaResourceModel = new AnnJavaResourceModelImpl();
		return annJavaResourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnJavaResourceModelManager createAnnJavaResourceModelManager() {
		AnnJavaResourceModelManagerImpl annJavaResourceModelManager = new AnnJavaResourceModelManagerImpl();
		return annJavaResourceModelManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnJavaAlgoResourceModel createAnnJavaAlgoResourceModel() {
		AnnJavaAlgoResourceModelImpl annJavaAlgoResourceModel = new AnnJavaAlgoResourceModelImpl();
		return annJavaAlgoResourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationSubject createAuthorizationSubject() {
		AuthorizationSubjectImpl authorizationSubject = new AuthorizationSubjectImpl();
		return authorizationSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizableResource createAuthorizableResource() {
		AuthorizableResourceImpl authorizableResource = new AuthorizableResourceImpl();
		return authorizableResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationPerformer createAuthorizationPerformer() {
		AuthorizationPerformerImpl authorizationPerformer = new AuthorizationPerformerImpl();
		return authorizationPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationDataHandler createAuthorizationDataHandler() {
		AuthorizationDataHandlerImpl authorizationDataHandler = new AuthorizationDataHandlerImpl();
		return authorizationDataHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationPolicyEvaluator createAuthorizationPolicyEvaluator() {
		AuthorizationPolicyEvaluatorImpl authorizationPolicyEvaluator = new AuthorizationPolicyEvaluatorImpl();
		return authorizationPolicyEvaluator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceAccessPolicySet createResourceAccessPolicySet() {
		ResourceAccessPolicySetImpl resourceAccessPolicySet = new ResourceAccessPolicySetImpl();
		return resourceAccessPolicySet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceAccessPolicy createResourceAccessPolicy() {
		ResourceAccessPolicyImpl resourceAccessPolicy = new ResourceAccessPolicyImpl();
		return resourceAccessPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceAccessRule createResourceAccessRule() {
		ResourceAccessRuleImpl resourceAccessRule = new ResourceAccessRuleImpl();
		return resourceAccessRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowedAction createAllowedAction() {
		AllowedActionImpl allowedAction = new AllowedActionImpl();
		return allowedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewProperty createNewProperty() {
		NewPropertyImpl newProperty = new NewPropertyImpl();
		return newProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator createOperatorFromString(EDataType eDataType, String initialValue) {
		Operator result = Operator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombiningAlgorithm createCombiningAlgorithmFromString(EDataType eDataType, String initialValue) {
		CombiningAlgorithm result = CombiningAlgorithm.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCombiningAlgorithmToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeCategory createAttributeCategoryFromString(EDataType eDataType, String initialValue) {
		AttributeCategory result = AttributeCategory.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeCategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleType createRuleTypeFromString(EDataType eDataType, String initialValue) {
		RuleType result = RuleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRuleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationLayerPSMPackage getAuthorizationLayerPSMPackage() {
		return (AuthorizationLayerPSMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AuthorizationLayerPSMPackage getPackage() {
		return AuthorizationLayerPSMPackage.eINSTANCE;
	}

} //AuthorizationLayerPSMFactoryImpl
