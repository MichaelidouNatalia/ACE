package eu.fp7.scase.extcompositions;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;

import eu.fp7.scase.inputParser.YamlResource;
import eu.fp7.scase.launcher.cimgenerator.Activator;
import ExternalServiceLayerCIM.ComplexType;
import ExternalServiceLayerCIM.ComplexTypeProperty;
import ExternalServiceLayerCIM.ExternalServiceLayerCIMFactory;
import ExternalServiceLayerCIM.InputDataModel;
import ExternalServiceLayerCIM.ModelProperty;
import ExternalServiceLayerCIM.RESTClientResource;
import ExternalServiceLayerCIM.Representation;
import SearchLayerCIM.SearchResource;
import ServiceCIM.RESTfulServiceCIM;

public class ComplexDataTypeWizardPage extends WizardPage{

	private RESTfulServiceCIM oRESTfulServiceCIM;
	private ExternalServiceLayerCIM.AnnotationModel oExternalServiceLayerCIM;
	private ExternalServiceLayerCIMFactory oExternalServiceLayerCIMFactory;
	private boolean bReloadExistingModels;
	private SearchLayerCIM.AnnotationModel oSearchLayerCIM;
	private Composite oWizardPageGrid;
	private ExternalCompositionWizardPage oExternalCompositionWizardPage;
	private List oComplexTypePropertiesList;
	private List oRESTClientResourcesList;
	private List oComplexPropertiesList;
	private List oTypeList;
	private Button oCreateComplexTypePropertyButton;
	private Button oRenameComplexTypePropertyButton;
	private Button oDeleteComplexTypePropertyButton;
	private Button oIsCollectionCheckBox;
	private Button oCreateComplexTypeButton;
	private Composite composite;
	private Label lblNewLabel;
	private List oComplexDataTypesList;
	private Composite composite_1;
	private ArrayList<ComplexType>[] oComplexTypes;
	private Button oRenameComplexTypeButton;
	private Button oDeleteComplexTypeButton;
	private Label lblNewLabel_1;
	private List oAvailableComplexTypeList;
	
	public ComplexDataTypeWizardPage(RESTfulServiceCIM oRESTfulServiceCIM,  ExternalServiceLayerCIM.AnnotationModel oExternalServiceLayerCIM, SearchLayerCIM.AnnotationModel oParamSearchLayerCIM, ExternalCompositionWizardPage oExternalCompositionWizardPage, boolean bReloadExistingModels, ArrayList<YamlResource> oYamlResourcesList) {
		super(oRESTfulServiceCIM.getName() + "External Service Complex Data Types Editor");
		this.oRESTfulServiceCIM = oRESTfulServiceCIM;
		this.oExternalServiceLayerCIM = oExternalServiceLayerCIM;
		this.oExternalServiceLayerCIMFactory = ExternalServiceLayerCIMFactory.eINSTANCE;
		this.bReloadExistingModels = bReloadExistingModels;
		this.oSearchLayerCIM = oParamSearchLayerCIM;
		this.oExternalCompositionWizardPage = oExternalCompositionWizardPage;
		this.oComplexTypes = (ArrayList<ComplexType>[]) new ArrayList[this.oExternalCompositionWizardPage.getNumberOfAvailableAlgoResources()];
		for(int n = 0; n < this.oExternalCompositionWizardPage.getNumberOfAvailableAlgoResources(); n++){
			this.oComplexTypes[n] = new ArrayList<ComplexType>();
		}
	}

	@Override
	public void createControl(Composite parent) {
		this.oWizardPageGrid = new Composite(parent, SWT.NONE);
		
		this.setControl(this.oWizardPageGrid);
		oWizardPageGrid.setLayout(new GridLayout(1, false));
		
		Composite oComplexTypeListingComposite = new Composite(oWizardPageGrid, SWT.NONE);
		oComplexTypeListingComposite.setLayout(new GridLayout(3, false));
		GridData gd_oComplexTypeListingComposite = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_oComplexTypeListingComposite.heightHint = 113;
		gd_oComplexTypeListingComposite.widthHint = 554;
		oComplexTypeListingComposite.setLayoutData(gd_oComplexTypeListingComposite);
		
		Label lblRestclientResources = new Label(oComplexTypeListingComposite, SWT.NONE);
		lblRestclientResources.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		lblRestclientResources.setText("RESTClient Resources:");
		
		Label lblComplexDataTypes = new Label(oComplexTypeListingComposite, SWT.NONE);
		lblComplexDataTypes.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		lblComplexDataTypes.setText("Properties with complex type:");
		
		lblNewLabel_1 = new Label(oComplexTypeListingComposite, SWT.NONE);
		lblNewLabel_1.setText("Available Types:");
		
		oRESTClientResourcesList = new List(oComplexTypeListingComposite, SWT.BORDER);
		GridData gd_oRESTClientResourcesList = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_oRESTClientResourcesList.widthHint = 175;
		oRESTClientResourcesList.setLayoutData(gd_oRESTClientResourcesList);
		addRESTClientResourceListListener();
		
		oComplexPropertiesList = new List(oComplexTypeListingComposite, SWT.BORDER);
		GridData gd_oComplexPropertiesList = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_oComplexPropertiesList.widthHint = 101;
		oComplexPropertiesList.setLayoutData(gd_oComplexPropertiesList);
		addComplexPropertiesListListener();
		
		oAvailableComplexTypeList = new List(oComplexTypeListingComposite, SWT.BORDER);
		GridData gd_oAvailableComplexTypeList = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_oAvailableComplexTypeList.widthHint = 154;
		oAvailableComplexTypeList.setLayoutData(gd_oAvailableComplexTypeList);
		addAvailableComplexTypeListListener();
		
		composite = new Composite(oWizardPageGrid, SWT.NONE);
		GridData gd_composite = new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1);
		gd_composite.widthHint = 547;
		gd_composite.heightHint = 150;
		composite.setLayoutData(gd_composite);
		composite.setLayout(new GridLayout(2, false));
		
		lblNewLabel = new Label(composite, SWT.NONE);
		lblNewLabel.setText("Defined Complex Data Types:");
		new Label(composite, SWT.NONE);
		
		oComplexDataTypesList = new List(composite, SWT.BORDER);
		GridData gd_oComplexDataTypesList = new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1);
		gd_oComplexDataTypesList.heightHint = 118;
		gd_oComplexDataTypesList.widthHint = 247;
		oComplexDataTypesList.setLayoutData(gd_oComplexDataTypesList);
		addComplexDataTypesListListener();

		composite_1 = new Composite(composite, SWT.NONE);
		composite_1.setLayout(new GridLayout(1, false));
		GridData gd_composite_1 = new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1);
		gd_composite_1.heightHint = 37;
		gd_composite_1.widthHint = 106;
		composite_1.setLayoutData(gd_composite_1);
		
		oCreateComplexTypeButton = new Button(composite_1, SWT.NONE);
		GridData gd_oCreateComplexTypeButton = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		gd_oCreateComplexTypeButton.widthHint = 98;
		oCreateComplexTypeButton.setLayoutData(gd_oCreateComplexTypeButton);
		oCreateComplexTypeButton.setText("Create");
		addCreateComplexTypeButtonListener();
		
		oRenameComplexTypeButton = new Button(composite_1, SWT.NONE);
		oRenameComplexTypeButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		oRenameComplexTypeButton.setText("Rename");
		addRenameComplexTypeButtonListener();
		
		oDeleteComplexTypeButton = new Button(composite_1, SWT.NONE);
		oDeleteComplexTypeButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		oDeleteComplexTypeButton.setText("Delete");
		addDeleteComplexTypeButtonListener();
		
		Composite oComplexTypeDefinitionComposite = new Composite(oWizardPageGrid, SWT.NONE);
		GridData gd_oComplexTypeDefinitionComposite = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_oComplexTypeDefinitionComposite.widthHint = 548;
		gd_oComplexTypeDefinitionComposite.heightHint = 134;
		oComplexTypeDefinitionComposite.setLayoutData(gd_oComplexTypeDefinitionComposite);
		oComplexTypeDefinitionComposite.setLayout(new GridLayout(2, false));
		
		Label lblComplexTypeProperties = new Label(oComplexTypeDefinitionComposite, SWT.NONE);
		lblComplexTypeProperties.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		lblComplexTypeProperties.setText("Complex Data Type Properties:");
		
		Label lblType = new Label(oComplexTypeDefinitionComposite, SWT.NONE);
		lblType.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		lblType.setText("Available Types:");
		
		oComplexTypePropertiesList = new List(oComplexTypeDefinitionComposite, SWT.BORDER | SWT.V_SCROLL);
		GridData gd_oComplexTypePropertiesList = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_oComplexTypePropertiesList.widthHint = 306;
		oComplexTypePropertiesList.setLayoutData(gd_oComplexTypePropertiesList);
		addComplexTypePropertiesListListener();
		
		oTypeList = new List(oComplexTypeDefinitionComposite, SWT.BORDER | SWT.V_SCROLL);
		oTypeList.setItems(new String[] {"String", "Double", "Integer", "Float", "Boolean", "Long"});
		GridData gd_oTypeList = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_oTypeList.heightHint = 63;
		oTypeList.setLayoutData(gd_oTypeList);
		addTypeListListener();
		
		Composite oComplexTypeButtonsComposite = new Composite(oComplexTypeDefinitionComposite, SWT.NONE);
		oComplexTypeButtonsComposite.setLayout(new GridLayout(3, false));
		GridData gd_oComplexTypeButtonsComposite = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
		gd_oComplexTypeButtonsComposite.widthHint = 315;
		gd_oComplexTypeButtonsComposite.heightHint = 32;
		oComplexTypeButtonsComposite.setLayoutData(gd_oComplexTypeButtonsComposite);
		
		oCreateComplexTypePropertyButton = new Button(oComplexTypeButtonsComposite, SWT.NONE);
		GridData gd_oCreateComplexTypePropertyButton = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_oCreateComplexTypePropertyButton.widthHint = 106;
		oCreateComplexTypePropertyButton.setLayoutData(gd_oCreateComplexTypePropertyButton);
		oCreateComplexTypePropertyButton.setText("Create");
		addCreateComplexTypePropertyButtonListener();
		
		oRenameComplexTypePropertyButton = new Button(oComplexTypeButtonsComposite, SWT.NONE);
		GridData gd_oRenameComplexTypePropertyButton = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_oRenameComplexTypePropertyButton.widthHint = 101;
		oRenameComplexTypePropertyButton.setLayoutData(gd_oRenameComplexTypePropertyButton);
		oRenameComplexTypePropertyButton.setText("Rename");
		addRenameComplexTypePropertyButtonListener();
		
		oDeleteComplexTypePropertyButton = new Button(oComplexTypeButtonsComposite, SWT.NONE);
		GridData gd_oDeleteComplexTypePropertyButton = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_oDeleteComplexTypePropertyButton.widthHint = 103;
		oDeleteComplexTypePropertyButton.setLayoutData(gd_oDeleteComplexTypePropertyButton);
		oDeleteComplexTypePropertyButton.setText("Delete");
		addDeleteComplexTypePropertyButtonListener();
		
		oIsCollectionCheckBox = new Button(oComplexTypeDefinitionComposite, SWT.CHECK);
		oIsCollectionCheckBox.setText("Collection");
		addIsCollectionCheckBoxListener();
		
		initializeWizardSWTs();
		setPageComplete(isPageCompleted());
	}
	
	private void addAvailableComplexTypeListListener() {
		this.oAvailableComplexTypeList.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				getIOPropertyByName(oComplexPropertiesList.getSelection()[0]).setHasComplexType(getComplexTypeByName(oRESTClientResourcesList.getSelection()[0], oAvailableComplexTypeList.getSelection()[0]));
				getIOPropertyByName(oComplexPropertiesList.getSelection()[0]).setHasPrimitiveType(false);
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				getIOPropertyByName(oComplexPropertiesList.getSelection()[0]).setHasComplexType(getComplexTypeByName(oRESTClientResourcesList.getSelection()[0], oAvailableComplexTypeList.getSelection()[0]));
				getIOPropertyByName(oComplexPropertiesList.getSelection()[0]).setHasPrimitiveType(false);
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}

	private void addComplexPropertiesListListener() {
		this.oComplexPropertiesList.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				if(getIOPropertyByName(oComplexPropertiesList.getSelection()[0]).getHasComplexType() != null){
					oAvailableComplexTypeList.select(oAvailableComplexTypeList.indexOf(getIOPropertyByName(oComplexPropertiesList.getSelection()[0]).getHasComplexType().getComplexTypeName()));
				}
				else{
					oAvailableComplexTypeList.deselectAll();
				}
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				if(getIOPropertyByName(oComplexPropertiesList.getSelection()[0]).getHasComplexType() != null){
					oAvailableComplexTypeList.select(oAvailableComplexTypeList.indexOf(getIOPropertyByName(oComplexPropertiesList.getSelection()[0]).getHasComplexType().getComplexTypeName()));
				}
				else{
					oAvailableComplexTypeList.deselectAll();
				}
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}

	private void addDeleteComplexTypeButtonListener() {
		this.oDeleteComplexTypeButton.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				//find any input/output property that uses this complex type and set its type to null
				deleteIOPropertiesComplexType(oComplexDataTypesList.getSelection()[0]);
				
				//find any complex type that has a property of the complex type to be deleted and set it to null
				deleteComplexTypePropertiesComplexType(oComplexDataTypesList.getSelection()[0]);
				
				//delete an existing Complex Data Type
				oComplexTypes[getAlgoResourceIndexByName(oRESTClientResourcesList.getSelection()[0])].remove(getComplexTypeIndexByResourceAndName(oRESTClientResourcesList.getSelection()[0], oComplexDataTypesList.getSelection()[0]));
				populateComplexDataTypeSWTs(oRESTClientResourcesList.getSelection()[0]);
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}

	private void addRenameComplexTypeButtonListener() {
		this.oRenameComplexTypeButton.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				//rename an existing Complex Data Type
				Shell oShell = new Shell(SWT.ON_TOP | SWT.SYSTEM_MODAL | SWT.NO_TRIM | SWT.RESIZE);
				oShell.setSize(0,0);
				SimpleDialogBox oSimpleDialogBox = new SimpleDialogBox(oShell, "Provide new Complex Type name:", oComplexTypes[getAlgoResourceIndexByName(oRESTClientResourcesList.getSelection()[0])].get(getComplexTypeIndexByResourceAndName(oRESTClientResourcesList.getSelection()[0], oComplexDataTypesList.getSelection()[0])).getComplexTypeName());
				if(oSimpleDialogBox.open() == Window.OK){
					oComplexTypes[getAlgoResourceIndexByName(oRESTClientResourcesList.getSelection()[0])].get(getComplexTypeIndexByResourceAndName(oRESTClientResourcesList.getSelection()[0], oComplexDataTypesList.getSelection()[0])).setComplexTypeName(oSimpleDialogBox.getArtefactName());
					populateComplexDataTypeSWTs(oRESTClientResourcesList.getSelection()[0]);
				}
				oSimpleDialogBox.close();
				oShell.close();
				
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}

	private void addCreateComplexTypeButtonListener() {
		this.oCreateComplexTypeButton.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				//create a new Complex Data Type
				Shell oShell = new Shell(SWT.ON_TOP | SWT.SYSTEM_MODAL | SWT.NO_TRIM | SWT.RESIZE);
				oShell.setSize(0,0);
				SimpleDialogBox oSimpleDialogBox = new SimpleDialogBox(oShell, "New Complex Type name:", "complexTypeName");
				if(oSimpleDialogBox.open() == Window.OK){
					ComplexType oComplexType = oExternalServiceLayerCIMFactory.createComplexType();
					oComplexType.setComplexTypeName(oSimpleDialogBox.getArtefactName());
					oComplexTypes[getAlgoResourceIndexByName(oRESTClientResourcesList.getSelection()[0])].add(oComplexType);
					populateComplexDataTypeSWTs(oRESTClientResourcesList.getSelection()[0]);
				}
				oSimpleDialogBox.close();
				oShell.close();
				
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}

	private void addIsCollectionCheckBoxListener() {
		this.oIsCollectionCheckBox.addListener(SWT.Selection, new Listener(){

		@Override
		public void handleEvent(Event event) {
			if(oIsCollectionCheckBox.getSelection() == true){//if the developer checked the Collection button
				//change the selected property's multiplicity to array
				getComplexTypeProperty(oRESTClientResourcesList.getSelection()[0], oComplexDataTypesList.getSelection()[0], oComplexTypePropertiesList.getSelection()[0]).setIsUnique(false);
			}
			else{//otherwise, the developer deselected it and it takes a single value
				getComplexTypeProperty(oRESTClientResourcesList.getSelection()[0], oComplexDataTypesList.getSelection()[0], oComplexTypePropertiesList.getSelection()[0]).setIsUnique(true);
			}
			updateWidgetStatus();
			setPageComplete(isPageCompleted());
		}});
	}

	private void addDeleteComplexTypePropertyButtonListener() {
		this.oDeleteComplexTypePropertyButton.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				//delete an existing Complex Data Type Property
				oComplexTypes[getAlgoResourceIndexByName(oRESTClientResourcesList.getSelection()[0])].get(getComplexTypeIndexByResourceAndName(oRESTClientResourcesList.getSelection()[0], oComplexDataTypesList.getSelection()[0])).getHasComplexTypeProperties().remove(getComplexTypeProperty(oRESTClientResourcesList.getSelection()[0], oComplexDataTypesList.getSelection()[0], oComplexTypePropertiesList.getSelection()[0]));
				populateComplexDataTypePropertiesList(oRESTClientResourcesList.getSelection()[0], oComplexDataTypesList.getSelection()[0]);
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}

	private void addRenameComplexTypePropertyButtonListener() {
		this.oRenameComplexTypePropertyButton.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				//rename an existing Complex Data Type Property
				Shell oShell = new Shell(SWT.ON_TOP | SWT.SYSTEM_MODAL | SWT.NO_TRIM | SWT.RESIZE);
				oShell.setSize(0,0);
				SimpleDialogBox oSimpleDialogBox = new SimpleDialogBox(oShell, "Provide new Complex Type Property name:", getComplexTypeProperty(oRESTClientResourcesList.getSelection()[0], oComplexDataTypesList.getSelection()[0], oComplexTypePropertiesList.getSelection()[0]).getName());
				if(oSimpleDialogBox.open() == Window.OK){
					getComplexTypeProperty(oRESTClientResourcesList.getSelection()[0], oComplexDataTypesList.getSelection()[0], oComplexTypePropertiesList.getSelection()[0]).setName(oSimpleDialogBox.getArtefactName());
					populateComplexDataTypePropertiesList(oRESTClientResourcesList.getSelection()[0], oComplexDataTypesList.getSelection()[0]);
				}
				oSimpleDialogBox.close();
				oShell.close();
				
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}

	private void addCreateComplexTypePropertyButtonListener() {
		this.oCreateComplexTypePropertyButton.addListener(SWT.Selection, new Listener(){

			@Override
			public void handleEvent(Event event) {
				//create a new Complex Data Type Property
				Shell oShell = new Shell(SWT.ON_TOP | SWT.SYSTEM_MODAL | SWT.NO_TRIM | SWT.RESIZE);
				oShell.setSize(0,0);
				SimpleDialogBox oSimpleDialogBox = new SimpleDialogBox(oShell, "New Complex Type Property name:", "complexTypePropertyName");
				if(oSimpleDialogBox.open() == Window.OK){
					ComplexTypeProperty oComplexTypeProperty = oExternalServiceLayerCIMFactory.createComplexTypeProperty();
					oComplexTypeProperty.setName(oSimpleDialogBox.getArtefactName());
					oComplexTypeProperty.setIsUnique(true);
					oComplexTypes[getAlgoResourceIndexByName(oRESTClientResourcesList.getSelection()[0])].get(getComplexTypeIndexByResourceAndName(oRESTClientResourcesList.getSelection()[0], oComplexDataTypesList.getSelection()[0])).getHasComplexTypeProperties().add(oComplexTypeProperty);
					populateComplexDataTypePropertiesList(oRESTClientResourcesList.getSelection()[0], oComplexDataTypesList.getSelection()[0]);
				}
				oSimpleDialogBox.close();
				oShell.close();
				
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}

	private void addTypeListListener() {
		this.oTypeList.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				getComplexTypeProperty(oRESTClientResourcesList.getSelection()[0], oComplexDataTypesList.getSelection()[0], oComplexTypePropertiesList.getSelection()[0]).setType(oTypeList.getSelection()[0]);
				getComplexTypeProperty(oRESTClientResourcesList.getSelection()[0], oComplexDataTypesList.getSelection()[0], oComplexTypePropertiesList.getSelection()[0]).setPropertyHasComplexType(isPrimitiveDataType(oTypeList.getSelection()[0]) == true ? null : getComplexTypeByName(oRESTClientResourcesList.getSelection()[0], oTypeList.getSelection()[0]));
				getComplexTypeProperty(oRESTClientResourcesList.getSelection()[0], oComplexDataTypesList.getSelection()[0], oComplexTypePropertiesList.getSelection()[0]).setHasPrimitiveType(isPrimitiveDataType(oTypeList.getSelection()[0]));
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				getComplexTypeProperty(oRESTClientResourcesList.getSelection()[0], oComplexDataTypesList.getSelection()[0], oComplexTypePropertiesList.getSelection()[0]).setType(oTypeList.getSelection()[0]);
				getComplexTypeProperty(oRESTClientResourcesList.getSelection()[0], oComplexDataTypesList.getSelection()[0], oComplexTypePropertiesList.getSelection()[0]).setPropertyHasComplexType(isPrimitiveDataType(oTypeList.getSelection()[0]) == true ? null : getComplexTypeByName(oRESTClientResourcesList.getSelection()[0], oTypeList.getSelection()[0]));
				getComplexTypeProperty(oRESTClientResourcesList.getSelection()[0], oComplexDataTypesList.getSelection()[0], oComplexTypePropertiesList.getSelection()[0]).setHasPrimitiveType(isPrimitiveDataType(oTypeList.getSelection()[0]));
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}

	private void addComplexTypePropertiesListListener() {
		this.oComplexTypePropertiesList.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				if(getComplexTypeProperty(oRESTClientResourcesList.getSelection()[0], oComplexDataTypesList.getSelection()[0], oComplexTypePropertiesList.getSelection()[0]).getType() != null){
					oTypeList.setSelection(oTypeList.indexOf(getComplexTypeProperty(oRESTClientResourcesList.getSelection()[0], oComplexDataTypesList.getSelection()[0], oComplexTypePropertiesList.getSelection()[0]).getType()));
				}
				else{
					oTypeList.deselectAll();
				}
				if(getComplexTypeProperty(oRESTClientResourcesList.getSelection()[0], oComplexDataTypesList.getSelection()[0], oComplexTypePropertiesList.getSelection()[0]).isIsUnique() == false){
					oIsCollectionCheckBox.setSelection(true);
				}
				else{
					oIsCollectionCheckBox.setSelection(false);
				}
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				if(getComplexTypeProperty(oRESTClientResourcesList.getSelection()[0], oComplexDataTypesList.getSelection()[0], oComplexTypePropertiesList.getSelection()[0]).getType() != null){
					oTypeList.setSelection(oTypeList.indexOf(getComplexTypeProperty(oRESTClientResourcesList.getSelection()[0], oComplexDataTypesList.getSelection()[0], oComplexTypePropertiesList.getSelection()[0]).getType()));
				}
				else{
					oTypeList.deselectAll();
				}
				if(getComplexTypeProperty(oRESTClientResourcesList.getSelection()[0], oComplexDataTypesList.getSelection()[0], oComplexTypePropertiesList.getSelection()[0]).isIsUnique() == false){
					oIsCollectionCheckBox.setSelection(true);
				}
				else{
					oIsCollectionCheckBox.setSelection(false);
				}
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}

	private void addComplexDataTypesListListener() {
		this.oComplexDataTypesList.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				populateComplexDataTypePropertiesList(oRESTClientResourcesList.getSelection()[0], oComplexDataTypesList.getSelection()[0]);
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				populateComplexDataTypePropertiesList(oRESTClientResourcesList.getSelection()[0], oComplexDataTypesList.getSelection()[0]);
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}

	private void addRESTClientResourceListListener() {
		this.oRESTClientResourcesList.addSelectionListener(new SelectionListener(){

			@Override
			public void widgetSelected(SelectionEvent e) {
				populateComplexDataTypeSWTs(oRESTClientResourcesList.getSelection()[0]);
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				populateComplexDataTypeSWTs(oRESTClientResourcesList.getSelection()[0]);
				updateWidgetStatus();
				setPageComplete(isPageCompleted());
			}});
	}

	private void initializeWizardSWTs() {
		
		//initialize the values of all the SWT widgets
		if(this.bReloadExistingModels == false){
			initializeRESTClientResourcesSWTs();
			reloadComplexTypes();
		}//else reload existing valid external composition model
		else{
			reloadRESTClientResourcesSWTs();
		}
		updateWidgetStatus();
	}
	
	private void reloadRESTClientResourcesSWTs() {
		initializeRESTClientResourcesSWTs();
		reloadComplexTypes();
	}

	public void reloadComplexTypes() {
		
		System.out.println("There are " + this.oExternalCompositionWizardPage.getRESTClientResourcesArray().length + " resources to check.");
		
		//clear any existing complex data types
		for(int n = 0; n < this.oExternalCompositionWizardPage.getRESTClientResourcesArray().length; n++){
			if(this.oExternalCompositionWizardPage.getRESTClientResourcesArray()[n] == true){
				this.oComplexTypes[n].clear();
			}
		}

		for(int n = 0; n < this.oExternalCompositionWizardPage.getRESTClientResourcesArray().length; n++){
			if(this.oExternalCompositionWizardPage.getRESTClientResourcesArray()[n] == true){
				System.out.println("reloading complex types for resource " + n );
				loadExistantComplexTypes(this.oExternalCompositionWizardPage.getRESTClientResource()[n].getIsRESTClientResource().getAnnotatesAlgoResource().getName(), n);
			}
		}
		
		this.setPageComplete(this.isPageComplete());
	}

	private boolean loadExistantComplexTypes(String strRESTClientName, int iNewRESTClientIndex) {
		for(int n = 0; n < this.oExternalServiceLayerCIM.getHasAnnotation().size(); n++){
			if(this.oExternalServiceLayerCIM.getHasAnnotation().get(n) instanceof RESTClientResource){
				if(((RESTClientResource)this.oExternalServiceLayerCIM.getHasAnnotation().get(n)).getIsRESTClientResource().getAnnotatesAlgoResource().getName().equalsIgnoreCase(strRESTClientName)){
					this.oComplexTypes[iNewRESTClientIndex].addAll(((RESTClientResource)this.oExternalServiceLayerCIM.getHasAnnotation().get(n)).getIsRESTClientComplexType());
					updateComplexTypeReferences(((RESTClientResource)this.oExternalServiceLayerCIM.getHasAnnotation().get(n)), iNewRESTClientIndex);
				}
			}
		}
		
		return false;
	}

	private void updateComplexTypeReferences(RESTClientResource oRESTClientResource, int iNewRESTClientIndex) {
		//update input properties complex type references
		if((this.oExternalCompositionWizardPage.getRESTClientResource()[iNewRESTClientIndex].getTargetsService().getHasInputDataModel() != null)
				&& (oRESTClientResource.getTargetsService().getHasInputDataModel() != null)){
			for(int n = 0; n < this.oExternalCompositionWizardPage.getRESTClientResource()[iNewRESTClientIndex].getTargetsService().getHasInputDataModel().getHasInputProperties().size(); n++){
				for(int j = 0; j < oRESTClientResource.getTargetsService().getHasInputDataModel().getHasInputProperties().size(); j++){
					if(this.oExternalCompositionWizardPage.getRESTClientResource()[iNewRESTClientIndex].getTargetsService().getHasInputDataModel().getHasInputProperties().get(n).getName().equalsIgnoreCase(oRESTClientResource.getTargetsService().getHasInputDataModel().getHasInputProperties().get(j).getName())){
						for(int i = 0; i < this.oComplexTypes[iNewRESTClientIndex].size(); i++){
							if(this.oExternalCompositionWizardPage.getRESTClientResource()[iNewRESTClientIndex].getTargetsService().getHasInputDataModel().getHasInputProperties().get(n).isHasPrimitiveType() == false){
								if(this.oExternalCompositionWizardPage.getRESTClientResource()[iNewRESTClientIndex].getTargetsService().getHasInputDataModel().getHasInputProperties().get(n).getHasComplexType().getComplexTypeName().equalsIgnoreCase(this.oComplexTypes[iNewRESTClientIndex].get(i).getComplexTypeName())){
									this.oExternalCompositionWizardPage.getRESTClientResource()[iNewRESTClientIndex].getTargetsService().getHasInputDataModel().getHasInputProperties().get(n).setHasComplexType(this.oComplexTypes[iNewRESTClientIndex].get(i));
								}
							}
						}
					}
				}
			}
		}
		
		//update output properties complex type references
		if((this.oExternalCompositionWizardPage.getRESTClientResource()[iNewRESTClientIndex].getTargetsService().getHasOutputDataModel() != null)
				&& (oRESTClientResource.getTargetsService().getHasOutputDataModel() != null)){
			for(int n = 0; n < this.oExternalCompositionWizardPage.getRESTClientResource()[iNewRESTClientIndex].getTargetsService().getHasOutputDataModel().getHasOutputProperties().size(); n++){
				for(int j = 0; j < oRESTClientResource.getTargetsService().getHasOutputDataModel().getHasOutputProperties().size(); j++){
					if(this.oExternalCompositionWizardPage.getRESTClientResource()[iNewRESTClientIndex].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(n).getName().equalsIgnoreCase(oRESTClientResource.getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(j).getName())){
						for(int i = 0; i < this.oComplexTypes[iNewRESTClientIndex].size(); i++){
							if(this.oExternalCompositionWizardPage.getRESTClientResource()[iNewRESTClientIndex].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(n).isHasPrimitiveType() == false){
								if(this.oExternalCompositionWizardPage.getRESTClientResource()[iNewRESTClientIndex].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(n).getHasComplexType().getComplexTypeName().equalsIgnoreCase(this.oComplexTypes[iNewRESTClientIndex].get(i).getComplexTypeName())){
									this.oExternalCompositionWizardPage.getRESTClientResource()[iNewRESTClientIndex].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(n).setHasComplexType(this.oComplexTypes[iNewRESTClientIndex].get(i));
								}
							}
						}
					}
				}
			}
		}
		
	}

	private void populateComplexDataTypePropertiesList(String strRESTClientResourceName, String strComplexDataTypeName){
		this.oComplexTypePropertiesList.removeAll();
		ArrayList<String> listOfStrings = new ArrayList<String>();
		
		for(int n = 0; n < this.oComplexTypes[this.getAlgoResourceIndexByName(strRESTClientResourceName)].get(this.getComplexTypeIndexByResourceAndName(strRESTClientResourceName, strComplexDataTypeName)).getHasComplexTypeProperties().size(); n++){
			listOfStrings.add(this.oComplexTypes[this.getAlgoResourceIndexByName(strRESTClientResourceName)].get(this.getComplexTypeIndexByResourceAndName(strRESTClientResourceName, strComplexDataTypeName)).getHasComplexTypeProperties().get(n).getName());
		}
		
		java.util.Collections.sort(listOfStrings, Collator.getInstance());
		Iterator<String> iterator = listOfStrings.iterator();
		
		while(iterator.hasNext()){
			this.oComplexTypePropertiesList.add(iterator.next());
		}
	}

	private void populateComplexDataTypeSWTs(String strRESTClientResourceName) {
		populateComplexPropertiesList(strRESTClientResourceName);
		populateComplexDataTypesList(strRESTClientResourceName);
		populateAvailableComplexTypesList(strRESTClientResourceName);
		populateAvailableDataTypesList(strRESTClientResourceName);
	}

	private void populateAvailableComplexTypesList(String strRESTClientResourceName) {
		this.oAvailableComplexTypeList.removeAll();
		ArrayList<String> listOfStrings = new ArrayList<String>();
		
		for(int n = 0; n < oComplexTypes[this.getAlgoResourceIndexByName(strRESTClientResourceName)].size(); n++){
			listOfStrings.add(oComplexTypes[this.getAlgoResourceIndexByName(strRESTClientResourceName)].get(n).getComplexTypeName());
		}
		
		java.util.Collections.sort(listOfStrings, Collator.getInstance());
		Iterator<String> iterator = listOfStrings.iterator();
		
		while(iterator.hasNext()){
			this.oAvailableComplexTypeList.add(iterator.next());
		}
	}

	private void populateAvailableDataTypesList(String strRESTClientResourceName) {
		
		this.oTypeList.removeAll();
		ArrayList<String> listOfStrings = new ArrayList<String>();
		
		//always add at the top the primitive types
		listOfStrings.add("String");
		listOfStrings.add("Double");
		listOfStrings.add("Integer");
		listOfStrings.add("Float");
		listOfStrings.add("Boolean");
		listOfStrings.add("Long");
		
		//add the complex data types of this service
		for(int n = 0; n < oComplexTypes[this.getAlgoResourceIndexByName(strRESTClientResourceName)].size(); n++){
			listOfStrings.add(oComplexTypes[this.getAlgoResourceIndexByName(strRESTClientResourceName)].get(n).getComplexTypeName());
		}
		
		java.util.Collections.sort(listOfStrings, Collator.getInstance());
		Iterator<String> iterator = listOfStrings.iterator();
		
		while(iterator.hasNext()){
			this.oTypeList.add(iterator.next());
		}
	}

	private void populateComplexDataTypesList(String strRESTClientResourceName) {
		this.oComplexDataTypesList.removeAll();
		ArrayList<String> listOfStrings = new ArrayList<String>();
		
		for(int n = 0; n < oComplexTypes[this.getAlgoResourceIndexByName(strRESTClientResourceName)].size(); n++){
			listOfStrings.add(oComplexTypes[this.getAlgoResourceIndexByName(strRESTClientResourceName)].get(n).getComplexTypeName());
		}
		
		java.util.Collections.sort(listOfStrings, Collator.getInstance());
		Iterator<String> iterator = listOfStrings.iterator();
		
		while(iterator.hasNext()){
			this.oComplexDataTypesList.add(iterator.next());
		}
	}

	private void populateComplexPropertiesList(String strRESTClientResourceName) {
		this.oComplexPropertiesList.removeAll();
		ArrayList<String> listOfStrings = new ArrayList<String>();
		
		for(int n = 0; n < this.oExternalCompositionWizardPage.getRESTClientResourcesArray().length; n++){
			if(this.oExternalCompositionWizardPage.getRESTClientResourcesArray()[n] == true){
				if(this.oExternalCompositionWizardPage.getRESTClientResource()[n].getIsRESTClientResource().getAnnotatesAlgoResource().getName().equalsIgnoreCase(strRESTClientResourceName)){
					if(this.oExternalCompositionWizardPage.getRESTClientResource()[n].getTargetsService().getHasInputDataModel() != null){
						//add any complex types of input data model
						for(int i = 0; i < this.oExternalCompositionWizardPage.getRESTClientResource()[n].getTargetsService().getHasInputDataModel().getHasInputProperties().size(); i++){
							if(this.oExternalCompositionWizardPage.getRESTClientResource()[n].getTargetsService().getHasInputDataModel().getHasInputProperties().get(i).getType().equalsIgnoreCase("Complex")){
								listOfStrings.add("Input:" + this.oExternalCompositionWizardPage.getRESTClientResource()[n].getTargetsService().getHasInputDataModel().getHasInputProperties().get(i).getName());
							}
						}
					}
					if(this.oExternalCompositionWizardPage.getRESTClientResource()[n].getTargetsService().getHasOutputDataModel() != null){
						//add any complex types of output data model
						for(int i = 0; i < this.oExternalCompositionWizardPage.getRESTClientResource()[n].getTargetsService().getHasOutputDataModel().getHasOutputProperties().size(); i++){
							if(this.oExternalCompositionWizardPage.getRESTClientResource()[n].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(i).getType().equalsIgnoreCase("Complex")){
								listOfStrings.add("Output:" + this.oExternalCompositionWizardPage.getRESTClientResource()[n].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(i).getName());
							}
						}
					}	
				}			
			}
		}
		
		java.util.Collections.sort(listOfStrings, Collator.getInstance());
		Iterator<String> iterator = listOfStrings.iterator();
		
		while(iterator.hasNext()){
			this.oComplexPropertiesList.add(iterator.next());
		}
	}

	private void initializeRESTClientResourcesSWTs() {
		ArrayList<String> listOfStrings = new ArrayList<String>();
		
		for(int n = 0; n < this.oExternalCompositionWizardPage.getRESTClientResourcesArray().length; n++){
			if(this.oExternalCompositionWizardPage.getRESTClientResourcesArray()[n] == true){
				listOfStrings.add(this.oExternalCompositionWizardPage.getRESTClientResource()[n].getIsRESTClientResource().getAnnotatesAlgoResource().getName());
			}
		}
		
		java.util.Collections.sort(listOfStrings, Collator.getInstance());
		Iterator<String> iterator = listOfStrings.iterator();
		
		while(iterator.hasNext()){
			this.oRESTClientResourcesList.add(iterator.next());
		}
	}

	private boolean isPageCompleted() {
		if(allComplexTypesAreValid() == false){
			this.setPageComplete(false);
			return false;
		}
		if(allIOPropertiesHaveAssignedComplexType() == false){
			this.setPageComplete(false);
			return false;
		}
		
		//else everything is ok
		setErrorMessage(null);
		this.setPageComplete(true);
		return true;
	}

	private boolean allIOPropertiesHaveAssignedComplexType() {
		for(int n = 0; n < this.oExternalCompositionWizardPage.getRESTClientResourcesArray().length; n++){
			if(this.oExternalCompositionWizardPage.getRESTClientResourcesArray()[n] == true){
				if(this.oExternalCompositionWizardPage.getRESTClientResource()[n].getTargetsService().getHasInputDataModel() != null){
					//check if all input data model properties that have complex type are actually assigned a complex type
					for(int i = 0; i < this.oExternalCompositionWizardPage.getRESTClientResource()[n].getTargetsService().getHasInputDataModel().getHasInputProperties().size(); i++){
						if(this.oExternalCompositionWizardPage.getRESTClientResource()[n].getTargetsService().getHasInputDataModel().getHasInputProperties().get(i).getType().equalsIgnoreCase("Complex")){
							if(this.oExternalCompositionWizardPage.getRESTClientResource()[n].getTargetsService().getHasInputDataModel().getHasInputProperties().get(i).getHasComplexType() == null){
								setErrorMessage("Every input data model property that is of Complex Type must be assigned to a Complex Type. Property " + this.oExternalCompositionWizardPage.getRESTClientResource()[n].getTargetsService().getHasInputDataModel().getHasInputProperties().get(i).getName() +
										" of RESTClient Resource " + this.oExternalCompositionWizardPage.getRESTClientResource()[n].getIsRESTClientResource().getAnnotatesAlgoResource().getName() + " is not assigned to a Complex Type");
								return false;
							}
						}
					}
				}
				if(this.oExternalCompositionWizardPage.getRESTClientResource()[n].getTargetsService().getHasOutputDataModel() != null){
					//check if all output data model properties that have complex type are actually assigned a complex type
					for(int i = 0; i < this.oExternalCompositionWizardPage.getRESTClientResource()[n].getTargetsService().getHasOutputDataModel().getHasOutputProperties().size(); i++){
						if(this.oExternalCompositionWizardPage.getRESTClientResource()[n].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(i).getType().equalsIgnoreCase("Complex")){
							if(this.oExternalCompositionWizardPage.getRESTClientResource()[n].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(i).getHasComplexType() == null){
								setErrorMessage("Every output data model property that is of Complex Type must be assigned to a Complex Type. Property " + this.oExternalCompositionWizardPage.getRESTClientResource()[n].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(i).getName() +
										" of RESTClient Resource " + this.oExternalCompositionWizardPage.getRESTClientResource()[n].getIsRESTClientResource().getAnnotatesAlgoResource().getName() + " is not assigned to a Complex Type");
								return false;
							}
						}
					}
				}	
			}			
		}
		
		return true;
	}

	private boolean allComplexTypesAreValid() {
		if(allComplexTypesHaveAtLeastOneProperty() == false){
			return false;
		}
		
		if(allComplexTypePropertiesHaveType() == false){
			return false;
		}
		
		return true;
	}

	private boolean allComplexTypePropertiesHaveType() {
		for(int n = 0; n < this.oExternalCompositionWizardPage.getRESTClientResourcesArray().length; n++){
			if(this.oExternalCompositionWizardPage.getRESTClientResourcesArray()[n] == true){
				for(int i = 0; i < this.oComplexTypes[n].size(); i++){
					for(int j = 0; j < this.oComplexTypes[n].get(i).getHasComplexTypeProperties().size(); j++){
						if(this.oComplexTypes[n].get(i).getHasComplexTypeProperties().get(j).getType() == null){
							setErrorMessage("Every complex type property must have a type. Property " + this.oComplexTypes[n].get(i).getHasComplexTypeProperties().get(j).getName() +
									" of Complex Type " + this.oComplexTypes[n].get(i).getComplexTypeName() + " of RESTClient Resource " + this.oExternalCompositionWizardPage.getRESTClientResource()[n].getIsRESTClientResource().getAnnotatesAlgoResource().getName() + " does not have a type.");
							return false;
						}
					}
				}
			}
		}
		
		return true;
	}

	private boolean allComplexTypesHaveAtLeastOneProperty() {
		for(int n = 0; n < this.oExternalCompositionWizardPage.getRESTClientResourcesArray().length; n++){
			if(this.oExternalCompositionWizardPage.getRESTClientResourcesArray()[n] == true){
				for(int i = 0; i < this.oComplexTypes[n].size(); i++){
					if(this.oComplexTypes[n].get(i).getHasComplexTypeProperties().size() < 1){
						setErrorMessage("Every Complex Type must have at least one property. Complex Type " + this.oComplexTypes[n].get(i).getComplexTypeName() + " of RESTclient Resource " + this.oExternalCompositionWizardPage.getRESTClientResource()[n].getIsRESTClientResource().getAnnotatesAlgoResource().getName() + " does not have any.");
						return false;
					}
				}
			}
		}
		
		return true;
	}

	private void updateWidgetStatus() {
		updateRESTClientResourcesSWTs();
		updateComplexDastaTypeDefinitionSWTs();
	}
	
	private void updateComplexDastaTypeDefinitionSWTs() {
		if(this.oRESTClientResourcesList.getSelectionIndex() != -1){
			this.oCreateComplexTypeButton.setEnabled(true);
			if(this.oComplexDataTypesList.getSelectionIndex() != -1){
				this.oRenameComplexTypeButton.setEnabled(true);
				this.oDeleteComplexTypeButton.setEnabled(true);
				this.oComplexTypePropertiesList.setEnabled(true);
				this.oCreateComplexTypePropertyButton.setEnabled(true);
				if(this.oComplexTypePropertiesList.getSelectionIndex() != -1){
					this.oRenameComplexTypePropertyButton.setEnabled(true);
					this.oDeleteComplexTypePropertyButton.setEnabled(true);
					this.oTypeList.setEnabled(true);
					this.oIsCollectionCheckBox.setEnabled(true);
				}
				else{
					this.oRenameComplexTypePropertyButton.setEnabled(false);
					this.oDeleteComplexTypePropertyButton.setEnabled(false);
					this.oTypeList.setEnabled(false);
					this.oIsCollectionCheckBox.setEnabled(false);
				}
			}
			else{
				this.oRenameComplexTypeButton.setEnabled(false);
				this.oDeleteComplexTypeButton.setEnabled(false);
				this.oComplexTypePropertiesList.setEnabled(false);
				this.oCreateComplexTypePropertyButton.setEnabled(false);
				this.oRenameComplexTypePropertyButton.setEnabled(false);
				this.oDeleteComplexTypePropertyButton.setEnabled(false);
				this.oTypeList.setEnabled(false);
				this.oIsCollectionCheckBox.setEnabled(false);
			}
		}
		else{
			this.oCreateComplexTypeButton.setEnabled(false);
			this.oRenameComplexTypeButton.setEnabled(false);
			this.oDeleteComplexTypeButton.setEnabled(false);
			this.oComplexTypePropertiesList.setEnabled(false);
			this.oCreateComplexTypePropertyButton.setEnabled(false);
			this.oRenameComplexTypePropertyButton.setEnabled(false);
			this.oDeleteComplexTypePropertyButton.setEnabled(false);
			this.oTypeList.setEnabled(false);
			this.oIsCollectionCheckBox.setEnabled(false);
		}
	}

	private void updateRESTClientResourcesSWTs() {
		if(this.oRESTClientResourcesList.getSelectionIndex() != -1){
			this.oComplexPropertiesList.setEnabled(true);
			this.oComplexDataTypesList.setEnabled(true);
			if(this.oComplexPropertiesList.getSelectionIndex() != -1){
				this.oAvailableComplexTypeList.setEnabled(true);
			}
			else{
				this.oAvailableComplexTypeList.setEnabled(false);
			}
		}
		else{
			this.oComplexPropertiesList.setEnabled(false);
			this.oComplexDataTypesList.setEnabled(false);
			this.oAvailableComplexTypeList.setEnabled(false);
		}
	}

	private ComplexTypeProperty getComplexTypeProperty(String strRESTClientName, String strComplexTypeName, String strComplexTypePropertyName){
		
		for(int n = 0; n < this.oComplexTypes[this.getAlgoResourceIndexByName(strRESTClientName)].get(this.getComplexTypeIndexByResourceAndName(strRESTClientName, strComplexTypeName)).getHasComplexTypeProperties().size(); n++){
			if(this.oComplexTypes[this.getAlgoResourceIndexByName(strRESTClientName)].get(this.getComplexTypeIndexByResourceAndName(strRESTClientName, strComplexTypeName)).getHasComplexTypeProperties().get(n).getName().equalsIgnoreCase(strComplexTypePropertyName)){
				return this.oComplexTypes[this.getAlgoResourceIndexByName(strRESTClientName)].get(this.getComplexTypeIndexByResourceAndName(strRESTClientName, strComplexTypeName)).getHasComplexTypeProperties().get(n);
			}
		}
		try {
			throw new ExecutionException(new Throwable());
		} catch (ExecutionException e) {
			Activator.log("Unable to find complex type property by name " + strComplexTypePropertyName, e);
			return null;
		}
	}
	
	private int getComplexTypeIndexByResourceAndName(String strRESTClientName, String strComplexTypeName){
		for(int n = 0; n < this.oComplexTypes[this.getAlgoResourceIndexByName(strRESTClientName)].size(); n++){
			if(this.oComplexTypes[this.getAlgoResourceIndexByName(strRESTClientName)].get(n).getComplexTypeName().equalsIgnoreCase(strComplexTypeName)){
				return n;
			}
		}
		try {
			throw new ExecutionException(new Throwable());
		} catch (ExecutionException e) {
			Activator.log("Unable to find complex type index.", e);
			return -1;
		}
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
	
	private ModelProperty getIOPropertyByName(String strModelPropertyName){
		if(strModelPropertyName.contains("Input:")){
			for(int n = 0; n < this.oExternalCompositionWizardPage.getRESTClientResourcesArray().length; n++){
				if(this.oExternalCompositionWizardPage.getRESTClientResourcesArray()[n] == true){
					if(this.oExternalCompositionWizardPage.getRESTClientResource()[n].getIsRESTClientResource().getAnnotatesAlgoResource().getName().equalsIgnoreCase(this.oRESTClientResourcesList.getSelection()[0])){
						for(int i = 0; i < this.oExternalCompositionWizardPage.getRESTClientResource()[n].getTargetsService().getHasInputDataModel().getHasInputProperties().size(); i++){
							if(strModelPropertyName.contains(this.oExternalCompositionWizardPage.getRESTClientResource()[n].getTargetsService().getHasInputDataModel().getHasInputProperties().get(i).getName())){
								return this.oExternalCompositionWizardPage.getRESTClientResource()[n].getTargetsService().getHasInputDataModel().getHasInputProperties().get(i);
							}
						}
					}
				}
			}
		}
		else if(strModelPropertyName.contains("Output:")){
			for(int n = 0; n < this.oExternalCompositionWizardPage.getRESTClientResourcesArray().length; n++){
				if(this.oExternalCompositionWizardPage.getRESTClientResourcesArray()[n] == true){
					if(this.oExternalCompositionWizardPage.getRESTClientResource()[n].getIsRESTClientResource().getAnnotatesAlgoResource().getName().equalsIgnoreCase(this.oRESTClientResourcesList.getSelection()[0])){
						for(int i = 0; i < this.oExternalCompositionWizardPage.getRESTClientResource()[n].getTargetsService().getHasOutputDataModel().getHasOutputProperties().size(); i++){
							if(strModelPropertyName.contains(this.oExternalCompositionWizardPage.getRESTClientResource()[n].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(i).getName())){
								return this.oExternalCompositionWizardPage.getRESTClientResource()[n].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(i);
							}
						}
					}
				}
			}
		}
		try {
			throw new ExecutionException(new Throwable());
		} catch (ExecutionException e) {
			Activator.log("Unable to find IO property by name " + strModelPropertyName, e);
			return null;
		}
	}
	
	private ComplexType getComplexTypeByName(String strRESTClientName, String strComplexTypeName){
		for(int n = 0; n < this.oExternalCompositionWizardPage.getRESTClientResourcesArray().length; n++){
			if(this.oExternalCompositionWizardPage.getRESTClientResourcesArray()[n] == true){
				if(this.oExternalCompositionWizardPage.getRESTClientResource()[n].getIsRESTClientResource().getAnnotatesAlgoResource().getName().equalsIgnoreCase(strRESTClientName)){
					for(int i = 0; i < this.oComplexTypes[n].size(); i++){
						if(this.oComplexTypes[n].get(i).getComplexTypeName().equalsIgnoreCase(strComplexTypeName)){
							return this.oComplexTypes[n].get(i);
						}
					}
				}
			}
		}
		try {
			throw new ExecutionException(new Throwable());
		} catch (ExecutionException e) {
			Activator.log("Unable to find complex type by name " + strComplexTypeName, e);
			return null;
		}	}
	
	private void deleteIOPropertiesComplexType(String strComplexTypeName){
		for(int n = 0; n < this.oExternalCompositionWizardPage.getRESTClientResourcesArray().length; n++){
			if(this.oExternalCompositionWizardPage.getRESTClientResourcesArray()[n] == true){
				if(this.oExternalCompositionWizardPage.getRESTClientResource()[n].getIsRESTClientResource().getAnnotatesAlgoResource().getName().equalsIgnoreCase(this.oRESTClientResourcesList.getSelection()[0])){
					
					//search for input properties that have this complex type
					if(this.oExternalCompositionWizardPage.getRESTClientResource()[n].getTargetsService().getHasInputDataModel() != null){
						for(int i = 0; i < this.oExternalCompositionWizardPage.getRESTClientResource()[n].getTargetsService().getHasInputDataModel().getHasInputProperties().size(); i++){
							if(this.oExternalCompositionWizardPage.getRESTClientResource()[n].getTargetsService().getHasInputDataModel().getHasInputProperties().get(i).getHasComplexType() != null){
								if(this.oExternalCompositionWizardPage.getRESTClientResource()[n].getTargetsService().getHasInputDataModel().getHasInputProperties().get(i).getHasComplexType().getComplexTypeName().equalsIgnoreCase(strComplexTypeName)){
									this.oExternalCompositionWizardPage.getRESTClientResource()[n].getTargetsService().getHasInputDataModel().getHasInputProperties().get(i).setHasComplexType(null);
								}
							}
						}
					}
					
					//search for output properties that have this complex type
					if(this.oExternalCompositionWizardPage.getRESTClientResource()[n].getTargetsService().getHasOutputDataModel() != null){
						for(int i = 0; i < this.oExternalCompositionWizardPage.getRESTClientResource()[n].getTargetsService().getHasOutputDataModel().getHasOutputProperties().size(); i++){
							if(this.oExternalCompositionWizardPage.getRESTClientResource()[n].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(i).getHasComplexType() != null){
								if(this.oExternalCompositionWizardPage.getRESTClientResource()[n].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(i).getHasComplexType().getComplexTypeName().equalsIgnoreCase(strComplexTypeName)){
									this.oExternalCompositionWizardPage.getRESTClientResource()[n].getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(i).setHasComplexType(null);
								}
							}
						}
					}
				}
			}
		}
	}
	
	private void deleteComplexTypePropertiesComplexType(String strComplexTypeName){
		for(int n = 0; n < this.oExternalCompositionWizardPage.getRESTClientResourcesArray().length; n++){
			if(this.oExternalCompositionWizardPage.getRESTClientResourcesArray()[n] == true){
				if(this.oExternalCompositionWizardPage.getRESTClientResource()[n].getIsRESTClientResource().getAnnotatesAlgoResource().getName().equalsIgnoreCase(this.oRESTClientResourcesList.getSelection()[0])){
					for(int i = 0; i < this.oComplexTypes[n].size(); i++){
						for(int j = 0; j < this.oComplexTypes[n].get(i).getHasComplexTypeProperties().size(); j++){
							if(this.oComplexTypes[n].get(i).getHasComplexTypeProperties().get(j).getPropertyHasComplexType() != null){
								if(this.oComplexTypes[n].get(i).getHasComplexTypeProperties().get(j).getPropertyHasComplexType().getComplexTypeName().equalsIgnoreCase(strComplexTypeName)){
									this.oComplexTypes[n].get(i).getHasComplexTypeProperties().get(j).setPropertyHasComplexType(null);
								}
							}
						}
					}
				}
			}
		}
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
		else if(strDataTypeName.equalsIgnoreCase("Long")){
			return true;
		}
		else{
			return false;
		}
	}
	
	public List getRESTClientResourcesList(){
		return this.oRESTClientResourcesList;
	}
	
	public void createExternalServiceLayerCIM(){
		
		//add the complex types of each RESTClient resource
		for(int n = 0; n < this.oExternalCompositionWizardPage.getRESTClientResourcesArray().length; n++){
			if(this.oExternalCompositionWizardPage.getRESTClientResourcesArray()[n] == true){
//				if(this.bReloadExistingModels == true){
//					for(int i = 0; i < this.oComplexTypes[n].size(); i++){
//						if(complexTypeIsNew(n, i) == true){
//							this.oExternalCompositionWizardPage.getRESTClientResource()[n].getIsRESTClientComplexType().add(this.oComplexTypes[n].get(i));
//						}
//						else{//update it just in case any modifications have been done
//							this.oExternalCompositionWizardPage.getRESTClientResource()[n].getIsRESTClientComplexType().set(getComplexTypeIndex(n,i), createNewComplexTypeInstance((this.oComplexTypes[n].get(i))));
//							fixComplexTypeCrossReferences(this.oExternalCompositionWizardPage.getRESTClientResource()[n], );
//						}
//					}
//				}
//				else{
				this.oExternalCompositionWizardPage.getRESTClientResource()[n].getIsRESTClientComplexType().clear();
				this.oExternalCompositionWizardPage.getRESTClientResource()[n].getIsRESTClientComplexType().addAll(this.oComplexTypes[n]);
//				}
			}
		}
	}

	private boolean complexTypeIsNew(int iServiceIndex, int iComplexTypeIndex) {
		for(int n = 0; n < this.oExternalCompositionWizardPage.getRESTClientResource()[iServiceIndex].getIsRESTClientComplexType().size(); n++){
			if(this.oExternalCompositionWizardPage.getRESTClientResource()[iServiceIndex].getIsRESTClientComplexType().get(n).getComplexTypeName().equalsIgnoreCase(this.oComplexTypes[iServiceIndex].get(iComplexTypeIndex).getComplexTypeName())){
				return false;
			}
		}
		return true;
	}

}