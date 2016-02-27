/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.mopp;

public class JTLMMMetaInformation implements JTLMM.resource.JTLMM.IJTLMMMetaInformation {
	
	public String getSyntaxName() {
		return "JTLMM";
	}
	
	public String getURI() {
		return "http://JTLMM.ecore";
	}
	
	public JTLMM.resource.JTLMM.IJTLMMTextScanner createLexer() {
		return new JTLMM.resource.JTLMM.mopp.JTLMMAntlrScanner(new JTLMM.resource.JTLMM.mopp.JTLMMLexer());
	}
	
	public JTLMM.resource.JTLMM.IJTLMMTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new JTLMM.resource.JTLMM.mopp.JTLMMParser().createInstance(inputStream, encoding);
	}
	
	public JTLMM.resource.JTLMM.IJTLMMTextPrinter createPrinter(java.io.OutputStream outputStream, JTLMM.resource.JTLMM.IJTLMMTextResource resource) {
		return new JTLMM.resource.JTLMM.mopp.JTLMMPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new JTLMM.resource.JTLMM.mopp.JTLMMSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new JTLMM.resource.JTLMM.mopp.JTLMMSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public JTLMM.resource.JTLMM.IJTLMMReferenceResolverSwitch getReferenceResolverSwitch() {
		return new JTLMM.resource.JTLMM.mopp.JTLMMReferenceResolverSwitch();
	}
	
	public JTLMM.resource.JTLMM.IJTLMMTokenResolverFactory getTokenResolverFactory() {
		return new JTLMM.resource.JTLMM.mopp.JTLMMTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "org.emftext.language.JTLMM/metamodel/JTLMM.cs";
	}
	
	public String[] getTokenNames() {
		return JTLMM.resource.JTLMM.mopp.JTLMMParser.tokenNames;
	}
	
	public JTLMM.resource.JTLMM.IJTLMMTokenStyle getDefaultTokenStyle(String tokenName) {
		return new JTLMM.resource.JTLMM.mopp.JTLMMTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<JTLMM.resource.JTLMM.IJTLMMBracketPair> getBracketPairs() {
		return new JTLMM.resource.JTLMM.mopp.JTLMMBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new JTLMM.resource.JTLMM.mopp.JTLMMFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new JTLMM.resource.JTLMM.mopp.JTLMMResourceFactory();
	}
	
	public JTLMM.resource.JTLMM.mopp.JTLMMNewFileContentProvider getNewFileContentProvider() {
		return new JTLMM.resource.JTLMM.mopp.JTLMMNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new JTLMM.resource.JTLMM.mopp.JTLMMResourceFactory());
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
		return "JTLMM.resource.JTLMM.ui.launchConfigurationType";
	}
	
	public JTLMM.resource.JTLMM.IJTLMMNameProvider createNameProvider() {
		return new JTLMM.resource.JTLMM.analysis.JTLMMDefaultNameProvider();
	}
	
	public String[] getSyntaxHighlightableTokenNames() {
		JTLMM.resource.JTLMM.mopp.JTLMMAntlrTokenHelper tokenHelper = new JTLMM.resource.JTLMM.mopp.JTLMMAntlrTokenHelper();
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
		highlightableTokens.add(JTLMM.resource.JTLMM.mopp.JTLMMTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME);
		return highlightableTokens.toArray(new String[highlightableTokens.size()]);
	}
	
}
