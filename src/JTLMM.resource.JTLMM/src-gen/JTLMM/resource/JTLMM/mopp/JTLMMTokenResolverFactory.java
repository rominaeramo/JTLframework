/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.mopp;

/**
 * The JTLMMTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class JTLMMTokenResolverFactory implements JTLMM.resource.JTLMM.IJTLMMTokenResolverFactory {
	
	private java.util.Map<String, JTLMM.resource.JTLMM.IJTLMMTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, JTLMM.resource.JTLMM.IJTLMMTokenResolver> featureName2CollectInTokenResolver;
	private static JTLMM.resource.JTLMM.IJTLMMTokenResolver defaultResolver = new JTLMM.resource.JTLMM.analysis.JTLMMDefaultTokenResolver();
	
	public JTLMMTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, JTLMM.resource.JTLMM.IJTLMMTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, JTLMM.resource.JTLMM.IJTLMMTokenResolver>();
		registerTokenResolver("TEXT", new JTLMM.resource.JTLMM.analysis.JTLMMTEXTTokenResolver());
	}
	
	public JTLMM.resource.JTLMM.IJTLMMTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public JTLMM.resource.JTLMM.IJTLMMTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, JTLMM.resource.JTLMM.IJTLMMTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, JTLMM.resource.JTLMM.IJTLMMTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected JTLMM.resource.JTLMM.IJTLMMTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private JTLMM.resource.JTLMM.IJTLMMTokenResolver internalCreateResolver(java.util.Map<String, JTLMM.resource.JTLMM.IJTLMMTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, JTLMM.resource.JTLMM.IJTLMMTokenResolver> resolverMap, String key, JTLMM.resource.JTLMM.IJTLMMTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
