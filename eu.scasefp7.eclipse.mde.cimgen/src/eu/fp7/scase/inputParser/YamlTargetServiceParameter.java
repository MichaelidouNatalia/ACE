package eu.fp7.scase.inputParser;

public class YamlTargetServiceParameter {

	public String Name;
	
	public String Type;
	
	public String TypeRef;
	
	public String Unique;
	
	public String IsAuthToken;
	
	public String URL;
	
	public String IsOptional;
	
	public String getName(){
		return this.Name;
	}
	
	public String getType(){
		return this.Type;
	}
	
	public String getTypeRef(){
		return this.TypeRef;
	}
	
	public String getUnique(){
		return this.Unique;
	}
	
	public String getIsAuthToken(){
		return this.IsAuthToken;
	}
	
	public String getURL(){
		return this.URL;
	}
	
	public String getIsOptional(){
		return this.IsOptional;
	}
	
	public String toYAMLString() {
		String all = "  - Name: " + Name;
		all += "\n    Type: " + Type;
		all += "\n    Unique: " + Unique;
		all += "\n    TypeRef: " + TypeRef;
		all += "\n    IsAuthToken: " + IsAuthToken;
		all += "\n    URL: " + URL;
		all += "\n    IsOptional: " + IsOptional;

		return all;
	}
}
