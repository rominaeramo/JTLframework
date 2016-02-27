/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.mopp;

public class JTLMMParseResult implements JTLMM.resource.JTLMM.IJTLMMParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<JTLMM.resource.JTLMM.IJTLMMCommand<JTLMM.resource.JTLMM.IJTLMMTextResource>> commands = new java.util.ArrayList<JTLMM.resource.JTLMM.IJTLMMCommand<JTLMM.resource.JTLMM.IJTLMMTextResource>>();
	
	public JTLMMParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<JTLMM.resource.JTLMM.IJTLMMCommand<JTLMM.resource.JTLMM.IJTLMMTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
