/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.mopp;

public class ASPMTokenStyleInformationProvider {
	
	public static String TASK_ITEM_TOKEN_NAME = "TASK_ITEM";
	
	public ASPM.resource.ASPM.IASPMTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("model".equals(tokenName)) {
			return new ASPM.resource.ASPM.mopp.ASPMTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("node".equals(tokenName)) {
			return new ASPM.resource.ASPM.mopp.ASPMTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("prop".equals(tokenName)) {
			return new ASPM.resource.ASPM.mopp.ASPMTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("edge".equals(tokenName)) {
			return new ASPM.resource.ASPM.mopp.ASPMTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("TASK_ITEM".equals(tokenName)) {
			return new ASPM.resource.ASPM.mopp.ASPMTokenStyle(new int[] {0x7F, 0x9F, 0xBF}, null, true, false, false, false);
		}
		return null;
	}
	
}
