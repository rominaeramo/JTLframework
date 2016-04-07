/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.analysis;

public class EqRightReferenceResolver implements ASP.resource.ASP.IASPReferenceResolver<ASP.Eq, ASP.Literal> {
	
	private ASP.resource.ASP.analysis.ASPDefaultResolverDelegate<ASP.Eq, ASP.Literal> delegate = new ASP.resource.ASP.analysis.ASPDefaultResolverDelegate<ASP.Eq, ASP.Literal>();
	
	public void resolve(String identifier, ASP.Eq container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final ASP.resource.ASP.IASPReferenceResolveResult<ASP.Literal> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(ASP.Literal element, ASP.Eq container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
