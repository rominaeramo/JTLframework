/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.ui;

public class ASPCompletionProcessor implements org.eclipse.jface.text.contentassist.IContentAssistProcessor {
	
	private ASP.resource.ASP.IASPResourceProvider resourceProvider;
	private ASP.resource.ASP.ui.IASPBracketHandlerProvider bracketHandlerProvider;
	
	public ASPCompletionProcessor(ASP.resource.ASP.IASPResourceProvider resourceProvider, ASP.resource.ASP.ui.IASPBracketHandlerProvider bracketHandlerProvider) {
		this.resourceProvider = resourceProvider;
		this.bracketHandlerProvider = bracketHandlerProvider;
	}
	
	public org.eclipse.jface.text.contentassist.ICompletionProposal[] computeCompletionProposals(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		ASP.resource.ASP.IASPTextResource textResource = resourceProvider.getResource();
		if (textResource == null) {
			return new org.eclipse.jface.text.contentassist.ICompletionProposal[0];
		}
		String content = viewer.getDocument().get();
		ASP.resource.ASP.ui.ASPCodeCompletionHelper helper = new ASP.resource.ASP.ui.ASPCodeCompletionHelper();
		ASP.resource.ASP.ui.ASPCompletionProposal[] computedProposals = helper.computeCompletionProposals(textResource, content, offset);
		
		// call completion proposal post processor to allow for customizing the proposals
		ASP.resource.ASP.ui.ASPProposalPostProcessor proposalPostProcessor = new ASP.resource.ASP.ui.ASPProposalPostProcessor();
		java.util.List<ASP.resource.ASP.ui.ASPCompletionProposal> computedProposalList = java.util.Arrays.asList(computedProposals);
		java.util.List<ASP.resource.ASP.ui.ASPCompletionProposal> extendedProposalList = proposalPostProcessor.process(computedProposalList);
		if (extendedProposalList == null) {
			extendedProposalList = java.util.Collections.emptyList();
		}
		java.util.List<ASP.resource.ASP.ui.ASPCompletionProposal> finalProposalList = new java.util.ArrayList<ASP.resource.ASP.ui.ASPCompletionProposal>();
		for (ASP.resource.ASP.ui.ASPCompletionProposal proposal : extendedProposalList) {
			if (proposal.getMatchesPrefix()) {
				finalProposalList.add(proposal);
			}
		}
		org.eclipse.jface.text.contentassist.ICompletionProposal[] result = new org.eclipse.jface.text.contentassist.ICompletionProposal[finalProposalList.size()];
		int i = 0;
		for (ASP.resource.ASP.ui.ASPCompletionProposal proposal : finalProposalList) {
			String proposalString = proposal.getInsertString();
			String displayString = proposal.getDisplayString();
			String prefix = proposal.getPrefix();
			org.eclipse.swt.graphics.Image image = proposal.getImage();
			org.eclipse.jface.text.contentassist.IContextInformation info;
			info = new org.eclipse.jface.text.contentassist.ContextInformation(image, proposalString, proposalString);
			int begin = offset - prefix.length();
			int replacementLength = prefix.length();
			// if a closing bracket was automatically inserted right before, we enlarge the
			// replacement length in order to overwrite the bracket.
			ASP.resource.ASP.ui.IASPBracketHandler bracketHandler = bracketHandlerProvider.getBracketHandler();
			String closingBracket = bracketHandler.getClosingBracket();
			if (bracketHandler.addedClosingBracket() && proposalString.endsWith(closingBracket)) {
				replacementLength += closingBracket.length();
			}
			result[i++] = new org.eclipse.jface.text.contentassist.CompletionProposal(proposalString, begin, replacementLength, proposalString.length(), image, displayString, info, proposalString);
		}
		return result;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformation[] computeContextInformation(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		return null;
	}
	
	public char[] getCompletionProposalAutoActivationCharacters() {
		return null;
	}
	
	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformationValidator getContextInformationValidator() {
		return null;
	}
	
	public String getErrorMessage() {
		return null;
	}
}
