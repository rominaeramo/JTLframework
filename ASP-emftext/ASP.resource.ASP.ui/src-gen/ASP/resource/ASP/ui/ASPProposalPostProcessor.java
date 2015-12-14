/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class ASPProposalPostProcessor {
	
	public java.util.List<ASP.resource.ASP.ui.ASPCompletionProposal> process(java.util.List<ASP.resource.ASP.ui.ASPCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
