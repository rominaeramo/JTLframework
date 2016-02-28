/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.mopp;

public class ASPMReferenceResolverSwitch implements ASPM.resource.ASPM.IASPMReferenceResolverSwitch {
	
	/**
	 * This map stores a copy of the options the were set for loading the resource.
	 */
	private java.util.Map<Object, Object> options;
	
	protected ASPM.resource.ASPM.analysis.NodeModelReferenceResolver nodeModelReferenceResolver = new ASPM.resource.ASPM.analysis.NodeModelReferenceResolver();
	protected ASPM.resource.ASPM.analysis.PropModelReferenceResolver propModelReferenceResolver = new ASPM.resource.ASPM.analysis.PropModelReferenceResolver();
	protected ASPM.resource.ASPM.analysis.PropOwnerReferenceResolver propOwnerReferenceResolver = new ASPM.resource.ASPM.analysis.PropOwnerReferenceResolver();
	protected ASPM.resource.ASPM.analysis.EdgeModelReferenceResolver edgeModelReferenceResolver = new ASPM.resource.ASPM.analysis.EdgeModelReferenceResolver();
	protected ASPM.resource.ASPM.analysis.EdgeSourceReferenceResolver edgeSourceReferenceResolver = new ASPM.resource.ASPM.analysis.EdgeSourceReferenceResolver();
	protected ASPM.resource.ASPM.analysis.EdgeTargetReferenceResolver edgeTargetReferenceResolver = new ASPM.resource.ASPM.analysis.EdgeTargetReferenceResolver();
	
	public ASPM.resource.ASPM.IASPMReferenceResolver<ASPM.Node, ASPM.Model> getNodeModelReferenceResolver() {
		return getResolverChain(ASPM.ASPMPackage.eINSTANCE.getNode_Model(), nodeModelReferenceResolver);
	}
	
	public ASPM.resource.ASPM.IASPMReferenceResolver<ASPM.Prop, ASPM.Model> getPropModelReferenceResolver() {
		return getResolverChain(ASPM.ASPMPackage.eINSTANCE.getProp_Model(), propModelReferenceResolver);
	}
	
	public ASPM.resource.ASPM.IASPMReferenceResolver<ASPM.Prop, ASPM.Node> getPropOwnerReferenceResolver() {
		return getResolverChain(ASPM.ASPMPackage.eINSTANCE.getProp_Owner(), propOwnerReferenceResolver);
	}
	
	public ASPM.resource.ASPM.IASPMReferenceResolver<ASPM.Edge, ASPM.Model> getEdgeModelReferenceResolver() {
		return getResolverChain(ASPM.ASPMPackage.eINSTANCE.getEdge_Model(), edgeModelReferenceResolver);
	}
	
	public ASPM.resource.ASPM.IASPMReferenceResolver<ASPM.Edge, ASPM.Node> getEdgeSourceReferenceResolver() {
		return getResolverChain(ASPM.ASPMPackage.eINSTANCE.getEdge_Source(), edgeSourceReferenceResolver);
	}
	
	public ASPM.resource.ASPM.IASPMReferenceResolver<ASPM.Edge, ASPM.Node> getEdgeTargetReferenceResolver() {
		return getResolverChain(ASPM.ASPMPackage.eINSTANCE.getEdge_Target(), edgeTargetReferenceResolver);
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		if (options != null) {
			this.options = new java.util.LinkedHashMap<Object, Object>();
			this.options.putAll(options);
		}
		nodeModelReferenceResolver.setOptions(options);
		propModelReferenceResolver.setOptions(options);
		propOwnerReferenceResolver.setOptions(options);
		edgeModelReferenceResolver.setOptions(options);
		edgeSourceReferenceResolver.setOptions(options);
		edgeTargetReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, ASPM.resource.ASPM.IASPMReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (ASPM.ASPMPackage.eINSTANCE.getNode().isInstance(container)) {
			ASPMFuzzyResolveResult<ASPM.Model> frr = new ASPMFuzzyResolveResult<ASPM.Model>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("model")) {
				nodeModelReferenceResolver.resolve(identifier, (ASPM.Node) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ASPM.ASPMPackage.eINSTANCE.getProp().isInstance(container)) {
			ASPMFuzzyResolveResult<ASPM.Model> frr = new ASPMFuzzyResolveResult<ASPM.Model>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("model")) {
				propModelReferenceResolver.resolve(identifier, (ASPM.Prop) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ASPM.ASPMPackage.eINSTANCE.getProp().isInstance(container)) {
			ASPMFuzzyResolveResult<ASPM.Node> frr = new ASPMFuzzyResolveResult<ASPM.Node>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("owner")) {
				propOwnerReferenceResolver.resolve(identifier, (ASPM.Prop) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ASPM.ASPMPackage.eINSTANCE.getEdge().isInstance(container)) {
			ASPMFuzzyResolveResult<ASPM.Model> frr = new ASPMFuzzyResolveResult<ASPM.Model>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("model")) {
				edgeModelReferenceResolver.resolve(identifier, (ASPM.Edge) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ASPM.ASPMPackage.eINSTANCE.getEdge().isInstance(container)) {
			ASPMFuzzyResolveResult<ASPM.Node> frr = new ASPMFuzzyResolveResult<ASPM.Node>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("source")) {
				edgeSourceReferenceResolver.resolve(identifier, (ASPM.Edge) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ASPM.ASPMPackage.eINSTANCE.getEdge().isInstance(container)) {
			ASPMFuzzyResolveResult<ASPM.Node> frr = new ASPMFuzzyResolveResult<ASPM.Node>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("target")) {
				edgeTargetReferenceResolver.resolve(identifier, (ASPM.Edge) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
	
	public ASPM.resource.ASPM.IASPMReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		if (reference == ASPM.ASPMPackage.eINSTANCE.getNode_Model()) {
			return getResolverChain(reference, nodeModelReferenceResolver);
		}
		if (reference == ASPM.ASPMPackage.eINSTANCE.getProp_Model()) {
			return getResolverChain(reference, propModelReferenceResolver);
		}
		if (reference == ASPM.ASPMPackage.eINSTANCE.getProp_Owner()) {
			return getResolverChain(reference, propOwnerReferenceResolver);
		}
		if (reference == ASPM.ASPMPackage.eINSTANCE.getEdge_Model()) {
			return getResolverChain(reference, edgeModelReferenceResolver);
		}
		if (reference == ASPM.ASPMPackage.eINSTANCE.getEdge_Source()) {
			return getResolverChain(reference, edgeSourceReferenceResolver);
		}
		if (reference == ASPM.ASPMPackage.eINSTANCE.getEdge_Target()) {
			return getResolverChain(reference, edgeTargetReferenceResolver);
		}
		return null;
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})	
	public <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> ASPM.resource.ASPM.IASPMReferenceResolver<ContainerType, ReferenceType> getResolverChain(org.eclipse.emf.ecore.EStructuralFeature reference, ASPM.resource.ASPM.IASPMReferenceResolver<ContainerType, ReferenceType> originalResolver) {
		if (options == null) {
			return originalResolver;
		}
		Object value = options.get(ASPM.resource.ASPM.IASPMOptions.ADDITIONAL_REFERENCE_RESOLVERS);
		if (value == null) {
			return originalResolver;
		}
		if (!(value instanceof java.util.Map)) {
			// send this to the error log
			new ASPM.resource.ASPM.util.ASPMRuntimeUtil().logWarning("Found value with invalid type for option " + ASPM.resource.ASPM.IASPMOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + java.util.Map.class.getName() + ", but was " + value.getClass().getName() + ")", null);
			return originalResolver;
		}
		java.util.Map<?,?> resolverMap = (java.util.Map<?,?>) value;
		Object resolverValue = resolverMap.get(reference);
		if (resolverValue == null) {
			return originalResolver;
		}
		if (resolverValue instanceof ASPM.resource.ASPM.IASPMReferenceResolver) {
			ASPM.resource.ASPM.IASPMReferenceResolver replacingResolver = (ASPM.resource.ASPM.IASPMReferenceResolver) resolverValue;
			if (replacingResolver instanceof ASPM.resource.ASPM.IASPMDelegatingReferenceResolver) {
				// pass original resolver to the replacing one
				((ASPM.resource.ASPM.IASPMDelegatingReferenceResolver) replacingResolver).setDelegate(originalResolver);
			}
			return replacingResolver;
		} else if (resolverValue instanceof java.util.Collection) {
			java.util.Collection replacingResolvers = (java.util.Collection) resolverValue;
			ASPM.resource.ASPM.IASPMReferenceResolver replacingResolver = originalResolver;
			for (Object next : replacingResolvers) {
				if (next instanceof ASPM.resource.ASPM.IASPMReferenceCache) {
					ASPM.resource.ASPM.IASPMReferenceResolver nextResolver = (ASPM.resource.ASPM.IASPMReferenceResolver) next;
					if (nextResolver instanceof ASPM.resource.ASPM.IASPMDelegatingReferenceResolver) {
						// pass original resolver to the replacing one
						((ASPM.resource.ASPM.IASPMDelegatingReferenceResolver) nextResolver).setDelegate(replacingResolver);
					}
					replacingResolver = nextResolver;
				} else {
					// The collection contains a non-resolver. Send a warning to the error log.
					new ASPM.resource.ASPM.util.ASPMRuntimeUtil().logWarning("Found value with invalid type in value map for option " + ASPM.resource.ASPM.IASPMOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + ASPM.resource.ASPM.IASPMDelegatingReferenceResolver.class.getName() + ", but was " + next.getClass().getName() + ")", null);
				}
			}
			return replacingResolver;
		} else {
			// The value for the option ADDITIONAL_REFERENCE_RESOLVERS has an unknown type.
			new ASPM.resource.ASPM.util.ASPMRuntimeUtil().logWarning("Found value with invalid type in value map for option " + ASPM.resource.ASPM.IASPMOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + ASPM.resource.ASPM.IASPMDelegatingReferenceResolver.class.getName() + ", but was " + resolverValue.getClass().getName() + ")", null);
			return originalResolver;
		}
	}
	
}
