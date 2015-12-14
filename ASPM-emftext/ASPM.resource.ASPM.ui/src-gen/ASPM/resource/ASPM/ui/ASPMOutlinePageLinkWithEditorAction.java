/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.ui;

public class ASPMOutlinePageLinkWithEditorAction extends ASPM.resource.ASPM.ui.AbstractASPMOutlinePageAction {
	
	public ASPMOutlinePageLinkWithEditorAction(ASPM.resource.ASPM.ui.ASPMOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Link with Editor", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/link_with_editor_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setLinkWithEditor(on);
	}
	
}
