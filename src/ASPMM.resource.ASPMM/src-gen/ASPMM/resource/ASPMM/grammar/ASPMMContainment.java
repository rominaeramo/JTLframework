/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.grammar;

public class ASPMMContainment extends ASPMM.resource.ASPMM.grammar.ASPMMTerminal {
	
	private final org.eclipse.emf.ecore.EClass[] allowedTypes;
	
	public ASPMMContainment(org.eclipse.emf.ecore.EStructuralFeature feature, ASPMM.resource.ASPMM.grammar.ASPMMCardinality cardinality, org.eclipse.emf.ecore.EClass[] allowedTypes, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.allowedTypes = allowedTypes;
	}
	
	public org.eclipse.emf.ecore.EClass[] getAllowedTypes() {
		return allowedTypes;
	}
	
	public String toString() {
		String typeRestrictions = null;
		if (allowedTypes != null && allowedTypes.length > 0) {
			typeRestrictions = ASPMM.resource.ASPMM.util.ASPMMStringUtil.explode(allowedTypes, ", ", new ASPMM.resource.ASPMM.IASPMMFunction1<String, org.eclipse.emf.ecore.EClass>() {
				public String execute(org.eclipse.emf.ecore.EClass eClass) {
					return eClass.getName();
				}
			});
		}
		return getFeature().getName() + (typeRestrictions == null ? "" : "[" + typeRestrictions + "]");
	}
	
}
