/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class ASPMExpectedCsString extends ASPM.resource.ASPM.mopp.ASPMAbstractExpectedElement {
	
	private ASPM.resource.ASPM.grammar.ASPMKeyword keyword;
	
	public ASPMExpectedCsString(ASPM.resource.ASPM.grammar.ASPMKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	/**
	 * Returns the expected keyword.
	 */
	public ASPM.resource.ASPM.grammar.ASPMSyntaxElement getSymtaxElement() {
		return keyword;
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton("'" + getValue() + "'");
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof ASPMExpectedCsString) {
			return getValue().equals(((ASPMExpectedCsString) o).getValue());
		}
		return false;
	}
	
	@Override	
	public int hashCode() {
		return getValue().hashCode();
	}
	
}
