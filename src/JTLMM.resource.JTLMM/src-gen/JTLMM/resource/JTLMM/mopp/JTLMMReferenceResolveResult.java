/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.mopp;

/**
 * A basic implementation of the JTLMM.resource.JTLMM.IJTLMMReferenceResolveResult
 * interface that collects mappings in a list.
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class JTLMMReferenceResolveResult<ReferenceType> implements JTLMM.resource.JTLMM.IJTLMMReferenceResolveResult<ReferenceType> {
	
	private java.util.Collection<JTLMM.resource.JTLMM.IJTLMMReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private java.util.Set<JTLMM.resource.JTLMM.IJTLMMQuickFix> quickFixes;
	
	public JTLMMReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public java.util.Collection<JTLMM.resource.JTLMM.IJTLMMQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<JTLMM.resource.JTLMM.IJTLMMQuickFix>();
		}
		return java.util.Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(JTLMM.resource.JTLMM.IJTLMMQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<JTLMM.resource.JTLMM.IJTLMMQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public java.util.Collection<JTLMM.resource.JTLMM.IJTLMMReferenceMapping<ReferenceType>> getMappings() {
		return mappings;
	}
	
	public boolean wasResolved() {
		return mappings != null;
	}
	
	public boolean wasResolvedMultiple() {
		return mappings != null && mappings.size() > 1;
	}
	
	public boolean wasResolvedUniquely() {
		return mappings != null && mappings.size() == 1;
	}
	
	public void setErrorMessage(String message) {
		errorMessage = message;
	}
	
	public void addMapping(String identifier, ReferenceType target) {
		if (!resolveFuzzy && target == null) {
			throw new IllegalArgumentException("Mapping references to null is only allowed for fuzzy resolution.");
		}
		addMapping(identifier, target, null);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<JTLMM.resource.JTLMM.IJTLMMReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new JTLMM.resource.JTLMM.mopp.JTLMMElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<JTLMM.resource.JTLMM.IJTLMMReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new JTLMM.resource.JTLMM.mopp.JTLMMURIMapping<ReferenceType>(identifier, uri, warning));
	}
}
