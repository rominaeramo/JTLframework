/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.ui;

/**
 * An adapter from the Eclipse
 * <code>org.eclipse.jface.text.rules.ITokenScanner</code> interface to the
 * generated lexer.
 */
public class ASPTokenScanner implements org.eclipse.jface.text.rules.ITokenScanner {
	
	private ASP.resource.ASP.IASPTextScanner lexer;
	private ASP.resource.ASP.IASPTextToken currentToken;
	private java.util.List<ASP.resource.ASP.IASPTextToken> nextTokens;
	private int offset;
	private String languageId;
	private org.eclipse.jface.preference.IPreferenceStore store;
	private ASP.resource.ASP.ui.ASPColorManager colorManager;
	private ASP.resource.ASP.IASPTextResource resource;
	
	/**
	 * 
	 * @param colorManager A manager to obtain color objects
	 */
	public ASPTokenScanner(ASP.resource.ASP.IASPTextResource resource, ASP.resource.ASP.ui.ASPColorManager colorManager) {
		this.resource = resource;
		this.colorManager = colorManager;
		this.lexer = new ASP.resource.ASP.mopp.ASPMetaInformation().createLexer();
		this.languageId = new ASP.resource.ASP.mopp.ASPMetaInformation().getSyntaxName();
		ASP.resource.ASP.ui.ASPUIPlugin plugin = ASP.resource.ASP.ui.ASPUIPlugin.getDefault();
		if (plugin != null) {
			this.store = plugin.getPreferenceStore();
		}
		this.nextTokens = new java.util.ArrayList<ASP.resource.ASP.IASPTextToken>();
	}
	
	public int getTokenLength() {
		return currentToken.getLength();
	}
	
	public int getTokenOffset() {
		return offset + currentToken.getOffset();
	}
	
	public org.eclipse.jface.text.rules.IToken nextToken() {
		boolean isOriginalToken = true;
		if (!nextTokens.isEmpty()) {
			currentToken = nextTokens.remove(0);
			isOriginalToken = false;
		} else {
			currentToken = lexer.getNextToken();
		}
		if (currentToken == null || !currentToken.canBeUsedForSyntaxHighlighting()) {
			return org.eclipse.jface.text.rules.Token.EOF;
		}
		
		if (isOriginalToken) {
			splitCurrentToken();
		}
		
		org.eclipse.jface.text.TextAttribute textAttribute = null;
		String tokenName = currentToken.getName();
		if (tokenName != null) {
			ASP.resource.ASP.IASPTokenStyle staticStyle = getStaticTokenStyle();
			// now call dynamic token styler to allow to apply modifications to the static
			// style
			ASP.resource.ASP.IASPTokenStyle dynamicStyle = getDynamicTokenStyle(staticStyle);
			if (dynamicStyle != null) {
				textAttribute = getTextAttribute(dynamicStyle);
			}
		}
		
		return new org.eclipse.jface.text.rules.Token(textAttribute);
	}
	
	public void setRange(org.eclipse.jface.text.IDocument document, int offset, int length) {
		this.offset = offset;
		try {
			lexer.setText(document.get(offset, length));
		} catch (org.eclipse.jface.text.BadLocationException e) {
			// ignore this error. It might occur during editing when locations are outdated
			// quickly.
		}
	}
	
	public String getTokenText() {
		return currentToken.getText();
	}
	
	public int[] convertToIntArray(org.eclipse.swt.graphics.RGB rgb) {
		if (rgb == null) {
			return null;
		}
		return new int[] {rgb.red, rgb.green, rgb.blue};
	}
	
	public ASP.resource.ASP.IASPTokenStyle getStaticTokenStyle() {
		ASP.resource.ASP.IASPTokenStyle staticStyle = null;
		String tokenName = currentToken.getName();
		String enableKey = ASP.resource.ASP.ui.ASPSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, ASP.resource.ASP.ui.ASPSyntaxColoringHelper.StyleProperty.ENABLE);
		boolean enabled = store.getBoolean(enableKey);
		if (enabled) {
			String colorKey = ASP.resource.ASP.ui.ASPSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, ASP.resource.ASP.ui.ASPSyntaxColoringHelper.StyleProperty.COLOR);
			org.eclipse.swt.graphics.RGB foregroundRGB = org.eclipse.jface.preference.PreferenceConverter.getColor(store, colorKey);
			org.eclipse.swt.graphics.RGB backgroundRGB = null;
			boolean bold = store.getBoolean(ASP.resource.ASP.ui.ASPSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, ASP.resource.ASP.ui.ASPSyntaxColoringHelper.StyleProperty.BOLD));
			boolean italic = store.getBoolean(ASP.resource.ASP.ui.ASPSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, ASP.resource.ASP.ui.ASPSyntaxColoringHelper.StyleProperty.ITALIC));
			boolean strikethrough = store.getBoolean(ASP.resource.ASP.ui.ASPSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, ASP.resource.ASP.ui.ASPSyntaxColoringHelper.StyleProperty.STRIKETHROUGH));
			boolean underline = store.getBoolean(ASP.resource.ASP.ui.ASPSyntaxColoringHelper.getPreferenceKey(languageId, tokenName, ASP.resource.ASP.ui.ASPSyntaxColoringHelper.StyleProperty.UNDERLINE));
			staticStyle = new ASP.resource.ASP.mopp.ASPTokenStyle(convertToIntArray(foregroundRGB), convertToIntArray(backgroundRGB), bold, italic, strikethrough, underline);
		}
		return staticStyle;
	}
	
	public ASP.resource.ASP.IASPTokenStyle getDynamicTokenStyle(ASP.resource.ASP.IASPTokenStyle staticStyle) {
		ASP.resource.ASP.mopp.ASPDynamicTokenStyler dynamicTokenStyler = new ASP.resource.ASP.mopp.ASPDynamicTokenStyler();
		ASP.resource.ASP.IASPTokenStyle dynamicStyle = dynamicTokenStyler.getDynamicTokenStyle(resource, currentToken, staticStyle);
		return dynamicStyle;
	}
	
	public org.eclipse.jface.text.TextAttribute getTextAttribute(ASP.resource.ASP.IASPTokenStyle tokeStyle) {
		int[] foregroundColorArray = tokeStyle.getColorAsRGB();
		org.eclipse.swt.graphics.Color foregroundColor = null;
		if (colorManager != null) {
			foregroundColor = colorManager.getColor(new org.eclipse.swt.graphics.RGB(foregroundColorArray[0], foregroundColorArray[1], foregroundColorArray[2]));
		}
		int[] backgroundColorArray = tokeStyle.getBackgroundColorAsRGB();
		org.eclipse.swt.graphics.Color backgroundColor = null;
		if (backgroundColorArray != null) {
			org.eclipse.swt.graphics.RGB backgroundRGB = new org.eclipse.swt.graphics.RGB(backgroundColorArray[0], backgroundColorArray[1], backgroundColorArray[2]);
			if (colorManager != null) {
				backgroundColor = colorManager.getColor(backgroundRGB);
			}
		}
		int style = org.eclipse.swt.SWT.NORMAL;
		if (tokeStyle.isBold()) {
			style = style | org.eclipse.swt.SWT.BOLD;
		}
		if (tokeStyle.isItalic()) {
			style = style | org.eclipse.swt.SWT.ITALIC;
		}
		if (tokeStyle.isStrikethrough()) {
			style = style | org.eclipse.jface.text.TextAttribute.STRIKETHROUGH;
		}
		if (tokeStyle.isUnderline()) {
			style = style | org.eclipse.jface.text.TextAttribute.UNDERLINE;
		}
		return new org.eclipse.jface.text.TextAttribute(foregroundColor, backgroundColor, style);
	}
	
	/**
	 * Tries to split the current token if it contains task items.
	 */
	public void splitCurrentToken() {
		final String text = currentToken.getText();
		final String name = currentToken.getName();
		final int line = currentToken.getLine();
		final int charStart = currentToken.getOffset();
		final int column = currentToken.getColumn();
		
		java.util.List<ASP.resource.ASP.mopp.ASPTaskItem> taskItems = new ASP.resource.ASP.mopp.ASPTaskItemDetector().findTaskItems(text, line, charStart);
		
		// this is the offset for the next token to be added
		int offset = charStart;
		int itemBeginRelative;
		java.util.List<ASP.resource.ASP.IASPTextToken> newItems = new java.util.ArrayList<ASP.resource.ASP.IASPTextToken>();
		for (ASP.resource.ASP.mopp.ASPTaskItem taskItem : taskItems) {
			int itemBegin = taskItem.getCharStart();
			int itemLine = taskItem.getLine();
			int itemColumn = 0;
			
			itemBeginRelative = itemBegin - charStart;
			// create token before task item (TODO if required)
			String textBefore = text.substring(offset - charStart, itemBeginRelative);
			int textBeforeLength = textBefore.length();
			newItems.add(new ASP.resource.ASP.mopp.ASPTextToken(name, textBefore, offset, textBeforeLength, line, column, true));
			
			// create token for the task item itself
			offset = offset + textBeforeLength;
			String itemText = taskItem.getKeyword();
			int itemTextLength = itemText.length();
			newItems.add(new ASP.resource.ASP.mopp.ASPTextToken(ASP.resource.ASP.mopp.ASPTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME, itemText, offset, itemTextLength, itemLine, itemColumn, true));
			
			offset = offset + itemTextLength;
		}
		
		if (!taskItems.isEmpty()) {
			// create token after last task item (TODO if required)
			String textAfter = text.substring(offset - charStart);
			newItems.add(new ASP.resource.ASP.mopp.ASPTextToken(name, textAfter, offset, textAfter.length(), line, column, true));
		}
		
		if (!newItems.isEmpty()) {
			// replace tokens
			currentToken = newItems.remove(0);
			nextTokens = newItems;
		}
		
	}
}
