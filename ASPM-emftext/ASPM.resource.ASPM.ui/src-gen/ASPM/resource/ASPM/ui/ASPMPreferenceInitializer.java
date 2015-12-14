/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.ui;

/**
 * A class used to initialize default preference values.
 */
public class ASPMPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = ASPM.resource.ASPM.ui.ASPMUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(ASPM.resource.ASPM.ui.ASPMPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(ASPM.resource.ASPM.ui.ASPMPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = ASPM.resource.ASPM.ui.ASPMUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new ASPM.resource.ASPM.mopp.ASPMMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = ASPM.resource.ASPM.ui.ASPMUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new ASPM.resource.ASPM.mopp.ASPMMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, ASPM.resource.ASPM.IASPMMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		ASPM.resource.ASPM.ui.ASPMBracketSet bracketSet = new ASPM.resource.ASPM.ui.ASPMBracketSet(null, null);
		final java.util.Collection<ASPM.resource.ASPM.IASPMBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (ASPM.resource.ASPM.IASPMBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + ASPM.resource.ASPM.ui.ASPMPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, ASPM.resource.ASPM.mopp.ASPMMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		String[] tokenNames = metaInformation.getSyntaxHighlightableTokenNames();
		if (tokenNames == null) {
			return;
		}
		for (int i = 0; i < tokenNames.length; i++) {
			String tokenName = tokenNames[i];
			ASPM.resource.ASPM.IASPMTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(ASPM.resource.ASPM.ui.ASPMSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, ASPM.resource.ASPM.ui.ASPMSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(ASPM.resource.ASPM.ui.ASPMSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, ASPM.resource.ASPM.ui.ASPMSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(ASPM.resource.ASPM.ui.ASPMSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, ASPM.resource.ASPM.ui.ASPMSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(ASPM.resource.ASPM.ui.ASPMSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, ASPM.resource.ASPM.ui.ASPMSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(ASPM.resource.ASPM.ui.ASPMSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, ASPM.resource.ASPM.ui.ASPMSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(ASPM.resource.ASPM.ui.ASPMSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, ASPM.resource.ASPM.ui.ASPMSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
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
