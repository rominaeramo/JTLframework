/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.ui;

public class ASPMOutlinePageAutoExpandAction extends ASPM.resource.ASPM.ui.AbstractASPMOutlinePageAction {
	
	public ASPMOutlinePageAutoExpandAction(ASPM.resource.ASPM.ui.ASPMOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Auto expand", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/auto_expand_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setAutoExpand(on);
		getTreeViewer().refresh();
	}
	
}
