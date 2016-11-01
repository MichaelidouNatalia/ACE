package eu.scasefp7.eclipse.mde.m2t.handlers;

import java.io.File;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

import LayeredPSMToText.main.Generate;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class MDEModelToTextTransformation extends AbstractHandler {
	
	private static MessageConsole myConsole = findConsole("SCASE-UI");
	private static MessageConsoleStream out = myConsole.newMessageStream();
	
	/**
	 * The constructor.
	 */
	public MDEModelToTextTransformation() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {

		//delete any existing source files
		deleteExistingSourceFiles(event);
		
		String[] acceleoArguments = new String[2];
		acceleoArguments[0] = event.getParameter("MDEOutputFolder") + "/AnnotationStack/" + event.getParameter("WebServiceName") + "ClientAnnotationStack.xmi";
		acceleoArguments[1] = event.getParameter("MDEOutputFolder") + "/MDEGeneratedCode/AutoClient/";		

		Generate.main(acceleoArguments);
		return null;
	}
	
	private void deleteExistingSourceFiles(ExecutionEvent oEvent) {
		File oMdeOutputDirectory = new  File(oEvent.getParameter("MDEOutputFolder") + "/MDEGeneratedCode/AutoClient/" + oEvent.getParameter("WebServiceName"));
		this.deleteFile(oMdeOutputDirectory);
	}

	private void deleteFile(File element) {
		String filename = element.getName();
		int pos = filename.lastIndexOf(".");
		String filenameWithoutExtension = "_";
		if (pos >= 0)
			filenameWithoutExtension = filename.substring(0, pos);
		if (element.isDirectory()) {
			for (File sub : element.listFiles()) {
				if (!filenameWithoutExtension.equals(""))
					deleteFile(sub);
			}
		}
		if (!filenameWithoutExtension.equals(""))
			element.delete();
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
