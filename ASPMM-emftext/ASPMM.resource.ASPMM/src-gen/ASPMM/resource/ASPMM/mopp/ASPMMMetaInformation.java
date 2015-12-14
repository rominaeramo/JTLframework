/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.mopp;

public class ASPMMMetaInformation implements ASPMM.resource.ASPMM.IASPMMMetaInformation {
	
	public String getSyntaxName() {
		return "ASPMM";
	}
	
	public String getURI() {
		return "http://www.emftext.org/language/ASPMM";
	}
	
	public ASPMM.resource.ASPMM.IASPMMTextScanner createLexer() {
		return new ASPMM.resource.ASPMM.mopp.ASPMMAntlrScanner(new ASPMM.resource.ASPMM.mopp.ASPMMLexer());
	}
	
	public ASPMM.resource.ASPMM.IASPMMTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new ASPMM.resource.ASPMM.mopp.ASPMMParser().createInstance(inputStream, encoding);
	}
	
	public ASPMM.resource.ASPMM.IASPMMTextPrinter createPrinter(java.io.OutputStream outputStream, ASPMM.resource.ASPMM.IASPMMTextResource resource) {
		return new ASPMM.resource.ASPMM.mopp.ASPMMPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new ASPMM.resource.ASPMM.mopp.ASPMMSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new ASPMM.resource.ASPMM.mopp.ASPMMSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public ASPMM.resource.ASPMM.IASPMMReferenceResolverSwitch getReferenceResolverSwitch() {
		return new ASPMM.resource.ASPMM.mopp.ASPMMReferenceResolverSwitch();
	}
	
	public ASPMM.resource.ASPMM.IASPMMTokenResolverFactory getTokenResolverFactory() {
		return new ASPMM.resource.ASPMM.mopp.ASPMMTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "ASPMM[emftext]/metamodels/ASPMM.cs";
	}
	
	public String[] getTokenNames() {
		return ASPMM.resource.ASPMM.mopp.ASPMMParser.tokenNames;
	}
	
	public ASPMM.resource.ASPMM.IASPMMTokenStyle getDefaultTokenStyle(String tokenName) {
		return new ASPMM.resource.ASPMM.mopp.ASPMMTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<ASPMM.resource.ASPMM.IASPMMBracketPair> getBracketPairs() {
		return new ASPMM.resource.ASPMM.mopp.ASPMMBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new ASPMM.resource.ASPMM.mopp.ASPMMFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new ASPMM.resource.ASPMM.mopp.ASPMMResourceFactory();
	}
	
	public ASPMM.resource.ASPMM.mopp.ASPMMNewFileContentProvider getNewFileContentProvider() {
		return new ASPMM.resource.ASPMM.mopp.ASPMMNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new ASPMM.resource.ASPMM.mopp.ASPMMResourceFactory());
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
		return "ASPMM.resource.ASPMM.ui.launchConfigurationType";
	}
	
	public ASPMM.resource.ASPMM.IASPMMNameProvider createNameProvider() {
		return new ASPMM.resource.ASPMM.analysis.ASPMMDefaultNameProvider();
	}
	
	public String[] getSyntaxHighlightableTokenNames() {
		ASPMM.resource.ASPMM.mopp.ASPMMAntlrTokenHelper tokenHelper = new ASPMM.resource.ASPMM.mopp.ASPMMAntlrTokenHelper();
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
		highlightableTokens.add(ASPMM.resource.ASPMM.mopp.ASPMMTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME);
		return highlightableTokens.toArray(new String[highlightableTokens.size()]);
	}
	
}
