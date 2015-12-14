/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.grammar;

public class ASPWhiteSpace extends ASP.resource.ASP.grammar.ASPFormattingElement {
	
	private final int amount;
	
	public ASPWhiteSpace(int amount, ASP.resource.ASP.grammar.ASPCardinality cardinality) {
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
