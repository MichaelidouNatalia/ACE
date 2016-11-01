package eu.fp7.scase.DBMigratorWizard;

import org.eclipse.jface.wizard.Wizard;

import ServiceCIM.RESTfulServiceCIM;
import eu.fp7.scase.cimGenerator.EcoreXMIDBMigrationExtractor;

public class DBMigrationWizard extends Wizard{
	private DBMigratorWizardPage oDBMigratorWizardPage;
	private MDEMigratorCIMMetamodel.AnnotationModel oMDEMigratorCIM;
	private String strOutputFolder;
	private RESTfulServiceCIM oRESTfulServiceCIM;
	private boolean bReloadExistingModels;

	public DBMigrationWizard(String strOutputFolder, RESTfulServiceCIM oRESTfulServiceCIM, MDEMigratorCIMMetamodel.AnnotationModel oMDEMigratorCIM, boolean bReloadExistingModels) {
		super();
		this.setWindowTitle("DB Migrator Wizard");
		this.strOutputFolder = strOutputFolder;
		this.oRESTfulServiceCIM = oRESTfulServiceCIM;
		this.oMDEMigratorCIM = oMDEMigratorCIM;
		this.bReloadExistingModels = bReloadExistingModels;
	}

	@Override
	public void addPages() {
		this.oDBMigratorWizardPage = new DBMigratorWizardPage(strOutputFolder, oRESTfulServiceCIM, oMDEMigratorCIM, bReloadExistingModels);
		this.addPage(oDBMigratorWizardPage);
	}

	@Override
	public boolean performFinish() {
		if(this.oDBMigratorWizardPage.isPageComplete()){
			return true;
		}
		return false;
	}
	
	public void createDBMigrationCIM(){
		this.oDBMigratorWizardPage.createDBMigratorCIM();
		
		//export the produced authentication CIM
		exportDBMigrationCIMModel();
	}
	
	private void exportDBMigrationCIMModel(){
		EcoreXMIDBMigrationExtractor oEcoreXMIDBMigrationExtractor = new EcoreXMIDBMigrationExtractor(this.strOutputFolder + "/CIMModels/" + this.oRESTfulServiceCIM.getName() + "DBMigratorCIM.xmi", this.oRESTfulServiceCIM.getName());
		oEcoreXMIDBMigrationExtractor.exportEcoreXMI(oMDEMigratorCIM);
	}
	
	public void exportDBMigrationModelBackUp(){
		//export also to a backup file to support 2nd run logic
		EcoreXMIDBMigrationExtractor oEcoreXMIDBMigrationExtractor = new EcoreXMIDBMigrationExtractor(this.strOutputFolder + "/CIMModels/BackUp/" + this.oRESTfulServiceCIM.getName() + "MDEDBMigrationCIMBackUp.xmi", this.oRESTfulServiceCIM.getName());
		oEcoreXMIDBMigrationExtractor.exportEcoreXMI(oMDEMigratorCIM);
	}
}
