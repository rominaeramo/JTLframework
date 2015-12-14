/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IASPMCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
