package eu.fp7.scase.abacAuthorizationWizard.helpers;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

import ServiceCIM.RESTfulServiceCIM;

public class ResourceContentProvider implements IStructuredContentProvider {

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
		if (inputElement instanceof RESTfulServiceCIM){
			RESTfulServiceCIM oRESTfulServiceCIM = (RESTfulServiceCIM)inputElement;
			return oRESTfulServiceCIM.getHasResources().toArray();
		}
		return null;
	}

}
