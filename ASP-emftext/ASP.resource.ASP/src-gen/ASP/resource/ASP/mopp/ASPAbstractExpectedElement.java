/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class ASPAbstractExpectedElement implements ASP.resource.ASP.IASPExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	
	private java.util.Set<ASP.resource.ASP.util.ASPPair<ASP.resource.ASP.IASPExpectedElement, ASP.resource.ASP.mopp.ASPContainedFeature[]>> followers = new java.util.LinkedHashSet<ASP.resource.ASP.util.ASPPair<ASP.resource.ASP.IASPExpectedElement, ASP.resource.ASP.mopp.ASPContainedFeature[]>>();
	
	public ASPAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(ASP.resource.ASP.IASPExpectedElement follower, ASP.resource.ASP.mopp.ASPContainedFeature[] path) {
		followers.add(new ASP.resource.ASP.util.ASPPair<ASP.resource.ASP.IASPExpectedElement, ASP.resource.ASP.mopp.ASPContainedFeature[]>(follower, path));
	}
	
	public java.util.Collection<ASP.resource.ASP.util.ASPPair<ASP.resource.ASP.IASPExpectedElement, ASP.resource.ASP.mopp.ASPContainedFeature[]>> getFollowers() {
		return followers;
	}
	
}
