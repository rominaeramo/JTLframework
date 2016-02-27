/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class JTLMMExpectedCsString extends JTLMM.resource.JTLMM.mopp.JTLMMAbstractExpectedElement {
	
	private JTLMM.resource.JTLMM.grammar.JTLMMKeyword keyword;
	
	public JTLMMExpectedCsString(JTLMM.resource.JTLMM.grammar.JTLMMKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	/**
	 * Returns the expected keyword.
	 */
	public JTLMM.resource.JTLMM.grammar.JTLMMSyntaxElement getSymtaxElement() {
		return keyword;
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton("'" + getValue() + "'");
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof JTLMMExpectedCsString) {
			return getValue().equals(((JTLMMExpectedCsString) o).getValue());
		}
		return false;
	}
	
	@Override	
	public int hashCode() {
		return getValue().hashCode();
	}
	
}
