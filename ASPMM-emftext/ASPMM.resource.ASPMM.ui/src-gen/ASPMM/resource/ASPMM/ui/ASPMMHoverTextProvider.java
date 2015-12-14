/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.ui;

public class ASPMMHoverTextProvider implements ASPMM.resource.ASPMM.IASPMMHoverTextProvider {
	
	private ASPMM.resource.ASPMM.ui.ASPMMDefaultHoverTextProvider defaultProvider = new ASPMM.resource.ASPMM.ui.ASPMMDefaultHoverTextProvider();
	
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
