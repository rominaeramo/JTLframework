/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.analysis;

public class NotElementReferenceResolver implements ASP.resource.ASP.IASPReferenceResolver<ASP.Not, ASP.Element> {
	
	private ASP.resource.ASP.analysis.ASPDefaultResolverDelegate<ASP.Not, ASP.Element> delegate = new ASP.resource.ASP.analysis.ASPDefaultResolverDelegate<ASP.Not, ASP.Element>();
	
	public void resolve(String identifier, ASP.Not container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final ASP.resource.ASP.IASPReferenceResolveResult<ASP.Element> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(ASP.Element element, ASP.Not container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
