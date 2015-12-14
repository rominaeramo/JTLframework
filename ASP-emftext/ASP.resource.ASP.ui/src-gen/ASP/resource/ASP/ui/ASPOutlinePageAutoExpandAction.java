/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.ui;

public class ASPOutlinePageAutoExpandAction extends ASP.resource.ASP.ui.AbstractASPOutlinePageAction {
	
	public ASPOutlinePageAutoExpandAction(ASP.resource.ASP.ui.ASPOutlinePageTreeViewer treeViewer) {
		super(treeViewer, "Auto expand", org.eclipse.jface.action.IAction.AS_CHECK_BOX);
		initialize("icons/auto_expand_icon.gif");
	}
	
	public void runInternal(boolean on) {
		getTreeViewer().setAutoExpand(on);
		getTreeViewer().refresh();
	}
	
}
