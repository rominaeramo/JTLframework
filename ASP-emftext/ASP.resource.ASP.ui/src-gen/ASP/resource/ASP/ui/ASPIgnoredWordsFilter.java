/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.ui;

/**
 * The IgnoredWordsFilter can be customized to add additional words that must not
 * be marked as misspelled. To customize this class, set option
 * 'overrideIgnoredWordsFilter' to <code>false</code>.
 */
public class ASPIgnoredWordsFilter {
	
	/**
	 * Checks whether the given word must be ignored even it is misspelled.
	 */
	public boolean ignoreWord(String word) {
		// By default we ignore all keywords that are defined in the syntax
		return ASP.resource.ASP.grammar.ASPGrammarInformationProvider.INSTANCE.getKeywords().contains(word);
	}
	
}
