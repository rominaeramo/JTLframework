/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.mopp;

/**
 * A factory for ContextDependentURIFragments. Given a feasible reference
 * resolver, this factory returns a matching fragment that used the resolver to
 * resolver proxy objects.
 * 
 * @param <ContainerType> the type of the class containing the reference to be
 * resolved
 * @param <ReferenceType> the type of the reference to be resolved
 */
public class JTLMMContextDependentURIFragmentFactory<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject>  implements JTLMM.resource.JTLMM.IJTLMMContextDependentURIFragmentFactory<ContainerType, ReferenceType> {
	
	private final JTLMM.resource.JTLMM.IJTLMMReferenceResolver<ContainerType, ReferenceType> resolver;
	
	public JTLMMContextDependentURIFragmentFactory(JTLMM.resource.JTLMM.IJTLMMReferenceResolver<ContainerType, ReferenceType> resolver) {
		this.resolver = resolver;
	}
	
	public JTLMM.resource.JTLMM.IJTLMMContextDependentURIFragment<?> create(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy) {
		
		return new JTLMM.resource.JTLMM.mopp.JTLMMContextDependentURIFragment<ContainerType, ReferenceType>(identifier, container, reference, positionInReference, proxy) {
			public JTLMM.resource.JTLMM.IJTLMMReferenceResolver<ContainerType, ReferenceType> getResolver() {
				return resolver;
			}
		};
	}
}
