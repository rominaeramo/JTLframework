/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.mopp;

public class ASPMParseResult implements ASPM.resource.ASPM.IASPMParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<ASPM.resource.ASPM.IASPMCommand<ASPM.resource.ASPM.IASPMTextResource>> commands = new java.util.ArrayList<ASPM.resource.ASPM.IASPMCommand<ASPM.resource.ASPM.IASPMTextResource>>();
	
	public ASPMParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<ASPM.resource.ASPM.IASPMCommand<ASPM.resource.ASPM.IASPMTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
