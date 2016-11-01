package eu.fp7.scase.abacAuthorizationWizard.helpers;

import java.util.Map;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

import AuthorizationLayerCIM.Condition;

public class ConditionLabelProvider implements ILabelProvider {

	private Map<Condition, Boolean> oValidConditionMap;
	
	public ConditionLabelProvider(Map<Condition, Boolean> oValidConditionMap) {
		super();
		this.setoValidConditionMap(oValidConditionMap);
	}
	
	@Override
	public void addListener(ILabelProviderListener listener) {
	}

	@Override
	public void dispose() {
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
		return null;
	}

	@Override
	public String getText(Object element) {
		if (element instanceof Condition){
			Condition oCondition = (Condition)element;
			String invalid = oValidConditionMap.get(oCondition) ? "":"(INVALID) ";
			return oCondition.eContainer().eContents().indexOf(oCondition) + 1 + ": "+invalid + oCondition.getOperator().getLiteral()+" condition";
		}
		return null;
	}

	/**
	 * @return the oValidConditionMap
	 */
	public Map<Condition, Boolean> getoValidConditionMap() {
		return oValidConditionMap;
	}

	/**
	 * @param oValidConditionMap the oValidConditionMap to set
	 */
	public void setoValidConditionMap(Map<Condition, Boolean> oValidConditionMap) {
		this.oValidConditionMap = oValidConditionMap;
	}

}
