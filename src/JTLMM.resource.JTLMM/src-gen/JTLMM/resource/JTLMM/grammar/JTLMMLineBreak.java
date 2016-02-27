/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.grammar;

public class JTLMMLineBreak extends JTLMM.resource.JTLMM.grammar.JTLMMFormattingElement {
	
	private final int tabs;
	
	public JTLMMLineBreak(JTLMM.resource.JTLMM.grammar.JTLMMCardinality cardinality, int tabs) {
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
