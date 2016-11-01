package eu.fp7.scase.abacAuthorizationWizard;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;

import AuthenticationLayerCIM.AuthenticationLayerCIMFactory;
import AuthenticationLayerCIM.AuthenticationMode;
import AuthenticationLayerCIM.BothMode;
import AuthenticationLayerCIM.GuestMode;
import AuthorizationLayerCIM.AllowedAction;
import AuthorizationLayerCIM.AnnCRUDActivity;
import AuthorizationLayerCIM.AnnProperty;
import AuthorizationLayerCIM.AnnResource;
import AuthorizationLayerCIM.AnnotatedElement;
import AuthorizationLayerCIM.Annotation;
import AuthorizationLayerCIM.AnnotationModel;
import AuthorizationLayerCIM.Attribute;
import AuthorizationLayerCIM.AttributeCategory;
import AuthorizationLayerCIM.AuthorizableResource;
import AuthorizationLayerCIM.AuthorizationLayerCIMFactory;
import AuthorizationLayerCIM.AuthorizationSubject;
import AuthorizationLayerCIM.CombiningAlgorithm;
import AuthorizationLayerCIM.Condition;
import AuthorizationLayerCIM.NewProperty;
import AuthorizationLayerCIM.Operator;
import AuthorizationLayerCIM.ResourceAccessPolicy;
import AuthorizationLayerCIM.ResourceAccessPolicySet;
import AuthorizationLayerCIM.ResourceAccessRule;
import AuthorizationLayerCIM.RuleType;
import ServiceCIM.CRUDActivity;
import ServiceCIM.CRUDVerb;
import ServiceCIM.Property;
import ServiceCIM.RESTfulServiceCIM;
import ServiceCIM.Resource;
import eu.fp7.scase.abacAuthorizationWizard.helpers.ABACContentProvider;
import eu.fp7.scase.abacAuthorizationWizard.helpers.ABACLabelProvider;
import eu.fp7.scase.abacAuthorizationWizard.helpers.AttributeCategoryContentProvider;
import eu.fp7.scase.abacAuthorizationWizard.helpers.AttributeCategoryLabelProvider;
import eu.fp7.scase.abacAuthorizationWizard.helpers.ConditionContentProvider;
import eu.fp7.scase.abacAuthorizationWizard.helpers.ConditionLabelProvider;
import eu.fp7.scase.abacAuthorizationWizard.helpers.PropertyContentProvider;
import eu.fp7.scase.abacAuthorizationWizard.helpers.PropertyLabelProvider;
import eu.fp7.scase.abacAuthorizationWizard.helpers.ResourceContentProvider;
import eu.fp7.scase.abacAuthorizationWizard.helpers.ResourceLabelProvider;

public class ABACWizardPage extends WizardPage {

	//Inputs
	private AnnotationModel oAuthorizationCIM;
	private AuthorizationLayerCIM.AnnotationModel oInnerAuthorizationCIM;
	private AuthorizationLayerCIMFactory oAuthorizationLayerCIMFactory;
	private AuthenticationLayerCIM.AnnotationModel oAuthenticationCIM;
	private RESTfulServiceCIM oRESTfulServiceCIM;

	//Inner variables
	private int intSelectedResourceIndex;
	private AuthorizationSubject oAuthorizationSubject;
	private Resource oSelectedResource;
	private ResourceAccessPolicySet oSelectedPolicySet;
	private ResourceAccessPolicy oSelectedPolicy;
	private ResourceAccessRule oSelectedRule;
	private Condition oSelectedCondition;
	private boolean[] bIsResourceAuthorizable;
	private int intSelectedValueIndex = -1;
	private boolean bIsRuleSelected;
	private boolean bPolicyRuleUpdateAll;
	private boolean bFirstPolicyRuleSelection;
	private int intAuthenticationResourceIndex = -1 ;
	private ABACContentProvider oABACContentProvider;
	private ABACLabelProvider oABACLabelProvider;
	private ConditionLabelProvider oConditionLabelProvider;

	//counters just for naming new elements
	private int intPolicySetCounter;
	private int intPolicyCounter;
	private int intRuleCounter;
	private int intNewPropertyCounter;

	//validation boolean maps
	private Map<AuthorizableResource , Resource> oAnnotationToResourceMap;
	private Map<AuthorizableResource, Boolean> oValidResourceMap;
	private Map<ResourceAccessPolicySet, Boolean> oValidPolicySetMap;
	private Map<ResourceAccessPolicy, Boolean> oValidPolicyMap;
	private Map<ResourceAccessRule, Boolean> oValidRuleMap;
	private Map<Condition, Boolean> oValidConditionMap;

	//Map containing error messages for all the invalid authorization elements.
	private Map<EObject , String> oErrorMessages;

	private Resource currentValidatingResource = null;

	//SWTs ------------------------------------------------------------------------
	private SashForm oPrimarySashForm;

	//Resources, Policies and rules tree view panel
	private Composite oTreeViewPanel;
	private Group oTreeViewPanelGroup;
	private TreeViewer oTreeViewer;
	private Tree oPolicyRuleTree;

	//Dynamic Panel
	private Composite oDynamicPanel;
	private StackLayout oDynamicPanelLayout ;

	//Resource selected panel
	private Group oResourceSelectedPanel;
	private Composite oNewPropetiesListView;
	private Button oIsAuthorizableResourceButton;
	private List oNewPropertiesList;
	private Label lblAdditionalProperties;
	private Composite oNewPropertiesConfig;
	private Text oNewPropertyNameText;
	private Combo oNewPropertyTypeCombo;
	private Button oNewPropertyIsCollectionCheck;
	private Button oDeleteNewPropertyBtn;
	private Button oNewPropertyBtn;

	//Policy Set Selected Panel
	private Group oPolicySetSelectedPanel;
	private Label oPolicySetNameLabel;
	private Text oPolicySetNameText;
	private Label oPolicyCombAlgorithmLabel;
	private Combo oPolicyCombiningAlgorithmCombo;
	private Button oNewPolicyButton;
	private Button oDeleteAllPolicesButton;
	private Button oNewPolicySetButton;
	private Button oDeletePolicySetButton;

	//Policy/Rule Selected Panel ----------------------------
	private Group oPolicyRuleSelectedPanel;
	private Composite oPolicyRulePanel;
	private Group oConditionConfigGroup;
	private Label oPolicyRuleNameLabel;
	private Text oPolicyRuleNameText;
	private Label oRuleCombiningAlgorithmLabel;
	private Combo oRuleCombiningAlgorithmTypeCombo;
	private Button oNewPolicyRuleButton;
	private Button oDeletePolicyRuleButton;
	private Composite oActionsPanel;
	private StackLayout oActionsRuleStackLayout;
	private Composite oActionsNewRuleComp;
	private Button btnGet;
	private Button btnPut;
	private Button btnPost;
	private Button btnDelete;
	private Label lblAllowedActions;
	private Button oNewRuleButton;

	//Conditions list
	private Group oConditionListPanel;
	private ListViewer oConditionListViewer;
	private List oConditionList;
	private Composite oConditionButtonPanel;
	private Button oNewConditionButton;
	private Button oDeleteConditionButton;

	//Condition Configuration
	private Label oAttribueCategoryLabel;
	private Label oOperatorLabel;
	private Label oResourceLabel;
	private Label oPropertyValuesLabel;
	private Combo oLeftSideCategoryCombo;
	private ComboViewer oLeftSideCategoryViewer;
	private Combo oLeftSideResourceCombo;
	private ComboViewer oLeftSideResourceComboViewer;
	private Combo oLeftPropertyCombo;
	private ComboViewer oLeftPropertyComboViewer;
	private Combo oRightSideCategoryCombo;
	private ComboViewer oRightSideCategoryViewer;
	private Combo oRightSideResourceCombo;
	private ComboViewer oRightSideResourceComboViewer;
	private Composite oRightPropertyValuesComposite;
	private Combo oRightPropertyCombo;
	private ComboViewer oRightPropertyComboViewer;
	private Label oLeftTypeLabel;
	private Label oTypeLabel;
	private List oConstantValuesList;
	private Label oRightSideLabel;
	private StackLayout oRightPropertyValuesLayout;
	private Label oRightTypeLabel;
	private Composite oRightSideResourceValueComposite;
	private Composite oRightValueComposite;
	private Button oDeleteValueButton;
	private StackLayout oRightSideResourceValueLayout;
	private Button oNewValueButton;
	private Label oLeftSideLabel;
	private Button oEditValueButton;
	private Combo oOperatorCombo;
	private ComboViewer oOperatorComboViewer;
	private Button oLeftResourceAsAttributeBtn;
	private Label oResourceAsAttributeLabel;


	/**
	 * Create the wizard.
	 */
	public ABACWizardPage(String strOutputFolder, RESTfulServiceCIM oRESTfulServiceCIM,
			AuthorizationLayerCIM.AnnotationModel oAuthorizationCIM, AuthenticationLayerCIM.AnnotationModel oAuthenticationCIM, boolean bReloadExistingModels) {
		super("ABAC Authorization Model Wizard");
		setDescription("Design the ABAC authorization policy.");
		this.oAuthorizationLayerCIMFactory = AuthorizationLayerCIMFactory.eINSTANCE;
		this.oRESTfulServiceCIM = oRESTfulServiceCIM;
		this.oAuthorizationCIM = oAuthorizationCIM;
		this.oInnerAuthorizationCIM = oAuthorizationLayerCIMFactory.createAnnotationModel();
		this.oAuthenticationCIM = oAuthenticationCIM;

		this.bIsResourceAuthorizable = new boolean[this.oRESTfulServiceCIM.getHasResources().size()];
		this.oAnnotationToResourceMap = new HashMap<AuthorizableResource, Resource>();
		this.oValidResourceMap = new HashMap<AuthorizableResource, Boolean>();
		this.oValidPolicySetMap = new HashMap<ResourceAccessPolicySet, Boolean>();
		this.oValidPolicyMap = new HashMap<ResourceAccessPolicy, Boolean>();
		this.oValidRuleMap = new HashMap<ResourceAccessRule, Boolean>();
		this.oValidConditionMap = new HashMap<Condition, Boolean>();
		this.oErrorMessages = new HashMap<EObject, String>();

		if (!bReloadExistingModels){
			instantiateAuthorizationModel();
		}else{
			System.out.println("Loading existing authorization model into abac wizard");
			loadAuthorizationModel();
		}

		this.oABACLabelProvider = new ABACLabelProvider(oAuthorizationSubject, oAnnotationToResourceMap, oValidResourceMap, oValidPolicySetMap, oValidPolicyMap, oValidRuleMap);
		this.oABACContentProvider = new ABACContentProvider(this.bIsResourceAuthorizable,oRESTfulServiceCIM);
		this.oConditionLabelProvider = new ConditionLabelProvider(oValidConditionMap);

		this.bFirstPolicyRuleSelection = true;
		this.intPolicySetCounter = 0;
		this.intPolicyCounter = 0;
		this.intRuleCounter = 0;
		this.intNewPropertyCounter = 0;

	}


	/**
	 * Create contents of the wizard.
	 * @param parent
	 */
	public void createControl(Composite parent) {
		oPrimarySashForm = new SashForm(parent, SWT.SMOOTH);
		setControl(oPrimarySashForm);
		oPrimarySashForm.setLayout(new GridLayout(2, false));

		oTreeViewPanel = new Composite(oPrimarySashForm, SWT.BORDER);
		oTreeViewPanel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		oTreeViewPanel.setLayout(new GridLayout(1, false));

		oTreeViewPanelGroup = new Group(oTreeViewPanel, SWT.NONE);
		oTreeViewPanelGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		oTreeViewPanelGroup.setText("Policy and Rule Navigation");
		oTreeViewPanelGroup.setLayout(new GridLayout(1, false));

		oTreeViewer = new TreeViewer(oTreeViewPanelGroup, SWT.BORDER);
		oTreeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				if (!event.getSelection().isEmpty()){
					if(event.getSelection() instanceof IStructuredSelection) {
						IStructuredSelection selection = (IStructuredSelection)event.getSelection();
						Object selectedItem =  selection.getFirstElement();

						if (selectedItem instanceof Resource){
							updateSelection(((Resource)selectedItem),true);
							updateResourceSelectedView(true);
						}
						if (selectedItem instanceof AuthorizableResource){
							updateSelection(((AuthorizableResource)selectedItem).getIsAuthorizableResource().getAnnotatesResource(),true);
							updateResourceSelectedView(true);
						}        
						if (selectedItem instanceof ResourceAccessPolicySet){
							updateSelection((ResourceAccessPolicySet)selectedItem,true);	 
							updatePolicySetSelectedView(true);
						}		               
						if (selectedItem instanceof ResourceAccessPolicy){
							updateSelection((ResourceAccessPolicy)selectedItem,true);
							updatePolicyRuleSelectedView(true);
						}
						if (selectedItem instanceof ResourceAccessRule){
							updateSelection((ResourceAccessRule)selectedItem,true);
							updatePolicyRuleSelectedView(true);
						}
					}	
				}
			}
		});
		oTreeViewer.setContentProvider(oABACContentProvider);
		oTreeViewer.setLabelProvider(oABACLabelProvider);
		oTreeViewer.setUseHashlookup(true);

		oPolicyRuleTree = oTreeViewer.getTree();
		oPolicyRuleTree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		//This is the dynamic panel composite, which will change depending on the tree selection
		oDynamicPanel = new Composite(oPrimarySashForm, SWT.BORDER);
		oDynamicPanel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		oDynamicPanelLayout = new StackLayout();
		oDynamicPanelLayout.marginWidth = 5;
		oDynamicPanelLayout.marginHeight = 5;
		oDynamicPanel.setLayout(oDynamicPanelLayout);

		oResourceSelectedPanel = new Group(oDynamicPanel, SWT.NONE);
		oResourceSelectedPanel.setText("Resource Configuration");
		oResourceSelectedPanel.setLayout(new GridLayout(2, false));

		oIsAuthorizableResourceButton = new Button(oResourceSelectedPanel, SWT.CHECK);
		oIsAuthorizableResourceButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				bIsResourceAuthorizable[intSelectedResourceIndex] = oIsAuthorizableResourceButton.getSelection();
				oABACContentProvider.setBIsAuthorizableResource(bIsResourceAuthorizable);
				if(bIsResourceAuthorizable[intSelectedResourceIndex]){
					AuthorizableResource oAuthorizableResource = createAuthorizableResource();
					validate(oInnerAuthorizationCIM);
					oTreeViewer.refresh();
					oTreeViewer.expandToLevel(oAuthorizableResource, TreeViewer.ALL_LEVELS);
				}else{
					deleteAuthorizableResource();
					validate(oInnerAuthorizationCIM);
					oTreeViewer.refresh();
				}
				updateResourceSelectedView(false);
			}
		});
		oIsAuthorizableResourceButton.setText("Is an authorizable Resource");
		new Label(oResourceSelectedPanel, SWT.NONE);
		new Label(oResourceSelectedPanel, SWT.NONE);
		new Label(oResourceSelectedPanel, SWT.NONE);

		lblAdditionalProperties = new Label(oResourceSelectedPanel, SWT.NONE);
		lblAdditionalProperties.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblAdditionalProperties.setText("Additional Properties");
		new Label(oResourceSelectedPanel, SWT.NONE);

		oNewPropetiesListView = new Composite(oResourceSelectedPanel, SWT.BORDER);
		oNewPropetiesListView.setLayout(new GridLayout(1, false));
		oNewPropetiesListView.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true, 1, 1));

		oNewPropertiesList = new List(oNewPropetiesListView, SWT.BORDER);
		oNewPropertiesList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		oNewPropertyBtn = new Button(oNewPropetiesListView, SWT.NONE);
		oNewPropertyBtn.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		oNewPropertyBtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				intNewPropertyCounter++;
				NewProperty oNewProperty = oAuthorizationLayerCIMFactory.createNewProperty();
				oNewProperty.setName(oSelectedResource.getName()+"NewProperty"+intNewPropertyCounter);
				oNewProperty.setType("String");
				oNewProperty.setBIsUnique(true);
				oNewProperty.setBelongsToResource(getAnnResourceFromResource(oSelectedResource));
				oInnerAuthorizationCIM.getHasAnnotation().add(oNewProperty);
				updateNewPropertyConfig();
			}
		});
		oNewPropertyBtn.setText("New");

		oDeleteNewPropertyBtn = new Button(oNewPropetiesListView, SWT.NONE);
		oDeleteNewPropertyBtn.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		oDeleteNewPropertyBtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				EcoreUtil.delete(getNewPropertyByName(oSelectedResource,oNewPropertiesList.getSelection()[0]));
				validate(oInnerAuthorizationCIM);
				updateNewPropertyConfig();
			}
		});
		oDeleteNewPropertyBtn.setSelection(true);
		oDeleteNewPropertyBtn.setText("Delete");
		oNewPropertiesList.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				updateNewPropertyConfig();
			}
		});

		oNewPropertiesConfig = new Composite(oResourceSelectedPanel, SWT.BORDER);
		oNewPropertiesConfig.setLayout(new GridLayout(2, false));
		oNewPropertiesConfig.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));

		Label lblName = new Label(oNewPropertiesConfig, SWT.NONE);
		lblName.setText("Name :");

		oNewPropertyNameText = new Text(oNewPropertiesConfig, SWT.BORDER);
		oNewPropertyNameText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				if (oNewPropertiesList.getItemCount() > 0 && !oNewPropertyNameText.equals("")){
					if (getNewPropertiesFromResource(oSelectedResource).get(oNewPropertiesList.getSelectionIndex()).getName().equals(oNewPropertyNameText.getText())){
						return;
					}
					for (NewProperty oNewProperty : getNewPropertiesFromResource(oSelectedResource)){
						if (oNewProperty.getName().equals(oNewPropertyNameText.getText())) {
							updateResourceSelectedView(false);
							return;
						}
					}
					for (Property oProperty : oSelectedResource.getHasProperty()){
						if (oProperty.getName().equals(oNewPropertyNameText.getText())) {
							updateResourceSelectedView(false);
							return;
						}
					}
					getNewPropertiesFromResource(oSelectedResource).get(oNewPropertiesList.getSelectionIndex()).setName(oNewPropertyNameText.getText());
					validate(oInnerAuthorizationCIM);
					updateResourceSelectedView(false);
				}
			}
		});
		oNewPropertyNameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label lblType = new Label(oNewPropertiesConfig, SWT.NONE);
		lblType.setText("Type :");

		oNewPropertyTypeCombo = new Combo(oNewPropertiesConfig, SWT.READ_ONLY);
		oNewPropertyTypeCombo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (oNewPropertyTypeCombo.getItem(oNewPropertyTypeCombo.getSelectionIndex()).equalsIgnoreCase("Integer")){
					getNewPropertiesFromResource(oSelectedResource).get(oNewPropertiesList.getSelectionIndex()).setType("int");
				}
				if (oNewPropertyTypeCombo.getItem(oNewPropertyTypeCombo.getSelectionIndex()).equalsIgnoreCase("double")){
					getNewPropertiesFromResource(oSelectedResource).get(oNewPropertiesList.getSelectionIndex()).setType("double");
				}
				if (oNewPropertyTypeCombo.getItem(oNewPropertyTypeCombo.getSelectionIndex()).equalsIgnoreCase("String")){
					getNewPropertiesFromResource(oSelectedResource).get(oNewPropertiesList.getSelectionIndex()).setType("String");
				}
				validate(oInnerAuthorizationCIM);
			}
		});
		oNewPropertyTypeCombo.setItems(new String[] {"Integer", "Double", "String"});

		Label lblIsCollection = new Label(oNewPropertiesConfig, SWT.NONE);
		lblIsCollection.setText("Is Collection :");

		oNewPropertyIsCollectionCheck = new Button(oNewPropertiesConfig, SWT.CHECK);
		oNewPropertyIsCollectionCheck.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getNewPropertiesFromResource(oSelectedResource).get(oNewPropertiesList.getSelectionIndex()).setBIsUnique(!oNewPropertyIsCollectionCheck.getSelection());
				validate(oInnerAuthorizationCIM);
			}
		});

		//Construct the panel viewed, when a resource is selected from the tree
		oPolicySetSelectedPanel = new Group(oDynamicPanel, SWT.NONE);
		oPolicySetSelectedPanel.setLayout(new GridLayout(3, false));
		oPolicySetSelectedPanel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		oPolicySetSelectedPanel.setText("Policy Set Configuration");

		oPolicySetNameLabel = new Label(oPolicySetSelectedPanel, SWT.NONE);
		oPolicySetNameLabel.setText("Policy Set name :");

		oPolicySetNameText = new Text(oPolicySetSelectedPanel, SWT.BORDER);
		oPolicySetNameText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				String newText = oPolicySetNameText.getText();
				if (!newText.equals(oSelectedPolicySet.getName())){
					oSelectedPolicySet.setName(oPolicySetNameText.getText());
					updateModel(oSelectedPolicySet);
					oTreeViewer.update(oSelectedPolicySet,null);
				}
			}
		});
		oPolicySetNameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		oNewPolicySetButton = new Button(oPolicySetSelectedPanel, SWT.NONE);
		oNewPolicySetButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		oNewPolicySetButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ResourceAccessPolicySet newResourceAccessPolicySet = oAuthorizationLayerCIMFactory.createResourceAccessPolicySet();
				intPolicySetCounter++;
				newResourceAccessPolicySet.setName("NewPolicySet" + intPolicySetCounter);
				oSelectedPolicySet.getHasResourceAccessPolicySet().add(newResourceAccessPolicySet);
				updateModel(oSelectedPolicySet);
				oTreeViewer.refresh(oSelectedPolicySet);
				oTreeViewer.expandToLevel(oSelectedPolicySet, 1);
				oTreeViewer.setSelection(new StructuredSelection(newResourceAccessPolicySet));
			}
		});
		oNewPolicySetButton.setText("New Policy Set");
		oPolicyCombAlgorithmLabel = new Label(oPolicySetSelectedPanel, SWT.NONE);
		oPolicyCombAlgorithmLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		oPolicyCombAlgorithmLabel.setText("Policy Combining Algorithm :");

		oPolicyCombiningAlgorithmCombo = new Combo(oPolicySetSelectedPanel, SWT.READ_ONLY);
		oPolicyCombiningAlgorithmCombo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				oSelectedPolicySet.setPolicyCombiningAlgorithm(CombiningAlgorithm.get(oPolicyCombiningAlgorithmCombo.getText()));
				updateModel(oSelectedPolicySet);
				oTreeViewer.update(oSelectedPolicySet,null);
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				oSelectedPolicySet.setPolicyCombiningAlgorithm(CombiningAlgorithm.get(oPolicyCombiningAlgorithmCombo.getText()));
				updateModel(oSelectedPolicySet);
				oTreeViewer.update(oSelectedPolicySet,null);
			}
		});
		oPolicyCombiningAlgorithmCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		for (int i=0 ; i< CombiningAlgorithm.values().length ; i++){
			oPolicyCombiningAlgorithmCombo.add(CombiningAlgorithm.get(i).getLiteral());
		}

		oDeletePolicySetButton = new Button(oPolicySetSelectedPanel, SWT.NONE);
		oDeletePolicySetButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (oSelectedPolicySet.eContainer() instanceof ResourceAccessPolicySet){
					ResourceAccessPolicySet oResourceAccessPolicySet = (ResourceAccessPolicySet)oSelectedPolicySet.eContainer();
					((ResourceAccessPolicySet)oSelectedPolicySet.eContainer()).getHasResourceAccessPolicySet().remove(oSelectedPolicySet);
					updateModel(oResourceAccessPolicySet);
					updateAnnCRUDActivities(getAuthResourceFromResource(oSelectedResource));
					oTreeViewer.refresh(oResourceAccessPolicySet);
					if (oResourceAccessPolicySet.getHasResourceAccessPolicySet().isEmpty() && oResourceAccessPolicySet.getHasResourceAccessPolicy().isEmpty()){
						oTreeViewer.setSelection(new StructuredSelection(oResourceAccessPolicySet));
					}else{
						if (!oResourceAccessPolicySet.getHasResourceAccessPolicySet().isEmpty()){
							oTreeViewer.setSelection(new StructuredSelection(oResourceAccessPolicySet.getHasResourceAccessPolicySet().get(0)));
						}else{
							oTreeViewer.setSelection(new StructuredSelection(oResourceAccessPolicySet.getHasResourceAccessPolicy().get(0)));
						}
					}
				}
			}
		});
		oDeletePolicySetButton.setText("Delete Policy Set");

		oNewPolicyButton = new Button(oPolicySetSelectedPanel, SWT.NONE);
		oNewPolicyButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		oNewPolicyButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				intPolicyCounter++;
				ResourceAccessPolicy newResourceAccessPolicy =  oAuthorizationLayerCIMFactory.createResourceAccessPolicy();
				newResourceAccessPolicy.setName(oSelectedResource.getName() + "Policy" + intPolicyCounter);
				newResourceAccessPolicy.setRuleCombiningAlgorithm(CombiningAlgorithm.DENY_OVERRIDES);
				oSelectedPolicySet.getHasResourceAccessPolicy().add(newResourceAccessPolicy);
				updateModel(oSelectedPolicySet);
				oTreeViewer.refresh(oSelectedPolicySet);
				oTreeViewer.expandToLevel(oSelectedPolicySet, 1);
				oTreeViewer.setSelection(new StructuredSelection(newResourceAccessPolicy));
			}
		});
		oNewPolicyButton.setText("New Policy");
		new Label(oPolicySetSelectedPanel, SWT.NONE);
		new Label(oPolicySetSelectedPanel, SWT.NONE);


		oDeleteAllPolicesButton = new Button(oPolicySetSelectedPanel, SWT.NONE);
		oDeleteAllPolicesButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		oDeleteAllPolicesButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				oSelectedPolicySet.getHasResourceAccessPolicy().removeAll(oSelectedPolicySet.getHasResourceAccessPolicy());
				updateModel(oSelectedPolicySet);
				updateAnnCRUDActivities(getAuthResourceFromResource(oSelectedResource));
				oTreeViewer.refresh(oSelectedPolicySet);
			}
		});
		oDeleteAllPolicesButton.setText("Delete all Policies");
		new Label(oPolicySetSelectedPanel, SWT.NONE);
		new Label(oPolicySetSelectedPanel, SWT.NONE);

		//The panel viewed when a policy is selected from the tree
		oPolicyRuleSelectedPanel = new Group(oDynamicPanel, SWT.NONE);
		oPolicyRuleSelectedPanel.setText("Policy Configuration");
		oPolicyRuleSelectedPanel.setLayout(new GridLayout(1, false));

		oPolicyRulePanel = new Composite(oPolicyRuleSelectedPanel, SWT.NONE);
		oPolicyRulePanel.setLayout(new GridLayout(3, false));
		oPolicyRulePanel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));

		oPolicyRuleNameLabel = new Label(oPolicyRulePanel, SWT.NONE);
		oPolicyRuleNameLabel.setText("Policy Name :");
		oPolicyRuleNameText = new Text(oPolicyRulePanel, SWT.BORDER);
		oPolicyRuleNameText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				String newText = oPolicyRuleNameText.getText();
				if(bIsRuleSelected){
					if (!newText.equals(oSelectedRule.getName())){
						oSelectedRule.setName(newText);
						updateModel(oSelectedRule);
						oTreeViewer.update(oSelectedRule,null);
					}
				}else{
					if (!newText.equals(oSelectedPolicy.getName())){
						oSelectedPolicy.setName(newText);
						updateModel(oSelectedPolicy);
						oTreeViewer.update(oSelectedPolicy,null);
					}
				}

			}
		});
		oPolicyRuleNameText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		oNewPolicyRuleButton = new Button(oPolicyRulePanel, SWT.NONE);
		oNewPolicyRuleButton.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		oNewPolicyRuleButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(bIsRuleSelected){
					ResourceAccessRule oResourceAccessRule = oAuthorizationLayerCIMFactory.createResourceAccessRule();
					intRuleCounter++;
					oResourceAccessRule.setName(oSelectedResource.getName()+ "Rule" + intRuleCounter);
					Condition newCondition = createNewCondition();
					oResourceAccessRule.getHasMatchCondition().add(newCondition);
					oSelectedPolicy.getHasResourceAccessRule().add(oResourceAccessRule);
					updateModel(oSelectedPolicy);
					oTreeViewer.refresh(oSelectedPolicy);
					oTreeViewer.expandToLevel(oResourceAccessRule, 1);
					oTreeViewer.setSelection(new StructuredSelection(oResourceAccessRule));
				}else{
					intPolicyCounter++;
					ResourceAccessPolicy newResourceAccessPolicy =  oAuthorizationLayerCIMFactory.createResourceAccessPolicy();
					newResourceAccessPolicy.setName(oSelectedResource.getName() + "Policy" + intPolicyCounter);
					newResourceAccessPolicy.setRuleCombiningAlgorithm(CombiningAlgorithm.DENY_OVERRIDES);
					oSelectedPolicySet.getHasResourceAccessPolicy().add(newResourceAccessPolicy);
					updateModel(oSelectedPolicySet);
					oTreeViewer.refresh(oSelectedPolicySet);
					oTreeViewer.setSelection(new StructuredSelection(newResourceAccessPolicy));
				}
			}
		});
		oNewPolicyRuleButton.setText("New Policy");

		oRuleCombiningAlgorithmLabel = new Label(oPolicyRulePanel, SWT.NONE);
		oRuleCombiningAlgorithmLabel.setText("Rule Combining Algorithm :");

		oRuleCombiningAlgorithmTypeCombo = new Combo(oPolicyRulePanel, SWT.READ_ONLY);
		oRuleCombiningAlgorithmTypeCombo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (bIsRuleSelected){
					oSelectedRule.setRuleType(RuleType.get(oRuleCombiningAlgorithmTypeCombo.getSelectionIndex()));
					updateModel(oSelectedRule);
					oTreeViewer.update(oSelectedRule,null);
				}else{
					oSelectedPolicy.setRuleCombiningAlgorithm(CombiningAlgorithm.get(oRuleCombiningAlgorithmTypeCombo.getSelectionIndex()));
					updateModel(oSelectedPolicy);
					oTreeViewer.update(oSelectedPolicy,null);
				}
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				oSelectedPolicy.setRuleCombiningAlgorithm(CombiningAlgorithm.get(oRuleCombiningAlgorithmTypeCombo.getSelectionIndex()));
				updateModel(oSelectedPolicy);
				oTreeViewer.update(oSelectedPolicy,null);
			}
		});
		oRuleCombiningAlgorithmTypeCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));

		oDeletePolicyRuleButton = new Button(oPolicyRulePanel, SWT.NONE);
		oDeletePolicyRuleButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		oDeletePolicyRuleButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (bIsRuleSelected){
					int oSelectedRuleIndex = oSelectedPolicy.getHasResourceAccessRule().indexOf(oSelectedRule);
					oSelectedPolicy.getHasResourceAccessRule().remove(oSelectedRule);
					updateModel(oSelectedPolicy);
					oTreeViewer.refresh(oSelectedPolicy);

					if (!oSelectedPolicy.getHasResourceAccessRule().isEmpty()){
						if (oSelectedRuleIndex == oSelectedPolicy.getHasResourceAccessRule().size()){
							oSelectedRuleIndex--;
						}
						oTreeViewer.setSelection(new StructuredSelection(oSelectedPolicy.getHasResourceAccessRule().get(oSelectedRuleIndex)));
					}else{
						oTreeViewer.setSelection(new StructuredSelection(oSelectedPolicy));
					}	
				}else{
					int oSelectedPolicyIndex = oSelectedPolicySet.getHasResourceAccessPolicy().indexOf(oSelectedPolicy);
					oSelectedPolicySet.getHasResourceAccessPolicy().remove(oSelectedPolicy);
					updateModel(oSelectedPolicySet);
					oTreeViewer.refresh(oSelectedPolicySet);

					if (!oSelectedPolicySet.getHasResourceAccessPolicy().isEmpty()){
						if (oSelectedPolicyIndex == oSelectedPolicySet.getHasResourceAccessPolicy().size()){
							oSelectedPolicyIndex--;
						}
						oTreeViewer.setSelection(new StructuredSelection(oSelectedPolicySet.getHasResourceAccessPolicy().get(oSelectedPolicyIndex)));
					}else{
						oTreeViewer.setSelection(new StructuredSelection(oSelectedPolicySet));
					}	
				}
				updateAnnCRUDActivities(getAuthResourceFromResource(oSelectedResource));
			}
		});
		oDeletePolicyRuleButton.setText("Delete Policy");

		oActionsNewRuleComp = new Composite(oPolicyRulePanel, SWT.NONE);
		oActionsNewRuleComp.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		oActionsRuleStackLayout = new StackLayout();
		oActionsNewRuleComp.setLayout(oActionsRuleStackLayout);

		oNewRuleButton = new Button(oActionsNewRuleComp, SWT.NONE);
		oNewRuleButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ResourceAccessRule oResourceAccessRule = oAuthorizationLayerCIMFactory.createResourceAccessRule();
				intRuleCounter++;
				oResourceAccessRule.setName(oSelectedResource.getName()+ "Rule" + intRuleCounter);
				Condition newCondition = createNewCondition();
				oResourceAccessRule.getHasMatchCondition().add(newCondition);
				oSelectedPolicy.getHasResourceAccessRule().add(oResourceAccessRule);
				updateModel(oSelectedPolicy);
				oTreeViewer.refresh(oSelectedPolicy);
				oTreeViewer.expandToLevel(oResourceAccessRule, 1);
				oTreeViewer.setSelection(new StructuredSelection(oResourceAccessRule));
			}
		});
		oNewRuleButton.setText("New Rule");

		lblAllowedActions = new Label(oActionsNewRuleComp, SWT.NONE);
		lblAllowedActions.setText("Allowed Actions : ");

		oActionsPanel = new Composite(oPolicyRulePanel, SWT.NONE);
		oActionsPanel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		GridLayout gl_oActionsPanel = new GridLayout(4, false);
		gl_oActionsPanel.marginHeight = 0;
		oActionsPanel.setLayout(gl_oActionsPanel);

		btnGet = new Button(oActionsPanel, SWT.CHECK);
		btnGet.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				allowedActionsHandler(btnGet);
			}
		});
		btnGet.setEnabled(false);
		btnGet.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		btnGet.setText("GET");

		btnPut = new Button(oActionsPanel, SWT.CHECK);
		btnPut.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				allowedActionsHandler(btnPut);
			}
		});
		btnPut.setEnabled(false);
		btnPut.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		btnPut.setText("PUT");

		btnPost = new Button(oActionsPanel, SWT.CHECK);
		btnPost.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				allowedActionsHandler(btnPost);
			}
		});
		btnPost.setEnabled(false);
		btnPost.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		btnPost.setText("POST");

		btnDelete = new Button(oActionsPanel, SWT.CHECK);
		btnDelete.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				allowedActionsHandler(btnDelete);
			}
		});
		btnDelete.setEnabled(false);
		btnDelete.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		btnDelete.setText("DELETE");
		new Label(oPolicyRulePanel, SWT.NONE);

		//Initialize drop down menu for Rule combination algorithm selection
		for (int i=0 ; i< CombiningAlgorithm.values().length ; i++){
			oRuleCombiningAlgorithmTypeCombo.add(CombiningAlgorithm.get(i).getLiteral());
		}

		oConditionListPanel = new Group(oPolicyRuleSelectedPanel, SWT.NONE);
		GridData gd_oConditionListPanel = new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1);
		gd_oConditionListPanel.heightHint = 85;
		oConditionListPanel.setLayoutData(gd_oConditionListPanel);
		oConditionListPanel.setLayout(new GridLayout(2, false));
		oConditionListPanel.setText("Apply Conditions");

		oConditionListViewer = new ListViewer(oConditionListPanel, SWT.BORDER | SWT.V_SCROLL);
		oConditionListViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				if (!event.getSelection().isEmpty()){
					if(event.getSelection() instanceof IStructuredSelection) {
						IStructuredSelection selection = (IStructuredSelection)event.getSelection();
						Object selectedItem = selection.getFirstElement();

						if (selectedItem instanceof Condition){
							if (!((Condition)selectedItem).equals(oSelectedCondition)){
								updateSelection((Condition)selectedItem);			            	   
								updatePolicyRuleSelectedView(false);   
							}
						}
					}	
				}
			}
		});
		oConditionList = oConditionListViewer.getList();
		oConditionList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		oConditionList.setEnabled(false);

		oConditionListViewer.setContentProvider(new ConditionContentProvider());
		oConditionListViewer.setLabelProvider(oConditionLabelProvider);
		oConditionListViewer.setUseHashlookup(true);

		oConditionButtonPanel = new Composite(oConditionListPanel, SWT.NONE);
		oConditionButtonPanel.setLayout(new GridLayout(1, false));
		oConditionButtonPanel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true, 1, 1));

		oNewConditionButton = new Button(oConditionButtonPanel, SWT.CENTER);
		oNewConditionButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, true, 1, 1));
		oNewConditionButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Condition newCondition = createNewCondition();			
				if (bIsRuleSelected){
					oSelectedRule.getHasMatchCondition().add(newCondition);
					updateModel(oSelectedRule);
					oConditionListViewer.refresh(oSelectedRule);
				}else{
					oSelectedPolicy.getHasApplyCondition().add(newCondition);
					updateModel(oSelectedPolicy);
					oConditionListViewer.refresh(oSelectedPolicy);
				}
				oConditionListViewer.setSelection(new StructuredSelection(newCondition));
				//new selection event will trigger selection and view updates
			}
		});
		oNewConditionButton.setText("New");

		oDeleteConditionButton = new Button(oConditionButtonPanel, SWT.NONE);
		oDeleteConditionButton.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, true, 1, 1));
		oDeleteConditionButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (bIsRuleSelected){
					if (!oSelectedRule.getHasMatchCondition().isEmpty()){
						int oSelectedConditionIndex = oSelectedRule.getHasMatchCondition().indexOf(oSelectedCondition);
						oSelectedRule.getHasMatchCondition().remove(oSelectedCondition);
						updateModel(oSelectedRule);
						oConditionListViewer.refresh(oSelectedRule);
						if (oSelectedConditionIndex >= 0){
							if (oSelectedConditionIndex == oSelectedRule.getHasMatchCondition().size()){
								oSelectedConditionIndex--;
							}
							if (!oSelectedRule.getHasMatchCondition().isEmpty()){
								oConditionListViewer.setSelection(new StructuredSelection(oSelectedRule.getHasMatchCondition().get(oSelectedConditionIndex)));
								//new selection event will trigger selection and view updates
							}else{
								updateSelection((Condition)null);
								updatePolicyRuleSelectedView(false);
							}				
						}
					}
				}else{
					if (!oSelectedPolicy.getHasApplyCondition().isEmpty()){
						int oSelectedConditionIndex = oSelectedPolicy.getHasApplyCondition().indexOf(oSelectedCondition);
						oSelectedPolicy.getHasApplyCondition().remove(oSelectedCondition);
						updateModel(oSelectedPolicy);
						oConditionListViewer.refresh(oSelectedPolicy);
						if (oSelectedConditionIndex >= 0){
							if (oSelectedConditionIndex == oSelectedPolicy.getHasApplyCondition().size()){
								oSelectedConditionIndex--;
							}
							if (!oSelectedPolicy.getHasApplyCondition().isEmpty()){
								oConditionListViewer.setSelection(new StructuredSelection(oSelectedPolicy.getHasApplyCondition().get(oSelectedConditionIndex)));
								//new selection event will trigger selection and view updates
							}else{
								updateSelection((Condition)null);
								updatePolicyRuleSelectedView(false);
							}				
						}
					}
				}		
			}
		});
		oDeleteConditionButton.setText("Delete");

		oConditionConfigGroup = new Group(oPolicyRuleSelectedPanel, SWT.NONE);
		oConditionConfigGroup.setLayout(new GridLayout(6, false));
		oConditionConfigGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true, 1, 1));
		oConditionConfigGroup.setText("Apply Condition Configuration");
		new Label(oConditionConfigGroup, SWT.NONE);

		oAttribueCategoryLabel = new Label(oConditionConfigGroup, SWT.NONE);
		oAttribueCategoryLabel.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		oAttribueCategoryLabel.setText("Attribute Category");

		oTypeLabel = new Label(oConditionConfigGroup, SWT.NONE);
		oTypeLabel.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		oTypeLabel.setText("Type");

		oResourceLabel = new Label(oConditionConfigGroup, SWT.NONE);
		oResourceLabel.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		oResourceLabel.setText("Resource");

		oResourceAsAttributeLabel = new Label(oConditionConfigGroup, SWT.NONE);
		oResourceAsAttributeLabel.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		oResourceAsAttributeLabel.setText("Self");

		oPropertyValuesLabel = new Label(oConditionConfigGroup, SWT.NONE);
		oPropertyValuesLabel.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		oPropertyValuesLabel.setText("Property/Values");

		oLeftSideLabel = new Label(oConditionConfigGroup, SWT.NONE);
		oLeftSideLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false, false, 1, 1));
		oLeftSideLabel.setText("Left Side :");

		oLeftSideCategoryViewer = new ComboViewer(oConditionConfigGroup, SWT.READ_ONLY);
		oLeftSideCategoryViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				if (!event.getSelection().isEmpty()){
					if(event.getSelection() instanceof IStructuredSelection) {
						IStructuredSelection selection = (IStructuredSelection)event.getSelection();
						Object selectedItem = selection.getFirstElement();

						if (selectedItem instanceof AttributeCategory){
							//float rand = (float)Math.random();
							//System.out.println("[LCATEGORY:" + rand + "] " + "Left Category Selection event triggered...");
							AttributeCategory selectedAttributeCategory = (AttributeCategory)selectedItem ;
							if (!oSelectedCondition.getHasLeftSideOperand().getAttributeCategory().equals(selectedAttributeCategory)){
								//System.out.println("[LCATEGORY:" + rand + "] " + "Reset operator right side to constant and left");
								oSelectedCondition.getHasLeftSideOperand().setAttributeCategory(selectedAttributeCategory);
								clearAttr(oSelectedCondition.getHasLeftSideOperand());
								oSelectedCondition.setOperator(Operator.UNDEFINED);
								clearAttr(oSelectedCondition.getHasRightSideOperand());
								oSelectedCondition.getHasRightSideOperand().setAttributeCategory(AttributeCategory.CONSTANT);
								updateModel(oSelectedCondition);
								updatePolicyRuleSelectedView(false);
							}else{
								//System.out.println("[LCATEGORY:" + rand + "] " + "But done nothing!");
							}
							//System.out.println("[LCATEGORY:" + rand + "] " + "Done.");
						}

					}	
				}
			}
		});
		oLeftSideCategoryViewer.setContentProvider(new AttributeCategoryContentProvider());
		oLeftSideCategoryViewer.setLabelProvider(new AttributeCategoryLabelProvider());
		oLeftSideCategoryViewer.addFilter(new ViewerFilter() {

			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				if (element instanceof AttributeCategory && oSelectedResource != null){
					AttributeCategory oAttributeCategory = (AttributeCategory)element;
					if (oAttributeCategory.equals(AttributeCategory.CONSTANT)){
						return false;
					}
					return validCategoriesForResource(oSelectedResource,oAttributeCategory);
				}
				return false;
			}
		});
		oLeftSideCategoryViewer.setInput(oRESTfulServiceCIM.getHasResources());

		oLeftSideCategoryCombo = oLeftSideCategoryViewer.getCombo();
		oLeftSideCategoryCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		oLeftTypeLabel = new Label(oConditionConfigGroup, SWT.CENTER);
		GridData gd_oLeftTypeLabel = new GridData(SWT.CENTER, SWT.TOP, false, false, 1, 1);
		gd_oLeftTypeLabel.widthHint = 85;
		oLeftTypeLabel.setLayoutData(gd_oLeftTypeLabel);
		oLeftTypeLabel.setAlignment(SWT.CENTER);

		oLeftSideResourceComboViewer = new ComboViewer(oConditionConfigGroup, SWT.READ_ONLY);
		oLeftSideResourceComboViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				if (!event.getSelection().isEmpty()){
					if(event.getSelection() instanceof IStructuredSelection) {
						IStructuredSelection selection = (IStructuredSelection)event.getSelection();
						Object selectedItem = selection.getFirstElement();

						if (selectedItem instanceof Resource){
							//float rand = (float)Math.random();
							//System.out.println("[LRESOURCE:" + rand + "] " + "Left Resource Selection event triggered...");
							Resource oResource =(Resource)selectedItem;
							Resource parentResource = null;
							if (hasAttr(oSelectedCondition.getHasLeftSideOperand())){
								if (oSelectedCondition.getHasLeftSideOperand().getIsAttributeExistingProperty() != null){
									parentResource = (Resource)oSelectedCondition.getHasLeftSideOperand().getIsAttributeExistingProperty().getAnnotatesProperty().eContainer();
								}
								if (oSelectedCondition.getHasLeftSideOperand().getIsAttributeNewProperty() != null){
									parentResource = oSelectedCondition.getHasLeftSideOperand().getIsAttributeNewProperty().getBelongsToResource().getAnnotatesResource();
								}
								if(oSelectedCondition.getHasLeftSideOperand().getIsAttributeResource() != null){
									parentResource = oSelectedCondition.getHasLeftSideOperand().getIsAttributeResource().getAnnotatesResource();
								}
								if (!oResource.equals(parentResource)){
									clearAttr(oSelectedCondition.getHasLeftSideOperand());
									clearAttr(oSelectedCondition.getHasRightSideOperand());
									oSelectedCondition.setOperator(Operator.UNDEFINED);
									oSelectedCondition.getHasRightSideOperand().setAttributeCategory(AttributeCategory.CONSTANT);
									updateModel(oSelectedCondition);
									updatePolicyRuleSelectedView(false);
								}
							}else{
								updatePolicyRuleSelectedView(false);
							}

						}

					}	
				}
			}
		});
		oLeftSideResourceComboViewer.setContentProvider(new ResourceContentProvider());
		oLeftSideResourceComboViewer.setLabelProvider(new ResourceLabelProvider());
		oLeftSideResourceComboViewer.addFilter(new ViewerFilter() {

			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				if (oSelectedResource != null && oSelectedCondition != null && element instanceof Resource){
					Resource filteredResource = (Resource)element;
					boolean flag = false;
					if (filteredResource.isIsAlgorithmic()){
						return false;
					}
					//Checks if we have at least one valid property 
					for (Property oProperty : filteredResource.getHasProperty()){
						if (!(!oProperty.isIsUnique() && oSelectedCondition.getHasLeftSideOperand().getAttributeCategory().equals(AttributeCategory.CHILD_RESOURCE))){
							flag = true;
							break;
						}
					}
					if (!flag) return false;
					if (oSelectedCondition.getHasLeftSideOperand().getAttributeCategory().equals(AttributeCategory.ACCESS_SUBJECT)){
						return oRESTfulServiceCIM.getHasResources().indexOf(filteredResource) == intAuthenticationResourceIndex;
					}
					if (oSelectedCondition.getHasLeftSideOperand().getAttributeCategory().equals(AttributeCategory.ACCESSED_RESOURCE)){
						return oSelectedResource.equals(filteredResource);
					}
					if (oSelectedCondition.getHasLeftSideOperand().getAttributeCategory().equals(AttributeCategory.PARENT_RESOURCE)){
						if (intAuthenticationResourceIndex != -1 && filteredResource.equals(oRESTfulServiceCIM.getHasResources().get(intAuthenticationResourceIndex)) && !oSelectedResource.getIsRelatedResource().contains(filteredResource)){
							return ((AuthorizableResource)oInnerAuthorizationCIM.getHasAnnotation().get(getAuthResourceIndexFromResource(oSelectedResource))).isBTrackOwnership();
						}
						return oSelectedResource.getIsRelatedResource().contains(filteredResource);
					}
					if (oSelectedCondition.getHasLeftSideOperand().getAttributeCategory().equals(AttributeCategory.CHILD_RESOURCE)){
						return oSelectedResource.getHasRelatedResource().contains(filteredResource);
					}
					if (oSelectedCondition.getHasLeftSideOperand().getAttributeCategory().equals(AttributeCategory.INCLUDED_RESOURCE)){
						return oSelectedResource.equals(filteredResource) ? true : false;
					}
					if (oSelectedCondition.getHasLeftSideOperand().getAttributeCategory().equals(AttributeCategory.CONSTANT)){
						return false;
					}
				}
				return false;
			}
		});
		oLeftSideResourceComboViewer.setInput(oRESTfulServiceCIM);

		oLeftSideResourceCombo = oLeftSideResourceComboViewer.getCombo();
		oLeftSideResourceCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		oLeftResourceAsAttributeBtn = new Button(oConditionConfigGroup, SWT.CHECK);
		oLeftResourceAsAttributeBtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (oLeftResourceAsAttributeBtn.getSelection()){
					if (oSelectedCondition.getHasLeftSideOperand().getIsAttributeResource() != null){
						if (!oSelectedCondition.getHasLeftSideOperand().getIsAttributeResource().getAnnotatesResource().equals((Resource) (((IStructuredSelection) oLeftSideResourceComboViewer.getSelection()).getFirstElement()))){
							updateAttr(oSelectedCondition.getHasLeftSideOperand(),getAnnResourceFromResource((Resource) (((IStructuredSelection) oLeftSideResourceComboViewer.getSelection()).getFirstElement())));
							clearAttr(oSelectedCondition.getHasRightSideOperand());
							oSelectedCondition.setOperator(Operator.UNDEFINED);
							updateModel(oSelectedCondition);
							updateConditionConfigurationView();
							updateConditionListView(false);
						}
					}else{
						updateAttr(oSelectedCondition.getHasLeftSideOperand(),getAnnResourceFromResource((Resource) (((IStructuredSelection) oLeftSideResourceComboViewer.getSelection()).getFirstElement())));
						clearAttr(oSelectedCondition.getHasRightSideOperand());
						oSelectedCondition.setOperator(Operator.UNDEFINED);
						updateModel(oSelectedCondition);
						updateConditionConfigurationView();
						updateConditionListView(false);
					}
				}else if (oSelectedCondition.getHasLeftSideOperand().getIsAttributeResource() != null){
					clearAttr(oSelectedCondition.getHasLeftSideOperand());
					clearAttr(oSelectedCondition.getHasRightSideOperand());
					oSelectedCondition.setOperator(Operator.UNDEFINED);
					updateModel(oSelectedCondition);
					updateConditionConfigurationView();
					updateConditionListView(false);
				}
			}
		});
		oLeftResourceAsAttributeBtn.setLayoutData(new GridData(SWT.CENTER, SWT.TOP, false, false, 1, 1));

		oLeftPropertyComboViewer = new ComboViewer(oConditionConfigGroup, SWT.READ_ONLY);
		oLeftPropertyComboViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				if (!event.getSelection().isEmpty()){
					if(event.getSelection() instanceof IStructuredSelection) {
						IStructuredSelection selection = (IStructuredSelection)event.getSelection();
						Object selectedItem = selection.getFirstElement();
						boolean createLeftPropertyFlag = false;
						boolean addNewPropertyFlag = false;

						if (selectedItem instanceof Property){
							Property oProperty =(Property)selectedItem;			            
							if (oSelectedCondition.getHasLeftSideOperand().getIsAttributeExistingProperty() == null){
								createLeftPropertyFlag = true;
							}else{
								createLeftPropertyFlag = !oSelectedCondition.getHasLeftSideOperand().getIsAttributeExistingProperty().getAnnotatesProperty().equals(oProperty);
							}
							if (createLeftPropertyFlag){
								addLeftProperty(oProperty);
							}
						}

						if (selectedItem instanceof NewProperty){
							NewProperty oNewProperty = (NewProperty)selectedItem;	            	 
							if (oSelectedCondition.getHasLeftSideOperand().getIsAttributeNewProperty() == null){
								addNewPropertyFlag = true;
							}else{
								addNewPropertyFlag = !oSelectedCondition.getHasLeftSideOperand().getIsAttributeNewProperty().equals(oNewProperty);
							}
							if (addNewPropertyFlag){
								updateAttr(oSelectedCondition.getHasLeftSideOperand(),oNewProperty);
							}
						}

						if (createLeftPropertyFlag || addNewPropertyFlag){
							boolean reset = false;
							//if a change has happened , validate the right arguments, reset if invalid and update the inner model
							if (hasAttr(oSelectedCondition.getHasRightSideOperand())){
								if (oSelectedCondition.getHasRightSideOperand().getIsAttributeResource() != null){
									reset = !validRightArgument(oSelectedCondition.getHasRightSideOperand().getAttributeCategory(),oSelectedCondition.getHasRightSideOperand().getIsAttributeResource().getAnnotatesResource());
								}
								if (oSelectedCondition.getHasRightSideOperand().getIsAttributeExistingProperty() != null){

									reset = !validRightArgument(oSelectedCondition.getHasRightSideOperand().getAttributeCategory(),oSelectedCondition.getHasRightSideOperand().getIsAttributeExistingProperty().getAnnotatesProperty());
								}
								if (oSelectedCondition.getHasRightSideOperand().getIsAttributeNewProperty() != null){
									reset = !validRightArgument(oSelectedCondition.getHasRightSideOperand().getAttributeCategory(),oSelectedCondition.getHasRightSideOperand().getIsAttributeNewProperty());
								}
							}
							if (reset){
								oSelectedCondition.setOperator(Operator.UNDEFINED);
								clearAttr(oSelectedCondition.getHasRightSideOperand());
								oSelectedCondition.getHasRightSideOperand().setAttributeCategory(AttributeCategory.CONSTANT);
							}
							updateModel(oSelectedCondition);
							updateConditionConfigurationView();
							updateConditionListView(false);
						}

					}	
				}
			}

			private void addLeftProperty(Property oProperty) {
				for (AnnotatedElement oAnnotatedElement : oInnerAuthorizationCIM.getHasAnnotatedElement()){
					if (oAnnotatedElement instanceof AnnProperty){
						if (((AnnProperty)oAnnotatedElement).getAnnotatesProperty().equals(oProperty)){
							updateAttr(oSelectedCondition.getHasLeftSideOperand(),(AnnProperty) oAnnotatedElement);
							return;
						}
					}
				}
				AnnProperty oAnnProperty = oAuthorizationLayerCIMFactory.createAnnProperty();
				oAnnProperty.setAnnotatesProperty(oProperty);
				updateAttr(oSelectedCondition.getHasLeftSideOperand(),oAnnProperty);
				oInnerAuthorizationCIM.getHasAnnotatedElement().add(oAnnProperty);
				return;
			}
		});
		oLeftPropertyCombo = oLeftPropertyComboViewer.getCombo();
		oLeftPropertyCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		oLeftPropertyComboViewer.setContentProvider(new PropertyContentProvider(oInnerAuthorizationCIM));
		oLeftPropertyComboViewer.setLabelProvider(new PropertyLabelProvider());
		oLeftPropertyComboViewer.addFilter(new ViewerFilter() {

			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				if (element instanceof Property){
					Property oProperty = (Property)element;
					return !(!oProperty.isIsUnique() && oSelectedCondition.getHasLeftSideOperand().getAttributeCategory().equals(AttributeCategory.CHILD_RESOURCE));
				}
				if (element instanceof NewProperty){
					NewProperty oProperty = (NewProperty)element;
					return !(!oProperty.isBIsUnique() && oSelectedCondition.getHasLeftSideOperand().getAttributeCategory().equals(AttributeCategory.CHILD_RESOURCE));
				}
				return false;
			}
		});

		oOperatorLabel = new Label(oConditionConfigGroup, SWT.NONE);
		oOperatorLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false, false, 1, 1));
		oOperatorLabel.setSize(53, 15);
		oOperatorLabel.setText("Operator :");

		oOperatorComboViewer = new ComboViewer(oConditionConfigGroup, SWT.READ_ONLY);
		oOperatorComboViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				if (!event.getSelection().isEmpty()){
					if(event.getSelection() instanceof IStructuredSelection) {
						IStructuredSelection selection = (IStructuredSelection)event.getSelection();
						Object selectedItem = selection.getFirstElement();

						if (selectedItem instanceof Operator){
							//float rand = (float)Math.random();
							//System.out.println("[OPERATOR:" + rand + "] " + "Operator Selection event triggered...");
							Operator oOperator = (Operator)selectedItem;
							if (!oSelectedCondition.getOperator().equals(oOperator)){
								oSelectedCondition.setOperator(oOperator);
								if(hasAttr(oSelectedCondition.getHasRightSideOperand())){
									if (oSelectedCondition.getHasRightSideOperand().getIsAttributeExistingProperty()!= null){
										if(!validRightArgument(oSelectedCondition.getHasRightSideOperand().getAttributeCategory(), oSelectedCondition.getHasRightSideOperand().getIsAttributeExistingProperty().getAnnotatesProperty())){
											clearAttr(oSelectedCondition.getHasRightSideOperand());
											oSelectedCondition.getHasRightSideOperand().setAttributeCategory(AttributeCategory.CONSTANT);
										} 
									}
									if (oSelectedCondition.getHasRightSideOperand().getIsAttributeNewProperty()!= null){
										if(!validRightArgument(oSelectedCondition.getHasRightSideOperand().getAttributeCategory(), oSelectedCondition.getHasRightSideOperand().getIsAttributeNewProperty())){
											clearAttr(oSelectedCondition.getHasRightSideOperand());
											oSelectedCondition.getHasRightSideOperand().setAttributeCategory(AttributeCategory.CONSTANT);
										} 
									}
									if (oSelectedCondition.getHasRightSideOperand().getIsAttributeResource()!= null){
										if(!validRightArgument(oSelectedCondition.getHasRightSideOperand().getAttributeCategory(), oSelectedCondition.getHasRightSideOperand().getIsAttributeResource().getAnnotatesResource())){
											clearAttr(oSelectedCondition.getHasRightSideOperand());
											oSelectedCondition.getHasRightSideOperand().setAttributeCategory(AttributeCategory.CONSTANT);
										} 
									}
								}else if(!oSelectedCondition.getHasRightSideOperand().getValue().isEmpty()){
									if (!validRightArgument(oSelectedCondition.getHasRightSideOperand().getAttributeCategory(),oSelectedCondition.getHasRightSideOperand().getValue())){
										oSelectedCondition.getHasRightSideOperand().getValue().clear();
										oSelectedCondition.getHasRightSideOperand().setAttributeCategory(AttributeCategory.CONSTANT);
									}
								}
								updateModel(oSelectedCondition);
								updatePolicyRuleSelectedView(false);
							}
							//System.out.println("[OPERATOR:" + rand + "] " + "Done");  
						}
					}		
				}
			}
		});
		oOperatorCombo = oOperatorComboViewer.getCombo();
		oOperatorCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		oOperatorComboViewer.setLabelProvider(new ILabelProvider() {

			@Override
			public void removeListener(ILabelProviderListener listener) {}			
			@Override
			public boolean isLabelProperty(Object element, String property) {return true;}			
			@Override
			public void dispose() {	}			
			@Override
			public void addListener(ILabelProviderListener listener) {	}
			@Override
			public String getText(Object element) {
				if (element instanceof Operator){
					return ((Operator)element).getLiteral();
				}
				return null;
			}
			@Override
			public Image getImage(Object element) {return null;}
		});
		oOperatorComboViewer.setContentProvider(new IStructuredContentProvider() {

			@Override
			public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {	}
			@Override
			public void dispose() {	}
			@Override
			public Object[] getElements(Object inputElement) {
				if (inputElement instanceof Operator[]){
					Operator[] values = (Operator[]) inputElement;
					return values;
				}
				return null;
			}
		});
		oOperatorComboViewer.addFilter(new ViewerFilter() {

			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				if (oSelectedCondition == null) return false;
				if (element instanceof Operator){
					Operator oFilteredOperator = (Operator)element;
					boolean bLeftAttributeIsUnique = true;
					boolean bLeftAttribtueIsString = false;
					boolean bLeftAttributeIsResource = false;
					if (!hasAttr(oSelectedCondition.getHasLeftSideOperand())) return false;
					if (oSelectedCondition.getHasLeftSideOperand().getIsAttributeExistingProperty() != null){
						bLeftAttributeIsUnique = oSelectedCondition.getHasLeftSideOperand().getIsAttributeExistingProperty().getAnnotatesProperty().isIsUnique() && !oSelectedCondition.getHasLeftSideOperand().getAttributeCategory().equals(AttributeCategory.CHILD_RESOURCE);
						bLeftAttribtueIsString =  oSelectedCondition.getHasLeftSideOperand().getIsAttributeExistingProperty().getAnnotatesProperty().getType().equalsIgnoreCase("string");
					}
					if (oSelectedCondition.getHasLeftSideOperand().getIsAttributeNewProperty() != null){
						bLeftAttributeIsUnique = oSelectedCondition.getHasLeftSideOperand().getIsAttributeNewProperty().isBIsUnique() && !oSelectedCondition.getHasLeftSideOperand().getAttributeCategory().equals(AttributeCategory.CHILD_RESOURCE);
						bLeftAttribtueIsString =  oSelectedCondition.getHasLeftSideOperand().getIsAttributeNewProperty().getType().equalsIgnoreCase("string");
					}
					if (oSelectedCondition.getHasLeftSideOperand().getIsAttributeResource() != null){
						bLeftAttributeIsUnique = true;
						bLeftAttributeIsResource = true;
					}
					if (oFilteredOperator.equals(Operator.UNDEFINED)){
						return false;
					}
					if (oFilteredOperator.equals(Operator.EQUAL) || 
							oFilteredOperator.equals(Operator.NOT_EQUAL))
					{
						return true;
					}
					if (oFilteredOperator.equals(Operator.GREATER_THAN) || 
							oFilteredOperator.equals(Operator.GREATER_THAN_OR_EQUAL) ||
							oFilteredOperator.equals(Operator.LESS_THAN) ||
							oFilteredOperator.equals(Operator.LESS_THAN_OR_EQUAL))
					{
						return !bLeftAttribtueIsString && !bLeftAttributeIsResource;
					}
					if (oFilteredOperator.equals(Operator.SET_CONTAINS) || 
							oFilteredOperator.equals(Operator.SET_NOT_CONTAINS))
					{
						return !bLeftAttributeIsUnique;	
					}
					if (oFilteredOperator.equals(Operator.SUBSET) ||
							oFilteredOperator.equals(Operator.NOT_SUBSET))
					{
						return true;
					}
					if (oFilteredOperator.equals(Operator.REGEX)){
						return bLeftAttribtueIsString;
					}
				}
				return false;
			}
		});
		oOperatorComboViewer.setInput(Operator.values());
		new Label(oConditionConfigGroup, SWT.NONE);
		new Label(oConditionConfigGroup, SWT.NONE);
		new Label(oConditionConfigGroup, SWT.NONE);
		new Label(oConditionConfigGroup, SWT.NONE);

		oRightSideLabel = new Label(oConditionConfigGroup, SWT.NONE);
		oRightSideLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, false, false, 1, 1));
		oRightSideLabel.setText("Right Side :");

		oRightSideCategoryViewer = new ComboViewer(oConditionConfigGroup, SWT.READ_ONLY);
		oRightSideCategoryViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				if (!event.getSelection().isEmpty()){
					if(event.getSelection() instanceof IStructuredSelection) {
						IStructuredSelection selection = (IStructuredSelection)event.getSelection();
						Object selectedItem = selection.getFirstElement();

						if (selectedItem instanceof AttributeCategory){
							//float rand = (float)Math.random();
							//System.out.println("[RCATEGORY:" + rand + "] " + "Right Category Selection event triggered...");
							AttributeCategory oAttributeCategory = (AttributeCategory)selectedItem;
							if (!oSelectedCondition.getHasRightSideOperand().getAttributeCategory().equals(oAttributeCategory)){ 
								oSelectedCondition.getHasRightSideOperand().setAttributeCategory(oAttributeCategory); 
								clearAttr(oSelectedCondition.getHasRightSideOperand());
								if (oSelectedCondition.getHasLeftSideOperand().getIsAttributeResource() != null ){
									updateAttr(oSelectedCondition.getHasRightSideOperand(), getAnnResourceFromResource(oSelectedCondition.getHasLeftSideOperand().getIsAttributeResource().getAnnotatesResource()));
								}
								updateModel(oSelectedCondition);
								updateConditionListView(false);
								updateConditionConfigurationView();
							}
						}
					}	
				}
			}
		});
		oRightSideCategoryViewer.setContentProvider(new AttributeCategoryContentProvider());
		oRightSideCategoryViewer.setLabelProvider(new AttributeCategoryLabelProvider());
		oRightSideCategoryViewer.addFilter(new ViewerFilter() {

			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				if (element instanceof AttributeCategory && oSelectedResource != null){
					AttributeCategory oAttributeCategory = (AttributeCategory)element;
					if (bIsRuleSelected){
						if(validCategoriesForResource(oSelectedResource,oAttributeCategory)){
							return validRightArgument(oSelectedResource,oAttributeCategory);
						}
						return false;
					}
					if (oAttributeCategory.equals(AttributeCategory.CONSTANT)){
						return validRightArgument(oSelectedResource,oAttributeCategory);	
					}
				}
				return false;
			}
		});
		oRightSideCategoryViewer.setInput(oRESTfulServiceCIM.getHasResources());

		oRightSideCategoryCombo = oRightSideCategoryViewer.getCombo();
		oRightSideCategoryCombo.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));

		oRightTypeLabel = new Label(oConditionConfigGroup, SWT.NONE);
		oRightTypeLabel.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		oRightTypeLabel.setAlignment(SWT.CENTER);

		oRightSideResourceValueComposite = new Composite(oConditionConfigGroup,SWT.NONE);
		oRightSideResourceValueComposite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		oRightSideResourceValueLayout = new StackLayout();
		oRightSideResourceValueComposite.setLayout(oRightSideResourceValueLayout);

		oRightValueComposite = new Composite(oRightSideResourceValueComposite, SWT.NONE);
		oRightValueComposite.setLayout(new FillLayout(SWT.VERTICAL));

		oNewValueButton = new Button(oRightValueComposite, SWT.NONE);
		oNewValueButton.setEnabled(false);
		oNewValueButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				InputDialog newValueDialog = new InputDialog(Display.getCurrent().getActiveShell(),
						"New constant", "Enter the new value :", "NewValue", null);
				if (newValueDialog.open() == Window.OK) {
					oSelectedCondition.getHasRightSideOperand().getValue().add(newValueDialog.getValue());
					updateModel(oSelectedCondition);
					if (intSelectedValueIndex < 0){
						intSelectedValueIndex = oSelectedCondition.getHasRightSideOperand().getValue().indexOf(newValueDialog.getValue());
					}
				}
				updateConditionConfigurationView();
				updateConditionListView(false);
			}
		});
		oNewValueButton.setText("New ");

		oEditValueButton = new Button(oRightValueComposite, SWT.NONE);
		oEditValueButton.setEnabled(false);
		oEditValueButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				InputDialog editValueDialog = new InputDialog(Display.getCurrent().getActiveShell(),
						"Edit constant", "Enter the new value :", oSelectedCondition.getHasRightSideOperand().getValue().get(intSelectedValueIndex), null);
				if (editValueDialog.open() == Window.OK) {
					// User clicked OK; update the label with the input
					oSelectedCondition.getHasRightSideOperand().getValue().set(intSelectedValueIndex,editValueDialog.getValue());
				}
				updateConditionConfigurationView();
				updateConditionListView(false);
			}
		});
		oEditValueButton.setText("Edit");

		oDeleteValueButton = new Button(oRightValueComposite, SWT.NONE);
		oDeleteValueButton.setEnabled(false);
		oDeleteValueButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (intSelectedValueIndex >= 0){
					oSelectedCondition.getHasRightSideOperand().getValue().remove(intSelectedValueIndex);
					updateModel(oSelectedCondition);
					if (oSelectedCondition.getHasRightSideOperand().getValue().isEmpty()){
						intSelectedValueIndex = -1;
					}else{
						if (intSelectedValueIndex == oSelectedCondition.getHasRightSideOperand().getValue().size()){
							intSelectedValueIndex--;
						}
					}
				}
				updateConditionConfigurationView();
				updateConditionListView(false);
			}
		});
		oDeleteValueButton.setText("Delete");

		oRightSideResourceComboViewer = new ComboViewer(oRightSideResourceValueComposite, SWT.READ_ONLY);
		oRightSideResourceComboViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				if (!event.getSelection().isEmpty()){
					if(event.getSelection() instanceof IStructuredSelection) {
						IStructuredSelection selection = (IStructuredSelection)event.getSelection();
						Object selectedItem = selection.getFirstElement();

						if (selectedItem instanceof Resource){
							Resource oResource =(Resource)selectedItem;
							Resource parentResource = null;
							if (hasAttr(oSelectedCondition.getHasRightSideOperand())){
								if (oSelectedCondition.getHasRightSideOperand().getIsAttributeExistingProperty() != null){
									parentResource = (Resource)oSelectedCondition.getHasRightSideOperand().getIsAttributeExistingProperty().getAnnotatesProperty().eContainer();
								}
								if (oSelectedCondition.getHasRightSideOperand().getIsAttributeNewProperty() != null){
									parentResource = oSelectedCondition.getHasRightSideOperand().getIsAttributeNewProperty().getBelongsToResource().getAnnotatesResource();
								}
								if(oSelectedCondition.getHasRightSideOperand().getIsAttributeResource() != null){
									parentResource = oSelectedCondition.getHasRightSideOperand().getIsAttributeResource().getAnnotatesResource();
								}
								if (!oResource.equals(parentResource)){
									clearAttr(oSelectedCondition.getHasRightSideOperand());
									updateModel(oSelectedCondition);
									updatePolicyRuleSelectedView(false);
								}
							}else{
								if (oSelectedCondition.getHasLeftSideOperand().getIsAttributeResource() != null){
									clearAttr(oSelectedCondition.getHasRightSideOperand());
									updateAttr(oSelectedCondition.getHasRightSideOperand(),getAnnResourceFromResource(oResource));
									updateModel(oSelectedCondition);			   
								}
								updatePolicyRuleSelectedView(false);

							}

						}
					}	
				}
			}
		});
		oRightSideResourceComboViewer.setContentProvider(new ResourceContentProvider());
		oRightSideResourceComboViewer.setLabelProvider(new ResourceLabelProvider());
		oRightSideResourceComboViewer.addFilter(new ViewerFilter() {

			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				if (oSelectedResource != null && oSelectedCondition != null && element instanceof Resource){
					Resource filteredResource = (Resource)element;
					if (!validRightArgument(oSelectedCondition.getHasRightSideOperand().getAttributeCategory(),filteredResource)) return false;
					if (filteredResource.isIsAlgorithmic()){
						return false;
					}
					if (oSelectedCondition.getHasRightSideOperand().getAttributeCategory().equals(AttributeCategory.ACCESS_SUBJECT)){
						return oRESTfulServiceCIM.getHasResources().indexOf(filteredResource) == intAuthenticationResourceIndex;
					}
					if (oSelectedCondition.getHasRightSideOperand().getAttributeCategory().equals(AttributeCategory.ACCESSED_RESOURCE)){
						return oSelectedResource.equals(filteredResource);
					}
					if (oSelectedCondition.getHasRightSideOperand().getAttributeCategory().equals(AttributeCategory.PARENT_RESOURCE)){
						if (intAuthenticationResourceIndex != 1 && filteredResource.equals(oRESTfulServiceCIM.getHasResources().get(intAuthenticationResourceIndex)) && !oSelectedResource.getIsRelatedResource().contains(filteredResource)){
							return ((AuthorizableResource)oInnerAuthorizationCIM.getHasAnnotation().get(getAuthResourceIndexFromResource(oSelectedResource))).isBTrackOwnership();
						}
						return oSelectedResource.getIsRelatedResource().contains(filteredResource);
					}
					if (oSelectedCondition.getHasRightSideOperand().getAttributeCategory().equals(AttributeCategory.CHILD_RESOURCE)){
						return oSelectedResource.getHasRelatedResource().contains(filteredResource);
					}
					if (oSelectedCondition.getHasRightSideOperand().getAttributeCategory().equals(AttributeCategory.INCLUDED_RESOURCE)){
						return oSelectedResource.equals(filteredResource);
					}
					if (oSelectedCondition.getHasRightSideOperand().getAttributeCategory().equals(AttributeCategory.CONSTANT)){
						return false;
					}
				}
				return false;
			}
		});
		oRightSideResourceComboViewer.setInput(oRESTfulServiceCIM);
		oRightSideResourceCombo = oRightSideResourceComboViewer.getCombo();
		oRightSideResourceCombo.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		new Label(oConditionConfigGroup, SWT.NONE);
		oRightPropertyValuesComposite = new Composite(oConditionConfigGroup, SWT.NONE);
		oRightPropertyValuesComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		oRightPropertyValuesLayout = new StackLayout();
		oRightPropertyValuesComposite.setLayout(oRightPropertyValuesLayout);

		oConstantValuesList = new List(oRightPropertyValuesComposite, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		oConstantValuesList.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				intSelectedValueIndex = oConstantValuesList.getSelectionIndex();
			}
		});

		oRightPropertyComboViewer = new ComboViewer(oRightPropertyValuesComposite, SWT.READ_ONLY);
		oRightPropertyComboViewer.setContentProvider(new PropertyContentProvider(oInnerAuthorizationCIM));
		oRightPropertyComboViewer.setLabelProvider(new PropertyLabelProvider());
		oRightPropertyComboViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				if (!event.getSelection().isEmpty()){
					if(event.getSelection() instanceof IStructuredSelection) {
						IStructuredSelection selection = (IStructuredSelection)event.getSelection();
						Object selectedItem = selection.getFirstElement();
						boolean addNewPropertyFlag = false;
						boolean createRightPropertyFlag = false;

						if (selectedItem instanceof Property){
							Property oProperty =(Property)selectedItem;			            
							if (oSelectedCondition.getHasRightSideOperand().getIsAttributeExistingProperty() == null){
								createRightPropertyFlag = true;
							}else{
								createRightPropertyFlag = !oSelectedCondition.getHasRightSideOperand().getIsAttributeExistingProperty().getAnnotatesProperty().equals(oProperty);
							}
							if (createRightPropertyFlag){
								addRightProperty(oProperty);
							}
						}

						if (selectedItem instanceof NewProperty){
							NewProperty oNewProperty = (NewProperty)selectedItem;	            	 
							if (oSelectedCondition.getHasRightSideOperand().getIsAttributeNewProperty() == null){
								addNewPropertyFlag = true;
							}else{
								addNewPropertyFlag = !oSelectedCondition.getHasRightSideOperand().getIsAttributeNewProperty().equals(oNewProperty);
							}
							if (addNewPropertyFlag){
								updateAttr(oSelectedCondition.getHasRightSideOperand(),oNewProperty);
							}
						}

						if (createRightPropertyFlag || addNewPropertyFlag){
							updateModel(oSelectedCondition);
							updateConditionConfigurationView();
							updateConditionListView(false);
						}
					}	
				}
			}

			private void addRightProperty(Property oProperty) {
				//System.out.println("Added Right Property");
				for (AnnotatedElement oAnnotatedElement : oInnerAuthorizationCIM.getHasAnnotatedElement()){
					if (oAnnotatedElement instanceof AnnProperty){
						if (((AnnProperty)oAnnotatedElement).getAnnotatesProperty().equals(oProperty)){
							updateAttr(oSelectedCondition.getHasRightSideOperand(), (AnnProperty) oAnnotatedElement);
							return;
						}
					}
				}
				AnnProperty oAnnProperty = oAuthorizationLayerCIMFactory.createAnnProperty();
				oAnnProperty.setAnnotatesProperty(oProperty);
				updateAttr(oSelectedCondition.getHasRightSideOperand(), oAnnProperty);
				oInnerAuthorizationCIM.getHasAnnotatedElement().add(oAnnProperty);
				return;
			}
		});
		oRightPropertyComboViewer.addFilter(new ViewerFilter() {

			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				if (element instanceof Property){					
					return validRightArgument(oSelectedCondition.getHasRightSideOperand().getAttributeCategory(), (Property)element);
				}
				if (element instanceof NewProperty){					
					return validRightArgument(oSelectedCondition.getHasRightSideOperand().getAttributeCategory(), (NewProperty)element);
				}
				return false;
			}
		});
		oRightPropertyCombo = oRightPropertyComboViewer.getCombo();
		oPrimarySashForm.setWeights(new int[] {1, 2});

		validate(this.oInnerAuthorizationCIM);
		oTreeViewer.setInput(oInnerAuthorizationCIM);
	}

	//Helper Methods
	private void loadAuthorizationModel() {
		if (oAuthorizationCIM == null){
			System.out.println("No authorization model found.Starting from scratch");
			instantiateAuthorizationModel();
			return;
		}
		//first create a new copy of every annotatedElement , if valid
		for(AnnotatedElement oAnnotatedElement : oAuthorizationCIM.getHasAnnotatedElement()){
			if(oAnnotatedElement instanceof AnnResource){
				AnnResource oAnnResource = (AnnResource)oAnnotatedElement;
				for (Resource oResource : oRESTfulServiceCIM.getHasResources()){
					if (oResource.getName().equalsIgnoreCase(oAnnResource.getAnnotatesResource().getName())){
						AnnResource copyAnnResource = EcoreUtil.copy(oAnnResource);
						copyAnnResource.setAnnotatesResource(oResource);
						oInnerAuthorizationCIM.getHasAnnotatedElement().add(copyAnnResource);
						break;
					}
				}
			}
			if(oAnnotatedElement instanceof AnnProperty){
				AnnProperty oAnnProperty = (AnnProperty)oAnnotatedElement;
				for (Resource oResource : oRESTfulServiceCIM.getHasResources()){
					if (oResource.getName().equalsIgnoreCase(((Resource) oAnnProperty.getAnnotatesProperty().eContainer()).getName())){
						for (Property oProperty : oResource.getHasProperty()){
							//If there exist an exact same property , with the exact same parent resource, copy
							if(oProperty.getName().equals(oAnnProperty.getAnnotatesProperty().getName()) &&
									oProperty.getType().equals(oAnnProperty.getAnnotatesProperty().getType()) &&
									oProperty.isIsUnique() == oAnnProperty.getAnnotatesProperty().isIsUnique() ){

								AnnProperty copyAnnProperty = EcoreUtil.copy(oAnnProperty);
								copyAnnProperty.setAnnotatesProperty(oProperty);
								oInnerAuthorizationCIM.getHasAnnotatedElement().add(copyAnnProperty);
								break;
							}
						}
						break;
					}
				}
			}
			if(oAnnotatedElement instanceof AnnCRUDActivity){
				AnnCRUDActivity oAnnCRUDActivity = (AnnCRUDActivity)oAnnotatedElement;
				for (Resource oResource : oRESTfulServiceCIM.getHasResources()){
					if (oResource.getName().equalsIgnoreCase(((Resource) oAnnCRUDActivity.getAnnotatesCRUDActivity().eContainer()).getName())){
						for (CRUDActivity oCrudActivity : oResource.getHasCRUDActivity()){
							if (oCrudActivity.getCRUDVerb().getLiteral().equalsIgnoreCase(oAnnCRUDActivity.getAnnotatesCRUDActivity().getCRUDVerb().getLiteral())){
								if (getAnnCRUDActivityByVerb(oResource, oCrudActivity.getCRUDVerb().getLiteral()) == null){
									AnnCRUDActivity copyAnnCRUDActivity = EcoreUtil.copy(oAnnCRUDActivity);
									copyAnnCRUDActivity.setAnnotatesCRUDActivity(oCrudActivity);
									oInnerAuthorizationCIM.getHasAnnotatedElement().add(copyAnnCRUDActivity);
									break;
								}
							}
						}
						break;
					}
				}
			}
		}

		//then begin copying valid annotations
		for(Annotation oAnnotation : oAuthorizationCIM.getHasAnnotation()){
			if(oAnnotation instanceof NewProperty){
				NewProperty oNewProperty = (NewProperty)oAnnotation;
				if (getAnnResourceByName(oNewProperty.getBelongsToResource().getAnnotatesResource().getName()) != null){
					oNewProperty = EcoreUtil.copy(oNewProperty);
					oNewProperty.setBelongsToResource(getAnnResourceByName(oNewProperty.getBelongsToResource().getAnnotatesResource().getName()));
					oInnerAuthorizationCIM.getHasAnnotation().add(oNewProperty);
				}
			}
		}

		//Doesn't matter if the authentication model changed, we still create a valid element
		instantiateAuthorizationModel();

		for(Annotation oAnnotation : oAuthorizationCIM.getHasAnnotation()){
			if(oAnnotation instanceof AuthorizableResource){
				AuthorizableResource oAuthorizableResource = (AuthorizableResource)oAnnotation;
				if (getAnnResourceByName(oAuthorizableResource.getIsAuthorizableResource().getAnnotatesResource().getName()) != null){
					oAuthorizableResource = EcoreUtil.copy(oAuthorizableResource);
					oAuthorizableResource.setIsAuthorizableResource(getAnnResourceByName(oAuthorizableResource.getIsAuthorizableResource().getAnnotatesResource().getName()));
					oAuthorizableResource.setBTrackOwnership(isAuthSubjectsDescendant(oAuthorizableResource.getIsAuthorizableResource().getAnnotatesResource()));
					ResourceAccessPolicySet oRootPolicySet = oAuthorizableResource.getHasResourceAccessPolicySet();
					validateReferences(oRootPolicySet);
					oAnnotationToResourceMap.put(oAuthorizableResource, getAnnResourceByName(oAuthorizableResource.getIsAuthorizableResource().getAnnotatesResource().getName()).getAnnotatesResource());
					oInnerAuthorizationCIM.getHasAnnotation().add(oAuthorizableResource);
					bIsResourceAuthorizable[oRESTfulServiceCIM.getHasResources().indexOf(oAuthorizableResource.getIsAuthorizableResource().getAnnotatesResource())] = true;
				}
			}
		}

	}
	private void validateReferences(ResourceAccessPolicySet oResourceAccessPolicySet){
		for(ResourceAccessPolicySet oResourceAccessPolicySet2 : oResourceAccessPolicySet.getHasResourceAccessPolicySet()){
			validateReferences(oResourceAccessPolicySet2);
		}
		for(ResourceAccessPolicy oResourceAccessPolicy : oResourceAccessPolicySet.getHasResourceAccessPolicy()){
			for (Condition oCondition : oResourceAccessPolicy.getHasApplyCondition()){
				validateReferences(oCondition);
			}
			for(ResourceAccessRule oResourceAccessRule : oResourceAccessPolicy.getHasResourceAccessRule()){
				int size = oResourceAccessRule.getHasAllowedAction().size();
				for(int i = size - 1; i>=0; i-- ){
					Boolean actionsExists = false;
					AnnCRUDActivity oAnnCRUDActivity = oResourceAccessRule.getHasAllowedAction().get(i).getIsAllowedAction();
					for (Resource oResource : oRESTfulServiceCIM.getHasResources()){
						if (oResource.getName().equalsIgnoreCase(((Resource) oAnnCRUDActivity.getAnnotatesCRUDActivity().eContainer()).getName())){
							if(getAnnCRUDActivityByVerb(oResource,oAnnCRUDActivity.getAnnotatesCRUDActivity().getCRUDVerb().getLiteral()) != null){
								actionsExists = true;
								oResourceAccessRule.getHasAllowedAction().get(i).setIsAllowedAction(getAnnCRUDActivityByVerb(oResource,oAnnCRUDActivity.getAnnotatesCRUDActivity().getCRUDVerb().getLiteral()));
							}
							break;
						}
					}
					if(!actionsExists){
						oResourceAccessRule.getHasAllowedAction().remove(i);
					}
				}
				for (Condition oCondition : oResourceAccessRule.getHasMatchCondition()){
					validateReferences(oCondition);
				}
			}
		}
	}
	private void validateReferences(Condition oCondition){
		if (hasAttr(oCondition.getHasLeftSideOperand())){
			Boolean exists = false;
			if (oCondition.getHasLeftSideOperand().getIsAttributeExistingProperty() != null){
				AnnProperty oAnnProperty = oCondition.getHasLeftSideOperand().getIsAttributeExistingProperty();
				for (Resource oResource : oRESTfulServiceCIM.getHasResources()){
					if (oResource.getName().equalsIgnoreCase(((Resource) oAnnProperty.getAnnotatesProperty().eContainer()).getName())){
						for (Property oProperty : oResource.getHasProperty()){
							//If there exist an exact same property , with the exact same parent resource, copy
							if(oProperty.getName().equals(oAnnProperty.getAnnotatesProperty().getName()) &&
									oProperty.getType().equals(oAnnProperty.getAnnotatesProperty().getType()) &&
									oProperty.isIsUnique() == oAnnProperty.getAnnotatesProperty().isIsUnique() ){

								if (getAnnPropertyByName(oResource,oProperty.getName()) != null){
									exists = true;
									updateAttr(oCondition.getHasLeftSideOperand(), getAnnPropertyByName(oResource,oProperty.getName()));
								}
								break;
							}
						}
						break;
					}
				}
			}
			if (oCondition.getHasLeftSideOperand().getIsAttributeNewProperty() != null){
				for(Annotation oAnnotation : oInnerAuthorizationCIM.getHasAnnotation()){
					if (oAnnotation instanceof NewProperty){
						NewProperty oNewProperty = (NewProperty)oAnnotation;
						if (oNewProperty.getName().equalsIgnoreCase(oCondition.getHasLeftSideOperand().getIsAttributeNewProperty().getName())){
							if(getAnnResourceByName(oNewProperty.getBelongsToResource().getAnnotatesResource().getName()) != null){
								if(getAnnResourceByName(oNewProperty.getBelongsToResource().getAnnotatesResource().getName()).getAnnotatesResource().getName().equalsIgnoreCase(
										oCondition.getHasLeftSideOperand().getIsAttributeNewProperty().getBelongsToResource().getAnnotatesResource().getName())){
									exists= true;
									updateAttr(oCondition.getHasLeftSideOperand(),oNewProperty);
									break;	
								}
							}
						}
					}
				}
			}
			if (oCondition.getHasLeftSideOperand().getIsAttributeResource() != null){
				if(getAnnResourceByName(oCondition.getHasLeftSideOperand().getIsAttributeResource().getAnnotatesResource().getName()) != null){
					exists = true;
					updateAttr(oCondition.getHasLeftSideOperand(),getAnnResourceByName(oCondition.getHasLeftSideOperand().getIsAttributeResource().getAnnotatesResource().getName()));
				}
			}
			if(!exists){
				clearAttr(oCondition.getHasLeftSideOperand());
			}
		}
		if (hasAttr(oCondition.getHasRightSideOperand())){
			Boolean exists = false;
			if (oCondition.getHasRightSideOperand().getIsAttributeExistingProperty() != null){
				AnnProperty oAnnProperty = oCondition.getHasRightSideOperand().getIsAttributeExistingProperty();
				for (Resource oResource : oRESTfulServiceCIM.getHasResources()){
					if (oResource.getName().equalsIgnoreCase(((Resource) oAnnProperty.getAnnotatesProperty().eContainer()).getName())){
						for (Property oProperty : oResource.getHasProperty()){
							//If there exist an exact same property , with the exact same parent resource, copy
							if(oProperty.getName().equals(oAnnProperty.getAnnotatesProperty().getName()) &&
									oProperty.getType().equals(oAnnProperty.getAnnotatesProperty().getType()) &&
									oProperty.isIsUnique() == oAnnProperty.getAnnotatesProperty().isIsUnique() ){

								if (getAnnPropertyByName(oResource,oProperty.getName()) != null){
									exists = true;
									updateAttr(oCondition.getHasRightSideOperand(), getAnnPropertyByName(oResource,oProperty.getName()));
								}
								break;
							}
						}
						break;
					}
				}
			}
			if (oCondition.getHasRightSideOperand().getIsAttributeNewProperty() != null){
				for(Annotation oAnnotation : oInnerAuthorizationCIM.getHasAnnotation()){
					if (oAnnotation instanceof NewProperty){
						NewProperty oNewProperty = (NewProperty)oAnnotation;
						if (oNewProperty.getName().equalsIgnoreCase(oCondition.getHasRightSideOperand().getIsAttributeNewProperty().getName())){
							if(getAnnResourceByName(oNewProperty.getBelongsToResource().getAnnotatesResource().getName()) != null){
								if(getAnnResourceByName(oNewProperty.getBelongsToResource().getAnnotatesResource().getName()).getAnnotatesResource().getName().equalsIgnoreCase(
										oCondition.getHasRightSideOperand().getIsAttributeNewProperty().getBelongsToResource().getAnnotatesResource().getName())){
									exists= true;
									updateAttr(oCondition.getHasRightSideOperand(),oNewProperty);
									break;	
								}
							}
						}
					}
				}
			}
			if (oCondition.getHasRightSideOperand().getIsAttributeResource() != null){
				if(getAnnResourceByName(oCondition.getHasRightSideOperand().getIsAttributeResource().getAnnotatesResource().getName()) != null){
					exists = true;
					updateAttr(oCondition.getHasRightSideOperand(),getAnnResourceByName(oCondition.getHasRightSideOperand().getIsAttributeResource().getAnnotatesResource().getName()));
				}
			}
			if(!exists){
				clearAttr(oCondition.getHasRightSideOperand());
			}
		}
	}
	private void instantiateAuthorizationModel() {
		this.intAuthenticationResourceIndex = -1;
		//Only have to initialize the authorizationSubject, based on the authentication  model
		if (oAuthenticationCIM != null){
			for (AuthenticationLayerCIM.Annotation oAnnotation : oAuthenticationCIM.getHasAnnotation()){
				if (oAnnotation instanceof AuthenticationLayerCIM.AuthenticationModel){
					AuthenticationLayerCIM.AuthenticationModel oAuthenticationModel = (AuthenticationLayerCIM.AuthenticationModel)oAnnotation;
					oAuthorizationSubject = oAuthorizationLayerCIMFactory.createAuthorizationSubject();
					this.intAuthenticationResourceIndex = this.oRESTfulServiceCIM.getHasResources().indexOf(oAuthenticationModel.getResourceAuthenticationModel().getAnnotatesResource());
					oAuthorizationSubject.setIsAuthorizationSubject(getAnnResourceFromResource(oAuthenticationModel.getResourceAuthenticationModel().getAnnotatesResource()));
					this.oInnerAuthorizationCIM.getHasAnnotation().add(oAuthorizationSubject);
					break;
				}
			}
		}
	}
	private void recursiveSetEnabled(Control ctrl, boolean enabled) {
		if (ctrl instanceof Composite) {
			Composite comp = (Composite) ctrl;
			for (Control c : comp.getChildren())
				recursiveSetEnabled(c, enabled);
		}
		ctrl.setEnabled(enabled);
	}	
	private Resource getResourceFromPolicySet(ResourceAccessPolicySet oResourceAccessPolicySet){
		while (oResourceAccessPolicySet.eContainer() instanceof ResourceAccessPolicySet){
			oResourceAccessPolicySet = (ResourceAccessPolicySet)oResourceAccessPolicySet.eContainer();
		}
		AuthorizableResource oAuthorizableResource = (AuthorizableResource)oResourceAccessPolicySet.eContainer();
		return oAuthorizableResource.getIsAuthorizableResource().getAnnotatesResource();
	}
	private int getAuthResourceIndexFromResource(Resource oResource){
		for (Annotation oAnnotation : oInnerAuthorizationCIM.getHasAnnotation()){
			if (oAnnotation instanceof AuthorizableResource){
				if (((AuthorizableResource)oAnnotation).getIsAuthorizableResource().getAnnotatesResource().equals(oResource)){
					return oInnerAuthorizationCIM.getHasAnnotation().indexOf(oAnnotation);
				}
			}
		}
		return -1;
	}
	private AuthorizableResource getAuthResourceFromResource(Resource oResource){
		return (AuthorizableResource)oInnerAuthorizationCIM.getHasAnnotation().get(getAuthResourceIndexFromResource(oResource));
	}
	private boolean actionExists(EList<AllowedAction> setOfActions,CRUDVerb oCRUDVerb){		
		for (AllowedAction oAction : setOfActions){
			if (oAction.getIsAllowedAction().getAnnotatesCRUDActivity().getCRUDVerb().toString().equalsIgnoreCase(oCRUDVerb.getLiteral())){
				return true;
			}
		}
		return false;
	}
	private boolean selectedResourceHasSubjectAsParent(){
		if (oSelectedResource != null && intAuthenticationResourceIndex != -1){
			return oRESTfulServiceCIM.getHasResources().get(intAuthenticationResourceIndex).getHasRelatedResource().contains(oSelectedResource);
		}
		return false;
	}
	private Condition createNewCondition(){
		Condition newCondition = oAuthorizationLayerCIMFactory.createCondition();
		Attribute oAttribute = oAuthorizationLayerCIMFactory.createAttribute();
		newCondition.setHasLeftSideOperand(oAttribute);
		oAttribute = oAuthorizationLayerCIMFactory.createAttribute();
		oAttribute.setAttributeCategory(AttributeCategory.CONSTANT);
		newCondition.setHasRightSideOperand(oAttribute);
		return newCondition;
	}
	private void clearConditionConfigPanel(){
		oLeftSideCategoryCombo.deselectAll();
		oLeftSideResourceCombo.deselectAll();
		oLeftPropertyCombo.deselectAll();
		oLeftTypeLabel.setText("");
		oRightSideCategoryCombo.deselectAll();
		oRightSideResourceCombo.deselectAll();
		oRightPropertyCombo.deselectAll();
		oConstantValuesList.setItems(new String[]{});
		oRightTypeLabel.setText("");
		oOperatorComboViewer.setSelection(StructuredSelection.EMPTY);
		oLeftResourceAsAttributeBtn.setEnabled(false);
		oLeftResourceAsAttributeBtn.setSelection(false);
	}
	private void allowedActionsHandler(Button btn){
		CRUDVerb oCRUDVerb;
		if (btn == btnGet){
			oCRUDVerb = CRUDVerb.READ;
		}else if (btn == btnPut){
			oCRUDVerb = CRUDVerb.UPDATE;
		}else if (btn == btnPost){
			oCRUDVerb = CRUDVerb.CREATE;
		}else{
			oCRUDVerb = CRUDVerb.DELETE;
		}	

		if (btn.getSelection()){
			boolean flag =  false;
			AnnCRUDActivity oAnnCRUDActivity = null;
			AllowedAction oAllowedAction = oAuthorizationLayerCIMFactory.createAllowedAction();
			for (CRUDActivity oCRUDActivity : oSelectedResource.getHasCRUDActivity()){
				if (oCRUDActivity.getCRUDVerb().equals(oCRUDVerb)){
					flag = false;
					for(AnnotatedElement oAnnotatedElement : oInnerAuthorizationCIM.getHasAnnotatedElement()){
						if (oAnnotatedElement instanceof AnnCRUDActivity){
							if (((AnnCRUDActivity)oAnnotatedElement).getAnnotatesCRUDActivity().equals(oCRUDActivity)){
								oAnnCRUDActivity = (AnnCRUDActivity)oAnnotatedElement;
								flag = true;
								break;
							}
						}
					}
					if (!flag){
						oAnnCRUDActivity = oAuthorizationLayerCIMFactory.createAnnCRUDActivity();
						oAnnCRUDActivity.setAnnotatesCRUDActivity(oCRUDActivity);
						oInnerAuthorizationCIM.getHasAnnotatedElement().add(oAnnCRUDActivity);					
					}
					break;
				}
			}
			oAllowedAction.setIsAllowedAction(oAnnCRUDActivity);
			oSelectedRule.getHasAllowedAction().add(oAllowedAction);
			updateModel(oSelectedRule);
		}else{
			for (AllowedAction oAllowedAction : oSelectedRule.getHasAllowedAction()){
				if (oAllowedAction.getIsAllowedAction().getAnnotatesCRUDActivity().getCRUDVerb().equals(oCRUDVerb)){
					oSelectedRule.getHasAllowedAction().remove(oAllowedAction);
					updateModel(oSelectedRule);
					boolean flag = false;
					for (TreeIterator<EObject> i = getAuthResourceFromResource(oSelectedResource).eAllContents(); i.hasNext(); ){
						Object oObject = i.next();
						if (oObject instanceof AllowedAction){
							if (((AllowedAction)oObject).getIsAllowedAction().equals(oAllowedAction.getIsAllowedAction())){
								flag = true;
								break;
							}
						}
					}
					if (!flag){
						oInnerAuthorizationCIM.getHasAnnotatedElement().remove(oAllowedAction.getIsAllowedAction());
					}
					break;
				}
			}
		}
		updateSelection(oSelectedRule,true);
		if (oSelectedCondition != null){
			if (!validCategoriesForResource(oSelectedResource,oSelectedCondition.getHasLeftSideOperand().getAttributeCategory())){
				clearAttr(oSelectedCondition.getHasLeftSideOperand());
				oSelectedCondition.setOperator(Operator.UNDEFINED);
				clearAttr(oSelectedCondition.getHasRightSideOperand());
			}
			if (!validCategoriesForResource(oSelectedResource,oSelectedCondition.getHasRightSideOperand().getAttributeCategory())){
				clearAttr(oSelectedCondition.getHasRightSideOperand());
			}
			updateModel(oSelectedCondition);
		}

		updatePolicyRuleSelectedView(false);
	}
	private void updateAnnCRUDActivities(AuthorizableResource oAuthorizableResource){
		ArrayList<AnnCRUDActivity> oActivityList = new ArrayList<AnnCRUDActivity>();
		for(AnnotatedElement oAnnotatedElement : oInnerAuthorizationCIM.getHasAnnotatedElement()){
			if (oAnnotatedElement instanceof AnnCRUDActivity){
				AnnCRUDActivity oAnnCRUDActivity = (AnnCRUDActivity)oAnnotatedElement;
				if (oAnnCRUDActivity.getAnnotatesCRUDActivity().eContainer().equals(oAuthorizableResource.getIsAuthorizableResource().getAnnotatesResource())){
					oActivityList.add(oAnnCRUDActivity);
				}
			}
		}
		for (AnnCRUDActivity oAnnCRUDActivity : oActivityList){
			boolean flag = false;
			for (TreeIterator<EObject> i = oAuthorizableResource.eAllContents(); i.hasNext(); ){
				Object oObject = i.next();
				if (oObject instanceof AllowedAction){
					if (((AllowedAction)oObject).getIsAllowedAction().equals(oAnnCRUDActivity)){
						flag = true;
						break;
					}
				}
			}
			if (!flag){
				oInnerAuthorizationCIM.getHasAnnotatedElement().remove(oAnnCRUDActivity);
			}
		}
		return;
	}
	private AnnResource getAnnResourceFromResource(Resource oResource){		
		for (AnnotatedElement oAnnotatedElement :oInnerAuthorizationCIM.getHasAnnotatedElement()){
			if (oAnnotatedElement instanceof AnnResource){
				if (((AnnResource)oAnnotatedElement).getAnnotatesResource().equals(oResource)){
					return (AnnResource) oAnnotatedElement;
				}
			}
		}
		//if it doesn't exists, create a new one
		AnnResource oAnnResource = oAuthorizationLayerCIMFactory.createAnnResource();
		oAnnResource.setAnnotatesResource(oResource);
		oInnerAuthorizationCIM.getHasAnnotatedElement().add(oAnnResource);
		return oAnnResource;
	}
	private java.util.List<NewProperty> getNewPropertiesFromResource(Resource oResource){
		java.util.List<NewProperty> newProperties = new ArrayList<NewProperty>();
		for (Annotation oAnnotation : oInnerAuthorizationCIM.getHasAnnotation()){
			if (oAnnotation instanceof NewProperty){
				NewProperty oNewProperty = (NewProperty)oAnnotation;
				if (oNewProperty.getBelongsToResource().getAnnotatesResource().equals(oResource)){
					newProperties.add(oNewProperty);
				}
			}
		}
		return newProperties;
	}
	private NewProperty getNewPropertyByName(Resource parentResource,String name){
		for (NewProperty oNewProperty : getNewPropertiesFromResource(parentResource)){
			if (oNewProperty.getName().equalsIgnoreCase(name) && oNewProperty.getBelongsToResource().getAnnotatesResource().equals(parentResource)) return oNewProperty;
		}
		return null;
	}
	private String getTypeListString(String type){
		if (type.equalsIgnoreCase("int")) return "Integer";
		if (type.equalsIgnoreCase("double")) return "Double";
		if (type.equalsIgnoreCase("String")) return "String";
		return "";
	}
	//Check if the oAttributeCategory is valid for the oResource
	private boolean validCategoriesForResource(Resource oResource, AttributeCategory oAttributeCategory){

		if (oSelectedCondition.eContainer() instanceof ResourceAccessRule){
			EList<AllowedAction> setOfActions = ((ResourceAccessRule)oSelectedCondition.eContainer()).getHasAllowedAction();
			if(oAttributeCategory.equals(AttributeCategory.ACCESSED_RESOURCE)){
				return !actionExists(setOfActions, CRUDVerb.CREATE) && !oResource.isIsAlgorithmic();
			}
			if (oAttributeCategory.equals(AttributeCategory.PARENT_RESOURCE)){
				return !oResource.getIsRelatedResource().isEmpty();
			}
			if (oAttributeCategory.equals(AttributeCategory.CHILD_RESOURCE)){
				return !actionExists(setOfActions, CRUDVerb.CREATE) && !oResource.getHasRelatedResource().isEmpty();
			}
			if (oAttributeCategory.equals(AttributeCategory.INCLUDED_RESOURCE)){
				return !(actionExists(setOfActions, CRUDVerb.READ)|| actionExists(setOfActions, CRUDVerb.DELETE));
			}
			if (oAttributeCategory.equals(AttributeCategory.ACCESS_SUBJECT)){
				return intAuthenticationResourceIndex != -1 && actionsMustBeAuthenticated(oResource, setOfActions);
			}
			if (oAttributeCategory.equals(AttributeCategory.CONSTANT)){
				return true;
			}
		}
		
		if (oSelectedCondition.eContainer() instanceof ResourceAccessPolicy){
			if (oAttributeCategory.equals(AttributeCategory.CONSTANT)){
				return true;
			}
			return oAttributeCategory.equals(AttributeCategory.ACCESS_SUBJECT);
		}
		
		return false;

	}
	private boolean actionsMustBeAuthenticated(Resource oResource, EList<AllowedAction> setOfActions){
		for (AllowedAction oAction : setOfActions){
			for (AuthenticationLayerCIM.Annotation annotation: oAuthenticationCIM.getHasAnnotation()){
				if (annotation instanceof GuestMode){
					AuthenticationMode oAuthenticationMode = (AuthenticationMode)annotation;
					if (oAuthenticationMode.getCRUDActivityAuthenticationMode().getAnnotatesCRUDActivity()
							.equals(oAction.getIsAllowedAction().getAnnotatesCRUDActivity())){
						return false;
					}
				}
			}
		}
	
		return true;
	}
	private AuthorizableResource createAuthorizableResource(){
		if (oSelectedResource == null) return null;
		ResourceAccessPolicySet tempResourceAccessPolicySet = oAuthorizationLayerCIMFactory.createResourceAccessPolicySet();
		tempResourceAccessPolicySet.setName(oSelectedResource.getName() + "PolicySet");
		tempResourceAccessPolicySet.setPolicyCombiningAlgorithm(CombiningAlgorithm.DENY_OVERRIDES);
		AnnResource tempAnnResource = getAnnResourceFromResource(oSelectedResource);
		this.oInnerAuthorizationCIM.getHasAnnotatedElement().add(tempAnnResource);
		AuthorizableResource tempAuthorizableResource = oAuthorizationLayerCIMFactory.createAuthorizableResource();
		tempAuthorizableResource.setIsAuthorizableResource(tempAnnResource);
		tempAuthorizableResource.setHasResourceAccessPolicySet(tempResourceAccessPolicySet);
		tempAuthorizableResource.setBTrackOwnership(isAuthSubjectsDescendant(oSelectedResource));
		this.oInnerAuthorizationCIM.getHasAnnotation().add(tempAuthorizableResource);	  
		oAnnotationToResourceMap.put(tempAuthorizableResource, oSelectedResource);
		return tempAuthorizableResource;
	}
	private boolean isAuthSubjectsDescendant(Resource oInputdResource) {
		EList<Resource> resourceList = oInputdResource.getIsRelatedResource();
		if (resourceList.isEmpty()){
			return false;
		}
		for (Resource oResource : resourceList){
			if (oResource.equals(oRESTfulServiceCIM.getHasResources().get(intAuthenticationResourceIndex))){
				return true;
			}
			if (isAuthSubjectsDescendant(oResource)){
				return true;
			}
		}
		return false;
	}
	private void deleteAuthorizableResource(){
		if (oSelectedResource == null) return;
		oAnnotationToResourceMap.remove(getAuthResourceFromResource(oSelectedResource));
		this.oInnerAuthorizationCIM.getHasAnnotation().remove(getAuthResourceFromResource(oSelectedResource)); 
	}
	private boolean bothNumerical(String type1, String type2){
		return !(type1.equalsIgnoreCase("string") || type2.equalsIgnoreCase("string"));
	}
	private Resource getParentResourceFromAttribute(Attribute oAttribute) {
		if (hasAttr(oAttribute)){
			if (oAttribute.getIsAttributeExistingProperty() != null) {
				return (Resource)oAttribute.getIsAttributeExistingProperty().getAnnotatesProperty().eContainer();
			}
			if (oAttribute.getIsAttributeNewProperty() != null) return oAttribute.getIsAttributeNewProperty().getBelongsToResource().getAnnotatesResource();
			if (oAttribute.getIsAttributeResource() != null) return oAttribute.getIsAttributeResource().getAnnotatesResource();

		}
		return null;
	}
	private AnnResource getAnnResourceByName(String name){
		//System.out.println(name);
		for (AnnotatedElement oAnnotatedElement : oInnerAuthorizationCIM.getHasAnnotatedElement()){
			if (oAnnotatedElement instanceof AnnResource){
				//System.out.println("Ypopshfio"+((AnnResource)oAnnotatedElement).getAnnotatesResource().getName());
				if (((AnnResource)oAnnotatedElement).getAnnotatesResource().getName().equalsIgnoreCase(name)){
					return (AnnResource) oAnnotatedElement;
				}
			}
		}

		return null;
	}
	private AnnProperty getAnnPropertyByName(Resource oResource, String name){
		for (AnnotatedElement oAnnotatedElement : oInnerAuthorizationCIM.getHasAnnotatedElement()){
			if (oAnnotatedElement instanceof AnnProperty){
				if (((AnnProperty)oAnnotatedElement).getAnnotatesProperty().getName().equalsIgnoreCase(name) 
						&& ((AnnProperty)oAnnotatedElement).getAnnotatesProperty().eContainer().equals(oResource)){
					return (AnnProperty) oAnnotatedElement;
				}
			}
		}

		return null;
	}
	private AnnCRUDActivity getAnnCRUDActivityByVerb(Resource oResource, String name){
		for (AnnotatedElement oAnnotatedElement : oInnerAuthorizationCIM.getHasAnnotatedElement()){
			if (oAnnotatedElement instanceof AnnCRUDActivity){
				if (((AnnCRUDActivity)oAnnotatedElement).getAnnotatesCRUDActivity().getCRUDVerb().getLiteral().equalsIgnoreCase(name) 
						&& ((AnnCRUDActivity)oAnnotatedElement).getAnnotatesCRUDActivity().eContainer().equals(oResource)){
					return (AnnCRUDActivity) oAnnotatedElement;
				}
			}
		}
		return null;
	}

	private void updateAttr(Attribute oAttribute,AnnProperty oAnnProperty){
		oAttribute.setIsAttributeExistingProperty(oAnnProperty);
		oAttribute.setIsAttributeNewProperty(null);
		oAttribute.setIsAttributeResource(null);
		oAttribute.getValue().removeAll(oAttribute.getValue());
	}
	private void updateAttr(Attribute oAttribute,NewProperty oNewProperty){
		oAttribute.setIsAttributeExistingProperty(null);
		oAttribute.setIsAttributeNewProperty(oNewProperty);
		oAttribute.setIsAttributeResource(null);
		oAttribute.getValue().removeAll(oAttribute.getValue());
	}
	private void updateAttr(Attribute oAttribute,AnnResource oAnnResource){
		oAttribute.setIsAttributeExistingProperty(null);
		oAttribute.setIsAttributeNewProperty(null);
		oAttribute.setIsAttributeResource(oAnnResource);
		oAttribute.getValue().removeAll(oAttribute.getValue());
	}
	private void clearAttr(Attribute oAttribute){
		oAttribute.setIsAttributeExistingProperty(null);
		oAttribute.setIsAttributeNewProperty(null);
		oAttribute.setIsAttributeResource(null);
		oAttribute.getValue().removeAll(oAttribute.getValue());
	}
	private boolean hasAttr(Attribute oAttribute){
		return !(oAttribute.getIsAttributeExistingProperty()==null &&
				oAttribute.getIsAttributeNewProperty()==null &&
				oAttribute.getIsAttributeResource()==null) ;
	}

	//These methods update all the inner selection variables. UI elements use these variables.
	private void updateSelection(Resource oResource,boolean bDeselect){
		oSelectedResource = oResource;
		intSelectedResourceIndex = oRESTfulServiceCIM.getHasResources().indexOf(oSelectedResource);
		oABACContentProvider.setIntSelectedResourceIndex(this.intSelectedResourceIndex);
		if(bDeselect){
			oSelectedPolicySet = null;
			oSelectedPolicy = null;
			oSelectedRule = null;
			oSelectedCondition = null;
		}
	}	
	private void updateSelection(ResourceAccessPolicySet oResourceAccessPolicySet,boolean bDeselect){
		oSelectedPolicySet  = oResourceAccessPolicySet;
		if (!getResourceFromPolicySet(oSelectedPolicySet).equals(oSelectedResource)){
			updateSelection(getResourceFromPolicySet(oSelectedPolicySet),false);
		}
		if (bDeselect){
			oSelectedPolicy = null;
			oSelectedRule = null;
			oSelectedCondition = null;
		}
	}
	private void updateSelection(ResourceAccessPolicy oResourceAccessPolicy,boolean bDeselect){
		if (bFirstPolicyRuleSelection){
			bFirstPolicyRuleSelection = false;
			bPolicyRuleUpdateAll = true;
			bIsRuleSelected = false;
		}else{
			if (bDeselect){
				bPolicyRuleUpdateAll = bIsRuleSelected;
				bIsRuleSelected = false;
			}
		}
		oSelectedPolicy = oResourceAccessPolicy;
		if (bDeselect){
			if(oResourceAccessPolicy.getHasApplyCondition().isEmpty()) {
				updateSelection((Condition)null) ;
			}else{
				updateSelection(oResourceAccessPolicy.getHasApplyCondition().get(0));
			}	
		}
		updateSelection((ResourceAccessPolicySet)oResourceAccessPolicy.eContainer(),false);
		if (bDeselect){
			oSelectedRule = null;
		}
	}
	private void updateSelection (ResourceAccessRule oResourceAccessRule,boolean bDeselect){
		if (bFirstPolicyRuleSelection){
			bFirstPolicyRuleSelection = false;
			bPolicyRuleUpdateAll = true;
		}else{
			bPolicyRuleUpdateAll = !bIsRuleSelected;
		}
		bIsRuleSelected = true;
		oSelectedRule = oResourceAccessRule;
		if(oResourceAccessRule.getHasMatchCondition().isEmpty() || oResourceAccessRule.getHasAllowedAction().isEmpty()) {
			updateSelection((Condition)null) ;
		}else{
			updateSelection(oResourceAccessRule.getHasMatchCondition().get(0));
		}
		updateSelection((ResourceAccessPolicy)oResourceAccessRule.eContainer(),false);
	}	
	private void updateSelection(Condition oCondition){
		oSelectedCondition = oCondition;
		if (oSelectedCondition == null){
			return;
		}
		if (oSelectedCondition.getHasRightSideOperand().getValue().isEmpty()){
			intSelectedValueIndex = -1;
		}else{
			intSelectedValueIndex = 0;
		}	
		//Don't need to recursively update the selections since Conditions are only visible through a specific Policy or Rule
	}

	//These methods update the inner model whenever changes occur via the UI	
	private void updateModel(AuthorizableResource oAuthorizableResource){
		oInnerAuthorizationCIM.getHasAnnotation().set(getAuthResourceIndexFromResource(oSelectedResource), oAuthorizableResource);
		validate(oInnerAuthorizationCIM);
	}
	private void updateModel(ResourceAccessPolicySet oResourceAccessPolicySet){	
		if (oResourceAccessPolicySet.eContainer() instanceof AuthorizableResource){
			updateModel((AuthorizableResource)oResourceAccessPolicySet.eContainer());
		}else{
			updateModel((ResourceAccessPolicySet)oResourceAccessPolicySet.eContainer());
		}

	}	
	private void updateModel(ResourceAccessPolicy oResourceAccessPolicy){
		oSelectedPolicySet.getHasResourceAccessPolicy().set(oSelectedPolicySet.getHasResourceAccessPolicy().indexOf(oResourceAccessPolicy), oResourceAccessPolicy);
		updateModel(oSelectedPolicySet);
	}
	private void updateModel(ResourceAccessRule oResourceAccessRule){
		oSelectedPolicy.getHasResourceAccessRule().set(oSelectedPolicy.getHasResourceAccessRule().indexOf(oResourceAccessRule), oResourceAccessRule);
		updateModel(oSelectedPolicy);
	}
	private void updateModel(Condition oCondition){
		if (bIsRuleSelected){
			oSelectedRule.getHasMatchCondition().set(oSelectedRule.getHasMatchCondition().indexOf(oCondition), oCondition);
			updateModel(oSelectedRule);
		}else{
			oSelectedPolicy.getHasApplyCondition().set(oSelectedPolicy.getHasApplyCondition().indexOf(oCondition), oCondition);
			updateModel(oSelectedPolicy);
		}
	}

	//These methods update all the UI elements, depending on the selected objects shown in the inner selection variables
	//The boolean input should be true if the method is called from a selection listener
	private void updateResourceSelectedView(boolean bNewSelection){
		this.setErrorMessage(oErrorMessages.get(oInnerAuthorizationCIM));
		if (bNewSelection){
			if (oDynamicPanelLayout.topControl != oResourceSelectedPanel){
				oDynamicPanelLayout.topControl = oResourceSelectedPanel;
			}
			oNewPropertiesList.removeAll();
			if (bIsResourceAuthorizable[intSelectedResourceIndex] && !oSelectedResource.isIsAlgorithmic()){
				for (NewProperty oNewProperty : getNewPropertiesFromResource(oSelectedResource)){
					oNewPropertiesList.add(oNewProperty.getName()); 
				}
				oNewPropertiesList.select(0);
			}
		}
		updateNewPropertyConfig();

		oIsAuthorizableResourceButton.setSelection(bIsResourceAuthorizable[intSelectedResourceIndex]);

		oDynamicPanel.layout();
	}	
	private void updateNewPropertyConfig(){
		if (oSelectedResource.isIsAlgorithmic()){
			oNewPropertiesList.removeAll();
			oNewPropertyIsCollectionCheck.setSelection(false);
			oNewPropertyNameText.setText("");
			oNewPropertyTypeCombo.deselectAll();
			recursiveSetEnabled(oNewPropertiesConfig, false);
			return;
		}else{
			if ((getNewPropertiesFromResource(oSelectedResource).size()<=0 && oNewPropertiesList.getItemCount()<=0)){
				oNewPropertiesList.removeAll();
				recursiveSetEnabled(oNewPropertiesConfig, false);
			}
			oNewPropertiesConfig.setEnabled(true);
			oNewPropertyBtn.setEnabled(true);
		}
		if (getNewPropertiesFromResource(oSelectedResource).size()>0 || oNewPropertiesList.getItemCount()>0){
			int selectionIndex = oNewPropertiesList.getSelectionIndex();
			if (oNewPropertiesList.getItemCount() != getNewPropertiesFromResource(oSelectedResource).size()){
				if (oNewPropertiesList.getItemCount() < getNewPropertiesFromResource(oSelectedResource).size()){
					//New Property added
					selectionIndex = getNewPropertiesFromResource(oSelectedResource).size()-1;
				}
				if (oNewPropertiesList.getItemCount() > getNewPropertiesFromResource(oSelectedResource).size()){
					//New Property deleted
					if (selectionIndex >= getNewPropertiesFromResource(oSelectedResource).size()) selectionIndex--;
				}
				oNewPropertiesList.removeAll();
				for (NewProperty oNewProperty : getNewPropertiesFromResource(oSelectedResource)){
					oNewPropertiesList.add(oNewProperty.getName()); 
				}
				oNewPropertiesList.select(selectionIndex);
			}else{
				if (!oNewPropertiesList.getSelection()[0].equals(getNewPropertiesFromResource(oSelectedResource).get(selectionIndex).getName())){
					//Selected Property name change
					oNewPropertiesList.setItem(selectionIndex, getNewPropertiesFromResource(oSelectedResource).get(selectionIndex).getName());
				}
			}
			if (!getNewPropertiesFromResource(oSelectedResource).isEmpty()){
				recursiveSetEnabled(oNewPropertiesConfig, true);
				if (!oNewPropertyNameText.getText().equals(getNewPropertiesFromResource(oSelectedResource).get(selectionIndex).getName())){
					oNewPropertyNameText.setText(getNewPropertiesFromResource(oSelectedResource).get(selectionIndex).getName());
				}
				oNewPropertyTypeCombo.select(oNewPropertyTypeCombo.indexOf(getTypeListString(getNewPropertyByName(oSelectedResource,oNewPropertiesList.getSelection()[0]).getType())));
				oNewPropertyIsCollectionCheck.setSelection(!getNewPropertyByName(oSelectedResource,oNewPropertiesList.getSelection()[0]).isBIsUnique());	
			}else{
				recursiveSetEnabled(oNewPropertiesConfig, false);
				oNewPropertiesConfig.setEnabled(true);
				oNewPropertyBtn.setEnabled(true);
				oNewPropertyNameText.setText("");
				oNewPropertyTypeCombo.deselectAll();
				oNewPropertyIsCollectionCheck.setSelection(false);
			}
		}else{
			recursiveSetEnabled(oNewPropertiesConfig, false);
			oNewPropertiesConfig.setEnabled(true);
			oNewPropertyBtn.setEnabled(true);
			oNewPropertyNameText.setText("");
			oNewPropertyTypeCombo.deselectAll();
			oNewPropertyIsCollectionCheck.setSelection(false);
		}
	}
	private void updatePolicySetSelectedView(boolean bNewSelection){
		if (bNewSelection){
			if (oDynamicPanelLayout.topControl != oPolicySetSelectedPanel){
				oDynamicPanelLayout.topControl = oPolicySetSelectedPanel;
				oDynamicPanel.layout();
			}
		}
		oPolicySetNameText.setText(oSelectedPolicySet.getName());
		oDeletePolicySetButton.setEnabled(!(oSelectedPolicySet.eContainer() instanceof AuthorizableResource));
		oPolicyCombiningAlgorithmCombo.select(oPolicyCombiningAlgorithmCombo.indexOf(oSelectedPolicySet.getPolicyCombiningAlgorithm().getLiteral()));

		showErrorMessage(oSelectedPolicySet);
	}	
	private void updatePolicyRuleSelectedView(boolean bNewSelection){
		//bNewSelection : This boolean parameter states whether we had a new policy or rule selection from the main treeView.
		//bPolicyRuleUpdateALl : This boolean parameter states whether we need to update every single SWT on the page , when i swap from a rule to a policy and visa-versa.
		//System.out.println("----------------Updating whole panel----------------");
		if ((bIsRuleSelected && oSelectedRule == null)||(!bIsRuleSelected && oSelectedPolicy == null)){
			//System.out.println("Bad Selection");
			return;
		}
		if (bNewSelection){
			oDynamicPanelLayout.topControl = oPolicyRuleSelectedPanel;
			if (bPolicyRuleUpdateAll){
				if (bIsRuleSelected){
					oPolicyRuleSelectedPanel.setText("Rule Configuration");
					oPolicyRuleNameLabel.setText("Rule Name :");
					oRuleCombiningAlgorithmLabel.setText("Rule type :");
					oRuleCombiningAlgorithmTypeCombo.removeAll();
					for (int i=0 ; i< RuleType.values().length ; i++){
						oRuleCombiningAlgorithmTypeCombo.add(RuleType.get(i).getLiteral());
					}
					oNewPolicyRuleButton.setText("New Rule");
					oDeletePolicyRuleButton.setText("Delete Rule");
					oNewRuleButton.setEnabled(false);
					oActionsRuleStackLayout.topControl = lblAllowedActions;
					oActionsNewRuleComp.layout();
					oConditionListPanel.setText("Rule Conditions");
					oConditionConfigGroup.setText("Rule Condition Configuration");
				}else{
					oPolicyRuleSelectedPanel.setText("Policy Configuration");
					oPolicyRuleNameLabel.setText("Policy Name :");
					oRuleCombiningAlgorithmLabel.setText("Rule Combining Algorithm :");
					oRuleCombiningAlgorithmTypeCombo.removeAll();
					for (int i=0 ; i< CombiningAlgorithm.values().length ; i++){
						oRuleCombiningAlgorithmTypeCombo.add(CombiningAlgorithm.get(i).getLiteral());
					}
					oNewPolicyRuleButton.setText("New Policy");
					oDeletePolicyRuleButton.setText("Delete Policy");
					oActionsRuleStackLayout.topControl = oNewRuleButton;
					oActionsNewRuleComp.layout();
					oNewRuleButton.setEnabled(true);
					oConditionListPanel.setText("Apply Conditions");
					oConditionConfigGroup.setText("Apply Condition Configuration");
				}	
			}
			UpdateActionButtons(bIsRuleSelected);
			oDynamicPanel.layout();
		}
		//Update Basic Info
		//Action Buttons only update in a new selection
		if (bIsRuleSelected){
			oPolicyRuleNameText.setText(oSelectedRule.getName());
			oRuleCombiningAlgorithmTypeCombo.select(oSelectedRule.getRuleType().getValue());
			showErrorMessage(oSelectedRule);
		}else{
			oPolicyRuleNameText.setText(oSelectedPolicy.getName());
			oRuleCombiningAlgorithmTypeCombo.select(oSelectedPolicy.getRuleCombiningAlgorithm().getValue());
			showErrorMessage(oSelectedPolicy);
		}	
		//Update ConditionView
		updateConditionListView(bNewSelection);
		//Update Condition Configuration View
		updateConditionConfigurationView();	
		//Layout the controls , resizing for better looks
		oPolicyRulePanel.layout();
	}
	private void updateConditionListView(boolean bNewSelection){
		//System.out.println("----------------Updating List View------------------");
		//In case of a new selection, set the new input.
		if (bNewSelection){
			if (bIsRuleSelected){
				oConditionListViewer.setInput(oSelectedRule);
			}else{
				oConditionListViewer.setInput(oSelectedPolicy);
			}
		}
		oConditionListViewer.refresh();

		//Checks about enabling the list.
		if (bIsRuleSelected){
			oConditionList.setEnabled(!oSelectedRule.getHasAllowedAction().isEmpty());
		}else{
			if (oSelectedPolicy.getHasApplyCondition().isEmpty()){
				oConditionList.add("Policy has no apply condition, will always be evaluated.");
			}
			oConditionList.setEnabled(!oSelectedPolicy.getHasApplyCondition().isEmpty());
		}
		oConditionListPanel.update();

		//Sets the correct selection of the list, if it's not already selected.
		if (((IStructuredSelection) oConditionListViewer.getSelection()).getFirstElement() != oSelectedCondition ){
			if (oSelectedCondition == null){
				oConditionListViewer.setSelection(StructuredSelection.EMPTY);
			}else{
				oConditionListViewer.setSelection(new StructuredSelection(oSelectedCondition));
			}
		}

		//Check about enabling each button
		if (bIsRuleSelected){
			oNewConditionButton.setEnabled(!oSelectedRule.getHasAllowedAction().isEmpty());
			oDeleteConditionButton.setEnabled(!oSelectedRule.getHasAllowedAction().isEmpty() && oSelectedRule.getHasMatchCondition().size() > 1);
		}else{
			oNewConditionButton.setEnabled(true);
			oDeleteConditionButton.setEnabled(!oSelectedPolicy.getHasApplyCondition().isEmpty());
		}
	}	
	private void updateConditionConfigurationView(){
		//System.out.println("----------------Updating Config View----------------");
		//Check when to fully disable this view (group)
		showErrorMessage(oSelectedCondition);

		if (oSelectedCondition == null){
			recursiveSetEnabled(oConditionConfigGroup, false);
			clearConditionConfigPanel();
			return;
		}

		if (bIsRuleSelected){
			if (oSelectedRule.getHasAllowedAction().isEmpty()){
				recursiveSetEnabled(oConditionConfigGroup,false);
				clearConditionConfigPanel();
				return;
			}
		}
		oConditionConfigGroup.setEnabled(true);
		for (Control oControl : oConditionConfigGroup.getChildren()){
			if (oControl instanceof Label) oControl.setEnabled(true);
		}

		//Left Side Widgets
		oLeftSideCategoryViewer.refresh();
		oLeftSideResourceComboViewer.refresh();
		oLeftPropertyComboViewer.refresh();
		oLeftSideCategoryCombo.setEnabled(true);
		oLeftSideCategoryViewer.setSelection(new StructuredSelection(oSelectedCondition.getHasLeftSideOperand().getAttributeCategory()));
		if (oSelectedCondition.getHasLeftSideOperand().getIsAttributeExistingProperty() != null){
			//Left attribute is an existing property
			Resource propertyContainer = (Resource) oSelectedCondition.getHasLeftSideOperand().getIsAttributeExistingProperty().getAnnotatesProperty().eContainer();
			oLeftSideResourceCombo.setEnabled(true);
			oLeftSideResourceComboViewer.setSelection(new StructuredSelection(oSelectedCondition.getHasLeftSideOperand().getIsAttributeExistingProperty().getAnnotatesProperty().eContainer()));	
			oLeftResourceAsAttributeBtn.setEnabled(true);
			oLeftResourceAsAttributeBtn.setSelection(false);
			oLeftPropertyCombo.setEnabled(true);
			if (!propertyContainer.equals(oLeftPropertyComboViewer.getInput())){
				//Change the input only if necessary
				oLeftPropertyComboViewer.setInput(propertyContainer);	
			}
			oLeftPropertyComboViewer.setSelection(new StructuredSelection(oSelectedCondition.getHasLeftSideOperand().getIsAttributeExistingProperty().getAnnotatesProperty()));
			String isSet = (!oSelectedCondition.getHasLeftSideOperand().getIsAttributeExistingProperty().getAnnotatesProperty().isIsUnique()||oSelectedCondition.getHasLeftSideOperand().getAttributeCategory().equals(AttributeCategory.CHILD_RESOURCE))?"(Set)":"" ;
			oLeftTypeLabel.setText(isSet + oSelectedCondition.getHasLeftSideOperand().getIsAttributeExistingProperty().getAnnotatesProperty().getType());
		}else if (oSelectedCondition.getHasLeftSideOperand().getIsAttributeNewProperty() != null){
			//Left attribute is a new property
			Resource propertyContainer = oSelectedCondition.getHasLeftSideOperand().getIsAttributeNewProperty().getBelongsToResource().getAnnotatesResource();

			oLeftSideResourceCombo.setEnabled(true);

			oLeftSideResourceComboViewer.setSelection(new StructuredSelection(propertyContainer));

			oLeftResourceAsAttributeBtn.setEnabled(true);
			oLeftResourceAsAttributeBtn.setSelection(false);
			oLeftPropertyCombo.setEnabled(true);
			if (!propertyContainer.equals(oLeftPropertyComboViewer.getInput())){
				//Change the input only if necessary
				oLeftPropertyComboViewer.setInput(propertyContainer);	
			}

			oLeftPropertyComboViewer.setSelection(new StructuredSelection(oSelectedCondition.getHasLeftSideOperand().getIsAttributeNewProperty()));
			String isSet = (!oSelectedCondition.getHasLeftSideOperand().getIsAttributeNewProperty().isBIsUnique() ||oSelectedCondition.getHasLeftSideOperand().getAttributeCategory().equals(AttributeCategory.CHILD_RESOURCE))?"(Set)":"" ;
			oLeftTypeLabel.setText(isSet + oSelectedCondition.getHasLeftSideOperand().getIsAttributeNewProperty().getType());
		}else if (oSelectedCondition.getHasLeftSideOperand().getIsAttributeResource() != null){
			//Left attribute is a resource
			oLeftTypeLabel.setText("");
			oLeftSideResourceCombo.setEnabled(true);
			oLeftSideResourceComboViewer.setSelection(new StructuredSelection(oSelectedCondition.getHasLeftSideOperand().getIsAttributeResource().getAnnotatesResource()));	
			oLeftResourceAsAttributeBtn.setEnabled(true);
			oLeftResourceAsAttributeBtn.setSelection(true);
			oLeftPropertyCombo.setEnabled(false);
			oLeftPropertyComboViewer.setSelection(StructuredSelection.EMPTY);
		}else{
			//Left Attribute does not exists in model.
			if (!validCategoriesForResource(oSelectedResource, oSelectedCondition.getHasLeftSideOperand().getAttributeCategory())){
				oLeftSideResourceComboViewer.setSelection(StructuredSelection.EMPTY);
				oLeftSideResourceCombo.setEnabled(false);
			}else{
				oLeftSideResourceCombo.setEnabled(true);
			}
			if (((IStructuredSelection)oLeftSideResourceComboViewer.getSelection()).getFirstElement() != null){
				if (oLeftPropertyComboViewer.getInput() == null){
					oLeftPropertyComboViewer.setInput(((IStructuredSelection)oLeftSideResourceComboViewer.getSelection()).getFirstElement());
				}else{
					if (!oLeftPropertyComboViewer.getInput().equals(((IStructuredSelection)oLeftSideResourceComboViewer.getSelection()).getFirstElement())){
						oLeftPropertyComboViewer.setInput(((IStructuredSelection)oLeftSideResourceComboViewer.getSelection()).getFirstElement());
					}
				}
				oLeftPropertyCombo.setEnabled(true);
				oLeftResourceAsAttributeBtn.setEnabled(true);
				oLeftResourceAsAttributeBtn.setSelection(false);
			}else{
				oLeftResourceAsAttributeBtn.setEnabled(false);
				oLeftResourceAsAttributeBtn.setSelection(false);
				oLeftPropertyComboViewer.setInput(null);
				oLeftPropertyCombo.setEnabled(false);
			}
			oLeftPropertyComboViewer.setSelection(StructuredSelection.EMPTY);
			oLeftTypeLabel.setText("");
		}

		//Right Side Widgets
		oRightSideCategoryViewer.refresh();
		oRightSideResourceComboViewer.refresh();
		oRightPropertyComboViewer.refresh();
		if (hasAttr(oSelectedCondition.getHasLeftSideOperand()) && !oSelectedCondition.getOperator().equals(Operator.UNDEFINED)){
			oRightSideCategoryViewer.setSelection(new StructuredSelection(oSelectedCondition.getHasRightSideOperand().getAttributeCategory()));
			oRightSideCategoryCombo.setEnabled(true);
			if(oSelectedCondition.getHasRightSideOperand().getAttributeCategory().equals(AttributeCategory.CONSTANT)){
				//Constant values
				oRightSideResourceValueLayout.topControl = oRightValueComposite;
				oRightPropertyValuesLayout.topControl =	oConstantValuesList;
				oConstantValuesList.setItems((String[]) oSelectedCondition.getHasRightSideOperand().getValue().toArray());
				recursiveSetEnabled(oRightPropertyValuesComposite, true);
				recursiveSetEnabled(oRightSideResourceValueComposite, true);
				//Select if none is selected
				if (!oSelectedCondition.getHasRightSideOperand().getValue().isEmpty() && intSelectedValueIndex < 0){
					oConstantValuesList.select(0);
				}else{
					oConstantValuesList.select(intSelectedValueIndex);
				}
				//Determine when the new value button should be enabled
				if (oSelectedCondition.getOperator().equals(Operator.EQUAL) || oSelectedCondition.getOperator().equals(Operator.NOT_EQUAL) ){
					if (oSelectedCondition.getHasLeftSideOperand().getIsAttributeExistingProperty() != null) {
						if (!oSelectedCondition.getHasLeftSideOperand().getIsAttributeExistingProperty().getAnnotatesProperty().isIsUnique()||oSelectedCondition.getHasLeftSideOperand().getAttributeCategory().equals(AttributeCategory.CHILD_RESOURCE)){
							oNewValueButton.setEnabled(true);
						}else{
							oNewValueButton.setEnabled(oSelectedCondition.getHasRightSideOperand().getValue().isEmpty());
						}
					}else if (oSelectedCondition.getHasLeftSideOperand().getIsAttributeNewProperty() != null){
						if (!oSelectedCondition.getHasLeftSideOperand().getIsAttributeNewProperty().isBIsUnique()||oSelectedCondition.getHasLeftSideOperand().getAttributeCategory().equals(AttributeCategory.CHILD_RESOURCE)){
							oNewValueButton.setEnabled(true);
						}else{
							oNewValueButton.setEnabled(oSelectedCondition.getHasRightSideOperand().getValue().isEmpty());
						}
					}else{
						//Normaly i should not have constant values when i have a resource attribute
						oNewValueButton.setEnabled(false);
					}
				}else if (oSelectedCondition.getOperator().equals(Operator.SUBSET) || oSelectedCondition.getOperator().equals(Operator.NOT_SUBSET)|| oSelectedCondition.getOperator().equals(Operator.SET_CONTAINS)|| oSelectedCondition.getOperator().equals(Operator.SET_NOT_CONTAINS) ){
					oNewValueButton.setEnabled(true);
				}else{
					oNewValueButton.setEnabled(oSelectedCondition.getHasRightSideOperand().getValue().isEmpty());
				}
				oEditValueButton.setEnabled(oConstantValuesList.getSelectionIndex() != -1);
				oDeleteValueButton.setEnabled(oConstantValuesList.getSelectionIndex() != -1);
			}else{
				oConstantValuesList.deselectAll();
				oConstantValuesList.removeAll();
				oRightSideResourceValueLayout.topControl = oRightSideResourceCombo;
				oRightSideResourceComboViewer.refresh();
				if(oSelectedCondition.getHasRightSideOperand().getIsAttributeExistingProperty() != null){
					//Right attribute is an existing property
					//Resource propertyContainer = (Resource) oSelectedCondition.getHasRightSideOperand().getIsAttributeExistingProperty().getAnnotatesProperty().eContainer();
					oRightSideResourceComboViewer.setSelection(new StructuredSelection(oSelectedCondition.getHasRightSideOperand().getIsAttributeExistingProperty().getAnnotatesProperty().eContainer()));
					if (oRightPropertyComboViewer.getInput() == null){
						oRightPropertyComboViewer.setInput(oSelectedCondition.getHasRightSideOperand().getIsAttributeExistingProperty().getAnnotatesProperty().eContainer());
					}else{
						if (!oRightPropertyComboViewer.getInput().equals(oSelectedCondition.getHasRightSideOperand().getIsAttributeExistingProperty().getAnnotatesProperty().eContainer())){
							oRightPropertyComboViewer.setInput(oSelectedCondition.getHasRightSideOperand().getIsAttributeExistingProperty().getAnnotatesProperty().eContainer());
						}
					}
					oRightPropertyComboViewer.setSelection(new StructuredSelection(oSelectedCondition.getHasRightSideOperand().getIsAttributeExistingProperty().getAnnotatesProperty()));
					String isSet = (!oSelectedCondition.getHasRightSideOperand().getIsAttributeExistingProperty().getAnnotatesProperty().isIsUnique()||oSelectedCondition.getHasRightSideOperand().getAttributeCategory().equals(AttributeCategory.CHILD_RESOURCE))?"(Set)":"" ;
					oRightTypeLabel.setText(isSet + oSelectedCondition.getHasRightSideOperand().getIsAttributeExistingProperty().getAnnotatesProperty().getType());
					recursiveSetEnabled(oRightSideResourceValueComposite, true);
					recursiveSetEnabled(oRightPropertyValuesComposite, true);
				}else if(oSelectedCondition.getHasRightSideOperand().getIsAttributeNewProperty() != null){
					//Right attribute is a new Property
					//Resource propertyContainer = oSelectedCondition.getHasRightSideOperand().getIsAttributeNewProperty().getBelongsToResource().getAnnotatesResource();
					oRightSideResourceComboViewer.setSelection(new StructuredSelection(oSelectedCondition.getHasRightSideOperand().getIsAttributeNewProperty().getBelongsToResource().getAnnotatesResource()));
					if (oRightPropertyComboViewer.getInput() == null){
						oRightPropertyComboViewer.setInput(oSelectedCondition.getHasRightSideOperand().getIsAttributeNewProperty().getBelongsToResource().getAnnotatesResource());
					}else{
						if (!oRightPropertyComboViewer.getInput().equals(oSelectedCondition.getHasRightSideOperand().getIsAttributeNewProperty().getBelongsToResource().getAnnotatesResource())){
							oRightPropertyComboViewer.setInput(oSelectedCondition.getHasRightSideOperand().getIsAttributeNewProperty().getBelongsToResource().getAnnotatesResource());
						}
					}
					oRightPropertyComboViewer.setSelection(new StructuredSelection(oSelectedCondition.getHasRightSideOperand().getIsAttributeNewProperty()));
					String isSet = (!oSelectedCondition.getHasRightSideOperand().getIsAttributeNewProperty().isBIsUnique()||oSelectedCondition.getHasRightSideOperand().getAttributeCategory().equals(AttributeCategory.CHILD_RESOURCE))?"(Set)":"" ;
					oRightTypeLabel.setText(isSet + oSelectedCondition.getHasRightSideOperand().getIsAttributeNewProperty().getType());
					recursiveSetEnabled(oRightSideResourceValueComposite, true);
					recursiveSetEnabled(oRightPropertyValuesComposite, true);					
				}else if(oSelectedCondition.getHasRightSideOperand().getIsAttributeResource() != null){
					//Right attribute is a resource
					oRightTypeLabel.setText("");
					oRightSideResourceCombo.setEnabled(true);
					oRightSideResourceComboViewer.setSelection(new StructuredSelection(oSelectedCondition.getHasRightSideOperand().getIsAttributeResource().getAnnotatesResource()));
					oRightPropertyComboViewer.setInput(null);
					oRightPropertyCombo.setEnabled(false);				
				}else{
					//Right attribute doesn't exist
					recursiveSetEnabled(oRightSideResourceValueComposite, true);
					if (!validCategoriesForResource(oSelectedResource, oSelectedCondition.getHasRightSideOperand().getAttributeCategory())){
						oRightSideResourceComboViewer.setSelection(StructuredSelection.EMPTY);
						oRightSideResourceCombo.setEnabled(false);
					}else{
						oRightSideResourceCombo.setEnabled(true);
					}
					if (((IStructuredSelection)oRightSideResourceComboViewer.getSelection()).getFirstElement() != null){
						if (oRightPropertyComboViewer.getInput() == null){
							oRightPropertyComboViewer.setInput(((IStructuredSelection)oRightSideResourceComboViewer.getSelection()).getFirstElement());
						}else{
							if (!oRightPropertyComboViewer.getInput().equals(((IStructuredSelection)oRightSideResourceComboViewer.getSelection()).getFirstElement())){
								oRightPropertyComboViewer.setInput(((IStructuredSelection)oRightSideResourceComboViewer.getSelection()).getFirstElement());
							}
						}
						recursiveSetEnabled(oRightPropertyValuesComposite, oRightPropertyCombo.getItems().length != 0 );
					}else{
						oRightPropertyComboViewer.setInput(null);
						recursiveSetEnabled(oRightPropertyValuesComposite, false);
					}
					oRightPropertyComboViewer.setSelection(StructuredSelection.EMPTY);
					oRightTypeLabel.setText("");
				}
				oRightPropertyValuesLayout.topControl =	oRightPropertyCombo;	
			}		
			oRightSideResourceValueComposite.layout();
			oRightPropertyValuesComposite.layout();
		}else{
			oRightTypeLabel.setText("");
			oRightSideCategoryCombo.setEnabled(false);
			oRightSideResourceComboViewer.setSelection(StructuredSelection.EMPTY);
			oRightPropertyComboViewer.setSelection(StructuredSelection.EMPTY);
			oConstantValuesList.deselectAll();
			oConstantValuesList.removeAll();
			recursiveSetEnabled(oRightSideResourceValueComposite, false);
			recursiveSetEnabled(oRightPropertyValuesComposite, false);
		}

		//Operator Widgets
		oOperatorComboViewer.refresh();
		oOperatorComboViewer.setSelection(new StructuredSelection(oSelectedCondition.getOperator()));
		oOperatorCombo.setEnabled(hasAttr(oSelectedCondition.getHasLeftSideOperand()));

		oConditionConfigGroup.layout();
	}
	private void UpdateActionButtons(boolean bEnable){
		if (bEnable){
			if (oSelectedRule == null) return;

			boolean flag = false;
			CRUDActivity tempCrudActivity = null;
			btnGet.setVisible(bEnable);
			btnPut.setVisible(bEnable);
			btnPost.setVisible(bEnable);
			btnDelete.setVisible(bEnable);

			for (CRUDActivity oCrudActivity : oSelectedResource.getHasCRUDActivity()){
				if (oCrudActivity.getCRUDVerb().equals(CRUDVerb.READ)){
					tempCrudActivity = oCrudActivity;
					flag = true;
					break;
				}
			}
			btnGet.setEnabled(flag);
			flag = false;
			for (AllowedAction oAllowedAction : oSelectedRule.getHasAllowedAction()){
				if (oAllowedAction.getIsAllowedAction().getAnnotatesCRUDActivity().equals(tempCrudActivity)){
					flag = true;
					break;
				}
			}
			btnGet.setSelection(flag);

			//--------------------------------------------------------------------------------------------------------------
			flag = false;
			tempCrudActivity = null;
			for (CRUDActivity oCrudActivity : oSelectedResource.getHasCRUDActivity()){
				if (oCrudActivity.getCRUDVerb().equals(CRUDVerb.UPDATE)){
					tempCrudActivity = oCrudActivity;
					flag = true;
					break;
				}
			}
			btnPut.setEnabled(flag);
			flag = false;
			for (AllowedAction oAllowedAction : oSelectedRule.getHasAllowedAction()){
				if (oAllowedAction.getIsAllowedAction().getAnnotatesCRUDActivity().equals(tempCrudActivity)){
					flag = true;
					break;
				}
			}
			btnPut.setSelection(flag);

			//--------------------------------------------------------------------------------------------------------------
			flag = false;
			tempCrudActivity = null;
			for (CRUDActivity oCrudActivity : oSelectedResource.getHasCRUDActivity()){
				if (oCrudActivity.getCRUDVerb().equals(CRUDVerb.CREATE)){
					tempCrudActivity = oCrudActivity;
					flag = true;
					break;
				}
			}
			btnPost.setEnabled(flag);
			flag = false;
			for (AllowedAction oAllowedAction : oSelectedRule.getHasAllowedAction()){
				if (oAllowedAction.getIsAllowedAction().getAnnotatesCRUDActivity().equals(tempCrudActivity)){
					flag = true;
					break;
				}
			}
			btnPost.setSelection(flag);

			//--------------------------------------------------------------------------------------------------------------
			flag = false;
			tempCrudActivity = null;
			for (CRUDActivity oCrudActivity : oSelectedResource.getHasCRUDActivity()){
				if (oCrudActivity.getCRUDVerb().equals(CRUDVerb.DELETE)){
					tempCrudActivity = oCrudActivity;
					flag = true;
					break;
				}
			}
			btnDelete.setEnabled(flag);
			flag = false;
			for (AllowedAction oAllowedAction : oSelectedRule.getHasAllowedAction()){
				if (oAllowedAction.getIsAllowedAction().getAnnotatesCRUDActivity().equals(tempCrudActivity)){
					flag = true;
					break;
				}
			}
			btnDelete.setSelection(flag);

		}else{
			lblAllowedActions.setVisible(bEnable);
			btnGet.setEnabled(bEnable);
			btnGet.setVisible(bEnable);
			btnPut.setEnabled(bEnable);
			btnPut.setVisible(bEnable);
			btnPost.setEnabled(bEnable);
			btnPost.setVisible(bEnable);
			btnDelete.setEnabled(bEnable);
			btnDelete.setVisible(bEnable);	
		}
	}

	//Validation Methods. Only the first one should be called from code
	//Also invoke the update method of the treeViewer
	private boolean validate(AuthorizationLayerCIM.AnnotationModel oAnnotationModel){
		//System.out.println("Validating whole model.");
		this.oValidResourceMap = new HashMap<AuthorizableResource, Boolean>();
		this.oValidPolicySetMap = new HashMap<ResourceAccessPolicySet, Boolean>();
		this.oValidPolicyMap = new HashMap<ResourceAccessPolicy, Boolean>();
		this.oValidRuleMap = new HashMap<ResourceAccessRule, Boolean>();
		this.oValidConditionMap = new HashMap<Condition, Boolean>();

		for(Annotation oAnnotation : oAnnotationModel.getHasAnnotation()){
			if (oAnnotation instanceof AuthorizableResource){
				currentValidatingResource = ((AuthorizableResource)oAnnotation).getIsAuthorizableResource().getAnnotatesResource();
				validate((AuthorizableResource)oAnnotation);
			}
		}
		String error = null;
		for (Resource oResource : oRESTfulServiceCIM.getHasResources()){
			for (NewProperty oNewProperty : getNewPropertiesFromResource(oResource)){
				if (oNewProperty.getName().equals("")){
					error = "A new property must not have a blank name. Check " + oResource.getName() + " resource.";
					break;
				}
			}
		}
		currentValidatingResource = null;
		this.setPageComplete(!oValidResourceMap.containsValue(false) || (error == null));
		oErrorMessages.put(oAnnotationModel, error);
		//this.setPageComplete(true);
		return !oValidResourceMap.containsValue(false);
	}
	private boolean validate(AuthorizableResource oAuthorizableResource){
		//System.out.println("Validating " + oAuthorizableResource.getIsAuthorizableResource().getAnnotatesResource().getName() + "...");
		if (oAuthorizableResource.getHasResourceAccessPolicySet() == null){
			return false;
		}
		boolean result = validate(oAuthorizableResource.getHasResourceAccessPolicySet());
		oValidResourceMap.put(oAuthorizableResource, result);
		this.oABACLabelProvider.setValidResourceMap(oValidResourceMap);
		this.oTreeViewer.update(oAuthorizableResource,null);
		return result;
	}
	private boolean validate(ResourceAccessPolicySet oResourceAccessPolicySet){
		//System.out.println("Validating " + oResourceAccessPolicySet.getName() + "...");	
		boolean result = true;
		String errorMessage = "";

		if (oResourceAccessPolicySet.getHasResourceAccessPolicy().isEmpty() && oResourceAccessPolicySet.getHasResourceAccessPolicySet().isEmpty()){
			errorMessage += "A policy set must consist of at least one policy set or policy.\n";
			result = false;
		}
		for (ResourceAccessPolicySet childResourceAccessPolicySet : oResourceAccessPolicySet.getHasResourceAccessPolicySet()){
			if (!validate(childResourceAccessPolicySet) && result == true ){
				errorMessage += "One or more child policy sets are invalid.\n";
				result = false;
			}
		}
		for (ResourceAccessPolicy childResourceAccessPolicy : oResourceAccessPolicySet.getHasResourceAccessPolicy()){
			if (!validate(childResourceAccessPolicy) && result == true ){
				errorMessage += "One or more child policies are invalid.\n";
				result = false;
			}
		}
		oValidPolicySetMap.put(oResourceAccessPolicySet, result);
		this.oABACLabelProvider.setValidPolicySetMap(oValidPolicySetMap);
		this.oTreeViewer.update(oResourceAccessPolicySet,null);
		if (result) {
			errorMessage = null;
		}
		oErrorMessages.put(oResourceAccessPolicySet, errorMessage);
		return result;
	}
	private boolean validate(ResourceAccessPolicy oResourceAccessPolicy){
		//System.out.println("Validating " + oResourceAccessPolicy.getName() + "...");
		boolean result = true;
		String errorMessage = "";
		if (oResourceAccessPolicy.getHasResourceAccessRule().isEmpty()){
			errorMessage += "A policy must consist of at least one rule.\n";
			result = false;
		}
		for (ResourceAccessRule childResourceAccessRule : oResourceAccessPolicy.getHasResourceAccessRule()){
			if (!validate(childResourceAccessRule) && result == true){
				errorMessage += "One or more child rules are invalid.\n";
				result = false;
			}
		}
		for (Condition childCondition : oResourceAccessPolicy.getHasApplyCondition()){
			if (!validate(childCondition) && result == true){
				errorMessage += "One or more apply conditions are invalid(Invalid conditions are denoted with an INVALID prefix in the apply condition list).\n";
				result = false;
			}
		}
		oValidPolicyMap.put(oResourceAccessPolicy, result);
		this.oABACLabelProvider.setValidPolicyMap(oValidPolicyMap);
		this.oTreeViewer.update(oResourceAccessPolicy,null);
		if (result) {
			errorMessage = null;
		}
		oErrorMessages.put(oResourceAccessPolicy, errorMessage);
		return result;
	}
	private boolean validate(ResourceAccessRule oResourceAccessRule){
		//System.out.println("Validating " + oResourceAccessRule.getName() + "...");
		boolean result = true;
		String errorMessage = "";
		if (oResourceAccessRule.getHasAllowedAction().isEmpty()){
			errorMessage += "A rule must have at least one allowed action.\n";
			result = false;
		}
		if (oResourceAccessRule.getHasMatchCondition().isEmpty()){
			errorMessage += "A rule must consist of at least one match condition.\n";
			result = false;
		}
		for (Condition childCondition : oResourceAccessRule.getHasMatchCondition()){
			if ( !validate(childCondition) && result == true){
				errorMessage += "One or more match conditions are invalid (Invalid conditions are denoted with an INVALID prefix in the match condition list).\n";
				result = false;
			}
		}
		oValidRuleMap.put(oResourceAccessRule, result);
		this.oABACLabelProvider.setValidRuleMap(oValidRuleMap);
		this.oTreeViewer.update(oResourceAccessRule,null);
		if (result) {
			errorMessage = null;
		}
		oErrorMessages.put(oResourceAccessRule, errorMessage);
		return result;
	}
	private boolean validate(Condition oCondition){
		//System.out.println("Validating a Condition...");
		boolean result = hasAttr(oCondition.getHasLeftSideOperand()) &&
				!oCondition.getOperator().equals(Operator.UNDEFINED) &&
				(
						(hasAttr(oCondition.getHasRightSideOperand()) && oCondition.getHasRightSideOperand().getValue().isEmpty())
						||
						(!hasAttr(oCondition.getHasRightSideOperand()) && !oCondition.getHasRightSideOperand().getValue().isEmpty())
						);
		//if the result variable is true , it means that the condition has all the required elements filled, 
		//but also needs to check if the arguments themselves are valid
		if (!result){
			oValidConditionMap.put(oCondition, result);
			oConditionLabelProvider.setoValidConditionMap(oValidConditionMap);
			oErrorMessages.put(oCondition, "A condition must have both operands and an operator selected.");
			return result;
		}
		Condition oldSelectedCondition = oSelectedCondition;
		oSelectedCondition = oCondition;
		if (!(validCategoriesForResource(currentValidatingResource, oCondition.getHasRightSideOperand().getAttributeCategory()) && validCategoriesForResource(currentValidatingResource, oCondition.getHasLeftSideOperand().getAttributeCategory()))){
			oErrorMessages.put(oCondition, "A selected attribute category is not valid. Either select a new category, or change the rule's selected allowed actions.");
			result = false;
		}else if( !(validResourceBasedOnCategory(oCondition.getHasLeftSideOperand().getAttributeCategory(), getParentResourceFromAttribute(oCondition.getHasLeftSideOperand()))
				&& validResourceBasedOnCategory(oCondition.getHasRightSideOperand().getAttributeCategory(), getParentResourceFromAttribute(oCondition.getHasRightSideOperand()))))
		{
			oErrorMessages.put(oCondition, "A selected resource is not available for the selected attribute categories. Either select a new attribute category or a new resource.");
			result = false;
		}else{
			if (oCondition.getHasRightSideOperand().getIsAttributeExistingProperty() != null){
				result = validRightArgument(oCondition.getHasRightSideOperand().getAttributeCategory(),oCondition.getHasRightSideOperand().getIsAttributeExistingProperty().getAnnotatesProperty());		
			}
			if (oCondition.getHasRightSideOperand().getIsAttributeNewProperty() != null){
				result = validRightArgument(oCondition.getHasRightSideOperand().getAttributeCategory(),oCondition.getHasRightSideOperand().getIsAttributeNewProperty());		
			}
			if (oCondition.getHasRightSideOperand().getIsAttributeResource() != null){
				result = validRightArgument(oCondition.getHasRightSideOperand().getAttributeCategory(),oCondition.getHasRightSideOperand().getIsAttributeResource().getAnnotatesResource());		
			}	
		}

		oSelectedCondition = oldSelectedCondition;
		oValidConditionMap.put(oCondition, result);
		oConditionLabelProvider.setoValidConditionMap(oValidConditionMap);
		if (!result){
			oErrorMessages.put(oCondition, "The selected condition's expression is invalid.");
		}else{
			oErrorMessages.remove(oCondition);
		}
		return result;
	}

	private boolean validResourceBasedOnCategory(AttributeCategory attributeCategory, Resource parentResourceFromAttribute) {

		if(parentResourceFromAttribute == null) return true;

		switch (attributeCategory){
		case ACCESSED_RESOURCE:
			return parentResourceFromAttribute.equals(currentValidatingResource);
		case ACCESS_SUBJECT:
			return parentResourceFromAttribute.equals(oRESTfulServiceCIM.getHasResources().get(intAuthenticationResourceIndex));
		case CHILD_RESOURCE:
			for(Resource oResource : currentValidatingResource.getHasRelatedResource()){
				if(oResource.equals(parentResourceFromAttribute)){
					return true;
				}
			}
			if (currentValidatingResource.equals(this.oRESTfulServiceCIM.getHasResources().get(intAuthenticationResourceIndex))){
				if (getAuthResourceFromResource(parentResourceFromAttribute).isBTrackOwnership()){
					return true;
				}
			}
			return false;
		case CONSTANT:
			return true;
		case INCLUDED_RESOURCE:
			return parentResourceFromAttribute.equals(currentValidatingResource);
		case PARENT_RESOURCE:
			for(Resource oResource : currentValidatingResource.getIsRelatedResource()){
				if(oResource.equals(parentResourceFromAttribute)){
					return true;
				}
			}
			if(getAuthResourceFromResource(currentValidatingResource).isBTrackOwnership()){
				if(parentResourceFromAttribute.equals(oRESTfulServiceCIM.getHasResources().get(intAuthenticationResourceIndex))){
					return true;
				}
			}
			return false;
		default:
			return true;

		}

	}

	private boolean validRightArgument(Resource oParentResource,AttributeCategory oAttributeCategory) {
		if(oSelectedCondition == null || oParentResource == null) return false;
		if(!hasAttr(oSelectedCondition.getHasLeftSideOperand())) return false;
		if(oSelectedCondition.getOperator().equals(Operator.UNDEFINED)) return false;

		switch(oAttributeCategory){
		case ACCESSED_RESOURCE:
			return validRightArgument(oAttributeCategory,oParentResource);
		case ACCESS_SUBJECT:
			if (intAuthenticationResourceIndex != -1){
				return validRightArgument(oAttributeCategory,oRESTfulServiceCIM.getHasResources().get(intAuthenticationResourceIndex));
			}
			return false;
		case CHILD_RESOURCE:
			for(Resource oResource : oParentResource.getHasRelatedResource()){
				if (validRightArgument(oAttributeCategory,oResource)){
					return true;
				}
			}
			if (oParentResource.equals(this.oRESTfulServiceCIM.getHasResources().get(intAuthenticationResourceIndex))){
				for (Annotation oAnnotation : this.oInnerAuthorizationCIM.getHasAnnotation()){
					if (oAnnotation instanceof AuthorizableResource){
						AuthorizableResource oAuthorizableResource = (AuthorizableResource)oAnnotation;
						if (oAuthorizableResource.isBTrackOwnership()){
							if (validRightArgument(oAttributeCategory,oAuthorizableResource.getIsAuthorizableResource().getAnnotatesResource())){
								return true;
							}
						}
					}
				}
			}
			return false;
		case CONSTANT:
			return !(oSelectedCondition.getHasLeftSideOperand().getIsAttributeResource() != null);
		case INCLUDED_RESOURCE:
			return validRightArgument(oAttributeCategory,oParentResource);
		case PARENT_RESOURCE:
			for(Resource oResource : oParentResource.getIsRelatedResource()){
				if (validRightArgument(oAttributeCategory,oResource)){
					return true;
				}
			}
			if(getAuthResourceFromResource(oParentResource).isBTrackOwnership()){
				if (validRightArgument(oAttributeCategory, oRESTfulServiceCIM.getHasResources().get(intAuthenticationResourceIndex))){
					return true;
				}
			}
			return false;
		default:
			return false;		
		}		
	}	
	private boolean validRightArgument(AttributeCategory oAttributeCategory, Resource oResource) {
		if(oSelectedCondition == null) return false;
		if(!hasAttr(oSelectedCondition.getHasLeftSideOperand())) return false;
		if(oResource.isIsAlgorithmic()) return false;

		if (oSelectedCondition.getHasLeftSideOperand().getIsAttributeResource() != null){
			return oResource.equals(oSelectedCondition.getHasLeftSideOperand().getIsAttributeResource().getAnnotatesResource());
		}
		for (Property oProperty : oResource.getHasProperty()){
			if(validRightArgument(oAttributeCategory, oProperty)) return true;
		}
		for(NewProperty oNewProperty : getNewPropertiesFromResource(oResource)){
			if(validRightArgument(oAttributeCategory, oNewProperty)) return true;
		}
		return false;
	}	
	private boolean validRightArgument(AttributeCategory oAttributeCategory, Property oProperty){
		if(oSelectedCondition == null) return false;
		if(!hasAttr(oSelectedCondition.getHasLeftSideOperand())) return false;
		if(oSelectedCondition.getOperator().equals(Operator.UNDEFINED)) return false;
		//No support for sets inside other sets
		if(oAttributeCategory.equals(AttributeCategory.CHILD_RESOURCE) && !oProperty.isIsUnique()) return false;
		if (oSelectedCondition.getHasLeftSideOperand().getIsAttributeResource() != null) return false;

		boolean leftIsUnique;
		boolean rightIsUnique;
		String type ;

		if (oSelectedCondition.getHasLeftSideOperand().getIsAttributeExistingProperty() != null){
			Property oLeftProperty = oSelectedCondition.getHasLeftSideOperand().getIsAttributeExistingProperty().getAnnotatesProperty();
			type= oLeftProperty.getType();			
			leftIsUnique = oLeftProperty.isIsUnique() && !oSelectedCondition.getHasLeftSideOperand().getAttributeCategory().equals(AttributeCategory.CHILD_RESOURCE);
			rightIsUnique = oProperty.isIsUnique() && !oAttributeCategory.equals(AttributeCategory.CHILD_RESOURCE);
		}else{
			NewProperty oLeftProperty = oSelectedCondition.getHasLeftSideOperand().getIsAttributeNewProperty();
			type = oLeftProperty.getType();
			leftIsUnique = oLeftProperty.isBIsUnique() && !oSelectedCondition.getHasLeftSideOperand().getAttributeCategory().equals(AttributeCategory.CHILD_RESOURCE);
			rightIsUnique = oProperty.isIsUnique() && !oAttributeCategory.equals(AttributeCategory.CHILD_RESOURCE);
		}

		switch (oSelectedCondition.getOperator()){
		case EQUAL :
			if (bothNumerical(type, oProperty.getType())){
				return (leftIsUnique == rightIsUnique);
			}else{
				return (leftIsUnique == rightIsUnique && type.equalsIgnoreCase(oProperty.getType()));
			}		
		case GREATER_THAN:
			return bothNumerical(type, oProperty.getType());
		case GREATER_THAN_OR_EQUAL:
			return bothNumerical(type, oProperty.getType());
		case LESS_THAN:
			return bothNumerical(type, oProperty.getType());
		case LESS_THAN_OR_EQUAL:
			return bothNumerical(type, oProperty.getType());
		case NOT_EQUAL:
			if (bothNumerical(type, oProperty.getType())){
				return (leftIsUnique == rightIsUnique);
			}else{
				return (leftIsUnique == rightIsUnique && type.equalsIgnoreCase(oProperty.getType()));
			}
		case NOT_SUBSET:
			return !rightIsUnique && type.equalsIgnoreCase(oProperty.getType());
		case SET_CONTAINS:
			return !leftIsUnique && type.equalsIgnoreCase(oProperty.getType());
		case SET_NOT_CONTAINS:
			return !leftIsUnique && type.equalsIgnoreCase(oProperty.getType());
		case SUBSET:
			return !rightIsUnique && type.equalsIgnoreCase(oProperty.getType());
		default:
			break;
		}

		return false;
	}
	private boolean validRightArgument(AttributeCategory oAttributeCategory, NewProperty oProperty){
		if(oSelectedCondition == null) return false;
		if(!hasAttr(oSelectedCondition.getHasLeftSideOperand())) return false;
		if(oSelectedCondition.getOperator().equals(Operator.UNDEFINED)) return false;
		//No support for sets inside other sets
		if(oAttributeCategory.equals(AttributeCategory.CHILD_RESOURCE) && !oProperty.isBIsUnique()) return false;
		if (oSelectedCondition.getHasLeftSideOperand().getIsAttributeResource() != null) return false;

		boolean leftIsUnique;
		boolean rightIsUnique;
		String type ;

		if (oSelectedCondition.getHasLeftSideOperand().getIsAttributeExistingProperty() != null){
			Property oLeftProperty = oSelectedCondition.getHasLeftSideOperand().getIsAttributeExistingProperty().getAnnotatesProperty();
			type= oLeftProperty.getType();			
			leftIsUnique = oLeftProperty.isIsUnique() && !oSelectedCondition.getHasLeftSideOperand().getAttributeCategory().equals(AttributeCategory.CHILD_RESOURCE);
			rightIsUnique = oProperty.isBIsUnique() && !oAttributeCategory.equals(AttributeCategory.CHILD_RESOURCE);
		}else{
			NewProperty oLeftProperty = oSelectedCondition.getHasLeftSideOperand().getIsAttributeNewProperty();
			type = oLeftProperty.getType();
			leftIsUnique = oLeftProperty.isBIsUnique() && !oSelectedCondition.getHasLeftSideOperand().getAttributeCategory().equals(AttributeCategory.CHILD_RESOURCE);
			rightIsUnique = oProperty.isBIsUnique() && !oAttributeCategory.equals(AttributeCategory.CHILD_RESOURCE);
		}

		switch (oSelectedCondition.getOperator()){
		case EQUAL :
			if (bothNumerical(type, oProperty.getType())){
				return (leftIsUnique == rightIsUnique);
			}else{
				return (leftIsUnique == rightIsUnique && type.equalsIgnoreCase(oProperty.getType()));
			}		
		case GREATER_THAN:
			return bothNumerical(type, oProperty.getType());
		case GREATER_THAN_OR_EQUAL:
			return bothNumerical(type, oProperty.getType());
		case LESS_THAN:
			return bothNumerical(type, oProperty.getType());
		case LESS_THAN_OR_EQUAL:
			return bothNumerical(type, oProperty.getType());
		case NOT_EQUAL:
			if (bothNumerical(type, oProperty.getType())){
				return (leftIsUnique == rightIsUnique);
			}else{
				return (leftIsUnique == rightIsUnique && type.equalsIgnoreCase(oProperty.getType()));
			}
		case NOT_SUBSET:
			return !rightIsUnique && type.equalsIgnoreCase(oProperty.getType());
		case SET_CONTAINS:
			return !leftIsUnique && type.equalsIgnoreCase(oProperty.getType());
		case SET_NOT_CONTAINS:
			return !leftIsUnique && type.equalsIgnoreCase(oProperty.getType());
		case SUBSET:
			return !rightIsUnique && type.equalsIgnoreCase(oProperty.getType());
		default:
			break;
		}

		return false;
	}
	private boolean validRightArgument(AttributeCategory oAttributeCategory, EList<String> values){
		if(oSelectedCondition == null) return false;
		if(!hasAttr(oSelectedCondition.getHasLeftSideOperand())) return false;
		if(oSelectedCondition.getOperator().equals(Operator.UNDEFINED)) return false;
		boolean leftIsUnique;
		boolean rightIsUnique;


		if (oSelectedCondition.getHasLeftSideOperand().getIsAttributeExistingProperty() != null){
			Property oLeftProperty = oSelectedCondition.getHasLeftSideOperand().getIsAttributeExistingProperty().getAnnotatesProperty();
			leftIsUnique = oLeftProperty.isIsUnique() && !oSelectedCondition.getHasLeftSideOperand().getAttributeCategory().equals(AttributeCategory.CHILD_RESOURCE);
			rightIsUnique = values.size()==1;
		}else{
			NewProperty oLeftProperty = oSelectedCondition.getHasLeftSideOperand().getIsAttributeNewProperty();
			leftIsUnique = oLeftProperty.isBIsUnique() && !oSelectedCondition.getHasLeftSideOperand().getAttributeCategory().equals(AttributeCategory.CHILD_RESOURCE);
			rightIsUnique = values.size()==1;
		}

		switch (oSelectedCondition.getOperator()){
		case EQUAL :
			return (leftIsUnique == rightIsUnique);
		case GREATER_THAN:
			return true;
		case GREATER_THAN_OR_EQUAL:
			return true;
		case LESS_THAN:
			return true;
		case LESS_THAN_OR_EQUAL:
			return true;
		case NOT_EQUAL:
			return (leftIsUnique == rightIsUnique);
		case NOT_SUBSET:
			return true;
		case SET_CONTAINS:
			return true;
		case SET_NOT_CONTAINS:
			return true;
		case SUBSET:
			return true;
		case REGEX:
			return true;
		default:
			break;
		}
		return false;
	}

	private void showErrorMessage(EObject element){

		if (element != null){
			String error = null;
			if (element instanceof Condition && oErrorMessages.get(element) == null){
				error = oErrorMessages.get(element.eContainer());
			}else{
				error = oErrorMessages.get(element);
			}
			this.setErrorMessage(error);
		}
	}

	public void createABACAuthorizationCIM() {
		//Clears any previous values
		this.oAuthorizationCIM.getHasAnnotatedElement().clear();
		this.oAuthorizationCIM.getHasAnnotation().clear();

		//And saves the new Instance
		this.oAuthorizationCIM.getHasAnnotatedElement().addAll(oInnerAuthorizationCIM.getHasAnnotatedElement());
		this.oAuthorizationCIM.getHasAnnotation().addAll(oInnerAuthorizationCIM.getHasAnnotation());
	}

}