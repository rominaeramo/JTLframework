/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class ASPMMKeyword extends ASPMM.resource.ASPMM.grammar.ASPMMSyntaxElement {
	
	private final String value;
	
	public ASPMMKeyword(String value, ASPMM.resource.ASPMM.grammar.ASPMMCardinality cardinality) {
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
