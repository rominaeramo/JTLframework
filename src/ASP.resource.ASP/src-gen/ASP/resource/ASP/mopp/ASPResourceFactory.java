/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.mopp;

public class ASPResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public ASPResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new ASP.resource.ASP.mopp.ASPResource(uri);
	}
	
}
