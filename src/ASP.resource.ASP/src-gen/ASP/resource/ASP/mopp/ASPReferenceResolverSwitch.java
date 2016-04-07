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
	
	protected ASP.resource.ASP.analysis.PatternElementReferenceResolver patternElementReferenceResolver = new ASP.resource.ASP.analysis.PatternElementReferenceResolver();
	protected ASP.resource.ASP.analysis.FunctionLiteralsReferenceResolver functionLiteralsReferenceResolver = new ASP.resource.ASP.analysis.FunctionLiteralsReferenceResolver();
	protected ASP.resource.ASP.analysis.TerminalElementReferenceResolver terminalElementReferenceResolver = new ASP.resource.ASP.analysis.TerminalElementReferenceResolver();
	protected ASP.resource.ASP.analysis.NotElementReferenceResolver notElementReferenceResolver = new ASP.resource.ASP.analysis.NotElementReferenceResolver();
	protected ASP.resource.ASP.analysis.EqLeftReferenceResolver eqLeftReferenceResolver = new ASP.resource.ASP.analysis.EqLeftReferenceResolver();
	protected ASP.resource.ASP.analysis.EqRightReferenceResolver eqRightReferenceResolver = new ASP.resource.ASP.analysis.EqRightReferenceResolver();
	protected ASP.resource.ASP.analysis.NotEqLeftReferenceResolver notEqLeftReferenceResolver = new ASP.resource.ASP.analysis.NotEqLeftReferenceResolver();
	protected ASP.resource.ASP.analysis.NotEqRightReferenceResolver notEqRightReferenceResolver = new ASP.resource.ASP.analysis.NotEqRightReferenceResolver();
	
	public ASP.resource.ASP.IASPReferenceResolver<ASP.Pattern, ASP.Function> getPatternElementReferenceResolver() {
		return getResolverChain(ASP.ASPPackage.eINSTANCE.getPattern_Element(), patternElementReferenceResolver);
	}
	
	public ASP.resource.ASP.IASPReferenceResolver<ASP.Function, ASP.Literal> getFunctionLiteralsReferenceResolver() {
		return getResolverChain(ASP.ASPPackage.eINSTANCE.getFunction_Literals(), functionLiteralsReferenceResolver);
	}
	
	public ASP.resource.ASP.IASPReferenceResolver<ASP.Terminal, ASP.Element> getTerminalElementReferenceResolver() {
		return getResolverChain(ASP.ASPPackage.eINSTANCE.getTerminal_Element(), terminalElementReferenceResolver);
	}
	
	public ASP.resource.ASP.IASPReferenceResolver<ASP.Not, ASP.Element> getNotElementReferenceResolver() {
		return getResolverChain(ASP.ASPPackage.eINSTANCE.getNot_Element(), notElementReferenceResolver);
	}
	
	public ASP.resource.ASP.IASPReferenceResolver<ASP.Eq, ASP.Literal> getEqLeftReferenceResolver() {
		return getResolverChain(ASP.ASPPackage.eINSTANCE.getEq_Left(), eqLeftReferenceResolver);
	}
	
	public ASP.resource.ASP.IASPReferenceResolver<ASP.Eq, ASP.Literal> getEqRightReferenceResolver() {
		return getResolverChain(ASP.ASPPackage.eINSTANCE.getEq_Right(), eqRightReferenceResolver);
	}
	
	public ASP.resource.ASP.IASPReferenceResolver<ASP.NotEq, ASP.Literal> getNotEqLeftReferenceResolver() {
		return getResolverChain(ASP.ASPPackage.eINSTANCE.getNotEq_Left(), notEqLeftReferenceResolver);
	}
	
	public ASP.resource.ASP.IASPReferenceResolver<ASP.NotEq, ASP.Literal> getNotEqRightReferenceResolver() {
		return getResolverChain(ASP.ASPPackage.eINSTANCE.getNotEq_Right(), notEqRightReferenceResolver);
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		if (options != null) {
			this.options = new java.util.LinkedHashMap<Object, Object>();
			this.options.putAll(options);
		}
		patternElementReferenceResolver.setOptions(options);
		functionLiteralsReferenceResolver.setOptions(options);
		terminalElementReferenceResolver.setOptions(options);
		notElementReferenceResolver.setOptions(options);
		eqLeftReferenceResolver.setOptions(options);
		eqRightReferenceResolver.setOptions(options);
		notEqLeftReferenceResolver.setOptions(options);
		notEqRightReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, ASP.resource.ASP.IASPReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (ASP.ASPPackage.eINSTANCE.getPattern().isInstance(container)) {
			ASPFuzzyResolveResult<ASP.Function> frr = new ASPFuzzyResolveResult<ASP.Function>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("element")) {
				patternElementReferenceResolver.resolve(identifier, (ASP.Pattern) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ASP.ASPPackage.eINSTANCE.getFunction().isInstance(container)) {
			ASPFuzzyResolveResult<ASP.Literal> frr = new ASPFuzzyResolveResult<ASP.Literal>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("literals")) {
				functionLiteralsReferenceResolver.resolve(identifier, (ASP.Function) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ASP.ASPPackage.eINSTANCE.getTerminal().isInstance(container)) {
			ASPFuzzyResolveResult<ASP.Element> frr = new ASPFuzzyResolveResult<ASP.Element>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("element")) {
				terminalElementReferenceResolver.resolve(identifier, (ASP.Terminal) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ASP.ASPPackage.eINSTANCE.getNot().isInstance(container)) {
			ASPFuzzyResolveResult<ASP.Element> frr = new ASPFuzzyResolveResult<ASP.Element>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("element")) {
				notElementReferenceResolver.resolve(identifier, (ASP.Not) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ASP.ASPPackage.eINSTANCE.getEq().isInstance(container)) {
			ASPFuzzyResolveResult<ASP.Literal> frr = new ASPFuzzyResolveResult<ASP.Literal>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("left")) {
				eqLeftReferenceResolver.resolve(identifier, (ASP.Eq) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ASP.ASPPackage.eINSTANCE.getEq().isInstance(container)) {
			ASPFuzzyResolveResult<ASP.Literal> frr = new ASPFuzzyResolveResult<ASP.Literal>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("right")) {
				eqRightReferenceResolver.resolve(identifier, (ASP.Eq) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ASP.ASPPackage.eINSTANCE.getNotEq().isInstance(container)) {
			ASPFuzzyResolveResult<ASP.Literal> frr = new ASPFuzzyResolveResult<ASP.Literal>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("left")) {
				notEqLeftReferenceResolver.resolve(identifier, (ASP.NotEq) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (ASP.ASPPackage.eINSTANCE.getNotEq().isInstance(container)) {
			ASPFuzzyResolveResult<ASP.Literal> frr = new ASPFuzzyResolveResult<ASP.Literal>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("right")) {
				notEqRightReferenceResolver.resolve(identifier, (ASP.NotEq) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
	
	public ASP.resource.ASP.IASPReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		if (reference == ASP.ASPPackage.eINSTANCE.getPattern_Element()) {
			return getResolverChain(reference, patternElementReferenceResolver);
		}
		if (reference == ASP.ASPPackage.eINSTANCE.getFunction_Literals()) {
			return getResolverChain(reference, functionLiteralsReferenceResolver);
		}
		if (reference == ASP.ASPPackage.eINSTANCE.getTerminal_Element()) {
			return getResolverChain(reference, terminalElementReferenceResolver);
		}
		if (reference == ASP.ASPPackage.eINSTANCE.getNot_Element()) {
			return getResolverChain(reference, notElementReferenceResolver);
		}
		if (reference == ASP.ASPPackage.eINSTANCE.getEq_Left()) {
			return getResolverChain(reference, eqLeftReferenceResolver);
		}
		if (reference == ASP.ASPPackage.eINSTANCE.getEq_Right()) {
			return getResolverChain(reference, eqRightReferenceResolver);
		}
		if (reference == ASP.ASPPackage.eINSTANCE.getNotEq_Left()) {
			return getResolverChain(reference, notEqLeftReferenceResolver);
		}
		if (reference == ASP.ASPPackage.eINSTANCE.getNotEq_Right()) {
			return getResolverChain(reference, notEqRightReferenceResolver);
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
