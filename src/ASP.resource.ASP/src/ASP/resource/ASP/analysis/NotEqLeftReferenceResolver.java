/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.analysis;

public class NotEqLeftReferenceResolver implements ASP.resource.ASP.IASPReferenceResolver<ASP.NotEq, ASP.Literal> {
	
	private ASP.resource.ASP.analysis.ASPDefaultResolverDelegate<ASP.NotEq, ASP.Literal> delegate = new ASP.resource.ASP.analysis.ASPDefaultResolverDelegate<ASP.NotEq, ASP.Literal>();
	
	public void resolve(String identifier, ASP.NotEq container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final ASP.resource.ASP.IASPReferenceResolveResult<ASP.Literal> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(ASP.Literal element, ASP.NotEq container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
