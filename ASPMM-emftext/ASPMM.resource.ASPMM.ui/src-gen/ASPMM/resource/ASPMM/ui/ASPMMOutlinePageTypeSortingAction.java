/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.ui;

public class ASPMMOutlinePageTypeSortingAction extends ASPMM.resource.ASPMM.ui.AbstractASPMMOutlinePageAction {
	
	public ASPMMOutlinePageTypeSortingAction(ASPMM.resource.ASPMM.ui.ASPMMOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Group types", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/group_types_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setGroupTypes(on);
		getTreeViewer().refresh();
	}
	
}
