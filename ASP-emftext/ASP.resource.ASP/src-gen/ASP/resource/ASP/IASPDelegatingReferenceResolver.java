/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP;

/**
 * A delegating reference resolver is an extension of a normal reference resolver
 * that can be configured with another resolver that it may delegate method calls
 * to. This interface can be implemented by additional resolvers to customize
 * resolving using the load option ADDITIONAL_REFERENCE_RESOLVERS.
 * 
 * @see ASP.resource.ASP.IASPOptions
 */
public interface IASPDelegatingReferenceResolver<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> extends ASP.resource.ASP.IASPReferenceResolver<ContainerType, ReferenceType> {
	
	/**
	 * Sets the delegate for this resolver.
	 */
	public void setDelegate(ASP.resource.ASP.IASPReferenceResolver<ContainerType, ReferenceType> delegate);
	
}
