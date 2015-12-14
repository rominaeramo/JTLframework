/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.mopp;

public class ASPMResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public ASPMResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new ASPM.resource.ASPM.mopp.ASPMResource(uri);
	}
	
}
