/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IASPCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
