/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class JTLMMProposalPostProcessor {
	
	public java.util.List<JTLMM.resource.JTLMM.ui.JTLMMCompletionProposal> process(java.util.List<JTLMM.resource.JTLMM.ui.JTLMMCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
