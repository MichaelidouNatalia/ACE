package eu.fp7.scase.cimGenerator;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

import AuthorizationLayerCIM.AnnotationModel;

public class EcoreXMIABACAuthorizationExtractor {
	
	private ResourceSet oResourceSet;
	private URI oURI;
	private org.eclipse.emf.ecore.resource.Resource oEcoreResource;
	private String strProjectName;
	private String strOutputFolder;
	private static MessageConsole myConsole = findConsole("SCASE-UI");
	private static MessageConsoleStream out = myConsole.newMessageStream();
	
	
	//the code of this constructor is standard Ecore XMI writer initialization code
	public EcoreXMIABACAuthorizationExtractor(String strOutputFolder, String strProjectName){	
		this.strProjectName = strProjectName;
		this.strOutputFolder = strOutputFolder;
		
		// Create a resource set.
		oResourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		oResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(org.eclipse.emf.ecore.resource.Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		// Get the URI of the model file.
		oURI = URI.createFileURI(new File(this.strOutputFolder).getAbsolutePath());
		out.println(oURI.devicePath());

		// Create a resource for this file.
		oEcoreResource = oResourceSet.createResource(oURI);
	}
	
	public void exportEcoreXMI(AnnotationModel oAuthorizationCIM){
			this.oEcoreResource.getContents().add(oAuthorizationCIM);
		
		//save to disk
		try {
			this.oEcoreResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
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
