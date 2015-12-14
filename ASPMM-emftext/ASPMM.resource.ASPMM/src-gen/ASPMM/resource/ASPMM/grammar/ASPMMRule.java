/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class ASPMMRule extends ASPMM.resource.ASPMM.grammar.ASPMMSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public ASPMMRule(org.eclipse.emf.ecore.EClass metaclass, ASPMM.resource.ASPMM.grammar.ASPMMChoice choice, ASPMM.resource.ASPMM.grammar.ASPMMCardinality cardinality) {
		super(cardinality, new ASPMM.resource.ASPMM.grammar.ASPMMSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public ASPMM.resource.ASPMM.grammar.ASPMMChoice getDefinition() {
		return (ASPMM.resource.ASPMM.grammar.ASPMMChoice) getChildren()[0];
	}
	
}

