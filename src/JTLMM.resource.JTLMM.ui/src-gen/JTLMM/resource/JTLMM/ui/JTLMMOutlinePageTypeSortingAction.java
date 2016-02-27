/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.ui;

public class JTLMMOutlinePageTypeSortingAction extends JTLMM.resource.JTLMM.ui.AbstractJTLMMOutlinePageAction {
	
	public JTLMMOutlinePageTypeSortingAction(JTLMM.resource.JTLMM.ui.JTLMMOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Group types", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/group_types_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setGroupTypes(on);
		getTreeViewer().refresh();
	}
	
}
