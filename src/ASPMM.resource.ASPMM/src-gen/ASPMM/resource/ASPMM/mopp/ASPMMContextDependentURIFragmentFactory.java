/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.mopp;

/**
 * A factory for ContextDependentURIFragments. Given a feasible reference
 * resolver, this factory returns a matching fragment that used the resolver to
 * resolver proxy objects.
 * 
 * @param <ContainerType> the type of the class containing the reference to be
 * resolved
 * @param <ReferenceType> the type of the reference to be resolved
 */
public class ASPMMContextDependentURIFragmentFactory<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject>  implements ASPMM.resource.ASPMM.IASPMMContextDependentURIFragmentFactory<ContainerType, ReferenceType> {
	
	private final ASPMM.resource.ASPMM.IASPMMReferenceResolver<ContainerType, ReferenceType> resolver;
	
	public ASPMMContextDependentURIFragmentFactory(ASPMM.resource.ASPMM.IASPMMReferenceResolver<ContainerType, ReferenceType> resolver) {
		this.resolver = resolver;
	}
	
	public ASPMM.resource.ASPMM.IASPMMContextDependentURIFragment<?> create(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy) {
		
		return new ASPMM.resource.ASPMM.mopp.ASPMMContextDependentURIFragment<ContainerType, ReferenceType>(identifier, container, reference, positionInReference, proxy) {
			public ASPMM.resource.ASPMM.IASPMMReferenceResolver<ContainerType, ReferenceType> getResolver() {
				return resolver;
			}
		};
	}
}
