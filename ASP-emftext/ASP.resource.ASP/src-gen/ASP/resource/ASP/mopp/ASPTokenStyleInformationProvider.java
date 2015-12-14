/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.mopp;

public class ASPTokenStyleInformationProvider {
	
	public static String TASK_ITEM_TOKEN_NAME = "TASK_ITEM";
	
	public ASP.resource.ASP.IASPTokenStyle getDefaultTokenStyle(String tokenName) {
		if ("Transformation".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("location".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("commentsBefore".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("commentsAfter".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("metamodels".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("usedLiterals".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("constraints".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("elements".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("relations".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("name".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("LeftPattern".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("element".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("relationId".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("RightPattern".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Constraint".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("contents".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Not".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Eq".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("parameterName".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("right1".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("left1".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("EqSimple".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("NotEq".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Literal".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Node".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("metamodel".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("metaClass".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("nodeId".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Prop".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("propId".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("metaClassId".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("propValue".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Edge".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("edgeId".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("sourceMCId".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("targetMCId".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Relation".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("lpattern".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("rpattern".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("type".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Terminal".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("content".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Metamodel".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Metanode".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Metaprop".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("Metaedge".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("sourceMetaClass".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("targetMetaClass".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("isMetanode".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("isMetaprop".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("isMetaedge".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("isDefinition".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("isNodex".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("isTrace".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("isPropx".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("isEdgex".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("left2right".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("right2left".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x80, 0x00, 0x55}, null, true, false, false, false);
		}
		if ("QUOTED_34_34".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x2A, 0x00, 0xFF}, null, false, false, false, false);
		}
		if ("TASK_ITEM".equals(tokenName)) {
			return new ASP.resource.ASP.mopp.ASPTokenStyle(new int[] {0x7F, 0x9F, 0xBF}, null, true, false, false, false);
		}
		return null;
	}
	
}
