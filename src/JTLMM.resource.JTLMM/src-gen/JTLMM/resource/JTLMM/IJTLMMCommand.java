/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IJTLMMCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
