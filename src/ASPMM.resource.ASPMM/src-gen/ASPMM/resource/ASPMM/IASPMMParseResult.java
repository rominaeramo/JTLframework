/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM;

/**
 * An interface used to access the result of parsing a document.
 */
public interface IASPMMParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<ASPMM.resource.ASPMM.IASPMMCommand<ASPMM.resource.ASPMM.IASPMMTextResource>> getPostParseCommands();
	
}
