/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM;

/**
 * A delegating reference resolver is an extension of a normal reference resolver
 * that can be configured with another resolver that it may delegate method calls
 * to. This interface can be implemented by additional resolvers to customize
 * resolving using the load option ADDITIONAL_REFERENCE_RESOLVERS.
 * 
 * @see ASPM.resource.ASPM.IASPMOptions
 */
public interface IASPMDelegatingReferenceResolver<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> extends ASPM.resource.ASPM.IASPMReferenceResolver<ContainerType, ReferenceType> {
	
	/**
	 * Sets the delegate for this resolver.
	 */
	public void setDelegate(ASPM.resource.ASPM.IASPMReferenceResolver<ContainerType, ReferenceType> delegate);
	
}
