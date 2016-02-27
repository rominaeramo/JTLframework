/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.mopp;

public class JTLMMSyntaxElementDecorator {
	
	/**
	 * the syntax element to be decorated
	 */
	private JTLMM.resource.JTLMM.grammar.JTLMMSyntaxElement decoratedElement;
	
	/**
	 * an array of child decorators (one decorator per child of the decorated syntax
	 * element
	 */
	private JTLMMSyntaxElementDecorator[] childDecorators;
	
	/**
	 * a list of the indices that must be printed
	 */
	private java.util.List<Integer> indicesToPrint = new java.util.ArrayList<Integer>();
	
	public JTLMMSyntaxElementDecorator(JTLMM.resource.JTLMM.grammar.JTLMMSyntaxElement decoratedElement, JTLMMSyntaxElementDecorator[] childDecorators) {
		super();
		this.decoratedElement = decoratedElement;
		this.childDecorators = childDecorators;
	}
	
	public void addIndexToPrint(Integer index) {
		indicesToPrint.add(index);
	}
	
	public JTLMM.resource.JTLMM.grammar.JTLMMSyntaxElement getDecoratedElement() {
		return decoratedElement;
	}
	
	public JTLMMSyntaxElementDecorator[] getChildDecorators() {
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
