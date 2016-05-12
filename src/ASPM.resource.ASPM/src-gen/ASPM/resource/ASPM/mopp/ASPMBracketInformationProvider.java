/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.mopp;

public class ASPMBracketInformationProvider {
	
	public class BracketPair implements ASPM.resource.ASPM.IASPMBracketPair {
		
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
	
	public java.util.Collection<ASPM.resource.ASPM.IASPMBracketPair> getBracketPairs() {
		java.util.Collection<ASPM.resource.ASPM.IASPMBracketPair> result = new java.util.ArrayList<ASPM.resource.ASPM.IASPMBracketPair>();
		result.add(new BracketPair("(", ")", true));
		result.add(new BracketPair("\"", "\"", true));
		return result;
	}
	
}
