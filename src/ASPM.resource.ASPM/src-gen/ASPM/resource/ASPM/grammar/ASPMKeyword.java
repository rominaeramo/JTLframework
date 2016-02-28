/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class ASPMKeyword extends ASPM.resource.ASPM.grammar.ASPMSyntaxElement {
	
	private final String value;
	
	public ASPMKeyword(String value, ASPM.resource.ASPM.grammar.ASPMCardinality cardinality) {
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
