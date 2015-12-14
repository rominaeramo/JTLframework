/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.grammar;

public class ASPSequence extends ASP.resource.ASP.grammar.ASPSyntaxElement {
	
	public ASPSequence(ASP.resource.ASP.grammar.ASPCardinality cardinality, ASP.resource.ASP.grammar.ASPSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return ASP.resource.ASP.util.ASPStringUtil.explode(getChildren(), " ");
	}
	
}
