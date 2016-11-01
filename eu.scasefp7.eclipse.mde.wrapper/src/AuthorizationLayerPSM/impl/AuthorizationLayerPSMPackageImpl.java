/**
 */
package AuthorizationLayerPSM.impl;

import AnnotationLayerStack.AnnotationLayerStackPackage;

import AnnotationLayerStack.impl.AnnotationLayerStackPackageImpl;

import AuthenticationLayerPSM.AuthenticationLayerPSMPackage;

import AuthenticationLayerPSM.impl.AuthenticationLayerPSMPackageImpl;

import AuthorizationLayerPSM.AllowedAction;
import AuthorizationLayerPSM.AnnHTTPActivity;
import AuthorizationLayerPSM.AnnHTTPActivityHandler;
import AuthorizationLayerPSM.AnnJPAController;
import AuthorizationLayerPSM.AnnJavaAlgoResourceModel;
import AuthorizationLayerPSM.AnnJavaResourceModel;
import AuthorizationLayerPSM.AnnJavaResourceModelManager;
import AuthorizationLayerPSM.AnnPSMComponentProperty;
import AuthorizationLayerPSM.AnnotatedElement;
import AuthorizationLayerPSM.Annotation;
import AuthorizationLayerPSM.AnnotationModel;
import AuthorizationLayerPSM.Attribute;
import AuthorizationLayerPSM.AttributeCategory;
import AuthorizationLayerPSM.AuthorizableResource;
import AuthorizationLayerPSM.AuthorizationDataHandler;
import AuthorizationLayerPSM.AuthorizationLayerPSMFactory;
import AuthorizationLayerPSM.AuthorizationLayerPSMPackage;
import AuthorizationLayerPSM.AuthorizationPerformer;
import AuthorizationLayerPSM.AuthorizationPolicyEvaluator;
import AuthorizationLayerPSM.AuthorizationSubject;
import AuthorizationLayerPSM.CombiningAlgorithm;
import AuthorizationLayerPSM.Condition;
import AuthorizationLayerPSM.NewProperty;
import AuthorizationLayerPSM.Operator;
import AuthorizationLayerPSM.ResourceAccessPolicy;
import AuthorizationLayerPSM.ResourceAccessPolicySet;
import AuthorizationLayerPSM.ResourceAccessRule;
import AuthorizationLayerPSM.RuleType;

import ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage;

import ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl;

import MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage;

import MDEMigratorPSMMetamodel.impl.MDEMigratorPSMMetamodelPackageImpl;

import RESTfulServicePSM.RESTfulServicePSMPackage;

import RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl;

import SearchLayerPSM.SearchLayerPSMPackage;

import SearchLayerPSM.impl.SearchLayerPSMPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AuthorizationLayerPSMPackageImpl extends EPackageImpl implements AuthorizationLayerPSMPackage {
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
	private EClass annotatedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annHTTPActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annPSMComponentPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annJPAControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annHTTPActivityHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annJavaResourceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annJavaResourceModelManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annJavaAlgoResourceModelEClass = null;

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
	private EClass authorizableResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizationPerformerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizationDataHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizationPolicyEvaluatorEClass = null;

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
	private EClass resourceAccessPolicyEClass = null;

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
	private EEnum operatorEEnum = null;

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
	 * @see AuthorizationLayerPSM.AuthorizationLayerPSMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AuthorizationLayerPSMPackageImpl() {
		super(eNS_URI, AuthorizationLayerPSMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AuthorizationLayerPSMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AuthorizationLayerPSMPackage init() {
		if (isInited) return (AuthorizationLayerPSMPackage)EPackage.Registry.INSTANCE.getEPackage(AuthorizationLayerPSMPackage.eNS_URI);

		// Obtain or create and register package
		AuthorizationLayerPSMPackageImpl theAuthorizationLayerPSMPackage = (AuthorizationLayerPSMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AuthorizationLayerPSMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AuthorizationLayerPSMPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		AnnotationLayerStackPackageImpl theAnnotationLayerStackPackage = (AnnotationLayerStackPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AnnotationLayerStackPackage.eNS_URI) instanceof AnnotationLayerStackPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnnotationLayerStackPackage.eNS_URI) : AnnotationLayerStackPackage.eINSTANCE);
		AuthenticationLayerPSMPackageImpl theAuthenticationLayerPSMPackage = (AuthenticationLayerPSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AuthenticationLayerPSMPackage.eNS_URI) instanceof AuthenticationLayerPSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AuthenticationLayerPSMPackage.eNS_URI) : AuthenticationLayerPSMPackage.eINSTANCE);
		RESTfulServicePSMPackageImpl theRESTfulServicePSMPackage = (RESTfulServicePSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RESTfulServicePSMPackage.eNS_URI) instanceof RESTfulServicePSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RESTfulServicePSMPackage.eNS_URI) : RESTfulServicePSMPackage.eINSTANCE);
		SearchLayerPSMPackageImpl theSearchLayerPSMPackage = (SearchLayerPSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SearchLayerPSMPackage.eNS_URI) instanceof SearchLayerPSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SearchLayerPSMPackage.eNS_URI) : SearchLayerPSMPackage.eINSTANCE);
		ExternalServiceLayerPSMPackageImpl theExternalServiceLayerPSMPackage = (ExternalServiceLayerPSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExternalServiceLayerPSMPackage.eNS_URI) instanceof ExternalServiceLayerPSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExternalServiceLayerPSMPackage.eNS_URI) : ExternalServiceLayerPSMPackage.eINSTANCE);
		MDEMigratorPSMMetamodelPackageImpl theMDEMigratorPSMMetamodelPackage = (MDEMigratorPSMMetamodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MDEMigratorPSMMetamodelPackage.eNS_URI) instanceof MDEMigratorPSMMetamodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MDEMigratorPSMMetamodelPackage.eNS_URI) : MDEMigratorPSMMetamodelPackage.eINSTANCE);

		// Create package meta-data objects
		theAuthorizationLayerPSMPackage.createPackageContents();
		theAnnotationLayerStackPackage.createPackageContents();
		theAuthenticationLayerPSMPackage.createPackageContents();
		theRESTfulServicePSMPackage.createPackageContents();
		theSearchLayerPSMPackage.createPackageContents();
		theExternalServiceLayerPSMPackage.createPackageContents();
		theMDEMigratorPSMMetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theAuthorizationLayerPSMPackage.initializePackageContents();
		theAnnotationLayerStackPackage.initializePackageContents();
		theAuthenticationLayerPSMPackage.initializePackageContents();
		theRESTfulServicePSMPackage.initializePackageContents();
		theSearchLayerPSMPackage.initializePackageContents();
		theExternalServiceLayerPSMPackage.initializePackageContents();
		theMDEMigratorPSMMetamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAuthorizationLayerPSMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AuthorizationLayerPSMPackage.eNS_URI, theAuthorizationLayerPSMPackage);
		return theAuthorizationLayerPSMPackage;
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
	public EReference getAnnotationModel_HasAnnotation() {
		return (EReference)annotationModelEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getAnnotationModel_Name() {
		return (EAttribute)annotationModelEClass.getEStructuralFeatures().get(2);
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
	public EClass getAnnotatedElement() {
		return annotatedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnHTTPActivity() {
		return annHTTPActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnHTTPActivity_AnnotatesHTTPActivity() {
		return (EReference)annHTTPActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnPSMComponentProperty() {
		return annPSMComponentPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnPSMComponentProperty_AnnotatesPSMComponentProperty() {
		return (EReference)annPSMComponentPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnJPAController() {
		return annJPAControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnJPAController_AnnotatesJPAController() {
		return (EReference)annJPAControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnHTTPActivityHandler() {
		return annHTTPActivityHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnHTTPActivityHandler_AnnotatesHTTPActivityHandler() {
		return (EReference)annHTTPActivityHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnJavaResourceModel() {
		return annJavaResourceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnJavaResourceModel_AnnotatesJavaResourceModel() {
		return (EReference)annJavaResourceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnJavaResourceModelManager() {
		return annJavaResourceModelManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnJavaResourceModelManager_AnnotatesJavaResourceModelManager() {
		return (EReference)annJavaResourceModelManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnJavaAlgoResourceModel() {
		return annJavaAlgoResourceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnJavaAlgoResourceModel_AnnotatesJavaLagoResourceModel() {
		return (EReference)annJavaAlgoResourceModelEClass.getEStructuralFeatures().get(0);
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
	public EClass getAuthorizableResource() {
		return authorizableResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthorizableResource_IsAuthorizableAlgoModel() {
		return (EReference)authorizableResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthorizableResource_IsAuthorizableResourceModel() {
		return (EReference)authorizableResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthorizableResource_IsAuthorizableModelManager() {
		return (EReference)authorizableResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthorizableResource_HasAuthorizationPerformer() {
		return (EReference)authorizableResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthorizableResource_HasResourceAccessPolicySet() {
		return (EReference)authorizableResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorizableResource_BTrackOwnership() {
		return (EAttribute)authorizableResourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorizationPerformer() {
		return authorizationPerformerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthorizationPerformer_UsesAuthorizationPolicyEvaluator() {
		return (EReference)authorizationPerformerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthorizationPerformer_IsAuthorizationPerformer() {
		return (EReference)authorizationPerformerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorizationDataHandler() {
		return authorizationDataHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthorizationDataHandler_IsAuthorizationDataHandler() {
		return (EReference)authorizationDataHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorizationPolicyEvaluator() {
		return authorizationPolicyEvaluatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthorizationPolicyEvaluator_Accesses() {
		return (EReference)authorizationPolicyEvaluatorEClass.getEStructuralFeatures().get(0);
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
	public EReference getResourceAccessPolicySet_HasResourceAccessPolicySet() {
		return (EReference)resourceAccessPolicySetEClass.getEStructuralFeatures().get(0);
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
	public EClass getResourceAccessPolicy() {
		return resourceAccessPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceAccessPolicy_RuleCombiningAlgorithm() {
		return (EAttribute)resourceAccessPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceAccessPolicy_HasResourceAccessRule() {
		return (EReference)resourceAccessPolicyEClass.getEStructuralFeatures().get(1);
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
	public EClass getResourceAccessRule() {
		return resourceAccessRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceAccessRule_RuleType() {
		return (EAttribute)resourceAccessRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceAccessRule_HasMatchCondition() {
		return (EReference)resourceAccessRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceAccessRule_HasAllowedAction() {
		return (EReference)resourceAccessRuleEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getAttribute_Value() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute_IsAttributeExistingProperty() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getNewProperty_Name() {
		return (EAttribute)newPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNewProperty_Type() {
		return (EAttribute)newPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNewProperty_BIsUnique() {
		return (EAttribute)newPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewProperty_BelongsToResource() {
		return (EReference)newPropertyEClass.getEStructuralFeatures().get(3);
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
	public EEnum getCombiningAlgorithm() {
		return combiningAlgorithmEEnum;
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
	public AuthorizationLayerPSMFactory getAuthorizationLayerPSMFactory() {
		return (AuthorizationLayerPSMFactory)getEFactoryInstance();
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
		createEReference(annotationModelEClass, ANNOTATION_MODEL__HAS_ANNOTATION);
		createEReference(annotationModelEClass, ANNOTATION_MODEL__HAS_ANNOTATED_ELEMENT);
		createEAttribute(annotationModelEClass, ANNOTATION_MODEL__NAME);

		annotationEClass = createEClass(ANNOTATION);

		annotatedElementEClass = createEClass(ANNOTATED_ELEMENT);

		annHTTPActivityEClass = createEClass(ANN_HTTP_ACTIVITY);
		createEReference(annHTTPActivityEClass, ANN_HTTP_ACTIVITY__ANNOTATES_HTTP_ACTIVITY);

		annPSMComponentPropertyEClass = createEClass(ANN_PSM_COMPONENT_PROPERTY);
		createEReference(annPSMComponentPropertyEClass, ANN_PSM_COMPONENT_PROPERTY__ANNOTATES_PSM_COMPONENT_PROPERTY);

		annJPAControllerEClass = createEClass(ANN_JPA_CONTROLLER);
		createEReference(annJPAControllerEClass, ANN_JPA_CONTROLLER__ANNOTATES_JPA_CONTROLLER);

		annHTTPActivityHandlerEClass = createEClass(ANN_HTTP_ACTIVITY_HANDLER);
		createEReference(annHTTPActivityHandlerEClass, ANN_HTTP_ACTIVITY_HANDLER__ANNOTATES_HTTP_ACTIVITY_HANDLER);

		annJavaResourceModelEClass = createEClass(ANN_JAVA_RESOURCE_MODEL);
		createEReference(annJavaResourceModelEClass, ANN_JAVA_RESOURCE_MODEL__ANNOTATES_JAVA_RESOURCE_MODEL);

		annJavaResourceModelManagerEClass = createEClass(ANN_JAVA_RESOURCE_MODEL_MANAGER);
		createEReference(annJavaResourceModelManagerEClass, ANN_JAVA_RESOURCE_MODEL_MANAGER__ANNOTATES_JAVA_RESOURCE_MODEL_MANAGER);

		annJavaAlgoResourceModelEClass = createEClass(ANN_JAVA_ALGO_RESOURCE_MODEL);
		createEReference(annJavaAlgoResourceModelEClass, ANN_JAVA_ALGO_RESOURCE_MODEL__ANNOTATES_JAVA_LAGO_RESOURCE_MODEL);

		authorizationSubjectEClass = createEClass(AUTHORIZATION_SUBJECT);
		createEReference(authorizationSubjectEClass, AUTHORIZATION_SUBJECT__IS_AUTHORIZATION_SUBJECT);

		authorizableResourceEClass = createEClass(AUTHORIZABLE_RESOURCE);
		createEReference(authorizableResourceEClass, AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_ALGO_MODEL);
		createEReference(authorizableResourceEClass, AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_RESOURCE_MODEL);
		createEReference(authorizableResourceEClass, AUTHORIZABLE_RESOURCE__IS_AUTHORIZABLE_MODEL_MANAGER);
		createEReference(authorizableResourceEClass, AUTHORIZABLE_RESOURCE__HAS_AUTHORIZATION_PERFORMER);
		createEReference(authorizableResourceEClass, AUTHORIZABLE_RESOURCE__HAS_RESOURCE_ACCESS_POLICY_SET);
		createEAttribute(authorizableResourceEClass, AUTHORIZABLE_RESOURCE__BTRACK_OWNERSHIP);

		authorizationPerformerEClass = createEClass(AUTHORIZATION_PERFORMER);
		createEReference(authorizationPerformerEClass, AUTHORIZATION_PERFORMER__USES_AUTHORIZATION_POLICY_EVALUATOR);
		createEReference(authorizationPerformerEClass, AUTHORIZATION_PERFORMER__IS_AUTHORIZATION_PERFORMER);

		authorizationDataHandlerEClass = createEClass(AUTHORIZATION_DATA_HANDLER);
		createEReference(authorizationDataHandlerEClass, AUTHORIZATION_DATA_HANDLER__IS_AUTHORIZATION_DATA_HANDLER);

		authorizationPolicyEvaluatorEClass = createEClass(AUTHORIZATION_POLICY_EVALUATOR);
		createEReference(authorizationPolicyEvaluatorEClass, AUTHORIZATION_POLICY_EVALUATOR__ACCESSES);

		resourceAccessPolicySetEClass = createEClass(RESOURCE_ACCESS_POLICY_SET);
		createEReference(resourceAccessPolicySetEClass, RESOURCE_ACCESS_POLICY_SET__HAS_RESOURCE_ACCESS_POLICY_SET);
		createEAttribute(resourceAccessPolicySetEClass, RESOURCE_ACCESS_POLICY_SET__POLICY_COMBINING_ALGORITHM);
		createEReference(resourceAccessPolicySetEClass, RESOURCE_ACCESS_POLICY_SET__HAS_RESOURCE_ACCESS_POLICY);

		resourceAccessPolicyEClass = createEClass(RESOURCE_ACCESS_POLICY);
		createEAttribute(resourceAccessPolicyEClass, RESOURCE_ACCESS_POLICY__RULE_COMBINING_ALGORITHM);
		createEReference(resourceAccessPolicyEClass, RESOURCE_ACCESS_POLICY__HAS_RESOURCE_ACCESS_RULE);
		createEReference(resourceAccessPolicyEClass, RESOURCE_ACCESS_POLICY__HAS_APPLY_CONDITION);

		resourceAccessRuleEClass = createEClass(RESOURCE_ACCESS_RULE);
		createEAttribute(resourceAccessRuleEClass, RESOURCE_ACCESS_RULE__RULE_TYPE);
		createEReference(resourceAccessRuleEClass, RESOURCE_ACCESS_RULE__HAS_MATCH_CONDITION);
		createEReference(resourceAccessRuleEClass, RESOURCE_ACCESS_RULE__HAS_ALLOWED_ACTION);

		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__OPERATOR);
		createEReference(conditionEClass, CONDITION__HAS_LEFT_SIDE_OPERAND);
		createEReference(conditionEClass, CONDITION__HAS_RIGHT_SIDE_OPERAND);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__ATTRIBUTE_CATEGORY);
		createEAttribute(attributeEClass, ATTRIBUTE__VALUE);
		createEReference(attributeEClass, ATTRIBUTE__IS_ATTRIBUTE_EXISTING_PROPERTY);
		createEReference(attributeEClass, ATTRIBUTE__IS_ATTRIBUTE_NEW_PROPERTY);

		allowedActionEClass = createEClass(ALLOWED_ACTION);
		createEReference(allowedActionEClass, ALLOWED_ACTION__IS_ALLOWED_ACTION);

		newPropertyEClass = createEClass(NEW_PROPERTY);
		createEAttribute(newPropertyEClass, NEW_PROPERTY__NAME);
		createEAttribute(newPropertyEClass, NEW_PROPERTY__TYPE);
		createEAttribute(newPropertyEClass, NEW_PROPERTY__BIS_UNIQUE);
		createEReference(newPropertyEClass, NEW_PROPERTY__BELONGS_TO_RESOURCE);

		// Create enums
		operatorEEnum = createEEnum(OPERATOR);
		combiningAlgorithmEEnum = createEEnum(COMBINING_ALGORITHM);
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
		RESTfulServicePSMPackage theRESTfulServicePSMPackage = (RESTfulServicePSMPackage)EPackage.Registry.INSTANCE.getEPackage(RESTfulServicePSMPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		annHTTPActivityEClass.getESuperTypes().add(this.getAnnotatedElement());
		annPSMComponentPropertyEClass.getESuperTypes().add(this.getAnnotatedElement());
		annJPAControllerEClass.getESuperTypes().add(this.getAnnotatedElement());
		annHTTPActivityHandlerEClass.getESuperTypes().add(this.getAnnotatedElement());
		annJavaResourceModelEClass.getESuperTypes().add(this.getAnnotatedElement());
		annJavaResourceModelManagerEClass.getESuperTypes().add(this.getAnnotatedElement());
		annJavaAlgoResourceModelEClass.getESuperTypes().add(this.getAnnotatedElement());
		authorizationSubjectEClass.getESuperTypes().add(this.getAnnotation());
		authorizableResourceEClass.getESuperTypes().add(this.getAnnotation());
		authorizationPerformerEClass.getESuperTypes().add(this.getAnnotation());
		authorizationDataHandlerEClass.getESuperTypes().add(this.getAnnotation());
		authorizationPolicyEvaluatorEClass.getESuperTypes().add(this.getAnnotation());
		newPropertyEClass.getESuperTypes().add(this.getAnnotation());

		// Initialize classes, features, and operations; add parameters
		initEClass(annotationModelEClass, AnnotationModel.class, "AnnotationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotationModel_HasAnnotation(), this.getAnnotation(), null, "hasAnnotation", null, 1, -1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationModel_HasAnnotatedElement(), this.getAnnotatedElement(), null, "hasAnnotatedElement", null, 1, -1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(annotatedElementEClass, AnnotatedElement.class, "AnnotatedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(annHTTPActivityEClass, AnnHTTPActivity.class, "AnnHTTPActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnHTTPActivity_AnnotatesHTTPActivity(), theRESTfulServicePSMPackage.getHTTPActivity(), null, "annotatesHTTPActivity", null, 1, 1, AnnHTTPActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annPSMComponentPropertyEClass, AnnPSMComponentProperty.class, "AnnPSMComponentProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnPSMComponentProperty_AnnotatesPSMComponentProperty(), theRESTfulServicePSMPackage.getPSMComponentProperty(), null, "annotatesPSMComponentProperty", null, 0, 1, AnnPSMComponentProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annJPAControllerEClass, AnnJPAController.class, "AnnJPAController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnJPAController_AnnotatesJPAController(), theRESTfulServicePSMPackage.getHibernateController(), null, "annotatesJPAController", null, 0, 1, AnnJPAController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annHTTPActivityHandlerEClass, AnnHTTPActivityHandler.class, "AnnHTTPActivityHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnHTTPActivityHandler_AnnotatesHTTPActivityHandler(), theRESTfulServicePSMPackage.getHTTPActivityHandler(), null, "annotatesHTTPActivityHandler", null, 0, 1, AnnHTTPActivityHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annJavaResourceModelEClass, AnnJavaResourceModel.class, "AnnJavaResourceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnJavaResourceModel_AnnotatesJavaResourceModel(), theRESTfulServicePSMPackage.getJavaResourceModel(), null, "annotatesJavaResourceModel", null, 0, 1, AnnJavaResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annJavaResourceModelManagerEClass, AnnJavaResourceModelManager.class, "AnnJavaResourceModelManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnJavaResourceModelManager_AnnotatesJavaResourceModelManager(), theRESTfulServicePSMPackage.getJavaResourceModelManager(), null, "annotatesJavaResourceModelManager", null, 0, 1, AnnJavaResourceModelManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annJavaAlgoResourceModelEClass, AnnJavaAlgoResourceModel.class, "AnnJavaAlgoResourceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnJavaAlgoResourceModel_AnnotatesJavaLagoResourceModel(), theRESTfulServicePSMPackage.getJavaAlgoResourceModel(), null, "annotatesJavaLagoResourceModel", null, 0, 1, AnnJavaAlgoResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authorizationSubjectEClass, AuthorizationSubject.class, "AuthorizationSubject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuthorizationSubject_IsAuthorizationSubject(), this.getAnnJavaResourceModel(), null, "isAuthorizationSubject", null, 1, 1, AuthorizationSubject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authorizableResourceEClass, AuthorizableResource.class, "AuthorizableResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuthorizableResource_IsAuthorizableAlgoModel(), this.getAnnJavaAlgoResourceModel(), null, "isAuthorizableAlgoModel", null, 0, 1, AuthorizableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthorizableResource_IsAuthorizableResourceModel(), this.getAnnJavaResourceModel(), null, "isAuthorizableResourceModel", null, 0, 1, AuthorizableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthorizableResource_IsAuthorizableModelManager(), this.getAnnJavaResourceModelManager(), null, "isAuthorizableModelManager", null, 0, 1, AuthorizableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthorizableResource_HasAuthorizationPerformer(), this.getAuthorizationPerformer(), null, "hasAuthorizationPerformer", null, 1, 1, AuthorizableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthorizableResource_HasResourceAccessPolicySet(), this.getResourceAccessPolicySet(), null, "hasResourceAccessPolicySet", null, 1, 1, AuthorizableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthorizableResource_BTrackOwnership(), ecorePackage.getEBoolean(), "bTrackOwnership", null, 1, 1, AuthorizableResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authorizationPerformerEClass, AuthorizationPerformer.class, "AuthorizationPerformer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuthorizationPerformer_UsesAuthorizationPolicyEvaluator(), this.getAuthorizationPolicyEvaluator(), null, "usesAuthorizationPolicyEvaluator", null, 1, 1, AuthorizationPerformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthorizationPerformer_IsAuthorizationPerformer(), this.getAnnHTTPActivityHandler(), null, "isAuthorizationPerformer", null, 1, -1, AuthorizationPerformer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authorizationDataHandlerEClass, AuthorizationDataHandler.class, "AuthorizationDataHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuthorizationDataHandler_IsAuthorizationDataHandler(), this.getAnnJPAController(), null, "isAuthorizationDataHandler", null, 1, 1, AuthorizationDataHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authorizationPolicyEvaluatorEClass, AuthorizationPolicyEvaluator.class, "AuthorizationPolicyEvaluator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuthorizationPolicyEvaluator_Accesses(), this.getAuthorizationDataHandler(), null, "accesses", null, 1, 1, AuthorizationPolicyEvaluator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceAccessPolicySetEClass, ResourceAccessPolicySet.class, "ResourceAccessPolicySet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceAccessPolicySet_HasResourceAccessPolicySet(), this.getResourceAccessPolicySet(), null, "hasResourceAccessPolicySet", null, 0, -1, ResourceAccessPolicySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceAccessPolicySet_PolicyCombiningAlgorithm(), this.getCombiningAlgorithm(), "policyCombiningAlgorithm", null, 1, 1, ResourceAccessPolicySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceAccessPolicySet_HasResourceAccessPolicy(), this.getResourceAccessPolicy(), null, "hasResourceAccessPolicy", null, 1, -1, ResourceAccessPolicySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceAccessPolicyEClass, ResourceAccessPolicy.class, "ResourceAccessPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceAccessPolicy_RuleCombiningAlgorithm(), this.getCombiningAlgorithm(), "ruleCombiningAlgorithm", null, 1, 1, ResourceAccessPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceAccessPolicy_HasResourceAccessRule(), this.getResourceAccessRule(), null, "hasResourceAccessRule", null, 1, -1, ResourceAccessPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceAccessPolicy_HasApplyCondition(), this.getCondition(), null, "hasApplyCondition", null, 0, -1, ResourceAccessPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceAccessRuleEClass, ResourceAccessRule.class, "ResourceAccessRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceAccessRule_RuleType(), this.getRuleType(), "ruleType", null, 1, 1, ResourceAccessRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceAccessRule_HasMatchCondition(), this.getCondition(), null, "hasMatchCondition", null, 1, -1, ResourceAccessRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceAccessRule_HasAllowedAction(), this.getAllowedAction(), null, "hasAllowedAction", null, 1, -1, ResourceAccessRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_Operator(), this.getOperator(), "operator", "UNDEFINED", 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_HasLeftSideOperand(), this.getAttribute(), null, "hasLeftSideOperand", null, 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondition_HasRightSideOperand(), this.getAttribute(), null, "hasRightSideOperand", null, 1, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_AttributeCategory(), this.getAttributeCategory(), "attributeCategory", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Value(), ecorePackage.getEString(), "value", null, 0, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_IsAttributeExistingProperty(), this.getAnnPSMComponentProperty(), null, "isAttributeExistingProperty", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_IsAttributeNewProperty(), this.getNewProperty(), null, "isAttributeNewProperty", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allowedActionEClass, AllowedAction.class, "AllowedAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllowedAction_IsAllowedAction(), this.getAnnHTTPActivity(), null, "isAllowedAction", null, 1, 1, AllowedAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(newPropertyEClass, NewProperty.class, "NewProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNewProperty_Name(), ecorePackage.getEString(), "name", null, 1, 1, NewProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewProperty_Type(), ecorePackage.getEString(), "type", null, 1, 1, NewProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewProperty_BIsUnique(), theXMLTypePackage.getBoolean(), "bIsUnique", null, 1, 1, NewProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNewProperty_BelongsToResource(), this.getAnnJavaResourceModel(), null, "belongsToResource", null, 1, 1, NewProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
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

		initEEnum(combiningAlgorithmEEnum, CombiningAlgorithm.class, "CombiningAlgorithm");
		addEEnumLiteral(combiningAlgorithmEEnum, CombiningAlgorithm.DENY_OVERRIDES);
		addEEnumLiteral(combiningAlgorithmEEnum, CombiningAlgorithm.PERMIT_OVERRIDES);
		addEEnumLiteral(combiningAlgorithmEEnum, CombiningAlgorithm.DENY_UNLESS_PERMIT);
		addEEnumLiteral(combiningAlgorithmEEnum, CombiningAlgorithm.PERMIT_UNLESS_DENY);

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

} //AuthorizationLayerPSMPackageImpl
