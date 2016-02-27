/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.ui;

public class JTLMMOutlinePageCollapseAllAction extends JTLMM.resource.JTLMM.ui.AbstractJTLMMOutlinePageAction {
	
	public JTLMMOutlinePageCollapseAllAction(JTLMM.resource.JTLMM.ui.JTLMMOutlinePageTreeViewer treeViewer) {
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
