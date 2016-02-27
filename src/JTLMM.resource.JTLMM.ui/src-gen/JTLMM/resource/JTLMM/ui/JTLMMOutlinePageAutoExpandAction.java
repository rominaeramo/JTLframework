/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.ui;

public class JTLMMOutlinePageAutoExpandAction extends JTLMM.resource.JTLMM.ui.AbstractJTLMMOutlinePageAction {
	
	public JTLMMOutlinePageAutoExpandAction(JTLMM.resource.JTLMM.ui.JTLMMOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Auto expand", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/auto_expand_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setAutoExpand(on);
		getTreeViewer().refresh();
	}
	
}
