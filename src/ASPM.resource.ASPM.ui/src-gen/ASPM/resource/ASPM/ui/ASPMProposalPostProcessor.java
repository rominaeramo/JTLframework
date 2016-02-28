/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class ASPMProposalPostProcessor {
	
	public java.util.List<ASPM.resource.ASPM.ui.ASPMCompletionProposal> process(java.util.List<ASPM.resource.ASPM.ui.ASPMCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
