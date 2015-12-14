/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.grammar;

public class ASPMMLineBreak extends ASPMM.resource.ASPMM.grammar.ASPMMFormattingElement {
	
	private final int tabs;
	
	public ASPMMLineBreak(ASPMM.resource.ASPMM.grammar.ASPMMCardinality cardinality, int tabs) {
		super(cardinality);
		this.tabs = tabs;
	}
	
	public int getTabs() {
		return tabs;
	}
	
	public String toString() {
		return "!" + getTabs();
	}
	
}
