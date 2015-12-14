/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.ui;

public class ASPUIMetaInformation extends ASP.resource.ASP.mopp.ASPMetaInformation {
	
	public ASP.resource.ASP.IASPHoverTextProvider getHoverTextProvider() {
		return new ASP.resource.ASP.ui.ASPHoverTextProvider();
	}
	
	public ASP.resource.ASP.ui.ASPImageProvider getImageProvider() {
		return ASP.resource.ASP.ui.ASPImageProvider.INSTANCE;
	}
	
	public ASP.resource.ASP.ui.ASPColorManager createColorManager() {
		return new ASP.resource.ASP.ui.ASPColorManager();
	}
	
	/**
	 * @deprecated this method is only provided to preserve API compatibility. Use
	 * createTokenScanner(ASP.resource.ASP.IASPTextResource,
	 * ASP.resource.ASP.ui.ASPColorManager) instead.
	 */
	public ASP.resource.ASP.ui.ASPTokenScanner createTokenScanner(ASP.resource.ASP.ui.ASPColorManager colorManager) {
		return createTokenScanner(null, colorManager);
	}
	
	public ASP.resource.ASP.ui.ASPTokenScanner createTokenScanner(ASP.resource.ASP.IASPTextResource resource, ASP.resource.ASP.ui.ASPColorManager colorManager) {
		return new ASP.resource.ASP.ui.ASPTokenScanner(resource, colorManager);
	}
	
	public ASP.resource.ASP.ui.ASPCodeCompletionHelper createCodeCompletionHelper() {
		return new ASP.resource.ASP.ui.ASPCodeCompletionHelper();
	}
	
}
