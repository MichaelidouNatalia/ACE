package eu.fp7.scase.launcher.cimgenerator.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import AuthenticationLayerCIM.AuthenticationLayerCIMFactory;
import AuthenticationLayerCIM.AuthenticationLayerCIMPackage;
import AuthorizationLayerCIM.AuthorizationLayerCIMFactory;
import AuthorizationLayerCIM.AuthorizationLayerCIMPackage;
import ExternalServiceLayerCIM.ExternalServiceLayerCIMFactory;
import ExternalServiceLayerCIM.ExternalServiceLayerCIMPackage;
import SearchLayerCIM.AnnAlgoResource;
import SearchLayerCIM.SearchLayerCIMFactory;
import SearchLayerCIM.SearchLayerCIMPackage;
import ServiceCIM.ServiceCIMPackage;
import ServiceCIM.RESTfulServiceCIM;
import eu.fp7.scase.inputParser.YamlInputParser;
import eu.fp7.scase.inputParser.YamlResource;
import eu.fp7.scase.launcher.cimgenerator.Activator;
import eu.fp7.scase.searchWizard.SearchCIMWizard;
import eu.fp7.scase.authenticationWizard.AuthenticationCIMWizard;
import eu.fp7.scase.abacAuthorizationWizard.ABACAuthorizationCIMWizard;
import eu.fp7.scase.cimGenerator.ACIMProducer;
import eu.fp7.scase.cimGenerator.CoreCIMProducer;
import eu.fp7.scase.cimGenerator.EcoreXMIExtractor;
import eu.fp7.scase.cimeditor.CoreCIMEditorWizard;
import eu.fp7.scase.extcompositions.ExternalCompositionInputParser;
import eu.fp7.scase.extcompositions.ExternalCompositionWizard;
import MDEMigratorCIMMetamodel.AnnotationModel;
import MDEMigratorCIMMetamodel.MDEMigratorCIMMetamodelFactory;
import MDEMigratorCIMMetamodel.MDEMigratorCIMMetamodelPackage;
import eu.fp7.scase.DBMigratorWizard.DBMigrationWizard;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class CIMGenerator extends AbstractHandler{
	
	private YamlInputParser oYamlInputParser;
	private ACIMProducer oACIMProducer;
	private AuthenticationLayerCIM.AnnotationModel oAuthenticationLayerCIM;
	private AuthenticationLayerCIM.AnnotationModel oExistingAuthenticationLayerCIM;
	private AuthorizationLayerCIM.AnnotationModel oAuthorizationLayerCIM;
	private AuthorizationLayerCIM.AnnotationModel oExistingAuthorizationLayerCIM;
	private RESTfulServiceCIM oRESTfulServiceCIM;
	private AuthenticationLayerCIMFactory oAuthenticationLayerCIMFactory;
	private AuthorizationLayerCIMFactory oAuthorizationLayerCIMFactory;
	private SearchLayerCIMFactory oSearchLayerCIMFactory;
	private SearchLayerCIM.AnnotationModel oSearchLayerCIM;
	private SearchLayerCIM.AnnotationModel oExistingSearchLayerCIM;
	private ExternalServiceLayerCIM.AnnotationModel oExternalServiceLayerCIM;
	private ExternalServiceLayerCIM.AnnotationModel oExistingExternalServiceLayerCIM;
	private ExternalServiceLayerCIMFactory oExternalServiceLayerCIMFactory;
	private ArrayList<YamlResource> listOfYamlResources;
	private ExecutionEvent oEvent;
	private boolean bReloadExistingModels;
	private AuthenticationCIMWizard oAuthenticationCIMWizard;
	private ABACAuthorizationCIMWizard oABACAuthoriaztionWizard;
	private SearchCIMWizard oSearchCIMWizard;
	private ExternalCompositionWizard oExternalCompositionWizard;
	private ExternalCompositionInputParser oExternalCompositionInputParser;
	private MDEMigratorCIMMetamodelFactory oMdeMigratorCIMMetamodelFactory;
	private MDEMigratorCIMMetamodel.AnnotationModel oMdeDBMigratorCIM;
	private MDEMigratorCIMMetamodel.AnnotationModel oExistingMdeDBMigratorCIM;
	private DBMigrationWizard oDBMigrationWizard;
	private static MessageConsole myConsole = findConsole("SCASE-UI");
	private static MessageConsoleStream out = myConsole.newMessageStream();

	
	/**
	 * The constructor.
	 */
	public CIMGenerator() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		this.oEvent = event;
		this.bReloadExistingModels = (event.getParameter("ReloadExistingModels") == null ? false : (event.getParameter("ReloadExistingModels").equalsIgnoreCase("yes") ? true : false));
		initializeAllCIMModels(event);
		executeMDE(event);
		exportBackUpXMIs(event);
		return null;
	}


	
	private void exportBackUpXMIs(ExecutionEvent event) {
		//extract Core to a backup file as well to support 2nd run logic
		EcoreXMIExtractor oEcoreXMIExtractor = new EcoreXMIExtractor(event.getParameter("MDEOutputFolder") + "/CIMModels/BackUp/" + event.getParameter("WebServiceName") + "CIMBackUp.xmi", this.oEvent.getParameter("WebServiceName"));
		oEcoreXMIExtractor.exportEcoreXMI(oRESTfulServiceCIM);
		
		//if the authentication flag is true
		if(event.getParameter("Authentication").equalsIgnoreCase("yes")){
			//extract an Authentication CIM backup
			this.oAuthenticationCIMWizard.exportAuthenticationModelBackUp();
		}
		
		//if the authorization flag is true
		if(event.getParameter("Authorization").equalsIgnoreCase("yes")){
			//extract a Search CIM backup
			this.oABACAuthoriaztionWizard.exportABACAuthorizationCIMBackUp();
		}
		
		//if the searching flag is true
		if(event.getParameter("DatabaseSearching").equalsIgnoreCase("yes")){
			//extract a Search CIM backup
			this.oSearchCIMWizard.exportSearchLayerCIMBackUp();
		}
		
		//if the external Service flag is true
		if(event.getParameter("ExternalComposition").equalsIgnoreCase("yes")){
			//extract an External Service layer CIM backup
			this.oExternalCompositionWizard.exportExternalServiceLayerCIMBackUp();
		}
		
		//if the database migration flag is true
		if(event.getParameter("DBMigration").equalsIgnoreCase("yes")){
			//extract a Migration Database layer CIM backup

			this.oDBMigrationWizard.exportDBMigrationModelBackUp();
		}
	}

	private void initializeAllCIMModels(ExecutionEvent event) {
		//if this is a 2nd run, reload previously saved models
		if(this.bReloadExistingModels){
			System.out.println("Reloading existing CIM Models");
			loadAllExistingCIMModels(event);
		}
		else{//else instantiate new ones to get filled up using YAML and Wizard input.
			System.out.println("Begining from scratch!");
			instantiateAllCIMModels(event);
		}
	}

	private void instantiateAllCIMModels(ExecutionEvent event) {
		
		//check if user selected to start from scratch
		if(event.getParameter("YamlFilePath") == null){
			this.listOfYamlResources = new ArrayList<YamlResource>();
		}
		else{
			//parse the input yaml file
			oYamlInputParser = new YamlInputParser(event.getParameter("YamlFilePath"));
			this.listOfYamlResources = oYamlInputParser.parseYamlInputFile();
		}
		
		//initialize the CIM model from yaml
		oACIMProducer = new CoreCIMProducer(listOfYamlResources, this.oEvent.getParameter("WebServiceName"), this.oEvent.getParameter("MDEOutputFolder"), this.oEvent.getParameter("DatabaseIP"), this.oEvent.getParameter("DatabasePort"), this.oEvent.getParameter("DatabaseUsername"), this.oEvent.getParameter("DatabasePassword"), this.oEvent.getParameter("DatabaseType"));
		oRESTfulServiceCIM = oACIMProducer.produceCIM();
		
		//if the authentication flag is true
		if(event.getParameter("Authentication").equalsIgnoreCase("yes")){//instantiate an empty authentication model
			this.oAuthenticationLayerCIMFactory = AuthenticationLayerCIMFactory.eINSTANCE;
			this.oAuthenticationLayerCIM = this.oAuthenticationLayerCIMFactory.createAnnotationModel();
			this.oAuthenticationLayerCIM.setName(oRESTfulServiceCIM.getName() + "AuthenticationModel");
		}
		else{
			this.oAuthenticationLayerCIM = null;
		}
		
		//if the authorization flag is true
		if(event.getParameter("Authorization").equalsIgnoreCase("yes")){//instantiate an empty authorization model
			this.oAuthorizationLayerCIMFactory = AuthorizationLayerCIMFactory.eINSTANCE;
			this.oAuthorizationLayerCIM = this.oAuthorizationLayerCIMFactory.createAnnotationModel();
			this.oAuthorizationLayerCIM.setName(oRESTfulServiceCIM.getName() + "AuthorizationModel");
		}
		else{
			this.oAuthorizationLayerCIM = null;
		}
		
		//if the searching flag is true
		if(event.getParameter("DatabaseSearching").equalsIgnoreCase("yes")){//instantiate an empty searching model
			this.oSearchLayerCIMFactory = SearchLayerCIMFactory.eINSTANCE;
			this.oSearchLayerCIM = this.oSearchLayerCIMFactory.createAnnotationModel();
			this.oSearchLayerCIM.setName(this.oRESTfulServiceCIM.getName() + "SearchLayer");	
		}
		else{
			this.oSearchLayerCIM = null;
		}
		
		//if the external Service flag is true
		if(event.getParameter("ExternalComposition").equalsIgnoreCase("yes")){//instantiate an empty external service composition model
			this.oExternalServiceLayerCIMFactory = ExternalServiceLayerCIMFactory.eINSTANCE;
			this.oExternalServiceLayerCIM = this.oExternalServiceLayerCIMFactory.createAnnotationModel();
			this.oExternalServiceLayerCIM.setName(this.oRESTfulServiceCIM.getName() + "ExternalServiceLayer");
			this.oExternalCompositionInputParser = new ExternalCompositionInputParser(this.listOfYamlResources, oExternalServiceLayerCIM, this.oRESTfulServiceCIM);
			this.oExternalCompositionInputParser.instantiateExternalCompositionsCIM();
		}
		else{
			this.oExistingExternalServiceLayerCIM = null;
		}
		
		//if the database migration flag is true
		if(event.getParameter("DBMigration").equalsIgnoreCase("yes")){//instantiate an empty database migration  model
			this.oMdeMigratorCIMMetamodelFactory = MDEMigratorCIMMetamodelFactory.eINSTANCE;
			this.oMdeDBMigratorCIM = this.oMdeMigratorCIMMetamodelFactory.createAnnotationModel();
			this.oMdeDBMigratorCIM.setName(this.oRESTfulServiceCIM.getName() + "DBMigrationLayer");
		}
		else{
			this.oMdeDBMigratorCIM = null;
		}
	}

	private void loadAllExistingCIMModels(ExecutionEvent event) {
		
		//create a file handler to verify that each model really exists in filesystem
		File oFile;
		
		//load the core CIM model
		oFile = new File(event.getParameter("MDEOutputFolder") + "/CIMModels/BackUp/" + event.getParameter("WebServiceName") + "CIMBackUp.xmi");
		if(oFile.exists() && oFile.isFile()){
			this.oRESTfulServiceCIM = this.loadCoreCIM(event.getParameter("MDEOutputFolder") + "/CIMModels/BackUp/" + event.getParameter("WebServiceName") + "CIMBackUp.xmi");
			System.out.println("Loaded existing core CIM Model.");
		}
		else{//if the Core CIM model does not exist there is no point to try to load anything else
			//so just begin from scratch
			System.out.println("Existing core CIM Model was not found. Begining from scratch!");
			this.bReloadExistingModels = false;
			this.instantiateAllCIMModels(event);
			return;
		}
		
		//if the authentication flag is true
		if(event.getParameter("Authentication").equalsIgnoreCase("yes")){
			oFile = new File(event.getParameter("MDEOutputFolder") + "/CIMModels/BackUp/" + event.getParameter("WebServiceName") + "AuthenticationCIMBackUp.xmi");
			//load the existing authentication layer CIM object in case it is needed
			if(oFile.exists() && oFile.isFile()){
				this.oAuthenticationLayerCIM = this.loadAuthenticationCIM(event.getParameter("MDEOutputFolder") + "/CIMModels/BackUp/" + event.getParameter("WebServiceName") + "AuthenticationCIMBackUp.xmi");
				System.out.println("Loaded existing Authentication CIM Model.");
			}
			else{//if the authentication file cannot be found, create a new, empty one.
				System.out.println("Existing Authentication CIM Model was not found. Creating a new, empty one!");
				this.oAuthenticationLayerCIMFactory = AuthenticationLayerCIMFactory.eINSTANCE;
				this.oAuthenticationLayerCIM = this.oAuthenticationLayerCIMFactory.createAnnotationModel();
				this.oAuthenticationLayerCIM.setName(oRESTfulServiceCIM.getName() + "AuthenticationModel");			
			}
		}
		else{
			this.oAuthenticationLayerCIM = null;
		}
		
		//if the authorization flag is true
		if(event.getParameter("Authorization").equalsIgnoreCase("yes")){
			oFile = new File(event.getParameter("MDEOutputFolder") + "/CIMModels/BackUp/" + event.getParameter("WebServiceName") + "ABACAuthorizationCIMBackUp.xmi");
			//load the existing authorization layer CIM object in case it is needed
			if(oFile.exists() && oFile.isFile()){
				this.oAuthorizationLayerCIM = this.loadAuthorizationCIM(event.getParameter("MDEOutputFolder") + "/CIMModels/BackUp/" + event.getParameter("WebServiceName") + "ABACAuthorizationCIMBackUp.xmi");
				System.out.println("Loaded existing Authorization CIM Model.");
			}
			else{//if the authentication file cannot be found, create a new, empty one.
				System.out.println("Existing Authorization CIM Model was not found. Creating a new, empty one!");
				this.oAuthorizationLayerCIMFactory = AuthorizationLayerCIMFactory.eINSTANCE;
				this.oAuthorizationLayerCIM = this.oAuthorizationLayerCIMFactory.createAnnotationModel();
				this.oAuthorizationLayerCIM.setName(oRESTfulServiceCIM.getName() + "AuthorizationModel");			
			}
		}
		else{
			this.oAuthorizationLayerCIM = null;
		}
			
		
		//if the searching flag is true
		if(event.getParameter("DatabaseSearching").equalsIgnoreCase("yes")){
			oFile = new File(event.getParameter("MDEOutputFolder") + "/CIMModels/BackUp/" + event.getParameter("WebServiceName") + "SearchLayerCIMBackUp.xmi");
			//load the existing  search layer CIM object in case it is needed
			if(oFile.exists() && oFile.isFile()){
				this.oSearchLayerCIM = this.loadSearchLayerCIM(event.getParameter("MDEOutputFolder") + "/CIMModels/BackUp/" + event.getParameter("WebServiceName") + "SearchLayerCIMBackUp.xmi");
				System.out.println("Loaded existing Searching CIM Model");
			}
			else{
				System.out.println("Existing Searching CIM Model was not found. Creating a new, empty one!");
				this.oSearchLayerCIMFactory = SearchLayerCIMFactory.eINSTANCE;
				this.oSearchLayerCIM = this.oSearchLayerCIMFactory.createAnnotationModel();
				this.oSearchLayerCIM.setName(this.oRESTfulServiceCIM.getName() + "SearchLayer");					
			}
		}
		else{
			this.oSearchLayerCIM = null;
		}
		
		//if the external Service flag is true
		if(event.getParameter("ExternalComposition").equalsIgnoreCase("yes")){
			oFile = new File(event.getParameter("MDEOutputFolder") + "/CIMModels/BackUp/" + event.getParameter("WebServiceName") + "ExternalServiceLayerCIMBackUp.xmi");
			//load the existing external service composition layer model in case it is needed
			if(oFile.exists() && oFile.isFile()){
				this.oExternalServiceLayerCIM = this.loadExternalServiceLayerCIM(event.getParameter("MDEOutputFolder") + "/CIMModels/BackUp/" + event.getParameter("WebServiceName") + "ExternalServiceLayerCIMBackUp.xmi");
				System.out.println("Loaded existing External Service CIM Model");
			}
			else{
				//TODO once the composition input from CERTH is available add here external service layer CIM instantiation
				System.out.println("Existing External Service CIM Model was not found. Creating a new, empty one!");
				this.oExternalServiceLayerCIMFactory = ExternalServiceLayerCIMFactory.eINSTANCE;
				this.oExternalServiceLayerCIM = this.oExternalServiceLayerCIMFactory.createAnnotationModel();
				this.oExternalServiceLayerCIM.setName(this.oRESTfulServiceCIM.getName() + "ExternalServiceLayer");	
			}
		}
		else{
			this.oExternalServiceLayerCIM = null;
		}
		
		//if the database migration flag is true
		if(event.getParameter("DBMigration").equalsIgnoreCase("yes")){
			oFile = new File(event.getParameter("MDEOutputFolder") + "/CIMModels/BackUp/" + event.getParameter("WebServiceName") + "MDEDBMigrationCIMBackUp.xmi");
			//load the existing database migration layer model in case it is needed
			if(oFile.exists() && oFile.isFile()){
				this.oMdeDBMigratorCIM = this.loadDBMigrationLayerCIM(event.getParameter("MDEOutputFolder") + "/CIMModels/BackUp/" + event.getParameter("WebServiceName") + "MDEDBMigrationCIMBackUp.xmi");
				System.out.println("Loaded existing Database Migration CIM Model");
			}
			else{
				System.out.println("Existing Database Migration CIM Model was not found. Creating a new, empty one!");
				this.oMdeMigratorCIMMetamodelFactory = MDEMigratorCIMMetamodelFactory.eINSTANCE;
				this.oMdeDBMigratorCIM = this.oMdeMigratorCIMMetamodelFactory.createAnnotationModel();
				this.oMdeDBMigratorCIM.setName(this.oRESTfulServiceCIM.getName() + "DBMigrationLayer");	
			}
		}
		else{
			this.oMdeDBMigratorCIM = null;
		}
	}

	private void executeMDE(ExecutionEvent event) throws ExecutionException {
		
		//initiate CIM generator to create the envisioned system's Core REST CIM
			createCoreRestCIM(event);
		
		//if the authentication flag is true
		if(event.getParameter("Authentication").equalsIgnoreCase("yes")){
			//initialize an authentication layer CIM object in case it is needed
			createBasicAuthenticationCIM(event);
		}
		
		//if the searching flag is true
		if(event.getParameter("DatabaseSearching").equalsIgnoreCase("yes") && existsAlgoResource()){
			//initialize a search layer CIM object in case it is needed
			createDatabaseSearchingCIM(event);
		}
		
		//if the external Service flag is true
		if(event.getParameter("ExternalComposition").equalsIgnoreCase("yes") && existsNonSearchAlgoResource()){
			createExternalServiceLayerCIM(event);
		}
		
		//if the authorization flag is true
		if(event.getParameter("Authorization").equalsIgnoreCase("yes") && event.getParameter("Authentication").equalsIgnoreCase("yes")){
			//initialize an authentication layer CIM object in case it is needed
			createABACAuthorizationCIM(event);
		}
		
		//if the database migration flag is true
		if(event.getParameter("DBMigration").equalsIgnoreCase("yes")){
			//initialize a database migration layer CIM object in case it is needed
			createDBMigrationCIM(event);
		}
	}

	private boolean existsNonSearchAlgoResource() {
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic()){
				if(this.oSearchLayerCIM == null){
					return true;
				}
				for(int i = 0; i < this.oSearchLayerCIM.getHasAnnotatedElement().size(); i++){
					if(this.oSearchLayerCIM.getHasAnnotatedElement() instanceof AnnAlgoResource ){
						if(((AnnAlgoResource)this.oSearchLayerCIM.getHasAnnotatedElement()).getAnnotatesAlgoResource().getName().equalsIgnoreCase(this.oRESTfulServiceCIM.getHasResources().get(n).getName())){
							return false;
						}
					}
				}
				return true;
			}
		}
		
		return false; //throw exception that resource is not found in production code
	}

	private boolean existsAlgoResource(){
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic()){
				return true;
			}
		}
		
		return false; //through exception that resource is not found in production code
	}
	
	private boolean createCoreRestCIM(ExecutionEvent event) throws ExecutionException{

		//initialize the core CIM wizard
		CoreCIMEditorWizard oCoreCIMEditorWizard = new CoreCIMEditorWizard(this.oEvent.getParameter("MDEOutputFolder"), oRESTfulServiceCIM, calculateMinimumRequiredAlgoResources(), this.bReloadExistingModels);
		WizardDialog oCoreCIMEditorWizardDialog = new WizardDialog(null, oCoreCIMEditorWizard);
		if(oCoreCIMEditorWizardDialog.open() == Window.OK){
			oRESTfulServiceCIM = oCoreCIMEditorWizard.updateCIM();
			//extract Core REST CIM to XMI.
			EcoreXMIExtractor oEcoreXMIExtractor = new EcoreXMIExtractor(event.getParameter("MDEOutputFolder") + "/CIMModels/" + event.getParameter("WebServiceName") + "CIM.xmi", this.oEvent.getParameter("WebServiceName"));
			oEcoreXMIExtractor.exportEcoreXMI(oRESTfulServiceCIM);
		}
		else{
			throw new ExecutionException("Code generation process canceled by user.", new CanceledExecutionException("canceled exception"));
		}
		
		return true;
	}
	
	private int calculateMinimumRequiredAlgoResources() {
		
		//if the developer selected to embed both Searching and interoperation with external services
		if(this.oEvent.getParameter("DatabaseSearching").equalsIgnoreCase("yes")
		  && this.oEvent.getParameter("ExternalComposition").equalsIgnoreCase("yes")){
			return 2;
		}//else if he selected only one of two
		else if(this.oEvent.getParameter("DatabaseSearching").equalsIgnoreCase("yes")
				  && this.oEvent.getParameter("ExternalComposition").equalsIgnoreCase("no")){
			return 1;
		}
		else if(this.oEvent.getParameter("DatabaseSearching").equalsIgnoreCase("no")
				  && this.oEvent.getParameter("ExternalComposition").equalsIgnoreCase("yes")){
			return 1;
		}
		else{//else no algorithmic functionality is desired
			return 0;
		}		
	}

	private boolean createBasicAuthenticationCIM(ExecutionEvent event) throws ExecutionException{
		
		//setup the authentication CIM wizard
		oAuthenticationCIMWizard = new AuthenticationCIMWizard(this.oEvent.getParameter("MDEOutputFolder"), oRESTfulServiceCIM, oAuthenticationLayerCIM, this.bReloadExistingModels);
		WizardDialog oAuthenticationWizardDialog = new WizardDialog(null, oAuthenticationCIMWizard);
		if(oAuthenticationWizardDialog.open() == Window.OK){
			oAuthenticationCIMWizard.createAuthenticationCIM();
		}
		else{
			throw new ExecutionException("Code generation process canceled by user.", new CanceledExecutionException("canceled exception"));
		}
		
		return true;
	}
	
	private boolean createABACAuthorizationCIM(ExecutionEvent event) throws ExecutionException{
		
		//setup the authorization CIM wizard
		oABACAuthoriaztionWizard = new ABACAuthorizationCIMWizard(this.oEvent.getParameter("MDEOutputFolder"), oRESTfulServiceCIM, oAuthorizationLayerCIM, oAuthenticationLayerCIM, this.bReloadExistingModels);
		WizardDialog oABACAuthoriaztionWizardDialog = new WizardDialog(null, oABACAuthoriaztionWizard);
		if(oABACAuthoriaztionWizardDialog.open() == Window.OK){
			oABACAuthoriaztionWizard.createABACAuthorizationCIM();
		}
		else{
			throw new ExecutionException("Code generation process canceled by user.", new CanceledExecutionException("canceled exception"));
		}
		
		return true;
	}
	
	private boolean createDatabaseSearchingCIM(ExecutionEvent event) throws ExecutionException{
		
		//setup the search CIM wizard
		oSearchCIMWizard = new SearchCIMWizard(this.oEvent.getParameter("MDEOutputFolder"), oRESTfulServiceCIM, oSearchLayerCIM, (this.oEvent.getParameter("Authentication").equalsIgnoreCase("yes") ? oAuthenticationLayerCIM : null), calculateMaxSearchResources(), this.bReloadExistingModels);
		WizardDialog oSearchWizardDialog = new WizardDialog(null, oSearchCIMWizard);
		
		if(oSearchWizardDialog.open() == Window.OK){
			this.oSearchLayerCIM = oSearchCIMWizard.createSearchLayerCIM();
		}
		else{
			throw new ExecutionException("Code generation process canceled by user.", new CanceledExecutionException("canceled exception"));
		}
		
		return true;
	}
	
	private int calculateMaxSearchResources() {
		//if the developer selected to embed both Searching and interoperation with external services
		if(this.oEvent.getParameter("DatabaseSearching").equalsIgnoreCase("yes")
		  && this.oEvent.getParameter("ExternalComposition").equalsIgnoreCase("yes")){
			return getNumberOfAlgoResource() - 1;
		}//else if he selected only one of two
		else if(this.oEvent.getParameter("DatabaseSearching").equalsIgnoreCase("yes")
				  && this.oEvent.getParameter("ExternalComposition").equalsIgnoreCase("no")){
			return getNumberOfAlgoResource();
		}

		return -1; //throw exception in production code
	}

	private int getNumberOfAlgoResource() {
		int iNumberOfAlgoResources = 0;
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() == true){
				iNumberOfAlgoResources++;
			}
		}
		return iNumberOfAlgoResources;
	}

	private boolean createExternalServiceLayerCIM(ExecutionEvent event) throws ExecutionException{
		
		//setup the external service CIM wizard
		oExternalCompositionWizard = new ExternalCompositionWizard(this.oEvent.getParameter("MDEOutputFolder"), this.oRESTfulServiceCIM, this.oExternalServiceLayerCIM, this.oSearchLayerCIM, this.bReloadExistingModels, this.listOfYamlResources);
		WizardDialog oExternalCompositionWizardDialog = new WizardDialog(null, oExternalCompositionWizard);
		
		if(oExternalCompositionWizardDialog.open() == Window.OK){
			oExternalCompositionWizard.createExternalServiceLayerCIM();
		}
		else{
			throw new ExecutionException("Code generation process canceled by user.", new CanceledExecutionException("canceled exception"));
		}

		return true;
	}
	
	private boolean createDBMigrationCIM(ExecutionEvent event) throws ExecutionException {
		//setup the database migration CIM wizard
		this.oDBMigrationWizard = new DBMigrationWizard(this.oEvent.getParameter("MDEOutputFolder"), this.oRESTfulServiceCIM, this.oMdeDBMigratorCIM, this.bReloadExistingModels);
		WizardDialog oDBMigrationWizardDialog = new WizardDialog(null, oDBMigrationWizard);
		
		if(oDBMigrationWizardDialog.open() == Window.OK){
			oDBMigrationWizard.createDBMigrationCIM();
		}
		else{
			throw new ExecutionException("Code generation process canceled by user.", new CanceledExecutionException("canceled exception"));
		}

		return true;
	}
	
	private RESTfulServiceCIM loadCoreCIM(String strPathToCORECIM){
		
		ResourceSet oResourceSet;
		URI oURI;
		
		ServiceCIMPackage.eINSTANCE.getClass();
		
		// Create a resource set.
		oResourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		oResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(org.eclipse.emf.ecore.resource.Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		// Get the URI of the model file.
		oURI = URI.createFileURI(new File(strPathToCORECIM).getAbsolutePath());
		out.println(oURI.devicePath());

	    // Get the resource
	    Resource resource = oResourceSet.getResource(oURI, true);
	    
	    try {
			resource.load(null);
		} catch (IOException e) {
			Activator.log("Could not load Core CIM file", e);
		}
	    
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    RESTfulServiceCIM oRESTfulServiceCIM = (RESTfulServiceCIM) resource.getContents().get(0);
	    return oRESTfulServiceCIM;

	}

	private AuthenticationLayerCIM.AnnotationModel loadAuthenticationCIM(String strAuthenticationCIMPath){
		
		ResourceSet oResourceSet;
		URI oURI;
		
		AuthenticationLayerCIMPackage.eINSTANCE.getClass();
		
		// Create a resource set.
		oResourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		oResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(org.eclipse.emf.ecore.resource.Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		// Get the URI of the model file.
		oURI = URI.createFileURI(new File(strAuthenticationCIMPath).getAbsolutePath());
		out.println(oURI.devicePath());

	    // Get the resource
	    Resource resource = oResourceSet.getResource(oURI, true);
	    
	    try {
			resource.load(null);
		} catch (IOException e) {
			Activator.log("Could not load Authentication CIM file", e);

		}
	    
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    AuthenticationLayerCIM.AnnotationModel oAnnotationModel = (AuthenticationLayerCIM.AnnotationModel) resource.getContents().get(0);
	    return oAnnotationModel;
	}
	
	private AuthorizationLayerCIM.AnnotationModel loadAuthorizationCIM(String strAuthorizationCIMPath){
		
		ResourceSet oResourceSet;
		URI oURI;
		
		AuthorizationLayerCIMPackage.eINSTANCE.getClass();
		
		// Create a resource set.
		oResourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		oResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(org.eclipse.emf.ecore.resource.Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		// Get the URI of the model file.
		oURI = URI.createFileURI(new File(strAuthorizationCIMPath).getAbsolutePath());
		out.println(oURI.devicePath());

	    // Get the resource
	    Resource resource = oResourceSet.getResource(oURI, true);
	    
	    try {
			resource.load(null);
		} catch (IOException e) {
			Activator.log("Could not load Authorization CIM file", e);

		}
	    
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    AuthorizationLayerCIM.AnnotationModel oAnnotationModel = (AuthorizationLayerCIM.AnnotationModel) resource.getContents().get(0);
	    return oAnnotationModel;
	}

	private SearchLayerCIM.AnnotationModel loadSearchLayerCIM(String strSearchLayerPath){
		
		ResourceSet oResourceSet;
		URI oURI;
		
		SearchLayerCIMPackage.eINSTANCE.getClass();
		
		// Create a resource set.
		oResourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		oResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(org.eclipse.emf.ecore.resource.Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		// Get the URI of the model file.
		oURI = URI.createFileURI(new File(strSearchLayerPath).getAbsolutePath());
		out.println(oURI.devicePath());

	    // Get the resource
	    Resource resource = oResourceSet.getResource(oURI, true);
	    
	    try {
			resource.load(null);
		} catch (IOException e) {
			Activator.log("Could not load Search layer CIM file", e);

		}
	    
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    SearchLayerCIM.AnnotationModel oAnnotationModel = (SearchLayerCIM.AnnotationModel) resource.getContents().get(0);
	    return oAnnotationModel;
	}
	
	private ExternalServiceLayerCIM.AnnotationModel loadExternalServiceLayerCIM(String strExternalServiceLayerPath){
		
		ResourceSet oResourceSet;
		URI oURI;
		
		ExternalServiceLayerCIMPackage.eINSTANCE.getClass();
		
		// Create a resource set.
		oResourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		oResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(org.eclipse.emf.ecore.resource.Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		// Get the URI of the model file.
		oURI = URI.createFileURI(new File(strExternalServiceLayerPath).getAbsolutePath());
		out.println(oURI.devicePath());

	    // Get the resource
	    Resource resource = oResourceSet.getResource(oURI, true);
	    
	    try {
			resource.load(null);
		} catch (IOException e) {
			Activator.log("Could not load External Service Composition CIM file", e);
		}
	    
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    ExternalServiceLayerCIM.AnnotationModel oAnnotationModel = (ExternalServiceLayerCIM.AnnotationModel) resource.getContents().get(0);
	    return oAnnotationModel;
	}
	
	private AnnotationModel loadDBMigrationLayerCIM(String strDBMigrationBackUpPath) {
		
		ResourceSet oResourceSet;
		URI oURI;
		
		MDEMigratorCIMMetamodelPackage.eINSTANCE.getClass();
		
		// Create a resource set.
		oResourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		oResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(org.eclipse.emf.ecore.resource.Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		// Get the URI of the model file.
		oURI = URI.createFileURI(new File(strDBMigrationBackUpPath).getAbsolutePath());
		out.println(oURI.devicePath());

	    // Get the resource
	    Resource resource = oResourceSet.getResource(oURI, true);
	    
	    try {
			resource.load(null);
		} catch (IOException e) {
			Activator.log("Could not load DB Migration CIM file", e);
		}
	    
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    MDEMigratorCIMMetamodel.AnnotationModel oAnnotationModel = (MDEMigratorCIMMetamodel.AnnotationModel) resource.getContents().get(0);
	    return oAnnotationModel;
	}
	
	private static MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++){
		    if (name.equals(existing[i].getName())){
		    	return (MessageConsole) existing[i];
		    }
		}
		//no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[]{myConsole});
		return myConsole;
	}
}
