/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM;

/**
 * An element that is expected at a given position in a resource stream.
 */
public interface IASPMExpectedElement {
	
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
	public ASPM.resource.ASPM.grammar.ASPMSyntaxElement getSymtaxElement();
	
	/**
	 * Adds an element that is a valid follower for this element.
	 */
	public void addFollower(ASPM.resource.ASPM.IASPMExpectedElement follower, ASPM.resource.ASPM.mopp.ASPMContainedFeature[] path);
	
	/**
	 * Returns all valid followers for this element. Each follower is represented by a
	 * pair of an expected elements and the containment trace that leads from the
	 * current element to the follower.
	 */
	public java.util.Collection<ASPM.resource.ASPM.util.ASPMPair<ASPM.resource.ASPM.IASPMExpectedElement, ASPM.resource.ASPM.mopp.ASPMContainedFeature[]>> getFollowers();
	
}
