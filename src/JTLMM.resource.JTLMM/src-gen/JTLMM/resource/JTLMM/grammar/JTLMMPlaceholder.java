/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class JTLMMPlaceholder extends JTLMM.resource.JTLMM.grammar.JTLMMTerminal {
	
	private final String tokenName;
	
	public JTLMMPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, JTLMM.resource.JTLMM.grammar.JTLMMCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
