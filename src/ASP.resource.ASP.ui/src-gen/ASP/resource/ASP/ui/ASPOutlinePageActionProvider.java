/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.ui;

public class ASPOutlinePageActionProvider {
	
	public java.util.List<org.eclipse.jface.action.IAction> getActions(ASP.resource.ASP.ui.ASPOutlinePageTreeViewer treeViewer) {
		// To add custom actions to the outline view, set the
		// 'overrideOutlinePageActionProvider' option to <code>false</code> and modify
		// this method.
		java.util.List<org.eclipse.jface.action.IAction> defaultActions = new java.util.ArrayList<org.eclipse.jface.action.IAction>();
		defaultActions.add(new ASP.resource.ASP.ui.ASPOutlinePageLinkWithEditorAction(treeViewer));
		defaultActions.add(new ASP.resource.ASP.ui.ASPOutlinePageCollapseAllAction(treeViewer));
		defaultActions.add(new ASP.resource.ASP.ui.ASPOutlinePageExpandAllAction(treeViewer));
		defaultActions.add(new ASP.resource.ASP.ui.ASPOutlinePageAutoExpandAction(treeViewer));
		defaultActions.add(new ASP.resource.ASP.ui.ASPOutlinePageLexicalSortingAction(treeViewer));
		defaultActions.add(new ASP.resource.ASP.ui.ASPOutlinePageTypeSortingAction(treeViewer));
		return defaultActions;
	}
	
}
