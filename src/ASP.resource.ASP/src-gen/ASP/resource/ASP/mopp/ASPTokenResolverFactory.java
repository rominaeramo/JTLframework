/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.mopp;

/**
 * The ASPTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class ASPTokenResolverFactory implements ASP.resource.ASP.IASPTokenResolverFactory {
	
	private java.util.Map<String, ASP.resource.ASP.IASPTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, ASP.resource.ASP.IASPTokenResolver> featureName2CollectInTokenResolver;
	private static ASP.resource.ASP.IASPTokenResolver defaultResolver = new ASP.resource.ASP.analysis.ASPDefaultTokenResolver();
	
	public ASPTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, ASP.resource.ASP.IASPTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, ASP.resource.ASP.IASPTokenResolver>();
		registerTokenResolver("TEXT", new ASP.resource.ASP.analysis.ASPTEXTTokenResolver());
		registerTokenResolver("QUOTED_40_41", new ASP.resource.ASP.analysis.ASPQUOTED_40_41TokenResolver());
	}
	
	public ASP.resource.ASP.IASPTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public ASP.resource.ASP.IASPTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, ASP.resource.ASP.IASPTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, ASP.resource.ASP.IASPTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected ASP.resource.ASP.IASPTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private ASP.resource.ASP.IASPTokenResolver internalCreateResolver(java.util.Map<String, ASP.resource.ASP.IASPTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, ASP.resource.ASP.IASPTokenResolver> resolverMap, String key, ASP.resource.ASP.IASPTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
