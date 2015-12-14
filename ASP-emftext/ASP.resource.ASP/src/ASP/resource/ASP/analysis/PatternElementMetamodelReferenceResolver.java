/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.analysis;

public class PatternElementMetamodelReferenceResolver implements ASP.resource.ASP.IASPReferenceResolver<ASP.PatternElement, ASP.Metamodel> {
	
	private ASP.resource.ASP.analysis.ASPDefaultResolverDelegate<ASP.PatternElement, ASP.Metamodel> delegate = new ASP.resource.ASP.analysis.ASPDefaultResolverDelegate<ASP.PatternElement, ASP.Metamodel>();
	
	public void resolve(String identifier, ASP.PatternElement container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final ASP.resource.ASP.IASPReferenceResolveResult<ASP.Metamodel> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(ASP.Metamodel element, ASP.PatternElement container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
