/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.mopp;

/**
 * A basic implementation of the ASPM.resource.ASPM.IASPMElementMapping interface.
 * 
 * @param <ReferenceType> the type of the reference that can be mapped to
 */
public class ASPMElementMapping<ReferenceType> implements ASPM.resource.ASPM.IASPMElementMapping<ReferenceType> {
	
	private final ReferenceType target;
	private String identifier;
	private String warning;
	
	public ASPMElementMapping(String identifier, ReferenceType target, String warning) {
		super();
		this.target = target;
		this.identifier = identifier;
		this.warning = warning;
	}
	
	public ReferenceType getTargetElement() {
		return target;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getWarning() {
		return warning;
	}
	
}
