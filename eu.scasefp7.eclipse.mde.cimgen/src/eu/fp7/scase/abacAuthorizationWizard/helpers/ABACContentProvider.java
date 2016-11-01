package eu.fp7.scase.abacAuthorizationWizard.helpers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

import AuthorizationLayerCIM.*;
import ServiceCIM.RESTfulServiceCIM;
import ServiceCIM.Resource;

public class ABACContentProvider implements ITreeContentProvider {

	private static Object[] EMPTY_ARRAY = new Object[0];
	private boolean[] bIsAuthorizableResource;
	private int intSelectedResourceIndex;
	private RESTfulServiceCIM oRESTfulServiceCIM;
	
	public void setBIsAuthorizableResource(boolean[] bIsAuthorizableResource){
		this.bIsAuthorizableResource = bIsAuthorizableResource;
	}
	public void setIntSelectedResourceIndex(int intSelectedResourceIndex){
		this.intSelectedResourceIndex = intSelectedResourceIndex;
	}
	
	public ABACContentProvider(boolean[] bIsAuthorizableResource, RESTfulServiceCIM oRESTfulServiceCIM) {
		super();
		this.oRESTfulServiceCIM = oRESTfulServiceCIM;
		this.bIsAuthorizableResource = bIsAuthorizableResource;
		this.intSelectedResourceIndex = 0;
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
		if (inputElement instanceof AuthorizationLayerCIM.AnnotationModel ){
			AuthorizationLayerCIM.AnnotationModel oAnnotationModel = (AuthorizationLayerCIM.AnnotationModel)inputElement;
			EList<Annotation> listAnnotation =  oAnnotationModel.getHasAnnotation();
			Object[] oResourceArray = new Object[this.oRESTfulServiceCIM.getHasResources().size()];
			System.arraycopy(this.oRESTfulServiceCIM.getHasResources().toArray(), 0, oResourceArray, 0, this.oRESTfulServiceCIM.getHasResources().size());
			for(Annotation oAnnotation : listAnnotation){
				if (oAnnotation instanceof AuthorizableResource){
					AuthorizableResource oAuthorizableResource = (AuthorizableResource)oAnnotation;
					for(int i=0 ; i<oResourceArray.length; i++){
						if (oAuthorizableResource.getIsAuthorizableResource().getAnnotatesResource().equals(oResourceArray[i])){
							Array.set(oResourceArray, i, oAuthorizableResource);
						}
					}
				}
			}
			return oResourceArray;
		}
		return null;
	}

	@Override
	public Object[] getChildren(Object parentElement) {

		if (parentElement instanceof AuthorizableResource){
			AuthorizableResource oResource = (AuthorizableResource)parentElement;
			ResourceAccessPolicySet[] arrayResourceAccessPolicySet = new ResourceAccessPolicySet[1];
			arrayResourceAccessPolicySet[0] = oResource.getHasResourceAccessPolicySet();
			return arrayResourceAccessPolicySet;
		}
		
		if (parentElement instanceof ResourceAccessPolicySet) {
			ResourceAccessPolicySet oResourceAccessPolicySet = (ResourceAccessPolicySet)parentElement;
			Object[] oResult = new Object[oResourceAccessPolicySet.getHasResourceAccessPolicy().size() + oResourceAccessPolicySet.getHasResourceAccessPolicySet().size()];
			System.arraycopy(oResourceAccessPolicySet.getHasResourceAccessPolicy().toArray(), 0, oResult, 0, oResourceAccessPolicySet.getHasResourceAccessPolicy().size());
			System.arraycopy(oResourceAccessPolicySet.getHasResourceAccessPolicySet().toArray(), 0, oResult, oResourceAccessPolicySet.getHasResourceAccessPolicy().size(), oResourceAccessPolicySet.getHasResourceAccessPolicySet().size());
			return oResult;
		}
		
		if (parentElement instanceof ResourceAccessPolicy){
			ResourceAccessPolicy oResourceAccessPolicy = (ResourceAccessPolicy)parentElement;
			return oResourceAccessPolicy.getHasResourceAccessRule().toArray();
		}
		return EMPTY_ARRAY;
	}

	@Override
	public Object getParent(Object element) {
		if ((element instanceof EObject)) {
			EObject oEObject = (EObject)element;
			return oEObject.eContainer();
		}
		return EMPTY_ARRAY;
	}

	@Override
	public boolean hasChildren(Object element) {
		if(element instanceof AuthorizableResource){
			AuthorizableResource oAuthorizableResource = (AuthorizableResource)element;
			return oAuthorizableResource.getHasResourceAccessPolicySet() != null;
		}
		
		if (element instanceof ResourceAccessPolicySet) {
			ResourceAccessPolicySet oResourceAccessPolicySet = (ResourceAccessPolicySet)element;
			return !(oResourceAccessPolicySet.getHasResourceAccessPolicy().isEmpty() && oResourceAccessPolicySet.getHasResourceAccessPolicySet().isEmpty());
		}
		
		if (element instanceof ResourceAccessPolicy) {
			ResourceAccessPolicy oResourceAccessPolicy = (ResourceAccessPolicy)element;
			return !oResourceAccessPolicy.getHasResourceAccessRule().isEmpty();
		}
		return false;
	}

}
