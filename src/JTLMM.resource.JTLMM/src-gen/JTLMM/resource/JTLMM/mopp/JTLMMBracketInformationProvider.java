/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.mopp;

public class JTLMMBracketInformationProvider {
	
	public class BracketPair implements JTLMM.resource.JTLMM.IJTLMMBracketPair {
		
		private String opening;
		private String closing;
		private boolean closingEnabledInside;
		
		public BracketPair(String opening, String closing, boolean closingEnabledInside) {
			super();
			this.opening = opening;
			this.closing = closing;
			this.closingEnabledInside = closingEnabledInside;
		}
		
		public String getOpeningBracket() {
			return opening;
		}
		
		public String getClosingBracket() {
			return closing;
		}
		
		public boolean isClosingEnabledInside() {
			return closingEnabledInside;
		}
	}
	
	public java.util.Collection<JTLMM.resource.JTLMM.IJTLMMBracketPair> getBracketPairs() {
		java.util.Collection<JTLMM.resource.JTLMM.IJTLMMBracketPair> result = new java.util.ArrayList<JTLMM.resource.JTLMM.IJTLMMBracketPair>();
		result.add(new BracketPair("{", "}", true));
		result.add(new BracketPair("(", ")", true));
		return result;
	}
	
}
