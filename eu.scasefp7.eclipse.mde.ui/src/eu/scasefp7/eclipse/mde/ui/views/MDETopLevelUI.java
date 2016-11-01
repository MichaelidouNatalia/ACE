package eu.scasefp7.eclipse.mde.ui.views;


import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.services.IServiceLocator;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.ui.*;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;


/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

public class MDETopLevelUI extends ScrolledComposite {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "eu.scasefp7.eclipse.mde.ui.views.MDETopLevelUI";
	private Composite oMDEUIGrid;
	
	//input yaml file SWTs
	private Label oYamlFileLabel;
	private Text  oInputModelFolder;
	private Composite oYamlFileGrid;
	private Button oBrowseYamlFileButton;
	
	//MDE output SWTs
	private Label oMDEOutputLabel;
	private Text  oMDEOutputText;
	private Composite oMDEOutputGrid;
	private Button oBrowseMDEOutputButton;
	private Composite oDatabaseTypeGrid;
	private Label oDatabaseTypeLabel;
	private List oCSSTypeList;
	
	//One button 2D-MDE SWTs
	private Composite oMDEGrid;
	private Button oGenerateCodeButton;
	
	
	//2D MDE variables

	private Composite composite;
	private Label lblProjectName;
	private Text oProjectName;
	
	/**
	 * The constructor.
	 */
	public MDETopLevelUI(Composite parent, int style) {
		super(parent, style);
		initializeMDEUIGrids();
		initializeAllUIWidgets();
		initializeUILayout();
//		this.oMDEOutputText.setText("/Users/IMG/Desktop/Dropbox/S-CASE-Int/Work/WP2/Task_2.2-2.3/MDEModelToModelTransformations/MDEArtefacts");
		this.oCSSTypeList.select(0);
	}

	private void initializeUILayout() {
		this.oMDEUIGrid.setSize(new Point(480, 640));
		this.oMDEUIGrid.layout();
	}

	private void initializeAllUIWidgets() {

		//initialize yaml file SWTs
		oYamlFileLabel = new Label(this.oYamlFileGrid, SWT.NULL);
		oYamlFileLabel.setText("Select input service model: ");
		oInputModelFolder = new Text(this.oYamlFileGrid, SWT.BORDER | SWT.RIGHT);
		GridData gd_oInputModelFolder = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_oInputModelFolder.widthHint = 129;
		oInputModelFolder.setLayoutData(gd_oInputModelFolder);
		oInputModelFolder.setText("");
		oBrowseYamlFileButton = new Button(this.oYamlFileGrid, SWT.NONE);
		oBrowseYamlFileButton.setText("Browse");
		addBrowseYamlFileButtonListener();
		
		//initialize MDE output SWTs
		oMDEOutputLabel = new Label(this.oMDEOutputGrid, SWT.NULL);
		oMDEOutputLabel.setText("Output folder: ");
		oMDEOutputText = new Text(this.oMDEOutputGrid, SWT.SINGLE | SWT.BORDER);
		GridData gd_oMDEOutputText = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_oMDEOutputText.widthHint = 153;
		oMDEOutputText.setLayoutData(gd_oMDEOutputText);
		oMDEOutputText.setText("");
		oBrowseMDEOutputButton = new Button(this.oMDEOutputGrid, SWT.NONE);
		oBrowseMDEOutputButton.setText("Browse");
		addBrowseMDEOutputButtonListener();
		this.oDatabaseTypeLabel = new Label(this.oDatabaseTypeGrid, SWT.NULL);
		this.oDatabaseTypeLabel.setText("Select CSS:");
		this.oCSSTypeList = new List(this.oDatabaseTypeGrid, SWT.V_SCROLL);
		oCSSTypeList.setItems(new String[] {"Default", "Vision Impaired"});
		oCSSTypeList.select(1);
		
		//initialize One button 2D-MDE SWTs
		oGenerateCodeButton = new Button(this.oMDEGrid, SWT.NONE);
		oGenerateCodeButton.setText("Generate Code");
		addGenerateCodeButtonListener();
		
	}

	private void addStartFromScratchButtonListener() {
	}

	private void addGenerateCodeButtonListener() {
		this.oGenerateCodeButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				try {
					if(validateInputPreferences()){
						//get Core MDE preferences from the UI
						Map<String, String> MDEPreferences = new HashMap<String, String>();
						MDEPreferences = getCoreMDEPreferences(MDEPreferences);

						//generate the Core CIM and its extensions plugin
//				if(createCIMModels(MDEPreferences) == false){ //if user canceled, abort)
//					return;
//				}
						
						//execute all the Model-To-Model transformations plugin
//				executeModelToModelTransformations(MDEPreferences);
						
						//create annotation stack
				createAnnotationStack(MDEPreferences);
						
						//execute the code generation plugin
						executeModelToTextTransformation(MDEPreferences);
					}
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
	
	private void createAnnotationStack(Map<String, String> mapMDEPreferences){
		IServiceLocator serviceLocator = PlatformUI.getWorkbench();
		ICommandService commandService = (ICommandService) serviceLocator.getService(ICommandService.class);
		try {
			Command command = commandService.getCommand("AnnotationStackPopulator.commands.PopulateAnnotationStack");
			command.executeWithChecks(new ExecutionEvent(command, mapMDEPreferences, null, null));
		} catch (ExecutionException | NotDefinedException | NotEnabledException | NotHandledException e) {
			e.printStackTrace();
		}
	}
	
	private void executeModelToTextTransformation(Map<String, String> mapMDEPreferences){
		IServiceLocator serviceLocator = PlatformUI.getWorkbench();
		ICommandService commandService = (ICommandService) serviceLocator.getService(ICommandService.class);
		try {
			Command command = commandService.getCommand("eu.scasefp7.eclipse.mde.m2t.commands.executeModelToTextTransformation");
			command.executeWithChecks(new ExecutionEvent(command, mapMDEPreferences, null, null));
		} catch (ExecutionException | NotDefinedException | NotEnabledException | NotHandledException e) {
			e.printStackTrace();
		}
	}
	
	private Map<String, String> getCoreMDEPreferences(Map<String, String> mapMDEPreferences){
		
		mapMDEPreferences.put("MDEOutputFolder", this.oInputModelFolder.getText());
		mapMDEPreferences.put("WebServiceName", this.oProjectName.getText());
		mapMDEPreferences.put("YamlFilePath", this.oInputModelFolder.getText());
		mapMDEPreferences.put("CSSSelection", this.oCSSTypeList.getSelection()[0]);
		return mapMDEPreferences;
	}
	
	private boolean validateInputPreferences() throws ExecutionException{
		if( (oInputModelFolder.getText().isEmpty())        ||
			oMDEOutputText.getText().isEmpty()        ||
			oCSSTypeList.getSelectionIndex() == -1){
			return false;
		}
		
		return true;
	}

	private void addBrowseMDEOutputButtonListener() {
		this.oBrowseMDEOutputButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				DirectoryDialog oDirectoryDialog = new DirectoryDialog(new Shell(), SWT.OPEN);
				oMDEOutputText.setText(oDirectoryDialog.open());
			}
		});
	}

	private void addBrowseYamlFileButtonListener() {
		this.oBrowseYamlFileButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				DirectoryDialog oDirectoryDialog = new DirectoryDialog(new Shell(), SWT.OPEN);
				oInputModelFolder.setText(oDirectoryDialog.open());
			}
		});
	}

	private void initializeMDEUIGrids() {
		oMDEUIGrid = new Composite(this, SWT.NONE);

		//input yaml file SWTs
		oYamlFileGrid = new Composite(this.oMDEUIGrid, SWT.NONE);
		GridData gd_oYamlFileGrid = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_oYamlFileGrid.heightHint = 40;
		oYamlFileGrid.setLayoutData(gd_oYamlFileGrid);
		oYamlFileGrid.setLayout(new GridLayout(3, false));
		
		//MDE output SWTs
		oMDEOutputGrid = new Composite(this.oMDEUIGrid, SWT.NONE);
		oMDEOutputGrid.setLayout(new GridLayout(3, false));
		
		composite = new Composite(oMDEUIGrid, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));
		
		lblProjectName = new Label(composite, SWT.NONE);
		lblProjectName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblProjectName.setText("Project Name: ");
		
		oProjectName = new Text(composite, SWT.BORDER);
		oProjectName.setText("");
		GridData gd_oProjectName = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_oProjectName.widthHint = 153;
		oProjectName.setLayoutData(gd_oProjectName);
		
		this.oDatabaseTypeGrid = new Composite(this.oMDEUIGrid, SWT.None);
		this.oDatabaseTypeGrid.setLayout(new GridLayout(2, false));
		
		oMDEGrid = new Composite(this.oMDEUIGrid, SWT.NONE);
		oMDEGrid.setLayout(new GridLayout(1, false));
		
		setLayoutData(new GridData(GridData.FILL_BOTH));
		setContent(oMDEUIGrid);
		oMDEUIGrid.setLayoutData(new GridData());
		oMDEUIGrid.setLayout(new GridLayout(1, false));
	}
	
	public static void main(String[] args) {
		Shell shell = new Shell();
		shell.setLayout(new FillLayout());
		shell.setSize(850, 500);
		final Display display = shell.getDisplay();
		final MDETopLevelUI widget = new MDETopLevelUI(shell, SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		widget.setSize(850, 500);
		shell.open();
		while (!shell.isDisposed())
			if (!display.readAndDispatch())
				display.sleep();
	}
}