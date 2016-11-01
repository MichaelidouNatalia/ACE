package eu.fp7.scase.abacAuthorizationWizard.helpers;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

import AuthorizationLayerCIM.NewProperty;
import ServiceCIM.Property;

public class PropertyLabelProvider implements ILabelProvider {

	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public Image getImage(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getText(Object element) {
		if (element instanceof Property){
			Property oProperty = (Property)element;
			return oProperty.getName();
		}
		if (element instanceof NewProperty){			
			NewProperty oNewProperty = (NewProperty)element;
			return oNewProperty.getName();
		}
		return null;
	}

}
