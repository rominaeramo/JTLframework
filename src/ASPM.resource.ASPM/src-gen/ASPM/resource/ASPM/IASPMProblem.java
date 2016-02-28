/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM;

public interface IASPMProblem {
	public String getMessage();
	public ASPM.resource.ASPM.ASPMEProblemSeverity getSeverity();
	public ASPM.resource.ASPM.ASPMEProblemType getType();
	public java.util.Collection<ASPM.resource.ASPM.IASPMQuickFix> getQuickFixes();
}
