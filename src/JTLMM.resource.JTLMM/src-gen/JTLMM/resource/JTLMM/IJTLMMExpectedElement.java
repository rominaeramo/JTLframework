/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM;

/**
 * An element that is expected at a given position in a resource stream.
 */
public interface IJTLMMExpectedElement {
	
	/**
	 * Returns the names of all tokens that are expected at the given position.
	 */
	public java.util.Set<String> getTokenNames();
	
	/**
	 * Returns the metaclass of the rule that contains the expected element.
	 */
	public org.eclipse.emf.ecore.EClass getRuleMetaclass();
	
	/**
	 * Returns the syntax element that is expected.
	 */
	public JTLMM.resource.JTLMM.grammar.JTLMMSyntaxElement getSymtaxElement();
	
	/**
	 * Adds an element that is a valid follower for this element.
	 */
	public void addFollower(JTLMM.resource.JTLMM.IJTLMMExpectedElement follower, JTLMM.resource.JTLMM.mopp.JTLMMContainedFeature[] path);
	
	/**
	 * Returns all valid followers for this element. Each follower is represented by a
	 * pair of an expected elements and the containment trace that leads from the
	 * current element to the follower.
	 */
	public java.util.Collection<JTLMM.resource.JTLMM.util.JTLMMPair<JTLMM.resource.JTLMM.IJTLMMExpectedElement, JTLMM.resource.JTLMM.mopp.JTLMMContainedFeature[]>> getFollowers();
	
}
