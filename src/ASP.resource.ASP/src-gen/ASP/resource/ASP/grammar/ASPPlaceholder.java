/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class ASPPlaceholder extends ASP.resource.ASP.grammar.ASPTerminal {
	
	private final String tokenName;
	
	public ASPPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, ASP.resource.ASP.grammar.ASPCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
