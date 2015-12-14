/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class ASPMMProposalPostProcessor {
	
	public java.util.List<ASPMM.resource.ASPMM.ui.ASPMMCompletionProposal> process(java.util.List<ASPMM.resource.ASPMM.ui.ASPMMCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
