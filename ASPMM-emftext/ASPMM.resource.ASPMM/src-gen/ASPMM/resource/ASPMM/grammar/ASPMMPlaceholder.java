/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class ASPMMPlaceholder extends ASPMM.resource.ASPMM.grammar.ASPMMTerminal {
	
	private final String tokenName;
	
	public ASPMMPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, ASPMM.resource.ASPMM.grammar.ASPMMCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
