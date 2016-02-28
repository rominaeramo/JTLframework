/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class ASPMRule extends ASPM.resource.ASPM.grammar.ASPMSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public ASPMRule(org.eclipse.emf.ecore.EClass metaclass, ASPM.resource.ASPM.grammar.ASPMChoice choice, ASPM.resource.ASPM.grammar.ASPMCardinality cardinality) {
		super(cardinality, new ASPM.resource.ASPM.grammar.ASPMSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public ASPM.resource.ASPM.grammar.ASPMChoice getDefinition() {
		return (ASPM.resource.ASPM.grammar.ASPMChoice) getChildren()[0];
	}
	
}

