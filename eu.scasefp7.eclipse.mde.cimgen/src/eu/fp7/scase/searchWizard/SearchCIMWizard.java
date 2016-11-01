package eu.fp7.scase.searchWizard;

import org.eclipse.jface.wizard.Wizard;

import eu.fp7.scase.cimGenerator.EcoreXMISearchLayerExtractor;
import ServiceCIM.RESTfulServiceCIM;

public class SearchCIMWizard extends Wizard{

	private String strOutputFolder;
	private RESTfulServiceCIM oRESTfulServiceCIM;
	private AuthenticationLayerCIM.AnnotationModel oAuthenticationCIM;
	private SearchLayerCIM.AnnotationModel oSearchLayerCIM;
	private SearchCIMWizardPage oSearchCIMWizardPage;
	private boolean bReloadExistingModels;
	private int iMaxSearchResourcesAllowed;
	
	public SearchCIMWizard(String strOutputFolder, RESTfulServiceCIM oRESTfulServiceCIM, SearchLayerCIM.AnnotationModel oSearchLayerCIM, AuthenticationLayerCIM.AnnotationModel oAuthenticationCIM, int iMaxSearchResourcesAllowed, boolean bReloadExistingModels){
		super();
		this.setWindowTitle("Search DB Wizard");
		this.strOutputFolder = strOutputFolder;
		this.oRESTfulServiceCIM = oRESTfulServiceCIM;
		this.oAuthenticationCIM = oAuthenticationCIM;
		this.oSearchLayerCIM = oSearchLayerCIM;
		this.bReloadExistingModels = bReloadExistingModels;
		this.iMaxSearchResourcesAllowed = iMaxSearchResourcesAllowed;
	}
	
	@Override
	public void addPages() {
		this.oSearchCIMWizardPage = new SearchCIMWizardPage(strOutputFolder, oRESTfulServiceCIM, oSearchLayerCIM, oAuthenticationCIM, iMaxSearchResourcesAllowed, bReloadExistingModels);
		this.addPage(oSearchCIMWizardPage);
	}
	
	@Override
	public boolean performFinish() {
		if(this.oSearchCIMWizardPage.isPageComplete()){
			return true;
		}
		return false;
	}
	
	public SearchLayerCIM.AnnotationModel createSearchLayerCIM(){
		this.oSearchLayerCIM = this.oSearchCIMWizardPage.createSearchLayerCIM();
		
		//export the search CIM
		exportSearchLayerCIM();
		
		return this.oSearchLayerCIM;
	}
	
	private void exportSearchLayerCIM(){
		EcoreXMISearchLayerExtractor oEcoreXMISearchLayerExtractor = new EcoreXMISearchLayerExtractor(this.strOutputFolder + "/CIMModels/" + this.oRESTfulServiceCIM.getName() + "SearchLayerCIM.xmi", this.oRESTfulServiceCIM.getName());
		oEcoreXMISearchLayerExtractor.exportEcoreXMI(this.oSearchLayerCIM);
	}
	
	public void exportSearchLayerCIMBackUp(){
		//export a back up Search Layer CIM To support 2nd run logic
		EcoreXMISearchLayerExtractor oEcoreXMISearchLayerExtractor = new EcoreXMISearchLayerExtractor(this.strOutputFolder + "/CIMModels/BackUp/" + this.oRESTfulServiceCIM.getName() + "SearchLayerCIMBackUp.xmi", this.oRESTfulServiceCIM.getName());
		oEcoreXMISearchLayerExtractor.exportEcoreXMI(this.oSearchLayerCIM);
	}
	
}