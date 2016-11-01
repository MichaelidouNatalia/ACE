package eu.fp7.scase.authenticationWizard;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;

import eu.fp7.scase.launcher.cimgenerator.Activator;
import AuthenticationLayerCIM.AnnProperty;
import AuthenticationLayerCIM.AnnResource;
import AuthenticationLayerCIM.Annotation;
import AuthenticationLayerCIM.AuthenticationModel;
import AuthenticationLayerCIM.AuthenticationToken;
import AuthenticationLayerCIM.Password;
import ServiceCIM.RESTfulServiceCIM;
import AuthenticationLayerCIM.AuthenticationLayerCIMFactory;


public class AuthenticationModelWizardPage extends WizardPage {

	private RESTfulServiceCIM oRESTfulServiceCIM;
	private AuthenticationLayerCIM.AnnotationModel oAuthenticationCIM;
	private AuthenticationLayerCIMFactory oAuthenticationLayerCIMFactory;
	private Composite oWizardPageGrid;
	private Composite oParentComposite;
	private String strSelectedAuthenticationModelName;
	private String strSelectedUsernameTokenName;
	private String strSelectedPasswordTokenName;
	private boolean bReloadExistingModels;
	
	//Authentication Model selection SWTs
	private Label oAuthenticationModelPromtLabel;
	private List oAuthenticationModelResourceList;
	private Group oAuthenticationModelGroup;
	private Composite oAuthenticationModelGrid;
	
	//username token SWTs
	private Label oUsernameTokenPromtLabel;
	private List oUsernameTokenPromtList;
	private Group oUsernameTokenPromtGroup;
	private Composite oUsernameTokenGrid;
	
	//password token SWTs
	private Label oPasswordTokenPromtLabel;
	private List oPasswordTokenPromtList;
	private Group oPasswordTokenGroup;
	private Composite oPasswordTokenGrid;

	  public AuthenticationModelWizardPage(String strOutputFolder, RESTfulServiceCIM oRESTfulServiceCIM, AuthenticationLayerCIM.AnnotationModel oAuthenticationCIM, boolean bReloadExistingModels) {
		  super("Select Authentication Model");
		  this.oAuthenticationLayerCIMFactory = AuthenticationLayerCIMFactory.eINSTANCE;
		  this.oRESTfulServiceCIM = oRESTfulServiceCIM;
		  this.oAuthenticationCIM = oAuthenticationCIM;
		  this.bReloadExistingModels = bReloadExistingModels;
	  }

	  @Override
	  public void createControl(Composite parent) {
		  this.oParentComposite = parent;
		  this.oWizardPageGrid = new Composite(oParentComposite, SWT.NONE);
		  
		  initializeWizardPagesGrids(parent);
		  initializeWizardPageWidgets(parent);
		  
		  this.setControl(this.oWizardPageGrid);
		  if(!this.bReloadExistingModels){
			  this.setPageComplete(false);
		  }
	  }
	  
	  private void initializeWizardPagesGrids(Composite oParentComposite) {
		  
		  //initialize authentication model selection composite container
		  this.oAuthenticationModelGrid = new Composite(this.oWizardPageGrid, SWT.NONE);
		  this.oAuthenticationModelGrid.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		  this.oAuthenticationModelGrid.setLayout(new GridLayout(1, false));
			
		  //initialize username token composite container
		  this.oUsernameTokenGrid = new Composite(this.oWizardPageGrid, SWT.NONE);
		  this.oUsernameTokenGrid.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		  this.oUsernameTokenGrid.setLayout(new GridLayout(1, false));
			
		  //initialize password token composite container
		  this.oPasswordTokenGrid = new Composite(this.oWizardPageGrid, SWT.NONE);
		  this.oPasswordTokenGrid.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		  this.oPasswordTokenGrid.setLayout(new GridLayout(1, false));
		  
		  this.oWizardPageGrid.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		  this.oWizardPageGrid.setLayout(new GridLayout(1, false));
	  }
	  
	  private void initializeWizardPageWidgets(Composite oParentComposite) {

		  //initialize the authentication model selection widgets
		  initializeAuthenticationModelWidgets();
			
		  //initialize Username token SWTs
		  initializeUsernameTokenWidgets();
			
		  //initialize Password token SWTs
		  initializePasswordTokenWidgets();
		  if(this.bReloadExistingModels == true){
			  if(restoreAuthenticationWizardPage() == false){//if some part of the authentication meta-model is not still valid
				  //the page is not yet complete and requires developer intervention
				  this.setPageComplete(false);
				  this.bReloadExistingModels = false;
			  }
			  else{
				  this.setPageComplete(true);
			  }
		  }
	  }
	  
	  private boolean restoreAuthenticationWizardPage() {
		  for(int n = 0; n < this.oAuthenticationCIM.getHasAnnotation().size(); n++){
			  if(this.oAuthenticationCIM.getHasAnnotation().get(n) instanceof AuthenticationModel){ //find the authentication model annotation
				  if(!authenticationModelIsStillValid((AuthenticationModel) this.oAuthenticationCIM.getHasAnnotation().get(n))){
					  return false;
				  }
				  this.strSelectedAuthenticationModelName = getNewAuthenticationModelName((AuthenticationModel) this.oAuthenticationCIM.getHasAnnotation().get(n));
				  this.oAuthenticationModelResourceList.setSelection(this.oAuthenticationModelResourceList.indexOf(this.strSelectedAuthenticationModelName));
				  
				  //find the username token
				  for(int i = 0; i < ((AuthenticationModel) this.oAuthenticationCIM.getHasAnnotation().get(n)).getHasAuthenticationToken().size(); i++){
					  if(!(((AuthenticationModel) this.oAuthenticationCIM.getHasAnnotation().get(n)).getHasAuthenticationToken().get(i) instanceof Password)){ // if it is the username token
						  if(!usernameTokenIsStillValid((AuthenticationModel) this.oAuthenticationCIM.getHasAnnotation().get(n))){
							  this.populateUsernameTokenList(this.strSelectedAuthenticationModelName);
							  return false;
						  }
						  this.strSelectedUsernameTokenName = getNewUsernameTokenName((AuthenticationModel) this.oAuthenticationCIM.getHasAnnotation().get(n));
						  this.populateUsernameTokenList(this.strSelectedAuthenticationModelName);
						  this.oUsernameTokenPromtList.setSelection(this.oUsernameTokenPromtList.indexOf(this.strSelectedUsernameTokenName));
					  }
				  }
				  //find the password token
				  for(int i = 0; i < ((AuthenticationModel) this.oAuthenticationCIM.getHasAnnotation().get(n)).getHasAuthenticationToken().size(); i++){
					  if(((AuthenticationModel) this.oAuthenticationCIM.getHasAnnotation().get(n)).getHasAuthenticationToken().get(i) instanceof Password){ // if it is the password token
						  if(!passwordTokenIsStillValid((AuthenticationModel) this.oAuthenticationCIM.getHasAnnotation().get(n))){
							  this.populatePasswordTokenList(this.strSelectedUsernameTokenName);
							  return false;
						  }
						  this.strSelectedPasswordTokenName = getPasswordTokenNewName((AuthenticationModel) this.oAuthenticationCIM.getHasAnnotation().get(n));
						  this.populatePasswordTokenList(this.strSelectedUsernameTokenName);
						  this.oPasswordTokenPromtList.setSelection(this.oPasswordTokenPromtList.indexOf(this.strSelectedPasswordTokenName));
						  return true;
					  }
				  }
			  }
		  }
		  
		  return false;
	  }

	private boolean authenticationModelIsStillValid(AuthenticationModel oAuthenticationModel) {
		// check if the authentication model resource still exists after CIM Editor
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(oAuthenticationModel.getResourceAuthenticationModel().getAnnotatesResource().getName().equalsIgnoreCase(this.oRESTfulServiceCIM.getHasResources().get(n).getName())){
				System.out.println("Authentication Model is valid!!");
				return true;
			}
		}

		System.out.println("Authentication Model is not valid!");
		return false;
	}
	
	private String getNewAuthenticationModelName(AuthenticationModel oAuthenticationModel){
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(oAuthenticationModel.getResourceAuthenticationModel().getAnnotatesResource().getName().equalsIgnoreCase(this.oRESTfulServiceCIM.getHasResources().get(n).getName())){
				return this.oRESTfulServiceCIM.getHasResources().get(n).getName();
			}
		}
		try {
			throw new ExecutionException(new Throwable());
		} catch (ExecutionException e) {
			Activator.log("Unable to find new authentication model name.", e);
			return null;
		}
	}
	
	private boolean usernameTokenIsStillValid(AuthenticationModel oAuthenticationModel){
		for(int n = 0; n < oAuthenticationModel.getHasAuthenticationToken().size(); n++){
			//check if the username token still exists after CIM Editor
			if(!(oAuthenticationModel.getHasAuthenticationToken().get(n) instanceof Password)){
				//find the authentication model core CIM Resource
				for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().size(); i++){
					if(oAuthenticationModel.getResourceAuthenticationModel().getAnnotatesResource().getName().equalsIgnoreCase(this.oRESTfulServiceCIM.getHasResources().get(i).getName())){
						//check if the the exact same core CIM property that previously was username token still exists
						for(int j = 0; j < this.oRESTfulServiceCIM.getHasResources().get(i).getHasProperty().size(); j++){
							if(oAuthenticationModel.getHasAuthenticationToken().get(n).getName().equalsIgnoreCase(this.oRESTfulServiceCIM.getHasResources().get(i).getHasProperty().get(j).getName()) 
							&& oAuthenticationModel.getHasAuthenticationToken().get(n).getType().equalsIgnoreCase(this.oRESTfulServiceCIM.getHasResources().get(i).getHasProperty().get(j).getType())
							&& oAuthenticationModel.getHasAuthenticationToken().get(n).isBIsUnique() == this.oRESTfulServiceCIM.getHasResources().get(i).getHasProperty().get(j).isIsUnique()){
								System.out.println("Username token is still valid!");
								return true;
							}
						}
						System.out.println("Username token is not valid!!");
						return false;
					}
				}
			}
		}
		try {
			throw new ExecutionException(new Throwable());
		} catch (ExecutionException e) {
			Activator.log("Runtime error while checking validity of username token.", e);
			return false;
		}
	}
	
	private String getNewUsernameTokenName(AuthenticationModel oAuthenticationModel){
		for(int n = 0; n < oAuthenticationModel.getHasAuthenticationToken().size(); n++){
			//check if the username token still exists after CIM Editor
			if(!(oAuthenticationModel.getHasAuthenticationToken().get(n) instanceof Password)){
				//find the authentication model core CIM Resource
				for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().size(); i++){
					if(oAuthenticationModel.getResourceAuthenticationModel().getAnnotatesResource().getName().equalsIgnoreCase(this.oRESTfulServiceCIM.getHasResources().get(i).getName())){
						//check if the the exact same core CIM property that previously was username token still exists
						for(int j = 0; j < this.oRESTfulServiceCIM.getHasResources().get(i).getHasProperty().size(); j++){
							if(oAuthenticationModel.getHasAuthenticationToken().get(n).getName().equalsIgnoreCase(this.oRESTfulServiceCIM.getHasResources().get(i).getHasProperty().get(j).getName()) 
							&& oAuthenticationModel.getHasAuthenticationToken().get(n).getType().equalsIgnoreCase(this.oRESTfulServiceCIM.getHasResources().get(i).getHasProperty().get(j).getType())
							&& oAuthenticationModel.getHasAuthenticationToken().get(n).isBIsUnique() == this.oRESTfulServiceCIM.getHasResources().get(i).getHasProperty().get(j).isIsUnique()){
								return this.oRESTfulServiceCIM.getHasResources().get(i).getHasProperty().get(j).getName();
							}
						}
						try {
							throw new ExecutionException(new Throwable());
						} catch (ExecutionException e) {
							Activator.log("Runtime error while trying to find new username token name.", e);
							return null;
						}
					}
				}
			}
		}
		try {
			throw new ExecutionException(new Throwable());
		} catch (ExecutionException e) {
			Activator.log("Runtime error while trying to find new username token name.", e);
			return null;
		}
	}

	private boolean passwordTokenIsStillValid(AuthenticationModel oAuthenticationModel){
		for(int n = 0; n < oAuthenticationModel.getHasAuthenticationToken().size(); n++){
			//check if the password token still exists after CIM Editor
			if((oAuthenticationModel.getHasAuthenticationToken().get(n) instanceof Password)){
				//find the authentication model core CIM Resource
				for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().size(); i++){
					if(oAuthenticationModel.getResourceAuthenticationModel().getAnnotatesResource().getName().equalsIgnoreCase(this.oRESTfulServiceCIM.getHasResources().get(i).getName())){
						//check if the the exact same core CIM property that previously was password token still exists
						for(int j = 0; j < this.oRESTfulServiceCIM.getHasResources().get(i).getHasProperty().size(); j++){
							if(oAuthenticationModel.getHasAuthenticationToken().get(n).getName().equalsIgnoreCase(this.oRESTfulServiceCIM.getHasResources().get(i).getHasProperty().get(j).getName()) 
							&& oAuthenticationModel.getHasAuthenticationToken().get(n).getType().equalsIgnoreCase(this.oRESTfulServiceCIM.getHasResources().get(i).getHasProperty().get(j).getType())
							&& oAuthenticationModel.getHasAuthenticationToken().get(n).isBIsUnique() == this.oRESTfulServiceCIM.getHasResources().get(i).getHasProperty().get(j).isIsUnique()){
								System.out.println("Password token is still valid!");
								return true;
							}
						}
						System.out.println("Password token is not valid!!");
						return false;
					}
				}
			}
		}
		try {
			throw new ExecutionException(new Throwable());
		} catch (ExecutionException e) {
			Activator.log("Runtime error while checking the validity of password token.", e);
			return false;
		}
	}
	
	private String getPasswordTokenNewName(AuthenticationModel oAuthenticationModel){
		for(int n = 0; n < oAuthenticationModel.getHasAuthenticationToken().size(); n++){
			//check if the password token still exists after CIM Editor
			if((oAuthenticationModel.getHasAuthenticationToken().get(n) instanceof Password)){
				//find the authentication model core CIM Resource
				for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().size(); i++){
					if(oAuthenticationModel.getResourceAuthenticationModel().getAnnotatesResource().getName().equalsIgnoreCase(this.oRESTfulServiceCIM.getHasResources().get(i).getName())){
						//check if the the exact same core CIM property that previously was password token still exists
						for(int j = 0; j < this.oRESTfulServiceCIM.getHasResources().get(i).getHasProperty().size(); j++){
							if(oAuthenticationModel.getHasAuthenticationToken().get(n).getName().equalsIgnoreCase(this.oRESTfulServiceCIM.getHasResources().get(i).getHasProperty().get(j).getName()) 
							&& oAuthenticationModel.getHasAuthenticationToken().get(n).getType().equalsIgnoreCase(this.oRESTfulServiceCIM.getHasResources().get(i).getHasProperty().get(j).getType())
							&& oAuthenticationModel.getHasAuthenticationToken().get(n).isBIsUnique() == this.oRESTfulServiceCIM.getHasResources().get(i).getHasProperty().get(j).isIsUnique()){
								System.out.println("Password token is still valid!");
								return this.oRESTfulServiceCIM.getHasResources().get(i).getHasProperty().get(j).getName();
							}
						}
						return null;
					}
				}
			}
		}
		try {
			throw new ExecutionException(new Throwable());
		} catch (ExecutionException e) {
			Activator.log("Unable to find password token new name", e);
			return null;
		}
	}


	private void initializeAuthenticationModelWidgets(){
		  
		  //initialize Authentication Model SWTs
		  this.oAuthenticationModelGroup = new Group(this.oAuthenticationModelGrid, SWT.NONE);
		  this.oAuthenticationModelGroup.setText("Authentication Model: ");
		  this.oAuthenticationModelGroup.setLayout(new GridLayout(1, false));
		  this.oAuthenticationModelGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		  this.oAuthenticationModelPromtLabel = new Label(this.oAuthenticationModelGroup, SWT.NULL);
		  this.oAuthenticationModelPromtLabel.setText("Choose your web service Authentication Model from the available resources below: ");
		  this.oAuthenticationModelResourceList = new List(this.oAuthenticationModelGroup, SWT.SINGLE | SWT.BORDER_SOLID | SWT.V_SCROLL);
		  populateAuthenticationModelResourceList();
		  this.oAuthenticationModelResourceList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 3));
		  addAuthenticationModelListListener();
	  }
	  
	  private void initializeUsernameTokenWidgets(){
		  
		  //initialize Authentication Model SWTs
		  this.oUsernameTokenPromtGroup = new Group(this.oUsernameTokenGrid, SWT.NONE);
		  this.oUsernameTokenPromtGroup.setText("Username Token: ");
		  this.oUsernameTokenPromtGroup.setLayout(new GridLayout(1, false));
		  this.oUsernameTokenPromtGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		  this.oUsernameTokenPromtLabel = new Label(this.oUsernameTokenPromtGroup, SWT.NULL);
		  this.oUsernameTokenPromtLabel.setText("Choose the property that will be the username authentication token: ");
		  this.oUsernameTokenPromtList = new List(this.oUsernameTokenPromtGroup, SWT.SINGLE | SWT.V_SCROLL | SWT.BORDER_SOLID);
		  this.oUsernameTokenPromtList.setEnabled(false);
		  this.oUsernameTokenPromtList.add("First you need to select an authentication model!");
		  this.oUsernameTokenPromtList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 3));
		  addUsernameTokenListListener();
	  }
	  
	  private void initializePasswordTokenWidgets(){
		  
		  //initialize Authentication Model SWTs
		  this.oPasswordTokenGroup = new Group(this.oPasswordTokenGrid, SWT.NONE);
		  this.oPasswordTokenGroup.setText("Password Token: ");
		  this.oPasswordTokenGroup.setLayout(new GridLayout(1, false));
		  this.oPasswordTokenGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		  this.oPasswordTokenPromtLabel = new Label(this.oPasswordTokenGroup, SWT.NULL);
		  this.oPasswordTokenPromtLabel.setText("Choose the property that will be the password authentication token: ");
		  this.oPasswordTokenPromtList = new List(this.oPasswordTokenGroup, SWT.SINGLE | SWT.V_SCROLL | SWT.BORDER_SOLID);
		  this.oPasswordTokenPromtList.setEnabled(false);
		  this.oPasswordTokenPromtList.add("First you need to select a username token!");
		  this.oPasswordTokenPromtList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 3));
		  addPasswordTokenListListener();
	  }
	  
	  private void populateAuthenticationModelResourceList(){
		  ArrayList<String> listOfStrings = new ArrayList<String>();
		  
		  for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().size(); i++){
			  if(this.oRESTfulServiceCIM.getHasResources().get(i).isIsAlgorithmic() == false){
				  listOfStrings.add(this.oRESTfulServiceCIM.getHasResources().get(i).getName());
			  }
		  }
		  
			java.util.Collections.sort(listOfStrings, Collator.getInstance());
			Iterator<String> iterator = listOfStrings.iterator();
			
			while(iterator.hasNext()){
				this.oAuthenticationModelResourceList.add(iterator.next());
			}
	  }
	  
	  private void addAuthenticationModelListListener() {

		  this.oAuthenticationModelResourceList.addSelectionListener(new SelectionListener(){
			  
			  @Override
			  public void widgetSelected(SelectionEvent e) {
				  strSelectedAuthenticationModelName = oAuthenticationModelResourceList.getSelection()[0];
				  strSelectedUsernameTokenName = "";
				  strSelectedPasswordTokenName = "";
				  populateUsernameTokenList(oAuthenticationModelResourceList.getSelection()[0]);
				  oPasswordTokenPromtList.removeAll();
				  oPasswordTokenPromtList.add("First you need to select a username token!");
//				  oPasswordTokenPromtList.setSize(oPasswordTokenPromtList.computeSize(oPasswordTokenPromtLabel.getSize().x - 10, 100));
				  setPageComplete(false);
			  }

			  @Override
			  public void widgetDefaultSelected(SelectionEvent e) {
				  strSelectedAuthenticationModelName = oAuthenticationModelResourceList.getSelection()[0];
				  strSelectedUsernameTokenName = "";
				  strSelectedPasswordTokenName = "";
				  populateUsernameTokenList(oAuthenticationModelResourceList.getSelection()[0]);
				  oPasswordTokenPromtList.removeAll();
				  oPasswordTokenPromtList.add("First you need to select a username token!");
//				  oPasswordTokenPromtList.setSize(oPasswordTokenPromtList.computeSize(oPasswordTokenPromtLabel.getSize().x - 10, 100));
				  setPageComplete(false);
			  }});
	  }
	  
	  private void addUsernameTokenListListener() {
			
		  this.oUsernameTokenPromtList.addSelectionListener(new SelectionListener(){

			  @Override
			  public void widgetSelected(SelectionEvent e) {
				  strSelectedUsernameTokenName = oUsernameTokenPromtList.getSelection()[0];
				  strSelectedPasswordTokenName = "";
				  populatePasswordTokenList(oUsernameTokenPromtList.getSelection()[0]);
				  setPageComplete(false);
			  }

			  @Override
			  public void widgetDefaultSelected(SelectionEvent e) {
				  populatePasswordTokenList(oUsernameTokenPromtList.getSelection()[0]);
				  strSelectedUsernameTokenName = oUsernameTokenPromtList.getSelection()[0];
				  strSelectedPasswordTokenName = "";
				  setPageComplete(false);
			  }});
	  }
	  
	  private void addPasswordTokenListListener() {
			
		  this.oPasswordTokenPromtList.addSelectionListener(new SelectionListener(){

			  @Override
			  public void widgetSelected(SelectionEvent e) {
				  strSelectedPasswordTokenName = oPasswordTokenPromtList.getSelection()[0];
				  setPageComplete(true);
			  }

			  @Override
			  public void widgetDefaultSelected(SelectionEvent e) {
				  strSelectedPasswordTokenName = oPasswordTokenPromtList.getSelection()[0];
				  setPageComplete(true);
			  }});
	  }
	  
	  private void populateUsernameTokenList(String strAuthenticationModelName){
		  this.oUsernameTokenPromtList.removeAll();
		  ArrayList<String> listOfStrings = new ArrayList<String>();
		  
		  for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
				if(this.oRESTfulServiceCIM.getHasResources().get(n).getName().equalsIgnoreCase(strAuthenticationModelName)){
					for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().size(); i++){
						listOfStrings.add(this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().get(i).getName());
					}
					this.oUsernameTokenPromtList.setEnabled(true);
					this.oPasswordTokenPromtList.setEnabled(false);
				}
		  }
		  
			java.util.Collections.sort(listOfStrings, Collator.getInstance());
			Iterator<String> iterator = listOfStrings.iterator();
			
			while(iterator.hasNext()){
				this.oUsernameTokenPromtList.add(iterator.next());
			}
	  }
	  
	  private void addAuthenticationModelToCIM(String strAuthenticationModelName){
			AnnResource oAnnResource = this.oAuthenticationLayerCIMFactory.createAnnResource();
			oAnnResource.setAnnotatesResource(getCoreResourceByName(strAuthenticationModelName));
			AuthenticationModel oAuthenticationModel = this.oAuthenticationLayerCIMFactory.createAuthenticationModel();
			oAuthenticationModel.setResourceAuthenticationModel(oAnnResource);
			this.oAuthenticationCIM.getHasAnnotatedElement().add(oAnnResource);
			this.oAuthenticationCIM.getHasAnnotation().add(oAuthenticationModel);
	  }
	  
	  private void populatePasswordTokenList(String strUsernameTokenName){
		  this.oPasswordTokenPromtList.removeAll();
		  ArrayList<String> listOfStrings = new ArrayList<String>();
		  
		  for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
				if(this.oRESTfulServiceCIM.getHasResources().get(n).getName().equalsIgnoreCase(this.oAuthenticationModelResourceList.getSelection()[0])){
					for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().size(); i++){
						if(!this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().get(i).getName().equalsIgnoreCase(strUsernameTokenName)){
							listOfStrings.add(this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().get(i).getName());
						}
					}
					this.oPasswordTokenPromtList.setEnabled(true);
				}
		  }
		  
		  java.util.Collections.sort(listOfStrings, Collator.getInstance());
		  Iterator<String> iterator = listOfStrings.iterator();
			
		  while(iterator.hasNext()){
			  this.oPasswordTokenPromtList.add(iterator.next());
		  }
	  }
	  
	  private ServiceCIM.Resource getCoreResourceByName(String strCoreResourceName){
		  for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().size(); i++){
			  if(this.oRESTfulServiceCIM.getHasResources().get(i).getName().equalsIgnoreCase(strCoreResourceName)){
				  System.out.println("Found core resource!");
				  return this.oRESTfulServiceCIM.getHasResources().get(i);
			  }
		  }
		  try {
				throw new ExecutionException(new Throwable());
			} catch (ExecutionException e) {
				Activator.log("Unable to find core Resource by name " + strCoreResourceName, e);
				return null;
			}
	  }
	  
	  private AuthenticationModel getAuthenticationModelResource(){
		  for(int i = 0; i < this.oAuthenticationCIM.getHasAnnotation().size(); i++){
			  if(this.oAuthenticationCIM.getHasAnnotation().get(i) instanceof AuthenticationModel){
				  return (AuthenticationModel) this.oAuthenticationCIM.getHasAnnotation().get(i);
			  }
		  }
			try {
				throw new ExecutionException(new Throwable());
			} catch (ExecutionException e) {
				Activator.log("Unable to find authentication model resource.", e);
				return null;
			}
	  }
	  
	  private void addUsernameTokenToCIM(String strUsernameTokenName){
		  
		  for(int i = 0; i < getAuthenticationModelResource().getResourceAuthenticationModel().getAnnotatesResource().getHasProperty().size(); i++){
			  if(getAuthenticationModelResource().getResourceAuthenticationModel().getAnnotatesResource().getHasProperty().get(i).getName().equalsIgnoreCase(strUsernameTokenName)){
				  AnnProperty oAnnProperty = this.oAuthenticationLayerCIMFactory.createAnnProperty();
				  oAnnProperty.setAnnotatesProperty(getCorePropertyByName(strUsernameTokenName));;
			      AuthenticationToken oAuthenticationToken = this.oAuthenticationLayerCIMFactory.createAuthenticationToken();
			      oAuthenticationToken.setName(strUsernameTokenName);
				  oAuthenticationToken.setType(getAuthenticationModelResource().getResourceAuthenticationModel().getAnnotatesResource().getHasProperty().get(i).getType());
				  oAuthenticationToken.setBIsUnique(getAuthenticationModelResource().getResourceAuthenticationModel().getAnnotatesResource().getHasProperty().get(i).isIsUnique());
				  oAuthenticationToken.setPropertyAuthenticationToken(oAnnProperty);
				  this.oAuthenticationCIM.getHasAnnotatedElement().add(oAnnProperty);
				  this.oAuthenticationCIM.getHasAnnotation().add(oAuthenticationToken);
				  getAuthenticationModelResource().getHasAuthenticationToken().add(oAuthenticationToken);
			  }
		  }
	  }
	  
	  private void addPasswordTokenToCIM(String strPasswordTokenName){
		  
		  for(int i = 0; i < getAuthenticationModelResource().getResourceAuthenticationModel().getAnnotatesResource().getHasProperty().size(); i++){
			  if(getAuthenticationModelResource().getResourceAuthenticationModel().getAnnotatesResource().getHasProperty().get(i).getName().equalsIgnoreCase(strPasswordTokenName)){
				  AnnProperty oAnnProperty = this.oAuthenticationLayerCIMFactory.createAnnProperty();
				  oAnnProperty.setAnnotatesProperty(getCorePropertyByName(strPasswordTokenName));;
				  Password oPassword = this.oAuthenticationLayerCIMFactory.createPassword();
				  oPassword.setName(strPasswordTokenName);
				  oPassword.setType(getAuthenticationModelResource().getResourceAuthenticationModel().getAnnotatesResource().getHasProperty().get(i).getType());
				  oPassword.setBIsUnique(getAuthenticationModelResource().getResourceAuthenticationModel().getAnnotatesResource().getHasProperty().get(i).isIsUnique());
				  oPassword.setPropertyAuthenticationToken(oAnnProperty);
				  this.oAuthenticationCIM.getHasAnnotatedElement().add(oAnnProperty);
				  this.oAuthenticationCIM.getHasAnnotation().add(oPassword);
				  getAuthenticationModelResource().getHasAuthenticationToken().add(oPassword);
			  }
		  }
	  }
	  
	  private ServiceCIM.Property getCorePropertyByName(String strPropertyName){
		  for(int i = 0; i < this.getAuthenticationModelResource().getResourceAuthenticationModel().getAnnotatesResource().getHasProperty().size(); i++){
			  if( strPropertyName.equalsIgnoreCase(this.getAuthenticationModelResource().getResourceAuthenticationModel().getAnnotatesResource().getHasProperty().get(i).getName())){
				  return this.getAuthenticationModelResource().getResourceAuthenticationModel().getAnnotatesResource().getHasProperty().get(i);
			  }
		  }
			try {
				throw new ExecutionException(new Throwable());
			} catch (ExecutionException e) {
				Activator.log("Unable to find core property by name " + strPropertyName, e);
				return null;
			}
	  }
	  
	  public void createAuthenticationCIM(){
		  
		  //clean the authenticaitonCIM prior writing anything in it in case it was loaded from xmi.
		  this.oAuthenticationCIM.getHasAnnotatedElement().clear();
		  this.oAuthenticationCIM.getHasAnnotation().clear();
		  
		  addAuthenticationModelToCIM(this.strSelectedAuthenticationModelName);
		  addUsernameTokenToCIM(this.strSelectedUsernameTokenName);
		  addPasswordTokenToCIM(this.strSelectedPasswordTokenName);
	  }
}
	 