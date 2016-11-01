package eu.fp7.scase.extcompositions;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import ExternalServiceLayerCIM.AnnAlgoResource;
import ExternalServiceLayerCIM.AnnotationModel;
import ExternalServiceLayerCIM.ComplexType;
import ExternalServiceLayerCIM.ComplexTypeProperty;
import ExternalServiceLayerCIM.ExternalServiceLayerCIMFactory;
import ExternalServiceLayerCIM.InputDataModel;
import ExternalServiceLayerCIM.ModelProperty;
import ExternalServiceLayerCIM.OutputDataModel;
import ExternalServiceLayerCIM.QueryParam;
import ExternalServiceLayerCIM.RESTClientResource;
import ExternalServiceLayerCIM.Representation;
import ExternalServiceLayerCIM.TargetRESTService;
import ServiceCIM.RESTfulServiceCIM;
import ServiceCIM.Resource;
import eu.fp7.scase.inputParser.YamlResource;
import eu.fp7.scase.launcher.cimgenerator.Activator;

public class ExternalCompositionInputParser {
	
	private ArrayList<YamlResource> oYamlResourceList;
	private AnnotationModel oExternalServiceLayerCIM;
	private RESTfulServiceCIM oRESTfulServiceCIM;
	private ExternalServiceLayerCIMFactory oExternalServiceLayerCIMFactory;

	public ExternalCompositionInputParser(ArrayList<YamlResource> listOfYamlResources, AnnotationModel oExternalServiceLayerCIM, RESTfulServiceCIM oRESTfulServiceCIM) {
		this.oYamlResourceList = listOfYamlResources;
		this.oExternalServiceLayerCIM = oExternalServiceLayerCIM;
		this.oRESTfulServiceCIM = oRESTfulServiceCIM;
		this.oExternalServiceLayerCIMFactory = ExternalServiceLayerCIMFactory.eINSTANCE;
	}

	public void instantiateExternalCompositionsCIM() {
		YamlToString();
		createRESTfulClients();
		System.out.println("Attempting to load external composition to RESTfulClient resources.");
		for(int n = 0; n < this.oExternalServiceLayerCIM.getHasAnnotation().size(); n++){
			System.out.println("Checking " + n + " annotation for RESTClientResource instance");
			if(this.oExternalServiceLayerCIM.getHasAnnotation().get(n) instanceof RESTClientResource){
				System.out.println("RESTClientResource instance found! ");
				RESTClientResource oRESTClientResource = (RESTClientResource) this.oExternalServiceLayerCIM.getHasAnnotation().get(n);
				for(int i = 0; i < this.oYamlResourceList.size(); i++){
					System.out.println("Chekcing if " + this.oYamlResourceList.get(i).getName() + " is the corresponding YAMLResource");
					System.out.println("The corresponding RESTClientResource has name " + oRESTClientResource.getIsRESTClientResource().getAnnotatesAlgoResource().getName());
					if(this.oYamlResourceList.get(i).getName().equalsIgnoreCase(oRESTClientResource.getIsRESTClientResource().getAnnotatesAlgoResource().getName())){
						System.out.println("Loading RESTfulClient form YAMLResource " + this.oYamlResourceList.get(i).getName());
						populateRESTClient((RESTClientResource) this.oExternalServiceLayerCIM.getHasAnnotation().get(n), this.oYamlResourceList.get(i));
					}
				}
			}
		}
		ExternalCIMToString();
	}

	private void populateRESTClient(RESTClientResource oRESTClientResource, YamlResource oYAMLResource) {
		populateRESTClientComplexTypes(oRESTClientResource, oYAMLResource);
		populateTargetServiceInput(oRESTClientResource, oYAMLResource);
		populateRESTClientInput(oRESTClientResource, oYAMLResource);
		populateRESTClientOutput(oRESTClientResource, oYAMLResource);
	}

	private void populateRESTClientComplexTypes(RESTClientResource oRESTClientResource, YamlResource oYAMLResource) {
		for(int n = 0; n < oYAMLResource.getTargetServiceComplexTypes().size(); n++){
			ComplexType oComplexType = this.oExternalServiceLayerCIMFactory.createComplexType();
			oComplexType.setComplexTypeName(oYAMLResource.getTargetServiceComplexTypes().get(n).getComplexTypeName());
			//create complex type properties
			for(int i = 0; i < oYAMLResource.getTargetServiceComplexTypes().get(n).getComplexTypeProperties().size(); i++){
				ComplexTypeProperty oComplexTypeProperty = this.oExternalServiceLayerCIMFactory.createComplexTypeProperty();
				oComplexTypeProperty.setName(oYAMLResource.getTargetServiceComplexTypes().get(n).getComplexTypeProperties().get(i).getName());
				oComplexTypeProperty.setType(oYAMLResource.getTargetServiceComplexTypes().get(n).getComplexTypeProperties().get(i).getType().equalsIgnoreCase("Object") ? oYAMLResource.getTargetServiceComplexTypes().get(n).getComplexTypeProperties().get(i).getTypeRef() : oYAMLResource.getTargetServiceComplexTypes().get(n).getComplexTypeProperties().get(i).getType());
				oComplexTypeProperty.setIsUnique(oYAMLResource.getTargetServiceComplexTypes().get(n).getComplexTypeProperties().get(i).Unique.equalsIgnoreCase("true") ? true : false);
				oComplexTypeProperty.setHasPrimitiveType(oYAMLResource.getTargetServiceComplexTypes().get(n).getComplexTypeProperties().get(i).getType().equalsIgnoreCase("Object") ? false : true);
				oComplexType.getHasComplexTypeProperties().add(oComplexTypeProperty);
			}
			
			oRESTClientResource.getIsRESTClientComplexType().add(oComplexType);
		}
		
		fixComplexTypeReferences(oRESTClientResource, oYAMLResource);
	}

	private void fixComplexTypeReferences(RESTClientResource oRESTClientResource, YamlResource oYAMLResource) {
		for(int n = 0; n < oRESTClientResource.getIsRESTClientComplexType().size(); n++){
			for(int j = 0; j < oYAMLResource.getTargetServiceComplexTypes().size(); j++){
				if(oRESTClientResource.getIsRESTClientComplexType().get(n).getComplexTypeName().equalsIgnoreCase(oYAMLResource.getTargetServiceComplexTypes().get(j).getComplexTypeName())){
					for(int i = 0; i < oRESTClientResource.getIsRESTClientComplexType().get(n).getHasComplexTypeProperties().size(); i++){
						if(oRESTClientResource.getIsRESTClientComplexType().get(n).getHasComplexTypeProperties().get(i).isHasPrimitiveType() == false){
							for(int yamlPropertyIndex = 0; yamlPropertyIndex < oYAMLResource.getTargetServiceComplexTypes().get(j).getComplexTypeProperties().size(); yamlPropertyIndex++){
								if(oRESTClientResource.getIsRESTClientComplexType().get(n).getHasComplexTypeProperties().get(i).getName().equalsIgnoreCase(oYAMLResource.getTargetServiceComplexTypes().get(j).getComplexTypeProperties().get(yamlPropertyIndex).getName())){
									for(int complexTypeIndex = 0; complexTypeIndex < oRESTClientResource.getIsRESTClientComplexType().size(); complexTypeIndex++){
										if(oRESTClientResource.getIsRESTClientComplexType().get(complexTypeIndex).getComplexTypeName().equalsIgnoreCase(oYAMLResource.getTargetServiceComplexTypes().get(j).getComplexTypeProperties().get(yamlPropertyIndex).getTypeRef())){
											oRESTClientResource.getIsRESTClientComplexType().get(n).getHasComplexTypeProperties().get(i).setPropertyHasComplexType(oRESTClientResource.getIsRESTClientComplexType().get(complexTypeIndex));
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	private void populateRESTClientOutput(RESTClientResource oRESTClientResource, YamlResource oYAMLResource) {
		//check if this resource has any output data
		if(oYAMLResource.getTargetServiceOutputProperties() != null && !oYAMLResource.getTargetServiceOutputProperties().isEmpty()){
			//create a new output data model
			OutputDataModel oOutputDataModel = oExternalServiceLayerCIMFactory.createOutputDataModel();

			//create the input representation
			Representation oRepresentation = oExternalServiceLayerCIMFactory.createRepresentation();
			oRepresentation.setName("APPLICATION_" + oYAMLResource.getTargetServiceResponseType().toUpperCase());
			oOutputDataModel.setHasOutputRepresentation(oRepresentation);
			
			//create any output properties
			for(int n = 0; n < oYAMLResource.getTargetServiceOutputProperties().size(); n++){
				ModelProperty oOutputProperty = oExternalServiceLayerCIMFactory.createModelProperty();
				oOutputProperty.setName(oYAMLResource.getTargetServiceOutputProperties().get(n).getName());
				oOutputProperty.setType(oYAMLResource.getTargetServiceOutputProperties().get(n).getType().equalsIgnoreCase("Object") ? "Complex" : oYAMLResource.getTargetServiceOutputProperties().get(n).getType());
				oOutputProperty.setIsUnique(oYAMLResource.getTargetServiceOutputProperties().get(n).Unique.equalsIgnoreCase("true") == true ? true : false);
				oOutputProperty.setHasPrimitiveType(oYAMLResource.getTargetServiceOutputProperties().get(n).getType().equalsIgnoreCase("Object") ? false : true);
				if(oOutputProperty.isHasPrimitiveType() == false){
					oOutputProperty.setHasComplexType(findComplexType(oRESTClientResource, oYAMLResource.getTargetServiceOutputProperties().get(n).getTypeRef(), false));
				}
				oOutputDataModel.getHasOutputProperties().add(oOutputProperty);
			}
			oRESTClientResource.getTargetsService().setHasOutputDataModel(oOutputDataModel);
		}	
	}

	private void populateRESTClientInput(RESTClientResource oRESTClientResource, YamlResource oYAMLResource) {
		//check if this resource has any input data
		if(oYAMLResource.getTargetServiceInputProperties() != null && !oYAMLResource.getTargetServiceInputProperties().isEmpty()){
			//create a new input data model
			InputDataModel oInputDataModel = oExternalServiceLayerCIMFactory.createInputDataModel();

			//create the input representation
			Representation oRepresentation = oExternalServiceLayerCIMFactory.createRepresentation();
			oRepresentation.setName("APPLICATION_JSON");
			oInputDataModel.setHasInputRepresentation(oRepresentation);
			
			//create any input properties
			for(int n = 0; n < oYAMLResource.getTargetServiceInputProperties().size(); n++){
				ModelProperty oInputProperty = oExternalServiceLayerCIMFactory.createModelProperty();
				oInputProperty.setName(oYAMLResource.getTargetServiceInputProperties().get(n).getName());
				oInputProperty.setType(oYAMLResource.getTargetServiceInputProperties().get(n).getType().equalsIgnoreCase("Object") ? "Complex" : oYAMLResource.getTargetServiceInputProperties().get(n).getType());
				oInputProperty.setIsUnique(oYAMLResource.getTargetServiceInputProperties().get(n).Unique.equalsIgnoreCase("true") == true ? true : false);
				oInputProperty.setHasPrimitiveType(oYAMLResource.getTargetServiceInputProperties().get(n).getType().equalsIgnoreCase("Object") ? false : true);
				if(oInputProperty.isHasPrimitiveType() == false){
					oInputProperty.setHasComplexType(findComplexType(oRESTClientResource, oYAMLResource.getTargetServiceInputProperties().get(n).getTypeRef(), true));
				}
				oInputDataModel.getHasInputProperties().add(oInputProperty);
			}
			
			oRESTClientResource.getTargetsService().setHasInputDataModel(oInputDataModel);
		}
	}

	private ComplexType findComplexType(RESTClientResource oRESTClientResource, String typeRef, boolean bIsInputProperty) {
		if(bIsInputProperty == true){
			for(int n = 0; n < oRESTClientResource.getIsRESTClientComplexType().size(); n++){
				if(oRESTClientResource.getIsRESTClientComplexType().get(n).getComplexTypeName().equalsIgnoreCase(typeRef)){
					return oRESTClientResource.getIsRESTClientComplexType().get(n);
				}
			}
		}
		else{
			for(int n = 0; n < oRESTClientResource.getIsRESTClientComplexType().size(); n++){
				if(oRESTClientResource.getIsRESTClientComplexType().get(n).getComplexTypeName().equalsIgnoreCase(typeRef)){
					return oRESTClientResource.getIsRESTClientComplexType().get(n);
				}
			}
		}
		try {
			throw new ExecutionException(new Throwable());
		} catch (ExecutionException e) {
			Activator.log("Unable to find complex type " + typeRef, e);
			return null;
		}
	}

	private void populateTargetServiceInput(RESTClientResource oRESTClientResource, YamlResource oYAMLResource) {
		System.out.println("YamlResource target URL: " + oYAMLResource.getTargetServiceURL());
		oRESTClientResource.getTargetsService().setTargetURL(oYAMLResource.getTargetServiceURL() + oYAMLResource.getTargetServicePath());
		oRESTClientResource.getTargetsService().setCRUDVerb(convertHTTPToCRUDVerb(oYAMLResource.getTargetServiceCRUDVerb()));
		
		//create the corresponding query parameters
		for(int i = 0; i < oYAMLResource.getTargetServiceQueryParameters().size(); i++){
			QueryParam oQueryParam = this.oExternalServiceLayerCIMFactory.createQueryParam();
			oQueryParam.setName(oYAMLResource.getTargetServiceQueryParameters().get(i).getName());
			oQueryParam.setType(oYAMLResource.getTargetServiceQueryParameters().get(i).getType());
			oQueryParam.setIsAuthToken(oYAMLResource.getTargetServiceQueryParameters().get(i).IsAuthToken.equalsIgnoreCase("true") == true ? true : false);
			oQueryParam.setAuthTokenToURL(oYAMLResource.getTargetServiceQueryParameters().get(i).getURL());
			oRESTClientResource.getTargetsService().getHasQueryParam().add(oQueryParam);
		}
	}

	private String convertHTTPToCRUDVerb(String HTTPVerb) {
		if(HTTPVerb.equalsIgnoreCase("POST")){
			return "CREATE";
		}
		else if(HTTPVerb.equalsIgnoreCase("GET")){
			return "READ";
		}
		else if(HTTPVerb.equalsIgnoreCase("PUT")){
			return "UPDATE";
		}
		else if(HTTPVerb.equalsIgnoreCase("DELETE")){
			return "DELETE";
		}
		else{
			try {
				throw new ExecutionException(new Throwable());
			} catch (ExecutionException e) {
				Activator.log("Unable to convert HTTP verb " + HTTPVerb + " to CRUD verb.", e);
				return null;
			}
		}
	}

	private void createRESTfulClients() {
		System.out.println("Checking the " + this.oYamlResourceList.size() + " YAML resources for external compositions");
		for(int n = 0; n < this.oYamlResourceList.size(); n++){
			if(this.oYamlResourceList.get(n).getIsExternalService() == true){
				System.out.println("YAML Resource " + this.oYamlResourceList.get(n).getName() + " is external composition");
				
				//create an AnnAlgoResource
				AnnAlgoResource oAnnAlgoResource = this.oExternalServiceLayerCIMFactory.createAnnAlgoResource();
				
				//associate it with the core CIM algo Resource
				oAnnAlgoResource.setAnnotatesAlgoResource(findCoreCIMResourceReference(this.oYamlResourceList.get(n).getName()));
				this.oExternalServiceLayerCIM.getHasAnnotatedElement().add(oAnnAlgoResource);
				
				//create the RESTClientResource
				RESTClientResource oRESTClientResource = this.oExternalServiceLayerCIMFactory.createRESTClientResource();
				
				//associate it with the AnnAlgoResource
				oRESTClientResource.setIsRESTClientResource(oAnnAlgoResource);
				
				//create the Target REST Service annotation
				TargetRESTService oTargetRESTService = oExternalServiceLayerCIMFactory.createTargetRESTService();
				oRESTClientResource.setTargetsService(oTargetRESTService);
				
				//add it to ExternalServiceLayerCIM
				this.oExternalServiceLayerCIM.getHasAnnotation().add(oRESTClientResource);
			}
		}
	}

	private Resource findCoreCIMResourceReference(String strCIMResourceName) {
		for(int n = 0; n < this.oRESTfulServiceCIM.getHasResources().size(); n++){
			if(this.oRESTfulServiceCIM.getHasResources().get(n).getName().equalsIgnoreCase(strCIMResourceName)){
				return this.oRESTfulServiceCIM.getHasResources().get(n);
			}
		}
		try {
			throw new ExecutionException(new Throwable());
		} catch (ExecutionException e) {
			Activator.log("Unable to find core CIM resource reference by name " + strCIMResourceName, e);
			return null;
		}
	}

	private void ExternalCIMToString(){
		for(int n = 0; n < this.oExternalServiceLayerCIM.getHasAnnotation().size(); n++){
			if(this.oExternalServiceLayerCIM.getHasAnnotation().get(n) instanceof RESTClientResource){
				RESTClientResource oResource = ((RESTClientResource)this.oExternalServiceLayerCIM.getHasAnnotation().get(n));
				printRESTClientComplexTypes(oResource);
				printRESTClientGeneralInfo(oResource);
				printRESTClientInputModel(oResource);
				printRESTClientOutputModel(oResource);
			}
		}
	}
	
	private void YamlToString(){
		for(int n = 0; n < this.oYamlResourceList.size(); n++){
			System.out.println("Printing YAML resource : " + oYamlResourceList.get(n).getName());
			oYamlResourceList.get(n).toString();
		}
	}

	private void printRESTClientOutputModel(RESTClientResource oResource) {
		if(oResource.getTargetsService().getHasOutputDataModel() == null){
			System.out.println("There exists no Output Model!");
		}
		else{
			for(int n = 0; n < oResource.getTargetsService().getHasOutputDataModel().getHasOutputProperties().size(); n++){
				System.out.println("Property name: " + oResource.getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(n).getName());
				System.out.println("Property type: " + oResource.getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(n).getType());
				System.out.println("Property is unique: " + oResource.getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(n).isIsUnique());
				System.out.println("Property has complex type:" + (oResource.getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(n).isHasPrimitiveType() == true ? false : true));
				if(oResource.getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(n).isHasPrimitiveType() == false){
					System.out.println("Property has real type: " + oResource.getTargetsService().getHasOutputDataModel().getHasOutputProperties().get(n).getHasComplexType().getComplexTypeName());
				}
			}
		}
	}

	private void printRESTClientInputModel(RESTClientResource oResource) {
		if(oResource.getTargetsService().getHasInputDataModel() == null){
			System.out.println("There exists no Input Model!");
		}
		else{
			for(int n = 0; n < oResource.getTargetsService().getHasInputDataModel().getHasInputProperties().size(); n++){
				System.out.println("Property name: " + oResource.getTargetsService().getHasInputDataModel().getHasInputProperties().get(n).getName());
				System.out.println("Property type: " + oResource.getTargetsService().getHasInputDataModel().getHasInputProperties().get(n).getType());
				System.out.println("Property is unique: " + oResource.getTargetsService().getHasInputDataModel().getHasInputProperties().get(n).isIsUnique());
				System.out.println("Property has complex type:" + (oResource.getTargetsService().getHasInputDataModel().getHasInputProperties().get(n).isHasPrimitiveType() == true ? false : true));
				if(oResource.getTargetsService().getHasInputDataModel().getHasInputProperties().get(n).isHasPrimitiveType() == false){
					System.out.println("Property has real type: " + oResource.getTargetsService().getHasInputDataModel().getHasInputProperties().get(n).getHasComplexType().getComplexTypeName());
				}
			}
		}
	}

	private void printRESTClientGeneralInfo(RESTClientResource oResource) {
		System.out.println("Target service URL: " + oResource.getTargetsService().getTargetURL());
		System.out.println("Target service CRUDVerb: " + oResource.getTargetsService().getCRUDVerb());
		System.out.println("Target service query paramaters: ");
		for(int n = 0; n < oResource.getTargetsService().getHasQueryParam().size(); n++){
			System.out.println("Query parameter name: " + oResource.getTargetsService().getHasQueryParam().get(n).getName());
			System.out.println("Query parameter is auth token: " + oResource.getTargetsService().getHasQueryParam().get(n).isIsAuthToken());
			if(oResource.getTargetsService().getHasQueryParam().get(n).isIsAuthToken() == true){
				System.out.println("Query parameter is auth  token to URL: " + oResource.getTargetsService().getHasQueryParam().get(n).getAuthTokenToURL()); 
			}
		}
	}

	private void printRESTClientComplexTypes(RESTClientResource oResource) {
		System.out.println("Printing complex types for RESTClient " + oResource.getIsRESTClientResource().getAnnotatesAlgoResource().getName());
		for(int n = 0; n < oResource.getIsRESTClientComplexType().size(); n++){
			System.out.println("Complex type name " + oResource.getIsRESTClientComplexType().get(n).getComplexTypeName());
			for(int i = 0; i < oResource.getIsRESTClientComplexType().get(n).getHasComplexTypeProperties().size(); i++){
				System.out.println("Complex type property name: " + oResource.getIsRESTClientComplexType().get(n).getHasComplexTypeProperties().get(i).getName());
				System.out.println("Complex type property type: " + oResource.getIsRESTClientComplexType().get(n).getHasComplexTypeProperties().get(i).getType());
				System.out.println("Complex type property is unique: " + oResource.getIsRESTClientComplexType().get(n).getHasComplexTypeProperties().get(i).isIsUnique());
				System.out.println("Compelx type property has complex data type: " + (oResource.getIsRESTClientComplexType().get(n).getHasComplexTypeProperties().get(i).isHasPrimitiveType() == true ? false : true));
				if(oResource.getIsRESTClientComplexType().get(n).getHasComplexTypeProperties().get(i).isHasPrimitiveType() == false){
					System.out.println("Complex type property real type: " + oResource.getIsRESTClientComplexType().get(n).getHasComplexTypeProperties().get(i).getPropertyHasComplexType().getComplexTypeName());
				}
			}
		}
	}
}
