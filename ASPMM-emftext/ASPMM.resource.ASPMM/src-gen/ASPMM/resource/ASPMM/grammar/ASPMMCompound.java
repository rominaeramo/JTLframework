/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.grammar;

public class ASPMMCompound extends ASPMM.resource.ASPMM.grammar.ASPMMSyntaxElement {
	
	public ASPMMCompound(ASPMM.resource.ASPMM.grammar.ASPMMChoice choice, ASPMM.resource.ASPMM.grammar.ASPMMCardinality cardinality) {
		super(cardinality, new ASPMM.resource.ASPMM.grammar.ASPMMSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
