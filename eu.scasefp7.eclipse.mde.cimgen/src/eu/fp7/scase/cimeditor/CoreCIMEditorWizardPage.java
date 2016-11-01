package eu.fp7.scase.cimeditor;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;

import eu.fp7.scase.cimeditor.SimpleDialogBox;
import eu.fp7.scase.launcher.cimgenerator.Activator;
import ServiceCIM.CRUDActivity;
import ServiceCIM.CRUDVerb;
import ServiceCIM.InputRepresentation;
import ServiceCIM.MediaType;
import ServiceCIM.OutputRepresentation;
import ServiceCIM.Property;
import ServiceCIM.ServiceCIMFactory;
import ServiceCIM.RESTfulServiceCIM;
import ServiceCIM.Resource;


public class CoreCIMEditorWizardPage extends WizardPage{
	
	private RESTfulServiceCIM oRESTfulServiceCIM;
	private ServiceCIMFactory oRestServiceCIMFactory;
	private Composite oWizardPageGrid;
	private boolean bExecuteFromScratchYaml;
	private int intMinRequiredAlgoResources;
	
	//resource list SWTs
	private Label oResourceListLabel;
	private List oResourceList;
	private Button oCreateResourceButton;
	private Button oDeleteResourceButton;
	private Button oResourceIsAlgorithmicButton;
	private Composite oResourceGrid;
	
	//CRUD Activities SWTs
	private Label oCRUDActivitiesLabel;
	private Button oCreateButton;
	private Button oReadButton;
	private Button oUpdateButton;
	private Button oDeleteButton;
	private Composite oCRUDGrid;
	
	//Representation SWTs
	private Button oInputJSONButton;
	private Button oOutputJSONButton;
	private Button oInputXMLButton;
	private Button oOutputXMLButton;
	private Group oInputRepresentationGroup;
	private Group oOutputRepresentationGroup;
	private Composite oRepresentationsGrid;
	
	//properties SWTs
	private Label oPropertiesLabel;
	private List oPropertiesList;
	private Button oCreatePropertyButton;
	private Button oDeletePropertyButton;
	private Composite oPropertyGrid;
	
	//property configuration SWTs
	private Button oUniquePropertyButton;
	private Button oNamingPropertyButton;
	private Label oTypeLabel;
	private List oTypeList;
	private Group oPropertyConfigurationGroup;
	
	//relations SWTs
	private Label oRelationsLabel;
	private List oRelationsList;
	private Button oCreateRelationButton;
	private Button oDeleteRelationButton;
	private Composite oRelationsGrid;
	private Label oUnrelatedResourcesLabel;
	private List oUnrelatedResourcesList;
	private Composite oAddRemoveRelationButtonComposite;
	private Button btnRenameResource;
	private Button btnRenameProperty;
	
	private final static String arrayOfJavaKeywords[] = { "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const", "continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float", "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while", "false", "null", "true"};
	
	public CoreCIMEditorWizardPage(RESTfulServiceCIM oRESTfulServiceCIM, int intMinRequiredAlgoResources, boolean bExecuteFromScratchYaml){
		super(oRESTfulServiceCIM.getName() + " CIM Editor");
		this.oRESTfulServiceCIM = oRESTfulServiceCIM;
		this.oRestServiceCIMFactory = ServiceCIMFactory.eINSTANCE;
		this.bExecuteFromScratchYaml = bExecuteFromScratchYaml;
		this.intMinRequiredAlgoResources = intMinRequiredAlgoResources;
	}

	@Override
	public void createControl(Composite parent) {
		this.oWizardPageGrid = new Composite(parent, SWT.NONE);
		this.oWizardPageGrid.setLayout(new GridLayout(3, false));
		
		initializeWizardSWTs();
		updateWidgetStatus();
		this.setControl(this.oWizardPageGrid);
		this.setPageComplete(isPageCompleted());
		
	}
	
	private void initializeWizardSWTs(){
		initializeResourceGrid();
		initializeCRUDActivitiesGrid();
		initializeRepresentationsGrid();
		initializePropertiesGrid();
		initializePropertiesConfigurationGrid();
		initializeRelationsGrid();
	}
	
	private void initializeRelationsGrid() {
		this.oRelationsGrid = new Composite(this.oWizardPageGrid, SWT.None);
		this.oRelationsGrid.setLayout(new GridLayout(3, false));
		GridData gd_oRelationsGrid = new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1);
		gd_oRelationsGrid.heightHint = 120;
		this.oRelationsGrid.setLayoutData(gd_oRelationsGrid);
		
		this.oUnrelatedResourcesLabel = new Label(this.oRelationsGrid, SWT.NULL);
		this.oUnrelatedResourcesLabel.setText("Selected resource's unrelated resources: ");
		new Label(oRelationsGrid, SWT.NONE);
		
		this.oRelationsLabel = new Label(this.oRelationsGrid, SWT.NULL);
		this.oRelationsLabel.setText("Selected resource's related resources: ");
		
		this.oUnrelatedResourcesList = new List(this.oRelationsGrid, SWT.SINGLE | SWT.BORDER_SOLID | SWT.V_SCROLL);
		GridData gd_oUnrelatedResourcesList = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_oUnrelatedResourcesList.heightHint = 80;
		this.oUnrelatedResourcesList.setLayoutData(gd_oUnrelatedResourcesList);
		addUnrelatedResourceListListener();
		
		this.oAddRemoveRelationButtonComposite = new Composite(this.oRelationsGrid, SWT.None);
		this.oAddRemoveRelationButtonComposite.setLayout(new GridLayout(1, false));
		GridData gd_oAddRemoveRelationButtonComposite = new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1);
		gd_oAddRemoveRelationButtonComposite.heightHint = 100;
		this.oAddRemoveRelationButtonComposite.setLayoutData(gd_oAddRemoveRelationButtonComposite);
		
		this.oCreateRelationButton = new Button(this.oAddRemoveRelationButtonComposite, SWT.None);
		this.oCreateRelationButton.setText("Add relation");
		GridData gd_oCreateRelationButton = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_oCreateRelationButton.heightHint = 20;
		this.oCreateRelationButton.setLayoutData(gd_oCreateRelationButton);
		addCreateRelationButtonListener();

		this.oDeleteRelationButton = new Button(this.oAddRemoveRelationButtonComposite, SWT.None);
		this.oDeleteRelationButton.setText("Delete relation");
		GridData gd_oDeleteRelationButton = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_oDeleteRelationButton.heightHint = 20;
		this.oDeleteRelationButton.setLayoutData(gd_oDeleteRelationButton);
		addDeleteRelationButtonListener();

		this.oRelationsList = new List(this.oRelationsGrid, SWT.SINGLE | SWT.BORDER_SOLID | SWT.V_SCROLL);
		GridData gd_oRelationsList = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_oRelationsList.heightHint = 80;
		this.oRelationsList.setLayoutData(gd_oRelationsList);
		addRelationsListListener();
	}

	private void initializePropertiesConfigurationGrid() {
		this.oPropertyConfigurationGroup = new Group(this.oWizardPageGrid, SWT.NONE);
		this.oPropertyConfigurationGroup.setLayout(new GridLayout(2, false));
		GridData gd_oPropertyConfigurationGroup = new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1);
		gd_oPropertyConfigurationGroup.heightHint = 120;
		this.oPropertyConfigurationGroup.setLayoutData(gd_oPropertyConfigurationGroup);
		this.oPropertyConfigurationGroup.setText("Property Configuration: ");
		
		this.oUniquePropertyButton = new Button(this.oPropertyConfigurationGroup, SWT.CHECK);
		GridData gd_oUniquePropertyButton = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_oUniquePropertyButton.heightHint = 20;
		oUniquePropertyButton.setLayoutData(gd_oUniquePropertyButton);
		this.oUniquePropertyButton.setText("Collection");
		addUniquePropertyButtonListener();
		
		this.oTypeLabel = new Label(this.oPropertyConfigurationGroup, SWT.NULL);
		this.oTypeLabel.setText("Type: ");
		
		this.oNamingPropertyButton = new Button(this.oPropertyConfigurationGroup, SWT.CHECK);
		this.oNamingPropertyButton.setText("naming property");
		GridData gd_oNamingPropertyButton = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_oNamingPropertyButton.heightHint = 20;
		this.oNamingPropertyButton.setLayoutData(gd_oNamingPropertyButton);
		addNamingPropertyButtonListener();
		
		this.oTypeList = new List(this.oPropertyConfigurationGroup, SWT.SINGLE | SWT.BORDER_SOLID | SWT.V_SCROLL);
		oTypeList.setItems(new String[] {"String", "Integer", "Double", "Float", "Long", "Boolean", "Date"});
		GridData gd_oTypeList = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_oTypeList.heightHint = 60;
		this.oTypeList.setLayoutData(gd_oTypeList);
		addTypeListListener();
	}

	private void initializePropertiesGrid() {
		this.oPropertyGrid = new Composite(this.oWizardPageGrid, SWT.None);
		this.oPropertyGrid.setLayout(new GridLayout(3, false));
		GridData gd_oPropertyGrid = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_oPropertyGrid.heightHint = 120;
		this.oPropertyGrid.setLayoutData(gd_oPropertyGrid);
		
		this.oPropertiesLabel = new Label(this.oPropertyGrid, SWT.NULL);
		this.oPropertiesLabel.setText("Selected resource properties: ");
		new Label(oPropertyGrid, SWT.NONE);
		new Label(oPropertyGrid, SWT.NONE);
		
		this.oPropertiesList = new List(this.oPropertyGrid, SWT.SINGLE | SWT.BORDER_SOLID | SWT.V_SCROLL);
		GridData gd_oPropertiesList = new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1);
		gd_oPropertiesList.heightHint = 80;
		this.oPropertiesList.setLayoutData(gd_oPropertiesList);
		addPropertyListListener();
		
		this.oCreatePropertyButton = new Button(this.oPropertyGrid, SWT.NONE);
		this.oCreatePropertyButton.setText("Create");
		GridData gd_oCreatePropertyButton = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_oCreatePropertyButton.heightHint = 20;
		this.oCreatePropertyButton.setLayoutData(gd_oCreatePropertyButton);
		addCreatePropertyButtonListener();
		
		btnRenameProperty = new Button(oPropertyGrid, SWT.NONE);
		GridData gd_btnRenameProperty = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_btnRenameProperty.heightHint = 20;
		btnRenameProperty.setLayoutData(gd_btnRenameProperty);
		btnRenameProperty.setText("Rename");
		addRenamePropertyButtonListener();
		
		this.oDeletePropertyButton = new Button(this.oPropertyGrid, SWT.None);
		this.oDeletePropertyButton.setText("Delete");
		GridData gd_oDeletePropertyButton = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_oDeletePropertyButton.heightHint = 20;
		this.oDeletePropertyButton.setLayoutData(gd_oDeletePropertyButton);
		addDeletePropertyButtonListener();
	}

	private void initializeRepresentationsGrid() {
		this.oRepresentationsGrid = new Composite(this.oWizardPageGrid, SWT.NONE);
		this.oRepresentationsGrid.setLayout(new GridLayout(1, false));
		GridData gd_oRepresentationsGrid = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_oRepresentationsGrid.heightHint = 140;
		this.oRepresentationsGrid.setLayoutData(gd_oRepresentationsGrid);
		
		this.oInputRepresentationGroup = new Group(this.oRepresentationsGrid, SWT.None);
		this.oInputRepresentationGroup.setLayout(new GridLayout(1, false));
		this.oInputRepresentationGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		this.oInputRepresentationGroup.setText("Input media format: ");
		
		this.oInputJSONButton = new Button(this.oInputRepresentationGroup, SWT.RADIO);
		GridData gd_oInputJSONButton = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_oInputJSONButton.heightHint = 20;
		oInputJSONButton.setLayoutData(gd_oInputJSONButton);
		this.oInputJSONButton.setText("Application/JSON");
		this.oInputJSONButton.setEnabled(false);
		addInputJSONButtonListener();
		
		this.oInputXMLButton = new Button(this.oInputRepresentationGroup, SWT.RADIO);
		GridData gd_oInputXMLButton = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_oInputXMLButton.heightHint = 20;
		oInputXMLButton.setLayoutData(gd_oInputXMLButton);
		this.oInputXMLButton.setText("Application/XML");
		this.oInputXMLButton.setEnabled(false);
		addInputXMLButtonListener();
				
		this.oOutputRepresentationGroup = new Group(this.oRepresentationsGrid, SWT.NONE);
		this.oOutputRepresentationGroup.setLayout(new GridLayout(1, false));
		this.oOutputRepresentationGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		this.oOutputRepresentationGroup.setText("Output media format: ");
		
		this.oOutputJSONButton = new Button(this.oOutputRepresentationGroup, SWT.RADIO);
		GridData gd_oOutputJSONButton = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_oOutputJSONButton.heightHint = 20;
		oOutputJSONButton.setLayoutData(gd_oOutputJSONButton);
		this.oOutputJSONButton.setText("Application/JSON");
		this.oOutputJSONButton.setEnabled(false);
		addOutputJSONButtonListener();
	
		this.oOutputXMLButton = new Button(this.oOutputRepresentationGroup, SWT.RADIO);
		GridData gd_oOutputXMLButton = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_oOutputXMLButton.heightHint = 20;
		oOutputXMLButton.setLayoutData(gd_oOutputXMLButton);
		this.oOutputXMLButton.setText("Application/XML");
		this.oOutputXMLButton.setEnabled(false);	
		addOutputXMLButtonListener();
	}

	private void initializeCRUDActivitiesGrid() {
		this.oCRUDGrid = new Composite(this.oWizardPageGrid, SWT.NONE);
		this.oCRUDGrid.setLayout(new GridLayout(1, false));
		GridData gd_oCRUDGrid = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_oCRUDGrid.heightHint = 140;
		this.oCRUDGrid.setLayoutData(gd_oCRUDGrid);
		
		this.oCRUDActivitiesLabel = new Label(this.oCRUDGrid, SWT.NULL);
		this.oCRUDActivitiesLabel.setText("CRUD Activities: ");
		this.oCRUDActivitiesLabel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		this.oCreateButton = new Button(this.oCRUDGrid, SWT.CHECK);
		this.oCreateButton.setText("CREATE: ");
		GridData gd_oCreateButton = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_oCreateButton.heightHint = 20;
		this.oCreateButton.setLayoutData(gd_oCreateButton);
		addCreateButtonListener();
		
		this.oReadButton = new Button(this.oCRUDGrid, SWT.CHECK);
		this.oReadButton.setText("READ: ");
		GridData gd_oReadButton = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_oReadButton.heightHint = 20;
		this.oReadButton.setLayoutData(gd_oReadButton);
		addReadButtonListener();

		this.oUpdateButton = new Button(this.oCRUDGrid, SWT.CHECK);
		this.oUpdateButton.setText("UPDATE: ");
		GridData gd_oUpdateButton = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_oUpdateButton.heightHint = 20;
		this.oUpdateButton.setLayoutData(gd_oUpdateButton);
		addUpdateButtonListener();

		this.oDeleteButton = new Button(this.oCRUDGrid, SWT.CHECK);
		this.oDeleteButton.setText("DELETE: ");
		GridData gd_oDeleteButton = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_oDeleteButton.heightHint = 20;
		this.oDeleteButton.setLayoutData(gd_oDeleteButton);
		addDeleteButtonListener();
	}

	private void initializeResourceGrid() {
		this.oResourceGrid = new Composite(this.oWizardPageGrid, SWT.NONE);
		this.oResourceGrid.setLayout(new GridLayout(3, true));
		GridData gd_oResourceGrid = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_oResourceGrid.heightHint = 200;
		this.oResourceGrid.setLayoutData(gd_oResourceGrid);
		
		this.oResourceListLabel = new Label(this.oResourceGrid, SWT.NULL);
		this.oResourceListLabel.setText(this.oRESTfulServiceCIM.getName() + " resources:");
		GridData gd_oResourceListLabel = new GridData(SWT.FILL, SWT.FILL, false, false, 3, 1);
		gd_oResourceListLabel.heightHint = 15;
		this.oResourceListLabel.setLayoutData(gd_oResourceListLabel);
		
		this.oResourceList = new List(this.oResourceGrid, SWT.SINGLE | SWT.BORDER_SOLID | SWT.V_SCROLL);
		GridData gd_oResourceList = new GridData(SWT.FILL, SWT.FILL, true, true, 3, 1);
		gd_oResourceList.heightHint = 120;
		this.oResourceList.setLayoutData(gd_oResourceList);
		populateResourceList();
		addResourceListListener();
		
		this.oResourceIsAlgorithmicButton = new Button(this.oResourceGrid, SWT.CHECK);
		this.oResourceIsAlgorithmicButton.setText("Algorithmic");
		GridData gd_oResourceIsAlgorithmicButton = new GridData(SWT.FILL, SWT.FILL, true, false, 3, 1);
		gd_oResourceIsAlgorithmicButton.heightHint = 20;
		this.oResourceIsAlgorithmicButton.setLayoutData(gd_oResourceIsAlgorithmicButton);
		addIsAlgorithmicButtonListener();
		
		this.oCreateResourceButton = new Button(this.oResourceGrid, SWT.NONE);
		this.oCreateResourceButton.setText("Create");
		GridData gd_oCreateResourceButton = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_oCreateResourceButton.heightHint = 20;
		gd_oCreateResourceButton.widthHint = 92;
		this.oCreateResourceButton.setLayoutData(gd_oCreateResourceButton);
		addCreateResourceButtonListener();
		
		btnRenameResource = new Button(oResourceGrid, SWT.NONE);
		GridData gd_btnRenameResource = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_btnRenameResource.heightHint = 20;
		gd_btnRenameResource.widthHint = 92;
		btnRenameResource.setLayoutData(gd_btnRenameResource);
		btnRenameResource.setText("Rename");
		addRenameResourceButtonListener();
		
		this.oDeleteResourceButton = new Button(this.oResourceGrid, SWT.NONE);
		this.oDeleteResourceButton.setText("Delete");
		GridData gd_oDeleteResourceButton = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_oDeleteResourceButton.heightHint = 20;
		gd_oDeleteResourceButton.widthHint = 92;
		this.oDeleteResourceButton.setLayoutData(gd_oDeleteResourceButton);
		addDeleteResourceButtonListener();
	}
	
	private void addRenameResourceButtonListener() {
		this.btnRenameResource.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				//rename an existing Resource
				Shell oShell = new Shell(SWT.ON_TOP | SWT.SYSTEM_MODAL | SWT.NO_TRIM | SWT.RESIZE);
				oShell.setSize(0,0);
				SimpleDialogBox oSimpleDialogBox = new SimpleDialogBox(oShell, "Resource", oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0])).getName());
				if(oSimpleDialogBox.open() == Window.OK){
					oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0])).setName(oSimpleDialogBox.getArtefactName());
					oResourceList.remove(oResourceList.getSelectionIndex());
					oResourceList.add(oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oSimpleDialogBox.getArtefactName())).getName());
					//re-populate the list to sort it.
					populateResourceList();
					oResourceList.setSelection(oResourceList.indexOf(oSimpleDialogBox.getArtefactName()));
				}
				oSimpleDialogBox.close();
				oShell.close();
				
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}});
	}
	
	private void addRenamePropertyButtonListener() {
		this.btnRenameProperty.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				//rename an existing Resource
				Shell oShell = new Shell(SWT.ON_TOP | SWT.SYSTEM_MODAL | SWT.NO_TRIM | SWT.RESIZE);
				oShell.setSize(0,0);
				Resource oResource = oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0]));
				SimpleDialogBox oSimpleDialogBox = new SimpleDialogBox(oShell, "Property's name", oResource.getHasProperty().get(getPropertyIndexByName(oResource, oPropertiesList.getSelection()[0])).getName());
				if(oSimpleDialogBox.open() == Window.OK){
					oResource.getHasProperty().get(getPropertyIndexByName(oResource, oPropertiesList.getSelection()[0])).setName(oSimpleDialogBox.getArtefactName());;
					oPropertiesList.remove(oPropertiesList.getSelectionIndex());
					oPropertiesList.add(oSimpleDialogBox.getArtefactName());
					//re-populate it
					populatePropertiesList();
					oPropertiesList.setSelection(oPropertiesList.indexOf(oSimpleDialogBox.getArtefactName()));
				}
				oSimpleDialogBox.close();
				oShell.close();
				
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}});
	}
	
	private int getPropertyIndexByName(Resource oResource, String strPropertyName){
		for(int n = 0; n < oResource.getHasProperty().size(); n++){
			if(oResource.getHasProperty().get(n).getName().equalsIgnoreCase(strPropertyName)){
				return n;
			}
		}
		try {
			throw new ExecutionException(new Throwable());
		} catch (ExecutionException e) {
			Activator.log("Unable to find property index by name " + strPropertyName, e);
			return -1;
		}
	}

	private void addUnrelatedResourceListListener() {
		this.oUnrelatedResourcesList.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}
		});
	}
	
	private void addCreatePropertyButtonListener(){
		this.oCreatePropertyButton.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				Shell oShell = new Shell(SWT.ON_TOP | SWT.SYSTEM_MODAL | SWT.NO_TRIM | SWT.RESIZE);
				oShell.setSize(0,0);
				SimpleDialogBox oSimpleDialogBox = new SimpleDialogBox(oShell, "property", "propertyName");
				if(oSimpleDialogBox.open() == Window.OK){
					Property oNewProperty = oRestServiceCIMFactory.createProperty();
					oNewProperty.setName(oSimpleDialogBox.getArtefactName());
					oNewProperty.setIsUnique(true);
					oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0])).getHasProperty().add(oNewProperty);
					oPropertiesList.add(oNewProperty.getName());
					//re-populate the list
					populatePropertiesList();
				}
				oSimpleDialogBox.close();
				oShell.close();
				
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}
		});
	}
	
	private void addDeletePropertyButtonListener(){
		this.oDeletePropertyButton.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				Resource oResource = oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0]));
				oResource.getHasProperty().remove(getPropertyByName(oResource, oPropertiesList.getSelection()[0]));
				oPropertiesList.remove(oPropertiesList.getSelectionIndex());
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}
		});
	}
	
	private void addCreateRelationButtonListener(){
		this.oCreateRelationButton.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				//add the new relation
				Resource oResource = oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0]));
				Resource oRelatedResource = oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oUnrelatedResourcesList.getSelection()[0]));
				oResource.getHasRelatedResource().add(oRelatedResource);
				oRelatedResource.getIsRelatedResource().add(oResource);
				oRelationsList.add(oRelatedResource.getName());
				//re-populate the list
				populateResourceRelations();
				
				//delete the resource from the unrelated resources list
				oUnrelatedResourcesList.remove(oUnrelatedResourcesList.indexOf(oUnrelatedResourcesList.getSelection()[0]));
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}
		});
	}
	
	private void addDeleteRelationButtonListener(){
		this.oDeleteRelationButton.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
			//delete the resource from the related resources list
			Resource oResource = oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0]));
			Resource oRelatedResource = oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oRelationsList.getSelection()[0]));
			oResource.getHasRelatedResource().remove(getRelatedResourceIndex(oResource, oRelatedResource, true));
			oRelatedResource.getIsRelatedResource().remove(getRelatedResourceIndex(oResource, oRelatedResource, false));
			oRelationsList.remove(oRelationsList.getSelection()[0]);
			
			//add the resource to the unrelated resources list
			oUnrelatedResourcesList.add(oRelatedResource.getName());
			setPageComplete(isPageCompleted());
			updateWidgetStatus();
			}
		});
	}
	
	private void addCreateResourceButtonListener() {
		this.oCreateResourceButton.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				Shell oShell = new Shell(SWT.ON_TOP | SWT.SYSTEM_MODAL | SWT.NO_TRIM | SWT.RESIZE);
				oShell.setSize(0,0);
				SimpleDialogBox oSimpleDialogBox = new SimpleDialogBox(oShell, "resource", "resourceName");
				if(oSimpleDialogBox.open() == Window.OK){ //if user did not press cancel
					Resource oNewResource = oRestServiceCIMFactory.createResource();
					oNewResource.setName(oSimpleDialogBox.getArtefactName());
					oRESTfulServiceCIM.getHasResources().add(oNewResource);
					oResourceList.add(oNewResource.getName());
					//re-populate it
					populateResourceList();
				}
				oSimpleDialogBox.close();
				oShell.close();
				
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}
		});
	}

	private void addDeleteResourceButtonListener() {
		this.oDeleteResourceButton.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				deleteResourceRelationTo(getResourceIndexByName(oResourceList.getSelection()[0]));
				oRESTfulServiceCIM.getHasResources().remove(getResourceIndexByName(oResourceList.getSelection()[0]));
				oResourceList.remove(oResourceList.indexOf(oResourceList.getSelection()[0]));
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}
		});
	}

	private void addInputJSONButtonListener(){
		this.oInputJSONButton.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				Resource oResource = oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0]));
				//create the JSON representation if it does not already exist
				if(resourceHasRepresentation(oResource, MediaType.JSON, true) == false){
					InputRepresentation oInputRepresentation = oRestServiceCIMFactory.createInputRepresentation();
					oInputRepresentation.setInputMediaType(MediaType.JSON);
					oResource.getHasInputRepresentation().add(oInputRepresentation);
				}
				
				//delete the XML representation if it exists;
				if(resourceHasRepresentation(oResource, MediaType.XML, true) == true){
					oResource.getHasInputRepresentation().remove(getResourceRepresentationIndex(oResource, MediaType.XML, true));
				}
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				Resource oResource = oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0]));
				//create the JSON representation if it does not already exist
				if(resourceHasRepresentation(oResource, MediaType.JSON, true) == false){
					InputRepresentation oInputRepresentation = oRestServiceCIMFactory.createInputRepresentation();
					oInputRepresentation.setInputMediaType(MediaType.JSON);
					oResource.getHasInputRepresentation().add(oInputRepresentation);
				}
				
				//delete the XML representation if it exists;
				if(resourceHasRepresentation(oResource, MediaType.XML, true) == true){
					oResource.getHasInputRepresentation().remove(getResourceRepresentationIndex(oResource, MediaType.XML, true));
				}
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}
		});
	}
	
	private void addInputXMLButtonListener(){
		this.oInputXMLButton.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				Resource oResource = oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0]));
				//create the XML representation if it does not already exist
				if(resourceHasRepresentation(oResource, MediaType.XML, true) == false){
					InputRepresentation oInputRepresentation = oRestServiceCIMFactory.createInputRepresentation();
					oInputRepresentation.setInputMediaType(MediaType.XML);
					oResource.getHasInputRepresentation().add(oInputRepresentation);
				}
				
				//delete the JSON representation if it exists;
				if(resourceHasRepresentation(oResource, MediaType.JSON, true) == true){
					oResource.getHasInputRepresentation().remove(getResourceRepresentationIndex(oResource, MediaType.JSON, true));
				}
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				Resource oResource = oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0]));
				//create the XML representation if it does not already exist
				if(resourceHasRepresentation(oResource, MediaType.XML, true) == false){
					InputRepresentation oInputRepresentation = oRestServiceCIMFactory.createInputRepresentation();
					oInputRepresentation.setInputMediaType(MediaType.XML);
					oResource.getHasInputRepresentation().add(oInputRepresentation);
				}
				
				//delete the JSON representation if it exists;
				if(resourceHasRepresentation(oResource, MediaType.JSON, true) == true){
					oResource.getHasInputRepresentation().remove(getResourceRepresentationIndex(oResource, MediaType.JSON, true));
				}
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}
		});
	}
	
	private void addOutputJSONButtonListener(){
		this.oOutputJSONButton.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				Resource oResource = oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0]));
				//create the JSON representation if it does not already exist
				if(resourceHasRepresentation(oResource, MediaType.JSON, false) == false){
					OutputRepresentation oOutputRepresentation = oRestServiceCIMFactory.createOutputRepresentation();
					oOutputRepresentation.setOutputMediaType(MediaType.JSON);
					oResource.getHasOutputRepresentation().add(oOutputRepresentation);
				}
				
				//delete the XML representation if it exists;
				if(resourceHasRepresentation(oResource, MediaType.XML, false) == true){
					oResource.getHasOutputRepresentation().remove(getResourceRepresentationIndex(oResource, MediaType.XML, false));
				}
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				Resource oResource = oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0]));
				//create the JSON representation if it does not already exist
				if(resourceHasRepresentation(oResource, MediaType.JSON, false) == false){
					OutputRepresentation oOutputRepresentation = oRestServiceCIMFactory.createOutputRepresentation();
					oOutputRepresentation.setOutputMediaType(MediaType.JSON);
					oResource.getHasOutputRepresentation().add(oOutputRepresentation);
				}
				
				//delete the XML representation if it exists;
				if(resourceHasRepresentation(oResource, MediaType.XML, false) == true){
					oResource.getHasOutputRepresentation().remove(getResourceRepresentationIndex(oResource, MediaType.XML, false));
				}
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}
		});
	}
	
	private void addOutputXMLButtonListener(){
		this.oOutputXMLButton.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				Resource oResource = oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0]));
				//create the XML representation if it does not already exist
				if(resourceHasRepresentation(oResource, MediaType.XML, false) == false){
					OutputRepresentation oOutputRepresentation = oRestServiceCIMFactory.createOutputRepresentation();
					oOutputRepresentation.setOutputMediaType(MediaType.XML);
					oResource.getHasOutputRepresentation().add(oOutputRepresentation);
				}
				
				//delete the JSON representation if it exists;
				if(resourceHasRepresentation(oResource, MediaType.JSON, false) == true){
					oResource.getHasOutputRepresentation().remove(getResourceRepresentationIndex(oResource, MediaType.JSON, false));
				}
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				Resource oResource = oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0]));
				//create the XML representation if it does not already exist
				if(resourceHasRepresentation(oResource, MediaType.XML, false) == false){
					OutputRepresentation oOutputRepresentation = oRestServiceCIMFactory.createOutputRepresentation();
					oOutputRepresentation.setOutputMediaType(MediaType.XML);
					oResource.getHasOutputRepresentation().add(oOutputRepresentation);
				}
				
				//delete the JSON representation if it exists;
				if(resourceHasRepresentation(oResource, MediaType.JSON, false) == true){
					oResource.getHasOutputRepresentation().remove(getResourceRepresentationIndex(oResource, MediaType.JSON, false));
				}
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}
		});
	}
	
	private void addNamingPropertyButtonListener(){
		this.oNamingPropertyButton.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				getPropertyByName(oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0])), oPropertiesList.getSelection()[0]).setIsNamingProperty(oNamingPropertyButton.getSelection());
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				getPropertyByName(oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0])), oPropertiesList.getSelection()[0]).setIsNamingProperty(oNamingPropertyButton.getSelection());
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}
		});
	}
	
	private void addUniquePropertyButtonListener(){
		this.oUniquePropertyButton.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				getPropertyByName(oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0])), oPropertiesList.getSelection()[0]).setIsUnique((oUniquePropertyButton.getSelection() == false)? true : false);
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				getPropertyByName(oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0])), oPropertiesList.getSelection()[0]).setIsUnique((oUniquePropertyButton.getSelection() == false)? true : false);
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}
		});
	}
	
	private void addCreateButtonListener(){
		this.oCreateButton.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				Resource oResource = oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0]));
				if(oCreateButton.getSelection() == true){
					CRUDActivity oCRUDActivity = oRestServiceCIMFactory.createCRUDActivity();
					oCRUDActivity.setCRUDVerb(CRUDVerb.CREATE);
					oResource.getHasCRUDActivity().add(oCRUDActivity);
				}
				else{
					oResource.getHasCRUDActivity().remove(getCRUDActivityIndex(oResource, CRUDVerb.CREATE));
				}
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				Resource oResource = oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0]));
				if(oCreateButton.getSelection() == true){
					CRUDActivity oCRUDActivity = oRestServiceCIMFactory.createCRUDActivity();
					oCRUDActivity.setCRUDVerb(CRUDVerb.CREATE);
					oResource.getHasCRUDActivity().add(oCRUDActivity);
				}
				else{
					oResource.getHasCRUDActivity().remove(getCRUDActivityIndex(oResource, CRUDVerb.CREATE));
				}
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}
		});
	}
	
	private void addReadButtonListener(){
		this.oReadButton.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				Resource oResource = oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0]));
				if(oReadButton.getSelection() == true){
					CRUDActivity oCRUDActivity = oRestServiceCIMFactory.createCRUDActivity();
					oCRUDActivity.setCRUDVerb(CRUDVerb.READ);
					oResource.getHasCRUDActivity().add(oCRUDActivity);
				}
				else{
					oResource.getHasCRUDActivity().remove(getCRUDActivityIndex(oResource, CRUDVerb.READ));
				}
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				Resource oResource = oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0]));
				if(oReadButton.getSelection() == true){
					CRUDActivity oCRUDActivity = oRestServiceCIMFactory.createCRUDActivity();
					oCRUDActivity.setCRUDVerb(CRUDVerb.READ);
					oResource.getHasCRUDActivity().add(oCRUDActivity);
				}
				else{
					oResource.getHasCRUDActivity().remove(getCRUDActivityIndex(oResource, CRUDVerb.READ));
				}
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}
		});
	}
	
	private void addUpdateButtonListener(){
		this.oUpdateButton.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				Resource oResource = oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0]));
				if(oUpdateButton.getSelection() == true){
					CRUDActivity oCRUDActivity = oRestServiceCIMFactory.createCRUDActivity();
					oCRUDActivity.setCRUDVerb(CRUDVerb.UPDATE);
					oResource.getHasCRUDActivity().add(oCRUDActivity);
				}
				else{
					oResource.getHasCRUDActivity().remove(getCRUDActivityIndex(oResource, CRUDVerb.UPDATE));
				}
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				Resource oResource = oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0]));
				if(oUpdateButton.getSelection() == true){
					CRUDActivity oCRUDActivity = oRestServiceCIMFactory.createCRUDActivity();
					oCRUDActivity.setCRUDVerb(CRUDVerb.UPDATE);
					oResource.getHasCRUDActivity().add(oCRUDActivity);
				}
				else{
					oResource.getHasCRUDActivity().remove(getCRUDActivityIndex(oResource, CRUDVerb.UPDATE));
				}
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}
		});
	}
	
	private void addDeleteButtonListener(){
		this.oDeleteButton.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				Resource oResource = oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0]));
				if(oDeleteButton.getSelection() == true){
					CRUDActivity oCRUDActivity = oRestServiceCIMFactory.createCRUDActivity();
					oCRUDActivity.setCRUDVerb(CRUDVerb.DELETE);
					oResource.getHasCRUDActivity().add(oCRUDActivity);
				}
				else{
					oResource.getHasCRUDActivity().remove(getCRUDActivityIndex(oResource, CRUDVerb.DELETE));
				}
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				Resource oResource = oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0]));
				if(oDeleteButton.getSelection() == true){
					CRUDActivity oCRUDActivity = oRestServiceCIMFactory.createCRUDActivity();
					oCRUDActivity.setCRUDVerb(CRUDVerb.DELETE);
					oResource.getHasCRUDActivity().add(oCRUDActivity);
				}
				else{
					oResource.getHasCRUDActivity().remove(getCRUDActivityIndex(oResource, CRUDVerb.DELETE));
				}
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}
		});
	}
	
	private void addIsAlgorithmicButtonListener() {
		this.oResourceIsAlgorithmicButton.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0])).setIsAlgorithmic(oResourceIsAlgorithmicButton.getSelection());
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0])).setIsAlgorithmic(oResourceIsAlgorithmicButton.getSelection());
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}
			
		});
		
	}

	private void addResourceListListener() {
		this.oResourceList.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				Resource oResource = oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0]));
				oResourceIsAlgorithmicButton.setSelection((oResource.isIsAlgorithmic() == true ? true : false));
				oCreateButton.setSelection((resourceHasCRUDActivity(oResource, CRUDVerb.CREATE) ? true : false));
				oReadButton.setSelection((resourceHasCRUDActivity(oResource, CRUDVerb.READ) ? true : false));
				oUpdateButton.setSelection((resourceHasCRUDActivity(oResource, CRUDVerb.UPDATE) ? true : false));
				oDeleteButton.setSelection((resourceHasCRUDActivity(oResource, CRUDVerb.DELETE) ? true : false));
				oInputJSONButton.setSelection((resourceHasRepresentation(oResource, MediaType.JSON, true) ? true : false));
				oInputXMLButton.setSelection((resourceHasRepresentation(oResource, MediaType.XML, true) ? true : false));
				oOutputJSONButton.setSelection((resourceHasRepresentation(oResource, MediaType.JSON, false) ? true : false));
				oOutputXMLButton.setSelection((resourceHasRepresentation(oResource, MediaType.XML, false) ? true : false));
				populatePropertiesList();
				populateResourceRelations();
				populateUnrelatedResourcesList();
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				Resource oResource = oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0]));
				oResourceIsAlgorithmicButton.setSelection((oResource.isIsAlgorithmic() == true ? true : false));
				oCreateButton.setSelection((resourceHasCRUDActivity(oResource, CRUDVerb.CREATE) ? true : false));
				oReadButton.setSelection((resourceHasCRUDActivity(oResource, CRUDVerb.READ) ? true : false));
				oUpdateButton.setSelection((resourceHasCRUDActivity(oResource, CRUDVerb.UPDATE) ? true : false));
				oDeleteButton.setSelection((resourceHasCRUDActivity(oResource, CRUDVerb.DELETE) ? true : false));
				oInputJSONButton.setSelection((resourceHasRepresentation(oResource, MediaType.JSON, true) ? true : false));
				oInputXMLButton.setSelection((resourceHasRepresentation(oResource, MediaType.XML, true) ? true : false));
				oOutputJSONButton.setSelection((resourceHasRepresentation(oResource, MediaType.JSON, false) ? true : false));
				oOutputXMLButton.setSelection((resourceHasRepresentation(oResource, MediaType.XML, false) ? true : false));
				populatePropertiesList();
				populateResourceRelations();
				populateUnrelatedResourcesList();
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}
			
		});
	}
	
	private void addPropertyListListener() {
		this.oPropertiesList.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				Property oProperty = getPropertyByName(oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0])), oPropertiesList.getSelection()[0]);
				oUniquePropertyButton.setSelection((oProperty.isIsUnique() == true ? false : true));
				oNamingPropertyButton.setSelection((oProperty.isIsNamingProperty() == true ? true : false));
				if(oProperty.getType() != null){
					if(oProperty.getType().equalsIgnoreCase("String")){
						oTypeList.setSelection(oTypeList.indexOf("String"));
					}
					else if(oProperty.getType().equalsIgnoreCase("int")){
						oTypeList.setSelection(oTypeList.indexOf("Integer"));
					}
					else if(oProperty.getType().equalsIgnoreCase("double")){
						oTypeList.setSelection(oTypeList.indexOf("Double"));
					}
					else if(oProperty.getType().equalsIgnoreCase("float")){
						oTypeList.setSelection(oTypeList.indexOf("Float"));
					}
					else if(oProperty.getType().equalsIgnoreCase("long")){
						oTypeList.setSelection(oTypeList.indexOf("Long"));
					}
					else if(oProperty.getType().equalsIgnoreCase("boolean")){
						oTypeList.setSelection(oTypeList.indexOf("Boolean"));
					}
					else if(oProperty.getType().equalsIgnoreCase("Date")){
						oTypeList.setSelection(oTypeList.indexOf("Date"));
					}
					else{
						oTypeList.deselectAll();
					}
				}
				else{
					oTypeList.deselectAll();
				}
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				Property oProperty = getPropertyByName(oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0])), oPropertiesList.getSelection()[0]);
				oUniquePropertyButton.setSelection((oProperty.isIsUnique() == true ? false : true));
				oNamingPropertyButton.setSelection((oProperty.isIsNamingProperty() == true ? true : false));
				if(oProperty.getType() != null){
					if(oProperty.getType().equalsIgnoreCase("String")){
						oTypeList.setSelection(oTypeList.indexOf("String"));
					}
					else if(oProperty.getType().equalsIgnoreCase("int")){
						oTypeList.setSelection(oTypeList.indexOf("Integer"));
					}
					else if(oProperty.getType().equalsIgnoreCase("double")){
						oTypeList.setSelection(oTypeList.indexOf("Double"));
					}
					else if(oProperty.getType().equalsIgnoreCase("float")){
						oTypeList.setSelection(oTypeList.indexOf("Float"));
					}
					else if(oProperty.getType().equalsIgnoreCase("long")){
						oTypeList.setSelection(oTypeList.indexOf("Long"));
					}
					else if(oProperty.getType().equalsIgnoreCase("boolean")){
						oTypeList.setSelection(oTypeList.indexOf("Boolean"));
					}
					else if(oProperty.getType().equalsIgnoreCase("Date")){
						oTypeList.setSelection(oTypeList.indexOf("Date"));
					}
					else{
						oTypeList.deselectAll();
					}
				}
				else{
					oTypeList.deselectAll();
				}
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}
		});
	}
	
	private void addTypeListListener() {
		this.oTypeList.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				if(oTypeList.getSelection()[0].equalsIgnoreCase("String")){
					getPropertyByName(oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0])), oPropertiesList.getSelection()[0]).setType("String");
				}
				else if(oTypeList.getSelection()[0].equalsIgnoreCase("Integer")){
					getPropertyByName(oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0])), oPropertiesList.getSelection()[0]).setType("int");
				}
				else if(oTypeList.getSelection()[0].equalsIgnoreCase("Double")){
					getPropertyByName(oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0])), oPropertiesList.getSelection()[0]).setType("double");
				}
				else if(oTypeList.getSelection()[0].equalsIgnoreCase("Float")){
					getPropertyByName(oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0])), oPropertiesList.getSelection()[0]).setType("float");
				}
				else if(oTypeList.getSelection()[0].equalsIgnoreCase("Long")){
					getPropertyByName(oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0])), oPropertiesList.getSelection()[0]).setType("long");
				}
				else if(oTypeList.getSelection()[0].equalsIgnoreCase("Boolean")){
					getPropertyByName(oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0])), oPropertiesList.getSelection()[0]).setType("boolean");
				}
				else if(oTypeList.getSelection()[0].equalsIgnoreCase("Date")){
					getPropertyByName(oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0])), oPropertiesList.getSelection()[0]).setType("Date");
				}
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				if(oTypeList.getSelection()[0].equalsIgnoreCase("String")){
					getPropertyByName(oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0])), oPropertiesList.getSelection()[0]).setType("String");
				}
				else if(oTypeList.getSelection()[0].equalsIgnoreCase("Integer")){
					getPropertyByName(oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0])), oPropertiesList.getSelection()[0]).setType("int");
				}
				else if(oTypeList.getSelection()[0].equalsIgnoreCase("Double")){
					getPropertyByName(oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0])), oPropertiesList.getSelection()[0]).setType("double");
				}
				else if(oTypeList.getSelection()[0].equalsIgnoreCase("Float")){
					getPropertyByName(oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0])), oPropertiesList.getSelection()[0]).setType("float");
				}
				else if(oTypeList.getSelection()[0].equalsIgnoreCase("Long")){
					getPropertyByName(oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0])), oPropertiesList.getSelection()[0]).setType("long");
				}
				else if(oTypeList.getSelection()[0].equalsIgnoreCase("Boolean")){
					getPropertyByName(oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0])), oPropertiesList.getSelection()[0]).setType("boolean");
				}
				else if(oTypeList.getSelection()[0].equalsIgnoreCase("Date")){
					getPropertyByName(oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(oResourceList.getSelection()[0])), oPropertiesList.getSelection()[0]).setType("Date");
				}
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}
		});
	}
	
	private void addRelationsListListener() {
		this.oRelationsList.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				setPageComplete(isPageCompleted());
				updateWidgetStatus();
			}
		});
	}

	private void populateResourceList(){
		this.oResourceList.removeAll();
		ArrayList<String> listOfStrings = new ArrayList<String>();
		
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			listOfStrings.add(this.oRESTfulServiceCIM.getHasResources().get(n).getName());
		}
		
		java.util.Collections.sort(listOfStrings, Collator.getInstance());
		Iterator<String> iterator = listOfStrings.iterator();
		
		while(iterator.hasNext()){
			this.oResourceList.add(iterator.next());
		}
	}
	
	private void populateUnrelatedResourcesList() {
		this.oUnrelatedResourcesList.removeAll();
		ArrayList<String> listOfStrings = new ArrayList<String>();
		
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(!resourceHasRelatedResource(this.oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(this.oResourceList.getSelection()[0])),
					this.oRESTfulServiceCIM.getHasResources().get(n))){
				listOfStrings.add(this.oRESTfulServiceCIM.getHasResources().get(n).getName());
			}
		}
		
		java.util.Collections.sort(listOfStrings, Collator.getInstance());
		Iterator<String> iterator = listOfStrings.iterator();
		
		while(iterator.hasNext()){
			this.oUnrelatedResourcesList.add(iterator.next());
		}
	}
	
	private void populatePropertiesList(){
		this.oPropertiesList.removeAll();
		ArrayList<String> listOfStrings = new ArrayList<String>();
		
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(this.oResourceList.getSelection()[0])).getHasProperty().size(); n++){
			listOfStrings.add(this.oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(this.oResourceList.getSelection()[0])).getHasProperty().get(n).getName());
		}
		
		java.util.Collections.sort(listOfStrings, Collator.getInstance());
		Iterator<String> iterator = listOfStrings.iterator();
		
		while(iterator.hasNext()){
			this.oPropertiesList.add(iterator.next());
		}
	}
	
	private void populateResourceRelations(){
		this.oRelationsList.removeAll();
		ArrayList<String> listOfStrings = new ArrayList<String>();
		
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(this.oResourceList.getSelection()[0])).getHasRelatedResource().size(); n++){
			listOfStrings.add(this.oRESTfulServiceCIM.getHasResources().get(getResourceIndexByName(this.oResourceList.getSelection()[0])).getHasRelatedResource().get(n).getName());
		}
		
		java.util.Collections.sort(listOfStrings, Collator.getInstance());
		Iterator<String> iterator = listOfStrings.iterator();
		
		while(iterator.hasNext()){
			this.oRelationsList.add(iterator.next());
		}
	}
	
	private void deleteResourceRelationTo(int resourceIndexByName) {
		
		//for loop that deletes any references from CIM Resources that have as related resource the CIM Resource to be deleted
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().get(n).getHasRelatedResource().size(); i++){
				if(this.oRESTfulServiceCIM.getHasResources().get(n).getHasRelatedResource().get(i).getName().equalsIgnoreCase(
						this.oRESTfulServiceCIM.getHasResources().get(resourceIndexByName).getName())){
					this.oRESTfulServiceCIM.getHasResources().get(n).getHasRelatedResource().remove(i);
				}
			}
		}		
		
		//for loop that deletes any references from CIM Resources that are related resources of the CIM Resource to be deleted
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().get(resourceIndexByName).getHasRelatedResource().size(); n++){
			for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().get(resourceIndexByName).getHasRelatedResource().get(n).getIsRelatedResource().size(); i++){
				if(this.oRESTfulServiceCIM.getHasResources().get(resourceIndexByName).getHasRelatedResource().get(n).getIsRelatedResource().get(i).getName().equalsIgnoreCase(this.oRESTfulServiceCIM.getHasResources().get(resourceIndexByName).getName())){
					this.oRESTfulServiceCIM.getHasResources().get(resourceIndexByName).getHasRelatedResource().get(n).getIsRelatedResource().remove(i);					
				}
			}
		}
	}
	
	private Property getPropertyByName(Resource oResource, String strPropertyName) {
		for(int n = 0; n < oResource.getHasProperty().size(); n++){
			if(oResource.getHasProperty().get(n).getName().equalsIgnoreCase(strPropertyName)){
				return oResource.getHasProperty().get(n);
			}
		}
		try {
			throw new ExecutionException(new Throwable());
		} catch (ExecutionException e) {
			Activator.log("Unable to find property by name " + strPropertyName, e);
			return null;
		}
	}
		
	private int getResourceRepresentationIndex(Resource oResource, MediaType oMediaType, boolean bIsInputMediaType){
		for(int n = 0; n < (bIsInputMediaType == true ? oResource.getHasInputRepresentation().size() : oResource.getHasOutputRepresentation().size()); n++){
			if(oMediaType == (bIsInputMediaType == true ? 
					oResource.getHasInputRepresentation().get(n).getInputMediaType() : oResource.getHasOutputRepresentation().get(n).getOutputMediaType())){
				return n;
			}
		}
		return -1; //change to exception in production code
	}

	private boolean resourceHasRepresentation(Resource oResource, MediaType oMediaType, boolean bIsInputMediaType) {
		for(int n = 0; n < (bIsInputMediaType == true ? oResource.getHasInputRepresentation().size() : oResource.getHasOutputRepresentation().size()); n++){
			if(oMediaType == (bIsInputMediaType == true ? 
					oResource.getHasInputRepresentation().get(n).getInputMediaType() : oResource.getHasOutputRepresentation().get(n).getOutputMediaType())){
				return true;
			}
		}
		return false;
	}

	private boolean resourceHasCRUDActivity(Resource oResource, CRUDVerb oCRUDVerb) {
		for(int n = 0; n < oResource.getHasCRUDActivity().size(); n++){
			if(oResource.getHasCRUDActivity().get(n).getCRUDVerb() == oCRUDVerb){
				return true;
			}
		}
		return false;
	}
	
	private int getCRUDActivityIndex(Resource oResource, CRUDVerb oCRUDVerb){
		for(int n = 0; n < oResource.getHasCRUDActivity().size(); n++){
			if(oResource.getHasCRUDActivity().get(n).getCRUDVerb() == oCRUDVerb){
				return n;
			}
		}
		return -1; //change to exception for production code
	}

	private int getResourceIndexByName(String strResourceName) {
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).getName().equalsIgnoreCase(strResourceName)){
				return n;
			}
		}
		try {
			throw new ExecutionException(new Throwable());
		} catch (ExecutionException e) {
			Activator.log("Unable to find resource index by name " + strResourceName, e);
			return -1;
		}
	}
	
	private boolean resourceHasRelatedResource(Resource oResource, Resource oRelatedResource) {
		for(int n = 0; n < oResource.getHasRelatedResource().size(); n++){
			if(oResource.getHasRelatedResource().get(n).getName() == oRelatedResource.getName()){
				return true;
			}
		}
		return false;
	}
	
	private int getRelatedResourceIndex(Resource oResource, Resource oRelatedResource, boolean bHasRelationship){
		for(int n = 0; n < oResource.getHasRelatedResource().size() && bHasRelationship; n++){
			if(oResource.getHasRelatedResource().get(n).getName().equalsIgnoreCase(oRelatedResource.getName())){
				return n;
			}
		}
		
		for(int i = 0; i < oRelatedResource.getIsRelatedResource().size() && !bHasRelationship; i++){
			if(oRelatedResource.getIsRelatedResource().get(i).getName().equalsIgnoreCase(oResource.getName())){
				return i;
			}
		}

		if(bHasRelationship){
			System.out.println("DID NOT FIND THE RELATED RESOURCE INDEX");
		}
		else{
			System.out.println("DID NOT FIND THE IS RELATED RESOURCE INDEX");
		}
		try {
			throw new ExecutionException(new Throwable());
		} catch (ExecutionException e) {
			Activator.log("Unable to find related resource index.", e);
			return -1;
		}
	}

	private void updateWidgetStatus(){
		updateResourceWidgets();
		updateCRUDActivitiesWidgets();
		updateRepresentationWidgets();
		updatePropertyWidgets();
		updatePropertyConfigurationWidgets();
		updateRelationWidgets();
	}

	private void updateResourceWidgets() {
		if(this.oResourceList.getItemCount() > 0){
			this.oResourceList.setEnabled(true);
		}
		else{
			this.oResourceList.setEnabled(false);
		}
		
		if(this.oResourceList.getSelectionIndex() != -1){
			this.oResourceIsAlgorithmicButton.setEnabled(true);
			this.oDeleteResourceButton.setEnabled(true);
			this.btnRenameResource.setEnabled(true);
		}
		else{
			this.oResourceIsAlgorithmicButton.setEnabled(false);
			this.oDeleteResourceButton.setEnabled(false);
			this.btnRenameResource.setEnabled(false);
		}
	}

	private void updateCRUDActivitiesWidgets() {
		if(this.oResourceList.getSelectionIndex() != -1){
			this.oCreateButton.setEnabled(true);
			this.oReadButton.setEnabled(true);
			this.oUpdateButton.setEnabled(true);
			this.oDeleteButton.setEnabled(true);
		}
		else{
			this.oCreateButton.setEnabled(false);
			this.oReadButton.setEnabled(false);
			this.oUpdateButton.setEnabled(false);
			this.oDeleteButton.setEnabled(false);
		}
	}

	private void updateRepresentationWidgets() {
		if(this.oResourceList.getSelectionIndex() != -1){
			this.oInputJSONButton.setEnabled(true);
			this.oInputXMLButton.setEnabled(true);
			this.oOutputJSONButton.setEnabled(true);
			this.oOutputXMLButton.setEnabled(true);
		}
		else{
			this.oInputJSONButton.setEnabled(false);
			this.oInputXMLButton.setEnabled(false);
			this.oOutputJSONButton.setEnabled(false);
			this.oOutputXMLButton.setEnabled(false);
		}
	}

	private void updatePropertyWidgets() {
		if(this.oResourceList.getSelectionIndex() != -1){
			this.oPropertiesList.setEnabled(true);
			this.oCreatePropertyButton.setEnabled(true);
		}
		else{
			this.oPropertiesList.setEnabled(false);
			this.oCreatePropertyButton.setEnabled(false);
		}
		
		if(this.oPropertiesList.getSelectionIndex() != -1){
			this.oDeletePropertyButton.setEnabled(true);
			this.btnRenameProperty.setEnabled(true);
		}
		else{
			this.oDeletePropertyButton.setEnabled(false);
			this.btnRenameProperty.setEnabled(false);
		}
	}

	private void updatePropertyConfigurationWidgets() {
		if(this.oPropertiesList.getSelectionIndex() != -1 && this.oPropertiesList.getEnabled()){
			this.oUniquePropertyButton.setEnabled(true);
			this.oNamingPropertyButton.setEnabled(true);
			this.oTypeList.setEnabled(true);
		}
		else{
			this.oUniquePropertyButton.setEnabled(false);
			this.oNamingPropertyButton.setEnabled(false);
			this.oTypeList.setEnabled(false);
		}
	}

	private void updateRelationWidgets() {
		if(this.oResourceList.getSelectionIndex() != -1 && this.oResourceList.getEnabled()){
			this.oRelationsList.setEnabled(true);
			this.oUnrelatedResourcesList.setEnabled(true);
		}
		else{
			this.oRelationsList.setEnabled(false);
			this.oUnrelatedResourcesList.setEnabled(false);
		}
		
		if(this.oUnrelatedResourcesList.getSelectionIndex() != -1 && this.oUnrelatedResourcesList.getEnabled()){
			this.oCreateRelationButton.setEnabled(true);
		}
		else{
			this.oCreateRelationButton.setEnabled(false);
		}
		
		if(this.oRelationsList.getSelectionIndex() != -1 && this.oResourceList.getEnabled()){
			this.oDeleteRelationButton.setEnabled(true);
		}
		else{
			this.oDeleteRelationButton.setEnabled(false);
		}
	}

	private boolean isPageCompleted(){
		if(isValidCIMModel()){
			return true;
		}
		return false;
	}

	private boolean isValidCIMModel() {
		//validate resources
		if(CIMHasNoResources()){
			return false;
		}
		if(!CIMHasUniqueResourceNames()){
			return false;
		}
		if(!allResourcesHaveCRUDActivities()){
			return false;
		}
		if(!allResourceHaveInputRepresentations()){
			return false;
		}
		if(!allResourcesHaveOutputRepresentations()){
			return false;
		}
		if(!allCRUDResourcesHaveProperties()){
			return false;
		}
		if(!allAlgoResourceHaveNoPRoperties()){
			return false;
		}
		if(!resourcesHaveUniqueNamingProperty()){
			return false;
		}
		if(!algorithmicResourceHasNoRelatedResources()){
			return false;
		}
		
		//validate properties
		if(!allPropertiesHaveType()){
			return false;
		}
		
		//validate minimum required algorithmic resources number is satisfied
		if(!requiredMinimumAlgoResourcesFound()){
			return false;
		}
		
		//validate that all CRUD resources have at least CREATE and READ activities
		if(!allCRUDResourcesHaveRequiredActivities()){
			return false;
		}
		
		//validate that there are not any properties that cause naming conflicts and compilation errors
		if(!allPropertiesHaveProperNames()){
			return false;
		}
		
		//validate that there are not any resources using java reserved keywords as their names
		if(!noResourcesHaveJavaKeywordInName()){
			return false;
		}
		
		//validate that there are not any resources using invalid characters in their names
		if(!noResourcesHaveJavaInvalidCharacterInName()){
			return false;
		}
		
		//validate that there are not any resource properties using java reserved keywords as their names
		if(!noPropertiesHaveJavaKeywordInName()){
			return false;
		}
		
		//validate that there are not any resource properties using invalid characters in their names
		if(!noPropertiesHaveJavaInvalidCharacterInName()){
			return false;
		}
		
		setErrorMessage(null);
		
		return true;
	}

	private boolean CIMHasNoResources() {
		if(this.oRESTfulServiceCIM.getHasResources().size() == 0){
			setErrorMessage("The envisioned RESTful service must have at least one resource. Please add a resource!");
			return true;
		}
		
		return false;
	}

	private boolean noPropertiesHaveJavaInvalidCharacterInName() {
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().size(); i++){
				if(!isValidJavaIdentifier(this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().get(i).getName())){
					setErrorMessage("No invalid Java characters may be used for resouce properties names. Resource's " +
							this.oRESTfulServiceCIM.getHasResources().get(n).getName() + " property " + 
							this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().get(i).getName() + " however uses invalid characters.");
					return false;
				}
			}
		}
		
		return true;
	}

	private boolean noPropertiesHaveJavaKeywordInName() {
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().size(); i++){
				if(isJavaReservedKeyword(this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().get(i).getName())){
					setErrorMessage("No Java reserved keyword may be used for resouce properties names. Resource's " +
							this.oRESTfulServiceCIM.getHasResources().get(n).getName() + " property " + 
							this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().get(i).getName() + " however uses a reserved keyword.");
					return false;
				}
			}
		}
		
		return true;
	}

	private boolean noResourcesHaveJavaInvalidCharacterInName() {
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(!isValidJavaIdentifier(this.oRESTfulServiceCIM.getHasResources().get(n).getName())){
				setErrorMessage("No invalid Java characters may be used for resouce names. Resource " + 
						this.oRESTfulServiceCIM.getHasResources().get(n).getName() + " however used invalid characters.");
				return false;
			}
		}
		
		return true;
	}

	private boolean noResourcesHaveJavaKeywordInName() {
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(isJavaReservedKeyword(this.oRESTfulServiceCIM.getHasResources().get(n).getName())){
				setErrorMessage("No Java reserved keyword may be used for resouce names. Resource " + 
						this.oRESTfulServiceCIM.getHasResources().get(n).getName() + " however is reserved keyword.");
				return false;
			}
		}
		
		return true;
	}
	
    private static boolean isJavaReservedKeyword(String strPhrase){
        
        for(int n = 0; n < arrayOfJavaKeywords.length; n++){
            if(strPhrase.equalsIgnoreCase(arrayOfJavaKeywords[n])){
                return true;
            }
        }
        return false;
    }	
    
    public static boolean isValidJavaIdentifier(String s) {
        if (s.isEmpty()) {
            return false;
        }
        if (!Character.isJavaIdentifierStart(s.charAt(0))) {
            return false;
        }
        for (int i = 1; i < s.length(); i++) {
            if (!Character.isJavaIdentifierPart(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

	private boolean allPropertiesHaveProperNames() {
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() == false){
				for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().size(); i++){
					//check if the property name is reserved within MDE
					if(isReservedMDEPropertyName(this.oRESTfulServiceCIM.getHasResources().get(n).getName(), this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().get(i).getName())){
						setErrorMessage("CRUD resource properties may not have as names reserved MDE keywords. Rename " + 
								this.oRESTfulServiceCIM.getHasResources().get(n).getName() + " resource's " + 
								this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().get(i).getName() + " property.");
						return false;
					}
					
					//check if the property's resource is related of some other resource with the same name as the property
					if(isReservedForRelationsPropertyName(this.oRESTfulServiceCIM.getHasResources().get(n).getName(), this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().get(i).getName())){
						setErrorMessage("CRUD resource properties may not have the same name as resources of which they are related. Rename " + 
								this.oRESTfulServiceCIM.getHasResources().get(n).getName() + " resource's " + 
								this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().get(i).getName() + " property.");
						return false;
					}
				}
			}
		}
		
		return true;
	}

	private boolean isReservedForRelationsPropertyName(String strResourceName, String strPropertyName) {
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(strPropertyName.equalsIgnoreCase(this.oRESTfulServiceCIM.getHasResources().get(n).getName())){
				//check if this resource has as related the property's resource
				for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().get(n).getHasRelatedResource().size(); i++){
					if(this.oRESTfulServiceCIM.getHasResources().get(n).getHasRelatedResource().get(i).getName().equalsIgnoreCase(strResourceName)){
						return true;
					}
				}
			}
		}
		
		return false;
	}

	private boolean isReservedMDEPropertyName(String strResourceName, String strPropertyName) {
		
		if(strPropertyName.equalsIgnoreCase("linklist")){
			return true;
		}
		else if(strPropertyName.equalsIgnoreCase(strResourceName + "Id")){
			return true;
		}
		
		return false;
	}

	private boolean allCRUDResourcesHaveRequiredActivities() {
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() == false){ //if it is CRUD resource
				//check if it has CREATE and READ activity
				boolean bHasCreateActivity = false;
				boolean bHasReadActivity = false;
				for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().get(n).getHasCRUDActivity().size(); i++){
					if(this.oRESTfulServiceCIM.getHasResources().get(n).getHasCRUDActivity().get(i).getCRUDVerb() == CRUDVerb.CREATE){
						bHasCreateActivity = true;
					}
					else if(this.oRESTfulServiceCIM.getHasResources().get(n).getHasCRUDActivity().get(i).getCRUDVerb() == CRUDVerb.READ){
						bHasReadActivity = true;
					}
				}
				
				if(!bHasCreateActivity || !bHasReadActivity){
					setErrorMessage("CRUD resources must have CREATE and READ activities. However resource " + this.oRESTfulServiceCIM.getHasResources().get(n).getName()
							+ " does not have one or either of them.");
					return false;				
				}
			}
		}
		
		
		return true;
	}

	private boolean algorithmicResourceHasNoRelatedResources() {
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() == true){
				if(this.oRESTfulServiceCIM.getHasResources().get(n).getHasRelatedResource().isEmpty() == false){
					setErrorMessage("Algorithmic resources may not have any related resources. However resource " + this.oRESTfulServiceCIM.getHasResources().get(n).getName()
							+ " has related resources.");
					return false;
				}
			}
		}
		
		return true;
	}

	private boolean requiredMinimumAlgoResourcesFound() {
		int iNumberOfAlgoResources = 0;
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() == true){
				iNumberOfAlgoResources++;
			}
		}
		
		if(this.intMinRequiredAlgoResources > iNumberOfAlgoResources){
			setErrorMessage("Based on the desired algorithmic functionality preferences of this project, at least " + this.intMinRequiredAlgoResources
					+ " algorithmic resources are needed. Only " + iNumberOfAlgoResources +
					" are already defined.");
			return false;
		}
		
		return true;
	}

	private boolean allPropertiesHaveType() {
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().size(); i++){
				if(this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().get(i).getType() == null){
					setErrorMessage("All properties must have a type. Property "
							+ this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().get(i).getName() + " of resource "
									+ this.oRESTfulServiceCIM.getHasResources().get(n).getName() + " does not have a type.");
					return false;
				}
			}
		}
		return true;
	}

	private boolean resourcesHaveUniqueNamingProperty() {
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			int iNumberOfNamingProperties = 0;
			if(!this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic()){
				for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().size(); i++){
					if(this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().get(i).isIsNamingProperty()){
						iNumberOfNamingProperties++;
						if(iNumberOfNamingProperties > 1){
							setErrorMessage("A CRUD resource must have exactly one naming property. CRUD resource " + this.oRESTfulServiceCIM.getHasResources().get(n).getName() + " has more.");
							return false;
						}
						if(this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().get(i).isIsUnique() == false){
							setErrorMessage("Naming properties cannot be collections. Resource " + this.oRESTfulServiceCIM.getHasResources().get(n).getName() +
									" has a naming property called " + this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().get(i).getName() + " that is a Collection");
							return false;
						}
					}
				}
				if(iNumberOfNamingProperties == 0){
					setErrorMessage("A CRUD resource must have exactly one naming property. CRUD resource " + this.oRESTfulServiceCIM.getHasResources().get(n).getName() + " does not have any.");
					return false;
				}
			}
		}
		
		return true;
	}

	private boolean allAlgoResourceHaveNoPRoperties() {
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().size() > 0 && this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic()){
				setErrorMessage("An algorithmic resource cannot have properties. Algorithmic resource " + this.oRESTfulServiceCIM.getHasResources().get(n).getName() + " has properties.");
				return false;
			}
		}
		return true;
	}

	private boolean allCRUDResourcesHaveProperties() {
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).getHasProperty().size() == 0 && !this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic()){
				setErrorMessage("Every CRUD resource must have at least one property. CRUD resource " + this.oRESTfulServiceCIM.getHasResources().get(n).getName() + " does not have any properties.");
				return false;
			}
		}
		return true;
	}

	private boolean allResourcesHaveOutputRepresentations() {
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).getHasOutputRepresentation().size() == 0){
				setErrorMessage("All resources must have one output representation. Resource " + this.oRESTfulServiceCIM.getHasResources().get(n).getName() + " does not have any.");
				return false;
			}
		}
		return true;
	}

	private boolean allResourceHaveInputRepresentations() {
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).getHasInputRepresentation().size() == 0){
				setErrorMessage("All resources must have one input representation. Resource " + this.oRESTfulServiceCIM.getHasResources().get(n).getName() + " does not have any.");
				return false;
			}
		}
		return true;
	}

	private boolean allResourcesHaveCRUDActivities() {
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() && this.oRESTfulServiceCIM.getHasResources().get(n).getHasCRUDActivity().size() != 1){
				setErrorMessage("Algorithmic resources must have exactly one CRUD Activity. Algorithmic resource " + this.oRESTfulServiceCIM.getHasResources().get(n).getName() + " does not have exactly one.");
				return false;
			}
			else  if(!this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() && this.oRESTfulServiceCIM.getHasResources().get(n).getHasCRUDActivity().size() == 0){
				setErrorMessage("CRUD resources must have at least one CRUD Activity. CRUD resource " + this.oRESTfulServiceCIM.getHasResources().get(n).getName() + " does not have any.");
				return false;
			}
		}
		return true;
	}

	private boolean CIMHasUniqueResourceNames() {
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().size(); i++){
				if(this.oRESTfulServiceCIM.getHasResources().get(n) != this.oRESTfulServiceCIM.getHasResources().get(i) &&
						this.oRESTfulServiceCIM.getHasResources().get(n).getName().equalsIgnoreCase(this.oRESTfulServiceCIM.getHasResources().get(i).getName())){
					setErrorMessage("All resources must have unique names. The name " + this.oRESTfulServiceCIM.getHasResources().get(n).getName() + " is assigned to more than one resource." );
					return false;
				}
			}
		}
		return true;
	}
}