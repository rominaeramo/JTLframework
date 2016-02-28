/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.ui;

public class ASPMOutlinePageActionProvider {
	
	public java.util.List<org.eclipse.jface.action.IAction> getActions(ASPM.resource.ASPM.ui.ASPMOutlinePageTreeViewer treeViewer) {
		// To add custom actions to the outline view, set the
		// 'overrideOutlinePageActionProvider' option to <code>false</code> and modify
		// this method.
		java.util.List<org.eclipse.jface.action.IAction> defaultActions = new java.util.ArrayList<org.eclipse.jface.action.IAction>();
		defaultActions.add(new ASPM.resource.ASPM.ui.ASPMOutlinePageLinkWithEditorAction(treeViewer));
		defaultActions.add(new ASPM.resource.ASPM.ui.ASPMOutlinePageCollapseAllAction(treeViewer));
		defaultActions.add(new ASPM.resource.ASPM.ui.ASPMOutlinePageExpandAllAction(treeViewer));
		defaultActions.add(new ASPM.resource.ASPM.ui.ASPMOutlinePageAutoExpandAction(treeViewer));
		defaultActions.add(new ASPM.resource.ASPM.ui.ASPMOutlinePageLexicalSortingAction(treeViewer));
		defaultActions.add(new ASPM.resource.ASPM.ui.ASPMOutlinePageTypeSortingAction(treeViewer));
		return defaultActions;
	}
	
}
