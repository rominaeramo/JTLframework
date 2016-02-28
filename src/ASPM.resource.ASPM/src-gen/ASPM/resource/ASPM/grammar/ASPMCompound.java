/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.grammar;

public class ASPMCompound extends ASPM.resource.ASPM.grammar.ASPMSyntaxElement {
	
	public ASPMCompound(ASPM.resource.ASPM.grammar.ASPMChoice choice, ASPM.resource.ASPM.grammar.ASPMCardinality cardinality) {
		super(cardinality, new ASPM.resource.ASPM.grammar.ASPMSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
