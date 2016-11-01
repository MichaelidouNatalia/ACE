/**
 */
package ExternalServiceLayerPSM.impl;

import AnnotationLayerStack.AnnotationLayerStackPackage;

import AnnotationLayerStack.impl.AnnotationLayerStackPackageImpl;

import AuthenticationLayerPSM.AuthenticationLayerPSMPackage;

import AuthenticationLayerPSM.impl.AuthenticationLayerPSMPackageImpl;

import AuthorizationLayerPSM.AuthorizationLayerPSMPackage;

import AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl;

import ExternalServiceLayerPSM.AnnHTTPActivity;
import ExternalServiceLayerPSM.AnnHTTPActivityHandler;
import ExternalServiceLayerPSM.AnnJavaAlgoController;
import ExternalServiceLayerPSM.AnnJavaAlgoModel;
import ExternalServiceLayerPSM.AnnJavaResourceModel;
import ExternalServiceLayerPSM.AnnotatedElement;
import ExternalServiceLayerPSM.Annotation;
import ExternalServiceLayerPSM.AnnotationModel;
import ExternalServiceLayerPSM.AutoPersistentOutput;
import ExternalServiceLayerPSM.ComplexType;
import ExternalServiceLayerPSM.ComplexTypeProperty;
import ExternalServiceLayerPSM.ExistentJavaModelPersistentOutput;
import ExternalServiceLayerPSM.ExternalServiceLayerPSMFactory;
import ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage;
import ExternalServiceLayerPSM.JavaInputDataModel;
import ExternalServiceLayerPSM.JavaOutputDataModel;
import ExternalServiceLayerPSM.JavaRESTClientController;
import ExternalServiceLayerPSM.JavaRESTClientHTTPActivity;
import ExternalServiceLayerPSM.JavaRESTClientHTTPActivityHandler;
import ExternalServiceLayerPSM.JavaRESTClientModel;
import ExternalServiceLayerPSM.NonPersistentOutput;
import ExternalServiceLayerPSM.Property;
import ExternalServiceLayerPSM.QueryParam;
import ExternalServiceLayerPSM.Representation;

import MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage;

import MDEMigratorPSMMetamodel.impl.MDEMigratorPSMMetamodelPackageImpl;

import RESTfulServicePSM.RESTfulServicePSMPackage;

import RESTfulServicePSM.impl.RESTfulServicePSMPackageImpl;

import SearchLayerPSM.SearchLayerPSMPackage;

import SearchLayerPSM.impl.SearchLayerPSMPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalServiceLayerPSMPackageImpl extends EPackageImpl implements ExternalServiceLayerPSMPackage {
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
	private EClass annotatedElementEClass = null;

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
	private EClass annJavaAlgoModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annJavaAlgoControllerEClass = null;

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
	private EClass javaRESTClientControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaRESTClientHTTPActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaRESTClientHTTPActivityHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaRESTClientModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaInputDataModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaOutputDataModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass representationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonPersistentOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autoPersistentOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existentJavaModelPersistentOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexTypePropertyEClass = null;

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
	 * @see ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExternalServiceLayerPSMPackageImpl() {
		super(eNS_URI, ExternalServiceLayerPSMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExternalServiceLayerPSMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExternalServiceLayerPSMPackage init() {
		if (isInited) return (ExternalServiceLayerPSMPackage)EPackage.Registry.INSTANCE.getEPackage(ExternalServiceLayerPSMPackage.eNS_URI);

		// Obtain or create and register package
		ExternalServiceLayerPSMPackageImpl theExternalServiceLayerPSMPackage = (ExternalServiceLayerPSMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExternalServiceLayerPSMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExternalServiceLayerPSMPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AnnotationLayerStackPackageImpl theAnnotationLayerStackPackage = (AnnotationLayerStackPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AnnotationLayerStackPackage.eNS_URI) instanceof AnnotationLayerStackPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnnotationLayerStackPackage.eNS_URI) : AnnotationLayerStackPackage.eINSTANCE);
		AuthenticationLayerPSMPackageImpl theAuthenticationLayerPSMPackage = (AuthenticationLayerPSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AuthenticationLayerPSMPackage.eNS_URI) instanceof AuthenticationLayerPSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AuthenticationLayerPSMPackage.eNS_URI) : AuthenticationLayerPSMPackage.eINSTANCE);
		RESTfulServicePSMPackageImpl theRESTfulServicePSMPackage = (RESTfulServicePSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RESTfulServicePSMPackage.eNS_URI) instanceof RESTfulServicePSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RESTfulServicePSMPackage.eNS_URI) : RESTfulServicePSMPackage.eINSTANCE);
		SearchLayerPSMPackageImpl theSearchLayerPSMPackage = (SearchLayerPSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SearchLayerPSMPackage.eNS_URI) instanceof SearchLayerPSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SearchLayerPSMPackage.eNS_URI) : SearchLayerPSMPackage.eINSTANCE);
		AuthorizationLayerPSMPackageImpl theAuthorizationLayerPSMPackage = (AuthorizationLayerPSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AuthorizationLayerPSMPackage.eNS_URI) instanceof AuthorizationLayerPSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AuthorizationLayerPSMPackage.eNS_URI) : AuthorizationLayerPSMPackage.eINSTANCE);
		MDEMigratorPSMMetamodelPackageImpl theMDEMigratorPSMMetamodelPackage = (MDEMigratorPSMMetamodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MDEMigratorPSMMetamodelPackage.eNS_URI) instanceof MDEMigratorPSMMetamodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MDEMigratorPSMMetamodelPackage.eNS_URI) : MDEMigratorPSMMetamodelPackage.eINSTANCE);

		// Create package meta-data objects
		theExternalServiceLayerPSMPackage.createPackageContents();
		theAnnotationLayerStackPackage.createPackageContents();
		theAuthenticationLayerPSMPackage.createPackageContents();
		theRESTfulServicePSMPackage.createPackageContents();
		theSearchLayerPSMPackage.createPackageContents();
		theAuthorizationLayerPSMPackage.createPackageContents();
		theMDEMigratorPSMMetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theExternalServiceLayerPSMPackage.initializePackageContents();
		theAnnotationLayerStackPackage.initializePackageContents();
		theAuthenticationLayerPSMPackage.initializePackageContents();
		theRESTfulServicePSMPackage.initializePackageContents();
		theSearchLayerPSMPackage.initializePackageContents();
		theAuthorizationLayerPSMPackage.initializePackageContents();
		theMDEMigratorPSMMetamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExternalServiceLayerPSMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExternalServiceLayerPSMPackage.eNS_URI, theExternalServiceLayerPSMPackage);
		return theExternalServiceLayerPSMPackage;
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
	public EReference getAnnotationModel_HasAnnotatedElement() {
		return (EReference)annotationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationModel_HasAnnotation() {
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
	public EClass getAnnotatedElement() {
		return annotatedElementEClass;
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
	public EClass getAnnJavaAlgoModel() {
		return annJavaAlgoModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnJavaAlgoModel_AnnotatesJavaAlgoModel() {
		return (EReference)annJavaAlgoModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnJavaAlgoController() {
		return annJavaAlgoControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnJavaAlgoController_AnnotatesJavaAlgoController() {
		return (EReference)annJavaAlgoControllerEClass.getEStructuralFeatures().get(0);
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
	public EClass getJavaRESTClientController() {
		return javaRESTClientControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaRESTClientController_HasJavaRESTClientHTTPActivity() {
		return (EReference)javaRESTClientControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaRESTClientController_IsJavaRESTClientController() {
		return (EReference)javaRESTClientControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaRESTClientController_HasAssociatedModel() {
		return (EReference)javaRESTClientControllerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaRESTClientController_HasComplexTypes() {
		return (EReference)javaRESTClientControllerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaRESTClientHTTPActivity() {
		return javaRESTClientHTTPActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaRESTClientHTTPActivity_HasJavaRESTClientHTTPActivityHandler() {
		return (EReference)javaRESTClientHTTPActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaRESTClientHTTPActivity_HasQueryParam() {
		return (EReference)javaRESTClientHTTPActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaRESTClientHTTPActivity_IsJavaRESTClientHTTPActivity() {
		return (EReference)javaRESTClientHTTPActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaRESTClientHTTPActivityHandler() {
		return javaRESTClientHTTPActivityHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaRESTClientHTTPActivityHandler_IsJavaRESTClientHTTPActivityHandler() {
		return (EReference)javaRESTClientHTTPActivityHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaRESTClientHTTPActivityHandler_TargetServiceURL() {
		return (EAttribute)javaRESTClientHTTPActivityHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaRESTClientHTTPActivityHandler_HTTPVerb() {
		return (EAttribute)javaRESTClientHTTPActivityHandlerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaRESTClientModel() {
		return javaRESTClientModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaRESTClientModel_HasJavaInputModel() {
		return (EReference)javaRESTClientModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaRESTClientModel_HasJavaOutputModel() {
		return (EReference)javaRESTClientModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaRESTClientModel_IsJavaRESTClientModel() {
		return (EReference)javaRESTClientModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryParam() {
		return queryParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParam_Name() {
		return (EAttribute)queryParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParam_Type() {
		return (EAttribute)queryParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParam_IsAuthToken() {
		return (EAttribute)queryParamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParam_AuthTokenToURL() {
		return (EAttribute)queryParamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaInputDataModel() {
		return javaInputDataModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaInputDataModel_HasInputProperty() {
		return (EReference)javaInputDataModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaInputDataModel_HasInputRepresentation() {
		return (EReference)javaInputDataModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaOutputDataModel() {
		return javaOutputDataModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaOutputDataModel_HasOutputProperty() {
		return (EReference)javaOutputDataModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaOutputDataModel_HasOutputRepresentation() {
		return (EReference)javaOutputDataModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepresentation() {
		return representationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepresentation_Name() {
		return (EAttribute)representationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Name() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Type() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsUnique() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_HasPrimitiveType() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_HasComplexType() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonPersistentOutput() {
		return nonPersistentOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutoPersistentOutput() {
		return autoPersistentOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExistentJavaModelPersistentOutput() {
		return existentJavaModelPersistentOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExistentJavaModelPersistentOutput_IsExistentJavaModelPersistentOutput() {
		return (EReference)existentJavaModelPersistentOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexType() {
		return complexTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexType_ComplexTypeName() {
		return (EAttribute)complexTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexType_HasComplexTypeProperties() {
		return (EReference)complexTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexTypeProperty() {
		return complexTypePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexTypeProperty_Name() {
		return (EAttribute)complexTypePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexTypeProperty_IsUnique() {
		return (EAttribute)complexTypePropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexTypeProperty_Type() {
		return (EAttribute)complexTypePropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexTypeProperty_HasPrimitiveType() {
		return (EAttribute)complexTypePropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexTypeProperty_PropertyHasComplexType() {
		return (EReference)complexTypePropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalServiceLayerPSMFactory getExternalServiceLayerPSMFactory() {
		return (ExternalServiceLayerPSMFactory)getEFactoryInstance();
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
		createEReference(annotationModelEClass, ANNOTATION_MODEL__HAS_ANNOTATED_ELEMENT);
		createEReference(annotationModelEClass, ANNOTATION_MODEL__HAS_ANNOTATION);
		createEAttribute(annotationModelEClass, ANNOTATION_MODEL__NAME);

		annotatedElementEClass = createEClass(ANNOTATED_ELEMENT);

		annotationEClass = createEClass(ANNOTATION);

		annJavaAlgoModelEClass = createEClass(ANN_JAVA_ALGO_MODEL);
		createEReference(annJavaAlgoModelEClass, ANN_JAVA_ALGO_MODEL__ANNOTATES_JAVA_ALGO_MODEL);

		annJavaAlgoControllerEClass = createEClass(ANN_JAVA_ALGO_CONTROLLER);
		createEReference(annJavaAlgoControllerEClass, ANN_JAVA_ALGO_CONTROLLER__ANNOTATES_JAVA_ALGO_CONTROLLER);

		annHTTPActivityEClass = createEClass(ANN_HTTP_ACTIVITY);
		createEReference(annHTTPActivityEClass, ANN_HTTP_ACTIVITY__ANNOTATES_HTTP_ACTIVITY);

		annHTTPActivityHandlerEClass = createEClass(ANN_HTTP_ACTIVITY_HANDLER);
		createEReference(annHTTPActivityHandlerEClass, ANN_HTTP_ACTIVITY_HANDLER__ANNOTATES_HTTP_ACTIVITY_HANDLER);

		annJavaResourceModelEClass = createEClass(ANN_JAVA_RESOURCE_MODEL);
		createEReference(annJavaResourceModelEClass, ANN_JAVA_RESOURCE_MODEL__ANNOTATES_JAVA_RESOURCE_MODEL);

		javaRESTClientControllerEClass = createEClass(JAVA_REST_CLIENT_CONTROLLER);
		createEReference(javaRESTClientControllerEClass, JAVA_REST_CLIENT_CONTROLLER__HAS_JAVA_REST_CLIENT_HTTP_ACTIVITY);
		createEReference(javaRESTClientControllerEClass, JAVA_REST_CLIENT_CONTROLLER__IS_JAVA_REST_CLIENT_CONTROLLER);
		createEReference(javaRESTClientControllerEClass, JAVA_REST_CLIENT_CONTROLLER__HAS_ASSOCIATED_MODEL);
		createEReference(javaRESTClientControllerEClass, JAVA_REST_CLIENT_CONTROLLER__HAS_COMPLEX_TYPES);

		javaRESTClientHTTPActivityEClass = createEClass(JAVA_REST_CLIENT_HTTP_ACTIVITY);
		createEReference(javaRESTClientHTTPActivityEClass, JAVA_REST_CLIENT_HTTP_ACTIVITY__HAS_JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER);
		createEReference(javaRESTClientHTTPActivityEClass, JAVA_REST_CLIENT_HTTP_ACTIVITY__HAS_QUERY_PARAM);
		createEReference(javaRESTClientHTTPActivityEClass, JAVA_REST_CLIENT_HTTP_ACTIVITY__IS_JAVA_REST_CLIENT_HTTP_ACTIVITY);

		javaRESTClientHTTPActivityHandlerEClass = createEClass(JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER);
		createEReference(javaRESTClientHTTPActivityHandlerEClass, JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER__IS_JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER);
		createEAttribute(javaRESTClientHTTPActivityHandlerEClass, JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER__TARGET_SERVICE_URL);
		createEAttribute(javaRESTClientHTTPActivityHandlerEClass, JAVA_REST_CLIENT_HTTP_ACTIVITY_HANDLER__HTTP_VERB);

		javaRESTClientModelEClass = createEClass(JAVA_REST_CLIENT_MODEL);
		createEReference(javaRESTClientModelEClass, JAVA_REST_CLIENT_MODEL__HAS_JAVA_INPUT_MODEL);
		createEReference(javaRESTClientModelEClass, JAVA_REST_CLIENT_MODEL__HAS_JAVA_OUTPUT_MODEL);
		createEReference(javaRESTClientModelEClass, JAVA_REST_CLIENT_MODEL__IS_JAVA_REST_CLIENT_MODEL);

		queryParamEClass = createEClass(QUERY_PARAM);
		createEAttribute(queryParamEClass, QUERY_PARAM__NAME);
		createEAttribute(queryParamEClass, QUERY_PARAM__TYPE);
		createEAttribute(queryParamEClass, QUERY_PARAM__IS_AUTH_TOKEN);
		createEAttribute(queryParamEClass, QUERY_PARAM__AUTH_TOKEN_TO_URL);

		javaInputDataModelEClass = createEClass(JAVA_INPUT_DATA_MODEL);
		createEReference(javaInputDataModelEClass, JAVA_INPUT_DATA_MODEL__HAS_INPUT_PROPERTY);
		createEReference(javaInputDataModelEClass, JAVA_INPUT_DATA_MODEL__HAS_INPUT_REPRESENTATION);

		javaOutputDataModelEClass = createEClass(JAVA_OUTPUT_DATA_MODEL);
		createEReference(javaOutputDataModelEClass, JAVA_OUTPUT_DATA_MODEL__HAS_OUTPUT_PROPERTY);
		createEReference(javaOutputDataModelEClass, JAVA_OUTPUT_DATA_MODEL__HAS_OUTPUT_REPRESENTATION);

		representationEClass = createEClass(REPRESENTATION);
		createEAttribute(representationEClass, REPRESENTATION__NAME);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__NAME);
		createEAttribute(propertyEClass, PROPERTY__TYPE);
		createEAttribute(propertyEClass, PROPERTY__IS_UNIQUE);
		createEAttribute(propertyEClass, PROPERTY__HAS_PRIMITIVE_TYPE);
		createEReference(propertyEClass, PROPERTY__HAS_COMPLEX_TYPE);

		nonPersistentOutputEClass = createEClass(NON_PERSISTENT_OUTPUT);

		autoPersistentOutputEClass = createEClass(AUTO_PERSISTENT_OUTPUT);

		existentJavaModelPersistentOutputEClass = createEClass(EXISTENT_JAVA_MODEL_PERSISTENT_OUTPUT);
		createEReference(existentJavaModelPersistentOutputEClass, EXISTENT_JAVA_MODEL_PERSISTENT_OUTPUT__IS_EXISTENT_JAVA_MODEL_PERSISTENT_OUTPUT);

		complexTypeEClass = createEClass(COMPLEX_TYPE);
		createEAttribute(complexTypeEClass, COMPLEX_TYPE__COMPLEX_TYPE_NAME);
		createEReference(complexTypeEClass, COMPLEX_TYPE__HAS_COMPLEX_TYPE_PROPERTIES);

		complexTypePropertyEClass = createEClass(COMPLEX_TYPE_PROPERTY);
		createEAttribute(complexTypePropertyEClass, COMPLEX_TYPE_PROPERTY__NAME);
		createEAttribute(complexTypePropertyEClass, COMPLEX_TYPE_PROPERTY__IS_UNIQUE);
		createEAttribute(complexTypePropertyEClass, COMPLEX_TYPE_PROPERTY__TYPE);
		createEAttribute(complexTypePropertyEClass, COMPLEX_TYPE_PROPERTY__HAS_PRIMITIVE_TYPE);
		createEReference(complexTypePropertyEClass, COMPLEX_TYPE_PROPERTY__PROPERTY_HAS_COMPLEX_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		annJavaAlgoModelEClass.getESuperTypes().add(this.getAnnotatedElement());
		annJavaAlgoControllerEClass.getESuperTypes().add(this.getAnnotatedElement());
		annHTTPActivityEClass.getESuperTypes().add(this.getAnnotatedElement());
		annHTTPActivityHandlerEClass.getESuperTypes().add(this.getAnnotatedElement());
		annJavaResourceModelEClass.getESuperTypes().add(this.getAnnotatedElement());
		javaRESTClientControllerEClass.getESuperTypes().add(this.getAnnotation());
		javaRESTClientModelEClass.getESuperTypes().add(this.getAnnotation());
		nonPersistentOutputEClass.getESuperTypes().add(this.getJavaOutputDataModel());
		autoPersistentOutputEClass.getESuperTypes().add(this.getJavaOutputDataModel());
		existentJavaModelPersistentOutputEClass.getESuperTypes().add(this.getJavaOutputDataModel());

		// Initialize classes, features, and operations; add parameters
		initEClass(annotationModelEClass, AnnotationModel.class, "AnnotationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotationModel_HasAnnotatedElement(), this.getAnnotatedElement(), null, "hasAnnotatedElement", null, 1, -1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationModel_HasAnnotation(), this.getAnnotation(), null, "hasAnnotation", null, 1, -1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, AnnotationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotatedElementEClass, AnnotatedElement.class, "AnnotatedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(annJavaAlgoModelEClass, AnnJavaAlgoModel.class, "AnnJavaAlgoModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnJavaAlgoModel_AnnotatesJavaAlgoModel(), theRESTfulServicePSMPackage.getJavaAlgoResourceModel(), null, "annotatesJavaAlgoModel", null, 1, 1, AnnJavaAlgoModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annJavaAlgoControllerEClass, AnnJavaAlgoController.class, "AnnJavaAlgoController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnJavaAlgoController_AnnotatesJavaAlgoController(), theRESTfulServicePSMPackage.getJavaAlgoResourceController(), null, "annotatesJavaAlgoController", null, 1, 1, AnnJavaAlgoController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annHTTPActivityEClass, AnnHTTPActivity.class, "AnnHTTPActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnHTTPActivity_AnnotatesHTTPActivity(), theRESTfulServicePSMPackage.getHTTPActivity(), null, "annotatesHTTPActivity", null, 1, 1, AnnHTTPActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annHTTPActivityHandlerEClass, AnnHTTPActivityHandler.class, "AnnHTTPActivityHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnHTTPActivityHandler_AnnotatesHTTPActivityHandler(), theRESTfulServicePSMPackage.getHTTPActivityHandler(), null, "annotatesHTTPActivityHandler", null, 1, 1, AnnHTTPActivityHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annJavaResourceModelEClass, AnnJavaResourceModel.class, "AnnJavaResourceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnJavaResourceModel_AnnotatesJavaResourceModel(), theRESTfulServicePSMPackage.getJavaResourceModel(), null, "annotatesJavaResourceModel", null, 1, 1, AnnJavaResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaRESTClientControllerEClass, JavaRESTClientController.class, "JavaRESTClientController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJavaRESTClientController_HasJavaRESTClientHTTPActivity(), this.getJavaRESTClientHTTPActivity(), null, "hasJavaRESTClientHTTPActivity", null, 1, 1, JavaRESTClientController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaRESTClientController_IsJavaRESTClientController(), this.getAnnJavaAlgoController(), null, "isJavaRESTClientController", null, 1, 1, JavaRESTClientController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaRESTClientController_HasAssociatedModel(), this.getJavaRESTClientModel(), null, "hasAssociatedModel", null, 1, 1, JavaRESTClientController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaRESTClientController_HasComplexTypes(), this.getComplexType(), null, "hasComplexTypes", null, 0, -1, JavaRESTClientController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaRESTClientHTTPActivityEClass, JavaRESTClientHTTPActivity.class, "JavaRESTClientHTTPActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJavaRESTClientHTTPActivity_HasJavaRESTClientHTTPActivityHandler(), this.getJavaRESTClientHTTPActivityHandler(), null, "hasJavaRESTClientHTTPActivityHandler", null, 1, 1, JavaRESTClientHTTPActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaRESTClientHTTPActivity_HasQueryParam(), this.getQueryParam(), null, "hasQueryParam", null, 0, -1, JavaRESTClientHTTPActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaRESTClientHTTPActivity_IsJavaRESTClientHTTPActivity(), this.getAnnHTTPActivity(), null, "isJavaRESTClientHTTPActivity", null, 1, 1, JavaRESTClientHTTPActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaRESTClientHTTPActivityHandlerEClass, JavaRESTClientHTTPActivityHandler.class, "JavaRESTClientHTTPActivityHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJavaRESTClientHTTPActivityHandler_IsJavaRESTClientHTTPActivityHandler(), this.getAnnHTTPActivityHandler(), null, "isJavaRESTClientHTTPActivityHandler", null, 1, 1, JavaRESTClientHTTPActivityHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaRESTClientHTTPActivityHandler_TargetServiceURL(), ecorePackage.getEString(), "targetServiceURL", null, 1, 1, JavaRESTClientHTTPActivityHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaRESTClientHTTPActivityHandler_HTTPVerb(), ecorePackage.getEString(), "HTTPVerb", null, 1, 1, JavaRESTClientHTTPActivityHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaRESTClientModelEClass, JavaRESTClientModel.class, "JavaRESTClientModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJavaRESTClientModel_HasJavaInputModel(), this.getJavaInputDataModel(), null, "hasJavaInputModel", null, 0, 1, JavaRESTClientModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaRESTClientModel_HasJavaOutputModel(), this.getJavaOutputDataModel(), null, "hasJavaOutputModel", null, 0, 1, JavaRESTClientModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaRESTClientModel_IsJavaRESTClientModel(), this.getAnnJavaAlgoModel(), null, "isJavaRESTClientModel", null, 1, 1, JavaRESTClientModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryParamEClass, QueryParam.class, "QueryParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueryParam_Name(), ecorePackage.getEString(), "name", null, 1, 1, QueryParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryParam_Type(), ecorePackage.getEString(), "type", null, 1, 1, QueryParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryParam_IsAuthToken(), ecorePackage.getEBoolean(), "isAuthToken", null, 0, 1, QueryParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQueryParam_AuthTokenToURL(), ecorePackage.getEString(), "authTokenToURL", null, 0, 1, QueryParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaInputDataModelEClass, JavaInputDataModel.class, "JavaInputDataModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJavaInputDataModel_HasInputProperty(), this.getProperty(), null, "hasInputProperty", null, 1, -1, JavaInputDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaInputDataModel_HasInputRepresentation(), this.getRepresentation(), null, "hasInputRepresentation", null, 1, 1, JavaInputDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaOutputDataModelEClass, JavaOutputDataModel.class, "JavaOutputDataModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJavaOutputDataModel_HasOutputProperty(), this.getProperty(), null, "hasOutputProperty", null, 0, -1, JavaOutputDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaOutputDataModel_HasOutputRepresentation(), this.getRepresentation(), null, "hasOutputRepresentation", null, 1, 1, JavaOutputDataModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(representationEClass, Representation.class, "Representation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepresentation_Name(), ecorePackage.getEString(), "name", null, 1, 1, Representation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Type(), ecorePackage.getEString(), "type", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_IsUnique(), ecorePackage.getEBoolean(), "isUnique", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_HasPrimitiveType(), ecorePackage.getEBoolean(), "hasPrimitiveType", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_HasComplexType(), this.getComplexType(), null, "hasComplexType", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonPersistentOutputEClass, NonPersistentOutput.class, "NonPersistentOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(autoPersistentOutputEClass, AutoPersistentOutput.class, "AutoPersistentOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(existentJavaModelPersistentOutputEClass, ExistentJavaModelPersistentOutput.class, "ExistentJavaModelPersistentOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExistentJavaModelPersistentOutput_IsExistentJavaModelPersistentOutput(), this.getAnnJavaResourceModel(), null, "isExistentJavaModelPersistentOutput", null, 1, 1, ExistentJavaModelPersistentOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexTypeEClass, ComplexType.class, "ComplexType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplexType_ComplexTypeName(), ecorePackage.getEString(), "complexTypeName", null, 0, 1, ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplexType_HasComplexTypeProperties(), this.getComplexTypeProperty(), null, "hasComplexTypeProperties", null, 1, -1, ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexTypePropertyEClass, ComplexTypeProperty.class, "ComplexTypeProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplexTypeProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, ComplexTypeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplexTypeProperty_IsUnique(), ecorePackage.getEBoolean(), "isUnique", null, 0, 1, ComplexTypeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplexTypeProperty_Type(), ecorePackage.getEString(), "type", null, 0, 1, ComplexTypeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplexTypeProperty_HasPrimitiveType(), ecorePackage.getEBoolean(), "hasPrimitiveType", null, 0, 1, ComplexTypeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplexTypeProperty_PropertyHasComplexType(), this.getComplexType(), null, "propertyHasComplexType", null, 0, 1, ComplexTypeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "Eu.fp7.scase", "PSMMetamodel.ecore#/"
		   });
	}

} //ExternalServiceLayerPSMPackageImpl
