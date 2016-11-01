package eu.fp7.scase.abacAuthorizationWizard.helpers;

import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.resource.LocalResourceManager;
import org.eclipse.jface.resource.ResourceManager;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import AuthorizationLayerCIM.AuthorizableResource;
import AuthorizationLayerCIM.AuthorizationSubject;
import AuthorizationLayerCIM.ResourceAccessPolicy;
import AuthorizationLayerCIM.ResourceAccessPolicySet;
import AuthorizationLayerCIM.ResourceAccessRule;
import ServiceCIM.Resource;

public class ABACLabelProvider implements ILabelProvider {

    private ResourceManager resourceManager;
	private final AuthorizationSubject authSubject;
	//private final RGB[] xRGBs;
	
	private final Map<AuthorizableResource , Resource> oAnnotationToResourceMap;
	private Map<AuthorizableResource, Boolean> oValidResourceMap;
	public void setValidResourceMap(Map<AuthorizableResource, Boolean> oValidResourceMap){
		this.oValidResourceMap = oValidResourceMap;
	}
	private Map<ResourceAccessPolicySet, Boolean> oValidPolicySetMap;
	public void setValidPolicySetMap(Map<ResourceAccessPolicySet, Boolean> oValidPolicySetMap){
		this.oValidPolicySetMap = oValidPolicySetMap;
		
	}
	private Map<ResourceAccessPolicy, Boolean> oValidPolicyMap;
	public void setValidPolicyMap(Map<ResourceAccessPolicy, Boolean> oValidPolicyMap){
		this.oValidPolicyMap = oValidPolicyMap;

	}
	private Map<ResourceAccessRule, Boolean> oValidRuleMap;
	public void setValidRuleMap( Map<ResourceAccessRule, Boolean> oValidRuleMap){
		this.oValidRuleMap = oValidRuleMap;

	}

	public ABACLabelProvider(AuthorizationSubject oAuthorizationSubject , Map<AuthorizableResource , Resource> oAnnotationToResourceMap,
			Map<AuthorizableResource, Boolean> oValidResourceMap, Map<ResourceAccessPolicySet, Boolean> oValidPolicySetMap , Map<ResourceAccessPolicy, Boolean> oValidPolicyMap ,
			Map<ResourceAccessRule, Boolean> oValidRuleMap){
		
		super();
		this.authSubject = oAuthorizationSubject;
		this.oAnnotationToResourceMap = oAnnotationToResourceMap;
		this.oValidResourceMap = oValidResourceMap;
		this.oValidPolicySetMap = oValidPolicySetMap;
		this.oValidPolicyMap = oValidPolicyMap;
		this.oValidRuleMap = oValidRuleMap;
		/*
		ImageDescriptor xImageDescriptor = createImageDescriptor(null);
		Image xImage = xImageDescriptor.createImage();
		ImageData xImageData = xImage.getImageData();
		Set<RGB> xRGBSet = new HashSet<RGB>();
		int[] pixels = new int[xImageData.width*xImageData.height];
		xImageData.getPixels(0, 0, xImageData.width*xImageData.height, pixels, 0);
		for (int i = 0 ; i < pixels.length ; i++){
			xRGBSet.add(xImageData.getRGBs()[pixels[i]]);
		}
		xRGBs = Arrays.copyOf(xRGBSet.toArray(), xRGBSet.size() , RGB[].class);
		xImage.dispose();
		*/
	}
	
	protected ResourceManager getResourceManager() {
        if(resourceManager == null) {
          resourceManager = new LocalResourceManager(JFaceResources.getResources());
        }
        return resourceManager;
      }
	
	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		getResourceManager().dispose();
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
		/*
		Image image;
		if (element instanceof Resource){
			return getResourceManager().createImage(createImageDescriptor(element));
		}
		if (element instanceof AuthorizableResource){
			image = getResourceManager().createImage(createImageDescriptor(element));
			if (!this.oValidResourceMap.get(element)){
				image = drawXToImage(image);
			}
			return image;
		}
		if (element instanceof ResourceAccessPolicySet){
			image = getResourceManager().createImage(createImageDescriptor(element));
			if (!this.oValidPolicySetMap.get(element)){
				image = drawXToImage(image);
			}
			return image;
		}
		if (element instanceof ResourceAccessPolicy){
			image = getResourceManager().createImage(createImageDescriptor(element));
			if (!this.oValidPolicyMap.get(element)){
				image = drawXToImage(image);
			}
			return image;
		}
		if (element instanceof ResourceAccessRule){
			image = getResourceManager().createImage(createImageDescriptor(element));
			if (!this.oValidRuleMap.get(element)){
				image = drawXToImage(image);
			}
			return image;
		}
		*/
		return null;
		
	}

	/*
	private Image drawXToImage(Image image) {
		ImageData baseImageData = image.getImageData();
		Image redX = getResourceManager().createImage(createImageDescriptor(null));
		ImageData redXData = redX.getImageData();
		boolean flag = false;
		int palleteNewRGBIndex = 0;
		int j = 0;
		RGB black = new RGB(0,0,0);
		for (int i = 0 ; i < baseImageData.getRGBs().length ; i++){
			if (baseImageData.getRGBs()[i].equals(black) && i > 0 && !flag){
				flag = true;
				palleteNewRGBIndex = i;
			}
			if (flag){
				baseImageData.getRGBs()[i] = xRGBs[j];
				j++;
			}
			if (j >= xRGBs.length) break;
		}
		RGB desired;
		for (int x = baseImageData.width - redXData.width; x < baseImageData.width; x++){
			for (int y = baseImageData.height - redXData.height; y < baseImageData.height; y++){
				desired = redXData.getRGBs()[redXData.getPixel(x - (baseImageData.width - redXData.width), y -(baseImageData.height - redXData.height))];
				baseImageData.setPixel(x, y, palleteNewRGBIndex + Arrays.asList(xRGBs).indexOf(desired));			
			}
		}
		return getResourceManager().createImage(new ImageDescriptor() {
			@Override
			public ImageData getImageData() {
				return baseImageData;
			}
		});
	}
*/
	private ImageDescriptor createImageDescriptor(Object element) {
			if (element instanceof AuthorizableResource){
				if(((AuthorizableResource)element).getIsAuthorizableResource().getAnnotatesResource().isIsAlgorithmic()){
					return AbstractUIPlugin.imageDescriptorFromPlugin("eu.scasefp7.eclipse.mde.cimgen", "icons/Algo.gif");
				}else{
					
					if (((AuthorizableResource)element).getIsAuthorizableResource().getAnnotatesResource().equals(this.authSubject.getIsAuthorizationSubject().getAnnotatesResource())){
						return AbstractUIPlugin.imageDescriptorFromPlugin("eu.scasefp7.eclipse.mde.cimgen", "icons/authSubject1.gif");
					}else{
						return AbstractUIPlugin.imageDescriptorFromPlugin("eu.scasefp7.eclipse.mde.cimgen", "icons/CRUD1.gif");	
					}
				}
			}
			if (element instanceof Resource){
				if(((Resource)element).isIsAlgorithmic()){
					return AbstractUIPlugin.imageDescriptorFromPlugin("eu.scasefp7.eclipse.mde.cimgen", "icons/Algo.gif");
				}else{					
					if (((Resource)element).equals(this.authSubject.getIsAuthorizationSubject().getAnnotatesResource())){
						return AbstractUIPlugin.imageDescriptorFromPlugin("eu.scasefp7.eclipse.mde.cimgen", "icons/authSubject1.gif");
					}else{
						return AbstractUIPlugin.imageDescriptorFromPlugin("eu.scasefp7.eclipse.mde.cimgen", "icons/CRUD1.gif");	
					}
				}
			}
		    if (element instanceof ResourceAccessPolicySet){
				return AbstractUIPlugin.imageDescriptorFromPlugin("eu.scasefp7.eclipse.mde.cimgen", "icons/PolicySet1.gif");	
		    }
		    if (element instanceof ResourceAccessPolicy){
				return AbstractUIPlugin.imageDescriptorFromPlugin("eu.scasefp7.eclipse.mde.cimgen", "icons/Policy1.gif");	
		    }
		    if (element instanceof ResourceAccessRule){
				return AbstractUIPlugin.imageDescriptorFromPlugin("eu.scasefp7.eclipse.mde.cimgen", "icons/Rule1.gif");	
		    }
		    if (element == null){
				return AbstractUIPlugin.imageDescriptorFromPlugin("eu.scasefp7.eclipse.mde.cimgen", "icons/redx.gif");	
		    }
		    return null;
		  }
	
	@Override
	public String getText(Object element) {
		
		if (element instanceof AuthorizableResource){
			AuthorizableResource oAuthorizableResource = (AuthorizableResource)element;
			return oAuthorizableResource.getIsAuthorizableResource().getAnnotatesResource().getName();
		}
		
		if (element instanceof Resource){
			Resource oResource = (Resource)element;
			return oResource.getName();
		}
		
		if (element instanceof ResourceAccessPolicySet){
			ResourceAccessPolicySet oResourceAccessPolicySet = (ResourceAccessPolicySet)element;
			return oResourceAccessPolicySet.getName();
		}
		
		if (element instanceof ResourceAccessPolicy){
			ResourceAccessPolicy oResourceAccessPolicy = (ResourceAccessPolicy)element;
			return oResourceAccessPolicy.getName();
		}
		
		if (element instanceof ResourceAccessRule){
			ResourceAccessRule oResourceAccessRule = (ResourceAccessRule)element;
			return oResourceAccessRule.getName();
		}
		return null;
	}

}
