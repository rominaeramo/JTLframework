/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class ASPKeyword extends ASP.resource.ASP.grammar.ASPSyntaxElement {
	
	private final String value;
	
	public ASPKeyword(String value, ASP.resource.ASP.grammar.ASPCardinality cardinality) {
		super(cardinality, null);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}
