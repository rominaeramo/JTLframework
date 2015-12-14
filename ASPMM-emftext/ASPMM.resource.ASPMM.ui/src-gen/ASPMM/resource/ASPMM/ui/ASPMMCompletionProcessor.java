/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.ui;

public class ASPMMCompletionProcessor implements org.eclipse.jface.text.contentassist.IContentAssistProcessor {
	
	private ASPMM.resource.ASPMM.IASPMMResourceProvider resourceProvider;
	private ASPMM.resource.ASPMM.ui.IASPMMBracketHandlerProvider bracketHandlerProvider;
	
	public ASPMMCompletionProcessor(ASPMM.resource.ASPMM.IASPMMResourceProvider resourceProvider, ASPMM.resource.ASPMM.ui.IASPMMBracketHandlerProvider bracketHandlerProvider) {
		this.resourceProvider = resourceProvider;
		this.bracketHandlerProvider = bracketHandlerProvider;
	}
	
	public org.eclipse.jface.text.contentassist.ICompletionProposal[] computeCompletionProposals(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		ASPMM.resource.ASPMM.IASPMMTextResource textResource = resourceProvider.getResource();
		if (textResource == null) {
			return new org.eclipse.jface.text.contentassist.ICompletionProposal[0];
		}
		String content = viewer.getDocument().get();
		ASPMM.resource.ASPMM.ui.ASPMMCodeCompletionHelper helper = new ASPMM.resource.ASPMM.ui.ASPMMCodeCompletionHelper();
		ASPMM.resource.ASPMM.ui.ASPMMCompletionProposal[] computedProposals = helper.computeCompletionProposals(textResource, content, offset);
		
		// call completion proposal post processor to allow for customizing the proposals
		ASPMM.resource.ASPMM.ui.ASPMMProposalPostProcessor proposalPostProcessor = new ASPMM.resource.ASPMM.ui.ASPMMProposalPostProcessor();
		java.util.List<ASPMM.resource.ASPMM.ui.ASPMMCompletionProposal> computedProposalList = java.util.Arrays.asList(computedProposals);
		java.util.List<ASPMM.resource.ASPMM.ui.ASPMMCompletionProposal> extendedProposalList = proposalPostProcessor.process(computedProposalList);
		if (extendedProposalList == null) {
			extendedProposalList = java.util.Collections.emptyList();
		}
		java.util.List<ASPMM.resource.ASPMM.ui.ASPMMCompletionProposal> finalProposalList = new java.util.ArrayList<ASPMM.resource.ASPMM.ui.ASPMMCompletionProposal>();
		for (ASPMM.resource.ASPMM.ui.ASPMMCompletionProposal proposal : extendedProposalList) {
			if (proposal.getMatchesPrefix()) {
				finalProposalList.add(proposal);
			}
		}
		org.eclipse.jface.text.contentassist.ICompletionProposal[] result = new org.eclipse.jface.text.contentassist.ICompletionProposal[finalProposalList.size()];
		int i = 0;
		for (ASPMM.resource.ASPMM.ui.ASPMMCompletionProposal proposal : finalProposalList) {
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
			ASPMM.resource.ASPMM.ui.IASPMMBracketHandler bracketHandler = bracketHandlerProvider.getBracketHandler();
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
