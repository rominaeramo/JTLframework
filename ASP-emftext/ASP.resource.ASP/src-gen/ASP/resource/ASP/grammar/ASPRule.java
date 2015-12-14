/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class ASPRule extends ASP.resource.ASP.grammar.ASPSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public ASPRule(org.eclipse.emf.ecore.EClass metaclass, ASP.resource.ASP.grammar.ASPChoice choice, ASP.resource.ASP.grammar.ASPCardinality cardinality) {
		super(cardinality, new ASP.resource.ASP.grammar.ASPSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public ASP.resource.ASP.grammar.ASPChoice getDefinition() {
		return (ASP.resource.ASP.grammar.ASPChoice) getChildren()[0];
	}
	
}

