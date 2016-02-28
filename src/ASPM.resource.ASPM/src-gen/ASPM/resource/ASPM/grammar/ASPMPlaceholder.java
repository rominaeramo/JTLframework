/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class ASPMPlaceholder extends ASPM.resource.ASPM.grammar.ASPMTerminal {
	
	private final String tokenName;
	
	public ASPMPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, ASPM.resource.ASPM.grammar.ASPMCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
