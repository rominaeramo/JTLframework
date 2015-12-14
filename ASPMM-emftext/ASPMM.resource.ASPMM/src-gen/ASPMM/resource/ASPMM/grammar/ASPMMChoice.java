/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.grammar;

public class ASPMMChoice extends ASPMM.resource.ASPMM.grammar.ASPMMSyntaxElement {
	
	public ASPMMChoice(ASPMM.resource.ASPMM.grammar.ASPMMCardinality cardinality, ASPMM.resource.ASPMM.grammar.ASPMMSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return ASPMM.resource.ASPMM.util.ASPMMStringUtil.explode(getChildren(), "|");
	}
	
}
