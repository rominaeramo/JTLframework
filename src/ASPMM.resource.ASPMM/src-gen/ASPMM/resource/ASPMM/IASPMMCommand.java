/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IASPMMCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
