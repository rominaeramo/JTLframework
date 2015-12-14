/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.grammar;

public class ASPLineBreak extends ASP.resource.ASP.grammar.ASPFormattingElement {
	
	private final int tabs;
	
	public ASPLineBreak(ASP.resource.ASP.grammar.ASPCardinality cardinality, int tabs) {
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
