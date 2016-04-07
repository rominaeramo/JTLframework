/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.mopp;

public class ASPProblem implements ASP.resource.ASP.IASPProblem {
	
	private String message;
	private ASP.resource.ASP.ASPEProblemType type;
	private ASP.resource.ASP.ASPEProblemSeverity severity;
	private java.util.Collection<ASP.resource.ASP.IASPQuickFix> quickFixes;
	
	public ASPProblem(String message, ASP.resource.ASP.ASPEProblemType type, ASP.resource.ASP.ASPEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<ASP.resource.ASP.IASPQuickFix>emptySet());
	}
	
	public ASPProblem(String message, ASP.resource.ASP.ASPEProblemType type, ASP.resource.ASP.ASPEProblemSeverity severity, ASP.resource.ASP.IASPQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public ASPProblem(String message, ASP.resource.ASP.ASPEProblemType type, ASP.resource.ASP.ASPEProblemSeverity severity, java.util.Collection<ASP.resource.ASP.IASPQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<ASP.resource.ASP.IASPQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public ASP.resource.ASP.ASPEProblemType getType() {
		return type;
	}
	
	public ASP.resource.ASP.ASPEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<ASP.resource.ASP.IASPQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
