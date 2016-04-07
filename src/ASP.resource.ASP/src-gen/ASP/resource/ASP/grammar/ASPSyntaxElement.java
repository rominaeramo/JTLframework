/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class ASPSyntaxElement {
	
	private ASPSyntaxElement[] children;
	private ASPSyntaxElement parent;
	private ASP.resource.ASP.grammar.ASPCardinality cardinality;
	
	public ASPSyntaxElement(ASP.resource.ASP.grammar.ASPCardinality cardinality, ASPSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (ASPSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	/**
	 * Sets the parent of this syntax element. This method must be invoked at most
	 * once.
	 */
	public void setParent(ASPSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	/**
	 * Returns the parent of this syntax element. This parent is determined by the
	 * containment hierarchy in the CS model.
	 */
	public ASPSyntaxElement getParent() {
		return parent;
	}
	
	public ASPSyntaxElement[] getChildren() {
		if (children == null) {
			return new ASPSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public ASP.resource.ASP.grammar.ASPCardinality getCardinality() {
		return cardinality;
	}
	
}
