/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM;

public interface IASPMMProblem {
	public String getMessage();
	public ASPMM.resource.ASPMM.ASPMMEProblemSeverity getSeverity();
	public ASPMM.resource.ASPMM.ASPMMEProblemType getType();
	public java.util.Collection<ASPMM.resource.ASPMM.IASPMMQuickFix> getQuickFixes();
}
