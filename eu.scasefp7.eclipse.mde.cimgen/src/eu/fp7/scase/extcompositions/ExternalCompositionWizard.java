package eu.fp7.scase.extcompositions;

import java.util.ArrayList;

import org.eclipse.jface.wizard.Wizard;

import eu.fp7.scase.cimGenerator.EcoreXMIExternalServiceLayerExtractor;
import eu.fp7.scase.inputParser.YamlResource;
import ServiceCIM.RESTfulServiceCIM;

public class ExternalCompositionWizard extends Wizard{
	
	private String strOutputFolder;
	private RESTfulServiceCIM oRESTfulServiceCIM;
	private ExternalServiceLayerCIM.AnnotationModel oExternalServiceLayerCIM;
	private ExternalCompositionWizardPage oExternalCompositionWizardPage;
	private ComplexDataTypeWizardPage oComplexDataTypeWizardPage;
	private boolean bReloadExistingModels;
	private SearchLayerCIM.AnnotationModel oSearchLayerCIM;
	private ArrayList<YamlResource> oYamlResourcesList;

	public ExternalCompositionWizard(String strOutputFolder, RESTfulServiceCIM oRESTfulServiceCIM, ExternalServiceLayerCIM.AnnotationModel oExternalServiceLayerCIM, SearchLayerCIM.AnnotationModel oParamSearchLayerCIM, boolean bReloadExistingModels, ArrayList<YamlResource> listOfYamlResources){
		super();
		this.oRESTfulServiceCIM = oRESTfulServiceCIM;
		this.oExternalServiceLayerCIM = oExternalServiceLayerCIM;
		this.strOutputFolder = strOutputFolder;
		this.setWindowTitle("External Service Composition Editor");
		this.bReloadExistingModels = bReloadExistingModels;
		this.oSearchLayerCIM = oParamSearchLayerCIM;
		this.oYamlResourcesList = listOfYamlResources;
	}
	
	@Override
	public void addPages(){

		this.oExternalCompositionWizardPage = new ExternalCompositionWizardPage(oRESTfulServiceCIM, this.oExternalServiceLayerCIM, this.oSearchLayerCIM, bReloadExistingModels, this.oYamlResourcesList);
		this.oComplexDataTypeWizardPage = new ComplexDataTypeWizardPage(oRESTfulServiceCIM, this.oExternalServiceLayerCIM, this.oSearchLayerCIM, this.oExternalCompositionWizardPage, bReloadExistingModels, this.oYamlResourcesList);
		this.oExternalCompositionWizardPage.setComplexDataTypeWizardPage(this.oComplexDataTypeWizardPage);
		this.addPage(this.oExternalCompositionWizardPage);
		this.addPage(oComplexDataTypeWizardPage);
	}
	
	@Override
	public boolean performFinish() {
		if(this.oExternalCompositionWizardPage.isPageComplete() && this.oComplexDataTypeWizardPage.isPageComplete()){
			return true;
		}
		return false;
	}
	
	public void createExternalServiceLayerCIM(){
		this.oExternalCompositionWizardPage.createExternalServiceLayerCIM();
		this.oComplexDataTypeWizardPage.createExternalServiceLayerCIM();
		
		//export the search CIM
		exportExternalServiceLayerCIM();
	}

	private void exportExternalServiceLayerCIM() {
		EcoreXMIExternalServiceLayerExtractor oEcoreXMIExternalServiceLayerExtractor= new EcoreXMIExternalServiceLayerExtractor(this.strOutputFolder + "/CIMModels/" + this.oRESTfulServiceCIM.getName() + "ExternalServiceLayerCIM.xmi", this.oRESTfulServiceCIM.getName());
		oEcoreXMIExternalServiceLayerExtractor.exportEcoreXMI(this.oExternalServiceLayerCIM);
	}
	
	public void exportExternalServiceLayerCIMBackUp(){
		EcoreXMIExternalServiceLayerExtractor oEcoreXMIExternalServiceLayerExtractor= new EcoreXMIExternalServiceLayerExtractor(this.strOutputFolder + "/CIMModels/BackUp/" + this.oRESTfulServiceCIM.getName() + "ExternalServiceLayerCIMBackUp.xmi", this.oRESTfulServiceCIM.getName());
		oEcoreXMIExternalServiceLayerExtractor.exportEcoreXMI(this.oExternalServiceLayerCIM);
	}
}