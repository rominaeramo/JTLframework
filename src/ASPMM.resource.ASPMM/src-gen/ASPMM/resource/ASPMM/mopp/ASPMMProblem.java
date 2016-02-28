/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.mopp;

public class ASPMMProblem implements ASPMM.resource.ASPMM.IASPMMProblem {
	
	private String message;
	private ASPMM.resource.ASPMM.ASPMMEProblemType type;
	private ASPMM.resource.ASPMM.ASPMMEProblemSeverity severity;
	private java.util.Collection<ASPMM.resource.ASPMM.IASPMMQuickFix> quickFixes;
	
	public ASPMMProblem(String message, ASPMM.resource.ASPMM.ASPMMEProblemType type, ASPMM.resource.ASPMM.ASPMMEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<ASPMM.resource.ASPMM.IASPMMQuickFix>emptySet());
	}
	
	public ASPMMProblem(String message, ASPMM.resource.ASPMM.ASPMMEProblemType type, ASPMM.resource.ASPMM.ASPMMEProblemSeverity severity, ASPMM.resource.ASPMM.IASPMMQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public ASPMMProblem(String message, ASPMM.resource.ASPMM.ASPMMEProblemType type, ASPMM.resource.ASPMM.ASPMMEProblemSeverity severity, java.util.Collection<ASPMM.resource.ASPMM.IASPMMQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<ASPMM.resource.ASPMM.IASPMMQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public ASPMM.resource.ASPMM.ASPMMEProblemType getType() {
		return type;
	}
	
	public ASPMM.resource.ASPMM.ASPMMEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<ASPMM.resource.ASPMM.IASPMMQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
