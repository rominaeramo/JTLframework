/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface IJTLMMResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public JTLMM.resource.JTLMM.IJTLMMResourcePostProcessor getResourcePostProcessor();
	
}
