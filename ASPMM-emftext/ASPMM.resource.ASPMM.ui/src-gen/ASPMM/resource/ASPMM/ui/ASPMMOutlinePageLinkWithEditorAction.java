/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.ui;

public class ASPMMOutlinePageLinkWithEditorAction extends ASPMM.resource.ASPMM.ui.AbstractASPMMOutlinePageAction {
	
	public ASPMMOutlinePageLinkWithEditorAction(ASPMM.resource.ASPMM.ui.ASPMMOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Link with Editor", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/link_with_editor_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setLinkWithEditor(on);
	}
	
}
