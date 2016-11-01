/*
 * ARISTOSTLE UNIVERSITY OF THESSALONIKI
 * Copyright (C) 2014
 * Aristotle University of Thessaloniki
 * Department of Electrical & Computer Engineering
 * Division of Electronics & Computer Engineering
 * Intelligent Systems & Software Engineering Lab
 *
 * Project             : S-CASE
 * WorkFile            : 
 * Compiler            : 
 * File Description    :
 * Document Description:
* Related Documents	   :
* Note				   :
* Programmer		   : Christoforos Zolotas
* Contact			   : christopherzolotas@issel.ee.auth.gr
*/

package eu.fp7.scase.cimGenerator;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

import ServiceCIM.RESTfulServiceCIM;
import AuthenticationLayerCIM.AnnotationModel;
import AuthenticationLayerCIM.AuthenticationLayerCIMFactory;
import AuthenticationLayerCIM.AuthenticationModel;
import AuthenticationLayerCIM.AuthenticationOnlyMode;
import AuthenticationLayerCIM.AuthenticationToken;
import AuthenticationLayerCIM.BothMode;
import AuthenticationLayerCIM.AnnCRUDActivity;
import AuthenticationLayerCIM.GuestMode;
import AuthenticationLayerCIM.Password;
import AuthenticationLayerCIM.AnnProperty;
import AuthenticationLayerCIM.AnnResource;

public class AuthenticationCIMProducer{
	
	private RESTfulServiceCIM oRESTfulServiceCIM;
	private AnnotationModel oAuthenticationCIM;
	private AuthenticationLayerCIMFactory oAuthenticationLayerCIMFactory;
	private Scanner oScanner;
	private String strOutputFolder;
	private static MessageConsole myConsole = findConsole("SCASE-UI");
	private static MessageConsoleStream out = myConsole.newMessageStream();

	
	public AuthenticationCIMProducer(String strOutputFolder, RESTfulServiceCIM oRESTfulServiceCIM){
		this.oRESTfulServiceCIM = oRESTfulServiceCIM;
		this.oAuthenticationLayerCIMFactory = AuthenticationLayerCIMFactory.eINSTANCE;
		this.oAuthenticationCIM = this.oAuthenticationLayerCIMFactory.createAnnotationModel();
		this.oAuthenticationCIM.setName(oRESTfulServiceCIM.getName() + "AuthenticationModel");
		oScanner = new Scanner(System.in, StandardCharsets.UTF_8.name());
		this.strOutputFolder = strOutputFolder;
	}
	
	public AuthenticationLayerCIM.AnnotationModel produceAuthenticationCIM(){
	
		//get authentication model
		getAuthenticationModel();
		
		//get username token
		getUsernameToken();
		
		//get password token
		getPassword();
		
		//get access of every activity
		getActivitiesAccess();
		
		//export authentication model
		exportAuthenticationModel();
		
		return oAuthenticationCIM;
	}
	
	private void getAuthenticationModel(){
		out.println("Which one of the following resources is the authentication model of this web service? \n");
		//print all the non - algorithmic resources
		for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().size(); i++){
			if(this.oRESTfulServiceCIM.getHasResources().get(i).isIsAlgorithmic() == false){
				out.println(this.oRESTfulServiceCIM.getHasResources().get(i).getName());
			}
		}
		
		//get user selection
		String strUserSelection = "";
		try {
			strUserSelection = this.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if( isValidAuthenticationModel(strUserSelection)){
			out.println("Successsfully selected " + strUserSelection + " as authentication model.");
			AnnResource oAnnResource = this.oAuthenticationLayerCIMFactory.createAnnResource();
			oAnnResource.setAnnotatesResource(getCoreResourceByName(strUserSelection));
			AuthenticationModel oAuthenticationModel = this.oAuthenticationLayerCIMFactory.createAuthenticationModel();
			oAuthenticationModel.setResourceAuthenticationModel(oAnnResource);
			this.oAuthenticationCIM.getHasAnnotatedElement().add(oAnnResource);
			this.oAuthenticationCIM.getHasAnnotation().add(oAuthenticationModel);
		}
		else{
			getAuthenticationModel();
		}
	}
	
	private ServiceCIM.Resource getCoreResourceByName(String strCoreResourceName){
		for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().size(); i++){
			if(this.oRESTfulServiceCIM.getHasResources().get(i).getName().equalsIgnoreCase(strCoreResourceName)){
				return this.oRESTfulServiceCIM.getHasResources().get(i);
			}
		}
		
		return null; //throw exceptions instead in production code
	}
	
	private Boolean isValidAuthenticationModel(String strProposedAuthenticationModel){
		for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().size(); i++){
			if(this.oRESTfulServiceCIM.getHasResources().get(i).isIsAlgorithmic() == false && 
					strProposedAuthenticationModel.equalsIgnoreCase(this.oRESTfulServiceCIM.getHasResources().get(i).getName())){
				return true;
			}
		}
		return false;
	}
	
	private void getUsernameToken(){
		
		out.println("Which of the following properties is the username authentication token?");
		String strUsernameToken = "";
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).getName().equalsIgnoreCase(getAuthenticationModelResource().getResourceAuthenticationModel().getAnnotatesResource().getName())){
				for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().size(); i++){
					out.println(this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().get(i).getName());
				}
				
				strUsernameToken = oScanner.next();
				if( isValidAuthenticationToken(strUsernameToken, this.oRESTfulServiceCIM.getHasResources().get(n))){
					for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().size(); i++){
						if(this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().get(i).getName().equalsIgnoreCase(strUsernameToken)){
							out.println("Successsfully selected " + strUsernameToken + " as username authentication token.");
							AnnProperty oAnnProperty = this.oAuthenticationLayerCIMFactory.createAnnProperty();
							oAnnProperty.setAnnotatesProperty(getCorePropertyByName(strUsernameToken));;
							AuthenticationToken oAuthenticationToken = this.oAuthenticationLayerCIMFactory.createAuthenticationToken();
							oAuthenticationToken.setName(strUsernameToken);
							oAuthenticationToken.setType(this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().get(i).getType());
							oAuthenticationToken.setBIsUnique(this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().get(i).isIsUnique());
							oAuthenticationToken.setPropertyAuthenticationToken(oAnnProperty);
							this.oAuthenticationCIM.getHasAnnotatedElement().add(oAnnProperty);
							this.oAuthenticationCIM.getHasAnnotation().add(oAuthenticationToken);
							for(int j = 0; j < this.oAuthenticationCIM.getHasAnnotation().size(); j++){
								if(this.oAuthenticationCIM.getHasAnnotation().get(j) instanceof AuthenticationModel){
									((AuthenticationModel) this.oAuthenticationCIM.getHasAnnotation().get(j)).getHasAuthenticationToken().add(oAuthenticationToken);
								}
							}
						}
					}

				}
				else{
					getUsernameToken();
				}
			}
		}
	}
	
	private ServiceCIM.Property getCorePropertyByName(String strPropertyName){
		for(int i = 0; i < this.getAuthenticationModelResource().getResourceAuthenticationModel().getAnnotatesResource().getHasProperty().size(); i++){
			if( strPropertyName.equalsIgnoreCase(this.getAuthenticationModelResource().getResourceAuthenticationModel().getAnnotatesResource().getHasProperty().get(i).getName())){
				return this.getAuthenticationModelResource().getResourceAuthenticationModel().getAnnotatesResource().getHasProperty().get(i);
			}
		}
		
		return null; //throw exception in production code
	}
	
	private AuthenticationModel getAuthenticationModelResource(){
		for(int i = 0; i < this.oAuthenticationCIM.getHasAnnotation().size(); i++){
			if(this.oAuthenticationCIM.getHasAnnotation().get(i) instanceof AuthenticationModel){
				return (AuthenticationModel) this.oAuthenticationCIM.getHasAnnotation().get(i);
			}
		}
		
		return null;//throw exception in production code
	}
	
	private Boolean isValidAuthenticationToken(String strSelectedToken, ServiceCIM.Resource oResource){
		
		for(int i = 0; i < oResource.getHasProperty().size(); i++){
			if(strSelectedToken.equalsIgnoreCase(strSelectedToken)){
				return true;
			}
		}
		
		return false;
	}
	
	private void getPassword(){
		out.println("Which of the following properties is the password authentication token?");
		String strUsernameToken = "";
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).getName().equalsIgnoreCase(getAuthenticationModelResource().getResourceAuthenticationModel().getAnnotatesResource().getName())){
				for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().size(); i++){
					out.println(this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().get(i).getName());
				}
				
				strUsernameToken = oScanner.next();
				if( isValidAuthenticationToken(strUsernameToken, this.oRESTfulServiceCIM.getHasResources().get(n))){
					for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().size(); i++){
						if(this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().get(i).getName().equalsIgnoreCase(strUsernameToken)){
							out.println("Successsfully selected " + strUsernameToken + " as password authentication token.");
							AnnProperty oAnnProperty = this.oAuthenticationLayerCIMFactory.createAnnProperty();
							oAnnProperty.setAnnotatesProperty(getCorePropertyByName(strUsernameToken));;
							Password oPassword = this.oAuthenticationLayerCIMFactory.createPassword();
							oPassword.setName(strUsernameToken);
							oPassword.setType(this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().get(i).getType());
							oPassword.setBIsUnique(this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().get(i).isIsUnique());
							oPassword.setPropertyAuthenticationToken(oAnnProperty);
							this.oAuthenticationCIM.getHasAnnotatedElement().add(oAnnProperty);
							this.oAuthenticationCIM.getHasAnnotation().add(oPassword);
							for(int j = 0; j < this.oAuthenticationCIM.getHasAnnotation().size(); j++){
								if(this.oAuthenticationCIM.getHasAnnotation().get(j) instanceof AuthenticationModel){
									((AuthenticationModel) this.oAuthenticationCIM.getHasAnnotation().get(j)).getHasAuthenticationToken().add(oPassword);
								}
							}
						}
					}

				}
				else{
					getUsernameToken();
				}
			}
		}
	}
	
	private void getActivitiesAccess(){
		for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().size(); i++){
			for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().get(i).getHasCRUDActivity().size(); n++){
				out.println("Select authentication mode for the CRUD Activity " 
			    + this.oRESTfulServiceCIM.getHasResources().get(i).getHasCRUDActivity().get(n).getCRUDVerb().toString()
			    + " of resource " + this.oRESTfulServiceCIM.getHasResources().get(i).getName() + " : (Guest, Only_Authenticated, Both)");
				String oAuthSelected = this.oScanner.next();
				if(oAuthSelected.equalsIgnoreCase("Guest")){ //if user selected guest mode
					GuestMode oGuestMode = this.oAuthenticationLayerCIMFactory.createGuestMode();
					AnnCRUDActivity oAnnCRUDActivity = this.oAuthenticationLayerCIMFactory.createAnnCRUDActivity();
					oGuestMode.setCRUDActivityAuthenticationMode(oAnnCRUDActivity);
					oAnnCRUDActivity.setName(this.oRESTfulServiceCIM.getHasResources().get(i).getHasCRUDActivity().get(n).getCRUDVerb().toString());
					oAnnCRUDActivity.setAnnotatesCRUDActivity(this.oRESTfulServiceCIM.getHasResources().get(i).getHasCRUDActivity().get(n));
					oAnnCRUDActivity.setBelongsToResource(this.oRESTfulServiceCIM.getHasResources().get(i));
					this.oAuthenticationCIM.getHasAnnotatedElement().add(oAnnCRUDActivity);
					this.oAuthenticationCIM.getHasAnnotation().add(oGuestMode);
				}
				else if(oAuthSelected.equalsIgnoreCase("Only_Authenticated")){ //if user selected Only_Authenticated mode
					AuthenticationOnlyMode oAuthenticationOnlyMode = this.oAuthenticationLayerCIMFactory.createAuthenticationOnlyMode();
					AnnCRUDActivity oAnnCRUDActivity = this.oAuthenticationLayerCIMFactory.createAnnCRUDActivity();
					oAuthenticationOnlyMode.setCRUDActivityAuthenticationMode(oAnnCRUDActivity);
					oAnnCRUDActivity.setName(this.oRESTfulServiceCIM.getHasResources().get(i).getHasCRUDActivity().get(n).getCRUDVerb().toString());
					oAnnCRUDActivity.setAnnotatesCRUDActivity(this.oRESTfulServiceCIM.getHasResources().get(i).getHasCRUDActivity().get(n));
					oAnnCRUDActivity.setBelongsToResource(this.oRESTfulServiceCIM.getHasResources().get(i));
					this.oAuthenticationCIM.getHasAnnotatedElement().add(oAnnCRUDActivity);
					this.oAuthenticationCIM.getHasAnnotation().add(oAuthenticationOnlyMode);
				}
				else if(oAuthSelected.equalsIgnoreCase("Both")){ //if user selected Both mode
					BothMode oBothMode = this.oAuthenticationLayerCIMFactory.createBothMode();
					AnnCRUDActivity oAnnCRUDActivity = this.oAuthenticationLayerCIMFactory.createAnnCRUDActivity();
					oBothMode.setCRUDActivityAuthenticationMode(oAnnCRUDActivity);
					oAnnCRUDActivity.setName(this.oRESTfulServiceCIM.getHasResources().get(i).getHasCRUDActivity().get(n).getCRUDVerb().toString());
					oAnnCRUDActivity.setAnnotatesCRUDActivity(this.oRESTfulServiceCIM.getHasResources().get(i).getHasCRUDActivity().get(n));
					oAnnCRUDActivity.setBelongsToResource(this.oRESTfulServiceCIM.getHasResources().get(i));
					this.oAuthenticationCIM.getHasAnnotatedElement().add(oAnnCRUDActivity);
					this.oAuthenticationCIM.getHasAnnotation().add(oBothMode);
				}
				else{
					out.println("Authenticated Mode provided is not valid!");
					getActivitiesAccess();
				}
			}
		}
	}
	
	private void exportAuthenticationModel(){
		EcoreXMIAuthenticationExtractor oEcoreXMIAuthenticationExtractor = new EcoreXMIAuthenticationExtractor(this.strOutputFolder, this.oRESTfulServiceCIM.getName());
		oEcoreXMIAuthenticationExtractor.exportEcoreXMI(oAuthenticationCIM);
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
	
	private String readLine() throws IOException {
	    if (System.console() != null) {
	        return System.console().readLine();
	    }
	    BufferedReader reader = new BufferedReader(new InputStreamReader(
	            System.in, StandardCharsets.UTF_8.name()));
	    return reader.readLine();
	}
	
}
