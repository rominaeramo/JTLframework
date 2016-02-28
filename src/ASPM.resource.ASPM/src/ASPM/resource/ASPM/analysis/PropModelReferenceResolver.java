/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.analysis;

public class PropModelReferenceResolver implements ASPM.resource.ASPM.IASPMReferenceResolver<ASPM.Prop, ASPM.Model> {
	
	private ASPM.resource.ASPM.analysis.ASPMDefaultResolverDelegate<ASPM.Prop, ASPM.Model> delegate = new ASPM.resource.ASPM.analysis.ASPMDefaultResolverDelegate<ASPM.Prop, ASPM.Model>();
	
	public void resolve(String identifier, ASPM.Prop container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final ASPM.resource.ASPM.IASPMReferenceResolveResult<ASPM.Model> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(ASPM.Model element, ASPM.Prop container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
