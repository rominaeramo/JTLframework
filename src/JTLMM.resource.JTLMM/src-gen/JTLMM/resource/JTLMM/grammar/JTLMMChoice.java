/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.grammar;

public class JTLMMChoice extends JTLMM.resource.JTLMM.grammar.JTLMMSyntaxElement {
	
	public JTLMMChoice(JTLMM.resource.JTLMM.grammar.JTLMMCardinality cardinality, JTLMM.resource.JTLMM.grammar.JTLMMSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return JTLMM.resource.JTLMM.util.JTLMMStringUtil.explode(getChildren(), "|");
	}
	
}
