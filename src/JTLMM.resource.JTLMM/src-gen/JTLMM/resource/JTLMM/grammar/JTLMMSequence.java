/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.grammar;

public class JTLMMSequence extends JTLMM.resource.JTLMM.grammar.JTLMMSyntaxElement {
	
	public JTLMMSequence(JTLMM.resource.JTLMM.grammar.JTLMMCardinality cardinality, JTLMM.resource.JTLMM.grammar.JTLMMSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return JTLMM.resource.JTLMM.util.JTLMMStringUtil.explode(getChildren(), " ");
	}
	
}
