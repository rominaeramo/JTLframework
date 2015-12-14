/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.grammar;

public class ASPMMSequence extends ASPMM.resource.ASPMM.grammar.ASPMMSyntaxElement {
	
	public ASPMMSequence(ASPMM.resource.ASPMM.grammar.ASPMMCardinality cardinality, ASPMM.resource.ASPMM.grammar.ASPMMSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return ASPMM.resource.ASPMM.util.ASPMMStringUtil.explode(getChildren(), " ");
	}
	
}
