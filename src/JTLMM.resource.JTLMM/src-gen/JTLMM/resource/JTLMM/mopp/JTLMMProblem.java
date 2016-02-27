/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.mopp;

public class JTLMMProblem implements JTLMM.resource.JTLMM.IJTLMMProblem {
	
	private String message;
	private JTLMM.resource.JTLMM.JTLMMEProblemType type;
	private JTLMM.resource.JTLMM.JTLMMEProblemSeverity severity;
	private java.util.Collection<JTLMM.resource.JTLMM.IJTLMMQuickFix> quickFixes;
	
	public JTLMMProblem(String message, JTLMM.resource.JTLMM.JTLMMEProblemType type, JTLMM.resource.JTLMM.JTLMMEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<JTLMM.resource.JTLMM.IJTLMMQuickFix>emptySet());
	}
	
	public JTLMMProblem(String message, JTLMM.resource.JTLMM.JTLMMEProblemType type, JTLMM.resource.JTLMM.JTLMMEProblemSeverity severity, JTLMM.resource.JTLMM.IJTLMMQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public JTLMMProblem(String message, JTLMM.resource.JTLMM.JTLMMEProblemType type, JTLMM.resource.JTLMM.JTLMMEProblemSeverity severity, java.util.Collection<JTLMM.resource.JTLMM.IJTLMMQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<JTLMM.resource.JTLMM.IJTLMMQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public JTLMM.resource.JTLMM.JTLMMEProblemType getType() {
		return type;
	}
	
	public JTLMM.resource.JTLMM.JTLMMEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<JTLMM.resource.JTLMM.IJTLMMQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
