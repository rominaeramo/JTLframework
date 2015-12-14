/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.ui;

public class ASPMMOutlinePageLexicalSortingAction extends ASPMM.resource.ASPMM.ui.AbstractASPMMOutlinePageAction {
	
	public ASPMMOutlinePageLexicalSortingAction(ASPMM.resource.ASPMM.ui.ASPMMOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Sort alphabetically", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/sort_lexically_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setSortLexically(on);
		getTreeViewer().refresh();
	}
	
}
