/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.ui;

/**
 * A class used to initialize default preference values.
 */
public class JTLMMPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = JTLMM.resource.JTLMM.ui.JTLMMUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(JTLMM.resource.JTLMM.ui.JTLMMPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(JTLMM.resource.JTLMM.ui.JTLMMPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = JTLMM.resource.JTLMM.ui.JTLMMUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new JTLMM.resource.JTLMM.mopp.JTLMMMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = JTLMM.resource.JTLMM.ui.JTLMMUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new JTLMM.resource.JTLMM.mopp.JTLMMMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, JTLMM.resource.JTLMM.IJTLMMMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		JTLMM.resource.JTLMM.ui.JTLMMBracketSet bracketSet = new JTLMM.resource.JTLMM.ui.JTLMMBracketSet(null, null);
		final java.util.Collection<JTLMM.resource.JTLMM.IJTLMMBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (JTLMM.resource.JTLMM.IJTLMMBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + JTLMM.resource.JTLMM.ui.JTLMMPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, JTLMM.resource.JTLMM.mopp.JTLMMMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		String[] tokenNames = metaInformation.getSyntaxHighlightableTokenNames();
		if (tokenNames == null) {
			return;
		}
		for (int i = 0; i < tokenNames.length; i++) {
			String tokenName = tokenNames[i];
			JTLMM.resource.JTLMM.IJTLMMTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(JTLMM.resource.JTLMM.ui.JTLMMSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, JTLMM.resource.JTLMM.ui.JTLMMSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(JTLMM.resource.JTLMM.ui.JTLMMSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, JTLMM.resource.JTLMM.ui.JTLMMSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(JTLMM.resource.JTLMM.ui.JTLMMSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, JTLMM.resource.JTLMM.ui.JTLMMSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(JTLMM.resource.JTLMM.ui.JTLMMSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, JTLMM.resource.JTLMM.ui.JTLMMSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(JTLMM.resource.JTLMM.ui.JTLMMSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, JTLMM.resource.JTLMM.ui.JTLMMSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(JTLMM.resource.JTLMM.ui.JTLMMSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, JTLMM.resource.JTLMM.ui.JTLMMSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
	}
	
	private String getColorString(int[] colorAsRGB) {
		if (colorAsRGB == null) {
			return "0,0,0";
		}
		if (colorAsRGB.length != 3) {
			return "0,0,0";
		}
		return colorAsRGB[0] + "," +colorAsRGB[1] + ","+ colorAsRGB[2];
	}
}
