/**
 */
package AuthorizationLayerCIM.impl;

import AuthorizationLayerCIM.*;

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
public class AuthorizationLayerCIMFactoryImpl extends EFactoryImpl implements AuthorizationLayerCIMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AuthorizationLayerCIMFactory init() {
		try {
			AuthorizationLayerCIMFactory theAuthorizationLayerCIMFactory = (AuthorizationLayerCIMFactory)EPackage.Registry.INSTANCE.getEFactory(AuthorizationLayerCIMPackage.eNS_URI);
			if (theAuthorizationLayerCIMFactory != null) {
				return theAuthorizationLayerCIMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AuthorizationLayerCIMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationLayerCIMFactoryImpl() {
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
			case AuthorizationLayerCIMPackage.ANNOTATION_MODEL: return createAnnotationModel();
			case AuthorizationLayerCIMPackage.AUTHORIZABLE_RESOURCE: return createAuthorizableResource();
			case AuthorizationLayerCIMPackage.RESOURCE_ACCESS_POLICY_SET: return createResourceAccessPolicySet();
			case AuthorizationLayerCIMPackage.ANN_RESOURCE: return createAnnResource();
			case AuthorizationLayerCIMPackage.RESOURCE_ACCESS_POLICY: return createResourceAccessPolicy();
			case AuthorizationLayerCIMPackage.CONDITION: return createCondition();
			case AuthorizationLayerCIMPackage.ATTRIBUTE: return createAttribute();
			case AuthorizationLayerCIMPackage.ANN_PROPERTY: return createAnnProperty();
			case AuthorizationLayerCIMPackage.RESOURCE_ACCESS_RULE: return createResourceAccessRule();
			case AuthorizationLayerCIMPackage.AUTHORIZATION_SUBJECT: return createAuthorizationSubject();
			case AuthorizationLayerCIMPackage.ANN_CRUD_ACTIVITY: return createAnnCRUDActivity();
			case AuthorizationLayerCIMPackage.ALLOWED_ACTION: return createAllowedAction();
			case AuthorizationLayerCIMPackage.NEW_PROPERTY: return createNewProperty();
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
			case AuthorizationLayerCIMPackage.COMBINING_ALGORITHM:
				return createCombiningAlgorithmFromString(eDataType, initialValue);
			case AuthorizationLayerCIMPackage.OPERATOR:
				return createOperatorFromString(eDataType, initialValue);
			case AuthorizationLayerCIMPackage.ATTRIBUTE_CATEGORY:
				return createAttributeCategoryFromString(eDataType, initialValue);
			case AuthorizationLayerCIMPackage.RULE_TYPE:
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
			case AuthorizationLayerCIMPackage.COMBINING_ALGORITHM:
				return convertCombiningAlgorithmToString(eDataType, instanceValue);
			case AuthorizationLayerCIMPackage.OPERATOR:
				return convertOperatorToString(eDataType, instanceValue);
			case AuthorizationLayerCIMPackage.ATTRIBUTE_CATEGORY:
				return convertAttributeCategoryToString(eDataType, instanceValue);
			case AuthorizationLayerCIMPackage.RULE_TYPE:
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
	public AuthorizableResource createAuthorizableResource() {
		AuthorizableResourceImpl authorizableResource = new AuthorizableResourceImpl();
		return authorizableResource;
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
	public AnnResource createAnnResource() {
		AnnResourceImpl annResource = new AnnResourceImpl();
		return annResource;
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
	public AnnProperty createAnnProperty() {
		AnnPropertyImpl annProperty = new AnnPropertyImpl();
		return annProperty;
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
	public AuthorizationSubject createAuthorizationSubject() {
		AuthorizationSubjectImpl authorizationSubject = new AuthorizationSubjectImpl();
		return authorizationSubject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnCRUDActivity createAnnCRUDActivity() {
		AnnCRUDActivityImpl annCRUDActivity = new AnnCRUDActivityImpl();
		return annCRUDActivity;
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
	public AuthorizationLayerCIMPackage getAuthorizationLayerCIMPackage() {
		return (AuthorizationLayerCIMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AuthorizationLayerCIMPackage getPackage() {
		return AuthorizationLayerCIMPackage.eINSTANCE;
	}

} //AuthorizationLayerCIMFactoryImpl
