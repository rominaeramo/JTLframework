/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.ui;

public class JTLMMUIMetaInformation extends JTLMM.resource.JTLMM.mopp.JTLMMMetaInformation {
	
	public JTLMM.resource.JTLMM.IJTLMMHoverTextProvider getHoverTextProvider() {
		return new JTLMM.resource.JTLMM.ui.JTLMMHoverTextProvider();
	}
	
	public JTLMM.resource.JTLMM.ui.JTLMMImageProvider getImageProvider() {
		return JTLMM.resource.JTLMM.ui.JTLMMImageProvider.INSTANCE;
	}
	
	public JTLMM.resource.JTLMM.ui.JTLMMColorManager createColorManager() {
		return new JTLMM.resource.JTLMM.ui.JTLMMColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(JTLMM.resource.JTLMM.IJTLMMTextResource,
	 * JTLMM.resource.JTLMM.ui.JTLMMColorManager) instead.
	 */
	public JTLMM.resource.JTLMM.ui.JTLMMTokenScanner createTokenScanner(JTLMM.resource.JTLMM.ui.JTLMMColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public JTLMM.resource.JTLMM.ui.JTLMMTokenScanner createTokenScanner(JTLMM.resource.JTLMM.IJTLMMTextResource resource, JTLMM.resource.JTLMM.ui.JTLMMColorManager colorManager) {
		return new JTLMM.resource.JTLMM.ui.JTLMMTokenScanner(resource, colorManager);
	}
	
	public JTLMM.resource.JTLMM.ui.JTLMMCodeCompletionHelper createCodeCompletionHelper() {
		return new JTLMM.resource.JTLMM.ui.JTLMMCodeCompletionHelper();
	}
	
}
