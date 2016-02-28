/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM;

/**
 * An interface used to access the result of parsing a document.
 */
public interface IASPMParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<ASPM.resource.ASPM.IASPMCommand<ASPM.resource.ASPM.IASPMTextResource>> getPostParseCommands();
	
}
