/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.mopp;

/**
 * The ASPMMTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class ASPMMTokenResolverFactory implements ASPMM.resource.ASPMM.IASPMMTokenResolverFactory {
	
	private java.util.Map<String, ASPMM.resource.ASPMM.IASPMMTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, ASPMM.resource.ASPMM.IASPMMTokenResolver> featureName2CollectInTokenResolver;
	private static ASPMM.resource.ASPMM.IASPMMTokenResolver defaultResolver = new ASPMM.resource.ASPMM.analysis.ASPMMDefaultTokenResolver();
	
	public ASPMMTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, ASPMM.resource.ASPMM.IASPMMTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, ASPMM.resource.ASPMM.IASPMMTokenResolver>();
		registerTokenResolver("TEXT", new ASPMM.resource.ASPMM.analysis.ASPMMTEXTTokenResolver());
	}
	
	public ASPMM.resource.ASPMM.IASPMMTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public ASPMM.resource.ASPMM.IASPMMTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, ASPMM.resource.ASPMM.IASPMMTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, ASPMM.resource.ASPMM.IASPMMTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected ASPMM.resource.ASPMM.IASPMMTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private ASPMM.resource.ASPMM.IASPMMTokenResolver internalCreateResolver(java.util.Map<String, ASPMM.resource.ASPMM.IASPMMTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, ASPMM.resource.ASPMM.IASPMMTokenResolver> resolverMap, String key, ASPMM.resource.ASPMM.IASPMMTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
