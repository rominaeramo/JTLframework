/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.grammar;

public class JTLMMContainment extends JTLMM.resource.JTLMM.grammar.JTLMMTerminal {
	
	private final org.eclipse.emf.ecore.EClass[] allowedTypes;
	
	public JTLMMContainment(org.eclipse.emf.ecore.EStructuralFeature feature, JTLMM.resource.JTLMM.grammar.JTLMMCardinality cardinality, org.eclipse.emf.ecore.EClass[] allowedTypes, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.allowedTypes = allowedTypes;
	}
	
	public org.eclipse.emf.ecore.EClass[] getAllowedTypes() {
		return allowedTypes;
	}
	
	public String toString() {
		String typeRestrictions = null;
		if (allowedTypes != null && allowedTypes.length > 0) {
			typeRestrictions = JTLMM.resource.JTLMM.util.JTLMMStringUtil.explode(allowedTypes, ", ", new JTLMM.resource.JTLMM.IJTLMMFunction1<String, org.eclipse.emf.ecore.EClass>() {
				public String execute(org.eclipse.emf.ecore.EClass eClass) {
					return eClass.getName();
				}
			});
		}
		return getFeature().getName() + (typeRestrictions == null ? "" : "[" + typeRestrictions + "]");
	}
	
}
