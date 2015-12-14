/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.grammar;

public class ASPMWhiteSpace extends ASPM.resource.ASPM.grammar.ASPMFormattingElement {
	
	private final int amount;
	
	public ASPMWhiteSpace(int amount, ASPM.resource.ASPM.grammar.ASPMCardinality cardinality) {
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
