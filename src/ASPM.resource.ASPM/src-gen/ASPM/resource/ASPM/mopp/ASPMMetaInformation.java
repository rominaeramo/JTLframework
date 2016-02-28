/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.mopp;

public class ASPMMetaInformation implements ASPM.resource.ASPM.IASPMMetaInformation {
	
	public String getSyntaxName() {
		return "ASPM";
	}
	
	public String getURI() {
		return "http://www.emftext.org/language/ASPM";
	}
	
	public ASPM.resource.ASPM.IASPMTextScanner createLexer() {
		return new ASPM.resource.ASPM.mopp.ASPMAntlrScanner(new ASPM.resource.ASPM.mopp.ASPMLexer());
	}
	
	public ASPM.resource.ASPM.IASPMTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new ASPM.resource.ASPM.mopp.ASPMParser().createInstance(inputStream, encoding);
	}
	
	public ASPM.resource.ASPM.IASPMTextPrinter createPrinter(java.io.OutputStream outputStream, ASPM.resource.ASPM.IASPMTextResource resource) {
		return new ASPM.resource.ASPM.mopp.ASPMPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new ASPM.resource.ASPM.mopp.ASPMSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new ASPM.resource.ASPM.mopp.ASPMSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public ASPM.resource.ASPM.IASPMReferenceResolverSwitch getReferenceResolverSwitch() {
		return new ASPM.resource.ASPM.mopp.ASPMReferenceResolverSwitch();
	}
	
	public ASPM.resource.ASPM.IASPMTokenResolverFactory getTokenResolverFactory() {
		return new ASPM.resource.ASPM.mopp.ASPMTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "ASPM[emftext]/metamodels/ASPM.cs";
	}
	
	public String[] getTokenNames() {
		return ASPM.resource.ASPM.mopp.ASPMParser.tokenNames;
	}
	
	public ASPM.resource.ASPM.IASPMTokenStyle getDefaultTokenStyle(String tokenName) {
		return new ASPM.resource.ASPM.mopp.ASPMTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<ASPM.resource.ASPM.IASPMBracketPair> getBracketPairs() {
		return new ASPM.resource.ASPM.mopp.ASPMBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new ASPM.resource.ASPM.mopp.ASPMFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new ASPM.resource.ASPM.mopp.ASPMResourceFactory();
	}
	
	public ASPM.resource.ASPM.mopp.ASPMNewFileContentProvider getNewFileContentProvider() {
		return new ASPM.resource.ASPM.mopp.ASPMNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new ASPM.resource.ASPM.mopp.ASPMResourceFactory());
	}
	
	/**
	 * Returns the key of the option that can be used to register a preprocessor that
	 * is used as a pipe when loading resources. This key is language-specific. To
	 * register one preprocessor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getInputStreamPreprocessorProviderOptionKey() {
		return getSyntaxName() + "_" + "INPUT_STREAM_PREPROCESSOR_PROVIDER";
	}
	
	/**
	 * Returns the key of the option that can be used to register a post-processors
	 * that are invoked after loading resources. This key is language-specific. To
	 * register one post-processor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getResourcePostProcessorProviderOptionKey() {
		return getSyntaxName() + "_" + "RESOURCE_POSTPROCESSOR_PROVIDER";
	}
	
	public String getLaunchConfigurationType() {
		return "ASPM.resource.ASPM.ui.launchConfigurationType";
	}
	
	public ASPM.resource.ASPM.IASPMNameProvider createNameProvider() {
		return new ASPM.resource.ASPM.analysis.ASPMDefaultNameProvider();
	}
	
	public String[] getSyntaxHighlightableTokenNames() {
		ASPM.resource.ASPM.mopp.ASPMAntlrTokenHelper tokenHelper = new ASPM.resource.ASPM.mopp.ASPMAntlrTokenHelper();
		java.util.List<String> highlightableTokens = new java.util.ArrayList<String>();
		String[] parserTokenNames = getTokenNames();
		for (int i = 0; i < parserTokenNames.length; i++) {
			// If ANTLR is used we need to normalize the token names
			if (!tokenHelper.canBeUsedForSyntaxHighlighting(i)) {
				continue;
			}
			String tokenName = tokenHelper.getTokenName(parserTokenNames, i);
			if (tokenName == null) {
				continue;
			}
			highlightableTokens.add(tokenName);
		}
		highlightableTokens.add(ASPM.resource.ASPM.mopp.ASPMTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME);
		return highlightableTokens.toArray(new String[highlightableTokens.size()]);
	}
	
}
