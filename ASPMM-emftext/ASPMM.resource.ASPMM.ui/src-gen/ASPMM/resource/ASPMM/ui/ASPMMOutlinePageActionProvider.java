/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.ui;

public class ASPMMOutlinePageActionProvider {
	
	public java.util.List<org.eclipse.jface.action.IAction> getActions(ASPMM.resource.ASPMM.ui.ASPMMOutlinePageTreeViewer treeViewer) {
		// To add custom actions to the outline view, set the
		// 'overrideOutlinePageActionProvider' option to <code>false</code> and modify
		// this method.
		java.util.List<org.eclipse.jface.action.IAction> defaultActions = new java.util.ArrayList<org.eclipse.jface.action.IAction>();
		defaultActions.add(new ASPMM.resource.ASPMM.ui.ASPMMOutlinePageLinkWithEditorAction(treeViewer));
		defaultActions.add(new ASPMM.resource.ASPMM.ui.ASPMMOutlinePageCollapseAllAction(treeViewer));
		defaultActions.add(new ASPMM.resource.ASPMM.ui.ASPMMOutlinePageExpandAllAction(treeViewer));
		defaultActions.add(new ASPMM.resource.ASPMM.ui.ASPMMOutlinePageAutoExpandAction(treeViewer));
		defaultActions.add(new ASPMM.resource.ASPMM.ui.ASPMMOutlinePageLexicalSortingAction(treeViewer));
		defaultActions.add(new ASPMM.resource.ASPMM.ui.ASPMMOutlinePageTypeSortingAction(treeViewer));
		return defaultActions;
	}
	
}
