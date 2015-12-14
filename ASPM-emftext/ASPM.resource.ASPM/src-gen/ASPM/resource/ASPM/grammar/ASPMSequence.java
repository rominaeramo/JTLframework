/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.grammar;

public class ASPMSequence extends ASPM.resource.ASPM.grammar.ASPMSyntaxElement {
	
	public ASPMSequence(ASPM.resource.ASPM.grammar.ASPMCardinality cardinality, ASPM.resource.ASPM.grammar.ASPMSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return ASPM.resource.ASPM.util.ASPMStringUtil.explode(getChildren(), " ");
	}
	
}
