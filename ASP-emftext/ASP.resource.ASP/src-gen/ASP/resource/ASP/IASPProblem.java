/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP;

public interface IASPProblem {
	public String getMessage();
	public ASP.resource.ASP.ASPEProblemSeverity getSeverity();
	public ASP.resource.ASP.ASPEProblemType getType();
	public java.util.Collection<ASP.resource.ASP.IASPQuickFix> getQuickFixes();
}
