/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.ui;

public class JTLMMOutlinePageActionProvider {
	
	public java.util.List<org.eclipse.jface.action.IAction> getActions(JTLMM.resource.JTLMM.ui.JTLMMOutlinePageTreeViewer treeViewer) {
		// To add custom actions to the outline view, set the
		// 'overrideOutlinePageActionProvider' option to <code>false</code> and modify
		// this method.
		java.util.List<org.eclipse.jface.action.IAction> defaultActions = new java.util.ArrayList<org.eclipse.jface.action.IAction>();
		defaultActions.add(new JTLMM.resource.JTLMM.ui.JTLMMOutlinePageLinkWithEditorAction(treeViewer));
		defaultActions.add(new JTLMM.resource.JTLMM.ui.JTLMMOutlinePageCollapseAllAction(treeViewer));
		defaultActions.add(new JTLMM.resource.JTLMM.ui.JTLMMOutlinePageExpandAllAction(treeViewer));
		defaultActions.add(new JTLMM.resource.JTLMM.ui.JTLMMOutlinePageAutoExpandAction(treeViewer));
		defaultActions.add(new JTLMM.resource.JTLMM.ui.JTLMMOutlinePageLexicalSortingAction(treeViewer));
		defaultActions.add(new JTLMM.resource.JTLMM.ui.JTLMMOutlinePageTypeSortingAction(treeViewer));
		return defaultActions;
	}
	
}
