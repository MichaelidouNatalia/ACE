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

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

import SearchLayerCIM.AnnAlgoResource;
import SearchLayerCIM.AnnCRUDResource;
import SearchLayerCIM.AnnProperty;
import SearchLayerCIM.SearchLayerCIMFactory;
import SearchLayerCIM.SearchResource;
import SearchLayerCIM.SearchableProperty;
import SearchLayerCIM.SearchableResource;
import ServiceCIM.Property;
import ServiceCIM.RESTfulServiceCIM;
import ServiceCIM.Resource;

public class SearchLayerCIMProducer{
	
	private RESTfulServiceCIM oRESTfulServiceCIM;
	private AuthenticationLayerCIM.AnnotationModel oAuthenticationLayerCIM;
	private SearchLayerCIM.AnnotationModel oSearchLayerCIM;
	private SearchLayerCIMFactory oSearchLayerCIMFactory;
	private Scanner oScanner;
	private String strOutputFolder;
	private static MessageConsole myConsole = findConsole("SCASE-UI");
	private static MessageConsoleStream out = myConsole.newMessageStream();
	
	public SearchLayerCIMProducer(String strOutputFolder, RESTfulServiceCIM oRESTfulServiceCIM, AuthenticationLayerCIM.AnnotationModel oAuthenticationLayerCIM){
		this.oRESTfulServiceCIM = oRESTfulServiceCIM;
		this.oAuthenticationLayerCIM = oAuthenticationLayerCIM;
		this.oSearchLayerCIMFactory = SearchLayerCIMFactory.eINSTANCE;
		this.oSearchLayerCIM = this.oSearchLayerCIMFactory.createAnnotationModel();
		this.oSearchLayerCIM.setName(this.oRESTfulServiceCIM.getName() + "SearchLayer");
		oScanner = new Scanner(System.in, StandardCharsets.UTF_8.name());
		this.strOutputFolder = strOutputFolder;
	}
	
	public void produceSearchLayerCIM(){
		
		out.println("Pick one of the following algorithmic resources to annotate as search resource:");
		
		while(true){
			
			//print any algorithmic resource that could still be annotated a search resource
			printSelectableAlgoResources();
			
			//populate the search resource with searchable properties
			populateSearchResource(this.oScanner.next());
			
			//ask user if he wants to annotate another resource a search resource as well
			out.println("Would you like to annotate any other algorithmic resource as search resource? (yes/no)");
			if(this.oScanner.next().equalsIgnoreCase("yes")){
				continue;
			}
			else{
				break;
			}
		}
		//export search layer CIM
		exportSearchLayerCIM();
	}
	
	private void printSelectableAlgoResources(){
		
		for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().size(); i++){
			if(this.oRESTfulServiceCIM.getHasResources().get(i).isIsAlgorithmic()){ //if this resource is an algorithmic resource
				if(isAlreadAnnotated(this.oRESTfulServiceCIM.getHasResources().get(i)) == false){ //and is not already annotated as a search resource
					out.println(this.oRESTfulServiceCIM.getHasResources().get(i).getName());
				}
			}
		}
	}
	
	private boolean isAlreadAnnotated(Resource oResource){
		
		for(int i = 0; i < this.oSearchLayerCIM.getHasAnnotatedElement().size(); i++){
			if(this.oSearchLayerCIM.getHasAnnotatedElement().get(i) instanceof AnnAlgoResource){ //if the annotated element is an algorithmic resource
				if(((AnnAlgoResource) this.oSearchLayerCIM.getHasAnnotatedElement().get(i)).getAnnotatesAlgoResource().getName().equalsIgnoreCase(oResource.getName())){//check if references the resource at task
					return true;
				}
			}
		}
		
		return false;
	}
	
	private void populateSearchResource(String strSearchResourceName){
		
		//create a new annotated search algorithmic resource
		AnnAlgoResource oAnnAlgoResource = this.oSearchLayerCIMFactory.createAnnAlgoResource();
		
		//associate it with the resource it annotates
		for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().size(); i++){
			if(this.oRESTfulServiceCIM.getHasResources().get(i).getName().equalsIgnoreCase(strSearchResourceName)){
				oAnnAlgoResource.setAnnotatesAlgoResource(this.oRESTfulServiceCIM.getHasResources().get(i));
			}
		}
		//related it with searchable properties
		selectSearchablePropertiesByResource(oAnnAlgoResource);
	}
	

	private void selectSearchablePropertiesByResource(AnnAlgoResource oAnnAlgoResrouce){
		
		SearchResource oSearchResource = this.oSearchLayerCIMFactory.createSearchResource();
		oSearchResource.setAlgoResourceIsSearchResource(oAnnAlgoResrouce);
		
		for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().size(); i++){
			if(this.oRESTfulServiceCIM.getHasResources().get(i).isIsAlgorithmic() == false){
				out.println("Would you like this search resource to search properties of " + this.oRESTfulServiceCIM.getHasResources().get(i).getName() + " resource? (yes/no)");
				if(this.oScanner.next().equalsIgnoreCase("no")){
					continue;
				}
				else{
					AnnCRUDResource oAnnCRUDResource = this.oSearchLayerCIMFactory.createAnnCRUDResource();
					oAnnCRUDResource.setAnnotatesResource(this.oRESTfulServiceCIM.getHasResources().get(i));
					this.oSearchLayerCIM.getHasAnnotatedElement().add(oAnnCRUDResource);
					SearchableResource oSearchableResource = this.oSearchLayerCIMFactory.createSearchableResource();
					oSearchableResource.setResourceIsSearchable(oAnnCRUDResource);
					oSearchResource.getSearchesResource().add(oSearchableResource);

					while(true){
						
						out.println("Select which of the following properties should be searchable: ");
						for(int j = 0; j < this.oRESTfulServiceCIM.getHasResources().get(i).getHasProperty().size(); j++){
				
							if(propertyIsNotAuthenticationToken(this.oRESTfulServiceCIM.getHasResources().get(i).getHasProperty().get(j))){
								out.println(this.oRESTfulServiceCIM.getHasResources().get(i).getHasProperty().get(j).getName());
							}
						}
						AnnProperty oAnnProperty = this.oSearchLayerCIMFactory.createAnnProperty();
						oAnnProperty.setAnnotatesProperty(getCIMPropertyByName(this.oScanner.next().toString() , this.oRESTfulServiceCIM.getHasResources().get(i)));
						SearchableProperty oSearchableProperty = this.oSearchLayerCIMFactory.createSearchableProperty();
						oSearchableProperty.setPropertyIsSearchable(oAnnProperty);
						
						this.oSearchLayerCIM.getHasAnnotatedElement().add(oAnnProperty);
						this.oSearchLayerCIM.getHasAnnotation().add(oSearchableProperty);
						oSearchableResource.getHasSearchableProperty().add(oSearchableProperty);
						
						out.println("Would you like another property of this resource to be searchable by this search resource? (yes/no)");
						if(this.oScanner.next().toString().equalsIgnoreCase("yes")){
							continue;
						}
						else{
							break;
						}
					}
				}
			}
		}

		this.oSearchLayerCIM.getHasAnnotatedElement().add(oAnnAlgoResrouce);
		this.oSearchLayerCIM.getHasAnnotation().add(oSearchResource);
	}
	
	private boolean propertyIsNotAuthenticationToken(Property oProperty){
		if(this.oAuthenticationLayerCIM != null){
			for(int i = 0; i < this.oAuthenticationLayerCIM.getHasAnnotatedElement().size(); i++){
				if(this.oAuthenticationLayerCIM.getHasAnnotatedElement().get(i) instanceof AuthenticationLayerCIM.AnnProperty){
					if(((AuthenticationLayerCIM.AnnProperty) this.oAuthenticationLayerCIM.getHasAnnotatedElement().get(i)).getAnnotatesProperty().getName().equalsIgnoreCase(oProperty.getName())){
						return false;
					}
				}
			}
			return true;
		}
		else{
			return true;
		}
	}
	
	private Property getCIMPropertyByName(String strPropertyName, Resource oResource){
		
		for(int i = 0; i < oResource.getHasProperty().size(); i++){
			if(strPropertyName.equalsIgnoreCase(oResource.getHasProperty().get(i).getName())){
				return oResource.getHasProperty().get(i);
			}
		}
		
		return null;
	}
	
	private void exportSearchLayerCIM(){
		EcoreXMISearchLayerExtractor oEcoreXMISearchLayerExtractor = new EcoreXMISearchLayerExtractor(this.strOutputFolder, this.oRESTfulServiceCIM.getName());
		oEcoreXMISearchLayerExtractor.exportEcoreXMI(this.oSearchLayerCIM);
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
