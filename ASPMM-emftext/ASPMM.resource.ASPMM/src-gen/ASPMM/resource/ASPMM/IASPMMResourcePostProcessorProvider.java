/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface IASPMMResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public ASPMM.resource.ASPMM.IASPMMResourcePostProcessor getResourcePostProcessor();
	
}
