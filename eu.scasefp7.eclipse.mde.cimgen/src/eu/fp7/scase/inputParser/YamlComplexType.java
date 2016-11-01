package eu.fp7.scase.inputParser;

import java.util.Arrays;
import java.util.ArrayList;

public class YamlComplexType {
	public String ComplexTypeName;
	
	public ArrayList<ComplexTypeProperty> ComplexTypeProperties;
	
	public String TypeRef;
	
	public String getComplexTypeName(){
		return this.ComplexTypeName;
	}
	
	public ArrayList<ComplexTypeProperty> getComplexTypeProperties(){
		return this.ComplexTypeProperties;
	}
	
	public String getTypeRef(){
		return this.TypeRef;
	}
	
	public String toYAMLString() {
		String all = "  - ComplexTypeName: " + ComplexTypeName;
		all += "\n    TypeRef: " + TypeRef;
		all += "\n    ComplexTypeProperties: " + Arrays.asList(ComplexTypeProperties);
		return all;
	}
}
