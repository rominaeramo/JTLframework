/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.mopp;

public class JTLMMResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public JTLMMResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new JTLMM.resource.JTLMM.mopp.JTLMMResource(uri);
	}
	
}
