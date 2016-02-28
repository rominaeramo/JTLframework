/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.ui;

public class ASPMMUIMetaInformation extends ASPMM.resource.ASPMM.mopp.ASPMMMetaInformation {
	
	public ASPMM.resource.ASPMM.IASPMMHoverTextProvider getHoverTextProvider() {
		return new ASPMM.resource.ASPMM.ui.ASPMMHoverTextProvider();
	}
	
	public ASPMM.resource.ASPMM.ui.ASPMMImageProvider getImageProvider() {
		return ASPMM.resource.ASPMM.ui.ASPMMImageProvider.INSTANCE;
	}
	
	public ASPMM.resource.ASPMM.ui.ASPMMColorManager createColorManager() {
		return new ASPMM.resource.ASPMM.ui.ASPMMColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(ASPMM.resource.ASPMM.IASPMMTextResource,
	 * ASPMM.resource.ASPMM.ui.ASPMMColorManager) instead.
	 */
	public ASPMM.resource.ASPMM.ui.ASPMMTokenScanner createTokenScanner(ASPMM.resource.ASPMM.ui.ASPMMColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public ASPMM.resource.ASPMM.ui.ASPMMTokenScanner createTokenScanner(ASPMM.resource.ASPMM.IASPMMTextResource resource, ASPMM.resource.ASPMM.ui.ASPMMColorManager colorManager) {
		return new ASPMM.resource.ASPMM.ui.ASPMMTokenScanner(resource, colorManager);
	}
	
	public ASPMM.resource.ASPMM.ui.ASPMMCodeCompletionHelper createCodeCompletionHelper() {
		return new ASPMM.resource.ASPMM.ui.ASPMMCodeCompletionHelper();
	}
	
}
