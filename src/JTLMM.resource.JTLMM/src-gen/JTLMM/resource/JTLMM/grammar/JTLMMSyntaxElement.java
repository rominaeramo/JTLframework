/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class JTLMMSyntaxElement {
	
	private JTLMMSyntaxElement[] children;
	private JTLMMSyntaxElement parent;
	private JTLMM.resource.JTLMM.grammar.JTLMMCardinality cardinality;
	
	public JTLMMSyntaxElement(JTLMM.resource.JTLMM.grammar.JTLMMCardinality cardinality, JTLMMSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (JTLMMSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	/**
	 * Sets the parent of this syntax element. This method must be invoked at most
	 * once.
	 */
	public void setParent(JTLMMSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	/**
	 * Returns the parent of this syntax element. This parent is determined by the
	 * containment hierarchy in the CS model.
	 */
	public JTLMMSyntaxElement getParent() {
		return parent;
	}
	
	public JTLMMSyntaxElement[] getChildren() {
		if (children == null) {
			return new JTLMMSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public JTLMM.resource.JTLMM.grammar.JTLMMCardinality getCardinality() {
		return cardinality;
	}
	
}
