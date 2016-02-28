/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class ASPMMSyntaxElement {
	
	private ASPMMSyntaxElement[] children;
	private ASPMMSyntaxElement parent;
	private ASPMM.resource.ASPMM.grammar.ASPMMCardinality cardinality;
	
	public ASPMMSyntaxElement(ASPMM.resource.ASPMM.grammar.ASPMMCardinality cardinality, ASPMMSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (ASPMMSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	/**
	 * Sets the parent of this syntax element. This method must be invoked at most
	 * once.
	 */
	public void setParent(ASPMMSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	/**
	 * Returns the parent of this syntax element. This parent is determined by the
	 * containment hierarchy in the CS model.
	 */
	public ASPMMSyntaxElement getParent() {
		return parent;
	}
	
	public ASPMMSyntaxElement[] getChildren() {
		if (children == null) {
			return new ASPMMSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public ASPMM.resource.ASPMM.grammar.ASPMMCardinality getCardinality() {
		return cardinality;
	}
	
}
