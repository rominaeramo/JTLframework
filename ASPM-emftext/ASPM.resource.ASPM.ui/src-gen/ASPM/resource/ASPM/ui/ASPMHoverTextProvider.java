/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.ui;

public class ASPMHoverTextProvider implements ASPM.resource.ASPM.IASPMHoverTextProvider {
	
	private ASPM.resource.ASPM.ui.ASPMDefaultHoverTextProvider defaultProvider = new ASPM.resource.ASPM.ui.ASPMDefaultHoverTextProvider();
	
	public String getHoverText(org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EObject referencedObject) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(referencedObject);
	}
	
	public String getHoverText(org.eclipse.emf.ecore.EObject object) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(object);
	}
	
}
