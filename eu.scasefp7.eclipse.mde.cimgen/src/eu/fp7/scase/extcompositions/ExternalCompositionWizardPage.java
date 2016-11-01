package eu.fp7.scase.extcompositions;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
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

import ExternalServiceLayerCIM.AnnAlgoResource;
import ExternalServiceLayerCIM.AnnCRUDResource;
import ExternalServiceLayerCIM.AutoPersistentOutput;
import ExternalServiceLayerCIM.ComplexType;
import ExternalServiceLayerCIM.ComplexTypeProperty;
import ExternalServiceLayerCIM.ExistentCRUDPersistentOutput;
import ExternalServiceLayerCIM.ExternalServiceLayerCIMFactory;
import ExternalServiceLayerCIM.InputDataModel;
import ExternalServiceLayerCIM.ModelProperty;
import ExternalServiceLayerCIM.NonPersistentOutput;
import ExternalServiceLayerCIM.OutputDataModel;
import ExternalServiceLayerCIM.QueryParam;
import ExternalServiceLayerCIM.RESTClientResource;
import ExternalServiceLayerCIM.Representation;
import ExternalServiceLayerCIM.TargetRESTService;
import SearchLayerCIM.SearchResource;
import ServiceCIM.RESTfulServiceCIM;
import ServiceCIM.Resource;

import org.eclipse.swt.widgets.Text;

import eu.fp7.scase.inputParser.YamlResource;
import eu.fp7.scase.launcher.cimgenerator.Activator;


public class ExternalCompositionWizardPage extends WizardPage{
	
	private RESTfulServiceCIM oRESTfulServiceCIM;
	private ExternalServiceLayerCIM.AnnotationModel oExternalServiceLayerCIM;
	private Composite oWizardPageGrid;
	private Composite oParentComposite;
	private ExternalServiceLayerCIMFactory oExternalServiceLayerCIMFactory;
	private boolean bReloadExistingModels;
	private SearchLayerCIM.AnnotationModel oSearchLayerCIM;
	private ComplexDataTypeWizardPage oComplexDataTypeWizardPage;
	
	
	//widgets
	private Composite oAlgoResourceGrid;
	private GridData gd_oAlgoResourceGrid;
	private GridData gd_lblRestclientResources;
	private List listAvailableResources;
	private GridData gd_listAvailableResources;
	private Composite composite;
	private GridData gd_composite;
	private Button buttonAddRESTClientResource;
	private GridData gd_buttonAddRESTClientResource;
	private Button buttonRemoveRESTClientResource;
	private List listRESTClientResources;
	private GridData gd_listRESTClientResources;
	private Composite oExternalServiceCombo;
	private GridData gd_oExternalServiceCombo;
	private List listCRUDVerb;
	private List listQueryParameters;
	private Button buttonRenameQueryParameter;
	private Button buttonCreateQueryParameter;
	private Button buttonDeleteQueryParameter;
	private Button buttonInputJSON;
	private Button buttonInputXML;
	private List listInputProperties;
	private Button buttonInputPropertyMultiplicity;
	private Button buttonCreateInputProperty;
	private Button buttonDeleteInputProperty;
	private Button buttonRenameInputProperty;
	private List listInputPropertyType;
	private Button buttonHasInputDataModel;
	private Button buttonHasOutputDataModel;
	private Button buttonOutputJSON;
	private Button buttonOutputXML;
	private List listOutputProperties;
	private Button buttonOutputPropertyMultiplicity;
	private Button buttonCreateOutputProperty;
	private Button buttonDeleteOutputProperty;
	private Button buttonRenameOutputProperty;
	private List listOutputPropertyType;
	private Button buttonPersistOutput;
	private List listPersistenceType;
	private List listExistentCRUDResources;
	private Text textTargetServiceURL;
	
	//temporary External Composition modeling attributes
	private boolean[] oRESTClientResourcesArray;
	private RESTClientResource[] oRESTClientModelingArray;
	private Text textAuthTokenURL;
	private Button isQueryAuthTokenButton;
	
	public ExternalCompositionWizardPage(RESTfulServiceCIM oRESTfulServiceCIM,  ExternalServiceLayerCIM.AnnotationModel oExternalServiceLayerCIM, SearchLayerCIM.AnnotationModel oParamSearchLayerCIM, boolean bReloadExistingModels, ArrayList<YamlResource> oYamlResourcesList){
		super(oRESTfulServiceCIM.getName() + "External Service Editor");
		this.oRESTfulServiceCIM = oRESTfulServiceCIM;
		this.oExternalServiceLayerCIM = oExternalServiceLayerCIM;
		this.oExternalServiceLayerCIMFactory = ExternalServiceLayerCIMFactory.eINSTANCE;
		this.oRESTClientResourcesArray = new boolean[getNumberOfAvailableAlgoResources()];
		this.oRESTClientModelingArray = new RESTClientResource[getNumberOfAvailableAlgoResources()];
		this.bReloadExistingModels = bReloadExistingModels;
		this.oSearchLayerCIM = oParamSearchLayerCIM;
	}


	@Override
	public void createControl(Composite parent) {
		this.oParentComposite = parent;
		this.oWizardPageGrid = new Composite(parent, SWT.NONE);
		this.oWizardPageGrid.setLayout(new GridLayout(1, false));
		

		this.setControl(this.oWizardPageGrid);
		
		oAlgoResourceGrid = new Composite(oWizardPageGrid, SWT.NONE);
		oAlgoResourceGrid.setLayout(new GridLayout(3, false));
		gd_oAlgoResourceGrid = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
		gd_oAlgoResourceGrid.heightHint = 118;
		gd_oAlgoResourceGrid.widthHint = 578;
		oAlgoResourceGrid.setLayoutData(gd_oAlgoResourceGrid);
		
		Label lblAvailableResources = new Label(oAlgoResourceGrid, SWT.NONE);
		lblAvailableResources.setText("Available Resources:");
		new Label(oAlgoResourceGrid, SWT.NONE);
		
		Label lblRestclientResources = new Label(oAlgoResourceGrid, SWT.NONE);
		gd_lblRestclientResources = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblRestclientResources.widthHint = 251;
		lblRestclientResources.setLayoutData(gd_lblRestclientResources);
		lblRestclientResources.setText("RESTClient Resources:");
		
		listAvailableResources = new List(oAlgoResourceGrid, SWT.BORDER | SWT.V_SCROLL);
		gd_listAvailableResources = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_listAvailableResources.heightHint = 88;
		gd_listAvailableResources.widthHint = 206;
		listAvailableResources.setLayoutData(gd_listAvailableResources);
		addAvailableResourcesListListener();
		
		composite = new Composite(oAlgoResourceGrid, SWT.NONE);
		composite.setLayout(new GridLayout(3, false));
		gd_composite = new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1);
		gd_composite.heightHint = 70;
		gd_composite.widthHint = 98;
		composite.setLayoutData(gd_composite);
		
		buttonAddRESTClientResource = new Button(composite, SWT.NONE);
		gd_buttonAddRESTClientResource = new GridData(SWT.CENTER, SWT.CENTER, false, false, 3, 1);
		gd_buttonAddRESTClientResource.widthHint = 87;
		buttonAddRESTClientResource.setLayoutData(gd_buttonAddRESTClientResource);
		buttonAddRESTClientResource.setText("Add");
		addAddRESTClientResourceButtonListener();
		
		buttonRemoveRESTClientResource = new Button(composite, SWT.CENTER);
		GridData gd_buttonRemoveRESTClientResource = new GridData(SWT.CENTER, SWT.CENTER, false, false, 3, 1);
		gd_buttonRemoveRESTClientResource.widthHint = 85;
		buttonRemoveRESTClientResource.setLayoutData(gd_buttonRemoveRESTClientResource);
		buttonRemoveRESTClientResource.setText("Remove");
		addRemoveRESTClientResourceButtonListener();
		
		listRESTClientResources = new List(oAlgoResourceGrid, SWT.BORDER | SWT.V_SCROLL);
		gd_listRESTClientResources = new GridData(SWT.CENTER, SWT.CENTER, true, true, 1, 1);
		gd_listRESTClientResources.heightHint = 89;
		gd_listRESTClientResources.widthHint = 238;
		listRESTClientResources.setLayoutData(gd_listRESTClientResources);
		addRESTClientResourceListListener();
		
		oExternalServiceCombo = new Composite(oWizardPageGrid, SWT.NONE);
		gd_oExternalServiceCombo = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_oExternalServiceCombo.widthHint = 576;
		gd_oExternalServiceCombo.heightHint = 482;
		oExternalServiceCombo.setLayoutData(gd_oExternalServiceCombo);
		
		Label lblExternalCompositionSetup = new Label(oExternalServiceCombo, SWT.NONE);
		lblExternalCompositionSetup.setBounds(10, 5, 257, 14);
		lblExternalCompositionSetup.setText("External Composition Setup:");
		
		Label lblUrl = new Label(oExternalServiceCombo, SWT.NONE);
		lblUrl.setBounds(10, 25, 36, 14);
		lblUrl.setText("URL:");
		
		textTargetServiceURL = new Text(oExternalServiceCombo, SWT.BORDER);
		textTargetServiceURL.setBounds(50, 22, 495, 19);
		addTargetServiceURLListener();
		
		Label lblCrudVerb = new Label(oExternalServiceCombo, SWT.NONE);
		lblCrudVerb.setBounds(10, 45, 68, 14);
		lblCrudVerb.setText("CRUD Verb:");
		
		listCRUDVerb = new List(oExternalServiceCombo, SWT.BORDER | SWT.V_SCROLL);
		listCRUDVerb.setItems(new String[] {"CREATE", "READ", "UPDATE", "DELETE"});
		listCRUDVerb.setBounds(10, 60, 143, 66);
		addCRUDVerbListener();
		
		Label lblQueryParameters = new Label(oExternalServiceCombo, SWT.NONE);
		lblQueryParameters.setBounds(176, 45, 103, 14);
		lblQueryParameters.setText("Query Parameters:");
		
		listQueryParameters = new List(oExternalServiceCombo, SWT.BORDER | SWT.V_SCROLL);
		listQueryParameters.setBounds(176, 60, 159, 66);
		addQueryParameterListListener();
		
		buttonRenameQueryParameter = new Button(oExternalServiceCombo, SWT.NONE);
		buttonRenameQueryParameter.setBounds(341, 87, 95, 21);
		buttonRenameQueryParameter.setText("Rename");
		addRenameQueryParameterButtonListener();
		
		buttonCreateQueryParameter = new Button(oExternalServiceCombo, SWT.NONE);
		buttonCreateQueryParameter.setBounds(341, 45, 95, 21);
		buttonCreateQueryParameter.setText("Create");
		addCreateQueryParameterButtonListener();
		
		buttonDeleteQueryParameter = new Button(oExternalServiceCombo, SWT.NONE);
		buttonDeleteQueryParameter.setBounds(341, 66, 95, 21);
		buttonDeleteQueryParameter.setText("Delete");
		addDeleteQueryParameterButtonListener();
		
		Group groupInputRepresentation = new Group(oExternalServiceCombo, SWT.NONE);
		groupInputRepresentation.setText("Input Representation:");
		groupInputRepresentation.setBounds(20, 188, 205, 86);
		
		buttonInputJSON = new Button(groupInputRepresentation, SWT.RADIO);
		buttonInputJSON.setBounds(10, 20, 171, 18);
		buttonInputJSON.setText("Application/JSON");
		addInputJSONButtonListener();
		
		buttonInputXML = new Button(groupInputRepresentation, SWT.RADIO);
		buttonInputXML.setBounds(10, 38, 131, 18);
		buttonInputXML.setText("Application/XML");
		addInputXMLButtonListener();
		
		Label lblInputProperties = new Label(oExternalServiceCombo, SWT.NONE);
		lblInputProperties.setBounds(247, 178, 160, 14);
		lblInputProperties.setText("Input Properties");
		
		listInputProperties = new List(oExternalServiceCombo, SWT.BORDER | SWT.V_SCROLL);
		listInputProperties.setBounds(247, 198, 131, 45);
		addInputPropertiesListListener();
		
		buttonInputPropertyMultiplicity = new Button(oExternalServiceCombo, SWT.CHECK);
		buttonInputPropertyMultiplicity.setBounds(247, 249, 95, 18);
		buttonInputPropertyMultiplicity.setText("Collection");
		addInputPropertyMultiplicityButtonListener();
		
		buttonCreateInputProperty = new Button(oExternalServiceCombo, SWT.NONE);
		buttonCreateInputProperty.setBounds(384, 196, 95, 21);
		buttonCreateInputProperty.setText("Create");
		addCreateInputPropertyButtonListener();
		
		buttonDeleteInputProperty = new Button(oExternalServiceCombo, SWT.NONE);
		buttonDeleteInputProperty.setBounds(384, 217, 95, 21);
		buttonDeleteInputProperty.setText("Delete");
		addDeleteInputPropertyButtonListener();
		
		buttonRenameInputProperty = new Button(oExternalServiceCombo, SWT.NONE);
		buttonRenameInputProperty.setBounds(384, 238, 95, 21);
		buttonRenameInputProperty.setText("Rename");
		addRenameInputPropertyButtonListener();
		
		Label lblType = new Label(oExternalServiceCombo, SWT.NONE);
		lblType.setBounds(485, 178, 60, 14);
		lblType.setText("Type:");
		
		listInputPropertyType = new List(oExternalServiceCombo, SWT.BORDER | SWT.V_SCROLL);
		listInputPropertyType.setItems(new String[] {"String", "Boolean", "Integer", "Float", "Double", "Complex"});
		listInputPropertyType.setBounds(485, 198, 78, 66);
		addInputPropertyTypeListListener();
		
		buttonHasInputDataModel = new Button(oExternalServiceCombo, SWT.CHECK);
		buttonHasInputDataModel.setBounds(10, 164, 143, 18);
		buttonHasInputDataModel.setText("Input Data Model");
		addInputDataModelButtonListener();
		
		buttonHasOutputDataModel = new Button(oExternalServiceCombo, SWT.CHECK);
		buttonHasOutputDataModel.setBounds(10, 288, 160, 18);
		buttonHasOutputDataModel.setText("Output Data Model");
		addOutputDataModelButtonListener();
		
		Group groupOutputRepresentation = new Group(oExternalServiceCombo, SWT.NONE);
		groupOutputRepresentation.setText("Output Representation:");
		groupOutputRepresentation.setBounds(20, 312, 205, 86);
		
		buttonOutputJSON = new Button(groupOutputRepresentation, SWT.RADIO);
		buttonOutputJSON.setText("Application/JSON");
		buttonOutputJSON.setBounds(10, 20, 171, 18);
		addOutputJSONButtonListener();
		
		buttonOutputXML = new Button(groupOutputRepresentation, SWT.RADIO);
		buttonOutputXML.setText("Application/XML");
		buttonOutputXML.setBounds(10, 38, 131, 18);
		addOutputXMLButtonListener();
		
		Label lblOutputProperties = new Label(oExternalServiceCombo, SWT.NONE);
		lblOutputProperties.setText("Output Properties");
		lblOutputProperties.setBounds(247, 308, 160, 14);
		
		listOutputProperties = new List(oExternalServiceCombo, SWT.BORDER | SWT.V_SCROLL);
		listOutputProperties.setBounds(247, 329, 131, 45);
		addOutputPropertiesListListener();
		
		buttonOutputPropertyMultiplicity = new Button(oExternalServiceCombo, SWT.CHECK);
		buttonOutputPropertyMultiplicity.setText("Collection");
		buttonOutputPropertyMultiplicity.setBounds(247, 380, 95, 18);
		addOutputPropertyMultiplicityButtonListener();
		
		buttonCreateOutputProperty = new Button(oExternalServiceCombo, SWT.NONE);
		buttonCreateOutputProperty.setText("Create");
		buttonCreateOutputProperty.setBounds(384, 323, 95, 21);
		addCreateOutputPropertyButtonListener();
		
		buttonDeleteOutputProperty = new Button(oExternalServiceCombo, SWT.NONE);
		buttonDeleteOutputProperty.setText("Delete");
		buttonDeleteOutputProperty.setBounds(384, 344, 95, 21);
		addDeleteOutputPropertyButtonListener();
		
		buttonRenameOutputProperty = new Button(oExternalServiceCombo, SWT.NONE);
		buttonRenameOutputProperty.setText("Rename");
		buttonRenameOutputProperty.setBounds(384, 365, 95, 21);
		addRenameOutputPropertyButtonListener();
		
		Label lbOutputType = new Label(oExternalServiceCombo, SWT.NONE);
		lbOutputType.setText("Type:");
		lbOutputType.setBounds(485, 312, 60, 14);
		
		listOutputPropertyType = new List(oExternalServiceCombo, SWT.BORDER | SWT.V_SCROLL);
		listOutputPropertyType.setItems(new String[] {"String", "Boolean", "Integer", "Float", "Double", "Complex"});
		listOutputPropertyType.setBounds(485, 332, 78, 66);
		addOutputPropertyTypeListListener();
		
		buttonPersistOutput = new Button(oExternalServiceCombo, SWT.CHECK);
		buttonPersistOutput.setBounds(10, 413, 215, 18);
		buttonPersistOutput.setText("Persist Output to local database");
		persistOutputDataModelButtonListener();
		
		Label labelType = new Label(oExternalServiceCombo, SWT.NONE);
		labelType.setBounds(231, 416, 44, 14);
		labelType.setText("Type:");
		
		listPersistenceType = new List(oExternalServiceCombo, SWT.BORDER | SWT.V_SCROLL);
		listPersistenceType.setItems(new String[] {"Auto", "Existent"});
		listPersistenceType.setBounds(282, 419, 78, 39);
		addPersistenceTypeListListener();
		
		Label lblResource = new Label(oExternalServiceCombo, SWT.NONE);
		lblResource.setBounds(375, 416, 60, 14);
		lblResource.setText("Resource:");
		
		listExistentCRUDResources = new List(oExternalServiceCombo, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		listExistentCRUDResources.setBounds(441, 416, 122, 56);
		addExistentCRUDResourceListListener();
		
		Label labelSeperatorInputModel = new Label(oExternalServiceCombo, SWT.SEPARATOR | SWT.HORIZONTAL);
		labelSeperatorInputModel.setBounds(10, 280, 556, 2);
		
		Label labelSeperatorOutputModel = new Label(oExternalServiceCombo, SWT.SEPARATOR | SWT.HORIZONTAL);
		labelSeperatorOutputModel.setBounds(7, 160, 556, 2);
		
		isQueryAuthTokenButton = new Button(oExternalServiceCombo, SWT.CHECK);
		isQueryAuthTokenButton.setBounds(342, 108, 171, 18);
		isQueryAuthTokenButton.setText("Authorization Token");
		addIsQueryAuthTokenButtonListener();
		
		Label lblAuthorizationTokenFor = new Label(oExternalServiceCombo, SWT.NONE);
		lblAuthorizationTokenFor.setBounds(10, 137, 159, 14);
		lblAuthorizationTokenFor.setText("Authorization Token for URL:");
		
		textAuthTokenURL = new Text(oExternalServiceCombo, SWT.BORDER);
		textAuthTokenURL.setBounds(172, 135, 373, 19);
		addTextAuthTOkenURLListener();
		
		initializeWizardSWTs();
		  
		this.setControl(this.oWizardPageGrid);
		setPageComplete(isPageCompleted());
	}
	
	
	private void addTextAuthTOkenURLListener() {
		this.textAuthTokenURL.addModifyListener(new ModifyListener(){
			
			public void modifyText(ModifyEvent event) {
				for(int n = 0; n < oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasQueryParam().size(); n++){
					if(listQueryParameters.getSelection()[0].equalsIgnoreCase(oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasQueryParam().get(n).getName())){
						oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasQueryParam().get(n).setAuthTokenToURL(textAuthTokenURL.getText());
					}
				}
				updateWidgetStatus();
				setPageComplete(isPageCompleted());	
			}});
	}


	private void addIsQueryAuthTokenButtonListener() {
		this.isQueryAuthTokenButton.addListener(SWT.Selection, new Listener(){

		@Override
		public void handleEvent(Event event) {
			for(int n = 0; n < oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasQueryParam().size(); n++){
				if(listQueryParameters.getSelection()[0].equalsIgnoreCase(oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasQueryParam().get(n).getName())){
					oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasQueryParam().get(n).setIsAuthToken(isQueryAuthTokenButton.getSelection() == true ? true : false);
				}
			}
			updateWidgetStatus();
			setPageComplete(isPageCompleted());
		}});
	}


	private void addExistentCRUDResourceListListener() {
		this.listExistentCRUDResources.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				//create new annotated element for the Non persistent CRUD Resource
				AnnCRUDResource oAnnCRUDResource = oExternalServiceLayerCIMFactory.createAnnCRUDResource();
				oAnnCRUDResource.setAnnotatesCRUDResource(oRESTfulServiceCIM.getHasResources().get(getCRUDResourceIndexByName(listExistentCRUDResources.getSelection()[0])));
				((ExistentCRUDPersistentOutput) oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasOutputDataModel()).setIsExistentCRUDPersistentOutput(oAnnCRUDResource);
				populateAllRESTClientSWTs(listRESTClientResources.getSelection()[0]);
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				//create new annotated element for the Non persistent CRUD Resource
				AnnCRUDResource oAnnCRUDResource = oExternalServiceLayerCIMFactory.createAnnCRUDResource();
				oAnnCRUDResource.setAnnotatesCRUDResource(oRESTfulServiceCIM.getHasResources().get(getCRUDResourceIndexByName(listExistentCRUDResources.getSelection()[0])));
				((ExistentCRUDPersistentOutput) oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasOutputDataModel()).setIsExistentCRUDPersistentOutput(oAnnCRUDResource);
				populateAllRESTClientSWTs(listRESTClientResources.getSelection()[0]);
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


	private void addPersistenceTypeListListener() {
		this.listPersistenceType.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				//change the persistence type of the selected RESTClientResource
				listExistentCRUDResources.removeAll();
				if(listPersistenceType.getSelection()[0].equalsIgnoreCase("Auto")){//then this output model will be automatically persisted
					convertOutputToAutoPersistent(listRESTClientResources.getSelection()[0]);
				}
				else{//else it will be persisted through an existing CRUD Resource Model
					convertOutputToExistentCRUDPersistent(listRESTClientResources.getSelection()[0]);
					//populate the list of Existing CRUDResources
					ArrayList<String> listOfStrings = new ArrayList<String>();
					
					for(int n = 0; n < oRESTfulServiceCIM.getHasResources().size(); n++){
						if(oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() == false){
							listOfStrings.add(oRESTfulServiceCIM.getHasResources().get(n).getName());
						}
					}
					
					java.util.Collections.sort(listOfStrings, Collator.getInstance());
					Iterator<String> iterator = listOfStrings.iterator();
					
					while(iterator.hasNext()){
						listExistentCRUDResources.add(iterator.next());
					}
				}
				populateAllRESTClientSWTs(listRESTClientResources.getSelection()[0]);
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				//change the persistence type of the selected RESTClientResource
				listExistentCRUDResources.removeAll();
				if(listPersistenceType.getSelection()[0].equalsIgnoreCase("Auto")){//then this output model will be automatically persisted
					convertOutputToAutoPersistent(listRESTClientResources.getSelection()[0]);
				}
				else{//else it will be persisted through an existing CRUD Resource Model
					convertOutputToExistentCRUDPersistent(listRESTClientResources.getSelection()[0]);
					//populate the list of Existing CRUDResources
					ArrayList<String> listOfStrings = new ArrayList<String>();
					
					for(int n = 0; n < oRESTfulServiceCIM.getHasResources().size(); n++){
						if(oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() == false){
							listOfStrings.add(oRESTfulServiceCIM.getHasResources().get(n).getName());
						}
					}
					
					java.util.Collections.sort(listOfStrings, Collator.getInstance());
					Iterator<String> iterator = listOfStrings.iterator();
					
					while(iterator.hasNext()){
						listExistentCRUDResources.add(iterator.next());
					}
				}
				populateAllRESTClientSWTs(listRESTClientResources.getSelection()[0]);
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}


	private void addOutputPropertyTypeListListener() {
		this.listOutputPropertyType.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				//change the type of the selected property
				oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(getOutputPropertyIndexByName(listRESTClientResources.getSelection()[0], listOutputProperties.getSelection()[0])).setType(listOutputPropertyType.getSelection()[0]);
				oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(getOutputPropertyIndexByName(listRESTClientResources.getSelection()[0], listOutputProperties.getSelection()[0])).setHasPrimitiveType(isPrimitiveDataType(listOutputPropertyType.getSelection()[0]));
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				//change the type of the selected property
				oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(getOutputPropertyIndexByName(listRESTClientResources.getSelection()[0], listOutputProperties.getSelection()[0])).setType(listOutputPropertyType.getSelection()[0]);
				oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(getOutputPropertyIndexByName(listRESTClientResources.getSelection()[0], listOutputProperties.getSelection()[0])).setHasPrimitiveType(isPrimitiveDataType(listOutputPropertyType.getSelection()[0]));
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}


	private void addRenameOutputPropertyButtonListener() {
		this.buttonRenameOutputProperty.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				//rename an existing Output Model Property 
				Shell oShell = new Shell(SWT.ON_TOP | SWT.SYSTEM_MODAL | SWT.NO_TRIM | SWT.RESIZE);
				oShell.setSize(0,0);
				SimpleDialogBox oSimpleDialogBox = new SimpleDialogBox(oShell, "output model property", oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().
						getHasOutputDataModel().getHasOutputProperties().get(getOutputPropertyIndexByName(listRESTClientResources.getSelection()[0], listOutputProperties.getSelection()[0]))
						.getName());
				if(oSimpleDialogBox.open() == Window.OK){
					oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().
					getHasOutputDataModel().getHasOutputProperties().get(getOutputPropertyIndexByName(listRESTClientResources.getSelection()[0], listOutputProperties.getSelection()[0]))
					.setName(oSimpleDialogBox.getArtefactName());
					listOutputProperties.removeAll();
					populateAllRESTClientSWTs(listRESTClientResources.getSelection()[0]);
				}
				oSimpleDialogBox.close();
				oShell.close();
				
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}


	private void addDeleteOutputPropertyButtonListener() {
		this.buttonDeleteOutputProperty.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				//delete an existing Output Model Property 
				oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasOutputDataModel().getHasOutputProperties().remove(getOutputPropertyIndexByName(listRESTClientResources.getSelection()[0], listOutputProperties.getSelection()[0]));
				listOutputProperties.removeAll();
				populateAllRESTClientSWTs(listRESTClientResources.getSelection()[0]);
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}


	private void addCreateOutputPropertyButtonListener() {
		this.buttonCreateOutputProperty.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				//create a new Output Model Property 
				Shell oShell = new Shell(SWT.ON_TOP | SWT.SYSTEM_MODAL | SWT.NO_TRIM | SWT.RESIZE);
				oShell.setSize(0,0);
				SimpleDialogBox oSimpleDialogBox = new SimpleDialogBox(oShell, "output model property", "outputPropertyName");
				if(oSimpleDialogBox.open() == Window.OK){
					ModelProperty oOutputProperty = oExternalServiceLayerCIMFactory.createModelProperty();
					oOutputProperty.setName(oSimpleDialogBox.getArtefactName());
					oOutputProperty.setIsUnique(true);
					oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasOutputDataModel().getHasOutputProperties().add(oOutputProperty);
					listOutputProperties.add(oOutputProperty.getName());
				}
				oSimpleDialogBox.close();
				oShell.close();
				
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}


	private void addOutputPropertyMultiplicityButtonListener() {
		this.buttonOutputPropertyMultiplicity.addListener(SWT.Selection, new Listener(){

		@Override
		public void handleEvent(Event event) {
			if(buttonOutputPropertyMultiplicity.getSelection() == true){//if the developer checked the multiplicity button
				//change the selected properties multiplicity to array
				oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(getOutputPropertyIndexByName(listRESTClientResources.getSelection()[0], listOutputProperties.getSelection()[0])).setIsUnique(false);
			}
			else{//otherwirse, the developer deselected it and it takes a single value
				oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(getOutputPropertyIndexByName(listRESTClientResources.getSelection()[0], listOutputProperties.getSelection()[0])).setIsUnique(true);
			}
			updateWidgetStatus();
			setPageComplete(isPageCompleted());
		}});
	}


	private void addOutputPropertiesListListener() {
		this.listOutputProperties.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				//update the multiplicity SWT of the selected property
				if(oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(getOutputPropertyIndexByName(listRESTClientResources.getSelection()[0], listOutputProperties.getSelection()[0])).isIsUnique() == true){
					buttonOutputPropertyMultiplicity.setSelection(false);
				}
				else{
					buttonOutputPropertyMultiplicity.setSelection(true);
				}
				
				//update the datatype multiplicity SWT of the selected property
				if(oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(getOutputPropertyIndexByName(listRESTClientResources.getSelection()[0], listOutputProperties.getSelection()[0])).getType() != null){
					listOutputPropertyType.setSelection(listOutputPropertyType.indexOf(oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(getOutputPropertyIndexByName(listRESTClientResources.getSelection()[0], listOutputProperties.getSelection()[0])).getType()));
				}
				else{
					listOutputPropertyType.deselectAll();
				}
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}


	private void addOutputXMLButtonListener() {
		this.buttonOutputXML.addListener(SWT.Selection, new Listener(){

		@Override
		public void handleEvent(Event event) {
			oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasOutputDataModel().getHasOutputRepresentation().setName("APPLICATION_XML");
			updateWidgetStatus();
			setPageComplete(isPageCompleted());
		}});
	}


	private void addOutputJSONButtonListener() {
		this.buttonOutputJSON.addListener(SWT.Selection, new Listener(){

		@Override
		public void handleEvent(Event event) {
			oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasOutputDataModel().getHasOutputRepresentation().setName("APPLICATION_JSON");
			updateWidgetStatus();
			setPageComplete(isPageCompleted());
		}});
	}


	private void addInputPropertyTypeListListener() {
		this.listInputPropertyType.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				//change the type of the selected property
				oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasInputDataModel().getHasInputProperties().get(getInputPropertyIndexByName(listRESTClientResources.getSelection()[0], listInputProperties.getSelection()[0])).setType(listInputPropertyType.getSelection()[0]);
				if(listInputPropertyType.getSelection()[0].equalsIgnoreCase("complex")){
					oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasInputDataModel().getHasInputProperties().get(getInputPropertyIndexByName(listRESTClientResources.getSelection()[0], listInputProperties.getSelection()[0])).setHasPrimitiveType(false);
				}
				else{
					oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasInputDataModel().getHasInputProperties().get(getInputPropertyIndexByName(listRESTClientResources.getSelection()[0], listInputProperties.getSelection()[0])).setHasPrimitiveType(true);
				}
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				//change the type of the selected property
				oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasInputDataModel().getHasInputProperties().get(getInputPropertyIndexByName(listRESTClientResources.getSelection()[0], listInputProperties.getSelection()[0])).setType(listInputPropertyType.getSelection()[0]);
				if(listInputPropertyType.getSelection()[0].equalsIgnoreCase("complex")){
					oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasInputDataModel().getHasInputProperties().get(getInputPropertyIndexByName(listRESTClientResources.getSelection()[0], listInputProperties.getSelection()[0])).setHasPrimitiveType(false);
				}
				else{
					oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasInputDataModel().getHasInputProperties().get(getInputPropertyIndexByName(listRESTClientResources.getSelection()[0], listInputProperties.getSelection()[0])).setHasPrimitiveType(true);
				}
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}


	private void addInputPropertiesListListener() {
		this.listInputProperties.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				//update the multiplicity SWT of the selected property
				if(oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasInputDataModel().getHasInputProperties().get(getInputPropertyIndexByName(listRESTClientResources.getSelection()[0], listInputProperties.getSelection()[0])).isIsUnique() == true){
					buttonInputPropertyMultiplicity.setSelection(false);
				}
				else{
					buttonInputPropertyMultiplicity.setSelection(true);
				}
				
				//update the datatype multiplicity SWT of the selected property
				if(oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasInputDataModel().getHasInputProperties().get(getInputPropertyIndexByName(listRESTClientResources.getSelection()[0], listInputProperties.getSelection()[0])).getType() != null){
					listInputPropertyType.setSelection(listInputPropertyType.indexOf(oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasInputDataModel().getHasInputProperties().get(getInputPropertyIndexByName(listRESTClientResources.getSelection()[0], listInputProperties.getSelection()[0])).getType()));
				}
				else{
					listInputPropertyType.deselectAll();
				}
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}


	private void addRenameInputPropertyButtonListener() {
		this.buttonRenameInputProperty.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				//rename an existing Input Model Property 
				Shell oShell = new Shell(SWT.ON_TOP | SWT.SYSTEM_MODAL | SWT.NO_TRIM | SWT.RESIZE);
				oShell.setSize(0,0);
				SimpleDialogBox oSimpleDialogBox = new SimpleDialogBox(oShell, "input model property", oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().
						getHasInputDataModel().getHasInputProperties().get(getInputPropertyIndexByName(listRESTClientResources.getSelection()[0], listInputProperties.getSelection()[0]))
						.getName());
				if(oSimpleDialogBox.open() == Window.OK){
					oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().
					getHasInputDataModel().getHasInputProperties().get(getInputPropertyIndexByName(listRESTClientResources.getSelection()[0], listInputProperties.getSelection()[0]))
					.setName(oSimpleDialogBox.getArtefactName());
					listInputProperties.removeAll();
					populateAllRESTClientSWTs(listRESTClientResources.getSelection()[0]);
				}
				oSimpleDialogBox.close();
				oShell.close();
				
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}


	private int getInputPropertyIndexByName(String strAlgoResourceName, String strInputPropertyName) {
		for(int n = 0; n < this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasInputDataModel().getHasInputProperties().size(); n++){
			if(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasInputDataModel().getHasInputProperties().get(n).getName().equalsIgnoreCase(strInputPropertyName)){
				return n;
			}
		}
		try {
			throw new ExecutionException(new Throwable());
		} catch (ExecutionException e) {
			Activator.log("Unable to find input property index by name " + strInputPropertyName, e);
			return -1;
		}
	}
	
	private int getOutputPropertyIndexByName(String strAlgoResourceName, String strOutputPropertyName){
		for(int n = 0; n < this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasOutputDataModel().getHasOutputProperties().size(); n++){
			if(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(n).getName().equalsIgnoreCase(strOutputPropertyName)){
				return n;
			}
		}
		try {
			throw new ExecutionException(new Throwable());
		} catch (ExecutionException e) {
			Activator.log("Unable to find output property index by name " + strOutputPropertyName, e);
			return -1;
		}
	}
	
	private void addDeleteInputPropertyButtonListener() {
		this.buttonDeleteInputProperty.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				//delete an existing Input Model Property 
				oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasInputDataModel().getHasInputProperties().remove(getInputPropertyIndexByName(listRESTClientResources.getSelection()[0], listInputProperties.getSelection()[0]));
				listInputProperties.removeAll();
				populateAllRESTClientSWTs(listRESTClientResources.getSelection()[0]);
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}


	private void addCreateInputPropertyButtonListener() {
		this.buttonCreateInputProperty.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				//create a new Input Model Property 
				Shell oShell = new Shell(SWT.ON_TOP | SWT.SYSTEM_MODAL | SWT.NO_TRIM | SWT.RESIZE);
				oShell.setSize(0,0);
				SimpleDialogBox oSimpleDialogBox = new SimpleDialogBox(oShell, "input model property", "inputPropertyName");
				if(oSimpleDialogBox.open() == Window.OK){
					ModelProperty oInputProperty = oExternalServiceLayerCIMFactory.createModelProperty();
					oInputProperty.setName(oSimpleDialogBox.getArtefactName());
					oInputProperty.setIsUnique(true);
					oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasInputDataModel().getHasInputProperties().add(oInputProperty);
					listInputProperties.add(oInputProperty.getName());
				}
				oSimpleDialogBox.close();
				oShell.close();
				
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}


	private void addInputPropertyMultiplicityButtonListener() {
		this.buttonInputPropertyMultiplicity.addListener(SWT.Selection, new Listener(){

		@Override
		public void handleEvent(Event event) {
			if(buttonInputPropertyMultiplicity.getSelection() == true){//if the developer checked the multiplicity button
				//change the selected properties multiplicity to array
				oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasInputDataModel().getHasInputProperties().get(getInputPropertyIndexByName(listRESTClientResources.getSelection()[0], listInputProperties.getSelection()[0])).setIsUnique(false);
			}
			else{//otherwirse, the developer deselected it and it takes a single value
				oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasInputDataModel().getHasInputProperties().get(getInputPropertyIndexByName(listRESTClientResources.getSelection()[0], listInputProperties.getSelection()[0])).setIsUnique(true);
			}
			updateWidgetStatus();
			setPageComplete(isPageCompleted());
		}});
	}


	private void addInputXMLButtonListener() {
		this.buttonInputXML.addListener(SWT.Selection, new Listener(){

		@Override
		public void handleEvent(Event event) {
			oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasInputDataModel().getHasInputRepresentation().setName("APPLICATION_XML");
			updateWidgetStatus();
			setPageComplete(isPageCompleted());
		}});
	}


	private void addInputJSONButtonListener() {
		this.buttonInputJSON.addListener(SWT.Selection, new Listener(){

		@Override
		public void handleEvent(Event event) {
			oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasInputDataModel().getHasInputRepresentation().setName("APPLICATION_JSON");
			updateWidgetStatus();
			setPageComplete(isPageCompleted());
		}});
	}


	private void addQueryParameterListListener() {
		this.listQueryParameters.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				for(int n = 0; n < oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasQueryParam().size(); n++){
					if(listQueryParameters.getSelection()[0].equalsIgnoreCase(oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasQueryParam().get(n).getName())){
						isQueryAuthTokenButton.setSelection(oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasQueryParam().get(n).isIsAuthToken() == true ? true : false);
						textAuthTokenURL.setText(oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasQueryParam().get(n).getAuthTokenToURL() == null ? "" : oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasQueryParam().get(n).getAuthTokenToURL());
					}
				}
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				for(int n = 0; n < oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasQueryParam().size(); n++){
					if(listQueryParameters.getSelection()[0].equalsIgnoreCase(oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasQueryParam().get(n).getName())){
						isQueryAuthTokenButton.setSelection(oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasQueryParam().get(n).isIsAuthToken() == true ? true : false);
						textAuthTokenURL.setText(oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasQueryParam().get(n).getAuthTokenToURL() == null ? "" : oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasQueryParam().get(n).getAuthTokenToURL());
					}
				}
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}


	private void addDeleteQueryParameterButtonListener() {
		this.buttonDeleteQueryParameter.addListener(SWT.Selection, new Listener(){

		@Override
		public void handleEvent(Event event) {
			//delete an existing Query Parameter
			oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService()
					.getHasQueryParam().remove(findQueryParmIndexByName(listRESTClientResources.getSelection()[0],listQueryParameters.getSelection()[0]));
			listQueryParameters.removeAll();
			populateTargetServiceSWTs(listRESTClientResources.getSelection()[0]);
			updateWidgetStatus();
			setPageComplete(isPageCompleted());
		}});
	}


	private void addCreateQueryParameterButtonListener() {
		this.buttonCreateQueryParameter.addListener(SWT.Selection, new Listener(){

		@Override
		public void handleEvent(Event event) {
			//create a new Query Parameter
			Shell oShell = new Shell(SWT.ON_TOP | SWT.SYSTEM_MODAL | SWT.NO_TRIM | SWT.RESIZE);
			oShell.setSize(0,0);
			SimpleDialogBox oSimpleDialogBox = new SimpleDialogBox(oShell, "query parameter", "queryParameterName");
			if(oSimpleDialogBox.open() == Window.OK){
				QueryParam oQueryParam = oExternalServiceLayerCIMFactory.createQueryParam();
				oQueryParam.setName(oSimpleDialogBox.getArtefactName());
				oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().getHasQueryParam().add(oQueryParam);
				listQueryParameters.add(oQueryParam.getName());
			}
			oSimpleDialogBox.close();
			oShell.close();
			
			updateWidgetStatus();
			setPageComplete(isPageCompleted());
		}});
	}


	private void addRenameQueryParameterButtonListener() {
		this.buttonRenameQueryParameter.addListener(SWT.Selection, new Listener(){

		@Override
		public void handleEvent(Event event) {
			//rename an existing Query Parameter
			Shell oShell = new Shell(SWT.ON_TOP | SWT.SYSTEM_MODAL | SWT.NO_TRIM | SWT.RESIZE);
			oShell.setSize(0,0);
			SimpleDialogBox oSimpleDialogBox = new SimpleDialogBox(oShell, "query parameter", oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService()
					.getHasQueryParam().get(findQueryParmIndexByName(listRESTClientResources.getSelection()[0],listQueryParameters.getSelection()[0]))
					.getName());
			if(oSimpleDialogBox.open() == Window.OK){
				oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService()
					.getHasQueryParam().get(findQueryParmIndexByName(listRESTClientResources.getSelection()[0],listQueryParameters.getSelection()[0]))
					.setName(oSimpleDialogBox.getArtefactName());
				listQueryParameters.removeAll();
				
			}
			oSimpleDialogBox.close();
			oShell.close();
			
			populateTargetServiceSWTs(listRESTClientResources.getSelection()[0]);
			updateWidgetStatus();
			setPageComplete(isPageCompleted());
		}});
	}

	private int findQueryParmIndexByName(String strAlgoResourceName, String strQueryParameterName) {
		for(int n = 0; n < this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasQueryParam().size(); n++){
			if(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasQueryParam().get(n).getName().equalsIgnoreCase(strQueryParameterName)){
				return n;
			}
		}
		try {
			throw new ExecutionException(new Throwable());
		} catch (ExecutionException e) {
			Activator.log("Unable to find query param index by name " + strQueryParameterName, e);
			return -1;
		}
	}

	private void addCRUDVerbListener() {
		this.listCRUDVerb.addSelectionListener(new SelectionListener(){

		@Override
		public void widgetSelected(SelectionEvent e) {
			//update the CRUDVerb of the target service of the selected RESTClient Resource
			oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().setCRUDVerb(listCRUDVerb.getSelection()[0]);
			updateWidgetStatus();
			setPageComplete(isPageCompleted());
		}

		@Override
		public void widgetDefaultSelected(SelectionEvent e) {
			//update the CRUDVerb of the target service of the selected RESTClient Resource
			oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().setCRUDVerb(listCRUDVerb.getSelection()[0]);
			updateWidgetStatus();
			setPageComplete(isPageCompleted());
		}});
	}


	private void addTargetServiceURLListener() {
		
		this.textTargetServiceURL.addModifyListener(new ModifyListener(){
			
			public void modifyText(ModifyEvent event) {
				oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().setTargetURL(textTargetServiceURL.getText());
				updateWidgetStatus();
				setPageComplete(isPageCompleted());	
			}});
	}

	private void persistOutputDataModelButtonListener() {
		this.buttonPersistOutput.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				if(buttonPersistOutput.getSelection() == true){
					convertOutputToAutoPersistent(listRESTClientResources.getSelection()[0]);
				}
				else{
					convertOutputToNonPersistent(listRESTClientResources.getSelection()[0]);
				}
				populateAllRESTClientSWTs(listRESTClientResources.getSelection()[0]);
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}


	private void convertOutputToAutoPersistent(String strAlgoResourceName) {
		int iRESTClientIndex = this.getAlgoResourceIndexByName(strAlgoResourceName);
		AutoPersistentOutput oAutoPersistentOutput = this.oExternalServiceLayerCIMFactory.createAutoPersistentOutput();
		oAutoPersistentOutput.setHasOutputRepresentation(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel().getHasOutputRepresentation());
		oAutoPersistentOutput.getHasOutputProperties().addAll(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel().getHasOutputProperties());
		this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().setHasOutputDataModel(oAutoPersistentOutput);
	}
	
	private void convertOutputToNonPersistent(String strAlgoResourceName) {
		int iRESTClientIndex = this.getAlgoResourceIndexByName(strAlgoResourceName);
		NonPersistentOutput oNonPersistentOutput = this.oExternalServiceLayerCIMFactory.createNonPersistentOutput();
		oNonPersistentOutput.setHasOutputRepresentation(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel().getHasOutputRepresentation());
		oNonPersistentOutput.getHasOutputProperties().addAll(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel().getHasOutputProperties());
		this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().setHasOutputDataModel(oNonPersistentOutput);
	}
	
	private void convertOutputToExistentCRUDPersistent(String strAlgoResourceName) {
		int iRESTClientIndex = this.getAlgoResourceIndexByName(strAlgoResourceName);
		ExistentCRUDPersistentOutput oExistentCRUDPersistentOutput = this.oExternalServiceLayerCIMFactory.createExistentCRUDPersistentOutput();
		oExistentCRUDPersistentOutput.setHasOutputRepresentation(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel().getHasOutputRepresentation());
		oExistentCRUDPersistentOutput.getHasOutputProperties().addAll(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel().getHasOutputProperties());
		this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().setHasOutputDataModel(oExistentCRUDPersistentOutput);
	}
	
	private void addOutputDataModelButtonListener() {
		this.buttonHasOutputDataModel.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				if(buttonHasOutputDataModel.getSelection() == true){ //if it checked, create an Output Data Model
					NonPersistentOutput oNonPersistentOutput = oExternalServiceLayerCIMFactory.createNonPersistentOutput();
					Representation oRepresentation = oExternalServiceLayerCIMFactory.createRepresentation();
					oRepresentation.setName("");
					oNonPersistentOutput.setHasOutputRepresentation(oRepresentation);
					oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().setHasOutputDataModel(oNonPersistentOutput);
				}
				else{//else the developer deselected it, so delete it
					oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().setHasOutputDataModel(null);
				}
				populateAllRESTClientSWTs(listRESTClientResources.getSelection()[0]);
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}


	private void addInputDataModelButtonListener() {
		this.buttonHasInputDataModel.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				if(buttonHasInputDataModel.getSelection() == true){ //if it checked, create an Input Data Model
					InputDataModel oInputDataModel = oExternalServiceLayerCIMFactory.createInputDataModel();
					Representation oRepresentation = oExternalServiceLayerCIMFactory.createRepresentation();
					oRepresentation.setName("");
					oInputDataModel.setHasInputRepresentation(oRepresentation);
					oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().setHasInputDataModel(oInputDataModel);
				}
				else{//else the developer deselected it, so delete it
					oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])].getTargetsService().setHasInputDataModel(null);
				}
				populateAllRESTClientSWTs(listRESTClientResources.getSelection()[0]);
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}


	private void addRemoveRESTClientResourceButtonListener() {
		this.buttonRemoveRESTClientResource.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				oRESTClientResourcesArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])] = false;
				oRESTClientModelingArray[getAlgoResourceIndexByName(listRESTClientResources.getSelection()[0])] = null;
				listAvailableResources.add(listRESTClientResources.getSelection()[0]);
				populateRESTClientResourcesList();
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
				//update also the RESTClient List of the ComplexDataType Wizard page
				updateComplexDataTypeRESTClientList();
			}});
	}


	protected void populateRESTClientResourcesList() {
		this.listRESTClientResources.removeAll();
		ArrayList<String> listOfStrings = new ArrayList<String>();
		
		for(int n = 0 ; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if((this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() == true) &&
					(isRESTClientResource(this.oRESTfulServiceCIM.getHasResources().get(n).getName()))){
				listOfStrings.add(this.oRESTfulServiceCIM.getHasResources().get(n).getName());
			}
		}
		
		java.util.Collections.sort(listOfStrings, Collator.getInstance());
		Iterator<String> iterator = listOfStrings.iterator();
		
		while(iterator.hasNext()){
			this.listRESTClientResources.add(iterator.next());
		}
	}


	private void addRESTClientResourceListListener() {
		this.listRESTClientResources.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				populateAllRESTClientSWTs(listRESTClientResources.getSelection()[0]);
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				populateAllRESTClientSWTs(listRESTClientResources.getSelection()[0]);
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}


	private void populateAllRESTClientSWTs(String strAlgoResourceName) {
		populateTargetServiceSWTs(strAlgoResourceName);
		populateInputModelSWTs(strAlgoResourceName);
		populateOutputModelSWTs(strAlgoResourceName);
		
	}

	private void populateOutputModelSWTs(String strAlgoResourceName) {
		if(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasOutputDataModel() != null){
			this.buttonHasOutputDataModel.setSelection(true);
			
			//populate the output representation
			if(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasOutputDataModel().getHasOutputRepresentation() != null){
				if(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasOutputDataModel().getHasOutputRepresentation().getName().equalsIgnoreCase("APPLICATION_JSON")){
					this.buttonOutputJSON.setSelection(true);
					this.buttonOutputXML.setSelection(false);
				}
				else if(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasOutputDataModel().getHasOutputRepresentation().getName().equalsIgnoreCase("APPLICATION_XML")){
					this.buttonOutputXML.setSelection(true);
					this.buttonOutputJSON.setSelection(false);
				}
				else{
					this.buttonOutputJSON.setSelection(false);
					this.buttonOutputXML.setSelection(false);
				}
			}
			else{
				this.buttonOutputJSON.setSelection(false);
				this.buttonOutputXML.setSelection(false);
			}
			
			//populate the output model parameters list
			if(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasOutputDataModel().getHasOutputProperties().size() > 0){
				this.listOutputProperties.removeAll();
				this.listOutputPropertyType.deselectAll();
				ArrayList<String> listOfStrings = new ArrayList<String>();
				
				for(int n = 0; n < this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasOutputDataModel().getHasOutputProperties().size(); n++){
					listOfStrings.add(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(n).getName());
				}
				
				java.util.Collections.sort(listOfStrings, Collator.getInstance());
				Iterator<String> iterator = listOfStrings.iterator();
				
				while(iterator.hasNext()){
					this.listOutputProperties.add(iterator.next());
				}
			}
			else{
				this.listOutputProperties.removeAll();
				this.listOutputPropertyType.deselectAll();
			}
		}
		else{
			this.buttonHasOutputDataModel.setSelection(false);
			this.buttonOutputJSON.setSelection(false);
			this.buttonOutputXML.setSelection(false);
			this.buttonOutputPropertyMultiplicity.setSelection(false);
			this.listOutputProperties.removeAll();
			this.listOutputPropertyType.deselectAll();
			this.buttonPersistOutput.setEnabled(false);
			this.listPersistenceType.deselectAll();
			this.listPersistenceType.setEnabled(false);
			this.listExistentCRUDResources.removeAll();
		}
		populatePersistenceSWTs(strAlgoResourceName);
	}


	private void populatePersistenceSWTs(String strAlgoResourceName) {
		if(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasOutputDataModel() instanceof AutoPersistentOutput||
		   this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasOutputDataModel() instanceof ExistentCRUDPersistentOutput){
			this.buttonPersistOutput.setSelection(true);
			if(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasOutputDataModel() instanceof ExistentCRUDPersistentOutput){
				this.listPersistenceType.setSelection(1); //existing CRUD
				//populate existing CRUD Resources list
				this.listExistentCRUDResources.removeAll();
				ArrayList<String> listOfStrings = new ArrayList<String>();
				
				for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
					if(this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() == false){
						listOfStrings.add(this.oRESTfulServiceCIM.getHasResources().get(n).getName());
					}
				}
				
				java.util.Collections.sort(listOfStrings, Collator.getInstance());
				Iterator<String> iterator = listOfStrings.iterator();
				
				while(iterator.hasNext()){
					this.listExistentCRUDResources.add(iterator.next());
				}
				
				ExistentCRUDPersistentOutput oExistentCRUDPersistentOutput = (ExistentCRUDPersistentOutput)this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasOutputDataModel();
				if(oExistentCRUDPersistentOutput.getIsExistentCRUDPersistentOutput() != null){
					this.listExistentCRUDResources.setSelection(this.listExistentCRUDResources.indexOf(oExistentCRUDPersistentOutput.getIsExistentCRUDPersistentOutput().getAnnotatesCRUDResource().getName()));
				}
			}
			else{
				this.listPersistenceType.setSelection(0); //auto
				this.listExistentCRUDResources.removeAll();
			}
		}
		else{
			this.buttonPersistOutput.setEnabled(false);
			this.buttonPersistOutput.setSelection(false);
			this.listPersistenceType.deselectAll();
			this.listPersistenceType.setEnabled(false);
			this.listExistentCRUDResources.removeAll();
			this.listExistentCRUDResources.setEnabled(false);
		}
		
	}


	private void populateInputModelSWTs(String strAlgoResourceName) {
		if(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasInputDataModel() != null){
			this.buttonHasInputDataModel.setSelection(true);
			
			//populate the input representation
			if(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasInputDataModel().getHasInputRepresentation() != null){
				if(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasInputDataModel().getHasInputRepresentation().getName().equalsIgnoreCase("APPLICATION_JSON")){
					this.buttonInputJSON.setSelection(true);
					this.buttonInputXML.setSelection(false);
				}
				else if(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasInputDataModel().getHasInputRepresentation().getName().equalsIgnoreCase("APPLICATION_XML")){
					this.buttonInputXML.setSelection(true);
					this.buttonInputJSON.setSelection(false);
				}
				else{
					this.buttonInputJSON.setSelection(false);
					this.buttonInputXML.setSelection(false);
				}
			}
			else{
				this.buttonInputJSON.setSelection(false);
				this.buttonInputXML.setSelection(false);
			}
			
			//populate the input model parameters list
			if(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasInputDataModel().getHasInputProperties().size() > 0){
				this.listInputProperties.removeAll();
				this.listInputPropertyType.deselectAll();
				ArrayList<String> listOfStrings = new ArrayList<String>();
				
				for(int n = 0; n < this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasInputDataModel().getHasInputProperties().size(); n++){
					listOfStrings.add(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService().getHasInputDataModel().getHasInputProperties().get(n).getName());
				}
				
				java.util.Collections.sort(listOfStrings, Collator.getInstance());
				Iterator<String> iterator = listOfStrings.iterator();
				
				while(iterator.hasNext()){
					this.listInputProperties.add(iterator.next());
				}
			}
			else{
				this.listInputProperties.removeAll();
				this.listInputPropertyType.deselectAll();
			}
		}
		else{
			this.buttonHasInputDataModel.setSelection(false);
			this.buttonInputJSON.setSelection(false);
			this.buttonInputXML.setSelection(false);
			this.buttonInputPropertyMultiplicity.setSelection(false);
			this.listInputProperties.removeAll();
			this.listInputPropertyType.deselectAll();
		}
	}


	private void populateTargetServiceSWTs(String strAlgoResourceName) {
		if(this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService() != null){
			TargetRESTService oTargetRESTService = this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strAlgoResourceName)].getTargetsService();
			
			//set up the target service URL
			this.textTargetServiceURL.setText(oTargetRESTService.getTargetURL());
			//set up the CRUD Verb to be used
			if(oTargetRESTService.getCRUDVerb() != null){
				this.listCRUDVerb.setSelection(this.listCRUDVerb.indexOf(oTargetRESTService.getCRUDVerb().toUpperCase()));
			}
			else{
				this.listCRUDVerb.deselectAll();
			}
			
			//set up the query parameters list
			this.listQueryParameters.removeAll();
			ArrayList<String> listOfStrings = new ArrayList<String>();
			
			if(oTargetRESTService.getHasQueryParam() != null){
				for(int n = 0; n < oTargetRESTService.getHasQueryParam().size(); n++){
					listOfStrings.add(oTargetRESTService.getHasQueryParam().get(n).getName());
				}
			}
			
			java.util.Collections.sort(listOfStrings, Collator.getInstance());
			Iterator<String> iterator = listOfStrings.iterator();
			
			while(iterator.hasNext()){
				this.listQueryParameters.add(iterator.next());
			}
		}
		else{
			this.textTargetServiceURL.setText("");
			this.listCRUDVerb.deselectAll();
			this.listQueryParameters.removeAll();
		}
	}


	private void addAddRESTClientResourceButtonListener() {
		this.buttonAddRESTClientResource.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				oRESTClientResourcesArray[getAlgoResourceIndexByName(listAvailableResources.getSelection()[0])] = true;
				listRESTClientResources.add(listAvailableResources.getSelection()[0]);
				populateRESTClientResource(listAvailableResources.getSelection()[0]);
				populateAvailableResourcesList();
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
				//update also the RESTClient list of the next page
				updateComplexDataTypeRESTClientList();
			}});
	}
	

	private void updateComplexDataTypeRESTClientList() {
		this.oComplexDataTypeWizardPage.getRESTClientResourcesList().removeAll();
		for(int n = 0; n < this.oRESTClientResourcesArray.length; n++){
			if(this.oRESTClientResourcesArray[n] == true){
				this.oComplexDataTypeWizardPage.getRESTClientResourcesList().add(this.oRESTClientModelingArray[n].getIsRESTClientResource().getAnnotatesAlgoResource().getName());
			}
		}
	}

	private void populateRESTClientResource(String strCoreResourceName) {
		//create an AnnAlgoResource
		AnnAlgoResource oAnnAlgoResource = this.oExternalServiceLayerCIMFactory.createAnnAlgoResource();
		
		//associate it with the core CIM algo Resource
		oAnnAlgoResource.setAnnotatesAlgoResource(findCoreCIMResourceReference(strCoreResourceName));
		
		//create the RESTClientResource
		RESTClientResource oRESTClientResource = this.oExternalServiceLayerCIMFactory.createRESTClientResource();
		
		//associate it with the AnnAlgoResource
		oRESTClientResource.setIsRESTClientResource(oAnnAlgoResource);
		
		//create the Target REST Service annotation
		TargetRESTService oTargetRESTService = oExternalServiceLayerCIMFactory.createTargetRESTService();
		oTargetRESTService.setTargetURL("");
		
		this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strCoreResourceName)] = oRESTClientResource;
		this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(strCoreResourceName)].setTargetsService(oTargetRESTService);

	}
	
	private Resource findCoreCIMResourceReference(String strCoreResourceName) {
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).getName().equalsIgnoreCase(strCoreResourceName)){
				return this.oRESTfulServiceCIM.getHasResources().get(n);
			}
		}
		try {
			throw new ExecutionException(new Throwable());
		} catch (ExecutionException e) {
			Activator.log("Unable to find core CIM resource reference by name " + strCoreResourceName, e);
			return null;
		}
	}


	private void populateAvailableResourcesList(){
		this.listAvailableResources.removeAll();
		ArrayList<String> listOfStrings = new ArrayList<String>();
		
		for(int n = 0 ; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if((this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() == true) && !isSearchResource(n) &&
					(!isRESTClientResource(this.oRESTfulServiceCIM.getHasResources().get(n).getName()))){
				listOfStrings.add(this.oRESTfulServiceCIM.getHasResources().get(n).getName());
			}
		}
		
		java.util.Collections.sort(listOfStrings, Collator.getInstance());
		Iterator<String> iterator = listOfStrings.iterator();
		
		while(iterator.hasNext()){
			this.listAvailableResources.add(iterator.next());
		}
	}

	private boolean isSearchResource(int iResourceIndex) {
		
		//if the search layer is undefined
		if(this.oSearchLayerCIM == null){
			//then there are not search resources
			return false;
		}

		
		for(int n = 0; n < this.oSearchLayerCIM.getHasAnnotation().size(); n++){
			if(this.oSearchLayerCIM.getHasAnnotation().get(n) instanceof SearchResource){
				if(((SearchResource)this.oSearchLayerCIM.getHasAnnotation().get(n)).getAlgoResourceIsSearchResource().getAnnotatesAlgoResource().getName().equalsIgnoreCase(this.oRESTfulServiceCIM.getHasResources().get(iResourceIndex).getName())){
					return true;
				}
			}
		}
		
		return false;
	}


	private boolean isRESTClientResource(String strResourceName) {
		if(this.oRESTClientResourcesArray[getAlgoResourceIndexByName(strResourceName)] == true){
			return true;
		}
		return false;
	}


	private void addAvailableResourcesListListener() {
		this.listAvailableResources.addSelectionListener(new SelectionListener(){

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

	private void initializeWizardSWTs() {
		//initialize the values of all the SWT widgets
		if(this.bReloadExistingModels == false){
			initializeRESTClientModels();
			initializeResourcesGridSWTs();
			initializeTargetServiceSWTs();			
		}//else reload existing valid external composition model
		else{
			reloadExternalServiceCIMModel();
		}

		populateAvailableResourcesList();
		updateWidgetStatus();
		
		this.oParentComposite.layout();
	}

	private void initializeRESTClientModels() {
		for(int n = 0; n < this.oExternalServiceLayerCIM.getHasAnnotation().size(); n++){
			if(this.oExternalServiceLayerCIM.getHasAnnotation().get(n) instanceof RESTClientResource){
				this.oRESTClientResourcesArray[this.getAlgoResourceIndexByName(((RESTClientResource)this.oExternalServiceLayerCIM.getHasAnnotation().get(n)).getIsRESTClientResource().getAnnotatesAlgoResource().getName())] = true;
				this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(((RESTClientResource)this.oExternalServiceLayerCIM.getHasAnnotation().get(n)).getIsRESTClientResource().getAnnotatesAlgoResource().getName())] = this.deepCopyRESTClientResource(((RESTClientResource)this.oExternalServiceLayerCIM.getHasAnnotation().get(n)));
			}
		}
		
	}


	private void reloadExternalServiceCIMModel() {
		ArrayList<String> listOfStrings = new ArrayList<String>();
		
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() == true){
				//check if it is a valid existing RESTClient resource and is not a search resource
				if(isExistingValidRESTClientResource(this.oRESTfulServiceCIM.getHasResources().get(n).getName()) && !isSearchResource(n)){
					
					//then add it to RESTClient Resources list
					this.oRESTClientResourcesArray[this.getAlgoResourceIndexByName(this.oRESTfulServiceCIM.getHasResources().get(n).getName())] = true;
					listOfStrings.add(this.oRESTfulServiceCIM.getHasResources().get(n).getName());
					this.oRESTClientModelingArray[this.getAlgoResourceIndexByName(this.oRESTfulServiceCIM.getHasResources().get(n).getName())] = loadRESTClientResource(this.oRESTfulServiceCIM.getHasResources().get(n).getName());
				}
				else if(!isSearchResource(n)){
					//else add it to the Available Resources list
					populateAvailableResourcesList();
				}
			}
		}
		
		java.util.Collections.sort(listOfStrings, Collator.getInstance());
		Iterator<String> iterator = listOfStrings.iterator();
		
		while(iterator.hasNext()){
			this.listRESTClientResources.add(iterator.next());
		}
	}


	private boolean hasValidCRUDOutputModel(RESTClientResource oRESTClientResource) {
		if(oRESTClientResource.getTargetsService().getHasOutputDataModel() != null){
			if(oRESTClientResource.getTargetsService().getHasOutputDataModel() instanceof ExistentCRUDPersistentOutput){
				//check if the loaded CRUD Resource that is used as output model still exists
				for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
					if(this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() == false){//if its CRUD
						if(this.oRESTfulServiceCIM.getHasResources().get(n).getName().equalsIgnoreCase(((ExistentCRUDPersistentOutput)oRESTClientResource.getTargetsService().getHasOutputDataModel()).getIsExistentCRUDPersistentOutput().getAnnotatesCRUDResource().getName())){
							//and the reloaded OutputModel uses a still valid CRUD Resource
							System.out.println("Valid Existing CRUD Resource Output Model found!");
							return true;
						}						
					}
				}
			}
			else{
				return true;
			}
		}
		else{
			return true;
		}
		
		System.out.println("Valid Existing CRUD Resource Output Model NOT found!");
		return false;
	}


	private RESTClientResource loadRESTClientResource(String strResourceName) {
		for(int n = 0; n < this.oExternalServiceLayerCIM.getHasAnnotation().size(); n++){
			if(this.oExternalServiceLayerCIM.getHasAnnotation().get(n) instanceof RESTClientResource){
				if(((RESTClientResource)this.oExternalServiceLayerCIM.getHasAnnotation().get(n)).getIsRESTClientResource().getAnnotatesAlgoResource().getName().equalsIgnoreCase(strResourceName)){
					return deepCopyRESTClientResource((RESTClientResource)this.oExternalServiceLayerCIM.getHasAnnotation().get(n));
				}
			}
		}
		try {
			throw new ExecutionException(new Throwable());
		} catch (ExecutionException e) {
			Activator.log("Unable to find RESTClient resource by name " + strResourceName, e);
			return null;
		}
	}

	private RESTClientResource deepCopyRESTClientResource(RESTClientResource oBackUpRESTClientResource) {
		
		//create an AnnAlgoResource
		AnnAlgoResource oAnnAlgoResource = this.oExternalServiceLayerCIMFactory.createAnnAlgoResource();
		
		//associate it with the core CIM algo Resource
		oAnnAlgoResource.setAnnotatesAlgoResource(findCoreCIMResourceReference(oBackUpRESTClientResource.getIsRESTClientResource().getAnnotatesAlgoResource().getName()));
		
		//create the RESTClientResource
		RESTClientResource oRESTClientResource = this.oExternalServiceLayerCIMFactory.createRESTClientResource();
		
		//associate it with the AnnAlgoResource
		oRESTClientResource.setIsRESTClientResource(oAnnAlgoResource);
		
		//create the Target REST Service annotation
		TargetRESTService oTargetRESTService = oExternalServiceLayerCIMFactory.createTargetRESTService();
		oTargetRESTService.setTargetURL(oBackUpRESTClientResource.getTargetsService().getTargetURL());
		oTargetRESTService.setCRUDVerb(oBackUpRESTClientResource.getTargetsService().getCRUDVerb());
		
		//deep copy any query parameters
		for(int n = 0; n < oBackUpRESTClientResource.getTargetsService().getHasQueryParam().size(); n++){
			QueryParam oQueryParam = oExternalServiceLayerCIMFactory.createQueryParam();
			oQueryParam.setName(oBackUpRESTClientResource.getTargetsService().getHasQueryParam().get(n).getName());
			oQueryParam.setType(oBackUpRESTClientResource.getTargetsService().getHasQueryParam().get(n).getType());
			oQueryParam.setIsAuthToken(oBackUpRESTClientResource.getTargetsService().getHasQueryParam().get(n).isIsAuthToken());
			oQueryParam.setAuthTokenToURL(oBackUpRESTClientResource.getTargetsService().getHasQueryParam().get(n).getAuthTokenToURL());
			oTargetRESTService.getHasQueryParam().add(oQueryParam);
		}
		
		//deep copy any complex types
		for(int n = 0; n < oBackUpRESTClientResource.getIsRESTClientComplexType().size(); n++){
			ComplexType oComplexType = oExternalServiceLayerCIMFactory.createComplexType();
			oComplexType = createNewComplexTypeInstance(oBackUpRESTClientResource.getIsRESTClientComplexType().get(n));
			oRESTClientResource.getIsRESTClientComplexType().add(oComplexType);
		}
		
		fixComplexTypeCrossReferences(oRESTClientResource, oBackUpRESTClientResource.getIsRESTClientComplexType());
		
		//deep copy the input model
		InputDataModel oInputDataModel = oExternalServiceLayerCIMFactory.createInputDataModel();
		if(oBackUpRESTClientResource.getTargetsService().getHasInputDataModel() != null){
			
			//deep copy the input representation
			Representation oRepresentation = oExternalServiceLayerCIMFactory.createRepresentation();
			oRepresentation.setName(oBackUpRESTClientResource.getTargetsService().getHasInputDataModel().getHasInputRepresentation().getName());
			oInputDataModel.setHasInputRepresentation(oRepresentation);
			
			//deep copy the input properties
			for(int n = 0; n < oBackUpRESTClientResource.getTargetsService().getHasInputDataModel().getHasInputProperties().size(); n++){
				ModelProperty oInputProperty = oExternalServiceLayerCIMFactory.createModelProperty();
				oInputProperty.setName(oBackUpRESTClientResource.getTargetsService().getHasInputDataModel().getHasInputProperties().get(n).getName());
				oInputProperty.setType(oBackUpRESTClientResource.getTargetsService().getHasInputDataModel().getHasInputProperties().get(n).getType());
				oInputProperty.setIsUnique(oBackUpRESTClientResource.getTargetsService().getHasInputDataModel().getHasInputProperties().get(n).isIsUnique());
				oInputProperty.setHasPrimitiveType(oBackUpRESTClientResource.getTargetsService().getHasInputDataModel().getHasInputProperties().get(n).isHasPrimitiveType());
				if(oInputProperty.isHasPrimitiveType() == false){
					oInputProperty.setHasComplexType(findComplexType(oRESTClientResource, oBackUpRESTClientResource, n, true));
				}
				oInputDataModel.getHasInputProperties().add(oInputProperty);
			}
			oTargetRESTService.setHasInputDataModel(oInputDataModel);
		}
		
		//deep copy the output data model
		NonPersistentOutput oOutputDataModel = oExternalServiceLayerCIMFactory.createNonPersistentOutput();
		if(oBackUpRESTClientResource.getTargetsService().getHasOutputDataModel() != null){
			//deep copy the output representation
			Representation oRepresentation = oExternalServiceLayerCIMFactory.createRepresentation();
			oRepresentation.setName(oBackUpRESTClientResource.getTargetsService().getHasOutputDataModel().getHasOutputRepresentation().getName());
			oOutputDataModel.setHasOutputRepresentation(oRepresentation);
			
			//deep copy the output properties
			for(int n = 0; n < oBackUpRESTClientResource.getTargetsService().getHasOutputDataModel().getHasOutputProperties().size(); n++){
				ModelProperty oOutputProperty = oExternalServiceLayerCIMFactory.createModelProperty();
				oOutputProperty.setName(oBackUpRESTClientResource.getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(n).getName());
				oOutputProperty.setType(oBackUpRESTClientResource.getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(n).getType());
				oOutputProperty.setIsUnique(oBackUpRESTClientResource.getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(n).isIsUnique());
				oOutputProperty.setHasPrimitiveType(oBackUpRESTClientResource.getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(n).isHasPrimitiveType());
				if(oOutputProperty.isHasPrimitiveType() == false){
					oOutputProperty.setHasComplexType(findComplexType(oRESTClientResource, oBackUpRESTClientResource, n, false));
				}
				oOutputDataModel.getHasOutputProperties().add(oOutputProperty);
			}
			
			oTargetRESTService.setHasOutputDataModel(oOutputDataModel);			

			//deep copy persistence info
			if(oBackUpRESTClientResource.getTargetsService().getHasOutputDataModel() instanceof AutoPersistentOutput){
				AutoPersistentOutput oAutoPersistentOutput = this.oExternalServiceLayerCIMFactory.createAutoPersistentOutput();
				oAutoPersistentOutput.setHasOutputRepresentation(oRepresentation);
				oAutoPersistentOutput.getHasOutputProperties().addAll(oOutputDataModel.getHasOutputProperties());	
				oTargetRESTService.setHasOutputDataModel(oAutoPersistentOutput);			
			}
			else if(oBackUpRESTClientResource.getTargetsService().getHasOutputDataModel() instanceof ExistentCRUDPersistentOutput){
				ExistentCRUDPersistentOutput oExistentCRUDPersistentOutput = this.oExternalServiceLayerCIMFactory.createExistentCRUDPersistentOutput();
				oExistentCRUDPersistentOutput.setHasOutputRepresentation(oRepresentation);
				oExistentCRUDPersistentOutput.getHasOutputProperties().addAll(oOutputDataModel.getHasOutputProperties());
				
				//check if it still has a valid existing CRUD resource output model
				if(hasValidCRUDOutputModel(oBackUpRESTClientResource)){
					AnnCRUDResource oAnnCRUDResource = this.oExternalServiceLayerCIMFactory.createAnnCRUDResource();
					oAnnCRUDResource.setAnnotatesCRUDResource(this.oRESTfulServiceCIM.getHasResources().get(this.getCRUDResourceIndexByName(((ExistentCRUDPersistentOutput)oBackUpRESTClientResource.getTargetsService().getHasOutputDataModel()).getIsExistentCRUDPersistentOutput().getAnnotatesCRUDResource().getName())));
					oExistentCRUDPersistentOutput.setIsExistentCRUDPersistentOutput(oAnnCRUDResource);
				}
				else{
					oExistentCRUDPersistentOutput.setIsExistentCRUDPersistentOutput(null);
				}
				oTargetRESTService.setHasOutputDataModel(oExistentCRUDPersistentOutput);			
			}
		}

		oRESTClientResource.setTargetsService(oTargetRESTService);
		return oRESTClientResource;
	}
	
	private void fixComplexTypeCrossReferences(RESTClientResource oRESTClientResource, EList<ComplexType> existentRESTClientComplexTypeList) {
		for(int n = 0; n < oRESTClientResource.getIsRESTClientComplexType().size(); n++){
			for(int i = 0; i < oRESTClientResource.getIsRESTClientComplexType().get(n).getHasComplexTypeProperties().size(); i++){
				if(oRESTClientResource.getIsRESTClientComplexType().get(n).getHasComplexTypeProperties().get(i).isHasPrimitiveType() == false){
					for(int j = 0; j < oRESTClientResource.getIsRESTClientComplexType().size(); j++){
						if(oRESTClientResource.getIsRESTClientComplexType().get(j).getComplexTypeName().equalsIgnoreCase(existentRESTClientComplexTypeList.get(n).getHasComplexTypeProperties().get(i).getPropertyHasComplexType().getComplexTypeName())){
							oRESTClientResource.getIsRESTClientComplexType().get(n).getHasComplexTypeProperties().get(i).setPropertyHasComplexType(oRESTClientResource.getIsRESTClientComplexType().get(j));
						}
					}
				}
			}
		}
	}


	private ComplexType findComplexType(RESTClientResource oRESTClientResource, RESTClientResource oBackUpRESTClientResource, int iPropertyIndex, boolean bIsInputProperty) {
		if(bIsInputProperty == true){
			for(int n = 0; n < oRESTClientResource.getIsRESTClientComplexType().size(); n++){
				if(oRESTClientResource.getIsRESTClientComplexType().get(n).getComplexTypeName().equalsIgnoreCase(oBackUpRESTClientResource.getTargetsService().getHasInputDataModel().getHasInputProperties().get(iPropertyIndex).getHasComplexType().getComplexTypeName())){
					return oRESTClientResource.getIsRESTClientComplexType().get(n);
				}
			}
		}
		else{
			for(int n = 0; n < oRESTClientResource.getIsRESTClientComplexType().size(); n++){
				if(oRESTClientResource.getIsRESTClientComplexType().get(n).getComplexTypeName().equalsIgnoreCase(oBackUpRESTClientResource.getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(iPropertyIndex).getHasComplexType().getComplexTypeName())){
					return oRESTClientResource.getIsRESTClientComplexType().get(n);
				}
			}
		}
		try {
			throw new ExecutionException(new Throwable());
		} catch (ExecutionException e) {
			Activator.log("Unable to find complex type.", e);
			return null;
		}
	}


	private ComplexType createNewComplexTypeInstance(ComplexType oComplexType){
		ComplexType oNewComplexType = this.oExternalServiceLayerCIMFactory.createComplexType();
		oNewComplexType.setComplexTypeName(oComplexType.getComplexTypeName());
		for(int n = 0; n < oComplexType.getHasComplexTypeProperties().size(); n++){
			ComplexTypeProperty oNewComplexTypeProperty = this.oExternalServiceLayerCIMFactory.createComplexTypeProperty();
			oNewComplexTypeProperty.setHasPrimitiveType(oComplexType.getHasComplexTypeProperties().get(n).isHasPrimitiveType());
			oNewComplexTypeProperty.setIsUnique(oComplexType.getHasComplexTypeProperties().get(n).isIsUnique());
			oNewComplexTypeProperty.setName(oComplexType.getHasComplexTypeProperties().get(n).getName());
			oNewComplexTypeProperty.setType(oComplexType.getHasComplexTypeProperties().get(n).getType());
//			oNewComplexTypeProperty.setPropertyHasComplexType(oComplexType.getHasComplexTypeProperties().get(n).getPropertyHasComplexType() == null ? null : createNewComplexTypeInstance(oComplexType.getHasComplexTypeProperties().get(n).getPropertyHasComplexType()));
			oNewComplexType.getHasComplexTypeProperties().add(oNewComplexTypeProperty);
		}
		
		return oNewComplexType;
	}


	private boolean isExistingValidRESTClientResource(String strResourceName) {
		for(int n = 0; n < this.oExternalServiceLayerCIM.getHasAnnotation().size(); n++){
			if(this.oExternalServiceLayerCIM.getHasAnnotation().get(n) instanceof RESTClientResource){
				if(((RESTClientResource)this.oExternalServiceLayerCIM.getHasAnnotation().get(n)).getIsRESTClientResource().getAnnotatesAlgoResource().getName().equalsIgnoreCase(strResourceName)){
					return true;
				}
			}
		}
		
		return false;
	}


	private void initializeTargetServiceSWTs() {
		initializeOutputModelSWTs();
		initializeInputModelSWTs();
	}

	private void initializeOutputModelSWTs() {
		// TODO Auto-generated method stub
		
	}

	private void initializeInputModelSWTs() {
		// TODO Auto-generated method stub
		
	}

	private void initializeResourcesGridSWTs() {
		//initialize available resources list
		ArrayList<String> listOfAvailableResources = new ArrayList<String>();
		ArrayList<String> listOfRESTClientResources = new ArrayList<String>();
		
		for(int i = 0; i < this.oRESTfulServiceCIM.getHasResources().size(); i++){
			if(this.oRESTfulServiceCIM.getHasResources().get(i).isIsAlgorithmic() == true){
				if(this.oRESTClientResourcesArray[this.getAlgoResourceIndexByName(this.oRESTfulServiceCIM.getHasResources().get(i).getName())] == false){
					listOfAvailableResources.add(this.oRESTfulServiceCIM.getHasResources().get(i).getName());
				}
				else{
					listOfRESTClientResources.add(this.oRESTfulServiceCIM.getHasResources().get(i).getName());
				}
			}
		}
		
		java.util.Collections.sort(listOfAvailableResources, Collator.getInstance());
		Iterator<String> iterator = listOfAvailableResources.iterator();
		
		while(iterator.hasNext()){
			this.listAvailableResources.add(iterator.next());
		}
		
		java.util.Collections.sort(listOfRESTClientResources, Collator.getInstance());
		Iterator<String> iteratorREST = listOfRESTClientResources.iterator();
		
		while(iteratorREST.hasNext()){
			this.listRESTClientResources.add(iteratorREST.next());
		}
		
	}

	private void updateWidgetStatus() {
		updateResourcesSWTStatus();
		updateTargetServiceSWTStatus();
		
		//TODO reload also next page's SWTs in order to determine if the whole wizard can be finished or not
		//this.oComplexDataTypeWizardPage.reloadComplexTypes();
	}
	
	private void updateResourcesSWTStatus() {
		updateAddRemoveClientResourceButtonStatus();
		udpateClientResourceListStatus();
		
	}

	private void udpateClientResourceListStatus() {
		if(this.listRESTClientResources.getItemCount() > 0){
			this.listRESTClientResources.setEnabled(true);
		}
		else{
			this.listRESTClientResources.setEnabled(false);
		}
		
	}

	private void updateAddRemoveClientResourceButtonStatus() {
		//update the status of the add REST client button
		if(this.listAvailableResources.getSelectionIndex() != -1){
			this.buttonAddRESTClientResource.setEnabled(true);
		}
		else{
			this.buttonAddRESTClientResource.setEnabled(false);
		}
		
		//update the status of the remove REST client button
		if(this.listRESTClientResources.getSelectionIndex() != -1){
			this.buttonRemoveRESTClientResource.setEnabled(true);
		}
		else{
			this.buttonRemoveRESTClientResource.setEnabled(false);
		}
	}

	private void updateTargetServiceSWTStatus() {
		updateGeneralTargetServiceSWTs();
		updateInputDataSWTs();
		updateOutputDataSWTs();
	}

	private void updateGeneralTargetServiceSWTs() {
		if(this.listRESTClientResources.getSelectionIndex() != -1){
			this.textTargetServiceURL.setEnabled(true);
			this.listCRUDVerb.setEnabled(true);
			this.listQueryParameters.setEnabled(true);
			this.buttonCreateQueryParameter.setEnabled(true);
			if(this.listQueryParameters.getSelectionIndex() != -1){
				this.buttonDeleteQueryParameter.setEnabled(true);
				this.buttonRenameQueryParameter.setEnabled(true);
				this.isQueryAuthTokenButton.setEnabled(true);
				this.textAuthTokenURL.setEnabled(this.isQueryAuthTokenButton.getSelection() == true ? true : false);
			}
			else{
				this.buttonDeleteQueryParameter.setEnabled(false);
				this.buttonRenameQueryParameter.setEnabled(false);
				this.isQueryAuthTokenButton.setEnabled(false);
				this.textAuthTokenURL.setEnabled(false);
			}
		}
		else{
			this.textTargetServiceURL.setEnabled(false);
			this.listCRUDVerb.setEnabled(false);
			this.listQueryParameters.setEnabled(false);
			this.buttonCreateQueryParameter.setEnabled(false);
			this.buttonDeleteQueryParameter.setEnabled(false);
			this.buttonRenameQueryParameter.setEnabled(false);
			this.isQueryAuthTokenButton.setEnabled(false);
			this.textAuthTokenURL.setEnabled(false);
		}
	}


	private void updateOutputDataSWTs() {
		if(this.listRESTClientResources.getSelectionIndex() != -1){//if a RESTClientResource is selected
			this.buttonHasOutputDataModel.setEnabled(true);
			if(this.buttonHasOutputDataModel.getSelection() == true){ //if the user checked the Output Data Model checkbox
				this.buttonOutputJSON.setEnabled(true);
				this.buttonOutputXML.setEnabled(true);
				this.listOutputProperties.setEnabled(true);
				this.buttonCreateOutputProperty.setEnabled(true);
				this.buttonPersistOutput.setEnabled(true);
				if(this.listOutputProperties.getSelectionIndex() != -1){ //if the user has an output property selected
					this.buttonOutputPropertyMultiplicity.setEnabled(true);
					this.buttonDeleteOutputProperty.setEnabled(true);
					this.buttonRenameOutputProperty.setEnabled(true);
					this.listOutputPropertyType.setEnabled(true);
				}
				else{
					disableOutputPropertySWTs();
				}
				if(this.buttonPersistOutput.getSelection() == true){//if the user checked the persist output checkbox
					this.listPersistenceType.setEnabled(true);
					if(this.listPersistenceType.getSelectionIndex() != -1){
						if(this.listPersistenceType.getSelection()[0].equalsIgnoreCase("Existent")){//if the user checked the Existent type of persistence
							this.listExistentCRUDResources.setEnabled(true);
						}
						else{
							this.listExistentCRUDResources.setEnabled(false);
						}
					}
				}
				else{
					disablePersistOutputSWTs();
				}
			}
			else{
				disableAllOutputDataSWTs();
			}
		}
		else{
			this.buttonHasOutputDataModel.setEnabled(false);
			this.buttonOutputJSON.setEnabled(false);
			this.buttonOutputXML.setEnabled(false);
			this.listOutputProperties.setEnabled(false);
			this.buttonCreateOutputProperty.setEnabled(false);
			this.buttonOutputPropertyMultiplicity.setEnabled(false);
			this.buttonDeleteOutputProperty.setEnabled(false);
			this.buttonRenameOutputProperty.setEnabled(false);
			this.listOutputPropertyType.setEnabled(false);
			this.buttonPersistOutput.setEnabled(false);
			this.listPersistenceType.setEnabled(false);
			this.listExistentCRUDResources.setEnabled(false);
		}
	}
	
	private void disableOutputPropertySWTs() {
		this.buttonOutputPropertyMultiplicity.setEnabled(false);
		this.buttonDeleteOutputProperty.setEnabled(false);
		this.buttonRenameOutputProperty.setEnabled(false);
		this.listOutputPropertyType.setEnabled(false);
	}


	private void disableAllOutputDataSWTs() {
		this.buttonOutputJSON.setEnabled(false);
		this.buttonOutputXML.setEnabled(false);
		this.listOutputProperties.setEnabled(false);
		this.buttonCreateOutputProperty.setEnabled(false);
		this.buttonOutputPropertyMultiplicity.setEnabled(false);
		this.buttonDeleteOutputProperty.setEnabled(false);
		this.buttonRenameOutputProperty.setEnabled(false);
		this.listOutputPropertyType.setEnabled(false);
		this.buttonPersistOutput.setEnabled(false);
		this.listPersistenceType.setEnabled(false);
		this.listExistentCRUDResources.setEnabled(false);
	}


	private void disablePersistOutputSWTs(){
		this.listPersistenceType.setEnabled(false);
		this.listExistentCRUDResources.setEnabled(false);
	}

	private void updateInputDataSWTs() {
		if(this.listRESTClientResources.getSelectionIndex() != -1){//if a RESTClientResource is selected
			this.buttonHasInputDataModel.setEnabled(true);
			if(this.buttonHasInputDataModel.getSelection() == true){ //if the user checked the Input Data Model checkbox
				this.buttonInputJSON.setEnabled(true);
				this.buttonInputXML.setEnabled(true);
				this.listInputProperties.setEnabled(true);
				this.buttonCreateInputProperty.setEnabled(true);
				if(this.listInputProperties.getSelectionIndex() != -1){ //if the user has an input property selected
					this.buttonInputPropertyMultiplicity.setEnabled(true);
					this.buttonDeleteInputProperty.setEnabled(true);
					this.buttonRenameInputProperty.setEnabled(true);
					this.listInputPropertyType.setEnabled(true);
				}
				else{
					this.buttonInputPropertyMultiplicity.setEnabled(false);
					this.buttonDeleteInputProperty.setEnabled(false);
					this.buttonRenameInputProperty.setEnabled(false);
					this.listInputPropertyType.setEnabled(false);
				}
			}
			else{
				this.buttonInputJSON.setEnabled(false);
				this.buttonInputXML.setEnabled(false);
				this.listInputProperties.setEnabled(false);
				this.buttonCreateInputProperty.setEnabled(false);
				this.buttonInputPropertyMultiplicity.setEnabled(false);
				this.buttonDeleteInputProperty.setEnabled(false);
				this.buttonRenameInputProperty.setEnabled(false);
				this.listInputPropertyType.setEnabled(false);
			}
		}
		else{
			this.buttonHasInputDataModel.setEnabled(false);
			this.buttonInputJSON.setEnabled(false);
			this.buttonInputXML.setEnabled(false);
			this.listInputProperties.setEnabled(false);
			this.buttonCreateInputProperty.setEnabled(false);
			this.buttonInputPropertyMultiplicity.setEnabled(false);
			this.buttonDeleteInputProperty.setEnabled(false);
			this.buttonRenameInputProperty.setEnabled(false);
			this.listInputPropertyType.setEnabled(false);
		}
	}
	
	public int getNumberOfAvailableAlgoResources() {
		int i = 0;
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() == true){
				i++;
			}
		}
		
		return i;
	}
	
	private int getAlgoResourceIndexByName(String strAlgoResourceName){
		int i = -1;
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).isIsAlgorithmic() == true){
				i++;
				if(this.oRESTfulServiceCIM.getHasResources().get(n).getName().equalsIgnoreCase(strAlgoResourceName)){
					return i;
				}
			}
		}
		try {
			throw new ExecutionException(new Throwable());
		} catch (ExecutionException e) {
			Activator.log("Unable to find algorithmic resource index by name " + strAlgoResourceName, e);
			return -1;
		}
	}


	public void createExternalServiceLayerCIM(){
		//delete any existing Annotations and Annotated elements, in case this model is reloaded from existing XMI files
		this.oExternalServiceLayerCIM.getHasAnnotation().clear();
		this.oExternalServiceLayerCIM.getHasAnnotatedElement().clear();
		
		for(int n = 0; n < this.oRESTClientResourcesArray.length; n++){
			if(this.oRESTClientResourcesArray[n] == true){
				//add the RESTClientResource Annotation
				this.oExternalServiceLayerCIM.getHasAnnotation().add(this.oRESTClientModelingArray[n]);
				
				//add the AnnAlgoResource Annotated Element that is referenced by the RESTClient Resource
				this.oExternalServiceLayerCIM.getHasAnnotatedElement().add(this.oRESTClientModelingArray[n].getIsRESTClientResource());
				
				//if it persists its output using an existing CRUD resource, add the AnnCRUDResource annotation
				if(this.oRESTClientModelingArray[n].getTargetsService().getHasOutputDataModel() != null){
					if(this.oRESTClientModelingArray[n].getTargetsService().getHasOutputDataModel() instanceof ExistentCRUDPersistentOutput){
						this.oExternalServiceLayerCIM.getHasAnnotatedElement().add(((ExistentCRUDPersistentOutput)this.oRESTClientModelingArray[n].getTargetsService().getHasOutputDataModel()).getIsExistentCRUDPersistentOutput());
					}
				}
			}
		}

	}
	
	private boolean isPageCompleted(){
		if(this.isValidExternalCompositionCIMModel()){
			return true;
		}
		
		return false;
	}
	
	private boolean isValidExternalCompositionCIMModel(){
		
		int iNumberOfRESTClientResources = 0;
		//validate each RESTClientResource
		for(int n = 0; n < this.oRESTClientResourcesArray.length; n++){
			if(this.oRESTClientResourcesArray[n] == true)//if it is a RESTClientResource
			{
				iNumberOfRESTClientResources++;
				if(!RESTClientHasTargetURL(n)){
					return false;
				}
				
				if(!RESTClientHasCRUDVerb(n)){
					return false;
				}
				
				if(this.oRESTClientModelingArray[n].getTargetsService().getHasInputDataModel() != null){
					if(!RESTClientHasValidInputModel(n)){
						return false;
					}
				}
				
				if(this.oRESTClientModelingArray[n].getTargetsService().getHasOutputDataModel() != null){
					if(!RESTClientHasValidOutputModel(n)){
						return false;
					}
				}
				
				if(!RESTClientHasValidVerbIOCombination(n)){
					return false;
				}
			}
		}
		
		//if no resources are modelled as RESTClients
		if(iNumberOfRESTClientResources == 0){
			setErrorMessage("At least one resource must be modeled as RESTClient.");
			return false;
		}
		setErrorMessage(null);
		return true;
	}

	private boolean RESTClientHasValidVerbIOCombination(int iRESTClientIndex) {
		
		//if the RESTClient has CREATE Activity
		if(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getCRUDVerb().equalsIgnoreCase("CREATE")){
			//it must have both input and output model
			if(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasInputDataModel() == null ||
			   this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel() == null){
				setErrorMessage("When interacting with an external service through CREATE activity, the selected RESTClient must have both Input and Output model. The RESTClient " 
						+ this.oRESTClientModelingArray[iRESTClientIndex].getIsRESTClientResource().getAnnotatesAlgoResource().getName() 
						+ " does not have either Input, Output or both of them.");
				return false;
			}
		}
		else if(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getCRUDVerb().equalsIgnoreCase("READ")){ //if the RESTClient has READ Activity
			//it must have output but not input model
			if(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasInputDataModel() != null ||
					   this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel() == null){
						setErrorMessage("When interacting with an external service through READ activity, the selected RESTClient must not have Input model but must have Output model. The RESTClient " 
								+ this.oRESTClientModelingArray[iRESTClientIndex].getIsRESTClientResource().getAnnotatesAlgoResource().getName() 
								+ " violates this condition.");
						return false;
			}
		}
		else if(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getCRUDVerb().equalsIgnoreCase("UPDATE")){ //if the RESTClient has UPDATE Activity
			//it must have both input and output model
			if(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasInputDataModel() == null ||
					   this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel() == null){
						setErrorMessage("When interacting with an external service through UPDATE activity, the selected RESTClient must have both Input and Output model. The RESTClient " 
								+ this.oRESTClientModelingArray[iRESTClientIndex].getIsRESTClientResource().getAnnotatesAlgoResource().getName() 
								+ " does not have either Input, Output or both of them.");
						return false;
			}
		}
		else if(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getCRUDVerb().equalsIgnoreCase("DELETE")){ //if the RESTClient has DELETE Activity
			//it must have neither input nor output model
			if(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasInputDataModel() != null ||
					   this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel() != null){
						setErrorMessage("When interacting with an external service through DELETE activity, the selected RESTClient must have neither Input nor Output model. The RESTClient " 
								+ this.oRESTClientModelingArray[iRESTClientIndex].getIsRESTClientResource().getAnnotatesAlgoResource().getName() 
								+ " however violates this.");
						return false;
			}
		}
		
		return true;
	}


	private boolean RESTClientHasValidOutputModel(int iRESTClientIndex) {
		//check if the service has output model
		if(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel() != null){
			//if it has an output model, check whether it has an output representation
			if(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel().getHasOutputRepresentation().getName() == null ||
			   this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel().getHasOutputRepresentation().getName().isEmpty()){
				setErrorMessage("All RESTClient Resources that have an output data model, must have a JSON or XML representation. RESTClient Resource " +
			       this.oRESTClientModelingArray[iRESTClientIndex].getIsRESTClientResource().getAnnotatesAlgoResource().getName() + " does not have one.");
				return false;
			}
			
			//check if it has at least one output property
			if(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel().getHasOutputProperties().size() <= 0
				&& !(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel() instanceof ExistentCRUDPersistentOutput)){
				setErrorMessage("All RESTClient Resources that have a non Existing CRUD output data model, must have at least one output property. RESTClient Resource " +
					       this.oRESTClientModelingArray[iRESTClientIndex].getIsRESTClientResource().getAnnotatesAlgoResource().getName() + " does not have one.");
				return false;
			}
			else if(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel().getHasOutputProperties().size() > 0
					&& !(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel() instanceof ExistentCRUDPersistentOutput)){
				//check if each property has a Type
				for(int n = 0; n < this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel().getHasOutputProperties().size(); n++){
					if(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(n).getType() == null){
						setErrorMessage("Every output data property must have a type. Output data property " +
							       this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(n).getName() + " of RESTClient Resource " +  
								this.oRESTClientModelingArray[iRESTClientIndex].getIsRESTClientResource().getAnnotatesAlgoResource().getName() + " does not have one.");
						return false;
					}
				}
			}
			else if(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel().getHasOutputProperties().size() > 0
					&& (this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel() instanceof ExistentCRUDPersistentOutput)){
				//check if the RESTClient is set to persist the output with an existing CRUD model 
				if(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel() instanceof ExistentCRUDPersistentOutput){
					setErrorMessage("All RESTClient Resources can have a custom output model or use an existing CRUD model for it as well as for persistence but not both. RESTClient Resource " +
						       this.oRESTClientModelingArray[iRESTClientIndex].getIsRESTClientResource().getAnnotatesAlgoResource().getName() + " has both.");
					return false;
				}
			}
		}
		
		return RESTClientHasValidPersistenceModel(iRESTClientIndex);
	}

	
	private boolean RESTClientHasValidPersistenceModel(int iRESTClientIndex) {

		if(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel() instanceof ExistentCRUDPersistentOutput){
			//if the persistence type uses an existent CRUT resource, one such must be selected
			if(((ExistentCRUDPersistentOutput)this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasOutputDataModel()).getIsExistentCRUDPersistentOutput() == null){
				setErrorMessage("All RESTClient Resources that persist their output using an existing resoruce, must have one such resource selected. RESTClient Resource " +
					       this.oRESTClientModelingArray[iRESTClientIndex].getIsRESTClientResource().getAnnotatesAlgoResource().getName() + " does not have one.");
				return false;
			}
		}
		
		return true;
	}

	
	private boolean RESTClientHasValidInputModel(int iRESTClientIndex) {
		//check if the service has input model
		if(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasInputDataModel() != null){
			//if it has an input model, check whether it has an input representation
			if(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasInputDataModel().getHasInputRepresentation().getName() == null ||
			   this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasInputDataModel().getHasInputRepresentation().getName().isEmpty()){
				setErrorMessage("All RESTClient Resources that have an input data model, must have a JSON or XML representation. RESTClient Resource " +
			       this.oRESTClientModelingArray[iRESTClientIndex].getIsRESTClientResource().getAnnotatesAlgoResource().getName() + " does not have one.");
				return false;
			}
			
			//check if it has at least one input property
			if(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasInputDataModel().getHasInputProperties().size() <= 0){
				setErrorMessage("All RESTClient Resources that have an input data model, must have at least one input property. RESTClient Resource " +
					       this.oRESTClientModelingArray[iRESTClientIndex].getIsRESTClientResource().getAnnotatesAlgoResource().getName() + " does not have one.");
				return false;
			}
			else{
				//check if each property has a Type
				for(int n = 0; n < this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasInputDataModel().getHasInputProperties().size(); n++){
					if(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasInputDataModel().getHasInputProperties().get(n).getType() == null){
						setErrorMessage("Every input data property must have a type. Input data property " +
							       this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getHasInputDataModel().getHasInputProperties().get(n).getName() + " of RESTClient Resource " +  
								this.oRESTClientModelingArray[iRESTClientIndex].getIsRESTClientResource().getAnnotatesAlgoResource().getName() + " does not have one.");
						return false;
					}
				}
			}
		}
		
		return true;
	}


	private boolean RESTClientHasCRUDVerb(int iRESTClientIndex) {
		if(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getCRUDVerb() == null ||
				   this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getCRUDVerb().isEmpty()){
					setErrorMessage("All RESTClient Resources must have a target service CRUD Verb. RESTClient Resource " + this.oRESTClientModelingArray[iRESTClientIndex].getIsRESTClientResource().getAnnotatesAlgoResource().getName() + " does not have a target CRUD Verb.");
					return false;
				}
		return true;
	}


	private boolean RESTClientHasTargetURL(int iRESTClientIndex) {
		if(this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getTargetURL() == null ||
		   this.oRESTClientModelingArray[iRESTClientIndex].getTargetsService().getTargetURL().isEmpty()){
			setErrorMessage("All RESTClient Resources must have a target service URL. RESTClient Resource " + this.oRESTClientModelingArray[iRESTClientIndex].getIsRESTClientResource().getAnnotatesAlgoResource().getName() + " does not have a target URL.");
			return false;
		}
		
		return true;
	}
	
	public boolean[] getRESTClientResourcesArray(){
		return this.oRESTClientResourcesArray;
	}
	
	public RESTClientResource[] getRESTClientResource(){
		return this.oRESTClientModelingArray;
	}


	public ComplexDataTypeWizardPage getComplexDataTypeWizardPage() {
		return oComplexDataTypeWizardPage;
	}


	public void setComplexDataTypeWizardPage(ComplexDataTypeWizardPage oComplexDataTypeWizardPage) {
		this.oComplexDataTypeWizardPage = oComplexDataTypeWizardPage;
	}
	
	private boolean isPrimitiveDataType(String strDataTypeName){
		if(strDataTypeName.equalsIgnoreCase("String")){
			return true;
		}
		else if(strDataTypeName.equalsIgnoreCase("Double")){
			return true;
		}
		else if(strDataTypeName.equalsIgnoreCase("Integer")){
			return true;
		}
		else if(strDataTypeName.equalsIgnoreCase("Float")){
			return true;
		}
		else if(strDataTypeName.equalsIgnoreCase("Boolean")){
			return true;
		}
		else{
			return false;
		}
	}
}