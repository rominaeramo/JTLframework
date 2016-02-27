/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class JTLMMRule extends JTLMM.resource.JTLMM.grammar.JTLMMSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public JTLMMRule(org.eclipse.emf.ecore.EClass metaclass, JTLMM.resource.JTLMM.grammar.JTLMMChoice choice, JTLMM.resource.JTLMM.grammar.JTLMMCardinality cardinality) {
		super(cardinality, new JTLMM.resource.JTLMM.grammar.JTLMMSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public JTLMM.resource.JTLMM.grammar.JTLMMChoice getDefinition() {
		return (JTLMM.resource.JTLMM.grammar.JTLMMChoice) getChildren()[0];
	}
	
}

