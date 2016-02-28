/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class ASPMAbstractExpectedElement implements ASPM.resource.ASPM.IASPMExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	
	private java.util.Set<ASPM.resource.ASPM.util.ASPMPair<ASPM.resource.ASPM.IASPMExpectedElement, ASPM.resource.ASPM.mopp.ASPMContainedFeature[]>> followers = new java.util.LinkedHashSet<ASPM.resource.ASPM.util.ASPMPair<ASPM.resource.ASPM.IASPMExpectedElement, ASPM.resource.ASPM.mopp.ASPMContainedFeature[]>>();
	
	public ASPMAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(ASPM.resource.ASPM.IASPMExpectedElement follower, ASPM.resource.ASPM.mopp.ASPMContainedFeature[] path) {
		followers.add(new ASPM.resource.ASPM.util.ASPMPair<ASPM.resource.ASPM.IASPMExpectedElement, ASPM.resource.ASPM.mopp.ASPMContainedFeature[]>(follower, path));
	}
	
	public java.util.Collection<ASPM.resource.ASPM.util.ASPMPair<ASPM.resource.ASPM.IASPMExpectedElement, ASPM.resource.ASPM.mopp.ASPMContainedFeature[]>> getFollowers() {
		return followers;
	}
	
}
