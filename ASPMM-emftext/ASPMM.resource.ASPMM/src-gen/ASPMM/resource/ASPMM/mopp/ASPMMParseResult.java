/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.mopp;

public class ASPMMParseResult implements ASPMM.resource.ASPMM.IASPMMParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<ASPMM.resource.ASPMM.IASPMMCommand<ASPMM.resource.ASPMM.IASPMMTextResource>> commands = new java.util.ArrayList<ASPMM.resource.ASPMM.IASPMMCommand<ASPMM.resource.ASPMM.IASPMMTextResource>>();
	
	public ASPMMParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<ASPMM.resource.ASPMM.IASPMMCommand<ASPMM.resource.ASPMM.IASPMMTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
