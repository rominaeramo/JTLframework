/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM;

/**
 * An element that is expected at a given position in a resource stream.
 */
public interface IASPMMExpectedElement {
	
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
	public ASPMM.resource.ASPMM.grammar.ASPMMSyntaxElement getSymtaxElement();
	
	/**
	 * Adds an element that is a valid follower for this element.
	 */
	public void addFollower(ASPMM.resource.ASPMM.IASPMMExpectedElement follower, ASPMM.resource.ASPMM.mopp.ASPMMContainedFeature[] path);
	
	/**
	 * Returns all valid followers for this element. Each follower is represented by a
	 * pair of an expected elements and the containment trace that leads from the
	 * current element to the follower.
	 */
	public java.util.Collection<ASPMM.resource.ASPMM.util.ASPMMPair<ASPMM.resource.ASPMM.IASPMMExpectedElement, ASPMM.resource.ASPMM.mopp.ASPMMContainedFeature[]>> getFollowers();
	
}
