/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.mopp;

public class ASPMProblem implements ASPM.resource.ASPM.IASPMProblem {
	
	private String message;
	private ASPM.resource.ASPM.ASPMEProblemType type;
	private ASPM.resource.ASPM.ASPMEProblemSeverity severity;
	private java.util.Collection<ASPM.resource.ASPM.IASPMQuickFix> quickFixes;
	
	public ASPMProblem(String message, ASPM.resource.ASPM.ASPMEProblemType type, ASPM.resource.ASPM.ASPMEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<ASPM.resource.ASPM.IASPMQuickFix>emptySet());
	}
	
	public ASPMProblem(String message, ASPM.resource.ASPM.ASPMEProblemType type, ASPM.resource.ASPM.ASPMEProblemSeverity severity, ASPM.resource.ASPM.IASPMQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public ASPMProblem(String message, ASPM.resource.ASPM.ASPMEProblemType type, ASPM.resource.ASPM.ASPMEProblemSeverity severity, java.util.Collection<ASPM.resource.ASPM.IASPMQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<ASPM.resource.ASPM.IASPMQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public ASPM.resource.ASPM.ASPMEProblemType getType() {
		return type;
	}
	
	public ASPM.resource.ASPM.ASPMEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<ASPM.resource.ASPM.IASPMQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
