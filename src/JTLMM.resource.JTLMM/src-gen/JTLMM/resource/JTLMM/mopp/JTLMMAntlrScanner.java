/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.mopp;

public class JTLMMAntlrScanner implements JTLMM.resource.JTLMM.IJTLMMTextScanner {
	
	private org.antlr.runtime3_4_0.Lexer antlrLexer;
	
	public JTLMMAntlrScanner(org.antlr.runtime3_4_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public JTLMM.resource.JTLMM.IJTLMMTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_4_0.Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		JTLMM.resource.JTLMM.IJTLMMTextToken result = new JTLMM.resource.JTLMM.mopp.JTLMMANTLRTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_4_0.ANTLRStringStream(text));
	}
	
}
