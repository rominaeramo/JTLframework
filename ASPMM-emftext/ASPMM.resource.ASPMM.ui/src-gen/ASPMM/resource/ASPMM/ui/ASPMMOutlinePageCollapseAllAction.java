/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.ui;

public class ASPMMOutlinePageCollapseAllAction extends ASPMM.resource.ASPMM.ui.AbstractASPMMOutlinePageAction {
	
	public ASPMMOutlinePageCollapseAllAction(ASPMM.resource.ASPMM.ui.ASPMMOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Collapse all", org.eclipse.jface.action.IAction.AS_PUSH_BUTTON);
		initialize("icons/collapse_all_icon.gif");
	}
	
	public void runInternal(boolean on) {
		if (on) {
			getTreeViewer().collapseAll();
		}
	}
	
	public boolean keepState() {
		return false;
	}
	
}
