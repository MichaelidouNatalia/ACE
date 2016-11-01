/**
 */
package AuthorizationLayerCIM.impl;

import AuthorizationLayerCIM.AllowedAction;
import AuthorizationLayerCIM.AnnCRUDActivity;
import AuthorizationLayerCIM.AnnProperty;
import AuthorizationLayerCIM.AnnResource;
import AuthorizationLayerCIM.AnnotatedElement;
import AuthorizationLayerCIM.Annotation;
import AuthorizationLayerCIM.AnnotationModel;
import AuthorizationLayerCIM.Attribute;
import AuthorizationLayerCIM.AttributeCategory;
import AuthorizationLayerCIM.AuthorizableResource;
import AuthorizationLayerCIM.AuthorizationLayerCIMFactory;
import AuthorizationLayerCIM.AuthorizationLayerCIMPackage;
import AuthorizationLayerCIM.AuthorizationSubject;
import AuthorizationLayerCIM.CombiningAlgorithm;
import AuthorizationLayerCIM.Condition;
import AuthorizationLayerCIM.NewProperty;
import AuthorizationLayerCIM.Operator;
import AuthorizationLayerCIM.ResourceAccessPolicy;
import AuthorizationLayerCIM.ResourceAccessPolicySet;
import AuthorizationLayerCIM.ResourceAccessRule;
import AuthorizationLayerCIM.RuleType;

import ServiceCIM.ServiceCIMPackage;

import ServiceCIM.impl.ServiceCIMPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AuthorizationLayerCIMPackageImpl extends EPackageImpl implements AuthorizationLayerCIMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizableResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceAccessPolicySetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotatedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceAccessPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceAccessRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizationSubjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annCRUDActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allowedActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum combiningAlgorithmEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum attributeCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ruleTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see AuthorizationLayerCIM.AuthorizationLayerCIMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AuthorizationLayerCIMPackageImpl() {
		super(eNS_URI, AuthorizationLayerCIMFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AuthorizationLayerCIMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AuthorizationLayerCIMPackage init() {
		if (isInited) return (AuthorizationLayerCIMPackage)EPackage.Registry.INSTANCE.getEPackage(AuthorizationLayerCIMPackage.eNS_URI);

		// Obtain or create and register package
		AuthorizationLayerCIMPackageImpl theAuthorizationLayerCIMPackage = (AuthorizationLayerCIMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AuthorizationLayerCIMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AuthorizationLayerCIMPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ServiceCIMPackageImpl theServiceCIMPackage = (ServiceCIMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ServiceCIMPackage.eNS_URI) instanceof ServiceCIMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ServiceCIMPackage.eNS_URI) : ServiceCIMPackage.eINSTANCE);

		// Create package meta-data objects
		theAuthorizationLayerCIMPackage.createPackageContents();
		theServiceCIMPackage.createPackageContents();

		// Initialize created meta-data
		theAuthorizationLayerCIMPackage.initializePackageContents();
		theServiceCIMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAuthorizationLayerCIMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AuthorizationLayerCIMPackage.eNS_URI, theAuthorizationLayerCIMPackage);
		return theAuthorizationLayerCIMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationModel() {
		return annotationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationModel_Name() {
		return (EAttribute)annotationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationModel_HasAnnotatedElement() {
		return (EReference)annotationModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationModel_HasAnnotation() {
		return (EReference)annotationModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorizableResource() {
		return authorizableResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthorizableResource_HasResourceAccessPolicySet() {
		return (EReference)authorizableResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthorizableResource_IsAuthorizableResource() {
		return (EReference)authorizableResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorizableResource_BTrackOwnership() {
		return (EAttribute)authorizableResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceAccessPolicySet() {
		return resourceAccessPolicySetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceAccessPolicySet_Name() {
		return (EAttribute)resourceAccessPolicySetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceAccessPolicySet_PolicyCombiningAlgorithm() {
		return (EAttribute)resourceAccessPolicySetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceAccessPolicySet_HasResourceAccessPolicy() {
		return (EReference)resourceAccessPolicySetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceAccessPolicySet_HasResourceAccessPolicySet() {
		return (EReference)resourceAccessPolicySetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotatedElement() {
		return annotatedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnResource() {
		return annResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnResource_AnnotatesResource() {
		return (EReference)annResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceAccessPolicy() {
		return resourceAccessPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceAccessPolicy_Name() {
		return (EAttribute)resourceAccessPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceAccessPolicy_RuleCombiningAlgorithm() {
		return (EAttribute)resourceAccessPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceAccessPolicy_HasApplyCondition() {
		return (EReference)resourceAccessPolicyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceAccessPolicy_HasResourceAccessRule() {
		return (EReference)resourceAccessPolicyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_Operator() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_HasLeftSideOperand() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_HasRightSideOperand() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_AttributeCategory() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_IsAttributeExistingProperty() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Value() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_IsAttributeNewProperty() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_IsAttributeResource() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnProperty() {
		return annPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnProperty_AnnotatesProperty() {
		return (EReference)annPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceAccessRule() {
		return resourceAccessRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceAccessRule_HasMatchCondition() {
		return (EReference)resourceAccessRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceAccessRule_Name() {
		return (EAttribute)resourceAccessRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceAccessRule_RuleType() {
		return (EAttribute)resourceAccessRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceAccessRule_HasAllowedAction() {
		return (EReference)resourceAccessRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorizationSubject() {
		return authorizationSubjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthorizationSubject_IsAuthorizationSubject() {
		return (EReference)authorizationSubjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnCRUDActivity() {
		return annCRUDActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnCRUDActivity_AnnotatesCRUDActivity() {
		return (EReference)annCRUDActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllowedAction() {
		return allowedActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAllowedAction_IsAllowedAction() {
		return (EReference)allowedActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewProperty() {
		return newPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewProperty_BelongsToResource() {
		return (EReference)newPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNewProperty_Name() {
		return (EAttribute)newPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNewProperty_Type() {
		return (EAttribute)newPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNewProperty_BIsUnique() {
		return (EAttribute)newPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCombiningAlgorithm() {
		return combiningAlgorithmEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperator() {
		return operatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAttributeCategory() {
		return attributeCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRuleType() {
		return ruleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationLayerCIMFactory getAuthorizationLayerCIMFactory() {
		return (AuthorizationLayerCIMFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		annotationModelEClass = createEClass(ANNOTATION_MODEL);
		createEAttribute(annotationModelEClass, ANNOTATION_MODEL__NAME);
		createEReference(annotationModelEClass, ANNOTATION_MODEL__HAS_ANNOTATED_ELEMENT);
		createEReference(annotationModelEClass, ANNOTATION_MODEL__HAS_ANNOTATION);

		annotationEClass = createEClass(ANNOTATION);

		authorizableResourceEClass = createEClass(AUTHORIZABLE_RESOURCE);
		createEReference(authorizableResourceEClass, AUTHORIZABLE_RESOURCE__HAS_RESOURCE_ACCESS_POLICY_SET);
		createEReference(authorizableResourceEClass, AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_RESOURCE);
		createEAttribute(authorizableResourceEClass, AUTHORIZABLE_RESOURCE__BTRACK_OWNERSHIP);

		resourceAccessPolicySetEClass = createEClass(RESOURCE_ACCESS_POLICY_SET);
		createEAttribute(resourceAccessPolicySetEClass, RESOURCE_ACCESS_POLICY_SET__NAME);
		createEAttribute(resourceAccessPolicySetEClass, RESOURCE_ACCESS_POLICY_SET__POLICY_COMBINING_ALGORITHM);
		createEReference(resourceAccessPolicySetEClass, RESOURCE_ACCESS_POLICY_SET__HAS_RESOURCE_ACCESS_POLICY);
		createEReference(resourceAccessPolicySetEClass, RESOURCE_ACCESS_POLICY_SET__HAS_RESOURCE_ACCESS_POLICY_SET);

		annotatedElementEClass = createEClass(ANNOTATED_ELEMENT);

		annResourceEClass = createEClass(ANN_RESOURCE);
		createEReference(annResourceEClass, ANN_RESOURCE__ANNOTATES_RESOURCE);

		resourceAccessPolicyEClass = createEClass(RESOURCE_ACCESS_POLICY);
		createEAttribute(resourceAccessPolicyEClass, RESOURCE_ACCESS_POLICY__NAME);
		createEAttribute(resourceAccessPolicyEClass, RESOURCE_ACCESS_POLICY__RULE_COMBINING_ALGORITHM);
		createEReference(resourceAccessPolicyEClass, RESOURCE_ACCESS_POLICY__HAS_APPLY_CONDITION);
		createEReference(resourceAccessPolicyEClass, RESOURCE_ACCESS_POLICY__HAS_RESOURCE_ACCESS_RULE);

		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__OPERATOR);
		createEReference(conditionEClass, CONDITION__HAS_LEFT_SIDE_OPERAND);
		createEReference(conditionEClass, CONDITION__HAS_RIGHT_SIDE_OPERAND);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__ATTRIBUTE_CATEGORY);
		createEReference(attributeEClass, ATTRIBUTE__IS_ATTRIBUTE_EXISTING_PROPERTY);
		createEAttribute(attributeEClass, ATTRIBUTE__VALUE);
		createEReference(attributeEClass, ATTRIBUTE__IS_ATTRIBUTE_NEW_PROPERTY);
		createEReference(attributeEClass, ATTRIBUTE__IS_ATTRIBUTE_RESOURCE);

		annPropertyEClass = createEClass(ANN_PROPERTY);
		createEReference(annPropertyEClass, ANN_PROPERTY__ANNOTATES_PROPERTY);

		resourceAccessRuleEClass = createEClass(RESOURCE_ACCESS_RULE);
		createEReference(resourceAccessRuleEClass, RESOURCE_ACCESS_RULE__HAS_MATCH_CONDITION);
		createEAttribute(resourceAccessRuleEClass, RESOURCE_ACCESS_RULE__NAME);
		createEAttribute(resourceAccessRuleEClass, RESOURCE_ACCESS_RULE__RULE_TYPE);
		createEReference(resourceAccessRuleEClass, RESOURCE_ACCESS_RULE__HAS_ALLOWED_ACTION);

		authorizationSubjectEClass = createEClass(AUTHORIZATION_SUBJECT);
		createEReference(authorizationSubjectEClass, AUTHORIZATION_SUBJECT__IS_AUTHORIZATION_SUBJECT);

		annCRUDActivityEClass = createEClass(ANN_CRUD_ACTIVITY);
		createEReference(annCRUDActivityEClass, ANN_CRUD_ACTIVITY__ANNOTATES_CRUD_ACTIVITY);

		allowedActionEClass = createEClass(ALLOWED_ACTION);
		createEReference(allowedActionEClass, ALLOWED_ACTION__IS_ALLOWED_ACTION);

		newPropertyEClass = createEClass(NEW_PROPERTY);
		createEReference(newPropertyEClass, NEW_PROPERTY__BELONGS_TO_RESOURCE);
		createEAttribute(newPropertyEClass, NEW_PROPERTY__NAME);
		createEAttribute(newPropertyEClass, NEW_PROPERTY__TYPE);
		createEAttribute(newPropertyEClass, NEW_PROPERTY__BIS_UNIQUE);

		// Create enums
		combiningAlgorithmEEnum = createEEnum(COMBINING_ALGORITHM);
		operatorEEnum = createEEnum(OPERATOR);
		attributeCategoryEEnum = createEEnum(ATTRIBUTE_CATEGORY);
		ruleTypeEEnum = createEEnum(RULE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ServiceCIMPackage theServiceCIMPackage = (ServiceCIMPackage)EPackage.Registry.INSTANCE.getEPackage(ServiceCIMPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		authorizableResourceEClass.getESuperTypes().add(this.getAnnotation());
		annResourceEClass.getESuperTypes().add(this.getAnnotatedElement());
		annPropertyEClass.getESuperTypes().add(this.getAnnotatedElement());
		authorizationSubjectEClass.getESuperTypes().add(this.getAnnotation());
		annCRUDActivityEClass.getESuperTypes().add(this.getAnnotatedElement());
		newPropertyEClass.getESuperTypes().add(this.getAnnotation());

		// Initialize classes, features, and operations; add parameters
		initEClass(annotationModelEClass, AnnotationModel.class, "AnnotationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotationModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationModel_HasAnnotatedElement(), this.getAnnotatedElement(), null, "hasAnnotatedElement", null, 1, -1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationModel_HasAnnotation(), this.getAnnotation(), null, "hasAnnotation", null, 1, -1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(authorizableResourceEClass, AuthorizableResource.class, "AuthorizableResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuthorizableResource_HasResourceAccessPolicySet(), this.getResourceAccessPolicySet(), null, "hasResourceAccessPolicySet", null, 1, 1, AuthorizableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthorizableResource_IsAuthorizableResource(), this.getAnnResource(), null, "isAuthorizableResource", null, 1, 1, AuthorizableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthorizableResource_BTrackOwnership(), ecorePackage.getEBoolean(), "bTrackOwnership", null, 1, 1, AuthorizableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceAccessPolicySetEClass, ResourceAccessPolicySet.class, "ResourceAccessPolicySet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceAccessPolicySet_Name(), ecorePackage.getEString(), "name", null, 1, 1, ResourceAccessPolicySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceAccessPolicySet_PolicyCombiningAlgorithm(), this.getCombiningAlgorithm(), "policyCombiningAlgorithm", null, 1, 1, ResourceAccessPolicySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceAccessPolicySet_HasResourceAccessPolicy(), this.getResourceAccessPolicy(), null, "hasResourceAccessPolicy", null, 1, -1, ResourceAccessPolicySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceAccessPolicySet_HasResourceAccessPolicySet(), this.getResourceAccessPolicySet(), null, "hasResourceAccessPolicySet", null, 0, -1, ResourceAccessPolicySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotatedElementEClass, AnnotatedElement.class, "AnnotatedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(annResourceEClass, AnnResource.class, "AnnResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnResource_AnnotatesResource(), theServiceCIMPackage.getResource(), null, "annotatesResource", null, 1, 1, AnnResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceAccessPolicyEClass, ResourceAccessPolicy.class, "ResourceAccessPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceAccessPolicy_Name(), ecorePackage.getEString(), "name", null, 1, 1, ResourceAccessPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceAccessPolicy_RuleCombiningAlgorithm(), this.getCombiningAlgorithm(), "ruleCombiningAlgorithm", null, 1, 1, ResourceAccessPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceAccessPolicy_HasApplyCondition(), this.getCondition(), null, "hasApplyCondition", null, 0, -1, ResourceAccessPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceAccessPolicy_HasResourceAccessRule(), this.getResourceAccessRule(), null, "hasResourceAccessRule", null, 1, -1, ResourceAccessPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_Operator(), this.getOperator(), "operator", "UNDEFINED", 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_HasLeftSideOperand(), this.getAttribute(), null, "hasLeftSideOperand", null, 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_HasRightSideOperand(), this.getAttribute(), null, "hasRightSideOperand", null, 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_AttributeCategory(), this.getAttributeCategory(), "attributeCategory", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_IsAttributeExistingProperty(), this.getAnnProperty(), null, "isAttributeExistingProperty", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Value(), ecorePackage.getEString(), "value", null, 0, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_IsAttributeNewProperty(), this.getNewProperty(), null, "isAttributeNewProperty", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_IsAttributeResource(), this.getAnnResource(), null, "isAttributeResource", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annPropertyEClass, AnnProperty.class, "AnnProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnProperty_AnnotatesProperty(), theServiceCIMPackage.getProperty(), null, "annotatesProperty", null, 1, 1, AnnProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceAccessRuleEClass, ResourceAccessRule.class, "ResourceAccessRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceAccessRule_HasMatchCondition(), this.getCondition(), null, "hasMatchCondition", null, 1, -1, ResourceAccessRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceAccessRule_Name(), ecorePackage.getEString(), "name", null, 1, 1, ResourceAccessRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceAccessRule_RuleType(), this.getRuleType(), "ruleType", null, 1, 1, ResourceAccessRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceAccessRule_HasAllowedAction(), this.getAllowedAction(), null, "hasAllowedAction", null, 1, -1, ResourceAccessRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authorizationSubjectEClass, AuthorizationSubject.class, "AuthorizationSubject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuthorizationSubject_IsAuthorizationSubject(), this.getAnnResource(), null, "isAuthorizationSubject", null, 1, 1, AuthorizationSubject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annCRUDActivityEClass, AnnCRUDActivity.class, "AnnCRUDActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnCRUDActivity_AnnotatesCRUDActivity(), theServiceCIMPackage.getCRUDActivity(), null, "annotatesCRUDActivity", null, 1, 1, AnnCRUDActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allowedActionEClass, AllowedAction.class, "AllowedAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllowedAction_IsAllowedAction(), this.getAnnCRUDActivity(), null, "isAllowedAction", null, 1, 1, AllowedAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(newPropertyEClass, NewProperty.class, "NewProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNewProperty_BelongsToResource(), this.getAnnResource(), null, "belongsToResource", null, 1, 1, NewProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewProperty_Name(), ecorePackage.getEString(), "name", null, 1, 1, NewProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewProperty_Type(), ecorePackage.getEString(), "type", null, 1, 1, NewProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewProperty_BIsUnique(), ecorePackage.getEBoolean(), "bIsUnique", null, 1, 1, NewProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(combiningAlgorithmEEnum, CombiningAlgorithm.class, "CombiningAlgorithm");
		addEEnumLiteral(combiningAlgorithmEEnum, CombiningAlgorithm.DENY_OVERRIDES);
		addEEnumLiteral(combiningAlgorithmEEnum, CombiningAlgorithm.PERMIT_OVERRIDES);
		addEEnumLiteral(combiningAlgorithmEEnum, CombiningAlgorithm.DENY_UNLESS_PERMIT);
		addEEnumLiteral(combiningAlgorithmEEnum, CombiningAlgorithm.PERMIT_UNLESS_DENY);

		initEEnum(operatorEEnum, Operator.class, "Operator");
		addEEnumLiteral(operatorEEnum, Operator.EQUAL);
		addEEnumLiteral(operatorEEnum, Operator.GREATER_THAN);
		addEEnumLiteral(operatorEEnum, Operator.LESS_THAN);
		addEEnumLiteral(operatorEEnum, Operator.GREATER_THAN_OR_EQUAL);
		addEEnumLiteral(operatorEEnum, Operator.LESS_THAN_OR_EQUAL);
		addEEnumLiteral(operatorEEnum, Operator.NOT_EQUAL);
		addEEnumLiteral(operatorEEnum, Operator.SUBSET);
		addEEnumLiteral(operatorEEnum, Operator.NOT_SUBSET);
		addEEnumLiteral(operatorEEnum, Operator.SET_CONTAINS);
		addEEnumLiteral(operatorEEnum, Operator.SET_NOT_CONTAINS);
		addEEnumLiteral(operatorEEnum, Operator.REGEX);
		addEEnumLiteral(operatorEEnum, Operator.UNDEFINED);

		initEEnum(attributeCategoryEEnum, AttributeCategory.class, "AttributeCategory");
		addEEnumLiteral(attributeCategoryEEnum, AttributeCategory.ACCESS_SUBJECT);
		addEEnumLiteral(attributeCategoryEEnum, AttributeCategory.ACCESSED_RESOURCE);
		addEEnumLiteral(attributeCategoryEEnum, AttributeCategory.PARENT_RESOURCE);
		addEEnumLiteral(attributeCategoryEEnum, AttributeCategory.CHILD_RESOURCE);
		addEEnumLiteral(attributeCategoryEEnum, AttributeCategory.INCLUDED_RESOURCE);
		addEEnumLiteral(attributeCategoryEEnum, AttributeCategory.CONSTANT);

		initEEnum(ruleTypeEEnum, RuleType.class, "RuleType");
		addEEnumLiteral(ruleTypeEEnum, RuleType.PERMIT);
		addEEnumLiteral(ruleTypeEEnum, RuleType.DENY);

		// Create resource
		createResource(eNS_URI);
	}

} //AuthorizationLayerCIMPackageImpl
