package eu.scasefp7.eclipse.mde.m2m.handlers;

import java.io.IOException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.m2m.atl.AuthenticationCIMToPIM.files.AuthenticationCIMToPIMTransformation;
import org.eclipse.m2m.atl.AuthenticationPIMToPSMTransformation.files.AuthenticationPIMToPSMTransformation;
import org.eclipse.m2m.atl.AuthorizationCIMToPIM.files.ABACAuthorizationCIMToPIMTransformation;
import org.eclipse.m2m.atl.AuthorizationPIMToPSM.files.ABACAuthorizationPIMToPSMTransformation;
import org.eclipse.m2m.atl.CoreCIMToPIM.files.CIMToPIMTransformation;
import org.eclipse.m2m.atl.CorePIMToPSM.files.PIMToPSMTransformation;
import org.eclipse.m2m.atl.DatabaseSearchingCIMToPIM.files.SearchLayerCIMToPIMTransformation;
import org.eclipse.m2m.atl.DatabaseSearchingPIMToPSMTransformation.files.SearchLayerPIMToPSMTransformation;
import org.eclipse.m2m.atl.ExternalServiceLayerCIMToPIM.files.ExternalServiceLayerCIMToPIM;
import org.eclipse.m2m.atl.ExternalServiceLayerPIMToPSM.files.ExternalServiceLayerPIMToPSM;
import org.eclipse.m2m.atl.MDEMigratorCIMToPIMTransformation.files.MDEMigratorCIMToPIMTransformation;
import org.eclipse.m2m.atl.MDEMigratorPIMToPSMTransformation.files.MDEMigratorPIMToPSMTransformation;

import eu.scasefp7.eclipse.mde.m2m.Activator;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class ModelToModelTransformationQueue extends AbstractHandler {
	
	/**
	 * The constructor.
	 */
	public ModelToModelTransformationQueue() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
			try {
				//execute Core M2M transformations
				executeCoreModelToModelTransformations(event);
				
				//execute Authentication Layer M2M transformations
				if(event.getParameter("Authentication").equalsIgnoreCase("yes")){
					exucuteAuthenticationModelToModelTransformations(event);
				}
                
                //execute Authorization Layer M2M transformations
                if(event.getParameter("Authorization").equalsIgnoreCase("yes")){
                    executeAuthorizationModelToModelTransformations(event);
                }
				
				//execute Database Searching Layer M2M transformations
				if(event.getParameter("DatabaseSearching").equalsIgnoreCase("yes")){
					executeDatabaseSearchingModelToModelTransformations(event);
				}
				
				//execute External Service Composition Layer M2M transformations
				if(event.getParameter("ExternalComposition").equalsIgnoreCase("yes")){
					executeExternalServiceLayerModelToModelTransformations(event);
				}
				
				//execute DB migration Layer M2M transformations
				if(event.getParameter("DBMigration").equalsIgnoreCase("yes")){
					executeDBMigrationLayerModelToModelTransformations(event);
				}
			
			} catch (IOException e) {
				Activator.log("Failed to load/save one or more core or annotation meta-models.", e);
			}

		return null;
	}
	
	private void executeCoreModelToModelTransformations(ExecutionEvent event) throws IOException{
		executeCoreCIMToPIMTransformation(event);
		executeCorePIMToPSMTransformation(event);
	}
	
	private void executeCoreCIMToPIMTransformation(ExecutionEvent event) throws IOException{
		
		String[] strInputArguments = new String[2];
		strInputArguments[0] = "file:/" + event.getParameter("MDEOutputFolder") + "/CIMModels/" + event.getParameter("WebServiceName") + "CIM.xmi";
		strInputArguments[1] = "file:/" + event.getParameter("MDEOutputFolder") + "/PIMModels/" + event.getParameter("WebServiceName") + "PIM.xmi";
		CIMToPIMTransformation.main(strInputArguments);
	}
	
	private void executeCorePIMToPSMTransformation(ExecutionEvent event) throws IOException{
		
		String[] strInputArguments = new String[2];
		strInputArguments[0] = "file:/" + event.getParameter("MDEOutputFolder") + "/PIMModels/" + event.getParameter("WebServiceName") + "PIM.xmi";
		strInputArguments[1] = "file:/" + event.getParameter("MDEOutputFolder") + "/PSMModels/" + event.getParameter("WebServiceName") + "PSM.xmi";
		PIMToPSMTransformation.main(strInputArguments);
	}
	
	private void exucuteAuthenticationModelToModelTransformations(ExecutionEvent event){
		executeAuthenticationCIMToPIMTransformation(event);
		executeAuthenticationPIMToPSMTransformation(event);
	}
	
	private void executeAuthenticationCIMToPIMTransformation(ExecutionEvent event){
		String[] strInputArguments = new String[4];
		strInputArguments[0] = "file:/" + event.getParameter("MDEOutputFolder") + "/CIMModels/" + event.getParameter("WebServiceName") + "AuthenticationCIM.xmi";
		strInputArguments[1] = "file:/" + event.getParameter("MDEOutputFolder") + "/CIMModels/" + event.getParameter("WebServiceName") + "CIM.xmi";
		strInputArguments[2] = "file:/" + event.getParameter("MDEOutputFolder") + "/PIMModels/" + event.getParameter("WebServiceName") + "PIM.xmi";
		strInputArguments[3] = "file:/" + event.getParameter("MDEOutputFolder") + "/PIMModels/" + event.getParameter("WebServiceName") + "AuthenticationPIM.xmi";
		AuthenticationCIMToPIMTransformation.main(strInputArguments);
	}
	
	private void executeAuthenticationPIMToPSMTransformation(ExecutionEvent event){
		String[] strInputArguments = new String[4];
		strInputArguments[0] = "file:/" + event.getParameter("MDEOutputFolder") + "/PIMModels/" + event.getParameter("WebServiceName") + "PIM.xmi";
		strInputArguments[1] = "file:/" + event.getParameter("MDEOutputFolder") + "/PIMModels/" + event.getParameter("WebServiceName") + "AuthenticationPIM.xmi";
		strInputArguments[2] = "file:/" + event.getParameter("MDEOutputFolder") + "/PSMModels/" + event.getParameter("WebServiceName") + "PSM.xmi";
		strInputArguments[3] = "file:/" + event.getParameter("MDEOutputFolder") + "/PSMModels/" + event.getParameter("WebServiceName") + "AuthenticationPSM.xmi";
		AuthenticationPIMToPSMTransformation.main(strInputArguments);
	}
    
    private void executeAuthorizationModelToModelTransformations(ExecutionEvent event) {
        executeAuthorizationCIMToPIMTransformation(event);
        executeAuthorizationPIMToPSMTransformation(event);
    }
    
    private void executeAuthorizationCIMToPIMTransformation(ExecutionEvent event) {
        String[] strInputArguments = new String[4];
        strInputArguments[0] = "file:/" + event.getParameter("MDEOutputFolder") + "/CIMModels/" + event.getParameter("WebServiceName") + "ABACAuthorizationCIM.xmi";
        strInputArguments[1] = "file:/" + event.getParameter("MDEOutputFolder") + "/CIMModels/" + event.getParameter("WebServiceName") + "CIM.xmi";
        strInputArguments[2] = "file:/" + event.getParameter("MDEOutputFolder") + "/PIMModels/" + event.getParameter("WebServiceName") + "PIM.xmi";
        strInputArguments[3] = "file:/" + event.getParameter("MDEOutputFolder") + "/PIMModels/" + event.getParameter("WebServiceName") + "ABACAuthorizationPIM.xmi";
        ABACAuthorizationCIMToPIMTransformation.main(strInputArguments);
    }
    
    private void executeAuthorizationPIMToPSMTransformation(ExecutionEvent event) {
        String[] strInputArguments = new String[4];
        strInputArguments[0] = "file:/" + event.getParameter("MDEOutputFolder") + "/PIMModels/" + event.getParameter("WebServiceName") + "ABACAuthorizationPIM.xmi";
        strInputArguments[1] = "file:/" + event.getParameter("MDEOutputFolder") + "/PIMModels/" + event.getParameter("WebServiceName") + "PIM.xmi";
        strInputArguments[2] = "file:/" + event.getParameter("MDEOutputFolder") + "/PSMModels/" + event.getParameter("WebServiceName") + "PSM.xmi";
        strInputArguments[3] = "file:/" + event.getParameter("MDEOutputFolder") + "/PSMModels/" + event.getParameter("WebServiceName") + "ABACAuthorizationPSM.xmi";
        ABACAuthorizationPIMToPSMTransformation.main(strInputArguments);
    }
	
	private void executeDatabaseSearchingModelToModelTransformations(ExecutionEvent event){
		executeDatabaseSearchingCIMToPIMTransformation(event);
		executeDatabaseSearchingPIMToPSMTransformation(event);
	}
	
	private void executeDatabaseSearchingCIMToPIMTransformation(ExecutionEvent event){
		String[] strInputArguments = new String[4];
		strInputArguments[0] = "file:/" + event.getParameter("MDEOutputFolder") + "/CIMModels/" + event.getParameter("WebServiceName") + "CIM.xmi";
		strInputArguments[1] = "file:/" + event.getParameter("MDEOutputFolder") + "/PIMModels/" + event.getParameter("WebServiceName") + "PIM.xmi";
		strInputArguments[2] = "file:/" + event.getParameter("MDEOutputFolder") + "/CIMModels/" + event.getParameter("WebServiceName") + "SearchLayerCIM.xmi";
		strInputArguments[3] = "file:/" + event.getParameter("MDEOutputFolder") + "/PIMModels/" + event.getParameter("WebServiceName") + "SearchLayerPIM.xmi";
		SearchLayerCIMToPIMTransformation.main(strInputArguments);
	}
	
	private void executeDatabaseSearchingPIMToPSMTransformation(ExecutionEvent event){
		String[] strInputArguments = new String[4];
		strInputArguments[0] = "file:/" + event.getParameter("MDEOutputFolder") + "/PIMModels/" + event.getParameter("WebServiceName") + "PIM.xmi";
		strInputArguments[1] = "file:/" + event.getParameter("MDEOutputFolder") + "/PSMModels/" + event.getParameter("WebServiceName") + "PSM.xmi";
		strInputArguments[2] = "file:/" + event.getParameter("MDEOutputFolder") + "/PIMModels/" + event.getParameter("WebServiceName") + "SearchLayerPIM.xmi";
		strInputArguments[3] = "file:/" + event.getParameter("MDEOutputFolder") + "/PSMModels/" + event.getParameter("WebServiceName") + "SearchLayerPSM.xmi";
		SearchLayerPIMToPSMTransformation.main(strInputArguments);
	}
	
	private void executeExternalServiceLayerModelToModelTransformations(ExecutionEvent event){
		executeExternalServiceLayerCIMToPIMTransformation(event);
		executeExternalServiceLayerPIMToPSMTransformation(event);
	}
	
	private void executeExternalServiceLayerCIMToPIMTransformation(ExecutionEvent event){
		String[] strInputArguments = new String[4];
		strInputArguments[0] = "file:/" + event.getParameter("MDEOutputFolder") + "/CIMModels/" + event.getParameter("WebServiceName") + "CIM.xmi";
		strInputArguments[1] = "file:/" + event.getParameter("MDEOutputFolder") + "/PIMModels/" + event.getParameter("WebServiceName") + "PIM.xmi";
		strInputArguments[2] = "file:/" + event.getParameter("MDEOutputFolder") + "/CIMModels/" + event.getParameter("WebServiceName") + "ExternalServiceLayerCIM.xmi";
		strInputArguments[3] = "file:/" + event.getParameter("MDEOutputFolder") + "/PIMModels/" + event.getParameter("WebServiceName") + "ExternalServiceLayerPIM.xmi";
		ExternalServiceLayerCIMToPIM.main(strInputArguments);
	}
	
	private void executeExternalServiceLayerPIMToPSMTransformation(ExecutionEvent event){
		String[] strInputArguments = new String[4];
		strInputArguments[0] = "file:/" + event.getParameter("MDEOutputFolder") + "/PIMModels/" + event.getParameter("WebServiceName") + "PIM.xmi";
		strInputArguments[1] = "file:/" + event.getParameter("MDEOutputFolder") + "/PSMModels/" + event.getParameter("WebServiceName") + "PSM.xmi";
		strInputArguments[2] = "file:/" + event.getParameter("MDEOutputFolder") + "/PIMModels/" + event.getParameter("WebServiceName") + "ExternalServiceLayerPIM.xmi";
		strInputArguments[3] = "file:/" + event.getParameter("MDEOutputFolder") + "/PSMModels/" + event.getParameter("WebServiceName") + "ExternalServiceLayerPSM.xmi";
		ExternalServiceLayerPIMToPSM.main(strInputArguments);
	}
	
	private void executeDBMigrationLayerModelToModelTransformations(ExecutionEvent event) {
		executeDBMigrationCIMToPIMTransformation(event);
		executeDBMigrationPIMToPSMTransformation(event);
	}

	private void executeDBMigrationPIMToPSMTransformation(ExecutionEvent event) {
		String[] strInputArguments = new String[4];
		strInputArguments[0] = "file:/" + event.getParameter("MDEOutputFolder") + "/PIMModels/" + event.getParameter("WebServiceName") + "PIM.xmi";
		strInputArguments[1] = "file:/" + event.getParameter("MDEOutputFolder") + "/PSMModels/" + event.getParameter("WebServiceName") + "PSM.xmi";
		strInputArguments[2] = "file:/" + event.getParameter("MDEOutputFolder") + "/PIMModels/" + event.getParameter("WebServiceName") + "DBMigratorPIM.xmi";
		strInputArguments[3] = "file:/" + event.getParameter("MDEOutputFolder") + "/PSMModels/" + event.getParameter("WebServiceName") + "DBMigratorPSM.xmi";
		MDEMigratorPIMToPSMTransformation.main(strInputArguments);
	}

	private void executeDBMigrationCIMToPIMTransformation(ExecutionEvent event) {
		String[] strInputArguments = new String[4];
		strInputArguments[0] = "file:/" + event.getParameter("MDEOutputFolder") + "/PIMModels/" + event.getParameter("WebServiceName") + "PIM.xmi";
		strInputArguments[1] = "file:/" + event.getParameter("MDEOutputFolder") + "/CIMModels/" + event.getParameter("WebServiceName") + "CIM.xmi";
		strInputArguments[2] = "file:/" + event.getParameter("MDEOutputFolder") + "/CIMModels/" + event.getParameter("WebServiceName") + "DBMigratorCIM.xmi";
		strInputArguments[3] = "file:/" + event.getParameter("MDEOutputFolder") + "/PIMModels/" + event.getParameter("WebServiceName") + "DBMigratorPIM.xmi";
		MDEMigratorCIMToPIMTransformation.main(strInputArguments);
	}
}
