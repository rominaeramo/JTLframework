/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class ASPMSyntaxElement {
	
	private ASPMSyntaxElement[] children;
	private ASPMSyntaxElement parent;
	private ASPM.resource.ASPM.grammar.ASPMCardinality cardinality;
	
	public ASPMSyntaxElement(ASPM.resource.ASPM.grammar.ASPMCardinality cardinality, ASPMSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (ASPMSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	/**
	 * Sets the parent of this syntax element. This method must be invoked at most
	 * once.
	 */
	public void setParent(ASPMSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	/**
	 * Returns the parent of this syntax element. This parent is determined by the
	 * containment hierarchy in the CS model.
	 */
	public ASPMSyntaxElement getParent() {
		return parent;
	}
	
	public ASPMSyntaxElement[] getChildren() {
		if (children == null) {
			return new ASPMSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public ASPM.resource.ASPM.grammar.ASPMCardinality getCardinality() {
		return cardinality;
	}
	
}
