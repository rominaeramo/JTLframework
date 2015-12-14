/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.ui;

public class ASPOutlinePageTypeSortingAction extends ASP.resource.ASP.ui.AbstractASPOutlinePageAction {
	
	public ASPOutlinePageTypeSortingAction(ASP.resource.ASP.ui.ASPOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Group types", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/group_types_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setGroupTypes(on);
		getTreeViewer().refresh();
	}
	
}
