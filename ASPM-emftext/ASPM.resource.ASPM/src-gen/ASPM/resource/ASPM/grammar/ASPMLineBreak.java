/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.grammar;

public class ASPMLineBreak extends ASPM.resource.ASPM.grammar.ASPMFormattingElement {
	
	private final int tabs;
	
	public ASPMLineBreak(ASPM.resource.ASPM.grammar.ASPMCardinality cardinality, int tabs) {
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
