/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.ui;

public class ASPMCompletionProcessor implements org.eclipse.jface.text.contentassist.IContentAssistProcessor {
	
	private ASPM.resource.ASPM.IASPMResourceProvider resourceProvider;
	private ASPM.resource.ASPM.ui.IASPMBracketHandlerProvider bracketHandlerProvider;
	
	public ASPMCompletionProcessor(ASPM.resource.ASPM.IASPMResourceProvider resourceProvider, ASPM.resource.ASPM.ui.IASPMBracketHandlerProvider bracketHandlerProvider) {
		this.resourceProvider = resourceProvider;
		this.bracketHandlerProvider = bracketHandlerProvider;
	}
	
	public org.eclipse.jface.text.contentassist.ICompletionProposal[] computeCompletionProposals(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		ASPM.resource.ASPM.IASPMTextResource textResource = resourceProvider.getResource();
		if (textResource == null) {
			return new org.eclipse.jface.text.contentassist.ICompletionProposal[0];
		}
		String content = viewer.getDocument().get();
		ASPM.resource.ASPM.ui.ASPMCodeCompletionHelper helper = new ASPM.resource.ASPM.ui.ASPMCodeCompletionHelper();
		ASPM.resource.ASPM.ui.ASPMCompletionProposal[] computedProposals = helper.computeCompletionProposals(textResource, content, offset);
		
		// call completion proposal post processor to allow for customizing the proposals
		ASPM.resource.ASPM.ui.ASPMProposalPostProcessor proposalPostProcessor = new ASPM.resource.ASPM.ui.ASPMProposalPostProcessor();
		java.util.List<ASPM.resource.ASPM.ui.ASPMCompletionProposal> computedProposalList = java.util.Arrays.asList(computedProposals);
		java.util.List<ASPM.resource.ASPM.ui.ASPMCompletionProposal> extendedProposalList = proposalPostProcessor.process(computedProposalList);
		if (extendedProposalList == null) {
			extendedProposalList = java.util.Collections.emptyList();
		}
		java.util.List<ASPM.resource.ASPM.ui.ASPMCompletionProposal> finalProposalList = new java.util.ArrayList<ASPM.resource.ASPM.ui.ASPMCompletionProposal>();
		for (ASPM.resource.ASPM.ui.ASPMCompletionProposal proposal : extendedProposalList) {
			if (proposal.getMatchesPrefix()) {
				finalProposalList.add(proposal);
			}
		}
		org.eclipse.jface.text.contentassist.ICompletionProposal[] result = new org.eclipse.jface.text.contentassist.ICompletionProposal[finalProposalList.size()];
		int i = 0;
		for (ASPM.resource.ASPM.ui.ASPMCompletionProposal proposal : finalProposalList) {
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
			ASPM.resource.ASPM.ui.IASPMBracketHandler bracketHandler = bracketHandlerProvider.getBracketHandler();
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
