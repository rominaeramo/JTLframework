/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM;

/**
 * An interface used to access the result of parsing a document.
 */
public interface IJTLMMParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<JTLMM.resource.JTLMM.IJTLMMCommand<JTLMM.resource.JTLMM.IJTLMMTextResource>> getPostParseCommands();
	
}
