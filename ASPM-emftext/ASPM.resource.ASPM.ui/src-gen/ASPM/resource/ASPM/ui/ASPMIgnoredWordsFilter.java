/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.ui;

/**
 * The IgnoredWordsFilter can be customized to add additional words that must not
 * be marked as misspelled. To customize this class, set option
 * 'overrideIgnoredWordsFilter' to <code>false</code>.
 */
public class ASPMIgnoredWordsFilter {
	
	/**
	 * Checks whether the given word must be ignored even it is misspelled.
	 */
	public boolean ignoreWord(String word) {
		// By default we ignore all keywords that are defined in the syntax
		return ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.INSTANCE.getKeywords().contains(word);
	}
	
}
