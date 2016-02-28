/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.grammar;

public class ASPMChoice extends ASPM.resource.ASPM.grammar.ASPMSyntaxElement {
	
	public ASPMChoice(ASPM.resource.ASPM.grammar.ASPMCardinality cardinality, ASPM.resource.ASPM.grammar.ASPMSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return ASPM.resource.ASPM.util.ASPMStringUtil.explode(getChildren(), "|");
	}
	
}
