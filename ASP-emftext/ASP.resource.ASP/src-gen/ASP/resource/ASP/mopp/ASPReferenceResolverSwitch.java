/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.mopp;

public class ASPReferenceResolverSwitch implements ASP.resource.ASP.IASPReferenceResolverSwitch {
	
	/**
	 * This map stores a copy of the options the were set for loading the resource.
	 */
	private java.util.Map<Object, Object> options;
	
	protected ASP.resource.ASP.analysis.EqRight1ReferenceResolver eqRight1ReferenceResolver = new ASP.resource.ASP.analysis.EqRight1ReferenceResolver();
	protected ASP.resource.ASP.analysis.EqLeft1ReferenceResolver eqLeft1ReferenceResolver = new ASP.resource.ASP.analysis.EqLeft1ReferenceResolver();
	protected ASP.resource.ASP.analysis.EqSimpleRight1ReferenceResolver eqSimpleRight1ReferenceResolver = new ASP.resource.ASP.analysis.EqSimpleRight1ReferenceResolver();
	protected ASP.resource.ASP.analysis.EqSimpleLeft1ReferenceResolver eqSimpleLeft1ReferenceResolver = new ASP.resource.ASP.analysis.EqSimpleLeft1ReferenceResolver();
	protected ASP.resource.ASP.analysis.NotEqRight1ReferenceResolver notEqRight1ReferenceResolver = new ASP.resource.ASP.analysis.NotEqRight1ReferenceResolver();
	protected ASP.resource.ASP.analysis.NotEqLeft1ReferenceResolver notEqLeft1ReferenceResolver = new ASP.resource.ASP.analysis.NotEqLeft1ReferenceResolver();
	protected ASP.resource.ASP.analysis.NodeMetamodelReferenceResolver nodeMetamodelReferenceResolver = new ASP.resource.ASP.analysis.NodeMetamodelReferenceResolver();
	protected ASP.resource.ASP.analysis.PropMetamodelReferenceResolver propMetamodelReferenceResolver = new ASP.resource.ASP.analysis.PropMetamodelReferenceResolver();
	protected ASP.resource.ASP.analysis.EdgeMetamodelReferenceResolver edgeMetamodelReferenceResolver = new ASP.resource.ASP.analysis.EdgeMetamodelReferenceResolver();
	protected ASP.resource.ASP.analysis.PatternElementMetamodelReferenceResolver patternElementMetamodelReferenceResolver = new ASP.resource.ASP.analysis.PatternElementMetamodelReferenceResolver();
	
	public ASP.resource.ASP.IASPReferenceResolver<ASP.Eq, ASP.Literal> getEqRight1ReferenceResolver() {
		return getResolverChain(ASP.ASPPackage.eINSTANCE.getEq_Right1(), eqRight1ReferenceResolver);
	}
	
	public ASP.resource.ASP.IASPReferenceResolver<ASP.Eq, ASP.Literal> getEqLeft1ReferenceResolver() {
		return getResolverChain(ASP.ASPPackage.eINSTANCE.getEq_Left1(), eqLeft1ReferenceResolver);
	}
	
	public ASP.resource.ASP.IASPReferenceResolver<ASP.EqSimple, ASP.Literal> getEqSimpleRight1ReferenceResolver() {
		return getResolverChain(ASP.ASPPackage.eINSTANCE.getEqSimple_Right1(), eqSimpleRight1ReferenceResolver);
	}
	
	public ASP.resource.ASP.IASPReferenceResolver<ASP.EqSimple, ASP.Literal> getEqSimpleLeft1ReferenceResolver() {
		return getResolverChain(ASP.ASPPackage.eINSTANCE.getEqSimple_Left1(), eqSimpleLeft1ReferenceResolver);
	}
	
	public ASP.resource.ASP.IASPReferenceResolver<ASP.NotEq, ASP.Literal> getNotEqRight1ReferenceResolver() {
		return getResolverChain(ASP.ASPPackage.eINSTANCE.getNotEq_Right1(), notEqRight1ReferenceResolver);
	}
	
	public ASP.resource.ASP.IASPReferenceResolver<ASP.NotEq, ASP.Literal> getNotEqLeft1ReferenceResolver() {
		return getResolverChain(ASP.ASPPackage.eINSTANCE.getNotEq_Left1(), notEqLeft1ReferenceResolver);
	}
	
	public ASP.resource.ASP.IASPReferenceResolver<ASP.Node, ASP.Metamodel> getNodeMetamodelReferenceResolver() {
		return getResolverChain(ASP.ASPPackage.eINSTANCE.getNode_Metamodel(), nodeMetamodelReferenceResolver);
	}
	
	public ASP.resource.ASP.IASPReferenceResolver<ASP.Prop, ASP.Metamodel> getPropMetamodelReferenceResolver() {
		return getResolverChain(ASP.ASPPackage.eINSTANCE.getProp_Metamodel(), propMetamodelReferenceResolver);
	}
	
	public ASP.resource.ASP.IASPReferenceResolver<ASP.Edge, ASP.Metamodel> getEdgeMetamodelReferenceResolver() {
		return getResolverChain(ASP.ASPPackage.eINSTANCE.getEdge_Metamodel(), edgeMetamodelReferenceResolver);
	}
	
	public ASP.resource.ASP.IASPReferenceResolver<ASP.PatternElement, ASP.Metamodel> getPatternElementMetamodelReferenceResolver() {
		return getResolverChain(ASP.ASPPackage.eINSTANCE.getPatternElement_Metamodel(), patternElementMetamodelReferenceResolver);
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		if (options != null) {
			this.options = new java.util.LinkedHashMap<Object, Object>();
			this.options.putAll(options);
		}
		eqRight1ReferenceResolver.setOptions(options);
		eqLeft1ReferenceResolver.setOptions(options);
		eqSimpleRight1ReferenceResolver.setOptions(options);
		eqSimpleLeft1ReferenceResolver.setOptions(options);
		notEqRight1ReferenceResolver.setOptions(options);
		notEqLeft1ReferenceResolver.setOptions(options);
		nodeMetamodelReferenceResolver.setOptions(options);
		propMetamodelReferenceResolver.setOptions(options);
		edgeMetamodelReferenceResolver.setOptions(options);
		patternElementMetamodelReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, ASP.resource.ASP.IASPReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (ASP.ASPPackage.eINSTANCE.getEq().isInstance(container)) {
			ASPFuzzyResolveResult<ASP.Literal> frr = new ASPFuzzyResolveResult<ASP.Literal>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("right1")) {
				eqRight1ReferenceResolver.resolve(identifier, (ASP.Eq) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ASP.ASPPackage.eINSTANCE.getEq().isInstance(container)) {
			ASPFuzzyResolveResult<ASP.Literal> frr = new ASPFuzzyResolveResult<ASP.Literal>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("left1")) {
				eqLeft1ReferenceResolver.resolve(identifier, (ASP.Eq) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ASP.ASPPackage.eINSTANCE.getEqSimple().isInstance(container)) {
			ASPFuzzyResolveResult<ASP.Literal> frr = new ASPFuzzyResolveResult<ASP.Literal>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("right1")) {
				eqSimpleRight1ReferenceResolver.resolve(identifier, (ASP.EqSimple) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ASP.ASPPackage.eINSTANCE.getEqSimple().isInstance(container)) {
			ASPFuzzyResolveResult<ASP.Literal> frr = new ASPFuzzyResolveResult<ASP.Literal>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("left1")) {
				eqSimpleLeft1ReferenceResolver.resolve(identifier, (ASP.EqSimple) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ASP.ASPPackage.eINSTANCE.getNotEq().isInstance(container)) {
			ASPFuzzyResolveResult<ASP.Literal> frr = new ASPFuzzyResolveResult<ASP.Literal>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("right1")) {
				notEqRight1ReferenceResolver.resolve(identifier, (ASP.NotEq) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ASP.ASPPackage.eINSTANCE.getNotEq().isInstance(container)) {
			ASPFuzzyResolveResult<ASP.Literal> frr = new ASPFuzzyResolveResult<ASP.Literal>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("left1")) {
				notEqLeft1ReferenceResolver.resolve(identifier, (ASP.NotEq) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ASP.ASPPackage.eINSTANCE.getNode().isInstance(container)) {
			ASPFuzzyResolveResult<ASP.Metamodel> frr = new ASPFuzzyResolveResult<ASP.Metamodel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("metamodel")) {
				nodeMetamodelReferenceResolver.resolve(identifier, (ASP.Node) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ASP.ASPPackage.eINSTANCE.getProp().isInstance(container)) {
			ASPFuzzyResolveResult<ASP.Metamodel> frr = new ASPFuzzyResolveResult<ASP.Metamodel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("metamodel")) {
				propMetamodelReferenceResolver.resolve(identifier, (ASP.Prop) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ASP.ASPPackage.eINSTANCE.getEdge().isInstance(container)) {
			ASPFuzzyResolveResult<ASP.Metamodel> frr = new ASPFuzzyResolveResult<ASP.Metamodel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("metamodel")) {
				edgeMetamodelReferenceResolver.resolve(identifier, (ASP.Edge) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ASP.ASPPackage.eINSTANCE.getPatternElement().isInstance(container)) {
			ASPFuzzyResolveResult<ASP.Metamodel> frr = new ASPFuzzyResolveResult<ASP.Metamodel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("metamodel")) {
				patternElementMetamodelReferenceResolver.resolve(identifier, (ASP.PatternElement) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
	
	public ASP.resource.ASP.IASPReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		if (reference == ASP.ASPPackage.eINSTANCE.getEq_Right1()) {
			return getResolverChain(reference, eqRight1ReferenceResolver);
		}
		if (reference == ASP.ASPPackage.eINSTANCE.getEq_Left1()) {
			return getResolverChain(reference, eqLeft1ReferenceResolver);
		}
		if (reference == ASP.ASPPackage.eINSTANCE.getEqSimple_Right1()) {
			return getResolverChain(reference, eqSimpleRight1ReferenceResolver);
		}
		if (reference == ASP.ASPPackage.eINSTANCE.getEqSimple_Left1()) {
			return getResolverChain(reference, eqSimpleLeft1ReferenceResolver);
		}
		if (reference == ASP.ASPPackage.eINSTANCE.getNotEq_Right1()) {
			return getResolverChain(reference, notEqRight1ReferenceResolver);
		}
		if (reference == ASP.ASPPackage.eINSTANCE.getNotEq_Left1()) {
			return getResolverChain(reference, notEqLeft1ReferenceResolver);
		}
		if (reference == ASP.ASPPackage.eINSTANCE.getNode_Metamodel()) {
			return getResolverChain(reference, nodeMetamodelReferenceResolver);
		}
		if (reference == ASP.ASPPackage.eINSTANCE.getProp_Metamodel()) {
			return getResolverChain(reference, propMetamodelReferenceResolver);
		}
		if (reference == ASP.ASPPackage.eINSTANCE.getEdge_Metamodel()) {
			return getResolverChain(reference, edgeMetamodelReferenceResolver);
		}
		if (reference == ASP.ASPPackage.eINSTANCE.getPatternElement_Metamodel()) {
			return getResolverChain(reference, patternElementMetamodelReferenceResolver);
		}
		return null;
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})	
	public <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> ASP.resource.ASP.IASPReferenceResolver<ContainerType, ReferenceType> getResolverChain(org.eclipse.emf.ecore.EStructuralFeature reference, ASP.resource.ASP.IASPReferenceResolver<ContainerType, ReferenceType> originalResolver) {
		if (options == null) {
			return originalResolver;
		}
		Object value = options.get(ASP.resource.ASP.IASPOptions.ADDITIONAL_REFERENCE_RESOLVERS);
		if (value == null) {
			return originalResolver;
		}
		if (!(value instanceof java.util.Map)) {
			// send this to the error log
			new ASP.resource.ASP.util.ASPRuntimeUtil().logWarning("Found value with invalid type for option " + ASP.resource.ASP.IASPOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + java.util.Map.class.getName() + ", but was " + value.getClass().getName() + ")", null);
			return originalResolver;
		}
		java.util.Map<?,?> resolverMap = (java.util.Map<?,?>) value;
		Object resolverValue = resolverMap.get(reference);
		if (resolverValue == null) {
			return originalResolver;
		}
		if (resolverValue instanceof ASP.resource.ASP.IASPReferenceResolver) {
			ASP.resource.ASP.IASPReferenceResolver replacingResolver = (ASP.resource.ASP.IASPReferenceResolver) resolverValue;
			if (replacingResolver instanceof ASP.resource.ASP.IASPDelegatingReferenceResolver) {
				// pass original resolver to the replacing one
				((ASP.resource.ASP.IASPDelegatingReferenceResolver) replacingResolver).setDelegate(originalResolver);
			}
			return replacingResolver;
		} else if (resolverValue instanceof java.util.Collection) {
			java.util.Collection replacingResolvers = (java.util.Collection) resolverValue;
			ASP.resource.ASP.IASPReferenceResolver replacingResolver = originalResolver;
			for (Object next : replacingResolvers) {
				if (next instanceof ASP.resource.ASP.IASPReferenceCache) {
					ASP.resource.ASP.IASPReferenceResolver nextResolver = (ASP.resource.ASP.IASPReferenceResolver) next;
					if (nextResolver instanceof ASP.resource.ASP.IASPDelegatingReferenceResolver) {
						// pass original resolver to the replacing one
						((ASP.resource.ASP.IASPDelegatingReferenceResolver) nextResolver).setDelegate(replacingResolver);
					}
					replacingResolver = nextResolver;
				} else {
					// The collection contains a non-resolver. Send a warning to the error log.
					new ASP.resource.ASP.util.ASPRuntimeUtil().logWarning("Found value with invalid type in value map for option " + ASP.resource.ASP.IASPOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + ASP.resource.ASP.IASPDelegatingReferenceResolver.class.getName() + ", but was " + next.getClass().getName() + ")", null);
				}
			}
			return replacingResolver;
		} else {
			// The value for the option ADDITIONAL_REFERENCE_RESOLVERS has an unknown type.
			new ASP.resource.ASP.util.ASPRuntimeUtil().logWarning("Found value with invalid type in value map for option " + ASP.resource.ASP.IASPOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + ASP.resource.ASP.IASPDelegatingReferenceResolver.class.getName() + ", but was " + resolverValue.getClass().getName() + ")", null);
			return originalResolver;
		}
	}
	
}
