/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.mopp;

public class ASPMMAntlrScanner implements ASPMM.resource.ASPMM.IASPMMTextScanner {
	
	private org.antlr.runtime3_4_0.Lexer antlrLexer;
	
	public ASPMMAntlrScanner(org.antlr.runtime3_4_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public ASPMM.resource.ASPMM.IASPMMTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_4_0.Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		ASPMM.resource.ASPMM.IASPMMTextToken result = new ASPMM.resource.ASPMM.mopp.ASPMMANTLRTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_4_0.ANTLRStringStream(text));
	}
	
}
