/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.mopp;

public class ASPMMTokenStyleInformationProvider {
	
	public static String TASK_ITEM_TOKEN_NAME = "TASK_ITEM";
	
	public ASPMM.resource.ASPMM.IASPMMTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("metamodel".equals(tokenName)) {
			return new ASPMM.resource.ASPMM.mopp.ASPMMTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("metanode".equals(tokenName)) {
			return new ASPMM.resource.ASPMM.mopp.ASPMMTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("metaprop".equals(tokenName)) {
			return new ASPMM.resource.ASPMM.mopp.ASPMMTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("metaedge".equals(tokenName)) {
			return new ASPMM.resource.ASPMM.mopp.ASPMMTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("association".equals(tokenName)) {
			return new ASPMM.resource.ASPMM.mopp.ASPMMTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("generalization".equals(tokenName)) {
			return new ASPMM.resource.ASPMM.mopp.ASPMMTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("composition".equals(tokenName)) {
			return new ASPMM.resource.ASPMM.mopp.ASPMMTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("TASK_ITEM".equals(tokenName)) {
			return new ASPMM.resource.ASPMM.mopp.ASPMMTokenStyle(new int[] {0x7F, 0x9F, 0xBF}, null, true, false, false, false);
		}
		return null;
	}
	
}
