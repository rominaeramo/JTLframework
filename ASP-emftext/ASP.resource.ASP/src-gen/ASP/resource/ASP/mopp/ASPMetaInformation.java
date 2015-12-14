/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.mopp;

public class ASPMetaInformation implements ASP.resource.ASP.IASPMetaInformation {
	
	public String getSyntaxName() {
		return "ASP";
	}
	
	public String getURI() {
		return "http://asp.ecore";
	}
	
	public ASP.resource.ASP.IASPTextScanner createLexer() {
		return new ASP.resource.ASP.mopp.ASPAntlrScanner(new ASP.resource.ASP.mopp.ASPLexer());
	}
	
	public ASP.resource.ASP.IASPTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new ASP.resource.ASP.mopp.ASPParser().createInstance(inputStream, encoding);
	}
	
	public ASP.resource.ASP.IASPTextPrinter createPrinter(java.io.OutputStream outputStream, ASP.resource.ASP.IASPTextResource resource) {
		return new ASP.resource.ASP.mopp.ASPPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new ASP.resource.ASP.mopp.ASPSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new ASP.resource.ASP.mopp.ASPSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public ASP.resource.ASP.IASPReferenceResolverSwitch getReferenceResolverSwitch() {
		return new ASP.resource.ASP.mopp.ASPReferenceResolverSwitch();
	}
	
	public ASP.resource.ASP.IASPTokenResolverFactory getTokenResolverFactory() {
		return new ASP.resource.ASP.mopp.ASPTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "ASP[emftext]/metamodels/ASP.cs";
	}
	
	public String[] getTokenNames() {
		return ASP.resource.ASP.mopp.ASPParser.tokenNames;
	}
	
	public ASP.resource.ASP.IASPTokenStyle getDefaultTokenStyle(String tokenName) {
		return new ASP.resource.ASP.mopp.ASPTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<ASP.resource.ASP.IASPBracketPair> getBracketPairs() {
		return new ASP.resource.ASP.mopp.ASPBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new ASP.resource.ASP.mopp.ASPFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new ASP.resource.ASP.mopp.ASPResourceFactory();
	}
	
	public ASP.resource.ASP.mopp.ASPNewFileContentProvider getNewFileContentProvider() {
		return new ASP.resource.ASP.mopp.ASPNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new ASP.resource.ASP.mopp.ASPResourceFactory());
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
		return "ASP.resource.ASP.ui.launchConfigurationType";
	}
	
	public ASP.resource.ASP.IASPNameProvider createNameProvider() {
		return new ASP.resource.ASP.analysis.ASPDefaultNameProvider();
	}
	
	public String[] getSyntaxHighlightableTokenNames() {
		ASP.resource.ASP.mopp.ASPAntlrTokenHelper tokenHelper = new ASP.resource.ASP.mopp.ASPAntlrTokenHelper();
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
		highlightableTokens.add(ASP.resource.ASP.mopp.ASPTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME);
		return highlightableTokens.toArray(new String[highlightableTokens.size()]);
	}
	
}
