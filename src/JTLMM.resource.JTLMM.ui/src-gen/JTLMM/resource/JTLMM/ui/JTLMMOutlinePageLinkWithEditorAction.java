/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.ui;

public class JTLMMOutlinePageLinkWithEditorAction extends JTLMM.resource.JTLMM.ui.AbstractJTLMMOutlinePageAction {
	
	public JTLMMOutlinePageLinkWithEditorAction(JTLMM.resource.JTLMM.ui.JTLMMOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Link with Editor", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/link_with_editor_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setLinkWithEditor(on);
	}
	
}
