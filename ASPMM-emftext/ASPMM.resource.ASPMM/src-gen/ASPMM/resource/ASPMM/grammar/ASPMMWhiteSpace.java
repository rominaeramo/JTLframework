/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.grammar;

public class ASPMMWhiteSpace extends ASPMM.resource.ASPMM.grammar.ASPMMFormattingElement {
	
	private final int amount;
	
	public ASPMMWhiteSpace(int amount, ASPMM.resource.ASPMM.grammar.ASPMMCardinality cardinality) {
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
