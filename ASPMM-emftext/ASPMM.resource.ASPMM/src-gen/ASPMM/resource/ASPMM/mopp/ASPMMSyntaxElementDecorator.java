/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.mopp;

public class ASPMMSyntaxElementDecorator {
	
	/**
	 * the syntax element to be decorated
	 */
	private ASPMM.resource.ASPMM.grammar.ASPMMSyntaxElement decoratedElement;
	
	/**
	 * an array of child decorators (one decorator per child of the decorated syntax
	 * element
	 */
	private ASPMMSyntaxElementDecorator[] childDecorators;
	
	/**
	 * a list of the indices that must be printed
	 */
	private java.util.List<Integer> indicesToPrint = new java.util.ArrayList<Integer>();
	
	public ASPMMSyntaxElementDecorator(ASPMM.resource.ASPMM.grammar.ASPMMSyntaxElement decoratedElement, ASPMMSyntaxElementDecorator[] childDecorators) {
		super();
		this.decoratedElement = decoratedElement;
		this.childDecorators = childDecorators;
	}
	
	public void addIndexToPrint(Integer index) {
		indicesToPrint.add(index);
	}
	
	public ASPMM.resource.ASPMM.grammar.ASPMMSyntaxElement getDecoratedElement() {
		return decoratedElement;
	}
	
	public ASPMMSyntaxElementDecorator[] getChildDecorators() {
		return childDecorators;
	}
	
	public Integer getNextIndexToPrint() {
		if (indicesToPrint.size() == 0) {
			return null;
		}
		return indicesToPrint.remove(0);
	}
	
	public String toString() {
		return "" + getDecoratedElement();
	}
	
}
