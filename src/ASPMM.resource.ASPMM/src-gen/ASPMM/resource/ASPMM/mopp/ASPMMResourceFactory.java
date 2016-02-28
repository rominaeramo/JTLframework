/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.mopp;

public class ASPMMResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public ASPMMResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new ASPMM.resource.ASPMM.mopp.ASPMMResource(uri);
	}
	
}
