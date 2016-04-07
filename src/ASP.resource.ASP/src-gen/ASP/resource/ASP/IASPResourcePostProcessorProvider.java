/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface IASPResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public ASP.resource.ASP.IASPResourcePostProcessor getResourcePostProcessor();
	
}
