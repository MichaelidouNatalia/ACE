package eu.fp7.scase.extcompositions;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;

public class SimpleDialogBox extends Dialog{

	private Label oMessageLabel;
	private Text oInputText;
	
	private String strArtefactName;
	private String strArtefactType;
	private Shell oParentShell;
	private String strInitialArtefactName;
	
	public SimpleDialogBox(Shell parent, String strArtefactType, String strInitialArtefactName) {
		super(parent);
		this.strInitialArtefactName = strInitialArtefactName;
		this.strArtefactName = this.strInitialArtefactName;
		this.oParentShell = parent;
		oParentShell.setLayout(new GridLayout(2, false));
		oParentShell.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		this.strArtefactType = strArtefactType;
	}

	private Point getCenterPoint() {
		Shell parentShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		Rectangle shellBounds = parentShell.getBounds();
		return new Point(shellBounds.x + shellBounds.width / 2, shellBounds.y + shellBounds.height / 2);
	}

	@Override
	protected Point getInitialLocation(Point initialSize) {
		Point shellCenter = getCenterPoint();
		return new Point(shellCenter.x - initialSize.x / 2, shellCenter.y - initialSize.y / 2);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		oMessageLabel = new Label(container, SWT.NONE);
		oMessageLabel.setText("Enter the name of the new " +  this.strArtefactType + ": ");
		
		oInputText = new Text(container, SWT.None);
		oInputText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		oInputText.setText(strInitialArtefactName);
		
		addInputTextListener();
		
	    return container;
	}
	
	private void addInputTextListener() {
		this.oInputText.addModifyListener(new ModifyListener(){

			@Override
			public void modifyText(ModifyEvent e) {
				if(!oInputText.getText().isEmpty()){
					strArtefactName = oInputText.getText();
				}
				else{
					strArtefactName = strInitialArtefactName;
				}
			}
		});
	}

	public String getArtefactName(){
		return this.strArtefactName;
	}
	
}