/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.grammar;

public class ASPChoice extends ASP.resource.ASP.grammar.ASPSyntaxElement {
	
	public ASPChoice(ASP.resource.ASP.grammar.ASPCardinality cardinality, ASP.resource.ASP.grammar.ASPSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return ASP.resource.ASP.util.ASPStringUtil.explode(getChildren(), "|");
	}
	
}
