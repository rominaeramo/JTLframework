/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class ASPMMExpectedCsString extends ASPMM.resource.ASPMM.mopp.ASPMMAbstractExpectedElement {
	
	private ASPMM.resource.ASPMM.grammar.ASPMMKeyword keyword;
	
	public ASPMMExpectedCsString(ASPMM.resource.ASPMM.grammar.ASPMMKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	/**
	 * Returns the expected keyword.
	 */
	public ASPMM.resource.ASPMM.grammar.ASPMMSyntaxElement getSymtaxElement() {
		return keyword;
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton("'" + getValue() + "'");
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof ASPMMExpectedCsString) {
			return getValue().equals(((ASPMMExpectedCsString) o).getValue());
		}
		return false;
	}
	
	@Override	
	public int hashCode() {
		return getValue().hashCode();
	}
	
}
