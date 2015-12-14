/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.grammar;

public class ASPMTerminal extends ASPM.resource.ASPM.grammar.ASPMSyntaxElement {
	
	private final org.eclipse.emf.ecore.EStructuralFeature feature;
	private final int mandatoryOccurencesAfter;
	
	public ASPMTerminal(org.eclipse.emf.ecore.EStructuralFeature feature, ASPM.resource.ASPM.grammar.ASPMCardinality cardinality, int mandatoryOccurencesAfter) {
		super(cardinality, null);
		this.feature = feature;
		this.mandatoryOccurencesAfter = mandatoryOccurencesAfter;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return feature;
	}
	
	public int getMandatoryOccurencesAfter() {
		return mandatoryOccurencesAfter;
	}
	
	public String toString() {
		return feature.getName() + "[]";
	}
	
}
