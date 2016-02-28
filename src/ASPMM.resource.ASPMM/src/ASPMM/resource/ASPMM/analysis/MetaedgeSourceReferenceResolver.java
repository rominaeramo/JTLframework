/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.analysis;

public class MetaedgeSourceReferenceResolver implements ASPMM.resource.ASPMM.IASPMMReferenceResolver<ASPMM.Metaedge, ASPMM.Metanode> {
	
	private ASPMM.resource.ASPMM.analysis.ASPMMDefaultResolverDelegate<ASPMM.Metaedge, ASPMM.Metanode> delegate = new ASPMM.resource.ASPMM.analysis.ASPMMDefaultResolverDelegate<ASPMM.Metaedge, ASPMM.Metanode>();
	
	public void resolve(String identifier, ASPMM.Metaedge container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final ASPMM.resource.ASPMM.IASPMMReferenceResolveResult<ASPMM.Metanode> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(ASPMM.Metanode element, ASPMM.Metaedge container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
