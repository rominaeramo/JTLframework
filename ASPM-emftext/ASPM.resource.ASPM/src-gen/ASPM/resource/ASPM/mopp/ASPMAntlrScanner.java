/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.mopp;

public class ASPMAntlrScanner implements ASPM.resource.ASPM.IASPMTextScanner {
	
	private org.antlr.runtime3_4_0.Lexer antlrLexer;
	
	public ASPMAntlrScanner(org.antlr.runtime3_4_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public ASPM.resource.ASPM.IASPMTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_4_0.Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		ASPM.resource.ASPM.IASPMTextToken result = new ASPM.resource.ASPM.mopp.ASPMANTLRTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_4_0.ANTLRStringStream(text));
	}
	
}
