package eu.fp7.scase.DBMigratorWizard;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutionException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;

import ServiceCIM.RESTfulServiceCIM;
import ServiceCIM.Resource;
import databaseMetamodel.Column;
import eu.fp7.scase.launcher.cimgenerator.Activator;
import MDEMigratorCIMMetamodel.Annotation;
import MDEMigratorCIMMetamodel.AnnotationModel;
import MDEMigratorCIMMetamodel.JoinColumn;
import MDEMigratorCIMMetamodel.MDEMigratorCIMMetamodelFactory;
import MDEMigratorCIMMetamodel.ParentMapping;
import MDEMigratorCIMMetamodel.SourceColumn;
import MDEMigratorCIMMetamodel.SourceRelation;
import MDEMigratorCIMMetamodel.TargetColumn;
import MDEMigratorCIMMetamodel.TargetRelation;

import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;

public class DBMigratorWizardPage extends WizardPage{

	private RESTfulServiceCIM oRESTfulServiceCIM;
	private MDEMigratorCIMMetamodel.AnnotationModel oMdeDBMigratorCIM;
	private MDEMigratorCIMMetamodelFactory oMdeMigratorCIMMetamodelFactory;
	private Composite oWizardPageGrid;
	private Composite oParentComposite;
	private String strSelectedAuthenticationModelName;
	private String strSelectedUsernameTokenName;
	private String strSelectedPasswordTokenName;
	private boolean bReloadExistingModels;
	private DBSchemaLoader oDBSchemaLoader;

	private Text oSourceDBURL;
	private Text oSourceDBUsername;
	private Text oSourceDBPassword;
	private Label lblSourceDatabase;
	private Label lblTargetDatabase;
	private Label lblDbUrl;
	private Label lblDbUsername;
	private Label lblDbPassword;
	private Label lblDbType;
	private List oSourceDBType;
	private Label lblSourceDatabaseRelations;
	private Button oDeleteColumnMappingButton;
	private List oColumnMappingList;
	private Label lblCreatedColumnMappins;
	private List oTargetResourceList;
	private List oSourceDBRelationList;
	private Label label;
	private Label lblCreatedRelationsMappins;
	private List oRelationMappingList;
	private Button oDeleteRelationMappingButton;
	private Label label_1;
	private Label lblSourceRelationColumns;
	private Label lblTargetRelationColumns;
	private List oSourceColumnList;
	private List oTargetPropertyList;
	private Button oAddColumnMappingButton;
	private Label label_2;
	private Button oFetchDBSchemaButton;
	private Label lblDbName;
	private Text oDBName;
	private Label label_3;
	private Button oAddRelationMappingButton;

	  public DBMigratorWizardPage(String strOutputFolder, RESTfulServiceCIM oRESTfulServiceCIM, MDEMigratorCIMMetamodel.AnnotationModel oMdeDBMigratorCIM, boolean bReloadExistingModels) {
		  super("Select MDE Database Migrator Model");
		  this.oMdeMigratorCIMMetamodelFactory = MDEMigratorCIMMetamodelFactory.eINSTANCE;
		  this.oRESTfulServiceCIM = oRESTfulServiceCIM;
		  this.oMdeDBMigratorCIM = oMdeDBMigratorCIM;
		  this.bReloadExistingModels = bReloadExistingModels;
	  }

	  @Override
	  public void createControl(Composite parent) {
		  this.oParentComposite = parent;
		  this.oWizardPageGrid = new Composite(oParentComposite, SWT.NONE);
		  
		  
		  this.setControl(this.oWizardPageGrid);
		  
		  lblSourceDatabase = new Label(oWizardPageGrid, SWT.NONE);
		  lblSourceDatabase.setBounds(50, 10, 233, 14);
		  lblSourceDatabase.setText("Source Database Information:");
		  
		  lblTargetDatabase = new Label(oWizardPageGrid, SWT.NONE);
		  lblTargetDatabase.setText("Available CRUD Resources:");
		  lblTargetDatabase.setBounds(373, 86, 168, 14);
		  
		  lblDbUrl = new Label(oWizardPageGrid, SWT.NONE);
		  lblDbUrl.setBounds(10, 30, 59, 14);
		  lblDbUrl.setText("DB URL:");
		  
		  lblDbUsername = new Label(oWizardPageGrid, SWT.NONE);
		  lblDbUsername.setBounds(275, 30, 80, 14);
		  lblDbUsername.setText("DB Username:");
		  
		  lblDbPassword = new Label(oWizardPageGrid, SWT.NONE);
		  lblDbPassword.setBounds(275, 54, 80, 14);
		  lblDbPassword.setText("DB Password:");
		  
		  lblDbType = new Label(oWizardPageGrid, SWT.NONE);
		  lblDbType.setBounds(10, 54, 59, 14);
		  lblDbType.setText("DB Type:");
		  
		  oSourceDBType = new List(oWizardPageGrid, SWT.BORDER | SWT.V_SCROLL);
		  oSourceDBType.setItems(new String[] {"MySQL", "PostgreSQL"});
		  oSourceDBType.setBounds(60, 50, 105, 19);
		  addSourceDBTypeListener();
		  
		  oSourceDBURL = new Text(oWizardPageGrid, SWT.BORDER);
		  oSourceDBURL.setBounds(60, 25, 200, 19);
		  addSourceDBURLListener();
		  
		  oSourceDBUsername = new Text(oWizardPageGrid, SWT.BORDER);
		  oSourceDBUsername.setBounds(360, 25, 64, 19);
		  addSourceDBUsernameListener();
		  
		  oSourceDBPassword = new Text(oWizardPageGrid, SWT.BORDER | SWT.PASSWORD);
		  oSourceDBPassword.setBounds(360, 50, 64, 19);
		  addSourceDBPasswordListener();
		  
		  lblSourceDatabaseRelations = new Label(oWizardPageGrid, SWT.NONE);
		  lblSourceDatabaseRelations.setText("Source Database Relations:");
		  lblSourceDatabaseRelations.setBounds(10, 86, 168, 14);
		  
		  oTargetResourceList = new List(oWizardPageGrid, SWT.BORDER | SWT.V_SCROLL);
		  oTargetResourceList.setBounds(356, 106, 210, 66);
		  addTargetResourceListListener();
		  
		  oSourceDBRelationList = new List(oWizardPageGrid, SWT.BORDER | SWT.V_SCROLL);
		  oSourceDBRelationList.setBounds(10, 106, 210, 66);
		  addSourceDBRelationListListener();
		  
		  oAddRelationMappingButton = new Button(oWizardPageGrid, SWT.CENTER);
		  oAddRelationMappingButton.setBounds(233, 123, 113, 28);
		  oAddRelationMappingButton.setText("Add Mapping");
		  createAddRelationMappingButtonListener();
		  
		  label = new Label(oWizardPageGrid, SWT.SEPARATOR | SWT.HORIZONTAL);
		  label.setBounds(0, 178, 590, 2);
		  
		  lblCreatedRelationsMappins = new Label(oWizardPageGrid, SWT.NONE);
		  lblCreatedRelationsMappins.setBounds(10, 186, 200, 14);
		  lblCreatedRelationsMappins.setText("Created Relations Mappings:");
		  
		  oRelationMappingList = new List(oWizardPageGrid, SWT.BORDER | SWT.V_SCROLL);
		  oRelationMappingList.setBounds(10, 204, 440, 66);
		  addRelationMappingListener();
		  
		  oDeleteRelationMappingButton = new Button(oWizardPageGrid, SWT.NONE);
		  oDeleteRelationMappingButton.setBounds(455, 224, 130, 28);
		  oDeleteRelationMappingButton.setText("Delete Mapping");
		  createDeleteRelationMappingButtonListener();
		  
		  label_1 = new Label(oWizardPageGrid, SWT.SEPARATOR | SWT.HORIZONTAL);
		  label_1.setBounds(0, 276, 590, 2);
		  
		  lblSourceRelationColumns = new Label(oWizardPageGrid, SWT.NONE);
		  lblSourceRelationColumns.setBounds(10, 282, 152, 14);
		  lblSourceRelationColumns.setText("Source Relation Columns:");
		  
		  lblTargetRelationColumns = new Label(oWizardPageGrid, SWT.NONE);
		  lblTargetRelationColumns.setText("CRUD Resource Properties:");
		  lblTargetRelationColumns.setBounds(362, 284, 152, 14);
		  
		  oSourceColumnList = new List(oWizardPageGrid, SWT.BORDER | SWT.V_SCROLL);
		  oSourceColumnList.setBounds(10, 300, 210, 66);
		  addSourceColumnListListener();
		  
		  oTargetPropertyList = new List(oWizardPageGrid, SWT.BORDER | SWT.V_SCROLL);
		  oTargetPropertyList.setBounds(356, 300, 210, 66);
		  addTargetPropertyListListener();
		  
		  oAddColumnMappingButton = new Button(oWizardPageGrid, SWT.NONE);
		  oAddColumnMappingButton.setBounds(233, 316, 113, 28);
		  oAddColumnMappingButton.setText("Add Mapping");
		  createAddColumnMappingButtonListener();
		  
		  label_2 = new Label(oWizardPageGrid, SWT.SEPARATOR | SWT.HORIZONTAL);
		  label_2.setBounds(0, 372, 590, 2);
		  
		  lblCreatedColumnMappins = new Label(oWizardPageGrid, SWT.NONE);
		  lblCreatedColumnMappins.setBounds(10, 378, 168, 14);
		  lblCreatedColumnMappins.setText("Created Column Mappins:");
		  
		  oColumnMappingList = new List(oWizardPageGrid, SWT.BORDER | SWT.V_SCROLL);
		  oColumnMappingList.setBounds(10, 395, 440, 66);
		  addColumnMappingListListener();
		  
		  oDeleteColumnMappingButton = new Button(oWizardPageGrid, SWT.NONE);
		  oDeleteColumnMappingButton.setText("Delete Mapping");
		  oDeleteColumnMappingButton.setBounds(455, 413, 130, 28);
		  addDeleteColumnMappingButtonListener();
		  
		  oFetchDBSchemaButton = new Button(oWizardPageGrid, SWT.NONE);
		  oFetchDBSchemaButton.setBounds(435, 52, 150, 28);
		  oFetchDBSchemaButton.setText("Fetch DB Schema");
		  addFetchDBSchemaButton();
		  
		  lblDbName = new Label(oWizardPageGrid, SWT.NONE);
		  lblDbName.setBounds(440, 30, 59, 14);
		  lblDbName.setText("DB Name:");
		  
		  oDBName = new Text(oWizardPageGrid, SWT.BORDER);
		  oDBName.setBounds(510, 25, 64, 19);
		  
		  label_3 = new Label(oWizardPageGrid, SWT.SEPARATOR | SWT.HORIZONTAL);
		  label_3.setBounds(0, 78, 590, 2);
		  addDBNameListener();
		  
		  //populate initial SWTs when needed
		  populateTargetRelationsList();
		  
		  //TODO remove default values
//		  this.oMdeDBMigratorCIM.setStrDBURL("localhost:3306");
//		  this.oSourceDBURL.setText("localhost:3306");
//		  this.oMdeDBMigratorCIM.setStrDBType("MySQL");
//		  this.oSourceDBType.setSelection(0);
//		  this.oMdeDBMigratorCIM.setStrDBName("wsat");
	//	  this.oDBName.setText("wsat");
	//	  this.oMdeDBMigratorCIM.setStrDBUsername("postgres");
	//	  this.oSourceDBUsername.setText("postgres");
//		  this.oMdeDBMigratorCIM.setStrDBPassword("fp7s-case");
//		  this.oSourceDBPassword.setText("fp7s-case");
		  
		  if(!this.bReloadExistingModels){
			  System.out.println("DB Migration Wizard started from scratch!");
			  this.updateWidgetStatus();
			  this.setPageComplete(isPageCompleted());
		  }
		  else{
			  System.out.println("Restoring DB Migration Wizard");
			  if(restoreDBMigrationWizardPage() == false){
				  this.bReloadExistingModels = false;
			  }
			  this.updateWidgetStatus();
			  this.setPageComplete(isPageCompleted());
		  }
	  }

	private boolean restoreDBMigrationWizardPage() {
		if(sourceDBConnectionDetailsAreValid() == false){
			return false;
		}
		else{
			reloadDBConnectionDetails();
		}
		
		
		if(loadValidRelationResourceMappings() == false){
			return false;
		}
		else{
			cleanUpMappingSchedulingAttributes();
			populateRelationMappingList();
		}
		
		return true;
	}

	private void reloadDBConnectionDetails() {
		  this.oSourceDBURL.setText(this.oMdeDBMigratorCIM.getStrDBURL());
		  this.oSourceDBType.setSelection(this.oSourceDBType.indexOf(this.oMdeDBMigratorCIM.getStrDBType()));
		  this.oDBName.setText(this.oMdeDBMigratorCIM.getStrDBName());
		  this.oSourceDBUsername.setText(this.oMdeDBMigratorCIM.getStrDBUsername());
		  this.oSourceDBPassword.setText(this.oMdeDBMigratorCIM.getStrDBPassword());
	}

	private boolean loadValidRelationResourceMappings() {
		boolean bFoundValidResourceMapping = false;
		
		for(int n = 0; n < this.oMdeDBMigratorCIM.getHasAnnotation().size(); n++){
			if(this.oMdeDBMigratorCIM.getHasAnnotation().get(n) instanceof TargetRelation){
				TargetRelation oTargetRelation = (TargetRelation) this.oMdeDBMigratorCIM.getHasAnnotation().get(n);
				if(hasValidRelationAndResource(oTargetRelation) == false){
					this.oMdeDBMigratorCIM.getHasAnnotation().remove(n);
					continue;
				}
				else{
					deleteInvalidColumnMappings(oTargetRelation);
					bFoundValidResourceMapping = true;
				}
			}
		}
		
		return bFoundValidResourceMapping;
	}

	private void deleteInvalidColumnMappings(TargetRelation oTargetRelation) {
		for(int n = 0; n < oTargetRelation.getHasTargetColumn().size(); n++){
			if(isInvalidColumnPropertyMapping(oTargetRelation, n) == true){
				oTargetRelation.getHasTargetColumn().remove(n);
			}
		}
	}

	private boolean isInvalidColumnPropertyMapping(TargetRelation oTargetRelation, int iColumnPropertyIndex) {
		//check if source relation column of same type still exists
		boolean bHasValidSourceColumn = hasValidSourceColumn(oTargetRelation, iColumnPropertyIndex);
		
		//check if target property column of the same type still exists
		boolean bHasValidTargetProperty = hasValidTargetProperty(oTargetRelation, iColumnPropertyIndex);
		
		return !(bHasValidSourceColumn && bHasValidTargetProperty);
	}

	private boolean hasValidSourceColumn(TargetRelation oTargetRelation, int iColumnPropertyIndex) {
		for(int n = 0; n < this.oDBSchemaLoader.getSourceDatabase().getRelation().size(); n++){
			if(this.oDBSchemaLoader.getSourceDatabase().getRelation().get(n).getName().equalsIgnoreCase(oTargetRelation.getIsMappedFromRelation().getName())){
				for(int i = 0; i < this.oDBSchemaLoader.getSourceDatabase().getRelation().get(n).getHasColumns().size(); i++){
					if(this.oDBSchemaLoader.getSourceDatabase().getRelation().get(n).getHasColumns().get(i).getName().equalsIgnoreCase(oTargetRelation.getHasTargetColumn().get(iColumnPropertyIndex).getIsMappedFromColumn().getName()) &&
					   this.oDBSchemaLoader.getSourceDatabase().getRelation().get(n).getHasColumns().get(i).getType().equalsIgnoreCase(oTargetRelation.getHasTargetColumn().get(iColumnPropertyIndex).getIsMappedFromColumn().getType())){
						return true;
					}
				}
			}
		}
		
		return false;
	}

	private boolean hasValidTargetProperty(TargetRelation oTargetRelation, int iColumnPropertyIndex) {
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).getName().equalsIgnoreCase(oTargetRelation.getIsTargetRelationResource().getName())){
				for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().size(); i++){
					if( this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().get(i).getName().equalsIgnoreCase(oTargetRelation.getHasTargetColumn().get(iColumnPropertyIndex).getIsAnnotatedProperty().getName())   &&
						this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().get(i).getType().equalsIgnoreCase(oTargetRelation.getHasTargetColumn().get(iColumnPropertyIndex).getIsAnnotatedProperty().getType())){
						return true;
					}
				}
			}
		}
		
		return false;
	}

	private boolean hasValidRelationAndResource(TargetRelation oTargetRelation) {
		//check if source relation exists in database
		boolean bFoundSourceRelation = false;
		for(int n = 0; n < this.oDBSchemaLoader.getSourceDatabase().getRelation().size(); n++){
			if(this.oDBSchemaLoader.getSourceDatabase().getRelation().get(n).getName().equalsIgnoreCase(oTargetRelation.getIsMappedFromRelation().getName())){
				bFoundSourceRelation = true;
				break;
			}
		}
		
		//check if target resource exists in CIM
		boolean bFoundTargetResource = false;
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() == false){
				if(this.oRESTfulServiceCIM.getHasResources().get(n).getName().equalsIgnoreCase(oTargetRelation.getIsTargetRelationResource().getName())){
					bFoundTargetResource = true;
				}
			}
		}
		return (bFoundSourceRelation && bFoundTargetResource);
	}

	private boolean sourceDBConnectionDetailsAreValid() {
		
		if(oMdeDBMigratorCIM.getStrDBName() == null || oMdeDBMigratorCIM.getStrDBName().isEmpty() || 
		   oMdeDBMigratorCIM.getStrDBPassword() == null || oMdeDBMigratorCIM.getStrDBPassword().isEmpty() ||
		   oMdeDBMigratorCIM.getStrDBType() == null || oMdeDBMigratorCIM.getStrDBType().isEmpty() ||
		   oMdeDBMigratorCIM.getStrDBURL() == null || oMdeDBMigratorCIM.getStrDBURL().isEmpty() ||
		   oMdeDBMigratorCIM.getStrDBUsername() == null || oMdeDBMigratorCIM.getStrDBUsername().isEmpty()
	       ){
			
			return false;
		}
		
		oDBSchemaLoader = new DBSchemaLoader(oMdeDBMigratorCIM.getStrDBType(), oMdeDBMigratorCIM.getStrDBURL(), oMdeDBMigratorCIM.getStrDBName(), oMdeDBMigratorCIM.getStrDBUsername(), oMdeDBMigratorCIM.getStrDBPassword());
		if(oDBSchemaLoader.connectToDB() == false){
			setErrorMessage("Failed to connect to database!");
			return false;
		}
		else{
			System.out.println("Succesfully connected to old source database");
			oDBSchemaLoader.fetchDBSchema();
			populateSourceDatabaseRelations();
			return true;
		}
	}

	private void addColumnMappingListListener() {
		this.oColumnMappingList.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}

	private void addDeleteColumnMappingButtonListener() {
		this.oDeleteColumnMappingButton.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				//delete an existing relation-resource mapping 
				for(int i = 0; i < oMdeDBMigratorCIM.getHasAnnotation().size(); i++){
					if(oMdeDBMigratorCIM.getHasAnnotation().get(i) instanceof TargetRelation){//find the corresponding relation/resource mapping
						if(((TargetRelation)oMdeDBMigratorCIM.getHasAnnotation().get(i)).getRelationMappingName().equalsIgnoreCase(oRelationMappingList.getSelection()[0])){
							for(int n = 0; n < ((TargetRelation)oMdeDBMigratorCIM.getHasAnnotation().get(i)).getHasTargetColumn().size(); n++){
								if(oColumnMappingList.getSelection()[0].equalsIgnoreCase(((TargetRelation)oMdeDBMigratorCIM.getHasAnnotation().get(i)).getHasTargetColumn().get(n).getColumnMappingName())){
									((TargetRelation)oMdeDBMigratorCIM.getHasAnnotation().get(i)).getHasTargetColumn().remove(n);
								}
							}
						}
					}
				}
				
				//re-populate it
				populateColumnMappingList();
				
				//update widget status
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}

	private void addTargetPropertyListListener() {
		this.oTargetPropertyList.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}

	private void addSourceColumnListListener() {
		this.oSourceColumnList.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}

	private void createDeleteRelationMappingButtonListener() {
		this.oDeleteRelationMappingButton.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				//delete an existing relation-resource mapping 
				for(int i = 0; i < oMdeDBMigratorCIM.getHasAnnotation().size(); i++){
					if(oMdeDBMigratorCIM.getHasAnnotation().get(i) instanceof TargetRelation){
						if(((TargetRelation)oMdeDBMigratorCIM.getHasAnnotation().get(i)).getRelationMappingName().equalsIgnoreCase(oRelationMappingList.getSelection()[0])){
							oMdeDBMigratorCIM.getHasAnnotation().remove(i);
						}
					}
				}
				
				//re-populate it
				populateRelationMappingList();
				
				//update widget status
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}

	private void populateRelationMappingList(){
		//clear the relation mapping list
		oRelationMappingList.removeAll();
		ArrayList<String> listOfStrings = new ArrayList<String>();
		
		for(int i = 0; i < this.oMdeDBMigratorCIM.getHasAnnotation().size(); i++){
			if(this.oMdeDBMigratorCIM.getHasAnnotation().get(i) instanceof TargetRelation){
				listOfStrings.add(((TargetRelation)this.oMdeDBMigratorCIM.getHasAnnotation().get(i)).getRelationMappingName());
			}
		}
		
		java.util.Collections.sort(listOfStrings, Collator.getInstance());
		Iterator<String> iterator = listOfStrings.iterator();
		
		while(iterator.hasNext()){
			this.oRelationMappingList.add(iterator.next());
		}
	}
	
	private void populateColumnMappingList(){
		//clear the relation mapping list
		this.oColumnMappingList.removeAll();
		ArrayList<String> listOfStrings = new ArrayList<String>();
		
		for(int i = 0; i < this.oMdeDBMigratorCIM.getHasAnnotation().size(); i++){
			if(this.oMdeDBMigratorCIM.getHasAnnotation().get(i) instanceof TargetRelation){
				if(this.oRelationMappingList.getSelection()[0].equalsIgnoreCase(((TargetRelation)this.oMdeDBMigratorCIM.getHasAnnotation().get(i)).getRelationMappingName())){
					for(int n = 0; n < ((TargetRelation)this.oMdeDBMigratorCIM.getHasAnnotation().get(i)).getHasTargetColumn().size(); n++){
						listOfStrings.add(((TargetRelation)this.oMdeDBMigratorCIM.getHasAnnotation().get(i)).getHasTargetColumn().get(n).getColumnMappingName());
					}
				}
			}
		}
		
		java.util.Collections.sort(listOfStrings, Collator.getInstance());
		Iterator<String> iterator = listOfStrings.iterator();
		
		while(iterator.hasNext()){
			this.oColumnMappingList.add(iterator.next());
		}
	}
	
	private void addSourceDBRelationListListener() {
		this.oSourceDBRelationList.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}

	private void addTargetResourceListListener() {
		this.oTargetResourceList.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}

	private void addRelationMappingListener() {
		  this.oRelationMappingList.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				for(int i = 0; i < oMdeDBMigratorCIM.getHasAnnotation().size(); i++){
					if(oMdeDBMigratorCIM.getHasAnnotation().get(i) instanceof TargetRelation){
						String strRelationMappingName = oRelationMappingList.getSelection()[0];
						TargetRelation oTargetRelation = (TargetRelation) oMdeDBMigratorCIM.getHasAnnotation().get(i);
						if(strRelationMappingName.equalsIgnoreCase(oTargetRelation.getRelationMappingName())){
							populateSourceRelationColumnsList(oTargetRelation.getIsMappedFromRelation().getName());
							populateTargetResroucePropertiesList(oTargetRelation.getIsTargetRelationResource().getName());
							populateColumnMappingList();
						}
					}
				}
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				for(int i = 0; i < oMdeDBMigratorCIM.getHasAnnotation().size(); i++){
					if(oMdeDBMigratorCIM.getHasAnnotation().get(i) instanceof TargetRelation){
						String strRelationMappingName = oRelationMappingList.getSelection()[0];
						TargetRelation oTargetRelation = (TargetRelation) oMdeDBMigratorCIM.getHasAnnotation().get(i);
						if(strRelationMappingName.equalsIgnoreCase(oTargetRelation.getRelationMappingName())){
							populateSourceRelationColumnsList(oTargetRelation.getIsMappedFromRelation().getName());
							populateTargetResroucePropertiesList(oTargetRelation.getIsTargetRelationResource().getName());
						}
					}
				}
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}
	
	private void populateSourceRelationColumnsList(String strSourceRelationName){
		this.oSourceColumnList.removeAll();
		ArrayList<String> listOfStrings = new ArrayList<String>();
		
		for(int i = 0; i < this.oDBSchemaLoader.getSourceDatabase().getRelation().size(); i++){
			if(this.oDBSchemaLoader.getSourceDatabase().getRelation().get(i).getName().equalsIgnoreCase(strSourceRelationName)){
				for(int  n = 0; n < this.oDBSchemaLoader.getSourceDatabase().getRelation().get(i).getHasColumns().size(); n++){
					listOfStrings.add(this.oDBSchemaLoader.getSourceDatabase().getRelation().get(i).getHasColumns().get(n).getName());					
				}
			}
		}
		
		java.util.Collections.sort(listOfStrings, Collator.getInstance());
		Iterator<String> iterator = listOfStrings.iterator();
		
		while(iterator.hasNext()){
			this.oSourceColumnList.add(iterator.next());
		}
		
	}
	
	private void populateTargetResroucePropertiesList(String strTargetResourceName){
		this.oTargetPropertyList.removeAll();
		ArrayList<String> listOfStrings = new ArrayList<String>();
		
		Resource oSelectedResource = this.oRESTfulServiceCIM.getHasResources().get(this.getCRUDResourceIndexByName(strTargetResourceName));
		for(int i = 0; i < oSelectedResource.getHasProperty().size(); i++){
			listOfStrings.add(oSelectedResource.getHasProperty().get(i).getName());
		}
		
		java.util.Collections.sort(listOfStrings, Collator.getInstance());
		Iterator<String> iterator = listOfStrings.iterator();
		
		while(iterator.hasNext()){
			this.oTargetPropertyList.add(iterator.next());
		}
		
	}

	private void createAddRelationMappingButtonListener() {
		this.oAddRelationMappingButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				//retrieve the names of the selected source relation and the target selected resource.
				String strSourceRelationName = oSourceDBRelationList.getSelection()[0];
				String strTargetResourceName = oTargetResourceList.getSelection()[0];
				
				//create the target relation object
				TargetRelation oTargetRelation = oMdeMigratorCIMMetamodelFactory.createTargetRelation();
				oTargetRelation.setRelationMappingName(strSourceRelationName + " -> " + strTargetResourceName); 
				oTargetRelation.setIsTargetRelationResource(oRESTfulServiceCIM.getHasResources().get(getCRUDResourceIndexByName(strTargetResourceName)));
				
				//create the source relation object
				SourceRelation oSourceRelation = oMdeMigratorCIMMetamodelFactory.createSourceRelation();
				oSourceRelation.setName(strSourceRelationName);
				
				//add its primary keys
				ArrayList<Column> relationPKColumns = oDBSchemaLoader.getRelationPKColumns(oSourceRelation.getName());
				Iterator<Column> oIterator = relationPKColumns.iterator();
				
				while(oIterator.hasNext()){
					Column oPKColumn = (Column) oIterator.next();
					SourceColumn oPKSourceColumn = oMdeMigratorCIMMetamodelFactory.createSourceColumn();
					oPKSourceColumn.setName(oPKColumn.getName());
					oPKSourceColumn.setType(oPKColumn.getType());
					oPKSourceColumn.setHasPkOrder(oPKColumn.getHasPKOrder());
					oSourceRelation.getHasPrimaryKeyColumn().add(oPKSourceColumn);
				}
			
				//connect it to the target relation
				oTargetRelation.setIsMappedFromRelation(oSourceRelation);
				
				//add the new annotation to the Migrator CIM
				oMdeDBMigratorCIM.getHasAnnotation().add(oTargetRelation);
				
				//display the new List
				populateRelationMappingList();
				
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}
		});
	}
	
	private void createAddColumnMappingButtonListener(){
		this.oAddColumnMappingButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				//retrieve the names of the selected source column and the target selected property.
				String strSourceColumnName = oSourceColumnList.getSelection()[0];
				String strTargetPropertyName = oTargetPropertyList.getSelection()[0];
				
				//load the target relation object
				TargetRelation oTargetRelation = null;
				for(int i = 0; i < oMdeDBMigratorCIM.getHasAnnotation().size(); i++){
					if(oMdeDBMigratorCIM.getHasAnnotation().get(i) instanceof TargetRelation){
						if(((TargetRelation)oMdeDBMigratorCIM.getHasAnnotation().get(i)).getRelationMappingName().equalsIgnoreCase(oRelationMappingList.getSelection()[0])){
							oTargetRelation = (TargetRelation)oMdeDBMigratorCIM.getHasAnnotation().get(i);
						}
					}
				}
				
				//create the source column object
				SourceColumn oSourceColumn = oMdeMigratorCIMMetamodelFactory.createSourceColumn();
				oSourceColumn.setName(strSourceColumnName);
				oSourceColumn.setType(oDBSchemaLoader.getSourceDatabase().getRelation().get(oDBSchemaLoader.getSourceRelationByName(oTargetRelation.getIsMappedFromRelation().getName())).getHasColumns().get(oDBSchemaLoader.getSourceRelationColumnByName(oTargetRelation.getIsMappedFromRelation().getName(), strSourceColumnName)).getType());
				
				//create the target property object
				TargetColumn oTargetColumn = oMdeMigratorCIMMetamodelFactory.createTargetColumn();
				oTargetColumn.setColumnMappingName(String.format("%s -> %s", oSourceColumn.getName(), strTargetPropertyName));
				
				//reference the Core CIM Property
				oTargetColumn.setIsAnnotatedProperty(oRESTfulServiceCIM.getHasResources().get(getCRUDResourceIndexByName(oTargetRelation.getIsTargetRelationResource().getName())).getHasProperty().get(getCRUDResourcePropertyIndexByName(oTargetRelation.getIsTargetRelationResource().getName(), strTargetPropertyName)));
				
				//set reference to source column
				oTargetColumn.setIsMappedFromColumn(oSourceColumn);
				
				//add source column and target property to target relation object
				oTargetRelation.getHasTargetColumn().add(oTargetColumn);
				oTargetRelation.getIsMappedFromRelation().getHasSourceColumn().add(oSourceColumn);
				
				//add it to the new List
				oColumnMappingList.add(oTargetColumn.getColumnMappingName());
				//re-populate it
				populateColumnMappingList();
				
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}
		});
	}

	private void populateTargetRelationsList() {
		ArrayList<String> listOfTargetResource = new ArrayList<String>();
		
		for(int i = 0 ; i < this.oRESTfulServiceCIM.getHasResources().size(); i++){
			if(this.oRESTfulServiceCIM.getHasResources().get(i).isIsAlgorithmic() == false){
				listOfTargetResource.add(this.oRESTfulServiceCIM.getHasResources().get(i).getName());
			}
		}
		
		java.util.Collections.sort(listOfTargetResource, Collator.getInstance());
		Iterator<String> targetResourceListIterator = listOfTargetResource.iterator();
		
		while(targetResourceListIterator.hasNext()){
			this.oTargetResourceList.add(targetResourceListIterator.next());
		}
	}

	private void addFetchDBSchemaButton() {
			this.oFetchDBSchemaButton.addListener(SWT.Selection, new Listener() {

				@Override
				public void handleEvent(Event event) {
					oDBSchemaLoader = new DBSchemaLoader(oMdeDBMigratorCIM.getStrDBType(), oMdeDBMigratorCIM.getStrDBURL(), oMdeDBMigratorCIM.getStrDBName(), oMdeDBMigratorCIM.getStrDBUsername(), oMdeDBMigratorCIM.getStrDBPassword());
					if(oDBSchemaLoader.connectToDB() == false){
						setErrorMessage("Failed to connect to database!");
					}
					else{
						oDBSchemaLoader.fetchDBSchema();
						populateSourceDatabaseRelations();
					}
					updateWidgetStatus();
					setPageComplete(isPageCompleted());
				}
			});
	}

	private void populateSourceDatabaseRelations(){
		this.oSourceDBRelationList.removeAll();
		ArrayList<String> listOfStrings = new ArrayList<String>();
		
		for(int  i = 0; i < this.oDBSchemaLoader.getSourceDatabase().getRelation().size(); i++){
			listOfStrings.add(this.oDBSchemaLoader.getSourceDatabase().getRelation().get(i).getName());
		}
		
		java.util.Collections.sort(listOfStrings, Collator.getInstance());
		Iterator<String> iterator = listOfStrings.iterator();
		
		while(iterator.hasNext()){
			this.oSourceDBRelationList.add(iterator.next());
		}
	}
	  
	  
	private void addSourceDBTypeListener() {
		  this.oSourceDBType.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				oMdeDBMigratorCIM.setStrDBType(oSourceDBType.getSelection()[0]);
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				oMdeDBMigratorCIM.setStrDBType(oSourceDBType.getSelection()[0]);
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}

	private void addDBNameListener() {
		  this.oDBName.addModifyListener(new ModifyListener(){
				
				public void modifyText(ModifyEvent event) {
					oMdeDBMigratorCIM.setStrDBName(oDBName.getText());
					updateWidgetStatus();
					setPageComplete(isPageCompleted());	
				}});
	}

	private void addSourceDBPasswordListener() {
		  this.oSourceDBPassword.addModifyListener(new ModifyListener(){
				
				public void modifyText(ModifyEvent event) {
					oMdeDBMigratorCIM.setStrDBPassword(oSourceDBPassword.getText());
					updateWidgetStatus();
					setPageComplete(isPageCompleted());	
				}});
	}

	private void addSourceDBUsernameListener() {
		  this.oSourceDBUsername.addModifyListener(new ModifyListener(){
				
				public void modifyText(ModifyEvent event) {
					oMdeDBMigratorCIM.setStrDBUsername(oSourceDBUsername.getText());
					updateWidgetStatus();
					setPageComplete(isPageCompleted());	
				}});
	}

	private void addSourceDBURLListener() {
		  this.oSourceDBURL.addModifyListener(new ModifyListener(){
				
				public void modifyText(ModifyEvent event) {
					oMdeDBMigratorCIM.setStrDBURL(oSourceDBURL.getText());
					updateWidgetStatus();
					setPageComplete(isPageCompleted());	
				}});
	}

	private int getCRUDResourceIndexByName(String strCRUDResourceName) {
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() == false){
				if(this.oRESTfulServiceCIM.getHasResources().get(n).getName().equalsIgnoreCase(strCRUDResourceName)){
					return n;
				}
			}
		}
		try {
			throw new ExecutionException(new Throwable());
		} catch (ExecutionException e) {
			Activator.log("Unable to find CRUD Resource index by name " + strCRUDResourceName, e);
			return -1;
		}
	}
	
	private int getCRUDResourcePropertyIndexByName(String strCRUDResourceName, String strPropertyName){
		Resource oResource = this.oRESTfulServiceCIM.getHasResources().get(this.getCRUDResourceIndexByName(strCRUDResourceName));
		
		for(int n = 0; n < oResource.getHasProperty().size(); n++){
			if(oResource.getHasProperty().get(n).getName().equalsIgnoreCase(strPropertyName)){
				return n;
			}
		}
		try {
			throw new ExecutionException(new Throwable());
		} catch (ExecutionException e) {
			Activator.log("Unable to find CRUD Resource Property index by name " + strPropertyName, e);
			return -1;
		}
	}

	private void updateWidgetStatus() {
		updateSourceDBConnectionWidgetStatus();
		updateRelationMappingWidgetStatus();
		updateCreatedRelationMappingWidgetStatus();
		updateColumnMappingWidgetStatus();
		updateCreatedColumnMappingWidgetStatus();
	}
	  
    private void updateCreatedColumnMappingWidgetStatus() {
	  	updateDeleteColumnMappingButtonStatus();
	}

	private void updateDeleteColumnMappingButtonStatus() {
		if(this.oColumnMappingList.getSelectionIndex() == -1){
			this.oDeleteColumnMappingButton.setEnabled(false);
		}
		else{
			this.oDeleteColumnMappingButton.setEnabled(true);
		}
	}

	private void updateColumnMappingWidgetStatus() {
			updateAddColumnMappingButtonStatus();
			
		}

	private void updateAddColumnMappingButtonStatus() {
		//if there are both source relation column and target resource property selected enable the add mapping button
		if(this.oSourceColumnList.getSelectionIndex() == -1
				|| this.oTargetPropertyList.getSelectionIndex() == -1){
			this.oAddColumnMappingButton.setEnabled(false);
		}
		//if the selected source relation column/target resource property mapping is already done, disable the add mapping button
		else if(selectedColumnMappingExists() == true){
			this.oAddColumnMappingButton.setEnabled(false);
		}
		else{
			this.oAddColumnMappingButton.setEnabled(true);
		}
	}

	private boolean selectedColumnMappingExists() {
		String strSelectedSourceRelation = this.oSourceDBRelationList.getSelection()[0];
		String strSelectedTargetResource = this.oTargetResourceList.getSelection()[0];
		String strSelectedSourceColumn = this.oSourceColumnList.getSelection()[0];
		String strSelectedTargetProperty = this.oTargetPropertyList.getSelection()[0];
		String strPossibleColumnPropertyMappingName = String.format("%s -> %s", strSelectedSourceColumn, strSelectedTargetProperty);
		
		for(int i = 0; i < this.oMdeDBMigratorCIM.getHasAnnotation().size(); i++){
			if(this.oMdeDBMigratorCIM.getHasAnnotation().get(i) instanceof TargetRelation){//find the selected Relation Mapping
				if(((TargetRelation)this.oMdeDBMigratorCIM.getHasAnnotation().get(i)).getRelationMappingName().equalsIgnoreCase(String.format("%s -> %s", strSelectedSourceRelation, strSelectedTargetResource))){
					if(columnPropertyMappingExists(strPossibleColumnPropertyMappingName, (TargetRelation)this.oMdeDBMigratorCIM.getHasAnnotation().get(i)) == true){
						return true;
					}
				}
			}
		}
		
		return false;
	}

	private boolean columnPropertyMappingExists(String strPossibleColumnPropertyMappingName, TargetRelation oTargetRelation) {
		for(int i = 0; i < oTargetRelation.getHasTargetColumn().size(); i++){
			if(strPossibleColumnPropertyMappingName.equalsIgnoreCase(String.format("%s -> %s", oTargetRelation.getHasTargetColumn().get(i).getIsMappedFromColumn().getName(), oTargetRelation.getHasTargetColumn().get(i).getIsAnnotatedProperty().getName()))){
					return true;
			}
		}
		
		return false;
	}

	private void updateCreatedRelationMappingWidgetStatus() {
			updateDeleteExistingRelationMappingButtonStatus();
		}

	private void updateDeleteExistingRelationMappingButtonStatus() {
		//if there is no relation mappting selected
		if(this.oRelationMappingList.getSelectionIndex() == -1){
			this.oDeleteRelationMappingButton.setEnabled(false); //disable the button
		}
		else{//otherwise enable it
			this.oDeleteRelationMappingButton.setEnabled(true);
		}
	}

	private void updateRelationMappingWidgetStatus() {
		  updateAddRelationMappingButtonStatus();
			
		}

	private void updateAddRelationMappingButtonStatus() {
		//if there are both source relation and target resource selected enable the add mapping button
		if(this.oSourceDBRelationList.getSelectionIndex() == -1
				|| this.oTargetResourceList.getSelectionIndex() == -1){
			this.oAddRelationMappingButton.setEnabled(false);
		}
		//if the selected source relation/target resource mapping is already done, disable the add mapping button
		else if(selectedRelationMappingExists() == true){
			this.oAddRelationMappingButton.setEnabled(false);
		}
		else{
			this.oAddRelationMappingButton.setEnabled(true);
		}	
	}

	private boolean selectedRelationMappingExists() {
		String strSelectedSourceRelation = this.oSourceDBRelationList.getSelection()[0];
		String strSelectedTargetResource = this.oTargetResourceList.getSelection()[0];
		
		for(int i = 0; i < this.oMdeDBMigratorCIM.getHasAnnotation().size(); i++){
			if(this.oMdeDBMigratorCIM.getHasAnnotation().get(i) instanceof TargetRelation){
				if(((TargetRelation)this.oMdeDBMigratorCIM.getHasAnnotation().get(i)).getRelationMappingName().equalsIgnoreCase(String.format("%s -> %s", strSelectedSourceRelation, strSelectedTargetResource))){
					return true;
				}
			}
		}
		
		return false;
	}

	private void updateSourceDBConnectionWidgetStatus() {
			//check if all prerequisites are met to activate the fetch DB schema button
			if(allPrerequisitesToFetchDBSchemaMet() == false){
				this.oFetchDBSchemaButton.setEnabled(false);
			}
			else{
				this.oFetchDBSchemaButton.setEnabled(true);
			}
		}

	private boolean allPrerequisitesToFetchDBSchemaMet() {
		
		//is DB URL provided?
		if(this.oSourceDBURL.getText().isEmpty()){
			return false;
		}
		
		//is DB type provided?
		if(this.oSourceDBType.getSelectionIndex() == -1){
			return false;
		}
		
		//is DB username provided?
		if(this.oSourceDBUsername.getText().isEmpty()){
			return false;
		}
		
		//is DB password provided?
		if(this.oSourceDBPassword.getText().isEmpty()){
			return false;
		}
		
		//is DB name provided?
		if(this.oDBName.getText().isEmpty()){
			return false;
		}
		
		return true;
	}

	private boolean isPageCompleted(){
		  if(this.isValidDBMigratorCIMModel()){
			  return true;
		  }
			
		  return false;
	}
	  
	private boolean isValidDBMigratorCIMModel(){
			
		//is there at least one relation mapping?
		if(minimumNumberOfRelationNumberExists() == false){
			return false;
		}
			
		//is there at least on column mapping per relation mapping?
		if(allRelationMappingsHaveColumnMapping() == false){
			return false;
		}
			
		//is the datatype mapping of the column mapping valid?
		if(allColumnMappingsHaveValidDataMapping() == false){
			return false;
		}
			
		//are the mappings schedulable?
		if(existsSchedulableMapping() == false){
			cleanUpMappingSchedulingAttributes();
			return false;
		}
		
		setErrorMessage(null);
		return true;
	}
	  
	private boolean existsSchedulableMapping() {
			
		//check if there exists a first schedulable mapping
		int iFirstRelationToLoadIndex = findSuitableFirstRelationToLoad();
		
		if(iFirstRelationToLoadIndex == -1){
			this.setErrorMessage("Cannot find a relation to be scheduled 1st. The current mappings are not schedulable. Check that no mapping to a resource exists without a mapping for its parent.");
			return false;
		}
		else{
			((TargetRelation)this.oMdeDBMigratorCIM.getHasAnnotation().get(iFirstRelationToLoadIndex)).setBIsScheduledToLoad(true);

			while(areAllRelationsScheduledToLoad() == false){
				int iNextRelationToLoadIndex = findSuitableNextRelationToLoad();
				if(iNextRelationToLoadIndex == -1){
					this.setErrorMessage("Cannot find a relation to be scheduled next. The current mappings are not schedulable. Check that no mapping to a resource exists without a mapping for its parent.");
					return false;
				}
				TargetRelation oTargetRelation = ((TargetRelation)this.oMdeDBMigratorCIM.getHasAnnotation().get(iNextRelationToLoadIndex));
				oTargetRelation.setBIsScheduledToLoad(true);
				if(requiresParentMapping(oTargetRelation) == true && targetRelationHasParentMapping(oTargetRelation) == false){
					this.setErrorMessage("The current mappings are not schedulable. Mapping " + oTargetRelation.getRelationMappingName() + " requires a parent mapping.");
					return false;
				}
			}
		}
			
		cleanUpMappingSchedulingAttributes();
		return true;
	}

	private void cleanUpMappingSchedulingAttributes() {
		for(int n = 0; n < this.oMdeDBMigratorCIM.getHasAnnotation().size(); n++){
			if(this.oMdeDBMigratorCIM.getHasAnnotation().get(n) instanceof TargetRelation){
				TargetRelation oTargetRelation = ((TargetRelation)this.oMdeDBMigratorCIM.getHasAnnotation().get(n));
				oTargetRelation.setBIsScheduledToLoad(false);
				oTargetRelation.setBHasParentMapping(false);
				removeParentMappings(oTargetRelation);
			}
		}
	}

	private void removeParentMappings(TargetRelation oTargetRelation) {
		for(int n = 0; n < oTargetRelation.getHasParentMapping().size(); n++){
			oTargetRelation.getHasParentMapping().remove(n);
		}
	}

	private boolean allColumnMappingsHaveValidDataMapping() {
		for(int i = 0; i < this.oMdeDBMigratorCIM.getHasAnnotation().size(); i++){
			if(this.oMdeDBMigratorCIM.getHasAnnotation().get(i) instanceof TargetRelation){
				for(int n = 0; n < ((TargetRelation)this.oMdeDBMigratorCIM.getHasAnnotation().get(i)).getHasTargetColumn().size(); n++){
					if(this.oDBSchemaLoader == null){
						System.out.println("SchemaLoader is not initialized!");
					}
					String strSourceColumnDataType = this.oDBSchemaLoader.fetchRelationColumnDatatype(((TargetRelation)this.oMdeDBMigratorCIM.getHasAnnotation().get(i)).getIsMappedFromRelation().getName(), ((TargetRelation)this.oMdeDBMigratorCIM.getHasAnnotation().get(i)).getHasTargetColumn().get(n).getIsMappedFromColumn().getName());
					if(strSourceColumnDataType == null){
						this.setErrorMessage("The data type of column " + 
						((TargetRelation)this.oMdeDBMigratorCIM.getHasAnnotation().get(i)).getHasTargetColumn().get(n).getIsMappedFromColumn().getName() + " of mapping " + 
						((TargetRelation)this.oMdeDBMigratorCIM.getHasAnnotation().get(i)).getRelationMappingName() + " is unrecognized.");
						return false;
					}
					
					if(doDataTypesMatch(strSourceColumnDataType, ((TargetRelation)this.oMdeDBMigratorCIM.getHasAnnotation().get(i)).getHasTargetColumn().get(n).getIsAnnotatedProperty().getType()) == false){
						this.setErrorMessage("The datatype between source relation columns and target resource properties must match. The data type of column " + 
								((TargetRelation)this.oMdeDBMigratorCIM.getHasAnnotation().get(i)).getHasTargetColumn().get(n).getIsMappedFromColumn().getName() + " of mapping " + 
								((TargetRelation)this.oMdeDBMigratorCIM.getHasAnnotation().get(i)).getRelationMappingName() + " does not match.");
						System.out.println("Incompatible Data types detected! Source column data type is " + strSourceColumnDataType + " while target property datatype is " + ((TargetRelation)this.oMdeDBMigratorCIM.getHasAnnotation().get(i)).getHasTargetColumn().get(n).getIsAnnotatedProperty().getType());
						return false;
					}
				}
			}
		}
		
		return true;
	}

	private boolean doDataTypesMatch(String strSourceColumnDataType, String strPropertyDataType) {
		if(strSourceColumnDataType.equalsIgnoreCase(strPropertyDataType)){//if the match 
			return true;
		} //otherwise check if they are different types of integers, or a type of integer is going to be a type of float/double
		else if((strSourceColumnDataType.equalsIgnoreCase("int") ||
				strSourceColumnDataType.equalsIgnoreCase("Long")) &&
				(strPropertyDataType.equalsIgnoreCase("int") ||
			    strPropertyDataType.equalsIgnoreCase("Long") ||
			    strPropertyDataType.equalsIgnoreCase("Double") ||
			    strPropertyDataType.equalsIgnoreCase("Float")
		)){
			return true;
		} //otherwise check if they are different types of doubles/floats
		else if((strSourceColumnDataType.equalsIgnoreCase("Double") ||
				strSourceColumnDataType.equalsIgnoreCase("Float")) &&
				(strPropertyDataType.equalsIgnoreCase("Double") ||
			    strPropertyDataType.equalsIgnoreCase("Float")
		)){
			return true;
		} //otherwise check if it is any type that is mapped to String
		else if(strPropertyDataType.equalsIgnoreCase("String")){
			return true;
		}
		
		return false;
	}

	private boolean allRelationMappingsHaveColumnMapping() {
		for(int i = 0; i < this.oMdeDBMigratorCIM.getHasAnnotation().size(); i++){
			if(this.oMdeDBMigratorCIM.getHasAnnotation().get(i) instanceof TargetRelation){
				if(((TargetRelation)this.oMdeDBMigratorCIM.getHasAnnotation().get(i)).getHasTargetColumn().isEmpty() || 
						((TargetRelation)this.oMdeDBMigratorCIM.getHasAnnotation().get(i)).getIsMappedFromRelation().getHasSourceColumn().isEmpty()){
					this.setErrorMessage("Each relation to resource mapping must have at least one column to property mapping as well. " + 
						"Mapping " + ((TargetRelation)this.oMdeDBMigratorCIM.getHasAnnotation().get(i)).getRelationMappingName() + 
						" does not have any.");
					return false;
				}
			}
		}
		
		return true;
	}

	private boolean minimumNumberOfRelationNumberExists() {
			
		for(int i = 0; i < this.oMdeDBMigratorCIM.getHasAnnotation().size(); i++){
			if(this.oMdeDBMigratorCIM.getHasAnnotation().get(i) instanceof TargetRelation){
				return true;
			}
		}
		
		this.setErrorMessage("There must be at least one source DB relation to target resource mapping!");
		return false;
	}

	public void createDBMigratorCIM(){
		//find a suitable first relation to load
		int iMigrationOrderIndex = 1;
		int iFirstRelationToLoadIndex = findSuitableFirstRelationToLoad();
		((TargetRelation)this.oMdeDBMigratorCIM.getHasAnnotation().get(iFirstRelationToLoadIndex)).setMigrationOrderIndex(iMigrationOrderIndex);
		((TargetRelation)this.oMdeDBMigratorCIM.getHasAnnotation().get(iFirstRelationToLoadIndex)).setBIsScheduledToLoad(true);
		((TargetRelation)this.oMdeDBMigratorCIM.getHasAnnotation().get(iFirstRelationToLoadIndex)).setBHasParentMapping(false);
		System.out.println("1st relation to schedule is " + ((TargetRelation)this.oMdeDBMigratorCIM.getHasAnnotation().get(iFirstRelationToLoadIndex)).getIsTargetRelationResource().getName());
		
		while(areAllRelationsScheduledToLoad() == false){
			int iNextRelationToLoadIndex = findSuitableNextRelationToLoad();
			iMigrationOrderIndex++;
			TargetRelation oTargetRelation = ((TargetRelation)this.oMdeDBMigratorCIM.getHasAnnotation().get(iNextRelationToLoadIndex));
			oTargetRelation.setMigrationOrderIndex(iMigrationOrderIndex);
			oTargetRelation.setBIsScheduledToLoad(true);
			if(targetRelationHasParentMapping(oTargetRelation) == true){
				oTargetRelation.setBHasParentMapping(true);
				createTargetRelationParentMapping(oTargetRelation);
			}
			else{
				System.out.println("Did not find any parent mappings for targetRelation " + oTargetRelation.getRelationMappingName());
				oTargetRelation.setBHasParentMapping(false);
			}
		}
		
		System.out.println("All relations are scheduled to load!");
	}

	private void createTargetRelationParentMapping(TargetRelation oTargetRelation) {
		System.out.println("CREATE PARENT MAPPING FOR " + oTargetRelation.getRelationMappingName());
		for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().size(); i++){
			Resource oResource = this.oRESTfulServiceCIM.getHasResources().get(i);
			System.out.println("Checking if " + oResource.getName() + " is parent of " + oTargetRelation.getIsTargetRelationResource().getName());
			if(isParentResourceOf(oResource.getName(), oTargetRelation.getIsTargetRelationResource().getName())){ //if this oResource has as related resource the target resource
				System.out.println("Resource" + oResource.getName() + " is parent of " + oTargetRelation.getIsTargetRelationResource().getName());
				//and there exists also relation mapping that has as target resource the oResource one
				for(int n = 0; n < this.oMdeDBMigratorCIM.getHasAnnotation().size(); n++){
					if(this.oMdeDBMigratorCIM.getHasAnnotation().get(n) instanceof TargetRelation){
						if(((TargetRelation) this.oMdeDBMigratorCIM.getHasAnnotation().get(n)).getIsTargetRelationResource().getName().equalsIgnoreCase(oResource.getName())){
							//and this relation mapping's source relation is also parent of the source relation of the oTargetRelation
							if(this.oDBSchemaLoader.isRelationParentOf(((TargetRelation) this.oMdeDBMigratorCIM.getHasAnnotation().get(n)).getIsMappedFromRelation().getName(), oTargetRelation.getIsMappedFromRelation().getName())){
								System.out.println("Creating parent mapping for " + oResource.getName() + " and " + oTargetRelation.getIsTargetRelationResource().getName());
								ParentMapping oParentMapping = this.oMdeMigratorCIMMetamodelFactory.createParentMapping();
								oTargetRelation.getHasParentMapping().add(oParentMapping);
								oParentMapping.setRequiresJoinTable(false);
								oParentMapping.setHasParentTargetRelation(((TargetRelation) this.oMdeDBMigratorCIM.getHasAnnotation().get(n)));
								oParentMapping.setSourceRelationFKMappingName(oTargetRelation.getIsMappedFromRelation().getName() + " -> " + ((TargetRelation) this.oMdeDBMigratorCIM.getHasAnnotation().get(n)).getIsMappedFromRelation().getName());
								ArrayList<Column> listOfForeignkeys = new ArrayList<Column>();
								listOfForeignkeys = this.oDBSchemaLoader.getForeignKeysOfTo(oTargetRelation.getIsMappedFromRelation().getName(), ((TargetRelation) this.oMdeDBMigratorCIM.getHasAnnotation().get(n)).getIsMappedFromRelation().getName());
								Iterator<Column> fkIterator = listOfForeignkeys.iterator();
								while(fkIterator.hasNext()){
									addFKColumnIfNeeded(oTargetRelation, oParentMapping,  fkIterator.next());
								}
							}
							else{
								System.out.println("Creating parent mapping for " + oResource.getName() + " and " + oTargetRelation.getIsTargetRelationResource().getName());
								ParentMapping oParentMapping = this.oMdeMigratorCIMMetamodelFactory.createParentMapping();
								oTargetRelation.getHasParentMapping().add(oParentMapping);
								oParentMapping.setRequiresJoinTable(true);
								oParentMapping.setJoinTableName(this.oDBSchemaLoader.getJoinTableNameOfTo(oTargetRelation.getIsMappedFromRelation().getName(), ((TargetRelation) this.oMdeDBMigratorCIM.getHasAnnotation().get(n)).getIsMappedFromRelation().getName()));
								oParentMapping.setHasParentTargetRelation(((TargetRelation) this.oMdeDBMigratorCIM.getHasAnnotation().get(n)));
								oParentMapping.setSourceRelationFKMappingName(oTargetRelation.getIsMappedFromRelation().getName() + " -> " + ((TargetRelation) this.oMdeDBMigratorCIM.getHasAnnotation().get(n)).getIsMappedFromRelation().getName());

								ArrayList<Column> listOfJoinFKToSourceRelation = new ArrayList<Column>();
								ArrayList<Column> listOfJoinFKToParentSourceRelation = new ArrayList<Column>();

								listOfJoinFKToSourceRelation = this.oDBSchemaLoader.getJoinFKToSourceRelation(oTargetRelation.getIsMappedFromRelation().getName(), ((TargetRelation) this.oMdeDBMigratorCIM.getHasAnnotation().get(n)).getIsMappedFromRelation().getName());
								listOfJoinFKToParentSourceRelation = this.oDBSchemaLoader.getJoinFKToParentSourceRelation(oTargetRelation.getIsMappedFromRelation().getName(), ((TargetRelation) this.oMdeDBMigratorCIM.getHasAnnotation().get(n)).getIsMappedFromRelation().getName());
								
								Iterator<Column> fkToSourceRelationIterator = listOfJoinFKToSourceRelation.iterator();
								while(fkToSourceRelationIterator.hasNext()){
									System.out.println("Adding FKToSourceRelations of parent mapping for " + oResource.getName() + " and " + oTargetRelation.getIsTargetRelationResource().getName());
									addJoinFKToSourceRelationColumn(oTargetRelation, oParentMapping,  fkToSourceRelationIterator.next());
								}
								
								Iterator<Column> fkToParentSourceRelationIterator = listOfJoinFKToParentSourceRelation.iterator();
								while(fkToParentSourceRelationIterator.hasNext()){
									System.out.println("Adding FKToParentSourceRelations of parent mapping for " + oResource.getName() + " and " + oTargetRelation.getIsTargetRelationResource().getName());
									addJoinFKToParentSourceRelationColumn(oTargetRelation, oParentMapping,  fkToParentSourceRelationIterator.next());
								}
							}
						}
					}
				}
			}
		}
	}

	private void addJoinFKToParentSourceRelationColumn(TargetRelation oTargetRelation, ParentMapping oParentMapping, Column oFKColumn) {
		
		//create a new source column
		JoinColumn oJoinColumn = this.oMdeMigratorCIMMetamodelFactory.createJoinColumn();
		oJoinColumn.setName(oFKColumn.getName());
		oJoinColumn.setType(oFKColumn.getType());
		for(int i = 0; i < oFKColumn.getIsForeignKeyToRelation().size(); i++){
			if(oFKColumn.getIsForeignKeyToRelation().get(i).getName().equalsIgnoreCase(oTargetRelation.getIsMappedFromRelation().getName())){
				oJoinColumn.setHasFKOrder(oFKColumn.getHasFKOrder().get(i));
			}
		}
			
		//then add the reference to the parent mapping
		oParentMapping.getHasJoinFKToSourceRelation().add(oJoinColumn);
	}

	private void addJoinFKToSourceRelationColumn(TargetRelation oTargetRelation, ParentMapping oParentMapping, Column oFKColumn) {
		
		//create a new source column
		JoinColumn oJoinColumn = this.oMdeMigratorCIMMetamodelFactory.createJoinColumn();
		oJoinColumn.setName(oFKColumn.getName());
		oJoinColumn.setType(oFKColumn.getType());
		for(int i = 0; i < oFKColumn.getIsForeignKeyToRelation().size(); i++){
			if(oFKColumn.getIsForeignKeyToRelation().get(i).getName().equalsIgnoreCase(oParentMapping.getHasParentTargetRelation().getIsMappedFromRelation().getName())){
				oJoinColumn.setHasFKOrder(oFKColumn.getHasFKOrder().get(i));
			}
		}
			
		//then add the reference to the parent mapping
		oParentMapping.getHasJoinFKToParentSourceRelation().add(oJoinColumn);
	}

	private void addFKColumnIfNeeded(TargetRelation oTargetRelation, ParentMapping oParentMapping, Column oFKColumn) {
		boolean bFKSourceColumnFound = false;
		for(int i = 0; i < oTargetRelation.getIsMappedFromRelation().getHasSourceColumn().size(); i++){
			if(oTargetRelation.getIsMappedFromRelation().getHasSourceColumn().get(i).getName().equalsIgnoreCase(oFKColumn.getName()) &&
					oTargetRelation.getIsMappedFromRelation().getHasSourceColumn().get(i).getType().equalsIgnoreCase(oFKColumn.getType())){
				//if the source column of the FK already exists, simply add a reference
				for(int j = 0; j < oFKColumn.getIsForeignKeyToRelation().size(); j++){
					if(oFKColumn.getIsForeignKeyToRelation().get(j).getName().equalsIgnoreCase(oParentMapping.getHasParentTargetRelation().getIsMappedFromRelation().getName())){
						oTargetRelation.getIsMappedFromRelation().getHasSourceColumn().get(i).setHasFKOrder(oFKColumn.getHasFKOrder().get(j));
					}
				}
				oParentMapping.getHasForeignKeyColumn().add(oTargetRelation.getIsMappedFromRelation().getHasSourceColumn().get(i));
				bFKSourceColumnFound = true;
			}
		}
		
		if(!bFKSourceColumnFound){
			//create a new source column
			SourceColumn oSourceColumn = this.oMdeMigratorCIMMetamodelFactory.createSourceColumn();
			oSourceColumn.setName(oFKColumn.getName());
			oSourceColumn.setType(oFKColumn.getType());
			for(int i = 0; i < oFKColumn.getIsForeignKeyToRelation().size(); i++){
				if(oFKColumn.getIsForeignKeyToRelation().get(i).getName().equalsIgnoreCase(oParentMapping.getHasParentTargetRelation().getIsMappedFromRelation().getName())){
					oSourceColumn.setHasFKOrder(oFKColumn.getHasFKOrder().get(i));
				}
			}
			
			//add it to the corresponding source relation
			oTargetRelation.getIsMappedFromRelation().getHasSourceColumn().add(oSourceColumn);
			
			//then add the reference to the parent mapping
			oParentMapping.getHasForeignKeyColumn().add(oSourceColumn);
		}
	}

	private boolean targetRelationHasParentMapping(TargetRelation oTargetRelation) {
		for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().size(); i++){
			Resource oResource = this.oRESTfulServiceCIM.getHasResources().get(i);
			if(isParentResourceOf(oResource.getName(), oTargetRelation.getIsTargetRelationResource().getName())){ //if this oResource has as related resource the target resource
				System.out.println("Resource " + oResource.getName() + " has as related resource the " + oTargetRelation.getIsTargetRelationResource().getName());
				//and there exists also relation mapping that has as target resource the oResource one
				for(int n = 0; n < this.oMdeDBMigratorCIM.getHasAnnotation().size(); n++){
					if(this.oMdeDBMigratorCIM.getHasAnnotation().get(n) instanceof TargetRelation){
						if(((TargetRelation) this.oMdeDBMigratorCIM.getHasAnnotation().get(n)).getIsTargetRelationResource().getName().equalsIgnoreCase(oResource.getName())){
							System.out.println("Mapping " + ((TargetRelation) this.oMdeDBMigratorCIM.getHasAnnotation().get(n)).getRelationMappingName() + " has as target resource the " + oResource.getName());
							//and this relation mapping's source relation is also parent of the source relation of the oTargetRelation directly (with FK not JOIN table)
							if(this.oDBSchemaLoader.isRelationParentOf(((TargetRelation) this.oMdeDBMigratorCIM.getHasAnnotation().get(n)).getIsMappedFromRelation().getName(), oTargetRelation.getIsMappedFromRelation().getName())){
								System.out.println("Source relation " + ((TargetRelation) this.oMdeDBMigratorCIM.getHasAnnotation().get(n)).getIsMappedFromRelation().getName() + " is truly parent of relation " + oTargetRelation.getIsMappedFromRelation().getName());
								return true;
							}
							//or this relation mapping's source relation is also parent of the source relation of the oTargetRelation through a JOIN table.
							if(this.oDBSchemaLoader.isRelationJoinParentOf(((TargetRelation) this.oMdeDBMigratorCIM.getHasAnnotation().get(n)).getIsMappedFromRelation().getName(), oTargetRelation.getIsMappedFromRelation().getName())){
								System.out.println("Source relation " + ((TargetRelation) this.oMdeDBMigratorCIM.getHasAnnotation().get(n)).getIsMappedFromRelation().getName() + " is parent of relation " + oTargetRelation.getIsMappedFromRelation().getName() + " through JOIN table");
								return true;
							}
						}
					}
				}
			}
		}
		
		return false;
	}
	
	private boolean requiresParentMapping(TargetRelation oTargetRelation){
		for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().size(); i++){
			if(isParentResourceOf(this.oRESTfulServiceCIM.getHasResources().get(i).getName(), oTargetRelation.getIsTargetRelationResource().getName()) == true){
				System.out.println("Mapping " + oTargetRelation.getRelationMappingName() + " requires parent mapping");
				return true;
			}
		}
		
		System.out.println("Mapping " + oTargetRelation.getRelationMappingName() + " does not require parent mapping");
		return false;
	}
	
	private boolean isParentResourceOf(String strPossibleParentName, String strPossibleChildName){
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).getName().equalsIgnoreCase(strPossibleParentName)){
				for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().get(n).getHasRelatedResource().size(); i++){
					if(this.oRESTfulServiceCIM.getHasResources().get(n).getHasRelatedResource().get(i).getName().equalsIgnoreCase(strPossibleChildName)){
						return true;
					}
				}
			}
		}
		
		return false;
	}

	private int findSuitableNextRelationToLoad() {
		
		for(int i = 0; i < this.oMdeDBMigratorCIM.getHasAnnotation().size(); i++){
			if(this.oMdeDBMigratorCIM.getHasAnnotation().get(i) instanceof TargetRelation){
				TargetRelation oTargetRelation = (TargetRelation) this.oMdeDBMigratorCIM.getHasAnnotation().get(i);
				
				//is this relation already scheduled?
				if(oTargetRelation.isBIsScheduledToLoad() == false){
					
					//is this resource also without parent to schedule?
					if(coreCIMResourceHasParent(oTargetRelation) == false){
						System.out.println("Scheduling relation " + oTargetRelation.getIsTargetRelationResource().getName() + " to load next.");
						return i;
					}//otherwise, are all of its parents scheduled already?
					else if(areAllParentsScheduledToLoad(oTargetRelation)){
						System.out.println("Scheduling relation " + oTargetRelation.getIsTargetRelationResource().getName() + " to load next.");
						return i;
					}
				}
			}
		}
		
		System.out.println("Could not find suitable relation to schedule!");
		return -1;
	}

	private boolean areAllParentsScheduledToLoad(TargetRelation oPossibleNextRelation) {
		for(int i = 0; i < this.oMdeDBMigratorCIM.getHasAnnotation().size(); i++){
			if(this.oMdeDBMigratorCIM.getHasAnnotation().get(i) instanceof TargetRelation){
				TargetRelation oTargetRelation = (TargetRelation) this.oMdeDBMigratorCIM.getHasAnnotation().get(i);
				//is this relation parent of the possible next one to load?
				if(isThisRelationParentOfPossibleNext(oTargetRelation, oPossibleNextRelation) == true){
					//is it already scheduled?
					if(oTargetRelation.isBIsScheduledToLoad() == false){
						return false;
					}
				}
			}
		}
		
		return true;
	}

	private boolean isThisRelationParentOfPossibleNext(TargetRelation oTargetRelation, TargetRelation oPossibleNextRelation) {
		for(int i = 0; i < oTargetRelation.getIsTargetRelationResource().getHasRelatedResource().size(); i++){
			if(isParentResourceOf(oTargetRelation.getIsTargetRelationResource().getName(), oPossibleNextRelation.getIsTargetRelationResource().getName())){
				//is it self relation?
				if(oTargetRelation.getIsTargetRelationResource().getName().equalsIgnoreCase(oPossibleNextRelation.getIsTargetRelationResource().getName())){
					System.out.println("Relation " + oTargetRelation.getIsTargetRelationResource().getName() + " is self relation of " + oPossibleNextRelation.getIsTargetRelationResource().getName() + " hence not a parent");
					return false;
				}
				else{
					System.out.println("Relation " + oTargetRelation.getIsTargetRelationResource().getName() + " is parent of " + oPossibleNextRelation.getIsTargetRelationResource().getName());
					return true;	
				}
			}
		}
		return false;
	}

	private boolean areAllRelationsScheduledToLoad() {
		for(int i = 0; i < this.oMdeDBMigratorCIM.getHasAnnotation().size(); i++){
			if(this.oMdeDBMigratorCIM.getHasAnnotation().get(i) instanceof TargetRelation){
				TargetRelation oTargetRelation = (TargetRelation) this.oMdeDBMigratorCIM.getHasAnnotation().get(i);
				if(oTargetRelation.isBIsScheduledToLoad() == false){
					System.out.println("Resource " + oTargetRelation.getIsTargetRelationResource().getName() + " is not yet scheduled to load.");
					return false;
				}
			}
		}
		
		return true;
	}

	private int findSuitableFirstRelationToLoad() {
		for(int i = 0; i < this.oMdeDBMigratorCIM.getHasAnnotation().size(); i++){
			if(this.oMdeDBMigratorCIM.getHasAnnotation().get(i) instanceof TargetRelation){
				TargetRelation oTargetRelation = (TargetRelation) this.oMdeDBMigratorCIM.getHasAnnotation().get(i);
				if(coreCIMResourceHasParent(oTargetRelation) == false){
					return i;
				}
			}
		}
		
		return -1;
	}

	private boolean coreCIMResourceHasParent(TargetRelation oTargetRelation) {
		for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().size(); i++){
			if(isParentResourceOf(this.oRESTfulServiceCIM.getHasResources().get(i).getName(), oTargetRelation.getIsTargetRelationResource().getName())){
				return true;
			}
		}
		
		return false;
	}
}
