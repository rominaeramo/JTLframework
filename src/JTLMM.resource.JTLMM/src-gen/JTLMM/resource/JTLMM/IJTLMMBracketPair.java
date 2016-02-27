/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM;

/**
 * A simple interface to access information about matching brackets.
 */
public interface IJTLMMBracketPair {
	
	/**
	 * Returns the opening bracket.
	 */
	public String getOpeningBracket();
	
	/**
	 * Returns the closing bracket.
	 */
	public String getClosingBracket();
	
	/**
	 * Returns whether other bracket pairs shall be automatically closed, when used
	 * inside of this bracket pair.
	 */
	public boolean isClosingEnabledInside();
}
