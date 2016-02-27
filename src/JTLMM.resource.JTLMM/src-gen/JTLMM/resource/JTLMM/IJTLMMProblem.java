/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM;

public interface IJTLMMProblem {
	public String getMessage();
	public JTLMM.resource.JTLMM.JTLMMEProblemSeverity getSeverity();
	public JTLMM.resource.JTLMM.JTLMMEProblemType getType();
	public java.util.Collection<JTLMM.resource.JTLMM.IJTLMMQuickFix> getQuickFixes();
}
