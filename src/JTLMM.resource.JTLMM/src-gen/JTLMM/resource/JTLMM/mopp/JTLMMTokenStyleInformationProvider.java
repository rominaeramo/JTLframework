/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.mopp;

public class JTLMMTokenStyleInformationProvider {
	
	public static String TASK_ITEM_TOKEN_NAME = "TASK_ITEM";
	
	public JTLMM.resource.JTLMM.IJTLMMTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("SL_COMMENT".equals(tokenName)) {
			return new JTLMM.resource.JTLMM.mopp.JTLMMTokenStyle(new int[] {0x00, 0xA0, 0x00}, null, false, true, false, false);
		}
		if ("ML_COMMENT".equals(tokenName)) {
			return new JTLMM.resource.JTLMM.mopp.JTLMMTokenStyle(new int[] {0x00, 0xA0, 0x00}, null, false, true, false, false);
		}
		if ("transformation".equals(tokenName)) {
			return new JTLMM.resource.JTLMM.mopp.JTLMMTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("top".equals(tokenName)) {
			return new JTLMM.resource.JTLMM.mopp.JTLMMTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("relation".equals(tokenName)) {
			return new JTLMM.resource.JTLMM.mopp.JTLMMTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("checkonly".equals(tokenName)) {
			return new JTLMM.resource.JTLMM.mopp.JTLMMTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("enforce".equals(tokenName)) {
			return new JTLMM.resource.JTLMM.mopp.JTLMMTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("domain".equals(tokenName)) {
			return new JTLMM.resource.JTLMM.mopp.JTLMMTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("when".equals(tokenName)) {
			return new JTLMM.resource.JTLMM.mopp.JTLMMTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("where".equals(tokenName)) {
			return new JTLMM.resource.JTLMM.mopp.JTLMMTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("true".equals(tokenName)) {
			return new JTLMM.resource.JTLMM.mopp.JTLMMTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("false".equals(tokenName)) {
			return new JTLMM.resource.JTLMM.mopp.JTLMMTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("TASK_ITEM".equals(tokenName)) {
			return new JTLMM.resource.JTLMM.mopp.JTLMMTokenStyle(new int[] {0x7F, 0x9F, 0xBF}, null, true, false, false, false);
		}
		return null;
	}
	
}
