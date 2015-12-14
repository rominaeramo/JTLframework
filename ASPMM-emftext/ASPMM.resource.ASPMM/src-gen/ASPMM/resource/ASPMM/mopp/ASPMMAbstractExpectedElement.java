/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class ASPMMAbstractExpectedElement implements ASPMM.resource.ASPMM.IASPMMExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	
	private java.util.Set<ASPMM.resource.ASPMM.util.ASPMMPair<ASPMM.resource.ASPMM.IASPMMExpectedElement, ASPMM.resource.ASPMM.mopp.ASPMMContainedFeature[]>> followers = new java.util.LinkedHashSet<ASPMM.resource.ASPMM.util.ASPMMPair<ASPMM.resource.ASPMM.IASPMMExpectedElement, ASPMM.resource.ASPMM.mopp.ASPMMContainedFeature[]>>();
	
	public ASPMMAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(ASPMM.resource.ASPMM.IASPMMExpectedElement follower, ASPMM.resource.ASPMM.mopp.ASPMMContainedFeature[] path) {
		followers.add(new ASPMM.resource.ASPMM.util.ASPMMPair<ASPMM.resource.ASPMM.IASPMMExpectedElement, ASPMM.resource.ASPMM.mopp.ASPMMContainedFeature[]>(follower, path));
	}
	
	public java.util.Collection<ASPMM.resource.ASPMM.util.ASPMMPair<ASPMM.resource.ASPMM.IASPMMExpectedElement, ASPMM.resource.ASPMM.mopp.ASPMMContainedFeature[]>> getFollowers() {
		return followers;
	}
	
}
