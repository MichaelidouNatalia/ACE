/**
 */
package RESTfulServicePSM.impl;

import AnnotationLayerStack.AnnotationLayerStackPackage;

import AnnotationLayerStack.impl.AnnotationLayerStackPackageImpl;

import AuthenticationLayerPSM.AuthenticationLayerPSMPackage;

import AuthenticationLayerPSM.impl.AuthenticationLayerPSMPackageImpl;

import AuthorizationLayerPSM.AuthorizationLayerPSMPackage;

import AuthorizationLayerPSM.impl.AuthorizationLayerPSMPackageImpl;

import ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage;

import ExternalServiceLayerPSM.impl.ExternalServiceLayerPSMPackageImpl;

import MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage;

import MDEMigratorPSMMetamodel.impl.MDEMigratorPSMMetamodelPackageImpl;

import RESTfulServicePSM.FunctionParameter;
import RESTfulServicePSM.HTTPActivity;
import RESTfulServicePSM.HTTPActivityFunctionParameter;
import RESTfulServicePSM.HTTPActivityHandler;
import RESTfulServicePSM.HTTPVerb;
import RESTfulServicePSM.HibernateActivity;
import RESTfulServicePSM.HibernateAnnotation;
import RESTfulServicePSM.HibernateController;
import RESTfulServicePSM.JAXBAnnotation;
import RESTfulServicePSM.JAXRSAnnotation;
import RESTfulServicePSM.JavaAlgoResourceController;
import RESTfulServicePSM.JavaAlgoResourceModel;
import RESTfulServicePSM.JavaFunction;
import RESTfulServicePSM.JavaGetterFunction;
import RESTfulServicePSM.JavaHypermediaFunction;
import RESTfulServicePSM.JavaResourceController;
import RESTfulServicePSM.JavaResourceControllerManager;
import RESTfulServicePSM.JavaResourceModel;
import RESTfulServicePSM.JavaResourceModelManager;
import RESTfulServicePSM.JavaSetterFunction;
import RESTfulServicePSM.LinkType;
import RESTfulServicePSM.MediaType;
import RESTfulServicePSM.PSMComponentProperty;
import RESTfulServicePSM.PSMHypermediaLink;
import RESTfulServicePSM.RESTfulServicePSMFactory;
import RESTfulServicePSM.RESTfulServicePSMPackage;
import RESTfulServicePSM.ServicePSM;

import RESTfulServicePSM.util.RESTfulServicePSMValidator;

import SearchLayerPSM.SearchLayerPSMPackage;

import SearchLayerPSM.impl.SearchLayerPSMPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RESTfulServicePSMPackageImpl extends EPackageImpl implements RESTfulServicePSMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hibernateActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hibernateAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hibernateControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpActivityFunctionParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpActivityHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaAlgoResourceControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaAlgoResourceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaGetterFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaHypermediaFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaResourceControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaResourceControllerManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaResourceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaResourceModelManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass psmComponentPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaSetterFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jaxbAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jaxrsAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass psmHypermediaLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicePSMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum httpVerbEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mediaTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum linkTypeEEnum = null;

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
	 * @see RESTfulServicePSM.RESTfulServicePSMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RESTfulServicePSMPackageImpl() {
		super(eNS_URI, RESTfulServicePSMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RESTfulServicePSMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RESTfulServicePSMPackage init() {
		if (isInited) return (RESTfulServicePSMPackage)EPackage.Registry.INSTANCE.getEPackage(RESTfulServicePSMPackage.eNS_URI);

		// Obtain or create and register package
		RESTfulServicePSMPackageImpl theRESTfulServicePSMPackage = (RESTfulServicePSMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RESTfulServicePSMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RESTfulServicePSMPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AnnotationLayerStackPackageImpl theAnnotationLayerStackPackage = (AnnotationLayerStackPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AnnotationLayerStackPackage.eNS_URI) instanceof AnnotationLayerStackPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AnnotationLayerStackPackage.eNS_URI) : AnnotationLayerStackPackage.eINSTANCE);
		AuthenticationLayerPSMPackageImpl theAuthenticationLayerPSMPackage = (AuthenticationLayerPSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AuthenticationLayerPSMPackage.eNS_URI) instanceof AuthenticationLayerPSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AuthenticationLayerPSMPackage.eNS_URI) : AuthenticationLayerPSMPackage.eINSTANCE);
		SearchLayerPSMPackageImpl theSearchLayerPSMPackage = (SearchLayerPSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SearchLayerPSMPackage.eNS_URI) instanceof SearchLayerPSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SearchLayerPSMPackage.eNS_URI) : SearchLayerPSMPackage.eINSTANCE);
		ExternalServiceLayerPSMPackageImpl theExternalServiceLayerPSMPackage = (ExternalServiceLayerPSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExternalServiceLayerPSMPackage.eNS_URI) instanceof ExternalServiceLayerPSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExternalServiceLayerPSMPackage.eNS_URI) : ExternalServiceLayerPSMPackage.eINSTANCE);
		AuthorizationLayerPSMPackageImpl theAuthorizationLayerPSMPackage = (AuthorizationLayerPSMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AuthorizationLayerPSMPackage.eNS_URI) instanceof AuthorizationLayerPSMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AuthorizationLayerPSMPackage.eNS_URI) : AuthorizationLayerPSMPackage.eINSTANCE);
		MDEMigratorPSMMetamodelPackageImpl theMDEMigratorPSMMetamodelPackage = (MDEMigratorPSMMetamodelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MDEMigratorPSMMetamodelPackage.eNS_URI) instanceof MDEMigratorPSMMetamodelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MDEMigratorPSMMetamodelPackage.eNS_URI) : MDEMigratorPSMMetamodelPackage.eINSTANCE);

		// Create package meta-data objects
		theRESTfulServicePSMPackage.createPackageContents();
		theAnnotationLayerStackPackage.createPackageContents();
		theAuthenticationLayerPSMPackage.createPackageContents();
		theSearchLayerPSMPackage.createPackageContents();
		theExternalServiceLayerPSMPackage.createPackageContents();
		theAuthorizationLayerPSMPackage.createPackageContents();
		theMDEMigratorPSMMetamodelPackage.createPackageContents();

		// Initialize created meta-data
		theRESTfulServicePSMPackage.initializePackageContents();
		theAnnotationLayerStackPackage.initializePackageContents();
		theAuthenticationLayerPSMPackage.initializePackageContents();
		theSearchLayerPSMPackage.initializePackageContents();
		theExternalServiceLayerPSMPackage.initializePackageContents();
		theAuthorizationLayerPSMPackage.initializePackageContents();
		theMDEMigratorPSMMetamodelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theRESTfulServicePSMPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return RESTfulServicePSMValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theRESTfulServicePSMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RESTfulServicePSMPackage.eNS_URI, theRESTfulServicePSMPackage);
		return theRESTfulServicePSMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHibernateActivity() {
		return hibernateActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHibernateActivity_Name() {
		return (EAttribute)hibernateActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHibernateActivity_HibernateActivityHTTPVerb() {
		return (EAttribute)hibernateActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHibernateAnnotation() {
		return hibernateAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHibernateAnnotation_HibernateAnnotationText() {
		return (EAttribute)hibernateAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHibernateController() {
		return hibernateControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHibernateController_HasHibernateActivity() {
		return (EReference)hibernateControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHibernateController_Name() {
		return (EAttribute)hibernateControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHTTPActivity() {
		return httpActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHTTPActivity_IsMappedToHibernateActivity() {
		return (EReference)httpActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHTTPActivity_HasHTTPActivityParameter() {
		return (EReference)httpActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTTPActivity_ActivityHTTPVerb() {
		return (EAttribute)httpActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTTPActivity_Name() {
		return (EAttribute)httpActivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTTPActivity_HTTPActivityURI() {
		return (EAttribute)httpActivityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHTTPActivity_HasHTTPActivityHandler() {
		return (EReference)httpActivityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHTTPActivity_HTTPActivityHasJAXRSAnnotation() {
		return (EReference)httpActivityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHTTPActivityFunctionParameter() {
		return httpActivityFunctionParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHTTPActivityFunctionParameter_HTTPFunctionParameterHasJAXRSAnnotation() {
		return (EReference)httpActivityFunctionParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHTTPActivityHandler() {
		return httpActivityHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHTTPActivityHandler_HasHypermediaFunction() {
		return (EReference)httpActivityHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTTPActivityHandler_Name() {
		return (EAttribute)httpActivityHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHTTPActivityHandler_HandlerHTTPVerb() {
		return (EAttribute)httpActivityHandlerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaAlgoResourceController() {
		return javaAlgoResourceControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaAlgoResourceController_HasAssociatedAlgoModel() {
		return (EReference)javaAlgoResourceControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaAlgoResourceController_JavaAlgoRControllerHasHTTPActivity() {
		return (EReference)javaAlgoResourceControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaAlgoResourceController_Name() {
		return (EAttribute)javaAlgoResourceControllerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaAlgoResourceController_ControllerURI() {
		return (EAttribute)javaAlgoResourceControllerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaAlgoResourceController_ParentName() {
		return (EAttribute)javaAlgoResourceControllerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaAlgoResourceController_AlgoControllerHasJAXRSAnnotation() {
		return (EReference)javaAlgoResourceControllerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaAlgoResourceModel() {
		return javaAlgoResourceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaAlgoResourceModel_JavaAlgoModelHasJAXBAnnotation() {
		return (EReference)javaAlgoResourceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaAlgoResourceModel_JavaAlgoModelHasProperty() {
		return (EReference)javaAlgoResourceModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaAlgoResourceModel_JavaAlgoModelHasSetterFunction() {
		return (EReference)javaAlgoResourceModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaAlgoResourceModel_JavaAlgoModelHasGetterFunction() {
		return (EReference)javaAlgoResourceModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaAlgoResourceModel_Name() {
		return (EAttribute)javaAlgoResourceModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaAlgoResourceModel_ParentName() {
		return (EAttribute)javaAlgoResourceModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaAlgoResourceModel_HasRelatedAlgoModel() {
		return (EReference)javaAlgoResourceModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaAlgoResourceModel_IsRelatedAlgoModel() {
		return (EReference)javaAlgoResourceModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaFunction() {
		return javaFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaFunction_HasFunctionParameter() {
		return (EReference)javaFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaFunction_Name() {
		return (EAttribute)javaFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaGetterFunction() {
		return javaGetterFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaGetterFunction_GetsProperty() {
		return (EReference)javaGetterFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaHypermediaFunction() {
		return javaHypermediaFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaHypermediaFunction_HasPSMHypermediaLink() {
		return (EReference)javaHypermediaFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaResourceController() {
		return javaResourceControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaResourceController_JavaRControllerHasJAXRSAnnotation() {
		return (EReference)javaResourceControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaResourceController_JavaRControllerHasHTTPActivity() {
		return (EReference)javaResourceControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaResourceController_HasAssociatedJavaRModel() {
		return (EReference)javaResourceControllerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaResourceController_Name() {
		return (EAttribute)javaResourceControllerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaResourceController_ControllerURI() {
		return (EAttribute)javaResourceControllerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaResourceController_ParentName() {
		return (EAttribute)javaResourceControllerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaResourceControllerManager() {
		return javaResourceControllerManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaResourceControllerManager_JavaRCManagerHasJAXRSAnnotation() {
		return (EReference)javaResourceControllerManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaResourceControllerManager_JavaRCManagerHasHTTPActivity() {
		return (EReference)javaResourceControllerManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaResourceControllerManager_HasAssociatedRMManager() {
		return (EReference)javaResourceControllerManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaResourceControllerManager_Name() {
		return (EAttribute)javaResourceControllerManagerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaResourceControllerManager_ControllerURI() {
		return (EAttribute)javaResourceControllerManagerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaResourceControllerManager_ParentName() {
		return (EAttribute)javaResourceControllerManagerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaResourceModel() {
		return javaResourceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaResourceModel_JavaRModelHasJAXBAnnotation() {
		return (EReference)javaResourceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaResourceModel_JavaRModelHasProperty() {
		return (EReference)javaResourceModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaResourceModel_HasRelatedJavaRMManager() {
		return (EReference)javaResourceModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaResourceModel_JavaRModelHasHibernateAnnotation() {
		return (EReference)javaResourceModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaResourceModel_JavaRModelHasSetter() {
		return (EReference)javaResourceModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaResourceModel_JavaRModelHasGetter() {
		return (EReference)javaResourceModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaResourceModel_HasRelatedJavaAlgoModel() {
		return (EReference)javaResourceModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaResourceModel_Name() {
		return (EAttribute)javaResourceModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaResourceModel_ParentName() {
		return (EAttribute)javaResourceModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaResourceModelManager() {
		return javaResourceModelManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaResourceModelManager_JavaRMManagerHasJAXBAnnotation() {
		return (EReference)javaResourceModelManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaResourceModelManager_JavaRMManagerHasProperty() {
		return (EReference)javaResourceModelManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaResourceModelManager_HasRelatedJavaRModel() {
		return (EReference)javaResourceModelManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaResourceModelManager_JavaRMManagerHasSetter() {
		return (EReference)javaResourceModelManagerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaResourceModelManager_JavaRMManagerHasGetter() {
		return (EReference)javaResourceModelManagerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaResourceModelManager_Name() {
		return (EAttribute)javaResourceModelManagerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaResourceModelManager_ParentName() {
		return (EAttribute)javaResourceModelManagerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPSMComponentProperty() {
		return psmComponentPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSMComponentProperty_PropertyHasHibernateAnnotation() {
		return (EReference)psmComponentPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPSMComponentProperty_Name() {
		return (EAttribute)psmComponentPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPSMComponentProperty_Type() {
		return (EAttribute)psmComponentPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPSMComponentProperty_BIsUnique() {
		return (EAttribute)psmComponentPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPSMComponentProperty_BIsNamingProperty() {
		return (EAttribute)psmComponentPropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPSMComponentProperty_BIsPrimaryIdentifier() {
		return (EAttribute)psmComponentPropertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaSetterFunction() {
		return javaSetterFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaSetterFunction_SetsProperty() {
		return (EReference)javaSetterFunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJavaSetterFunction_SetterFunctionHasJAXBAnnotation() {
		return (EReference)javaSetterFunctionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJAXBAnnotation() {
		return jaxbAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJAXBAnnotation_JAXBAnnotationText() {
		return (EAttribute)jaxbAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJAXRSAnnotation() {
		return jaxrsAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJAXRSAnnotation_JAXRSAnnotationText() {
		return (EAttribute)jaxrsAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPSMHypermediaLink() {
		return psmHypermediaLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSMHypermediaLink_HasTargetJavaAlgoController() {
		return (EReference)psmHypermediaLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSMHypermediaLink_HasTargetJavaRController() {
		return (EReference)psmHypermediaLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPSMHypermediaLink_HasTargetRCManager() {
		return (EReference)psmHypermediaLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPSMHypermediaLink_LinkHTTPVerb() {
		return (EAttribute)psmHypermediaLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPSMHypermediaLink_LinkType() {
		return (EAttribute)psmHypermediaLinkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServicePSM() {
		return servicePSMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServicePSM_HasJavaRModel() {
		return (EReference)servicePSMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServicePSM_HasJavaRController() {
		return (EReference)servicePSMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServicePSM_HasJavaRCManager() {
		return (EReference)servicePSMEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServicePSM_HasJavaRMManager() {
		return (EReference)servicePSMEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServicePSM_HasJavaAlgoModel() {
		return (EReference)servicePSMEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServicePSM_HasJavaAlgoController() {
		return (EReference)servicePSMEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServicePSM_HasHibernateController() {
		return (EReference)servicePSMEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServicePSM_Name() {
		return (EAttribute)servicePSMEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServicePSM_ServiceOutputPath() {
		return (EAttribute)servicePSMEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServicePSM_ServiceDatabaseIP() {
		return (EAttribute)servicePSMEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServicePSM_ServiceDatabasePort() {
		return (EAttribute)servicePSMEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServicePSM_ServiceDatabaseUsername() {
		return (EAttribute)servicePSMEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServicePSM_ServiceDatabasePassword() {
		return (EAttribute)servicePSMEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServicePSM_ServiceDatabaseType() {
		return (EAttribute)servicePSMEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionParameter() {
		return functionParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionParameter_Name() {
		return (EAttribute)functionParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionParameter_Type() {
		return (EAttribute)functionParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionParameter_BIsUnique() {
		return (EAttribute)functionParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionParameter_BIsReturnParameter() {
		return (EAttribute)functionParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHTTPVerb() {
		return httpVerbEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMediaType() {
		return mediaTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLinkType() {
		return linkTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESTfulServicePSMFactory getRESTfulServicePSMFactory() {
		return (RESTfulServicePSMFactory)getEFactoryInstance();
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
		hibernateActivityEClass = createEClass(HIBERNATE_ACTIVITY);
		createEAttribute(hibernateActivityEClass, HIBERNATE_ACTIVITY__NAME);
		createEAttribute(hibernateActivityEClass, HIBERNATE_ACTIVITY__HIBERNATE_ACTIVITY_HTTP_VERB);

		hibernateAnnotationEClass = createEClass(HIBERNATE_ANNOTATION);
		createEAttribute(hibernateAnnotationEClass, HIBERNATE_ANNOTATION__HIBERNATE_ANNOTATION_TEXT);

		hibernateControllerEClass = createEClass(HIBERNATE_CONTROLLER);
		createEReference(hibernateControllerEClass, HIBERNATE_CONTROLLER__HAS_HIBERNATE_ACTIVITY);
		createEAttribute(hibernateControllerEClass, HIBERNATE_CONTROLLER__NAME);

		httpActivityEClass = createEClass(HTTP_ACTIVITY);
		createEReference(httpActivityEClass, HTTP_ACTIVITY__IS_MAPPED_TO_HIBERNATE_ACTIVITY);
		createEReference(httpActivityEClass, HTTP_ACTIVITY__HAS_HTTP_ACTIVITY_PARAMETER);
		createEAttribute(httpActivityEClass, HTTP_ACTIVITY__ACTIVITY_HTTP_VERB);
		createEAttribute(httpActivityEClass, HTTP_ACTIVITY__NAME);
		createEAttribute(httpActivityEClass, HTTP_ACTIVITY__HTTP_ACTIVITY_URI);
		createEReference(httpActivityEClass, HTTP_ACTIVITY__HAS_HTTP_ACTIVITY_HANDLER);
		createEReference(httpActivityEClass, HTTP_ACTIVITY__HTTP_ACTIVITY_HAS_JAXRS_ANNOTATION);

		httpActivityFunctionParameterEClass = createEClass(HTTP_ACTIVITY_FUNCTION_PARAMETER);
		createEReference(httpActivityFunctionParameterEClass, HTTP_ACTIVITY_FUNCTION_PARAMETER__HTTP_FUNCTION_PARAMETER_HAS_JAXRS_ANNOTATION);

		httpActivityHandlerEClass = createEClass(HTTP_ACTIVITY_HANDLER);
		createEReference(httpActivityHandlerEClass, HTTP_ACTIVITY_HANDLER__HAS_HYPERMEDIA_FUNCTION);
		createEAttribute(httpActivityHandlerEClass, HTTP_ACTIVITY_HANDLER__NAME);
		createEAttribute(httpActivityHandlerEClass, HTTP_ACTIVITY_HANDLER__HANDLER_HTTP_VERB);

		javaAlgoResourceControllerEClass = createEClass(JAVA_ALGO_RESOURCE_CONTROLLER);
		createEReference(javaAlgoResourceControllerEClass, JAVA_ALGO_RESOURCE_CONTROLLER__HAS_ASSOCIATED_ALGO_MODEL);
		createEReference(javaAlgoResourceControllerEClass, JAVA_ALGO_RESOURCE_CONTROLLER__JAVA_ALGO_RCONTROLLER_HAS_HTTP_ACTIVITY);
		createEAttribute(javaAlgoResourceControllerEClass, JAVA_ALGO_RESOURCE_CONTROLLER__NAME);
		createEAttribute(javaAlgoResourceControllerEClass, JAVA_ALGO_RESOURCE_CONTROLLER__CONTROLLER_URI);
		createEAttribute(javaAlgoResourceControllerEClass, JAVA_ALGO_RESOURCE_CONTROLLER__PARENT_NAME);
		createEReference(javaAlgoResourceControllerEClass, JAVA_ALGO_RESOURCE_CONTROLLER__ALGO_CONTROLLER_HAS_JAXRS_ANNOTATION);

		javaAlgoResourceModelEClass = createEClass(JAVA_ALGO_RESOURCE_MODEL);
		createEReference(javaAlgoResourceModelEClass, JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_JAXB_ANNOTATION);
		createEReference(javaAlgoResourceModelEClass, JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_PROPERTY);
		createEReference(javaAlgoResourceModelEClass, JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_SETTER_FUNCTION);
		createEReference(javaAlgoResourceModelEClass, JAVA_ALGO_RESOURCE_MODEL__JAVA_ALGO_MODEL_HAS_GETTER_FUNCTION);
		createEAttribute(javaAlgoResourceModelEClass, JAVA_ALGO_RESOURCE_MODEL__NAME);
		createEAttribute(javaAlgoResourceModelEClass, JAVA_ALGO_RESOURCE_MODEL__PARENT_NAME);
		createEReference(javaAlgoResourceModelEClass, JAVA_ALGO_RESOURCE_MODEL__HAS_RELATED_ALGO_MODEL);
		createEReference(javaAlgoResourceModelEClass, JAVA_ALGO_RESOURCE_MODEL__IS_RELATED_ALGO_MODEL);

		javaFunctionEClass = createEClass(JAVA_FUNCTION);
		createEReference(javaFunctionEClass, JAVA_FUNCTION__HAS_FUNCTION_PARAMETER);
		createEAttribute(javaFunctionEClass, JAVA_FUNCTION__NAME);

		javaGetterFunctionEClass = createEClass(JAVA_GETTER_FUNCTION);
		createEReference(javaGetterFunctionEClass, JAVA_GETTER_FUNCTION__GETS_PROPERTY);

		javaHypermediaFunctionEClass = createEClass(JAVA_HYPERMEDIA_FUNCTION);
		createEReference(javaHypermediaFunctionEClass, JAVA_HYPERMEDIA_FUNCTION__HAS_PSM_HYPERMEDIA_LINK);

		javaResourceControllerEClass = createEClass(JAVA_RESOURCE_CONTROLLER);
		createEReference(javaResourceControllerEClass, JAVA_RESOURCE_CONTROLLER__JAVA_RCONTROLLER_HAS_JAXRS_ANNOTATION);
		createEReference(javaResourceControllerEClass, JAVA_RESOURCE_CONTROLLER__JAVA_RCONTROLLER_HAS_HTTP_ACTIVITY);
		createEReference(javaResourceControllerEClass, JAVA_RESOURCE_CONTROLLER__HAS_ASSOCIATED_JAVA_RMODEL);
		createEAttribute(javaResourceControllerEClass, JAVA_RESOURCE_CONTROLLER__NAME);
		createEAttribute(javaResourceControllerEClass, JAVA_RESOURCE_CONTROLLER__CONTROLLER_URI);
		createEAttribute(javaResourceControllerEClass, JAVA_RESOURCE_CONTROLLER__PARENT_NAME);

		javaResourceControllerManagerEClass = createEClass(JAVA_RESOURCE_CONTROLLER_MANAGER);
		createEReference(javaResourceControllerManagerEClass, JAVA_RESOURCE_CONTROLLER_MANAGER__JAVA_RC_MANAGER_HAS_JAXRS_ANNOTATION);
		createEReference(javaResourceControllerManagerEClass, JAVA_RESOURCE_CONTROLLER_MANAGER__JAVA_RC_MANAGER_HAS_HTTP_ACTIVITY);
		createEReference(javaResourceControllerManagerEClass, JAVA_RESOURCE_CONTROLLER_MANAGER__HAS_ASSOCIATED_RM_MANAGER);
		createEAttribute(javaResourceControllerManagerEClass, JAVA_RESOURCE_CONTROLLER_MANAGER__NAME);
		createEAttribute(javaResourceControllerManagerEClass, JAVA_RESOURCE_CONTROLLER_MANAGER__CONTROLLER_URI);
		createEAttribute(javaResourceControllerManagerEClass, JAVA_RESOURCE_CONTROLLER_MANAGER__PARENT_NAME);

		javaResourceModelEClass = createEClass(JAVA_RESOURCE_MODEL);
		createEReference(javaResourceModelEClass, JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_JAXB_ANNOTATION);
		createEReference(javaResourceModelEClass, JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_PROPERTY);
		createEReference(javaResourceModelEClass, JAVA_RESOURCE_MODEL__HAS_RELATED_JAVA_RM_MANAGER);
		createEReference(javaResourceModelEClass, JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_HIBERNATE_ANNOTATION);
		createEReference(javaResourceModelEClass, JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_SETTER);
		createEReference(javaResourceModelEClass, JAVA_RESOURCE_MODEL__JAVA_RMODEL_HAS_GETTER);
		createEReference(javaResourceModelEClass, JAVA_RESOURCE_MODEL__HAS_RELATED_JAVA_ALGO_MODEL);
		createEAttribute(javaResourceModelEClass, JAVA_RESOURCE_MODEL__NAME);
		createEAttribute(javaResourceModelEClass, JAVA_RESOURCE_MODEL__PARENT_NAME);

		javaResourceModelManagerEClass = createEClass(JAVA_RESOURCE_MODEL_MANAGER);
		createEReference(javaResourceModelManagerEClass, JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_JAXB_ANNOTATION);
		createEReference(javaResourceModelManagerEClass, JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_PROPERTY);
		createEReference(javaResourceModelManagerEClass, JAVA_RESOURCE_MODEL_MANAGER__HAS_RELATED_JAVA_RMODEL);
		createEReference(javaResourceModelManagerEClass, JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_SETTER);
		createEReference(javaResourceModelManagerEClass, JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_GETTER);
		createEAttribute(javaResourceModelManagerEClass, JAVA_RESOURCE_MODEL_MANAGER__NAME);
		createEAttribute(javaResourceModelManagerEClass, JAVA_RESOURCE_MODEL_MANAGER__PARENT_NAME);

		psmComponentPropertyEClass = createEClass(PSM_COMPONENT_PROPERTY);
		createEReference(psmComponentPropertyEClass, PSM_COMPONENT_PROPERTY__PROPERTY_HAS_HIBERNATE_ANNOTATION);
		createEAttribute(psmComponentPropertyEClass, PSM_COMPONENT_PROPERTY__NAME);
		createEAttribute(psmComponentPropertyEClass, PSM_COMPONENT_PROPERTY__TYPE);
		createEAttribute(psmComponentPropertyEClass, PSM_COMPONENT_PROPERTY__BIS_UNIQUE);
		createEAttribute(psmComponentPropertyEClass, PSM_COMPONENT_PROPERTY__BIS_NAMING_PROPERTY);
		createEAttribute(psmComponentPropertyEClass, PSM_COMPONENT_PROPERTY__BIS_PRIMARY_IDENTIFIER);

		javaSetterFunctionEClass = createEClass(JAVA_SETTER_FUNCTION);
		createEReference(javaSetterFunctionEClass, JAVA_SETTER_FUNCTION__SETS_PROPERTY);
		createEReference(javaSetterFunctionEClass, JAVA_SETTER_FUNCTION__SETTER_FUNCTION_HAS_JAXB_ANNOTATION);

		jaxbAnnotationEClass = createEClass(JAXB_ANNOTATION);
		createEAttribute(jaxbAnnotationEClass, JAXB_ANNOTATION__JAXB_ANNOTATION_TEXT);

		jaxrsAnnotationEClass = createEClass(JAXRS_ANNOTATION);
		createEAttribute(jaxrsAnnotationEClass, JAXRS_ANNOTATION__JAXRS_ANNOTATION_TEXT);

		psmHypermediaLinkEClass = createEClass(PSM_HYPERMEDIA_LINK);
		createEReference(psmHypermediaLinkEClass, PSM_HYPERMEDIA_LINK__HAS_TARGET_JAVA_ALGO_CONTROLLER);
		createEReference(psmHypermediaLinkEClass, PSM_HYPERMEDIA_LINK__HAS_TARGET_JAVA_RCONTROLLER);
		createEReference(psmHypermediaLinkEClass, PSM_HYPERMEDIA_LINK__HAS_TARGET_RC_MANAGER);
		createEAttribute(psmHypermediaLinkEClass, PSM_HYPERMEDIA_LINK__LINK_HTTP_VERB);
		createEAttribute(psmHypermediaLinkEClass, PSM_HYPERMEDIA_LINK__LINK_TYPE);

		servicePSMEClass = createEClass(SERVICE_PSM);
		createEReference(servicePSMEClass, SERVICE_PSM__HAS_JAVA_RMODEL);
		createEReference(servicePSMEClass, SERVICE_PSM__HAS_JAVA_RCONTROLLER);
		createEReference(servicePSMEClass, SERVICE_PSM__HAS_JAVA_RC_MANAGER);
		createEReference(servicePSMEClass, SERVICE_PSM__HAS_JAVA_RM_MANAGER);
		createEReference(servicePSMEClass, SERVICE_PSM__HAS_JAVA_ALGO_MODEL);
		createEReference(servicePSMEClass, SERVICE_PSM__HAS_JAVA_ALGO_CONTROLLER);
		createEReference(servicePSMEClass, SERVICE_PSM__HAS_HIBERNATE_CONTROLLER);
		createEAttribute(servicePSMEClass, SERVICE_PSM__NAME);
		createEAttribute(servicePSMEClass, SERVICE_PSM__SERVICE_OUTPUT_PATH);
		createEAttribute(servicePSMEClass, SERVICE_PSM__SERVICE_DATABASE_IP);
		createEAttribute(servicePSMEClass, SERVICE_PSM__SERVICE_DATABASE_PORT);
		createEAttribute(servicePSMEClass, SERVICE_PSM__SERVICE_DATABASE_USERNAME);
		createEAttribute(servicePSMEClass, SERVICE_PSM__SERVICE_DATABASE_PASSWORD);
		createEAttribute(servicePSMEClass, SERVICE_PSM__SERVICE_DATABASE_TYPE);

		functionParameterEClass = createEClass(FUNCTION_PARAMETER);
		createEAttribute(functionParameterEClass, FUNCTION_PARAMETER__NAME);
		createEAttribute(functionParameterEClass, FUNCTION_PARAMETER__TYPE);
		createEAttribute(functionParameterEClass, FUNCTION_PARAMETER__BIS_UNIQUE);
		createEAttribute(functionParameterEClass, FUNCTION_PARAMETER__BIS_RETURN_PARAMETER);

		// Create enums
		httpVerbEEnum = createEEnum(HTTP_VERB);
		mediaTypeEEnum = createEEnum(MEDIA_TYPE);
		linkTypeEEnum = createEEnum(LINK_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		httpActivityFunctionParameterEClass.getESuperTypes().add(this.getFunctionParameter());
		javaGetterFunctionEClass.getESuperTypes().add(this.getJavaFunction());
		javaSetterFunctionEClass.getESuperTypes().add(this.getJavaFunction());

		// Initialize classes, features, and operations; add parameters
		initEClass(hibernateActivityEClass, HibernateActivity.class, "HibernateActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHibernateActivity_Name(), ecorePackage.getEString(), "name", null, 1, 1, HibernateActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHibernateActivity_HibernateActivityHTTPVerb(), this.getHTTPVerb(), "HibernateActivityHTTPVerb", null, 1, 1, HibernateActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hibernateAnnotationEClass, HibernateAnnotation.class, "HibernateAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHibernateAnnotation_HibernateAnnotationText(), ecorePackage.getEString(), "HibernateAnnotationText", null, 1, 1, HibernateAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hibernateControllerEClass, HibernateController.class, "HibernateController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHibernateController_HasHibernateActivity(), this.getHibernateActivity(), null, "hasHibernateActivity", null, 1, -1, HibernateController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHibernateController_Name(), ecorePackage.getEString(), "name", null, 1, 1, HibernateController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(httpActivityEClass, HTTPActivity.class, "HTTPActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHTTPActivity_IsMappedToHibernateActivity(), this.getHibernateActivity(), null, "isMappedToHibernateActivity", null, 1, 1, HTTPActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHTTPActivity_HasHTTPActivityParameter(), this.getHTTPActivityFunctionParameter(), null, "hasHTTPActivityParameter", null, 0, -1, HTTPActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHTTPActivity_ActivityHTTPVerb(), this.getHTTPVerb(), "ActivityHTTPVerb", null, 1, 1, HTTPActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHTTPActivity_Name(), ecorePackage.getEString(), "name", null, 1, 1, HTTPActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHTTPActivity_HTTPActivityURI(), ecorePackage.getEString(), "HTTPActivityURI", null, 1, 1, HTTPActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHTTPActivity_HasHTTPActivityHandler(), this.getHTTPActivityHandler(), null, "hasHTTPActivityHandler", null, 1, 1, HTTPActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHTTPActivity_HTTPActivityHasJAXRSAnnotation(), this.getJAXRSAnnotation(), null, "HTTPActivityHasJAXRSAnnotation", null, 1, -1, HTTPActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(httpActivityFunctionParameterEClass, HTTPActivityFunctionParameter.class, "HTTPActivityFunctionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHTTPActivityFunctionParameter_HTTPFunctionParameterHasJAXRSAnnotation(), this.getJAXRSAnnotation(), null, "HTTPFunctionParameterHasJAXRSAnnotation", null, 0, 1, HTTPActivityFunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(httpActivityHandlerEClass, HTTPActivityHandler.class, "HTTPActivityHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHTTPActivityHandler_HasHypermediaFunction(), this.getJavaHypermediaFunction(), null, "hasHypermediaFunction", null, 1, 1, HTTPActivityHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHTTPActivityHandler_Name(), ecorePackage.getEString(), "name", null, 1, 1, HTTPActivityHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHTTPActivityHandler_HandlerHTTPVerb(), this.getHTTPVerb(), "HandlerHTTPVerb", null, 1, 1, HTTPActivityHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaAlgoResourceControllerEClass, JavaAlgoResourceController.class, "JavaAlgoResourceController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJavaAlgoResourceController_HasAssociatedAlgoModel(), this.getJavaAlgoResourceModel(), null, "hasAssociatedAlgoModel", null, 1, 1, JavaAlgoResourceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaAlgoResourceController_JavaAlgoRControllerHasHTTPActivity(), this.getHTTPActivity(), null, "JavaAlgoRControllerHasHTTPActivity", null, 1, 1, JavaAlgoResourceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaAlgoResourceController_Name(), ecorePackage.getEString(), "name", null, 1, 1, JavaAlgoResourceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaAlgoResourceController_ControllerURI(), ecorePackage.getEString(), "controllerURI", null, 1, 1, JavaAlgoResourceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaAlgoResourceController_ParentName(), ecorePackage.getEString(), "parentName", null, 1, 1, JavaAlgoResourceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaAlgoResourceController_AlgoControllerHasJAXRSAnnotation(), this.getJAXRSAnnotation(), null, "AlgoControllerHasJAXRSAnnotation", null, 1, 1, JavaAlgoResourceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaAlgoResourceModelEClass, JavaAlgoResourceModel.class, "JavaAlgoResourceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJavaAlgoResourceModel_JavaAlgoModelHasJAXBAnnotation(), this.getJAXBAnnotation(), null, "JavaAlgoModelHasJAXBAnnotation", null, 1, 1, JavaAlgoResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaAlgoResourceModel_JavaAlgoModelHasProperty(), this.getPSMComponentProperty(), null, "JavaAlgoModelHasProperty", null, 1, 1, JavaAlgoResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaAlgoResourceModel_JavaAlgoModelHasSetterFunction(), this.getJavaSetterFunction(), null, "JavaAlgoModelHasSetterFunction", null, 1, 1, JavaAlgoResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaAlgoResourceModel_JavaAlgoModelHasGetterFunction(), this.getJavaGetterFunction(), null, "JavaAlgoModelHasGetterFunction", null, 1, 1, JavaAlgoResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaAlgoResourceModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, JavaAlgoResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaAlgoResourceModel_ParentName(), ecorePackage.getEString(), "parentName", null, 1, 1, JavaAlgoResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaAlgoResourceModel_HasRelatedAlgoModel(), this.getJavaAlgoResourceModel(), null, "hasRelatedAlgoModel", null, 0, -1, JavaAlgoResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaAlgoResourceModel_IsRelatedAlgoModel(), this.getJavaAlgoResourceModel(), null, "isRelatedAlgoModel", null, 0, -1, JavaAlgoResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaFunctionEClass, JavaFunction.class, "JavaFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJavaFunction_HasFunctionParameter(), this.getFunctionParameter(), null, "hasFunctionParameter", null, 0, -1, JavaFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaFunction_Name(), ecorePackage.getEString(), "name", null, 1, 1, JavaFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaGetterFunctionEClass, JavaGetterFunction.class, "JavaGetterFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJavaGetterFunction_GetsProperty(), this.getPSMComponentProperty(), null, "getsProperty", null, 1, 1, JavaGetterFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaHypermediaFunctionEClass, JavaHypermediaFunction.class, "JavaHypermediaFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJavaHypermediaFunction_HasPSMHypermediaLink(), this.getPSMHypermediaLink(), null, "hasPSMHypermediaLink", null, 1, -1, JavaHypermediaFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaResourceControllerEClass, JavaResourceController.class, "JavaResourceController", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJavaResourceController_JavaRControllerHasJAXRSAnnotation(), this.getJAXRSAnnotation(), null, "JavaRControllerHasJAXRSAnnotation", null, 1, 1, JavaResourceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaResourceController_JavaRControllerHasHTTPActivity(), this.getHTTPActivity(), null, "JavaRControllerHasHTTPActivity", null, 1, -1, JavaResourceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaResourceController_HasAssociatedJavaRModel(), this.getJavaResourceModel(), null, "hasAssociatedJavaRModel", null, 1, 1, JavaResourceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaResourceController_Name(), ecorePackage.getEString(), "name", null, 1, 1, JavaResourceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaResourceController_ControllerURI(), ecorePackage.getEString(), "controllerURI", null, 1, 1, JavaResourceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaResourceController_ParentName(), ecorePackage.getEString(), "parentName", null, 1, 1, JavaResourceController.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaResourceControllerManagerEClass, JavaResourceControllerManager.class, "JavaResourceControllerManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJavaResourceControllerManager_JavaRCManagerHasJAXRSAnnotation(), this.getJAXRSAnnotation(), null, "JavaRCManagerHasJAXRSAnnotation", null, 1, 1, JavaResourceControllerManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaResourceControllerManager_JavaRCManagerHasHTTPActivity(), this.getHTTPActivity(), null, "JavaRCManagerHasHTTPActivity", null, 2, 2, JavaResourceControllerManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaResourceControllerManager_HasAssociatedRMManager(), this.getJavaResourceModelManager(), null, "hasAssociatedRMManager", null, 1, 1, JavaResourceControllerManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaResourceControllerManager_Name(), ecorePackage.getEString(), "name", null, 1, 1, JavaResourceControllerManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaResourceControllerManager_ControllerURI(), ecorePackage.getEString(), "controllerURI", null, 1, 1, JavaResourceControllerManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaResourceControllerManager_ParentName(), ecorePackage.getEString(), "parentName", null, 1, 1, JavaResourceControllerManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaResourceModelEClass, JavaResourceModel.class, "JavaResourceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJavaResourceModel_JavaRModelHasJAXBAnnotation(), this.getJAXBAnnotation(), null, "JavaRModelHasJAXBAnnotation", null, 1, 1, JavaResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaResourceModel_JavaRModelHasProperty(), this.getPSMComponentProperty(), null, "JavaRModelHasProperty", null, 1, -1, JavaResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaResourceModel_HasRelatedJavaRMManager(), this.getJavaResourceModelManager(), null, "hasRelatedJavaRMManager", null, 0, -1, JavaResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaResourceModel_JavaRModelHasHibernateAnnotation(), this.getHibernateAnnotation(), null, "JavaRModelHasHibernateAnnotation", null, 2, 2, JavaResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaResourceModel_JavaRModelHasSetter(), this.getJavaSetterFunction(), null, "JavaRModelHasSetter", null, 1, -1, JavaResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaResourceModel_JavaRModelHasGetter(), this.getJavaGetterFunction(), null, "JavaRModelHasGetter", null, 1, -1, JavaResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaResourceModel_HasRelatedJavaAlgoModel(), this.getJavaAlgoResourceModel(), null, "hasRelatedJavaAlgoModel", null, 0, -1, JavaResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaResourceModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, JavaResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaResourceModel_ParentName(), ecorePackage.getEString(), "parentName", null, 1, 1, JavaResourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaResourceModelManagerEClass, JavaResourceModelManager.class, "JavaResourceModelManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJavaResourceModelManager_JavaRMManagerHasJAXBAnnotation(), this.getJAXBAnnotation(), null, "JavaRMManagerHasJAXBAnnotation", null, 1, 1, JavaResourceModelManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaResourceModelManager_JavaRMManagerHasProperty(), this.getPSMComponentProperty(), null, "JavaRMManagerHasProperty", null, 1, 1, JavaResourceModelManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaResourceModelManager_HasRelatedJavaRModel(), this.getJavaResourceModel(), null, "hasRelatedJavaRModel", null, 1, 1, JavaResourceModelManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaResourceModelManager_JavaRMManagerHasSetter(), this.getJavaSetterFunction(), null, "JavaRMManagerHasSetter", null, 1, 1, JavaResourceModelManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaResourceModelManager_JavaRMManagerHasGetter(), this.getJavaGetterFunction(), null, "JavaRMManagerHasGetter", null, 1, 1, JavaResourceModelManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaResourceModelManager_Name(), ecorePackage.getEString(), "name", null, 1, 1, JavaResourceModelManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaResourceModelManager_ParentName(), ecorePackage.getEString(), "parentName", null, 1, 1, JavaResourceModelManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(psmComponentPropertyEClass, PSMComponentProperty.class, "PSMComponentProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPSMComponentProperty_PropertyHasHibernateAnnotation(), this.getHibernateAnnotation(), null, "PropertyHasHibernateAnnotation", null, 1, -1, PSMComponentProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPSMComponentProperty_Name(), ecorePackage.getEString(), "name", null, 1, 1, PSMComponentProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPSMComponentProperty_Type(), ecorePackage.getEString(), "type", null, 1, 1, PSMComponentProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPSMComponentProperty_BIsUnique(), ecorePackage.getEBoolean(), "bIsUnique", null, 1, 1, PSMComponentProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPSMComponentProperty_BIsNamingProperty(), ecorePackage.getEBoolean(), "bIsNamingProperty", null, 1, 1, PSMComponentProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPSMComponentProperty_BIsPrimaryIdentifier(), ecorePackage.getEBoolean(), "bIsPrimaryIdentifier", null, 1, 1, PSMComponentProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaSetterFunctionEClass, JavaSetterFunction.class, "JavaSetterFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJavaSetterFunction_SetsProperty(), this.getPSMComponentProperty(), null, "setsProperty", null, 1, 1, JavaSetterFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJavaSetterFunction_SetterFunctionHasJAXBAnnotation(), this.getJAXBAnnotation(), null, "SetterFunctionHasJAXBAnnotation", null, 0, 1, JavaSetterFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jaxbAnnotationEClass, JAXBAnnotation.class, "JAXBAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJAXBAnnotation_JAXBAnnotationText(), ecorePackage.getEString(), "JAXBAnnotationText", null, 1, 1, JAXBAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jaxrsAnnotationEClass, JAXRSAnnotation.class, "JAXRSAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJAXRSAnnotation_JAXRSAnnotationText(), ecorePackage.getEString(), "JAXRSAnnotationText", null, 1, 1, JAXRSAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(psmHypermediaLinkEClass, PSMHypermediaLink.class, "PSMHypermediaLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPSMHypermediaLink_HasTargetJavaAlgoController(), this.getJavaAlgoResourceController(), null, "hasTargetJavaAlgoController", null, 0, 1, PSMHypermediaLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSMHypermediaLink_HasTargetJavaRController(), this.getJavaResourceController(), null, "hasTargetJavaRController", null, 0, 1, PSMHypermediaLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPSMHypermediaLink_HasTargetRCManager(), this.getJavaResourceControllerManager(), null, "hasTargetRCManager", null, 0, 1, PSMHypermediaLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPSMHypermediaLink_LinkHTTPVerb(), this.getHTTPVerb(), "LinkHTTPVerb", null, 1, 1, PSMHypermediaLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPSMHypermediaLink_LinkType(), this.getLinkType(), "LinkType", null, 1, 1, PSMHypermediaLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(servicePSMEClass, ServicePSM.class, "ServicePSM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServicePSM_HasJavaRModel(), this.getJavaResourceModel(), null, "hasJavaRModel", null, 0, -1, ServicePSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServicePSM_HasJavaRController(), this.getJavaResourceController(), null, "hasJavaRController", null, 0, -1, ServicePSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServicePSM_HasJavaRCManager(), this.getJavaResourceControllerManager(), null, "hasJavaRCManager", null, 0, -1, ServicePSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServicePSM_HasJavaRMManager(), this.getJavaResourceModelManager(), null, "hasJavaRMManager", null, 0, -1, ServicePSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServicePSM_HasJavaAlgoModel(), this.getJavaAlgoResourceModel(), null, "hasJavaAlgoModel", null, 0, -1, ServicePSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServicePSM_HasJavaAlgoController(), this.getJavaAlgoResourceController(), null, "hasJavaAlgoController", null, 0, -1, ServicePSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServicePSM_HasHibernateController(), this.getHibernateController(), null, "hasHibernateController", null, 1, 1, ServicePSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServicePSM_Name(), ecorePackage.getEString(), "name", null, 1, 1, ServicePSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServicePSM_ServiceOutputPath(), ecorePackage.getEString(), "serviceOutputPath", null, 1, 1, ServicePSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServicePSM_ServiceDatabaseIP(), ecorePackage.getEString(), "serviceDatabaseIP", null, 1, 1, ServicePSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServicePSM_ServiceDatabasePort(), ecorePackage.getEString(), "serviceDatabasePort", null, 1, 1, ServicePSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServicePSM_ServiceDatabaseUsername(), ecorePackage.getEString(), "serviceDatabaseUsername", null, 1, 1, ServicePSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServicePSM_ServiceDatabasePassword(), ecorePackage.getEString(), "serviceDatabasePassword", null, 1, 1, ServicePSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServicePSM_ServiceDatabaseType(), ecorePackage.getEString(), "serviceDatabaseType", null, 1, 1, ServicePSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionParameterEClass, FunctionParameter.class, "FunctionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, FunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionParameter_Type(), ecorePackage.getEString(), "type", null, 1, 1, FunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionParameter_BIsUnique(), ecorePackage.getEBoolean(), "bIsUnique", null, 1, 1, FunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionParameter_BIsReturnParameter(), ecorePackage.getEBoolean(), "bIsReturnParameter", null, 1, 1, FunctionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(httpVerbEEnum, HTTPVerb.class, "HTTPVerb");
		addEEnumLiteral(httpVerbEEnum, HTTPVerb.POST);
		addEEnumLiteral(httpVerbEEnum, HTTPVerb.GET);
		addEEnumLiteral(httpVerbEEnum, HTTPVerb.PUT);
		addEEnumLiteral(httpVerbEEnum, HTTPVerb.DELETE);

		initEEnum(mediaTypeEEnum, MediaType.class, "MediaType");
		addEEnumLiteral(mediaTypeEEnum, MediaType.JSON);
		addEEnumLiteral(mediaTypeEEnum, MediaType.XML);

		initEEnum(linkTypeEEnum, LinkType.class, "LinkType");
		addEEnumLiteral(linkTypeEEnum, LinkType.PARENT);
		addEEnumLiteral(linkTypeEEnum, LinkType.SIBLING);
		addEEnumLiteral(linkTypeEEnum, LinkType.CHILD);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (javaAlgoResourceControllerEClass, 
		   source, 
		   new String[] {
			 "constraints", "controllerURIPathAnnotation AlgoControllerHasUniqueProperHTTPActivity AlgoControllerActivitiesHaveJAXRSAnnotations algoControllerActivityAddsHypermediaLinkToSelf"
		   });	
		addAnnotation
		  (javaAlgoResourceModelEClass, 
		   source, 
		   new String[] {
			 "constraints", "uniqueXMLRootElementAnnotation uniqueSetterForEveryProeprty uniqueGetterForEveryProeprty uniqueLinkListProperty"
		   });	
		addAnnotation
		  (javaResourceControllerEClass, 
		   source, 
		   new String[] {
			 "constraints", "controllerURIPathAnnotation RControllerNotAllowedVerb RControllerHasMinimumActivity RControllerActivitiesHaveJAXRSAnnotations rControllerGetActivityAddsGetHypermediaLinkToSelf rControllerPutActivityAddsPutHypermediaLinkToSelf rControllerGetActivityAddsPutHypermediaLinkToSelf rControllerGetActivityAddsDeleteHypermediaLinkToSelf rControllerPutActivityAddsGetHypermediaLinkToSelf rControllerPutActivityAddsDeleteHypermediaLinkToSelf"
		   });	
		addAnnotation
		  (javaResourceControllerManagerEClass, 
		   source, 
		   new String[] {
			 "constraints", "controllerURIPathAnnotation RCManagerNotAllowedHTTPActivityVerbs RCManagerActivitiesHaveJAXRSAnnotations JRCManagerPostActivityAddsPostHypermediaLinkToSelf JRCManagerGetActivityAddsPostHypermediaLinkToSelf JRCManagerPostActivityAddsGetHypermediaLinkToSelf"
		   });	
		addAnnotation
		  (javaResourceModelEClass, 
		   source, 
		   new String[] {
			 "constraints", "uniqueXMLRootElementAnnotation uniqueNamingProperty neededRModelHibernateAnnotationsExist uniquePrimaryIdentifier uniqueSetterForEveryProeprty uniqueGetterForEveryProeprty uniqueLinkListProperty properCollectionHibernateAnnotations"
		   });	
		addAnnotation
		  (javaResourceModelManagerEClass, 
		   source, 
		   new String[] {
			 "constraints", "uniqueXMLRootElementAnnotation uniqueSetterForEveryProeprty uniqueGetterForEveryProeprty uniqueLinkListProperty"
		   });	
		addAnnotation
		  (psmComponentPropertyEClass, 
		   source, 
		   new String[] {
			 "constraints", "primaryIdentifierHasProperAnnotations"
		   });	
		addAnnotation
		  (servicePSMEClass, 
		   source, 
		   new String[] {
			 "constraints", "allModelsHaveRResourcePropertiesWithProperHibernateAnnotations allModelsHavePResourcePropertiesWithProperHibernateAnnotations rMPropertiesSettersHaveProperXMLTransientAnnotation rMPropertiesHaveColumnAnnotation RControllerUniqueHTTPVerbsPerParent RCManagerHasUniqueHTTPActivityVerbsPerParent rCManagerPostActivityAddsGetHypermediaLinkToRRController rCManagerPostActivityAddsPutHypermediaLinkToRRController rCManagerPostActivityAddsDeleteHypermediaLinkToRRController rCManagerGetActivityAddsGetHypermediaLinkToRRController rCManagerGetActivityAddsPutHypermediaLinkToRRController rCManagerGetActivityAddsDeleteHypermediaLinkToRRController rCManagerPostActivityAddsGetHypermediaLinkToParentRController rCManagerPostActivityAddsPutHypermediaLinkToParentRController rCManagerPostActivityAddsDeleteHypermediaLinkToParentRController rCManagerGetActivityAddsGetHypermediaLinkToParentRController rCManagerGetActivityAddsPutHypermediaLinkToParentRController rCManagerGetActivityAddsDeleteHypermediaLinkToParentRController rControllerGetActivityAddsPostHypermediaLinkToRCManager rControllerGetActivityAddsGetHypermediaLinkToRCManager rControllerPutActivityAddsPostHypermediaLinkToRCManager rControllerPutActivityAddsGetHypermediaLinkToRCManager rControllerGetActivityAddsPostHypermediaLinkToParentRCManager rControllerGetActivityAddsGetHypermediaLinkToParentRCManager rControllerPutActivityAddsPostHypermediaLinkToParentRCManager rControllerPutActivityAddsGetHypermediaLinkToParentRCManager rControllerDeleteActivityAddsPostHypermediaLinkToParentRCManager rControllerDeleteActivityAddsGetHypermediaLinkToParentRCManager algoControllerActivityAddsHypermediaLinkToRAlgoController algoControllerAddsHypermediaLinkToParentAlgoController rControllerGetAddsHypermediaLinkToRAlgoController rControllerPutAddsHypermediaLinkToRAlgoController algoControllerAddsGetHypermediaLinkToParentRController algoControllerAddsPutHypermediaLinkToParentRController algoControllerAddsDeleteHypermediaLinkToParentRController"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (javaAlgoResourceControllerEClass, 
		   source, 
		   new String[] {
			 "controllerURIPathAnnotation", "self.AlgoControllerHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@Path(\"\' + self.controllerURI + \'\")\')",
			 "AlgoControllerHasUniqueProperHTTPActivity", "\n\t\t(\n\t\t\tself.JavaAlgoRControllerHasHTTPActivity->select(HTTPVerb = 3 or HTTPVerb = 2)->isEmpty() \n\t\t\tand\n\t\t\tself.JavaAlgoRControllerHasHTTPActivity->select(HTTPVerb = 0 or HTTPVerb = 1)->size() = 1\n\t\t)",
			 "AlgoControllerActivitiesHaveJAXRSAnnotations", "self.JavaAlgoRControllerHasHTTPActivity->select(HTTPVerb = 0 or HTTPVerb = 1)->forAll(HTTPActivity | \n\t\t\t(\n\t\t\t\tHTTPActivity.ActivityHTTPVerb = 0 implies HTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@POST\')\n\t\t\t\tand\n\t\t\t\tHTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@POST\') implies HTTPActivity.ActivityHTTPVerb = 0 \n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tHTTPActivity.ActivityHTTPVerb = 1 implies HTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@GET\')\n\t\t\t\tand\n\t\t\t\tHTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@GET\') implies HTTPActivity.ActivityHTTPVerb = 1 \t\n\t\t\t)\n\t\t\tand HTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@Path(\"\' + HTTPActivity.HTTPActivityURI + \'\")\')\n\t\t)",
			 "algoControllerActivityAddsHypermediaLinkToSelf", "\n\t\t(\n\t\t\t(\n\t\t\t\tself.JavaAlgoRControllerHasHTTPActivity->exists(HTTPVerb = 0)\n\t\t\t\timplies\n\t\t\t\tself.JavaAlgoRControllerHasHTTPActivity->select(HTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = \'Sibling\' and hasTargetJavaAlgoController = self)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tself.JavaAlgoRControllerHasHTTPActivity->select(HTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = \'Sibling\' and hasTargetJavaAlgoController = self)\n\t\t\t\timplies\t\t\n\t\t\t\tself.JavaAlgoRControllerHasHTTPActivity->exists(HTTPVerb = 0)\t\t\n\t\t\t)\n\t\t)\n\t\tor\n\t\t(\n\t\t\t(\n\t\t\t\tself.JavaAlgoRControllerHasHTTPActivity->exists(HTTPVerb = 1)\n\t\t\t\timplies\n\t\t\t\tself.JavaAlgoRControllerHasHTTPActivity->select(HTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Sibling\' and hasTargetJavaAlgoController = self)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tself.JavaAlgoRControllerHasHTTPActivity->select(HTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Sibling\' and hasTargetJavaAlgoController = self)\n\t\t\t\timplies\t\t\n\t\t\t\tself.JavaAlgoRControllerHasHTTPActivity->exists(HTTPVerb = 1)\t\t\n\t\t\t)\n\t\t)"
		   });	
		addAnnotation
		  (javaAlgoResourceModelEClass, 
		   source, 
		   new String[] {
			 "uniqueXMLRootElementAnnotation", "self.JavaAlgoModelHasJAXBAnnotation->one(JAXBAnnotationText = \'@XmlRootElement\')",
			 "uniqueSetterForEveryProeprty", "self.JavaAlgoModelHasProperty->forAll(Property | \n\t\t\tself.JavaAlgoModelHasSetterFunction->one(name = \'set\' + Property.name)\n\t\t)",
			 "uniqueGetterForEveryProeprty", "self.JavaAlgoModelHasProperty->forAll(Property | \n\t\t\tself.JavaAlgoModelHasGetterFunction->one(name = \'get\' + Property.name)\n\t\t)",
			 "uniqueLinkListProperty", "self.JavaAlgoModelHasProperty->one(name = \'linklist\') \n\t\t\tand self.JavaAlgoModelHasProperty->select(name = \'linklist\').PropertyHasHibernateAnnotation->one(\'@Transient\')"
		   });	
		addAnnotation
		  (javaResourceControllerEClass, 
		   source, 
		   new String[] {
			 "controllerURIPathAnnotation", "self.JavaRControllerHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@Path(\"\' + self.controllerURI + \'\")\')",
			 "RControllerNotAllowedVerb", "self.JavaRControllerHasHTTPActivity->select(HTTPVerb = 0)->isEmpty()",
			 "RControllerHasMinimumActivity", "self.JavaRControllerHasHTTPActivity->exists(HTTPVerb <> 0)",
			 "RControllerActivitiesHaveJAXRSAnnotations", "self.JavaRControllerHasHTTPActivity->select(HTTPVerb = 1 or HTTPVerb = 2 or HTTPVerb = 3)->forAll(HTTPActivity | \n\t\t\t(\n\t\t\t\tHTTPActivity.ActivityHTTPVerb = 2 implies HTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@PUT\')\n\t\t\t\tand\n\t\t\t\tHTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@PUT\') implies HTTPActivity.ActivityHTTPVerb = 2 \n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tHTTPActivity.ActivityHTTPVerb = 1 implies HTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@GET\')\n\t\t\t\tand\n\t\t\t\tHTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@GET\') implies HTTPActivity.ActivityHTTPVerb = 1 \t\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tHTTPActivity.ActivityHTTPVerb = 3 implies HTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@DELETE\')\n\t\t\t\tand\n\t\t\t\tHTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@DELETE\') implies HTTPActivity.ActivityHTTPVerb = 3\n\t\t\t)\n\t\t\tand HTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@Path(\"\' + HTTPActivity.HTTPActivityURI + \'\")\')\n\t\t)",
			 "rControllerGetActivityAddsGetHypermediaLinkToSelf", "\n\t\t(\n\t\t\t(\n\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 1)\n\t\t\t\timplies\n\t\t\t\tself.JavaRControllerHasHTTPActivity.hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Sibling\' and hasTargetJavaRController = self)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tself.JavaRControllerHasHTTPActivity.hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Sibling\' and hasTargetJavaRController = self)\n\t\t\t\timplies\n\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 1)\n\t\t\t)\n\t\t)",
			 "rControllerPutActivityAddsPutHypermediaLinkToSelf", "\n\t\t(\n\t\t\t(\n\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 2)\n\t\t\t\timplies\n\t\t\t\tself.JavaRControllerHasHTTPActivity.hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = \'Sibling\' and hasTargetJavaRController = self)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tself.JavaRControllerHasHTTPActivity.hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = \'Sibling\' and hasTargetJavaRController = self)\n\t\t\t\timplies\n\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 2)\n\t\t\t)\n\t\t)",
			 "rControllerGetActivityAddsPutHypermediaLinkToSelf", "\n\t\t(\n\t\t\t(\n\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 2) and self.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 1)\n\t\t\t\timplies\n\t\t\t\tself.JavaRControllerHasHTTPActivity->select(HTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = \'Sibling\' and hasTargetJavaRController = self)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tself.JavaRControllerHasHTTPActivity->select(HTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = \'Sibling\' and hasTargetJavaRController = self)\n\t\t\t\timplies\n\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 2) and self.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 1)\n\t\t\t)\n\t\t)",
			 "rControllerGetActivityAddsDeleteHypermediaLinkToSelf", "\n\t\t(\n\t\t\t(\n\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 3) and self.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 1)\n\t\t\t\timplies\n\t\t\t\tself.JavaRControllerHasHTTPActivity->select(HTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = \'Sibling\' and hasTargetJavaRController = self)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tself.JavaRControllerHasHTTPActivity->select(HTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = \'Sibling\' and hasTargetJavaRController = self)\n\t\t\t\timplies\n\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 3) and self.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 1)\n\t\t\t)\n\t\t)",
			 "rControllerPutActivityAddsGetHypermediaLinkToSelf", "\n\t\t(\n\t\t\t(\n\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 1) and self.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 2)\n\t\t\t\timplies\n\t\t\t\tself.JavaRControllerHasHTTPActivity->select(HTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Sibling\' and hasTargetJavaRController = self)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tself.JavaRControllerHasHTTPActivity->select(HTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Sibling\' and hasTargetJavaRController = self)\n\t\t\t\timplies\n\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 1) and self.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 2)\n\t\t\t)\n\t\t)",
			 "rControllerPutActivityAddsDeleteHypermediaLinkToSelf", "\n\t\t(\n\t\t\t(\n\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 3) and self.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 2)\n\t\t\t\timplies\n\t\t\t\tself.JavaRControllerHasHTTPActivity->select(HTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = \'Sibling\' and hasTargetJavaRController = self)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tself.JavaRControllerHasHTTPActivity->select(HTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = \'Sibling\' and hasTargetJavaRController = self)\n\t\t\t\timplies\n\t\t\t\tself.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 3) and self.JavaRControllerHasHTTPActivity->exists(HTTPVerb = 2)\n\t\t\t)\n\t\t)"
		   });	
		addAnnotation
		  (javaResourceControllerManagerEClass, 
		   source, 
		   new String[] {
			 "controllerURIPathAnnotation", "self.JavaRCManagerHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@Path(\"\' + self.controllerURI + \'\")\')",
			 "RCManagerNotAllowedHTTPActivityVerbs", "self.JavaRCManagerHasHTTPActivity->select(HTTPVerb = 2 or HTTPVerb = 3)->isEmpty()",
			 "RCManagerActivitiesHaveJAXRSAnnotations", "self.JavaRCManagerHasHTTPActivity->select(HTTPVerb = 0 or HTTPVerb = 1)->forAll(HTTPActivity | \n\t\t\t(\n\t\t\t\tHTTPActivity.ActivityHTTPVerb = 0 implies HTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@POST\')\n\t\t\t\tand\n\t\t\t\tHTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@POST\') implies HTTPActivity.ActivityHTTPVerb = 0 \n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tHTTPActivity.ActivityHTTPVerb = 1 implies HTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@GET\')\n\t\t\t\tand\n\t\t\t\tHTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@GET\') implies HTTPActivity.ActivityHTTPVerb = 1 \t\n\t\t\t)\n\t\t\tand HTTPActivity.HTTPActivityHasJAXRSAnnotation->one(JAXRSAnnotationText = \'@Path(\"\' + HTTPActivity.HTTPActivityURI + \'\")\')\n\t\t)",
			 "JRCManagerPostActivityAddsPostHypermediaLinkToSelf", "self.JavaRCManagerHasHTTPActivity->select(HTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and hasTargetRCManager = self and LinkType = \'Sibling\')",
			 "JRCManagerGetActivityAddsPostHypermediaLinkToSelf", "self.JavaRCManagerHasHTTPActivity->select(HTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and hasTargetRCManager = self and LinkType = \'Sibling\')",
			 "JRCManagerPostActivityAddsGetHypermediaLinkToSelf", "self.JavaRCManagerHasHTTPActivity->select(HTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and hasTargetRCManager = self and LinkType = \'Sibling\')"
		   });	
		addAnnotation
		  (javaResourceModelEClass, 
		   source, 
		   new String[] {
			 "uniqueXMLRootElementAnnotation", "self.JavaRModelHasJAXBAnnotation->one(JAXBAnnotationText = \'@XmlRootElement\')",
			 "uniqueNamingProperty", "self.JavaRModelHasProperty->isUnique(bIsNamingProperty = true)",
			 "neededRModelHibernateAnnotationsExist", "self.JavaRModelHasHibernateAnnotation->one(\'@Entity\') and self.JavaRModelHasHibernateAnnotation->one(\'@Table(name=\"\' + self.parentName + \'\")\')",
			 "uniquePrimaryIdentifier", "self.JavaRModelHasProperty->isUnique(bIsPrimaryIdentifier = true)",
			 "uniqueSetterForEveryProeprty", "self.JavaRModelHasProperty->forAll(Property | \n\t\t\tself.JavaRModelHasSetter->one(name = \'set\' + Property.name)\n\t\t)",
			 "uniqueGetterForEveryProeprty", "self.JavaRModelHasProperty->forAll(Property | \n\t\t\tself.JavaRModelHasGetter->one(name = \'get\' + Property.name)\n\t\t)",
			 "uniqueLinkListProperty", "self.JavaRModelHasProperty->one(name = \'linklist\') \n\t\t\tand self.JavaRModelHasProperty->select(name = \'linklist\').PropertyHasHibernateAnnotation->one(\'@Transient\')",
			 "properCollectionHibernateAnnotations", "\n\t\tlet JRRModels : Sequence(JavaResourceModel) = self.hasRelatedJavaRMManager.hasRelatedJavaRModel in\n\t\t\tself.JavaRModelHasProperty->select((bIsUnique = false) and (name <> \'linklist\'))->reject( Property | JRRModels->exists(JRRModel | \'SetOf\' + JRRModel.name = Property.name))\n\t\t\t\t->forAll(CollectionProperty | CollectionProperty.PropertyHasHibernateAnnotation->one(\'@ElementCollection(fetch = FetchType.EAGER)\')\n\t\t\t\t\tand\n\t\t\t\t\tCollectionProperty.PropertyHasHibernateAnnotation->one(\'@CollectionTable(name=\"\' + self.parentName + CollectionProperty.name +\'\", joinColumns=@JoinColumn(name=\"\' + self.JavaRModelHasProperty->select(bIsPrimaryIdentifier = true)->at(1).name + \'\"))\')\n\t\t\t\t\tand\n\t\t\t\t\tCollectionProperty.PropertyHasHibernateAnnotation->one(\'@ForeignKey(name = \"fk_\' + self.parentName + \'_\' + CollectionProperty.name + \'\")\')\n\t\t\t\t)"
		   });	
		addAnnotation
		  (javaResourceModelManagerEClass, 
		   source, 
		   new String[] {
			 "uniqueXMLRootElementAnnotation", "self.JavaRMManagerHasJAXBAnnotation->one(JAXBAnnotationText = \'@XmlRootElement\')",
			 "uniqueSetterForEveryProeprty", "self.JavaRMManagerHasProperty->forAll(Property | \n\t\t\tself.JavaRMManagerHasSetter->one(name = \'set\' + Property.name)\n\t\t)",
			 "uniqueGetterForEveryProeprty", "self.JavaRMManagerHasProperty->forAll(Property | \n\t\t\tself.JavaRMManagerHasGetter->one(name = \'get\' + Property.name)\n\t\t)",
			 "uniqueLinkListProperty", "self.JavaRMManagerHasProperty->one(name = \'linklist\') \n\t\t\tand self.JavaRMManagerHasProperty->select(name = \'linklist\').PropertyHasHibernateAnnotation->one(\'@Transient\')"
		   });	
		addAnnotation
		  (psmComponentPropertyEClass, 
		   source, 
		   new String[] {
			 "primaryIdentifierHasProperAnnotations", "(\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t(\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tself.bIsPrimaryIdentifier \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\timplies \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t(\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t\tself.PropertyHasHibernateAnnotation->one(\'@Id\')\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t\tand\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t\tself.PropertyHasHibernateAnnotation->one(\'@GeneratedValue\')\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t)\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t)\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t \tand\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t(\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t(\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t\tself.PropertyHasHibernateAnnotation->one(\'@Id\')\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t\tand\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t\tself.PropertyHasHibernateAnnotation->one(\'@GeneratedValue\')\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t)\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\timplies\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\tself.bIsPrimaryIdentifier\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t)\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t )"
		   });	
		addAnnotation
		  (servicePSMEClass, 
		   source, 
		   new String[] {
			 "allModelsHaveRResourcePropertiesWithProperHibernateAnnotations", "\n\t\tself.hasJavaRModel->forAll(JavaRModel | JavaRModel.hasRelatedJavaRMManager.hasRelatedJavaRModel->forAll(RelatedJavaRModel | \n\t\t\tJavaRModel.JavaRModelHasProperty->one(name = \'SetOf\' + RelatedJavaRModel.name)\n\t\t\tand\n\t\t\tJavaRModel.JavaRModelHasProperty->select(name = \'SetOf\' + RelatedJavaRModel.name)->forAll(JRModelProperty | \n\t\t\t\tJRModelProperty.PropertyHasHibernateAnnotation->one(HibernateAnnotationText = \'@OneToMany(fetch = FetchType.EAGER, mappedBy=\"\' + JavaRModel.parentName + \'\",orphanRemoval=true)\')\n\t\t\t\tand\n\t\t\t\tJRModelProperty.PropertyHasHibernateAnnotation->one(HibernateAnnotationText = \'@OnDelete(action=OnDeleteAction.CASCADE)\')\n\t\t\t)\n\t\t))",
			 "allModelsHavePResourcePropertiesWithProperHibernateAnnotations", "\n\t\tself.hasJavaRModel->forAll(JavaRModel | \n\t\t\tself.hasJavaRModel->select(ParentJRModel | ParentJRModel.hasRelatedJavaRMManager->exists(JRMManager | JRMManager.hasRelatedJavaRModel = JavaRModel))\n\t\t\t->forAll(ParentJRModel | JavaRModel.JavaRModelHasProperty->one(name = ParentJRModel.parentName)\n\t\t\t\tand\n\t\t\t\tJavaRModel.JavaRModelHasProperty->forAll( Property |\n\t\t\t\t\t\t(\n\t\t\t\t\t\t\t(Property.name = ParentJRModel.parentName)\n\t\t\t\t\t\t\timplies\n\t\t\t\t\t\t\t(\n\t\t\t\t\t\t\t\tProperty.PropertyHasHibernateAnnotation->one(HibernateAnnotationText = \'@ManyToOne(fetch = FetchType.EAGER)\')\n\t\t\t\t\t\t\t\tand\n\t\t\t\t\t\t\t\tProperty.PropertyHasHibernateAnnotation->one(HibernateAnnotationText = \'@JoinColumn(name=\"\' + if JavaRModel = ParentJRModel then \'sourse\' else \'\' endif + ParentJRModel.JavaRModelHasProperty->select(bIsPrimaryIdentifier = true)->at(1).name + \'\")\')\n\t\t\t\t\t\t\t\tand\n\t\t\t\t\t\t\t\tProperty.PropertyHasHibernateAnnotation->one(HibernateAnnotationText = \'@ForeignKey(name = \"fk_\' + ParentJRModel.parentName + \'_\' + JavaRModel.parentName + \'\")\')\n\t\t\t\t\t\t\t)\n\t\t\t\t\t\t)\n\t\t\t\t\t\tand\n\t\t\t\t\t\t(\n\t\t\t\t\t\t\t(\n\t\t\t\t\t\t\t\tProperty.PropertyHasHibernateAnnotation->one(HibernateAnnotationText = \'@ManyToOne(fetch = FetchType.EAGER)\')\n\t\t\t\t\t\t\t\tand\n\t\t\t\t\t\t\t\tProperty.PropertyHasHibernateAnnotation->one(HibernateAnnotationText = \'@JoinColumn(name=\"\' + if JavaRModel = ParentJRModel then \'sourse\' else \'\' endif + ParentJRModel.JavaRModelHasProperty->select(bIsPrimaryIdentifier = true)->at(1).name + \'\")\')\n\t\t\t\t\t\t\t\tand\n\t\t\t\t\t\t\t\tProperty.PropertyHasHibernateAnnotation->one(HibernateAnnotationText = \'@ForeignKey(name = \"fk_\' + ParentJRModel.parentName + \'_\' + JavaRModel.parentName + \'\")\')\n\t\t\t\t\t\t\t)\n\t\t\t\t\t\t\timplies\n\t\t\t\t\t\t\t(Property.name = ParentJRModel.parentName)\n\t\t\t\t\t\t)\n\t\t\t\t)\n\t\t\t)\n\t\t)",
			 "rMPropertiesSettersHaveProperXMLTransientAnnotation", "\n\t\t\tlet AllResourceModels : Sequence(JavaResourceModel) = self.hasJavaRModel in\n\t\t\tself.hasJavaRModel->forAll(JRModel | \n\t\t\t\tJRModel.JavaRModelHasSetter->select(SetterFunction | \n\t\t\t\t\t(\n\t\t\t\t\t\tJRModel.hasRelatedJavaRMManager.hasRelatedJavaRModel->exists(JRRModel | SetterFunction.name = \'setSetOf\' + JRRModel.name)\n\t\t\t\t\t)\n\t\t\t\t\tor\n\t\t\t\t\t(\n\t\t\t\t\t\tAllResourceModels->select(hasRelatedJavaRMManager->exists(hasRelatedJavaRModel = JRModel))\n\t\t\t\t\t\t\t->exists(ParentJRModel | SetterFunction.name = \'set\' + ParentJRModel.parentName)\n\t\t\t\t\t)\t\n\t\t\t\t)->forAll(SetterFunction | SetterFunction.SetterFunctionHasJAXBAnnotation->one(\'@XmlTransient\'))\n\t\t\t)",
			 "rMPropertiesHaveColumnAnnotation", "\n\t\t\tself.hasJavaRModel->forAll(JRModel |\n\t\t\t\tJRModel.JavaRModelHasProperty->reject(Property |\n\t\t\t\t\t(Property.name = \'linklist\')\n\t\t\t\t\tor\n\t\t\t\t\t(JRModel.hasRelatedJavaRMManager->exists(JRRModel | Property.name = \'SetOf\' + JRRModel.name))\n\t\t\t\t\tor\n\t\t\t\t\t(self.hasJavaRModel->select(JPRModel | JPRModel.hasRelatedJavaRMManager.hasRelatedJavaRModel->exists(JPRModel | JPRModel = JRModel))->exists(JPRModel | Property.name = JPRModel.parentName))\n\t\t\t\t)->forAll(Property | Property.PropertyHasHibernateAnnotation->one(HibernateAnnotationText = \'@Column(name = \"\' + Property.name + \'\")\'))\n\t\t\t)",
			 "RControllerUniqueHTTPVerbsPerParent", "\n\t\t\tlet AllResourceModels : Sequence(JavaResourceModel) = self.hasJavaRModel in\n\t\t\tself.hasJavaRController->forAll(JRController | let numberOfParents : Integer = AllResourceModels->select(ParentRModel | \n\t\t\t\tParentRModel.hasRelatedJavaRMManager->exists(JRMManager | JRController.hasAssociatedJavaRModel = JRMManager.hasRelatedJavaRModel))->size() in\n\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(HTTPActivity | HTTPActivity.ActivityHTTPVerb = 1)->size() <= numberOfParents\n\t\t\t\tand\n\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(HTTPActivity | HTTPActivity.ActivityHTTPVerb = 2)->size() <= numberOfParents\n\t\t\t\tand\n\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(HTTPActivity | HTTPActivity.ActivityHTTPVerb = 3)->size() <= numberOfParents\n\t\t\t\tand\n\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(HTTPActivity | HTTPActivity.ActivityHTTPVerb = 1)->isUnique(name)\n\t\t\t\tand\n\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(HTTPActivity | HTTPActivity.ActivityHTTPVerb = 1)->isUnique(name)\n\t\t\t\tand\n\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(HTTPActivity | HTTPActivity.ActivityHTTPVerb = 1)->isUnique(name)\n\t\t\t\t)",
			 "RCManagerHasUniqueHTTPActivityVerbsPerParent", "\n\t\t\tlet AllResourceModels : Sequence(JavaResourceModel) = self.hasJavaRModel in\n\t\t\tself.hasJavaRCManager->forAll(JRCManager | let numberOfParents : Integer = AllResourceModels->select(ParentRModel |\n\t\t\t\tParentRModel->exists(hasRelatedJavaRMManager = JRCManager))->size() in\n\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(HTTPActivity | HTTPActivity.ActivityHTTPVerb = 0)->size() = numberOfParents\n\t\t\t\tand\n\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(HTTPActivity | HTTPActivity.ActivityHTTPVerb = 1)->size() = numberOfParents\n\t\t\t\tand\n\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(HTTPActivity | HTTPActivity.ActivityHTTPVerb = 0)->isUnique(name)\n\t\t\t\tand\n\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(HTTPActivity | HTTPActivity.ActivityHTTPVerb = 1)->isUnique(name)\t\t\t\t\n\t\t\t\t)",
			 "rCManagerPostActivityAddsGetHypermediaLinkToRRController", "\n\t\tself.hasJavaRCManager->forAll(JRCManager | \n\t\tself.hasJavaRController->forAll( JRController | \n\t\t\t(\n\t\t\t\t(JRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n\t\t\t\timplies \n\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Child\' and  hasTargetJavaRController = JRController)\n\t\t\t)\n\t\t    and \n\t\t\t(\n\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Child\' and  hasTargetJavaRController = JRController)\n\t\t\t\timplies\n\t\t\t\t(JRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n\t\t\t)\n\t\t))",
			 "rCManagerPostActivityAddsPutHypermediaLinkToRRController", "\n\t\tself.hasJavaRCManager->forAll(JRCManager | \n\t\tself.hasJavaRController->forAll( JRController | \n\t\t\t(\n\t\t\t\t(JRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2)\n\t\t\t\timplies \n\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = \'Child\' and  hasTargetJavaRController = JRController)\n\t\t\t)\n\t\t    and \n\t\t\t(\n\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = \'Child\' and  hasTargetJavaRController = JRController)\n\t\t\t\timplies\n\t\t\t\t(JRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2)\n\t\t\t)\n\t\t))",
			 "rCManagerPostActivityAddsDeleteHypermediaLinkToRRController", "\n\t\tself.hasJavaRCManager->forAll(JRCManager | \n\t\tself.hasJavaRController->forAll( JRController | \n\t\t\t(\n\t\t\t\t(JRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 3)\n\t\t\t\timplies \n\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = \'Child\' and  hasTargetJavaRController = JRController)\n\t\t\t)\n\t\t    and \n\t\t\t(\n\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = \'Child\' and  hasTargetJavaRController = JRController)\n\t\t\t\timplies\n\t\t\t\t(JRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 3)\n\t\t\t)\n\t\t))",
			 "rCManagerGetActivityAddsGetHypermediaLinkToRRController", "\n\t\tself.hasJavaRCManager->forAll(JRCManager | \n\t\tself.hasJavaRController->forAll( JRController | \n\t\t\t(\n\t\t\t\t(JRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n\t\t\t\timplies \n\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Child\' and  hasTargetJavaRController = JRController)\n\t\t\t)\n\t\t    and \n\t\t\t(\n\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Child\' and  hasTargetJavaRController = JRController)\n\t\t\t\timplies\n\t\t\t\t(JRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n\t\t\t)\n\t\t))",
			 "rCManagerGetActivityAddsPutHypermediaLinkToRRController", "\n\t\tself.hasJavaRCManager->forAll(JRCManager | \n\t\tself.hasJavaRController->forAll( JRController | \n\t\t\t(\n\t\t\t\t(JRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2)\n\t\t\t\timplies \n\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = \'Child\' and  hasTargetJavaRController = JRController)\n\t\t\t)\n\t\t    and \n\t\t\t(\n\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = \'Child\' and  hasTargetJavaRController = JRController)\n\t\t\t\timplies\n\t\t\t\t(JRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2)\n\t\t\t)\n\t\t))",
			 "rCManagerGetActivityAddsDeleteHypermediaLinkToRRController", "\n\t\tself.hasJavaRCManager->forAll(JRCManager | \n\t\tself.hasJavaRController->forAll( JRController | \n\t\t\t(\n\t\t\t\t(JRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 3)\n\t\t\t\timplies \n\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = \'Child\' and  hasTargetJavaRController = JRController)\n\t\t\t)\n\t\t    and \n\t\t\t(\n\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = \'Child\' and  hasTargetJavaRController = JRController)\n\t\t\t\timplies\n\t\t\t\t(JRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 3)\n\t\t\t)\n\t\t))",
			 "rCManagerPostActivityAddsGetHypermediaLinkToParentRController", "\n\t\tself.hasJavaRCManager->forAll(JRCManager |\n\t\tself.hasJavaRController->forAll(JRController |\n\t\t\t(\n\t\t\t\t(JRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n\t\t\t\timplies\n\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Parent\' and hasTargetJavaRController = JRController)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Parent\' and hasTargetJavaRController = JRController)\n\t\t\t\timplies\n\t\t\t\t(JRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n\t\t\t)\n\t\t))",
			 "rCManagerPostActivityAddsPutHypermediaLinkToParentRController", "\n\t\tself.hasJavaRCManager->forAll(JRCManager |\n\t\tself.hasJavaRController->forAll(JRController |\n\t\t\t(\n\t\t\t\t(JRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2)\n\t\t\t\timplies\n\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = \'Parent\' and hasTargetJavaRController = JRController)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = \'Parent\' and hasTargetJavaRController = JRController)\n\t\t\t\timplies\n\t\t\t\t(JRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2)\n\t\t\t)\n\t\t))",
			 "rCManagerPostActivityAddsDeleteHypermediaLinkToParentRController", "\n\t\tself.hasJavaRCManager->forAll(JRCManager |\n\t\tself.hasJavaRController->forAll(JRController |\n\t\t\t(\n\t\t\t\t(JRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 3)\n\t\t\t\timplies\n\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = \'Parent\' and hasTargetJavaRController = JRController)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = \'Parent\' and hasTargetJavaRController = JRController)\n\t\t\t\timplies\n\t\t\t\t(JRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 3)\n\t\t\t)\n\t\t))",
			 "rCManagerGetActivityAddsGetHypermediaLinkToParentRController", "\n\t\tself.hasJavaRCManager->forAll(JRCManager |\n\t\tself.hasJavaRController->forAll(JRController |\n\t\t\t(\n\t\t\t\t(JRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n\t\t\t\timplies\n\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Parent\' and hasTargetJavaRController = JRController)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Parent\' and hasTargetJavaRController = JRController)\n\t\t\t\timplies\n\t\t\t\t(JRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n\t\t\t)\n\t\t))",
			 "rCManagerGetActivityAddsPutHypermediaLinkToParentRController", "\n\t\tself.hasJavaRCManager->forAll(JRCManager |\n\t\tself.hasJavaRController->forAll(JRController |\n\t\t\t(\n\t\t\t\t(JRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2)\n\t\t\t\timplies\n\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = \'Parent\' and hasTargetJavaRController = JRController)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = \'Parent\' and hasTargetJavaRController = JRController)\n\t\t\t\timplies\n\t\t\t\t(JRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2)\n\t\t\t)\n\t\t))",
			 "rCManagerGetActivityAddsDeleteHypermediaLinkToParentRController", "\n\t\tself.hasJavaRCManager->forAll(JRCManager |\n\t\tself.hasJavaRController->forAll(JRController |\n\t\t\t(\n\t\t\t\t(JRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 3)\n\t\t\t\timplies\n\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = \'Parent\' and hasTargetJavaRController = JRController)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tJRCManager.JavaRCManagerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = \'Parent\' and hasTargetJavaRController = JRController)\n\t\t\t\timplies\n\t\t\t\t(JRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager) and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 3)\n\t\t\t)\n\t\t))",
			 "rControllerGetActivityAddsPostHypermediaLinkToRCManager", "\n\t\tself.hasJavaRController->forAll( JRController |\n\t\tself.hasJavaRCManager->forAll( JRCManager |\n\t\t\t(\n\t\t\t\tJRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n\t\t\t\timplies\n\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = \'Child\' and hasTargetRCManager = JRCManager)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = \'Child\' and hasTargetRCManager = JRCManager)\n\t\t\t\timplies\n\t\t\t\tJRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n\t\t\t)\n\t\t))",
			 "rControllerGetActivityAddsGetHypermediaLinkToRCManager", "\n\t\tself.hasJavaRController->forAll( JRController |\n\t\tself.hasJavaRCManager->forAll( JRCManager |\n\t\t\t(\n\t\t\t\tJRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n\t\t\t\timplies\n\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Child\' and hasTargetRCManager = JRCManager)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Child\' and hasTargetRCManager = JRCManager)\n\t\t\t\timplies\n\t\t\t\tJRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n\t\t\t)\n\t\t))",
			 "rControllerPutActivityAddsPostHypermediaLinkToRCManager", "\n\t\tself.hasJavaRController->forAll( JRController |\n\t\tself.hasJavaRCManager->forAll( JRCManager |\n\t\t\t(\n\t\t\t\tJRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2)\n\t\t\t\timplies\n\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = \'Child\' and hasTargetRCManager = JRCManager)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = \'Child\' and hasTargetRCManager = JRCManager)\n\t\t\t\timplies\n\t\t\t\tJRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2)\n\t\t\t)\n\t\t))",
			 "rControllerPutActivityAddsGetHypermediaLinkToRCManager", "\n\t\tself.hasJavaRController->forAll( JRController |\n\t\tself.hasJavaRCManager->forAll( JRCManager |\n\t\t\t(\n\t\t\t\tJRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2)\n\t\t\t\timplies\n\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Child\' and hasTargetRCManager = JRCManager)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Child\' and hasTargetRCManager = JRCManager)\n\t\t\t\timplies\n\t\t\t\tJRController.hasAssociatedJavaRModel.hasRelatedJavaRMManager = JRCManager.hasAssociatedRMManager and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2)\n\t\t\t)\n\t\t))",
			 "rControllerGetActivityAddsPostHypermediaLinkToParentRCManager", "\n\t\tself.hasJavaRController->forAll( JRController |\n\t\tself.hasJavaRCManager->forAll( JRCManager |\n\t\t\t(\n\t\t\t\tJRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n\t\t\t\timplies\n\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = \'Parent\' and hasTargetRCManager = JRCManager)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = \'Parent\' and hasTargetRCManager = JRCManager)\n\t\t\t\timplies\n\t\t\t\tJRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\t\t\t\t\t\t\n\t\t\t)\n\t\t))",
			 "rControllerGetActivityAddsGetHypermediaLinkToParentRCManager", "\n\t\tself.hasJavaRController->forAll( JRController |\n\t\tself.hasJavaRCManager->forAll( JRCManager |\n\t\t\t(\n\t\t\t\tJRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n\t\t\t\timplies\n\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Parent\' and hasTargetRCManager = JRCManager)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Parent\' and hasTargetRCManager = JRCManager)\n\t\t\t\timplies\n\t\t\t\tJRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\t\t\t\t\t\t\n\t\t\t)\n\t\t))",
			 "rControllerPutActivityAddsPostHypermediaLinkToParentRCManager", "\n\t\tself.hasJavaRController->forAll( JRController |\n\t\tself.hasJavaRCManager->forAll( JRCManager |\n\t\t\t(\n\t\t\t\tJRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2)\n\t\t\t\timplies\n\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = \'Parent\' and hasTargetRCManager = JRCManager)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = \'Parent\' and hasTargetRCManager = JRCManager)\n\t\t\t\timplies\n\t\t\t\tJRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2)\t\t\t\t\t\t\n\t\t\t)\n\t\t))",
			 "rControllerPutActivityAddsGetHypermediaLinkToParentRCManager", "\n\t\tself.hasJavaRController->forAll( JRController |\n\t\tself.hasJavaRCManager->forAll( JRCManager |\n\t\t\t(\n\t\t\t\tJRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2)\n\t\t\t\timplies\n\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Parent\' and hasTargetRCManager = JRCManager)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Parent\' and hasTargetRCManager = JRCManager)\n\t\t\t\timplies\n\t\t\t\tJRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2)\t\t\t\t\t\t\n\t\t\t)\n\t\t))",
			 "rControllerDeleteActivityAddsPostHypermediaLinkToParentRCManager", "\n\t\tself.hasJavaRController->forAll( JRController |\n\t\tself.hasJavaRCManager->forAll( JRCManager |\n\t\t\t(\n\t\t\t\tJRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 3)\n\t\t\t\timplies\n\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 3).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = \'Parent\' and hasTargetRCManager = JRCManager)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 3).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = \'Parent\' and hasTargetRCManager = JRCManager)\n\t\t\t\timplies\n\t\t\t\tJRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 3)\t\t\t\t\t\t\n\t\t\t)\n\t\t))",
			 "rControllerDeleteActivityAddsGetHypermediaLinkToParentRCManager", "\n\t\tself.hasJavaRController->forAll( JRController |\n\t\tself.hasJavaRCManager->forAll( JRCManager |\n\t\t\t(\n\t\t\t\tJRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 3)\n\t\t\t\timplies\n\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 3).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Parent\' and hasTargetRCManager = JRCManager)\n\t\t\t)\n\t\t\tand\n\t\t\t(\n\t\t\t\tJRController.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 3).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Parent\' and hasTargetRCManager = JRCManager)\n\t\t\t\timplies\n\t\t\t\tJRCManager.hasAssociatedRMManager.hasRelatedJavaRModel = JRController.hasAssociatedJavaRModel and JRController.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 3)\t\t\t\t\t\t\n\t\t\t)\n\t\t))",
			 "algoControllerActivityAddsHypermediaLinkToRAlgoController", "\n\t\tself.hasJavaAlgoController->forAll(algoControllerA, algoControllerB |\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.hasRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0) and algoControllerB.JavaAlgoRControllerHasHTTPActivity->exists( ActivityHTTPVerb = 0)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = \'Child\' and hasTargetJavaAlgoController = algoControllerB)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = \'Child\' and hasTargetJavaAlgoController = algoControllerB)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.hasRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0) and algoControllerB.JavaAlgoRControllerHasHTTPActivity->exists( ActivityHTTPVerb = 0)\n\t\t\t\t)\n\t\t\t)\n\t\t\tor\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.hasRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0) and algoControllerB.JavaAlgoRControllerHasHTTPActivity->exists( ActivityHTTPVerb = 1)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Child\' and hasTargetJavaAlgoController = algoControllerB)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Child\' and hasTargetJavaAlgoController = algoControllerB)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.hasRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0) and algoControllerB.JavaAlgoRControllerHasHTTPActivity->exists( ActivityHTTPVerb = 1)\n\t\t\t\t)\n\t\t\t)\n\t\t\tor\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.hasRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1) and algoControllerB.JavaAlgoRControllerHasHTTPActivity->exists( ActivityHTTPVerb = 0)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = \'Child\' and hasTargetJavaAlgoController = algoControllerB)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = \'Child\' and hasTargetJavaAlgoController = algoControllerB)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.hasRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1) and algoControllerB.JavaAlgoRControllerHasHTTPActivity->exists( ActivityHTTPVerb = 0)\n\t\t\t\t)\n\t\t\t)\n\t\t\tor\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.hasRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1) and algoControllerB.JavaAlgoRControllerHasHTTPActivity->exists( ActivityHTTPVerb = 1)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Child\' and hasTargetJavaAlgoController = algoControllerB)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Child\' and hasTargetJavaAlgoController = algoControllerB)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.hasRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1) and algoControllerB.JavaAlgoRControllerHasHTTPActivity->exists( ActivityHTTPVerb = 1)\n\t\t\t\t)\n\t\t\t)\n\t\t)",
			 "algoControllerAddsHypermediaLinkToParentAlgoController", "\n\t\tself.hasJavaAlgoController->forAll(algoControllerA, algoControllerB |\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.isRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0) and algoControllerB.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = \'Parent\' and hasTargetJavaAlgoController = algoControllerB)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = \'Parent\' and hasTargetJavaAlgoController = algoControllerB)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.isRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0) and algoControllerB.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0)\n\t\t\t\t)\n\t\t\t)\n\t\t\tor\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.isRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0) and algoControllerB.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Parent\' and hasTargetJavaAlgoController = algoControllerB)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Parent\' and hasTargetJavaAlgoController = algoControllerB)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.isRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0) and algoControllerB.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n\t\t\t\t)\n\t\t\t)\n\t\t\tor\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.isRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1) and algoControllerB.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = \'Parent\' and hasTargetJavaAlgoController = algoControllerB)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = \'Parent\' and hasTargetJavaAlgoController = algoControllerB)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.isRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1) and algoControllerB.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0)\n\t\t\t\t)\n\t\t\t)\n\t\t\tor\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.isRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1) and algoControllerB.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Parent\' and hasTargetJavaAlgoController = algoControllerB)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Parent\' and hasTargetJavaAlgoController = algoControllerB)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.hasAssociatedAlgoModel.isRelatedAlgoModel = algoControllerB.hasAssociatedAlgoModel and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1) and algoControllerB.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n\t\t\t\t)\n\t\t\t)\n\t\t)",
			 "rControllerGetAddsHypermediaLinkToRAlgoController", "\n\t\tself.hasJavaAlgoController->forAll(algoControllerA |\n\t\tself.hasJavaRController->forAll(rControllerA |\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0)\n\t\t\t\t\timplies\n\t\t\t\t\trControllerA.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = \'Child\' and hasTargetJavaAlgoController = algoControllerA)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\trControllerA.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = \'Child\' and hasTargetJavaAlgoController = algoControllerA)\n\t\t\t\t\timplies\n\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0)\n\t\t\t\t)\n\t\t\t)\n\t\t\tor\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n\t\t\t\t\timplies\n\t\t\t\t\trControllerA.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Child\' and hasTargetJavaAlgoController = algoControllerA)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\trControllerA.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Child\' and hasTargetJavaAlgoController = algoControllerA)\n\t\t\t\t\timplies\n\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n\t\t\t\t)\n\t\t\t)\n\t\t\n\t\t))",
			 "rControllerPutAddsHypermediaLinkToRAlgoController", "\n\t\tself.hasJavaAlgoController->forAll(algoControllerA |\n\t\tself.hasJavaRController->forAll(rControllerA |\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0)\n\t\t\t\t\timplies\n\t\t\t\t\trControllerA.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = \'Child\' and hasTargetJavaAlgoController = algoControllerA)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\trControllerA.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 0 and LinkType = \'Child\' and hasTargetJavaAlgoController = algoControllerA)\n\t\t\t\t\timplies\n\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0)\n\t\t\t\t)\n\t\t\t)\n\t\t\tor\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n\t\t\t\t\timplies\n\t\t\t\t\trControllerA.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Child\' and hasTargetJavaAlgoController = algoControllerA)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\trControllerA.JavaRControllerHasHTTPActivity->select(ActivityHTTPVerb = 2).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Child\' and hasTargetJavaAlgoController = algoControllerA)\n\t\t\t\t\timplies\n\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n\t\t\t\t)\n\t\t\t)\n\t\t))",
			 "algoControllerAddsGetHypermediaLinkToParentRController", "\n\t\tself.hasJavaAlgoController->forAll(algoControllerA |\n\t\tself.hasJavaRController->forAll(rControllerA |\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Parent\' and hasTargetJavaRController = rControllerA)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Parent\' and hasTargetJavaRController = rControllerA)\n\t\t\t\t\timplies\n\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0)\n\t\t\t\t)\n\t\t\t)\n\t\t\tor\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Parent\' and hasTargetJavaRController = rControllerA)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 1 and LinkType = \'Parent\' and hasTargetJavaRController = rControllerA)\n\t\t\t\t\timplies\n\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n\t\t\t\t)\n\t\t\t)\n\t\t))",
			 "algoControllerAddsPutHypermediaLinkToParentRController", "\n\t\tself.hasJavaAlgoController->forAll(algoControllerA |\n\t\tself.hasJavaRController->forAll(rControllerA |\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = \'Parent\' and hasTargetJavaRController = rControllerA)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = \'Parent\' and hasTargetJavaRController = rControllerA)\n\t\t\t\t\timplies\n\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0)\n\t\t\t\t)\n\t\t\t)\n\t\t\tor\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = \'Parent\' and hasTargetJavaRController = rControllerA)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 2 and LinkType = \'Parent\' and hasTargetJavaRController = rControllerA)\n\t\t\t\t\timplies\n\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 2) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n\t\t\t\t)\n\t\t\t)\n\t\t))",
			 "algoControllerAddsDeleteHypermediaLinkToParentRController", "\n\t\tself.hasJavaAlgoController->forAll(algoControllerA |\n\t\tself.hasJavaRController->forAll(rControllerA |\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 3) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = \'Parent\' and hasTargetJavaRController = rControllerA)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 0).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = \'Parent\' and hasTargetJavaRController = rControllerA)\n\t\t\t\t\timplies\n\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 3) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 0)\n\t\t\t\t)\n\t\t\t)\n\t\t\tor\n\t\t\t(\n\t\t\t\t(\n\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 3) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n\t\t\t\t\timplies\n\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = \'Parent\' and hasTargetJavaRController = rControllerA)\n\t\t\t\t)\n\t\t\t\tand\n\t\t\t\t(\n\t\t\t\t\talgoControllerA.JavaAlgoRControllerHasHTTPActivity->select(ActivityHTTPVerb = 1).hasHTTPActivityHandler.hasHypermediaFunction.hasPSMHypermediaLink->one(LinkHTTPVerb = 3 and LinkType = \'Parent\' and hasTargetJavaRController = rControllerA)\n\t\t\t\t\timplies\n\t\t\t\t\trControllerA.hasAssociatedJavaRModel.hasRelatedJavaAlgoModel = algoControllerA.hasAssociatedAlgoModel and rControllerA.JavaRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 3) and algoControllerA.JavaAlgoRControllerHasHTTPActivity->exists(ActivityHTTPVerb = 1)\n\t\t\t\t)\n\t\t\t)\n\t\t))"
		   });
	}

} //RESTfulServicePSMPackageImpl
