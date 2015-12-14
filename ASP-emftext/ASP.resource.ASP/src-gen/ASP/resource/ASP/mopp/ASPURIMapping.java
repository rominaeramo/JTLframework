/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.mopp;

/**
 * A basic implementation of the ASP.resource.ASP.IASPURIMapping interface that
 * can map identifiers to URIs.
 * 
 * @param <ReferenceType> unused type parameter which is needed to implement
 * ASP.resource.ASP.IASPURIMapping.
 */
public class ASPURIMapping<ReferenceType> implements ASP.resource.ASP.IASPURIMapping<ReferenceType> {
	
	private org.eclipse.emf.common.util.URI uri;
	private String identifier;
	private String warning;
	
	public ASPURIMapping(String identifier, org.eclipse.emf.common.util.URI newIdentifier, String warning) {
		super();
		this.uri = newIdentifier;
		this.identifier = identifier;
		this.warning = warning;
	}
	
	public org.eclipse.emf.common.util.URI getTargetIdentifier() {
		return uri;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getWarning() {
		return warning;
	}
	
}
