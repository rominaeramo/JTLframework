/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM;

/**
 * A mapping from an identifier to an EObject.
 * 
 * @param <ReferenceType> the type of the reference this mapping points to.
 */
public interface IASPMElementMapping<ReferenceType> extends ASPM.resource.ASPM.IASPMReferenceMapping<ReferenceType> {
	
	/**
	 * Returns the target object the identifier is mapped to.
	 */
	public ReferenceType getTargetElement();
}
