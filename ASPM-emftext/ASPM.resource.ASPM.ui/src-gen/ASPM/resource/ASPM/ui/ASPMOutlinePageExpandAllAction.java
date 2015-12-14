/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.ui;

public class ASPMOutlinePageExpandAllAction extends ASPM.resource.ASPM.ui.AbstractASPMOutlinePageAction {
	
	public ASPMOutlinePageExpandAllAction(ASPM.resource.ASPM.ui.ASPMOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Expand all", org.eclipse.jface.action.IAction.AS_PUSH_BUTTON);
		initialize("icons/expand_all_icon.gif");
	}
	
	public void runInternal(boolean on) {
		if (on) {
			getTreeViewer().expandAll();
		}
	}
	
	public boolean keepState() {
		return false;
	}
	
}
