/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.mopp;

/**
 * A representation for a range in a document where a boolean attribute is
 * expected.
 */
public class ASPExpectedBooleanTerminal extends ASP.resource.ASP.mopp.ASPAbstractExpectedElement {
	
	private ASP.resource.ASP.grammar.ASPBooleanTerminal booleanTerminal;
	
	public ASPExpectedBooleanTerminal(ASP.resource.ASP.grammar.ASPBooleanTerminal booleanTerminal) {
		super(booleanTerminal.getMetaclass());
		this.booleanTerminal = booleanTerminal;
	}
	
	public ASP.resource.ASP.grammar.ASPBooleanTerminal getBooleanTerminal() {
		return booleanTerminal;
	}
	
	/**
	 * Returns the expected boolean terminal.
	 */
	public ASP.resource.ASP.grammar.ASPSyntaxElement getSymtaxElement() {
		return booleanTerminal;
	}
	
	private org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return booleanTerminal.getFeature();
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof ASPExpectedBooleanTerminal) {
			return getFeature().equals(((ASPExpectedBooleanTerminal) o).getFeature());
		}
		return false;
	}
	
	@Override	
	public int hashCode() {
		return getFeature().hashCode();
	}
	
	public java.util.Set<String> getTokenNames() {
		// BooleanTerminals are associated with two or one token(s)
		java.util.Set<String> tokenNames = new java.util.LinkedHashSet<String>(2);
		String trueLiteral = booleanTerminal.getTrueLiteral();
		if (!"".equals(trueLiteral)) {
			tokenNames.add("'" + trueLiteral + "'");
		}
		String falseLiteral = booleanTerminal.getFalseLiteral();
		if (!"".equals(falseLiteral)) {
			tokenNames.add("'" + falseLiteral + "'");
		}
		return tokenNames;
	}
	
}
