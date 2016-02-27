/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.grammar;

public class JTLMMCompound extends JTLMM.resource.JTLMM.grammar.JTLMMSyntaxElement {
	
	public JTLMMCompound(JTLMM.resource.JTLMM.grammar.JTLMMChoice choice, JTLMM.resource.JTLMM.grammar.JTLMMCardinality cardinality) {
		super(cardinality, new JTLMM.resource.JTLMM.grammar.JTLMMSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
