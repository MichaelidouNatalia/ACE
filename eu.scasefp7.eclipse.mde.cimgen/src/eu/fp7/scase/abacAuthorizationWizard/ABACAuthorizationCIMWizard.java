package eu.fp7.scase.abacAuthorizationWizard;
import org.eclipse.jface.wizard.Wizard;

import ServiceCIM.RESTfulServiceCIM;
import eu.fp7.scase.cimGenerator.EcoreXMIABACAuthorizationExtractor;

public class ABACAuthorizationCIMWizard extends Wizard {

	private ABACWizardPage oABACWizardPage;
	AuthorizationLayerCIM.AnnotationModel oAuthorizationCIM;
	AuthenticationLayerCIM.AnnotationModel oAuthenticationCIM;
	private String strOutputFolder;
	private RESTfulServiceCIM oRESTfulServiceCIM;
	private boolean bReloadExistingModels;

	public ABACAuthorizationCIMWizard(String strOutputFolder, RESTfulServiceCIM oRESTfulServiceCIM,
			AuthorizationLayerCIM.AnnotationModel oAuthorizationCIM, AuthenticationLayerCIM.AnnotationModel oAuthenticationCIM, boolean bReloadExistingModels) {
		super();
		this.setWindowTitle("ABAC Authorization Wizard");
		
		this.strOutputFolder = strOutputFolder;
		this.oRESTfulServiceCIM = oRESTfulServiceCIM;
		this.oAuthorizationCIM = oAuthorizationCIM;
		this.oAuthenticationCIM = oAuthenticationCIM;
		this.bReloadExistingModels = bReloadExistingModels;
	}

	@Override
	public void addPages() {
		oABACWizardPage = new ABACWizardPage(strOutputFolder, oRESTfulServiceCIM, oAuthorizationCIM, oAuthenticationCIM, bReloadExistingModels);
		addPage(oABACWizardPage);
	}

	@Override
	public boolean performFinish() {
		return this.oABACWizardPage.isPageComplete();
	}

	public void createABACAuthorizationCIM() {
		this.oABACWizardPage.createABACAuthorizationCIM();
		
		//export the produced authorization CIM
		exportABACAuthorizationCIM();
	}

	public void exportABACAuthorizationCIM() {
		EcoreXMIABACAuthorizationExtractor oEcoreXMIABACAuthorizationExtractor = new EcoreXMIABACAuthorizationExtractor(this.strOutputFolder + "/CIMModels/" + this.oRESTfulServiceCIM.getName() + "ABACAuthorizationCIM.xmi", this.oRESTfulServiceCIM.getName());
		oEcoreXMIABACAuthorizationExtractor.exportEcoreXMI(oAuthorizationCIM);
	}
	
	public void exportABACAuthorizationCIMBackUp() {
		//export also to a backup file to support 2nd run logic
		EcoreXMIABACAuthorizationExtractor oEcoreXMIABACAuthorizationExtractor = new EcoreXMIABACAuthorizationExtractor(this.strOutputFolder + "/CIMModels/BackUp/" + this.oRESTfulServiceCIM.getName() + "ABACAuthorizationCIMBackUp.xmi", this.oRESTfulServiceCIM.getName());
		oEcoreXMIABACAuthorizationExtractor.exportEcoreXMI(oAuthorizationCIM);		
	}

}
