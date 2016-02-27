/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.mopp;

public class JTLMMReferenceResolverSwitch implements JTLMM.resource.JTLMM.IJTLMMReferenceResolverSwitch {
	
	/**
	 * This map stores a copy of the options the were set for loading the resource.
	 */
	private java.util.Map<Object, Object> options;
	
	
	public void setOptions(java.util.Map<?, ?> options) {
		if (options != null) {
			this.options = new java.util.LinkedHashMap<Object, Object>();
			this.options.putAll(options);
		}
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, JTLMM.resource.JTLMM.IJTLMMReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
	}
	
	public JTLMM.resource.JTLMM.IJTLMMReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		return null;
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})	
	public <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> JTLMM.resource.JTLMM.IJTLMMReferenceResolver<ContainerType, ReferenceType> getResolverChain(org.eclipse.emf.ecore.EStructuralFeature reference, JTLMM.resource.JTLMM.IJTLMMReferenceResolver<ContainerType, ReferenceType> originalResolver) {
		if (options == null) {
			return originalResolver;
		}
		Object value = options.get(JTLMM.resource.JTLMM.IJTLMMOptions.ADDITIONAL_REFERENCE_RESOLVERS);
		if (value == null) {
			return originalResolver;
		}
		if (!(value instanceof java.util.Map)) {
			// send this to the error log
			new JTLMM.resource.JTLMM.util.JTLMMRuntimeUtil().logWarning("Found value with invalid type for option " + JTLMM.resource.JTLMM.IJTLMMOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + java.util.Map.class.getName() + ", but was " + value.getClass().getName() + ")", null);
			return originalResolver;
		}
		java.util.Map<?,?> resolverMap = (java.util.Map<?,?>) value;
		Object resolverValue = resolverMap.get(reference);
		if (resolverValue == null) {
			return originalResolver;
		}
		if (resolverValue instanceof JTLMM.resource.JTLMM.IJTLMMReferenceResolver) {
			JTLMM.resource.JTLMM.IJTLMMReferenceResolver replacingResolver = (JTLMM.resource.JTLMM.IJTLMMReferenceResolver) resolverValue;
			if (replacingResolver instanceof JTLMM.resource.JTLMM.IJTLMMDelegatingReferenceResolver) {
				// pass original resolver to the replacing one
				((JTLMM.resource.JTLMM.IJTLMMDelegatingReferenceResolver) replacingResolver).setDelegate(originalResolver);
			}
			return replacingResolver;
		} else if (resolverValue instanceof java.util.Collection) {
			java.util.Collection replacingResolvers = (java.util.Collection) resolverValue;
			JTLMM.resource.JTLMM.IJTLMMReferenceResolver replacingResolver = originalResolver;
			for (Object next : replacingResolvers) {
				if (next instanceof JTLMM.resource.JTLMM.IJTLMMReferenceCache) {
					JTLMM.resource.JTLMM.IJTLMMReferenceResolver nextResolver = (JTLMM.resource.JTLMM.IJTLMMReferenceResolver) next;
					if (nextResolver instanceof JTLMM.resource.JTLMM.IJTLMMDelegatingReferenceResolver) {
						// pass original resolver to the replacing one
						((JTLMM.resource.JTLMM.IJTLMMDelegatingReferenceResolver) nextResolver).setDelegate(replacingResolver);
					}
					replacingResolver = nextResolver;
				} else {
					// The collection contains a non-resolver. Send a warning to the error log.
					new JTLMM.resource.JTLMM.util.JTLMMRuntimeUtil().logWarning("Found value with invalid type in value map for option " + JTLMM.resource.JTLMM.IJTLMMOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + JTLMM.resource.JTLMM.IJTLMMDelegatingReferenceResolver.class.getName() + ", but was " + next.getClass().getName() + ")", null);
				}
			}
			return replacingResolver;
		} else {
			// The value for the option ADDITIONAL_REFERENCE_RESOLVERS has an unknown type.
			new JTLMM.resource.JTLMM.util.JTLMMRuntimeUtil().logWarning("Found value with invalid type in value map for option " + JTLMM.resource.JTLMM.IJTLMMOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + JTLMM.resource.JTLMM.IJTLMMDelegatingReferenceResolver.class.getName() + ", but was " + resolverValue.getClass().getName() + ")", null);
			return originalResolver;
		}
	}
	
}
