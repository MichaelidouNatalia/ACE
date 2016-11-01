package eu.fp7.scase.inputParser;

import java.util.Arrays;

public class ComplexTypeProperty {
	public String Name;
	
	public String Type;
	
	public String TypeRef;
	
	public String Unique;
	
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
	
	public String toYAMLString() {
		String all = "  - Name: " + Name;
		all += "\n    Type: " + Type;
		all += "\n    TypeRef: " + TypeRef;
		all += "\n    Unique: " + Unique;
		return all;
	}
}
