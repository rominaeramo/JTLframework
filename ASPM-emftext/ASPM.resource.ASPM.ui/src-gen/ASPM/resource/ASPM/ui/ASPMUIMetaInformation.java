/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.ui;

public class ASPMUIMetaInformation extends ASPM.resource.ASPM.mopp.ASPMMetaInformation {
	
	public ASPM.resource.ASPM.IASPMHoverTextProvider getHoverTextProvider() {
		return new ASPM.resource.ASPM.ui.ASPMHoverTextProvider();
	}
	
	public ASPM.resource.ASPM.ui.ASPMImageProvider getImageProvider() {
		return ASPM.resource.ASPM.ui.ASPMImageProvider.INSTANCE;
	}
	
	public ASPM.resource.ASPM.ui.ASPMColorManager createColorManager() {
		return new ASPM.resource.ASPM.ui.ASPMColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(ASPM.resource.ASPM.IASPMTextResource,
	 * ASPM.resource.ASPM.ui.ASPMColorManager) instead.
	 */
	public ASPM.resource.ASPM.ui.ASPMTokenScanner createTokenScanner(ASPM.resource.ASPM.ui.ASPMColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public ASPM.resource.ASPM.ui.ASPMTokenScanner createTokenScanner(ASPM.resource.ASPM.IASPMTextResource resource, ASPM.resource.ASPM.ui.ASPMColorManager colorManager) {
		return new ASPM.resource.ASPM.ui.ASPMTokenScanner(resource, colorManager);
	}
	
	public ASPM.resource.ASPM.ui.ASPMCodeCompletionHelper createCodeCompletionHelper() {
		return new ASPM.resource.ASPM.ui.ASPMCodeCompletionHelper();
	}
	
}
