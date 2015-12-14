/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.ui;

public class ASPMOutlinePageLexicalSortingAction extends ASPM.resource.ASPM.ui.AbstractASPMOutlinePageAction {
	
	public ASPMOutlinePageLexicalSortingAction(ASPM.resource.ASPM.ui.ASPMOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Sort alphabetically", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/sort_lexically_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setSortLexically(on);
		getTreeViewer().refresh();
	}
	
}
