/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.grammar;

public class ASPCompound extends ASP.resource.ASP.grammar.ASPSyntaxElement {
	
	public ASPCompound(ASP.resource.ASP.grammar.ASPChoice choice, ASP.resource.ASP.grammar.ASPCardinality cardinality) {
		super(cardinality, new ASP.resource.ASP.grammar.ASPSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
