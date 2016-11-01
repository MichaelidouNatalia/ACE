package annotationstackpopulator.handlers;

import AnnotationLayerStack.AnnotationStack;
import AnnotationLayerStack.AnnotationLayerStackFactory;
import AuthenticationLayerPSM.AuthenticationLayerPSMPackage;
import AuthorizationLayerPSM.AuthorizationLayerPSMPackage;
import ExternalServiceLayerPSM.ExternalServiceLayerPSMPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.DiagnosticException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

import annotationstackpopulator.Activator;
import RESTfulServicePSM.ServicePSM;
import RESTfulServicePSM.RESTfulServicePSMPackage;
import SearchLayerPSM.SearchLayerPSMPackage;
import MDEMigratorPSMMetamodel.MDEMigratorPSMMetamodelPackage;


/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class AnnotationStackPopulator extends AbstractHandler {
	
	private ServicePSM oRESTfulServicePSM;
	private AuthenticationLayerPSM.AnnotationModel oAuthenticationLayerPSM;
	private AuthorizationLayerPSM.AnnotationModel oAuthorizationLayerPSM;
	private SearchLayerPSM.AnnotationModel oSearchLayerPSM;
	private ExternalServiceLayerPSM.AnnotationModel oExternalServiceLayerPSM;
	private MDEMigratorPSMMetamodel.AnnotationModel oDBMigratorPSM;
	private AnnotationStack oAnnotationStack;
	private String strOutputFolder;
	private String strProjectName;
	private static MessageConsole myConsole = findConsole("SCASE-UI");
	private static MessageConsoleStream out = myConsole.newMessageStream();
	
	/**
	 * The constructor.
	 */
	public AnnotationStackPopulator() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		this.strOutputFolder = event.getParameter("MDEOutputFolder");
		this.strProjectName  = event.getParameter("WebServiceName");
		
		
		//create new Annotation Layer Stack
		AnnotationLayerStackFactory oAnnotationLayerStackFactory = AnnotationLayerStackFactory.eINSTANCE;
		oAnnotationStack = oAnnotationLayerStackFactory.createAnnotationStack();
		
		//load the core PSM of the RESTful service to be produced

		oRESTfulServicePSM = loadCorePSM(event.getParameter("MDEOutputFolder") + "/PSMModels/" + event.getParameter("WebServiceName") + "PSM.xmi");
		oAnnotationStack.setHasCorePSM(oRESTfulServicePSM);

		//if there is an authentication layer to load, load it
		
		oAuthenticationLayerPSM = loadAuthenticationPSM(event.getParameter("MDEOutputFolder") + "/PSMModels/" + event.getParameter("WebServiceName") + "AuthenticationPSM.xmi");
		if(oAuthenticationLayerPSM != null){
			System.out.println("Found Authentication Layer!");
			oAnnotationStack.setBHasAuthenticationAnnotation(true);
			oAnnotationStack.setHasAuthenticationLayer(oAuthenticationLayerPSM);
		}
		else{
			System.out.println("Could not find Authentication Layer!");
			oAnnotationStack.setBHasAuthenticationAnnotation(false);
		}
		
		oAnnotationStack.setCssSelection(event.getParameter("CSSSelection"));
		out.println(oAnnotationStack.getCssSelection());
		
		//export annotation layer stack
		exportAnnotationLayerStack();
		return null;
	}
	
	private ServicePSM loadCorePSM(String strPathToCOREPSM){
		
		ResourceSet oResourceSet;
		URI oURI;
		
		RESTfulServicePSMPackage.eINSTANCE.getClass();
		
		// Create a resource set.
		oResourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		oResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(org.eclipse.emf.ecore.resource.Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		// Get the URI of the model file.
		oURI = URI.createFileURI(new File(strPathToCOREPSM).getAbsolutePath());
		out.println(oURI.devicePath());

	    // Get the resource
	    Resource resource = oResourceSet.getResource(oURI, true);
	    
	    try {
			resource.load(null);
		} catch (IOException e) {
			Activator.log("Could not load Core PSM file", e);
		}
	    
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    ServicePSM oRESTfulServicePSM = (ServicePSM) resource.getContents().get(0);
	    return oRESTfulServicePSM;

	}

	private AuthenticationLayerPSM.AnnotationModel loadAuthenticationPSM(String strAuthenticationPSMPath){
		
		ResourceSet oResourceSet;
		URI oURI;
		
		AuthenticationLayerPSMPackage.eINSTANCE.getClass();
		
		// Create a resource set.
		oResourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		oResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(org.eclipse.emf.ecore.resource.Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		// Get the URI of the model file.
		oURI = URI.createFileURI(new File(strAuthenticationPSMPath).getAbsolutePath());
		out.println(oURI.devicePath());

	    // Get the resource
	    Resource resource; 
	    
		try {
			resource = oResourceSet.getResource(oURI, true);
			resource.load(null);
		}
		catch (Throwable e) {
			return null;
		}
	    
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    AuthenticationLayerPSM.AnnotationModel oAnnotationModel = (AuthenticationLayerPSM.AnnotationModel) resource.getContents().get(0);
	    return oAnnotationModel;
	}
	
	private AuthorizationLayerPSM.AnnotationModel loadAuthorizationPSM(String strAuthorizationPSMPath){
		
		ResourceSet oResourceSet;
		URI oURI;
		
		AuthorizationLayerPSMPackage.eINSTANCE.getClass();
		
		// Create a resource set.
		oResourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		oResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(org.eclipse.emf.ecore.resource.Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		// Get the URI of the model file.
		oURI = URI.createFileURI(new File(strAuthorizationPSMPath).getAbsolutePath());
		out.println(oURI.devicePath());

	    // Get the resource
	    Resource resource = oResourceSet.getResource(oURI, true);
	    
	    try {
			resource.load(null);
		} catch (IOException e) {
			Activator.log("Could not load Authorization PSM file", e);
		}
	    
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    AuthorizationLayerPSM.AnnotationModel oAnnotationModel = (AuthorizationLayerPSM.AnnotationModel) resource.getContents().get(0);
	    return oAnnotationModel;
	}

	private SearchLayerPSM.AnnotationModel loadSearchLayerPSM(String strSearchLayerPath){
		
		ResourceSet oResourceSet;
		URI oURI;
		
		SearchLayerPSMPackage.eINSTANCE.getClass();
		
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
			Activator.log("Could not load Search PSM file", e);
		}
	    
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    SearchLayerPSM.AnnotationModel oAnnotationModel = (SearchLayerPSM.AnnotationModel) resource.getContents().get(0);
	    return oAnnotationModel;
	}
	
	private ExternalServiceLayerPSM.AnnotationModel loadExternalServiceLayerPSM(String strExternalServiceLayerPath){
		
		ResourceSet oResourceSet;
		URI oURI;
		
		ExternalServiceLayerPSMPackage.eINSTANCE.getClass();
		
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
			Activator.log("Could not load External Service Layer PSM file", e);
		}
	    
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    ExternalServiceLayerPSM.AnnotationModel oAnnotationModel = (ExternalServiceLayerPSM.AnnotationModel) resource.getContents().get(0);
	    return oAnnotationModel;
	}

	private void exportAnnotationLayerStack(){
		
		ResourceSet oResourceSet;
		URI oURI;
		org.eclipse.emf.ecore.resource.Resource oEcoreResource;
		
		// Create a resource set.
		oResourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		oResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(org.eclipse.emf.ecore.resource.Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		// Get the URI of the model file.
		oURI = URI.createFileURI(new File(this.strOutputFolder + "/AnnotationStack/" + this.strProjectName + "ClientAnnotationStack.xmi").toString());
		out.println(oURI.devicePath());

		// Create a resource for this file.
		oEcoreResource = oResourceSet.createResource(oURI);
		
		oEcoreResource.getContents().add(oAnnotationStack);
		
		//save to disk
		try {
			oEcoreResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			Activator.log("Could not save the meta-model stack to an XMI file", e);
		}
	}
	
	private MDEMigratorPSMMetamodel.AnnotationModel loadDBMigrationLayerPSM(String strDBMigratorPath) {
		ResourceSet oResourceSet;
		URI oURI;
		
		MDEMigratorPSMMetamodelPackage.eINSTANCE.getClass();
		
		// Create a resource set.
		oResourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		oResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(org.eclipse.emf.ecore.resource.Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		// Get the URI of the model file.
		oURI = URI.createFileURI(new File(strDBMigratorPath).getAbsolutePath());
		out.println(oURI.devicePath());

	    // Get the resource
	    Resource resource = oResourceSet.getResource(oURI, true);
	    
	    try {
			resource.load(null);
		} catch (IOException e) {
			Activator.log("Could not load DB Migration Layer PSM file", e);
		}
	    
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    MDEMigratorPSMMetamodel.AnnotationModel oAnnotationModel = (MDEMigratorPSMMetamodel.AnnotationModel) resource.getContents().get(0);
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