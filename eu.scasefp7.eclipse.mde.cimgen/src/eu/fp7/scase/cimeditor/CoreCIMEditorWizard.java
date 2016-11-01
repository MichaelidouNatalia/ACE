package eu.fp7.scase.cimeditor;

import org.eclipse.jface.wizard.Wizard;

import ServiceCIM.RESTfulServiceCIM;

public class CoreCIMEditorWizard extends Wizard{
	
	private RESTfulServiceCIM oRESTfulServiceCIM;
	private CoreCIMEditorWizardPage oCoreCIMEditorWizardPage;
	private boolean bExecuteFromScratchYaml;
	private int intMinAlgoResourcesRequired;

	public CoreCIMEditorWizard(String strOutputFolder, RESTfulServiceCIM oRESTfulServiceCIM, int intMinAlgoResourcesRequired, boolean bExecuteFromScratchYaml){
		super();
		this.oRESTfulServiceCIM = oRESTfulServiceCIM;
		this.setWindowTitle(this.oRESTfulServiceCIM.getName() + " CIM Editor");
		this.bExecuteFromScratchYaml = bExecuteFromScratchYaml;
		this.intMinAlgoResourcesRequired = intMinAlgoResourcesRequired;
	}
	
	@Override
	public void addPages(){
		this.oCoreCIMEditorWizardPage = new CoreCIMEditorWizardPage(oRESTfulServiceCIM, this.intMinAlgoResourcesRequired, bExecuteFromScratchYaml);
		this.addPage(this.oCoreCIMEditorWizardPage);
	}
	
	@Override
	public boolean performFinish() {
		if(this.oCoreCIMEditorWizardPage.isPageComplete()){
			return true;
		}
		return false;
	}
	
	public RESTfulServiceCIM updateCIM(){
		
		return this.oRESTfulServiceCIM;
	}
}