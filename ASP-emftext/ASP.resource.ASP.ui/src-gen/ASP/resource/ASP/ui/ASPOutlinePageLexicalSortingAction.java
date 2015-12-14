/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.ui;

public class ASPOutlinePageLexicalSortingAction extends ASP.resource.ASP.ui.AbstractASPOutlinePageAction {
	
	public ASPOutlinePageLexicalSortingAction(ASP.resource.ASP.ui.ASPOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Sort alphabetically", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/sort_lexically_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewerComparator().setSortLexically(on);
		getTreeViewer().refresh();
	}
	
}
