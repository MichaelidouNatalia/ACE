package eu.fp7.scase.abacAuthorizationWizard.helpers;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

import AuthorizationLayerCIM.Condition;
import AuthorizationLayerCIM.ResourceAccessPolicy;
import AuthorizationLayerCIM.ResourceAccessRule;

public class ConditionContentProvider implements IStructuredContentProvider {

	@Override
	public void dispose() {
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

	@Override
	public Object[] getElements(Object inputElement) {
		
		if (inputElement instanceof ResourceAccessPolicy){
			ResourceAccessPolicy oResourceAccessPolicy = (ResourceAccessPolicy)inputElement;
			return oResourceAccessPolicy.getHasApplyCondition().toArray();
		}
		
		if (inputElement instanceof ResourceAccessRule){
			ResourceAccessRule oResourceAccessRule = (ResourceAccessRule)inputElement;
			return oResourceAccessRule.getHasMatchCondition().toArray();
		}
		return null;
	}

}
