/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.grammar;

public class ASPMContainment extends ASPM.resource.ASPM.grammar.ASPMTerminal {
	
	private final org.eclipse.emf.ecore.EClass[] allowedTypes;
	
	public ASPMContainment(org.eclipse.emf.ecore.EStructuralFeature feature, ASPM.resource.ASPM.grammar.ASPMCardinality cardinality, org.eclipse.emf.ecore.EClass[] allowedTypes, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.allowedTypes = allowedTypes;
	}
	
	public org.eclipse.emf.ecore.EClass[] getAllowedTypes() {
		return allowedTypes;
	}
	
	public String toString() {
		String typeRestrictions = null;
		if (allowedTypes != null && allowedTypes.length > 0) {
			typeRestrictions = ASPM.resource.ASPM.util.ASPMStringUtil.explode(allowedTypes, ", ", new ASPM.resource.ASPM.IASPMFunction1<String, org.eclipse.emf.ecore.EClass>() {
				public String execute(org.eclipse.emf.ecore.EClass eClass) {
					return eClass.getName();
				}
			});
		}
		return getFeature().getName() + (typeRestrictions == null ? "" : "[" + typeRestrictions + "]");
	}
	
}
