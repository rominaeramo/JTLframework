/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.ui;

/**
 * A class used to initialize default preference values.
 */
public class ASPPreferenceInitializer extends org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer {
	
	public void initializeDefaultPreferences() {
		
		initializeDefaultSyntaxHighlighting();
		initializeDefaultBrackets();
		
		org.eclipse.jface.preference.IPreferenceStore store = ASP.resource.ASP.ui.ASPUIPlugin.getDefault().getPreferenceStore();
		// Set default value for matching brackets
		store.setDefault(ASP.resource.ASP.ui.ASPPreferenceConstants.EDITOR_MATCHING_BRACKETS_COLOR, "192,192,192");
		store.setDefault(ASP.resource.ASP.ui.ASPPreferenceConstants.EDITOR_MATCHING_BRACKETS_CHECKBOX, true);
		
	}
	
	private void initializeDefaultBrackets() {
		org.eclipse.jface.preference.IPreferenceStore store = ASP.resource.ASP.ui.ASPUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultBrackets(store, new ASP.resource.ASP.mopp.ASPMetaInformation());
	}
	
	public void initializeDefaultSyntaxHighlighting() {
		org.eclipse.jface.preference.IPreferenceStore store = ASP.resource.ASP.ui.ASPUIPlugin.getDefault().getPreferenceStore();
		initializeDefaultSyntaxHighlighting(store, new ASP.resource.ASP.mopp.ASPMetaInformation());
	}
	
	private void initializeDefaultBrackets(org.eclipse.jface.preference.IPreferenceStore store, ASP.resource.ASP.IASPMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		// set default brackets for ITextResource bracket set
		ASP.resource.ASP.ui.ASPBracketSet bracketSet = new ASP.resource.ASP.ui.ASPBracketSet(null, null);
		final java.util.Collection<ASP.resource.ASP.IASPBracketPair> bracketPairs = metaInformation.getBracketPairs();
		if (bracketPairs != null) {
			for (ASP.resource.ASP.IASPBracketPair bracketPair : bracketPairs) {
				bracketSet.addBracketPair(bracketPair.getOpeningBracket(), bracketPair.getClosingBracket(), bracketPair.isClosingEnabledInside());
			}
		}
		store.setDefault(languageId + ASP.resource.ASP.ui.ASPPreferenceConstants.EDITOR_BRACKETS_SUFFIX, bracketSet.getBracketString());
	}
	
	private void initializeDefaultSyntaxHighlighting(org.eclipse.jface.preference.IPreferenceStore store, ASP.resource.ASP.mopp.ASPMetaInformation metaInformation) {
		String languageId = metaInformation.getSyntaxName();
		String[] tokenNames = metaInformation.getSyntaxHighlightableTokenNames();
		if (tokenNames == null) {
			return;
		}
		for (int i = 0; i < tokenNames.length; i++) {
			String tokenName = tokenNames[i];
			ASP.resource.ASP.IASPTokenStyle style = metaInformation.getDefaultTokenStyle(tokenName);
			if (style != null) {
				String color = getColorString(style.getColorAsRGB());
				setProperties(store, languageId, tokenName, color, style.isBold(), true, style.isItalic(), style.isStrikethrough(), style.isUnderline());
			} else {
				setProperties(store, languageId, tokenName, "0,0,0", false, false, false, false, false);
			}
		}
	}
	
	private void setProperties(org.eclipse.jface.preference.IPreferenceStore store, String languageID, String tokenName, String color, boolean bold, boolean enable, boolean italic, boolean strikethrough, boolean underline) {
		store.setDefault(ASP.resource.ASP.ui.ASPSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, ASP.resource.ASP.ui.ASPSyntaxColoringHelper.StyleProperty.BOLD), bold);
		store.setDefault(ASP.resource.ASP.ui.ASPSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, ASP.resource.ASP.ui.ASPSyntaxColoringHelper.StyleProperty.COLOR), color);
		store.setDefault(ASP.resource.ASP.ui.ASPSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, ASP.resource.ASP.ui.ASPSyntaxColoringHelper.StyleProperty.ENABLE), enable);
		store.setDefault(ASP.resource.ASP.ui.ASPSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, ASP.resource.ASP.ui.ASPSyntaxColoringHelper.StyleProperty.ITALIC), italic);
		store.setDefault(ASP.resource.ASP.ui.ASPSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, ASP.resource.ASP.ui.ASPSyntaxColoringHelper.StyleProperty.STRIKETHROUGH), strikethrough);
		store.setDefault(ASP.resource.ASP.ui.ASPSyntaxColoringHelper.getPreferenceKey(languageID, tokenName, ASP.resource.ASP.ui.ASPSyntaxColoringHelper.StyleProperty.UNDERLINE), underline);
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
