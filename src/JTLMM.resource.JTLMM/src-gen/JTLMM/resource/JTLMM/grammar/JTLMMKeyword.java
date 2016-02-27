/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class JTLMMKeyword extends JTLMM.resource.JTLMM.grammar.JTLMMSyntaxElement {
	
	private final String value;
	
	public JTLMMKeyword(String value, JTLMM.resource.JTLMM.grammar.JTLMMCardinality cardinality) {
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
