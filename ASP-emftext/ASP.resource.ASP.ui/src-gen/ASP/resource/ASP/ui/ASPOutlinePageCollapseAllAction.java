/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.ui;

public class ASPOutlinePageCollapseAllAction extends ASP.resource.ASP.ui.AbstractASPOutlinePageAction {
	
	public ASPOutlinePageCollapseAllAction(ASP.resource.ASP.ui.ASPOutlinePageTreeViewer treeViewer) {
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
