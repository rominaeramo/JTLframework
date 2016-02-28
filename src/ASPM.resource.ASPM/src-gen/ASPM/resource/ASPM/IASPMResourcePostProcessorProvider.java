/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface IASPMResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public ASPM.resource.ASPM.IASPMResourcePostProcessor getResourcePostProcessor();
	
}
