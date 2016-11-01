package eu.fp7.scase.abacAuthorizationWizard.helpers;

import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

import AuthorizationLayerCIM.Annotation;
import AuthorizationLayerCIM.AnnotationModel;
import AuthorizationLayerCIM.NewProperty;
import ServiceCIM.Resource;

public class PropertyContentProvider implements IStructuredContentProvider {

	AnnotationModel oAuthorizationModel;
	
	public PropertyContentProvider(AnnotationModel oAuthorizationModel) {
		super();
		this.oAuthorizationModel=oAuthorizationModel;
	}
	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof Resource){
			Resource oResource = (Resource)inputElement;
			Object[] oResult = new Object[getNewPropertiesFromResource(oResource).size() + oResource.getHasProperty().size()];
			System.arraycopy(oResource.getHasProperty().toArray(), 0, oResult, 0, oResource.getHasProperty().size());
			System.arraycopy(getNewPropertiesFromResource(oResource).toArray(), 0, oResult, oResource.getHasProperty().size(), getNewPropertiesFromResource(oResource).size());
			return oResult;
		}
		return null;
	}

	private java.util.List<NewProperty> getNewPropertiesFromResource(Resource oResource){
		java.util.List<NewProperty> newProperties = new ArrayList<NewProperty>();
		for (Annotation oAnnotation : oAuthorizationModel.getHasAnnotation()){
			if (oAnnotation instanceof NewProperty){
				NewProperty oNewProperty = (NewProperty)oAnnotation;
				if (oNewProperty.getBelongsToResource().getAnnotatesResource().equals(oResource)){
					newProperties.add(oNewProperty);
				}
			}
		}
		return newProperties;
	}
	
}
