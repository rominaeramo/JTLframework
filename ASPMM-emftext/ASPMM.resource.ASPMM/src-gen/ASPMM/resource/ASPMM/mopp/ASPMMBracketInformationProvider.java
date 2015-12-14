/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.mopp;

public class ASPMMBracketInformationProvider {
	
	public class BracketPair implements ASPMM.resource.ASPMM.IASPMMBracketPair {
		
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
	
	public java.util.Collection<ASPMM.resource.ASPMM.IASPMMBracketPair> getBracketPairs() {
		java.util.Collection<ASPMM.resource.ASPMM.IASPMMBracketPair> result = new java.util.ArrayList<ASPMM.resource.ASPMM.IASPMMBracketPair>();
		result.add(new BracketPair("(", ")", true));
		return result;
	}
	
}
