/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class JTLMMAbstractExpectedElement implements JTLMM.resource.JTLMM.IJTLMMExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	
	private java.util.Set<JTLMM.resource.JTLMM.util.JTLMMPair<JTLMM.resource.JTLMM.IJTLMMExpectedElement, JTLMM.resource.JTLMM.mopp.JTLMMContainedFeature[]>> followers = new java.util.LinkedHashSet<JTLMM.resource.JTLMM.util.JTLMMPair<JTLMM.resource.JTLMM.IJTLMMExpectedElement, JTLMM.resource.JTLMM.mopp.JTLMMContainedFeature[]>>();
	
	public JTLMMAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(JTLMM.resource.JTLMM.IJTLMMExpectedElement follower, JTLMM.resource.JTLMM.mopp.JTLMMContainedFeature[] path) {
		followers.add(new JTLMM.resource.JTLMM.util.JTLMMPair<JTLMM.resource.JTLMM.IJTLMMExpectedElement, JTLMM.resource.JTLMM.mopp.JTLMMContainedFeature[]>(follower, path));
	}
	
	public java.util.Collection<JTLMM.resource.JTLMM.util.JTLMMPair<JTLMM.resource.JTLMM.IJTLMMExpectedElement, JTLMM.resource.JTLMM.mopp.JTLMMContainedFeature[]>> getFollowers() {
		return followers;
	}
	
}
