/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.grammar;

public class JTLMMWhiteSpace extends JTLMM.resource.JTLMM.grammar.JTLMMFormattingElement {
	
	private final int amount;
	
	public JTLMMWhiteSpace(int amount, JTLMM.resource.JTLMM.grammar.JTLMMCardinality cardinality) {
		super(cardinality);
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String toString() {
		return "#" + getAmount();
	}
	
}
