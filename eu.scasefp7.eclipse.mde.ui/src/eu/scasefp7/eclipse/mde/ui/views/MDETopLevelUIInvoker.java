package eu.scasefp7.eclipse.mde.ui.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;



public class MDETopLevelUIInvoker extends ViewPart {

	public static final String ID = "eu.scasefp7.eclipse.mde.ui.views.MDETopLevelUIInvoker";

	private MDETopLevelUI oMDETopLevelUI;

	public MDETopLevelUIInvoker() {
	}

	public void setFocus() {
		oMDETopLevelUI.setFocus();
	}

	@Override
	public void createPartControl(Composite parent) {
		oMDETopLevelUI = new MDETopLevelUI(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
	}
}