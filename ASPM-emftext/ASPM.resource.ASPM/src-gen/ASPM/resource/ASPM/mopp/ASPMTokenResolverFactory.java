/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.mopp;

/**
 * The ASPMTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class ASPMTokenResolverFactory implements ASPM.resource.ASPM.IASPMTokenResolverFactory {
	
	private java.util.Map<String, ASPM.resource.ASPM.IASPMTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, ASPM.resource.ASPM.IASPMTokenResolver> featureName2CollectInTokenResolver;
	private static ASPM.resource.ASPM.IASPMTokenResolver defaultResolver = new ASPM.resource.ASPM.analysis.ASPMDefaultTokenResolver();
	
	public ASPMTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, ASPM.resource.ASPM.IASPMTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, ASPM.resource.ASPM.IASPMTokenResolver>();
		registerTokenResolver("TEXT", new ASPM.resource.ASPM.analysis.ASPMTEXTTokenResolver());
	}
	
	public ASPM.resource.ASPM.IASPMTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public ASPM.resource.ASPM.IASPMTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, ASPM.resource.ASPM.IASPMTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, ASPM.resource.ASPM.IASPMTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected ASPM.resource.ASPM.IASPMTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private ASPM.resource.ASPM.IASPMTokenResolver internalCreateResolver(java.util.Map<String, ASPM.resource.ASPM.IASPMTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, ASPM.resource.ASPM.IASPMTokenResolver> resolverMap, String key, ASPM.resource.ASPM.IASPMTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
