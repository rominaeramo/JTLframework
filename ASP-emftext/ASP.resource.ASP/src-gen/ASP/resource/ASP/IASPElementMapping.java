/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP;

/**
 * A mapping from an identifier to an EObject.
 * 
 * @param <ReferenceType> the type of the reference this mapping points to.
 */
public interface IASPElementMapping<ReferenceType> extends ASP.resource.ASP.IASPReferenceMapping<ReferenceType> {
	
	/**
	 * Returns the target object the identifier is mapped to.
	 */
	public ReferenceType getTargetElement();
}
