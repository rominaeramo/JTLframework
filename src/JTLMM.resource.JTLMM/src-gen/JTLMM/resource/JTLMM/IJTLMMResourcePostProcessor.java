/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM;

/**
 * Implementors of this interface can be used to post-process parsed text
 * resources. This can be useful to validate or modify the model that was
 * instantiated for the text.
 */
public interface IJTLMMResourcePostProcessor {
	
	/**
	 * Processes the resource after it was parsed. This method is automatically called
	 * for registered post processors.
	 * 
	 * @param resource the resource to validate of modify
	 */
	public void process(JTLMM.resource.JTLMM.mopp.JTLMMResource resource);
	
	/**
	 * This method is called to request the post processor to terminate. It is called
	 * from a different thread than the one that called process(). Terminating post
	 * processors is required when text resources are parsed in the background.
	 * Implementing this method is optional.
	 */
	public void terminate();
	
}
